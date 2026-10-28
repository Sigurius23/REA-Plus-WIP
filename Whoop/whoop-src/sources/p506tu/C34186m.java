package p506tu;

import com.google.gson.annotations.SerializedName;
import l83.InterfaceC23457c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: tu.m */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\u000e"}, m65681d2 = {"Ltu/m;", "", "", "a", "J", "getZoom", "()J", "zoom", "b", "getX", "x", "c", "getY", "y", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@InterfaceC23457c
public final /* data */ class C34186m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("z")
    private final long zoom;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("x")
    private final long x;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("y")
    private final long y;

    public C34186m(long j7, long j13, long j14) {
        this.zoom = j7;
        this.x = j13;
        this.y = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34186m)) {
            return false;
        }
        C34186m c34186m = (C34186m) obj;
        return this.zoom == c34186m.zoom && this.x == c34186m.x && this.y == c34186m.y;
    }

    public final int hashCode() {
        return Long.hashCode(this.y) + AbstractC11266d.m30451e(Long.hashCode(this.zoom) * 31, this.x, 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("TileID(zoom=");
        sb4.append(this.zoom);
        sb4.append(", x=");
        sb4.append(this.x);
        sb4.append(", y=");
        return AbstractC2875y.m8302o(sb4, this.y, ')');
    }
}
