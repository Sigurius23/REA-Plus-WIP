package b30;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import h20.AbstractC16736t0;
import java.util.List;
import l83.C23454a0;
import p026b2.C2314t;
import p209i3.AbstractC18032n;
import p390p1.C28635l;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: b30.n5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2584n5 extends AbstractC22680m implements InterfaceC4352n {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ float f10048E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC4339a f10049F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Function1 f10050G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Function1 f10051H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ List f10052w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f10053x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f10054y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC16736t0 f10055z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2584n5(List list, boolean z4, boolean z13, AbstractC16736t0 abstractC16736t0, float f13, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 function2) {
        super(4);
        this.f10052w = list;
        this.f10053x = z4;
        this.f10054y = z13;
        this.f10055z = abstractC16736t0;
        this.f10048E = f13;
        this.f10049F = interfaceC4339a;
        this.f10050G = function1;
        this.f10051H = function2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:37:0x0095  */
    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i13;
        AbstractC16736t0 abstractC16736t0;
        C28655q c28655q;
        boolean z4;
        boolean z13;
        boolean z14;
        Object objM87133R;
        InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i13 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | iIntValue2;
        } else {
            i13 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i13 |= ((C28655q) composer).m87149e(iIntValue) ? 32 : 16;
        }
        if ((i13 & 147) == 146) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                abstractC16736t0 = (AbstractC16736t0) this.f10052w.get(iIntValue);
                c28655q = (C28655q) composer;
                c28655q.m87150e0(756681197);
                z4 = this.f10053x;
                boolean z15 = this.f10054y;
                if (!z4 || (z15 && !abstractC16736t0.mo47257b())) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (AbstractC22676k.m65745e(abstractC16736t0, this.f10055z) || z15) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                c28655q.m87150e0(-806854858);
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = C2576m5.f10015w;
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                AbstractC2592o5.m7508f(abstractC16736t0, this.f10048E, z13, this.f10054y, z14, this.f10049F, this.f10050G, this.f10051H, InterfaceC1103a.m3430a(interfaceC1103a, AbstractC1136a.m3599a(AbstractC18032n.m51775c(C2314t.f9131w, false, (Function1) objM87133R), abstractC16736t0.mo47256a().name()), 2), c28655q, 0);
                c28655q.m87173q(false);
            }
        } else {
            abstractC16736t0 = (AbstractC16736t0) this.f10052w.get(iIntValue);
            c28655q = (C28655q) composer;
            c28655q.m87150e0(756681197);
            z4 = this.f10053x;
            boolean z16 = this.f10054y;
            if (z4) {
                z13 = false;
            } else {
                z13 = false;
            }
            if (AbstractC22676k.m65745e(abstractC16736t0, this.f10055z)) {
                z14 = false;
            } else {
                z14 = false;
            }
            c28655q.m87150e0(-806854858);
            objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = C2576m5.f10015w;
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC2592o5.m7508f(abstractC16736t0, this.f10048E, z13, this.f10054y, z14, this.f10049F, this.f10050G, this.f10051H, InterfaceC1103a.m3430a(interfaceC1103a, AbstractC1136a.m3599a(AbstractC18032n.m51775c(C2314t.f9131w, false, (Function1) objM87133R), abstractC16736t0.mo47256a().name()), 2), c28655q, 0);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }
}
