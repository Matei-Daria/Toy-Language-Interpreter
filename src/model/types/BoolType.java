package model.types;

import model.values.BoolValue;
import model.values.Value;

public class BoolType implements Type {

    @Override
    public boolean equals(Type another) {
        return another instanceof BoolType;
    }

    @Override
    public Value defaultValue() {
        return new BoolValue(false);
    }

    @Override
    public Type deepcopy() {
        return new BoolType();
    }

    public String toString() {
        return "bool";
    }
}
