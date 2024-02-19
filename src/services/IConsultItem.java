package estore.services.interfaces.src.services;

public interface IConsultItem {

    double getPrice( Object item ) throws estorePojo.exceptions.UnknownItemException;

    boolean isAvailable( Object item, int qty ) throws estorePojo.exceptions.UnknownItemException;
}
