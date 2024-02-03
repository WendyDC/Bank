package co.com.bank.jpa.helper;

public interface SimpleMapper<E, D> {
        D toData(E entity);
        E toEntity(D data);
}
