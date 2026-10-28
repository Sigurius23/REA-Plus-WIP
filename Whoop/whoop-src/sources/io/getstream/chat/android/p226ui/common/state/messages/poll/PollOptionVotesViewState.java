package io.getstream.chat.android.p226ui.common.state.messages.poll;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Option;
import io.getstream.chat.android.models.Vote;
import java.util.List;
import m83.C25271y;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003JU\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001J\u0013\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0014¨\u0006%"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;", "", "option", "Lio/getstream/chat/android/models/Option;", "voteCount", "", "isWinner", "", "isLoading", "results", "", "Lio/getstream/chat/android/models/Vote;", "canLoadMore", "isLoadingMore", "<init>", "(Lio/getstream/chat/android/models/Option;IZZLjava/util/List;ZZ)V", "getOption", "()Lio/getstream/chat/android/models/Option;", "getVoteCount", "()I", "()Z", "getResults", "()Ljava/util/List;", "getCanLoadMore", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class PollOptionVotesViewState {
    public static final int $stable = 8;
    private final boolean canLoadMore;
    private final boolean isLoading;
    private final boolean isLoadingMore;
    private final boolean isWinner;
    private final Option option;
    private final List<Vote> results;
    private final int voteCount;

    public PollOptionVotesViewState(Option option, int i13, boolean z4, boolean z13, List<Vote> results, boolean z14, boolean z15) {
        AbstractC22676k.m65750j(option, "option");
        AbstractC22676k.m65750j(results, "results");
        this.option = option;
        this.voteCount = i13;
        this.isWinner = z4;
        this.isLoading = z13;
        this.results = results;
        this.canLoadMore = z14;
        this.isLoadingMore = z15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PollOptionVotesViewState copy$default(PollOptionVotesViewState pollOptionVotesViewState, Option option, int i13, boolean z4, boolean z13, List list, boolean z14, boolean z15, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            option = pollOptionVotesViewState.option;
        }
        if ((i14 & 2) != 0) {
            i13 = pollOptionVotesViewState.voteCount;
        }
        if ((i14 & 4) != 0) {
            z4 = pollOptionVotesViewState.isWinner;
        }
        if ((i14 & 8) != 0) {
            z13 = pollOptionVotesViewState.isLoading;
        }
        if ((i14 & 16) != 0) {
            list = pollOptionVotesViewState.results;
        }
        if ((i14 & 32) != 0) {
            z14 = pollOptionVotesViewState.canLoadMore;
        }
        if ((i14 & 64) != 0) {
            z15 = pollOptionVotesViewState.isLoadingMore;
        }
        boolean z16 = z14;
        boolean z17 = z15;
        List list2 = list;
        boolean z18 = z4;
        return pollOptionVotesViewState.copy(option, i13, z18, z13, list2, z16, z17);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Option getOption() {
        return this.option;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getVoteCount() {
        return this.voteCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsWinner() {
        return this.isWinner;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final List<Vote> component5() {
        return this.results;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getCanLoadMore() {
        return this.canLoadMore;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsLoadingMore() {
        return this.isLoadingMore;
    }

    public final PollOptionVotesViewState copy(Option option, int voteCount, boolean isWinner, boolean isLoading, List<Vote> results, boolean canLoadMore, boolean isLoadingMore) {
        AbstractC22676k.m65750j(option, "option");
        AbstractC22676k.m65750j(results, "results");
        return new PollOptionVotesViewState(option, voteCount, isWinner, isLoading, results, canLoadMore, isLoadingMore);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollOptionVotesViewState)) {
            return false;
        }
        PollOptionVotesViewState pollOptionVotesViewState = (PollOptionVotesViewState) other;
        return AbstractC22676k.m65745e(this.option, pollOptionVotesViewState.option) && this.voteCount == pollOptionVotesViewState.voteCount && this.isWinner == pollOptionVotesViewState.isWinner && this.isLoading == pollOptionVotesViewState.isLoading && AbstractC22676k.m65745e(this.results, pollOptionVotesViewState.results) && this.canLoadMore == pollOptionVotesViewState.canLoadMore && this.isLoadingMore == pollOptionVotesViewState.isLoadingMore;
    }

    public final boolean getCanLoadMore() {
        return this.canLoadMore;
    }

    public final Option getOption() {
        return this.option;
    }

    public final List<Vote> getResults() {
        return this.results;
    }

    public final int getVoteCount() {
        return this.voteCount;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isLoadingMore) + AbstractC2875y.m8289b(AbstractC11895b.m31983b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.voteCount, this.option.hashCode() * 31, 31), 31, this.isWinner), 31, this.isLoading), 31, this.results), 31, this.canLoadMore);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isLoadingMore() {
        return this.isLoadingMore;
    }

    public final boolean isWinner() {
        return this.isWinner;
    }

    public final String toString() {
        Option option = this.option;
        int i13 = this.voteCount;
        boolean z4 = this.isWinner;
        boolean z13 = this.isLoading;
        List<Vote> list = this.results;
        boolean z14 = this.canLoadMore;
        boolean z15 = this.isLoadingMore;
        StringBuilder sb4 = new StringBuilder("PollOptionVotesViewState(option=");
        sb4.append(option);
        sb4.append(", voteCount=");
        sb4.append(i13);
        sb4.append(", isWinner=");
        AbstractC38963t7.m124392v(sb4, z4, ", isLoading=", z13, ", results=");
        AbstractC26725a.m79512p(", canLoadMore=", ", isLoadingMore=", sb4, list, z14);
        return AbstractC18489d0.m53372m(sb4, z15, ")");
    }

    public /* synthetic */ PollOptionVotesViewState(Option option, int i13, boolean z4, boolean z13, List list, boolean z14, boolean z15, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(option, i13, z4, (i14 & 8) != 0 ? true : z13, (i14 & 16) != 0 ? C25271y.f99162w : list, (i14 & 32) != 0 ? true : z14, (i14 & 64) != 0 ? false : z15);
    }
}
