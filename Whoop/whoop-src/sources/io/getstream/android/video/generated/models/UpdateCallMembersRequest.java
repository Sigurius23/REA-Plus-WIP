package io.getstream.android.video.generated.models;

import java.util.List;
import m83.C25271y;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/android/video/generated/models/UpdateCallMembersRequest;", "", "removeMembers", "", "", "updateMembers", "Lio/getstream/android/video/generated/models/MemberRequest;", "(Ljava/util/List;Ljava/util/List;)V", "getRemoveMembers", "()Ljava/util/List;", "getUpdateMembers", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class UpdateCallMembersRequest {
    private final List<String> removeMembers;
    private final List<MemberRequest> updateMembers;

    /* JADX WARN: Multi-variable type inference failed */
    public UpdateCallMembersRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateCallMembersRequest copy$default(UpdateCallMembersRequest updateCallMembersRequest, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = updateCallMembersRequest.removeMembers;
        }
        if ((i13 & 2) != 0) {
            list2 = updateCallMembersRequest.updateMembers;
        }
        return updateCallMembersRequest.copy(list, list2);
    }

    public final List<String> component1() {
        return this.removeMembers;
    }

    public final List<MemberRequest> component2() {
        return this.updateMembers;
    }

    public final UpdateCallMembersRequest copy(@InterfaceC30731q(name = "remove_members") List<String> removeMembers, @InterfaceC30731q(name = "update_members") List<MemberRequest> updateMembers) {
        return new UpdateCallMembersRequest(removeMembers, updateMembers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateCallMembersRequest)) {
            return false;
        }
        UpdateCallMembersRequest updateCallMembersRequest = (UpdateCallMembersRequest) other;
        return AbstractC22676k.m65745e(this.removeMembers, updateCallMembersRequest.removeMembers) && AbstractC22676k.m65745e(this.updateMembers, updateCallMembersRequest.updateMembers);
    }

    public final List<String> getRemoveMembers() {
        return this.removeMembers;
    }

    public final List<MemberRequest> getUpdateMembers() {
        return this.updateMembers;
    }

    public int hashCode() {
        List<String> list = this.removeMembers;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<MemberRequest> list2 = this.updateMembers;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return AbstractC13673n.m38562i("UpdateCallMembersRequest(removeMembers=", ", updateMembers=", this.removeMembers, ")", this.updateMembers);
    }

    public UpdateCallMembersRequest(@InterfaceC30731q(name = "remove_members") List<String> list, @InterfaceC30731q(name = "update_members") List<MemberRequest> list2) {
        this.removeMembers = list;
        this.updateMembers = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UpdateCallMembersRequest(List list, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 1;
        C25271y c25271y = C25271y.f99162w;
        this(i14 != 0 ? c25271y : list, (i13 & 2) != 0 ? c25271y : list2);
    }
}
