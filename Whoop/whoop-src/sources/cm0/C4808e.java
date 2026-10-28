package cm0;

import androidx.core.app.NotificationCompat;
import bm0.C3416s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import uz0.C35415i;

/* JADX INFO: renamed from: cm0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\u001b\u0010!R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u0017\u0010!¨\u0006#"}, m65681d2 = {"Lcm0/e;", "Lm91/u;", "Lbm0/s;", NotificationCompat.CATEGORY_RECOMMENDATION, "Luz0/i;", "recommendationV2", "Lcm0/a;", "startButton", "generateAlternativeButton", "cancelButtonState", "<init>", "(Lbm0/s;Luz0/i;Lcm0/a;Lcm0/a;Lcm0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbm0/s;", "c", "()Lbm0/s;", "b", "Luz0/i;", "e", "()Luz0/i;", "Lcm0/a;", "f", "()Lcm0/a;", "d", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4808e implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C3416s recommendation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C35415i recommendationV2;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C4804a startButton;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C4804a generateAlternativeButton;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C4804a cancelButtonState;

    public C4808e(C3416s c3416s, C35415i c35415i, C4804a startButton, C4804a generateAlternativeButton, C4804a cancelButtonState) {
        AbstractC22676k.m65750j(startButton, "startButton");
        AbstractC22676k.m65750j(generateAlternativeButton, "generateAlternativeButton");
        AbstractC22676k.m65750j(cancelButtonState, "cancelButtonState");
        this.recommendation = c3416s;
        this.recommendationV2 = c35415i;
        this.startButton = startButton;
        this.generateAlternativeButton = generateAlternativeButton;
        this.cancelButtonState = cancelButtonState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C4804a getCancelButtonState() {
        return this.cancelButtonState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C4804a getGenerateAlternativeButton() {
        return this.generateAlternativeButton;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C3416s getRecommendation() {
        return this.recommendation;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C35415i getRecommendationV2() {
        return this.recommendationV2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4808e)) {
            return false;
        }
        C4808e c4808e = (C4808e) other;
        return AbstractC22676k.m65745e(this.recommendation, c4808e.recommendation) && AbstractC22676k.m65745e(this.recommendationV2, c4808e.recommendationV2) && AbstractC22676k.m65745e(this.startButton, c4808e.startButton) && AbstractC22676k.m65745e(this.generateAlternativeButton, c4808e.generateAlternativeButton) && AbstractC22676k.m65745e(this.cancelButtonState, c4808e.cancelButtonState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C4804a getStartButton() {
        return this.startButton;
    }

    public int hashCode() {
        C3416s c3416s = this.recommendation;
        int iHashCode = (c3416s == null ? 0 : c3416s.hashCode()) * 31;
        C35415i c35415i = this.recommendationV2;
        return this.cancelButtonState.hashCode() + ((this.generateAlternativeButton.hashCode() + ((this.startButton.hashCode() + ((iHashCode + (c35415i != null ? c35415i.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "CommittedWorkoutRecommendationViewState(recommendation=" + this.recommendation + ", recommendationV2=" + this.recommendationV2 + ", startButton=" + this.startButton + ", generateAlternativeButton=" + this.generateAlternativeButton + ", cancelButtonState=" + this.cancelButtonState + ")";
    }
}
