package live.hms.video.polls;

import io.getstream.chat.android.client.api2.model.requests.CreatePollRequest;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import live.hms.video.polls.models.HmsPollCategory;
import live.hms.video.polls.models.HmsPollUserTrackingMode;
import live.hms.video.polls.models.question.HMSPollQuestion;
import live.hms.video.polls.models.question.HMSPollQuestionType;
import live.hms.video.sdk.models.role.HMSRole;
import m83.AbstractC25267u;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0001#Bg\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 ¨\u0006$"}, m65681d2 = {"Llive/hms/video/polls/HMSPollBuilder;", "", "title", "", AttachmentExtensionsKt.EXTRA_DURATION, "", "pollId", CreatePollRequest.VOTING_VISIBILITY_ANONYMOUS, "", "category", "Llive/hms/video/polls/models/HmsPollCategory;", "mode", "Llive/hms/video/polls/models/HmsPollUserTrackingMode;", "rolesThatCanVote", "", "rolesThatCanViewResponses", "questions", "Llive/hms/video/polls/models/question/HMSPollQuestion;", "<init>", "(Ljava/lang/String;JLjava/lang/String;ZLlive/hms/video/polls/models/HmsPollCategory;Llive/hms/video/polls/models/HmsPollUserTrackingMode;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getDuration", "()J", "getPollId", "getAnonymous", "()Z", "getCategory", "()Llive/hms/video/polls/models/HmsPollCategory;", "getMode", "()Llive/hms/video/polls/models/HmsPollUserTrackingMode;", "getRolesThatCanVote", "()Ljava/util/List;", "getRolesThatCanViewResponses", "getQuestions", "Builder", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSPollBuilder {
    private final boolean anonymous;
    private final HmsPollCategory category;
    private final long duration;
    private final HmsPollUserTrackingMode mode;
    private final String pollId;
    private final List<HMSPollQuestion> questions;
    private final List<String> rolesThatCanViewResponses;
    private final List<String> rolesThatCanVote;
    private final String title;

    @Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\fJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u000eJ\u0016\u0010#\u001a\u00020\u00002\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0010J\u0016\u0010%\u001a\u00020\u00002\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0010J\u0006\u0010&\u001a\u00020'J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0005J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, m65681d2 = {"Llive/hms/video/polls/HMSPollBuilder$Builder;", "", "<init>", "()V", "title", "", AttachmentExtensionsKt.EXTRA_DURATION, "", "pollId", CreatePollRequest.VOTING_VISIBILITY_ANONYMOUS, "", "pollCategory", "Llive/hms/video/polls/models/HmsPollCategory;", "mode", "Llive/hms/video/polls/models/HmsPollUserTrackingMode;", "rolesThatCanVote", "", "rolesThatCanViewResponses", "questionId", "", "getQuestionId", "()I", "setQuestionId", "(I)V", "questions", "", "Llive/hms/video/polls/models/question/HMSPollQuestion;", "withPollId", "withTitle", "withDuration", "withAnonymous", "withCategory", "category", "withUserTrackingMode", "userTrackingMode", "withRolesThatCanVote", "Llive/hms/video/sdk/models/role/HMSRole;", "withRolesThatCanViewResponses", "build", "Llive/hms/video/polls/HMSPollBuilder;", "addQuestion", "withBuilder", "Llive/hms/video/polls/HMSPollQuestionBuilder;", "addShortAnswerQuestion", "addLongAnswerQuestion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Builder {
        private boolean anonymous;
        private long duration;
        private List<String> rolesThatCanViewResponses;
        private List<String> rolesThatCanVote;
        private String title = "Poll";
        private String pollId = AbstractC11895b.m31995n("toString(...)");
        private HmsPollCategory pollCategory = HmsPollCategory.QUIZ;
        private HmsPollUserTrackingMode mode = HmsPollUserTrackingMode.USER_ID;
        private int questionId = 1;
        private List<HMSPollQuestion> questions = new ArrayList();

        public final Builder addLongAnswerQuestion(String withTitle) {
            AbstractC22676k.m65750j(withTitle, "withTitle");
            int i13 = this.questionId;
            this.questionId = i13 + 1;
            this.questions.add(new HMSPollQuestion(i13, HMSPollQuestionType.longAnswer, withTitle, false, false, 0L, 0, null, null, null, null, false, null, 8184, null));
            return this;
        }

        public final Builder addQuestion(HMSPollQuestionBuilder withBuilder) {
            AbstractC22676k.m65750j(withBuilder, "withBuilder");
            int i13 = this.questionId;
            this.questionId = i13 + 1;
            this.questions.add(new HMSPollQuestion(i13, withBuilder.getType(), withBuilder.getTitle(), withBuilder.getCanBeSkipped(), withBuilder.getCanChangeResponse(), withBuilder.getDuration(), withBuilder.getWeight(), withBuilder.getMinLength(), withBuilder.getMaxLength(), withBuilder.getOptions$lib_release(), withBuilder.getCorrectAnswer(), withBuilder.getNegativeMarking(), null, 4096, null));
            return this;
        }

        public final Builder addShortAnswerQuestion(String withTitle) {
            AbstractC22676k.m65750j(withTitle, "withTitle");
            int i13 = this.questionId;
            this.questionId = i13 + 1;
            this.questions.add(new HMSPollQuestion(i13, HMSPollQuestionType.shortAnswer, withTitle, false, false, 0L, 0, null, null, null, null, false, null, 8184, null));
            return this;
        }

        public final HMSPollBuilder build() {
            return new HMSPollBuilder(this.title, this.duration, this.pollId, this.anonymous, this.pollCategory, this.mode, this.rolesThatCanVote, this.rolesThatCanViewResponses, this.questions, null);
        }

        public final int getQuestionId() {
            return this.questionId;
        }

        public final void setQuestionId(int i13) {
            this.questionId = i13;
        }

        public final Builder withAnonymous(boolean anonymous) {
            this.anonymous = anonymous;
            return this;
        }

        public final Builder withCategory(HmsPollCategory category) {
            AbstractC22676k.m65750j(category, "category");
            this.pollCategory = category;
            return this;
        }

        public final Builder withDuration(long duration) {
            this.duration = duration;
            return this;
        }

        public final Builder withPollId(String pollId) {
            AbstractC22676k.m65750j(pollId, "pollId");
            this.pollId = pollId;
            return this;
        }

        public final Builder withRolesThatCanViewResponses(List<HMSRole> rolesThatCanViewResponses) {
            ArrayList arrayList;
            if (rolesThatCanViewResponses != null) {
                List<HMSRole> list = rolesThatCanViewResponses;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((HMSRole) it.next()).getName());
                }
            } else {
                arrayList = null;
            }
            this.rolesThatCanViewResponses = arrayList;
            return this;
        }

        public final Builder withRolesThatCanVote(List<HMSRole> rolesThatCanVote) {
            ArrayList arrayList;
            if (rolesThatCanVote != null) {
                List<HMSRole> list = rolesThatCanVote;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((HMSRole) it.next()).getName());
                }
            } else {
                arrayList = null;
            }
            this.rolesThatCanVote = arrayList;
            return this;
        }

        public final Builder withTitle(String title) {
            AbstractC22676k.m65750j(title, "title");
            this.title = title;
            return this;
        }

        public final Builder withUserTrackingMode(HmsPollUserTrackingMode userTrackingMode) {
            AbstractC22676k.m65750j(userTrackingMode, "userTrackingMode");
            this.mode = userTrackingMode;
            return this;
        }
    }

    public /* synthetic */ HMSPollBuilder(String str, long j7, String str2, boolean z4, HmsPollCategory hmsPollCategory, HmsPollUserTrackingMode hmsPollUserTrackingMode, List list, List list2, List list3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j7, str2, z4, hmsPollCategory, hmsPollUserTrackingMode, list, list2, list3);
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

    public final HmsPollUserTrackingMode getMode() {
        return this.mode;
    }

    public final String getPollId() {
        return this.pollId;
    }

    public final List<HMSPollQuestion> getQuestions() {
        return this.questions;
    }

    public final List<String> getRolesThatCanViewResponses() {
        return this.rolesThatCanViewResponses;
    }

    public final List<String> getRolesThatCanVote() {
        return this.rolesThatCanVote;
    }

    public final String getTitle() {
        return this.title;
    }

    private HMSPollBuilder(String str, long j7, String str2, boolean z4, HmsPollCategory hmsPollCategory, HmsPollUserTrackingMode hmsPollUserTrackingMode, List<String> list, List<String> list2, List<HMSPollQuestion> list3) {
        this.title = str;
        this.duration = j7;
        this.pollId = str2;
        this.anonymous = z4;
        this.category = hmsPollCategory;
        this.mode = hmsPollUserTrackingMode;
        this.rolesThatCanVote = list;
        this.rolesThatCanViewResponses = list2;
        this.questions = list3;
    }
}
