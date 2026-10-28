package vs2;

import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.data.remote.domain.dto.BehaviourTrackerHistoryResponseDto;
import com.whoop.data.remote.domain.dto.JournalBehaviorTrackerDto;
import com.whoop.data.remote.domain.dto.JournalBehaviourTrackerHistoryDto;
import com.whoop.data.remote.domain.dto.JournalEntryDto;
import com.whoop.data.remote.domain.dto.JournalMagnitudeDto;
import com.whoop.data.remote.domain.dto.JournalMagnitudeValueDto;
import com.whoop.data.remote.domain.dto.JournalsBehaviorsListResponseDto;
import com.whoop.data.remote.domain.dto.TrackedBehaviorDto;
import com.whoop.data.remote.domain.dto.UserSelectedJournalBehaviorResponseDto;
import com.whoop.membership.familyPlan.domain.model.items.ComparisonTableModel;
import com.whoop.membership.familyPlan.domain.model.items.DividedCardButtons;
import com.whoop.membership.familyPlan.domain.model.items.SendEmailInviteModel;
import com.whoop.whoopaction.domain.models.Action;
import ft0.InterfaceC14766b;
import jb1.C21536b;
import mj0.C25616e;
import p040c0.InterfaceC3770q;
import p270k2.InterfaceC22131e;
import p412q3.C29891y;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;
import p742vw1.C36543b;
import p743vy1.InterfaceC36601c;
import ts2.AbstractC34145a;
import vt2.AbstractC36497f;
import vv2.AbstractC36539e;
import vx0.AbstractC36555c;
import vy0.AbstractC36568c0;
import vy0.AbstractC36588p;
import vy0.AbstractC36596x;
import vy0.AbstractC36597y;
import vz0.AbstractC36612a;
import w01.AbstractC36682g;

/* JADX INFO: renamed from: vs2.d */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C36478d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f155807w;

    public /* synthetic */ C36478d(int i13) {
        this.f155807w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f155807w) {
            case 0:
                return AbstractC36479e.m116843E((AbstractC34145a) obj);
            case 1:
                return AbstractC36497f.m116989w(((Boolean) obj).booleanValue());
            case 2:
                return Integer.valueOf(AbstractC36497f.m116985s(((Integer) obj).intValue()));
            case 3:
                return AbstractC36539e.m117095E((Modifier) obj);
            case 4:
                return AbstractC36539e.m117109S((InterfaceC22131e) obj);
            case 5:
                return BehaviourTrackerHistoryResponseDto.toBehaviourTrackerHistoryResponse$lambda$0((JournalBehaviourTrackerHistoryDto) obj);
            case 6:
                return JournalEntryDto.toJournalEntry$lambda$0((TrackedBehaviorDto) obj);
            case 7:
                return JournalMagnitudeDto.toJournalMagnitude$lambda$0((JournalMagnitudeValueDto) obj);
            case 8:
                return JournalsBehaviorsListResponseDto.toJournalsBehaviorsListResponse$lambda$0((JournalBehaviorTrackerDto) obj);
            case 9:
                return UserSelectedJournalBehaviorResponseDto.toUserSelectedJournalBehaviorResponse$lambda$0((JournalBehaviorTrackerDto) obj);
            case 10:
                return p742vw1.Function1.m117149i((C21536b) obj);
            case 11:
                return p742vw1.Function1.m117151k((C23749z0) obj);
            case 12:
                return p742vw1.Function1.m117152l((DividedCardButtons) obj);
            case 13:
                return p742vw1.Function1.m117153m((SendEmailInviteModel) obj);
            case 14:
                return p742vw1.Function1.m117154n((ComparisonTableModel) obj);
            case 15:
                return C36543b.m117163f((C21536b) obj);
            case 16:
                return AbstractC36555c.m117211C((InterfaceC14766b) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC36555c.m117215G((C25616e) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC36588p.m117423X((C29891y) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC36588p.m117469n0((InterfaceC22131e) obj);
            case 20:
                return AbstractC36588p.m117388F0((C29891y) obj);
            case 21:
                return AbstractC36588p.m117398K0((InterfaceC3770q) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC36596x.m117530t(((Boolean) obj).booleanValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC36568c0.m117309n((AbstractC36597y) obj);
            case 24:
                return AbstractC36568c0.m117294B((AbstractC36597y) obj);
            case 25:
                return p743vy1.Function1.m117568y((String) obj);
            case 26:
                return p743vy1.Function1.m117559p((InterfaceC36601c) obj);
            case 27:
                return AbstractC36612a.m117609f((String) obj);
            case 28:
                return AbstractC36682g.m117714B(obj);
            default:
                return AbstractC36682g.m117753y((Action) obj);
        }
    }
}
