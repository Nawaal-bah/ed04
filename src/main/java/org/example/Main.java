package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear una nueva agenda.
        agendaContactos agenda = initAgenda();

        // Imprimir todos los contactos de la agenda.
        System.out.println("Todos los contactos: ");
        for (Persona c : agenda.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }

        // Añadir un nuevo teléfono a un contacto existente.
        agenda.addContact("John Doe", "6543219876");

        // Eliminar un contacto de la agenda.
        agenda.removeContact("Jane Doe");

        // Modificar el teléfono de un contacto existente en la agenda.
        agenda.modifyPhoneNumber("John Doe", "1234567890", "6666666666");

        System.out.println("\nDespués de añadir, eliminar y modificar contactos: ");
        for (Persona c : agenda.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }
    }

    private static agendaContactos initAgenda() {
        agendaContactos agenda = new agendaContactos();

        // Añadir contactos a la agenda.
        agenda.addContact("John Doe", "1234567890");
        agenda.addContact("Jane Doe", "9876543210");
        agenda.addContact("Mary Jane", "1122334455");
        return agenda;
    }
}