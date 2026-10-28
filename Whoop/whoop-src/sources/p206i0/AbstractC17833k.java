package p206i0;

import androidx.compose.foundation.gestures.AbstractC1096a;
import java.util.concurrent.CancellationException;
import p077d0.AbstractC11348f;
import p077d0.C11368k;
import p077d0.C11376m;
import p077d0.C11413x;
import p077d0.InterfaceC11372l;
import p180h0.C16368c;
import p180h0.InterfaceC16413k2;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22663d0;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: i0.k */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17833k {

    /* JADX INFO: renamed from: a */
    public static final float f69346a = 400;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m51264a(InterfaceC16413k2 interfaceC16413k2, float f13, C11376m c11376m, C11413x c11413x, Function1 function1, AbstractC32269c abstractC32269c) {
        C17831i c17831i;
        float f14;
        C22663d0 c22663d0;
        if (abstractC32269c instanceof C17831i) {
            c17831i = (C17831i) abstractC32269c;
            int i13 = c17831i.f69335E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c17831i.f69335E = i13 - Integer.MIN_VALUE;
            } else {
                c17831i = new C17831i(abstractC32269c);
            }
        } else {
            c17831i = new C17831i(abstractC32269c);
        }
        Object obj = c17831i.f69339z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c17831i.f69335E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C22663d0 c22663d1 = new C22663d0();
            boolean z4 = ((Number) c11376m.m30606a()).floatValue() == 0.0f;
            C17830h c17830h = new C17830h(f13, c22663d1, interfaceC16413k2, function1, 0);
            c17831i.f69337x = c11376m;
            c17831i.f69338y = c22663d1;
            c17831i.f69336w = f13;
            c17831i.f69335E = 1;
            if (AbstractC11348f.m30558f(c11376m, c11413x, !z4, c17830h, c17831i) == enumC31071a) {
                return enumC31071a;
            }
            f14 = f13;
            c22663d0 = c22663d1;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f14 = c17831i.f69336w;
            c22663d0 = c17831i.f69338y;
            c11376m = c17831i.f69337x;
            AbstractC34132o.m107864I(obj);
        }
        return new C17823a(new Float(f14 - c22663d0.f89331w), c11376m);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: b */
    public static final Object m51265b(InterfaceC16413k2 interfaceC16413k2, float f13, float f14, C11376m c11376m, InterfaceC11372l interfaceC11372l, Function1 function1, AbstractC32269c abstractC32269c) {
        C17832j c17832j;
        float fFloatValue;
        C11376m c11376m2;
        C22663d0 c22663d0;
        float f15 = f13;
        if (abstractC32269c instanceof C17832j) {
            c17832j = (C17832j) abstractC32269c;
            int i13 = c17832j.f69341F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c17832j.f69341F = i13 - Integer.MIN_VALUE;
            } else {
                c17832j = new C17832j(abstractC32269c);
            }
        } else {
            c17832j = new C17832j(abstractC32269c);
        }
        C17832j c17832j2 = c17832j;
        Object obj = c17832j2.f69340E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c17832j2.f69341F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C22663d0 c22663d1 = new C22663d0();
            fFloatValue = ((Number) c11376m.m30606a()).floatValue();
            Float f16 = new Float(f15);
            boolean z4 = ((Number) c11376m.m30606a()).floatValue() == 0.0f;
            C17830h c17830h = new C17830h(f14, c22663d1, interfaceC16413k2, function1, 1);
            c17832j2.f69344y = c11376m;
            c17832j2.f69345z = c22663d1;
            c17832j2.f69342w = f15;
            c17832j2.f69343x = fFloatValue;
            c17832j2.f69341F = 1;
            if (AbstractC11348f.m30560h(c11376m, f16, interfaceC11372l, !z4, c17830h, c17832j2) == enumC31071a) {
                return enumC31071a;
            }
            c11376m2 = c11376m;
            c22663d0 = c22663d1;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            float f17 = c17832j2.f69343x;
            float f18 = c17832j2.f69342w;
            c22663d0 = c17832j2.f69345z;
            c11376m2 = c17832j2.f69344y;
            AbstractC34132o.m107864I(obj);
            fFloatValue = f17;
            f15 = f18;
        }
        return new C17823a(new Float(f15 - c22663d0.f89331w), AbstractC11348f.m30565m(c11376m2, 0.0f, m51267d(((Number) c11376m2.m30606a()).floatValue(), fFloatValue), 29));
    }

    /* JADX INFO: renamed from: c */
    public static final void m51266c(C11368k c11368k, InterfaceC16413k2 interfaceC16413k2, Function1 function1, float f13) {
        float fMo29373a;
        try {
            fMo29373a = interfaceC16413k2.mo29373a(f13);
        } catch (CancellationException unused) {
            c11368k.m30599a();
            fMo29373a = 0.0f;
        }
        function1.invoke(Float.valueOf(fMo29373a));
        if (Math.abs(f13 - fMo29373a) > 0.5f) {
            c11368k.m30599a();
        }
    }

    /* JADX INFO: renamed from: d */
    public static final float m51267d(float f13, float f14) {
        if (f14 == 0.0f) {
            return 0.0f;
        }
        return (f14 <= 0.0f ? f13 >= f14 : f13 <= f14) ? f13 : f14;
    }

    /* JADX INFO: renamed from: e */
    public static final C17829g m51268e(C16368c c16368c, InterfaceC11372l interfaceC11372l) {
        return new C17829g(c16368c, AbstractC1096a.f4537b, interfaceC11372l);
    }
}
