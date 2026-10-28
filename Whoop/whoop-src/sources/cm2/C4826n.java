package cm2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: cm2.n */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, m65681d2 = {"Lcm2/n;", "", "Lcom/whoop/design/util/TextResource;", "title", "description", "startingWeight", "primaryButtonTitle", "secondaryButtonTitle", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "c", "d", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4826n {

    /* JADX INFO: renamed from: f */
    public static final int f19863f = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource startingWeight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource primaryButtonTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource secondaryButtonTitle;

    public C4826n(TextResource title, TextResource description, TextResource startingWeight, TextResource primaryButtonTitle, TextResource secondaryButtonTitle) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(startingWeight, "startingWeight");
        AbstractC22676k.m65750j(primaryButtonTitle, "primaryButtonTitle");
        AbstractC22676k.m65750j(secondaryButtonTitle, "secondaryButtonTitle");
        this.title = title;
        this.description = description;
        this.startingWeight = startingWeight;
        this.primaryButtonTitle = primaryButtonTitle;
        this.secondaryButtonTitle = secondaryButtonTitle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
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
    public final TextResource getStartingWeight() {
        return this.startingWeight;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4826n)) {
            return false;
        }
        C4826n c4826n = (C4826n) other;
        return AbstractC22676k.m65745e(this.title, c4826n.title) && AbstractC22676k.m65745e(this.description, c4826n.description) && AbstractC22676k.m65745e(this.startingWeight, c4826n.startingWeight) && AbstractC22676k.m65745e(this.primaryButtonTitle, c4826n.primaryButtonTitle) && AbstractC22676k.m65745e(this.secondaryButtonTitle, c4826n.secondaryButtonTitle);
    }

    public int hashCode() {
        return this.secondaryButtonTitle.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.description, 31), this.startingWeight, 31), this.primaryButtonTitle, 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.description;
        TextResource textResource3 = this.startingWeight;
        TextResource textResource4 = this.primaryButtonTitle;
        TextResource textResource5 = this.secondaryButtonTitle;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ReplaceDialogViewState(title=", textResource, ", description=", textResource2, ", startingWeight=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", primaryButtonTitle=", textResource4, ", secondaryButtonTitle=");
        return AbstractC30007c.m91841k(sbM106658q, textResource5, ")");
    }
}
