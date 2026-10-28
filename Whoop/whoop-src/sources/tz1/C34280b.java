package tz1;

import ih0.AbstractC18489d0;
import java.util.List;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r51.C30938f;

/* JADX INFO: renamed from: tz1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b\u0017\u0010!R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006%"}, m65681d2 = {"Ltz1/b;", "", "", "navigationBarText", "", "Ltz1/e;", "sections", "Lr51/f;", "countrySelector", "Ltz1/a;", "checkoutFooter", "", "showCartIcon", "<init>", "(Ljava/lang/String;Ljava/util/List;Lr51/f;Ltz1/a;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lr51/f;", "()Lr51/f;", "Ltz1/a;", "()Ltz1/a;", "e", "Z", "()Z", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34280b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String navigationBarText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C34283e> sections;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C30938f countrySelector;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C34279a checkoutFooter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean showCartIcon;

    public C34280b(String navigationBarText, List<C34283e> sections, C30938f c30938f, C34279a c34279a, boolean z4) {
        AbstractC22676k.m65750j(navigationBarText, "navigationBarText");
        AbstractC22676k.m65750j(sections, "sections");
        this.navigationBarText = navigationBarText;
        this.sections = sections;
        this.countrySelector = c30938f;
        this.checkoutFooter = c34279a;
        this.showCartIcon = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C34279a getCheckoutFooter() {
        return this.checkoutFooter;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C30938f getCountrySelector() {
        return this.countrySelector;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getNavigationBarText() {
        return this.navigationBarText;
    }

    /* JADX INFO: renamed from: d */
    public final List<C34283e> m108562d() {
        return this.sections;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShowCartIcon() {
        return this.showCartIcon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34280b)) {
            return false;
        }
        C34280b c34280b = (C34280b) other;
        return AbstractC22676k.m65745e(this.navigationBarText, c34280b.navigationBarText) && AbstractC22676k.m65745e(this.sections, c34280b.sections) && AbstractC22676k.m65745e(this.countrySelector, c34280b.countrySelector) && AbstractC22676k.m65745e(this.checkoutFooter, c34280b.checkoutFooter) && this.showCartIcon == c34280b.showCartIcon;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.navigationBarText.hashCode() * 31, 31, this.sections);
        C30938f c30938f = this.countrySelector;
        int iHashCode = (iM31983b + (c30938f == null ? 0 : c30938f.hashCode())) * 31;
        C34279a c34279a = this.checkoutFooter;
        return Boolean.hashCode(this.showCartIcon) + ((iHashCode + (c34279a != null ? c34279a.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.navigationBarText;
        List<C34283e> list = this.sections;
        C30938f c30938f = this.countrySelector;
        C34279a c34279a = this.checkoutFooter;
        boolean z4 = this.showCartIcon;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("NativeStoreData(navigationBarText=", str, ", sections=", ", countrySelector=", list);
        sbM94766o.append(c30938f);
        sbM94766o.append(", checkoutFooter=");
        sbM94766o.append(c34279a);
        sbM94766o.append(", showCartIcon=");
        return AbstractC18489d0.m53372m(sbM94766o, z4, ")");
    }
}
