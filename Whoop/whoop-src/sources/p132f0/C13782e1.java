package p132f0;

import androidx.compose.foundation.layout.AbstractC1099a;
import p127ev.AbstractC13673n;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.C22976l1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f0.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C13782e1 {

    /* JADX INFO: renamed from: a */
    public final long f49171a;

    /* JADX INFO: renamed from: b */
    public final C22976l1 f49172b;

    public C13782e1() {
        long jM51517e = AbstractC17918w0.m51517e(4284900966L);
        C22976l1 c22976l1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
        this.f49171a = jM51517e;
        this.f49172b = c22976l1M3379a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C13782e1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        C13782e1 c13782e1 = (C13782e1) obj;
        return C17919x.m51542d(this.f49171a, c13782e1.f49171a) && AbstractC22676k.m65745e(this.f49172b, c13782e1.f49172b);
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        return this.f49172b.hashCode() + (Long.hashCode(this.f49171a) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("OverscrollConfiguration(glowColor=");
        AbstractC13673n.m38574u(this.f49171a, ", drawPadding=", sb4);
        sb4.append(this.f49172b);
        sb4.append(')');
        return sb4.toString();
    }
}
