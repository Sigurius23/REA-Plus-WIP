package p734sl0;

import java.util.List;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sl0.v1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0019"}, m65681d2 = {"Lsl0/v1;", "", "", "", "suggestions", "", "messageCount", "conversationId", "<init>", "(Ljava/util/List;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "I", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32684v1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<String> suggestions;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int messageCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String conversationId;

    public C32684v1(List<String> suggestions, int i13, String conversationId) {
        AbstractC22676k.m65750j(suggestions, "suggestions");
        AbstractC22676k.m65750j(conversationId, "conversationId");
        this.suggestions = suggestions;
        this.messageCount = i13;
        this.conversationId = conversationId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMessageCount() {
        return this.messageCount;
    }

    /* JADX INFO: renamed from: c */
    public final List<String> m102494c() {
        return this.suggestions;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32684v1)) {
            return false;
        }
        C32684v1 c32684v1 = (C32684v1) other;
        return AbstractC22676k.m65745e(this.suggestions, c32684v1.suggestions) && this.messageCount == c32684v1.messageCount && AbstractC22676k.m65745e(this.conversationId, c32684v1.conversationId);
    }

    public int hashCode() {
        return this.conversationId.hashCode() + AbstractC11266d.m30448b(this.messageCount, this.suggestions.hashCode() * 31, 31);
    }

    public String toString() {
        List<String> list = this.suggestions;
        int i13 = this.messageCount;
        String str = this.conversationId;
        StringBuilder sb4 = new StringBuilder("HorizontalBubbleSuggestionsViewState(suggestions=");
        sb4.append(list);
        sb4.append(", messageCount=");
        sb4.append(i13);
        sb4.append(", conversationId=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }
}
