package uz;

import p479s4.AbstractC32128i;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: uz.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C35387a implements InterfaceC35391e {

    /* JADX INFO: renamed from: a */
    public final Throwable f150795a;

    public C35387a(Throwable error) {
        AbstractC22676k.m65750j(error, "error");
        this.f150795a = error;
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
        return (obj instanceof C35387a) && AbstractC22676k.m65745e(this.f150795a, ((C35387a) obj).f150795a);
    }

    public final int hashCode() {
        return this.f150795a.hashCode();
    }

    public final String toString() {
        return AbstractC36095b.m114681i("Failure(error=", ")", this.f150795a);
    }
}
