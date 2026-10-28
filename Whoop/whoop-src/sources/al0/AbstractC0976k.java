package al0;

import com.whoop.bot.models.conversation.ActivityRecommendationModel;
import com.whoop.bot.models.conversation.AdditionalContextModel;
import com.whoop.bot.models.conversation.BedtimeRecommendationTileModel;
import com.whoop.bot.models.conversation.ChatMiniArchWidgetModel;
import com.whoop.bot.models.conversation.CommittedWorkoutRecommendationModel;
import com.whoop.bot.models.conversation.FormWidgetModel;
import com.whoop.bot.models.conversation.HpmlBrowserWidgetModel;
import com.whoop.bot.models.conversation.MxmCreateCaseTileModel;
import com.whoop.bot.models.conversation.RecommendationCarouselModel;
import com.whoop.bot.models.conversation.StrengthTrainerWidgetModel;
import com.whoop.bot.models.conversation.SummaryConfirmationWidgetModel;
import com.whoop.p057ai.chat.models.ChatAttachmentCarouselModel;
import com.whoop.p057ai.chat.models.ContextDetailsHeaderModel;
import com.whoop.p057ai.chat.models.ContextStatusToggleModel;
import com.whoop.p057ai.chat.models.HealthSnapshotTileModel;
import com.whoop.p057ai.chat.models.MarkdownTextWidget;
import j93.InterfaceC21461d;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.C22673i0;

/* JADX INFO: renamed from: al0.k */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\"*\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, m65681d2 = {"", "", "Lj93/d;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "botFeatureModels", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC0976k {

    /* JADX INFO: renamed from: a */
    private static final Map<String, InterfaceC21461d> f3594a;

    static {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f3594a = AbstractC25247g0.m73990Y(new C23465k("ACTIVITY_RECOMMENDATION", c22673i0.getOrCreateKotlinClass(ActivityRecommendationModel.class)), new C23465k("AI_WEIGHTLIFTING_SUGGESTION", c22673i0.getOrCreateKotlinClass(StrengthTrainerWidgetModel.class)), new C23465k("BEDTIME_RECOMMENDATION_TILE", c22673i0.getOrCreateKotlinClass(BedtimeRecommendationTileModel.class)), new C23465k("CHAT_ATTACHMENT_CAROUSEL", c22673i0.getOrCreateKotlinClass(ChatAttachmentCarouselModel.class)), new C23465k("COMMITTED_WORKOUT_RECOMMENDATION", c22673i0.getOrCreateKotlinClass(CommittedWorkoutRecommendationModel.class)), new C23465k("CONTEXT_DETAIL_HEADER", c22673i0.getOrCreateKotlinClass(ContextDetailsHeaderModel.class)), new C23465k("CONTEXT_STATUS_TOGGLE", c22673i0.getOrCreateKotlinClass(ContextStatusToggleModel.class)), new C23465k("CONTEXT_TILE", c22673i0.getOrCreateKotlinClass(AdditionalContextModel.class)), new C23465k("HEALTH_SNAPSHOT_TILE", c22673i0.getOrCreateKotlinClass(HealthSnapshotTileModel.class)), new C23465k("HPML_BROWSER_WIDGET", c22673i0.getOrCreateKotlinClass(HpmlBrowserWidgetModel.class)), new C23465k("MARKDOWN_CHAT_TEXT", c22673i0.getOrCreateKotlinClass(MarkdownTextWidget.class)), new C23465k("MINI_ARCH_WIDGET", c22673i0.getOrCreateKotlinClass(ChatMiniArchWidgetModel.class)), new C23465k("MXM_CREATE_CASE_TILE", c22673i0.getOrCreateKotlinClass(MxmCreateCaseTileModel.class)), new C23465k("QNA_FORM_WIDGET", c22673i0.getOrCreateKotlinClass(FormWidgetModel.class)), new C23465k("RECOMMENDATION_CAROUSEL", c22673i0.getOrCreateKotlinClass(RecommendationCarouselModel.class)), new C23465k("SUMMARY_CONFIRMATION_WIDGET", c22673i0.getOrCreateKotlinClass(SummaryConfirmationWidgetModel.class)));
    }

    /* JADX INFO: renamed from: a */
    public static final Map<String, InterfaceC21461d> m2667a() {
        return f3594a;
    }
}
