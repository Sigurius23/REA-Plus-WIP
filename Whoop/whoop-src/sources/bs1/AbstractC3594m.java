package bs1;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39420x;

/* JADX INFO: renamed from: bs1.m */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"", "currentAnswer", "", "min", "max", "", "b", "(Ljava/lang/String;DD)Z", "a", "(Ljava/lang/String;)Ljava/lang/Double;", "journal_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3594m {
    /* JADX INFO: renamed from: a */
    public static final Double m10960a(String currentAnswer) {
        AbstractC22676k.m65750j(currentAnswer, "currentAnswer");
        return AbstractC39420x.m125914x(currentAnswer);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m10961b(String currentAnswer, double d3, double d14) {
        AbstractC22676k.m65750j(currentAnswer, "currentAnswer");
        try {
            Number number = NumberFormat.getInstance(Locale.getDefault()).parse(currentAnswer);
            Double dValueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
            if (dValueOf != null) {
                double dDoubleValue = dValueOf.doubleValue();
                if (d3 <= dDoubleValue && dDoubleValue <= d14) {
                    return false;
                }
            }
        } catch (ParseException unused) {
        }
        return true;
    }
}
