package live.hms.video.groups;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ,\u0010\f\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R,\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, m65681d2 = {"Llive/hms/video/groups/GroupJoinLeaveResponse;", "", "groups", "Lkotlin/collections/ArrayList;", "", "Ljava/util/ArrayList;", "<init>", "(Ljava/util/ArrayList;)V", "getGroups", "()Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "component1", "copy", "(Ljava/util/ArrayList;)Llive/hms/video/groups/GroupJoinLeaveResponse;", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class GroupJoinLeaveResponse {

    @SerializedName("groups")
    private final ArrayList<String> groups;

    public GroupJoinLeaveResponse(ArrayList<String> arrayList) {
        this.groups = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupJoinLeaveResponse copy$default(GroupJoinLeaveResponse groupJoinLeaveResponse, ArrayList arrayList, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            arrayList = groupJoinLeaveResponse.groups;
        }
        return groupJoinLeaveResponse.copy(arrayList);
    }

    public final ArrayList<String> component1() {
        return this.groups;
    }

    public final GroupJoinLeaveResponse copy(ArrayList<String> groups) {
        return new GroupJoinLeaveResponse(groups);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GroupJoinLeaveResponse) && AbstractC22676k.m65745e(this.groups, ((GroupJoinLeaveResponse) other).groups);
    }

    public final ArrayList<String> getGroups() {
        return this.groups;
    }

    public int hashCode() {
        ArrayList<String> arrayList = this.groups;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    public String toString() {
        return "GroupJoinLeaveResponse(groups=" + this.groups + ')';
    }
}
