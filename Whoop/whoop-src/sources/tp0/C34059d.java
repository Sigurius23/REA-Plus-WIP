package tp0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import java.util.List;
import km0.C22581e;
import l83.C23454a0;
import p294l3.C23254g;
import p294l3.C23285v0;
import p390p1.AbstractC28683x;
import p510u0.AbstractC34339n0;
import p715kotlin.jvm.functions.Function1;
import sp0.C32870j;
import uw0.AbstractC35307q;
import v41.AbstractC35664f;

/* JADX INFO: renamed from: tp0.d */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C34059d implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f142730E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f142731F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f142732G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f142733H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f142734I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f142735J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f142736w = 2;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f142737x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f142738y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f142739z;

    public /* synthetic */ C34059d(C22581e c22581e, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, int i13, boolean z4, Function1 function1, InterfaceC4339a interfaceC4339a, int i14, int i15) {
        this.f142733H = c22581e;
        this.f142731F = interfaceC2994c0;
        this.f142734I = aVar;
        this.f142738y = i13;
        this.f142737x = z4;
        this.f142730E = function1;
        this.f142735J = interfaceC4339a;
        this.f142739z = i14;
        this.f142732G = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f142736w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC34060e.m107656r((C32870j) this.f142733H, this.f142737x, this.f142730E, (TextResource) this.f142734I, this.f142738y, (List) this.f142735J, (Function1) this.f142731F, this.f142739z, this.f142732G, (Composer) obj, iIntValue);
            case 1:
                ((Integer) obj2).getClass();
                AbstractC34339n0.m108623a((C23254g) this.f142733H, (Modifier) this.f142734I, (C23285v0) this.f142735J, this.f142737x, this.f142738y, this.f142739z, this.f142730E, (Function1) this.f142731F, (Composer) obj, AbstractC28683x.m87244L(this.f142732G | 1));
                return C23454a0.f92919a;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC35307q.m112100m((C22581e) this.f142733H, (InterfaceC2994c0) this.f142731F, (AbstractC35664f.a) this.f142734I, this.f142738y, this.f142737x, this.f142730E, (InterfaceC4339a) this.f142735J, this.f142739z, this.f142732G, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C34059d(C23254g c23254g, Modifier modifier, C23285v0 c23285v0, boolean z4, int i13, int i14, Function1 function1, Function1 function2, int i15) {
        this.f142733H = c23254g;
        this.f142734I = modifier;
        this.f142735J = c23285v0;
        this.f142737x = z4;
        this.f142738y = i13;
        this.f142739z = i14;
        this.f142730E = function1;
        this.f142731F = function2;
        this.f142732G = i15;
    }

    public /* synthetic */ C34059d(C32870j c32870j, boolean z4, Function1 function1, TextResource textResource, int i13, List list, Function1 function2, int i14, int i15) {
        this.f142733H = c32870j;
        this.f142737x = z4;
        this.f142730E = function1;
        this.f142734I = textResource;
        this.f142738y = i13;
        this.f142735J = list;
        this.f142731F = function2;
        this.f142739z = i14;
        this.f142732G = i15;
    }
}
