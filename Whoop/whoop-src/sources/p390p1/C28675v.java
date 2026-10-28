package p390p1;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p1.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C28675v {

    /* JADX INFO: renamed from: a */
    public final InterfaceC28663s f115972a;

    public C28675v(InterfaceC28663s interfaceC28663s) {
        this.f115972a = interfaceC28663s;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C28675v) {
            return AbstractC22676k.m65745e(this.f115972a, ((C28675v) obj).f115972a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f115972a.hashCode() * 31;
    }
}
