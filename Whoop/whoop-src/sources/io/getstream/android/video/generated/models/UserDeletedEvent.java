package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import java.util.Map;
import jg3.C21682i;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\u0004\u0012\b\b\u0001\u0010\n\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0006\u0012\u0016\b\u0003\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\r0\f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u001e\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\r0\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0018J\u008e\u0001\u0010&\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00042\b\b\u0003\u0010\t\u001a\u00020\u00042\b\b\u0003\u0010\n\u001a\u00020\u00062\b\b\u0003\u0010\u000b\u001a\u00020\u00062\u0016\b\u0003\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\b\b\u0003\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u00042\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010\u0016J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b5\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b6\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b7\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b8\u0010\u001bR%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010!R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b<\u0010#R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b=\u0010\u0016R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b>\u0010\u0018¨\u0006?"}, m65681d2 = {"Lio/getstream/android/video/generated/models/UserDeletedEvent;", "Lio/getstream/android/video/generated/models/VideoEvent;", "Ljg3/i;", "createdAt", "", "deleteConversation", "", "deleteConversationChannels", "deleteMessages", "deleteUser", "hardDelete", "markMessagesDeleted", "", "", "custom", "Lio/getstream/android/video/generated/models/UserResponseCommonFields;", UserState.Sources.USER, "type", "receivedAt", "<init>", "(Ljg3/i;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljg3/i;)V", "getEventType", "()Ljava/lang/String;", "component1", "()Ljg3/i;", "component2", "component3", "()Z", "component4", "component5", "component6", "component7", "component8", "()Ljava/util/Map;", "component9", "()Lio/getstream/android/video/generated/models/UserResponseCommonFields;", "component10", "component11", "copy", "(Ljg3/i;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Lio/getstream/android/video/generated/models/UserResponseCommonFields;Ljava/lang/String;Ljg3/i;)Lio/getstream/android/video/generated/models/UserDeletedEvent;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljg3/i;", "getCreatedAt", "Ljava/lang/String;", "getDeleteConversation", "Z", "getDeleteConversationChannels", "getDeleteMessages", "getDeleteUser", "getHardDelete", "getMarkMessagesDeleted", "Ljava/util/Map;", "getCustom", "Lio/getstream/android/video/generated/models/UserResponseCommonFields;", "getUser", "getType", "getReceivedAt", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class UserDeletedEvent extends VideoEvent {
    private final C21682i createdAt;
    private final Map<String, Object> custom;
    private final String deleteConversation;
    private final boolean deleteConversationChannels;
    private final String deleteMessages;
    private final String deleteUser;
    private final boolean hardDelete;
    private final boolean markMessagesDeleted;
    private final C21682i receivedAt;
    private final String type;
    private final UserResponseCommonFields user;

    public /* synthetic */ UserDeletedEvent(C21682i c21682i, String str, boolean z4, String str2, String str3, boolean z13, boolean z14, Map map, UserResponseCommonFields userResponseCommonFields, String str4, C21682i c21682i2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c21682i, str, z4, str2, str3, z13, z14, (i13 & 128) != 0 ? C25272z.f99163w : map, userResponseCommonFields, str4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c21682i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserDeletedEvent copy$default(UserDeletedEvent userDeletedEvent, C21682i c21682i, String str, boolean z4, String str2, String str3, boolean z13, boolean z14, Map map, UserResponseCommonFields userResponseCommonFields, String str4, C21682i c21682i2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c21682i = userDeletedEvent.createdAt;
        }
        if ((i13 & 2) != 0) {
            str = userDeletedEvent.deleteConversation;
        }
        if ((i13 & 4) != 0) {
            z4 = userDeletedEvent.deleteConversationChannels;
        }
        if ((i13 & 8) != 0) {
            str2 = userDeletedEvent.deleteMessages;
        }
        if ((i13 & 16) != 0) {
            str3 = userDeletedEvent.deleteUser;
        }
        if ((i13 & 32) != 0) {
            z13 = userDeletedEvent.hardDelete;
        }
        if ((i13 & 64) != 0) {
            z14 = userDeletedEvent.markMessagesDeleted;
        }
        if ((i13 & 128) != 0) {
            map = userDeletedEvent.custom;
        }
        if ((i13 & 256) != 0) {
            userResponseCommonFields = userDeletedEvent.user;
        }
        if ((i13 & 512) != 0) {
            str4 = userDeletedEvent.type;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            c21682i2 = userDeletedEvent.receivedAt;
        }
        String str5 = str4;
        C21682i c21682i3 = c21682i2;
        Map map2 = map;
        UserResponseCommonFields userResponseCommonFields2 = userResponseCommonFields;
        boolean z15 = z13;
        boolean z16 = z14;
        String str6 = str3;
        boolean z17 = z4;
        return userDeletedEvent.copy(c21682i, str, z17, str2, str6, z15, z16, map2, userResponseCommonFields2, str5, c21682i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final C21682i getReceivedAt() {
        return this.receivedAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeleteConversation() {
        return this.deleteConversation;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getDeleteConversationChannels() {
        return this.deleteConversationChannels;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeleteMessages() {
        return this.deleteMessages;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeleteUser() {
        return this.deleteUser;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getHardDelete() {
        return this.hardDelete;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getMarkMessagesDeleted() {
        return this.markMessagesDeleted;
    }

    public final Map<String, Object> component8() {
        return this.custom;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final UserResponseCommonFields getUser() {
        return this.user;
    }

    public final UserDeletedEvent copy(@InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "delete_conversation") String deleteConversation, @InterfaceC30731q(name = "delete_conversation_channels") boolean deleteConversationChannels, @InterfaceC30731q(name = "delete_messages") String deleteMessages, @InterfaceC30731q(name = "delete_user") String deleteUser, @InterfaceC30731q(name = "hard_delete") boolean hardDelete, @InterfaceC30731q(name = "mark_messages_deleted") boolean markMessagesDeleted, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> custom, @InterfaceC30731q(name = UserState.Sources.USER) UserResponseCommonFields user, @InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = "received_at") C21682i receivedAt) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(deleteConversation, "deleteConversation");
        AbstractC22676k.m65750j(deleteMessages, "deleteMessages");
        AbstractC22676k.m65750j(deleteUser, "deleteUser");
        AbstractC22676k.m65750j(custom, "custom");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(type, "type");
        return new UserDeletedEvent(createdAt, deleteConversation, deleteConversationChannels, deleteMessages, deleteUser, hardDelete, markMessagesDeleted, custom, user, type, receivedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserDeletedEvent)) {
            return false;
        }
        UserDeletedEvent userDeletedEvent = (UserDeletedEvent) other;
        return AbstractC22676k.m65745e(this.createdAt, userDeletedEvent.createdAt) && AbstractC22676k.m65745e(this.deleteConversation, userDeletedEvent.deleteConversation) && this.deleteConversationChannels == userDeletedEvent.deleteConversationChannels && AbstractC22676k.m65745e(this.deleteMessages, userDeletedEvent.deleteMessages) && AbstractC22676k.m65745e(this.deleteUser, userDeletedEvent.deleteUser) && this.hardDelete == userDeletedEvent.hardDelete && this.markMessagesDeleted == userDeletedEvent.markMessagesDeleted && AbstractC22676k.m65745e(this.custom, userDeletedEvent.custom) && AbstractC22676k.m65745e(this.user, userDeletedEvent.user) && AbstractC22676k.m65745e(this.type, userDeletedEvent.type) && AbstractC22676k.m65745e(this.receivedAt, userDeletedEvent.receivedAt);
    }

    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    public final Map<String, Object> getCustom() {
        return this.custom;
    }

    public final String getDeleteConversation() {
        return this.deleteConversation;
    }

    public final boolean getDeleteConversationChannels() {
        return this.deleteConversationChannels;
    }

    public final String getDeleteMessages() {
        return this.deleteMessages;
    }

    public final String getDeleteUser() {
        return this.deleteUser;
    }

    @Override // io.getstream.android.video.generated.models.VideoEvent
    /* JADX INFO: renamed from: getEventType */
    public String getType() {
        return this.type;
    }

    public final boolean getHardDelete() {
        return this.hardDelete;
    }

    public final boolean getMarkMessagesDeleted() {
        return this.markMessagesDeleted;
    }

    public final C21682i getReceivedAt() {
        return this.receivedAt;
    }

    public final String getType() {
        return this.type;
    }

    public final UserResponseCommonFields getUser() {
        return this.user;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.user.hashCode() + AbstractC3855a.m11821e(this.custom, AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.createdAt.hashCode() * 31, 31, this.deleteConversation), 31, this.deleteConversationChannels), 31, this.deleteMessages), 31, this.deleteUser), 31, this.hardDelete), 31, this.markMessagesDeleted), 31)) * 31, 31, this.type);
        C21682i c21682i = this.receivedAt;
        return iM30450d + (c21682i == null ? 0 : c21682i.hashCode());
    }

    public String toString() {
        C21682i c21682i = this.createdAt;
        String str = this.deleteConversation;
        boolean z4 = this.deleteConversationChannels;
        String str2 = this.deleteMessages;
        String str3 = this.deleteUser;
        boolean z13 = this.hardDelete;
        boolean z14 = this.markMessagesDeleted;
        Map<String, Object> map = this.custom;
        UserResponseCommonFields userResponseCommonFields = this.user;
        String str4 = this.type;
        C21682i c21682i2 = this.receivedAt;
        StringBuilder sb4 = new StringBuilder("UserDeletedEvent(createdAt=");
        sb4.append(c21682i);
        sb4.append(", deleteConversation=");
        sb4.append(str);
        sb4.append(", deleteConversationChannels=");
        AbstractC38963t7.m124391u(sb4, z4, ", deleteMessages=", str2, ", deleteUser=");
        AbstractC38963t7.m124390t(sb4, str3, ", hardDelete=", z13, ", markMessagesDeleted=");
        sb4.append(z14);
        sb4.append(", custom=");
        sb4.append(map);
        sb4.append(", user=");
        sb4.append(userResponseCommonFields);
        sb4.append(", type=");
        sb4.append(str4);
        sb4.append(", receivedAt=");
        sb4.append(c21682i2);
        sb4.append(")");
        return sb4.toString();
    }

    public UserDeletedEvent(@InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "delete_conversation") String deleteConversation, @InterfaceC30731q(name = "delete_conversation_channels") boolean z4, @InterfaceC30731q(name = "delete_messages") String deleteMessages, @InterfaceC30731q(name = "delete_user") String deleteUser, @InterfaceC30731q(name = "hard_delete") boolean z13, @InterfaceC30731q(name = "mark_messages_deleted") boolean z14, @InterfaceC30731q(name = "custom") Map<String, ? extends Object> custom, @InterfaceC30731q(name = UserState.Sources.USER) UserResponseCommonFields user, @InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = "received_at") C21682i c21682i) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(deleteConversation, "deleteConversation");
        AbstractC22676k.m65750j(deleteMessages, "deleteMessages");
        AbstractC22676k.m65750j(deleteUser, "deleteUser");
        AbstractC22676k.m65750j(custom, "custom");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(type, "type");
        this.createdAt = createdAt;
        this.deleteConversation = deleteConversation;
        this.deleteConversationChannels = z4;
        this.deleteMessages = deleteMessages;
        this.deleteUser = deleteUser;
        this.hardDelete = z13;
        this.markMessagesDeleted = z14;
        this.custom = custom;
        this.user = user;
        this.type = type;
        this.receivedAt = c21682i;
    }
}
