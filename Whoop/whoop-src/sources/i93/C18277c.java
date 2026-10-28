package i93;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i93.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C18277c extends AbstractC18275a implements InterfaceC18281g {
    static {
        new C18277c((char) 1, (char) 0);
    }

    @Override // i93.InterfaceC18281g
    /* JADX INFO: renamed from: d */
    public final Comparable mo52651d() {
        return Character.valueOf(this.f71123x);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m52652e(char c3) {
        return AbstractC22676k.m65751k(this.f71122w, c3) <= 0 && AbstractC22676k.m65751k(c3, this.f71123x) <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18277c)) {
            return false;
        }
        char c3 = this.f71122w;
        char c7 = this.f71123x;
        if (AbstractC22676k.m65751k(c3, c7) > 0) {
            C18277c c18277c = (C18277c) obj;
            if (AbstractC22676k.m65751k(c18277c.f71122w, c18277c.f71123x) > 0) {
                return true;
            }
        }
        C18277c c18277c2 = (C18277c) obj;
        return c3 == c18277c2.f71122w && c7 == c18277c2.f71123x;
    }

    @Override // i93.InterfaceC18281g
    public final Comparable getStart() {
        return Character.valueOf(this.f71122w);
    }

    public final int hashCode() {
        char c3 = this.f71122w;
        char c7 = this.f71123x;
        if (AbstractC22676k.m65751k(c3, c7) > 0) {
            return -1;
        }
        return (c3 * 31) + c7;
    }

    @Override // i93.InterfaceC18281g
    public final boolean isEmpty() {
        return AbstractC22676k.m65751k(this.f71122w, this.f71123x) > 0;
    }

    public final String toString() {
        return this.f71122w + ".." + this.f71123x;
    }
}
