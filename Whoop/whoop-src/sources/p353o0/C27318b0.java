package p353o0;

import l83.C23454a0;
import p132f0.EnumC13840z0;
import p163g1.C15051j5;
import p180h0.EnumC16377d2;
import p209i3.C18019b;
import p279kd.C22379f;
import p389p0.C28539n0;
import p389p0.InterfaceC28549s0;
import p390p1.C28621h1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: o0.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C27318b0 implements InterfaceC28549s0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C27341y f109386a;

    public C27318b0(C27341y c27341y) {
        this.f109386a = c27341y;
    }

    @Override // p389p0.InterfaceC28549s0
    /* JADX INFO: renamed from: a */
    public final Object mo77517a(int i13, C15051j5 c15051j5) {
        C28539n0 c28539n0 = C27341y.f109496w;
        C27341y c27341y = this.f109386a;
        c27341y.getClass();
        Object objMo9764a = c27341y.mo9764a(EnumC13840z0.f49374w, new C22379f(c27341y, i13, (InterfaceC30057d) null), c15051j5);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (objMo9764a != enumC31071a) {
            objMo9764a = c23454a0;
        }
        return objMo9764a == enumC31071a ? objMo9764a : c23454a0;
    }

    @Override // p389p0.InterfaceC28549s0
    /* JADX INFO: renamed from: b */
    public final int mo77518b() {
        C27341y c27341y = this.f109386a;
        return (-c27341y.m82482g().f109440n) + c27341y.m82482g().f109444r;
    }

    @Override // p389p0.InterfaceC28549s0
    /* JADX INFO: renamed from: c */
    public final float mo77519c() {
        C27341y c27341y = this.f109386a;
        int iM87024x = ((C28621h1) c27341y.f109500d.f16070c).m87024x();
        int iM87024x2 = ((C28621h1) c27341y.f109500d.f16069b).m87024x();
        return c27341y.mo39183d() ? (iM87024x * 500) + iM87024x2 + 100 : (iM87024x * 500) + iM87024x2;
    }

    @Override // p389p0.InterfaceC28549s0
    /* JADX INFO: renamed from: d */
    public final C18019b mo77520d() {
        return new C18019b(-1, -1);
    }

    @Override // p389p0.InterfaceC28549s0
    /* JADX INFO: renamed from: e */
    public final int mo77521e() {
        C27341y c27341y = this.f109386a;
        return (int) (c27341y.m82482g().f109443q == EnumC16377d2.f62971w ? c27341y.m82482g().m82472e() & 4294967295L : c27341y.m82482g().m82472e() >> 32);
    }

    @Override // p389p0.InterfaceC28549s0
    /* JADX INFO: renamed from: f */
    public final float mo77522f() {
        C27341y c27341y = this.f109386a;
        return (((C28621h1) c27341y.f109500d.f16070c).m87024x() * 500) + ((C28621h1) c27341y.f109500d.f16069b).m87024x();
    }
}
