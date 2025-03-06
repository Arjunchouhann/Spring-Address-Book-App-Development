package com.bridgelabz.springaddressbook.service;


import com.bridgelabz.springaddressbook.dto.AddressBookDTO;
import com.bridgelabz.springaddressbook.model.AddressBook;

import java.util.List;
import java.util.Optional;

public interface AddressBookService {
    List<AddressBookDTO> getAllAddresses();
    Optional<AddressBookDTO> getAddressById(Long id);
    AddressBook addAddress(AddressBookDTO addressBookDTO);
    AddressBook updateAddress(Long id, AddressBookDTO updateAddressBookDTO);
    String deleteAddressById(Long id);
}