package bf0;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c41.AbstractC4157y4;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import cr2.AbstractC11086b;
import cr2.EnumC11092h;
import hy0.C17750h1;
import hy0.EnumC17727b2;
import java.util.List;
import km0.C22582f;
import l83.C23470p;
import p163g1.C15199y3;
import p329n0.C26068u;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import ze0.AbstractC40584c;
import zr1.AbstractC41069c;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: bf0.j */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C3198j implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f12527E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f12528F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f12529G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f12530H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f12531w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f12532x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f12533y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f12534z;

    public /* synthetic */ C3198j(TextResource textResource, TextResource textResource2, EnumC17727b2 enumC17727b2, boolean z4, TextResource textResource3, EnumC11092h enumC11092h, TextResource textResource4) {
        this.f12531w = 2;
        this.f12534z = textResource;
        this.f12527E = textResource2;
        this.f12528F = enumC17727b2;
        this.f12533y = z4;
        this.f12529G = textResource3;
        this.f12532x = enumC11092h;
        this.f12530H = textResource4;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12531w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC3199k.m9203F((AbstractC40584c.e) this.f12534z, (InterfaceC41070a) this.f12527E, this.f12533y, (InterfaceC2994c0) this.f12528F, (C15199y3) this.f12529G, (Function1) this.f12532x, (Function1) this.f12530H, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC4157y4.m12968t((Function1) this.f12532x, (InterfaceC28601c1) this.f12534z, (List) this.f12527E, (TextResource) this.f12528F, this.f12533y, (C17750h1) this.f12529G, (C23470p) this.f12530H, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC11086b.m29919g((TextResource) this.f12534z, (TextResource) this.f12527E, (EnumC17727b2) this.f12528F, this.f12533y, (TextResource) this.f12529G, (EnumC11092h) this.f12532x, (TextResource) this.f12530H, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC41069c.m133351s((C22582f) this.f12534z, (C26068u) this.f12527E, this.f12533y, (List) this.f12528F, (InterfaceC4339a) this.f12529G, (Function1) this.f12532x, (List) this.f12530H, (Composer) obj, iIntValue4);
        }
    }

    public /* synthetic */ C3198j(Object obj, Object obj2, boolean z4, Object obj3, Object obj4, Function1 function1, Object obj5, int i13) {
        this.f12531w = i13;
        this.f12534z = obj;
        this.f12527E = obj2;
        this.f12533y = z4;
        this.f12528F = obj3;
        this.f12529G = obj4;
        this.f12532x = function1;
        this.f12530H = obj5;
    }

    public /* synthetic */ C3198j(Function1 function1, InterfaceC28601c1 interfaceC28601c1, List list, TextResource textResource, boolean z4, C17750h1 c17750h1, C23470p c23470p) {
        this.f12531w = 1;
        this.f12532x = function1;
        this.f12534z = interfaceC28601c1;
        this.f12527E = list;
        this.f12528F = textResource;
        this.f12533y = z4;
        this.f12529G = c17750h1;
        this.f12530H = c23470p;
    }
}
