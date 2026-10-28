package vg0;

import com.whoop.bot.models.feedback.AiFeedbackType;
import com.whoop.bot.models.feedback.AiMessageFeedback;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vg0.y0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0019\u0010!¨\u0006\""}, m65681d2 = {"Lvg0/y0;", "", "", "fingerprint", "turnId", "Lcom/whoop/bot/models/feedback/AiFeedbackType;", "feedbackType", "Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "feedback", "", "showToast", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lcom/whoop/bot/models/feedback/AiMessageFeedback;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Lcom/whoop/bot/models/feedback/AiFeedbackType;", "getFeedbackType", "()Lcom/whoop/bot/models/feedback/AiFeedbackType;", "Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "()Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "e", "Z", "()Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36025y0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String fingerprint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String turnId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AiFeedbackType feedbackType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AiMessageFeedback feedback;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean showToast;

    public C36025y0(String fingerprint, String turnId, AiFeedbackType feedbackType, AiMessageFeedback feedback, boolean z4) {
        AbstractC22676k.m65750j(fingerprint, "fingerprint");
        AbstractC22676k.m65750j(turnId, "turnId");
        AbstractC22676k.m65750j(feedbackType, "feedbackType");
        AbstractC22676k.m65750j(feedback, "feedback");
        this.fingerprint = fingerprint;
        this.turnId = turnId;
        this.feedbackType = feedbackType;
        this.feedback = feedback;
        this.showToast = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AiMessageFeedback getFeedback() {
        return this.feedback;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFingerprint() {
        return this.fingerprint;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShowToast() {
        return this.showToast;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTurnId() {
        return this.turnId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36025y0)) {
            return false;
        }
        C36025y0 c36025y0 = (C36025y0) other;
        return AbstractC22676k.m65745e(this.fingerprint, c36025y0.fingerprint) && AbstractC22676k.m65745e(this.turnId, c36025y0.turnId) && this.feedbackType == c36025y0.feedbackType && AbstractC22676k.m65745e(this.feedback, c36025y0.feedback) && this.showToast == c36025y0.showToast;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showToast) + ((this.feedback.hashCode() + ((this.feedbackType.hashCode() + AbstractC11266d.m30450d(this.fingerprint.hashCode() * 31, 31, this.turnId)) * 31)) * 31);
    }

    public String toString() {
        String str = this.fingerprint;
        String str2 = this.turnId;
        AiFeedbackType aiFeedbackType = this.feedbackType;
        AiMessageFeedback aiMessageFeedback = this.feedback;
        boolean z4 = this.showToast;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SubmitTurnFeedbackAction(fingerprint=", str, ", turnId=", str2, ", feedbackType=");
        sbM32001t.append(aiFeedbackType);
        sbM32001t.append(", feedback=");
        sbM32001t.append(aiMessageFeedback);
        sbM32001t.append(", showToast=");
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }
}
