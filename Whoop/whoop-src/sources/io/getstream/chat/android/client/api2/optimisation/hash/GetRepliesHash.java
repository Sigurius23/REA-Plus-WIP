package io.getstream.chat.android.client.api2.optimisation.hash;

import com.mapbox.maps.MapboxMap;
import ih0.AbstractC18489d0;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/optimisation/hash/GetRepliesHash;", "", "messageId", "", "firstId", MapboxMap.QFE_LIMIT, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getMessageId", "()Ljava/lang/String;", "getFirstId", "getLimit", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class GetRepliesHash {
    private final String firstId;
    private final int limit;
    private final String messageId;

    public GetRepliesHash(String messageId, String str, int i13) {
        AbstractC22676k.m65750j(messageId, "messageId");
        this.messageId = messageId;
        this.firstId = str;
        this.limit = i13;
    }

    public static /* synthetic */ GetRepliesHash copy$default(GetRepliesHash getRepliesHash, String str, String str2, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = getRepliesHash.messageId;
        }
        if ((i14 & 2) != 0) {
            str2 = getRepliesHash.firstId;
        }
        if ((i14 & 4) != 0) {
            i13 = getRepliesHash.limit;
        }
        return getRepliesHash.copy(str, str2, i13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirstId() {
        return this.firstId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    public final GetRepliesHash copy(String messageId, String firstId, int limit) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return new GetRepliesHash(messageId, firstId, limit);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetRepliesHash)) {
            return false;
        }
        GetRepliesHash getRepliesHash = (GetRepliesHash) other;
        return AbstractC22676k.m65745e(this.messageId, getRepliesHash.messageId) && AbstractC22676k.m65745e(this.firstId, getRepliesHash.firstId) && this.limit == getRepliesHash.limit;
    }

    public final String getFirstId() {
        return this.firstId;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final int hashCode() {
        int iHashCode = this.messageId.hashCode() * 31;
        String str = this.firstId;
        return Integer.hashCode(this.limit) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.messageId;
        String str2 = this.firstId;
        return AbstractC18489d0.m53371l(AbstractC11895b.m32001t("GetRepliesHash(messageId=", str, ", firstId=", str2, ", limit="), this.limit, ")");
    }
}
