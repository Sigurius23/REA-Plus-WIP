package xz1;

import c13.AbstractC3855a;
import com.whoop.nativestore.pdp.domain.model.VariantOption;
import java.util.Map;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xz1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0016\u0010\u0010R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b \u0010#¨\u0006$"}, m65681d2 = {"Lxz1/a;", "", "", "packItemId", "selectedProductKey", "", "", "selectedVariantOptions", "Lcom/whoop/nativestore/pdp/domain/model/VariantOption;", "selectedVariant", "selectedSku", "", "isInStock", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/nativestore/pdp/domain/model/VariantOption;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPackItemId", "b", "c", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "Lcom/whoop/nativestore/pdp/domain/model/VariantOption;", "()Lcom/whoop/nativestore/pdp/domain/model/VariantOption;", "e", "f", "Z", "()Z", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38756a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String packItemId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String selectedProductKey;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Map<Integer, String> selectedVariantOptions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final VariantOption selectedVariant;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String selectedSku;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isInStock;

    public C38756a(String packItemId, String selectedProductKey, Map<Integer, String> selectedVariantOptions, VariantOption variantOption, String str, boolean z4) {
        AbstractC22676k.m65750j(packItemId, "packItemId");
        AbstractC22676k.m65750j(selectedProductKey, "selectedProductKey");
        AbstractC22676k.m65750j(selectedVariantOptions, "selectedVariantOptions");
        this.packItemId = packItemId;
        this.selectedProductKey = selectedProductKey;
        this.selectedVariantOptions = selectedVariantOptions;
        this.selectedVariant = variantOption;
        this.selectedSku = str;
        this.isInStock = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getSelectedProductKey() {
        return this.selectedProductKey;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSelectedSku() {
        return this.selectedSku;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final VariantOption getSelectedVariant() {
        return this.selectedVariant;
    }

    /* JADX INFO: renamed from: d */
    public final Map<Integer, String> m124227d() {
        return this.selectedVariantOptions;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsInStock() {
        return this.isInStock;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38756a)) {
            return false;
        }
        C38756a c38756a = (C38756a) other;
        return AbstractC22676k.m65745e(this.packItemId, c38756a.packItemId) && AbstractC22676k.m65745e(this.selectedProductKey, c38756a.selectedProductKey) && AbstractC22676k.m65745e(this.selectedVariantOptions, c38756a.selectedVariantOptions) && AbstractC22676k.m65745e(this.selectedVariant, c38756a.selectedVariant) && AbstractC22676k.m65745e(this.selectedSku, c38756a.selectedSku) && this.isInStock == c38756a.isInStock;
    }

    public int hashCode() {
        int iM11821e = AbstractC3855a.m11821e(this.selectedVariantOptions, AbstractC11266d.m30450d(this.packItemId.hashCode() * 31, 31, this.selectedProductKey), 31);
        VariantOption variantOption = this.selectedVariant;
        int iHashCode = (iM11821e + (variantOption == null ? 0 : variantOption.hashCode())) * 31;
        String str = this.selectedSku;
        return Boolean.hashCode(this.isInStock) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.packItemId;
        String str2 = this.selectedProductKey;
        Map<Integer, String> map = this.selectedVariantOptions;
        VariantOption variantOption = this.selectedVariant;
        String str3 = this.selectedSku;
        boolean z4 = this.isInStock;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PackItemSelection(packItemId=", str, ", selectedProductKey=", str2, ", selectedVariantOptions=");
        sbM32001t.append(map);
        sbM32001t.append(", selectedVariant=");
        sbM32001t.append(variantOption);
        sbM32001t.append(", selectedSku=");
        return AbstractC21702c.m61137h(sbM32001t, str3, ", isInStock=", z4, ")");
    }
}
