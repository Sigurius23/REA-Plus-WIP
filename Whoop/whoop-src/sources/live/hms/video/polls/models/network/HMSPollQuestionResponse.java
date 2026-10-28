package live.hms.video.polls.models.network;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import live.hms.video.polls.models.question.HMSPollQuestionType;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003Jj\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0005HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0016\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018¨\u0006."}, m65681d2 = {"Llive/hms/video/polls/models/network/HMSPollQuestionResponse;", "", "responseId", "", "index", "", "questionType", "Llive/hms/video/polls/models/question/HMSPollQuestionType;", "skipped", "", "selectedOption", "selectedOptions", "", "text", "answerChanged", "<init>", "(Ljava/lang/String;ILlive/hms/video/polls/models/question/HMSPollQuestionType;ZLjava/lang/Integer;Ljava/util/List;Ljava/lang/String;Z)V", "getResponseId", "()Ljava/lang/String;", "getIndex", "()I", "getQuestionType", "()Llive/hms/video/polls/models/question/HMSPollQuestionType;", "getSkipped", "()Z", "getSelectedOption", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSelectedOptions", "()Ljava/util/List;", "getText", "getAnswerChanged", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;ILlive/hms/video/polls/models/question/HMSPollQuestionType;ZLjava/lang/Integer;Ljava/util/List;Ljava/lang/String;Z)Llive/hms/video/polls/models/network/HMSPollQuestionResponse;", "equals", "other", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSPollQuestionResponse {

    @SerializedName("update")
    private final boolean answerChanged;

    @SerializedName("question")
    private final int index;

    @SerializedName("type")
    private final HMSPollQuestionType questionType;

    @SerializedName("response_id")
    private final String responseId;

    @SerializedName("option")
    private final Integer selectedOption;

    @SerializedName("options")
    private final List<Integer> selectedOptions;

    @SerializedName("skipped")
    private final boolean skipped;

    @SerializedName("text")
    private final String text;

    public HMSPollQuestionResponse(String responseId, int i13, HMSPollQuestionType questionType, boolean z4, Integer num, List<Integer> list, String str, boolean z13) {
        AbstractC22676k.m65750j(responseId, "responseId");
        AbstractC22676k.m65750j(questionType, "questionType");
        this.responseId = responseId;
        this.index = i13;
        this.questionType = questionType;
        this.skipped = z4;
        this.selectedOption = num;
        this.selectedOptions = list;
        this.text = str;
        this.answerChanged = z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HMSPollQuestionResponse copy$default(HMSPollQuestionResponse hMSPollQuestionResponse, String str, int i13, HMSPollQuestionType hMSPollQuestionType, boolean z4, Integer num, List list, String str2, boolean z13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = hMSPollQuestionResponse.responseId;
        }
        if ((i14 & 2) != 0) {
            i13 = hMSPollQuestionResponse.index;
        }
        if ((i14 & 4) != 0) {
            hMSPollQuestionType = hMSPollQuestionResponse.questionType;
        }
        if ((i14 & 8) != 0) {
            z4 = hMSPollQuestionResponse.skipped;
        }
        if ((i14 & 16) != 0) {
            num = hMSPollQuestionResponse.selectedOption;
        }
        if ((i14 & 32) != 0) {
            list = hMSPollQuestionResponse.selectedOptions;
        }
        if ((i14 & 64) != 0) {
            str2 = hMSPollQuestionResponse.text;
        }
        if ((i14 & 128) != 0) {
            z13 = hMSPollQuestionResponse.answerChanged;
        }
        String str3 = str2;
        boolean z14 = z13;
        Integer num2 = num;
        List list2 = list;
        return hMSPollQuestionResponse.copy(str, i13, hMSPollQuestionType, z4, num2, list2, str3, z14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getResponseId() {
        return this.responseId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HMSPollQuestionType getQuestionType() {
        return this.questionType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSkipped() {
        return this.skipped;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getSelectedOption() {
        return this.selectedOption;
    }

    public final List<Integer> component6() {
        return this.selectedOptions;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getAnswerChanged() {
        return this.answerChanged;
    }

    public final HMSPollQuestionResponse copy(String responseId, int index, HMSPollQuestionType questionType, boolean skipped, Integer selectedOption, List<Integer> selectedOptions, String text, boolean answerChanged) {
        AbstractC22676k.m65750j(responseId, "responseId");
        AbstractC22676k.m65750j(questionType, "questionType");
        return new HMSPollQuestionResponse(responseId, index, questionType, skipped, selectedOption, selectedOptions, text, answerChanged);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSPollQuestionResponse)) {
            return false;
        }
        HMSPollQuestionResponse hMSPollQuestionResponse = (HMSPollQuestionResponse) other;
        return AbstractC22676k.m65745e(this.responseId, hMSPollQuestionResponse.responseId) && this.index == hMSPollQuestionResponse.index && this.questionType == hMSPollQuestionResponse.questionType && this.skipped == hMSPollQuestionResponse.skipped && AbstractC22676k.m65745e(this.selectedOption, hMSPollQuestionResponse.selectedOption) && AbstractC22676k.m65745e(this.selectedOptions, hMSPollQuestionResponse.selectedOptions) && AbstractC22676k.m65745e(this.text, hMSPollQuestionResponse.text) && this.answerChanged == hMSPollQuestionResponse.answerChanged;
    }

    public final boolean getAnswerChanged() {
        return this.answerChanged;
    }

    public final int getIndex() {
        return this.index;
    }

    public final HMSPollQuestionType getQuestionType() {
        return this.questionType;
    }

    public final String getResponseId() {
        return this.responseId;
    }

    public final Integer getSelectedOption() {
        return this.selectedOption;
    }

    public final List<Integer> getSelectedOptions() {
        return this.selectedOptions;
    }

    public final boolean getSkipped() {
        return this.skipped;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b((this.questionType.hashCode() + AbstractC11266d.m30448b(this.index, this.responseId.hashCode() * 31, 31)) * 31, 31, this.skipped);
        Integer num = this.selectedOption;
        int iHashCode = (iM8289b + (num == null ? 0 : num.hashCode())) * 31;
        List<Integer> list = this.selectedOptions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.text;
        return Boolean.hashCode(this.answerChanged) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSPollQuestionResponse(responseId=");
        sb4.append(this.responseId);
        sb4.append(", index=");
        sb4.append(this.index);
        sb4.append(", questionType=");
        sb4.append(this.questionType);
        sb4.append(", skipped=");
        sb4.append(this.skipped);
        sb4.append(", selectedOption=");
        sb4.append(this.selectedOption);
        sb4.append(", selectedOptions=");
        sb4.append(this.selectedOptions);
        sb4.append(", text=");
        sb4.append(this.text);
        sb4.append(", answerChanged=");
        return AbstractC2875y.m8305r(sb4, this.answerChanged, ')');
    }
}
