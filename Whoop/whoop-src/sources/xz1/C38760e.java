package xz1;

import c13.AbstractC3855a;
import com.whoop.nativestore.pdp.domain.model.VariantOption;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import m83.C25272z;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: xz1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012 \b\u0002\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00060\u0006¢\u0006\u0004\b\u0013\u0010\u0014J°\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042 \b\u0002\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00060\u0006HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0018R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b/\u0010\u0018R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b+\u0010\u0018R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\u00068\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b)\u0010(R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b%\u0010\u0018R/\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00060\u00068\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b0\u0010(¨\u00061"}, m65681d2 = {"Lxz1/e;", "", "Lxz1/d;", "state", "", "selectedProductKey", "", "", "selectedVariantOptions", "selectedVariantKey", "Lcom/whoop/nativestore/pdp/domain/model/VariantOption;", "selectedVariant", "selectedSku", "selectedPrice", "Lxz1/a;", "packSelections", "currentWywTagId", "Lxz1/k;", "wywSelections", "<init>", "(Lxz1/d;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/VariantOption;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V", "a", "(Lxz1/d;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/VariantOption;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)Lxz1/e;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lxz1/d;", "k", "()Lxz1/d;", "b", "Ljava/lang/String;", "f", "c", "Ljava/util/Map;", "j", "()Ljava/util/Map;", "d", "i", "e", "Lcom/whoop/nativestore/pdp/domain/model/VariantOption;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/nativestore/pdp/domain/model/VariantOption;", "g", "l", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38760e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC38759d state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String selectedProductKey;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Map<Integer, String> selectedVariantOptions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String selectedVariantKey;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final VariantOption selectedVariant;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String selectedSku;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String selectedPrice;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Map<String, C38756a> packSelections;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String currentWywTagId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Map<String, Map<String, C38766k>> wywSelections;

    /* JADX WARN: Multi-variable type inference failed */
    public C38760e(AbstractC38759d state, String str, Map<Integer, String> selectedVariantOptions, String str2, VariantOption variantOption, String str3, String str4, Map<String, C38756a> packSelections, String str5, Map<String, ? extends Map<String, C38766k>> wywSelections) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(selectedVariantOptions, "selectedVariantOptions");
        AbstractC22676k.m65750j(packSelections, "packSelections");
        AbstractC22676k.m65750j(wywSelections, "wywSelections");
        this.state = state;
        this.selectedProductKey = str;
        this.selectedVariantOptions = selectedVariantOptions;
        this.selectedVariantKey = str2;
        this.selectedVariant = variantOption;
        this.selectedSku = str3;
        this.selectedPrice = str4;
        this.packSelections = packSelections;
        this.currentWywTagId = str5;
        this.wywSelections = wywSelections;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C38760e m124242b(C38760e c38760e, AbstractC38759d abstractC38759d, String str, Map map, String str2, VariantOption variantOption, String str3, String str4, Map map2, String str5, Map map3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            abstractC38759d = c38760e.state;
        }
        if ((i13 & 2) != 0) {
            str = c38760e.selectedProductKey;
        }
        if ((i13 & 4) != 0) {
            map = c38760e.selectedVariantOptions;
        }
        if ((i13 & 8) != 0) {
            str2 = c38760e.selectedVariantKey;
        }
        if ((i13 & 16) != 0) {
            variantOption = c38760e.selectedVariant;
        }
        if ((i13 & 32) != 0) {
            str3 = c38760e.selectedSku;
        }
        if ((i13 & 64) != 0) {
            str4 = c38760e.selectedPrice;
        }
        if ((i13 & 128) != 0) {
            map2 = c38760e.packSelections;
        }
        if ((i13 & 256) != 0) {
            str5 = c38760e.currentWywTagId;
        }
        if ((i13 & 512) != 0) {
            map3 = c38760e.wywSelections;
        }
        String str6 = str5;
        Map map4 = map3;
        String str7 = str4;
        Map map5 = map2;
        VariantOption variantOption2 = variantOption;
        String str8 = str3;
        return c38760e.m124243a(abstractC38759d, str, map, str2, variantOption2, str8, str7, map5, str6, map4);
    }

    /* JADX INFO: renamed from: a */
    public final C38760e m124243a(AbstractC38759d state, String selectedProductKey, Map<Integer, String> selectedVariantOptions, String selectedVariantKey, VariantOption selectedVariant, String selectedSku, String selectedPrice, Map<String, C38756a> packSelections, String currentWywTagId, Map<String, ? extends Map<String, C38766k>> wywSelections) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(selectedVariantOptions, "selectedVariantOptions");
        AbstractC22676k.m65750j(packSelections, "packSelections");
        AbstractC22676k.m65750j(wywSelections, "wywSelections");
        return new C38760e(state, selectedProductKey, selectedVariantOptions, selectedVariantKey, selectedVariant, selectedSku, selectedPrice, packSelections, currentWywTagId, wywSelections);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCurrentWywTagId() {
        return this.currentWywTagId;
    }

    /* JADX INFO: renamed from: d */
    public final Map<String, C38756a> m124245d() {
        return this.packSelections;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSelectedPrice() {
        return this.selectedPrice;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38760e)) {
            return false;
        }
        C38760e c38760e = (C38760e) other;
        return AbstractC22676k.m65745e(this.state, c38760e.state) && AbstractC22676k.m65745e(this.selectedProductKey, c38760e.selectedProductKey) && AbstractC22676k.m65745e(this.selectedVariantOptions, c38760e.selectedVariantOptions) && AbstractC22676k.m65745e(this.selectedVariantKey, c38760e.selectedVariantKey) && AbstractC22676k.m65745e(this.selectedVariant, c38760e.selectedVariant) && AbstractC22676k.m65745e(this.selectedSku, c38760e.selectedSku) && AbstractC22676k.m65745e(this.selectedPrice, c38760e.selectedPrice) && AbstractC22676k.m65745e(this.packSelections, c38760e.packSelections) && AbstractC22676k.m65745e(this.currentWywTagId, c38760e.currentWywTagId) && AbstractC22676k.m65745e(this.wywSelections, c38760e.wywSelections);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSelectedProductKey() {
        return this.selectedProductKey;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSelectedSku() {
        return this.selectedSku;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final VariantOption getSelectedVariant() {
        return this.selectedVariant;
    }

    public int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        String str = this.selectedProductKey;
        int iM11821e = AbstractC3855a.m11821e(this.selectedVariantOptions, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.selectedVariantKey;
        int iHashCode2 = (iM11821e + (str2 == null ? 0 : str2.hashCode())) * 31;
        VariantOption variantOption = this.selectedVariant;
        int iHashCode3 = (iHashCode2 + (variantOption == null ? 0 : variantOption.hashCode())) * 31;
        String str3 = this.selectedSku;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.selectedPrice;
        int iM11821e2 = AbstractC3855a.m11821e(this.packSelections, (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        String str5 = this.currentWywTagId;
        return this.wywSelections.hashCode() + ((iM11821e2 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSelectedVariantKey() {
        return this.selectedVariantKey;
    }

    /* JADX INFO: renamed from: j */
    public final Map<Integer, String> m124251j() {
        return this.selectedVariantOptions;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final AbstractC38759d getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: l */
    public final Map<String, Map<String, C38766k>> m124253l() {
        return this.wywSelections;
    }

    public String toString() {
        AbstractC38759d abstractC38759d = this.state;
        String str = this.selectedProductKey;
        Map<Integer, String> map = this.selectedVariantOptions;
        String str2 = this.selectedVariantKey;
        VariantOption variantOption = this.selectedVariant;
        String str3 = this.selectedSku;
        String str4 = this.selectedPrice;
        Map<String, C38756a> map2 = this.packSelections;
        String str5 = this.currentWywTagId;
        Map<String, Map<String, C38766k>> map3 = this.wywSelections;
        StringBuilder sb4 = new StringBuilder("PdpDomainResultState(state=");
        sb4.append(abstractC38759d);
        sb4.append(", selectedProductKey=");
        sb4.append(str);
        sb4.append(", selectedVariantOptions=");
        sb4.append(map);
        sb4.append(", selectedVariantKey=");
        sb4.append(str2);
        sb4.append(", selectedVariant=");
        sb4.append(variantOption);
        sb4.append(", selectedSku=");
        sb4.append(str3);
        sb4.append(", selectedPrice=");
        AbstractC36095b.m114695w(sb4, str4, ", packSelections=", map2, ", currentWywTagId=");
        return AbstractC30007c.m91842l(sb4, str5, ", wywSelections=", map3, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C38760e(AbstractC38759d abstractC38759d, String str, Map map, String str2, VariantOption variantOption, String str3, String str4, Map map2, String str5, Map map3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        abstractC38759d = (i13 & 1) != 0 ? AbstractC38759d.c.f166805a : abstractC38759d;
        str = (i13 & 2) != 0 ? null : str;
        int i14 = i13 & 4;
        C25272z c25272z = C25272z.f99163w;
        this(abstractC38759d, str, i14 != 0 ? c25272z : map, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : variantOption, (i13 & 32) != 0 ? null : str3, (i13 & 64) != 0 ? null : str4, (i13 & 128) != 0 ? c25272z : map2, (i13 & 256) != 0 ? null : str5, (i13 & 512) != 0 ? c25272z : map3);
    }
}
