package uz;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: uz.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C35405s implements InterfaceC35406t {

    /* JADX INFO: renamed from: a */
    public final String f150843a;

    public C35405s(String token) {
        AbstractC22676k.m65750j(token, "token");
        this.f150843a = token;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35405s) && AbstractC22676k.m65745e(this.f150843a, ((C35405s) obj).f150843a);
    }

    public final int hashCode() {
        return this.f150843a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Success(token=", this.f150843a, ")");
    }
}
