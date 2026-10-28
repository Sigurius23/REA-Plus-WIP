package com.whoop.bot.models.conversation;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.FooterModel;
import com.whoop.design.models.items.FooterModel$$serializer;
import com.whoop.p057ai.chat.models.MarkdownTextWidget;
import com.whoop.p057ai.chat.models.MarkdownTextWidget$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 72\u00020\u0001:\u000287BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JJ\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b2\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010#¨\u00069"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "Lcom/whoop/ai/chat/models/MarkdownTextWidget;", "title", "summary", "Lcom/whoop/design/models/items/FooterModel;", "footer", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(Ljava/lang/String;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/analytics/AnalyticEventModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/analytics/AnalyticEventModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/ai/chat/models/MarkdownTextWidget;", "component3", "component4", "()Lcom/whoop/design/models/items/FooterModel;", "component5", "()Lcom/whoop/analytics/AnalyticEventModel;", "copy", "(Ljava/lang/String;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/whoop/ai/chat/models/MarkdownTextWidget;", "getTitle", "getSummary", "Lcom/whoop/design/models/items/FooterModel;", "getFooter", "Lcom/whoop/analytics/AnalyticEventModel;", "getAnalyticEvent", "Companion", "$serializer", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SummaryConfirmationWidgetModel implements DesignSystemModel {
    private final AnalyticEventModel analyticEvent;
    private final FooterModel footer;
    private final String id;
    private final MarkdownTextWidget summary;
    private final MarkdownTextWidget title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SummaryConfirmationWidgetModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SummaryConfirmationWidgetModel() {
        this((String) null, (MarkdownTextWidget) null, (MarkdownTextWidget) null, (FooterModel) null, (AnalyticEventModel) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SummaryConfirmationWidgetModel copy$default(SummaryConfirmationWidgetModel summaryConfirmationWidgetModel, String str, MarkdownTextWidget markdownTextWidget, MarkdownTextWidget markdownTextWidget2, FooterModel footerModel, AnalyticEventModel analyticEventModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = summaryConfirmationWidgetModel.id;
        }
        if ((i13 & 2) != 0) {
            markdownTextWidget = summaryConfirmationWidgetModel.title;
        }
        if ((i13 & 4) != 0) {
            markdownTextWidget2 = summaryConfirmationWidgetModel.summary;
        }
        if ((i13 & 8) != 0) {
            footerModel = summaryConfirmationWidgetModel.footer;
        }
        if ((i13 & 16) != 0) {
            analyticEventModel = summaryConfirmationWidgetModel.analyticEvent;
        }
        AnalyticEventModel analyticEventModel2 = analyticEventModel;
        MarkdownTextWidget markdownTextWidget3 = markdownTextWidget2;
        return summaryConfirmationWidgetModel.copy(str, markdownTextWidget, markdownTextWidget3, footerModel, analyticEventModel2);
    }

    public static final /* synthetic */ void write$Self$bot_release(SummaryConfirmationWidgetModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.id, "")) {
            output.encodeStringElement(serialDesc, 0, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, MarkdownTextWidget$$serializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.summary != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, MarkdownTextWidget$$serializer.INSTANCE, self.summary);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.footer != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, FooterModel$$serializer.INSTANCE, self.footer);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.analyticEvent == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, AnalyticEventModel$$serializer.INSTANCE, self.analyticEvent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MarkdownTextWidget getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MarkdownTextWidget getSummary() {
        return this.summary;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FooterModel getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final SummaryConfirmationWidgetModel copy(String id4, MarkdownTextWidget title, MarkdownTextWidget summary, FooterModel footer, AnalyticEventModel analyticEvent) {
        AbstractC22676k.m65750j(id4, "id");
        return new SummaryConfirmationWidgetModel(id4, title, summary, footer, analyticEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SummaryConfirmationWidgetModel)) {
            return false;
        }
        SummaryConfirmationWidgetModel summaryConfirmationWidgetModel = (SummaryConfirmationWidgetModel) other;
        return AbstractC22676k.m65745e(this.id, summaryConfirmationWidgetModel.id) && AbstractC22676k.m65745e(this.title, summaryConfirmationWidgetModel.title) && AbstractC22676k.m65745e(this.summary, summaryConfirmationWidgetModel.summary) && AbstractC22676k.m65745e(this.footer, summaryConfirmationWidgetModel.footer) && AbstractC22676k.m65745e(this.analyticEvent, summaryConfirmationWidgetModel.analyticEvent);
    }

    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final FooterModel getFooter() {
        return this.footer;
    }

    public final String getId() {
        return this.id;
    }

    public final MarkdownTextWidget getSummary() {
        return this.summary;
    }

    public final MarkdownTextWidget getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        MarkdownTextWidget markdownTextWidget = this.title;
        int iHashCode2 = (iHashCode + (markdownTextWidget == null ? 0 : markdownTextWidget.hashCode())) * 31;
        MarkdownTextWidget markdownTextWidget2 = this.summary;
        int iHashCode3 = (iHashCode2 + (markdownTextWidget2 == null ? 0 : markdownTextWidget2.hashCode())) * 31;
        FooterModel footerModel = this.footer;
        int iHashCode4 = (iHashCode3 + (footerModel == null ? 0 : footerModel.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        return iHashCode4 + (analyticEventModel != null ? analyticEventModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        MarkdownTextWidget markdownTextWidget = this.title;
        MarkdownTextWidget markdownTextWidget2 = this.summary;
        FooterModel footerModel = this.footer;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        StringBuilder sb4 = new StringBuilder("SummaryConfirmationWidgetModel(id=");
        sb4.append(str);
        sb4.append(", title=");
        sb4.append(markdownTextWidget);
        sb4.append(", summary=");
        sb4.append(markdownTextWidget2);
        sb4.append(", footer=");
        sb4.append(footerModel);
        sb4.append(", analyticEvent=");
        return AbstractC38963t7.m124378h(sb4, analyticEventModel, ")");
    }

    public /* synthetic */ SummaryConfirmationWidgetModel(int i13, String str, MarkdownTextWidget markdownTextWidget, MarkdownTextWidget markdownTextWidget2, FooterModel footerModel, AnalyticEventModel analyticEventModel, SerializationConstructorMarker serializationConstructorMarker) {
        this.id = (i13 & 1) == 0 ? "" : str;
        if ((i13 & 2) == 0) {
            this.title = null;
        } else {
            this.title = markdownTextWidget;
        }
        if ((i13 & 4) == 0) {
            this.summary = null;
        } else {
            this.summary = markdownTextWidget2;
        }
        if ((i13 & 8) == 0) {
            this.footer = null;
        } else {
            this.footer = footerModel;
        }
        if ((i13 & 16) == 0) {
            this.analyticEvent = null;
        } else {
            this.analyticEvent = analyticEventModel;
        }
    }

    public SummaryConfirmationWidgetModel(String id4, MarkdownTextWidget markdownTextWidget, MarkdownTextWidget markdownTextWidget2, FooterModel footerModel, AnalyticEventModel analyticEventModel) {
        AbstractC22676k.m65750j(id4, "id");
        this.id = id4;
        this.title = markdownTextWidget;
        this.summary = markdownTextWidget2;
        this.footer = footerModel;
        this.analyticEvent = analyticEventModel;
    }

    public /* synthetic */ SummaryConfirmationWidgetModel(String str, MarkdownTextWidget markdownTextWidget, MarkdownTextWidget markdownTextWidget2, FooterModel footerModel, AnalyticEventModel analyticEventModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? null : markdownTextWidget, (i13 & 4) != 0 ? null : markdownTextWidget2, (i13 & 8) != 0 ? null : footerModel, (i13 & 16) != 0 ? null : analyticEventModel);
    }
}
