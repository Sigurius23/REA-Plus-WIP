package b30;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p133f1.AbstractC13923a2;
import p133f1.C13933e;
import p133f1.C13995y1;
import p163g1.AbstractC14983d3;
import p291l0.InterfaceC22997s1;
import p390p1.C28635l;
import p390p1.C28655q;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C2538i implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9853w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f9854x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f9855y;

    public /* synthetic */ C2538i(int i13, InterfaceC4339a interfaceC4339a, boolean z4) {
        this.f9853w = i13;
        this.f9854x = interfaceC4339a;
        this.f9855y = z4;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0073  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f9853w) {
            case 0:
                InterfaceC22997s1 TopAppBar = (InterfaceC22997s1) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(TopAppBar, "$this$TopAppBar");
                if ((iIntValue & 17) == 16) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    } else {
                        AbstractC14983d3.m43104a(this.f9854x, null, false, AbstractC37817c.m121344e(782248533, composer, new C2530h(this.f9855y)), composer, 24576, 14);
                    }
                } else {
                    AbstractC14983d3.m43104a(this.f9854x, null, false, AbstractC37817c.m121344e(782248533, composer, new C2530h(this.f9855y)), composer, 24576, 14);
                }
                return C23454a0.f92919a;
            default:
                Modifier modifier = (Modifier) obj;
                ((Number) obj3).intValue();
                C28655q c28655q2 = (C28655q) ((Composer) obj2);
                c28655q2.m87150e0(-196777734);
                long j7 = ((C13995y1) c28655q2.m87161k(AbstractC13923a2.f49638a)).f49941a;
                boolean zM87151f = c28655q2.m87151f(j7);
                InterfaceC4339a interfaceC4339a = this.f9854x;
                boolean zM87153g = zM87151f | c28655q2.m87153g(interfaceC4339a);
                boolean z4 = this.f9855y;
                boolean zM87155h = zM87153g | c28655q2.m87155h(z4);
                Object objM87133R = c28655q2.m87133R();
                if (zM87155h || objM87133R == C28635l.f115821a) {
                    objM87133R = new C13933e(j7, interfaceC4339a, z4);
                    c28655q2.m87172p0(objM87133R);
                }
                Modifier modifierM3479b = AbstractC1125a.m3479b(modifier, (Function1) objM87133R);
                c28655q2.m87173q(false);
                return modifierM3479b;
        }
    }
}
