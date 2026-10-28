package cu2;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import com.whoop.weightlifting.AbstractC10757a;
import com.whoop.weightlifting.StrengthTrainerDestination;
import j02.InterfaceC21159o0;
import l83.InterfaceC23462h;
import mf0.AbstractC25506e;
import mf0.C25508g;
import p114eb.C12991u0;
import p163g1.C15199y3;
import p291l0.InterfaceC23013y;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: cu2.o */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C11135o implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f35541E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f35542F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC28670t2 f35543G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35544w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f35545x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f35546y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f35547z;

    public /* synthetic */ C11135o(C12991u0 c12991u0, InterfaceC21159o0 interfaceC21159o0, boolean z4, InterfaceC4339a interfaceC4339a, InterfaceC23462h interfaceC23462h, InterfaceC28670t2 interfaceC28670t2) {
        this.f35546y = c12991u0;
        this.f35547z = interfaceC21159o0;
        this.f35545x = z4;
        this.f35541E = interfaceC4339a;
        this.f35542F = interfaceC23462h;
        this.f35543G = interfaceC28670t2;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f35544w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC10757a.m28145I((C12991u0) this.f35546y, (InterfaceC21159o0) this.f35547z, this.f35545x, (InterfaceC4339a) this.f35541E, (InterfaceC23462h) this.f35542F, this.f35543G, (StrengthTrainerDestination.C10738a.a) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC25506e.m74929T((C25508g) this.f35546y, this.f35545x, (InterfaceC2994c0) this.f35547z, (C15199y3) this.f35541E, (InterfaceC28601c1) this.f35542F, (InterfaceC28601c1) this.f35543G, (InterfaceC23013y) obj, (Composer) obj2, iIntValue2);
        }
    }

    public /* synthetic */ C11135o(C25508g c25508g, boolean z4, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        this.f35546y = c25508g;
        this.f35545x = z4;
        this.f35547z = interfaceC2994c0;
        this.f35541E = c15199y3;
        this.f35542F = interfaceC28601c1;
        this.f35543G = interfaceC28601c2;
    }
}
