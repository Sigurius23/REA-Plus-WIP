package live.hms.video.sdk.models.role;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, m65681d2 = {"Llive/hms/video/sdk/models/role/HMSWhiteBoardPermission;", "", "admin", "", "read", "write", "<init>", "(ZZZ)V", "getAdmin", "()Z", "setAdmin", "(Z)V", "getRead", "setRead", "getWrite", "setWrite", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSWhiteBoardPermission {
    private boolean admin;
    private boolean read;
    private boolean write;

    public HMSWhiteBoardPermission(boolean z4, boolean z13, boolean z14) {
        this.admin = z4;
        this.read = z13;
        this.write = z14;
    }

    public static /* synthetic */ HMSWhiteBoardPermission copy$default(HMSWhiteBoardPermission hMSWhiteBoardPermission, boolean z4, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = hMSWhiteBoardPermission.admin;
        }
        if ((i13 & 2) != 0) {
            z13 = hMSWhiteBoardPermission.read;
        }
        if ((i13 & 4) != 0) {
            z14 = hMSWhiteBoardPermission.write;
        }
        return hMSWhiteBoardPermission.copy(z4, z13, z14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAdmin() {
        return this.admin;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    public final HMSWhiteBoardPermission copy(boolean admin, boolean read, boolean write) {
        return new HMSWhiteBoardPermission(admin, read, write);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSWhiteBoardPermission)) {
            return false;
        }
        HMSWhiteBoardPermission hMSWhiteBoardPermission = (HMSWhiteBoardPermission) other;
        return this.admin == hMSWhiteBoardPermission.admin && this.read == hMSWhiteBoardPermission.read && this.write == hMSWhiteBoardPermission.write;
    }

    public final boolean getAdmin() {
        return this.admin;
    }

    public final boolean getRead() {
        return this.read;
    }

    public final boolean getWrite() {
        return this.write;
    }

    public int hashCode() {
        return Boolean.hashCode(this.write) + AbstractC2875y.m8289b(Boolean.hashCode(this.admin) * 31, 31, this.read);
    }

    public final void setAdmin(boolean z4) {
        this.admin = z4;
    }

    public final void setRead(boolean z4) {
        this.read = z4;
    }

    public final void setWrite(boolean z4) {
        this.write = z4;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSWhiteBoardPermission(admin=");
        sb4.append(this.admin);
        sb4.append(", read=");
        sb4.append(this.read);
        sb4.append(", write=");
        return AbstractC2875y.m8305r(sb4, this.write, ')');
    }
}
