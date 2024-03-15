package ae.cyberspeed.model;

import com.fasterxml.jackson.annotation.*;

public class Symbols {
    @JsonProperty(value = "A", index = 1)
    private StandardSymbol a;
    @JsonProperty(value = "B", index = 2)
    private StandardSymbol b;
    @JsonProperty(value = "C", index = 3)
    private StandardSymbol c;
    @JsonProperty(value = "D", index = 4)
    private StandardSymbol d;
    @JsonProperty(value = "E", index = 5)
    private StandardSymbol e;
    @JsonProperty(value = "F", index = 6)
    private StandardSymbol f;
    @JsonProperty(value = "10x", index = 7)
    private BonusSymbol _10x;
    @JsonProperty(value = "5x", index = 8)
    private BonusSymbol _5x;
    @JsonProperty(value = "+1000", index = 9)
    private BonusSymbol plus1000;
    @JsonProperty(value = "+500", index = 10)
    private BonusSymbol plus500;
    @JsonProperty(value = "MISS", index = 11)
    private BonusSymbol miss;

    public StandardSymbol getA() {
        return a;
    }

    public void setA(StandardSymbol a) {
        a.setName("A");
        this.a = a;
    }

    public StandardSymbol getB() {
        return b;
    }

    public void setB(StandardSymbol b) {
        b.setName("B");
        this.b = b;
    }

    public StandardSymbol getC() {
        return c;
    }

    public void setC(StandardSymbol c) {
        c.setName("C");
        this.c = c;
    }

    public StandardSymbol getD() {
        return d;
    }

    public void setD(StandardSymbol d) {
        d.setName("D");
        this.d = d;
    }

    public StandardSymbol getE() {
        return e;
    }

    public void setE(StandardSymbol e) {
        e.setName("E");
        this.e = e;
    }

    public StandardSymbol getF() {
        return f;
    }

    public void setF(StandardSymbol f) {
        f.setName("F");
        this.f = f;
    }

    public BonusSymbol get_10x() {
        return _10x;
    }

    public void set_10x(BonusSymbol _10x) {
        _10x.setName("10x");
        this._10x = _10x;
    }

    public BonusSymbol get_5x() {
        return _5x;
    }

    public void set_5x(BonusSymbol _5x) {
        _5x.setName("5x");
        this._5x = _5x;
    }

    public BonusSymbol getPlus1000() {
        return plus1000;
    }

    public void setPlus1000(BonusSymbol plus1000) {
        plus1000.setName("+1000");
        this.plus1000 = plus1000;
    }

    public BonusSymbol getPlus500() {
        return plus500;
    }

    public void setPlus500(BonusSymbol plus500) {
        plus500.setName("+500");
        this.plus500 = plus500;
    }

    public BonusSymbol getMiss() {
        return miss;
    }

    public void setMiss(BonusSymbol miss) {
        miss.setName("MISS");
        this.miss = miss;
    }
}

