package eo2;

import hc3.AbstractC17176i;
import java.util.List;
import m83.C25271y;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: eo2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001d\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u001f"}, m65681d2 = {"Leo2/a;", "", "", "title", "", "Leo2/e;", "sections", "Lm91/u;", "checkoutFooter", "cartId", "analyticsSubtotalValue", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "getCartId", "e", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13381a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C13385e> sections;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<InterfaceC25312u> checkoutFooter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String cartId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String analyticsSubtotalValue;

    /* JADX WARN: Multi-variable type inference failed */
    public C13381a(String title, List<C13385e> sections, List<? extends InterfaceC25312u> checkoutFooter, String str, String str2) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(checkoutFooter, "checkoutFooter");
        this.title = title;
        this.sections = sections;
        this.checkoutFooter = checkoutFooter;
        this.cartId = str;
        this.analyticsSubtotalValue = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAnalyticsSubtotalValue() {
        return this.analyticsSubtotalValue;
    }

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC25312u> m37743b() {
        return this.checkoutFooter;
    }

    /* JADX INFO: renamed from: c */
    public final List<C13385e> m37744c() {
        return this.sections;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13381a)) {
            return false;
        }
        C13381a c13381a = (C13381a) other;
        return AbstractC22676k.m65745e(this.title, c13381a.title) && AbstractC22676k.m65745e(this.sections, c13381a.sections) && AbstractC22676k.m65745e(this.checkoutFooter, c13381a.checkoutFooter) && AbstractC22676k.m65745e(this.cartId, c13381a.cartId) && AbstractC22676k.m65745e(this.analyticsSubtotalValue, c13381a.analyticsSubtotalValue);
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.sections), 31, this.checkoutFooter);
        String str = this.cartId;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.analyticsSubtotalValue;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        List<C13385e> list = this.sections;
        List<InterfaceC25312u> list2 = this.checkoutFooter;
        String str2 = this.cartId;
        String str3 = this.analyticsSubtotalValue;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("CartData(title=", str, ", sections=", ", checkoutFooter=", list);
        AbstractC17176i.m48511m(", cartId=", str2, ", analyticsSubtotalValue=", sbM94766o, list2);
        return AbstractC25012a.m73376i(str3, ")", sbM94766o);
    }

    public /* synthetic */ C13381a(String str, List list, List list2, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i13 & 4) != 0 ? C25271y.f99162w : list2, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : str3);
    }
}
