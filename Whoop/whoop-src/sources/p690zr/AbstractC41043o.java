package p690zr;

import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: zr.o */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC41043o {

    /* JADX INFO: renamed from: w */
    public transient Set f177029w;

    /* JADX INFO: renamed from: x */
    public transient C41041n f177030x;

    /* JADX INFO: renamed from: y */
    public transient Map f177031y;

    /* JADX INFO: renamed from: a */
    public abstract Map mo133270a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC41043o) {
            return ((C41052s0) this).mo133270a().equals(((C41052s0) ((AbstractC41043o) obj)).mo133270a());
        }
        return false;
    }

    public final int hashCode() {
        return mo133270a().hashCode();
    }

    public final String toString() {
        return mo133270a().toString();
    }
}
