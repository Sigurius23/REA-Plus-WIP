package b11;

import androidx.health.platform.client.proto.C1533u;
import c41.AbstractC4075n;
import c41.C4047j;
import com.mapbox.maps.MapboxMap;
import com.whoop.navigation.C9598e;
import d61.InterfaceC11732a;
import h01.C16541h;
import ht2.AbstractC17633e;
import jk2.AbstractC21764e;
import k71.AbstractC22269z;
import k71.C22248e;
import l83.C23454a0;
import p027b3.C2404l2;
import p163g1.C14949a2;
import p163g1.EnumC14960b2;
import p31.AbstractC28793d;
import p31.AbstractC28803n;
import p390p1.C28624i0;
import p668z1.AbstractC39957f;
import p668z1.AbstractC39963l;
import p668z1.C39961j;
import p715kotlin.jvm.functions.Function1;
import p720m91.C25308q;
import v61.AbstractC35741f;
import v61.C35736a;
import v71.AbstractC35767h;
import v71.C35765f;
import x71.C38039a;
import ym1.AbstractC39652c;

/* JADX INFO: renamed from: b11.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2275b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9022w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f9023x;

    public /* synthetic */ C2275b(Function1 function1, int i13) {
        this.f9022w = i13;
        this.f9023x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f9022w) {
            case 0:
                return AbstractC2280g.m7126p(this.f9023x, (C28624i0) obj);
            case 1:
                return C4047j.m12356e(this.f9023x, obj);
            case 2:
                return AbstractC4075n.m12507l(this.f9023x, obj);
            case 3:
                Function1 function1 = this.f9023x;
                Long l7 = (Long) obj;
                l7.longValue();
                return function1.invoke(l7);
            case 4:
                return new C14949a2((EnumC14960b2) obj, this.f9023x, 2);
            case 5:
                return C16541h.m46744d(this.f9023x, obj);
            case 6:
                return AbstractC17633e.m50210R(this.f9023x, obj);
            case 7:
                return AbstractC17633e.m50211S(this.f9023x, obj);
            case 8:
                return AbstractC21764e.m61483m(this.f9023x, (AbstractC2283j.a) obj);
            case 9:
                return C22248e.m63812d(this.f9023x, obj);
            case 10:
                return AbstractC22269z.m63935D(this.f9023x, (InterfaceC11732a) obj);
            case 11:
                return AbstractC22269z.m63940I(this.f9023x, obj);
            case 12:
                Function1 function2 = this.f9023x;
                C2404l2 c2404l2 = (C2404l2) obj;
                c2404l2.m7401c(MapboxMap.QFE_OFFSET);
                c2404l2.m7400b().m7292c(function2, MapboxMap.QFE_OFFSET);
                return C23454a0.f92919a;
            case 13:
                return p720m91.Function1.m74309j(this.f9023x, (C25308q) obj);
            case 14:
                return AbstractC28803n.m87623r(this.f9023x, obj);
            case 15:
                return AbstractC28803n.m87629x(this.f9023x, (AbstractC28793d) obj);
            case 16:
                return AbstractC35741f.m113222f(this.f9023x, (C35736a) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C35765f.m113328f(this.f9023x, (C9598e) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C35765f.m113330h(this.f9023x, obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC35767h.m113344l(this.f9023x, obj);
            case 20:
                return C38039a.m121784d(this.f9023x, obj);
            case 21:
                return AbstractC39652c.m126780j(this.f9023x, obj);
            default:
                AbstractC39957f abstractC39957f = (AbstractC39957f) this.f9023x.invoke((C39961j) obj);
                synchronized (AbstractC39963l.f172462c) {
                    AbstractC39963l.f172463d = AbstractC39963l.f172463d.m128160g(abstractC39957f.mo128147g());
                }
                return abstractC39957f;
        }
    }
}
