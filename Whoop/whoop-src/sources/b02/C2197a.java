package b02;

import c13.AbstractC3855a;
import com.whoop.universalcheckout.features.cart.domain.CartAddIntent;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import ny0.C27256h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b02.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b&\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b'\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b*\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b+\u0010\u0018R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010 \u001a\u0004\b(\u0010\u0018R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\"\u0010/R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b\u001f\u00102R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b\u0013\u00105R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u0010 \u001a\u0004\b7\u0010\u0018¨\u00068"}, m65681d2 = {"Lb02/a;", "", "", "navigationBarText", "", "Lb02/d;", "sections", "Lny0/h;", "checkoutFooter", "selectedSku", "selectedPrice", "selectedProductKey", "selectedVariantKey", "productName", "", "analyticsProperties", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "addIntent", "", "isPack", "packSku", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", "c", "getSelectedSku", "e", "g", "getSelectedProductKey", "getSelectedVariantKey", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Ljava/util/Map;", "()Ljava/util/Map;", "j", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "()Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "k", "Z", "()Z", "l", "getPackSku", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2197a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String navigationBarText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C2200d> sections;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C27256h> checkoutFooter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String selectedSku;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String selectedPrice;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String selectedProductKey;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String selectedVariantKey;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String productName;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Map<String, String> analyticsProperties;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final CartAddIntent addIntent;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean isPack;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final String packSku;

    public C2197a(String navigationBarText, List<C2200d> sections, List<C27256h> checkoutFooter, String str, String str2, String str3, String str4, String productName, Map<String, String> analyticsProperties, CartAddIntent cartAddIntent, boolean z4, String str5) {
        AbstractC22676k.m65750j(navigationBarText, "navigationBarText");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(checkoutFooter, "checkoutFooter");
        AbstractC22676k.m65750j(productName, "productName");
        AbstractC22676k.m65750j(analyticsProperties, "analyticsProperties");
        this.navigationBarText = navigationBarText;
        this.sections = sections;
        this.checkoutFooter = checkoutFooter;
        this.selectedSku = str;
        this.selectedPrice = str2;
        this.selectedProductKey = str3;
        this.selectedVariantKey = str4;
        this.productName = productName;
        this.analyticsProperties = analyticsProperties;
        this.addIntent = cartAddIntent;
        this.isPack = z4;
        this.packSku = str5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CartAddIntent getAddIntent() {
        return this.addIntent;
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, String> m6948b() {
        return this.analyticsProperties;
    }

    /* JADX INFO: renamed from: c */
    public final List<C27256h> m6949c() {
        return this.checkoutFooter;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getNavigationBarText() {
        return this.navigationBarText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2197a)) {
            return false;
        }
        C2197a c2197a = (C2197a) other;
        return AbstractC22676k.m65745e(this.navigationBarText, c2197a.navigationBarText) && AbstractC22676k.m65745e(this.sections, c2197a.sections) && AbstractC22676k.m65745e(this.checkoutFooter, c2197a.checkoutFooter) && AbstractC22676k.m65745e(this.selectedSku, c2197a.selectedSku) && AbstractC22676k.m65745e(this.selectedPrice, c2197a.selectedPrice) && AbstractC22676k.m65745e(this.selectedProductKey, c2197a.selectedProductKey) && AbstractC22676k.m65745e(this.selectedVariantKey, c2197a.selectedVariantKey) && AbstractC22676k.m65745e(this.productName, c2197a.productName) && AbstractC22676k.m65745e(this.analyticsProperties, c2197a.analyticsProperties) && AbstractC22676k.m65745e(this.addIntent, c2197a.addIntent) && this.isPack == c2197a.isPack && AbstractC22676k.m65745e(this.packSku, c2197a.packSku);
    }

    /* JADX INFO: renamed from: f */
    public final List<C2200d> m6952f() {
        return this.sections;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSelectedPrice() {
        return this.selectedPrice;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(this.navigationBarText.hashCode() * 31, 31, this.sections), 31, this.checkoutFooter);
        String str = this.selectedSku;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.selectedPrice;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.selectedProductKey;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.selectedVariantKey;
        int iM11821e = AbstractC3855a.m11821e(this.analyticsProperties, AbstractC11266d.m30450d((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.productName), 31);
        CartAddIntent cartAddIntent = this.addIntent;
        int iM8289b = AbstractC2875y.m8289b((iM11821e + (cartAddIntent == null ? 0 : cartAddIntent.hashCode())) * 31, 31, this.isPack);
        String str5 = this.packSku;
        return iM8289b + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.navigationBarText;
        List<C2200d> list = this.sections;
        List<C27256h> list2 = this.checkoutFooter;
        String str2 = this.selectedSku;
        String str3 = this.selectedPrice;
        String str4 = this.selectedProductKey;
        String str5 = this.selectedVariantKey;
        String str6 = this.productName;
        Map<String, String> map = this.analyticsProperties;
        CartAddIntent cartAddIntent = this.addIntent;
        boolean z4 = this.isPack;
        String str7 = this.packSku;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("PdpData(navigationBarText=", str, ", sections=", ", checkoutFooter=", list);
        AbstractC17176i.m48511m(", selectedSku=", str2, ", selectedPrice=", sbM94766o, list2);
        AbstractC11266d.m30444B(sbM94766o, str3, ", selectedProductKey=", str4, ", selectedVariantKey=");
        AbstractC11266d.m30444B(sbM94766o, str5, ", productName=", str6, ", analyticsProperties=");
        sbM94766o.append(map);
        sbM94766o.append(", addIntent=");
        sbM94766o.append(cartAddIntent);
        sbM94766o.append(", isPack=");
        return AbstractC21702c.m61139j(sbM94766o, z4, ", packSku=", str7, ")");
    }
}
