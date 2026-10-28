package jp2;

import a00.C0072g;
import a00.C0074i;
import android.content.Context;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1585g0;
import b30.C2539i0;
import bc3.InterfaceC2994c0;
import c00.C3795a;
import c31.EnumC3919c;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.startactivity.goals.AbstractC10237a;
import com.whoop.stress.domain.model.StressCustomizationDrawerItem;
import com.whoop.stress.view.StressMonitorFragment;
import com.whoop.weeklyplan.hubandspoke.domain.api.MetricDetail;
import com.whoop.whooplabs.feature.navigation.C10839b;
import d00.C11433l;
import d21.C11505c;
import de0.C11980a;
import ew1.C13722a;
import ii0.AbstractC18533a;
import in1.InterfaceC18724d;
import io0.C20734u;
import iw1.AbstractC21005k;
import java.util.ArrayList;
import java.util.List;
import jb1.C21536b;
import jt2.AbstractC21951m;
import jt2.C21942d;
import jx1.AbstractC22022l;
import jx2.AbstractC22042f;
import kd1.AbstractC22392e;
import kk1.AbstractC22546g;
import kw1.AbstractC22869t;
import l83.C23454a0;
import la.C23548b;
import lf0.AbstractC23938l;
import lf0.AbstractC23990z1;
import lf0.C23897a2;
import lf0.C23942m;
import lj2.C24477c;
import ln1.AbstractC24533k;
import m80.AbstractC25222d;
import m80.C25223e;
import n00.C26083k;
import n40.C26267g;
import n81.AbstractC26450c;
import n81.C26453f;
import nj2.AbstractC26755b;
import nj2.C26769p;
import no0.AbstractC26958l0;
import nx1.AbstractC27221c;
import o00.C27344b;
import o71.AbstractC27633c;
import oj2.C27983d;
import ot2.C28332a;
import ot2.C28338g;
import ot2.C28339h;
import p025b1.C2214e;
import p031b9.C2817b;
import p042c2.C3867l;
import p042c2.InterfaceC3863h;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p163g1.C15199y3;
import p164g2.InterfaceC15237i;
import p164g2.InterfaceC15250v;
import p180h0.EnumC16377d2;
import p298l8.AbstractC23420c;
import p329n0.InterfaceC26064q;
import p353o0.C27331o;
import p353o0.InterfaceC27335s;
import p389p0.C28506a0;
import p389p0.C28535l0;
import p389p0.C28561y0;
import p389p0.InterfaceC28507a1;
import p389p0.InterfaceC28533k0;
import p390p1.C28624i0;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p442qy.C30765d;
import p510u0.InterfaceC34345p0;
import p599wz.C37701a1;
import p599wz.C37718g0;
import p599wz.C37770y;
import p599wz.InterfaceC37739n0;
import p619xl.C38445a;
import p631xz.C38747x;
import p635y2.C39137u1;
import p635y2.InterfaceC39131s1;
import p635y2.InterfaceC39147y;
import p665yz.C39899b;
import p668z1.C39967p;
import p711j31.C21280k;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22665e0;
import p720m91.InterfaceC25312u;
import pj2.AbstractC29310i;
import pj2.AbstractC29318q;
import pt2.AbstractC29527i;
import q00.C29715g;
import q00.C29734p0;
import r41.AbstractC30924h;
import r41.AbstractC30925i;
import r90.AbstractC31096c;
import r90.C31103j;
import rm2.AbstractC31605e;
import s41.C32194b;
import tr2.InterfaceC34116n;
import v03.InterfaceC35521h;
import v41.AbstractC35664f;
import zw2.C41178b;

/* JADX INFO: renamed from: jp2.l */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C21881l implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f84501E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f84502w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f84503x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f84504y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f84505z;

    public /* synthetic */ C21881l(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, C27983d c27983d, InterfaceC28601c1 interfaceC28601c1) {
        this.f84502w = 22;
        this.f84505z = interfaceC28601c1;
        this.f84503x = interfaceC2994c0;
        this.f84504y = c15199y3;
        this.f84501E = c27983d;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f84502w) {
            case 0:
                return AbstractC21883n.m62088z((C3867l) this.f84503x, (InterfaceC3863h) this.f84504y, (InterfaceC28601c1) this.f84505z, (InterfaceC28601c1) this.f84501E, (InterfaceC39147y) obj);
            case 1:
                return AbstractC22042f.m63029J((FeatureFlagChecker) this.f84503x, (C41178b) this.f84504y, (C10839b) this.f84505z, (InterfaceC4339a) this.f84501E, (C12987s0) obj);
            case 2:
                return AbstractC22392e.m64445f((InterfaceC1585g0) this.f84503x, (EnumC1632v) this.f84504y, (InterfaceC2994c0) this.f84501E, (InterfaceC28601c1) this.f84505z, (C28624i0) obj);
            case 3:
                return AbstractC10237a.m26003m((GenericInteraction) this.f84503x, (GenericInteraction) this.f84504y, (InterfaceC28601c1) this.f84505z, (Function1) this.f84501E, ((Boolean) obj).booleanValue());
            case 4:
                return AbstractC22546g.m65215U((InterfaceC25312u) this.f84503x, (Function1) this.f84504y, (Function1) this.f84505z, (Function1) this.f84501E, obj);
            case 5:
                return AbstractC22869t.m66442w((AbstractC21005k) this.f84503x, (Function1) this.f84504y, (Function1) this.f84505z, (C13722a) this.f84501E, obj);
            case 6:
                return AbstractC23938l.m70469q((Function1) this.f84503x, (Context) this.f84504y, (String) this.f84505z, (C23942m) this.f84501E, obj);
            case 7:
                return AbstractC23990z1.m70803w((List) this.f84503x, (C11980a) this.f84504y, (C23897a2) this.f84505z, (Function1) this.f84501E, (InterfaceC27335s) obj);
            case 8:
                return AbstractC24533k.m71462p((C39967p) this.f84503x, (InterfaceC18724d.c) this.f84504y, (Function1) this.f84505z, (C21280k) this.f84501E, 1, (InterfaceC26064q) obj);
            case 9:
                return AbstractC25222d.m73898w((Function1) this.f84503x, (C25223e) this.f84504y, (InterfaceC28601c1) this.f84505z, (InterfaceC28601c1) this.f84501E, (InterfaceC15250v) obj);
            case 10:
                C3795a c3795a = (C3795a) this.f84503x;
                Function1 function1 = (Function1) this.f84504y;
                Function1 function2 = (Function1) this.f84505z;
                Function1 function3 = (Function1) this.f84501E;
                AbstractC23420c initializer = (AbstractC23420c) obj;
                AbstractC22676k.m65750j(initializer, "$this$initializer");
                return new C26083k(c3795a.f15498a, (C39899b) c3795a.f15474C.get(), (C30765d) c3795a.f15529u.get(), c3795a.m11600b(), c3795a.f15506e, c3795a.m11599a(), function1, function2, c3795a.f15508f, function3, new C2539i0(0, c3795a.m11601c(), C37770y.class, "verifyDuringSignUp", "verifyDuringSignUp()V", 0, 26));
            case 11:
                return AbstractC26450c.m78328j((String) this.f84503x, (Function1) this.f84504y, (C26453f) this.f84501E, (InterfaceC28601c1) this.f84505z, (String) obj);
            case 12:
                return AbstractC26958l0.m80627X((InterfaceC15237i) this.f84503x, (Function1) this.f84504y, (String) this.f84505z, (C20734u) this.f84501E, (EnumC3919c) obj);
            case 13:
                return AbstractC27221c.m81971j((AbstractC22022l.b) this.f84503x, (Function1) this.f84504y, (Function1) this.f84505z, (Function1) this.f84501E, (InterfaceC26064q) obj);
            case 14:
                List list = (List) this.f84503x;
                C22665e0 c22665e0 = (C22665e0) this.f84504y;
                List list2 = (List) this.f84505z;
                C27331o c27331o = (C27331o) this.f84501E;
                C28561y0 c28561y0 = (C28561y0) ((InterfaceC28533k0) obj);
                InterfaceC39131s1 interfaceC39131s1 = c28561y0.f115552e;
                int iMo124638b = interfaceC39131s1 != null ? interfaceC39131s1.mo124638b() : 0;
                int iM86892e = 0;
                for (int i13 = 0; i13 < iMo124638b; i13++) {
                    iM86892e += (int) (c27331o.f109443q == EnumC16377d2.f62971w ? c28561y0.m86892e(i13) & 4294967295L : c28561y0.m86892e(i13) >> 32);
                }
                if (list != null) {
                    list.add(Integer.valueOf(iM86892e));
                }
                if (c22665e0.f89334w != list2.size()) {
                    c22665e0.f89334w++;
                }
                return C23454a0.f92919a;
            case 15:
                C3795a c3795a2 = (C3795a) this.f84503x;
                Function1 function4 = (Function1) this.f84504y;
                String str = (String) this.f84505z;
                C37701a1 c37701a1 = (C37701a1) this.f84501E;
                AbstractC23420c initializer2 = (AbstractC23420c) obj;
                AbstractC22676k.m65750j(initializer2, "$this$initializer");
                return new C27344b((C30765d) c3795a2.f15529u.get(), c3795a2.m11600b(), (C26267g) c3795a2.f15509f0.get(), c3795a2.m11599a(), c3795a2.f15498a, c3795a2.f15508f, new C0072g(((C0074i) c3795a2.f15481J.get()).m208a(c3795a2.m11601c().f161769N), c3795a2.m11600b(), c3795a2.m11599a(), c3795a2.f15508f), function4, str, c37701a1);
            case 16:
                return AbstractC27633c.m83426p((Function1) this.f84503x, (C32194b) this.f84504y, (InterfaceC28593a1) this.f84501E, (InterfaceC28601c1) this.f84505z, ((Integer) obj).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC27633c.m83424n((Function1) this.f84503x, (C11505c) this.f84504y, (InterfaceC28593a1) this.f84501E, (InterfaceC28601c1) this.f84505z, ((Integer) obj).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C28338g.m85900h((C28338g) this.f84503x, (C21942d) this.f84504y, (AbstractC21951m.i) this.f84505z, (MetricDetail) this.f84501E, (C21536b) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C28339h.m85918g((C28339h) this.f84503x, (C21942d) this.f84504y, (AbstractC21951m.i) this.f84505z, (MetricDetail) this.f84501E, (C21536b) obj);
            case 20:
                C28535l0 c28535l0 = (C28535l0) this.f84503x;
                c28535l0.f115449c = new C2817b((C28506a0) this.f84504y, (C39137u1) this.f84505z, (InterfaceC28507a1) this.f84501E);
                return new C2214e(c28535l0, 9);
            case 21:
                return StressMonitorFragment.m26414P((C26769p) this.f84503x, (StressMonitorFragment) this.f84504y, (C24477c) this.f84505z, (C12991u0) this.f84501E, (C12987s0) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC29310i.m89059o0((InterfaceC28601c1) this.f84505z, (InterfaceC2994c0) this.f84503x, (C15199y3) this.f84504y, (C27983d) this.f84501E, (InterfaceC26064q) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC29310i.m89063q0((InterfaceC2994c0) this.f84503x, (C15199y3) this.f84504y, (C27983d) this.f84505z, (InterfaceC25312u) this.f84501E, obj);
            case 24:
                return AbstractC29318q.m89170t0((StressCustomizationDrawerItem) this.f84503x, (AbstractC26755b) this.f84504y, (InterfaceC28601c1) this.f84505z, (InterfaceC28601c1) this.f84501E, ((Boolean) obj).booleanValue());
            case 25:
                return AbstractC29527i.m90248T((C28332a) this.f84503x, (Function1) this.f84504y, (InterfaceC2994c0) this.f84505z, (AbstractC35664f.a) this.f84501E, (InterfaceC26064q) obj);
            case 26:
                C3795a c3795a3 = (C3795a) this.f84503x;
                C11433l c11433l = (C11433l) this.f84504y;
                Function1 function5 = (Function1) this.f84505z;
                Function1 function6 = (Function1) this.f84501E;
                AbstractC23420c initializer3 = (AbstractC23420c) obj;
                AbstractC22676k.m65750j(initializer3, "$this$initializer");
                C0072g c0072gM208a = ((C0074i) c3795a3.f15481J.get()).m208a(c3795a3.m11601c().f161769N);
                C37718g0 c37718g0 = c3795a3.f15498a;
                C38747x c38747xM11600b = c3795a3.m11600b();
                C0072g c0072g = new C0072g(c0072gM208a, c3795a3.m11600b(), c3795a3.m11599a(), c3795a3.f15508f);
                C38445a c38445a = ((C29715g) c3795a3.f15513h0.f151137w).f121514a;
                return new C29734p0(c37718g0, c11433l, c38747xM11600b, c0072g, new C23548b(c11433l, (C37718g0) ((InterfaceC35521h) c38445a.f164636x).get(), (InterfaceC37739n0) ((InterfaceC35521h) c38445a.f164637y).get()), (C30765d) c3795a3.f15529u.get(), (C26267g) c3795a3.f15509f0.get(), c3795a3.f15508f, c3795a3.m11599a(), function5, function6);
            case 27:
                return AbstractC30924h.m95100z((InterfaceC2994c0) this.f84503x, (Function1) this.f84504y, (AbstractC30925i) this.f84505z, (InterfaceC34116n) this.f84501E, (InterfaceC34345p0) obj);
            case 28:
                return AbstractC31096c.m95760i((C31103j) this.f84503x, (Function1) this.f84504y, (Function1) this.f84505z, (String) this.f84501E, ((Boolean) obj).booleanValue());
            default:
                return AbstractC31605e.m97577S((AbstractC18533a) this.f84503x, (InterfaceC4339a) this.f84504y, (C12991u0) this.f84505z, (InterfaceC4339a) this.f84501E, (C12987s0) obj);
        }
    }

    public /* synthetic */ C21881l(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f84502w = i13;
        this.f84503x = obj;
        this.f84504y = obj2;
        this.f84505z = obj3;
        this.f84501E = obj4;
    }

    public /* synthetic */ C21881l(Object obj, Object obj2, Object obj3, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f84502w = i13;
        this.f84503x = obj;
        this.f84504y = obj2;
        this.f84501E = obj3;
        this.f84505z = interfaceC28601c1;
    }

    public /* synthetic */ C21881l(ArrayList arrayList, C22665e0 c22665e0, List list, int i13, C27331o c27331o) {
        this.f84502w = 14;
        this.f84503x = arrayList;
        this.f84504y = c22665e0;
        this.f84505z = list;
        this.f84501E = c27331o;
    }
}
