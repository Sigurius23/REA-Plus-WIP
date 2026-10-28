package io.getstream.chat.android.client.api2.optimisation.hash;

import com.mapbox.maps.MapboxMap;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/optimisation/hash/GetNewerRepliesHash;", "", "parentId", "", MapboxMap.QFE_LIMIT, "", "lastId", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getParentId", "()Ljava/lang/String;", "getLimit", "()I", "getLastId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class GetNewerRepliesHash {
    private final String lastId;
    private final int limit;
    private final String parentId;

    public GetNewerRepliesHash(String parentId, int i13, String str) {
        AbstractC22676k.m65750j(parentId, "parentId");
        this.parentId = parentId;
        this.limit = i13;
        this.lastId = str;
    }

    public static /* synthetic */ GetNewerRepliesHash copy$default(GetNewerRepliesHash getNewerRepliesHash, String str, int i13, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = getNewerRepliesHash.parentId;
        }
        if ((i14 & 2) != 0) {
            i13 = getNewerRepliesHash.limit;
        }
        if ((i14 & 4) != 0) {
            str2 = getNewerRepliesHash.lastId;
        }
        return getNewerRepliesHash.copy(str, i13, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastId() {
        return this.lastId;
    }

    public final GetNewerRepliesHash copy(String parentId, int limit, String lastId) {
        AbstractC22676k.m65750j(parentId, "parentId");
        return new GetNewerRepliesHash(parentId, limit, lastId);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetNewerRepliesHash)) {
            return false;
        }
        GetNewerRepliesHash getNewerRepliesHash = (GetNewerRepliesHash) other;
        return AbstractC22676k.m65745e(this.parentId, getNewerRepliesHash.parentId) && this.limit == getNewerRepliesHash.limit && AbstractC22676k.m65745e(this.lastId, getNewerRepliesHash.lastId);
    }

    public final String getLastId() {
        return this.lastId;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.limit, this.parentId.hashCode() * 31, 31);
        String str = this.lastId;
        return iM30448b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.parentId;
        return AbstractC25012a.m73376i(this.lastId, ")", AbstractC11266d.m30467u(this.limit, "GetNewerRepliesHash(parentId=", str, ", limit=", ", lastId="));
    }
}
