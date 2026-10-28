package f63;

import bc3.AbstractC3006f0;
import bc3.C3031l1;
import e63.C12778g;
import ge3.AbstractC15751g;
import i63.C18182u;
import i63.C18183v;
import i63.InterfaceC18174m;
import io.ktor.utils.p228io.C20020m;
import io.ktor.utils.p228io.C20023p;
import io.ktor.utils.p228io.InterfaceC20024q;
import q63.C30006b;
import q83.InterfaceC30063j;
import w53.C36845b;
import w53.C36848e;
import z53.C40116h;

/* JADX INFO: renamed from: f63.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C14153a extends AbstractC14155c {

    /* JADX INFO: renamed from: E */
    public final C30006b f50986E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC30063j f50987F;

    /* JADX INFO: renamed from: G */
    public final C36845b f50988G;

    /* JADX INFO: renamed from: H */
    public final Object f50989H;

    /* JADX INFO: renamed from: I */
    public final Object f50990I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f50991w = 0;

    /* JADX INFO: renamed from: x */
    public final C18183v f50992x;

    /* JADX INFO: renamed from: y */
    public final C18182u f50993y;

    /* JADX INFO: renamed from: z */
    public final C30006b f50994z;

    public C14153a(C36845b c36845b, C12778g c12778g) {
        this.f50988G = c36845b;
        this.f50987F = c12778g.f43739f;
        this.f50992x = c12778g.f43734a;
        this.f50993y = c12778g.f43737d;
        this.f50994z = c12778g.f43735b;
        this.f50986E = c12778g.f43740g;
        Object obj = c12778g.f43738e;
        InterfaceC20024q interfaceC20024qM55862a = obj instanceof InterfaceC20024q ? (InterfaceC20024q) obj : null;
        if (interfaceC20024qM55862a == null) {
            InterfaceC20024q.f75124a.getClass();
            interfaceC20024qM55862a = C20023p.m55862a();
        }
        this.f50989H = interfaceC20024qM55862a;
        this.f50990I = c12778g.f43736c;
    }

    @Override // f63.AbstractC14155c
    /* JADX INFO: renamed from: a */
    public final C36845b mo13321a() {
        switch (this.f50991w) {
            case 0:
                return this.f50988G;
            default:
                return (C36848e) this.f50988G;
        }
    }

    @Override // f63.AbstractC14155c
    /* JADX INFO: renamed from: b */
    public final InterfaceC20024q mo13322b() {
        switch (this.f50991w) {
            case 0:
                return (InterfaceC20024q) this.f50989H;
            default:
                return (C20020m) this.f50990I;
        }
    }

    @Override // f63.AbstractC14155c
    /* JADX INFO: renamed from: c */
    public final C30006b mo13323c() {
        switch (this.f50991w) {
            case 0:
                break;
        }
        return this.f50994z;
    }

    @Override // f63.AbstractC14155c
    /* JADX INFO: renamed from: d */
    public final C30006b mo13324d() {
        switch (this.f50991w) {
            case 0:
                break;
        }
        return this.f50986E;
    }

    @Override // f63.AbstractC14155c
    /* JADX INFO: renamed from: e */
    public final C18183v mo13325e() {
        switch (this.f50991w) {
            case 0:
                break;
        }
        return this.f50992x;
    }

    @Override // f63.AbstractC14155c
    /* JADX INFO: renamed from: f */
    public final C18182u mo13326f() {
        switch (this.f50991w) {
            case 0:
                break;
        }
        return this.f50993y;
    }

    @Override // bc3.InterfaceC2994c0
    public final InterfaceC30063j getCoroutineContext() {
        switch (this.f50991w) {
            case 0:
                break;
        }
        return this.f50987F;
    }

    @Override // i63.InterfaceC18180s
    public final InterfaceC18174m getHeaders() {
        switch (this.f50991w) {
            case 0:
                return (C40116h) this.f50990I;
            default:
                return (InterfaceC18174m) this.f50989H;
        }
    }

    public C14153a(C36848e c36848e, byte[] bArr, AbstractC14155c abstractC14155c) {
        this.f50988G = c36848e;
        C3031l1 c3031l1M8709c = AbstractC3006f0.m8709c();
        this.f50992x = abstractC14155c.mo13325e();
        this.f50993y = abstractC14155c.mo13326f();
        this.f50994z = abstractC14155c.mo13323c();
        this.f50986E = abstractC14155c.mo13324d();
        this.f50989H = abstractC14155c.getHeaders();
        this.f50987F = abstractC14155c.getCoroutineContext().plus(c3031l1M8709c);
        this.f50990I = AbstractC15751g.m44447a(bArr);
    }
}
