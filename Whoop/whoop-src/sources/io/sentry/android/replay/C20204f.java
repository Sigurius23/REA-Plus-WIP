package io.sentry.android.replay;

import hc3.AbstractC17176i;
import io.sentry.EnumC20521r6;
import java.util.Date;
import java.util.List;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: io.sentry.android.replay.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C20204f {

    /* JADX INFO: renamed from: a */
    public final C20253w f75897a;

    /* JADX INFO: renamed from: b */
    public final C20212k f75898b;

    /* JADX INFO: renamed from: c */
    public final Date f75899c;

    /* JADX INFO: renamed from: d */
    public final int f75900d;

    /* JADX INFO: renamed from: e */
    public final long f75901e;

    /* JADX INFO: renamed from: f */
    public final EnumC20521r6 f75902f;

    /* JADX INFO: renamed from: g */
    public final String f75903g;

    /* JADX INFO: renamed from: h */
    public final List f75904h;

    public C20204f(C20253w c20253w, C20212k c20212k, Date date, int i13, long j7, EnumC20521r6 enumC20521r6, String str, List list) {
        this.f75897a = c20253w;
        this.f75898b = c20212k;
        this.f75899c = date;
        this.f75900d = i13;
        this.f75901e = j7;
        this.f75902f = enumC20521r6;
        this.f75903g = str;
        this.f75904h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20204f)) {
            return false;
        }
        C20204f c20204f = (C20204f) obj;
        return AbstractC22676k.m65745e(this.f75897a, c20204f.f75897a) && AbstractC22676k.m65745e(this.f75898b, c20204f.f75898b) && AbstractC22676k.m65745e(this.f75899c, c20204f.f75899c) && this.f75900d == c20204f.f75900d && this.f75901e == c20204f.f75901e && this.f75902f == c20204f.f75902f && AbstractC22676k.m65745e(this.f75903g, c20204f.f75903g) && AbstractC22676k.m65745e(this.f75904h, c20204f.f75904h);
    }

    public final int hashCode() {
        int iHashCode = (this.f75902f.hashCode() + AbstractC11266d.m30451e(AbstractC11266d.m30448b(this.f75900d, AbstractC38963t7.m124373c(this.f75899c, (this.f75898b.hashCode() + (this.f75897a.hashCode() * 31)) * 31, 31), 31), this.f75901e, 31)) * 31;
        String str = this.f75903g;
        return this.f75904h.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("LastSegmentData(recorderConfig=");
        sb4.append(this.f75897a);
        sb4.append(", cache=");
        sb4.append(this.f75898b);
        sb4.append(", timestamp=");
        sb4.append(this.f75899c);
        sb4.append(", id=");
        sb4.append(this.f75900d);
        sb4.append(", duration=");
        sb4.append(this.f75901e);
        sb4.append(", replayType=");
        sb4.append(this.f75902f);
        sb4.append(", screenAtStart=");
        sb4.append(this.f75903g);
        sb4.append(", events=");
        return AbstractC17176i.m48506h(sb4, this.f75904h, ')');
    }
}
