package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.models.Option;
import io.getstream.chat.android.models.Vote;
import java.util.List;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;", "", "<init>", "()V", "Header", "Answer", "Close", "ShowAllOptions", "ViewResults", "SuggestOption", "AddComment", "ViewComments", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$AddComment;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Close;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Header;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ShowAllOptions;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$SuggestOption;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewComments;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewResults;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
abstract class PollItem {

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$AddComment;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class AddComment extends PollItem {
        public static final AddComment INSTANCE = new AddComment();

        private AddComment() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof AddComment);
        }

        public final int hashCode() {
            return -767193944;
        }

        public final String toString() {
            return "AddComment";
        }
    }

    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003JU\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\u0013\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\nHÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0014¨\u0006'"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;", "option", "Lio/getstream/chat/android/models/Option;", "votes", "", "Lio/getstream/chat/android/models/Vote;", "isVotedByUser", "", "voteCount", "", "totalVotes", "closed", "isWinner", "<init>", "(Lio/getstream/chat/android/models/Option;Ljava/util/List;ZIIZZ)V", "getOption", "()Lio/getstream/chat/android/models/Option;", "getVotes", "()Ljava/util/List;", "()Z", "getVoteCount", "()I", "getTotalVotes", "getClosed", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Answer extends PollItem {
        private final boolean closed;
        private final boolean isVotedByUser;
        private final boolean isWinner;
        private final Option option;
        private final int totalVotes;
        private final int voteCount;
        private final List<Vote> votes;

        public Answer(Option option, List<Vote> votes, boolean z4, int i13, int i14, boolean z13, boolean z14) {
            AbstractC22676k.m65750j(option, "option");
            AbstractC22676k.m65750j(votes, "votes");
            this.option = option;
            this.votes = votes;
            this.isVotedByUser = z4;
            this.voteCount = i13;
            this.totalVotes = i14;
            this.closed = z13;
            this.isWinner = z14;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Answer copy$default(Answer answer, Option option, List list, boolean z4, int i13, int i14, boolean z13, boolean z14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                option = answer.option;
            }
            if ((i15 & 2) != 0) {
                list = answer.votes;
            }
            if ((i15 & 4) != 0) {
                z4 = answer.isVotedByUser;
            }
            if ((i15 & 8) != 0) {
                i13 = answer.voteCount;
            }
            if ((i15 & 16) != 0) {
                i14 = answer.totalVotes;
            }
            if ((i15 & 32) != 0) {
                z13 = answer.closed;
            }
            if ((i15 & 64) != 0) {
                z14 = answer.isWinner;
            }
            boolean z15 = z13;
            boolean z16 = z14;
            int i16 = i14;
            boolean z17 = z4;
            return answer.copy(option, list, z17, i13, i16, z15, z16);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Option getOption() {
            return this.option;
        }

        public final List<Vote> component2() {
            return this.votes;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsVotedByUser() {
            return this.isVotedByUser;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getVoteCount() {
            return this.voteCount;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getTotalVotes() {
            return this.totalVotes;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getIsWinner() {
            return this.isWinner;
        }

        public final Answer copy(Option option, List<Vote> votes, boolean isVotedByUser, int voteCount, int totalVotes, boolean closed, boolean isWinner) {
            AbstractC22676k.m65750j(option, "option");
            AbstractC22676k.m65750j(votes, "votes");
            return new Answer(option, votes, isVotedByUser, voteCount, totalVotes, closed, isWinner);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Answer)) {
                return false;
            }
            Answer answer = (Answer) other;
            return AbstractC22676k.m65745e(this.option, answer.option) && AbstractC22676k.m65745e(this.votes, answer.votes) && this.isVotedByUser == answer.isVotedByUser && this.voteCount == answer.voteCount && this.totalVotes == answer.totalVotes && this.closed == answer.closed && this.isWinner == answer.isWinner;
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final Option getOption() {
            return this.option;
        }

        public final int getTotalVotes() {
            return this.totalVotes;
        }

        public final int getVoteCount() {
            return this.voteCount;
        }

        public final List<Vote> getVotes() {
            return this.votes;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isWinner) + AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.totalVotes, AbstractC11266d.m30448b(this.voteCount, AbstractC2875y.m8289b(AbstractC11895b.m31983b(this.option.hashCode() * 31, 31, this.votes), 31, this.isVotedByUser), 31), 31), 31, this.closed);
        }

        public final boolean isVotedByUser() {
            return this.isVotedByUser;
        }

        public final boolean isWinner() {
            return this.isWinner;
        }

        public final String toString() {
            Option option = this.option;
            List<Vote> list = this.votes;
            boolean z4 = this.isVotedByUser;
            int i13 = this.voteCount;
            int i14 = this.totalVotes;
            boolean z13 = this.closed;
            boolean z14 = this.isWinner;
            StringBuilder sb4 = new StringBuilder("Answer(option=");
            sb4.append(option);
            sb4.append(", votes=");
            sb4.append(list);
            sb4.append(", isVotedByUser=");
            AbstractC30802r.m94769r(i13, ", voteCount=", ", totalVotes=", sb4, z4);
            AbstractC13673n.m38573t(i14, ", closed=", ", isWinner=", sb4, z13);
            return AbstractC18489d0.m53372m(sb4, z14, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Close;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Close extends PollItem {
        public static final Close INSTANCE = new Close();

        private Close() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof Close);
        }

        public final int hashCode() {
            return -867768946;
        }

        public final String toString() {
            return "Close";
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Header;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;", "title", "", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Header extends PollItem {
        private final String subtitle;
        private final String title;

        public Header(String title, String subtitle) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            this.title = title;
            this.subtitle = subtitle;
        }

        public static /* synthetic */ Header copy$default(Header header, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = header.title;
            }
            if ((i13 & 2) != 0) {
                str2 = header.subtitle;
            }
            return header.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final Header copy(String title, String subtitle) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            return new Header(title, subtitle);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return AbstractC22676k.m65745e(this.title, header.title) && AbstractC22676k.m65745e(this.subtitle, header.subtitle);
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.subtitle.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return AbstractC2875y.m8300m("Header(title=", this.title, ", subtitle=", this.subtitle, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ShowAllOptions;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;", "count", "", "<init>", "(I)V", "getCount", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class ShowAllOptions extends PollItem {
        private final int count;

        public ShowAllOptions(int i13) {
            this.count = i13;
        }

        public static ShowAllOptions copy$default(ShowAllOptions showAllOptions, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i13 = showAllOptions.count;
            }
            showAllOptions.getClass();
            return new ShowAllOptions(i13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        public final ShowAllOptions copy(int count) {
            return new ShowAllOptions(count);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowAllOptions) && this.count == ((ShowAllOptions) other).count;
        }

        public final int getCount() {
            return this.count;
        }

        public final int hashCode() {
            return Integer.hashCode(this.count);
        }

        public final String toString() {
            return AbstractC2875y.m8296i(this.count, "ShowAllOptions(count=", ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$SuggestOption;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class SuggestOption extends PollItem {
        public static final SuggestOption INSTANCE = new SuggestOption();

        private SuggestOption() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof SuggestOption);
        }

        public final int hashCode() {
            return -569818449;
        }

        public final String toString() {
            return "SuggestOption";
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewComments;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;", "count", "", "<init>", "(I)V", "getCount", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class ViewComments extends PollItem {
        private final int count;

        public ViewComments(int i13) {
            this.count = i13;
        }

        public static ViewComments copy$default(ViewComments viewComments, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i13 = viewComments.count;
            }
            viewComments.getClass();
            return new ViewComments(i13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        public final ViewComments copy(int count) {
            return new ViewComments(count);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ViewComments) && this.count == ((ViewComments) other).count;
        }

        public final int getCount() {
            return this.count;
        }

        public final int hashCode() {
            return Integer.hashCode(this.count);
        }

        public final String toString() {
            return AbstractC2875y.m8296i(this.count, "ViewComments(count=", ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$ViewResults;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class ViewResults extends PollItem {
        public static final ViewResults INSTANCE = new ViewResults();

        private ViewResults() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof ViewResults);
        }

        public final int hashCode() {
            return 356500647;
        }

        public final String toString() {
            return "ViewResults";
        }
    }

    private PollItem() {
    }

    public PollItem(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
