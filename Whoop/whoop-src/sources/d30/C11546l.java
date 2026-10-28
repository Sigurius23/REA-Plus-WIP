package d30;

import al0.C0971f;
import android.graphics.ImageDecoder;
import androidx.health.platform.client.proto.C1533u;
import b62.C2761b;
import bk2.AbstractC3360g;
import bw1.AbstractC3684c;
import c42.C4180q;
import c93.InterfaceC4339a;
import cj1.C4749e;
import cj1.C4757m;
import cp1.C11018e;
import cp1.C11020g;
import cp1.C11021h;
import cp1.C11031r;
import cy0.C11184c;
import d41.C11676b;
import d41.C11682h;
import d42.AbstractC11700p;
import d62.AbstractC11737c;
import d62.AbstractC11741g;
import d62.C11738d;
import d62.C11742h;
import dl1.AbstractC12170d;
import dn0.AbstractC12216p;
import dw1.AbstractC12416d;
import e11.AbstractC12583c;
import e11.C12584d;
import e81.AbstractC12836k;
import e81.C12837k0;
import e90.AbstractC12884g;
import e90.C12880c;
import ed1.C13112a;
import ed1.C13113b;
import ej1.AbstractC13240g;
import ej1.AbstractC13259v;
import ep1.AbstractC13409d;
import ep1.AbstractC13413h;
import ep1.AbstractC13414i;
import ep1.AbstractC13428w;
import eu2.AbstractC13653j;
import eu2.C13645b;
import ey0.AbstractC13740g;
import f01.AbstractC13881n;
import f01.AbstractC13882n0;
import f01.AbstractC13886o1;
import f01.AbstractC13899t;
import f01.AbstractC13914z0;
import f01.C13844a1;
import f01.C13885o0;
import f01.C13889p1;
import f01.C13890q;
import f01.C13902u;
import ib1.C18334a;
import java.io.IOException;
import l83.C23454a0;
import ld1.AbstractC23864c;
import ne3.AbstractC26604b;
import ne3.InterfaceC26620j;
import p005a3.AbstractC0201g;
import p092dh.AbstractC12031r;
import p092dh.AbstractC12037x;
import p092dh.C12030q;
import p092dh.C12034u;
import p092dh.C12036w;
import p092dh.C12039z;
import p132f0.C13793i0;
import p133f1.AbstractC13991x0;
import p133f1.AbstractC13994y0;
import p133f1.C13981u;
import p133f1.C13988w0;
import p181h2.C16617b;
import p390p1.InterfaceC28601c1;
import p510u0.EnumC34315f0;
import p635y2.AbstractC39098h1;
import p636y3.C39180l;
import p704dk2.AbstractC12121h;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.C22669g0;
import u00.C34378f;
import xk1.C38428b;

/* JADX INFO: renamed from: d30.l */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C11546l implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37235w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f37236x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f37237y;

    public /* synthetic */ C11546l(int i13, Object obj, Object obj2) {
        this.f37235w = i13;
        this.f37236x = obj;
        this.f37237y = obj2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() throws IOException {
        switch (this.f37235w) {
            case 0:
                ((C11564u) this.f37236x).m30997b(new C11567v0(((C34378f) this.f37237y).f144467a));
                return C23454a0.f92919a;
            case 1:
                C11566v c11566v = (C11566v) this.f37236x;
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) this.f37237y;
                if (!((Boolean) interfaceC28601c1.getValue()).booleanValue()) {
                    c11566v.m30998a(C11537h1.f37203a);
                    interfaceC28601c1.setValue(Boolean.TRUE);
                }
                return C23454a0.f92919a;
            case 2:
                return C11676b.m31092d((Function1) this.f37236x, (C11682h) this.f37237y);
            case 3:
                return AbstractC11700p.m31245T((Function1) this.f37236x, (C4180q) this.f37237y);
            case 4:
                return AbstractC11737c.m31379o((C2761b) this.f37236x, (C11738d) this.f37237y);
            case 5:
                return AbstractC11741g.m31394C((Function1) this.f37236x, (C11742h) this.f37237y);
            case 6:
                C12036w c12036w = (C12036w) this.f37236x;
                C22659b0 c22659b0 = (C22659b0) this.f37237y;
                C22669g0 c22669g0 = new C22669g0();
                AbstractC12037x c12039z = c12036w.f39804a;
                InterfaceC26620j interfaceC26620jMo33152d1 = c12039z.mo33152d1();
                if (interfaceC26620jMo33152d1.mo79202d0(0L, AbstractC12031r.f39785b) || interfaceC26620jMo33152d1.mo79202d0(0L, AbstractC12031r.f39784a)) {
                    c12039z = new C12039z(AbstractC26604b.m79158c(new C12030q(c12039z.mo33152d1())), new C0971f(c12036w.f39805b.f100135a, 3), null);
                }
                try {
                    return ImageDecoder.decodeDrawable(c12036w.m33154b(c12039z), new C12034u(c22669g0, c12036w, c22659b0));
                } finally {
                    ImageDecoder imageDecoder = (ImageDecoder) c22669g0.f89336w;
                    if (imageDecoder != null) {
                        imageDecoder.close();
                    }
                    c12039z.close();
                }
            case 7:
                return AbstractC12121h.m33523n((Function1) this.f37236x, (AbstractC3360g.a) this.f37237y);
            case 8:
                return AbstractC12170d.m33667q((Function1) this.f37236x, (C38428b) this.f37237y);
            case 9:
                return AbstractC12216p.m33879F((AbstractC23864c) this.f37236x, (C18334a) this.f37237y);
            case 10:
                return AbstractC12416d.m34944q((Function1) this.f37236x, (AbstractC3684c.a) this.f37237y);
            case 11:
                return AbstractC12583c.m35267g((C12584d) this.f37236x, (Function1) this.f37237y);
            case 12:
                return AbstractC12836k.m35990W((C12837k0) this.f37236x, (Function1) this.f37237y);
            case 13:
                return AbstractC12884g.m36219y((Function1) this.f37236x, (C12880c) this.f37237y);
            case 14:
                return C13112a.m36653e((Function1) this.f37236x, (C13113b) this.f37237y);
            case 15:
                return AbstractC13240g.m37202g((Function1) this.f37236x, (C4749e) this.f37237y);
            case 16:
                return AbstractC13259v.m37292j((C4757m) this.f37236x, (Function1) this.f37237y);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC13409d.m37921r((C11018e) this.f37236x, (Function1) this.f37237y);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC13413h.m37948q((Function1) this.f37236x, (C11020g) this.f37237y);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC13414i.m37971n((C11021h) this.f37236x, (Function1) this.f37237y);
            case 20:
                return AbstractC13428w.m38125o((C11031r) this.f37236x, (Function1) this.f37237y);
            case 21:
                return AbstractC13653j.m38498j((Function1) this.f37236x, (C13645b) this.f37237y);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC13740g.m39043q((Function1) this.f37236x, (C11184c.d) this.f37237y);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((C22669g0) this.f37236x).f89336w = AbstractC0201g.m506f((C13793i0) this.f37237y, AbstractC39098h1.f168192a);
                return C23454a0.f92919a;
            case 24:
                return AbstractC13881n.m39375F((Function1) this.f37236x, (C13890q) this.f37237y);
            case 25:
                return AbstractC13899t.m39543h((C13902u) this.f37236x, (Function1) this.f37237y);
            case 26:
                return AbstractC13882n0.m39434r((C13885o0) this.f37236x, (Function1) this.f37237y);
            case 27:
                return AbstractC13914z0.m39642f((C13844a1) this.f37236x, (Function1) this.f37237y);
            case 28:
                return AbstractC13886o1.m39475l((C13889p1) this.f37236x, (Function1) this.f37237y);
            default:
                C13988w0 c13988w0 = (C13988w0) this.f37236x;
                long j7 = ((C39180l) ((InterfaceC28601c1) this.f37237y).getValue()).f168422a;
                C13981u c13981uM39802g = c13988w0.m39802g();
                long jM39830s = 9205357640488583168L;
                if (c13981uM39802g != null) {
                    EnumC34315f0 enumC34315f0M39801f = c13988w0.m39801f();
                    int i13 = enumC34315f0M39801f == null ? -1 : AbstractC13991x0.f49930a[enumC34315f0M39801f.ordinal()];
                    if (i13 != -1) {
                        if (i13 == 1) {
                            jM39830s = AbstractC13994y0.m39830s(c13988w0, j7, c13981uM39802g.f49879a);
                        } else {
                            if (i13 != 2) {
                                if (i13 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw new IllegalStateException("SelectionContainer does not support cursor");
                            }
                            jM39830s = AbstractC13994y0.m39830s(c13988w0, j7, c13981uM39802g.f49880b);
                        }
                    }
                }
                return new C16617b(jM39830s);
        }
    }
}
