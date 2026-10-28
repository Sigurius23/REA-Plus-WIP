package gw;

import java.io.Serializable;

/* JADX INFO: renamed from: gw.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C16253d implements Serializable {

    /* JADX INFO: renamed from: x */
    public static final C16253d f61791x = new C16253d("DEF");

    /* JADX INFO: renamed from: w */
    public final String f61792w;

    public C16253d(String str) {
        this.f61792w = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16253d) {
            return this.f61792w.equals(((C16253d) obj).f61792w);
        }
        return false;
    }

    public final int hashCode() {
        return this.f61792w.hashCode();
    }

    public final String toString() {
        return this.f61792w;
    }
}
