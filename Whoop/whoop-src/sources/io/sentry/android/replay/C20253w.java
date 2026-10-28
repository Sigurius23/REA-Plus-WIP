package io.sentry.android.replay;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: io.sentry.android.replay.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C20253w {

    /* JADX INFO: renamed from: a */
    public final int f76069a;

    /* JADX INFO: renamed from: b */
    public final int f76070b;

    /* JADX INFO: renamed from: c */
    public final float f76071c;

    /* JADX INFO: renamed from: d */
    public final float f76072d;

    /* JADX INFO: renamed from: e */
    public final int f76073e;

    /* JADX INFO: renamed from: f */
    public final int f76074f;

    public C20253w(int i13, int i14, float f13, float f14, int i15, int i16) {
        this.f76069a = i13;
        this.f76070b = i14;
        this.f76071c = f13;
        this.f76072d = f14;
        this.f76073e = i15;
        this.f76074f = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20253w)) {
            return false;
        }
        C20253w c20253w = (C20253w) obj;
        return this.f76069a == c20253w.f76069a && this.f76070b == c20253w.f76070b && Float.compare(this.f76071c, c20253w.f76071c) == 0 && Float.compare(this.f76072d, c20253w.f76072d) == 0 && this.f76073e == c20253w.f76073e && this.f76074f == c20253w.f76074f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f76074f) + AbstractC11266d.m30448b(this.f76073e, AbstractC11266d.m30447a(this.f76072d, AbstractC11266d.m30447a(this.f76071c, AbstractC11266d.m30448b(this.f76070b, Integer.hashCode(this.f76069a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ScreenshotRecorderConfig(recordingWidth=");
        sb4.append(this.f76069a);
        sb4.append(", recordingHeight=");
        sb4.append(this.f76070b);
        sb4.append(", scaleFactorX=");
        sb4.append(this.f76071c);
        sb4.append(", scaleFactorY=");
        sb4.append(this.f76072d);
        sb4.append(", frameRate=");
        sb4.append(this.f76073e);
        sb4.append(", bitRate=");
        return AbstractC11895b.m31999r(sb4, this.f76074f, ')');
    }
}
