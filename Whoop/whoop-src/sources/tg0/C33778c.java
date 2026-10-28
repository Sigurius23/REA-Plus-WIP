package tg0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import vg0.C35984e;

/* JADX INFO: renamed from: tg0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Ltg0/c;", "", "Ltg0/b;", "aiChatDomainResult", "Lvg0/e;", "chatHistoryResult", "<init>", "(Ltg0/b;Lvg0/e;)V", "a", "(Ltg0/b;Lvg0/e;)Ltg0/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltg0/b;", "c", "()Ltg0/b;", "b", "Lvg0/e;", "d", "()Lvg0/e;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33778c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C33777b aiChatDomainResult;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C35984e chatHistoryResult;

    public C33778c(C33777b aiChatDomainResult, C35984e chatHistoryResult) {
        AbstractC22676k.m65750j(aiChatDomainResult, "aiChatDomainResult");
        AbstractC22676k.m65750j(chatHistoryResult, "chatHistoryResult");
        this.aiChatDomainResult = aiChatDomainResult;
        this.chatHistoryResult = chatHistoryResult;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C33778c m106842b(C33778c c33778c, C33777b c33777b, C35984e c35984e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c33777b = c33778c.aiChatDomainResult;
        }
        if ((i13 & 2) != 0) {
            c35984e = c33778c.chatHistoryResult;
        }
        return c33778c.m106843a(c33777b, c35984e);
    }

    /* JADX INFO: renamed from: a */
    public final C33778c m106843a(C33777b aiChatDomainResult, C35984e chatHistoryResult) {
        AbstractC22676k.m65750j(aiChatDomainResult, "aiChatDomainResult");
        AbstractC22676k.m65750j(chatHistoryResult, "chatHistoryResult");
        return new C33778c(aiChatDomainResult, chatHistoryResult);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C33777b getAiChatDomainResult() {
        return this.aiChatDomainResult;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C35984e getChatHistoryResult() {
        return this.chatHistoryResult;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33778c)) {
            return false;
        }
        C33778c c33778c = (C33778c) other;
        return AbstractC22676k.m65745e(this.aiChatDomainResult, c33778c.aiChatDomainResult) && AbstractC22676k.m65745e(this.chatHistoryResult, c33778c.chatHistoryResult);
    }

    public int hashCode() {
        return this.chatHistoryResult.hashCode() + (this.aiChatDomainResult.hashCode() * 31);
    }

    public String toString() {
        return "AiChatDomainState(aiChatDomainResult=" + this.aiChatDomainResult + ", chatHistoryResult=" + this.chatHistoryResult + ")";
    }
}
