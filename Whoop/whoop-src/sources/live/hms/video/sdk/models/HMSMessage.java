package live.hms.video.sdk.models;

import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003JG\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000f¨\u0006)"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSMessage;", "", "message", "", "type", "recipient", "Llive/hms/video/sdk/models/HMSMessageRecipient;", "serverReceiveTime", "", "sender", "Llive/hms/video/sdk/models/HMSPeer;", "messageId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSMessageRecipient;JLlive/hms/video/sdk/models/HMSPeer;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getType", "getRecipient", "()Llive/hms/video/sdk/models/HMSMessageRecipient;", "getServerReceiveTime", "()J", "setServerReceiveTime", "(J)V", "getSender", "()Llive/hms/video/sdk/models/HMSPeer;", "setSender", "(Llive/hms/video/sdk/models/HMSPeer;)V", "getMessageId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSMessage {
    private final String message;
    private final String messageId;
    private final HMSMessageRecipient recipient;
    private HMSPeer sender;
    private long serverReceiveTime;
    private final String type;

    public HMSMessage(String message, String type, HMSMessageRecipient recipient, long j7, HMSPeer hMSPeer, String messageId) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(recipient, "recipient");
        AbstractC22676k.m65750j(messageId, "messageId");
        this.message = message;
        this.type = type;
        this.recipient = recipient;
        this.serverReceiveTime = j7;
        this.sender = hMSPeer;
        this.messageId = messageId;
    }

    public static /* synthetic */ HMSMessage copy$default(HMSMessage hMSMessage, String str, String str2, HMSMessageRecipient hMSMessageRecipient, long j7, HMSPeer hMSPeer, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hMSMessage.message;
        }
        if ((i13 & 2) != 0) {
            str2 = hMSMessage.type;
        }
        if ((i13 & 4) != 0) {
            hMSMessageRecipient = hMSMessage.recipient;
        }
        if ((i13 & 8) != 0) {
            j7 = hMSMessage.serverReceiveTime;
        }
        if ((i13 & 16) != 0) {
            hMSPeer = hMSMessage.sender;
        }
        if ((i13 & 32) != 0) {
            str3 = hMSMessage.messageId;
        }
        long j13 = j7;
        HMSMessageRecipient hMSMessageRecipient2 = hMSMessageRecipient;
        return hMSMessage.copy(str, str2, hMSMessageRecipient2, j13, hMSPeer, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HMSMessageRecipient getRecipient() {
        return this.recipient;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getServerReceiveTime() {
        return this.serverReceiveTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HMSPeer getSender() {
        return this.sender;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    public final HMSMessage copy(String message, String type, HMSMessageRecipient recipient, long serverReceiveTime, HMSPeer sender, String messageId) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(recipient, "recipient");
        AbstractC22676k.m65750j(messageId, "messageId");
        return new HMSMessage(message, type, recipient, serverReceiveTime, sender, messageId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSMessage)) {
            return false;
        }
        HMSMessage hMSMessage = (HMSMessage) other;
        return AbstractC22676k.m65745e(this.message, hMSMessage.message) && AbstractC22676k.m65745e(this.type, hMSMessage.type) && AbstractC22676k.m65745e(this.recipient, hMSMessage.recipient) && this.serverReceiveTime == hMSMessage.serverReceiveTime && AbstractC22676k.m65745e(this.sender, hMSMessage.sender) && AbstractC22676k.m65745e(this.messageId, hMSMessage.messageId);
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final HMSMessageRecipient getRecipient() {
        return this.recipient;
    }

    public final HMSPeer getSender() {
        return this.sender;
    }

    public final long getServerReceiveTime() {
        return this.serverReceiveTime;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iM30451e = AbstractC11266d.m30451e((this.recipient.hashCode() + AbstractC11266d.m30450d(this.message.hashCode() * 31, 31, this.type)) * 31, this.serverReceiveTime, 31);
        HMSPeer hMSPeer = this.sender;
        return this.messageId.hashCode() + ((iM30451e + (hMSPeer == null ? 0 : hMSPeer.hashCode())) * 31);
    }

    public final void setSender(HMSPeer hMSPeer) {
        this.sender = hMSPeer;
    }

    public final void setServerReceiveTime(long j7) {
        this.serverReceiveTime = j7;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSMessage(message=");
        sb4.append(this.message);
        sb4.append(", type=");
        sb4.append(this.type);
        sb4.append(", recipient=");
        sb4.append(this.recipient);
        sb4.append(", serverReceiveTime=");
        sb4.append(this.serverReceiveTime);
        sb4.append(", sender=");
        sb4.append(this.sender);
        sb4.append(", messageId=");
        return AbstractC25012a.m73377j(sb4, this.messageId, ')');
    }

    public /* synthetic */ HMSMessage(String str, String str2, HMSMessageRecipient hMSMessageRecipient, long j7, HMSPeer hMSPeer, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 4) != 0) {
            hMSMessageRecipient = new HMSMessageRecipient(null, null, null, 7, null);
        }
        this(str, str2, hMSMessageRecipient, j7, hMSPeer, (i13 & 32) != 0 ? "" : str3);
    }
}
