package io.getstream.chat.android.client.events;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import io.getstream.chat.android.models.ThreadInfo;
import io.getstream.chat.android.models.User;
import java.util.Date;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\u0004HÆ\u0003J\t\u0010&\u001a\u00020\u0004HÆ\u0003J\t\u0010'\u001a\u00020\u0004HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003Js\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0014\u0010\f\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014¨\u00063"}, m65681d2 = {"Lio/getstream/chat/android/client/events/MessageReadEvent;", "Lio/getstream/chat/android/client/events/CidEvent;", "Lio/getstream/chat/android/client/events/UserEvent;", "type", "", "createdAt", "Ljava/util/Date;", "rawCreatedAt", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "cid", "channelType", "channelId", "lastReadMessageId", "thread", "Lio/getstream/chat/android/models/ThreadInfo;", "team", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/ThreadInfo;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "getUser", "()Lio/getstream/chat/android/models/User;", "getCid", "getChannelType", "getChannelId", "getLastReadMessageId", "getThread", "()Lio/getstream/chat/android/models/ThreadInfo;", "getTeam", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessageReadEvent extends CidEvent implements UserEvent {
    private final String channelId;
    private final String channelType;
    private final String cid;
    private final Date createdAt;
    private final String lastReadMessageId;
    private final String rawCreatedAt;
    private final String team;
    private final ThreadInfo thread;
    private final String type;
    private final User user;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageReadEvent(String type, Date createdAt, String rawCreatedAt, User user, String cid, String channelType, String channelId, String str, ThreadInfo threadInfo, String str2) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        this.type = type;
        this.createdAt = createdAt;
        this.rawCreatedAt = rawCreatedAt;
        this.user = user;
        this.cid = cid;
        this.channelType = channelType;
        this.channelId = channelId;
        this.lastReadMessageId = str;
        this.thread = threadInfo;
        this.team = str2;
    }

    public static /* synthetic */ MessageReadEvent copy$default(MessageReadEvent messageReadEvent, String str, Date date, String str2, User user, String str3, String str4, String str5, String str6, ThreadInfo threadInfo, String str7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = messageReadEvent.type;
        }
        if ((i13 & 2) != 0) {
            date = messageReadEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            str2 = messageReadEvent.rawCreatedAt;
        }
        if ((i13 & 8) != 0) {
            user = messageReadEvent.user;
        }
        if ((i13 & 16) != 0) {
            str3 = messageReadEvent.cid;
        }
        if ((i13 & 32) != 0) {
            str4 = messageReadEvent.channelType;
        }
        if ((i13 & 64) != 0) {
            str5 = messageReadEvent.channelId;
        }
        if ((i13 & 128) != 0) {
            str6 = messageReadEvent.lastReadMessageId;
        }
        if ((i13 & 256) != 0) {
            threadInfo = messageReadEvent.thread;
        }
        if ((i13 & 512) != 0) {
            str7 = messageReadEvent.team;
        }
        ThreadInfo threadInfo2 = threadInfo;
        String str8 = str7;
        String str9 = str5;
        String str10 = str6;
        String str11 = str3;
        String str12 = str4;
        return messageReadEvent.copy(str, date, str2, user, str11, str12, str9, str10, threadInfo2, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTeam() {
        return this.team;
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
    public final String getLastReadMessageId() {
        return this.lastReadMessageId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ThreadInfo getThread() {
        return this.thread;
    }

    public final MessageReadEvent copy(String type, Date createdAt, String rawCreatedAt, User user, String cid, String channelType, String channelId, String lastReadMessageId, ThreadInfo thread, String team) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return new MessageReadEvent(type, createdAt, rawCreatedAt, user, cid, channelType, channelId, lastReadMessageId, thread, team);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageReadEvent)) {
            return false;
        }
        MessageReadEvent messageReadEvent = (MessageReadEvent) other;
        return AbstractC22676k.m65745e(this.type, messageReadEvent.type) && AbstractC22676k.m65745e(this.createdAt, messageReadEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, messageReadEvent.rawCreatedAt) && AbstractC22676k.m65745e(this.user, messageReadEvent.user) && AbstractC22676k.m65745e(this.cid, messageReadEvent.cid) && AbstractC22676k.m65745e(this.channelType, messageReadEvent.channelType) && AbstractC22676k.m65745e(this.channelId, messageReadEvent.channelId) && AbstractC22676k.m65745e(this.lastReadMessageId, messageReadEvent.lastReadMessageId) && AbstractC22676k.m65745e(this.thread, messageReadEvent.thread) && AbstractC22676k.m65745e(this.team, messageReadEvent.team);
    }

    @Override // io.getstream.chat.android.client.events.CidEvent
    public final String getChannelId() {
        return this.channelId;
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

    public final String getLastReadMessageId() {
        return this.lastReadMessageId;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
    }

    public final String getTeam() {
        return this.team;
    }

    public final ThreadInfo getThread() {
        return this.thread;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getType() {
        return this.type;
    }

    @Override // io.getstream.chat.android.client.events.UserEvent
    public final User getUser() {
        return this.user;
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11478a.m30850b(this.user, AbstractC11266d.m30450d(AbstractC38963t7.m124373c(this.createdAt, this.type.hashCode() * 31, 31), 31, this.rawCreatedAt), 31), 31, this.cid), 31, this.channelType), 31, this.channelId);
        String str = this.lastReadMessageId;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        ThreadInfo threadInfo = this.thread;
        int iHashCode2 = (iHashCode + (threadInfo == null ? 0 : threadInfo.hashCode())) * 31;
        String str2 = this.team;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.type;
        Date date = this.createdAt;
        String str2 = this.rawCreatedAt;
        User user = this.user;
        String str3 = this.cid;
        String str4 = this.channelType;
        String str5 = this.channelId;
        String str6 = this.lastReadMessageId;
        ThreadInfo threadInfo = this.thread;
        String str7 = this.team;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("MessageReadEvent(type=", str, ", createdAt=", date, ", rawCreatedAt=");
        AbstractC11478a.m30866r(sbM11830n, str2, ", user=", user, ", cid=");
        AbstractC11266d.m30444B(sbM11830n, str3, ", channelType=", str4, ", channelId=");
        AbstractC11266d.m30444B(sbM11830n, str5, ", lastReadMessageId=", str6, ", thread=");
        sbM11830n.append(threadInfo);
        sbM11830n.append(", team=");
        sbM11830n.append(str7);
        sbM11830n.append(")");
        return sbM11830n.toString();
    }

    public /* synthetic */ MessageReadEvent(String str, Date date, String str2, User user, String str3, String str4, String str5, String str6, ThreadInfo threadInfo, String str7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date, str2, user, str3, str4, str5, str6, (i13 & 256) != 0 ? null : threadInfo, (i13 & 512) != 0 ? null : str7);
    }
}
