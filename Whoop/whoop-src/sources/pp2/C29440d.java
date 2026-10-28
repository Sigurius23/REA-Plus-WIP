package pp2;

import android.content.Context;
import bc3.InterfaceC2994c0;
import com.whoop.education.view.EducationFragment;
import com.whoop.navigation.C9598e;
import dp0.InterfaceC12251g;
import fi0.InterfaceC14515a;
import j02.InterfaceC21159o0;
import l83.C23454a0;
import np2.C27036c;
import p005a3.C0238p0;
import p027b3.InterfaceC2355b3;
import p078d1.C11453f;
import p163g1.C15199y3;
import p179h.C16351i;
import p181h2.C16618c;
import p208i2.AbstractC17911t;
import p270k2.InterfaceC22129c;
import p292l1.C23196w3;
import p294l3.C23283u0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p412q3.C29891y;
import p412q3.InterfaceC29884r;
import p510u0.AbstractC34313e1;
import p510u0.C34346p1;
import p510u0.C34354s0;
import p715kotlin.jvm.functions.Function1;
import p734sl0.AbstractC32658p3;
import p734sl0.Function2;
import ql0.InterfaceC30468c;
import r90.AbstractC31096c;
import r90.C31103j;
import tz1.C34280b;
import u80.AbstractC34633c;
import u80.C34634d;
import u80.C34635e;
import uu2.AbstractC35272w;
import uz1.AbstractC35430h;
import x21.AbstractC37861d;
import x21.C37858a;

/* JADX INFO: renamed from: pp2.d */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29440d implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f119540E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f119541F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f119542w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f119543x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f119544y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f119545z;

    public /* synthetic */ C29440d(InterfaceC21159o0 interfaceC21159o0, InterfaceC12251g interfaceC12251g, InterfaceC2994c0 interfaceC2994c0, InterfaceC14515a interfaceC14515a, InterfaceC28601c1 interfaceC28601c1) {
        this.f119542w = 7;
        this.f119543x = interfaceC21159o0;
        this.f119545z = interfaceC12251g;
        this.f119544y = interfaceC2994c0;
        this.f119540E = interfaceC14515a;
        this.f119541F = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f119542w;
        Object obj2 = this.f119541F;
        Object obj3 = this.f119540E;
        Object obj4 = this.f119545z;
        Object obj5 = this.f119543x;
        Object obj6 = this.f119544y;
        switch (i13) {
            case 0:
                return AbstractC29441e.m89843r((InterfaceC2994c0) obj6, (Function1) obj5, (C27036c.a) obj4, (InterfaceC28601c1) obj3, (C15199y3) obj2, (C27036c.e) obj);
            case 1:
                return AbstractC31096c.m95763l((Function1) obj5, (String) obj6, (C31103j) obj4, (Function1) obj3, (InterfaceC2355b3) obj2, (String) obj);
            case 2:
                return EducationFragment.m21373S((EducationFragment) obj6, (String) obj5, (String) obj4, (String) obj3, (String) obj2, ((Integer) obj).intValue());
            case 3:
                return Function2.m102174n((InterfaceC28601c1) obj3, (InterfaceC28601c1) obj6, (Context) obj5, (C16351i) obj4, (C16351i) obj2, ((Boolean) obj).booleanValue());
            case 4:
                return AbstractC32658p3.m102180E((InterfaceC30468c) obj6, (InterfaceC28601c1) obj3, (InterfaceC28601c1) obj5, (InterfaceC28601c1) obj4, (InterfaceC28601c1) obj2, ((Boolean) obj).booleanValue());
            case 5:
                InterfaceC29884r interfaceC29884r = (InterfaceC29884r) obj5;
                C29891y c29891y = (C29891y) obj4;
                C34354s0 c34354s0 = (C34354s0) obj3;
                AbstractC17911t abstractC17911t = (AbstractC17911t) obj2;
                C0238p0 c0238p0 = (C0238p0) ((InterfaceC22129c) obj);
                c0238p0.m728a();
                float fM87022x = ((C11453f) obj6).f36746c.m87022x();
                if (fM87022x != 0.0f) {
                    long j7 = c29891y.f122126b;
                    int i14 = C23283u0.f92252c;
                    int iMo15749x = interfaceC29884r.mo15749x((int) (j7 >> 32));
                    C34346p1 c34346p1M108662d = c34354s0.m108662d();
                    C16618c c16618cM67334c = c34346p1M108662d != null ? c34346p1M108662d.f144282a.m67334c(iMo15749x) : new C16618c(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(c0238p0.mo743q0(AbstractC34313e1.f144078a));
                    float f13 = fFloor < 1.0f ? 1.0f : fFloor;
                    float f14 = f13 / 2;
                    float f15 = c16618cM67334c.f63939a + f14;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (c0238p0.f815w.mo731d() >> 32)) - f14;
                    if (f15 > fIntBitsToFloat) {
                        f15 = fIntBitsToFloat;
                    }
                    if (f15 >= f14) {
                        f14 = f15;
                    }
                    float fFloor2 = ((int) f13) % 2 == 1 ? ((float) Math.floor(f14)) + 0.5f : (float) Math.rint(f14);
                    c0238p0.mo727R(abstractC17911t, (((long) Float.floatToRawIntBits(c16618cM67334c.f63940b)) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloor2)) << 32), (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(c16618cM67334c.f63942d)) & 4294967295L), f13, (496 & 32) != 0 ? null : null, (496 & 64) != 0 ? 1.0f : fM87022x);
                }
                return C23454a0.f92919a;
            case 6:
                return AbstractC34633c.m109445o((C34634d) obj6, (C34635e) obj5, (InterfaceC28601c1) obj3, (InterfaceC28601c1) obj4, (InterfaceC28601c1) obj2, obj);
            case 7:
                return AbstractC35272w.m111883R((InterfaceC21159o0) obj5, (InterfaceC12251g) obj4, (InterfaceC2994c0) obj6, (InterfaceC14515a) obj3, (InterfaceC28670t2) obj2, (C9598e) obj);
            case 8:
                return AbstractC35430h.m112428A((C34280b) obj4, (Function1) obj5, (InterfaceC2994c0) obj6, (C23196w3) obj2, (InterfaceC28601c1) obj3, obj);
            default:
                return AbstractC37861d.m121401n((C37858a) obj6, (Function1) obj5, (Function1) obj4, (InterfaceC28601c1) obj3, (String) obj2, (Context) obj);
        }
    }

    public /* synthetic */ C29440d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i13) {
        this.f119542w = i13;
        this.f119544y = obj;
        this.f119543x = obj2;
        this.f119545z = obj3;
        this.f119540E = obj4;
        this.f119541F = obj5;
    }

    public /* synthetic */ C29440d(Function1 function1, String str, C31103j c31103j, Function1 function2, InterfaceC2355b3 interfaceC2355b3) {
        this.f119542w = 1;
        this.f119543x = function1;
        this.f119544y = str;
        this.f119545z = c31103j;
        this.f119540E = function2;
        this.f119541F = interfaceC2355b3;
    }

    public /* synthetic */ C29440d(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Context context, C16351i c16351i, C16351i c16351i2) {
        this.f119542w = 3;
        this.f119540E = interfaceC28601c1;
        this.f119544y = interfaceC28601c2;
        this.f119543x = context;
        this.f119545z = c16351i;
        this.f119541F = c16351i2;
    }

    public /* synthetic */ C29440d(InterfaceC30468c interfaceC30468c, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4) {
        this.f119542w = 4;
        this.f119544y = interfaceC30468c;
        this.f119540E = interfaceC28601c1;
        this.f119543x = interfaceC28601c2;
        this.f119545z = interfaceC28601c3;
        this.f119541F = interfaceC28601c4;
    }

    public /* synthetic */ C29440d(C34280b c34280b, Function1 function1, InterfaceC2994c0 interfaceC2994c0, C23196w3 c23196w3, InterfaceC28601c1 interfaceC28601c1) {
        this.f119542w = 8;
        this.f119545z = c34280b;
        this.f119543x = function1;
        this.f119544y = interfaceC2994c0;
        this.f119541F = c23196w3;
        this.f119540E = interfaceC28601c1;
    }

    public /* synthetic */ C29440d(C34634d c34634d, C34635e c34635e, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3) {
        this.f119542w = 6;
        this.f119544y = c34634d;
        this.f119543x = c34635e;
        this.f119540E = interfaceC28601c1;
        this.f119545z = interfaceC28601c2;
        this.f119541F = interfaceC28601c3;
    }
}
