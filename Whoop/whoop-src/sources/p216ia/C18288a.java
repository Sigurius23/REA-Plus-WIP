package p216ia;

import p516u8.InterfaceC34583b0;
import p558vp.AbstractC36259c;

/* JADX INFO: renamed from: ia.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C18288a implements InterfaceC34583b0 {

    /* JADX INFO: renamed from: a */
    public final long f71149a;

    /* JADX INFO: renamed from: b */
    public final long f71150b;

    /* JADX INFO: renamed from: c */
    public final long f71151c;

    /* JADX INFO: renamed from: d */
    public final long f71152d;

    /* JADX INFO: renamed from: e */
    public final long f71153e;

    public C18288a(long j7, long j13, long j14, long j15, long j16) {
        this.f71149a = j7;
        this.f71150b = j13;
        this.f71151c = j14;
        this.f71152d = j15;
        this.f71153e = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C18288a.class == obj.getClass()) {
            C18288a c18288a = (C18288a) obj;
            if (this.f71149a == c18288a.f71149a && this.f71150b == c18288a.f71150b && this.f71151c == c18288a.f71151c && this.f71152d == c18288a.f71152d && this.f71153e == c18288a.f71153e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC36259c.m115682b0(this.f71153e) + ((AbstractC36259c.m115682b0(this.f71152d) + ((AbstractC36259c.m115682b0(this.f71151c) + ((AbstractC36259c.m115682b0(this.f71150b) + ((AbstractC36259c.m115682b0(this.f71149a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f71149a + ", photoSize=" + this.f71150b + ", photoPresentationTimestampUs=" + this.f71151c + ", videoStartPosition=" + this.f71152d + ", videoSize=" + this.f71153e;
    }
}
