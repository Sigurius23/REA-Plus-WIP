package p318m3;

import android.text.Layout;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m3.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24981k {

    /* JADX INFO: renamed from: a */
    public static final Layout.Alignment f97760a;

    /* JADX INFO: renamed from: b */
    public static final Layout.Alignment f97761b;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (AbstractC22676k.m65745e(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (AbstractC22676k.m65745e(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f97760a = alignment;
        f97761b = alignment2;
    }
}
