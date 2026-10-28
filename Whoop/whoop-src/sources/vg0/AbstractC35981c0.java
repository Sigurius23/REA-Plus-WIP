package vg0;

import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import tg0.C33777b;
import tg0.C33778c;

/* JADX INFO: renamed from: vg0.c0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Ltg0/c;", "", "value", "b", "(Ltg0/c;Z)Ltg0/c;", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35981c0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C33778c m114259b(C33778c c33778c, boolean z4) {
        C33777b aiChatDomainResult = c33778c.getAiChatDomainResult();
        return C33778c.m106842b(c33778c, aiChatDomainResult.m106825a((65279 & 1) != 0 ? aiChatDomainResult.conversation : null, (65279 & 2) != 0 ? aiChatDomainResult.messagingState : null, (65279 & 4) != 0 ? aiChatDomainResult.loadingState : null, (65279 & 8) != 0 ? aiChatDomainResult.error : null, (65279 & 16) != 0 ? aiChatDomainResult.attachmentUploadModels : null, (65279 & 32) != 0 ? aiChatDomainResult.toastStyle : null, (65279 & 64) != 0 ? aiChatDomainResult.retryState : null, (65279 & 128) != 0 ? aiChatDomainResult.isInterpolationComplete : false, (65279 & 256) != 0 ? aiChatDomainResult.isAwaitingMoreTokens : z4, (65279 & 512) != 0 ? aiChatDomainResult.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? aiChatDomainResult.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? aiChatDomainResult.openedFromHistory : false, (65279 & 4096) != 0 ? aiChatDomainResult.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? aiChatDomainResult.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? aiChatDomainResult.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? aiChatDomainResult.pendingFirstContentSeenTurnId : null), null, 2, null);
    }
}
