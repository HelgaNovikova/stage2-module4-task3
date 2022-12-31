package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.TextComponent;

import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import static com.mjc.stage2.entity.TextComponentType.WORD;

public class LexemeParser extends AbstractTextParser {
    private static final String LEXEME_REGEX = "\\s+";
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

//    @Override
//    public void parse(AbstractTextComponent abstractTextComponent, String string) {
//        String[] lexemes = string.split(LEXEME_REGEX);
//        for (String lexeme : lexemes) {
//            String[] words = Pattern.compile(WORD_REGEX)
//                    .matcher(lexeme)
//                    .results()
//                    .map(MatchResult::group)
//                    .toArray(String[]::new);
//            for (String word : words) {
//                TextComponent wordComponent = new TextComponent(WORD);
//                abstractTextComponent.add(wordComponent);
//                nextParser.parse(wordComponent, word);
//            }
//        }
//    }
    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        String[] lexemes = string.split(LEXEME_REGEX);
        for (String lexeme : lexemes) {

            TextComponent wordComponent = new TextComponent(WORD);
            abstractTextComponent.add(wordComponent);

            nextParser.parse(wordComponent, lexeme);
        }
    }
}