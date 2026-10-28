package gw;

import java.io.Serializable;

/* JADX INFO: renamed from: gw.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C16257h implements Serializable {

    /* JADX INFO: renamed from: w */
    public final String f61805w;

    public C16257h(String str) {
        this.f61805w = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16257h) {
            return this.f61805w.equalsIgnoreCase(((C16257h) obj).f61805w);
        }
        return false;
    }

    public final int hashCode() {
        return this.f61805w.toLowerCase().hashCode();
    }

    public final String toString() {
        return this.f61805w;
    }
}
