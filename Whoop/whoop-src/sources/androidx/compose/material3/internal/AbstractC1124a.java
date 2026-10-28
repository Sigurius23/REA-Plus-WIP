package androidx.compose.material3.internal;

import androidx.compose.p018ui.Modifier;
import bc3.AbstractC3006f0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p163g1.C15135s;
import p180h0.EnumC16377d2;
import p316m1.C24890a;
import p316m1.C24902g;
import p505ts.AbstractC34132o;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: androidx.compose.material3.internal.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1124a {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m3467a(InterfaceC4339a interfaceC4339a, InterfaceC4351m interfaceC4351m, AbstractC32269c abstractC32269c) {
        C24890a c24890a;
        if (abstractC32269c instanceof C24890a) {
            c24890a = (C24890a) abstractC32269c;
            int i13 = c24890a.f97509x;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c24890a.f97509x = i13 - Integer.MIN_VALUE;
            } else {
                c24890a = new C24890a(abstractC32269c);
            }
        } else {
            c24890a = new C24890a(abstractC32269c);
        }
        Object obj = c24890a.f97508w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c24890a.f97509x;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C15135s c15135s = new C15135s(interfaceC4339a, interfaceC4351m, null, 1);
                c24890a.f97509x = 1;
                if (AbstractC3006f0.m8719m(c15135s, c24890a) == enumC31071a) {
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
    public static final Modifier m3468b(Modifier modifier, C24902g c24902g, InterfaceC4351m interfaceC4351m) {
        EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
        return modifier.mo3471e(new DraggableAnchorsElement(c24902g, interfaceC4351m));
    }
}
