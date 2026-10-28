package p715kotlin.time;

import com.whoop.service.network.model.UserSessionDto;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\u001a\u0012\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0082\u0080\u0004\u001a\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0080\u0080\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001X\u0080\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0084\b¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0010"}, m65681d2 = {"durationAssertionsEnabled", "", "getDurationAssertionsEnabled", "()Z", "precisionFormats", "", "Ljava/lang/ThreadLocal;", "Ljava/text/DecimalFormat;", "[Ljava/lang/ThreadLocal;", "createFormatForDecimals", "decimals", "", "formatToExactDecimals", "", "value", "", "kotlin-stdlib"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DurationJvmKt {
    private static final boolean durationAssertionsEnabled = false;
    private static final ThreadLocal<DecimalFormat>[] precisionFormats;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i13 = 0; i13 < 4; i13++) {
            threadLocalArr[i13] = new ThreadLocal<>();
        }
        precisionFormats = threadLocalArr;
    }

    private static final DecimalFormat createFormatForDecimals(int i13) {
        DecimalFormat decimalFormat = new DecimalFormat(UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE);
        if (i13 > 0) {
            decimalFormat.setMinimumFractionDigits(i13);
        }
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    public static final String formatToExactDecimals(double d3, int i13) {
        DecimalFormat decimalFormatCreateFormatForDecimals;
        ThreadLocal<DecimalFormat>[] threadLocalArr = precisionFormats;
        if (i13 < threadLocalArr.length) {
            ThreadLocal<DecimalFormat> threadLocal = threadLocalArr[i13];
            DecimalFormat decimalFormatCreateFormatForDecimals2 = threadLocal.get();
            if (decimalFormatCreateFormatForDecimals2 == null) {
                decimalFormatCreateFormatForDecimals2 = createFormatForDecimals(i13);
                threadLocal.set(decimalFormatCreateFormatForDecimals2);
            }
            decimalFormatCreateFormatForDecimals = decimalFormatCreateFormatForDecimals2;
        } else {
            decimalFormatCreateFormatForDecimals = createFormatForDecimals(i13);
        }
        String str = decimalFormatCreateFormatForDecimals.format(d3);
        AbstractC22676k.m65749i(str, "format(...)");
        return str;
    }

    public static final boolean getDurationAssertionsEnabled() {
        return durationAssertionsEnabled;
    }
}
