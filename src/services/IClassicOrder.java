package estore.services.interfaces.src.services;

import estore.services.interfaces.src.data.Cart;
import estore.services.interfaces.src.data.Order;

public interface IClassicOrder {

    Cart addItemToCart(Cart cart, Client client, Object item, int qty)
            throws estorePojo.exceptions.UnknownItemException, estorePojo.exceptions.InvalidCartException;

    Order pay(Cart cart, String address, String bankAccountRef)
            throws estorePojo.exceptions.InvalidCartException, estorePojo.exceptions.UnknownItemException, estorePojo.exceptions.InsufficientBalanceException, estorePojo.exceptions.UnknownAccountException;

}
