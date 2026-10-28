package live.hms.video.polls.network;

import hc3.AbstractC17176i;
import java.util.List;
import live.hms.video.polls.models.PollStatsQuestions;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003JB\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m65681d2 = {"Llive/hms/video/polls/network/PollResultsDisplay;", "", "totalResponses", "", "votingUsers", "totalDistinctUsers", "questions", "", "Llive/hms/video/polls/models/PollStatsQuestions;", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)V", "getTotalResponses", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getVotingUsers", "getTotalDistinctUsers", "getQuestions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)Llive/hms/video/polls/network/PollResultsDisplay;", "equals", "", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class PollResultsDisplay {
    private final List<PollStatsQuestions> questions;
    private final Long totalDistinctUsers;
    private final Long totalResponses;
    private final Long votingUsers;

    public PollResultsDisplay(Long l7, Long l12, Long l13, List<PollStatsQuestions> questions) {
        AbstractC22676k.m65750j(questions, "questions");
        this.totalResponses = l7;
        this.votingUsers = l12;
        this.totalDistinctUsers = l13;
        this.questions = questions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PollResultsDisplay copy$default(PollResultsDisplay pollResultsDisplay, Long l7, Long l12, Long l13, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            l7 = pollResultsDisplay.totalResponses;
        }
        if ((i13 & 2) != 0) {
            l12 = pollResultsDisplay.votingUsers;
        }
        if ((i13 & 4) != 0) {
            l13 = pollResultsDisplay.totalDistinctUsers;
        }
        if ((i13 & 8) != 0) {
            list = pollResultsDisplay.questions;
        }
        return pollResultsDisplay.copy(l7, l12, l13, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getTotalResponses() {
        return this.totalResponses;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getVotingUsers() {
        return this.votingUsers;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getTotalDistinctUsers() {
        return this.totalDistinctUsers;
    }

    public final List<PollStatsQuestions> component4() {
        return this.questions;
    }

    public final PollResultsDisplay copy(Long totalResponses, Long votingUsers, Long totalDistinctUsers, List<PollStatsQuestions> questions) {
        AbstractC22676k.m65750j(questions, "questions");
        return new PollResultsDisplay(totalResponses, votingUsers, totalDistinctUsers, questions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollResultsDisplay)) {
            return false;
        }
        PollResultsDisplay pollResultsDisplay = (PollResultsDisplay) other;
        return AbstractC22676k.m65745e(this.totalResponses, pollResultsDisplay.totalResponses) && AbstractC22676k.m65745e(this.votingUsers, pollResultsDisplay.votingUsers) && AbstractC22676k.m65745e(this.totalDistinctUsers, pollResultsDisplay.totalDistinctUsers) && AbstractC22676k.m65745e(this.questions, pollResultsDisplay.questions);
    }

    public final List<PollStatsQuestions> getQuestions() {
        return this.questions;
    }

    public final Long getTotalDistinctUsers() {
        return this.totalDistinctUsers;
    }

    public final Long getTotalResponses() {
        return this.totalResponses;
    }

    public final Long getVotingUsers() {
        return this.votingUsers;
    }

    public int hashCode() {
        Long l7 = this.totalResponses;
        int iHashCode = (l7 == null ? 0 : l7.hashCode()) * 31;
        Long l12 = this.votingUsers;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.totalDistinctUsers;
        return this.questions.hashCode() + ((iHashCode2 + (l13 != null ? l13.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("PollResultsDisplay(totalResponses=");
        sb4.append(this.totalResponses);
        sb4.append(", votingUsers=");
        sb4.append(this.votingUsers);
        sb4.append(", totalDistinctUsers=");
        sb4.append(this.totalDistinctUsers);
        sb4.append(", questions=");
        return AbstractC17176i.m48506h(sb4, this.questions, ')');
    }

    public /* synthetic */ PollResultsDisplay(Long l7, Long l12, Long l13, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : l7, (i13 & 2) != 0 ? null : l12, (i13 & 4) != 0 ? null : l13, list);
    }
}
