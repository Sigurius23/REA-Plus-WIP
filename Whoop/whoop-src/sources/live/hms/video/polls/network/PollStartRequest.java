package live.hms.video.polls.network;

import com.google.gson.annotations.SerializedName;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m65681d2 = {"Llive/hms/video/polls/network/PollStartRequest;", "", "pollId", "", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPollId", "()Ljava/lang/String;", "getVersion", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class PollStartRequest {

    @SerializedName("poll_id")
    private final String pollId;

    @SerializedName("version")
    private final String version;

    public PollStartRequest(String pollId, String version) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(version, "version");
        this.pollId = pollId;
        this.version = version;
    }

    public static /* synthetic */ PollStartRequest copy$default(PollStartRequest pollStartRequest, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = pollStartRequest.pollId;
        }
        if ((i13 & 2) != 0) {
            str2 = pollStartRequest.version;
        }
        return pollStartRequest.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPollId() {
        return this.pollId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final PollStartRequest copy(String pollId, String version) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(version, "version");
        return new PollStartRequest(pollId, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollStartRequest)) {
            return false;
        }
        PollStartRequest pollStartRequest = (PollStartRequest) other;
        return AbstractC22676k.m65745e(this.pollId, pollStartRequest.pollId) && AbstractC22676k.m65745e(this.version, pollStartRequest.version);
    }

    public final String getPollId() {
        return this.pollId;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.version.hashCode() + (this.pollId.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("PollStartRequest(pollId=");
        sb4.append(this.pollId);
        sb4.append(", version=");
        return AbstractC25012a.m73377j(sb4, this.version, ')');
    }

    public /* synthetic */ PollStartRequest(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? "1.0" : str2);
    }
}
