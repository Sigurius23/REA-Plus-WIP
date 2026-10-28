package p133f1;

import p127ev.AbstractC13673n;
import p208i2.C17919x;

/* JADX INFO: renamed from: f1.y1 */
/* JADX INFO: loaded from: classes.dex */
public final class C13995y1 {

    /* JADX INFO: renamed from: a */
    public final long f49941a;

    /* JADX INFO: renamed from: b */
    public final long f49942b;

    public C13995y1(long j7, long j13) {
        this.f49941a = j7;
        this.f49942b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13995y1)) {
            return false;
        }
        C13995y1 c13995y1 = (C13995y1) obj;
        return C17919x.m51542d(this.f49941a, c13995y1.f49941a) && C17919x.m51542d(this.f49942b, c13995y1.f49942b);
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.f49942b) + (Long.hashCode(this.f49941a) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SelectionColors(selectionHandleColor=");
        AbstractC13673n.m38574u(this.f49941a, ", selectionBackgroundColor=", sb4);
        sb4.append((Object) C17919x.m51548j(this.f49942b));
        sb4.append(')');
        return sb4.toString();
    }
}
