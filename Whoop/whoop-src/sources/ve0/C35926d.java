package ve0;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.items.HorizontalDividedListItem;
import com.whoop.design.models.items.HorizontalDividedListModel;
import com.whoop.educationModels.EducationDtoToModelMapperKt;
import com.whoop.streaks.domain.models.HorizontalTrackerModel;
import com.whoop.streaks.domain.models.MilestoneHeader;
import java.util.Map;
import jb1.C21536b;
import l83.C23454a0;
import p208i2.InterfaceC17886g0;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;
import p741vn1.AbstractC36212p;
import re2.AbstractC31327a;
import ro1.AbstractC31629a;
import so1.AbstractC32803a0;
import so1.AbstractC32838v;
import to1.AbstractC34008a;
import ve2.AbstractC35929b;
import vi2.AbstractC36062a;
import vi2.C36063b;
import vl0.AbstractC36101d;
import vm2.C36159d;
import vo1.AbstractC36229d;
import vo1.AbstractC36232g;
import vo1.AbstractC36243r;
import vo1.AbstractC36245t;
import yn1.AbstractC39672a;

/* JADX INFO: renamed from: ve0.d */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C35926d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f152996w;

    public /* synthetic */ C35926d(int i13) {
        this.f152996w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f152996w) {
            case 0:
                return AbstractC35927e.m114124W(obj);
            case 1:
                return EducationDtoToModelMapperKt.toEducationSections$lambda$0$0$0((C21536b) obj);
            case 2:
                return AbstractC35929b.m114171h((AbstractC31327a.a) obj);
            case 3:
                return C23454a0.f92919a;
            case 4:
                return AbstractC36062a.m114513f((C21536b) obj);
            case 5:
                return AbstractC36062a.m114514g((C23749z0) obj);
            case 6:
                return AbstractC36062a.m114515h((HorizontalTrackerModel) obj);
            case 7:
                return AbstractC36062a.m114516i((MilestoneHeader) obj);
            case 8:
                return C36063b.m114526h((HorizontalDividedListModel) obj);
            case 9:
                return C36063b.m114527i((HorizontalDividedListItem) obj);
            case 10:
                return AbstractC36101d.m114704B(obj);
            case 11:
                return AbstractC36101d.m114732u(obj);
            case 12:
                return C36159d.m115072p((Map.Entry) obj);
            case 13:
                return AbstractC36212p.m115233B((InterfaceC17886g0) obj);
            case 14:
                return AbstractC36229d.m115422v((AbstractC34008a) obj);
            case 15:
                return AbstractC36229d.m115384D((AbstractC34008a) obj);
            case 16:
                return AbstractC36232g.m115466u((AbstractC32838v) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC36232g.m115467v((AbstractC31629a) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC36232g.m115468w((AbstractC39672a) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC36232g.m115428B((AbstractC32838v) obj);
            case 20:
                return AbstractC36232g.m115429C((AbstractC31629a) obj);
            case 21:
                return AbstractC36232g.m115438L((AbstractC39672a) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC36243r.m115542m0(obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC36243r.m115558u0((AbstractC39672a) obj);
            case 24:
                return AbstractC36243r.m115524d0((AbstractC32803a0) obj);
            case 25:
                return AbstractC36243r.m115526e0(obj);
            case 26:
                return AbstractC36243r.m115516Z(obj);
            case 27:
                return AbstractC36243r.m115528f0((AbstractC39672a) obj);
            case 28:
                return AbstractC36243r.m115540l0((AbstractC32803a0) obj);
            default:
                return AbstractC36245t.m115586n((AbstractC32803a0) obj);
        }
    }
}
