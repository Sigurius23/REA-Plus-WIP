package to;

import com.google.android.gms.common.api.C4975f;
import com.google.android.gms.common.api.InterfaceC4972c;
import java.util.Arrays;
import p529uo.AbstractC35135w;

/* JADX INFO: renamed from: to.a */
/* JADX INFO: loaded from: classes.dex */
public final class C33961a {

    /* JADX INFO: renamed from: a */
    public final int f142392a;

    /* JADX INFO: renamed from: b */
    public final C4975f f142393b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4972c f142394c;

    /* JADX INFO: renamed from: d */
    public final String f142395d;

    public C33961a(C4975f c4975f, InterfaceC4972c interfaceC4972c, String str) {
        this.f142393b = c4975f;
        this.f142394c = interfaceC4972c;
        this.f142395d = str;
        this.f142392a = Arrays.hashCode(new Object[]{c4975f, interfaceC4972c, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C33961a)) {
            return false;
        }
        C33961a c33961a = (C33961a) obj;
        return AbstractC35135w.m111097i(this.f142393b, c33961a.f142393b) && AbstractC35135w.m111097i(this.f142394c, c33961a.f142394c) && AbstractC35135w.m111097i(this.f142395d, c33961a.f142395d);
    }

    public final int hashCode() {
        return this.f142392a;
    }
}
