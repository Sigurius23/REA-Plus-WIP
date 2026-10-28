package il0;

import com.whoop.bot.models.history.ConversationHistory;
import java.util.List;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: il0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lil0/c;", "", "", "isError", "isLoading", "Lcom/whoop/bot/models/history/ConversationHistory;", "conversationHistory", "<init>", "(ZZLcom/whoop/bot/models/history/ConversationHistory;)V", "a", "(ZZLcom/whoop/bot/models/history/ConversationHistory;)Lil0/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "b", "e", "c", "Lcom/whoop/bot/models/history/ConversationHistory;", "()Lcom/whoop/bot/models/history/ConversationHistory;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18620c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ConversationHistory conversationHistory;

    public C18620c(boolean z4, boolean z13, ConversationHistory conversationHistory) {
        AbstractC22676k.m65750j(conversationHistory, "conversationHistory");
        this.isError = z4;
        this.isLoading = z13;
        this.conversationHistory = conversationHistory;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C18620c m53893b(C18620c c18620c, boolean z4, boolean z13, ConversationHistory conversationHistory, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c18620c.isError;
        }
        if ((i13 & 2) != 0) {
            z13 = c18620c.isLoading;
        }
        if ((i13 & 4) != 0) {
            conversationHistory = c18620c.conversationHistory;
        }
        return c18620c.m53894a(z4, z13, conversationHistory);
    }

    /* JADX INFO: renamed from: a */
    public final C18620c m53894a(boolean isError, boolean isLoading, ConversationHistory conversationHistory) {
        AbstractC22676k.m65750j(conversationHistory, "conversationHistory");
        return new C18620c(isError, isLoading, conversationHistory);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ConversationHistory getConversationHistory() {
        return this.conversationHistory;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18620c)) {
            return false;
        }
        C18620c c18620c = (C18620c) other;
        return this.isError == c18620c.isError && this.isLoading == c18620c.isLoading && AbstractC22676k.m65745e(this.conversationHistory, c18620c.conversationHistory);
    }

    public int hashCode() {
        return this.conversationHistory.hashCode() + AbstractC2875y.m8289b(Boolean.hashCode(this.isError) * 31, 31, this.isLoading);
    }

    public String toString() {
        boolean z4 = this.isError;
        boolean z13 = this.isLoading;
        ConversationHistory conversationHistory = this.conversationHistory;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("AiConversationHistoryResult(isError=", ", isLoading=", ", conversationHistory=", z4, z13);
        sbM32002u.append(conversationHistory);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C18620c(boolean z4, boolean z13, ConversationHistory conversationHistory, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? new ConversationHistory((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0)) : conversationHistory);
    }
}
