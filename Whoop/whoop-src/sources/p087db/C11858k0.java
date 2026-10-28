package p087db;

import androidx.health.platform.client.proto.C1533u;
import c43.C4199o;
import com.whoop.service.network.model.Sport;
import com.whoop.service.network.model.SportList;
import io.C18742d;
import io.C19979i;
import io.C20032l;
import io.C20033m;
import io.sentry.android.core.anr.C20053a;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import jo.C21818g;
import p141f9.C14260b;
import p199ho.C17523d;
import p199ho.C17524e;
import p284ko.C22619g0;
import p465rm.C31521c0;
import p690zr.AbstractC41058v0;
import p690zr.AbstractC41063y;
import p690zr.C41059w;
import p715kotlin.jvm.internal.AbstractC22676k;
import t23.C33392g2;

/* JADX INFO: renamed from: db.k0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C11858k0 implements Comparator {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f38688w;

    public /* synthetic */ C11858k0(int i13) {
        this.f38688w = i13;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z4;
        boolean z13;
        switch (this.f38688w) {
            case 0:
                C11860l0 c11860l0 = (C11860l0) obj;
                C11860l0 c11860l1 = (C11860l0) obj2;
                int iCompare = Integer.compare(c11860l1.f38694b, c11860l0.f38694b);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = c11860l0.f38695c.compareTo(c11860l1.f38695c);
                return iCompareTo != 0 ? iCompareTo : c11860l0.f38696d.compareTo(c11860l1.f38696d);
            case 1:
                C11860l0 c11860l2 = (C11860l0) obj;
                C11860l0 c11860l3 = (C11860l0) obj2;
                int iCompare2 = Integer.compare(c11860l3.f38693a, c11860l2.f38693a);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo2 = c11860l3.f38695c.compareTo(c11860l2.f38695c);
                return iCompareTo2 != 0 ? iCompareTo2 : c11860l3.f38696d.compareTo(c11860l2.f38696d);
            case 2:
                C14260b c14260b = (C14260b) obj;
                C14260b c14260b2 = (C14260b) obj2;
                int iCompare3 = Integer.compare(c14260b.f52060c, c14260b2.f52060c);
                return iCompare3 != 0 ? iCompare3 : c14260b.f52059b.compareTo(c14260b2.f52059b);
            case 3:
                return ((Double) obj).compareTo((Double) obj2);
            case 4:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
            case 5:
                return Integer.compare(((C17524e) obj).f67783a.f67786b, ((C17524e) obj2).f67783a.f67786b);
            case 6:
                return Long.compare(((C17523d) obj).f67780b, ((C17523d) obj2).f67780b);
            case 7:
                return ((C31521c0) obj2).f130073H - ((C31521c0) obj).f130073H;
            case 8:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 9:
                AbstractC41058v0 abstractC41058v0 = C20033m.f75160e;
                return 0;
            case 10:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i13 = 13;
                int i14 = 14;
                return C41059w.m133307f(C20032l.m55865c((C20032l) Collections.max(list, new C11858k0(i13)), (C20032l) Collections.max(list2, new C11858k0(i13)))).mo133308a(list.size(), list2.size()).mo133309b((C20032l) Collections.max(list, new C11858k0(i14)), (C20032l) Collections.max(list2, new C11858k0(i14)), new C11858k0(i14)).mo133312e();
            case 11:
                return ((C18742d) Collections.max((List) obj)).compareTo((C18742d) Collections.max((List) obj2));
            case 12:
                return ((C19979i) ((List) obj).get(0)).compareTo((C19979i) ((List) obj2).get(0));
            case 13:
                return C20032l.m55865c((C20032l) obj, (C20032l) obj2);
            case 14:
                C20032l c20032l = (C20032l) obj;
                C20032l c20032l2 = (C20032l) obj2;
                boolean z14 = c20032l.f75146E;
                int i15 = c20032l.f75150I;
                AbstractC41058v0 abstractC41058v0Mo133240a = (z14 && c20032l.f75149H) ? C20033m.f75160e : C20033m.f75160e.mo133240a();
                return AbstractC41063y.f177072a.mo133309b(Integer.valueOf(i15), Integer.valueOf(c20032l2.f75150I), c20032l.f75147F.f77573V ? C20033m.f75160e.mo133240a() : C20033m.f75161f).mo133309b(Integer.valueOf(c20032l.f75151J), Integer.valueOf(c20032l2.f75151J), abstractC41058v0Mo133240a).mo133309b(Integer.valueOf(i15), Integer.valueOf(c20032l2.f75150I), abstractC41058v0Mo133240a).mo133312e();
            case 15:
                C20053a c20053a = (C20053a) obj;
                C20053a c20053a2 = (C20053a) obj2;
                return Float.compare((c20053a.f75339b + 1.0f) * c20053a.f75343f * c20053a.f75338a, (c20053a2.f75339b + 1.0f) * c20053a2.f75343f * c20053a2.f75338a);
            case 16:
                return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C33392g2 c33392g2 = (C33392g2) obj2;
                Iterable iterable = (Iterable) ((C33392g2) obj).f139418J.getValue();
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    z4 = false;
                } else {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z4 = false;
                        } else if (AbstractC22676k.m65745e(((C4199o) it.next()).f17056b.getType(), ":raise-hand:")) {
                            z4 = true;
                        }
                    }
                }
                Iterable iterable2 = (Iterable) c33392g2.f139418J.getValue();
                if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                    z13 = false;
                } else {
                    Iterator it3 = iterable2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z13 = false;
                        } else if (AbstractC22676k.m65745e(((C4199o) it3.next()).f17056b.getType(), ":raise-hand:")) {
                            z13 = true;
                        }
                    }
                }
                if (!z4 || z13) {
                    return (z4 || !z13) ? 0 : 1;
                }
                return -1;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C33392g2 c33392g3 = (C33392g2) obj;
                C33392g2 c33392g4 = (C33392g2) obj2;
                if (!((Boolean) c33392g3.f139414F.getValue()).booleanValue() || ((Boolean) c33392g4.f139414F.getValue()).booleanValue()) {
                    return (((Boolean) c33392g3.f139414F.getValue()).booleanValue() || !((Boolean) c33392g4.f139414F.getValue()).booleanValue()) ? 0 : 1;
                }
                return -1;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C33392g2 c33392g5 = (C33392g2) obj;
                C33392g2 c33392g6 = (C33392g2) obj2;
                if (!((Boolean) c33392g5.f139416H.getValue()).booleanValue() || ((Boolean) c33392g6.f139416H.getValue()).booleanValue()) {
                    return (((Boolean) c33392g5.f139416H.getValue()).booleanValue() || !((Boolean) c33392g6.f139416H.getValue()).booleanValue()) ? 0 : 1;
                }
                return -1;
            case 20:
                C33392g2 c33392g7 = (C33392g2) obj;
                C33392g2 c33392g8 = (C33392g2) obj2;
                if (!((Boolean) c33392g7.f139440s.getValue()).booleanValue() || ((Boolean) c33392g8.f139440s.getValue()).booleanValue()) {
                    return (((Boolean) c33392g7.f139440s.getValue()).booleanValue() || !((Boolean) c33392g8.f139440s.getValue()).booleanValue()) ? 0 : 1;
                }
                return -1;
            case 21:
                C33392g2 c33392g9 = (C33392g2) obj;
                C33392g2 c33392g10 = (C33392g2) obj2;
                if (!((Boolean) c33392g9.f139433l.getValue()).booleanValue() || ((Boolean) c33392g10.f139433l.getValue()).booleanValue()) {
                    return (((Boolean) c33392g9.f139433l.getValue()).booleanValue() || !((Boolean) c33392g10.f139433l.getValue()).booleanValue()) ? 0 : 1;
                }
                return -1;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C33392g2 c33392g11 = (C33392g2) obj;
                C33392g2 c33392g12 = (C33392g2) obj2;
                if (!((Boolean) c33392g11.f139437p.getValue()).booleanValue() || ((Boolean) c33392g12.f139437p.getValue()).booleanValue()) {
                    return (((Boolean) c33392g11.f139437p.getValue()).booleanValue() || !((Boolean) c33392g12.f139437p.getValue()).booleanValue()) ? 0 : 1;
                }
                return -1;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ((String) ((C33392g2) obj).f139446y.getValue()).compareTo((String) ((C33392g2) obj2).f139446y.getValue());
            case 24:
                C21818g c21818g = (C21818g) obj;
                C21818g c21818g2 = (C21818g) obj2;
                int iCompare4 = Integer.compare(c21818g2.f84135b, c21818g.f84135b);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompareTo3 = c21818g.f84136c.compareTo(c21818g2.f84136c);
                return iCompareTo3 != 0 ? iCompareTo3 : c21818g.f84137d.compareTo(c21818g2.f84137d);
            case 25:
                C21818g c21818g3 = (C21818g) obj;
                C21818g c21818g4 = (C21818g) obj2;
                int iCompare5 = Integer.compare(c21818g4.f84134a, c21818g3.f84134a);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompareTo4 = c21818g4.f84136c.compareTo(c21818g3.f84136c);
                return iCompareTo4 != 0 ? iCompareTo4 : c21818g4.f84137d.compareTo(c21818g3.f84137d);
            case 26:
                return SportList.lambda$loadSports$0((Sport) obj, (Sport) obj2);
            case 27:
                return ((C22619g0) obj).f88978a - ((C22619g0) obj2).f88978a;
            case 28:
                return Float.compare(((C22619g0) obj).f88980c, ((C22619g0) obj2).f88980c);
            default:
                return Integer.parseInt(((String) obj).split(":")[0]) - Integer.parseInt(((String) obj2).split(":")[0]);
        }
    }
}
