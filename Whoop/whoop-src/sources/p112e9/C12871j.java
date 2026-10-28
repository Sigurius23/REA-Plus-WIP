package p112e9;

import androidx.media3.exoplayer.source.BehindLiveWindowException;
import p141f9.AbstractC14271m;
import p141f9.C14260b;
import p324m9.C25275c;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: e9.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C12871j {

    /* JADX INFO: renamed from: a */
    public final C25275c f44286a;

    /* JADX INFO: renamed from: b */
    public final AbstractC14271m f44287b;

    /* JADX INFO: renamed from: c */
    public final C14260b f44288c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC12870i f44289d;

    /* JADX INFO: renamed from: e */
    public final long f44290e;

    /* JADX INFO: renamed from: f */
    public final long f44291f;

    public C12871j(long j7, AbstractC14271m abstractC14271m, C14260b c14260b, C25275c c25275c, long j13, InterfaceC12870i interfaceC12870i) {
        this.f44290e = j7;
        this.f44287b = abstractC14271m;
        this.f44288c = c14260b;
        this.f44291f = j13;
        this.f44286a = c25275c;
        this.f44289d = interfaceC12870i;
    }

    /* JADX INFO: renamed from: a */
    public final C12871j m36157a(long j7, AbstractC14271m abstractC14271m) throws BehindLiveWindowException {
        long jMo3108u;
        long jMo3108u2;
        InterfaceC12870i interfaceC12870iMo40753c = this.f44287b.mo40753c();
        InterfaceC12870i interfaceC12870iMo40753c2 = abstractC14271m.mo40753c();
        if (interfaceC12870iMo40753c == null) {
            return new C12871j(j7, abstractC14271m, this.f44288c, this.f44286a, this.f44291f, interfaceC12870iMo40753c);
        }
        if (!interfaceC12870iMo40753c.mo3076A()) {
            return new C12871j(j7, abstractC14271m, this.f44288c, this.f44286a, this.f44291f, interfaceC12870iMo40753c2);
        }
        long jMo3110w = interfaceC12870iMo40753c.mo3110w(j7);
        if (jMo3110w == 0) {
            return new C12871j(j7, abstractC14271m, this.f44288c, this.f44286a, this.f44291f, interfaceC12870iMo40753c2);
        }
        AbstractC35849g.m113808j(interfaceC12870iMo40753c2);
        long jMo3077B = interfaceC12870iMo40753c.mo3077B();
        long jMo3091a = interfaceC12870iMo40753c.mo3091a(jMo3077B);
        long j13 = jMo3110w + jMo3077B;
        long j14 = j13 - 1;
        long jMo3104q = interfaceC12870iMo40753c.mo3104q(j14, j7) + interfaceC12870iMo40753c.mo3091a(j14);
        long jMo3077B2 = interfaceC12870iMo40753c2.mo3077B();
        long jMo3091a2 = interfaceC12870iMo40753c2.mo3091a(jMo3077B2);
        long j15 = this.f44291f;
        if (jMo3104q != jMo3091a2) {
            if (jMo3104q < jMo3091a2) {
                throw new BehindLiveWindowException();
            }
            if (jMo3091a2 < jMo3091a) {
                jMo3108u2 = j15 - (interfaceC12870iMo40753c2.mo3108u(jMo3091a, j7) - jMo3077B);
            } else {
                jMo3108u = interfaceC12870iMo40753c.mo3108u(jMo3091a2, j7) - jMo3077B2;
            }
            return new C12871j(j7, abstractC14271m, this.f44288c, this.f44286a, jMo3108u2, interfaceC12870iMo40753c2);
        }
        jMo3108u = j13 - jMo3077B2;
        jMo3108u2 = jMo3108u + j15;
        return new C12871j(j7, abstractC14271m, this.f44288c, this.f44286a, jMo3108u2, interfaceC12870iMo40753c2);
    }

    /* JADX INFO: renamed from: b */
    public final long m36158b(long j7) {
        InterfaceC12870i interfaceC12870i = this.f44289d;
        AbstractC35849g.m113808j(interfaceC12870i);
        return interfaceC12870i.mo3105r(this.f44290e, j7) + this.f44291f;
    }

    /* JADX INFO: renamed from: c */
    public final long m36159c(long j7) {
        long jM36158b = m36158b(j7);
        InterfaceC12870i interfaceC12870i = this.f44289d;
        AbstractC35849g.m113808j(interfaceC12870i);
        return (interfaceC12870i.mo3079D(this.f44290e, j7) + jM36158b) - 1;
    }

    /* JADX INFO: renamed from: d */
    public final long m36160d() {
        InterfaceC12870i interfaceC12870i = this.f44289d;
        AbstractC35849g.m113808j(interfaceC12870i);
        return interfaceC12870i.mo3110w(this.f44290e);
    }

    /* JADX INFO: renamed from: e */
    public final long m36161e(long j7) {
        long jM36162f = m36162f(j7);
        InterfaceC12870i interfaceC12870i = this.f44289d;
        AbstractC35849g.m113808j(interfaceC12870i);
        return interfaceC12870i.mo3104q(j7 - this.f44291f, this.f44290e) + jM36162f;
    }

    /* JADX INFO: renamed from: f */
    public final long m36162f(long j7) {
        InterfaceC12870i interfaceC12870i = this.f44289d;
        AbstractC35849g.m113808j(interfaceC12870i);
        return interfaceC12870i.mo3091a(j7 - this.f44291f);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m36163g(long j7, long j13) {
        InterfaceC12870i interfaceC12870i = this.f44289d;
        AbstractC35849g.m113808j(interfaceC12870i);
        return interfaceC12870i.mo3076A() || j13 == -9223372036854775807L || m36161e(j7) <= j13;
    }
}
