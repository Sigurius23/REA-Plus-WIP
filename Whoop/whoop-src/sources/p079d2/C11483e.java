package p079d2;

import p000.AbstractC11266d;
import p037bu.C3632c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C11483e {

    /* JADX INFO: renamed from: a */
    public final int f36914a;

    /* JADX INFO: renamed from: b */
    public final long f36915b;

    /* JADX INFO: renamed from: c */
    public final EnumC11484f f36916c;

    /* JADX INFO: renamed from: d */
    public final C3632c f36917d;

    public C11483e(int i13, long j7, EnumC11484f enumC11484f, C3632c c3632c) {
        this.f36914a = i13;
        this.f36915b = j7;
        this.f36916c = enumC11484f;
        this.f36917d = c3632c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11483e)) {
            return false;
        }
        C11483e c11483e = (C11483e) obj;
        return this.f36914a == c11483e.f36914a && this.f36915b == c11483e.f36915b && this.f36916c == c11483e.f36916c && AbstractC22676k.m65745e(this.f36917d, c11483e.f36917d);
    }

    public final int hashCode() {
        int iHashCode = (this.f36916c.hashCode() + AbstractC11266d.m30451e(Integer.hashCode(this.f36914a) * 31, this.f36915b, 31)) * 31;
        C3632c c3632c = this.f36917d;
        return iHashCode + (c3632c == null ? 0 : c3632c.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f36914a + ", timestamp=" + this.f36915b + ", type=" + this.f36916c + ", structureCompat=" + this.f36917d + ')';
    }
}
