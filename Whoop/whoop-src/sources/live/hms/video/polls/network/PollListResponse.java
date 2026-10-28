package live.hms.video.polls.network;

import com.google.gson.annotations.SerializedName;
import hc3.AbstractC17176i;
import java.util.List;
import live.hms.video.sdk.models.HMSNotifications;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m65681d2 = {"Llive/hms/video/polls/network/PollListResponse;", "", "last", "", "polls", "", "Llive/hms/video/sdk/models/HMSNotifications$StartedPolls;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getLast", "()Ljava/lang/String;", "getPolls", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class PollListResponse {

    @SerializedName("last")
    private final String last;

    @SerializedName("polls")
    private final List<HMSNotifications.StartedPolls> polls;

    public PollListResponse(String last, List<HMSNotifications.StartedPolls> polls) {
        AbstractC22676k.m65750j(last, "last");
        AbstractC22676k.m65750j(polls, "polls");
        this.last = last;
        this.polls = polls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PollListResponse copy$default(PollListResponse pollListResponse, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = pollListResponse.last;
        }
        if ((i13 & 2) != 0) {
            list = pollListResponse.polls;
        }
        return pollListResponse.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLast() {
        return this.last;
    }

    public final List<HMSNotifications.StartedPolls> component2() {
        return this.polls;
    }

    public final PollListResponse copy(String last, List<HMSNotifications.StartedPolls> polls) {
        AbstractC22676k.m65750j(last, "last");
        AbstractC22676k.m65750j(polls, "polls");
        return new PollListResponse(last, polls);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollListResponse)) {
            return false;
        }
        PollListResponse pollListResponse = (PollListResponse) other;
        return AbstractC22676k.m65745e(this.last, pollListResponse.last) && AbstractC22676k.m65745e(this.polls, pollListResponse.polls);
    }

    public final String getLast() {
        return this.last;
    }

    public final List<HMSNotifications.StartedPolls> getPolls() {
        return this.polls;
    }

    public int hashCode() {
        return this.polls.hashCode() + (this.last.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("PollListResponse(last=");
        sb4.append(this.last);
        sb4.append(", polls=");
        return AbstractC17176i.m48506h(sb4, this.polls, ')');
    }
}
