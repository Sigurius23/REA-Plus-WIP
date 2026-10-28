package p163g1;

import c93.InterfaceC4351m;
import f01.C13857f;
import fd3.C14408a;
import l83.C23454a0;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p077d0.C11362i1;
import p077d0.C11376m;
import p077d0.InterfaceC11372l;
import p180h0.C16381e0;
import p180h0.InterfaceC16392g1;
import p180h0.InterfaceC16413k2;
import p390p1.C28633k1;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.C22663d0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: g1.h7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15031h7 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC11372l f56263E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f56264F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56265w;

    /* JADX INFO: renamed from: x */
    public int f56266x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f56267y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f56268z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15031h7(float f13, InterfaceC11372l interfaceC11372l, C22663d0 c22663d0, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f56265w = 1;
        this.f56268z = f13;
        this.f56263E = interfaceC11372l;
        this.f56264F = c22663d0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f56265w) {
            case 0:
                C15031h7 c15031h7 = new C15031h7((C15093n7) this.f56264F, this.f56268z, this.f56263E, interfaceC30057d, 0);
                c15031h7.f56267y = obj;
                return c15031h7;
            case 1:
                C15031h7 c15031h8 = new C15031h7(this.f56268z, this.f56263E, (C22663d0) this.f56264F, interfaceC30057d);
                c15031h8.f56267y = obj;
                return c15031h8;
            default:
                C15031h7 c15031h9 = new C15031h7((C22663d0) this.f56264F, this.f56268z, (C11362i1) this.f56263E, interfaceC30057d, 2);
                c15031h9.f56267y = obj;
                return c15031h9;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56265w) {
            case 0:
                return ((C15031h7) create((InterfaceC16392g1) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C15031h7) create((InterfaceC16413k2) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C15031h7) create((C16381e0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f56265w) {
            case 0:
                C15093n7 c15093n7 = (C15093n7) this.f56264F;
                C28633k1 c28633k1 = c15093n7.f56511d;
                C28633k1 c28633k2 = c15093n7.f56515h;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f56266x;
                try {
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        InterfaceC16392g1 interfaceC16392g1 = (InterfaceC16392g1) this.f56267y;
                        C22663d0 c22663d0 = new C22663d0();
                        c22663d0.f89331w = c15093n7.f56514g.m87022x();
                        float f13 = this.f56268z;
                        c28633k2.setValue(new Float(f13));
                        c28633k1.setValue(Boolean.TRUE);
                        C11344e c11344eM30553a = AbstractC11348f.m30553a(c22663d0.f89331w);
                        Float f14 = new Float(f13);
                        InterfaceC11372l interfaceC11372l = this.f56263E;
                        C14953a6 c14953a6 = new C14953a6(interfaceC16392g1, c22663d0, 1);
                        this.f56266x = 1;
                        obj = C11344e.m30547d(c11344eM30553a, f14, interfaceC11372l, c14953a6, this, 4);
                        if (obj == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    c28633k2.setValue(null);
                    c28633k1.setValue(Boolean.FALSE);
                    return C23454a0.f92919a;
                } catch (Throwable th3) {
                    c28633k2.setValue(null);
                    c28633k1.setValue(Boolean.FALSE);
                    throw th3;
                }
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f56266x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    int i15 = 21;
                    C13857f c13857f = new C13857f(i15, (C22663d0) this.f56264F, (InterfaceC16413k2) this.f56267y);
                    this.f56266x = 1;
                    if (AbstractC11348f.m30557e(0.0f, this.f56268z, this.f56263E, c13857f, this, 4) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                C22663d0 c22663d1 = (C22663d0) this.f56264F;
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i16 = this.f56266x;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C16381e0 c16381e0 = (C16381e0) this.f56267y;
                    C11376m c11376mM30554b = AbstractC11348f.m30554b(c22663d1.f89331w, 0.0f, 30);
                    Float f15 = new Float(this.f56268z);
                    C11362i1 c11362i1 = (C11362i1) this.f56263E;
                    C14408a c14408a = new C14408a(28, c22663d1, c16381e0);
                    this.f56266x = 1;
                    if (AbstractC11348f.m30561i(c11376mM30554b, f15, c11362i1, false, c14408a, this, 4) == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15031h7(Object obj, float f13, InterfaceC11372l interfaceC11372l, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f56265w = i13;
        this.f56264F = obj;
        this.f56268z = f13;
        this.f56263E = interfaceC11372l;
    }
}
