package com.whoop.bot.models.conversation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.whoopaction.domain.models.Action;
import ih0.AbstractC18489d0;
import java.lang.annotation.Annotation;
import java.util.List;
import jl0.C21769a;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import live.hms.video.error.ErrorCodes;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0081\b\u0018\u0000 Q2\u00020\u0001:\u0002RQB\u0093\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017B\u009d\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0016\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001dJ\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001dJ\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001dJ\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001dJ\u0010\u0010.\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b.\u0010#J\u009c\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\u001dJ\u0010\u00102\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b2\u0010#J\u001a\u00104\u001a\u00020\n2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105J'\u0010>\u001a\u00020;2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010?\u001a\u0004\bA\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\bB\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bD\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\bF\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010G\u001a\u0004\b\u000b\u0010%R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bI\u0010'R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010J\u001a\u0004\bK\u0010)R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\bL\u0010\u001dR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\bM\u0010\u001dR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010?\u001a\u0004\bN\u0010\u001dR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010?\u001a\u0004\bO\u0010\u001dR\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010E\u001a\u0004\bP\u0010#¨\u0006S"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/FormQuestionModel;", "", "", "id", "prompt", "type", "Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;", "answerDisplayStyle", "", "maxSelections", "", "isRequired", "", "Lcom/whoop/bot/models/conversation/FormAnswerOptionModel;", "answers", "Lcom/whoop/whoopaction/domain/models/Action;", "onAnswer", "userVisibleProgressIndicator", "userVisibleSubmitButtonText", "userVisibleCompletedButtonText", "placeholder", "userInputTextMaxLength", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;IZLjava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;IZLjava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;", "component5", "()I", "component6", "()Z", "component7", "()Ljava/util/List;", "component8", "()Lcom/whoop/whoopaction/domain/models/Action;", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;IZLjava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/whoop/bot/models/conversation/FormQuestionModel;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/bot/models/conversation/FormQuestionModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getPrompt", "getType", "Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;", "getAnswerDisplayStyle", "I", "getMaxSelections", "Z", "Ljava/util/List;", "getAnswers", "Lcom/whoop/whoopaction/domain/models/Action;", "getOnAnswer", "getUserVisibleProgressIndicator", "getUserVisibleSubmitButtonText", "getUserVisibleCompletedButtonText", "getPlaceholder", "getUserInputTextMaxLength", "Companion", "$serializer", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FormQuestionModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final AnswerDisplayStyle answerDisplayStyle;
    private final List<FormAnswerOptionModel> answers;
    private final String id;
    private final boolean isRequired;
    private final int maxSelections;
    private final Action onAnswer;
    private final String placeholder;
    private final String prompt;
    private final String type;
    private final int userInputTextMaxLength;
    private final String userVisibleCompletedButtonText;
    private final String userVisibleProgressIndicator;
    private final String userVisibleSubmitButtonText;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/FormQuestionModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/bot/models/conversation/FormQuestionModel;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FormQuestionModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C21769a(4)), null, null, AbstractC30060g.m92087G(enumC23463i, new C21769a(5)), AbstractC30060g.m92087G(enumC23463i, new C21769a(6)), null, null, null, null, null};
    }

    public FormQuestionModel() {
        this((String) null, (String) null, (String) null, (AnswerDisplayStyle) null, 0, false, (List) null, (Action) null, (String) null, (String) null, (String) null, (String) null, 0, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.bot.models.conversation.AnswerDisplayStyle", AnswerDisplayStyle.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(FormAnswerOptionModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(Action.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(Action.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormQuestionModel copy$default(FormQuestionModel formQuestionModel, String str, String str2, String str3, AnswerDisplayStyle answerDisplayStyle, int i13, boolean z4, List list, Action action, String str4, String str5, String str6, String str7, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = formQuestionModel.id;
        }
        return formQuestionModel.copy(str, (i15 & 2) != 0 ? formQuestionModel.prompt : str2, (i15 & 4) != 0 ? formQuestionModel.type : str3, (i15 & 8) != 0 ? formQuestionModel.answerDisplayStyle : answerDisplayStyle, (i15 & 16) != 0 ? formQuestionModel.maxSelections : i13, (i15 & 32) != 0 ? formQuestionModel.isRequired : z4, (i15 & 64) != 0 ? formQuestionModel.answers : list, (i15 & 128) != 0 ? formQuestionModel.onAnswer : action, (i15 & 256) != 0 ? formQuestionModel.userVisibleProgressIndicator : str4, (i15 & 512) != 0 ? formQuestionModel.userVisibleSubmitButtonText : str5, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? formQuestionModel.userVisibleCompletedButtonText : str6, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? formQuestionModel.placeholder : str7, (i15 & 4096) != 0 ? formQuestionModel.userInputTextMaxLength : i14);
    }

    public static final /* synthetic */ void write$Self$bot_release(FormQuestionModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.id, "")) {
            output.encodeStringElement(serialDesc, 0, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.prompt, "")) {
            output.encodeStringElement(serialDesc, 1, self.prompt);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.type, "")) {
            output.encodeStringElement(serialDesc, 2, self.type);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.answerDisplayStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.answerDisplayStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.maxSelections != 1) {
            output.encodeIntElement(serialDesc, 4, self.maxSelections);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !self.isRequired) {
            output.encodeBooleanElement(serialDesc, 5, self.isRequired);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !AbstractC22676k.m65745e(self.answers, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.answers);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.onAnswer != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.onAnswer);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !AbstractC22676k.m65745e(self.userVisibleProgressIndicator, "")) {
            output.encodeStringElement(serialDesc, 8, self.userVisibleProgressIndicator);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !AbstractC22676k.m65745e(self.userVisibleSubmitButtonText, "")) {
            output.encodeStringElement(serialDesc, 9, self.userVisibleSubmitButtonText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || !AbstractC22676k.m65745e(self.userVisibleCompletedButtonText, "")) {
            output.encodeStringElement(serialDesc, 10, self.userVisibleCompletedButtonText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || !AbstractC22676k.m65745e(self.placeholder, "")) {
            output.encodeStringElement(serialDesc, 11, self.placeholder);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 12) && self.userInputTextMaxLength == 2000) {
            return;
        }
        output.encodeIntElement(serialDesc, 12, self.userInputTextMaxLength);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getUserVisibleSubmitButtonText() {
        return this.userVisibleSubmitButtonText;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getUserVisibleCompletedButtonText() {
        return this.userVisibleCompletedButtonText;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getUserInputTextMaxLength() {
        return this.userInputTextMaxLength;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPrompt() {
        return this.prompt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AnswerDisplayStyle getAnswerDisplayStyle() {
        return this.answerDisplayStyle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMaxSelections() {
        return this.maxSelections;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    public final List<FormAnswerOptionModel> component7() {
        return this.answers;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Action getOnAnswer() {
        return this.onAnswer;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUserVisibleProgressIndicator() {
        return this.userVisibleProgressIndicator;
    }

    public final FormQuestionModel copy(String id4, String prompt, String type, AnswerDisplayStyle answerDisplayStyle, int maxSelections, boolean isRequired, List<FormAnswerOptionModel> answers, Action onAnswer, String userVisibleProgressIndicator, String userVisibleSubmitButtonText, String userVisibleCompletedButtonText, String placeholder, int userInputTextMaxLength) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(prompt, "prompt");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(answers, "answers");
        AbstractC22676k.m65750j(userVisibleProgressIndicator, "userVisibleProgressIndicator");
        AbstractC22676k.m65750j(userVisibleSubmitButtonText, "userVisibleSubmitButtonText");
        AbstractC22676k.m65750j(userVisibleCompletedButtonText, "userVisibleCompletedButtonText");
        AbstractC22676k.m65750j(placeholder, "placeholder");
        return new FormQuestionModel(id4, prompt, type, answerDisplayStyle, maxSelections, isRequired, answers, onAnswer, userVisibleProgressIndicator, userVisibleSubmitButtonText, userVisibleCompletedButtonText, placeholder, userInputTextMaxLength);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormQuestionModel)) {
            return false;
        }
        FormQuestionModel formQuestionModel = (FormQuestionModel) other;
        return AbstractC22676k.m65745e(this.id, formQuestionModel.id) && AbstractC22676k.m65745e(this.prompt, formQuestionModel.prompt) && AbstractC22676k.m65745e(this.type, formQuestionModel.type) && this.answerDisplayStyle == formQuestionModel.answerDisplayStyle && this.maxSelections == formQuestionModel.maxSelections && this.isRequired == formQuestionModel.isRequired && AbstractC22676k.m65745e(this.answers, formQuestionModel.answers) && AbstractC22676k.m65745e(this.onAnswer, formQuestionModel.onAnswer) && AbstractC22676k.m65745e(this.userVisibleProgressIndicator, formQuestionModel.userVisibleProgressIndicator) && AbstractC22676k.m65745e(this.userVisibleSubmitButtonText, formQuestionModel.userVisibleSubmitButtonText) && AbstractC22676k.m65745e(this.userVisibleCompletedButtonText, formQuestionModel.userVisibleCompletedButtonText) && AbstractC22676k.m65745e(this.placeholder, formQuestionModel.placeholder) && this.userInputTextMaxLength == formQuestionModel.userInputTextMaxLength;
    }

    public final AnswerDisplayStyle getAnswerDisplayStyle() {
        return this.answerDisplayStyle;
    }

    public final List<FormAnswerOptionModel> getAnswers() {
        return this.answers;
    }

    public final String getId() {
        return this.id;
    }

    public final int getMaxSelections() {
        return this.maxSelections;
    }

    public final Action getOnAnswer() {
        return this.onAnswer;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final String getPrompt() {
        return this.prompt;
    }

    public final String getType() {
        return this.type;
    }

    public final int getUserInputTextMaxLength() {
        return this.userInputTextMaxLength;
    }

    public final String getUserVisibleCompletedButtonText() {
        return this.userVisibleCompletedButtonText;
    }

    public final String getUserVisibleProgressIndicator() {
        return this.userVisibleProgressIndicator;
    }

    public final String getUserVisibleSubmitButtonText() {
        return this.userVisibleSubmitButtonText;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.prompt), 31, this.type);
        AnswerDisplayStyle answerDisplayStyle = this.answerDisplayStyle;
        int iM31983b = AbstractC11895b.m31983b(AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.maxSelections, (iM30450d + (answerDisplayStyle == null ? 0 : answerDisplayStyle.hashCode())) * 31, 31), 31, this.isRequired), 31, this.answers);
        Action action = this.onAnswer;
        return Integer.hashCode(this.userInputTextMaxLength) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM31983b + (action != null ? action.hashCode() : 0)) * 31, 31, this.userVisibleProgressIndicator), 31, this.userVisibleSubmitButtonText), 31, this.userVisibleCompletedButtonText), 31, this.placeholder);
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.prompt;
        String str3 = this.type;
        AnswerDisplayStyle answerDisplayStyle = this.answerDisplayStyle;
        int i13 = this.maxSelections;
        boolean z4 = this.isRequired;
        List<FormAnswerOptionModel> list = this.answers;
        Action action = this.onAnswer;
        String str4 = this.userVisibleProgressIndicator;
        String str5 = this.userVisibleSubmitButtonText;
        String str6 = this.userVisibleCompletedButtonText;
        String str7 = this.placeholder;
        int i14 = this.userInputTextMaxLength;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("FormQuestionModel(id=", str, ", prompt=", str2, ", type=");
        sbM32001t.append(str3);
        sbM32001t.append(", answerDisplayStyle=");
        sbM32001t.append(answerDisplayStyle);
        sbM32001t.append(", maxSelections=");
        AbstractC13673n.m38573t(i13, ", isRequired=", ", answers=", sbM32001t, z4);
        sbM32001t.append(list);
        sbM32001t.append(", onAnswer=");
        sbM32001t.append(action);
        sbM32001t.append(", userVisibleProgressIndicator=");
        AbstractC11266d.m30444B(sbM32001t, str4, ", userVisibleSubmitButtonText=", str5, ", userVisibleCompletedButtonText=");
        AbstractC11266d.m30444B(sbM32001t, str6, ", placeholder=", str7, ", userInputTextMaxLength=");
        return AbstractC18489d0.m53371l(sbM32001t, i14, ")");
    }

    public /* synthetic */ FormQuestionModel(int i13, String str, String str2, String str3, AnswerDisplayStyle answerDisplayStyle, int i14, boolean z4, List list, Action action, String str4, String str5, String str6, String str7, int i15, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i13 & 2) == 0) {
            this.prompt = "";
        } else {
            this.prompt = str2;
        }
        if ((i13 & 4) == 0) {
            this.type = "";
        } else {
            this.type = str3;
        }
        if ((i13 & 8) == 0) {
            this.answerDisplayStyle = null;
        } else {
            this.answerDisplayStyle = answerDisplayStyle;
        }
        if ((i13 & 16) == 0) {
            this.maxSelections = 1;
        } else {
            this.maxSelections = i14;
        }
        if ((i13 & 32) == 0) {
            this.isRequired = true;
        } else {
            this.isRequired = z4;
        }
        if ((i13 & 64) == 0) {
            this.answers = C25271y.f99162w;
        } else {
            this.answers = list;
        }
        if ((i13 & 128) == 0) {
            this.onAnswer = null;
        } else {
            this.onAnswer = action;
        }
        if ((i13 & 256) == 0) {
            this.userVisibleProgressIndicator = "";
        } else {
            this.userVisibleProgressIndicator = str4;
        }
        if ((i13 & 512) == 0) {
            this.userVisibleSubmitButtonText = "";
        } else {
            this.userVisibleSubmitButtonText = str5;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.userVisibleCompletedButtonText = "";
        } else {
            this.userVisibleCompletedButtonText = str6;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.placeholder = "";
        } else {
            this.placeholder = str7;
        }
        this.userInputTextMaxLength = (i13 & 4096) == 0 ? ErrorCodes.InitAPIErrors.cServerErrors : i15;
    }

    public FormQuestionModel(String id4, String prompt, String type, AnswerDisplayStyle answerDisplayStyle, int i13, boolean z4, List<FormAnswerOptionModel> answers, Action action, String userVisibleProgressIndicator, String userVisibleSubmitButtonText, String userVisibleCompletedButtonText, String placeholder, int i14) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(prompt, "prompt");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(answers, "answers");
        AbstractC22676k.m65750j(userVisibleProgressIndicator, "userVisibleProgressIndicator");
        AbstractC22676k.m65750j(userVisibleSubmitButtonText, "userVisibleSubmitButtonText");
        AbstractC22676k.m65750j(userVisibleCompletedButtonText, "userVisibleCompletedButtonText");
        AbstractC22676k.m65750j(placeholder, "placeholder");
        this.id = id4;
        this.prompt = prompt;
        this.type = type;
        this.answerDisplayStyle = answerDisplayStyle;
        this.maxSelections = i13;
        this.isRequired = z4;
        this.answers = answers;
        this.onAnswer = action;
        this.userVisibleProgressIndicator = userVisibleProgressIndicator;
        this.userVisibleSubmitButtonText = userVisibleSubmitButtonText;
        this.userVisibleCompletedButtonText = userVisibleCompletedButtonText;
        this.placeholder = placeholder;
        this.userInputTextMaxLength = i14;
    }

    public /* synthetic */ FormQuestionModel(String str, String str2, String str3, AnswerDisplayStyle answerDisplayStyle, int i13, boolean z4, List list, Action action, String str4, String str5, String str6, String str7, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? "" : str, (i15 & 2) != 0 ? "" : str2, (i15 & 4) != 0 ? "" : str3, (i15 & 8) != 0 ? null : answerDisplayStyle, (i15 & 16) != 0 ? 1 : i13, (i15 & 32) == 0 ? z4 : true, (i15 & 64) != 0 ? C25271y.f99162w : list, (i15 & 128) == 0 ? action : null, (i15 & 256) != 0 ? "" : str4, (i15 & 512) != 0 ? "" : str5, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? "" : str6, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0 ? str7 : "", (i15 & 4096) != 0 ? 2000 : i14);
    }
}
