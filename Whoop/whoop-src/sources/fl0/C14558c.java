package fl0;

import com.whoop.bot.models.conversation.AiChatConversation;
import java.util.List;
import nl0.EnumC26811m;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: fl0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b\u001d\u0010+¨\u0006,"}, m65681d2 = {"Lfl0/c;", "", "Lcom/whoop/bot/models/conversation/AiChatConversation;", "conversation", "Lfl0/j;", "messagingState", "Lnl0/m;", "loadingState", "Lfl0/k;", "retryAction", "", "showKeyboardOnLaunch", "", "Lfl0/i;", "imageUploadModels", "<init>", "(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/bot/models/conversation/AiChatConversation;", "()Lcom/whoop/bot/models/conversation/AiChatConversation;", "b", "Lfl0/j;", "d", "()Lfl0/j;", "c", "Lnl0/m;", "()Lnl0/m;", "Lfl0/k;", "e", "()Lfl0/k;", "Z", "f", "()Z", "Ljava/util/List;", "()Ljava/util/List;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14558c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AiChatConversation conversation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC14565j messagingState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC26811m loadingState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC14566k retryAction;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean showKeyboardOnLaunch;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<C14564i> imageUploadModels;

    public C14558c(AiChatConversation conversation, EnumC14565j messagingState, EnumC26811m loadingState, AbstractC14566k retryAction, boolean z4, List<C14564i> list) {
        AbstractC22676k.m65750j(conversation, "conversation");
        AbstractC22676k.m65750j(messagingState, "messagingState");
        AbstractC22676k.m65750j(loadingState, "loadingState");
        AbstractC22676k.m65750j(retryAction, "retryAction");
        this.conversation = conversation;
        this.messagingState = messagingState;
        this.loadingState = loadingState;
        this.retryAction = retryAction;
        this.showKeyboardOnLaunch = z4;
        this.imageUploadModels = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AiChatConversation getConversation() {
        return this.conversation;
    }

    /* JADX INFO: renamed from: b */
    public final List<C14564i> m41670b() {
        return this.imageUploadModels;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC26811m getLoadingState() {
        return this.loadingState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC14565j getMessagingState() {
        return this.messagingState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbstractC14566k getRetryAction() {
        return this.retryAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14558c)) {
            return false;
        }
        C14558c c14558c = (C14558c) other;
        return AbstractC22676k.m65745e(this.conversation, c14558c.conversation) && this.messagingState == c14558c.messagingState && this.loadingState == c14558c.loadingState && AbstractC22676k.m65745e(this.retryAction, c14558c.retryAction) && this.showKeyboardOnLaunch == c14558c.showKeyboardOnLaunch && AbstractC22676k.m65745e(this.imageUploadModels, c14558c.imageUploadModels);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getShowKeyboardOnLaunch() {
        return this.showKeyboardOnLaunch;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b((this.retryAction.hashCode() + ((this.loadingState.hashCode() + ((this.messagingState.hashCode() + (this.conversation.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.showKeyboardOnLaunch);
        List<C14564i> list = this.imageUploadModels;
        return iM8289b + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "AiConversationResult(conversation=" + this.conversation + ", messagingState=" + this.messagingState + ", loadingState=" + this.loadingState + ", retryAction=" + this.retryAction + ", showKeyboardOnLaunch=" + this.showKeyboardOnLaunch + ", imageUploadModels=" + this.imageUploadModels + ")";
    }

    public /* synthetic */ C14558c(AiChatConversation aiChatConversation, EnumC14565j enumC14565j, EnumC26811m enumC26811m, AbstractC14566k abstractC14566k, boolean z4, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(aiChatConversation, (i13 & 2) != 0 ? EnumC14565j.LOADING : enumC14565j, (i13 & 4) != 0 ? EnumC26811m.NONE : enumC26811m, (i13 & 8) != 0 ? AbstractC14566k.c.f53546a : abstractC14566k, (i13 & 16) != 0 ? false : z4, (i13 & 32) != 0 ? null : list);
    }
}
