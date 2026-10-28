package tp1;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: tp1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, m65681d2 = {"Ltp1/d;", "", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "descriptionDisplay", "primaryButtonTitle", "secondaryButtonTitle", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "c", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34064d {

    /* JADX INFO: renamed from: e */
    public static final int f142756e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource descriptionDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource primaryButtonTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource secondaryButtonTitle;

    public C34064d(TextResource titleDisplay, TextResource descriptionDisplay, TextResource primaryButtonTitle, TextResource secondaryButtonTitle) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(primaryButtonTitle, "primaryButtonTitle");
        AbstractC22676k.m65750j(secondaryButtonTitle, "secondaryButtonTitle");
        this.titleDisplay = titleDisplay;
        this.descriptionDisplay = descriptionDisplay;
        this.primaryButtonTitle = primaryButtonTitle;
        this.secondaryButtonTitle = secondaryButtonTitle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getPrimaryButtonTitle() {
        return this.primaryButtonTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getSecondaryButtonTitle() {
        return this.secondaryButtonTitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34064d)) {
            return false;
        }
        C34064d c34064d = (C34064d) other;
        return AbstractC22676k.m65745e(this.titleDisplay, c34064d.titleDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, c34064d.descriptionDisplay) && AbstractC22676k.m65745e(this.primaryButtonTitle, c34064d.primaryButtonTitle) && AbstractC22676k.m65745e(this.secondaryButtonTitle, c34064d.secondaryButtonTitle);
    }

    public int hashCode() {
        return this.secondaryButtonTitle.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.titleDisplay.hashCode() * 31, this.descriptionDisplay, 31), this.primaryButtonTitle, 31);
    }

    public String toString() {
        TextResource textResource = this.titleDisplay;
        TextResource textResource2 = this.descriptionDisplay;
        return AbstractC33745d.m106655n(AbstractC33745d.m106658q("HormonalInsightsConfirmDialogState(titleDisplay=", textResource, ", descriptionDisplay=", textResource2, ", primaryButtonTitle="), this.primaryButtonTitle, ", secondaryButtonTitle=", this.secondaryButtonTitle, ")");
    }
}
