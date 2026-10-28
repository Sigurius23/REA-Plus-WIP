package nl0;

import androidx.profileinstaller.ProfileVerifier;
import b91.AbstractC2890e;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import fl0.AbstractC14566k;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iz0.C21042a;
import iz0.C21054m;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p208i2.C17919x;
import p294l3.C23285v0;
import p392p3.C28780r;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.AbstractC42793j;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import x81.C38072d;
import y00.AbstractC38963t7;
import zk0.C40819i0;

/* JADX INFO: renamed from: nl0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b8\b\u0087\b\u0018\u00002\u00020\u0001BÛ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0006\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%Jä\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u00100\u001a\u0004\b1\u0010,R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00109R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b8\u0010<\u001a\u0004\b6\u0010=R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b:\u0010HR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bD\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bL\u00107\u001a\u0004\bM\u00109R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b@\u0010N\u001a\u0004\bB\u0010OR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\b>\u0010RR\u0017\u0010\u0018\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bS\u00107\u001a\u0004\bT\u00109R\u0017\u0010\u0019\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bJ\u00107\u001a\u0004\bU\u00109R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b4\u0010V\u001a\u0004\bW\u0010XR\u001f\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b1\u0010Y\u001a\u0004\bL\u0010ZR\u0017\u0010\u001e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bM\u00107\u001a\u0004\b[\u00109R\u0017\u0010\u001f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\bF\u00109R\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bT\u0010\\\u001a\u0004\bS\u0010]R\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\bU\u0010^\u001a\u0004\bP\u0010_¨\u0006`"}, m65681d2 = {"Lnl0/f;", "", "", "sendFieldIcon", "Ly81/e;", "sendFieldColor", "", "disableTextField", "showStopGenerating", "Lnl0/a;", "conversation", "Lnl0/m;", "loadingState", "Lcom/whoop/design/util/TextResource;", "hint", "Lnl0/i;", "conversationHistoryViewState", "Lfl0/k;", "retryAction", "showKeyboardOnLaunch", "Lnl0/k;", "feedbackToastState", "Lnl0/j;", "educationHubState", "stoppedByUser", "typewriterEffectFix", "hasShownOverlay", "", "Lnl0/l;", "imageUploadStates", "isWceLoading", "hasContentPrefetched", "Liz0/m;", "markdownStyles", "Lzk0/i0;", "markdownSpacing", "<init>", "(ILy81/e;ZZLnl0/a;Lnl0/m;Lcom/whoop/design/util/TextResource;Lnl0/i;Lfl0/k;ZLnl0/k;Lnl0/j;ZZLjava/lang/Boolean;Ljava/util/List;ZZLiz0/m;Lzk0/i0;)V", "a", "(ILy81/e;ZZLnl0/a;Lnl0/m;Lcom/whoop/design/util/TextResource;Lnl0/i;Lfl0/k;ZLnl0/k;Lnl0/j;ZZLjava/lang/Boolean;Ljava/util/List;ZZLiz0/m;Lzk0/i0;)Lnl0/f;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "p", "b", "Ly81/e;", "o", "()Ly81/e;", "c", "Z", "e", "()Z", "d", "r", "Lnl0/a;", "()Lnl0/a;", "f", "Lnl0/m;", "k", "()Lnl0/m;", "g", "Lcom/whoop/design/util/TextResource;", "i", "()Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lnl0/i;", "()Lnl0/i;", "Lfl0/k;", "n", "()Lfl0/k;", "j", "q", "Lnl0/k;", "()Lnl0/k;", "l", "Lnl0/j;", "()Lnl0/j;", "m", "s", "t", "Ljava/lang/Boolean;", "getHasShownOverlay", "()Ljava/lang/Boolean;", "Ljava/util/List;", "()Ljava/util/List;", "u", "Liz0/m;", "()Liz0/m;", "Lzk0/i0;", "()Lzk0/i0;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26804f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int sendFieldIcon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC39332e sendFieldColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean disableTextField;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean showStopGenerating;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C26799a conversation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC26811m loadingState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource hint;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C26807i conversationHistoryViewState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final AbstractC14566k retryAction;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean showKeyboardOnLaunch;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C26809k feedbackToastState;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C26808j educationHubState;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final boolean stoppedByUser;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean typewriterEffectFix;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final Boolean hasShownOverlay;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final List<C26810l> imageUploadStates;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final boolean isWceLoading;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final boolean hasContentPrefetched;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final C21054m markdownStyles;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final C40819i0 markdownSpacing;

    /* JADX INFO: renamed from: nl0.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f106845w = new a();

        /* JADX INFO: renamed from: a */
        public final long m79964a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite30();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m79964a((C39336i) obj));
        }
    }

    public C26804f(int i13, InterfaceC39332e sendFieldColor, boolean z4, boolean z13, C26799a conversation, EnumC26811m loadingState, TextResource hint, C26807i conversationHistoryViewState, AbstractC14566k retryAction, boolean z14, C26809k feedbackToastState, C26808j c26808j, boolean z15, boolean z16, Boolean bool, List<C26810l> list, boolean z17, boolean z18, C21054m markdownStyles, C40819i0 markdownSpacing) {
        AbstractC22676k.m65750j(sendFieldColor, "sendFieldColor");
        AbstractC22676k.m65750j(conversation, "conversation");
        AbstractC22676k.m65750j(loadingState, "loadingState");
        AbstractC22676k.m65750j(hint, "hint");
        AbstractC22676k.m65750j(conversationHistoryViewState, "conversationHistoryViewState");
        AbstractC22676k.m65750j(retryAction, "retryAction");
        AbstractC22676k.m65750j(feedbackToastState, "feedbackToastState");
        AbstractC22676k.m65750j(markdownStyles, "markdownStyles");
        AbstractC22676k.m65750j(markdownSpacing, "markdownSpacing");
        this.sendFieldIcon = i13;
        this.sendFieldColor = sendFieldColor;
        this.disableTextField = z4;
        this.showStopGenerating = z13;
        this.conversation = conversation;
        this.loadingState = loadingState;
        this.hint = hint;
        this.conversationHistoryViewState = conversationHistoryViewState;
        this.retryAction = retryAction;
        this.showKeyboardOnLaunch = z14;
        this.feedbackToastState = feedbackToastState;
        this.educationHubState = c26808j;
        this.stoppedByUser = z15;
        this.typewriterEffectFix = z16;
        this.hasShownOverlay = bool;
        this.imageUploadStates = list;
        this.isWceLoading = z17;
        this.hasContentPrefetched = z18;
        this.markdownStyles = markdownStyles;
        this.markdownSpacing = markdownSpacing;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C26804f m79943b(C26804f c26804f, int i13, InterfaceC39332e interfaceC39332e, boolean z4, boolean z13, C26799a c26799a, EnumC26811m enumC26811m, TextResource textResource, C26807i c26807i, AbstractC14566k abstractC14566k, boolean z14, C26809k c26809k, C26808j c26808j, boolean z15, boolean z16, Boolean bool, List list, boolean z17, boolean z18, C21054m c21054m, C40819i0 c40819i0, int i14, Object obj) {
        C40819i0 c40819i1;
        C21054m c21054m2;
        int i15 = (i14 & 1) != 0 ? c26804f.sendFieldIcon : i13;
        InterfaceC39332e interfaceC39332e2 = (i14 & 2) != 0 ? c26804f.sendFieldColor : interfaceC39332e;
        boolean z19 = (i14 & 4) != 0 ? c26804f.disableTextField : z4;
        boolean z24 = (i14 & 8) != 0 ? c26804f.showStopGenerating : z13;
        C26799a c26799a2 = (i14 & 16) != 0 ? c26804f.conversation : c26799a;
        EnumC26811m enumC26811m2 = (i14 & 32) != 0 ? c26804f.loadingState : enumC26811m;
        TextResource textResource2 = (i14 & 64) != 0 ? c26804f.hint : textResource;
        C26807i c26807i2 = (i14 & 128) != 0 ? c26804f.conversationHistoryViewState : c26807i;
        AbstractC14566k abstractC14566k2 = (i14 & 256) != 0 ? c26804f.retryAction : abstractC14566k;
        boolean z25 = (i14 & 512) != 0 ? c26804f.showKeyboardOnLaunch : z14;
        C26809k c26809k2 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c26804f.feedbackToastState : c26809k;
        C26808j c26808j2 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c26804f.educationHubState : c26808j;
        boolean z26 = (i14 & 4096) != 0 ? c26804f.stoppedByUser : z15;
        boolean z27 = (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c26804f.typewriterEffectFix : z16;
        int i16 = i15;
        Boolean bool2 = (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c26804f.hasShownOverlay : bool;
        List list2 = (i14 & 32768) != 0 ? c26804f.imageUploadStates : list;
        boolean z28 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? c26804f.isWceLoading : z17;
        boolean z29 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? c26804f.hasContentPrefetched : z18;
        C21054m c21054m3 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? c26804f.markdownStyles : c21054m;
        if ((i14 & 524288) != 0) {
            c21054m2 = c21054m3;
            c40819i1 = c26804f.markdownSpacing;
        } else {
            c40819i1 = c40819i0;
            c21054m2 = c21054m3;
        }
        return c26804f.m79944a(i16, interfaceC39332e2, z19, z24, c26799a2, enumC26811m2, textResource2, c26807i2, abstractC14566k2, z25, c26809k2, c26808j2, z26, z27, bool2, list2, z28, z29, c21054m2, c40819i1);
    }

    /* JADX INFO: renamed from: a */
    public final C26804f m79944a(int sendFieldIcon, InterfaceC39332e sendFieldColor, boolean disableTextField, boolean showStopGenerating, C26799a conversation, EnumC26811m loadingState, TextResource hint, C26807i conversationHistoryViewState, AbstractC14566k retryAction, boolean showKeyboardOnLaunch, C26809k feedbackToastState, C26808j educationHubState, boolean stoppedByUser, boolean typewriterEffectFix, Boolean hasShownOverlay, List<C26810l> imageUploadStates, boolean isWceLoading, boolean hasContentPrefetched, C21054m markdownStyles, C40819i0 markdownSpacing) {
        AbstractC22676k.m65750j(sendFieldColor, "sendFieldColor");
        AbstractC22676k.m65750j(conversation, "conversation");
        AbstractC22676k.m65750j(loadingState, "loadingState");
        AbstractC22676k.m65750j(hint, "hint");
        AbstractC22676k.m65750j(conversationHistoryViewState, "conversationHistoryViewState");
        AbstractC22676k.m65750j(retryAction, "retryAction");
        AbstractC22676k.m65750j(feedbackToastState, "feedbackToastState");
        AbstractC22676k.m65750j(markdownStyles, "markdownStyles");
        AbstractC22676k.m65750j(markdownSpacing, "markdownSpacing");
        return new C26804f(sendFieldIcon, sendFieldColor, disableTextField, showStopGenerating, conversation, loadingState, hint, conversationHistoryViewState, retryAction, showKeyboardOnLaunch, feedbackToastState, educationHubState, stoppedByUser, typewriterEffectFix, hasShownOverlay, imageUploadStates, isWceLoading, hasContentPrefetched, markdownStyles, markdownSpacing);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C26799a getConversation() {
        return this.conversation;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C26807i getConversationHistoryViewState() {
        return this.conversationHistoryViewState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getDisableTextField() {
        return this.disableTextField;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26804f)) {
            return false;
        }
        C26804f c26804f = (C26804f) other;
        return this.sendFieldIcon == c26804f.sendFieldIcon && AbstractC22676k.m65745e(this.sendFieldColor, c26804f.sendFieldColor) && this.disableTextField == c26804f.disableTextField && this.showStopGenerating == c26804f.showStopGenerating && AbstractC22676k.m65745e(this.conversation, c26804f.conversation) && this.loadingState == c26804f.loadingState && AbstractC22676k.m65745e(this.hint, c26804f.hint) && AbstractC22676k.m65745e(this.conversationHistoryViewState, c26804f.conversationHistoryViewState) && AbstractC22676k.m65745e(this.retryAction, c26804f.retryAction) && this.showKeyboardOnLaunch == c26804f.showKeyboardOnLaunch && AbstractC22676k.m65745e(this.feedbackToastState, c26804f.feedbackToastState) && AbstractC22676k.m65745e(this.educationHubState, c26804f.educationHubState) && this.stoppedByUser == c26804f.stoppedByUser && this.typewriterEffectFix == c26804f.typewriterEffectFix && AbstractC22676k.m65745e(this.hasShownOverlay, c26804f.hasShownOverlay) && AbstractC22676k.m65745e(this.imageUploadStates, c26804f.imageUploadStates) && this.isWceLoading == c26804f.isWceLoading && this.hasContentPrefetched == c26804f.hasContentPrefetched && AbstractC22676k.m65745e(this.markdownStyles, c26804f.markdownStyles) && AbstractC22676k.m65745e(this.markdownSpacing, c26804f.markdownSpacing);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C26808j getEducationHubState() {
        return this.educationHubState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C26809k getFeedbackToastState() {
        return this.feedbackToastState;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getHasContentPrefetched() {
        return this.hasContentPrefetched;
    }

    public int hashCode() {
        int iHashCode = (this.feedbackToastState.hashCode() + AbstractC2875y.m8289b((this.retryAction.hashCode() + ((this.conversationHistoryViewState.hashCode() + AbstractC31061c.m95625a((this.loadingState.hashCode() + ((this.conversation.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC33745d.m106648g(this.sendFieldColor, Integer.hashCode(this.sendFieldIcon) * 31, 31), 31, this.disableTextField), 31, this.showStopGenerating)) * 31)) * 31, this.hint, 31)) * 31)) * 31, 31, this.showKeyboardOnLaunch)) * 31;
        C26808j c26808j = this.educationHubState;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (c26808j == null ? 0 : c26808j.hashCode())) * 31, 31, this.stoppedByUser), 31, this.typewriterEffectFix);
        Boolean bool = this.hasShownOverlay;
        int iHashCode2 = (iM8289b + (bool == null ? 0 : bool.hashCode())) * 31;
        List<C26810l> list = this.imageUploadStates;
        return this.markdownSpacing.hashCode() + ((this.markdownStyles.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31, 31, this.isWceLoading), 31, this.hasContentPrefetched)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: j */
    public final List<C26810l> m79952j() {
        return this.imageUploadStates;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final EnumC26811m getLoadingState() {
        return this.loadingState;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C40819i0 getMarkdownSpacing() {
        return this.markdownSpacing;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final C21054m getMarkdownStyles() {
        return this.markdownStyles;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final AbstractC14566k getRetryAction() {
        return this.retryAction;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final InterfaceC39332e getSendFieldColor() {
        return this.sendFieldColor;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getSendFieldIcon() {
        return this.sendFieldIcon;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getShowKeyboardOnLaunch() {
        return this.showKeyboardOnLaunch;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getShowStopGenerating() {
        return this.showStopGenerating;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getStoppedByUser() {
        return this.stoppedByUser;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getTypewriterEffectFix() {
        return this.typewriterEffectFix;
    }

    public String toString() {
        int i13 = this.sendFieldIcon;
        InterfaceC39332e interfaceC39332e = this.sendFieldColor;
        boolean z4 = this.disableTextField;
        boolean z13 = this.showStopGenerating;
        C26799a c26799a = this.conversation;
        EnumC26811m enumC26811m = this.loadingState;
        TextResource textResource = this.hint;
        C26807i c26807i = this.conversationHistoryViewState;
        AbstractC14566k abstractC14566k = this.retryAction;
        boolean z14 = this.showKeyboardOnLaunch;
        C26809k c26809k = this.feedbackToastState;
        C26808j c26808j = this.educationHubState;
        boolean z15 = this.stoppedByUser;
        boolean z16 = this.typewriterEffectFix;
        Boolean bool = this.hasShownOverlay;
        List<C26810l> list = this.imageUploadStates;
        boolean z17 = this.isWceLoading;
        boolean z18 = this.hasContentPrefetched;
        C21054m c21054m = this.markdownStyles;
        C40819i0 c40819i0 = this.markdownSpacing;
        StringBuilder sb4 = new StringBuilder("AiConversationViewState(sendFieldIcon=");
        sb4.append(i13);
        sb4.append(", sendFieldColor=");
        sb4.append(interfaceC39332e);
        sb4.append(", disableTextField=");
        AbstractC38963t7.m124392v(sb4, z4, ", showStopGenerating=", z13, ", conversation=");
        sb4.append(c26799a);
        sb4.append(", loadingState=");
        sb4.append(enumC26811m);
        sb4.append(", hint=");
        sb4.append(textResource);
        sb4.append(", conversationHistoryViewState=");
        sb4.append(c26807i);
        sb4.append(", retryAction=");
        sb4.append(abstractC14566k);
        sb4.append(", showKeyboardOnLaunch=");
        sb4.append(z14);
        sb4.append(", feedbackToastState=");
        sb4.append(c26809k);
        sb4.append(", educationHubState=");
        sb4.append(c26808j);
        sb4.append(", stoppedByUser=");
        AbstractC38963t7.m124392v(sb4, z15, ", typewriterEffectFix=", z16, ", hasShownOverlay=");
        sb4.append(bool);
        sb4.append(", imageUploadStates=");
        sb4.append(list);
        sb4.append(", isWceLoading=");
        AbstractC38963t7.m124392v(sb4, z17, ", hasContentPrefetched=", z18, ", markdownStyles=");
        sb4.append(c21054m);
        sb4.append(", markdownSpacing=");
        sb4.append(c40819i0);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getIsWceLoading() {
        return this.isWceLoading;
    }

    public C26804f(int i13, InterfaceC39332e interfaceC39332e, boolean z4, boolean z13, C26799a c26799a, EnumC26811m enumC26811m, TextResource textResource, C26807i c26807i, AbstractC14566k abstractC14566k, boolean z14, C26809k c26809k, C26808j c26808j, boolean z15, boolean z16, Boolean bool, List list, boolean z17, boolean z18, C21054m c21054m, C40819i0 c40819i0, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        C21054m c21054m2;
        int arrowUp = (i14 & 1) != 0 ? C38072d.f163053a.m121951d().getNavigation().getArrowUp() : i13;
        InterfaceC39332e interfaceC39332eM125323a = (i14 & 2) != 0 ? p745y81.Function1.m125323a(a.f106845w) : interfaceC39332e;
        boolean z19 = (i14 & 4) != 0 ? false : z4;
        boolean z24 = (i14 & 8) != 0 ? false : z13;
        C26799a c26799a2 = (i14 & 16) != 0 ? new C26799a(null, null, false, null, null, null, null, 127, null) : c26799a;
        EnumC26811m enumC26811m2 = (i14 & 32) != 0 ? EnumC26811m.NONE : enumC26811m;
        TextResource textResourceM21267a = (i14 & 64) != 0 ? AbstractC8693b.m21267a() : textResource;
        C26807i c26807i2 = (i14 & 128) != 0 ? new C26807i(false, false, null, null, 15, null) : c26807i;
        AbstractC14566k abstractC14566k2 = (i14 & 256) != 0 ? AbstractC14566k.c.f53546a : abstractC14566k;
        boolean z25 = (i14 & 512) != 0 ? false : z14;
        C26809k c26809k2 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? new C26809k(false, null, 0, null, 15, null) : c26809k;
        C26808j c26808j2 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : c26808j;
        boolean z26 = (i14 & 4096) != 0 ? false : z15;
        boolean z27 = (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? false : z16;
        Boolean bool2 = (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : bool;
        List list2 = (i14 & 32768) != 0 ? null : list;
        boolean z28 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? false : z17;
        boolean z29 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? false : z18;
        if ((i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
            C23285v0 style = AbstractC2890e.m8450e().getB1().getStyle();
            long brandWhite = AbstractC42793j.m125436c().getBrandWhite();
            long strain = AbstractC42793j.m125436c().getStrain();
            long recovery = AbstractC42793j.m125436c().getRecovery();
            C28780r c28780r = C28780r.f116544x;
            float f13 = 0;
            float f14 = f13 * 8;
            c21054m2 = new C21054m(style, brandWhite, strain, recovery, C28780r.f116542I, AbstractC42793j.m125436c().getBrandWhite(), 1, AbstractC42793j.m125436c().getBrandWhite(), new C21042a(AbstractC2890e.m8450e().getT1(), AbstractC2890e.m8450e().getT2(), AbstractC2890e.m8450e().getT3(), AbstractC2890e.m8450e().getT4()), AbstractC42793j.m125436c().getBrandWhite(), f14, f13 * 4, false, false, f14, null);
        } else {
            c21054m2 = c21054m;
        }
        this(arrowUp, interfaceC39332eM125323a, z19, z24, c26799a2, enumC26811m2, textResourceM21267a, c26807i2, abstractC14566k2, z25, c26809k2, c26808j2, z26, z27, bool2, list2, z28, z29, c21054m2, (i14 & 524288) != 0 ? new C40819i0(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 262143, null) : c40819i0);
    }
}
