package io.getstream.chat.android.client.receipts;

import java.util.Date;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/client/receipts/MessageReceipt;", "", "messageId", "", "cid", "createdAt", "Ljava/util/Date;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V", "getMessageId", "()Ljava/lang/String;", "getCid", "getCreatedAt", "()Ljava/util/Date;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessageReceipt {
    private final String cid;
    private final Date createdAt;
    private final String messageId;

    public MessageReceipt(String messageId, String cid, Date createdAt) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        this.messageId = messageId;
        this.cid = cid;
        this.createdAt = createdAt;
    }

    public static /* synthetic */ MessageReceipt copy$default(MessageReceipt messageReceipt, String str, String str2, Date date, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = messageReceipt.messageId;
        }
        if ((i13 & 2) != 0) {
            str2 = messageReceipt.cid;
        }
        if ((i13 & 4) != 0) {
            date = messageReceipt.createdAt;
        }
        return messageReceipt.copy(str, str2, date);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final MessageReceipt copy(String messageId, String cid, Date createdAt) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        return new MessageReceipt(messageId, cid, createdAt);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageReceipt)) {
            return false;
        }
        MessageReceipt messageReceipt = (MessageReceipt) other;
        return AbstractC22676k.m65745e(this.messageId, messageReceipt.messageId) && AbstractC22676k.m65745e(this.cid, messageReceipt.cid) && AbstractC22676k.m65745e(this.createdAt, messageReceipt.createdAt);
    }

    public final String getCid() {
        return this.cid;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final int hashCode() {
        return this.createdAt.hashCode() + AbstractC11266d.m30450d(this.messageId.hashCode() * 31, 31, this.cid);
    }

    public final String toString() {
        String str = this.messageId;
        String str2 = this.cid;
        return AbstractC13673n.m38564k(AbstractC11895b.m32001t("MessageReceipt(messageId=", str, ", cid=", str2, ", createdAt="), this.createdAt, ")");
    }
}
