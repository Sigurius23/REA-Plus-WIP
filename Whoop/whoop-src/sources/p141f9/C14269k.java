package p141f9;

import java.util.ArrayList;
import p112e9.InterfaceC12870i;
import p516u8.C34610p;
import p690zr.AbstractC41023g0;

/* JADX INFO: renamed from: f9.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C14269k extends AbstractC14271m implements InterfaceC12870i {

    /* JADX INFO: renamed from: F */
    public final AbstractC14272n f52107F;

    public C14269k(C34610p c34610p, AbstractC41023g0 abstractC41023g0, AbstractC14272n abstractC14272n, ArrayList arrayList) {
        super(c34610p, abstractC41023g0, abstractC14272n, arrayList);
        this.f52107F = abstractC14272n;
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: A */
    public final boolean mo3076A() {
        return this.f52107F.mo40762i();
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: B */
    public final long mo3077B() {
        return this.f52107F.f52115d;
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: D */
    public final long mo3079D(long j7, long j13) {
        return this.f52107F.m40755b(j7, j13);
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: a */
    public final long mo3091a(long j7) {
        return this.f52107F.m40760g(j7);
    }

    @Override // p141f9.AbstractC14271m
    /* JADX INFO: renamed from: b */
    public final String mo40752b() {
        return null;
    }

    @Override // p141f9.AbstractC14271m
    /* JADX INFO: renamed from: c */
    public final InterfaceC12870i mo40753c() {
        return this;
    }

    @Override // p141f9.AbstractC14271m
    /* JADX INFO: renamed from: d */
    public final C14268j mo40754d() {
        return null;
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: q */
    public final long mo3104q(long j7, long j13) {
        return this.f52107F.m40758e(j7, j13);
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: r */
    public final long mo3105r(long j7, long j13) {
        return this.f52107F.m40756c(j7, j13);
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: s */
    public final long mo3106s(long j7, long j13) {
        AbstractC14272n abstractC14272n = this.f52107F;
        if (abstractC14272n.f52117f != null) {
            return -9223372036854775807L;
        }
        long jM40755b = abstractC14272n.m40755b(j7, j13) + abstractC14272n.m40756c(j7, j13);
        return (abstractC14272n.m40758e(jM40755b, j7) + abstractC14272n.m40760g(jM40755b)) - abstractC14272n.f52120i;
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: t */
    public final C14268j mo3107t(long j7) {
        return this.f52107F.mo40761h(this, j7);
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: u */
    public final long mo3108u(long j7, long j13) {
        return this.f52107F.m40759f(j7, j13);
    }

    @Override // p112e9.InterfaceC12870i
    /* JADX INFO: renamed from: w */
    public final long mo3110w(long j7) {
        return this.f52107F.mo40757d(j7);
    }
}
