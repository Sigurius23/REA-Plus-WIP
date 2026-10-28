package bl0;

import fl0.C14558c;
import gl0.C15965d;
import hl0.C17394c;
import ih0.AbstractC18489d0;
import il0.C18620c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bl0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\u001e\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006&"}, m65681d2 = {"Lbl0/a;", "", "Lfl0/c;", "aiConversationResult", "Lhl0/c;", "feedbackResult", "Lil0/c;", "chatHistoryResult", "Lgl0/d;", "educationHub", "", "hasShownOverlay", "<init>", "(Lfl0/c;Lhl0/c;Lil0/c;Lgl0/d;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lfl0/c;", "()Lfl0/c;", "b", "Lhl0/c;", "d", "()Lhl0/c;", "c", "Lil0/c;", "()Lil0/c;", "Lgl0/d;", "()Lgl0/d;", "e", "Z", "()Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3369a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C14558c aiConversationResult;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C17394c feedbackResult;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C18620c chatHistoryResult;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C15965d educationHub;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean hasShownOverlay;

    public C3369a(C14558c aiConversationResult, C17394c feedbackResult, C18620c chatHistoryResult, C15965d educationHub, boolean z4) {
        AbstractC22676k.m65750j(aiConversationResult, "aiConversationResult");
        AbstractC22676k.m65750j(feedbackResult, "feedbackResult");
        AbstractC22676k.m65750j(chatHistoryResult, "chatHistoryResult");
        AbstractC22676k.m65750j(educationHub, "educationHub");
        this.aiConversationResult = aiConversationResult;
        this.feedbackResult = feedbackResult;
        this.chatHistoryResult = chatHistoryResult;
        this.educationHub = educationHub;
        this.hasShownOverlay = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C14558c getAiConversationResult() {
        return this.aiConversationResult;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C18620c getChatHistoryResult() {
        return this.chatHistoryResult;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C15965d getEducationHub() {
        return this.educationHub;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C17394c getFeedbackResult() {
        return this.feedbackResult;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getHasShownOverlay() {
        return this.hasShownOverlay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3369a)) {
            return false;
        }
        C3369a c3369a = (C3369a) other;
        return AbstractC22676k.m65745e(this.aiConversationResult, c3369a.aiConversationResult) && AbstractC22676k.m65745e(this.feedbackResult, c3369a.feedbackResult) && AbstractC22676k.m65745e(this.chatHistoryResult, c3369a.chatHistoryResult) && AbstractC22676k.m65745e(this.educationHub, c3369a.educationHub) && this.hasShownOverlay == c3369a.hasShownOverlay;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasShownOverlay) + ((this.educationHub.hashCode() + ((this.chatHistoryResult.hashCode() + ((this.feedbackResult.hashCode() + (this.aiConversationResult.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        C14558c c14558c = this.aiConversationResult;
        C17394c c17394c = this.feedbackResult;
        C18620c c18620c = this.chatHistoryResult;
        C15965d c15965d = this.educationHub;
        boolean z4 = this.hasShownOverlay;
        StringBuilder sb4 = new StringBuilder("AiDomainState(aiConversationResult=");
        sb4.append(c14558c);
        sb4.append(", feedbackResult=");
        sb4.append(c17394c);
        sb4.append(", chatHistoryResult=");
        sb4.append(c18620c);
        sb4.append(", educationHub=");
        sb4.append(c15965d);
        sb4.append(", hasShownOverlay=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }
}
