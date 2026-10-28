package p576w8;

import android.os.Bundle;
import android.text.Spanned;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: w8.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC36934d {

    /* JADX INFO: renamed from: a */
    public static final String f158064a;

    /* JADX INFO: renamed from: b */
    public static final String f158065b;

    /* JADX INFO: renamed from: c */
    public static final String f158066c;

    /* JADX INFO: renamed from: d */
    public static final String f158067d;

    /* JADX INFO: renamed from: e */
    public static final String f158068e;

    static {
        int i13 = AbstractC38065t.f163031a;
        f158064a = Integer.toString(0, 36);
        f158065b = Integer.toString(1, 36);
        f158066c = Integer.toString(2, 36);
        f158067d = Integer.toString(3, 36);
        f158068e = Integer.toString(4, 36);
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m118552a(Spanned spanned, Object obj, int i13, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f158064a, spanned.getSpanStart(obj));
        bundle2.putInt(f158065b, spanned.getSpanEnd(obj));
        bundle2.putInt(f158066c, spanned.getSpanFlags(obj));
        bundle2.putInt(f158067d, i13);
        if (bundle != null) {
            bundle2.putBundle(f158068e, bundle);
        }
        return bundle2;
    }
}
