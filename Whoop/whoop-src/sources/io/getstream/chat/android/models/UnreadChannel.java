package io.getstream.chat.android.models;

import java.util.Date;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/models/UnreadChannel;", "", "cid", "", "messagesCount", "", "lastRead", "Ljava/util/Date;", "<init>", "(Ljava/lang/String;ILjava/util/Date;)V", "getCid", "()Ljava/lang/String;", "getMessagesCount", "()I", "getLastRead", "()Ljava/util/Date;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UnreadChannel {
    private final String cid;
    private final Date lastRead;
    private final int messagesCount;

    public UnreadChannel(String cid, int i13, Date lastRead) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(lastRead, "lastRead");
        this.cid = cid;
        this.messagesCount = i13;
        this.lastRead = lastRead;
    }

    public static /* synthetic */ UnreadChannel copy$default(UnreadChannel unreadChannel, String str, int i13, Date date, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = unreadChannel.cid;
        }
        if ((i14 & 2) != 0) {
            i13 = unreadChannel.messagesCount;
        }
        if ((i14 & 4) != 0) {
            date = unreadChannel.lastRead;
        }
        return unreadChannel.copy(str, i13, date);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMessagesCount() {
        return this.messagesCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getLastRead() {
        return this.lastRead;
    }

    public final UnreadChannel copy(String cid, int messagesCount, Date lastRead) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(lastRead, "lastRead");
        return new UnreadChannel(cid, messagesCount, lastRead);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnreadChannel)) {
            return false;
        }
        UnreadChannel unreadChannel = (UnreadChannel) other;
        return AbstractC22676k.m65745e(this.cid, unreadChannel.cid) && this.messagesCount == unreadChannel.messagesCount && AbstractC22676k.m65745e(this.lastRead, unreadChannel.lastRead);
    }

    public final String getCid() {
        return this.cid;
    }

    public final Date getLastRead() {
        return this.lastRead;
    }

    public final int getMessagesCount() {
        return this.messagesCount;
    }

    public int hashCode() {
        return this.lastRead.hashCode() + AbstractC11266d.m30448b(this.messagesCount, this.cid.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.cid;
        int i13 = this.messagesCount;
        return AbstractC13673n.m38564k(AbstractC11266d.m30467u(i13, "UnreadChannel(cid=", str, ", messagesCount=", ", lastRead="), this.lastRead, ")");
    }
}
