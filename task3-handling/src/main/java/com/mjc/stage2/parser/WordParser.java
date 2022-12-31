package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;

public class WordParser  extends AbstractTextParser {

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        char[] letters =  string.toCharArray();
        for (char letter : letters) {
            abstractTextComponent.add(new SymbolLeaf(letter));
        }
    }

    // Write your code here!

}
