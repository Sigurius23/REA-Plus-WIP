package com.whoop.home.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.AiChatEntryModel;
import com.whoop.design.models.items.AiChatEntryModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ2\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001b¨\u0006-"}, m65681d2 = {"Lcom/whoop/home/domain/models/NotificationsWrapperModelV3;", "Lcom/whoop/design/models/DesignSystemModel;", "", "path", "userCategory", "Lcom/whoop/design/models/items/AiChatEntryModel;", "chatEntryPoint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/AiChatEntryModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/AiChatEntryModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/NotificationsWrapperModelV3;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/items/AiChatEntryModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/AiChatEntryModel;)Lcom/whoop/home/domain/models/NotificationsWrapperModelV3;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "getUserCategory", "Lcom/whoop/design/models/items/AiChatEntryModel;", "getChatEntryPoint", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NotificationsWrapperModelV3 implements DesignSystemModel {
    private final AiChatEntryModel chatEntryPoint;
    private final String path;
    private final String userCategory;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = AiChatEntryModel.$stable;

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/NotificationsWrapperModelV3$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/NotificationsWrapperModelV3;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return NotificationsWrapperModelV3$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ NotificationsWrapperModelV3(int i13, String str, String str2, AiChatEntryModel aiChatEntryModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, NotificationsWrapperModelV3$$serializer.INSTANCE.getDescriptor());
        }
        this.path = str;
        if ((i13 & 2) == 0) {
            this.userCategory = null;
        } else {
            this.userCategory = str2;
        }
        if ((i13 & 4) == 0) {
            this.chatEntryPoint = null;
        } else {
            this.chatEntryPoint = aiChatEntryModel;
        }
    }

    public static /* synthetic */ NotificationsWrapperModelV3 copy$default(NotificationsWrapperModelV3 notificationsWrapperModelV3, String str, String str2, AiChatEntryModel aiChatEntryModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = notificationsWrapperModelV3.path;
        }
        if ((i13 & 2) != 0) {
            str2 = notificationsWrapperModelV3.userCategory;
        }
        if ((i13 & 4) != 0) {
            aiChatEntryModel = notificationsWrapperModelV3.chatEntryPoint;
        }
        return notificationsWrapperModelV3.copy(str, str2, aiChatEntryModel);
    }

    public static final /* synthetic */ void write$Self$home_release(NotificationsWrapperModelV3 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.path);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.userCategory != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.userCategory);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.chatEntryPoint == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, AiChatEntryModel$$serializer.INSTANCE, self.chatEntryPoint);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserCategory() {
        return this.userCategory;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AiChatEntryModel getChatEntryPoint() {
        return this.chatEntryPoint;
    }

    public final NotificationsWrapperModelV3 copy(String path, String userCategory, AiChatEntryModel chatEntryPoint) {
        AbstractC22676k.m65750j(path, "path");
        return new NotificationsWrapperModelV3(path, userCategory, chatEntryPoint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationsWrapperModelV3)) {
            return false;
        }
        NotificationsWrapperModelV3 notificationsWrapperModelV3 = (NotificationsWrapperModelV3) other;
        return AbstractC22676k.m65745e(this.path, notificationsWrapperModelV3.path) && AbstractC22676k.m65745e(this.userCategory, notificationsWrapperModelV3.userCategory) && AbstractC22676k.m65745e(this.chatEntryPoint, notificationsWrapperModelV3.chatEntryPoint);
    }

    public final AiChatEntryModel getChatEntryPoint() {
        return this.chatEntryPoint;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getUserCategory() {
        return this.userCategory;
    }

    public int hashCode() {
        int iHashCode = this.path.hashCode() * 31;
        String str = this.userCategory;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AiChatEntryModel aiChatEntryModel = this.chatEntryPoint;
        return iHashCode2 + (aiChatEntryModel != null ? aiChatEntryModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.path;
        String str2 = this.userCategory;
        AiChatEntryModel aiChatEntryModel = this.chatEntryPoint;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("NotificationsWrapperModelV3(path=", str, ", userCategory=", str2, ", chatEntryPoint=");
        sbM32001t.append(aiChatEntryModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public NotificationsWrapperModelV3(String path, String str, AiChatEntryModel aiChatEntryModel) {
        AbstractC22676k.m65750j(path, "path");
        this.path = path;
        this.userCategory = str;
        this.chatEntryPoint = aiChatEntryModel;
    }

    public /* synthetic */ NotificationsWrapperModelV3(String str, String str2, AiChatEntryModel aiChatEntryModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : aiChatEntryModel);
    }
}
