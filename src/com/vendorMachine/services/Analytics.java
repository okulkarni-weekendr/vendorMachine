package com.vendorMachine.services;

import java.util.List;

public interface Analytics<T> {
    T top3Transactions(List<?> transactions);
    T top3Picks(List<String> listOfChoices);
}
