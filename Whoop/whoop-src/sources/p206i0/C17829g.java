package p206i0;

import androidx.compose.foundation.gestures.AbstractC1097b;
import bc3.AbstractC3006f0;
import hm.C17417d;
import p077d0.AbstractC11348f;
import p077d0.C11413x;
import p077d0.InterfaceC11372l;
import p180h0.C16357a0;
import p180h0.C16423m2;
import p180h0.InterfaceC16413k2;
import p180h0.InterfaceC16439p3;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: i0.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C17829g implements InterfaceC16439p3 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC17834l f69326a;

    /* JADX INFO: renamed from: b */
    public final C11413x f69327b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC11372l f69328c;

    /* JADX INFO: renamed from: d */
    public final C16423m2 f69329d = AbstractC1097b.f4540c;

    public C17829g(InterfaceC17834l interfaceC17834l, C11413x c11413x, InterfaceC11372l interfaceC11372l) {
        this.f69326a = interfaceC17834l;
        this.f69327b = c11413x;
        this.f69328c = interfaceC11372l;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public static final Object m51261b(C17829g c17829g, InterfaceC16413k2 interfaceC16413k2, float f13, float f14, C17826d c17826d, AbstractC32269c abstractC32269c) {
        C17828f c17828f;
        Object objM51264a;
        if (abstractC32269c instanceof C17828f) {
            c17828f = (C17828f) abstractC32269c;
            int i13 = c17828f.f69325y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c17828f.f69325y = i13 - Integer.MIN_VALUE;
            } else {
                c17828f = new C17828f(c17829g, abstractC32269c);
            }
        } else {
            c17828f = new C17828f(c17829g, abstractC32269c);
        }
        C17828f c17828f2 = c17828f;
        Object obj = c17828f2.f69323w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c17828f2.f69325y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (Math.abs(f13) == 0.0f || Math.abs(f14) == 0.0f) {
                return AbstractC11348f.m30554b(f13, f14, 28);
            }
            c17828f2.f69325y = 1;
            C11413x c11413x = c17829g.f69327b;
            C17417d c17417d = Math.abs(AbstractC11348f.m30563k(c11413x, 0.0f, f14)) >= Math.abs(f13) ? new C17417d(c11413x, 3) : new C17417d(c17829g.f69328c, 4);
            Float f15 = new Float(f13);
            Float f16 = new Float(f14);
            switch (c17417d.f67506w) {
                case 3:
                    objM51264a = AbstractC17833k.m51264a(interfaceC16413k2, f15.floatValue(), AbstractC11348f.m30554b(0.0f, f16.floatValue(), 28), (C11413x) c17417d.f67507x, c17826d, c17828f2);
                    if (objM51264a != EnumC31071a.f128113w) {
                        objM51264a = (C17823a) objM51264a;
                    }
                    break;
                default:
                    float fFloatValue = f15.floatValue();
                    float fFloatValue2 = f16.floatValue();
                    objM51264a = AbstractC17833k.m51265b(interfaceC16413k2, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, AbstractC11348f.m30554b(0.0f, fFloatValue2, 28), (InterfaceC11372l) c17417d.f67507x, c17826d, c17828f2);
                    if (objM51264a != EnumC31071a.f128113w) {
                        objM51264a = (C17823a) objM51264a;
                    }
                    break;
            }
            obj = objM51264a;
            if (obj == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return ((C17823a) obj).f69310b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m51262c(InterfaceC16413k2 interfaceC16413k2, float f13, Function1 function1, AbstractC32269c abstractC32269c) throws Throwable {
        C17825c c17825c;
        Function1 function2;
        if (abstractC32269c instanceof C17825c) {
            c17825c = (C17825c) abstractC32269c;
            int i13 = c17825c.f69316z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c17825c.f69316z = i13 - Integer.MIN_VALUE;
            } else {
                c17825c = new C17825c(this, abstractC32269c);
            }
        } else {
            c17825c = new C17825c(this, abstractC32269c);
        }
        Object objM8705K = c17825c.f69314x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c17825c.f69316z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C16357a0 c16357a0 = new C16357a0(this, f13, function1, interfaceC16413k2, null);
            c17825c.f69313w = function1;
            c17825c.f69316z = 1;
            objM8705K = AbstractC3006f0.m8705K(this.f69329d, c16357a0, c17825c);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
            function2 = function1;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function2 = c17825c.f69313w;
            AbstractC34132o.m107864I(objM8705K);
        }
        C17823a c17823a = (C17823a) objM8705K;
        function2.invoke(new Float(0.0f));
        return c17823a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m51263d(InterfaceC16413k2 interfaceC16413k2, float f13, Function1 function1, AbstractC32269c abstractC32269c) throws Throwable {
        C17827e c17827e;
        if (abstractC32269c instanceof C17827e) {
            c17827e = (C17827e) abstractC32269c;
            int i13 = c17827e.f69322y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c17827e.f69322y = i13 - Integer.MIN_VALUE;
            } else {
                c17827e = new C17827e(this, abstractC32269c);
            }
        } else {
            c17827e = new C17827e(this, abstractC32269c);
        }
        Object objM51262c = c17827e.f69320w;
        Object obj = EnumC31071a.f128113w;
        int i14 = c17827e.f69322y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM51262c);
            c17827e.f69322y = 1;
            objM51262c = m51262c(interfaceC16413k2, f13, function1, c17827e);
            if (objM51262c == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM51262c);
        }
        C17823a c17823a = (C17823a) objM51262c;
        return new Float(c17823a.f69309a.floatValue() != 0.0f ? ((Number) c17823a.f69310b.m30606a()).floatValue() : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17829g) {
            C17829g c17829g = (C17829g) obj;
            if (AbstractC22676k.m65745e(c17829g.f69328c, this.f69328c) && AbstractC22676k.m65745e(c17829g.f69327b, this.f69327b) && AbstractC22676k.m65745e(c17829g.f69326a, this.f69326a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f69326a.hashCode() + ((this.f69327b.hashCode() + (this.f69328c.hashCode() * 31)) * 31);
    }
}
