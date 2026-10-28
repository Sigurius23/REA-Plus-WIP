package p093dl;

import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: dl.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C12147l {

    /* JADX INFO: renamed from: a */
    public final String f40394a;

    public C12147l(String str) {
        this.f40394a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12147l) {
            return this.f40394a.equals(((C12147l) obj).f40394a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40394a.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.f40394a, "'}", new StringBuilder("StringHeaderFactory{value='"));
    }
}
