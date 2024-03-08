package ae.cyberspeed.model;

import com.fasterxml.jackson.annotation.*;

public class Symbols {

    @JsonProperty("A")
    public StandardSymbol a;
    @JsonProperty("B")
    public StandardSymbol b;
    @JsonProperty("C")
    public StandardSymbol c;
    @JsonProperty("D")
    public StandardSymbol d;
    @JsonProperty("E")
    public StandardSymbol e;
    @JsonProperty("F")
    public StandardSymbol f;
    @JsonProperty("10x")
    public BonusSymbol _10x;
    @JsonProperty("5x")
    public BonusSymbol _5x;

    @JsonProperty("+1000")
    public BonusSymbol plus1000;

    @JsonProperty("+500")
    public BonusSymbol plus500;
    @JsonProperty("MISS")
    public BonusSymbol miss;

}

