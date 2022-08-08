package br.com.letscode.aula01.dto;

public class ClientDTO {
    private String name;
    private int age;
    private String vat;
    private String email;

    public ClientDTO(String name, int age, String vat, String email) {
        this.name = name;
        this.age = age;
        this.vat = vat;
        this.email = email;
    }
}
