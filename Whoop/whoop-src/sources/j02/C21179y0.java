package j02;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.addactivity.network.CreateActivityRequestV1;
import com.whoop.appconfiguration.TabConfiguration;
import com.whoop.appconfiguration.TabsConfiguration;
import com.whoop.bot.models.conversation.ActionButton;
import com.whoop.bot.models.conversation.ActionButtonActionType;
import com.whoop.bot.models.conversation.ActionButtonType;
import com.whoop.bot.models.conversation.ActivityRecommendationModel;
import com.whoop.bot.models.conversation.ActivityRecommendationTargetZones;
import com.whoop.bot.models.conversation.AdditionalContextModel;
import com.whoop.bot.models.conversation.AdditionalContextStyle;
import com.whoop.bot.models.conversation.AiChatConversation;
import com.whoop.bot.models.conversation.AiChatMessage;
import com.whoop.design.models.items.graph.plane.axis.GraphAxisTheme;
import com.whoop.navigation.WeekInReviewScreenModel;
import com.whoop.navigation.WeeklyPlanEditScreenModel;
import com.whoop.navigation.WhatToExpectScreenModel;
import com.whoop.searcharchmini.domain.model.SearchArchMiniResponse;
import com.whoop.startactivity.dropdown.DropdownModel;
import j11.AbstractC21204g;
import j11.AbstractC21211n;
import jk2.AbstractC21762c;

/* JADX INFO: renamed from: j02.y0 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C21179y0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f80717w;

    public /* synthetic */ C21179y0(int i13) {
        this.f80717w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f80717w) {
            case 0:
                return WeekInReviewScreenModel._init_$_anonymous_();
            case 1:
                return WeeklyPlanEditScreenModel._childSerializers$_anonymous_();
            case 2:
                return WhatToExpectScreenModel._init_$_anonymous_();
            case 3:
                return AbstractC21204g.m59457e();
            case 4:
                return AbstractC21211n.m59508z();
            case 5:
                return AbstractC21211n.m59478A();
            case 6:
                return AbstractC21211n.m59501s();
            case 7:
                return AbstractC21211n.m59502t();
            case 8:
                return SearchArchMiniResponse._childSerializers$_anonymous_();
            case 9:
                return CreateActivityRequestV1._childSerializers$_anonymous_();
            case 10:
                return GraphAxisTheme._childSerializers$_anonymous_();
            case 11:
                return GraphAxisTheme._childSerializers$_anonymous_$0();
            case 12:
                return DropdownModel._childSerializers$_anonymous_();
            case 13:
                return DropdownModel._childSerializers$_anonymous_$0();
            case 14:
                return TabConfiguration._childSerializers$_anonymous_();
            case 15:
                return TabsConfiguration._childSerializers$_anonymous_();
            case 16:
                return AbstractC21762c.m61468q();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ActionButton._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ActionButtonActionType._init_$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ActionButtonType._init_$_anonymous_();
            case 20:
                return ActivityRecommendationModel._childSerializers$_anonymous_();
            case 21:
                return ActivityRecommendationModel._childSerializers$_anonymous_$0();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ActivityRecommendationTargetZones._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AdditionalContextModel._childSerializers$_anonymous_();
            case 24:
                return AdditionalContextStyle._init_$_anonymous_();
            case 25:
                return AiChatConversation._childSerializers$_anonymous_();
            case 26:
                return AiChatConversation._childSerializers$_anonymous_$0();
            case 27:
                return AiChatConversation._childSerializers$_anonymous_$1();
            case 28:
                return AiChatConversation._childSerializers$_anonymous_$2();
            default:
                return AiChatMessage._childSerializers$_anonymous_();
        }
    }
}
