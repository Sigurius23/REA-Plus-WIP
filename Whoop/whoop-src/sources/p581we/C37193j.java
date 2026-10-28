package p581we;

import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p551vf.C35937b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: we.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C37193j {

    /* JADX INFO: renamed from: a */
    public final C35937b f159025a;

    /* JADX INFO: renamed from: b */
    public final String f159026b;

    /* JADX INFO: renamed from: c */
    public final String f159027c;

    /* JADX INFO: renamed from: d */
    public final String f159028d;

    public C37193j(C35937b c35937b, String requestString, String signedHeaders, String hash) {
        AbstractC22676k.m65750j(requestString, "requestString");
        AbstractC22676k.m65750j(signedHeaders, "signedHeaders");
        AbstractC22676k.m65750j(hash, "hash");
        this.f159025a = c35937b;
        this.f159026b = requestString;
        this.f159027c = signedHeaders;
        this.f159028d = hash;
    }

    /* JADX INFO: renamed from: a */
    public final C35937b m119189a() {
        return this.f159025a;
    }

    /* JADX INFO: renamed from: b */
    public final String m119190b() {
        return this.f159026b;
    }

    /* JADX INFO: renamed from: c */
    public final String m119191c() {
        return this.f159027c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37193j)) {
            return false;
        }
        C37193j c37193j = (C37193j) obj;
        return AbstractC22676k.m65745e(this.f159025a, c37193j.f159025a) && AbstractC22676k.m65745e(this.f159026b, c37193j.f159026b) && AbstractC22676k.m65745e(this.f159027c, c37193j.f159027c) && AbstractC22676k.m65745e(this.f159028d, c37193j.f159028d);
    }

    public final int hashCode() {
        return this.f159028d.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f159025a.hashCode() * 31, 31, this.f159026b), 31, this.f159027c);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("CanonicalRequest(request=");
        sb4.append(this.f159025a);
        sb4.append(", requestString=");
        sb4.append(this.f159026b);
        sb4.append(", signedHeaders=");
        sb4.append(this.f159027c);
        sb4.append(", hash=");
        return AbstractC25012a.m73377j(sb4, this.f159028d, ')');
    }
}
