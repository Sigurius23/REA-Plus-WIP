package live.hms.video.sessionstore;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m65681d2 = {"Llive/hms/video/sessionstore/SetSessionMetadataResult;", "", "changeVersion", "", "data", "Lcom/google/gson/JsonElement;", "updatedAt", "version", "", "<init>", "(JLcom/google/gson/JsonElement;JLjava/lang/String;)V", "getChangeVersion", "()J", "getData", "()Lcom/google/gson/JsonElement;", "getUpdatedAt", "getVersion", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class SetSessionMetadataResult {

    @SerializedName("change_version")
    private final long changeVersion;

    @SerializedName("data")
    private final JsonElement data;

    @SerializedName("updated_at")
    private final long updatedAt;

    @SerializedName("version")
    private final String version;

    public SetSessionMetadataResult(long j7, JsonElement jsonElement, long j13, String version) {
        AbstractC22676k.m65750j(version, "version");
        this.changeVersion = j7;
        this.data = jsonElement;
        this.updatedAt = j13;
        this.version = version;
    }

    public static /* synthetic */ SetSessionMetadataResult copy$default(SetSessionMetadataResult setSessionMetadataResult, long j7, JsonElement jsonElement, long j13, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = setSessionMetadataResult.changeVersion;
        }
        long j14 = j7;
        if ((i13 & 2) != 0) {
            jsonElement = setSessionMetadataResult.data;
        }
        JsonElement jsonElement2 = jsonElement;
        if ((i13 & 4) != 0) {
            j13 = setSessionMetadataResult.updatedAt;
        }
        long j15 = j13;
        if ((i13 & 8) != 0) {
            str = setSessionMetadataResult.version;
        }
        return setSessionMetadataResult.copy(j14, jsonElement2, j15, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getChangeVersion() {
        return this.changeVersion;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JsonElement getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final SetSessionMetadataResult copy(long changeVersion, JsonElement data, long updatedAt, String version) {
        AbstractC22676k.m65750j(version, "version");
        return new SetSessionMetadataResult(changeVersion, data, updatedAt, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetSessionMetadataResult)) {
            return false;
        }
        SetSessionMetadataResult setSessionMetadataResult = (SetSessionMetadataResult) other;
        return this.changeVersion == setSessionMetadataResult.changeVersion && AbstractC22676k.m65745e(this.data, setSessionMetadataResult.data) && this.updatedAt == setSessionMetadataResult.updatedAt && AbstractC22676k.m65745e(this.version, setSessionMetadataResult.version);
    }

    public final long getChangeVersion() {
        return this.changeVersion;
    }

    public final JsonElement getData() {
        return this.data;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.changeVersion) * 31;
        JsonElement jsonElement = this.data;
        return this.version.hashCode() + AbstractC11266d.m30451e((iHashCode + (jsonElement == null ? 0 : jsonElement.hashCode())) * 31, this.updatedAt, 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("SetSessionMetadataResult(changeVersion=");
        sb4.append(this.changeVersion);
        sb4.append(", data=");
        sb4.append(this.data);
        sb4.append(", updatedAt=");
        sb4.append(this.updatedAt);
        sb4.append(", version=");
        return AbstractC25012a.m73377j(sb4, this.version, ')');
    }
}
