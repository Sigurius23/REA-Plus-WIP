package pl0;

import android.net.Uri;
import bl0.C3369a;
import c41.C4067l5;
import com.whoop.bot.models.conversation.AiChatConversation;
import com.whoop.bot.models.conversation.AiChatConversationKt;
import com.whoop.bot.models.conversation.AiChatMessage;
import com.whoop.bot.models.conversation.AiChatMessageKt;
import com.whoop.bot.models.conversation.AiMessageStatus;
import com.whoop.bot.models.conversation.BetaTagModel;
import com.whoop.bot.models.feedback.AiMessageFeedback;
import com.whoop.bot.models.history.ConversationHistoryItem;
import com.whoop.bot.models.history.ConversationHistorySection;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ArticleTileCarouselModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import fl0.AbstractC14566k;
import fl0.C14558c;
import fl0.C14564i;
import fl0.EnumC14565j;
import gl0.C15965d;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import h51.C16934f;
import hl0.AbstractC17395d;
import hl0.C17394c;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import il0.C18620c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iz0.C21054m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jb1.C21535a;
import js0.AbstractC21909c;
import kd1.AbstractC22403o;
import l83.C23465k;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import nl0.C26799a;
import nl0.C26801c;
import nl0.C26804f;
import nl0.C26805g;
import nl0.C26806h;
import nl0.C26807i;
import nl0.C26808j;
import nl0.C26809k;
import nl0.C26810l;
import nl0.C26812n;
import nl0.EnumC26800b;
import nl0.EnumC26811m;
import nr0.C27072e;
import oz0.C28497c;
import p031b9.AbstractC2875y;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;
import wk0.AbstractC37335a;
import wk0.AbstractC37336b;
import x81.C38072d;
import y71.C39274g;
import zk0.C40819i0;

/* JADX INFO: renamed from: pl0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0011H\u0002¢\u0006\u0004\b)\u0010*J9\u00103\u001a\u0002022\u0006\u0010+\u001a\u00020\"2\u0006\u0010-\u001a\u00020,2\u0006\u0010!\u001a\u00020 2\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0004\b3\u00104J#\u00107\u001a\u0004\u0018\u0001002\u0006\u00105\u001a\u00020,2\b\u00106\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0004\b7\u00108J\u0019\u0010<\u001a\u00020;2\b\u0010:\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020.2\u0006\u0010>\u001a\u00020\"H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020A2\u0006\u0010>\u001a\u00020\"H\u0002¢\u0006\u0004\bB\u0010CJ\u0015\u0010F\u001a\u00020E2\u0006\u0010D\u001a\u00020\u001b¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\u0006\u0010H\u001a\u00020,H\u0007¢\u0006\u0004\bI\u0010JJ\u001f\u0010K\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\u0006\u0010H\u001a\u00020,H\u0007¢\u0006\u0004\bK\u0010JR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010PR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010W\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010VR'\u0010]\u001a\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020Z0X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010[\u001a\u0004\bN\u0010\\¨\u0006^"}, m65681d2 = {"Lpl0/d;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagRepository", "Ljs0/c;", "configurationRepository", "Ljb1/a;", "reducer", "", "hint", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Ljs0/c;Ljb1/a;Ljava/lang/String;)V", "Lgl0/d;", "result", "Lnl0/j;", "g", "(Lgl0/d;)Lnl0/j;", "Lhl0/c;", "Lnl0/k;", "i", "(Lhl0/c;)Lnl0/k;", "conversationId", "Lil0/c;", "historyState", "Lnl0/i;", "p", "(Ljava/lang/String;Lil0/c;)Lnl0/i;", "Lbl0/a;", "Lnl0/m;", "k", "(Lbl0/a;)Lnl0/m;", "loadingState", "Lcom/whoop/bot/models/conversation/AiChatConversation;", "conversation", "", "j", "(Lnl0/m;Lcom/whoop/bot/models/conversation/AiChatConversation;Lcom/whoop/data/repositories/FeatureFlagChecker;)Z", "Lfl0/c;", "conversationResult", "feedbackResult", "Lnl0/a;", "q", "(Lfl0/c;Lhl0/c;)Lnl0/a;", "isLoading", "Lcom/whoop/bot/models/conversation/AiChatMessage;", "aiChatMessage", "", "index", "Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "localMessageFeedback", "Lnl0/c;", "l", "(ZLcom/whoop/bot/models/conversation/AiChatMessage;Lcom/whoop/bot/models/conversation/AiChatConversation;ILcom/whoop/bot/models/feedback/AiMessageFeedback;)Lnl0/c;", "message", "localFeedback", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/bot/models/conversation/AiChatMessage;Lcom/whoop/bot/models/feedback/AiMessageFeedback;)Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "Lcom/whoop/bot/models/conversation/BetaTagModel;", "betaTagModel", "Lnl0/g;", "f", "(Lcom/whoop/bot/models/conversation/BetaTagModel;)Lnl0/g;", "shouldShowStopGenerating", "n", "(Z)I", "Ly81/e;", "m", "(Z)Ly81/e;", "domainResult", "Lnl0/f;", "e", "(Lbl0/a;)Lnl0/f;", "currentMessage", "o", "(Lcom/whoop/bot/models/conversation/AiChatConversation;Lcom/whoop/bot/models/conversation/AiChatMessage;)Z", "c", "a", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "b", "Ljs0/c;", "Ljb1/a;", "Lcom/whoop/design/util/TextResource$b;", "d", "Lcom/whoop/design/util/TextResource$b;", "defaultHint", "Lcom/whoop/design/util/TextResource;", "Lcom/whoop/design/util/TextResource;", "initialHint", "Ll83/k;", "Liz0/m;", "Lzk0/i0;", "Ll83/h;", "()Ll83/k;", "markdownStyles", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29346d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21535a reducer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource.C8688b defaultHint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource initialHint;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC23462h markdownStyles;

    /* JADX INFO: renamed from: pl0.d$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f118939a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f118940b;

        static {
            int[] iArr = new int[EnumC14565j.values().length];
            try {
                iArr[EnumC14565j.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC14565j.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC14565j.FLAGGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f118939a = iArr;
            int[] iArr2 = new int[EnumC26811m.values().length];
            try {
                iArr2[EnumC26811m.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC26811m.MESSAGE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f118940b = iArr2;
        }
    }

    /* JADX INFO: renamed from: pl0.d$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f118941w = new b();

        /* JADX INFO: renamed from: a */
        public final long m89436a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCoachBlue();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m89436a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: pl0.d$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f118942w = new c();

        /* JADX INFO: renamed from: a */
        public final long m89437a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAlert();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m89437a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: pl0.d$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f118943w = new d();

        /* JADX INFO: renamed from: a */
        public final long m89438a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m89438a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: pl0.d$e */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f118944w = new e();

        /* JADX INFO: renamed from: a */
        public final long m89439a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m89439a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: pl0.d$f */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f118945w = new f();

        /* JADX INFO: renamed from: a */
        public final long m89440a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m89440a((C39336i) obj));
        }
    }

    public C29346d(FeatureFlagChecker featureFlagRepository, AbstractC21909c configurationRepository, C21535a reducer, String hint) {
        AbstractC22676k.m65750j(featureFlagRepository, "featureFlagRepository");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(hint, "hint");
        this.featureFlagRepository = featureFlagRepository;
        this.configurationRepository = configurationRepository;
        this.reducer = reducer;
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC37336b.f159683n);
        this.defaultHint = c8688bM21277k;
        this.initialHint = hint.length() != 0 ? AbstractC8693b.m21278l(hint) : c8688bM21277k;
        this.markdownStyles = AbstractC30060g.m92088H(new C27072e(this, 26));
    }

    /* JADX INFO: renamed from: b */
    private final C23465k m89420b() {
        return (C23465k) this.markdownStyles.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23465k m89421d(C29346d c29346d) {
        return new C29348f(c29346d.configurationRepository, c29346d.featureFlagRepository).m89450a();
    }

    /* JADX INFO: renamed from: f */
    private final C26805g m89422f(BetaTagModel betaTagModel) {
        if (this.featureFlagRepository.isFeatureEnabled(FeatureFlagRepositoryKt.HAL_BFF_BETA_TAG)) {
            return new C26805g(AbstractC8693b.m21278l(betaTagModel != null ? betaTagModel.getTitle() : null), betaTagModel != null ? betaTagModel.getDestination() : null, null, 4, null);
        }
        return new C26805g(this.featureFlagRepository.isFeatureEnabled(FeatureFlagRepositoryKt.HAL_WAKE_UP_REPORT_BETA_TAG) ? AbstractC8693b.m21277k(AbstractC37336b.f159639P0) : AbstractC8693b.m21277k(AbstractC37336b.f159637O0), null, null, 4, null);
    }

    /* JADX INFO: renamed from: g */
    private final C26808j m89423g(C15965d result) {
        ArticleTileCarouselModel educationHub = result.getEducationHub();
        if (educationHub != null && this.featureFlagRepository.isFeatureEnabled(FeatureFlagRepositoryKt.HAL_EDUCATION_HUB)) {
            InterfaceC25312u interfaceC25312uM60541h = this.reducer.m60541h(educationHub);
            C16934f c16934f = interfaceC25312uM60541h instanceof C16934f ? (C16934f) interfaceC25312uM60541h : null;
            if (c16934f != null) {
                return new C26808j(result.getShow(), C16934f.m47677b(c16934f, null, null, AbstractC18249c.m52575m(p745y81.Function1.m125323a(b.f118941w)), null, AbstractC8693b.m21277k(result.getShow() ? AbstractC16277f.f62393w2 : AbstractC37336b.f159695t), new C39274g(result.getShow() ? C38072d.f163053a.m121951d().getAction().getCollapse() : AbstractC37335a.f159599a, null, 2, null), false, false, result.getShow() ? c16934f.m47683h() : C25271y.f99162w, null, null, null, false, 7883, null));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    private final AiMessageFeedback m89424h(AiChatMessage message, AiMessageFeedback localFeedback) {
        if (localFeedback != null && (!AbstractC22676k.m65745e(message.getFeedbackType(), localFeedback.getFeedbackType()) || !AbstractC22676k.m65745e(message.getFeedbackReasons(), localFeedback.getFeedbackReasons()) || !AbstractC22676k.m65745e(message.getFeedbackResponse(), localFeedback.getFeedbackResponse()))) {
            return localFeedback;
        }
        String feedbackType = message.getFeedbackType();
        if (feedbackType == null) {
            return null;
        }
        String feedbackResponse = message.getFeedbackResponse();
        if (feedbackResponse == null) {
            feedbackResponse = "";
        }
        return new AiMessageFeedback(feedbackType, feedbackResponse, message.getFeedbackReasons());
    }

    /* JADX INFO: renamed from: i */
    private final C26809k m89425i(C17394c result) {
        InterfaceC39332e interfaceC39332eM125323a;
        int iM8290c;
        TextResource.C8688b c8688bM21277k;
        boolean showToast = result.getShowToast();
        AbstractC17395d toastStyle = result.getToastStyle();
        AbstractC17395d.a aVar = AbstractC17395d.a.f67356a;
        if (AbstractC22676k.m65745e(toastStyle, aVar)) {
            interfaceC39332eM125323a = p745y81.Function1.m125323a(c.f118942w);
        } else {
            if (!AbstractC22676k.m65745e(toastStyle, AbstractC17395d.b.f67357a)) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC39332eM125323a = p745y81.Function1.m125323a(d.f118943w);
        }
        AbstractC17395d toastStyle2 = result.getToastStyle();
        if (AbstractC22676k.m65745e(toastStyle2, aVar)) {
            iM8290c = AbstractC18489d0.m53362c(C38072d.f163053a);
        } else {
            if (!AbstractC22676k.m65745e(toastStyle2, AbstractC17395d.b.f67357a)) {
                throw new NoWhenBranchMatchedException();
            }
            iM8290c = AbstractC2875y.m8290c(C38072d.f163053a);
        }
        AbstractC17395d toastStyle3 = result.getToastStyle();
        if (AbstractC22676k.m65745e(toastStyle3, aVar)) {
            c8688bM21277k = AbstractC8693b.m21277k(AbstractC37336b.f159703x);
        } else {
            if (!AbstractC22676k.m65745e(toastStyle3, AbstractC17395d.b.f67357a)) {
                throw new NoWhenBranchMatchedException();
            }
            c8688bM21277k = AbstractC8693b.m21277k(AbstractC37336b.f159620G);
        }
        return new C26809k(showToast, interfaceC39332eM125323a, iM8290c, c8688bM21277k);
    }

    /* JADX INFO: renamed from: j */
    private final boolean m89426j(EnumC26811m loadingState, AiChatConversation conversation, FeatureFlagChecker featureFlagRepository) {
        int i13 = a.f118940b[loadingState.ordinal()];
        if (i13 != 1 && i13 != 2) {
            return false;
        }
        if (!featureFlagRepository.isFeatureEnabled("wce-polling-preview-update")) {
            List<AiChatMessage> messages = conversation.getMessages();
            if ((messages instanceof Collection) && messages.isEmpty()) {
                return false;
            }
            Iterator<T> it = messages.iterator();
            while (it.hasNext()) {
                if (AiChatMessageKt.isAssistant((AiChatMessage) it.next())) {
                    return true;
                }
            }
            return false;
        }
        List<AiChatMessage> messages2 = conversation.getMessages();
        if ((messages2 instanceof Collection) && messages2.isEmpty()) {
            return false;
        }
        for (AiChatMessage aiChatMessage : messages2) {
            if (AiChatMessageKt.isAssistant(aiChatMessage) && aiChatMessage.getContent().length() >= 25) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    private final EnumC26811m m89427k(C3369a result) {
        EnumC26811m loadingState = result.getAiConversationResult().getLoadingState();
        EnumC26811m enumC26811m = EnumC26811m.FEATURE_UNAVAILABLE;
        if (loadingState == enumC26811m) {
            return enumC26811m;
        }
        int i13 = a.f118939a[result.getAiConversationResult().getMessagingState().ordinal()];
        if (i13 == 1) {
            return EnumC26811m.MESSAGE_LOADING;
        }
        if (i13 != 2) {
            return i13 != 3 ? result.getAiConversationResult().getLoadingState() : EnumC26811m.MESSAGE_FLAGGED;
        }
        return EnumC26811m.MESSAGE_ERROR;
    }

    /* JADX INFO: renamed from: l */
    private final C26801c m89428l(boolean isLoading, AiChatMessage aiChatMessage, AiChatConversation conversation, int index, AiMessageFeedback localMessageFeedback) {
        List list;
        EnumC26800b enumC26800b = AiChatMessageKt.isUser(aiChatMessage) ? EnumC26800b.USER : EnumC26800b.ASSISTANT;
        List<InterfaceC25312u> listM60540g = this.reducer.m60540g(aiChatMessage.getAdditionalContext());
        if ((!AiChatMessageKt.isAssistant(aiChatMessage) || AbstractC29347e.m89447g(index, conversation)) && !isLoading) {
            list = listM60540g;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM60540g) {
                InterfaceC25312u interfaceC25312u = (InterfaceC25312u) obj;
                if (!(interfaceC25312u instanceof C28497c) && !(interfaceC25312u instanceof C4067l5)) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        boolean zM89435o = m89435o(conversation, aiChatMessage);
        boolean z4 = true;
        if (aiChatMessage.getMessageStatus() != AiMessageStatus.COMPLETE) {
            z4 = false;
        }
        return new C26801c(zM89435o, z4, aiChatMessage.getMessageStatus() == AiMessageStatus.STOPPED, AbstractC29347e.m89446f(aiChatMessage), AbstractC29347e.m89445e(aiChatMessage), aiChatMessage.getContent(), aiChatMessage.getTimestamp(), enumC26800b, aiChatMessage.getId(), aiChatMessage.getCanHaveFeedback(), list, aiChatMessage.isSuggestion(), m89424h(aiChatMessage, localMessageFeedback));
    }

    /* JADX INFO: renamed from: m */
    private final InterfaceC39332e m89429m(boolean shouldShowStopGenerating) {
        return !shouldShowStopGenerating ? p745y81.Function1.m125323a(e.f118944w) : p745y81.Function1.m125323a(f.f118945w);
    }

    /* JADX INFO: renamed from: n */
    private final int m89430n(boolean shouldShowStopGenerating) {
        return !shouldShowStopGenerating ? C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowUp() : AbstractC37335a.f159607i;
    }

    /* JADX INFO: renamed from: p */
    private final C26807i m89431p(String conversationId, C18620c historyState) {
        boolean isLoading = historyState.getIsLoading();
        boolean isError = historyState.getIsError();
        List<ConversationHistorySection> chatHistory = historyState.getConversationHistory().getChatHistory();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(chatHistory, 10));
        for (ConversationHistorySection conversationHistorySection : chatHistory) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l(conversationHistorySection.getTitle());
            List<ConversationHistoryItem> conversations = conversationHistorySection.getConversations();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(conversations, 10));
            for (ConversationHistoryItem conversationHistoryItem : conversations) {
                String id4 = conversationHistoryItem.getId();
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(conversationHistoryItem.getTitle());
                EnumC16313m0 icon = conversationHistoryItem.getIcon();
                arrayList2.add(new C26812n(id4, textResourceM21278l2, icon != null ? new AbstractC22403o.a(icon.toWhoopIcon()) : null));
            }
            arrayList.add(new C26806h(textResourceM21278l, arrayList2));
        }
        return new C26807i(isLoading, isError, conversationId, arrayList);
    }

    /* JADX INFO: renamed from: q */
    private final C26799a m89432q(C14558c conversationResult, C17394c feedbackResult) {
        boolean z4;
        List<AiChatMessage> messages = conversationResult.getConversation().getMessages();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(messages, 10));
        Iterator<T> it = messages.iterator();
        int i13 = 0;
        while (true) {
            ArrayList arrayList2 = null;
            if (!it.hasNext()) {
                List listM74156w1 = AbstractC25265s.m74156w1(conversationResult.getConversation().getSuggestions(), 3);
                if (conversationResult.getConversation().getMessages().size() == 1) {
                    List<AiChatMessage> messages2 = conversationResult.getConversation().getMessages();
                    if (!(messages2 instanceof Collection) || !messages2.isEmpty()) {
                        Iterator<T> it3 = messages2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (AiChatMessageKt.isUser((AiChatMessage) it3.next())) {
                                    z4 = true;
                                }
                            }
                        }
                    }
                    z4 = false;
                } else {
                    z4 = true;
                }
                List<DesignSystemModel> conversationContext = conversationResult.getConversation().getConversationContext();
                if (conversationContext != null) {
                    List<DesignSystemModel> list = conversationContext;
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                    Iterator<T> it4 = list.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(this.reducer.m60541h((DesignSystemModel) it4.next()));
                    }
                }
                return new C26799a(arrayList, listM74156w1, z4, arrayList2, conversationResult.getConversation().getHeader(), conversationResult.getConversation().getId(), m89422f(conversationResult.getConversation().getTag()));
            }
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            AiChatMessage aiChatMessage = (AiChatMessage) next;
            EnumC14565j messagingState = conversationResult.getMessagingState();
            EnumC14565j enumC14565j = EnumC14565j.LOADING;
            boolean z13 = messagingState == enumC14565j;
            AiChatConversation conversation = conversationResult.getConversation();
            if (conversationResult.getMessagingState() == enumC14565j && i13 != 0) {
                i13--;
            }
            arrayList.add(m89428l(z13, aiChatMessage, conversation, i13, feedbackResult.m49233c().getOrDefault(aiChatMessage.getId(), null)));
            i13 = i14;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m89433c(AiChatConversation conversation, AiChatMessage currentMessage) {
        AbstractC22676k.m65750j(conversation, "conversation");
        AbstractC22676k.m65750j(currentMessage, "currentMessage");
        int iIndexOf = conversation.getMessages().indexOf(currentMessage);
        if (iIndexOf != 0) {
            if (AiChatMessageKt.isAssistant(conversation.getMessages().get(iIndexOf)) && AiChatMessageKt.isAssistant(conversation.getMessages().get(iIndexOf - 1))) {
                return true;
            }
            if (AiChatMessageKt.isUser(conversation.getMessages().get(iIndexOf)) && AiChatMessageKt.isUser(conversation.getMessages().get(iIndexOf - 1))) {
                return true;
            }
            Boolean boolIsSuggestion = conversation.getMessages().get(iIndexOf).isSuggestion();
            Boolean bool = Boolean.TRUE;
            if (AbstractC22676k.m65745e(boolIsSuggestion, bool) && AbstractC22676k.m65745e(conversation.getMessages().get(iIndexOf - 1).isSuggestion(), bool)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final C26804f m89434e(C3369a domainResult) {
        TextResource textResource;
        ArrayList arrayList;
        AbstractC22676k.m65750j(domainResult, "domainResult");
        AiChatConversation conversation = domainResult.getAiConversationResult().getConversation();
        C26799a c26799aM89432q = m89432q(domainResult.getAiConversationResult(), domainResult.getFeedbackResult());
        EnumC14565j messagingState = domainResult.getAiConversationResult().getMessagingState();
        C26809k c26809kM89425i = m89425i(domainResult.getFeedbackResult());
        EnumC26811m enumC26811mM89427k = m89427k(domainResult);
        C23465k c23465kM89420b = m89420b();
        C21054m c21054m = (C21054m) c23465kM89420b.f92937w;
        C40819i0 c40819i0 = (C40819i0) c23465kM89420b.f92938x;
        int iM89430n = m89430n((!AbstractC29347e.m89448h(conversation) || messagingState == EnumC14565j.LOADING || AbstractC29347e.m89446f((AiChatMessage) AbstractC25265s.m74112P0(conversation.getMessages()))) ? false : true);
        InterfaceC39332e interfaceC39332eM89429m = m89429m((!AbstractC29347e.m89448h(conversation) || messagingState == EnumC14565j.LOADING || AbstractC29347e.m89446f((AiChatMessage) AbstractC25265s.m74112P0(conversation.getMessages()))) ? false : true);
        boolean zM89448h = AbstractC29347e.m89448h(conversation);
        boolean z4 = (!AbstractC29347e.m89448h(conversation) || messagingState == EnumC14565j.LOADING || AbstractC29347e.m89446f((AiChatMessage) AbstractC25265s.m74112P0(conversation.getMessages()))) ? false : true;
        List<C26801c> listM79883f = c26799aM89432q.m79883f();
        if (!(listM79883f instanceof Collection) || !listM79883f.isEmpty()) {
            Iterator<T> it = listM79883f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    textResource = this.initialHint;
                    break;
                }
                if (((C26801c) it.next()).getRole() == EnumC26800b.USER) {
                    textResource = this.defaultHint;
                    break;
                }
            }
        } else {
            textResource = this.initialHint;
            break;
        }
        TextResource textResource2 = textResource;
        C26807i c26807iM89431p = m89431p(conversation.getId(), domainResult.getChatHistoryResult());
        AbstractC14566k retryAction = domainResult.getAiConversationResult().getRetryAction();
        boolean z13 = domainResult.getAiConversationResult().getShowKeyboardOnLaunch() && domainResult.getHasShownOverlay();
        C26808j c26808jM89423g = m89423g(domainResult.getEducationHub());
        AiChatMessage latestAssistantResponse = AiChatConversationKt.getLatestAssistantResponse(conversation);
        boolean stoppedByUser = latestAssistantResponse != null ? latestAssistantResponse.getStoppedByUser() : false;
        boolean zIsFeatureEnabled = this.featureFlagRepository.isFeatureEnabled(FeatureFlagRepositoryKt.WHOOP_COACH_TYPEWRITER_EFFECT_FIX);
        boolean hasShownOverlay = domainResult.getHasShownOverlay();
        List<C14564i> listM41670b = domainResult.getAiConversationResult().m41670b();
        if (listM41670b != null) {
            List<C14564i> list = listM41670b;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                C14564i c14564i = (C14564i) it3.next();
                Iterator it4 = it3;
                boolean isUploading = c14564i.getIsUploading();
                boolean z14 = hasShownOverlay;
                boolean isError = c14564i.getIsError();
                Uri uri = c14564i.getUri();
                arrayList2.add(new C26810l(isUploading, isError, uri != null ? new AbstractC22403o.c(uri.toString(), 0, 0, 0, 14, null) : null, c14564i.getFileId()));
                it3 = it4;
                hasShownOverlay = z14;
                iM89430n = iM89430n;
                interfaceC39332eM89429m = interfaceC39332eM89429m;
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new C26804f(iM89430n, interfaceC39332eM89429m, zM89448h, z4, c26799aM89432q, enumC26811mM89427k, textResource2, c26807iM89431p, retryAction, z13, c26809kM89425i, c26808jM89423g, stoppedByUser, zIsFeatureEnabled, Boolean.valueOf(hasShownOverlay), arrayList, false, m89426j(enumC26811mM89427k, conversation, this.featureFlagRepository), c21054m, c40819i0);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m89435o(AiChatConversation conversation, AiChatMessage currentMessage) {
        AbstractC22676k.m65750j(conversation, "conversation");
        AbstractC22676k.m65750j(currentMessage, "currentMessage");
        return conversation.getMessages().size() < 2 || !m89433c(conversation, currentMessage);
    }

    public /* synthetic */ C29346d(FeatureFlagChecker featureFlagChecker, AbstractC21909c abstractC21909c, C21535a c21535a, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(featureFlagChecker, abstractC21909c, (i13 & 4) != 0 ? AbstractC29345c.m89363U() : c21535a, (i13 & 8) != 0 ? "" : str);
    }
}
