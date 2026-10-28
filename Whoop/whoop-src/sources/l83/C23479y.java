package l83;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l83.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C23479y implements Comparable {

    /* JADX INFO: renamed from: w */
    public final short f92957w;

    public /* synthetic */ C23479y(short s13) {
        this.f92957w = s13;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC22676k.m65751k(this.f92957w & 65535, ((C23479y) obj).f92957w & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C23479y) {
            return this.f92957w == ((C23479y) obj).f92957w;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f92957w);
    }

    public final String toString() {
        return String.valueOf(this.f92957w & 65535);
    }
}
