package io.getstream.chat.android.client.events;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import java.util.Date;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005Bo\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\u0011HÆ\u0003J\t\u00104\u001a\u00020\u0013HÆ\u0003J\t\u00105\u001a\u00020\u0013HÆ\u0003J\t\u00106\u001a\u00020\u0013HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010*J\u0088\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020\u0013HÖ\u0001J\t\u0010?\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\n\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0014\u0010\u000e\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0014\u0010\u000f\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010\u0014\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0014\u0010\u0015\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*¨\u0006@"}, m65681d2 = {"Lio/getstream/chat/android/client/events/NewMessageEvent;", "Lio/getstream/chat/android/client/events/CidEvent;", "Lio/getstream/chat/android/client/events/UserEvent;", "Lio/getstream/chat/android/client/events/HasMessage;", "Lio/getstream/chat/android/client/events/HasWatcherCount;", "Lio/getstream/chat/android/client/events/HasUnreadCounts;", "type", "", "createdAt", "Ljava/util/Date;", "rawCreatedAt", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "cid", "channelType", "channelId", "message", "Lio/getstream/chat/android/models/Message;", "watcherCount", "", "totalUnreadCount", "unreadChannels", "channelMessageCount", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;IIILjava/lang/Integer;)V", "getType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "getUser", "()Lio/getstream/chat/android/models/User;", "getCid", "getChannelType", "getChannelId", "getMessage", "()Lio/getstream/chat/android/models/Message;", "getWatcherCount", "()I", "getTotalUnreadCount", "getUnreadChannels", "getChannelMessageCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;IIILjava/lang/Integer;)Lio/getstream/chat/android/client/events/NewMessageEvent;", "equals", "", "other", "", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class NewMessageEvent extends CidEvent implements UserEvent, HasMessage, HasWatcherCount, HasUnreadCounts {
    private final String channelId;
    private final Integer channelMessageCount;
    private final String channelType;
    private final String cid;
    private final Date createdAt;
    private final Message message;
    private final String rawCreatedAt;
    private final int totalUnreadCount;
    private final String type;
    private final int unreadChannels;
    private final User user;
    private final int watcherCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewMessageEvent(String type, Date createdAt, String rawCreatedAt, User user, String cid, String channelType, String channelId, Message message, int i13, int i14, int i15, Integer num) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(message, "message");
        this.type = type;
        this.createdAt = createdAt;
        this.rawCreatedAt = rawCreatedAt;
        this.user = user;
        this.cid = cid;
        this.channelType = channelType;
        this.channelId = channelId;
        this.message = message;
        this.watcherCount = i13;
        this.totalUnreadCount = i14;
        this.unreadChannels = i15;
        this.channelMessageCount = num;
    }

    public static /* synthetic */ NewMessageEvent copy$default(NewMessageEvent newMessageEvent, String str, Date date, String str2, User user, String str3, String str4, String str5, Message message, int i13, int i14, int i15, Integer num, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            str = newMessageEvent.type;
        }
        if ((i16 & 2) != 0) {
            date = newMessageEvent.createdAt;
        }
        if ((i16 & 4) != 0) {
            str2 = newMessageEvent.rawCreatedAt;
        }
        if ((i16 & 8) != 0) {
            user = newMessageEvent.user;
        }
        if ((i16 & 16) != 0) {
            str3 = newMessageEvent.cid;
        }
        if ((i16 & 32) != 0) {
            str4 = newMessageEvent.channelType;
        }
        if ((i16 & 64) != 0) {
            str5 = newMessageEvent.channelId;
        }
        if ((i16 & 128) != 0) {
            message = newMessageEvent.message;
        }
        if ((i16 & 256) != 0) {
            i13 = newMessageEvent.watcherCount;
        }
        if ((i16 & 512) != 0) {
            i14 = newMessageEvent.totalUnreadCount;
        }
        if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            i15 = newMessageEvent.unreadChannels;
        }
        if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            num = newMessageEvent.channelMessageCount;
        }
        int i17 = i15;
        Integer num2 = num;
        int i18 = i13;
        int i19 = i14;
        String str6 = str5;
        Message message2 = message;
        String str7 = str3;
        String str8 = str4;
        return newMessageEvent.copy(str, date, str2, user, str7, str8, str6, message2, i18, i19, i17, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getTotalUnreadCount() {
        return this.totalUnreadCount;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getUnreadChannels() {
        return this.unreadChannels;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getChannelMessageCount() {
        return this.channelMessageCount;
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
    public final User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChannelType() {
        return this.channelType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Message getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getWatcherCount() {
        return this.watcherCount;
    }

    public final NewMessageEvent copy(String type, Date createdAt, String rawCreatedAt, User user, String cid, String channelType, String channelId, Message message, int watcherCount, int totalUnreadCount, int unreadChannels, Integer channelMessageCount) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(message, "message");
        return new NewMessageEvent(type, createdAt, rawCreatedAt, user, cid, channelType, channelId, message, watcherCount, totalUnreadCount, unreadChannels, channelMessageCount);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewMessageEvent)) {
            return false;
        }
        NewMessageEvent newMessageEvent = (NewMessageEvent) other;
        return AbstractC22676k.m65745e(this.type, newMessageEvent.type) && AbstractC22676k.m65745e(this.createdAt, newMessageEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, newMessageEvent.rawCreatedAt) && AbstractC22676k.m65745e(this.user, newMessageEvent.user) && AbstractC22676k.m65745e(this.cid, newMessageEvent.cid) && AbstractC22676k.m65745e(this.channelType, newMessageEvent.channelType) && AbstractC22676k.m65745e(this.channelId, newMessageEvent.channelId) && AbstractC22676k.m65745e(this.message, newMessageEvent.message) && this.watcherCount == newMessageEvent.watcherCount && this.totalUnreadCount == newMessageEvent.totalUnreadCount && this.unreadChannels == newMessageEvent.unreadChannels && AbstractC22676k.m65745e(this.channelMessageCount, newMessageEvent.channelMessageCount);
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

    @Override // io.getstream.chat.android.client.events.HasMessage
    public final Message getMessage() {
        return this.message;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
    }

    @Override // io.getstream.chat.android.client.events.HasUnreadCounts
    public final int getTotalUnreadCount() {
        return this.totalUnreadCount;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getType() {
        return this.type;
    }

    @Override // io.getstream.chat.android.client.events.HasUnreadCounts
    public final int getUnreadChannels() {
        return this.unreadChannels;
    }

    @Override // io.getstream.chat.android.client.events.UserEvent
    public final User getUser() {
        return this.user;
    }

    @Override // io.getstream.chat.android.client.events.HasWatcherCount
    public final int getWatcherCount() {
        return this.watcherCount;
    }

    public final int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.unreadChannels, AbstractC11266d.m30448b(this.totalUnreadCount, AbstractC11266d.m30448b(this.watcherCount, (this.message.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11478a.m30850b(this.user, AbstractC11266d.m30450d(AbstractC38963t7.m124373c(this.createdAt, this.type.hashCode() * 31, 31), 31, this.rawCreatedAt), 31), 31, this.cid), 31, this.channelType), 31, this.channelId)) * 31, 31), 31), 31);
        Integer num = this.channelMessageCount;
        return iM30448b + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        String str = this.type;
        Date date = this.createdAt;
        String str2 = this.rawCreatedAt;
        User user = this.user;
        String str3 = this.cid;
        String str4 = this.channelType;
        String str5 = this.channelId;
        Message message = this.message;
        int i13 = this.watcherCount;
        int i14 = this.totalUnreadCount;
        int i15 = this.unreadChannels;
        Integer num = this.channelMessageCount;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("NewMessageEvent(type=", str, ", createdAt=", date, ", rawCreatedAt=");
        AbstractC11478a.m30866r(sbM11830n, str2, ", user=", user, ", cid=");
        AbstractC11266d.m30444B(sbM11830n, str3, ", channelType=", str4, ", channelId=");
        sbM11830n.append(str5);
        sbM11830n.append(", message=");
        sbM11830n.append(message);
        sbM11830n.append(", watcherCount=");
        AbstractC30802r.m94773v(sbM11830n, i13, ", totalUnreadCount=", i14, ", unreadChannels=");
        sbM11830n.append(i15);
        sbM11830n.append(", channelMessageCount=");
        sbM11830n.append(num);
        sbM11830n.append(")");
        return sbM11830n.toString();
    }

    public /* synthetic */ NewMessageEvent(String str, Date date, String str2, User user, String str3, String str4, String str5, Message message, int i13, int i14, int i15, Integer num, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date, str2, user, str3, str4, str5, message, (i16 & 256) != 0 ? 0 : i13, (i16 & 512) != 0 ? 0 : i14, (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? 0 : i15, num);
    }
}
