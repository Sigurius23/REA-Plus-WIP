package p350nw;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: renamed from: nw.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C27188i implements Serializable {

    /* JADX INFO: renamed from: x */
    public static final C27188i f108836x = new C27188i("sig");

    /* JADX INFO: renamed from: y */
    public static final C27188i f108837y = new C27188i("enc");

    /* JADX INFO: renamed from: w */
    public final String f108838w;

    public C27188i(String str) {
        this.f108838w = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C27188i) {
            return Objects.equals(this.f108838w, ((C27188i) obj).f108838w);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f108838w);
    }

    public final String toString() {
        return this.f108838w;
    }
}
