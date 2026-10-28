package n23;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n23.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C26198a extends AbstractC26202e {

    /* JADX INFO: renamed from: a */
    public final String f103910a;

    public C26198a(String message) {
        AbstractC22676k.m65750j(message, "message");
        this.f103910a = message;
    }

    @Override // n23.AbstractC26202e
    /* JADX INFO: renamed from: a */
    public final String mo77807a() {
        return this.f103910a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26198a) && AbstractC22676k.m65745e(this.f103910a, ((C26198a) obj).f103910a);
    }

    public final int hashCode() {
        return this.f103910a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("GenericError(message=", this.f103910a, ")");
    }
}
