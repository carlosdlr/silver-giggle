package ae.cyberspeed.model;

import com.fasterxml.jackson.annotation.*;

public class Symbols {
    @JsonProperty(value = "A", index = 1)
    public StandardSymbol a;
    @JsonProperty(value = "B", index = 2)
    public StandardSymbol b;
    @JsonProperty(value = "C", index = 3)
    public StandardSymbol c;
    @JsonProperty(value = "D", index = 4)
    public StandardSymbol d;
    @JsonProperty(value = "E", index = 5)
    public StandardSymbol e;
    @JsonProperty(value = "F", index = 6)
    public StandardSymbol f;
    @JsonProperty(value = "10x", index = 7)
    public BonusSymbol _10x;
    @JsonProperty(value = "5x", index = 8)
    public BonusSymbol _5x;
    @JsonProperty(value = "+1000", index = 9)
    public BonusSymbol plus1000;
    @JsonProperty(value = "+500", index = 10)
    public BonusSymbol plus500;
    @JsonProperty(value = "MISS", index = 11)
    public BonusSymbol miss;

}

