package io.getstream.chat.android.client.events;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import java.util.Date;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0004HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0004HÆ\u0003J\t\u0010+\u001a\u00020\u0004HÆ\u0003J\t\u0010,\u001a\u00020\u0004HÆ\u0003J\t\u0010-\u001a\u00020\u0004HÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u00100\u001a\u00020\u0010HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010%J\t\u00102\u001a\u00020\u0010HÆ\u0003J\u0080\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0010HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u00020\u00102\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u00020\u0012HÖ\u0001J\t\u00109\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0014\u0010\b\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0014\u0010\t\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0014\u0010\n\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0011\u0010\u0013\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#¨\u0006:"}, m65681d2 = {"Lio/getstream/chat/android/client/events/MessageDeletedEvent;", "Lio/getstream/chat/android/client/events/CidEvent;", "Lio/getstream/chat/android/client/events/HasMessage;", "type", "", "createdAt", "Ljava/util/Date;", "rawCreatedAt", "cid", "channelType", "channelId", "message", "Lio/getstream/chat/android/models/Message;", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "hardDelete", "", "channelMessageCount", "", "deletedForMe", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;ZLjava/lang/Integer;Z)V", "getType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "getCid", "getChannelType", "getChannelId", "getMessage", "()Lio/getstream/chat/android/models/Message;", "getUser", "()Lio/getstream/chat/android/models/User;", "getHardDelete", "()Z", "getChannelMessageCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDeletedForMe", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;ZLjava/lang/Integer;Z)Lio/getstream/chat/android/client/events/MessageDeletedEvent;", "equals", "other", "", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessageDeletedEvent extends CidEvent implements HasMessage {
    private final String channelId;
    private final Integer channelMessageCount;
    private final String channelType;
    private final String cid;
    private final Date createdAt;
    private final boolean deletedForMe;
    private final boolean hardDelete;
    private final Message message;
    private final String rawCreatedAt;
    private final String type;
    private final User user;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageDeletedEvent(String type, Date createdAt, String rawCreatedAt, String cid, String channelType, String channelId, Message message, User user, boolean z4, Integer num, boolean z13) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(message, "message");
        this.type = type;
        this.createdAt = createdAt;
        this.rawCreatedAt = rawCreatedAt;
        this.cid = cid;
        this.channelType = channelType;
        this.channelId = channelId;
        this.message = message;
        this.user = user;
        this.hardDelete = z4;
        this.channelMessageCount = num;
        this.deletedForMe = z13;
    }

    public static /* synthetic */ MessageDeletedEvent copy$default(MessageDeletedEvent messageDeletedEvent, String str, Date date, String str2, String str3, String str4, String str5, Message message, User user, boolean z4, Integer num, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = messageDeletedEvent.type;
        }
        if ((i13 & 2) != 0) {
            date = messageDeletedEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            str2 = messageDeletedEvent.rawCreatedAt;
        }
        if ((i13 & 8) != 0) {
            str3 = messageDeletedEvent.cid;
        }
        if ((i13 & 16) != 0) {
            str4 = messageDeletedEvent.channelType;
        }
        if ((i13 & 32) != 0) {
            str5 = messageDeletedEvent.channelId;
        }
        if ((i13 & 64) != 0) {
            message = messageDeletedEvent.message;
        }
        if ((i13 & 128) != 0) {
            user = messageDeletedEvent.user;
        }
        if ((i13 & 256) != 0) {
            z4 = messageDeletedEvent.hardDelete;
        }
        if ((i13 & 512) != 0) {
            num = messageDeletedEvent.channelMessageCount;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            z13 = messageDeletedEvent.deletedForMe;
        }
        Integer num2 = num;
        boolean z14 = z13;
        User user2 = user;
        boolean z15 = z4;
        String str6 = str5;
        Message message2 = message;
        String str7 = str4;
        String str8 = str2;
        return messageDeletedEvent.copy(str, date, str8, str3, str7, str6, message2, user2, z15, num2, z14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getChannelMessageCount() {
        return this.channelMessageCount;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getDeletedForMe() {
        return this.deletedForMe;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChannelType() {
        return this.channelType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Message getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getHardDelete() {
        return this.hardDelete;
    }

    public final MessageDeletedEvent copy(String type, Date createdAt, String rawCreatedAt, String cid, String channelType, String channelId, Message message, User user, boolean hardDelete, Integer channelMessageCount, boolean deletedForMe) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(message, "message");
        return new MessageDeletedEvent(type, createdAt, rawCreatedAt, cid, channelType, channelId, message, user, hardDelete, channelMessageCount, deletedForMe);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageDeletedEvent)) {
            return false;
        }
        MessageDeletedEvent messageDeletedEvent = (MessageDeletedEvent) other;
        return AbstractC22676k.m65745e(this.type, messageDeletedEvent.type) && AbstractC22676k.m65745e(this.createdAt, messageDeletedEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, messageDeletedEvent.rawCreatedAt) && AbstractC22676k.m65745e(this.cid, messageDeletedEvent.cid) && AbstractC22676k.m65745e(this.channelType, messageDeletedEvent.channelType) && AbstractC22676k.m65745e(this.channelId, messageDeletedEvent.channelId) && AbstractC22676k.m65745e(this.message, messageDeletedEvent.message) && AbstractC22676k.m65745e(this.user, messageDeletedEvent.user) && this.hardDelete == messageDeletedEvent.hardDelete && AbstractC22676k.m65745e(this.channelMessageCount, messageDeletedEvent.channelMessageCount) && this.deletedForMe == messageDeletedEvent.deletedForMe;
    }

    @Override // io.getstream.chat.android.client.events.CidEvent
    public final String getChannelId() {
        return this.channelId;
    }

    public final Integer getChannelMessageCount() {
        return this.channelMessageCount;
    }

    @Override // io.getstream.chat.android.client.events.CidEvent
    public final String getChannelType() {
        return this.channelType;
    }

    @Override // io.getstream.chat.android.client.events.CidEvent
    public final String getCid() {
        return this.cid;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final boolean getDeletedForMe() {
        return this.deletedForMe;
    }

    public final boolean getHardDelete() {
        return this.hardDelete;
    }

    @Override // io.getstream.chat.android.client.events.HasMessage
    public final Message getMessage() {
        return this.message;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getType() {
        return this.type;
    }

    public final User getUser() {
        return this.user;
    }

    public final int hashCode() {
        int iHashCode = (this.message.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC38963t7.m124373c(this.createdAt, this.type.hashCode() * 31, 31), 31, this.rawCreatedAt), 31, this.cid), 31, this.channelType), 31, this.channelId)) * 31;
        User user = this.user;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (user == null ? 0 : user.hashCode())) * 31, 31, this.hardDelete);
        Integer num = this.channelMessageCount;
        return Boolean.hashCode(this.deletedForMe) + ((iM8289b + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.type;
        Date date = this.createdAt;
        String str2 = this.rawCreatedAt;
        String str3 = this.cid;
        String str4 = this.channelType;
        String str5 = this.channelId;
        Message message = this.message;
        User user = this.user;
        boolean z4 = this.hardDelete;
        Integer num = this.channelMessageCount;
        boolean z13 = this.deletedForMe;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("MessageDeletedEvent(type=", str, ", createdAt=", date, ", rawCreatedAt=");
        AbstractC11266d.m30444B(sbM11830n, str2, ", cid=", str3, ", channelType=");
        AbstractC11266d.m30444B(sbM11830n, str4, ", channelId=", str5, ", message=");
        sbM11830n.append(message);
        sbM11830n.append(", user=");
        sbM11830n.append(user);
        sbM11830n.append(", hardDelete=");
        sbM11830n.append(z4);
        sbM11830n.append(", channelMessageCount=");
        sbM11830n.append(num);
        sbM11830n.append(", deletedForMe=");
        return AbstractC18489d0.m53372m(sbM11830n, z13, ")");
    }
}
