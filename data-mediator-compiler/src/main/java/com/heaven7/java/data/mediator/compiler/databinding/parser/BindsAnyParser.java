package com.heaven7.java.data.mediator.compiler.databinding.parser;

import com.heaven7.java.data.mediator.compiler.DataBindingInfo;
import com.heaven7.java.data.mediator.compiler.DataBindingParser;

import javax.lang.model.element.Element;

public class BindsAnyParser implements FieldAnnotationParser {
    @Override
    public boolean parse(Element element, DataBindingParser parser, DataBindingInfo info) {

        return parser.parseBindsAny(element, info);
    }
}
