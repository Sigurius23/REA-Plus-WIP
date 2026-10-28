package live.hms.video.polls.models.question;

import com.google.gson.annotations.SerializedName;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003JN\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006("}, m65681d2 = {"Llive/hms/video/polls/models/question/HMSPollQuestionOption;", "", "index", "", "text", "", "weight", "case", "", "trim", "voteCount", "", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;ZZJ)V", "getIndex", "()I", "getText", "()Ljava/lang/String;", "getWeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCase", "()Z", "getTrim", "getVoteCount", "()J", "setVoteCount", "(J)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ILjava/lang/String;Ljava/lang/Integer;ZZJ)Llive/hms/video/polls/models/question/HMSPollQuestionOption;", "equals", "other", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSPollQuestionOption {

    @SerializedName("case")
    private final boolean case;

    @SerializedName("index")
    private final int index;

    @SerializedName("text")
    private final String text;

    @SerializedName("trim")
    private final boolean trim;
    private long voteCount;

    @SerializedName("weight")
    private final Integer weight;

    public HMSPollQuestionOption(int i13, String str, Integer num, boolean z4, boolean z13, long j7) {
        this.index = i13;
        this.text = str;
        this.weight = num;
        this.case = z4;
        this.trim = z13;
        this.voteCount = j7;
    }

    public static /* synthetic */ HMSPollQuestionOption copy$default(HMSPollQuestionOption hMSPollQuestionOption, int i13, String str, Integer num, boolean z4, boolean z13, long j7, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = hMSPollQuestionOption.index;
        }
        if ((i14 & 2) != 0) {
            str = hMSPollQuestionOption.text;
        }
        if ((i14 & 4) != 0) {
            num = hMSPollQuestionOption.weight;
        }
        if ((i14 & 8) != 0) {
            z4 = hMSPollQuestionOption.case;
        }
        if ((i14 & 16) != 0) {
            z13 = hMSPollQuestionOption.trim;
        }
        if ((i14 & 32) != 0) {
            j7 = hMSPollQuestionOption.voteCount;
        }
        long j13 = j7;
        boolean z14 = z13;
        Integer num2 = num;
        return hMSPollQuestionOption.copy(i13, str, num2, z4, z14, j13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getCase() {
        return this.case;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getTrim() {
        return this.trim;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getVoteCount() {
        return this.voteCount;
    }

    public final HMSPollQuestionOption copy(int index, String text, Integer weight, boolean z4, boolean trim, long voteCount) {
        return new HMSPollQuestionOption(index, text, weight, z4, trim, voteCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSPollQuestionOption)) {
            return false;
        }
        HMSPollQuestionOption hMSPollQuestionOption = (HMSPollQuestionOption) other;
        return this.index == hMSPollQuestionOption.index && AbstractC22676k.m65745e(this.text, hMSPollQuestionOption.text) && AbstractC22676k.m65745e(this.weight, hMSPollQuestionOption.weight) && this.case == hMSPollQuestionOption.case && this.trim == hMSPollQuestionOption.trim && this.voteCount == hMSPollQuestionOption.voteCount;
    }

    public final boolean getCase() {
        return this.case;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean getTrim() {
        return this.trim;
    }

    public final long getVoteCount() {
        return this.voteCount;
    }

    public final Integer getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.index) * 31;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.weight;
        return Long.hashCode(this.voteCount) + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.case), 31, this.trim);
    }

    public final void setVoteCount(long j7) {
        this.voteCount = j7;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSPollQuestionOption(index=");
        sb4.append(this.index);
        sb4.append(", text=");
        sb4.append(this.text);
        sb4.append(", weight=");
        sb4.append(this.weight);
        sb4.append(", case=");
        sb4.append(this.case);
        sb4.append(", trim=");
        sb4.append(this.trim);
        sb4.append(", voteCount=");
        return AbstractC2875y.m8302o(sb4, this.voteCount, ')');
    }

    public /* synthetic */ HMSPollQuestionOption(int i13, String str, Integer num, boolean z4, boolean z13, long j7, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? false : z4, (i14 & 16) == 0 ? z13 : false, (i14 & 32) != 0 ? 0L : j7);
    }
}
