package p163g1;

import c93.InterfaceC4352n;
import f01.C13857f;
import l83.C23454a0;
import p077d0.AbstractC11348f;
import p077d0.InterfaceC11372l;
import p292l1.C23184u3;
import p292l1.C23196w3;
import p316m1.C24893b0;
import p316m1.C24900f;
import p316m1.C24902g;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.C22663d0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: g1.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C15085n extends AbstractC32275i implements InterfaceC4352n {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f56477E;

    /* JADX INFO: renamed from: F */
    public /* synthetic */ Object f56478F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f56479G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56480w;

    /* JADX INFO: renamed from: x */
    public int f56481x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f56482y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f56483z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15085n(Object obj, float f13, InterfaceC30057d interfaceC30057d, int i13) {
        super(4, interfaceC30057d);
        this.f56480w = i13;
        this.f56479G = obj;
        this.f56483z = f13;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f56480w) {
            case 0:
                C15085n c15085n = new C15085n((C14947a0) this.f56479G, this.f56483z, (InterfaceC30057d) obj4, 0);
                c15085n.f56477E = (C15175w) obj;
                c15085n.f56478F = (C15059k3) obj2;
                c15085n.f56482y = obj3;
                return c15085n.invokeSuspend(C23454a0.f92919a);
            default:
                C15085n c15085n2 = new C15085n((C24902g) this.f56479G, this.f56483z, (InterfaceC30057d) obj4, 1);
                c15085n2.f56477E = (C24900f) obj;
                c15085n2.f56478F = (C24893b0) obj2;
                c15085n2.f56482y = obj3;
                return c15085n2.invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f56480w) {
            case 0:
                C14947a0 c14947a0 = (C14947a0) this.f56479G;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f56481x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C15175w c15175w = (C15175w) this.f56477E;
                    float fM43146d = ((C15059k3) this.f56478F).m43146d(this.f56482y);
                    if (!Float.isNaN(fM43146d)) {
                        C22663d0 c22663d0 = new C22663d0();
                        float fM87022x = Float.isNaN(c14947a0.f55773j.m87022x()) ? 0.0f : c14947a0.f55773j.m87022x();
                        c22663d0.f89331w = fM87022x;
                        InterfaceC11372l interfaceC11372l = c14947a0.f55766c;
                        C13857f c13857f = new C13857f(13, c15175w, c22663d0);
                        this.f56477E = null;
                        this.f56478F = null;
                        this.f56481x = 1;
                        if (AbstractC11348f.m30555c(fM87022x, fM43146d, this.f56483z, interfaceC11372l, c13857f, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                C24902g c24902g = (C24902g) this.f56479G;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f56481x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C24900f c24900f = (C24900f) this.f56477E;
                    float fM72993d = ((C24893b0) this.f56478F).m72993d(this.f56482y);
                    if (!Float.isNaN(fM72993d)) {
                        C22663d0 c22663d1 = new C22663d0();
                        float fM87022x2 = Float.isNaN(c24902g.f97550j.m87022x()) ? 0.0f : c24902g.f97550j.m87022x();
                        c22663d1.f89331w = fM87022x2;
                        InterfaceC11372l interfaceC11372l2 = ((C23196w3) c24902g.f97543c.f74533x).f91786d;
                        C23184u3 c23184u3 = new C23184u3(c24900f, c22663d1, 1);
                        this.f56477E = null;
                        this.f56478F = null;
                        this.f56481x = 1;
                        if (AbstractC11348f.m30555c(fM87022x2, fM72993d, this.f56483z, interfaceC11372l2, c23184u3, this) == enumC31071a2) {
                            return enumC31071a2;
                        }
                    }
                    return C23454a0.f92919a;
                }
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return C23454a0.f92919a;
        }
    }
}
