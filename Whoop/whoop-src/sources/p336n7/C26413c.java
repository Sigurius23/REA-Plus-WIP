package p336n7;

import java.time.Instant;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n7.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C26413c {

    /* JADX INFO: renamed from: h */
    public static final C26413c f104890h = new C26413c(127, null, 0);

    /* JADX INFO: renamed from: a */
    public final String f104891a;

    /* JADX INFO: renamed from: b */
    public final C26411a f104892b;

    /* JADX INFO: renamed from: c */
    public final Instant f104893c;

    /* JADX INFO: renamed from: d */
    public final String f104894d;

    /* JADX INFO: renamed from: e */
    public final long f104895e;

    /* JADX INFO: renamed from: f */
    public final C26412b f104896f;

    /* JADX INFO: renamed from: g */
    public final int f104897g;

    public C26413c(String str, C26411a c26411a, Instant instant, String str2, long j7, C26412b c26412b, int i13) {
        this.f104891a = str;
        this.f104892b = c26411a;
        this.f104893c = instant;
        this.f104894d = str2;
        this.f104895e = j7;
        this.f104896f = c26412b;
        this.f104897g = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26413c)) {
            return false;
        }
        C26413c c26413c = (C26413c) obj;
        return AbstractC22676k.m65745e(this.f104891a, c26413c.f104891a) && AbstractC22676k.m65745e(this.f104892b, c26413c.f104892b) && AbstractC22676k.m65745e(this.f104893c, c26413c.f104893c) && AbstractC22676k.m65745e(this.f104894d, c26413c.f104894d) && this.f104895e == c26413c.f104895e && AbstractC22676k.m65745e(this.f104896f, c26413c.f104896f) && this.f104897g == c26413c.f104897g;
    }

    public final int hashCode() {
        int iM61131b = AbstractC21702c.m61131b(this.f104893c, AbstractC11266d.m30450d(this.f104891a.hashCode() * 31, 31, this.f104892b.f104886a), 31);
        String str = this.f104894d;
        int iM30451e = AbstractC11266d.m30451e((iM61131b + (str != null ? str.hashCode() : 0)) * 31, this.f104895e, 31);
        C26412b c26412b = this.f104896f;
        return Integer.hashCode(this.f104897g) + ((iM30451e + (c26412b != null ? c26412b.hashCode() : 0)) * 31);
    }

    public /* synthetic */ C26413c(int i13, String str, long j7) {
        C26411a c26411a = new C26411a("");
        Instant EPOCH = Instant.EPOCH;
        AbstractC22676k.m65749i(EPOCH, "EPOCH");
        this("", c26411a, EPOCH, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? 0L : j7, null, 0);
    }
}
