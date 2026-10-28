package com.whoop.home.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.AiChatEntryModel;
import com.whoop.design.models.items.OverviewGaugeModel;
import com.whoop.design.models.items.OverviewGaugeModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001d¨\u00062"}, m65681d2 = {"Lcom/whoop/home/domain/models/DayOneTransitionWrapperModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/items/OverviewGaugeModel;", "overviewGauge", "Lcom/whoop/home/domain/models/NotificationsWrapperModel;", "notificationsWrapper", "Lcom/whoop/home/domain/models/WelcomeCardModel;", "welcomeHomeCard", "<init>", "(Lcom/whoop/design/models/items/OverviewGaugeModel;Lcom/whoop/home/domain/models/NotificationsWrapperModel;Lcom/whoop/home/domain/models/WelcomeCardModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/OverviewGaugeModel;Lcom/whoop/home/domain/models/NotificationsWrapperModel;Lcom/whoop/home/domain/models/WelcomeCardModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/DayOneTransitionWrapperModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/OverviewGaugeModel;", "component2", "()Lcom/whoop/home/domain/models/NotificationsWrapperModel;", "component3", "()Lcom/whoop/home/domain/models/WelcomeCardModel;", "copy", "(Lcom/whoop/design/models/items/OverviewGaugeModel;Lcom/whoop/home/domain/models/NotificationsWrapperModel;Lcom/whoop/home/domain/models/WelcomeCardModel;)Lcom/whoop/home/domain/models/DayOneTransitionWrapperModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/OverviewGaugeModel;", "getOverviewGauge", "Lcom/whoop/home/domain/models/NotificationsWrapperModel;", "getNotificationsWrapper", "Lcom/whoop/home/domain/models/WelcomeCardModel;", "getWelcomeHomeCard", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DayOneTransitionWrapperModel implements DesignSystemModel {
    private final NotificationsWrapperModel notificationsWrapper;
    private final OverviewGaugeModel overviewGauge;
    private final WelcomeCardModel welcomeHomeCard;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = AiChatEntryModel.$stable | OverviewGaugeModel.$stable;

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/DayOneTransitionWrapperModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/DayOneTransitionWrapperModel;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DayOneTransitionWrapperModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DayOneTransitionWrapperModel(int i13, OverviewGaugeModel overviewGaugeModel, NotificationsWrapperModel notificationsWrapperModel, WelcomeCardModel welcomeCardModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, DayOneTransitionWrapperModel$$serializer.INSTANCE.getDescriptor());
        }
        this.overviewGauge = overviewGaugeModel;
        this.notificationsWrapper = notificationsWrapperModel;
        this.welcomeHomeCard = welcomeCardModel;
    }

    public static /* synthetic */ DayOneTransitionWrapperModel copy$default(DayOneTransitionWrapperModel dayOneTransitionWrapperModel, OverviewGaugeModel overviewGaugeModel, NotificationsWrapperModel notificationsWrapperModel, WelcomeCardModel welcomeCardModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            overviewGaugeModel = dayOneTransitionWrapperModel.overviewGauge;
        }
        if ((i13 & 2) != 0) {
            notificationsWrapperModel = dayOneTransitionWrapperModel.notificationsWrapper;
        }
        if ((i13 & 4) != 0) {
            welcomeCardModel = dayOneTransitionWrapperModel.welcomeHomeCard;
        }
        return dayOneTransitionWrapperModel.copy(overviewGaugeModel, notificationsWrapperModel, welcomeCardModel);
    }

    public static final /* synthetic */ void write$Self$home_release(DayOneTransitionWrapperModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, OverviewGaugeModel$$serializer.INSTANCE, self.overviewGauge);
        output.encodeSerializableElement(serialDesc, 1, NotificationsWrapperModel$$serializer.INSTANCE, self.notificationsWrapper);
        output.encodeSerializableElement(serialDesc, 2, WelcomeCardModel$$serializer.INSTANCE, self.welcomeHomeCard);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OverviewGaugeModel getOverviewGauge() {
        return this.overviewGauge;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NotificationsWrapperModel getNotificationsWrapper() {
        return this.notificationsWrapper;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final WelcomeCardModel getWelcomeHomeCard() {
        return this.welcomeHomeCard;
    }

    public final DayOneTransitionWrapperModel copy(OverviewGaugeModel overviewGauge, NotificationsWrapperModel notificationsWrapper, WelcomeCardModel welcomeHomeCard) {
        AbstractC22676k.m65750j(overviewGauge, "overviewGauge");
        AbstractC22676k.m65750j(notificationsWrapper, "notificationsWrapper");
        AbstractC22676k.m65750j(welcomeHomeCard, "welcomeHomeCard");
        return new DayOneTransitionWrapperModel(overviewGauge, notificationsWrapper, welcomeHomeCard);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DayOneTransitionWrapperModel)) {
            return false;
        }
        DayOneTransitionWrapperModel dayOneTransitionWrapperModel = (DayOneTransitionWrapperModel) other;
        return AbstractC22676k.m65745e(this.overviewGauge, dayOneTransitionWrapperModel.overviewGauge) && AbstractC22676k.m65745e(this.notificationsWrapper, dayOneTransitionWrapperModel.notificationsWrapper) && AbstractC22676k.m65745e(this.welcomeHomeCard, dayOneTransitionWrapperModel.welcomeHomeCard);
    }

    public final NotificationsWrapperModel getNotificationsWrapper() {
        return this.notificationsWrapper;
    }

    public final OverviewGaugeModel getOverviewGauge() {
        return this.overviewGauge;
    }

    public final WelcomeCardModel getWelcomeHomeCard() {
        return this.welcomeHomeCard;
    }

    public int hashCode() {
        return this.welcomeHomeCard.hashCode() + ((this.notificationsWrapper.hashCode() + (this.overviewGauge.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "DayOneTransitionWrapperModel(overviewGauge=" + this.overviewGauge + ", notificationsWrapper=" + this.notificationsWrapper + ", welcomeHomeCard=" + this.welcomeHomeCard + ")";
    }

    public DayOneTransitionWrapperModel(OverviewGaugeModel overviewGauge, NotificationsWrapperModel notificationsWrapper, WelcomeCardModel welcomeHomeCard) {
        AbstractC22676k.m65750j(overviewGauge, "overviewGauge");
        AbstractC22676k.m65750j(notificationsWrapper, "notificationsWrapper");
        AbstractC22676k.m65750j(welcomeHomeCard, "welcomeHomeCard");
        this.overviewGauge = overviewGauge;
        this.notificationsWrapper = notificationsWrapper;
        this.welcomeHomeCard = welcomeHomeCard;
    }
}
