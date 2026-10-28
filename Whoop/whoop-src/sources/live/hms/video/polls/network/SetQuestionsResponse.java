package live.hms.video.polls.network;

import com.google.gson.annotations.SerializedName;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, m65681d2 = {"Llive/hms/video/polls/network/SetQuestionsResponse;", "", "pollId", "", "totalQuestions", "", "version", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getPollId", "()Ljava/lang/String;", "getTotalQuestions", "()I", "getVersion", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class SetQuestionsResponse {

    @SerializedName("poll_id")
    private final String pollId;

    @SerializedName("total_questions")
    private final int totalQuestions;

    @SerializedName("version")
    private final String version;

    public SetQuestionsResponse(String pollId, int i13, String version) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(version, "version");
        this.pollId = pollId;
        this.totalQuestions = i13;
        this.version = version;
    }

    public static /* synthetic */ SetQuestionsResponse copy$default(SetQuestionsResponse setQuestionsResponse, String str, int i13, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = setQuestionsResponse.pollId;
        }
        if ((i14 & 2) != 0) {
            i13 = setQuestionsResponse.totalQuestions;
        }
        if ((i14 & 4) != 0) {
            str2 = setQuestionsResponse.version;
        }
        return setQuestionsResponse.copy(str, i13, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPollId() {
        return this.pollId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotalQuestions() {
        return this.totalQuestions;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final SetQuestionsResponse copy(String pollId, int totalQuestions, String version) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(version, "version");
        return new SetQuestionsResponse(pollId, totalQuestions, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetQuestionsResponse)) {
            return false;
        }
        SetQuestionsResponse setQuestionsResponse = (SetQuestionsResponse) other;
        return AbstractC22676k.m65745e(this.pollId, setQuestionsResponse.pollId) && this.totalQuestions == setQuestionsResponse.totalQuestions && AbstractC22676k.m65745e(this.version, setQuestionsResponse.version);
    }

    public final String getPollId() {
        return this.pollId;
    }

    public final int getTotalQuestions() {
        return this.totalQuestions;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.version.hashCode() + AbstractC11266d.m30448b(this.totalQuestions, this.pollId.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("SetQuestionsResponse(pollId=");
        sb4.append(this.pollId);
        sb4.append(", totalQuestions=");
        sb4.append(this.totalQuestions);
        sb4.append(", version=");
        return AbstractC25012a.m73377j(sb4, this.version, ')');
    }
}
