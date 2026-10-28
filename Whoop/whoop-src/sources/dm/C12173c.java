package dm;

import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: dm.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C12173c {

    /* JADX INFO: renamed from: a */
    public final String f40478a;

    public C12173c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f40478a = str;
    }

    /* JADX INFO: renamed from: a */
    public static C12173c m33679a() {
        return new C12173c("proto");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12173c)) {
            return false;
        }
        return this.f40478a.equals(((C12173c) obj).f40478a);
    }

    public final int hashCode() {
        return this.f40478a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.f40478a, "\"}", new StringBuilder("Encoding{name=\""));
    }
}
