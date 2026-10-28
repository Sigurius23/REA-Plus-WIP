package p027b3;

import androidx.compose.p018ui.node.Owner;
import androidx.compose.p018ui.platform.AndroidComposeView;
import c93.InterfaceC4351m;
import p005a3.AbstractC0201g;
import p026b2.C2319y;
import p031b9.AbstractC2875y;
import p078d1.C11458k;
import p390p1.AbstractC28683x;
import p390p1.C28674u2;
import p505ts.AbstractC34132o;
import p602x1.C37821g;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b3.u2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2449u2 {

    /* JADX INFO: renamed from: a */
    public static final C28674u2 f9555a = new C28674u2(C2434r2.f9530w);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final void m7431a(C11458k c11458k, C2319y c2319y, AbstractC32269c abstractC32269c) {
        C2439s2 c2439s2;
        if (abstractC32269c instanceof C2439s2) {
            c2439s2 = (C2439s2) abstractC32269c;
            int i13 = c2439s2.f9540x;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2439s2.f9540x = i13 - Integer.MIN_VALUE;
            } else {
                c2439s2 = new C2439s2(abstractC32269c);
            }
        } else {
            c2439s2 = new C2439s2(abstractC32269c);
        }
        Object obj = c2439s2.f9539w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c2439s2.f9540x;
        if (i14 != 0) {
            if (i14 == 1) {
                throw AbstractC2875y.m8309v(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        if (!c11458k.f9142w.f9141N) {
            throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
        }
        Owner ownerM517q = AbstractC0201g.m517q(c11458k);
        C37821g c37821g = (C37821g) AbstractC0201g.m516p(c11458k).f779a0;
        c37821g.getClass();
        if (AbstractC28683x.m87236D(c37821g, f9555a) != null) {
            throw new ClassCastException();
        }
        c2439s2.f9540x = 1;
        m7432b(ownerM517q, c2319y, c2439s2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final void m7432b(Owner owner, InterfaceC4351m interfaceC4351m, AbstractC32269c abstractC32269c) {
        C2444t2 c2444t2;
        if (abstractC32269c instanceof C2444t2) {
            c2444t2 = (C2444t2) abstractC32269c;
            int i13 = c2444t2.f9549x;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2444t2.f9549x = i13 - Integer.MIN_VALUE;
            } else {
                c2444t2 = new C2444t2(abstractC32269c);
            }
        } else {
            c2444t2 = new C2444t2(abstractC32269c);
        }
        Object obj = c2444t2.f9548w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c2444t2.f9549x;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c2444t2.f9549x = 1;
            ((AndroidComposeView) owner).m3581N(interfaceC4351m, c2444t2);
        } else {
            if (i14 == 1) {
                throw AbstractC2875y.m8309v(obj);
            }
            if (i14 == 2) {
                throw AbstractC2875y.m8309v(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
