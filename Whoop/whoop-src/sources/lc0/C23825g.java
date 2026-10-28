package lc0;

import a01.EnumC0093m;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.advancedlabs.presentation.models.AppointmentSummaryBottomSheet;
import com.whoop.startactivity.goals.targetcard.AbstractC10241a;
import com.whoop.startactivity.goals.targetcard.TargetCardModel;
import com.whoop.stories.OnboardingStoriesDebugFragment;
import ie0.AbstractC18441a;
import jb1.C21536b;
import jc0.InterfaceC21601a;
import ld0.EnumC23849h;
import le0.AbstractC23873b;
import lf0.AbstractC23899b0;
import lf0.AbstractC23901b2;
import lf0.AbstractC23906d;
import lf0.AbstractC23917f2;
import lf0.AbstractC23918g;
import lf0.AbstractC23925h2;
import lf0.AbstractC23939l0;
import lf0.AbstractC23951o0;
import lf0.AbstractC23952o1;
import lf0.AbstractC23954p;
import lf0.AbstractC23959q0;
import lf0.AbstractC23971t0;
import lg0.C24034g;
import live.hms.video.media.capturers.camera.utils.BitMatrix;
import live.hms.video.media.capturers.camera.utils.OrientationTools;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;
import p720m91.C25308q;

/* JADX INFO: renamed from: lc0.g */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C23825g implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f94231w;

    public /* synthetic */ C23825g(int i13) {
        this.f94231w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f94231w) {
            case 0:
                return AbstractC23826h.m69975m((InterfaceC21601a) obj);
            case 1:
                return AbstractC23828j.m69984E(obj);
            case 2:
                return AbstractC23828j.m70006p((InterfaceC21601a) obj);
            case 3:
                return AbstractC23873b.m70144t((AbstractC18441a) obj);
            case 4:
                return AbstractC23873b.m70137m(obj);
            case 5:
                return AbstractC23906d.m70277d(obj);
            case 6:
                return AbstractC23918g.m70352f(obj);
            case 7:
                return AbstractC23954p.m70584i((AppointmentSummaryBottomSheet) obj);
            case 8:
                return AbstractC23899b0.m70227o(obj);
            case 9:
                return AbstractC23899b0.m70234v(obj);
            case 10:
                return AbstractC23899b0.m70238z(obj);
            case 11:
                return AbstractC23939l0.m70484f(obj);
            case 12:
                return AbstractC23951o0.m70552g(obj);
            case 13:
                return AbstractC23971t0.m70698i((AbstractC23959q0) obj);
            case 14:
                return AbstractC23952o1.m70563g(obj);
            case 15:
                return AbstractC23901b2.m70252k((EnumC0093m) obj);
            case 16:
                return AbstractC23901b2.m70253l((EnumC23849h) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC23917f2.m70338r(obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC23925h2.m70393e(obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C24034g.m70894c((C21536b) obj);
            case 20:
                return AbstractC10241a.m26050i((C21536b) obj);
            case 21:
                return AbstractC10241a.m26053l((C25308q) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC10241a.m26051j((C23749z0) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC10241a.m26052k((TargetCardModel) obj);
            case 24:
                return OnboardingStoriesDebugFragment.m26123L((C25308q) obj);
            case 25:
                return OrientationTools.correctOrientation$lambda$0((BitMatrix) obj);
            case 26:
                return OrientationTools.correctOrientation$lambda$1((BitMatrix) obj);
            case 27:
                return OrientationTools.correctOrientation$lambda$2((BitMatrix) obj);
            case 28:
                return OrientationTools.correctOrientation$lambda$3((BitMatrix) obj);
            default:
                return OrientationTools.correctOrientation$lambda$4((BitMatrix) obj);
        }
    }
}
