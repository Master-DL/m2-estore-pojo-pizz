package estore.services.interfaces.src.services;

import estore.services.interfaces.src.data.Order;

public interface IFastOrder {

    Order oneShotOrder(Client client, Object item, int qty, String address, String bankAccountRef)
            throws estorePojo.exceptions.UnknownItemException, estorePojo.exceptions.InsufficientBalanceException, estorePojo.exceptions.UnknownAccountException;

}
