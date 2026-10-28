package p641y8;

import p516u8.InterfaceC34583b0;
import p558vp.AbstractC36259c;

/* JADX INFO: renamed from: y8.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C39311f implements InterfaceC34583b0 {

    /* JADX INFO: renamed from: a */
    public final long f169116a;

    /* JADX INFO: renamed from: b */
    public final long f169117b;

    /* JADX INFO: renamed from: c */
    public final long f169118c;

    public C39311f(long j7, long j13, long j14) {
        this.f169116a = j7;
        this.f169117b = j13;
        this.f169118c = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39311f)) {
            return false;
        }
        C39311f c39311f = (C39311f) obj;
        return this.f169116a == c39311f.f169116a && this.f169117b == c39311f.f169117b && this.f169118c == c39311f.f169118c;
    }

    public final int hashCode() {
        return AbstractC36259c.m115682b0(this.f169118c) + ((AbstractC36259c.m115682b0(this.f169117b) + ((AbstractC36259c.m115682b0(this.f169116a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f169116a + ", modification time=" + this.f169117b + ", timescale=" + this.f169118c;
    }
}
