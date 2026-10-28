package live.hms.video.utils;

import live.hms.video.error.HMSException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Llive/hms/video/utils/CheckedPermissions;", "", "permission", "", "errorToThrow", "Llive/hms/video/error/HMSException;", "<init>", "(Ljava/lang/String;Llive/hms/video/error/HMSException;)V", "getPermission", "()Ljava/lang/String;", "getErrorToThrow", "()Llive/hms/video/error/HMSException;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final /* data */ class CheckedPermissions {
    private final HMSException errorToThrow;
    private final String permission;

    public CheckedPermissions(String permission, HMSException errorToThrow) {
        AbstractC22676k.m65750j(permission, "permission");
        AbstractC22676k.m65750j(errorToThrow, "errorToThrow");
        this.permission = permission;
        this.errorToThrow = errorToThrow;
    }

    public static /* synthetic */ CheckedPermissions copy$default(CheckedPermissions checkedPermissions, String str, HMSException hMSException, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = checkedPermissions.permission;
        }
        if ((i13 & 2) != 0) {
            hMSException = checkedPermissions.errorToThrow;
        }
        return checkedPermissions.copy(str, hMSException);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPermission() {
        return this.permission;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HMSException getErrorToThrow() {
        return this.errorToThrow;
    }

    public final CheckedPermissions copy(String permission, HMSException errorToThrow) {
        AbstractC22676k.m65750j(permission, "permission");
        AbstractC22676k.m65750j(errorToThrow, "errorToThrow");
        return new CheckedPermissions(permission, errorToThrow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckedPermissions)) {
            return false;
        }
        CheckedPermissions checkedPermissions = (CheckedPermissions) other;
        return AbstractC22676k.m65745e(this.permission, checkedPermissions.permission) && AbstractC22676k.m65745e(this.errorToThrow, checkedPermissions.errorToThrow);
    }

    public final HMSException getErrorToThrow() {
        return this.errorToThrow;
    }

    public final String getPermission() {
        return this.permission;
    }

    public int hashCode() {
        return this.errorToThrow.hashCode() + (this.permission.hashCode() * 31);
    }

    public String toString() {
        return "CheckedPermissions(permission=" + this.permission + ", errorToThrow=" + this.errorToThrow + ')';
    }
}
