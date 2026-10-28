package p180h0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ep1.C13412g;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p077d0.AbstractC11348f;
import p077d0.C11376m;
import p077d0.C11413x;
import p077d0.InterfaceC11372l;
import p206i0.AbstractC17833k;
import p206i0.C17829g;
import p206i0.InterfaceC17834l;
import p268k0.AbstractC22086a;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22663d0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h0.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16357a0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC16413k2 f62878E;

    /* JADX INFO: renamed from: F */
    public Object f62879F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f62880G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f62881w = 0;

    /* JADX INFO: renamed from: x */
    public C22663d0 f62882x;

    /* JADX INFO: renamed from: y */
    public int f62883y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f62884z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16357a0(float f13, C16363b0 c16363b0, InterfaceC16413k2 interfaceC16413k2, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f62884z = f13;
        this.f62880G = c16363b0;
        this.f62878E = interfaceC16413k2;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f62881w) {
            case 0:
                return new C16357a0(this.f62884z, (C16363b0) this.f62880G, this.f62878E, interfaceC30057d);
            default:
                return new C16357a0((C17829g) this.f62879F, this.f62884z, (Function1) this.f62880G, this.f62878E, interfaceC30057d);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f62881w) {
            case 0:
                break;
        }
        return ((C16357a0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [i0.d] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        float f13;
        C11376m c11376m;
        C22663d0 c22663d0;
        final C22663d0 c22663d1;
        Object objM51261b;
        switch (this.f62881w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f62883y;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c11376m = (C11376m) this.f62879F;
                    c22663d0 = this.f62882x;
                    try {
                        AbstractC34132o.m107864I(obj);
                    } catch (CancellationException unused) {
                        c22663d0.f89331w = ((Number) c11376m.m30606a()).floatValue();
                    }
                    f13 = c22663d0.f89331w;
                    break;
                } else {
                    AbstractC34132o.m107864I(obj);
                    f13 = this.f62884z;
                    if (Math.abs(f13) > 1.0f) {
                        C22663d0 c22663d2 = new C22663d0();
                        c22663d2.f89331w = f13;
                        C22663d0 c22663d3 = new C22663d0();
                        C11376m c11376mM30554b = AbstractC11348f.m30554b(0.0f, f13, 28);
                        try {
                            C16363b0 c16363b0 = (C16363b0) this.f62880G;
                            C11413x c11413x = c16363b0.f62903a;
                            C13412g c13412g = new C13412g(c22663d3, this.f62878E, c22663d2, c16363b0);
                            this.f62882x = c22663d2;
                            this.f62879F = c11376mM30554b;
                            this.f62883y = 1;
                            if (AbstractC11348f.m30558f(c11376mM30554b, c11413x, false, c13412g, this) == enumC31071a) {
                                return enumC31071a;
                            }
                            c22663d0 = c22663d2;
                            f13 = c22663d0.f89331w;
                        } catch (CancellationException unused2) {
                            c11376m = c11376mM30554b;
                            c22663d0 = c22663d2;
                            c22663d0.f89331w = ((Number) c11376m.m30606a()).floatValue();
                        }
                    }
                }
                return new Float(f13);
            default:
                final Function1 function1 = (Function1) this.f62880G;
                C17829g c17829g = (C17829g) this.f62879F;
                InterfaceC17834l interfaceC17834l = c17829g.f69326a;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f62883y;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C11413x c11413x2 = c17829g.f69327b;
                    float f14 = this.f62884z;
                    float fMo46567b = interfaceC17834l.mo46567b(f14, AbstractC11348f.m30563k(c11413x2, 0.0f, f14));
                    if (Float.isNaN(fMo46567b)) {
                        AbstractC22086a.m63160c("calculateApproachOffset returned NaN. Please use a valid value.");
                    }
                    c22663d1 = new C22663d0();
                    float fSignum = Math.signum(f14) * Math.abs(fMo46567b);
                    c22663d1.f89331w = fSignum;
                    function1.invoke(new Float(fSignum));
                    float f15 = c22663d1.f89331w;
                    final int i15 = 0;
                    ?? r10 = new Function1() { // from class: i0.d
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i16 = i15;
                            float fFloatValue = ((Float) obj2).floatValue();
                            switch (i16) {
                                case 0:
                                    C22663d0 c22663d4 = c22663d1;
                                    float f16 = c22663d4.f89331w - fFloatValue;
                                    c22663d4.f89331w = f16;
                                    function1.invoke(Float.valueOf(f16));
                                    break;
                                default:
                                    C22663d0 c22663d5 = c22663d1;
                                    float f17 = c22663d5.f89331w - fFloatValue;
                                    c22663d5.f89331w = f17;
                                    function1.invoke(Float.valueOf(f17));
                                    break;
                            }
                            return C23454a0.f92919a;
                        }
                    };
                    this.f62882x = c22663d1;
                    this.f62883y = 1;
                    objM51261b = C17829g.m51261b(c17829g, this.f62878E, f15, this.f62884z, r10, this);
                    if (objM51261b != enumC31071a2) {
                    }
                    return enumC31071a2;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                C22663d0 c22663d4 = this.f62882x;
                AbstractC34132o.m107864I(obj);
                c22663d1 = c22663d4;
                objM51261b = obj;
                C11376m c11376m2 = (C11376m) objM51261b;
                float fMo46566a = interfaceC17834l.mo46566a(((Number) c11376m2.m30606a()).floatValue());
                if (Float.isNaN(fMo46566a)) {
                    AbstractC22086a.m63160c("calculateSnapOffset returned NaN. Please use a valid value.");
                }
                c22663d1.f89331w = fMo46566a;
                C11376m c11376mM30565m = AbstractC11348f.m30565m(c11376m2, 0.0f, 0.0f, 30);
                InterfaceC11372l interfaceC11372l = c17829g.f69328c;
                final int i16 = 1;
                Function1 function2 = new Function1() { // from class: i0.d
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i17 = i16;
                        float fFloatValue = ((Float) obj2).floatValue();
                        switch (i17) {
                            case 0:
                                C22663d0 c22663d5 = c22663d1;
                                float f16 = c22663d5.f89331w - fFloatValue;
                                c22663d5.f89331w = f16;
                                function1.invoke(Float.valueOf(f16));
                                break;
                            default:
                                C22663d0 c22663d6 = c22663d1;
                                float f17 = c22663d6.f89331w - fFloatValue;
                                c22663d6.f89331w = f17;
                                function1.invoke(Float.valueOf(f17));
                                break;
                        }
                        return C23454a0.f92919a;
                    }
                };
                this.f62882x = null;
                this.f62883y = 2;
                Object objM51265b = AbstractC17833k.m51265b(this.f62878E, fMo46566a, fMo46566a, c11376mM30565m, interfaceC11372l, function2, this);
                if (objM51265b != enumC31071a2) {
                    return objM51265b;
                }
                return enumC31071a2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16357a0(C17829g c17829g, float f13, Function1 function1, InterfaceC16413k2 interfaceC16413k2, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f62879F = c17829g;
        this.f62884z = f13;
        this.f62880G = function1;
        this.f62878E = interfaceC16413k2;
    }
}
