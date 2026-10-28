package fc0;

import androidx.compose.runtime.Composer;
import bm.InterfaceC3389m;
import c93.InterfaceC4352n;
import com.whoop.membership.management.navigation.AbstractC9126a;
import com.whoop.stress.view.StressMonitorFragment;
import gd0.AbstractC15713c;
import hd2.C17202d;
import id0.AbstractC18409c;
import id2.AbstractC18435t;
import in2.C18733e;
import java.util.List;
import km0.C22581e;
import lj2.C24477c;
import nj2.C26769p;
import p040c0.InterfaceC3764o;
import p114eb.C12982q;
import p114eb.C12991u0;
import p164g2.InterfaceC15237i;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p409q0.InterfaceC29694r;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import pu2.InterfaceC29560h;
import qu2.AbstractC30640h;
import t21.AbstractC33349g;
import t21.C33346d;
import uw0.AbstractC35302l;

/* JADX INFO: renamed from: fc0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C14359c implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f52418w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f52419x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f52420y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f52421z;

    public /* synthetic */ C14359c(Object obj, Object obj2, Object obj3, int i13) {
        this.f52418w = i13;
        this.f52419x = obj;
        this.f52420y = obj2;
        this.f52421z = obj3;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f52418w) {
            case 0:
                return AbstractC14363g.m40992l((C14364h) this.f52419x, (InterfaceC39171c) this.f52420y, (InterfaceC28593a1) this.f52421z, (InterfaceC29694r) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            case 1:
                return AbstractC18409c.m52987z((AbstractC15713c.e) this.f52419x, (Function1) this.f52420y, (Function1) this.f52421z, (InterfaceC29694r) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            case 2:
                return AbstractC18435t.m53084I((C17202d.a) this.f52419x, (List) this.f52420y, (InterfaceC28601c1) this.f52421z, (InterfaceC29694r) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            case 3:
                return AbstractC9126a.m22813u((Function1) this.f52419x, (Function1) this.f52420y, (InterfaceC28670t2) this.f52421z, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 4:
                return StressMonitorFragment.m26415Q((C26769p) this.f52419x, (StressMonitorFragment) this.f52420y, (C24477c) this.f52421z, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 5:
                return StressMonitorFragment.m26418T((C26769p) this.f52419x, (StressMonitorFragment) this.f52420y, (C12991u0) this.f52421z, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 6:
                return AbstractC30640h.m94121e0((InterfaceC29560h.e) this.f52419x, (C18733e) this.f52420y, (Function1) this.f52421z, (InterfaceC3389m) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            case 7:
                return AbstractC33349g.m105728E((C33346d) this.f52419x, (InterfaceC28670t2) this.f52420y, (InterfaceC28670t2) this.f52421z, (InterfaceC3764o) obj, ((Boolean) obj2).booleanValue(), (Composer) obj3, ((Integer) obj4).intValue());
            default:
                return AbstractC35302l.m112012F((C22581e) this.f52419x, (Function1) this.f52420y, (InterfaceC15237i) this.f52421z, (InterfaceC29694r) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
        }
    }
}
