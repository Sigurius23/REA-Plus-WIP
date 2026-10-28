package h02;

import com.whoop.nativestore.pdp.domain.model.SelectorLevel;
import com.whoop.nativestore.pdp.domain.model.SelectorType;
import com.whoop.nativestore.pdp.domain.model.SizeChart;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: h02.i0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013Jx\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0019R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b/\u0010\u0017R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b3\u0010\u0017¨\u00066"}, m65681d2 = {"Lh02/i0;", "Lm91/u;", "Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;", "level", "", "title", "Lcom/whoop/nativestore/pdp/domain/model/SelectorType;", "type", "", "Lh02/l0;", "options", "Lcom/whoop/nativestore/pdp/domain/model/SizeChart;", "sizeChart", "selectedOption", "", "variantSelectorIndex", "packItemId", "packItemProductKey", "<init>", "(Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;Lh02/l0;ILjava/lang/String;Ljava/lang/String;)V", "a", "(Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;Lh02/l0;ILjava/lang/String;Ljava/lang/String;)Lh02/i0;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;", "c", "()Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;", "b", "Ljava/lang/String;", "j", "Lcom/whoop/nativestore/pdp/domain/model/SelectorType;", "k", "()Lcom/whoop/nativestore/pdp/domain/model/SelectorType;", "d", "Ljava/util/List;", "e", "()Ljava/util/List;", "Lcom/whoop/nativestore/pdp/domain/model/SizeChart;", "i", "()Lcom/whoop/nativestore/pdp/domain/model/SizeChart;", "f", "Lh02/l0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lh02/l0;", "g", "I", "l", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16577i0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final SelectorLevel level;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final SelectorType type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C16583l0> options;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final SizeChart sizeChart;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C16583l0 selectedOption;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int variantSelectorIndex;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String packItemId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String packItemProductKey;

    public C16577i0(SelectorLevel level, String title, SelectorType type, List<C16583l0> options, SizeChart sizeChart, C16583l0 c16583l0, int i13, String str, String str2) {
        AbstractC22676k.m65750j(level, "level");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(options, "options");
        this.level = level;
        this.title = title;
        this.type = type;
        this.options = options;
        this.sizeChart = sizeChart;
        this.selectedOption = c16583l0;
        this.variantSelectorIndex = i13;
        this.packItemId = str;
        this.packItemProductKey = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C16577i0 m46991b(C16577i0 c16577i0, SelectorLevel selectorLevel, String str, SelectorType selectorType, List list, SizeChart sizeChart, C16583l0 c16583l0, int i13, String str2, String str3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            selectorLevel = c16577i0.level;
        }
        if ((i14 & 2) != 0) {
            str = c16577i0.title;
        }
        if ((i14 & 4) != 0) {
            selectorType = c16577i0.type;
        }
        if ((i14 & 8) != 0) {
            list = c16577i0.options;
        }
        if ((i14 & 16) != 0) {
            sizeChart = c16577i0.sizeChart;
        }
        if ((i14 & 32) != 0) {
            c16583l0 = c16577i0.selectedOption;
        }
        if ((i14 & 64) != 0) {
            i13 = c16577i0.variantSelectorIndex;
        }
        if ((i14 & 128) != 0) {
            str2 = c16577i0.packItemId;
        }
        if ((i14 & 256) != 0) {
            str3 = c16577i0.packItemProductKey;
        }
        String str4 = str2;
        String str5 = str3;
        C16583l0 c16583l1 = c16583l0;
        int i15 = i13;
        SizeChart sizeChart2 = sizeChart;
        SelectorType selectorType2 = selectorType;
        return c16577i0.m46992a(selectorLevel, str, selectorType2, list, sizeChart2, c16583l1, i15, str4, str5);
    }

    /* JADX INFO: renamed from: a */
    public final C16577i0 m46992a(SelectorLevel level, String title, SelectorType type, List<C16583l0> options, SizeChart sizeChart, C16583l0 selectedOption, int variantSelectorIndex, String packItemId, String packItemProductKey) {
        AbstractC22676k.m65750j(level, "level");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(options, "options");
        return new C16577i0(level, title, type, options, sizeChart, selectedOption, variantSelectorIndex, packItemId, packItemProductKey);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final SelectorLevel getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: e */
    public final List<C16583l0> m46994e() {
        return this.options;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16577i0)) {
            return false;
        }
        C16577i0 c16577i0 = (C16577i0) other;
        return this.level == c16577i0.level && AbstractC22676k.m65745e(this.title, c16577i0.title) && this.type == c16577i0.type && AbstractC22676k.m65745e(this.options, c16577i0.options) && AbstractC22676k.m65745e(this.sizeChart, c16577i0.sizeChart) && AbstractC22676k.m65745e(this.selectedOption, c16577i0.selectedOption) && this.variantSelectorIndex == c16577i0.variantSelectorIndex && AbstractC22676k.m65745e(this.packItemId, c16577i0.packItemId) && AbstractC22676k.m65745e(this.packItemProductKey, c16577i0.packItemProductKey);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPackItemId() {
        return this.packItemId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPackItemProductKey() {
        return this.packItemProductKey;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C16583l0 getSelectedOption() {
        return this.selectedOption;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b((this.type.hashCode() + AbstractC11266d.m30450d(this.level.hashCode() * 31, 31, this.title)) * 31, 31, this.options);
        SizeChart sizeChart = this.sizeChart;
        int iHashCode = (iM31983b + (sizeChart == null ? 0 : sizeChart.hashCode())) * 31;
        C16583l0 c16583l0 = this.selectedOption;
        int iM30448b = AbstractC11266d.m30448b(this.variantSelectorIndex, (iHashCode + (c16583l0 == null ? 0 : c16583l0.hashCode())) * 31, 31);
        String str = this.packItemId;
        int iHashCode2 = (iM30448b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.packItemProductKey;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final SizeChart getSizeChart() {
        return this.sizeChart;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final SelectorType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getVariantSelectorIndex() {
        return this.variantSelectorIndex;
    }

    public String toString() {
        SelectorLevel selectorLevel = this.level;
        String str = this.title;
        SelectorType selectorType = this.type;
        List<C16583l0> list = this.options;
        SizeChart sizeChart = this.sizeChart;
        C16583l0 c16583l0 = this.selectedOption;
        int i13 = this.variantSelectorIndex;
        String str2 = this.packItemId;
        String str3 = this.packItemProductKey;
        StringBuilder sb4 = new StringBuilder("ProductVariantSelectorState(level=");
        sb4.append(selectorLevel);
        sb4.append(", title=");
        sb4.append(str);
        sb4.append(", type=");
        sb4.append(selectorType);
        sb4.append(", options=");
        sb4.append(list);
        sb4.append(", sizeChart=");
        sb4.append(sizeChart);
        sb4.append(", selectedOption=");
        sb4.append(c16583l0);
        sb4.append(", variantSelectorIndex=");
        AbstractC11895b.m31979B(i13, ", packItemId=", str2, ", packItemProductKey=", sb4);
        return AbstractC25012a.m73376i(str3, ")", sb4);
    }
}
