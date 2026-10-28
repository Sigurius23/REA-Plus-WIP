package w53;

import e63.InterfaceC12773b;
import f63.AbstractC14155c;
import f63.C14153a;
import ge3.AbstractC15751g;
import v53.C35709c;

/* JADX INFO: renamed from: w53.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C36848e extends C36845b {

    /* JADX INFO: renamed from: F */
    public final byte[] f157622F;

    /* JADX INFO: renamed from: G */
    public final boolean f157623G;

    public C36848e(C35709c c35709c, InterfaceC12773b interfaceC12773b, AbstractC14155c abstractC14155c, byte[] bArr) {
        super(c35709c);
        this.f157622F = bArr;
        this.f157616x = new C36849f(this, interfaceC12773b);
        this.f157617y = new C14153a(this, bArr, abstractC14155c);
        this.f157623G = true;
    }

    @Override // w53.C36845b
    /* JADX INFO: renamed from: b */
    public final boolean mo118138b() {
        return this.f157623G;
    }

    @Override // w53.C36845b
    /* JADX INFO: renamed from: e */
    public final Object mo118141e() {
        return AbstractC15751g.m44447a(this.f157622F);
    }
}
