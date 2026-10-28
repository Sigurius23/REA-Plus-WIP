package live.hms.video.polls.models.answer;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JT\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006%"}, m65681d2 = {"Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;", "", "hidden", "", "option", "", "options", "", "text", "", "caseSensitive", "emptySpaceTrimmed", "<init>", "(ZLjava/lang/Integer;Ljava/util/List;Ljava/lang/String;ZZ)V", "getHidden", "()Z", "getOption", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOptions", "()Ljava/util/List;", "getText", "()Ljava/lang/String;", "getCaseSensitive", "getEmptySpaceTrimmed", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ZLjava/lang/Integer;Ljava/util/List;Ljava/lang/String;ZZ)Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;", "equals", "other", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSPollQuestionAnswer {

    @SerializedName("case")
    private final boolean caseSensitive;

    @SerializedName("trim")
    private final boolean emptySpaceTrimmed;

    @SerializedName("hidden")
    private final boolean hidden;

    @SerializedName("option")
    private final Integer option;

    @SerializedName("options")
    private final List<Integer> options;

    @SerializedName("text")
    private final String text;

    public HMSPollQuestionAnswer() {
        this(false, null, null, null, false, false, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HMSPollQuestionAnswer copy$default(HMSPollQuestionAnswer hMSPollQuestionAnswer, boolean z4, Integer num, List list, String str, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = hMSPollQuestionAnswer.hidden;
        }
        if ((i13 & 2) != 0) {
            num = hMSPollQuestionAnswer.option;
        }
        if ((i13 & 4) != 0) {
            list = hMSPollQuestionAnswer.options;
        }
        if ((i13 & 8) != 0) {
            str = hMSPollQuestionAnswer.text;
        }
        if ((i13 & 16) != 0) {
            z13 = hMSPollQuestionAnswer.caseSensitive;
        }
        if ((i13 & 32) != 0) {
            z14 = hMSPollQuestionAnswer.emptySpaceTrimmed;
        }
        boolean z15 = z13;
        boolean z16 = z14;
        return hMSPollQuestionAnswer.copy(z4, num, list, str, z15, z16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHidden() {
        return this.hidden;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getOption() {
        return this.option;
    }

    public final List<Integer> component3() {
        return this.options;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getCaseSensitive() {
        return this.caseSensitive;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getEmptySpaceTrimmed() {
        return this.emptySpaceTrimmed;
    }

    public final HMSPollQuestionAnswer copy(boolean hidden, Integer option, List<Integer> options, String text, boolean caseSensitive, boolean emptySpaceTrimmed) {
        AbstractC22676k.m65750j(text, "text");
        return new HMSPollQuestionAnswer(hidden, option, options, text, caseSensitive, emptySpaceTrimmed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSPollQuestionAnswer)) {
            return false;
        }
        HMSPollQuestionAnswer hMSPollQuestionAnswer = (HMSPollQuestionAnswer) other;
        return this.hidden == hMSPollQuestionAnswer.hidden && AbstractC22676k.m65745e(this.option, hMSPollQuestionAnswer.option) && AbstractC22676k.m65745e(this.options, hMSPollQuestionAnswer.options) && AbstractC22676k.m65745e(this.text, hMSPollQuestionAnswer.text) && this.caseSensitive == hMSPollQuestionAnswer.caseSensitive && this.emptySpaceTrimmed == hMSPollQuestionAnswer.emptySpaceTrimmed;
    }

    public final boolean getCaseSensitive() {
        return this.caseSensitive;
    }

    public final boolean getEmptySpaceTrimmed() {
        return this.emptySpaceTrimmed;
    }

    public final boolean getHidden() {
        return this.hidden;
    }

    public final Integer getOption() {
        return this.option;
    }

    public final List<Integer> getOptions() {
        return this.options;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.hidden) * 31;
        Integer num = this.option;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<Integer> list = this.options;
        return Boolean.hashCode(this.emptySpaceTrimmed) + AbstractC2875y.m8289b(AbstractC11266d.m30450d((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31, 31, this.text), 31, this.caseSensitive);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSPollQuestionAnswer(hidden=");
        sb4.append(this.hidden);
        sb4.append(", option=");
        sb4.append(this.option);
        sb4.append(", options=");
        sb4.append(this.options);
        sb4.append(", text=");
        sb4.append(this.text);
        sb4.append(", caseSensitive=");
        sb4.append(this.caseSensitive);
        sb4.append(", emptySpaceTrimmed=");
        return AbstractC2875y.m8305r(sb4, this.emptySpaceTrimmed, ')');
    }

    public HMSPollQuestionAnswer(boolean z4, Integer num, List<Integer> list, String text, boolean z13, boolean z14) {
        AbstractC22676k.m65750j(text, "text");
        this.hidden = z4;
        this.option = num;
        this.options = list;
        this.text = text;
        this.caseSensitive = z13;
        this.emptySpaceTrimmed = z14;
    }

    public /* synthetic */ HMSPollQuestionAnswer(boolean z4, Integer num, List list, String str, boolean z13, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? null : num, (i13 & 4) != 0 ? null : list, (i13 & 8) != 0 ? "" : str, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? false : z14);
    }
}
