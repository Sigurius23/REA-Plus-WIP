package io.getstream.chat.android.p226ui.common.state.mentions;

import io.getstream.chat.android.p226ui.common.model.MessageResult;
import java.util.List;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÀ\u0003¢\u0006\u0002\b\u0017J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JM\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000e¨\u0006!"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/mentions/MentionListState;", "", "isLoading", "", "results", "", "Lio/getstream/chat/android/ui/common/model/MessageResult;", "nextPage", "", "canLoadMore", "isLoadingMore", "isRefreshing", "<init>", "(ZLjava/util/List;Ljava/lang/String;ZZZ)V", "()Z", "getResults", "()Ljava/util/List;", "getNextPage$stream_chat_android_ui_common_release", "()Ljava/lang/String;", "getCanLoadMore", "component1", "component2", "component3", "component3$stream_chat_android_ui_common_release", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MentionListState {
    public static final int $stable = 8;
    private final boolean canLoadMore;
    private final boolean isLoading;
    private final boolean isLoadingMore;
    private final boolean isRefreshing;
    private final String nextPage;
    private final List<MessageResult> results;

    public MentionListState() {
        this(false, null, null, false, false, false, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MentionListState copy$default(MentionListState mentionListState, boolean z4, List list, String str, boolean z13, boolean z14, boolean z15, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = mentionListState.isLoading;
        }
        if ((i13 & 2) != 0) {
            list = mentionListState.results;
        }
        if ((i13 & 4) != 0) {
            str = mentionListState.nextPage;
        }
        if ((i13 & 8) != 0) {
            z13 = mentionListState.canLoadMore;
        }
        if ((i13 & 16) != 0) {
            z14 = mentionListState.isLoadingMore;
        }
        if ((i13 & 32) != 0) {
            z15 = mentionListState.isRefreshing;
        }
        boolean z16 = z14;
        boolean z17 = z15;
        return mentionListState.copy(z4, list, str, z13, z16, z17);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final List<MessageResult> component2() {
        return this.results;
    }

    /* JADX INFO: renamed from: component3$stream_chat_android_ui_common_release, reason: from getter */
    public final String getNextPage() {
        return this.nextPage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getCanLoadMore() {
        return this.canLoadMore;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsLoadingMore() {
        return this.isLoadingMore;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsRefreshing() {
        return this.isRefreshing;
    }

    public final MentionListState copy(boolean isLoading, List<MessageResult> results, String nextPage, boolean canLoadMore, boolean isLoadingMore, boolean isRefreshing) {
        AbstractC22676k.m65750j(results, "results");
        return new MentionListState(isLoading, results, nextPage, canLoadMore, isLoadingMore, isRefreshing);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MentionListState)) {
            return false;
        }
        MentionListState mentionListState = (MentionListState) other;
        return this.isLoading == mentionListState.isLoading && AbstractC22676k.m65745e(this.results, mentionListState.results) && AbstractC22676k.m65745e(this.nextPage, mentionListState.nextPage) && this.canLoadMore == mentionListState.canLoadMore && this.isLoadingMore == mentionListState.isLoadingMore && this.isRefreshing == mentionListState.isRefreshing;
    }

    public final boolean getCanLoadMore() {
        return this.canLoadMore;
    }

    public final String getNextPage$stream_chat_android_ui_common_release() {
        return this.nextPage;
    }

    public final List<MessageResult> getResults() {
        return this.results;
    }

    public final int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(Boolean.hashCode(this.isLoading) * 31, 31, this.results);
        String str = this.nextPage;
        return Boolean.hashCode(this.isRefreshing) + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM31983b + (str == null ? 0 : str.hashCode())) * 31, 31, this.canLoadMore), 31, this.isLoadingMore);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isLoadingMore() {
        return this.isLoadingMore;
    }

    public final boolean isRefreshing() {
        return this.isRefreshing;
    }

    public final String toString() {
        boolean z4 = this.isLoading;
        List<MessageResult> list = this.results;
        String str = this.nextPage;
        boolean z13 = this.canLoadMore;
        boolean z14 = this.isLoadingMore;
        boolean z15 = this.isRefreshing;
        StringBuilder sb4 = new StringBuilder("MentionListState(isLoading=");
        sb4.append(z4);
        sb4.append(", results=");
        sb4.append(list);
        sb4.append(", nextPage=");
        AbstractC38963t7.m124390t(sb4, str, ", canLoadMore=", z13, ", isLoadingMore=");
        return AbstractC36095b.m114682j(sb4, z14, ", isRefreshing=", z15, ")");
    }

    public MentionListState(boolean z4, List<MessageResult> results, String str, boolean z13, boolean z14, boolean z15) {
        AbstractC22676k.m65750j(results, "results");
        this.isLoading = z4;
        this.results = results;
        this.nextPage = str;
        this.canLoadMore = z13;
        this.isLoadingMore = z14;
        this.isRefreshing = z15;
    }

    public /* synthetic */ MentionListState(boolean z4, List list, String str, boolean z13, boolean z14, boolean z15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? true : z13, (i13 & 16) != 0 ? false : z14, (i13 & 32) != 0 ? false : z15);
    }
}
