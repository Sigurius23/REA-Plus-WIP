package live.hms.video.polls.models.answer;

import com.google.gson.annotations.SerializedName;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.List;
import live.hms.video.polls.models.network.HMSPollQuestionResponse;
import live.hms.video.polls.models.question.HMSPollQuestionType;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0010\u0010\u0014J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\"Jh\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0003HÖ\u0001J\t\u00101\u001a\u00020\fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"¨\u00062"}, m65681d2 = {"Llive/hms/video/polls/models/answer/HmsPollAnswer;", "", "questionId", "", "questionType", "Llive/hms/video/polls/models/question/HMSPollQuestionType;", "skipped", "", "selectedOption", "selectedOptions", "", "answerText", "", "update", "durationMillis", "", "<init>", "(ILlive/hms/video/polls/models/question/HMSPollQuestionType;ZILjava/util/List;Ljava/lang/String;ZLjava/lang/Long;)V", "r", "Llive/hms/video/polls/models/network/HMSPollQuestionResponse;", "(Llive/hms/video/polls/models/network/HMSPollQuestionResponse;)V", "getQuestionId", "()I", "getQuestionType", "()Llive/hms/video/polls/models/question/HMSPollQuestionType;", "getSkipped", "()Z", "getSelectedOption", "getSelectedOptions", "()Ljava/util/List;", "getAnswerText", "()Ljava/lang/String;", "getUpdate", "getDurationMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ILlive/hms/video/polls/models/question/HMSPollQuestionType;ZILjava/util/List;Ljava/lang/String;ZLjava/lang/Long;)Llive/hms/video/polls/models/answer/HmsPollAnswer;", "equals", "other", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HmsPollAnswer {

    @SerializedName("text")
    private final String answerText;

    @SerializedName(AttachmentExtensionsKt.EXTRA_DURATION)
    private final Long durationMillis;

    @SerializedName("question")
    private final int questionId;

    @SerializedName("type")
    private final HMSPollQuestionType questionType;

    @SerializedName("option")
    private final int selectedOption;

    @SerializedName("options")
    private final List<Integer> selectedOptions;

    @SerializedName("skipped")
    private final boolean skipped;

    @SerializedName("update")
    private final boolean update;

    public HmsPollAnswer(int i13, HMSPollQuestionType questionType, boolean z4, int i14, List<Integer> list, String answerText, boolean z13, Long l7) {
        AbstractC22676k.m65750j(questionType, "questionType");
        AbstractC22676k.m65750j(answerText, "answerText");
        this.questionId = i13;
        this.questionType = questionType;
        this.skipped = z4;
        this.selectedOption = i14;
        this.selectedOptions = list;
        this.answerText = answerText;
        this.update = z13;
        this.durationMillis = l7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HmsPollAnswer copy$default(HmsPollAnswer hmsPollAnswer, int i13, HMSPollQuestionType hMSPollQuestionType, boolean z4, int i14, List list, String str, boolean z13, Long l7, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = hmsPollAnswer.questionId;
        }
        if ((i15 & 2) != 0) {
            hMSPollQuestionType = hmsPollAnswer.questionType;
        }
        if ((i15 & 4) != 0) {
            z4 = hmsPollAnswer.skipped;
        }
        if ((i15 & 8) != 0) {
            i14 = hmsPollAnswer.selectedOption;
        }
        if ((i15 & 16) != 0) {
            list = hmsPollAnswer.selectedOptions;
        }
        if ((i15 & 32) != 0) {
            str = hmsPollAnswer.answerText;
        }
        if ((i15 & 64) != 0) {
            z13 = hmsPollAnswer.update;
        }
        if ((i15 & 128) != 0) {
            l7 = hmsPollAnswer.durationMillis;
        }
        boolean z14 = z13;
        Long l12 = l7;
        List list2 = list;
        String str2 = str;
        return hmsPollAnswer.copy(i13, hMSPollQuestionType, z4, i14, list2, str2, z14, l12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getQuestionId() {
        return this.questionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HMSPollQuestionType getQuestionType() {
        return this.questionType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSkipped() {
        return this.skipped;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSelectedOption() {
        return this.selectedOption;
    }

    public final List<Integer> component5() {
        return this.selectedOptions;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAnswerText() {
        return this.answerText;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getUpdate() {
        return this.update;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getDurationMillis() {
        return this.durationMillis;
    }

    public final HmsPollAnswer copy(int questionId, HMSPollQuestionType questionType, boolean skipped, int selectedOption, List<Integer> selectedOptions, String answerText, boolean update, Long durationMillis) {
        AbstractC22676k.m65750j(questionType, "questionType");
        AbstractC22676k.m65750j(answerText, "answerText");
        return new HmsPollAnswer(questionId, questionType, skipped, selectedOption, selectedOptions, answerText, update, durationMillis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HmsPollAnswer)) {
            return false;
        }
        HmsPollAnswer hmsPollAnswer = (HmsPollAnswer) other;
        return this.questionId == hmsPollAnswer.questionId && this.questionType == hmsPollAnswer.questionType && this.skipped == hmsPollAnswer.skipped && this.selectedOption == hmsPollAnswer.selectedOption && AbstractC22676k.m65745e(this.selectedOptions, hmsPollAnswer.selectedOptions) && AbstractC22676k.m65745e(this.answerText, hmsPollAnswer.answerText) && this.update == hmsPollAnswer.update && AbstractC22676k.m65745e(this.durationMillis, hmsPollAnswer.durationMillis);
    }

    public final String getAnswerText() {
        return this.answerText;
    }

    public final Long getDurationMillis() {
        return this.durationMillis;
    }

    public final int getQuestionId() {
        return this.questionId;
    }

    public final HMSPollQuestionType getQuestionType() {
        return this.questionType;
    }

    public final int getSelectedOption() {
        return this.selectedOption;
    }

    public final List<Integer> getSelectedOptions() {
        return this.selectedOptions;
    }

    public final boolean getSkipped() {
        return this.skipped;
    }

    public final boolean getUpdate() {
        return this.update;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.selectedOption, AbstractC2875y.m8289b((this.questionType.hashCode() + (Integer.hashCode(this.questionId) * 31)) * 31, 31, this.skipped), 31);
        List<Integer> list = this.selectedOptions;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d((iM30448b + (list == null ? 0 : list.hashCode())) * 31, 31, this.answerText), 31, this.update);
        Long l7 = this.durationMillis;
        return iM8289b + (l7 != null ? l7.hashCode() : 0);
    }

    public String toString() {
        return "HmsPollAnswer(questionId=" + this.questionId + ", questionType=" + this.questionType + ", skipped=" + this.skipped + ", selectedOption=" + this.selectedOption + ", selectedOptions=" + this.selectedOptions + ", answerText=" + this.answerText + ", update=" + this.update + ", durationMillis=" + this.durationMillis + ')';
    }

    public /* synthetic */ HmsPollAnswer(int i13, HMSPollQuestionType hMSPollQuestionType, boolean z4, int i14, List list, String str, boolean z13, Long l7, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, hMSPollQuestionType, (i15 & 4) != 0 ? false : z4, (i15 & 8) != 0 ? 0 : i14, (i15 & 16) != 0 ? null : list, (i15 & 32) != 0 ? "" : str, (i15 & 64) != 0 ? false : z13, (i15 & 128) != 0 ? null : l7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HmsPollAnswer(HMSPollQuestionResponse r10) {
        AbstractC22676k.m65750j(r10, "r");
        int index = r10.getIndex();
        HMSPollQuestionType questionType = r10.getQuestionType();
        boolean skipped = r10.getSkipped();
        Integer selectedOption = r10.getSelectedOption();
        int iIntValue = selectedOption != null ? selectedOption.intValue() : -1;
        List<Integer> selectedOptions = r10.getSelectedOptions();
        String text = r10.getText();
        this(index, questionType, skipped, iIntValue, selectedOptions, text == null ? "" : text, r10.getAnswerChanged(), null, 128, null);
    }
}
