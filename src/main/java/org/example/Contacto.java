package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un contacto con nombre y lista de teléfonos.
 */
class Contacto {
    private String name;
    private List<String> phones;
    /**
     * Crea un contacto inicial con un solo teléfono.
     *
     * @param name nombre del producto
     * @param phone primer número de teléfono
      */
    public Contacto (String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }

    /**
     * Nombre del contacto
     */ /**
     * Devuelve el nombre del contacto.
     *
      * @return nombre completo
     */
    public String getName() {
        return this.name;
    }

    /**
     * Lista de números de teléfono del contacto
     */ /**
     * Devuelve la lista de teléfonos del contacto.
     *
      * @return lista de teléfonos
     */
    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}