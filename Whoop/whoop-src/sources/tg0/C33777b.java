package tg0;

import c91.AbstractC4328b;
import com.whoop.p057ai.chat.models.AIConversation;
import fl0.EnumC14565j;
import hl0.AbstractC17395d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import nl0.EnumC26811m;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import xg0.C38271c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: tg0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b*\b\u0081\b\u0018\u00002\u00020\u0001B½\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001d\u0010\u001eJÆ\u0001\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00112\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00112\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\"R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b*\u00107\u001a\u0004\b4\u00108R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b6\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b2\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b.\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010AR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b0\u0010FR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u0018\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b=\u0010?\u001a\u0004\bB\u0010AR\u0017\u0010\u0019\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bI\u0010?\u001a\u0004\bK\u0010AR\u0017\u0010\u001a\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b:\u0010?\u001a\u0004\bL\u0010AR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bC\u00105\u001a\u0004\bG\u0010\"R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bL\u00105\u001a\u0004\bD\u0010\"¨\u0006M"}, m65681d2 = {"Ltg0/b;", "", "Lcom/whoop/ai/chat/models/AIConversation;", "conversation", "Lfl0/j;", "messagingState", "Lnl0/m;", "loadingState", "", "error", "", "Lxg0/c;", "attachmentUploadModels", "Lhl0/d;", "toastStyle", "Ltg0/h;", "retryState", "", "isInterpolationComplete", "isAwaitingMoreTokens", "Ltg0/e;", "attachmentError", "Lc91/b;", "submitError", "openedFromHistory", "isRefreshingMetadata", "isDay0", "pendingSuggestionsTurnId", "pendingFirstContentSeenTurnId", "<init>", "(Lcom/whoop/ai/chat/models/AIConversation;Lfl0/j;Lnl0/m;Ljava/lang/String;Ljava/util/List;Lhl0/d;Ltg0/h;ZZLtg0/e;Lc91/b;ZZZLjava/lang/String;Ljava/lang/String;)V", "a", "(Lcom/whoop/ai/chat/models/AIConversation;Lfl0/j;Lnl0/m;Ljava/lang/String;Ljava/util/List;Lhl0/d;Ltg0/h;ZZLtg0/e;Lc91/b;ZZZLjava/lang/String;Ljava/lang/String;)Ltg0/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/ai/chat/models/AIConversation;", "e", "()Lcom/whoop/ai/chat/models/AIConversation;", "b", "Lfl0/j;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lfl0/j;", "c", "Lnl0/m;", "g", "()Lnl0/m;", "d", "Ljava/lang/String;", "f", "Ljava/util/List;", "()Ljava/util/List;", "Lhl0/d;", "n", "()Lhl0/d;", "Ltg0/h;", "l", "()Ltg0/h;", "Z", "q", "()Z", "i", "o", "j", "Ltg0/e;", "()Ltg0/e;", "k", "Lc91/b;", "m", "()Lc91/b;", "r", "p", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33777b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AIConversation conversation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC14565j messagingState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC26811m loadingState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String error;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C38271c> attachmentUploadModels;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC17395d toastStyle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C33783h retryState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean isInterpolationComplete;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean isAwaitingMoreTokens;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final AbstractC33780e attachmentError;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final AbstractC4328b submitError;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean openedFromHistory;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final boolean isRefreshingMetadata;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean isDay0;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final String pendingSuggestionsTurnId;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final String pendingFirstContentSeenTurnId;

    public C33777b(AIConversation aIConversation, EnumC14565j messagingState, EnumC26811m loadingState, String str, List<C38271c> attachmentUploadModels, AbstractC17395d abstractC17395d, C33783h c33783h, boolean z4, boolean z13, AbstractC33780e abstractC33780e, AbstractC4328b abstractC4328b, boolean z14, boolean z15, boolean z16, String str2, String str3) {
        AbstractC22676k.m65750j(messagingState, "messagingState");
        AbstractC22676k.m65750j(loadingState, "loadingState");
        AbstractC22676k.m65750j(attachmentUploadModels, "attachmentUploadModels");
        this.conversation = aIConversation;
        this.messagingState = messagingState;
        this.loadingState = loadingState;
        this.error = str;
        this.attachmentUploadModels = attachmentUploadModels;
        this.toastStyle = abstractC17395d;
        this.retryState = c33783h;
        this.isInterpolationComplete = z4;
        this.isAwaitingMoreTokens = z13;
        this.attachmentError = abstractC33780e;
        this.submitError = abstractC4328b;
        this.openedFromHistory = z14;
        this.isRefreshingMetadata = z15;
        this.isDay0 = z16;
        this.pendingSuggestionsTurnId = str2;
        this.pendingFirstContentSeenTurnId = str3;
    }

    /* JADX INFO: renamed from: a */
    public final C33777b m106825a(AIConversation conversation, EnumC14565j messagingState, EnumC26811m loadingState, String error, List<C38271c> attachmentUploadModels, AbstractC17395d toastStyle, C33783h retryState, boolean isInterpolationComplete, boolean isAwaitingMoreTokens, AbstractC33780e attachmentError, AbstractC4328b submitError, boolean openedFromHistory, boolean isRefreshingMetadata, boolean isDay0, String pendingSuggestionsTurnId, String pendingFirstContentSeenTurnId) {
        AbstractC22676k.m65750j(messagingState, "messagingState");
        AbstractC22676k.m65750j(loadingState, "loadingState");
        AbstractC22676k.m65750j(attachmentUploadModels, "attachmentUploadModels");
        return new C33777b(conversation, messagingState, loadingState, error, attachmentUploadModels, toastStyle, retryState, isInterpolationComplete, isAwaitingMoreTokens, attachmentError, submitError, openedFromHistory, isRefreshingMetadata, isDay0, pendingSuggestionsTurnId, pendingFirstContentSeenTurnId);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC33780e getAttachmentError() {
        return this.attachmentError;
    }

    /* JADX INFO: renamed from: d */
    public final List<C38271c> m106827d() {
        return this.attachmentUploadModels;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AIConversation getConversation() {
        return this.conversation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33777b)) {
            return false;
        }
        C33777b c33777b = (C33777b) other;
        return AbstractC22676k.m65745e(this.conversation, c33777b.conversation) && this.messagingState == c33777b.messagingState && this.loadingState == c33777b.loadingState && AbstractC22676k.m65745e(this.error, c33777b.error) && AbstractC22676k.m65745e(this.attachmentUploadModels, c33777b.attachmentUploadModels) && AbstractC22676k.m65745e(this.toastStyle, c33777b.toastStyle) && AbstractC22676k.m65745e(this.retryState, c33777b.retryState) && this.isInterpolationComplete == c33777b.isInterpolationComplete && this.isAwaitingMoreTokens == c33777b.isAwaitingMoreTokens && AbstractC22676k.m65745e(this.attachmentError, c33777b.attachmentError) && AbstractC22676k.m65745e(this.submitError, c33777b.submitError) && this.openedFromHistory == c33777b.openedFromHistory && this.isRefreshingMetadata == c33777b.isRefreshingMetadata && this.isDay0 == c33777b.isDay0 && AbstractC22676k.m65745e(this.pendingSuggestionsTurnId, c33777b.pendingSuggestionsTurnId) && AbstractC22676k.m65745e(this.pendingFirstContentSeenTurnId, c33777b.pendingFirstContentSeenTurnId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC26811m getLoadingState() {
        return this.loadingState;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC14565j getMessagingState() {
        return this.messagingState;
    }

    public int hashCode() {
        AIConversation aIConversation = this.conversation;
        int iHashCode = (this.loadingState.hashCode() + ((this.messagingState.hashCode() + ((aIConversation == null ? 0 : aIConversation.hashCode()) * 31)) * 31)) * 31;
        String str = this.error;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.attachmentUploadModels);
        AbstractC17395d abstractC17395d = this.toastStyle;
        int iHashCode2 = (iM31983b + (abstractC17395d == null ? 0 : abstractC17395d.hashCode())) * 31;
        C33783h c33783h = this.retryState;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode2 + (c33783h == null ? 0 : c33783h.hashCode())) * 31, 31, this.isInterpolationComplete), 31, this.isAwaitingMoreTokens);
        AbstractC33780e abstractC33780e = this.attachmentError;
        int iHashCode3 = (iM8289b + (abstractC33780e == null ? 0 : abstractC33780e.hashCode())) * 31;
        AbstractC4328b abstractC4328b = this.submitError;
        int iM8289b2 = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode3 + (abstractC4328b == null ? 0 : abstractC4328b.hashCode())) * 31, 31, this.openedFromHistory), 31, this.isRefreshingMetadata), 31, this.isDay0);
        String str2 = this.pendingSuggestionsTurnId;
        int iHashCode4 = (iM8289b2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pendingFirstContentSeenTurnId;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getOpenedFromHistory() {
        return this.openedFromHistory;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getPendingFirstContentSeenTurnId() {
        return this.pendingFirstContentSeenTurnId;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPendingSuggestionsTurnId() {
        return this.pendingSuggestionsTurnId;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C33783h getRetryState() {
        return this.retryState;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final AbstractC4328b getSubmitError() {
        return this.submitError;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final AbstractC17395d getToastStyle() {
        return this.toastStyle;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getIsAwaitingMoreTokens() {
        return this.isAwaitingMoreTokens;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getIsDay0() {
        return this.isDay0;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getIsInterpolationComplete() {
        return this.isInterpolationComplete;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getIsRefreshingMetadata() {
        return this.isRefreshingMetadata;
    }

    public String toString() {
        AIConversation aIConversation = this.conversation;
        EnumC14565j enumC14565j = this.messagingState;
        EnumC26811m enumC26811m = this.loadingState;
        String str = this.error;
        List<C38271c> list = this.attachmentUploadModels;
        AbstractC17395d abstractC17395d = this.toastStyle;
        C33783h c33783h = this.retryState;
        boolean z4 = this.isInterpolationComplete;
        boolean z13 = this.isAwaitingMoreTokens;
        AbstractC33780e abstractC33780e = this.attachmentError;
        AbstractC4328b abstractC4328b = this.submitError;
        boolean z14 = this.openedFromHistory;
        boolean z15 = this.isRefreshingMetadata;
        boolean z16 = this.isDay0;
        String str2 = this.pendingSuggestionsTurnId;
        String str3 = this.pendingFirstContentSeenTurnId;
        StringBuilder sb4 = new StringBuilder("AiChatDomainResult(conversation=");
        sb4.append(aIConversation);
        sb4.append(", messagingState=");
        sb4.append(enumC14565j);
        sb4.append(", loadingState=");
        sb4.append(enumC26811m);
        sb4.append(", error=");
        sb4.append(str);
        sb4.append(", attachmentUploadModels=");
        sb4.append(list);
        sb4.append(", toastStyle=");
        sb4.append(abstractC17395d);
        sb4.append(", retryState=");
        sb4.append(c33783h);
        sb4.append(", isInterpolationComplete=");
        sb4.append(z4);
        sb4.append(", isAwaitingMoreTokens=");
        sb4.append(z13);
        sb4.append(", attachmentError=");
        sb4.append(abstractC33780e);
        sb4.append(", submitError=");
        sb4.append(abstractC4328b);
        sb4.append(", openedFromHistory=");
        sb4.append(z14);
        sb4.append(", isRefreshingMetadata=");
        AbstractC38963t7.m124392v(sb4, z15, ", isDay0=", z16, ", pendingSuggestionsTurnId=");
        return AbstractC11266d.m30464r(sb4, str2, ", pendingFirstContentSeenTurnId=", str3, ")");
    }

    public /* synthetic */ C33777b(AIConversation aIConversation, EnumC14565j enumC14565j, EnumC26811m enumC26811m, String str, List list, AbstractC17395d abstractC17395d, C33783h c33783h, boolean z4, boolean z13, AbstractC33780e abstractC33780e, AbstractC4328b abstractC4328b, boolean z14, boolean z15, boolean z16, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : aIConversation, (i13 & 2) != 0 ? EnumC14565j.LOADING : enumC14565j, (i13 & 4) != 0 ? EnumC26811m.NONE : enumC26811m, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? C25271y.f99162w : list, (i13 & 32) != 0 ? null : abstractC17395d, (i13 & 64) != 0 ? null : c33783h, (i13 & 128) != 0 ? false : z4, (i13 & 256) != 0 ? false : z13, (i13 & 512) != 0 ? null : abstractC33780e, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : abstractC4328b, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z14, (i13 & 4096) != 0 ? false : z15, (i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0 ? z16 : false, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str2, (i13 & 32768) != 0 ? null : str3);
    }
}
