package d00;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d00.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C11423b implements InterfaceC11427f {

    /* JADX INFO: renamed from: a */
    public final String f36643a;

    public C11423b(String str) {
        this.f36643a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11423b) && AbstractC22676k.m65745e(this.f36643a, ((C11423b) obj).f36643a);
    }

    public final int hashCode() {
        String str = this.f36643a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("NeedsVerification(webviewOpenUrl=", this.f36643a, ")");
    }
}
