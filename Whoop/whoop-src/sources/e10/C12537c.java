package e10;

import n10.EnumC26121c0;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: e10.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C12537c implements InterfaceC12539d {

    /* JADX INFO: renamed from: a */
    public final Object f42842a;

    /* JADX INFO: renamed from: b */
    public final boolean f42843b;

    /* JADX INFO: renamed from: c */
    public final EnumC26121c0 f42844c;

    public C12537c(Object obj, boolean z4, EnumC26121c0 enumC26121c0) {
        this.f42842a = obj;
        this.f42843b = z4;
        this.f42844c = enumC26121c0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12537c)) {
            return false;
        }
        C12537c c12537c = (C12537c) obj;
        return this.f42842a.equals(c12537c.f42842a) && this.f42843b == c12537c.f42843b && this.f42844c == c12537c.f42844c;
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.f42842a.hashCode() * 31, 31, this.f42843b);
        EnumC26121c0 enumC26121c0 = this.f42844c;
        return iM8289b + (enumC26121c0 == null ? 0 : enumC26121c0.hashCode());
    }

    public final String toString() {
        return "Launch(launcherArguments=" + this.f42842a + ", receivesResultInProcess=" + this.f42843b + ", deferredIntentConfirmationType=" + this.f42844c + ")";
    }
}
