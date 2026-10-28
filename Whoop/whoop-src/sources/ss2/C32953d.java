package ss2;

import com.whoop.design.models.items.SecondaryButtonModel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ss2.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lss2/d;", "", "", "subtitleDisplay", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "learnMoreButton", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "()Lcom/whoop/design/models/items/SecondaryButtonModel;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32953d {

    /* JADX INFO: renamed from: c */
    public static final int f137258c = SecondaryButtonModel.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String subtitleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final SecondaryButtonModel learnMoreButton;

    public C32953d(String subtitleDisplay, SecondaryButtonModel learnMoreButton) {
        AbstractC22676k.m65750j(subtitleDisplay, "subtitleDisplay");
        AbstractC22676k.m65750j(learnMoreButton, "learnMoreButton");
        this.subtitleDisplay = subtitleDisplay;
        this.learnMoreButton = learnMoreButton;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final SecondaryButtonModel getLearnMoreButton() {
        return this.learnMoreButton;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32953d)) {
            return false;
        }
        C32953d c32953d = (C32953d) other;
        return AbstractC22676k.m65745e(this.subtitleDisplay, c32953d.subtitleDisplay) && AbstractC22676k.m65745e(this.learnMoreButton, c32953d.learnMoreButton);
    }

    public int hashCode() {
        return this.learnMoreButton.hashCode() + (this.subtitleDisplay.hashCode() * 31);
    }

    public String toString() {
        return "ChallengeLandingHeader(subtitleDisplay=" + this.subtitleDisplay + ", learnMoreButton=" + this.learnMoreButton + ")";
    }
}
