package p716lb1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.anchorSelector.AnchorSelectorModel;
import com.whoop.design.models.calendar.BehaviorsCalendarModel;
import com.whoop.design.models.cards.AdvancedLabsSubscriptionCardModel;
import com.whoop.design.models.cards.ButtonCardModel;
import com.whoop.design.models.items.AchievementProgressCardModel;
import com.whoop.design.models.items.ActivityTileSelectionItemModel;
import com.whoop.design.models.items.AiChatTalkTextEmptyStateModel;
import com.whoop.design.models.items.AiChatTalkTextModel;
import com.whoop.design.models.items.AiWeeklyPlanSuggestionModel;
import com.whoop.design.models.items.AppointmentCardModel;
import com.whoop.design.models.items.BinaryFeedbackModel;
import com.whoop.design.models.items.BiomarkerCardModel;
import com.whoop.design.models.items.BiomarkerModel;
import com.whoop.design.models.items.BiomarkerPieChartSectionModel;
import com.whoop.design.models.items.aiactiontile.AiActionTileModel;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lb1.a */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C23587a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f93561w;

    public /* synthetic */ C23587a(int i13) {
        this.f93561w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f93561w) {
            case 0:
                return AbstractC23594b.m68504c((C23749z0) obj);
            case 1:
                return AbstractC23594b.m68505d((AchievementProgressCardModel) obj);
            case 2:
                return AbstractC23601c.m68558c((C23749z0) obj);
            case 3:
                return AbstractC23601c.m68559d((ActivityTileSelectionItemModel) obj);
            case 4:
                return AbstractC23615e.m68681c((C23749z0) obj);
            case 5:
                return AbstractC23615e.m68682d((AdvancedLabsSubscriptionCardModel) obj);
            case 6:
                return AbstractC23622f.m68732c((C23749z0) obj);
            case 7:
                return AbstractC23622f.m68733d((AiActionTileModel) obj);
            case 8:
                return AbstractC23629g.m68765c((C23749z0) obj);
            case 9:
                return AbstractC23629g.m68766d((AiChatTalkTextEmptyStateModel) obj);
            case 10:
                return AbstractC23636h.m68817c((C23749z0) obj);
            case 11:
                return AbstractC23636h.m68818d((AiChatTalkTextModel) obj);
            case 12:
                return AbstractC23643i.m68858c((C23749z0) obj);
            case 13:
                return AbstractC23643i.m68859d((AiWeeklyPlanSuggestionModel) obj);
            case 14:
                return AbstractC23650j.m68898d((C23749z0) obj);
            case 15:
                return AbstractC23650j.m68899e((AnchorSelectorModel) obj);
            case 16:
                return AbstractC23664l.m69002c((C23749z0) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC23664l.m69003d((AppointmentCardModel) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC23694q.m69252d((C23749z0) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC23694q.m69253e((BehaviorsCalendarModel) obj);
            case 20:
                return AbstractC23700r.m69330c((C23749z0) obj);
            case 21:
                return AbstractC23700r.m69331d((BinaryFeedbackModel) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC23706s.m69368c((C23749z0) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC23706s.m69369d((BiomarkerCardModel) obj);
            case 24:
                return AbstractC23712t.m69418c((C23749z0) obj);
            case 25:
                return AbstractC23712t.m69419d((BiomarkerModel) obj);
            case 26:
                return AbstractC23718u.m69444d((C23749z0) obj);
            case 27:
                return AbstractC23718u.m69445e((BiomarkerPieChartSectionModel) obj);
            case 28:
                return AbstractC23730w.m69598d((C23749z0) obj);
            default:
                return AbstractC23730w.m69599e((ButtonCardModel) obj);
        }
    }
}
