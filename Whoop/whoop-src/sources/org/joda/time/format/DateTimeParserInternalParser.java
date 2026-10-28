package org.joda.time.format;

/* JADX INFO: loaded from: classes5.dex */
class DateTimeParserInternalParser implements InternalParser {
    private final DateTimeParser underlying;

    private DateTimeParserInternalParser(DateTimeParser dateTimeParser) {
        this.underlying = dateTimeParser;
    }

    /* JADX INFO: renamed from: of */
    public static InternalParser m85493of(DateTimeParser dateTimeParser) {
        if (dateTimeParser instanceof InternalParserDateTimeParser) {
            return (InternalParser) dateTimeParser;
        }
        if (dateTimeParser == null) {
            return null;
        }
        return new DateTimeParserInternalParser(dateTimeParser);
    }

    @Override // org.joda.time.format.InternalParser
    public int estimateParsedLength() {
        return this.underlying.estimateParsedLength();
    }

    public DateTimeParser getUnderlying() {
        return this.underlying;
    }

    @Override // org.joda.time.format.InternalParser
    public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i13) {
        return this.underlying.parseInto(dateTimeParserBucket, charSequence.toString(), i13);
    }
}
