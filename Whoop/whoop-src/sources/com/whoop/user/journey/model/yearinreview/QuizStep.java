package com.whoop.user.journey.model.yearinreview;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.user.journey.model.UserJourneyStep;
import cq2.C11062a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\u0085\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0018J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0018J|\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0018J\u0010\u0010'\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-J'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b:\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b=\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b>\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b?\u0010\u0018R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b@\u0010\u0018R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\bA\u0010\u0018R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\bB\u0010\u0018R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\bC\u0010\u0018¨\u0006F"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/QuizStep;", "Lcom/whoop/user/journey/model/UserJourneyStep;", "", "whoopCoachQuestion", "", "Lcom/whoop/user/journey/model/yearinreview/QuizAnswerOption;", "answerOptions", "Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;", "whoopCoachIncorrectResponse", "whoopCoachCorrectResponse", "whoopCoachAnswerStatement", "avatarUrl", "correctResponseIconUrl", "name", "theme", "themeVariant", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/yearinreview/QuizStep;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/yearinreview/QuizStep;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getWhoopCoachQuestion", "Ljava/util/List;", "getAnswerOptions", "Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;", "getWhoopCoachIncorrectResponse", "getWhoopCoachCorrectResponse", "getWhoopCoachAnswerStatement", "getAvatarUrl", "getCorrectResponseIconUrl", "getName", "getTheme", "getThemeVariant", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class QuizStep implements UserJourneyStep {
    private final List<QuizAnswerOption> answerOptions;
    private final String avatarUrl;
    private final String correctResponseIconUrl;
    private final String name;
    private final String theme;
    private final String themeVariant;
    private final String whoopCoachAnswerStatement;
    private final WhoopCoachResponse whoopCoachCorrectResponse;
    private final WhoopCoachResponse whoopCoachIncorrectResponse;
    private final String whoopCoachQuestion;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C11062a(12)), null, null, null, null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/QuizStep$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/yearinreview/QuizStep;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return QuizStep$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ QuizStep(int i13, String str, List list, WhoopCoachResponse whoopCoachResponse, WhoopCoachResponse whoopCoachResponse2, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i13 & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1023, QuizStep$$serializer.INSTANCE.getDescriptor());
        }
        this.whoopCoachQuestion = str;
        this.answerOptions = list;
        this.whoopCoachIncorrectResponse = whoopCoachResponse;
        this.whoopCoachCorrectResponse = whoopCoachResponse2;
        this.whoopCoachAnswerStatement = str2;
        this.avatarUrl = str3;
        this.correctResponseIconUrl = str4;
        this.name = str5;
        this.theme = str6;
        this.themeVariant = str7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(QuizAnswerOption$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuizStep copy$default(QuizStep quizStep, String str, List list, WhoopCoachResponse whoopCoachResponse, WhoopCoachResponse whoopCoachResponse2, String str2, String str3, String str4, String str5, String str6, String str7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = quizStep.whoopCoachQuestion;
        }
        if ((i13 & 2) != 0) {
            list = quizStep.answerOptions;
        }
        if ((i13 & 4) != 0) {
            whoopCoachResponse = quizStep.whoopCoachIncorrectResponse;
        }
        if ((i13 & 8) != 0) {
            whoopCoachResponse2 = quizStep.whoopCoachCorrectResponse;
        }
        if ((i13 & 16) != 0) {
            str2 = quizStep.whoopCoachAnswerStatement;
        }
        if ((i13 & 32) != 0) {
            str3 = quizStep.avatarUrl;
        }
        if ((i13 & 64) != 0) {
            str4 = quizStep.correctResponseIconUrl;
        }
        if ((i13 & 128) != 0) {
            str5 = quizStep.name;
        }
        if ((i13 & 256) != 0) {
            str6 = quizStep.theme;
        }
        if ((i13 & 512) != 0) {
            str7 = quizStep.themeVariant;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        String str12 = str2;
        String str13 = str3;
        return quizStep.copy(str, list, whoopCoachResponse, whoopCoachResponse2, str12, str13, str10, str11, str8, str9);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(QuizStep self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.whoopCoachQuestion);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.answerOptions);
        WhoopCoachResponse$$serializer whoopCoachResponse$$serializer = WhoopCoachResponse$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 2, whoopCoachResponse$$serializer, self.whoopCoachIncorrectResponse);
        output.encodeSerializableElement(serialDesc, 3, whoopCoachResponse$$serializer, self.whoopCoachCorrectResponse);
        output.encodeStringElement(serialDesc, 4, self.whoopCoachAnswerStatement);
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.avatarUrl);
        output.encodeStringElement(serialDesc, 6, self.correctResponseIconUrl);
        output.encodeStringElement(serialDesc, 7, self.name);
        output.encodeStringElement(serialDesc, 8, self.theme);
        output.encodeStringElement(serialDesc, 9, self.themeVariant);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWhoopCoachQuestion() {
        return this.whoopCoachQuestion;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getThemeVariant() {
        return this.themeVariant;
    }

    public final List<QuizAnswerOption> component2() {
        return this.answerOptions;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final WhoopCoachResponse getWhoopCoachIncorrectResponse() {
        return this.whoopCoachIncorrectResponse;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final WhoopCoachResponse getWhoopCoachCorrectResponse() {
        return this.whoopCoachCorrectResponse;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getWhoopCoachAnswerStatement() {
        return this.whoopCoachAnswerStatement;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCorrectResponseIconUrl() {
        return this.correctResponseIconUrl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    public final QuizStep copy(String whoopCoachQuestion, List<QuizAnswerOption> answerOptions, WhoopCoachResponse whoopCoachIncorrectResponse, WhoopCoachResponse whoopCoachCorrectResponse, String whoopCoachAnswerStatement, String avatarUrl, String correctResponseIconUrl, String name, String theme, String themeVariant) {
        AbstractC22676k.m65750j(whoopCoachQuestion, "whoopCoachQuestion");
        AbstractC22676k.m65750j(answerOptions, "answerOptions");
        AbstractC22676k.m65750j(whoopCoachIncorrectResponse, "whoopCoachIncorrectResponse");
        AbstractC22676k.m65750j(whoopCoachCorrectResponse, "whoopCoachCorrectResponse");
        AbstractC22676k.m65750j(whoopCoachAnswerStatement, "whoopCoachAnswerStatement");
        AbstractC22676k.m65750j(correctResponseIconUrl, "correctResponseIconUrl");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        return new QuizStep(whoopCoachQuestion, answerOptions, whoopCoachIncorrectResponse, whoopCoachCorrectResponse, whoopCoachAnswerStatement, avatarUrl, correctResponseIconUrl, name, theme, themeVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuizStep)) {
            return false;
        }
        QuizStep quizStep = (QuizStep) other;
        return AbstractC22676k.m65745e(this.whoopCoachQuestion, quizStep.whoopCoachQuestion) && AbstractC22676k.m65745e(this.answerOptions, quizStep.answerOptions) && AbstractC22676k.m65745e(this.whoopCoachIncorrectResponse, quizStep.whoopCoachIncorrectResponse) && AbstractC22676k.m65745e(this.whoopCoachCorrectResponse, quizStep.whoopCoachCorrectResponse) && AbstractC22676k.m65745e(this.whoopCoachAnswerStatement, quizStep.whoopCoachAnswerStatement) && AbstractC22676k.m65745e(this.avatarUrl, quizStep.avatarUrl) && AbstractC22676k.m65745e(this.correctResponseIconUrl, quizStep.correctResponseIconUrl) && AbstractC22676k.m65745e(this.name, quizStep.name) && AbstractC22676k.m65745e(this.theme, quizStep.theme) && AbstractC22676k.m65745e(this.themeVariant, quizStep.themeVariant);
    }

    public final List<QuizAnswerOption> getAnswerOptions() {
        return this.answerOptions;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getCorrectResponseIconUrl() {
        return this.correctResponseIconUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTheme() {
        return this.theme;
    }

    public final String getThemeVariant() {
        return this.themeVariant;
    }

    public final String getWhoopCoachAnswerStatement() {
        return this.whoopCoachAnswerStatement;
    }

    public final WhoopCoachResponse getWhoopCoachCorrectResponse() {
        return this.whoopCoachCorrectResponse;
    }

    public final WhoopCoachResponse getWhoopCoachIncorrectResponse() {
        return this.whoopCoachIncorrectResponse;
    }

    public final String getWhoopCoachQuestion() {
        return this.whoopCoachQuestion;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.whoopCoachCorrectResponse.hashCode() + ((this.whoopCoachIncorrectResponse.hashCode() + AbstractC11895b.m31983b(this.whoopCoachQuestion.hashCode() * 31, 31, this.answerOptions)) * 31)) * 31, 31, this.whoopCoachAnswerStatement);
        String str = this.avatarUrl;
        return this.themeVariant.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.correctResponseIconUrl), 31, this.name), 31, this.theme);
    }

    public String toString() {
        String str = this.whoopCoachQuestion;
        List<QuizAnswerOption> list = this.answerOptions;
        WhoopCoachResponse whoopCoachResponse = this.whoopCoachIncorrectResponse;
        WhoopCoachResponse whoopCoachResponse2 = this.whoopCoachCorrectResponse;
        String str2 = this.whoopCoachAnswerStatement;
        String str3 = this.avatarUrl;
        String str4 = this.correctResponseIconUrl;
        String str5 = this.name;
        String str6 = this.theme;
        String str7 = this.themeVariant;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("QuizStep(whoopCoachQuestion=", str, ", answerOptions=", ", whoopCoachIncorrectResponse=", list);
        sbM94766o.append(whoopCoachResponse);
        sbM94766o.append(", whoopCoachCorrectResponse=");
        sbM94766o.append(whoopCoachResponse2);
        sbM94766o.append(", whoopCoachAnswerStatement=");
        AbstractC11266d.m30444B(sbM94766o, str2, ", avatarUrl=", str3, ", correctResponseIconUrl=");
        AbstractC11266d.m30444B(sbM94766o, str4, ", name=", str5, ", theme=");
        return AbstractC11266d.m30464r(sbM94766o, str6, ", themeVariant=", str7, ")");
    }

    public QuizStep(String whoopCoachQuestion, List<QuizAnswerOption> answerOptions, WhoopCoachResponse whoopCoachIncorrectResponse, WhoopCoachResponse whoopCoachCorrectResponse, String whoopCoachAnswerStatement, String str, String correctResponseIconUrl, String name, String theme, String themeVariant) {
        AbstractC22676k.m65750j(whoopCoachQuestion, "whoopCoachQuestion");
        AbstractC22676k.m65750j(answerOptions, "answerOptions");
        AbstractC22676k.m65750j(whoopCoachIncorrectResponse, "whoopCoachIncorrectResponse");
        AbstractC22676k.m65750j(whoopCoachCorrectResponse, "whoopCoachCorrectResponse");
        AbstractC22676k.m65750j(whoopCoachAnswerStatement, "whoopCoachAnswerStatement");
        AbstractC22676k.m65750j(correctResponseIconUrl, "correctResponseIconUrl");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        this.whoopCoachQuestion = whoopCoachQuestion;
        this.answerOptions = answerOptions;
        this.whoopCoachIncorrectResponse = whoopCoachIncorrectResponse;
        this.whoopCoachCorrectResponse = whoopCoachCorrectResponse;
        this.whoopCoachAnswerStatement = whoopCoachAnswerStatement;
        this.avatarUrl = str;
        this.correctResponseIconUrl = correctResponseIconUrl;
        this.name = name;
        this.theme = theme;
        this.themeVariant = themeVariant;
    }
}
