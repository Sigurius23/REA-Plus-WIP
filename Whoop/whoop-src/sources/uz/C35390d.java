package uz;

import p088dc.AbstractC11895b;
import p479s4.AbstractC32128i;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: uz.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C35390d implements InterfaceC35391e {

    /* JADX INFO: renamed from: a */
    public final String f150798a;

    public C35390d(String token) {
        AbstractC22676k.m65750j(token, "token");
        this.f150798a = token;
    }

    @Override // uz.InterfaceC35391e
    /* JADX INFO: renamed from: a */
    public final boolean mo112317a() {
        return AbstractC32128i.m100053g(this);
    }

    @Override // uz.InterfaceC35391e
    /* JADX INFO: renamed from: b */
    public final boolean mo112318b() {
        return AbstractC32128i.m100057k(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35390d) && AbstractC22676k.m65745e(this.f150798a, ((C35390d) obj).f150798a);
    }

    public final int hashCode() {
        return this.f150798a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Success(token=", this.f150798a, ")");
    }
}
