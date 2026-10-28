package p132f0;

import c93.InterfaceC4339a;
import j93.InterfaceC21493z;
import m83.C25272z;
import p005a3.AbstractC0262w0;
import p005a3.InterfaceC0186c0;
import p005a3.InterfaceC0216j2;
import p026b2.AbstractC2316v;
import p180h0.EnumC16377d2;
import p209i3.AbstractC18039u;
import p209i3.AbstractC18041w;
import p209i3.C18028j;
import p209i3.C18043y;
import p209i3.InterfaceC18044z;
import p249jc.AbstractC21598x;
import p390p1.C28621h1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.C39169a;
import p652yl.C39615a;
import p668z1.AbstractC39957f;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: f0.o1 */
/* JADX INFO: loaded from: classes.dex */
public final class C13812o1 extends AbstractC2316v implements InterfaceC0186c0, InterfaceC0216j2 {

    /* JADX INFO: renamed from: O */
    public C13821r1 f49281O;

    /* JADX INFO: renamed from: P */
    public boolean f49282P;

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: E */
    public final int mo433E(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        if (!this.f49282P) {
            i13 = Integer.MAX_VALUE;
        }
        return interfaceC39124q0.mo449b(i13);
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        AbstractC21598x.m60696q(j7, this.f49282P ? EnumC16377d2.f62971w : EnumC16377d2.f62972x);
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(C39169a.m124758b(j7, 0, this.f49282P ? C39169a.m124765i(j7) : Integer.MAX_VALUE, 0, this.f49282P ? Integer.MAX_VALUE : C39169a.m124764h(j7), 5));
        int i13 = abstractC39104j1Mo448T.f168211w;
        int iM124765i = C39169a.m124765i(j7);
        if (i13 > iM124765i) {
            i13 = iM124765i;
        }
        int i14 = abstractC39104j1Mo448T.f168212x;
        int iM124764h = C39169a.m124764h(j7);
        if (i14 > iM124764h) {
            i14 = iM124764h;
        }
        int i15 = abstractC39104j1Mo448T.f168212x - i14;
        int i16 = abstractC39104j1Mo448T.f168211w - i13;
        if (!this.f49282P) {
            i15 = i16;
        }
        C13821r1 c13821r1 = this.f49281O;
        C28621h1 c28621h1 = c13821r1.f49321d;
        C28621h1 c28621h2 = c13821r1.f49318a;
        c28621h1.m87025y(i15);
        AbstractC39957f abstractC39957fM126587c = C39615a.m126587c();
        Function1 function1Mo128133e = abstractC39957fM126587c != null ? abstractC39957fM126587c.mo128133e() : null;
        AbstractC39957f abstractC39957fM126589e = C39615a.m126589e(abstractC39957fM126587c);
        try {
            if (c28621h2.m87024x() > i15) {
                c28621h2.m87025y(i15);
            }
            C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
            this.f49281O.f49319b.m87025y(this.f49282P ? i14 : i13);
            return interfaceC39133t0.mo86822W(i13, i14, C25272z.f99163w, new C13806m1(this, i15, abstractC39104j1Mo448T, 0));
        } catch (Throwable th3) {
            C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
            throw th3;
        }
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: g0 */
    public final int mo435g0(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        if (this.f49282P) {
            i13 = Integer.MAX_VALUE;
        }
        return interfaceC39124q0.mo446O(i13);
    }

    @Override // p005a3.InterfaceC0216j2
    /* JADX INFO: renamed from: n */
    public final void mo471n(InterfaceC18044z interfaceC18044z) {
        AbstractC18041w.m51815n(interfaceC18044z);
        final int i13 = 0;
        final int i14 = 1;
        C18028j c18028j = new C18028j(new InterfaceC4339a(this) { // from class: f0.n1

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C13812o1 f49273x;

            {
                this.f49273x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int iM87024x;
                switch (i13) {
                    case 0:
                        iM87024x = this.f49273x.f49281O.f49318a.m87024x();
                        break;
                    default:
                        iM87024x = this.f49273x.f49281O.f49321d.m87024x();
                        break;
                }
                return Float.valueOf(iM87024x);
            }
        }, new InterfaceC4339a(this) { // from class: f0.n1

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C13812o1 f49273x;

            {
                this.f49273x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int iM87024x;
                switch (i14) {
                    case 0:
                        iM87024x = this.f49273x.f49281O.f49318a.m87024x();
                        break;
                    default:
                        iM87024x = this.f49273x.f49281O.f49321d.m87024x();
                        break;
                }
                return Float.valueOf(iM87024x);
            }
        });
        if (this.f49282P) {
            C18043y c18043y = AbstractC18039u.f70054u;
            InterfaceC21493z interfaceC21493z = AbstractC18041w.f70062a[12];
            c18043y.m51817a(interfaceC18044z, c18028j);
        } else {
            C18043y c18043y2 = AbstractC18039u.f70053t;
            InterfaceC21493z interfaceC21493z2 = AbstractC18041w.f70062a[11];
            c18043y2.m51817a(interfaceC18044z, c18028j);
        }
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: o */
    public final int mo436o(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        if (this.f49282P) {
            i13 = Integer.MAX_VALUE;
        }
        return interfaceC39124q0.mo447Q(i13);
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: y */
    public final int mo437y(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        if (!this.f49282P) {
            i13 = Integer.MAX_VALUE;
        }
        return interfaceC39124q0.mo438C(i13);
    }
}
