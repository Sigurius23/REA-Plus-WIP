package live.hms.video.polls.models.network;

import com.google.gson.annotations.SerializedName;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m65681d2 = {"Llive/hms/video/polls/models/network/SingleResponse;", "", "peer", "Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;", "finalAnswer", "", "response", "Llive/hms/video/polls/models/network/HMSPollQuestionResponse;", "<init>", "(Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;ZLlive/hms/video/polls/models/network/HMSPollQuestionResponse;)V", "getPeer", "()Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;", "getFinalAnswer", "()Z", "getResponse", "()Llive/hms/video/polls/models/network/HMSPollQuestionResponse;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class SingleResponse {

    @SerializedName("final")
    private final boolean finalAnswer;

    @SerializedName("peer")
    private final HMSPollResponsePeerInfo peer;

    @SerializedName("response")
    private final HMSPollQuestionResponse response;

    public SingleResponse(HMSPollResponsePeerInfo peer, boolean z4, HMSPollQuestionResponse response) {
        AbstractC22676k.m65750j(peer, "peer");
        AbstractC22676k.m65750j(response, "response");
        this.peer = peer;
        this.finalAnswer = z4;
        this.response = response;
    }

    public static /* synthetic */ SingleResponse copy$default(SingleResponse singleResponse, HMSPollResponsePeerInfo hMSPollResponsePeerInfo, boolean z4, HMSPollQuestionResponse hMSPollQuestionResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            hMSPollResponsePeerInfo = singleResponse.peer;
        }
        if ((i13 & 2) != 0) {
            z4 = singleResponse.finalAnswer;
        }
        if ((i13 & 4) != 0) {
            hMSPollQuestionResponse = singleResponse.response;
        }
        return singleResponse.copy(hMSPollResponsePeerInfo, z4, hMSPollQuestionResponse);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HMSPollResponsePeerInfo getPeer() {
        return this.peer;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getFinalAnswer() {
        return this.finalAnswer;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HMSPollQuestionResponse getResponse() {
        return this.response;
    }

    public final SingleResponse copy(HMSPollResponsePeerInfo peer, boolean finalAnswer, HMSPollQuestionResponse response) {
        AbstractC22676k.m65750j(peer, "peer");
        AbstractC22676k.m65750j(response, "response");
        return new SingleResponse(peer, finalAnswer, response);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleResponse)) {
            return false;
        }
        SingleResponse singleResponse = (SingleResponse) other;
        return AbstractC22676k.m65745e(this.peer, singleResponse.peer) && this.finalAnswer == singleResponse.finalAnswer && AbstractC22676k.m65745e(this.response, singleResponse.response);
    }

    public final boolean getFinalAnswer() {
        return this.finalAnswer;
    }

    public final HMSPollResponsePeerInfo getPeer() {
        return this.peer;
    }

    public final HMSPollQuestionResponse getResponse() {
        return this.response;
    }

    public int hashCode() {
        return this.response.hashCode() + AbstractC2875y.m8289b(this.peer.hashCode() * 31, 31, this.finalAnswer);
    }

    public String toString() {
        return "SingleResponse(peer=" + this.peer + ", finalAnswer=" + this.finalAnswer + ", response=" + this.response + ')';
    }
}
