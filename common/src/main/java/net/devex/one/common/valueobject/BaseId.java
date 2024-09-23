package net.devex.one.common.valueobject;

import lombok.Getter;

import java.util.Objects;

@Getter
public abstract class BaseId<T> {

    private final T value;

    protected BaseId(T value ){
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseId<?> baseID = (BaseId<?>) o;
        return Objects.equals(value, baseID.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

}
