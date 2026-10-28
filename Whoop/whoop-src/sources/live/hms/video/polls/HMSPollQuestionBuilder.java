package live.hms.video.polls;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.ArrayList;
import java.util.List;
import l83.C23465k;
import live.hms.video.polls.models.answer.HMSPollQuestionAnswer;
import live.hms.video.polls.models.question.HMSPollQuestionOption;
import live.hms.video.polls.models.question.HMSPollQuestionType;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001:\u0001+Bm\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b!\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006,"}, m65681d2 = {"Llive/hms/video/polls/HMSPollQuestionBuilder;", "", AttachmentExtensionsKt.EXTRA_DURATION, "", "canBeSkipped", "", "title", "", "canChangeResponse", "minLength", "maxLength", "negativeMarking", "type", "Llive/hms/video/polls/models/question/HMSPollQuestionType;", "weight", "", "options", "", "Llive/hms/video/polls/models/question/HMSPollQuestionOption;", "correctAnswer", "Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;", "<init>", "(JZLjava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;ZLlive/hms/video/polls/models/question/HMSPollQuestionType;ILjava/util/List;Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;)V", "getDuration$lib_release", "()J", "getCanBeSkipped$lib_release", "()Z", "getTitle$lib_release", "()Ljava/lang/String;", "getCanChangeResponse$lib_release", "getMinLength$lib_release", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMaxLength$lib_release", "getNegativeMarking$lib_release", "getType$lib_release", "()Llive/hms/video/polls/models/question/HMSPollQuestionType;", "getWeight$lib_release", "()I", "getOptions$lib_release", "()Ljava/util/List;", "getCorrectAnswer$lib_release", "()Llive/hms/video/polls/models/answer/HMSPollQuestionAnswer;", "Builder", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSPollQuestionBuilder {
    private final boolean canBeSkipped;
    private final boolean canChangeResponse;
    private final HMSPollQuestionAnswer correctAnswer;
    private final long duration;
    private final Long maxLength;
    private final Long minLength;
    private final boolean negativeMarking;
    private final List<HMSPollQuestionOption> options;
    private final String title;
    private final HMSPollQuestionType type;
    private final int weight;

    @Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\tJ\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\rJ\u001d\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u0011J\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b \u0010\u0011J\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\tJ\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010)R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010+R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010-R\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010+R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010-R\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010+R6\u00101\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0006000/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00067"}, m65681d2 = {"Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;", "", "Llive/hms/video/polls/models/question/HMSPollQuestionType;", "type", "<init>", "(Llive/hms/video/polls/models/question/HMSPollQuestionType;)V", "", "canBeSkipped", "withCanBeSkipped", "(Z)Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;", "", "title", "withTitle", "(Ljava/lang/String;)Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;", "", AttachmentExtensionsKt.EXTRA_DURATION, "withDuration", "(J)Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;", "canChangeResponse", "withCanChangeResponse", "option", "addOption", "isCorrect", "addQuizOption", "(Ljava/lang/String;Z)Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;", "minLength", "withMinLength", "", "weight", "withWeight", "(I)Llive/hms/video/polls/HMSPollQuestionBuilder$Builder;", "maxLength", "withMaxLength", "answerHidden", "withAnswerHidden", "Llive/hms/video/polls/HMSPollQuestionBuilder;", "build", "()Llive/hms/video/polls/HMSPollQuestionBuilder;", "Llive/hms/video/polls/models/question/HMSPollQuestionType;", "getType", "()Llive/hms/video/polls/models/question/HMSPollQuestionType;", "I", "J", "Z", "Ljava/lang/String;", "Ljava/lang/Long;", "negativeMarking", "", "Ll83/k;", "options", "Ljava/util/List;", "getOptions", "()Ljava/util/List;", "setOptions", "(Ljava/util/List;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Builder {
        private boolean answerHidden;
        private boolean canBeSkipped;
        private boolean canChangeResponse;
        private long duration;
        private Long maxLength;
        private Long minLength;
        private boolean negativeMarking;
        private List<C23465k> options;
        private String title;
        private final HMSPollQuestionType type;
        private int weight;

        @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HMSPollQuestionType.values().length];
                try {
                    iArr[HMSPollQuestionType.singleChoice.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HMSPollQuestionType.multiChoice.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Builder(HMSPollQuestionType type) {
            AbstractC22676k.m65750j(type, "type");
            this.type = type;
            this.weight = 1;
            this.title = "";
            this.canChangeResponse = true;
            this.minLength = 1L;
            this.options = new ArrayList();
        }

        public final Builder addOption(String option) {
            AbstractC22676k.m65750j(option, "option");
            this.options.add(new C23465k(option, null));
            return this;
        }

        public final Builder addQuizOption(String option, boolean isCorrect) {
            AbstractC22676k.m65750j(option, "option");
            this.options.add(new C23465k(option, Boolean.valueOf(isCorrect)));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x006f  */
        public final HMSPollQuestionBuilder build() {
            HMSPollQuestionAnswer hMSPollQuestionAnswer;
            ArrayList arrayList = new ArrayList();
            List<C23465k> list = this.options;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            int i13 = 0;
            for (Object obj : list) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C23465k c23465k = (C23465k) obj;
                String str = (String) c23465k.f92937w;
                if (AbstractC22676k.m65745e((Boolean) c23465k.f92938x, Boolean.TRUE)) {
                    arrayList.add(Integer.valueOf(i14));
                }
                arrayList2.add(new HMSPollQuestionOption(i14, str, 1, false, false, 0L, 56, null));
                i13 = i14;
            }
            int i15 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
            if (i15 != 1) {
                if (i15 != 2) {
                    hMSPollQuestionAnswer = null;
                } else {
                    hMSPollQuestionAnswer = new HMSPollQuestionAnswer(this.answerHidden, null, arrayList, null, false, false, 58, null);
                }
            } else if (AbstractC25265s.m74100H0(arrayList) != null) {
                hMSPollQuestionAnswer = new HMSPollQuestionAnswer(this.answerHidden, Integer.valueOf(((Number) AbstractC25265s.m74096F0(arrayList)).intValue()), null, null, false, false, 60, null);
            } else {
                hMSPollQuestionAnswer = null;
            }
            return new HMSPollQuestionBuilder(this.duration, this.canBeSkipped, this.title, this.canChangeResponse, this.minLength, this.maxLength, this.negativeMarking, this.type, this.weight, arrayList2, hMSPollQuestionAnswer, null);
        }

        public final List<C23465k> getOptions() {
            return this.options;
        }

        public final HMSPollQuestionType getType() {
            return this.type;
        }

        public final void setOptions(List<C23465k> list) {
            AbstractC22676k.m65750j(list, "<set-?>");
            this.options = list;
        }

        public final Builder withAnswerHidden(boolean answerHidden) {
            this.answerHidden = answerHidden;
            return this;
        }

        public final Builder withCanBeSkipped(boolean canBeSkipped) {
            this.canBeSkipped = canBeSkipped;
            return this;
        }

        public final Builder withCanChangeResponse(boolean canChangeResponse) {
            this.canChangeResponse = canChangeResponse;
            return this;
        }

        public final Builder withDuration(long duration) {
            this.duration = duration;
            return this;
        }

        public final Builder withMaxLength(long maxLength) {
            this.maxLength = Long.valueOf(maxLength);
            return this;
        }

        public final Builder withMinLength(long minLength) {
            this.minLength = Long.valueOf(minLength);
            return this;
        }

        public final Builder withTitle(String title) {
            AbstractC22676k.m65750j(title, "title");
            this.title = title;
            return this;
        }

        public final Builder withWeight(int weight) {
            this.weight = weight;
            return this;
        }
    }

    public /* synthetic */ HMSPollQuestionBuilder(long j7, boolean z4, String str, boolean z13, Long l7, Long l12, boolean z14, HMSPollQuestionType hMSPollQuestionType, int i13, List list, HMSPollQuestionAnswer hMSPollQuestionAnswer, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, z4, str, z13, l7, l12, z14, hMSPollQuestionType, i13, list, hMSPollQuestionAnswer);
    }

    /* JADX INFO: renamed from: getCanBeSkipped$lib_release, reason: from getter */
    public final boolean getCanBeSkipped() {
        return this.canBeSkipped;
    }

    /* JADX INFO: renamed from: getCanChangeResponse$lib_release, reason: from getter */
    public final boolean getCanChangeResponse() {
        return this.canChangeResponse;
    }

    /* JADX INFO: renamed from: getCorrectAnswer$lib_release, reason: from getter */
    public final HMSPollQuestionAnswer getCorrectAnswer() {
        return this.correctAnswer;
    }

    /* JADX INFO: renamed from: getDuration$lib_release, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: getMaxLength$lib_release, reason: from getter */
    public final Long getMaxLength() {
        return this.maxLength;
    }

    /* JADX INFO: renamed from: getMinLength$lib_release, reason: from getter */
    public final Long getMinLength() {
        return this.minLength;
    }

    /* JADX INFO: renamed from: getNegativeMarking$lib_release, reason: from getter */
    public final boolean getNegativeMarking() {
        return this.negativeMarking;
    }

    public final List<HMSPollQuestionOption> getOptions$lib_release() {
        return this.options;
    }

    /* JADX INFO: renamed from: getTitle$lib_release, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: getType$lib_release, reason: from getter */
    public final HMSPollQuestionType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: getWeight$lib_release, reason: from getter */
    public final int getWeight() {
        return this.weight;
    }

    private HMSPollQuestionBuilder(long j7, boolean z4, String str, boolean z13, Long l7, Long l12, boolean z14, HMSPollQuestionType hMSPollQuestionType, int i13, List<HMSPollQuestionOption> list, HMSPollQuestionAnswer hMSPollQuestionAnswer) {
        this.duration = j7;
        this.canBeSkipped = z4;
        this.title = str;
        this.canChangeResponse = z13;
        this.minLength = l7;
        this.maxLength = l12;
        this.negativeMarking = z14;
        this.type = hMSPollQuestionType;
        this.weight = i13;
        this.options = list;
        this.correctAnswer = hMSPollQuestionAnswer;
    }
}
