package io.sentry.android.replay.video;

import java.io.File;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.sentry.android.replay.video.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C20242a {

    /* JADX INFO: renamed from: a */
    public final File f76032a;

    /* JADX INFO: renamed from: b */
    public final int f76033b;

    /* JADX INFO: renamed from: c */
    public final int f76034c;

    /* JADX INFO: renamed from: d */
    public final int f76035d;

    /* JADX INFO: renamed from: e */
    public final int f76036e;

    /* JADX INFO: renamed from: f */
    public final String f76037f = "video/avc";

    public C20242a(File file, int i13, int i14, int i15, int i16) {
        this.f76032a = file;
        this.f76033b = i13;
        this.f76034c = i14;
        this.f76035d = i15;
        this.f76036e = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20242a)) {
            return false;
        }
        C20242a c20242a = (C20242a) obj;
        return AbstractC22676k.m65745e(this.f76032a, c20242a.f76032a) && this.f76033b == c20242a.f76033b && this.f76034c == c20242a.f76034c && this.f76035d == c20242a.f76035d && this.f76036e == c20242a.f76036e && AbstractC22676k.m65745e(this.f76037f, c20242a.f76037f);
    }

    public final int hashCode() {
        return this.f76037f.hashCode() + AbstractC11266d.m30448b(this.f76036e, AbstractC11266d.m30448b(this.f76035d, AbstractC11266d.m30448b(this.f76034c, AbstractC11266d.m30448b(this.f76033b, this.f76032a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("MuxerConfig(file=");
        sb4.append(this.f76032a);
        sb4.append(", recordingWidth=");
        sb4.append(this.f76033b);
        sb4.append(", recordingHeight=");
        sb4.append(this.f76034c);
        sb4.append(", frameRate=");
        sb4.append(this.f76035d);
        sb4.append(", bitRate=");
        sb4.append(this.f76036e);
        sb4.append(", mimeType=");
        return AbstractC25012a.m73377j(sb4, this.f76037f, ')');
    }
}
