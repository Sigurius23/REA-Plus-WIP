package io.getstream.chat.android.p226ui.common.state.channel.info;

import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.User;
import java.util.List;
import java.util.Set;
import m83.C25235a0;
import m83.C25271y;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\tJ\u000e\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\tJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bHÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bHÆ\u0003JW\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006&"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;", "", "isLoading", "", "isLoadingMore", "query", "", "searchResult", "", "Lio/getstream/chat/android/models/User;", "selectedUserIds", "", "loadedMemberIds", "<init>", "(ZZLjava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V", "()Z", "getQuery", "()Ljava/lang/String;", "getSearchResult", "()Ljava/util/List;", "getSelectedUserIds", "()Ljava/util/Set;", "getLoadedMemberIds", "isSelected", UserState.Sources.USER, "isAlreadyMember", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class AddMembersViewState {
    public static final int $stable = 8;
    private final boolean isLoading;
    private final boolean isLoadingMore;
    private final Set<String> loadedMemberIds;
    private final String query;
    private final List<User> searchResult;
    private final Set<String> selectedUserIds;

    public AddMembersViewState() {
        this(false, false, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddMembersViewState copy$default(AddMembersViewState addMembersViewState, boolean z4, boolean z13, String str, List list, Set set, Set set2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = addMembersViewState.isLoading;
        }
        if ((i13 & 2) != 0) {
            z13 = addMembersViewState.isLoadingMore;
        }
        if ((i13 & 4) != 0) {
            str = addMembersViewState.query;
        }
        if ((i13 & 8) != 0) {
            list = addMembersViewState.searchResult;
        }
        if ((i13 & 16) != 0) {
            set = addMembersViewState.selectedUserIds;
        }
        if ((i13 & 32) != 0) {
            set2 = addMembersViewState.loadedMemberIds;
        }
        Set set3 = set;
        Set set4 = set2;
        return addMembersViewState.copy(z4, z13, str, list, set3, set4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsLoadingMore() {
        return this.isLoadingMore;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    public final List<User> component4() {
        return this.searchResult;
    }

    public final Set<String> component5() {
        return this.selectedUserIds;
    }

    public final Set<String> component6() {
        return this.loadedMemberIds;
    }

    public final AddMembersViewState copy(boolean isLoading, boolean isLoadingMore, String query, List<User> searchResult, Set<String> selectedUserIds, Set<String> loadedMemberIds) {
        AbstractC22676k.m65750j(query, "query");
        AbstractC22676k.m65750j(searchResult, "searchResult");
        AbstractC22676k.m65750j(selectedUserIds, "selectedUserIds");
        AbstractC22676k.m65750j(loadedMemberIds, "loadedMemberIds");
        return new AddMembersViewState(isLoading, isLoadingMore, query, searchResult, selectedUserIds, loadedMemberIds);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddMembersViewState)) {
            return false;
        }
        AddMembersViewState addMembersViewState = (AddMembersViewState) other;
        return this.isLoading == addMembersViewState.isLoading && this.isLoadingMore == addMembersViewState.isLoadingMore && AbstractC22676k.m65745e(this.query, addMembersViewState.query) && AbstractC22676k.m65745e(this.searchResult, addMembersViewState.searchResult) && AbstractC22676k.m65745e(this.selectedUserIds, addMembersViewState.selectedUserIds) && AbstractC22676k.m65745e(this.loadedMemberIds, addMembersViewState.loadedMemberIds);
    }

    public final Set<String> getLoadedMemberIds() {
        return this.loadedMemberIds;
    }

    public final String getQuery() {
        return this.query;
    }

    public final List<User> getSearchResult() {
        return this.searchResult;
    }

    public final Set<String> getSelectedUserIds() {
        return this.selectedUserIds;
    }

    public final int hashCode() {
        return this.loadedMemberIds.hashCode() + AbstractC25012a.m73368a(this.selectedUserIds, AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isLoadingMore), 31, this.query), 31, this.searchResult), 31);
    }

    public final boolean isAlreadyMember(User user) {
        AbstractC22676k.m65750j(user, "user");
        return this.loadedMemberIds.contains(user.getId());
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isLoadingMore() {
        return this.isLoadingMore;
    }

    public final boolean isSelected(User user) {
        AbstractC22676k.m65750j(user, "user");
        return this.selectedUserIds.contains(user.getId());
    }

    public final String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isLoadingMore;
        String str = this.query;
        List<User> list = this.searchResult;
        Set<String> set = this.selectedUserIds;
        Set<String> set2 = this.loadedMemberIds;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("AddMembersViewState(isLoading=", ", isLoadingMore=", ", query=", z4, z13);
        AbstractC36095b.m114694v(str, ", searchResult=", ", selectedUserIds=", sbM32002u, list);
        sbM32002u.append(set);
        sbM32002u.append(", loadedMemberIds=");
        sbM32002u.append(set2);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public AddMembersViewState(boolean z4, boolean z13, String query, List<User> searchResult, Set<String> selectedUserIds, Set<String> loadedMemberIds) {
        AbstractC22676k.m65750j(query, "query");
        AbstractC22676k.m65750j(searchResult, "searchResult");
        AbstractC22676k.m65750j(selectedUserIds, "selectedUserIds");
        AbstractC22676k.m65750j(loadedMemberIds, "loadedMemberIds");
        this.isLoading = z4;
        this.isLoadingMore = z13;
        this.query = query;
        this.searchResult = searchResult;
        this.selectedUserIds = selectedUserIds;
        this.loadedMemberIds = loadedMemberIds;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AddMembersViewState(boolean z4, boolean z13, String str, List list, Set set, Set set2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        z4 = (i13 & 1) != 0 ? true : z4;
        z13 = (i13 & 2) != 0 ? false : z13;
        str = (i13 & 4) != 0 ? "" : str;
        list = (i13 & 8) != 0 ? C25271y.f99162w : list;
        int i14 = i13 & 16;
        C25235a0 c25235a0 = C25235a0.f99113w;
        this(z4, z13, str, list, i14 != 0 ? c25235a0 : set, (i13 & 32) != 0 ? c25235a0 : set2);
    }
}
