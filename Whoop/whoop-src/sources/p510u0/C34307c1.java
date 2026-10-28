package p510u0;

import aa3.C0627i1;
import java.util.List;
import m83.C25271y;
import p249jc.AbstractC21598x;
import p294l3.C23254g;
import p294l3.C23285v0;
import p392p3.InterfaceC28770h;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;

/* JADX INFO: renamed from: u0.c1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34307c1 {

    /* JADX INFO: renamed from: a */
    public final C23254g f144060a;

    /* JADX INFO: renamed from: b */
    public final C23285v0 f144061b;

    /* JADX INFO: renamed from: e */
    public final boolean f144064e;

    /* JADX INFO: renamed from: g */
    public final InterfaceC39171c f144066g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC28770h f144067h;

    /* JADX INFO: renamed from: j */
    public C0627i1 f144069j;

    /* JADX INFO: renamed from: k */
    public EnumC39181m f144070k;

    /* JADX INFO: renamed from: c */
    public final int f144062c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d */
    public final int f144063d = 1;

    /* JADX INFO: renamed from: f */
    public final int f144065f = 1;

    /* JADX INFO: renamed from: i */
    public final List f144068i = C25271y.f99162w;

    public C34307c1(C23254g c23254g, C23285v0 c23285v0, boolean z4, InterfaceC39171c interfaceC39171c, InterfaceC28770h interfaceC28770h, int i13) {
        this.f144060a = c23254g;
        this.f144061b = c23285v0;
        this.f144064e = z4;
        this.f144066g = interfaceC39171c;
        this.f144067h = interfaceC28770h;
    }

    /* JADX INFO: renamed from: a */
    public final void m108612a(EnumC39181m enumC39181m) {
        C0627i1 c0627i1 = this.f144069j;
        if (c0627i1 == null || enumC39181m != this.f144070k || c0627i1.mo1618b()) {
            this.f144070k = enumC39181m;
            c0627i1 = new C0627i1(this.f144060a, AbstractC21598x.m60695p0(this.f144061b, enumC39181m), this.f144068i, this.f144066g, this.f144067h);
        }
        this.f144069j = c0627i1;
    }
}
