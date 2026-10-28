package jx1;

import com.whoop.navigation.C9598e;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jx1.g0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Ljx1/g0;", "", "", "title", "subtitle", "strikethroughPrice", "price", "Ljx1/g;", "primaryCta", "secondaryCta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljx1/g;Ljx1/g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "e", "c", "d", "Ljx1/g;", "()Ljx1/g;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22017g0 {

    /* JADX INFO: renamed from: g */
    public static final int f85367g = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String strikethroughPrice;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String price;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C22016g primaryCta;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C22016g secondaryCta;

    public C22017g0(String title, String subtitle, String strikethroughPrice, String price, C22016g primaryCta, C22016g secondaryCta) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(strikethroughPrice, "strikethroughPrice");
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(primaryCta, "primaryCta");
        AbstractC22676k.m65750j(secondaryCta, "secondaryCta");
        this.title = title;
        this.subtitle = subtitle;
        this.strikethroughPrice = strikethroughPrice;
        this.price = price;
        this.primaryCta = primaryCta;
        this.secondaryCta = secondaryCta;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C22016g getPrimaryCta() {
        return this.primaryCta;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C22016g getSecondaryCta() {
        return this.secondaryCta;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStrikethroughPrice() {
        return this.strikethroughPrice;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22017g0)) {
            return false;
        }
        C22017g0 c22017g0 = (C22017g0) other;
        return AbstractC22676k.m65745e(this.title, c22017g0.title) && AbstractC22676k.m65745e(this.subtitle, c22017g0.subtitle) && AbstractC22676k.m65745e(this.strikethroughPrice, c22017g0.strikethroughPrice) && AbstractC22676k.m65745e(this.price, c22017g0.price) && AbstractC22676k.m65745e(this.primaryCta, c22017g0.primaryCta) && AbstractC22676k.m65745e(this.secondaryCta, c22017g0.secondaryCta);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.secondaryCta.hashCode() + ((this.primaryCta.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.strikethroughPrice), 31, this.price)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.strikethroughPrice;
        String str4 = this.price;
        C22016g c22016g = this.primaryCta;
        C22016g c22016g2 = this.secondaryCta;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SwitchBillingInfoViewState(title=", str, ", subtitle=", str2, ", strikethroughPrice=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", price=", str4, ", primaryCta=");
        sbM32001t.append(c22016g);
        sbM32001t.append(", secondaryCta=");
        sbM32001t.append(c22016g2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
