package ae.cyberspeed.model;

import com.fasterxml.jackson.annotation.*;

public enum SymbolType {
    STANDARD(1, "standard"), BONUS(2, "bonus");

    private Integer id;
    private String type;

    SymbolType(Integer id, String type) {
        this.id = id;
        this.type = type;
    }

    @JsonValue
    public String getType() {
        return type;
    }
}
