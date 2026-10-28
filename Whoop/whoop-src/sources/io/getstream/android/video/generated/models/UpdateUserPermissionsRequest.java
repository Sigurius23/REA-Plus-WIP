package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import java.util.List;
import m83.C25271y;
import p000.AbstractC30802r;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J7\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/android/video/generated/models/UpdateUserPermissionsRequest;", "", "userId", "", "grantPermissions", "", "revokePermissions", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getGrantPermissions", "()Ljava/util/List;", "getRevokePermissions", "getUserId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class UpdateUserPermissionsRequest {
    private final List<String> grantPermissions;
    private final List<String> revokePermissions;
    private final String userId;

    public UpdateUserPermissionsRequest(@InterfaceC30731q(name = "user_id") String userId, @InterfaceC30731q(name = "grant_permissions") List<String> list, @InterfaceC30731q(name = "revoke_permissions") List<String> list2) {
        AbstractC22676k.m65750j(userId, "userId");
        this.userId = userId;
        this.grantPermissions = list;
        this.revokePermissions = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateUserPermissionsRequest copy$default(UpdateUserPermissionsRequest updateUserPermissionsRequest, String str, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = updateUserPermissionsRequest.userId;
        }
        if ((i13 & 2) != 0) {
            list = updateUserPermissionsRequest.grantPermissions;
        }
        if ((i13 & 4) != 0) {
            list2 = updateUserPermissionsRequest.revokePermissions;
        }
        return updateUserPermissionsRequest.copy(str, list, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final List<String> component2() {
        return this.grantPermissions;
    }

    public final List<String> component3() {
        return this.revokePermissions;
    }

    public final UpdateUserPermissionsRequest copy(@InterfaceC30731q(name = "user_id") String userId, @InterfaceC30731q(name = "grant_permissions") List<String> grantPermissions, @InterfaceC30731q(name = "revoke_permissions") List<String> revokePermissions) {
        AbstractC22676k.m65750j(userId, "userId");
        return new UpdateUserPermissionsRequest(userId, grantPermissions, revokePermissions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateUserPermissionsRequest)) {
            return false;
        }
        UpdateUserPermissionsRequest updateUserPermissionsRequest = (UpdateUserPermissionsRequest) other;
        return AbstractC22676k.m65745e(this.userId, updateUserPermissionsRequest.userId) && AbstractC22676k.m65745e(this.grantPermissions, updateUserPermissionsRequest.grantPermissions) && AbstractC22676k.m65745e(this.revokePermissions, updateUserPermissionsRequest.revokePermissions);
    }

    public final List<String> getGrantPermissions() {
        return this.grantPermissions;
    }

    public final List<String> getRevokePermissions() {
        return this.revokePermissions;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = this.userId.hashCode() * 31;
        List<String> list = this.grantPermissions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.revokePermissions;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        String str = this.userId;
        List<String> list = this.grantPermissions;
        return AbstractC3855a.m11829m(AbstractC30802r.m94766o("UpdateUserPermissionsRequest(userId=", str, ", grantPermissions=", ", revokePermissions=", list), this.revokePermissions, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UpdateUserPermissionsRequest(String str, List list, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 2;
        C25271y c25271y = C25271y.f99162w;
        this(str, i14 != 0 ? c25271y : list, (i13 & 4) != 0 ? c25271y : list2);
    }
}
