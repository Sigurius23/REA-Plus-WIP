package p318m3;

import androidx.health.platform.client.proto.C1533u;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import l83.C23465k;
import p322m7.C25165p;
import p322m7.C25177v;
import p322m7.C25180w0;
import p361o9.C27666f;
import p361o9.C27667g;
import p361o9.C27673m;
import p361o9.C27676p;
import p361o9.C27677q;
import p389p0.C28516d1;
import p389p0.InterfaceC28518e0;
import p398p9.C28991o;
import p455ra.C31173d;
import p516u8.C34610p;
import p654yn.C39664d;
import p690zr.AbstractC41058v0;
import p690zr.AbstractC41063y;
import p690zr.C41059w;
import p715kotlin.jvm.internal.AbstractC22676k;
import za.C40215c;
import za.C40216d;

/* JADX INFO: renamed from: m3.g */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C24977g implements Comparator {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f97751w;

    public /* synthetic */ C24977g(int i13) {
        this.f97751w = i13;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f97751w) {
            case 0:
                C23465k c23465k = (C23465k) obj;
                C23465k c23465k2 = (C23465k) obj2;
                return (((Number) c23465k.f92938x).intValue() - ((Number) c23465k.f92937w).intValue()) - (((Number) c23465k2.f92938x).intValue() - ((Number) c23465k2.f92937w).intValue());
            case 1:
                return ((C25177v) obj).f98769a.compareTo(((C25177v) obj2).f98769a);
            case 2:
                return ((C25165p) obj).f98738a.compareTo(((C25165p) obj2).f98738a);
            case 3:
                return ((C25180w0) obj).f98792a.compareTo(((C25180w0) obj2).f98792a);
            case 4:
                return ((C34610p) obj2).f145779j - ((C34610p) obj).f145779j;
            case 5:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 6:
                return Integer.compare(((C27667g) ((List) obj).get(0)).f111364F, ((C27667g) ((List) obj2).get(0)).f111364F);
            case 7:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i13 = 11;
                return C41059w.m133307f(C27676p.m83669c((C27676p) Collections.max(list, new C24977g(10)), (C27676p) Collections.max(list2, new C24977g(10)))).mo133308a(list.size(), list2.size()).mo133309b((C27676p) Collections.max(list, new C24977g(i13)), (C27676p) Collections.max(list2, new C24977g(i13)), new C24977g(i13)).mo133312e();
            case 8:
                return ((C27666f) Collections.max((List) obj)).compareTo((C27666f) Collections.max((List) obj2));
            case 9:
                return ((C27673m) ((List) obj).get(0)).compareTo((C27673m) ((List) obj2).get(0));
            case 10:
                return C27676p.m83669c((C27676p) obj, (C27676p) obj2);
            case 11:
                C27676p c27676p = (C27676p) obj;
                C27676p c27676p2 = (C27676p) obj2;
                boolean z4 = c27676p.f111404E;
                int i14 = c27676p.f111409J;
                AbstractC41058v0 abstractC41058v0Mo133240a = (z4 && c27676p.f111407H) ? C27677q.f111422j : C27677q.f111422j.mo133240a();
                c27676p.f111405F.getClass();
                return AbstractC41063y.f177072a.mo133309b(Integer.valueOf(c27676p.f111410K), Integer.valueOf(c27676p2.f111410K), abstractC41058v0Mo133240a).mo133309b(Integer.valueOf(i14), Integer.valueOf(c27676p2.f111409J), abstractC41058v0Mo133240a).mo133312e();
            case 12:
                return AbstractC22676k.m65751k(((C28516d1) obj2).f115416a, ((C28516d1) obj).f115416a);
            case 13:
                return AbstractC22676k.m65751k(((InterfaceC28518e0) obj).getIndex(), ((InterfaceC28518e0) obj2).getIndex());
            case 14:
                if (obj == obj2) {
                    return 0;
                }
                if (obj == null) {
                    return 1;
                }
                if (obj2 == null) {
                    return -1;
                }
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 15:
                return ((C28991o) obj).f117266a - ((C28991o) obj2).f117266a;
            case 16:
                return Float.compare(((C28991o) obj).f117268c, ((C28991o) obj2).f117268c);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return Integer.compare(((C31173d) obj2).f128423b, ((C31173d) obj).f128423b);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return Integer.compare(((C39664d) obj2).f170667b, ((C39664d) obj).f170667b);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AnalyticsRequestV2.encodeMapParam$lambda$2(obj, obj2);
            case 20:
                return Integer.compare(((C40216d) obj).f173666a.f173669b, ((C40216d) obj2).f173666a.f173669b);
            default:
                return Long.compare(((C40215c) obj).f173663b, ((C40215c) obj2).f173663b);
        }
    }
}
