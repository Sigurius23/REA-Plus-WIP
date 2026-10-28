package live.hms.video.sdk.models;

import com.google.gson.annotations.SerializedName;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSMessageSendResponse;", "", "timestamp", "", "messageId", "", "<init>", "(JLjava/lang/String;)V", "getTimestamp", "()J", "getMessageId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSMessageSendResponse {

    @SerializedName("message_id")
    private final String messageId;

    @SerializedName("timestamp")
    private final long timestamp;

    public HMSMessageSendResponse(long j7, String str) {
        this.timestamp = j7;
        this.messageId = str;
    }

    public static /* synthetic */ HMSMessageSendResponse copy$default(HMSMessageSendResponse hMSMessageSendResponse, long j7, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = hMSMessageSendResponse.timestamp;
        }
        if ((i13 & 2) != 0) {
            str = hMSMessageSendResponse.messageId;
        }
        return hMSMessageSendResponse.copy(j7, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    public final HMSMessageSendResponse copy(long timestamp, String messageId) {
        return new HMSMessageSendResponse(timestamp, messageId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSMessageSendResponse)) {
            return false;
        }
        HMSMessageSendResponse hMSMessageSendResponse = (HMSMessageSendResponse) other;
        return this.timestamp == hMSMessageSendResponse.timestamp && AbstractC22676k.m65745e(this.messageId, hMSMessageSendResponse.messageId);
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.timestamp) * 31;
        String str = this.messageId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSMessageSendResponse(timestamp=");
        sb4.append(this.timestamp);
        sb4.append(", messageId=");
        return AbstractC25012a.m73377j(sb4, this.messageId, ')');
    }

    public /* synthetic */ HMSMessageSendResponse(long j7, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, (i13 & 2) != 0 ? "" : str);
    }
}
