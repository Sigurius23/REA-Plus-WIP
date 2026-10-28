package p374oo;

import com.google.android.gms.common.api.InterfaceC4972c;
import io.sentry.internal.debugmeta.C20378c;
import java.util.Arrays;
import p529uo.AbstractC35135w;

/* JADX INFO: renamed from: oo.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C28053b implements InterfaceC4972c {

    /* JADX INFO: renamed from: y */
    public static final C28053b f113196y;

    /* JADX INFO: renamed from: w */
    public final boolean f113197w;

    /* JADX INFO: renamed from: x */
    public final String f113198x;

    static {
        C20378c c20378c = new C20378c(29, (char) 0);
        c20378c.f76422x = Boolean.FALSE;
        f113196y = new C28053b(c20378c);
    }

    public C28053b(C20378c c20378c) {
        this.f113197w = ((Boolean) c20378c.f76422x).booleanValue();
        this.f113198x = (String) c20378c.f76423y;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C28053b)) {
            return false;
        }
        C28053b c28053b = (C28053b) obj;
        return AbstractC35135w.m111097i(null, null) && this.f113197w == c28053b.f113197w && AbstractC35135w.m111097i(this.f113198x, c28053b.f113198x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f113197w), this.f113198x});
    }
}
