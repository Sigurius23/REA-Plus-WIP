package nl0;

import com.whoop.bot.models.feedback.AiMessageFeedback;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: nl0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u001f\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b,\u0010+\u001a\u0004\b-\u0010\u0018R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b,\u0010/R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b'\u0010\"R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\b*\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b3\u00105\u001a\u0004\b%\u00106¨\u00067"}, m65681d2 = {"Lnl0/c;", "", "", "showChatIcon", "isComplete", "isStopped", "isLoading", "failure", "", "content", "timestamp", "Lnl0/b;", "role", "id", "feedbackEnabled", "", "Lm91/u;", "items", "isSuggestion", "Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "feedback", "<init>", "(ZZZZZLjava/lang/String;Ljava/lang/String;Lnl0/b;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Boolean;Lcom/whoop/bot/models/feedback/AiMessageFeedback;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "b", "j", "c", "l", "d", "k", "e", "f", "Ljava/lang/String;", "g", "i", "Lnl0/b;", "()Lnl0/b;", "Ljava/util/List;", "()Ljava/util/List;", "Ljava/lang/Boolean;", "m", "()Ljava/lang/Boolean;", "Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "()Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26801c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean showChatIcon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isComplete;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isStopped;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean failure;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String content;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String timestamp;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC26800b role;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean feedbackEnabled;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final Boolean isSuggestion;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final AiMessageFeedback feedback;

    /* JADX WARN: Multi-variable type inference failed */
    public C26801c(boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, String content, String str, EnumC26800b role, String id4, boolean z17, List<? extends InterfaceC25312u> items, Boolean bool, AiMessageFeedback aiMessageFeedback) {
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        this.showChatIcon = z4;
        this.isComplete = z13;
        this.isStopped = z14;
        this.isLoading = z15;
        this.failure = z16;
        this.content = content;
        this.timestamp = str;
        this.role = role;
        this.id = id4;
        this.feedbackEnabled = z17;
        this.items = items;
        this.isSuggestion = bool;
        this.feedback = aiMessageFeedback;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getFailure() {
        return this.failure;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AiMessageFeedback getFeedback() {
        return this.feedback;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getFeedbackEnabled() {
        return this.feedbackEnabled;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26801c)) {
            return false;
        }
        C26801c c26801c = (C26801c) other;
        return this.showChatIcon == c26801c.showChatIcon && this.isComplete == c26801c.isComplete && this.isStopped == c26801c.isStopped && this.isLoading == c26801c.isLoading && this.failure == c26801c.failure && AbstractC22676k.m65745e(this.content, c26801c.content) && AbstractC22676k.m65745e(this.timestamp, c26801c.timestamp) && this.role == c26801c.role && AbstractC22676k.m65745e(this.id, c26801c.id) && this.feedbackEnabled == c26801c.feedbackEnabled && AbstractC22676k.m65745e(this.items, c26801c.items) && AbstractC22676k.m65745e(this.isSuggestion, c26801c.isSuggestion) && AbstractC22676k.m65745e(this.feedback, c26801c.feedback);
    }

    /* JADX INFO: renamed from: f */
    public final List<InterfaceC25312u> m79890f() {
        return this.items;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC26800b getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getShowChatIcon() {
        return this.showChatIcon;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.showChatIcon) * 31, 31, this.isComplete), 31, this.isStopped), 31, this.isLoading), 31, this.failure), 31, this.content);
        String str = this.timestamp;
        int iM31983b = AbstractC11895b.m31983b(AbstractC2875y.m8289b(AbstractC11266d.m30450d((this.role.hashCode() + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.id), 31, this.feedbackEnabled), 31, this.items);
        Boolean bool = this.isSuggestion;
        int iHashCode = (iM31983b + (bool == null ? 0 : bool.hashCode())) * 31;
        AiMessageFeedback aiMessageFeedback = this.feedback;
        return iHashCode + (aiMessageFeedback != null ? aiMessageFeedback.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsStopped() {
        return this.isStopped;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Boolean getIsSuggestion() {
        return this.isSuggestion;
    }

    public String toString() {
        boolean z4 = this.showChatIcon;
        boolean z13 = this.isComplete;
        boolean z14 = this.isStopped;
        boolean z15 = this.isLoading;
        boolean z16 = this.failure;
        String str = this.content;
        String str2 = this.timestamp;
        EnumC26800b enumC26800b = this.role;
        String str3 = this.id;
        boolean z17 = this.feedbackEnabled;
        List<InterfaceC25312u> list = this.items;
        Boolean bool = this.isSuggestion;
        AiMessageFeedback aiMessageFeedback = this.feedback;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("AiChatMessageViewState(showChatIcon=", ", isComplete=", ", isStopped=", z4, z13);
        AbstractC38963t7.m124392v(sbM32002u, z14, ", isLoading=", z15, ", failure=");
        AbstractC38963t7.m124391u(sbM32002u, z16, ", content=", str, ", timestamp=");
        sbM32002u.append(str2);
        sbM32002u.append(", role=");
        sbM32002u.append(enumC26800b);
        sbM32002u.append(", id=");
        AbstractC38963t7.m124390t(sbM32002u, str3, ", feedbackEnabled=", z17, ", items=");
        sbM32002u.append(list);
        sbM32002u.append(", isSuggestion=");
        sbM32002u.append(bool);
        sbM32002u.append(", feedback=");
        sbM32002u.append(aiMessageFeedback);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }
}
