package team.avengers.kokkok.core.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;

@WritingConverter
public class NumberedEnumTypeConverter<S, T> implements Converter<S, T> {
    @Override
    public T convert(S source) {
        return null;
    }
}
