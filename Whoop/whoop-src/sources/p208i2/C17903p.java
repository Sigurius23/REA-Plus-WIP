package p208i2;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import p081d5.AbstractC11704a;
import p127ev.AbstractC13673n;

/* JADX INFO: renamed from: i2.p */
/* JADX INFO: loaded from: classes.dex */
public final class C17903p extends AbstractC17921y {

    /* JADX INFO: renamed from: b */
    public final long f69604b;

    /* JADX INFO: renamed from: c */
    public final int f69605c;

    /* JADX WARN: Illegal instructions before constructor call */
    public C17903p(long j7, int i13) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC11704a.m31294c();
            porterDuffColorFilter = AbstractC11704a.m31292a(AbstractC17918w0.m51506H(j7), AbstractC17870b.m51409d(i13));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(AbstractC17918w0.m51506H(j7), AbstractC17870b.m51410e(i13));
        }
        super(porterDuffColorFilter);
        this.f69604b = j7;
        this.f69605c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17903p)) {
            return false;
        }
        C17903p c17903p = (C17903p) obj;
        return C17919x.m51542d(this.f69604b, c17903p.f69604b) && this.f69605c == c17903p.f69605c;
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        return Integer.hashCode(this.f69605c) + (Long.hashCode(this.f69604b) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("BlendModeColorFilter(color=");
        AbstractC13673n.m38574u(this.f69604b, ", blendMode=", sb4);
        sb4.append((Object) C17901o.m51482a(this.f69605c));
        sb4.append(')');
        return sb4.toString();
    }
}
