package ae.cyberspeed.model;

import com.fasterxml.jackson.annotation.*;

public class WinCombinations {
    @JsonProperty("same_symbol_3_times")
    public WinCombination sameSymbol3Times;

    @JsonProperty("same_symbol_4_times")
    public WinCombination sameSymbol4Times;

    @JsonProperty("same_symbol_5_times")
    public WinCombination sameSymbol5Times;

    @JsonProperty("same_symbol_6_times")
    public WinCombination sameSymbol6Times;

    @JsonProperty("same_symbol_7_times")
    public WinCombination sameSymbol7Times;

    @JsonProperty("same_symbol_8_times")
    public WinCombination sameSymbol8Times;

    @JsonProperty("same_symbol_9_times")
    public WinCombination sameSymbol9Times;

    @JsonProperty("same_symbols_horizontally")
    public WinCombination sameSymbolsHorizontally;

    @JsonProperty("same_symbols_diagonally_left_to_right")
    public WinCombination sameSymbolsDiagonallyLeftToRight;

    @JsonProperty("same_symbols_vertically")
    public WinCombination sameSymbolsVertically;

    @JsonProperty("same_symbols_diagonally_right_to_left")
    public WinCombination sameSymbolsDiagonallyRightToLeft;
}
