package jg3;

import java.io.Serializable;
import java.util.regex.Pattern;
import p558vp.AbstractC36259c;

/* JADX INFO: renamed from: jg3.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C21684k extends AbstractC36259c implements Serializable {

    /* JADX INFO: renamed from: x */
    public static final C21684k f83267x = new C21684k(0);

    /* JADX INFO: renamed from: w */
    public final int f83268w;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
    }

    public C21684k(int i13) {
        this.f83268w = i13;
    }

    private Object readResolve() {
        return this.f83268w == 0 ? f83267x : this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21684k) && this.f83268w == ((C21684k) obj).f83268w;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f83268w, 16) + Integer.rotateLeft(0, 8);
    }

    public final String toString() {
        if (this == f83267x) {
            return "P0D";
        }
        StringBuilder sb4 = new StringBuilder("P");
        int i13 = this.f83268w;
        if (i13 != 0) {
            sb4.append(i13);
            sb4.append('D');
        }
        return sb4.toString();
    }
}
