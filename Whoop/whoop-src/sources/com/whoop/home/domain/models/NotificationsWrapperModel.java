package com.whoop.home.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.AiChatEntryModel;
import com.whoop.design.models.items.AiChatEntryModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc2.C39434a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ<\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b0\u0010\u001e¨\u00063"}, m65681d2 = {"Lcom/whoop/home/domain/models/NotificationsWrapperModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/home/domain/models/NotificationsCenterModel;", "architectureMiniComponent", "Lcom/whoop/design/models/items/AiChatEntryModel;", "chatEntryPoint", "", "replayText", "replayIcon", "<init>", "(Lcom/whoop/home/domain/models/NotificationsCenterModel;Lcom/whoop/design/models/items/AiChatEntryModel;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/home/domain/models/NotificationsCenterModel;Lcom/whoop/design/models/items/AiChatEntryModel;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/NotificationsWrapperModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/home/domain/models/NotificationsCenterModel;", "component2", "()Lcom/whoop/design/models/items/AiChatEntryModel;", "component3", "()Ljava/lang/String;", "component4", "copy", "(Lcom/whoop/home/domain/models/NotificationsCenterModel;Lcom/whoop/design/models/items/AiChatEntryModel;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/home/domain/models/NotificationsWrapperModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/home/domain/models/NotificationsCenterModel;", "getArchitectureMiniComponent", "Lcom/whoop/design/models/items/AiChatEntryModel;", "getChatEntryPoint", "Ljava/lang/String;", "getReplayText", "getReplayIcon", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NotificationsWrapperModel implements DesignSystemModel {
    private final NotificationsCenterModel architectureMiniComponent;
    private final AiChatEntryModel chatEntryPoint;
    private final String replayIcon;
    private final String replayText;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = AiChatEntryModel.$stable;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C39434a(22)), null, null, null};

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/NotificationsWrapperModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/NotificationsWrapperModel;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return NotificationsWrapperModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public NotificationsWrapperModel() {
        this((NotificationsCenterModel) null, (AiChatEntryModel) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ObjectSerializer("com.whoop.home.domain.models.NotificationsCenterModel", NotificationsCenterModel.INSTANCE, new Annotation[0]);
    }

    public static /* synthetic */ NotificationsWrapperModel copy$default(NotificationsWrapperModel notificationsWrapperModel, NotificationsCenterModel notificationsCenterModel, AiChatEntryModel aiChatEntryModel, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            notificationsCenterModel = notificationsWrapperModel.architectureMiniComponent;
        }
        if ((i13 & 2) != 0) {
            aiChatEntryModel = notificationsWrapperModel.chatEntryPoint;
        }
        if ((i13 & 4) != 0) {
            str = notificationsWrapperModel.replayText;
        }
        if ((i13 & 8) != 0) {
            str2 = notificationsWrapperModel.replayIcon;
        }
        return notificationsWrapperModel.copy(notificationsCenterModel, aiChatEntryModel, str, str2);
    }

    public static final /* synthetic */ void write$Self$home_release(NotificationsWrapperModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.architectureMiniComponent != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.architectureMiniComponent);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.chatEntryPoint != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, AiChatEntryModel$$serializer.INSTANCE, self.chatEntryPoint);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.replayText, "")) {
            output.encodeStringElement(serialDesc, 2, self.replayText);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && AbstractC22676k.m65745e(self.replayIcon, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 3, self.replayIcon);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NotificationsCenterModel getArchitectureMiniComponent() {
        return this.architectureMiniComponent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AiChatEntryModel getChatEntryPoint() {
        return this.chatEntryPoint;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReplayText() {
        return this.replayText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReplayIcon() {
        return this.replayIcon;
    }

    public final NotificationsWrapperModel copy(NotificationsCenterModel architectureMiniComponent, AiChatEntryModel chatEntryPoint, String replayText, String replayIcon) {
        AbstractC22676k.m65750j(replayText, "replayText");
        AbstractC22676k.m65750j(replayIcon, "replayIcon");
        return new NotificationsWrapperModel(architectureMiniComponent, chatEntryPoint, replayText, replayIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationsWrapperModel)) {
            return false;
        }
        NotificationsWrapperModel notificationsWrapperModel = (NotificationsWrapperModel) other;
        return AbstractC22676k.m65745e(this.architectureMiniComponent, notificationsWrapperModel.architectureMiniComponent) && AbstractC22676k.m65745e(this.chatEntryPoint, notificationsWrapperModel.chatEntryPoint) && AbstractC22676k.m65745e(this.replayText, notificationsWrapperModel.replayText) && AbstractC22676k.m65745e(this.replayIcon, notificationsWrapperModel.replayIcon);
    }

    public final NotificationsCenterModel getArchitectureMiniComponent() {
        return this.architectureMiniComponent;
    }

    public final AiChatEntryModel getChatEntryPoint() {
        return this.chatEntryPoint;
    }

    public final String getReplayIcon() {
        return this.replayIcon;
    }

    public final String getReplayText() {
        return this.replayText;
    }

    public int hashCode() {
        NotificationsCenterModel notificationsCenterModel = this.architectureMiniComponent;
        int iHashCode = (notificationsCenterModel == null ? 0 : notificationsCenterModel.hashCode()) * 31;
        AiChatEntryModel aiChatEntryModel = this.chatEntryPoint;
        return this.replayIcon.hashCode() + AbstractC11266d.m30450d((iHashCode + (aiChatEntryModel != null ? aiChatEntryModel.hashCode() : 0)) * 31, 31, this.replayText);
    }

    public String toString() {
        NotificationsCenterModel notificationsCenterModel = this.architectureMiniComponent;
        AiChatEntryModel aiChatEntryModel = this.chatEntryPoint;
        String str = this.replayText;
        String str2 = this.replayIcon;
        StringBuilder sb4 = new StringBuilder("NotificationsWrapperModel(architectureMiniComponent=");
        sb4.append(notificationsCenterModel);
        sb4.append(", chatEntryPoint=");
        sb4.append(aiChatEntryModel);
        sb4.append(", replayText=");
        return AbstractC11266d.m30464r(sb4, str, ", replayIcon=", str2, ")");
    }

    public /* synthetic */ NotificationsWrapperModel(int i13, NotificationsCenterModel notificationsCenterModel, AiChatEntryModel aiChatEntryModel, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.architectureMiniComponent = null;
        } else {
            this.architectureMiniComponent = notificationsCenterModel;
        }
        if ((i13 & 2) == 0) {
            this.chatEntryPoint = null;
        } else {
            this.chatEntryPoint = aiChatEntryModel;
        }
        if ((i13 & 4) == 0) {
            this.replayText = "";
        } else {
            this.replayText = str;
        }
        if ((i13 & 8) == 0) {
            this.replayIcon = "";
        } else {
            this.replayIcon = str2;
        }
    }

    public NotificationsWrapperModel(NotificationsCenterModel notificationsCenterModel, AiChatEntryModel aiChatEntryModel, String replayText, String replayIcon) {
        AbstractC22676k.m65750j(replayText, "replayText");
        AbstractC22676k.m65750j(replayIcon, "replayIcon");
        this.architectureMiniComponent = notificationsCenterModel;
        this.chatEntryPoint = aiChatEntryModel;
        this.replayText = replayText;
        this.replayIcon = replayIcon;
    }

    public /* synthetic */ NotificationsWrapperModel(NotificationsCenterModel notificationsCenterModel, AiChatEntryModel aiChatEntryModel, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : notificationsCenterModel, (i13 & 2) != 0 ? null : aiChatEntryModel, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? "" : str2);
    }
}
