package km2;

import ad3.C0764g;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.membership.extensions.domain.models.CtaAction;
import com.whoop.membership.management.domain.models.items.MembershipAdjustmentCheckoutHeaderModel;
import com.whoop.membership.management.domain.models.items.MembershipCardModel;
import com.whoop.membership.management.domain.models.items.MembershipCheckoutCardModel;
import com.whoop.payments.domain.models.Card;
import hw1.AbstractC17702a;
import im2.InterfaceC18710a;
import iw1.AbstractC20995a;
import iw1.AbstractC20997c;
import iw1.AbstractC20999e;
import iw1.AbstractC21004j;
import jb1.C21536b;
import ko2.C22654d;
import kv2.AbstractC22846b;
import kw1.AbstractC22853d;
import kw1.AbstractC22856g;
import kw1.AbstractC22859j;
import kw1.AbstractC22862m;
import kw1.AbstractC22863n;
import kw1.AbstractC22867r;
import kw1.AbstractC22869t;
import kw1.AbstractC22871v;
import kx1.AbstractC22882c;
import lw1.C24773i;
import p208i2.InterfaceC17886g0;
import p270k2.InterfaceC22129c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.time.InstantKt;

/* JADX INFO: renamed from: km2.e */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C22594e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f88910w;

    public /* synthetic */ C22594e(int i13) {
        this.f88910w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f88910w) {
            case 0:
                return AbstractC22595f.m65526m((InterfaceC18710a) obj);
            case 1:
                return AbstractC22595f.m65521h(obj);
            case 2:
                return C22654d.m65662o((C0764g) obj);
            case 3:
                return Boolean.valueOf(InstantKt.parseIso$lambda$0(((Character) obj).charValue()));
            case 4:
                return Boolean.valueOf(InstantKt.parseIso$lambda$2(((Character) obj).charValue()));
            case 5:
                return Boolean.valueOf(InstantKt.parseIso$lambda$4(((Character) obj).charValue()));
            case 6:
                return Boolean.valueOf(InstantKt.parseIso$lambda$6(((Character) obj).charValue()));
            case 7:
                return Boolean.valueOf(InstantKt.parseIso$lambda$8(((Character) obj).charValue()));
            case 8:
                return Boolean.valueOf(InstantKt.parseIso$lambda$10(((Character) obj).charValue()));
            case 9:
                return AbstractC22846b.m66273x((InterfaceC17886g0) obj);
            case 10:
                return AbstractC22846b.m66274y((InterfaceC22129c) obj);
            case 11:
                return AbstractC22853d.m66331w((AbstractC20995a) obj);
            case 12:
                return AbstractC22853d.m66300M((String) obj);
            case 13:
                return AbstractC22853d.m66303P((Card) obj);
            case 14:
                return AbstractC22856g.m66342g((AbstractC20999e) obj);
            case 15:
                return AbstractC22859j.m66383s((AbstractC20997c) obj);
            case 16:
                return AbstractC22859j.m66354H((C24773i) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC22859j.m66355I((C24773i) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC22859j.m66356J((C24773i) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC22859j.m66384t((AbstractC17702a) obj);
            case 20:
                return AbstractC22862m.m66396f((CtaAction) obj);
            case 21:
                return AbstractC22863n.m66405f((CtaAction) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC22867r.m66415f((CtaAction) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC22869t.m66437r((AbstractC21004j) obj);
            case 24:
                return AbstractC22869t.m66438s((AbstractC17702a) obj);
            case 25:
                return AbstractC22871v.m66450g((CtaAction) obj);
            case 26:
                return AbstractC22882c.m66489j((C21536b) obj);
            case 27:
                return AbstractC22882c.m66491l((MembershipCardModel) obj);
            case 28:
                return AbstractC22882c.m66492m((MembershipAdjustmentCheckoutHeaderModel) obj);
            default:
                return AbstractC22882c.m66493n((MembershipCheckoutCardModel) obj);
        }
    }
}
