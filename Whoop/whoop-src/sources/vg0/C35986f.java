package vg0;

import com.whoop.p057ai.chat.models.AIConversationMetadata;
import java.util.List;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vg0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lvg0/f;", "", "", "title", "", "Lcom/whoop/ai/chat/models/AIConversationMetadata;", "conversations", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "a", "(Ljava/lang/String;Ljava/util/List;)Lvg0/f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35986f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<AIConversationMetadata> conversations;

    public C35986f(String title, List<AIConversationMetadata> conversations) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(conversations, "conversations");
        this.title = title;
        this.conversations = conversations;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C35986f m114278b(C35986f c35986f, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c35986f.title;
        }
        if ((i13 & 2) != 0) {
            list = c35986f.conversations;
        }
        return c35986f.m114279a(str, list);
    }

    /* JADX INFO: renamed from: a */
    public final C35986f m114279a(String title, List<AIConversationMetadata> conversations) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(conversations, "conversations");
        return new C35986f(title, conversations);
    }

    /* JADX INFO: renamed from: c */
    public final List<AIConversationMetadata> m114280c() {
        return this.conversations;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35986f)) {
            return false;
        }
        C35986f c35986f = (C35986f) other;
        return AbstractC22676k.m65745e(this.title, c35986f.title) && AbstractC22676k.m65745e(this.conversations, c35986f.conversations);
    }

    public int hashCode() {
        return this.conversations.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return AbstractC36095b.m114679g("AiChatHistorySection(title=", this.title, ", conversations=", ")", this.conversations);
    }
}
