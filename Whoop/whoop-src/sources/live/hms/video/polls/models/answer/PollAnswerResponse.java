package live.hms.video.polls.models.answer;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0019"}, m65681d2 = {"Llive/hms/video/polls/models/answer/PollAnswerResponse;", "", "pollId", "", "result", "", "Llive/hms/video/polls/models/answer/PollAnswerItem;", "version", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getPollId", "()Ljava/lang/String;", "getResult", "()Ljava/util/List;", "getVersion", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class PollAnswerResponse {

    @SerializedName("poll_id")
    private final String pollId;

    @SerializedName("result")
    private final List<PollAnswerItem> result;

    @SerializedName("version")
    private final String version;

    public PollAnswerResponse(String pollId, List<PollAnswerItem> result, String version) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(result, "result");
        AbstractC22676k.m65750j(version, "version");
        this.pollId = pollId;
        this.result = result;
        this.version = version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PollAnswerResponse copy$default(PollAnswerResponse pollAnswerResponse, String str, List list, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = pollAnswerResponse.pollId;
        }
        if ((i13 & 2) != 0) {
            list = pollAnswerResponse.result;
        }
        if ((i13 & 4) != 0) {
            str2 = pollAnswerResponse.version;
        }
        return pollAnswerResponse.copy(str, list, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPollId() {
        return this.pollId;
    }

    public final List<PollAnswerItem> component2() {
        return this.result;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final PollAnswerResponse copy(String pollId, List<PollAnswerItem> result, String version) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(result, "result");
        AbstractC22676k.m65750j(version, "version");
        return new PollAnswerResponse(pollId, result, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollAnswerResponse)) {
            return false;
        }
        PollAnswerResponse pollAnswerResponse = (PollAnswerResponse) other;
        return AbstractC22676k.m65745e(this.pollId, pollAnswerResponse.pollId) && AbstractC22676k.m65745e(this.result, pollAnswerResponse.result) && AbstractC22676k.m65745e(this.version, pollAnswerResponse.version);
    }

    public final String getPollId() {
        return this.pollId;
    }

    public final List<PollAnswerItem> getResult() {
        return this.result;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.version.hashCode() + AbstractC11895b.m31983b(this.pollId.hashCode() * 31, 31, this.result);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("PollAnswerResponse(pollId=");
        sb4.append(this.pollId);
        sb4.append(", result=");
        sb4.append(this.result);
        sb4.append(", version=");
        return AbstractC25012a.m73377j(sb4, this.version, ')');
    }
}
