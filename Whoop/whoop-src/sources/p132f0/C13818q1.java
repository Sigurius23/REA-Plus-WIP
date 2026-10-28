package p132f0;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.items.ItemsCardModel;
import com.whoop.home.domain.models.ChallengeHomeTileModel;
import com.whoop.home.domain.models.CoachActivityTileModel;
import com.whoop.home.domain.models.CustomAnimationContainerModel;
import com.whoop.home.domain.models.DayOneTransitionWrapperModel;
import com.whoop.home.domain.models.DayOneTransitionWrapperModelV2;
import com.whoop.home.domain.models.DayZeroCardsModel;
import com.whoop.home.domain.models.JournalHomeTileWrapperModel;
import com.whoop.home.domain.models.MciHomeTileModel;
import com.whoop.home.domain.models.NotificationsWrapperModel;
import com.whoop.home.domain.models.NotificationsWrapperModelV2;
import com.whoop.home.domain.models.NotificationsWrapperModelV3;
import com.whoop.home.domain.models.ProgressPlotTileModel;
import com.whoop.home.domain.models.dailyoutlook.CoachEntryPointModel;
import f61.C14147i;
import gb1.AbstractC15676d;
import gk0.C15924a;
import gk0.C15925b;
import gm1.AbstractC15993c;
import jb1.C21536b;
import l83.C23454a0;
import p077d0.C11385o0;
import p163g1.AbstractC15011f9;
import p163g1.AbstractC15170v4;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p390p1.C28596b0;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;

/* JADX INFO: renamed from: f0.q1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13818q1 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49302w;

    public /* synthetic */ C13818q1(int i13) {
        this.f49302w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f49302w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                return new C13821r1(((Integer) obj).intValue());
            case 1:
                return C14147i.m40267K((InterfaceC18044z) obj);
            case 2:
                return C14147i.m40309x((InterfaceC18044z) obj);
            case 3:
                return C14147i.m40279Y((InterfaceC18044z) obj);
            case 4:
                AbstractC18041w.m51810i((InterfaceC18044z) obj, 0);
                return c23454a0;
            case 5:
                C11385o0 c11385o0 = (C11385o0) obj;
                c11385o0.f36506a = 1332;
                c11385o0.m30615a(0, Float.valueOf(0.0f)).f36485b = AbstractC15170v4.f56909h;
                c11385o0.m30615a(666, Float.valueOf(290.0f));
                return c23454a0;
            case 6:
                C11385o0 c11385o1 = (C11385o0) obj;
                c11385o1.f36506a = 1332;
                c11385o1.m30615a(666, Float.valueOf(0.0f)).f36485b = AbstractC15170v4.f56909h;
                c11385o1.m30615a(c11385o1.f36506a, Float.valueOf(290.0f));
                return c23454a0;
            case 7:
                AbstractC18041w.m51805d((InterfaceC18044z) obj);
                return c23454a0;
            case 8:
                C28596b0 c28596b0 = AbstractC15011f9.f56166a;
                return c23454a0;
            case 9:
                return AbstractC15676d.m44102e((InterfaceC18044z) obj);
            case 10:
                return C15924a.m44935h(((Byte) obj).byteValue());
            case 11:
                return C15924a.m44934g(((Byte) obj).byteValue());
            case 12:
                return C15925b.m44947h(((Byte) obj).byteValue());
            case 13:
                return C15925b.m44946g(((Byte) obj).byteValue());
            case 14:
                return AbstractC15993c.m45179D((C21536b) obj);
            case 15:
                return AbstractC15993c.m45190O((ChallengeHomeTileModel) obj);
            case 16:
                return AbstractC15993c.m45191P((JournalHomeTileWrapperModel) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC15993c.m45182G((CoachEntryPointModel) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC15993c.m45192Q((CustomAnimationContainerModel) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC15993c.m45193R((DayOneTransitionWrapperModel) obj);
            case 20:
                return AbstractC15993c.m45194S((DayOneTransitionWrapperModelV2) obj);
            case 21:
                return AbstractC15993c.m45195T((DayZeroCardsModel) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC15993c.m45196U((ItemsCardModel) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC15993c.m45197V((MciHomeTileModel) obj);
            case 24:
                return AbstractC15993c.m45198W((NotificationsWrapperModel) obj);
            case 25:
                return AbstractC15993c.m45180E((C23749z0) obj);
            case 26:
                return AbstractC15993c.m45199X((NotificationsWrapperModelV2) obj);
            case 27:
                return AbstractC15993c.m45181F((CoachActivityTileModel) obj);
            case 28:
                return AbstractC15993c.m45183H((NotificationsWrapperModelV3) obj);
            default:
                return AbstractC15993c.m45184I((ProgressPlotTileModel) obj);
        }
    }
}
