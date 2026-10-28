package live.hms.video.polls.network;

import com.google.gson.annotations.SerializedName;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import live.hms.video.polls.models.network.HMSPollResponsePeerInfo;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003Jb\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0014\u0010\u000fR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006*"}, m65681d2 = {"Llive/hms/video/polls/network/LeaderboardQuestion;", "", "questionIndex", "", "position", AttachmentExtensionsKt.EXTRA_DURATION, "totalResponse", "correctResponses", "score", "", "pollPeer", "Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;)V", "getQuestionIndex", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPosition", "getDuration", "getTotalResponse", "getCorrectResponses", "getScore", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getPollPeer", "()Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;)Llive/hms/video/polls/network/LeaderboardQuestion;", "equals", "", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class LeaderboardQuestion {

    @SerializedName("correct_responses")
    private final Long correctResponses;

    @SerializedName(AttachmentExtensionsKt.EXTRA_DURATION)
    private final Long duration;

    @SerializedName("peer")
    private final HMSPollResponsePeerInfo pollPeer;

    @SerializedName("position")
    private final Long position;

    @SerializedName("question")
    private final Long questionIndex;

    @SerializedName("score")
    private final Float score;

    @SerializedName("total_responses")
    private final Long totalResponse;

    public LeaderboardQuestion(Long l7, Long l12, Long l13, Long l14, Long l15, Float f13, HMSPollResponsePeerInfo hMSPollResponsePeerInfo) {
        this.questionIndex = l7;
        this.position = l12;
        this.duration = l13;
        this.totalResponse = l14;
        this.correctResponses = l15;
        this.score = f13;
        this.pollPeer = hMSPollResponsePeerInfo;
    }

    public static /* synthetic */ LeaderboardQuestion copy$default(LeaderboardQuestion leaderboardQuestion, Long l7, Long l12, Long l13, Long l14, Long l15, Float f13, HMSPollResponsePeerInfo hMSPollResponsePeerInfo, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            l7 = leaderboardQuestion.questionIndex;
        }
        if ((i13 & 2) != 0) {
            l12 = leaderboardQuestion.position;
        }
        if ((i13 & 4) != 0) {
            l13 = leaderboardQuestion.duration;
        }
        if ((i13 & 8) != 0) {
            l14 = leaderboardQuestion.totalResponse;
        }
        if ((i13 & 16) != 0) {
            l15 = leaderboardQuestion.correctResponses;
        }
        if ((i13 & 32) != 0) {
            f13 = leaderboardQuestion.score;
        }
        if ((i13 & 64) != 0) {
            hMSPollResponsePeerInfo = leaderboardQuestion.pollPeer;
        }
        Float f14 = f13;
        HMSPollResponsePeerInfo hMSPollResponsePeerInfo2 = hMSPollResponsePeerInfo;
        Long l16 = l15;
        Long l17 = l13;
        return leaderboardQuestion.copy(l7, l12, l17, l14, l16, f14, hMSPollResponsePeerInfo2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getQuestionIndex() {
        return this.questionIndex;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getTotalResponse() {
        return this.totalResponse;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getCorrectResponses() {
        return this.correctResponses;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Float getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final HMSPollResponsePeerInfo getPollPeer() {
        return this.pollPeer;
    }

    public final LeaderboardQuestion copy(Long questionIndex, Long position, Long duration, Long totalResponse, Long correctResponses, Float score, HMSPollResponsePeerInfo pollPeer) {
        return new LeaderboardQuestion(questionIndex, position, duration, totalResponse, correctResponses, score, pollPeer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeaderboardQuestion)) {
            return false;
        }
        LeaderboardQuestion leaderboardQuestion = (LeaderboardQuestion) other;
        return AbstractC22676k.m65745e(this.questionIndex, leaderboardQuestion.questionIndex) && AbstractC22676k.m65745e(this.position, leaderboardQuestion.position) && AbstractC22676k.m65745e(this.duration, leaderboardQuestion.duration) && AbstractC22676k.m65745e(this.totalResponse, leaderboardQuestion.totalResponse) && AbstractC22676k.m65745e(this.correctResponses, leaderboardQuestion.correctResponses) && AbstractC22676k.m65745e(this.score, leaderboardQuestion.score) && AbstractC22676k.m65745e(this.pollPeer, leaderboardQuestion.pollPeer);
    }

    public final Long getCorrectResponses() {
        return this.correctResponses;
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final HMSPollResponsePeerInfo getPollPeer() {
        return this.pollPeer;
    }

    public final Long getPosition() {
        return this.position;
    }

    public final Long getQuestionIndex() {
        return this.questionIndex;
    }

    public final Float getScore() {
        return this.score;
    }

    public final Long getTotalResponse() {
        return this.totalResponse;
    }

    public int hashCode() {
        Long l7 = this.questionIndex;
        int iHashCode = (l7 == null ? 0 : l7.hashCode()) * 31;
        Long l12 = this.position;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.duration;
        int iHashCode3 = (iHashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.totalResponse;
        int iHashCode4 = (iHashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.correctResponses;
        int iHashCode5 = (iHashCode4 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Float f13 = this.score;
        int iHashCode6 = (iHashCode5 + (f13 == null ? 0 : f13.hashCode())) * 31;
        HMSPollResponsePeerInfo hMSPollResponsePeerInfo = this.pollPeer;
        return iHashCode6 + (hMSPollResponsePeerInfo != null ? hMSPollResponsePeerInfo.hashCode() : 0);
    }

    public String toString() {
        return "LeaderboardQuestion(questionIndex=" + this.questionIndex + ", position=" + this.position + ", duration=" + this.duration + ", totalResponse=" + this.totalResponse + ", correctResponses=" + this.correctResponses + ", score=" + this.score + ", pollPeer=" + this.pollPeer + ')';
    }
}
