package org.hibernate_orm;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        PersonEntity personEntity = createPerson();
        PersistenceService.savePerson(personEntity);
    }

    private static PersonEntity createPerson() {
        Address address = new Address();
        address.setAddress("Principal 22");
        address.setPostalCode(123456);

        PersonEntity personEntity = new PersonEntity();
        personEntity.setFirstName("Cris");
        personEntity.setLastName("Auximus");
        personEntity.setAddresses(List.of(address));
        return personEntity;
    }
}