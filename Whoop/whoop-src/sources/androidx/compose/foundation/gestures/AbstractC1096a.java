package androidx.compose.foundation.gestures;

import androidx.compose.p018ui.Modifier;
import bc3.AbstractC3006f0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import gm1.C15992b;
import io.sentry.hints.C20363j;
import l83.C23454a0;
import p007a6.C0458v;
import p077d0.C11347e2;
import p077d0.C11413x;
import p132f0.EnumC13840z0;
import p180h0.C16374d;
import p180h0.C16380e;
import p180h0.C16435p;
import p180h0.EnumC16377d2;
import p180h0.InterfaceC16439p3;
import p238j0.InterfaceC21083i;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1096a {

    /* JADX INFO: renamed from: a */
    public static final C15992b f4536a = new C15992b(24);

    /* JADX INFO: renamed from: b */
    public static final C11413x f4537b = new C11413x(new C20363j(23));

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m3370a(InterfaceC4339a interfaceC4339a, InterfaceC4351m interfaceC4351m, AbstractC32269c abstractC32269c) {
        C16380e c16380e;
        if (abstractC32269c instanceof C16380e) {
            c16380e = (C16380e) abstractC32269c;
            int i13 = c16380e.f62981x;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16380e.f62981x = i13 - Integer.MIN_VALUE;
            } else {
                c16380e = new C16380e(abstractC32269c);
            }
        } else {
            c16380e = new C16380e(abstractC32269c);
        }
        Object obj = c16380e.f62980w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c16380e.f62981x;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C0458v c0458v = new C0458v(interfaceC4339a, interfaceC4351m, (InterfaceC30057d) null, 9);
                c16380e.f62981x = 1;
                if (AbstractC3006f0.m8719m(c0458v, c16380e) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (AnchoredDragFinishedSignal unused) {
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public static Modifier m3371b(C16435p c16435p, boolean z4, InterfaceC21083i interfaceC21083i, InterfaceC16439p3 interfaceC16439p3, int i13) {
        EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
        if ((i13 & 4) != 0) {
            z4 = true;
        }
        if ((i13 & 8) != 0) {
            interfaceC21083i = null;
        }
        if ((i13 & 32) != 0) {
            interfaceC16439p3 = null;
        }
        return new AnchoredDraggableElement(c16435p, z4, interfaceC21083i, interfaceC16439p3);
    }

    /* JADX INFO: renamed from: c */
    public static final Object m3372c(C16435p c16435p, Enum r10, C11347e2 c11347e2, InterfaceC30057d interfaceC30057d) {
        Object objM46612a = c16435p.m46612a(r10, EnumC13840z0.f49374w, new C16374d(c16435p, c11347e2, null), interfaceC30057d);
        return objM46612a == EnumC31071a.f128113w ? objM46612a : C23454a0.f92919a;
    }
}
