package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Gestiona una colección de contactos (la agenda).
 *
 * <p> Permite añadir, eliminar y modificar teléfonos dentro de cada
 * {@link Contacto }. Internamente mantiene una lista de contactos.</p>
 */
public class agendaContactos {
    /**
     * Lista interna con todos los contactos de la agenda
      */
    private List<Contacto> contacts; // Lista de Contacto

    /**
     * Crea una agenda vacía
      */
    public agendaContactos() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Añade un nuevo contacto.
     * Si el contacto ya exitse, simplemente añade el teléfono a su lista.
      * @param name nombre del contacto
     * @param phone número de teléffono que se quiere añadir
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Elimina completamente un contacto de la agenda.
     *
      * @param name nombre del contacto a borrar
     */
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Sustituye un número de teléfono por otto dentro del contacto inidicado.
      * @param name nombre del contacto
     * @param oldPhone teléfono que se va a sustituir
     * @param newPhone teléfono nuevo
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Devuelve la lista completa de contactos.
     *
      * @return lista con todos los contactos
     */
    public List<Contacto> getContacts() {
        return this.contacts;
    }
}