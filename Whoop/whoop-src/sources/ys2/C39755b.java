package ys2;

import com.whoop.design.util.TextResource;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: ys2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, m65681d2 = {"Lys2/b;", "", "Lcom/whoop/design/util/TextResource;", "continueButtonDisplay", "", "enableContinueButton", "skipButtonDisplay", "showLoading", "<init>", "(Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "Z", "()Z", "c", "d", "getShowLoading", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39755b {

    /* JADX INFO: renamed from: e */
    public static final int f171150e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource continueButtonDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean enableContinueButton;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource skipButtonDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean showLoading;

    public C39755b(TextResource continueButtonDisplay, boolean z4, TextResource textResource, boolean z13) {
        AbstractC22676k.m65750j(continueButtonDisplay, "continueButtonDisplay");
        this.continueButtonDisplay = continueButtonDisplay;
        this.enableContinueButton = z4;
        this.skipButtonDisplay = textResource;
        this.showLoading = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getContinueButtonDisplay() {
        return this.continueButtonDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getEnableContinueButton() {
        return this.enableContinueButton;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getSkipButtonDisplay() {
        return this.skipButtonDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39755b)) {
            return false;
        }
        C39755b c39755b = (C39755b) other;
        return AbstractC22676k.m65745e(this.continueButtonDisplay, c39755b.continueButtonDisplay) && this.enableContinueButton == c39755b.enableContinueButton && AbstractC22676k.m65745e(this.skipButtonDisplay, c39755b.skipButtonDisplay) && this.showLoading == c39755b.showLoading;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.continueButtonDisplay.hashCode() * 31, 31, this.enableContinueButton);
        TextResource textResource = this.skipButtonDisplay;
        return Boolean.hashCode(this.showLoading) + ((iM8289b + (textResource == null ? 0 : textResource.hashCode())) * 31);
    }

    public String toString() {
        TextResource textResource = this.continueButtonDisplay;
        boolean z4 = this.enableContinueButton;
        TextResource textResource2 = this.skipButtonDisplay;
        boolean z13 = this.showLoading;
        StringBuilder sbM91846p = AbstractC30007c.m91846p("Bottom(continueButtonDisplay=", textResource, ", enableContinueButton=", z4, ", skipButtonDisplay=");
        sbM91846p.append(textResource2);
        sbM91846p.append(", showLoading=");
        sbM91846p.append(z13);
        sbM91846p.append(")");
        return sbM91846p.toString();
    }

    public /* synthetic */ C39755b(TextResource textResource, boolean z4, TextResource textResource2, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, (i13 & 2) != 0 ? true : z4, textResource2, (i13 & 8) != 0 ? false : z13);
    }
}
