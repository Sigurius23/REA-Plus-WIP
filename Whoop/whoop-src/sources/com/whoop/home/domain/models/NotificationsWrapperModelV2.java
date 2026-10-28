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
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import we1.C37224h;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0019¨\u0006,"}, m65681d2 = {"Lcom/whoop/home/domain/models/NotificationsWrapperModelV2;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/home/domain/models/NotificationsCenterModel;", "architectureMiniComponent", "Lcom/whoop/design/models/items/AiChatEntryModel;", "chatEntryPoint", "<init>", "(Lcom/whoop/home/domain/models/NotificationsCenterModel;Lcom/whoop/design/models/items/AiChatEntryModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/home/domain/models/NotificationsCenterModel;Lcom/whoop/design/models/items/AiChatEntryModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/NotificationsWrapperModelV2;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/home/domain/models/NotificationsCenterModel;", "component2", "()Lcom/whoop/design/models/items/AiChatEntryModel;", "copy", "(Lcom/whoop/home/domain/models/NotificationsCenterModel;Lcom/whoop/design/models/items/AiChatEntryModel;)Lcom/whoop/home/domain/models/NotificationsWrapperModelV2;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/home/domain/models/NotificationsCenterModel;", "getArchitectureMiniComponent", "Lcom/whoop/design/models/items/AiChatEntryModel;", "getChatEntryPoint", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NotificationsWrapperModelV2 implements DesignSystemModel {
    private final NotificationsCenterModel architectureMiniComponent;
    private final AiChatEntryModel chatEntryPoint;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = AiChatEntryModel.$stable;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37224h(22)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/NotificationsWrapperModelV2$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/NotificationsWrapperModelV2;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return NotificationsWrapperModelV2$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationsWrapperModelV2() {
        this((NotificationsCenterModel) null, (AiChatEntryModel) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ObjectSerializer("com.whoop.home.domain.models.NotificationsCenterModel", NotificationsCenterModel.INSTANCE, new Annotation[0]);
    }

    public static /* synthetic */ NotificationsWrapperModelV2 copy$default(NotificationsWrapperModelV2 notificationsWrapperModelV2, NotificationsCenterModel notificationsCenterModel, AiChatEntryModel aiChatEntryModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            notificationsCenterModel = notificationsWrapperModelV2.architectureMiniComponent;
        }
        if ((i13 & 2) != 0) {
            aiChatEntryModel = notificationsWrapperModelV2.chatEntryPoint;
        }
        return notificationsWrapperModelV2.copy(notificationsCenterModel, aiChatEntryModel);
    }

    public static final /* synthetic */ void write$Self$home_release(NotificationsWrapperModelV2 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.architectureMiniComponent != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.architectureMiniComponent);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.chatEntryPoint == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, AiChatEntryModel$$serializer.INSTANCE, self.chatEntryPoint);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NotificationsCenterModel getArchitectureMiniComponent() {
        return this.architectureMiniComponent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AiChatEntryModel getChatEntryPoint() {
        return this.chatEntryPoint;
    }

    public final NotificationsWrapperModelV2 copy(NotificationsCenterModel architectureMiniComponent, AiChatEntryModel chatEntryPoint) {
        return new NotificationsWrapperModelV2(architectureMiniComponent, chatEntryPoint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationsWrapperModelV2)) {
            return false;
        }
        NotificationsWrapperModelV2 notificationsWrapperModelV2 = (NotificationsWrapperModelV2) other;
        return AbstractC22676k.m65745e(this.architectureMiniComponent, notificationsWrapperModelV2.architectureMiniComponent) && AbstractC22676k.m65745e(this.chatEntryPoint, notificationsWrapperModelV2.chatEntryPoint);
    }

    public final NotificationsCenterModel getArchitectureMiniComponent() {
        return this.architectureMiniComponent;
    }

    public final AiChatEntryModel getChatEntryPoint() {
        return this.chatEntryPoint;
    }

    public int hashCode() {
        NotificationsCenterModel notificationsCenterModel = this.architectureMiniComponent;
        int iHashCode = (notificationsCenterModel == null ? 0 : notificationsCenterModel.hashCode()) * 31;
        AiChatEntryModel aiChatEntryModel = this.chatEntryPoint;
        return iHashCode + (aiChatEntryModel != null ? aiChatEntryModel.hashCode() : 0);
    }

    public String toString() {
        return "NotificationsWrapperModelV2(architectureMiniComponent=" + this.architectureMiniComponent + ", chatEntryPoint=" + this.chatEntryPoint + ")";
    }

    public /* synthetic */ NotificationsWrapperModelV2(int i13, NotificationsCenterModel notificationsCenterModel, AiChatEntryModel aiChatEntryModel, SerializationConstructorMarker serializationConstructorMarker) {
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
    }

    public NotificationsWrapperModelV2(NotificationsCenterModel notificationsCenterModel, AiChatEntryModel aiChatEntryModel) {
        this.architectureMiniComponent = notificationsCenterModel;
        this.chatEntryPoint = aiChatEntryModel;
    }

    public /* synthetic */ NotificationsWrapperModelV2(NotificationsCenterModel notificationsCenterModel, AiChatEntryModel aiChatEntryModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : notificationsCenterModel, (i13 & 2) != 0 ? null : aiChatEntryModel);
    }
}
