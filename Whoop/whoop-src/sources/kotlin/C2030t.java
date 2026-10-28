package kotlin;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import eu2.AbstractC13658o;
import eu2.C13659p;
import java.util.List;
import km0.C22581e;
import ot2.C28332a;
import p040c0.InterfaceC3747i0;
import p12.AbstractC28734x;
import p291l0.InterfaceC23004v;
import p291l0.InterfaceC23013y;
import p390p1.InterfaceC28593a1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p720m91.C25287a;
import pt2.AbstractC29527i;
import v41.AbstractC35664f;
import wr0.AbstractC37557u0;
import wr0.C37563x0;
import ys2.AbstractC39758e;

/* JADX INFO: renamed from: at2.t */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2030t implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f8042E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f8043F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8044w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f8045x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f8046y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f8047z;

    public /* synthetic */ C2030t(int i13, int i14, Object obj, Object obj2, Object obj3, Function1 function1) {
        this.f8044w = i14;
        this.f8047z = obj;
        this.f8046y = i13;
        this.f8042E = obj2;
        this.f8043F = obj3;
        this.f8045x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f8044w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC2036w.m6365E((AbstractC39758e.i) this.f8047z, this.f8046y, (InterfaceC2994c0) this.f8042E, (AbstractC35664f.a) this.f8043F, this.f8045x, (InterfaceC23013y) obj, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC13658o.m38518h((C25287a) this.f8047z, this.f8045x, this.f8046y, (C13659p) this.f8042E, (Modifier) this.f8043F, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj3).intValue();
                return AbstractC28734x.m87400M((C22581e) this.f8047z, (InterfaceC2994c0) this.f8042E, (AbstractC35664f.a) this.f8043F, this.f8046y, this.f8045x, (InterfaceC23013y) obj, (Composer) obj2, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj3).intValue();
                return AbstractC29527i.m90241M((C28332a) this.f8047z, this.f8046y, (InterfaceC2994c0) this.f8042E, (AbstractC35664f.a) this.f8043F, this.f8045x, (InterfaceC23013y) obj, (Composer) obj2, iIntValue4);
            default:
                int iIntValue5 = ((Integer) obj3).intValue();
                return AbstractC37557u0.m120549z((List) this.f8047z, this.f8046y, (InterfaceC28593a1) this.f8042E, (C37563x0) this.f8043F, this.f8045x, (InterfaceC23004v) obj, (Composer) obj2, iIntValue5);
        }
    }

    public /* synthetic */ C2030t(C22581e c22581e, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, int i13, Function1 function1) {
        this.f8044w = 2;
        this.f8047z = c22581e;
        this.f8042E = interfaceC2994c0;
        this.f8043F = aVar;
        this.f8046y = i13;
        this.f8045x = function1;
    }

    public /* synthetic */ C2030t(C25287a c25287a, Function1 function1, int i13, C13659p c13659p, Modifier modifier) {
        this.f8044w = 1;
        this.f8047z = c25287a;
        this.f8045x = function1;
        this.f8046y = i13;
        this.f8042E = c13659p;
        this.f8043F = modifier;
    }
}
