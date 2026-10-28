package c62;

import ai0.AbstractC0906a;
import androidx.health.platform.client.proto.C1533u;
import c90.AbstractC4326c;
import c93.InterfaceC4339a;
import cc2.AbstractC4417f;
import cd0.AbstractC4436b;
import ce1.C4491b;
import ce1.C4492c;
import ci0.AbstractC4729d;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.TextResource;
import com.whoop.recoveryimpacts.domain.model.RecoveryImpactsTileModel;
import java.util.List;
import mh.C25540h;
import nl0.C26809k;
import nl0.EnumC26811m;
import p702ch0.AbstractC4609c0;
import p702ch0.AbstractC4639n;
import p702ch0.AbstractC4652t0;
import p702ch0.AbstractC4653u;
import p702ch0.C4605b;
import p702ch0.C4642o0;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;
import yg0.AbstractC39523b;
import zc0.AbstractC40262a;
import zg0.AbstractC40624g;
import zg0.C40618a;
import zh0.AbstractC40638a;

/* JADX INFO: renamed from: c62.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C4273a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17354w;

    public /* synthetic */ C4273a(int i13) {
        this.f17354w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17354w) {
            case 0:
                return AbstractC4274b.m13316f((C23749z0) obj);
            case 1:
                return AbstractC4274b.m13317g((RecoveryImpactsTileModel) obj);
            case 2:
                return AbstractC4326c.m13643d(obj);
            case 3:
                return AbstractC4417f.m13858f(obj);
            case 4:
                return AbstractC4436b.m13882j((AbstractC40262a) obj);
            case 5:
                return C4491b.m14070l((C4492c) obj);
            case 6:
                return C4491b.m14071m((C4492c) obj);
            case 7:
                return p701ce2.Function1.m14107y((C25540h) obj);
            case 8:
                return AbstractC4639n.m14515t((List) obj);
            case 9:
                return AbstractC4639n.m14516u((TextResource) obj);
            case 10:
                return AbstractC4639n.m14520y((InterfaceC4339a) obj);
            case 11:
                return AbstractC4639n.m14521z((C4605b) obj);
            case 12:
                return AbstractC4639n.m14462A((EnumC26811m) obj);
            case 13:
                return AbstractC4639n.m14463B((C26809k) obj);
            case 14:
                return AbstractC4653u.m14647m((AbstractC40624g) obj);
            case 15:
                return AbstractC4653u.m14653s((C40618a) obj);
            case 16:
                return AbstractC4609c0.m14285C(((Float) obj).floatValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC4609c0.m14326w((AnalyticEventModel) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC4609c0.m14296N((AnalyticEventModel) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC4609c0.m14287E((String) obj);
            case 20:
                return AbstractC4609c0.m14289G((AbstractC40624g) obj);
            case 21:
                return AbstractC4609c0.m14290H((AbstractC39523b) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC4609c0.m14291I((AnalyticEventModel) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return p702ch0.Function1.m14392A(((Integer) obj).intValue());
            case 24:
                return p702ch0.Function1.m14415X((AbstractC39523b) obj);
            case 25:
                return p702ch0.Function1.m14416Y((AnalyticEventModel) obj);
            case 26:
                return C4642o0.m14539E(((Long) obj).longValue());
            case 27:
                return AbstractC4652t0.m14633d(((Long) obj).longValue());
            case 28:
                return AbstractC4729d.m14795m((AbstractC0906a) obj);
            default:
                return AbstractC4729d.m14796n((AbstractC40638a) obj);
        }
    }
}
