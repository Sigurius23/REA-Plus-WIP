package com.whoop.p057ai.chat.domain.formwidget;

import cj0.C4744f;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0003/01B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJB\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00062"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest;", "", "", "questionId", "conversationFingerprint", "turnId", "", "Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest$Answer;", "answers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQuestionId", "getConversationFingerprint", "getTurnId", "Ljava/util/List;", "getAnswers", "Companion", "Answer", "$serializer", "a", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SubmitFormAnswersRequest {
    private final List<Answer> answers;
    private final String conversationFingerprint;
    private final String questionId;
    private final String turnId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C4744f(12))};

    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0002+,B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J<\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0018¨\u0006-"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest$Answer;", "", "", "optionId", "label", "value", "userInputText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest$Answer;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest$Answer;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOptionId", "getLabel", "getValue", "getUserInputText", "Companion", "$serializer", "a", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class Answer {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String label;
        private final String optionId;
        private final String userInputText;
        private final String value;

        /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.SubmitFormAnswersRequest$Answer$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest$Answer$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest$Answer;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return SubmitFormAnswersRequest$Answer$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Answer() {
            this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Answer copy$default(Answer answer, String str, String str2, String str3, String str4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = answer.optionId;
            }
            if ((i13 & 2) != 0) {
                str2 = answer.label;
            }
            if ((i13 & 4) != 0) {
                str3 = answer.value;
            }
            if ((i13 & 8) != 0) {
                str4 = answer.userInputText;
            }
            return answer.copy(str, str2, str3, str4);
        }

        public static final /* synthetic */ void write$Self$bot_release(Answer self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.optionId != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.optionId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.label, "")) {
                output.encodeStringElement(serialDesc, 1, self.label);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.value, "")) {
                output.encodeStringElement(serialDesc, 2, self.value);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.userInputText == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.userInputText);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getOptionId() {
            return this.optionId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getUserInputText() {
            return this.userInputText;
        }

        public final Answer copy(String optionId, String label, String value, String userInputText) {
            AbstractC22676k.m65750j(label, "label");
            AbstractC22676k.m65750j(value, "value");
            return new Answer(optionId, label, value, userInputText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Answer)) {
                return false;
            }
            Answer answer = (Answer) other;
            return AbstractC22676k.m65745e(this.optionId, answer.optionId) && AbstractC22676k.m65745e(this.label, answer.label) && AbstractC22676k.m65745e(this.value, answer.value) && AbstractC22676k.m65745e(this.userInputText, answer.userInputText);
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getOptionId() {
            return this.optionId;
        }

        public final String getUserInputText() {
            return this.userInputText;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.optionId;
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.label), 31, this.value);
            String str2 = this.userInputText;
            return iM30450d + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.optionId;
            String str2 = this.label;
            return AbstractC11266d.m30464r(AbstractC11895b.m32001t("Answer(optionId=", str, ", label=", str2, ", value="), this.value, ", userInputText=", this.userInputText, ")");
        }

        public /* synthetic */ Answer(int i13, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i13 & 1) == 0) {
                this.optionId = null;
            } else {
                this.optionId = str;
            }
            if ((i13 & 2) == 0) {
                this.label = "";
            } else {
                this.label = str2;
            }
            if ((i13 & 4) == 0) {
                this.value = "";
            } else {
                this.value = str3;
            }
            if ((i13 & 8) == 0) {
                this.userInputText = null;
            } else {
                this.userInputText = str4;
            }
        }

        public Answer(String str, String label, String value, String str2) {
            AbstractC22676k.m65750j(label, "label");
            AbstractC22676k.m65750j(value, "value");
            this.optionId = str;
            this.label = label;
            this.value = value;
            this.userInputText = str2;
        }

        public /* synthetic */ Answer(String str, String str2, String str3, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? null : str4);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.SubmitFormAnswersRequest$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/ai/chat/domain/formwidget/SubmitFormAnswersRequest;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SubmitFormAnswersRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SubmitFormAnswersRequest(int i13, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (9 != (i13 & 9)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 9, SubmitFormAnswersRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.questionId = str;
        if ((i13 & 2) == 0) {
            this.conversationFingerprint = null;
        } else {
            this.conversationFingerprint = str2;
        }
        if ((i13 & 4) == 0) {
            this.turnId = null;
        } else {
            this.turnId = str3;
        }
        this.answers = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SubmitFormAnswersRequest$Answer$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubmitFormAnswersRequest copy$default(SubmitFormAnswersRequest submitFormAnswersRequest, String str, String str2, String str3, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = submitFormAnswersRequest.questionId;
        }
        if ((i13 & 2) != 0) {
            str2 = submitFormAnswersRequest.conversationFingerprint;
        }
        if ((i13 & 4) != 0) {
            str3 = submitFormAnswersRequest.turnId;
        }
        if ((i13 & 8) != 0) {
            list = submitFormAnswersRequest.answers;
        }
        return submitFormAnswersRequest.copy(str, str2, str3, list);
    }

    public static final /* synthetic */ void write$Self$bot_release(SubmitFormAnswersRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.questionId);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.conversationFingerprint != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.conversationFingerprint);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.turnId != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.turnId);
        }
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.answers);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQuestionId() {
        return this.questionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversationFingerprint() {
        return this.conversationFingerprint;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTurnId() {
        return this.turnId;
    }

    public final List<Answer> component4() {
        return this.answers;
    }

    public final SubmitFormAnswersRequest copy(String questionId, String conversationFingerprint, String turnId, List<Answer> answers) {
        AbstractC22676k.m65750j(questionId, "questionId");
        AbstractC22676k.m65750j(answers, "answers");
        return new SubmitFormAnswersRequest(questionId, conversationFingerprint, turnId, answers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitFormAnswersRequest)) {
            return false;
        }
        SubmitFormAnswersRequest submitFormAnswersRequest = (SubmitFormAnswersRequest) other;
        return AbstractC22676k.m65745e(this.questionId, submitFormAnswersRequest.questionId) && AbstractC22676k.m65745e(this.conversationFingerprint, submitFormAnswersRequest.conversationFingerprint) && AbstractC22676k.m65745e(this.turnId, submitFormAnswersRequest.turnId) && AbstractC22676k.m65745e(this.answers, submitFormAnswersRequest.answers);
    }

    public final List<Answer> getAnswers() {
        return this.answers;
    }

    public final String getConversationFingerprint() {
        return this.conversationFingerprint;
    }

    public final String getQuestionId() {
        return this.questionId;
    }

    public final String getTurnId() {
        return this.turnId;
    }

    public int hashCode() {
        int iHashCode = this.questionId.hashCode() * 31;
        String str = this.conversationFingerprint;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.turnId;
        return this.answers.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.questionId;
        String str2 = this.conversationFingerprint;
        return AbstractC30007c.m91840j(this.turnId, ", answers=", ")", AbstractC11895b.m32001t("SubmitFormAnswersRequest(questionId=", str, ", conversationFingerprint=", str2, ", turnId="), this.answers);
    }

    public SubmitFormAnswersRequest(String questionId, String str, String str2, List<Answer> answers) {
        AbstractC22676k.m65750j(questionId, "questionId");
        AbstractC22676k.m65750j(answers, "answers");
        this.questionId = questionId;
        this.conversationFingerprint = str;
        this.turnId = str2;
        this.answers = answers;
    }

    public /* synthetic */ SubmitFormAnswersRequest(String str, String str2, String str3, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, list);
    }
}
