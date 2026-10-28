package p329n0;

import l83.C23454a0;
import p108e4.AbstractC12667a;
import p163g1.C15051j5;
import p180h0.EnumC16377d2;
import p180h0.InterfaceC16478x2;
import p209i3.C18019b;
import p389p0.C28539n0;
import p389p0.InterfaceC28549s0;
import p390p1.C28621h1;
import p409q0.AbstractC29677c0;
import p409q0.AbstractC29701y;
import r83.EnumC31071a;

/* JADX INFO: renamed from: n0.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C26049b implements InterfaceC28549s0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f103116a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f103117b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC16478x2 f103118c;

    public /* synthetic */ C26049b(InterfaceC16478x2 interfaceC16478x2, boolean z4, int i13) {
        this.f103116a = i13;
        this.f103118c = interfaceC16478x2;
        this.f103117b = z4;
    }

    @Override // p389p0.InterfaceC28549s0
    /* JADX INFO: renamed from: a */
    public final Object mo77517a(int i13, C15051j5 c15051j5) {
        int i14 = this.f103116a;
        C23454a0 c23454a0 = C23454a0.f92919a;
        InterfaceC16478x2 interfaceC16478x2 = this.f103118c;
        switch (i14) {
            case 0:
                C28539n0 c28539n0 = C26068u.f103217x;
                Object objM77567j = ((C26068u) interfaceC16478x2).m77567j(i13, 0, c15051j5);
                return objM77567j == EnumC31071a.f128113w ? objM77567j : c23454a0;
            default:
                Object objM91158v = AbstractC29701y.m91158v((AbstractC29701y) interfaceC16478x2, i13, c15051j5);
                return objM91158v == EnumC31071a.f128113w ? objM91158v : c23454a0;
        }
    }

    @Override // p389p0.InterfaceC28549s0
    /* JADX INFO: renamed from: b */
    public final int mo77518b() {
        int i13;
        int i14;
        switch (this.f103116a) {
            case 0:
                C26068u c26068u = (C26068u) this.f103118c;
                i13 = -c26068u.m77565h().f103178l;
                i14 = c26068u.m77565h().f103182p;
                break;
            default:
                AbstractC29701y abstractC29701y = (AbstractC29701y) this.f103118c;
                i13 = -abstractC29701y.m91163l().f121386f;
                i14 = abstractC29701y.m91163l().f121384d;
                break;
        }
        return i13 + i14;
    }

    @Override // p389p0.InterfaceC28549s0
    /* JADX INFO: renamed from: c */
    public final float mo77519c() {
        switch (this.f103116a) {
            case 0:
                C26068u c26068u = (C26068u) this.f103118c;
                int iM87024x = ((C28621h1) c26068u.f103222e.f91958b).m87024x();
                int iM87024x2 = ((C28621h1) c26068u.f103222e.f91959c).m87024x();
                return c26068u.mo39183d() ? (iM87024x * 500) + iM87024x2 + 100 : (iM87024x * 500) + iM87024x2;
            default:
                AbstractC29701y abstractC29701y = (AbstractC29701y) this.f103118c;
                return AbstractC29677c0.m91149a(abstractC29701y.m91163l(), abstractC29701y.mo91148m());
        }
    }

    @Override // p389p0.InterfaceC28549s0
    /* JADX INFO: renamed from: d */
    public final C18019b mo77520d() {
        switch (this.f103116a) {
            case 0:
                C26068u c26068u = (C26068u) this.f103118c;
                return this.f103117b ? new C18019b(c26068u.m77565h().f103180n, 1) : new C18019b(1, c26068u.m77565h().f103180n);
            default:
                AbstractC29701y abstractC29701y = (AbstractC29701y) this.f103118c;
                return this.f103117b ? new C18019b(abstractC29701y.mo91148m(), 1) : new C18019b(1, abstractC29701y.mo91148m());
        }
    }

    @Override // p389p0.InterfaceC28549s0
    /* JADX INFO: renamed from: e */
    public final int mo77521e() {
        switch (this.f103116a) {
            case 0:
                C26068u c26068u = (C26068u) this.f103118c;
                return (int) (c26068u.m77565h().f103181o == EnumC16377d2.f62971w ? c26068u.m77565h().m77537e() & 4294967295L : c26068u.m77565h().m77537e() >> 32);
            default:
                AbstractC29701y abstractC29701y = (AbstractC29701y) this.f103118c;
                return (int) (abstractC29701y.m91163l().f121385e == EnumC16377d2.f62971w ? abstractC29701y.m91163l().m91154e() & 4294967295L : abstractC29701y.m91163l().m91154e() >> 32);
        }
    }

    @Override // p389p0.InterfaceC28549s0
    /* JADX INFO: renamed from: f */
    public final float mo77522f() {
        switch (this.f103116a) {
            case 0:
                C26068u c26068u = (C26068u) this.f103118c;
                return (((C28621h1) c26068u.f103222e.f91958b).m87024x() * 500) + ((C28621h1) c26068u.f103222e.f91959c).m87024x();
            default:
                return AbstractC12667a.m35468t((AbstractC29701y) this.f103118c);
        }
    }
}
