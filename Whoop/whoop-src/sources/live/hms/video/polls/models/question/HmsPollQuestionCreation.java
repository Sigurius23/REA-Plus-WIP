package live.hms.video.polls.models.question;

import com.google.gson.annotations.SerializedName;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0011\u0010\u0015J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010#J\t\u00100\u001a\u00020\tHÆ\u0003Jv\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0003HÖ\u0001J\t\u00106\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b%\u0010#R\u0016\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001d¨\u00067"}, m65681d2 = {"Llive/hms/video/polls/models/question/HmsPollQuestionCreation;", "", "questionID", "", "type", "Llive/hms/video/polls/models/question/HMSPollQuestionType;", "text", "", "canSkip", "", "canChangeResponse", AttachmentExtensionsKt.EXTRA_DURATION, "", "weight", "answerShortMinLength", "answerLongMinLength", "negative", "<init>", "(ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/lang/String;ZZJILjava/lang/Long;Ljava/lang/Long;Z)V", "q", "Llive/hms/video/polls/models/question/HMSPollQuestion;", "(Llive/hms/video/polls/models/question/HMSPollQuestion;)V", "getQuestionID", "()I", "getType", "()Llive/hms/video/polls/models/question/HMSPollQuestionType;", "getText", "()Ljava/lang/String;", "getCanSkip", "()Z", "getCanChangeResponse", "getDuration", "()J", "getWeight", "getAnswerShortMinLength", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAnswerLongMinLength", "getNegative", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(ILlive/hms/video/polls/models/question/HMSPollQuestionType;Ljava/lang/String;ZZJILjava/lang/Long;Ljava/lang/Long;Z)Llive/hms/video/polls/models/question/HmsPollQuestionCreation;", "equals", "other", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HmsPollQuestionCreation {

    @SerializedName("answer_max_len")
    private final Long answerLongMinLength;

    @SerializedName("answer_min_len")
    private final Long answerShortMinLength;

    @SerializedName("once")
    private final boolean canChangeResponse;

    @SerializedName("skippable")
    private final boolean canSkip;

    @SerializedName(AttachmentExtensionsKt.EXTRA_DURATION)
    private final long duration;

    @SerializedName("negative")
    private final boolean negative;

    @SerializedName("index")
    private final int questionID;

    @SerializedName("text")
    private final String text;

    @SerializedName("type")
    private final HMSPollQuestionType type;

    @SerializedName("weight")
    private final int weight;

    public HmsPollQuestionCreation(int i13, HMSPollQuestionType type, String text, boolean z4, boolean z13, long j7, int i14, Long l7, Long l12, boolean z14) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(text, "text");
        this.questionID = i13;
        this.type = type;
        this.text = text;
        this.canSkip = z4;
        this.canChangeResponse = z13;
        this.duration = j7;
        this.weight = i14;
        this.answerShortMinLength = l7;
        this.answerLongMinLength = l12;
        this.negative = z14;
    }

    public static /* synthetic */ HmsPollQuestionCreation copy$default(HmsPollQuestionCreation hmsPollQuestionCreation, int i13, HMSPollQuestionType hMSPollQuestionType, String str, boolean z4, boolean z13, long j7, int i14, Long l7, Long l12, boolean z14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = hmsPollQuestionCreation.questionID;
        }
        if ((i15 & 2) != 0) {
            hMSPollQuestionType = hmsPollQuestionCreation.type;
        }
        if ((i15 & 4) != 0) {
            str = hmsPollQuestionCreation.text;
        }
        if ((i15 & 8) != 0) {
            z4 = hmsPollQuestionCreation.canSkip;
        }
        if ((i15 & 16) != 0) {
            z13 = hmsPollQuestionCreation.canChangeResponse;
        }
        if ((i15 & 32) != 0) {
            j7 = hmsPollQuestionCreation.duration;
        }
        if ((i15 & 64) != 0) {
            i14 = hmsPollQuestionCreation.weight;
        }
        if ((i15 & 128) != 0) {
            l7 = hmsPollQuestionCreation.answerShortMinLength;
        }
        if ((i15 & 256) != 0) {
            l12 = hmsPollQuestionCreation.answerLongMinLength;
        }
        if ((i15 & 512) != 0) {
            z14 = hmsPollQuestionCreation.negative;
        }
        long j13 = j7;
        boolean z15 = z4;
        boolean z16 = z13;
        String str2 = str;
        return hmsPollQuestionCreation.copy(i13, hMSPollQuestionType, str2, z15, z16, j13, i14, l7, l12, z14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getQuestionID() {
        return this.questionID;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getNegative() {
        return this.negative;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HMSPollQuestionType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getCanSkip() {
        return this.canSkip;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getCanChangeResponse() {
        return this.canChangeResponse;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getAnswerShortMinLength() {
        return this.answerShortMinLength;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getAnswerLongMinLength() {
        return this.answerLongMinLength;
    }

    public final HmsPollQuestionCreation copy(int questionID, HMSPollQuestionType type, String text, boolean canSkip, boolean canChangeResponse, long duration, int weight, Long answerShortMinLength, Long answerLongMinLength, boolean negative) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(text, "text");
        return new HmsPollQuestionCreation(questionID, type, text, canSkip, canChangeResponse, duration, weight, answerShortMinLength, answerLongMinLength, negative);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HmsPollQuestionCreation)) {
            return false;
        }
        HmsPollQuestionCreation hmsPollQuestionCreation = (HmsPollQuestionCreation) other;
        return this.questionID == hmsPollQuestionCreation.questionID && this.type == hmsPollQuestionCreation.type && AbstractC22676k.m65745e(this.text, hmsPollQuestionCreation.text) && this.canSkip == hmsPollQuestionCreation.canSkip && this.canChangeResponse == hmsPollQuestionCreation.canChangeResponse && this.duration == hmsPollQuestionCreation.duration && this.weight == hmsPollQuestionCreation.weight && AbstractC22676k.m65745e(this.answerShortMinLength, hmsPollQuestionCreation.answerShortMinLength) && AbstractC22676k.m65745e(this.answerLongMinLength, hmsPollQuestionCreation.answerLongMinLength) && this.negative == hmsPollQuestionCreation.negative;
    }

    public final Long getAnswerLongMinLength() {
        return this.answerLongMinLength;
    }

    public final Long getAnswerShortMinLength() {
        return this.answerShortMinLength;
    }

    public final boolean getCanChangeResponse() {
        return this.canChangeResponse;
    }

    public final boolean getCanSkip() {
        return this.canSkip;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final boolean getNegative() {
        return this.negative;
    }

    public final int getQuestionID() {
        return this.questionID;
    }

    public final String getText() {
        return this.text;
    }

    public final HMSPollQuestionType getType() {
        return this.type;
    }

    public final int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.weight, AbstractC11266d.m30451e(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d((this.type.hashCode() + (Integer.hashCode(this.questionID) * 31)) * 31, 31, this.text), 31, this.canSkip), 31, this.canChangeResponse), this.duration, 31), 31);
        Long l7 = this.answerShortMinLength;
        int iHashCode = (iM30448b + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l12 = this.answerLongMinLength;
        return Boolean.hashCode(this.negative) + ((iHashCode + (l12 != null ? l12.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HmsPollQuestionCreation(questionID=");
        sb4.append(this.questionID);
        sb4.append(", type=");
        sb4.append(this.type);
        sb4.append(", text=");
        sb4.append(this.text);
        sb4.append(", canSkip=");
        sb4.append(this.canSkip);
        sb4.append(", canChangeResponse=");
        sb4.append(this.canChangeResponse);
        sb4.append(", duration=");
        sb4.append(this.duration);
        sb4.append(", weight=");
        sb4.append(this.weight);
        sb4.append(", answerShortMinLength=");
        sb4.append(this.answerShortMinLength);
        sb4.append(", answerLongMinLength=");
        sb4.append(this.answerLongMinLength);
        sb4.append(", negative=");
        return AbstractC2875y.m8305r(sb4, this.negative, ')');
    }

    public /* synthetic */ HmsPollQuestionCreation(int i13, HMSPollQuestionType hMSPollQuestionType, String str, boolean z4, boolean z13, long j7, int i14, Long l7, Long l12, boolean z14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, hMSPollQuestionType, str, (i15 & 8) != 0 ? false : z4, (i15 & 16) != 0 ? true : z13, (i15 & 32) != 0 ? 0L : j7, (i15 & 64) != 0 ? 1 : i14, (i15 & 128) != 0 ? 1L : l7, (i15 & 256) != 0 ? 1L : l12, (i15 & 512) != 0 ? false : z14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HmsPollQuestionCreation(HMSPollQuestion q14) {
        this(q14.getQuestionID(), q14.getType(), q14.getText(), q14.getCanSkip(), q14.getCanChangeResponse(), q14.getDuration(), q14.getWeight(), q14.getAnswerShortMinLength(), null, false, 768, null);
        AbstractC22676k.m65750j(q14, "q");
    }
}
