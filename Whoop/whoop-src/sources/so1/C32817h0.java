package so1;

import com.whoop.design.util.TextResource;
import ny0.C27273p0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: so1.h0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lso1/h0;", "", "Lcom/whoop/design/util/TextResource;", "descriptionDisplay", "Lny0/p0;", "coachButton", "<init>", "(Lcom/whoop/design/util/TextResource;Lny0/p0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Lny0/p0;", "()Lny0/p0;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32817h0 {

    /* JADX INFO: renamed from: c */
    public static final int f136724c = C27273p0.f109116o | TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource descriptionDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C27273p0 coachButton;

    public C32817h0(TextResource descriptionDisplay, C27273p0 c27273p0) {
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        this.descriptionDisplay = descriptionDisplay;
        this.coachButton = c27273p0;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C27273p0 getCoachButton() {
        return this.coachButton;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32817h0)) {
            return false;
        }
        C32817h0 c32817h0 = (C32817h0) other;
        return AbstractC22676k.m65745e(this.descriptionDisplay, c32817h0.descriptionDisplay) && AbstractC22676k.m65745e(this.coachButton, c32817h0.coachButton);
    }

    public int hashCode() {
        int iHashCode = this.descriptionDisplay.hashCode() * 31;
        C27273p0 c27273p0 = this.coachButton;
        return iHashCode + (c27273p0 == null ? 0 : c27273p0.hashCode());
    }

    public String toString() {
        return "PhaseEducationContentViewState(descriptionDisplay=" + this.descriptionDisplay + ", coachButton=" + this.coachButton + ")";
    }
}
