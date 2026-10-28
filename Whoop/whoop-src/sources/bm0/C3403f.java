package bm0;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import bc3.InterfaceC2994c0;
import bm.InterfaceC3389m;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.membership.management.navigation.AbstractC9126a;
import com.whoop.universalcheckout.features.AbstractC10635a;
import com.whoop.weightlifting.data.domain.FilterOptions;
import dg2.C12010b;
import eg2.AbstractC13177j;
import ev2.AbstractC13712u;
import hp1.C17553m;
import java.util.List;
import java.util.Set;
import jp1.AbstractC21869u;
import p040c0.InterfaceC3764o;
import p114eb.AbstractC12939a0;
import p114eb.C12982q;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p409q0.AbstractC29701y;
import p409q0.InterfaceC29694r;
import p668z1.C39967p;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import qu2.AbstractC30643k;
import ro1.AbstractC31634f;
import ro1.C31637i;
import rs2.AbstractC31795a;
import so1.AbstractC32807c0;
import so1.C32805b0;
import yn1.C39673b;
import yo0.AbstractC39683e;
import yo0.C39684f;

/* JADX INFO: renamed from: bm0.f */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C3403f implements InterfaceC4352n {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f13269E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13270w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f13271x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f13272y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f13273z;

    public /* synthetic */ C3403f(FilterOptions filterOptions, Set set, Function1 function1, Function3 function3) {
        this.f13270w = 2;
        this.f13272y = filterOptions;
        this.f13273z = set;
        this.f13271x = function1;
        this.f13269E = function3;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f13270w) {
            case 0:
                return AbstractC3409l.m9811r((InterfaceC2994c0) this.f13272y, (AbstractC29701y) this.f13273z, (C3410m) this.f13269E, (Function1) this.f13271x, (InterfaceC29694r) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            case 1:
                return AbstractC13177j.m37001I((Function1) this.f13271x, (C12010b) this.f13272y, (Function1) this.f13273z, (InterfaceC28601c1) this.f13269E, (InterfaceC3764o) obj, (String) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 2:
                return AbstractC13712u.m38811n0((FilterOptions) this.f13272y, (Set) this.f13273z, (Function1) this.f13271x, (Function3) this.f13269E, (InterfaceC3389m) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            case 3:
                return AbstractC9126a.m22809q((Function1) this.f13271x, (Function1) this.f13272y, (Function1) this.f13273z, (InterfaceC28670t2) this.f13269E, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 4:
                return AbstractC21869u.m61989s((C39967p) this.f13272y, (C17553m) this.f13273z, (C39967p) this.f13269E, (C39967p) this.f13271x, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            case 5:
                return AbstractC10635a.m27554o((String) this.f13272y, (AbstractC12939a0) this.f13273z, (AbstractActivityC1340r0) this.f13269E, (String) this.f13271x, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 6:
                return AbstractC30643k.m94198u((InterfaceC4339a) this.f13272y, (InterfaceC28601c1) this.f13273z, (InterfaceC4351m) this.f13269E, (InterfaceC28601c1) this.f13271x, (InterfaceC3764o) obj, ((Boolean) obj2).booleanValue(), (Composer) obj3, ((Integer) obj4).intValue());
            case 7:
                return AbstractC31634f.m97757t((AbstractC32807c0) this.f13272y, (C32805b0) this.f13273z, (C31637i) this.f13269E, (C39673b) this.f13271x, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 8:
                return AbstractC31795a.m98752w((List) this.f13272y, (List) this.f13273z, (InterfaceC4351m) this.f13269E, (InterfaceC28593a1) this.f13271x, (InterfaceC29694r) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            default:
                return AbstractC39683e.m126931S((C39684f) this.f13272y, (InterfaceC28601c1) this.f13273z, (InterfaceC28601c1) this.f13269E, (InterfaceC4339a) this.f13271x, (InterfaceC3764o) obj, (List) obj2, (Composer) obj3, ((Integer) obj4).intValue());
        }
    }

    public /* synthetic */ C3403f(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f13270w = i13;
        this.f13272y = obj;
        this.f13273z = obj2;
        this.f13269E = obj3;
        this.f13271x = obj4;
    }

    public /* synthetic */ C3403f(Function1 function1, Object obj, Function1 function2, InterfaceC28670t2 interfaceC28670t2, int i13) {
        this.f13270w = i13;
        this.f13271x = function1;
        this.f13272y = obj;
        this.f13273z = function2;
        this.f13269E = interfaceC28670t2;
    }
}
