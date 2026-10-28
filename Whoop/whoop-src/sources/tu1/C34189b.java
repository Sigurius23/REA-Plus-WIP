package tu1;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: tu1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0016\u0010%¨\u0006&"}, m65681d2 = {"Ltu1/b;", "Lm91/u;", "", "infoIcon", "Lcom/whoop/design/util/TextResource;", "infoSheetDetails", "infoSheetTitle", "ctaState", "Ltu1/a;", "bottomSheet", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lm91/u;Ltu1/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getInfoIcon", "b", "Lcom/whoop/design/util/TextResource;", "getInfoSheetDetails", "()Lcom/whoop/design/util/TextResource;", "c", "getInfoSheetTitle", "d", "Lm91/u;", "getCtaState", "()Lm91/u;", "e", "Ltu1/a;", "()Ltu1/a;", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34189b implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String infoIcon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource infoSheetDetails;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource infoSheetTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC25312u ctaState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C34188a bottomSheet;

    public C34189b(String infoIcon, TextResource infoSheetDetails, TextResource infoSheetTitle, InterfaceC25312u interfaceC25312u, C34188a c34188a) {
        AbstractC22676k.m65750j(infoIcon, "infoIcon");
        AbstractC22676k.m65750j(infoSheetDetails, "infoSheetDetails");
        AbstractC22676k.m65750j(infoSheetTitle, "infoSheetTitle");
        this.infoIcon = infoIcon;
        this.infoSheetDetails = infoSheetDetails;
        this.infoSheetTitle = infoSheetTitle;
        this.ctaState = interfaceC25312u;
        this.bottomSheet = c34188a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C34188a getBottomSheet() {
        return this.bottomSheet;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34189b)) {
            return false;
        }
        C34189b c34189b = (C34189b) other;
        return AbstractC22676k.m65745e(this.infoIcon, c34189b.infoIcon) && AbstractC22676k.m65745e(this.infoSheetDetails, c34189b.infoSheetDetails) && AbstractC22676k.m65745e(this.infoSheetTitle, c34189b.infoSheetTitle) && AbstractC22676k.m65745e(this.ctaState, c34189b.ctaState) && AbstractC22676k.m65745e(this.bottomSheet, c34189b.bottomSheet);
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.infoIcon.hashCode() * 31, this.infoSheetDetails, 31), this.infoSheetTitle, 31);
        InterfaceC25312u interfaceC25312u = this.ctaState;
        int iHashCode = (iM95625a + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31;
        C34188a c34188a = this.bottomSheet;
        return iHashCode + (c34188a != null ? c34188a.hashCode() : 0);
    }

    public String toString() {
        String str = this.infoIcon;
        TextResource textResource = this.infoSheetDetails;
        TextResource textResource2 = this.infoSheetTitle;
        InterfaceC25312u interfaceC25312u = this.ctaState;
        C34188a c34188a = this.bottomSheet;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("CardInfoState(infoIcon=", str, ", infoSheetDetails=", textResource, ", infoSheetTitle=");
        sbM91847q.append(textResource2);
        sbM91847q.append(", ctaState=");
        sbM91847q.append(interfaceC25312u);
        sbM91847q.append(", bottomSheet=");
        sbM91847q.append(c34188a);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }
}
