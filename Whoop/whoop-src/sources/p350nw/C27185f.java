package p350nw;

import java.util.Objects;

/* JADX INFO: renamed from: nw.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C27185f {

    /* JADX INFO: renamed from: b */
    public static final C27185f f108825b = new C27185f("unspecified");

    /* JADX INFO: renamed from: c */
    public static final C27185f f108826c = new C27185f("compromised");

    /* JADX INFO: renamed from: d */
    public static final C27185f f108827d = new C27185f("superseded");

    /* JADX INFO: renamed from: a */
    public final String f108828a;

    public C27185f(String str) {
        Objects.requireNonNull(str);
        this.f108828a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C27185f) {
            return Objects.equals(this.f108828a, ((C27185f) obj).f108828a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f108828a);
    }

    public final String toString() {
        return this.f108828a;
    }
}
