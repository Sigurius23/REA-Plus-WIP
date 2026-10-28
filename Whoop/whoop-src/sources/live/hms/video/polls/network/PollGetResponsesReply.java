package live.hms.video.polls.network;

import com.google.gson.annotations.SerializedName;
import hc3.AbstractC17176i;
import java.util.List;
import live.hms.video.polls.models.network.SingleResponse;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m65681d2 = {"Llive/hms/video/polls/network/PollGetResponsesReply;", "", "pollId", "", "version", "isLast", "", "responses", "", "Llive/hms/video/polls/models/network/SingleResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "getPollId", "()Ljava/lang/String;", "getVersion", "()Z", "getResponses", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class PollGetResponsesReply {

    @SerializedName("last")
    private final boolean isLast;

    @SerializedName("poll_id")
    private final String pollId;

    @SerializedName("responses")
    private final List<SingleResponse> responses;

    @SerializedName("version")
    private final String version;

    public PollGetResponsesReply(String pollId, String version, boolean z4, List<SingleResponse> responses) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(version, "version");
        AbstractC22676k.m65750j(responses, "responses");
        this.pollId = pollId;
        this.version = version;
        this.isLast = z4;
        this.responses = responses;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PollGetResponsesReply copy$default(PollGetResponsesReply pollGetResponsesReply, String str, String str2, boolean z4, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = pollGetResponsesReply.pollId;
        }
        if ((i13 & 2) != 0) {
            str2 = pollGetResponsesReply.version;
        }
        if ((i13 & 4) != 0) {
            z4 = pollGetResponsesReply.isLast;
        }
        if ((i13 & 8) != 0) {
            list = pollGetResponsesReply.responses;
        }
        return pollGetResponsesReply.copy(str, str2, z4, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPollId() {
        return this.pollId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsLast() {
        return this.isLast;
    }

    public final List<SingleResponse> component4() {
        return this.responses;
    }

    public final PollGetResponsesReply copy(String pollId, String version, boolean isLast, List<SingleResponse> responses) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(version, "version");
        AbstractC22676k.m65750j(responses, "responses");
        return new PollGetResponsesReply(pollId, version, isLast, responses);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollGetResponsesReply)) {
            return false;
        }
        PollGetResponsesReply pollGetResponsesReply = (PollGetResponsesReply) other;
        return AbstractC22676k.m65745e(this.pollId, pollGetResponsesReply.pollId) && AbstractC22676k.m65745e(this.version, pollGetResponsesReply.version) && this.isLast == pollGetResponsesReply.isLast && AbstractC22676k.m65745e(this.responses, pollGetResponsesReply.responses);
    }

    public final String getPollId() {
        return this.pollId;
    }

    public final List<SingleResponse> getResponses() {
        return this.responses;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.responses.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.pollId.hashCode() * 31, 31, this.version), 31, this.isLast);
    }

    public final boolean isLast() {
        return this.isLast;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("PollGetResponsesReply(pollId=");
        sb4.append(this.pollId);
        sb4.append(", version=");
        sb4.append(this.version);
        sb4.append(", isLast=");
        sb4.append(this.isLast);
        sb4.append(", responses=");
        return AbstractC17176i.m48506h(sb4, this.responses, ')');
    }
}
