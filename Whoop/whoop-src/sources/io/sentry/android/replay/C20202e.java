package io.sentry.android.replay;

import java.io.File;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.sentry.android.replay.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C20202e {

    /* JADX INFO: renamed from: a */
    public final File f75879a;

    /* JADX INFO: renamed from: b */
    public final int f75880b;

    /* JADX INFO: renamed from: c */
    public final long f75881c;

    public C20202e(File file, int i13, long j7) {
        this.f75879a = file;
        this.f75880b = i13;
        this.f75881c = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20202e)) {
            return false;
        }
        C20202e c20202e = (C20202e) obj;
        return AbstractC22676k.m65745e(this.f75879a, c20202e.f75879a) && this.f75880b == c20202e.f75880b && this.f75881c == c20202e.f75881c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f75881c) + AbstractC11266d.m30448b(this.f75880b, this.f75879a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("GeneratedVideo(video=");
        sb4.append(this.f75879a);
        sb4.append(", frameCount=");
        sb4.append(this.f75880b);
        sb4.append(", duration=");
        return AbstractC2875y.m8302o(sb4, this.f75881c, ')');
    }
}
