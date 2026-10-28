package zg0;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iz0.C21054m;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import nl0.C26809k;
import nl0.EnumC26811m;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import tg0.C33783h;
import x81.C38072d;
import y00.AbstractC38963t7;
import zk0.C40819i0;

/* JADX INFO: renamed from: zg0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\bG\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010!\u001a\u00020\u0006\u0012\b\b\u0002\u0010\"\u001a\u00020\u0006\u0012\b\b\u0002\u0010#\u001a\u00020\u0006\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010&\u001a\u00020\u0006\u0012\b\b\u0002\u0010'\u001a\u00020\u0006¢\u0006\u0004\b(\u0010)J\u008a\u0002\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u00062\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010&\u001a\u00020\u00062\b\b\u0002\u0010'\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020$HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u00103\u001a\u0004\b4\u0010/R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b>\u0010<R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bA\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b;\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\b?\u0010KR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bP\u0010:\u001a\u0004\bQ\u0010<R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bI\u0010TR\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bD\u0010:\u001a\u0004\bU\u0010<R\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bV\u0010:\u001a\u0004\bW\u0010<R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\b=\u0010ZR\u0017\u0010\u001b\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b[\u0010S\u001a\u0004\b9\u0010TR\u0017\u0010\u001c\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bN\u0010S\u001a\u0004\b\\\u0010TR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\bX\u0010_R\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bV\u0010bR\u0017\u0010!\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b4\u0010:\u001a\u0004\bP\u0010<R\u0017\u0010\"\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\bL\u0010<R\u0017\u0010#\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\\\u0010:\u001a\u0004\b[\u0010<R\u0019\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\b]\u0010-R\u0017\u0010&\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\be\u0010:\u001a\u0004\bc\u0010<R\u0017\u0010'\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bf\u0010:\u001a\u0004\be\u0010<R\u0017\u0010h\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bg\u00103\u001a\u0004\b`\u0010/R\u0019\u0010j\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\bi\u0010d\u001a\u0004\bR\u0010-¨\u0006k"}, m65681d2 = {"Lzg0/i;", "", "", "sendFieldIcon", "Ly81/e;", "sendFieldColor", "", "disableTextField", "showStopGenerating", "Lzg0/f;", "conversation", "Lnl0/m;", "loadingState", "Lcom/whoop/design/util/TextResource;", "hint", "Lzg0/c;", "chatHistoryViewState", "Ltg0/h;", "retryState", "showKeyboardOnLaunch", "Lnl0/k;", "feedbackToastState", "stoppedByUser", "typewriterEffectFix", "", "Lzg0/k;", "attachmentUploadStates", "attachmentErrorToastState", "submitErrorToastState", "Liz0/m;", "markdownStyles", "Lzk0/i0;", "markdownSpacing", "hasContentPrefetched", "formInputOnly", "openedFromHistory", "", "scrollToTurnId", "isLatestTurnComplete", "isRefreshingMetadata", "<init>", "(ILy81/e;ZZLzg0/f;Lnl0/m;Lcom/whoop/design/util/TextResource;Lzg0/c;Ltg0/h;ZLnl0/k;ZZLjava/util/List;Lnl0/k;Lnl0/k;Liz0/m;Lzk0/i0;ZZZLjava/lang/String;ZZ)V", "a", "(ILy81/e;ZZLzg0/f;Lnl0/m;Lcom/whoop/design/util/TextResource;Lzg0/c;Ltg0/h;ZLnl0/k;ZZLjava/util/List;Lnl0/k;Lnl0/k;Liz0/m;Lzk0/i0;ZZZLjava/lang/String;ZZ)Lzg0/i;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "s", "b", "Ly81/e;", "getSendFieldColor", "()Ly81/e;", "c", "Z", "g", "()Z", "d", "t", "e", "Lzg0/f;", "f", "()Lzg0/f;", "Lnl0/m;", "l", "()Lnl0/m;", "Lcom/whoop/design/util/TextResource;", "getHint", "()Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lzg0/c;", "()Lzg0/c;", "i", "Ltg0/h;", "p", "()Ltg0/h;", "j", "getShowKeyboardOnLaunch", "k", "Lnl0/k;", "()Lnl0/k;", "getStoppedByUser", "m", "getTypewriterEffectFix", "n", "Ljava/util/List;", "()Ljava/util/List;", "o", "u", "q", "Liz0/m;", "()Liz0/m;", "r", "Lzk0/i0;", "()Lzk0/i0;", "v", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "x", "y", "sectionCount", "z", "lastMessageId", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40626i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int sendFieldIcon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC39332e sendFieldColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean disableTextField;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean showStopGenerating;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C40623f conversation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC26811m loadingState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource hint;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C40620c chatHistoryViewState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C33783h retryState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean showKeyboardOnLaunch;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C26809k feedbackToastState;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean stoppedByUser;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final boolean typewriterEffectFix;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final List<C40628k> attachmentUploadStates;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final C26809k attachmentErrorToastState;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final C26809k submitErrorToastState;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final C21054m markdownStyles;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final C40819i0 markdownSpacing;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final boolean hasContentPrefetched;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final boolean formInputOnly;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final boolean openedFromHistory;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final String scrollToTurnId;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final boolean isLatestTurnComplete;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final boolean isRefreshingMetadata;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final int sectionCount;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final String lastMessageId;

    /* JADX INFO: renamed from: zg0.i$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f175205w = new a();

        /* JADX INFO: renamed from: a */
        public final long m131847a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite30();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m131847a((C39336i) obj));
        }
    }

    public C40626i(int i13, InterfaceC39332e sendFieldColor, boolean z4, boolean z13, C40623f conversation, EnumC26811m loadingState, TextResource hint, C40620c chatHistoryViewState, C33783h c33783h, boolean z14, C26809k feedbackToastState, boolean z15, boolean z16, List<C40628k> attachmentUploadStates, C26809k attachmentErrorToastState, C26809k submitErrorToastState, C21054m markdownStyles, C40819i0 markdownSpacing, boolean z17, boolean z18, boolean z19, String str, boolean z24, boolean z25) {
        AbstractC22676k.m65750j(sendFieldColor, "sendFieldColor");
        AbstractC22676k.m65750j(conversation, "conversation");
        AbstractC22676k.m65750j(loadingState, "loadingState");
        AbstractC22676k.m65750j(hint, "hint");
        AbstractC22676k.m65750j(chatHistoryViewState, "chatHistoryViewState");
        AbstractC22676k.m65750j(feedbackToastState, "feedbackToastState");
        AbstractC22676k.m65750j(attachmentUploadStates, "attachmentUploadStates");
        AbstractC22676k.m65750j(attachmentErrorToastState, "attachmentErrorToastState");
        AbstractC22676k.m65750j(submitErrorToastState, "submitErrorToastState");
        AbstractC22676k.m65750j(markdownStyles, "markdownStyles");
        AbstractC22676k.m65750j(markdownSpacing, "markdownSpacing");
        this.sendFieldIcon = i13;
        this.sendFieldColor = sendFieldColor;
        this.disableTextField = z4;
        this.showStopGenerating = z13;
        this.conversation = conversation;
        this.loadingState = loadingState;
        this.hint = hint;
        this.chatHistoryViewState = chatHistoryViewState;
        this.retryState = c33783h;
        this.showKeyboardOnLaunch = z14;
        this.feedbackToastState = feedbackToastState;
        this.stoppedByUser = z15;
        this.typewriterEffectFix = z16;
        this.attachmentUploadStates = attachmentUploadStates;
        this.attachmentErrorToastState = attachmentErrorToastState;
        this.submitErrorToastState = submitErrorToastState;
        this.markdownStyles = markdownStyles;
        this.markdownSpacing = markdownSpacing;
        this.hasContentPrefetched = z17;
        this.formInputOnly = z18;
        this.openedFromHistory = z19;
        this.scrollToTurnId = str;
        this.isLatestTurnComplete = z24;
        this.isRefreshingMetadata = z25;
        this.sectionCount = conversation.m131761e().size();
        C40621d c40621d = (C40621d) AbstractC25265s.m74114R0(conversation.m131760d());
        this.lastMessageId = c40621d != null ? c40621d.getId() : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C40626i m131824b(C40626i c40626i, int i13, InterfaceC39332e interfaceC39332e, boolean z4, boolean z13, C40623f c40623f, EnumC26811m enumC26811m, TextResource textResource, C40620c c40620c, C33783h c33783h, boolean z14, C26809k c26809k, boolean z15, boolean z16, List list, C26809k c26809k2, C26809k c26809k3, C21054m c21054m, C40819i0 c40819i0, boolean z17, boolean z18, boolean z19, String str, boolean z24, boolean z25, int i14, Object obj) {
        boolean z26;
        boolean z27;
        int i15 = (i14 & 1) != 0 ? c40626i.sendFieldIcon : i13;
        InterfaceC39332e interfaceC39332e2 = (i14 & 2) != 0 ? c40626i.sendFieldColor : interfaceC39332e;
        boolean z28 = (i14 & 4) != 0 ? c40626i.disableTextField : z4;
        boolean z29 = (i14 & 8) != 0 ? c40626i.showStopGenerating : z13;
        C40623f c40623f2 = (i14 & 16) != 0 ? c40626i.conversation : c40623f;
        EnumC26811m enumC26811m2 = (i14 & 32) != 0 ? c40626i.loadingState : enumC26811m;
        TextResource textResource2 = (i14 & 64) != 0 ? c40626i.hint : textResource;
        C40620c c40620c2 = (i14 & 128) != 0 ? c40626i.chatHistoryViewState : c40620c;
        C33783h c33783h2 = (i14 & 256) != 0 ? c40626i.retryState : c33783h;
        boolean z34 = (i14 & 512) != 0 ? c40626i.showKeyboardOnLaunch : z14;
        C26809k c26809k4 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c40626i.feedbackToastState : c26809k;
        boolean z35 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c40626i.stoppedByUser : z15;
        boolean z36 = (i14 & 4096) != 0 ? c40626i.typewriterEffectFix : z16;
        List list2 = (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c40626i.attachmentUploadStates : list;
        int i16 = i15;
        C26809k c26809k5 = (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c40626i.attachmentErrorToastState : c26809k2;
        C26809k c26809k6 = (i14 & 32768) != 0 ? c40626i.submitErrorToastState : c26809k3;
        C21054m c21054m2 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? c40626i.markdownStyles : c21054m;
        C40819i0 c40819i1 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? c40626i.markdownSpacing : c40819i0;
        boolean z37 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? c40626i.hasContentPrefetched : z17;
        boolean z38 = (i14 & 524288) != 0 ? c40626i.formInputOnly : z18;
        boolean z39 = (i14 & 1048576) != 0 ? c40626i.openedFromHistory : z19;
        String str2 = (i14 & 2097152) != 0 ? c40626i.scrollToTurnId : str;
        boolean z44 = (i14 & 4194304) != 0 ? c40626i.isLatestTurnComplete : z24;
        if ((i14 & 8388608) != 0) {
            z27 = z44;
            z26 = c40626i.isRefreshingMetadata;
        } else {
            z26 = z25;
            z27 = z44;
        }
        return c40626i.m131825a(i16, interfaceC39332e2, z28, z29, c40623f2, enumC26811m2, textResource2, c40620c2, c33783h2, z34, c26809k4, z35, z36, list2, c26809k5, c26809k6, c21054m2, c40819i1, z37, z38, z39, str2, z27, z26);
    }

    /* JADX INFO: renamed from: a */
    public final C40626i m131825a(int sendFieldIcon, InterfaceC39332e sendFieldColor, boolean disableTextField, boolean showStopGenerating, C40623f conversation, EnumC26811m loadingState, TextResource hint, C40620c chatHistoryViewState, C33783h retryState, boolean showKeyboardOnLaunch, C26809k feedbackToastState, boolean stoppedByUser, boolean typewriterEffectFix, List<C40628k> attachmentUploadStates, C26809k attachmentErrorToastState, C26809k submitErrorToastState, C21054m markdownStyles, C40819i0 markdownSpacing, boolean hasContentPrefetched, boolean formInputOnly, boolean openedFromHistory, String scrollToTurnId, boolean isLatestTurnComplete, boolean isRefreshingMetadata) {
        AbstractC22676k.m65750j(sendFieldColor, "sendFieldColor");
        AbstractC22676k.m65750j(conversation, "conversation");
        AbstractC22676k.m65750j(loadingState, "loadingState");
        AbstractC22676k.m65750j(hint, "hint");
        AbstractC22676k.m65750j(chatHistoryViewState, "chatHistoryViewState");
        AbstractC22676k.m65750j(feedbackToastState, "feedbackToastState");
        AbstractC22676k.m65750j(attachmentUploadStates, "attachmentUploadStates");
        AbstractC22676k.m65750j(attachmentErrorToastState, "attachmentErrorToastState");
        AbstractC22676k.m65750j(submitErrorToastState, "submitErrorToastState");
        AbstractC22676k.m65750j(markdownStyles, "markdownStyles");
        AbstractC22676k.m65750j(markdownSpacing, "markdownSpacing");
        return new C40626i(sendFieldIcon, sendFieldColor, disableTextField, showStopGenerating, conversation, loadingState, hint, chatHistoryViewState, retryState, showKeyboardOnLaunch, feedbackToastState, stoppedByUser, typewriterEffectFix, attachmentUploadStates, attachmentErrorToastState, submitErrorToastState, markdownStyles, markdownSpacing, hasContentPrefetched, formInputOnly, openedFromHistory, scrollToTurnId, isLatestTurnComplete, isRefreshingMetadata);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C26809k getAttachmentErrorToastState() {
        return this.attachmentErrorToastState;
    }

    /* JADX INFO: renamed from: d */
    public final List<C40628k> m131827d() {
        return this.attachmentUploadStates;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C40620c getChatHistoryViewState() {
        return this.chatHistoryViewState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40626i)) {
            return false;
        }
        C40626i c40626i = (C40626i) other;
        return this.sendFieldIcon == c40626i.sendFieldIcon && AbstractC22676k.m65745e(this.sendFieldColor, c40626i.sendFieldColor) && this.disableTextField == c40626i.disableTextField && this.showStopGenerating == c40626i.showStopGenerating && AbstractC22676k.m65745e(this.conversation, c40626i.conversation) && this.loadingState == c40626i.loadingState && AbstractC22676k.m65745e(this.hint, c40626i.hint) && AbstractC22676k.m65745e(this.chatHistoryViewState, c40626i.chatHistoryViewState) && AbstractC22676k.m65745e(this.retryState, c40626i.retryState) && this.showKeyboardOnLaunch == c40626i.showKeyboardOnLaunch && AbstractC22676k.m65745e(this.feedbackToastState, c40626i.feedbackToastState) && this.stoppedByUser == c40626i.stoppedByUser && this.typewriterEffectFix == c40626i.typewriterEffectFix && AbstractC22676k.m65745e(this.attachmentUploadStates, c40626i.attachmentUploadStates) && AbstractC22676k.m65745e(this.attachmentErrorToastState, c40626i.attachmentErrorToastState) && AbstractC22676k.m65745e(this.submitErrorToastState, c40626i.submitErrorToastState) && AbstractC22676k.m65745e(this.markdownStyles, c40626i.markdownStyles) && AbstractC22676k.m65745e(this.markdownSpacing, c40626i.markdownSpacing) && this.hasContentPrefetched == c40626i.hasContentPrefetched && this.formInputOnly == c40626i.formInputOnly && this.openedFromHistory == c40626i.openedFromHistory && AbstractC22676k.m65745e(this.scrollToTurnId, c40626i.scrollToTurnId) && this.isLatestTurnComplete == c40626i.isLatestTurnComplete && this.isRefreshingMetadata == c40626i.isRefreshingMetadata;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C40623f getConversation() {
        return this.conversation;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getDisableTextField() {
        return this.disableTextField;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C26809k getFeedbackToastState() {
        return this.feedbackToastState;
    }

    public int hashCode() {
        int iHashCode = (this.chatHistoryViewState.hashCode() + AbstractC31061c.m95625a((this.loadingState.hashCode() + ((this.conversation.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC33745d.m106648g(this.sendFieldColor, Integer.hashCode(this.sendFieldIcon) * 31, 31), 31, this.disableTextField), 31, this.showStopGenerating)) * 31)) * 31, this.hint, 31)) * 31;
        C33783h c33783h = this.retryState;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.markdownSpacing.hashCode() + ((this.markdownStyles.hashCode() + ((this.submitErrorToastState.hashCode() + ((this.attachmentErrorToastState.hashCode() + AbstractC11895b.m31983b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.feedbackToastState.hashCode() + AbstractC2875y.m8289b((iHashCode + (c33783h == null ? 0 : c33783h.hashCode())) * 31, 31, this.showKeyboardOnLaunch)) * 31, 31, this.stoppedByUser), 31, this.typewriterEffectFix), 31, this.attachmentUploadStates)) * 31)) * 31)) * 31)) * 31, 31, this.hasContentPrefetched), 31, this.formInputOnly), 31, this.openedFromHistory);
        String str = this.scrollToTurnId;
        return Boolean.hashCode(this.isRefreshingMetadata) + AbstractC2875y.m8289b((iM8289b + (str != null ? str.hashCode() : 0)) * 31, 31, this.isLatestTurnComplete);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getFormInputOnly() {
        return this.formInputOnly;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getHasContentPrefetched() {
        return this.hasContentPrefetched;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getLastMessageId() {
        return this.lastMessageId;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final EnumC26811m getLoadingState() {
        return this.loadingState;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final C40819i0 getMarkdownSpacing() {
        return this.markdownSpacing;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final C21054m getMarkdownStyles() {
        return this.markdownStyles;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getOpenedFromHistory() {
        return this.openedFromHistory;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final C33783h getRetryState() {
        return this.retryState;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getScrollToTurnId() {
        return this.scrollToTurnId;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getSectionCount() {
        return this.sectionCount;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getSendFieldIcon() {
        return this.sendFieldIcon;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getShowStopGenerating() {
        return this.showStopGenerating;
    }

    public String toString() {
        int i13 = this.sendFieldIcon;
        InterfaceC39332e interfaceC39332e = this.sendFieldColor;
        boolean z4 = this.disableTextField;
        boolean z13 = this.showStopGenerating;
        C40623f c40623f = this.conversation;
        EnumC26811m enumC26811m = this.loadingState;
        TextResource textResource = this.hint;
        C40620c c40620c = this.chatHistoryViewState;
        C33783h c33783h = this.retryState;
        boolean z14 = this.showKeyboardOnLaunch;
        C26809k c26809k = this.feedbackToastState;
        boolean z15 = this.stoppedByUser;
        boolean z16 = this.typewriterEffectFix;
        List<C40628k> list = this.attachmentUploadStates;
        C26809k c26809k2 = this.attachmentErrorToastState;
        C26809k c26809k3 = this.submitErrorToastState;
        C21054m c21054m = this.markdownStyles;
        C40819i0 c40819i0 = this.markdownSpacing;
        boolean z17 = this.hasContentPrefetched;
        boolean z18 = this.formInputOnly;
        boolean z19 = this.openedFromHistory;
        String str = this.scrollToTurnId;
        boolean z24 = this.isLatestTurnComplete;
        boolean z25 = this.isRefreshingMetadata;
        StringBuilder sb4 = new StringBuilder("AiChatViewState(sendFieldIcon=");
        sb4.append(i13);
        sb4.append(", sendFieldColor=");
        sb4.append(interfaceC39332e);
        sb4.append(", disableTextField=");
        AbstractC38963t7.m124392v(sb4, z4, ", showStopGenerating=", z13, ", conversation=");
        sb4.append(c40623f);
        sb4.append(", loadingState=");
        sb4.append(enumC26811m);
        sb4.append(", hint=");
        sb4.append(textResource);
        sb4.append(", chatHistoryViewState=");
        sb4.append(c40620c);
        sb4.append(", retryState=");
        sb4.append(c33783h);
        sb4.append(", showKeyboardOnLaunch=");
        sb4.append(z14);
        sb4.append(", feedbackToastState=");
        sb4.append(c26809k);
        sb4.append(", stoppedByUser=");
        sb4.append(z15);
        sb4.append(", typewriterEffectFix=");
        AbstractC25012a.m73391x(", attachmentUploadStates=", ", attachmentErrorToastState=", sb4, list, z16);
        sb4.append(c26809k2);
        sb4.append(", submitErrorToastState=");
        sb4.append(c26809k3);
        sb4.append(", markdownStyles=");
        sb4.append(c21054m);
        sb4.append(", markdownSpacing=");
        sb4.append(c40819i0);
        sb4.append(", hasContentPrefetched=");
        AbstractC38963t7.m124392v(sb4, z17, ", formInputOnly=", z18, ", openedFromHistory=");
        AbstractC38963t7.m124391u(sb4, z19, ", scrollToTurnId=", str, ", isLatestTurnComplete=");
        return AbstractC36095b.m114682j(sb4, z24, ", isRefreshingMetadata=", z25, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final C26809k getSubmitErrorToastState() {
        return this.submitErrorToastState;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getIsLatestTurnComplete() {
        return this.isLatestTurnComplete;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final boolean getIsRefreshingMetadata() {
        return this.isRefreshingMetadata;
    }

    public /* synthetic */ C40626i(int i13, InterfaceC39332e interfaceC39332e, boolean z4, boolean z13, C40623f c40623f, EnumC26811m enumC26811m, TextResource textResource, C40620c c40620c, C33783h c33783h, boolean z14, C26809k c26809k, boolean z15, boolean z16, List list, C26809k c26809k2, C26809k c26809k3, C21054m c21054m, C40819i0 c40819i0, boolean z17, boolean z18, boolean z19, String str, boolean z24, boolean z25, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? C38072d.f163053a.m121951d().getNavigation().getArrowUp() : i13, (i14 & 2) != 0 ? p745y81.Function1.m125323a(a.f175205w) : interfaceC39332e, (i14 & 4) != 0 ? false : z4, (i14 & 8) != 0 ? false : z13, (i14 & 16) != 0 ? new C40623f(null, null, null, false, null, null, 63, null) : c40623f, (i14 & 32) != 0 ? EnumC26811m.NONE : enumC26811m, (i14 & 64) != 0 ? AbstractC8693b.m21267a() : textResource, (i14 & 128) != 0 ? new C40620c(false, false, null, 7, null) : c40620c, (i14 & 256) != 0 ? null : c33783h, (i14 & 512) != 0 ? false : z14, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? new C26809k(false, null, 0, null, 15, null) : c26809k, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z15, (i14 & 4096) != 0 ? false : z16, (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? C25271y.f99162w : list, (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? new C26809k(false, null, 0, null, 15, null) : c26809k2, (i14 & 32768) != 0 ? new C26809k(false, null, 0, null, 15, null) : c26809k3, (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? AbstractC40627j.f175206a : c21054m, (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? new C40819i0(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 262143, null) : c40819i0, (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? false : z17, (i14 & 524288) != 0 ? false : z18, (i14 & 1048576) != 0 ? false : z19, (i14 & 2097152) != 0 ? null : str, (i14 & 4194304) != 0 ? true : z24, (i14 & 8388608) != 0 ? false : z25);
    }
}
