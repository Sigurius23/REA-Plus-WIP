package vg0;

import com.whoop.p057ai.chat.models.TurnFeedbackResponse;
import hl0.AbstractC17395d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vg0.a1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ<\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, m65681d2 = {"Lvg0/a1;", "", "", "turnId", "Lcom/whoop/ai/chat/models/TurnFeedbackResponse;", "feedback", "", "showToast", "Lhl0/d;", "toastStyle", "<init>", "(Ljava/lang/String;Lcom/whoop/ai/chat/models/TurnFeedbackResponse;ZLhl0/d;)V", "a", "(Ljava/lang/String;Lcom/whoop/ai/chat/models/TurnFeedbackResponse;ZLhl0/d;)Lvg0/a1;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "Lcom/whoop/ai/chat/models/TurnFeedbackResponse;", "c", "()Lcom/whoop/ai/chat/models/TurnFeedbackResponse;", "Z", "getShowToast", "()Z", "d", "Lhl0/d;", "()Lhl0/d;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35976a1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String turnId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TurnFeedbackResponse feedback;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean showToast;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC17395d toastStyle;

    public C35976a1(String turnId, TurnFeedbackResponse turnFeedbackResponse, boolean z4, AbstractC17395d abstractC17395d) {
        AbstractC22676k.m65750j(turnId, "turnId");
        this.turnId = turnId;
        this.feedback = turnFeedbackResponse;
        this.showToast = z4;
        this.toastStyle = abstractC17395d;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C35976a1 m114221b(C35976a1 c35976a1, String str, TurnFeedbackResponse turnFeedbackResponse, boolean z4, AbstractC17395d abstractC17395d, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c35976a1.turnId;
        }
        if ((i13 & 2) != 0) {
            turnFeedbackResponse = c35976a1.feedback;
        }
        if ((i13 & 4) != 0) {
            z4 = c35976a1.showToast;
        }
        if ((i13 & 8) != 0) {
            abstractC17395d = c35976a1.toastStyle;
        }
        return c35976a1.m114222a(str, turnFeedbackResponse, z4, abstractC17395d);
    }

    /* JADX INFO: renamed from: a */
    public final C35976a1 m114222a(String turnId, TurnFeedbackResponse feedback, boolean showToast, AbstractC17395d toastStyle) {
        AbstractC22676k.m65750j(turnId, "turnId");
        return new C35976a1(turnId, feedback, showToast, toastStyle);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TurnFeedbackResponse getFeedback() {
        return this.feedback;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AbstractC17395d getToastStyle() {
        return this.toastStyle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTurnId() {
        return this.turnId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35976a1)) {
            return false;
        }
        C35976a1 c35976a1 = (C35976a1) other;
        return AbstractC22676k.m65745e(this.turnId, c35976a1.turnId) && AbstractC22676k.m65745e(this.feedback, c35976a1.feedback) && this.showToast == c35976a1.showToast && AbstractC22676k.m65745e(this.toastStyle, c35976a1.toastStyle);
    }

    public int hashCode() {
        int iHashCode = this.turnId.hashCode() * 31;
        TurnFeedbackResponse turnFeedbackResponse = this.feedback;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (turnFeedbackResponse == null ? 0 : turnFeedbackResponse.hashCode())) * 31, 31, this.showToast);
        AbstractC17395d abstractC17395d = this.toastStyle;
        return iM8289b + (abstractC17395d != null ? abstractC17395d.hashCode() : 0);
    }

    public String toString() {
        return "SubmitTurnFeedbackResult(turnId=" + this.turnId + ", feedback=" + this.feedback + ", showToast=" + this.showToast + ", toastStyle=" + this.toastStyle + ")";
    }
}
