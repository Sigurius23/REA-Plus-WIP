package io.getstream.chat.android.client.events;

import c13.AbstractC3855a;
import io.getstream.chat.android.models.ThreadInfo;
import java.util.Date;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, m65681d2 = {"Lio/getstream/chat/android/client/events/ThreadUpdatedEvent;", "Lio/getstream/chat/android/client/events/CidEvent;", "type", "", "createdAt", "Ljava/util/Date;", "rawCreatedAt", "cid", "channelType", "channelId", "thread", "Lio/getstream/chat/android/models/ThreadInfo;", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/ThreadInfo;)V", "getType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "getCid", "getChannelType", "getChannelId", "getThread", "()Lio/getstream/chat/android/models/ThreadInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ThreadUpdatedEvent extends CidEvent {
    private final String channelId;
    private final String channelType;
    private final String cid;
    private final Date createdAt;
    private final String rawCreatedAt;
    private final ThreadInfo thread;
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadUpdatedEvent(String type, Date createdAt, String str, String cid, String channelType, String channelId, ThreadInfo thread) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(thread, "thread");
        this.type = type;
        this.createdAt = createdAt;
        this.rawCreatedAt = str;
        this.cid = cid;
        this.channelType = channelType;
        this.channelId = channelId;
        this.thread = thread;
    }

    public static /* synthetic */ ThreadUpdatedEvent copy$default(ThreadUpdatedEvent threadUpdatedEvent, String str, Date date, String str2, String str3, String str4, String str5, ThreadInfo threadInfo, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = threadUpdatedEvent.type;
        }
        if ((i13 & 2) != 0) {
            date = threadUpdatedEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            str2 = threadUpdatedEvent.rawCreatedAt;
        }
        if ((i13 & 8) != 0) {
            str3 = threadUpdatedEvent.cid;
        }
        if ((i13 & 16) != 0) {
            str4 = threadUpdatedEvent.channelType;
        }
        if ((i13 & 32) != 0) {
            str5 = threadUpdatedEvent.channelId;
        }
        if ((i13 & 64) != 0) {
            threadInfo = threadUpdatedEvent.thread;
        }
        String str6 = str5;
        ThreadInfo threadInfo2 = threadInfo;
        String str7 = str4;
        String str8 = str2;
        return threadUpdatedEvent.copy(str, date, str8, str3, str7, str6, threadInfo2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
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
    public final ThreadInfo getThread() {
        return this.thread;
    }

    public final ThreadUpdatedEvent copy(String type, Date createdAt, String rawCreatedAt, String cid, String channelType, String channelId, ThreadInfo thread) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(thread, "thread");
        return new ThreadUpdatedEvent(type, createdAt, rawCreatedAt, cid, channelType, channelId, thread);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThreadUpdatedEvent)) {
            return false;
        }
        ThreadUpdatedEvent threadUpdatedEvent = (ThreadUpdatedEvent) other;
        return AbstractC22676k.m65745e(this.type, threadUpdatedEvent.type) && AbstractC22676k.m65745e(this.createdAt, threadUpdatedEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, threadUpdatedEvent.rawCreatedAt) && AbstractC22676k.m65745e(this.cid, threadUpdatedEvent.cid) && AbstractC22676k.m65745e(this.channelType, threadUpdatedEvent.channelType) && AbstractC22676k.m65745e(this.channelId, threadUpdatedEvent.channelId) && AbstractC22676k.m65745e(this.thread, threadUpdatedEvent.thread);
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

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
    }

    public final ThreadInfo getThread() {
        return this.thread;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int iM124373c = AbstractC38963t7.m124373c(this.createdAt, this.type.hashCode() * 31, 31);
        String str = this.rawCreatedAt;
        return this.thread.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM124373c + (str == null ? 0 : str.hashCode())) * 31, 31, this.cid), 31, this.channelType), 31, this.channelId);
    }

    public final String toString() {
        String str = this.type;
        Date date = this.createdAt;
        String str2 = this.rawCreatedAt;
        String str3 = this.cid;
        String str4 = this.channelType;
        String str5 = this.channelId;
        ThreadInfo threadInfo = this.thread;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("ThreadUpdatedEvent(type=", str, ", createdAt=", date, ", rawCreatedAt=");
        AbstractC11266d.m30444B(sbM11830n, str2, ", cid=", str3, ", channelType=");
        AbstractC11266d.m30444B(sbM11830n, str4, ", channelId=", str5, ", thread=");
        sbM11830n.append(threadInfo);
        sbM11830n.append(")");
        return sbM11830n.toString();
    }
}
