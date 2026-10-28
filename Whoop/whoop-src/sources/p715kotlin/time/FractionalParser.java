package p715kotlin.time;

import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u000b\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\bH\u0082\b¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, m65681d2 = {"Lkotlin/time/FractionalParser;", "", "<init>", "()V", "", "", "startIndex", "maxDigits", "Lkotlin/Function1;", "Ll83/a0;", "callback", "parseDigits", "(Ljava/lang/String;IILkotlin/jvm/functions/Function1;)I", "value", "", "parse", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)J", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class FractionalParser {
    public static final FractionalParser INSTANCE = new FractionalParser();

    private FractionalParser() {
    }

    private final int parseDigits(String str, int i13, int i14, Function1 function1) {
        int iMin = Math.min(i13 + i14, str.length());
        int i15 = i13;
        int i16 = 0;
        while (i15 < iMin) {
            char cCharAt = str.charAt(i15);
            if ('0' > cCharAt || cCharAt >= ':') {
                break;
            }
            i16 = (cCharAt - '0') + (i16 << 3) + (i16 << 1);
            i15++;
        }
        for (int i17 = 0; i17 < i14 - (i15 - i13); i17++) {
            i16 = (i16 << 3) + (i16 << 1);
        }
        function1.invoke(Integer.valueOf(i15));
        return i16;
    }

    public final long parse(String value, int startIndex, Function1 callback) {
        char cCharAt;
        char cCharAt2;
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(callback, "callback");
        int iMin = Math.min(startIndex + 6, value.length());
        int i13 = startIndex;
        int i14 = 0;
        while (i13 < iMin && '0' <= (cCharAt2 = value.charAt(i13)) && cCharAt2 < ':') {
            i14 = (cCharAt2 - '0') + (i14 << 3) + (i14 << 1);
            i13++;
        }
        for (int i15 = 0; i15 < 6 - (i13 - startIndex); i15++) {
            i14 = (i14 << 1) + (i14 << 3);
        }
        int iMin2 = Math.min(i13 + 9, value.length());
        int i16 = 0;
        int i17 = i13;
        while (i17 < iMin2) {
            char cCharAt3 = value.charAt(i17);
            if ('0' > cCharAt3 || cCharAt3 >= ':') {
                break;
            }
            i16 = (cCharAt3 - '0') + (i16 << 3) + (i16 << 1);
            i17++;
        }
        for (int i18 = 0; i18 < 9 - (i17 - i13); i18++) {
            i16 = (i16 << 1) + (i16 << 3);
        }
        while (i17 < value.length() && '0' <= (cCharAt = value.charAt(i17)) && cCharAt < ':') {
            i17++;
        }
        callback.invoke(Integer.valueOf(i17));
        return (((long) i14) * ((long) 1000000000)) + ((long) i16);
    }
}
