package io.getstream.chat.android.p226ui.common.state.messages.poll;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.models.Option;
import io.getstream.chat.android.models.Vote;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState;", "", "pollName", "", "results", "", "Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getPollName", "()Ljava/lang/String;", "getResults", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ResultItem", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class PollResultsViewState {
    public static final int $stable = 8;
    private final String pollName;
    private final List<ResultItem> results;

    public PollResultsViewState(String pollName, List<ResultItem> results) {
        AbstractC22676k.m65750j(pollName, "pollName");
        AbstractC22676k.m65750j(results, "results");
        this.pollName = pollName;
        this.results = results;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PollResultsViewState copy$default(PollResultsViewState pollResultsViewState, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = pollResultsViewState.pollName;
        }
        if ((i13 & 2) != 0) {
            list = pollResultsViewState.results;
        }
        return pollResultsViewState.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPollName() {
        return this.pollName;
    }

    public final List<ResultItem> component2() {
        return this.results;
    }

    public final PollResultsViewState copy(String pollName, List<ResultItem> results) {
        AbstractC22676k.m65750j(pollName, "pollName");
        AbstractC22676k.m65750j(results, "results");
        return new PollResultsViewState(pollName, results);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollResultsViewState)) {
            return false;
        }
        PollResultsViewState pollResultsViewState = (PollResultsViewState) other;
        return AbstractC22676k.m65745e(this.pollName, pollResultsViewState.pollName) && AbstractC22676k.m65745e(this.results, pollResultsViewState.results);
    }

    public final String getPollName() {
        return this.pollName;
    }

    public final List<ResultItem> getResults() {
        return this.results;
    }

    public final int hashCode() {
        return this.results.hashCode() + (this.pollName.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC36095b.m114679g("PollResultsViewState(pollName=", this.pollName, ", results=", ")", this.results);
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006!"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;", "", "option", "Lio/getstream/chat/android/models/Option;", "isWinner", "", "voteCount", "", "votes", "", "Lio/getstream/chat/android/models/Vote;", "showAllButton", "<init>", "(Lio/getstream/chat/android/models/Option;ZILjava/util/List;Z)V", "getOption", "()Lio/getstream/chat/android/models/Option;", "()Z", "getVoteCount", "()I", "getVotes", "()Ljava/util/List;", "getShowAllButton", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class ResultItem {
        public static final int $stable = 8;
        private final boolean isWinner;
        private final Option option;
        private final boolean showAllButton;
        private final int voteCount;
        private final List<Vote> votes;

        public ResultItem(Option option, boolean z4, int i13, List<Vote> votes, boolean z13) {
            AbstractC22676k.m65750j(option, "option");
            AbstractC22676k.m65750j(votes, "votes");
            this.option = option;
            this.isWinner = z4;
            this.voteCount = i13;
            this.votes = votes;
            this.showAllButton = z13;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ResultItem copy$default(ResultItem resultItem, Option option, boolean z4, int i13, List list, boolean z13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                option = resultItem.option;
            }
            if ((i14 & 2) != 0) {
                z4 = resultItem.isWinner;
            }
            if ((i14 & 4) != 0) {
                i13 = resultItem.voteCount;
            }
            if ((i14 & 8) != 0) {
                list = resultItem.votes;
            }
            if ((i14 & 16) != 0) {
                z13 = resultItem.showAllButton;
            }
            boolean z14 = z13;
            int i15 = i13;
            return resultItem.copy(option, z4, i15, list, z14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Option getOption() {
            return this.option;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsWinner() {
            return this.isWinner;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getVoteCount() {
            return this.voteCount;
        }

        public final List<Vote> component4() {
            return this.votes;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getShowAllButton() {
            return this.showAllButton;
        }

        public final ResultItem copy(Option option, boolean isWinner, int voteCount, List<Vote> votes, boolean showAllButton) {
            AbstractC22676k.m65750j(option, "option");
            AbstractC22676k.m65750j(votes, "votes");
            return new ResultItem(option, isWinner, voteCount, votes, showAllButton);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResultItem)) {
                return false;
            }
            ResultItem resultItem = (ResultItem) other;
            return AbstractC22676k.m65745e(this.option, resultItem.option) && this.isWinner == resultItem.isWinner && this.voteCount == resultItem.voteCount && AbstractC22676k.m65745e(this.votes, resultItem.votes) && this.showAllButton == resultItem.showAllButton;
        }

        public final Option getOption() {
            return this.option;
        }

        public final boolean getShowAllButton() {
            return this.showAllButton;
        }

        public final int getVoteCount() {
            return this.voteCount;
        }

        public final List<Vote> getVotes() {
            return this.votes;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showAllButton) + AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.voteCount, AbstractC2875y.m8289b(this.option.hashCode() * 31, 31, this.isWinner), 31), 31, this.votes);
        }

        public final boolean isWinner() {
            return this.isWinner;
        }

        public final String toString() {
            Option option = this.option;
            boolean z4 = this.isWinner;
            int i13 = this.voteCount;
            List<Vote> list = this.votes;
            boolean z13 = this.showAllButton;
            StringBuilder sb4 = new StringBuilder("ResultItem(option=");
            sb4.append(option);
            sb4.append(", isWinner=");
            sb4.append(z4);
            sb4.append(", voteCount=");
            sb4.append(i13);
            sb4.append(", votes=");
            sb4.append(list);
            sb4.append(", showAllButton=");
            return AbstractC18489d0.m53372m(sb4, z13, ")");
        }

        public /* synthetic */ ResultItem(Option option, boolean z4, int i13, List list, boolean z13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(option, z4, i13, list, (i14 & 16) != 0 ? false : z13);
        }
    }
}
