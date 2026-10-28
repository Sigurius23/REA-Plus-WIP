package ud0;

import al1.C0982c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.sanguine.domain.models.SanguineWaitlistFooter;
import com.whoop.universalcheckout.features.UniversalCheckoutDestination;
import gz0.EnumC16313m0;
import java.util.List;
import l83.C23454a0;
import p114eb.AbstractC12939a0;
import p114eb.C12991u0;
import p163g1.C15199y3;
import p164g2.InterfaceC15237i;
import p390p1.AbstractC28683x;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function1;
import p720m91.InterfaceC25312u;
import p745y81.InterfaceC39332e;
import rd0.C31241c;
import sd0.C32409a;
import so1.C32818i;
import uw0.AbstractC35302l;
import v11.AbstractC35551i;
import v11.C35544b;
import wo1.AbstractC37458l;
import xo2.InterfaceC38495a;
import z72.AbstractC40161g;
import zk1.AbstractC40837a;
import zk1.C40839c;
import zo2.AbstractC40936g;

/* JADX INFO: renamed from: ud0.b */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C34789b implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f146484E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f146485F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f146486G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f146487w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f146488x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f146489y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f146490z;

    public /* synthetic */ C34789b(Modifier modifier, SanguineWaitlistFooter sanguineWaitlistFooter, Function1 function1, Function1 function2, Function1 function3, int i13) {
        this.f146487w = 6;
        this.f146486G = modifier;
        this.f146484E = sanguineWaitlistFooter;
        this.f146488x = function1;
        this.f146489y = function2;
        this.f146490z = function3;
        this.f146485F = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f146487w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC34790c.m109790l((C31241c) this.f146486G, (Function1) this.f146488x, (Function1) this.f146489y, (Function1) this.f146490z, (String) this.f146484E, this.f146485F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC34790c.m109787i((C32409a) this.f146486G, (Function1) this.f146488x, (Function1) this.f146489y, (Function1) this.f146490z, (String) this.f146484E, this.f146485F, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC35302l.m112040y((List) this.f146486G, (InterfaceC39332e) this.f146489y, (InterfaceC25312u) this.f146490z, (Function1) this.f146488x, (InterfaceC15237i) this.f146484E, this.f146485F, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC35551i.m112709C((C35544b) this.f146486G, (InterfaceC4339a) this.f146489y, (EnumC16313m0) this.f146490z, (String) this.f146484E, (Function1) this.f146488x, this.f146485F, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC37458l.m120015m((C32818i) this.f146486G, (C15199y3) this.f146490z, (Function1) this.f146488x, (InterfaceC4339a) this.f146484E, (Function1) this.f146489y, this.f146485F, (Composer) obj, iIntValue5);
            case 5:
                ((Integer) obj2).intValue();
                ((C37816b) this.f146486G).m121335g(this.f146488x, this.f146489y, this.f146490z, this.f146484E, (Composer) obj, AbstractC28683x.m87244L(this.f146485F) | 1);
                return C23454a0.f92919a;
            case 6:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC40161g.m128797K((Modifier) this.f146486G, (SanguineWaitlistFooter) this.f146484E, (Function1) this.f146488x, (Function1) this.f146489y, (Function1) this.f146490z, this.f146485F, (Composer) obj, iIntValue6);
            case 7:
                int iIntValue7 = ((Integer) obj2).intValue();
                return AbstractC40837a.m132347s((C0982c) this.f146486G, (C40839c) this.f146489y, (C12991u0) this.f146490z, (Function1) this.f146488x, (InterfaceC4339a) this.f146484E, this.f146485F, (Composer) obj, iIntValue7);
            default:
                int iIntValue8 = ((Integer) obj2).intValue();
                return AbstractC40936g.m132834k((InterfaceC38495a.d) this.f146486G, (AbstractC12939a0) this.f146488x, (AbstractC12939a0) this.f146489y, (AbstractActivityC1340r0) this.f146490z, (UniversalCheckoutDestination.C10630b.a) this.f146484E, this.f146485F, (Composer) obj, iIntValue8);
        }
    }

    public /* synthetic */ C34789b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i13, int i14) {
        this.f146487w = i14;
        this.f146486G = obj;
        this.f146488x = obj2;
        this.f146489y = obj3;
        this.f146490z = obj4;
        this.f146484E = obj5;
        this.f146485F = i13;
    }

    public /* synthetic */ C34789b(Object obj, Object obj2, Object obj3, Function1 function1, Object obj4, int i13, int i14) {
        this.f146487w = i14;
        this.f146486G = obj;
        this.f146489y = obj2;
        this.f146490z = obj3;
        this.f146488x = function1;
        this.f146484E = obj4;
        this.f146485F = i13;
    }

    public /* synthetic */ C34789b(C32818i c32818i, C15199y3 c15199y3, Function1 function1, InterfaceC4339a interfaceC4339a, Function1 function2, int i13) {
        this.f146487w = 4;
        this.f146486G = c32818i;
        this.f146490z = c15199y3;
        this.f146488x = function1;
        this.f146484E = interfaceC4339a;
        this.f146489y = function2;
        this.f146485F = i13;
    }

    public /* synthetic */ C34789b(C35544b c35544b, InterfaceC4339a interfaceC4339a, EnumC16313m0 enumC16313m0, String str, Function1 function1, int i13) {
        this.f146487w = 3;
        this.f146486G = c35544b;
        this.f146489y = interfaceC4339a;
        this.f146490z = enumC16313m0;
        this.f146484E = str;
        this.f146488x = function1;
        this.f146485F = i13;
    }
}
