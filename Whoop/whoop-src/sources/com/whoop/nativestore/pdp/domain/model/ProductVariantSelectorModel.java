package com.whoop.nativestore.pdp.domain.model;

import androidx.core.app.FrameMetricsAggregator;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;
import zz1.C41253a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KLBo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013By\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\u001bJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010\u001bJx\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010\u001bJ\u0010\u0010+\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b+\u0010%J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\b?\u0010\u001dR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bA\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bC\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bE\u0010#R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\bG\u0010%R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\bH\u0010\u001bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\bI\u0010\u001b¨\u0006M"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;", "level", "", "title", "Lcom/whoop/nativestore/pdp/domain/model/SelectorType;", "type", "", "Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;", "options", "Lcom/whoop/nativestore/pdp/domain/model/SizeChart;", "sizeChart", "selectedOption", "", "variantSelectorIndex", "packItemId", "packItemProductKey", "<init>", "(Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;ILjava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/whoop/nativestore/pdp/domain/model/SelectorType;", "component4", "()Ljava/util/List;", "component5", "()Lcom/whoop/nativestore/pdp/domain/model/SizeChart;", "component6", "()Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;", "component7", "()I", "component8", "component9", "copy", "(Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;ILjava/lang/String;Ljava/lang/String;)Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$native_store_release", "(Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;", "getLevel", "Ljava/lang/String;", "getTitle", "Lcom/whoop/nativestore/pdp/domain/model/SelectorType;", "getType", "Ljava/util/List;", "getOptions", "Lcom/whoop/nativestore/pdp/domain/model/SizeChart;", "getSizeChart", "Lcom/whoop/nativestore/pdp/domain/model/SelectorOption;", "getSelectedOption", "I", "getVariantSelectorIndex", "getPackItemId", "getPackItemProductKey", "Companion", "$serializer", "a", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProductVariantSelectorModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final SelectorLevel level;
    private final List<SelectorOption> options;
    private final String packItemId;
    private final String packItemProductKey;
    private final SelectorOption selectedOption;
    private final SizeChart sizeChart;
    private final String title;
    private final SelectorType type;
    private final int variantSelectorIndex;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.nativestore.pdp.domain.model.ProductVariantSelectorModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/nativestore/pdp/domain/model/ProductVariantSelectorModel;", "serializer", "()Lwc3/c;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProductVariantSelectorModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C41253a(3)), null, AbstractC30060g.m92087G(enumC23463i, new C41253a(4)), AbstractC30060g.m92087G(enumC23463i, new C41253a(5)), null, null, null, null, null};
    }

    public ProductVariantSelectorModel() {
        this((SelectorLevel) null, (String) null, (SelectorType) null, (List) null, (SizeChart) null, (SelectorOption) null, 0, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return SelectorLevel.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return SelectorType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(SelectorOption$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductVariantSelectorModel copy$default(ProductVariantSelectorModel productVariantSelectorModel, SelectorLevel selectorLevel, String str, SelectorType selectorType, List list, SizeChart sizeChart, SelectorOption selectorOption, int i13, String str2, String str3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            selectorLevel = productVariantSelectorModel.level;
        }
        if ((i14 & 2) != 0) {
            str = productVariantSelectorModel.title;
        }
        if ((i14 & 4) != 0) {
            selectorType = productVariantSelectorModel.type;
        }
        if ((i14 & 8) != 0) {
            list = productVariantSelectorModel.options;
        }
        if ((i14 & 16) != 0) {
            sizeChart = productVariantSelectorModel.sizeChart;
        }
        if ((i14 & 32) != 0) {
            selectorOption = productVariantSelectorModel.selectedOption;
        }
        if ((i14 & 64) != 0) {
            i13 = productVariantSelectorModel.variantSelectorIndex;
        }
        if ((i14 & 128) != 0) {
            str2 = productVariantSelectorModel.packItemId;
        }
        if ((i14 & 256) != 0) {
            str3 = productVariantSelectorModel.packItemProductKey;
        }
        String str4 = str2;
        String str5 = str3;
        SelectorOption selectorOption2 = selectorOption;
        int i15 = i13;
        SizeChart sizeChart2 = sizeChart;
        SelectorType selectorType2 = selectorType;
        return productVariantSelectorModel.copy(selectorLevel, str, selectorType2, list, sizeChart2, selectorOption2, i15, str4, str5);
    }

    public static final /* synthetic */ void write$Self$native_store_release(ProductVariantSelectorModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.level != SelectorLevel.PRODUCT) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.level);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeStringElement(serialDesc, 1, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.type != SelectorType.TEXT) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.type);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.options, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.options);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.sizeChart != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, SizeChart$$serializer.INSTANCE, self.sizeChart);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.selectedOption != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, SelectorOption$$serializer.INSTANCE, self.selectedOption);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.variantSelectorIndex != 0) {
            output.encodeIntElement(serialDesc, 6, self.variantSelectorIndex);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.packItemId != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.packItemId);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.packItemProductKey == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.packItemProductKey);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SelectorLevel getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SelectorType getType() {
        return this.type;
    }

    public final List<SelectorOption> component4() {
        return this.options;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SizeChart getSizeChart() {
        return this.sizeChart;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SelectorOption getSelectedOption() {
        return this.selectedOption;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getVariantSelectorIndex() {
        return this.variantSelectorIndex;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPackItemId() {
        return this.packItemId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPackItemProductKey() {
        return this.packItemProductKey;
    }

    public final ProductVariantSelectorModel copy(SelectorLevel level, String title, SelectorType type, List<SelectorOption> options, SizeChart sizeChart, SelectorOption selectedOption, int variantSelectorIndex, String packItemId, String packItemProductKey) {
        AbstractC22676k.m65750j(level, "level");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(options, "options");
        return new ProductVariantSelectorModel(level, title, type, options, sizeChart, selectedOption, variantSelectorIndex, packItemId, packItemProductKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductVariantSelectorModel)) {
            return false;
        }
        ProductVariantSelectorModel productVariantSelectorModel = (ProductVariantSelectorModel) other;
        return this.level == productVariantSelectorModel.level && AbstractC22676k.m65745e(this.title, productVariantSelectorModel.title) && this.type == productVariantSelectorModel.type && AbstractC22676k.m65745e(this.options, productVariantSelectorModel.options) && AbstractC22676k.m65745e(this.sizeChart, productVariantSelectorModel.sizeChart) && AbstractC22676k.m65745e(this.selectedOption, productVariantSelectorModel.selectedOption) && this.variantSelectorIndex == productVariantSelectorModel.variantSelectorIndex && AbstractC22676k.m65745e(this.packItemId, productVariantSelectorModel.packItemId) && AbstractC22676k.m65745e(this.packItemProductKey, productVariantSelectorModel.packItemProductKey);
    }

    public final SelectorLevel getLevel() {
        return this.level;
    }

    public final List<SelectorOption> getOptions() {
        return this.options;
    }

    public final String getPackItemId() {
        return this.packItemId;
    }

    public final String getPackItemProductKey() {
        return this.packItemProductKey;
    }

    public final SelectorOption getSelectedOption() {
        return this.selectedOption;
    }

    public final SizeChart getSizeChart() {
        return this.sizeChart;
    }

    public final String getTitle() {
        return this.title;
    }

    public final SelectorType getType() {
        return this.type;
    }

    public final int getVariantSelectorIndex() {
        return this.variantSelectorIndex;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b((this.type.hashCode() + AbstractC11266d.m30450d(this.level.hashCode() * 31, 31, this.title)) * 31, 31, this.options);
        SizeChart sizeChart = this.sizeChart;
        int iHashCode = (iM31983b + (sizeChart == null ? 0 : sizeChart.hashCode())) * 31;
        SelectorOption selectorOption = this.selectedOption;
        int iM30448b = AbstractC11266d.m30448b(this.variantSelectorIndex, (iHashCode + (selectorOption == null ? 0 : selectorOption.hashCode())) * 31, 31);
        String str = this.packItemId;
        int iHashCode2 = (iM30448b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.packItemProductKey;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        SelectorLevel selectorLevel = this.level;
        String str = this.title;
        SelectorType selectorType = this.type;
        List<SelectorOption> list = this.options;
        SizeChart sizeChart = this.sizeChart;
        SelectorOption selectorOption = this.selectedOption;
        int i13 = this.variantSelectorIndex;
        String str2 = this.packItemId;
        String str3 = this.packItemProductKey;
        StringBuilder sb4 = new StringBuilder("ProductVariantSelectorModel(level=");
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
        sb4.append(selectorOption);
        sb4.append(", variantSelectorIndex=");
        AbstractC11895b.m31979B(i13, ", packItemId=", str2, ", packItemProductKey=", sb4);
        return AbstractC25012a.m73376i(str3, ")", sb4);
    }

    public /* synthetic */ ProductVariantSelectorModel(int i13, SelectorLevel selectorLevel, String str, SelectorType selectorType, List list, SizeChart sizeChart, SelectorOption selectorOption, int i14, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.level = (i13 & 1) == 0 ? SelectorLevel.PRODUCT : selectorLevel;
        if ((i13 & 2) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i13 & 4) == 0) {
            this.type = SelectorType.TEXT;
        } else {
            this.type = selectorType;
        }
        if ((i13 & 8) == 0) {
            this.options = C25271y.f99162w;
        } else {
            this.options = list;
        }
        if ((i13 & 16) == 0) {
            this.sizeChart = null;
        } else {
            this.sizeChart = sizeChart;
        }
        if ((i13 & 32) == 0) {
            this.selectedOption = null;
        } else {
            this.selectedOption = selectorOption;
        }
        if ((i13 & 64) == 0) {
            this.variantSelectorIndex = 0;
        } else {
            this.variantSelectorIndex = i14;
        }
        if ((i13 & 128) == 0) {
            this.packItemId = null;
        } else {
            this.packItemId = str2;
        }
        if ((i13 & 256) == 0) {
            this.packItemProductKey = null;
        } else {
            this.packItemProductKey = str3;
        }
    }

    public ProductVariantSelectorModel(SelectorLevel level, String title, SelectorType type, List<SelectorOption> options, SizeChart sizeChart, SelectorOption selectorOption, int i13, String str, String str2) {
        AbstractC22676k.m65750j(level, "level");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(options, "options");
        this.level = level;
        this.title = title;
        this.type = type;
        this.options = options;
        this.sizeChart = sizeChart;
        this.selectedOption = selectorOption;
        this.variantSelectorIndex = i13;
        this.packItemId = str;
        this.packItemProductKey = str2;
    }

    public /* synthetic */ ProductVariantSelectorModel(SelectorLevel selectorLevel, String str, SelectorType selectorType, List list, SizeChart sizeChart, SelectorOption selectorOption, int i13, String str2, String str3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? SelectorLevel.PRODUCT : selectorLevel, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? SelectorType.TEXT : selectorType, (i14 & 8) != 0 ? C25271y.f99162w : list, (i14 & 16) != 0 ? null : sizeChart, (i14 & 32) != 0 ? null : selectorOption, (i14 & 64) != 0 ? 0 : i13, (i14 & 128) != 0 ? null : str2, (i14 & 256) != 0 ? null : str3);
    }
}
