package f41;

import androidx.health.platform.client.proto.C1533u;
import be0.AbstractC3165a;
import ce0.AbstractC4487b;
import com.whoop.design.models.items.amoeba.WhoopAgeAmoeba;
import com.whoop.exerciseprogressminiarch.domain.models.ArchMiniExerciseProgress;
import com.whoop.user.journey.model.yearinreview.AnimatableTextModel;
import com.whoop.user.journey.model.yearinreview.TimeCapsuleModel;
import com.whoop.user.journey.model.yearinreview.chronologicalsection.GaugeValueModel;
import com.whoop.user.journey.model.yearinreview.chronologicalsection.NumberValueModel;
import f51.AbstractC14093d;
import f61.C14147i;
import f71.AbstractC14223d;
import fc2.AbstractC14368b;
import fc2.InterfaceC14369c;
import fe0.AbstractC14415e;
import ff1.AbstractC14427a;
import ff1.AbstractC14429c;
import fg2.AbstractC14466h;
import fg2.AbstractC14468j;
import fg2.AbstractC14472n;
import fj1.AbstractC14534e;
import fq2.AbstractC14687d;
import java.util.Map;
import jb1.C21536b;
import kd0.InterfaceC22381a;
import m83.AbstractC25260n;
import p031b9.AbstractC2875y;
import p134f2.C14015d;
import p138f6.C14132d;
import p208i2.InterfaceC17886g0;
import p209i3.InterfaceC18044z;
import p270k2.InterfaceC22129c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;

/* JADX INFO: renamed from: f41.f */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C14068f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f50458w;

    public /* synthetic */ C14068f(int i13) {
        this.f50458w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f50458w) {
            case 0:
                return AbstractC14078p.m40063N((InterfaceC17886g0) obj);
            case 1:
                return AbstractC14078p.m40064O((InterfaceC22129c) obj);
            case 2:
                return AbstractC14093d.m40137i(obj);
            case 3:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC22676k.m65750j(entry, "entry");
                Object value = entry.getValue();
                return AbstractC2875y.m8304q(new StringBuilder("  "), ((C14132d) entry.getKey()).f50837a, " = ", value instanceof byte[] ? AbstractC25260n.m74027C0((byte[]) value, ", ", null, 56) : String.valueOf(entry.getValue()));
            case 4:
                return C14147i.m40270N((InterfaceC18044z) obj);
            case 5:
                return AbstractC14223d.m40677g((InterfaceC18044z) obj);
            case 6:
                return AbstractC14368b.m41020h((InterfaceC14369c) obj);
            case 7:
                return AbstractC14415e.m41078S((AbstractC3165a) obj);
            case 8:
                return AbstractC14415e.m41110y((InterfaceC22381a.c) obj);
            case 9:
                return AbstractC14415e.m41111z((AbstractC3165a) obj);
            case 10:
                return AbstractC14415e.m41079T((InterfaceC22381a.c) obj);
            case 11:
                return AbstractC14415e.m41080U((AbstractC4487b) obj);
            case 12:
                return AbstractC14415e.m41066G((AbstractC3165a) obj);
            case 13:
                return AbstractC14415e.m41067H((InterfaceC22381a.c) obj);
            case 14:
                return AbstractC14415e.m41068I((AbstractC4487b) obj);
            case 15:
                return AbstractC14427a.m41141c((ArchMiniExerciseProgress) obj);
            case 16:
                return AbstractC14429c.m41156e((C21536b) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC14429c.m41157f((C23749z0) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC14466h.m41253k((String) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC14468j.m41271h((String) obj);
            case 20:
                return AbstractC14472n.m41306k((C14015d) obj);
            case 21:
                return AbstractC14534e.m41495g(obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC14687d.m42047I((C21536b) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC14687d.m42057S((GaugeValueModel) obj);
            case 24:
                return AbstractC14687d.m42058T((NumberValueModel) obj);
            case 25:
                return AbstractC14687d.m42059U((TimeCapsuleModel) obj);
            case 26:
                return AbstractC14687d.m42060V((WhoopAgeAmoeba) obj);
            case 27:
                return AbstractC14687d.m42085x((C21536b) obj);
            case 28:
                return AbstractC14687d.m42048J((C23749z0) obj);
            default:
                return AbstractC14687d.m42049K((AnimatableTextModel) obj);
        }
    }
}
