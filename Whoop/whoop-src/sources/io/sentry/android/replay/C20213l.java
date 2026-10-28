package io.sentry.android.replay;

import java.io.File;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.sentry.android.replay.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C20213l {

    /* JADX INFO: renamed from: a */
    public final File f75934a;

    /* JADX INFO: renamed from: b */
    public final long f75935b;

    /* JADX INFO: renamed from: c */
    public final String f75936c;

    public C20213l(File file, long j7, String str) {
        this.f75934a = file;
        this.f75935b = j7;
        this.f75936c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20213l)) {
            return false;
        }
        C20213l c20213l = (C20213l) obj;
        return AbstractC22676k.m65745e(this.f75934a, c20213l.f75934a) && this.f75935b == c20213l.f75935b && AbstractC22676k.m65745e(this.f75936c, c20213l.f75936c);
    }

    public final int hashCode() {
        int iM30451e = AbstractC11266d.m30451e(this.f75934a.hashCode() * 31, this.f75935b, 31);
        String str = this.f75936c;
        return iM30451e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ReplayFrame(screenshot=");
        sb4.append(this.f75934a);
        sb4.append(", timestamp=");
        sb4.append(this.f75935b);
        sb4.append(", screen=");
        return AbstractC25012a.m73377j(sb4, this.f75936c, ')');
    }
}
