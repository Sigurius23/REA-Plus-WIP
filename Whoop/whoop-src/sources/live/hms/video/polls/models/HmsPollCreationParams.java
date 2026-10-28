package live.hms.video.polls.models;

import io.getstream.chat.android.client.api2.model.requests.CreatePollRequest;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003J\t\u0010-\u001a\u00020\u0011HÆ\u0003J\u007f\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u0010/\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00064"}, m65681d2 = {"Llive/hms/video/polls/models/HmsPollCreationParams;", "", "pollId", "", "title", AttachmentExtensionsKt.EXTRA_DURATION, "", CreatePollRequest.VOTING_VISIBILITY_ANONYMOUS, "", "visibility", "locked", "mode", "Llive/hms/video/polls/models/HmsPollUserTrackingMode;", "vote", "", "responses", "category", "Llive/hms/video/polls/models/HmsPollCategory;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JZZZLlive/hms/video/polls/models/HmsPollUserTrackingMode;Ljava/util/List;Ljava/util/List;Llive/hms/video/polls/models/HmsPollCategory;)V", "getPollId", "()Ljava/lang/String;", "getTitle", "getDuration", "()J", "getAnonymous", "()Z", "getVisibility", "getLocked", "getMode", "()Llive/hms/video/polls/models/HmsPollUserTrackingMode;", "getVote", "()Ljava/util/List;", "getResponses", "getCategory", "()Llive/hms/video/polls/models/HmsPollCategory;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HmsPollCreationParams {
    private final boolean anonymous;
    private final HmsPollCategory category;
    private final long duration;
    private final boolean locked;
    private final HmsPollUserTrackingMode mode;
    private final String pollId;
    private final List<String> responses;
    private final String title;
    private final boolean visibility;
    private final List<String> vote;

    public HmsPollCreationParams(String str, String title, long j7, boolean z4, boolean z13, boolean z14, HmsPollUserTrackingMode mode, List<String> list, List<String> list2, HmsPollCategory category) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(mode, "mode");
        AbstractC22676k.m65750j(category, "category");
        this.pollId = str;
        this.title = title;
        this.duration = j7;
        this.anonymous = z4;
        this.visibility = z13;
        this.locked = z14;
        this.mode = mode;
        this.vote = list;
        this.responses = list2;
        this.category = category;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HmsPollCreationParams copy$default(HmsPollCreationParams hmsPollCreationParams, String str, String str2, long j7, boolean z4, boolean z13, boolean z14, HmsPollUserTrackingMode hmsPollUserTrackingMode, List list, List list2, HmsPollCategory hmsPollCategory, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hmsPollCreationParams.pollId;
        }
        if ((i13 & 2) != 0) {
            str2 = hmsPollCreationParams.title;
        }
        if ((i13 & 4) != 0) {
            j7 = hmsPollCreationParams.duration;
        }
        if ((i13 & 8) != 0) {
            z4 = hmsPollCreationParams.anonymous;
        }
        if ((i13 & 16) != 0) {
            z13 = hmsPollCreationParams.visibility;
        }
        if ((i13 & 32) != 0) {
            z14 = hmsPollCreationParams.locked;
        }
        if ((i13 & 64) != 0) {
            hmsPollUserTrackingMode = hmsPollCreationParams.mode;
        }
        if ((i13 & 128) != 0) {
            list = hmsPollCreationParams.vote;
        }
        if ((i13 & 256) != 0) {
            list2 = hmsPollCreationParams.responses;
        }
        if ((i13 & 512) != 0) {
            hmsPollCategory = hmsPollCreationParams.category;
        }
        List list3 = list2;
        HmsPollCategory hmsPollCategory2 = hmsPollCategory;
        List list4 = list;
        boolean z15 = z14;
        boolean z16 = z4;
        long j13 = j7;
        return hmsPollCreationParams.copy(str, str2, j13, z16, z13, z15, hmsPollUserTrackingMode, list4, list3, hmsPollCategory2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPollId() {
        return this.pollId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final HmsPollCategory getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getAnonymous() {
        return this.anonymous;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getVisibility() {
        return this.visibility;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getLocked() {
        return this.locked;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final HmsPollUserTrackingMode getMode() {
        return this.mode;
    }

    public final List<String> component8() {
        return this.vote;
    }

    public final List<String> component9() {
        return this.responses;
    }

    public final HmsPollCreationParams copy(String pollId, String title, long duration, boolean anonymous, boolean visibility, boolean locked, HmsPollUserTrackingMode mode, List<String> vote, List<String> responses, HmsPollCategory category) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(mode, "mode");
        AbstractC22676k.m65750j(category, "category");
        return new HmsPollCreationParams(pollId, title, duration, anonymous, visibility, locked, mode, vote, responses, category);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HmsPollCreationParams)) {
            return false;
        }
        HmsPollCreationParams hmsPollCreationParams = (HmsPollCreationParams) other;
        return AbstractC22676k.m65745e(this.pollId, hmsPollCreationParams.pollId) && AbstractC22676k.m65745e(this.title, hmsPollCreationParams.title) && this.duration == hmsPollCreationParams.duration && this.anonymous == hmsPollCreationParams.anonymous && this.visibility == hmsPollCreationParams.visibility && this.locked == hmsPollCreationParams.locked && this.mode == hmsPollCreationParams.mode && AbstractC22676k.m65745e(this.vote, hmsPollCreationParams.vote) && AbstractC22676k.m65745e(this.responses, hmsPollCreationParams.responses) && this.category == hmsPollCreationParams.category;
    }

    public final boolean getAnonymous() {
        return this.anonymous;
    }

    public final HmsPollCategory getCategory() {
        return this.category;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final boolean getLocked() {
        return this.locked;
    }

    public final HmsPollUserTrackingMode getMode() {
        return this.mode;
    }

    public final String getPollId() {
        return this.pollId;
    }

    public final List<String> getResponses() {
        return this.responses;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean getVisibility() {
        return this.visibility;
    }

    public final List<String> getVote() {
        return this.vote;
    }

    public int hashCode() {
        String str = this.pollId;
        int iHashCode = (this.mode.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30451e(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.title), this.duration, 31), 31, this.anonymous), 31, this.visibility), 31, this.locked)) * 31;
        List<String> list = this.vote;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.responses;
        return this.category.hashCode() + ((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "HmsPollCreationParams(pollId=" + this.pollId + ", title=" + this.title + ", duration=" + this.duration + ", anonymous=" + this.anonymous + ", visibility=" + this.visibility + ", locked=" + this.locked + ", mode=" + this.mode + ", vote=" + this.vote + ", responses=" + this.responses + ", category=" + this.category + ')';
    }

    public /* synthetic */ HmsPollCreationParams(String str, String str2, long j7, boolean z4, boolean z13, boolean z14, HmsPollUserTrackingMode hmsPollUserTrackingMode, List list, List list2, HmsPollCategory hmsPollCategory, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, str2, (i13 & 4) != 0 ? 0L : j7, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? true : z13, (i13 & 32) != 0 ? false : z14, (i13 & 64) != 0 ? HmsPollUserTrackingMode.USER_ID : hmsPollUserTrackingMode, (i13 & 128) != 0 ? null : list, (i13 & 256) != 0 ? null : list2, hmsPollCategory);
    }
}
