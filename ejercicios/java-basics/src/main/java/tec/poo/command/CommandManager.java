package tec.poo.command;

import tec.poo.command.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CommandManager {

    private Map<String, Object> availableCommands;

    private InfoCommand infoCommand;

    FactorialCommand factorialcommand; // Primer Paso

    public CommandManager(String[] args) {

        if (args == null) {
            throw new NullPointerException("Null arguments passed to CommandManager");
        }

        // Inicializando las variables de instancia
        this.availableCommands = new HashMap<>();
        this.infoCommand = new InfoCommand(args);
        this.factorialcommand = new FactorialCommand(args); // Segundo Paso

        this.addCommand("info", infoCommand);
        this.addCommand("factoral", factorialcommand);
    }

    public void addCommand(String commandOption, Object command) {
        if (commandOption.isBlank()) {
            throw new NullPointerException("Can't add command. Command Option is blank.");
        }
        if (command == null) {
            throw new NullPointerException("Can't add command. Command is null.");
        }

        if (this.availableCommands.containsKey(commandOption)) {
            throw new IllegalArgumentException("Can't add command. Command option is already available.");
        }

        var clazz = command.getClass();
        this.availableCommands.values()
                .stream()
                .filter(clazz::isInstance)
                .findFirst()
                .ifPresent(o -> {
                    throw new IllegalArgumentException("Can't add command. It is already available.");
                });

        this.availableCommands.put(commandOption, command);
    }

    public Optional<Object> findCommandByOption(String commandOption) {
        if (commandOption.isEmpty()) {
            return Optional.empty();
        }

        return Optional.ofNullable(this.availableCommands.get(commandOption));
    }

    public void executeCommand(String commandOption) {
        if (commandOption.isBlank()) {
            this.printAvailableCommands();
        }

        if (commandOption.equals("info")) {
            this.infoCommand.execute();
        } else if (commandOption.equals("Factorial")) {

            this.factorialcommand.execute();
        }
        else {
            printAvailableCommands();
        }
    }

    public Map<String, Object> getAvailableCommands() {
        return this.availableCommands;
    }

    public void printAvailableCommands() {
        System.out.println("Available commands\n==================\n");
        this.availableCommands.forEach((key, value) -> System.out.println(key + " - " + value));
    }
}
