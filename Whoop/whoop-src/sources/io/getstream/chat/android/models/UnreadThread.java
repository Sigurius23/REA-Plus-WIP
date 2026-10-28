package io.getstream.chat.android.models;

import java.util.Date;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/models/UnreadThread;", "", "parentMessageId", "", "messagesCount", "", "lastRead", "Ljava/util/Date;", "lastReadMessageId", "<init>", "(Ljava/lang/String;ILjava/util/Date;Ljava/lang/String;)V", "getParentMessageId", "()Ljava/lang/String;", "getMessagesCount", "()I", "getLastRead", "()Ljava/util/Date;", "getLastReadMessageId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UnreadThread {
    private final Date lastRead;
    private final String lastReadMessageId;
    private final int messagesCount;
    private final String parentMessageId;

    public UnreadThread(String parentMessageId, int i13, Date lastRead, String lastReadMessageId) {
        AbstractC22676k.m65750j(parentMessageId, "parentMessageId");
        AbstractC22676k.m65750j(lastRead, "lastRead");
        AbstractC22676k.m65750j(lastReadMessageId, "lastReadMessageId");
        this.parentMessageId = parentMessageId;
        this.messagesCount = i13;
        this.lastRead = lastRead;
        this.lastReadMessageId = lastReadMessageId;
    }

    public static /* synthetic */ UnreadThread copy$default(UnreadThread unreadThread, String str, int i13, Date date, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = unreadThread.parentMessageId;
        }
        if ((i14 & 2) != 0) {
            i13 = unreadThread.messagesCount;
        }
        if ((i14 & 4) != 0) {
            date = unreadThread.lastRead;
        }
        if ((i14 & 8) != 0) {
            str2 = unreadThread.lastReadMessageId;
        }
        return unreadThread.copy(str, i13, date, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getParentMessageId() {
        return this.parentMessageId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMessagesCount() {
        return this.messagesCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getLastRead() {
        return this.lastRead;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLastReadMessageId() {
        return this.lastReadMessageId;
    }

    public final UnreadThread copy(String parentMessageId, int messagesCount, Date lastRead, String lastReadMessageId) {
        AbstractC22676k.m65750j(parentMessageId, "parentMessageId");
        AbstractC22676k.m65750j(lastRead, "lastRead");
        AbstractC22676k.m65750j(lastReadMessageId, "lastReadMessageId");
        return new UnreadThread(parentMessageId, messagesCount, lastRead, lastReadMessageId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnreadThread)) {
            return false;
        }
        UnreadThread unreadThread = (UnreadThread) other;
        return AbstractC22676k.m65745e(this.parentMessageId, unreadThread.parentMessageId) && this.messagesCount == unreadThread.messagesCount && AbstractC22676k.m65745e(this.lastRead, unreadThread.lastRead) && AbstractC22676k.m65745e(this.lastReadMessageId, unreadThread.lastReadMessageId);
    }

    public final Date getLastRead() {
        return this.lastRead;
    }

    public final String getLastReadMessageId() {
        return this.lastReadMessageId;
    }

    public final int getMessagesCount() {
        return this.messagesCount;
    }

    public final String getParentMessageId() {
        return this.parentMessageId;
    }

    public int hashCode() {
        return this.lastReadMessageId.hashCode() + AbstractC38963t7.m124373c(this.lastRead, AbstractC11266d.m30448b(this.messagesCount, this.parentMessageId.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.parentMessageId;
        int i13 = this.messagesCount;
        Date date = this.lastRead;
        String str2 = this.lastReadMessageId;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "UnreadThread(parentMessageId=", str, ", messagesCount=", ", lastRead=");
        sbM30467u.append(date);
        sbM30467u.append(", lastReadMessageId=");
        sbM30467u.append(str2);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }
}
