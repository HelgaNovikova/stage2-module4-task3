package com.mjc.stage2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TextComponent extends AbstractTextComponent {
    protected List<AbstractTextComponent> componentList = new ArrayList<>();
//    private int size = 0;

    public TextComponent(TextComponentType componentType) {
        super(componentType);
    }

    @Override
    public String operation() {
        List<String> text = componentList.stream().map(AbstractTextComponent::operation).collect(Collectors.toList());
        return String.join(componentType.getDelimiter(), text);
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        componentList.add(textComponent);
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        componentList.remove(textComponent);
    }

    @Override
    public int getSize() {
        return componentList.size();
    }
// Write your code here!
}
