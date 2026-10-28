package p426qi;

import java.util.Arrays;

/* JADX INFO: renamed from: qi.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C30374b0 {

    /* JADX INFO: renamed from: a */
    public final C30387i f124646a;

    /* JADX INFO: renamed from: b */
    public final Throwable f124647b;

    public C30374b0(C30387i c30387i) {
        this.f124646a = c30387i;
        this.f124647b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30374b0)) {
            return false;
        }
        C30374b0 c30374b0 = (C30374b0) obj;
        C30387i c30387i = this.f124646a;
        if (c30387i != null && c30387i.equals(c30374b0.f124646a)) {
            return true;
        }
        Throwable th3 = this.f124647b;
        if (th3 == null || c30374b0.f124647b == null) {
            return false;
        }
        return th3.toString().equals(th3.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f124646a, this.f124647b});
    }

    public C30374b0(Throwable th3) {
        this.f124647b = th3;
        this.f124646a = null;
    }
}
