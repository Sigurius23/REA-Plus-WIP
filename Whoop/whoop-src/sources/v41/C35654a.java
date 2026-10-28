package v41;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cm2.AbstractC4813a0;
import l83.InterfaceC23459e;
import ny0.AbstractC27274q;
import or2.C28205u0;
import p114eb.C12982q;
import p208i2.AbstractC17911t;
import p291l0.InterfaceC23013y;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import yl2.AbstractC39639f;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: v41.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C35654a implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f151472E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f151473F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC23459e f151474G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC23459e f151475H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f151476I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f151477J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f151478w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f151479x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f151480y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f151481z;

    public /* synthetic */ C35654a(AbstractC4813a0 abstractC4813a0, Function1 function1, Function1 function2, Function1 function3, InterfaceC4351m interfaceC4351m, Function1 function4, InterfaceC41070a interfaceC41070a, C28205u0 c28205u0, boolean z4) {
        this.f151480y = abstractC4813a0;
        this.f151481z = function1;
        this.f151472E = function2;
        this.f151473F = function3;
        this.f151474G = interfaceC4351m;
        this.f151475H = function4;
        this.f151476I = interfaceC41070a;
        this.f151477J = c28205u0;
        this.f151479x = z4;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f151478w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC35660d.m112874p((AbstractC17911t) this.f151480y, (Modifier) this.f151481z, "whoop_bottom_sheet_content", (Modifier) this.f151472E, this.f151479x, (C35666g) this.f151473F, (InterfaceC4339a) this.f151474G, (InterfaceC4339a) this.f151475H, (AbstractC27274q) this.f151476I, (Function3) this.f151477J, (InterfaceC23013y) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC39639f.m126716j((AbstractC4813a0) this.f151480y, (Function1) this.f151481z, (Function1) this.f151472E, (Function1) this.f151473F, (InterfaceC4351m) this.f151474G, (Function1) this.f151475H, (InterfaceC41070a) this.f151476I, (C28205u0) this.f151477J, this.f151479x, (C12982q) obj, (Composer) obj2, iIntValue2);
        }
    }

    public /* synthetic */ C35654a(AbstractC17911t abstractC17911t, Modifier modifier, Modifier modifier2, boolean z4, C35666g c35666g, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, AbstractC27274q abstractC27274q, Function3 function3) {
        this.f151480y = abstractC17911t;
        this.f151481z = modifier;
        this.f151472E = modifier2;
        this.f151479x = z4;
        this.f151473F = c35666g;
        this.f151474G = interfaceC4339a;
        this.f151475H = interfaceC4339a2;
        this.f151476I = abstractC27274q;
        this.f151477J = function3;
    }
}
