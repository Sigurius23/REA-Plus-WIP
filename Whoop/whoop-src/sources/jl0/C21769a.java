package jl0;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.bot.models.conversation.AiChatMessage;
import com.whoop.bot.models.conversation.AiChatMessageRequestBody;
import com.whoop.bot.models.conversation.BedtimeRecommendationTileModel;
import com.whoop.bot.models.conversation.FormQuestionModel;
import com.whoop.bot.models.conversation.FormWidgetModel;
import com.whoop.bot.models.conversation.RecommendationCarouselModel;
import com.whoop.bot.models.conversation.StartConversationV2RequestBody;
import com.whoop.bot.models.conversation.StrengthTrainerWidgetModel;
import com.whoop.bot.models.conversation.SuggestionsResponse;
import com.whoop.bot.models.conversation.WorkoutListModel;
import com.whoop.clinicianintheloop.domain.models.AppointmentButtonModel;
import com.whoop.clinicianintheloop.domain.models.AppointmentConfirmationCardModel;
import com.whoop.clinicianintheloop.domain.models.ExpandableClinicianNoteModel;
import com.whoop.clinicianintheloop.domain.models.SchedulingOverviewCardModel;
import com.whoop.clinicianintheloop.domain.models.TappableIconModel;
import com.whoop.clinicianintheloop.domain.models.VisitDetailItemModel;
import com.whoop.hormonalinsights.logsymptoms.domain.models.LogSymptomsResponse;
import com.whoop.hormonalinsights.logsymptoms.domain.models.LogSymptomsSaveRequest;
import jp1.AbstractC21863o;
import p713jm0.AbstractC21789d;

/* JADX INFO: renamed from: jl0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C21769a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f83750w;

    public /* synthetic */ C21769a(int i13) {
        this.f83750w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f83750w) {
            case 0:
                return AiChatMessage._childSerializers$_anonymous_$0();
            case 1:
                return AiChatMessage._childSerializers$_anonymous_$1();
            case 2:
                return AiChatMessageRequestBody._childSerializers$_anonymous_();
            case 3:
                return BedtimeRecommendationTileModel._childSerializers$_anonymous_();
            case 4:
                return FormQuestionModel._childSerializers$_anonymous_();
            case 5:
                return FormQuestionModel._childSerializers$_anonymous_$0();
            case 6:
                return FormQuestionModel._childSerializers$_anonymous_$1();
            case 7:
                return FormWidgetModel._childSerializers$_anonymous_();
            case 8:
                return FormWidgetModel._childSerializers$_anonymous_$0();
            case 9:
                return RecommendationCarouselModel._childSerializers$_anonymous_();
            case 10:
                return StartConversationV2RequestBody._childSerializers$_anonymous_();
            case 11:
                return StartConversationV2RequestBody._childSerializers$_anonymous_$0();
            case 12:
                return StrengthTrainerWidgetModel._childSerializers$_anonymous_();
            case 13:
                return SuggestionsResponse._childSerializers$_anonymous_();
            case 14:
                return WorkoutListModel._childSerializers$_anonymous_();
            case 15:
                return AbstractC21789d.m61633l();
            case 16:
                return AppointmentButtonModel._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AppointmentButtonModel._childSerializers$_anonymous_$0();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AppointmentButtonModel._childSerializers$_anonymous_$1();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AppointmentConfirmationCardModel._childSerializers$_anonymous_();
            case 20:
                return ExpandableClinicianNoteModel._childSerializers$_anonymous_();
            case 21:
                return ExpandableClinicianNoteModel._childSerializers$_anonymous_$0();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return SchedulingOverviewCardModel._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return TappableIconModel._childSerializers$_anonymous_();
            case 24:
                return VisitDetailItemModel._childSerializers$_anonymous_();
            case 25:
                return VisitDetailItemModel._childSerializers$_anonymous_$0();
            case 26:
                return LogSymptomsResponse._childSerializers$_anonymous_();
            case 27:
                return LogSymptomsResponse._childSerializers$_anonymous_$0();
            case 28:
                return LogSymptomsSaveRequest._childSerializers$_anonymous_();
            default:
                return AbstractC21863o.m61939l();
        }
    }
}
