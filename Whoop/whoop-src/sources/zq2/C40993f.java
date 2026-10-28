package zq2;

import com.whoop.design.util.TextResource;
import com.whoop.user.journey.model.UserJourneyFooterStyle;
import er2.EnumC13585g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import lr2.InterfaceC24703d;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p717lq2.InterfaceC24673e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import v41.InterfaceC35689r0;

/* JADX INFO: renamed from: zq2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b4\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b7\u00109\u001a\u0004\b5\u0010:R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b;\u00109\u001a\u0004\b;\u0010:R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b?\u0010AR\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010B\u001a\u0004\b*\u0010CR\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010D\u001a\u0004\b&\u0010ER\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010F\u001a\u0004\b2\u0010\u001d¨\u0006G"}, m65681d2 = {"Lzq2/f;", "Llr2/d;", "Lcom/whoop/design/util/TextResource;", "whoopCoachQuestion", "", "Lzq2/a;", "answerOptions", "Lzq2/p;", "whoopCoachIncorrectResponse", "whoopCoachCorrectResponse", "whoopCoachAnswerStatement", "Ler2/g;", "chatType", "Lkd1/o;", "avatar", "correctResponseIcon", "Lv41/r0;", "lottieWrapper", "", "typingAnimationDelayTimeMillis", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "footerStyle", "Llq2/e;", "backgroundStyle", "", "userJourneyStepName", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lzq2/p;Lzq2/p;Lcom/whoop/design/util/TextResource;Ler2/g;Lkd1/o;Lkd1/o;Lv41/r0;JLcom/whoop/user/journey/model/UserJourneyFooterStyle;Llq2/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "n", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "c", "Lzq2/p;", "m", "()Lzq2/p;", "d", "l", "k", "f", "Ler2/g;", "g", "()Ler2/g;", "Lkd1/o;", "()Lkd1/o;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Lv41/r0;", "()Lv41/r0;", "j", "J", "()J", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "()Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "Llq2/e;", "()Llq2/e;", "Ljava/lang/String;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40993f implements InterfaceC24703d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource whoopCoachQuestion;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C40988a> answerOptions;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C41003p whoopCoachIncorrectResponse;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C41003p whoopCoachCorrectResponse;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource whoopCoachAnswerStatement;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC13585g chatType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final AbstractC22403o avatar;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final AbstractC22403o correctResponseIcon;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC35689r0 lottieWrapper;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final long typingAnimationDelayTimeMillis;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final UserJourneyFooterStyle footerStyle;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final InterfaceC24673e backgroundStyle;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final String userJourneyStepName;

    public C40993f(TextResource whoopCoachQuestion, List<C40988a> answerOptions, C41003p whoopCoachIncorrectResponse, C41003p whoopCoachCorrectResponse, TextResource whoopCoachAnswerStatement, EnumC13585g chatType, AbstractC22403o abstractC22403o, AbstractC22403o correctResponseIcon, InterfaceC35689r0 interfaceC35689r0, long j7, UserJourneyFooterStyle footerStyle, InterfaceC24673e backgroundStyle, String userJourneyStepName) {
        AbstractC22676k.m65750j(whoopCoachQuestion, "whoopCoachQuestion");
        AbstractC22676k.m65750j(answerOptions, "answerOptions");
        AbstractC22676k.m65750j(whoopCoachIncorrectResponse, "whoopCoachIncorrectResponse");
        AbstractC22676k.m65750j(whoopCoachCorrectResponse, "whoopCoachCorrectResponse");
        AbstractC22676k.m65750j(whoopCoachAnswerStatement, "whoopCoachAnswerStatement");
        AbstractC22676k.m65750j(chatType, "chatType");
        AbstractC22676k.m65750j(correctResponseIcon, "correctResponseIcon");
        AbstractC22676k.m65750j(footerStyle, "footerStyle");
        AbstractC22676k.m65750j(backgroundStyle, "backgroundStyle");
        AbstractC22676k.m65750j(userJourneyStepName, "userJourneyStepName");
        this.whoopCoachQuestion = whoopCoachQuestion;
        this.answerOptions = answerOptions;
        this.whoopCoachIncorrectResponse = whoopCoachIncorrectResponse;
        this.whoopCoachCorrectResponse = whoopCoachCorrectResponse;
        this.whoopCoachAnswerStatement = whoopCoachAnswerStatement;
        this.chatType = chatType;
        this.avatar = abstractC22403o;
        this.correctResponseIcon = correctResponseIcon;
        this.lottieWrapper = interfaceC35689r0;
        this.typingAnimationDelayTimeMillis = j7;
        this.footerStyle = footerStyle;
        this.backgroundStyle = backgroundStyle;
        this.userJourneyStepName = userJourneyStepName;
    }

    @Override // lr2.InterfaceC24703d
    /* JADX INFO: renamed from: a, reason: from getter */
    public InterfaceC24673e getBackgroundStyle() {
        return this.backgroundStyle;
    }

    @Override // lr2.InterfaceC24703d
    /* JADX INFO: renamed from: b, reason: from getter */
    public UserJourneyFooterStyle getFooterStyle() {
        return this.footerStyle;
    }

    @Override // lr2.InterfaceC24703d
    /* JADX INFO: renamed from: c */
    public /* bridge */ int mo5920c() {
        return super.mo5920c();
    }

    @Override // lr2.InterfaceC24703d
    /* JADX INFO: renamed from: d, reason: from getter */
    public String getUserJourneyStepName() {
        return this.userJourneyStepName;
    }

    /* JADX INFO: renamed from: e */
    public final List<C40988a> m133114e() {
        return this.answerOptions;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40993f)) {
            return false;
        }
        C40993f c40993f = (C40993f) other;
        return AbstractC22676k.m65745e(this.whoopCoachQuestion, c40993f.whoopCoachQuestion) && AbstractC22676k.m65745e(this.answerOptions, c40993f.answerOptions) && AbstractC22676k.m65745e(this.whoopCoachIncorrectResponse, c40993f.whoopCoachIncorrectResponse) && AbstractC22676k.m65745e(this.whoopCoachCorrectResponse, c40993f.whoopCoachCorrectResponse) && AbstractC22676k.m65745e(this.whoopCoachAnswerStatement, c40993f.whoopCoachAnswerStatement) && this.chatType == c40993f.chatType && AbstractC22676k.m65745e(this.avatar, c40993f.avatar) && AbstractC22676k.m65745e(this.correctResponseIcon, c40993f.correctResponseIcon) && AbstractC22676k.m65745e(this.lottieWrapper, c40993f.lottieWrapper) && this.typingAnimationDelayTimeMillis == c40993f.typingAnimationDelayTimeMillis && this.footerStyle == c40993f.footerStyle && AbstractC22676k.m65745e(this.backgroundStyle, c40993f.backgroundStyle) && AbstractC22676k.m65745e(this.userJourneyStepName, c40993f.userJourneyStepName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC22403o getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC13585g getChatType() {
        return this.chatType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final AbstractC22403o getCorrectResponseIcon() {
        return this.correctResponseIcon;
    }

    public int hashCode() {
        int iHashCode = (this.chatType.hashCode() + AbstractC31061c.m95625a((this.whoopCoachCorrectResponse.hashCode() + ((this.whoopCoachIncorrectResponse.hashCode() + AbstractC11895b.m31983b(this.whoopCoachQuestion.hashCode() * 31, 31, this.answerOptions)) * 31)) * 31, this.whoopCoachAnswerStatement, 31)) * 31;
        AbstractC22403o abstractC22403o = this.avatar;
        int iM91833c = AbstractC30007c.m91833c(this.correctResponseIcon, (iHashCode + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31, 31);
        InterfaceC35689r0 interfaceC35689r0 = this.lottieWrapper;
        return this.userJourneyStepName.hashCode() + AbstractC30007c.m91834d(this.backgroundStyle, (this.footerStyle.hashCode() + AbstractC11266d.m30451e((iM91833c + (interfaceC35689r0 != null ? interfaceC35689r0.hashCode() : 0)) * 31, this.typingAnimationDelayTimeMillis, 31)) * 31, 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final InterfaceC35689r0 getLottieWrapper() {
        return this.lottieWrapper;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getTypingAnimationDelayTimeMillis() {
        return this.typingAnimationDelayTimeMillis;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextResource getWhoopCoachAnswerStatement() {
        return this.whoopCoachAnswerStatement;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C41003p getWhoopCoachCorrectResponse() {
        return this.whoopCoachCorrectResponse;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final C41003p getWhoopCoachIncorrectResponse() {
        return this.whoopCoachIncorrectResponse;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final TextResource getWhoopCoachQuestion() {
        return this.whoopCoachQuestion;
    }

    public String toString() {
        TextResource textResource = this.whoopCoachQuestion;
        List<C40988a> list = this.answerOptions;
        C41003p c41003p = this.whoopCoachIncorrectResponse;
        C41003p c41003p2 = this.whoopCoachCorrectResponse;
        TextResource textResource2 = this.whoopCoachAnswerStatement;
        EnumC13585g enumC13585g = this.chatType;
        AbstractC22403o abstractC22403o = this.avatar;
        AbstractC22403o abstractC22403o2 = this.correctResponseIcon;
        InterfaceC35689r0 interfaceC35689r0 = this.lottieWrapper;
        long j7 = this.typingAnimationDelayTimeMillis;
        UserJourneyFooterStyle userJourneyFooterStyle = this.footerStyle;
        InterfaceC24673e interfaceC24673e = this.backgroundStyle;
        String str = this.userJourneyStepName;
        StringBuilder sbM106657p = AbstractC33745d.m106657p(textResource, "QuizStepState(whoopCoachQuestion=", ", answerOptions=", ", whoopCoachIncorrectResponse=", list);
        sbM106657p.append(c41003p);
        sbM106657p.append(", whoopCoachCorrectResponse=");
        sbM106657p.append(c41003p2);
        sbM106657p.append(", whoopCoachAnswerStatement=");
        sbM106657p.append(textResource2);
        sbM106657p.append(", chatType=");
        sbM106657p.append(enumC13585g);
        sbM106657p.append(", avatar=");
        sbM106657p.append(abstractC22403o);
        sbM106657p.append(", correctResponseIcon=");
        sbM106657p.append(abstractC22403o2);
        sbM106657p.append(", lottieWrapper=");
        sbM106657p.append(interfaceC35689r0);
        sbM106657p.append(", typingAnimationDelayTimeMillis=");
        sbM106657p.append(j7);
        sbM106657p.append(", footerStyle=");
        sbM106657p.append(userJourneyFooterStyle);
        sbM106657p.append(", backgroundStyle=");
        sbM106657p.append(interfaceC24673e);
        return AbstractC2875y.m8304q(sbM106657p, ", userJourneyStepName=", str, ")");
    }

    public /* synthetic */ C40993f(TextResource textResource, List list, C41003p c41003p, C41003p c41003p2, TextResource textResource2, EnumC13585g enumC13585g, AbstractC22403o abstractC22403o, AbstractC22403o abstractC22403o2, InterfaceC35689r0 interfaceC35689r0, long j7, UserJourneyFooterStyle userJourneyFooterStyle, InterfaceC24673e interfaceC24673e, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, list, c41003p, c41003p2, textResource2, enumC13585g, abstractC22403o, abstractC22403o2, interfaceC35689r0, (i13 & 512) != 0 ? 25L : j7, userJourneyFooterStyle, interfaceC24673e, str);
    }
}
