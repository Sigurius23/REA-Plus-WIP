package hl0;

import com.whoop.bot.models.feedback.AiMessageFeedback;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hl0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lhl0/a;", "", "", "messageId", "Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "feedback", "<init>", "(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "()Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17392a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String messageId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AiMessageFeedback feedback;

    public C17392a(String messageId, AiMessageFeedback feedback) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(feedback, "feedback");
        this.messageId = messageId;
        this.feedback = feedback;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AiMessageFeedback getFeedback() {
        return this.feedback;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17392a)) {
            return false;
        }
        C17392a c17392a = (C17392a) other;
        return AbstractC22676k.m65745e(this.messageId, c17392a.messageId) && AbstractC22676k.m65745e(this.feedback, c17392a.feedback);
    }

    public int hashCode() {
        return this.feedback.hashCode() + (this.messageId.hashCode() * 31);
    }

    public String toString() {
        return "AiFeedbackAction(messageId=" + this.messageId + ", feedback=" + this.feedback + ")";
    }
}
