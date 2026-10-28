package live.hms.video.sessionstore;

import com.google.gson.annotations.SerializedName;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, m65681d2 = {"Llive/hms/video/sessionstore/SessionStoreResult;", "", "changeVersion", "", "updatedByPeerId", "", "data", "version", "key", "updatedAt", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getChangeVersion", "()J", "getUpdatedByPeerId", "()Ljava/lang/String;", "getData", "getVersion", "getKey", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class SessionStoreResult {

    @SerializedName("change_version")
    private final long changeVersion;

    @SerializedName("data")
    private final String data;

    @SerializedName("key")
    private final String key;

    @SerializedName("updated_at")
    private final long updatedAt;

    @SerializedName("updated_by")
    private final String updatedByPeerId;

    @SerializedName("version")
    private final String version;

    public SessionStoreResult(long j7, String str, String str2, String version, String key, long j13) {
        AbstractC22676k.m65750j(version, "version");
        AbstractC22676k.m65750j(key, "key");
        this.changeVersion = j7;
        this.updatedByPeerId = str;
        this.data = str2;
        this.version = version;
        this.key = key;
        this.updatedAt = j13;
    }

    public static /* synthetic */ SessionStoreResult copy$default(SessionStoreResult sessionStoreResult, long j7, String str, String str2, String str3, String str4, long j13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = sessionStoreResult.changeVersion;
        }
        long j14 = j7;
        if ((i13 & 2) != 0) {
            str = sessionStoreResult.updatedByPeerId;
        }
        String str5 = str;
        if ((i13 & 4) != 0) {
            str2 = sessionStoreResult.data;
        }
        String str6 = str2;
        if ((i13 & 8) != 0) {
            str3 = sessionStoreResult.version;
        }
        String str7 = str3;
        if ((i13 & 16) != 0) {
            str4 = sessionStoreResult.key;
        }
        return sessionStoreResult.copy(j14, str5, str6, str7, str4, (i13 & 32) != 0 ? sessionStoreResult.updatedAt : j13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getChangeVersion() {
        return this.changeVersion;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUpdatedByPeerId() {
        return this.updatedByPeerId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public final SessionStoreResult copy(long changeVersion, String updatedByPeerId, String data, String version, String key, long updatedAt) {
        AbstractC22676k.m65750j(version, "version");
        AbstractC22676k.m65750j(key, "key");
        return new SessionStoreResult(changeVersion, updatedByPeerId, data, version, key, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionStoreResult)) {
            return false;
        }
        SessionStoreResult sessionStoreResult = (SessionStoreResult) other;
        return this.changeVersion == sessionStoreResult.changeVersion && AbstractC22676k.m65745e(this.updatedByPeerId, sessionStoreResult.updatedByPeerId) && AbstractC22676k.m65745e(this.data, sessionStoreResult.data) && AbstractC22676k.m65745e(this.version, sessionStoreResult.version) && AbstractC22676k.m65745e(this.key, sessionStoreResult.key) && this.updatedAt == sessionStoreResult.updatedAt;
    }

    public final long getChangeVersion() {
        return this.changeVersion;
    }

    public final String getData() {
        return this.data;
    }

    public final String getKey() {
        return this.key;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUpdatedByPeerId() {
        return this.updatedByPeerId;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.changeVersion) * 31;
        String str = this.updatedByPeerId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.data;
        return Long.hashCode(this.updatedAt) + AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.version), 31, this.key);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("SessionStoreResult(changeVersion=");
        sb4.append(this.changeVersion);
        sb4.append(", updatedByPeerId=");
        sb4.append(this.updatedByPeerId);
        sb4.append(", data=");
        sb4.append(this.data);
        sb4.append(", version=");
        sb4.append(this.version);
        sb4.append(", key=");
        sb4.append(this.key);
        sb4.append(", updatedAt=");
        return AbstractC2875y.m8302o(sb4, this.updatedAt, ')');
    }
}
