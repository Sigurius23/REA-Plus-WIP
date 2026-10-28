package live.hms.video.sessionstore;

import com.google.gson.annotations.SerializedName;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m65681d2 = {"Llive/hms/video/sessionstore/SetMetadataListenerResult;", "", "total", "", "version", "", "<init>", "(ILjava/lang/String;)V", "getTotal", "()I", "getVersion", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class SetMetadataListenerResult {

    @SerializedName("total")
    private final int total;

    @SerializedName("version")
    private final String version;

    public SetMetadataListenerResult(int i13, String version) {
        AbstractC22676k.m65750j(version, "version");
        this.total = i13;
        this.version = version;
    }

    public static /* synthetic */ SetMetadataListenerResult copy$default(SetMetadataListenerResult setMetadataListenerResult, int i13, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = setMetadataListenerResult.total;
        }
        if ((i14 & 2) != 0) {
            str = setMetadataListenerResult.version;
        }
        return setMetadataListenerResult.copy(i13, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final SetMetadataListenerResult copy(int total, String version) {
        AbstractC22676k.m65750j(version, "version");
        return new SetMetadataListenerResult(total, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetMetadataListenerResult)) {
            return false;
        }
        SetMetadataListenerResult setMetadataListenerResult = (SetMetadataListenerResult) other;
        return this.total == setMetadataListenerResult.total && AbstractC22676k.m65745e(this.version, setMetadataListenerResult.version);
    }

    public final int getTotal() {
        return this.total;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.version.hashCode() + (Integer.hashCode(this.total) * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("SetMetadataListenerResult(total=");
        sb4.append(this.total);
        sb4.append(", version=");
        return AbstractC25012a.m73377j(sb4, this.version, ')');
    }
}
