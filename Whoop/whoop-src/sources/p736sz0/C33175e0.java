package p736sz0;

import com.whoop.design.util.TextResource;
import ny0.C27273p0;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: sz0.e0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0016\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u001d\u0010\"R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\u001e\u0010\"¨\u0006#"}, m65681d2 = {"Lsz0/e0;", "", "", "number", "Lcom/whoop/design/util/TextResource;", "headerText", "descriptionText", "Lny0/p0;", "cta", "", "hasBackgroundBar", "hasDivider", "<init>", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lny0/p0;ZZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "f", "b", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "c", "d", "Lny0/p0;", "()Lny0/p0;", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33175e0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int number;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource headerText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource descriptionText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C27273p0 cta;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean hasBackgroundBar;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean hasDivider;

    public C33175e0(int i13, TextResource headerText, TextResource descriptionText, C27273p0 c27273p0, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(headerText, "headerText");
        AbstractC22676k.m65750j(descriptionText, "descriptionText");
        this.number = i13;
        this.headerText = headerText;
        this.descriptionText = descriptionText;
        this.cta = c27273p0;
        this.hasBackgroundBar = z4;
        this.hasDivider = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C27273p0 getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getDescriptionText() {
        return this.descriptionText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getHasBackgroundBar() {
        return this.hasBackgroundBar;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getHasDivider() {
        return this.hasDivider;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getHeaderText() {
        return this.headerText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33175e0)) {
            return false;
        }
        C33175e0 c33175e0 = (C33175e0) other;
        return this.number == c33175e0.number && AbstractC22676k.m65745e(this.headerText, c33175e0.headerText) && AbstractC22676k.m65745e(this.descriptionText, c33175e0.descriptionText) && AbstractC22676k.m65745e(this.cta, c33175e0.cta) && this.hasBackgroundBar == c33175e0.hasBackgroundBar && this.hasDivider == c33175e0.hasDivider;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getNumber() {
        return this.number;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(Integer.hashCode(this.number) * 31, this.headerText, 31), this.descriptionText, 31);
        C27273p0 c27273p0 = this.cta;
        return Boolean.hashCode(this.hasDivider) + AbstractC2875y.m8289b((iM95625a + (c27273p0 == null ? 0 : c27273p0.hashCode())) * 31, 31, this.hasBackgroundBar);
    }

    public String toString() {
        int i13 = this.number;
        TextResource textResource = this.headerText;
        TextResource textResource2 = this.descriptionText;
        C27273p0 c27273p0 = this.cta;
        boolean z4 = this.hasBackgroundBar;
        boolean z13 = this.hasDivider;
        StringBuilder sbM91844n = AbstractC30007c.m91844n("NumberedListItemViewState(number=", i13, ", headerText=", textResource, ", descriptionText=");
        sbM91844n.append(textResource2);
        sbM91844n.append(", cta=");
        sbM91844n.append(c27273p0);
        sbM91844n.append(", hasBackgroundBar=");
        return AbstractC36095b.m114682j(sbM91844n, z4, ", hasDivider=", z13, ")");
    }
}
