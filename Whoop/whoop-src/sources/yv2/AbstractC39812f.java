package yv2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: yv2.f */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"", "text", "", "minValue", "maxValue", "", "a", "(Ljava/lang/String;II)Z", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39812f {
    /* JADX INFO: renamed from: a */
    public static final boolean m127645a(String text, int i13, int i14) {
        Integer numM125932Q;
        int iIntValue;
        AbstractC22676k.m65750j(text, "text");
        return !AbstractC39414r.m125890i0(text) && (numM125932Q = AbstractC39421y.m125932Q(text)) != null && i13 <= (iIntValue = numM125932Q.intValue()) && iIntValue <= i14;
    }
}
