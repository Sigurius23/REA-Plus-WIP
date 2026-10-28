package p105e1;

import androidx.compose.p018ui.Modifier;
import p095dp.AbstractC12240d;
import p133f1.C13926b1;
import p133f1.C13954l;
import p133f1.InterfaceC13922a1;
import p390p1.InterfaceC28691z1;
import p512u2.AbstractC34454d0;
import p512u2.AbstractC34471q;
import p512u2.InterfaceC34469o;

/* JADX INFO: renamed from: e1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C12523j implements InterfaceC28691z1 {

    /* JADX INFO: renamed from: E */
    public C13954l f42777E;

    /* JADX INFO: renamed from: F */
    public final Modifier f42778F;

    /* JADX INFO: renamed from: w */
    public final long f42779w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC13922a1 f42780x;

    /* JADX INFO: renamed from: y */
    public final long f42781y;

    /* JADX INFO: renamed from: z */
    public C12525l f42782z = C12525l.f42788c;

    public C12523j(long j7, InterfaceC13922a1 interfaceC13922a1, long j13) {
        this.f42779w = j7;
        this.f42780x = interfaceC13922a1;
        this.f42781y = j13;
        Modifier modifierM34075l = AbstractC12240d.m34075l(j7, new C12522i(this, 2), interfaceC13922a1);
        InterfaceC34469o.f144811a.getClass();
        this.f42778F = AbstractC34454d0.m108918i(modifierM34075l, AbstractC34471q.f144813b);
    }

    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: a */
    public final void mo15502a() {
        C13954l c13954l = new C13954l(this.f42779w, new C12522i(this, 0), new C12522i(this, 1));
        ((C13926b1) this.f42780x).m39695f(c13954l);
        this.f42777E = c13954l;
    }

    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: c */
    public final void mo15503c() {
        C13954l c13954l = this.f42777E;
        if (c13954l != null) {
            ((C13926b1) this.f42780x).m39696g(c13954l);
            this.f42777E = null;
        }
    }

    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: d */
    public final void mo15504d() {
        C13954l c13954l = this.f42777E;
        if (c13954l != null) {
            ((C13926b1) this.f42780x).m39696g(c13954l);
            this.f42777E = null;
        }
    }
}
