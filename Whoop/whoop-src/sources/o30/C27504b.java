package o30;

import gw.C16255f;
import ih0.AbstractC18489d0;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: o30.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C27504b implements InterfaceC27506d {

    /* JADX INFO: renamed from: z */
    public static final C16255f f110770z = C16255f.f61802z;

    /* JADX INFO: renamed from: w */
    public final boolean f110771w;

    /* JADX INFO: renamed from: x */
    public byte f110772x = 0;

    /* JADX INFO: renamed from: y */
    public byte f110773y = 0;

    public C27504b(boolean z4) {
        this.f110771w = z4;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m82919a(String str) {
        return (AbstractC39421y.m125920E(str, "=", false) || AbstractC39414r.m125876U(str, " ", false) || AbstractC39414r.m125876U(str, "+", false) || AbstractC39414r.m125876U(str, "\n", false) || AbstractC39414r.m125876U(str, "/", false)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27504b)) {
            return false;
        }
        C27504b c27504b = (C27504b) obj;
        return this.f110771w == c27504b.f110771w && this.f110772x == c27504b.f110772x && this.f110773y == c27504b.f110773y;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f110773y) + ((Byte.hashCode(this.f110772x) + (Boolean.hashCode(this.f110771w) * 31)) * 31);
    }

    public final String toString() {
        byte b = this.f110772x;
        byte b6 = this.f110773y;
        StringBuilder sb4 = new StringBuilder("DefaultMessageTransformer(isLiveMode=");
        sb4.append(this.f110771w);
        sb4.append(", counterSdkToAcs=");
        sb4.append((int) b);
        sb4.append(", counterAcsToSdk=");
        return AbstractC18489d0.m53371l(sb4, b6, ")");
    }
}
