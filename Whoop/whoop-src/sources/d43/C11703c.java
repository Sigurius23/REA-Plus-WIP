package d43;

import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import q33.C29953a;

/* JADX INFO: renamed from: d43.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C11703c {

    /* JADX INFO: renamed from: a */
    public final boolean f37846a;

    /* JADX INFO: renamed from: b */
    public final long f37847b;

    /* JADX INFO: renamed from: c */
    public final C29953a f37848c;

    public C11703c() {
        C29953a c29953a = new C29953a();
        this.f37846a = true;
        this.f37847b = 20000L;
        this.f37848c = c29953a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11703c)) {
            return false;
        }
        C11703c c11703c = (C11703c) obj;
        return this.f37846a == c11703c.f37846a && this.f37847b == c11703c.f37847b && AbstractC22676k.m65745e(this.f37848c, c11703c.f37848c);
    }

    public final int hashCode() {
        return this.f37848c.hashCode() + AbstractC11266d.m30451e(Boolean.hashCode(this.f37846a) * 31, this.f37847b, 31);
    }

    public final String toString() {
        return "VideoModerationConfig(enable=" + this.f37846a + ", blurDuration=" + this.f37847b + ", bitmapVideoFilter=" + this.f37848c + ")";
    }
}
