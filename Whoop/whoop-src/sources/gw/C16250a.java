package gw;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: renamed from: gw.a */
/* JADX INFO: loaded from: classes6.dex */
public class C16250a implements Serializable {

    /* JADX INFO: renamed from: x */
    public static final C16250a f61775x = new C16250a("none");

    /* JADX INFO: renamed from: w */
    public final String f61776w;

    public C16250a(String str) {
        Objects.requireNonNull(str);
        this.f61776w = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16250a) {
            return this.f61776w.equals(((C16250a) obj).f61776w);
        }
        return false;
    }

    public final int hashCode() {
        return this.f61776w.hashCode();
    }

    public final String toString() {
        return this.f61776w;
    }
}
