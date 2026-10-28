package com.whoop.nativestore.pdp.domain.model;

import com.whoop.design.models.items.DividerModel;
import com.whoop.design.models.items.DividerModel$$serializer;
import com.whoop.design.models.items.ExpandableContentModel;
import com.whoop.design.models.items.ExpandableContentModel$$serializer;
import com.whoop.design.models.items.SegmentedContentModel;
import com.whoop.design.models.items.SegmentedContentModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%JR\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010%¨\u0006<"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse;", "", "", "title", "subtitle", "description", "Lcom/whoop/design/models/items/SegmentedContentModel;", "segmentedContentTile", "Lcom/whoop/design/models/items/DividerModel;", "divider", "Lcom/whoop/design/models/items/ExpandableContentModel;", "expandableContent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SegmentedContentModel;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/ExpandableContentModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SegmentedContentModel;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/ExpandableContentModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$native_store_release", "(Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/design/models/items/SegmentedContentModel;", "component5", "()Lcom/whoop/design/models/items/DividerModel;", "component6", "()Lcom/whoop/design/models/items/ExpandableContentModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SegmentedContentModel;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/ExpandableContentModel;)Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getDescription", "Lcom/whoop/design/models/items/SegmentedContentModel;", "getSegmentedContentTile", "Lcom/whoop/design/models/items/DividerModel;", "getDivider", "Lcom/whoop/design/models/items/ExpandableContentModel;", "getExpandableContent", "Companion", "$serializer", "a", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProductSizeGuideResponse {
    private final String description;
    private final DividerModel divider;
    private final ExpandableContentModel expandableContent;
    private final SegmentedContentModel segmentedContentTile;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = (ExpandableContentModel.$stable | DividerModel.$stable) | SegmentedContentModel.$stable;

    /* JADX INFO: renamed from: com.whoop.nativestore.pdp.domain.model.ProductSizeGuideResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse;", "serializer", "()Lwc3/c;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProductSizeGuideResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ProductSizeGuideResponse() {
        this((String) null, (String) null, (String) null, (SegmentedContentModel) null, (DividerModel) null, (ExpandableContentModel) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ProductSizeGuideResponse copy$default(ProductSizeGuideResponse productSizeGuideResponse, String str, String str2, String str3, SegmentedContentModel segmentedContentModel, DividerModel dividerModel, ExpandableContentModel expandableContentModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = productSizeGuideResponse.title;
        }
        if ((i13 & 2) != 0) {
            str2 = productSizeGuideResponse.subtitle;
        }
        if ((i13 & 4) != 0) {
            str3 = productSizeGuideResponse.description;
        }
        if ((i13 & 8) != 0) {
            segmentedContentModel = productSizeGuideResponse.segmentedContentTile;
        }
        if ((i13 & 16) != 0) {
            dividerModel = productSizeGuideResponse.divider;
        }
        if ((i13 & 32) != 0) {
            expandableContentModel = productSizeGuideResponse.expandableContent;
        }
        DividerModel dividerModel2 = dividerModel;
        ExpandableContentModel expandableContentModel2 = expandableContentModel;
        return productSizeGuideResponse.copy(str, str2, str3, segmentedContentModel, dividerModel2, expandableContentModel2);
    }

    public static final /* synthetic */ void write$Self$native_store_release(ProductSizeGuideResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeStringElement(serialDesc, 0, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.subtitle, "")) {
            output.encodeStringElement(serialDesc, 1, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.description, "")) {
            output.encodeStringElement(serialDesc, 2, self.description);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.segmentedContentTile != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, SegmentedContentModel$$serializer.INSTANCE, self.segmentedContentTile);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.divider != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, DividerModel$$serializer.INSTANCE, self.divider);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.expandableContent == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, ExpandableContentModel$$serializer.INSTANCE, self.expandableContent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SegmentedContentModel getSegmentedContentTile() {
        return this.segmentedContentTile;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DividerModel getDivider() {
        return this.divider;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ExpandableContentModel getExpandableContent() {
        return this.expandableContent;
    }

    public final ProductSizeGuideResponse copy(String title, String subtitle, String description, SegmentedContentModel segmentedContentTile, DividerModel divider, ExpandableContentModel expandableContent) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(description, "description");
        return new ProductSizeGuideResponse(title, subtitle, description, segmentedContentTile, divider, expandableContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductSizeGuideResponse)) {
            return false;
        }
        ProductSizeGuideResponse productSizeGuideResponse = (ProductSizeGuideResponse) other;
        return AbstractC22676k.m65745e(this.title, productSizeGuideResponse.title) && AbstractC22676k.m65745e(this.subtitle, productSizeGuideResponse.subtitle) && AbstractC22676k.m65745e(this.description, productSizeGuideResponse.description) && AbstractC22676k.m65745e(this.segmentedContentTile, productSizeGuideResponse.segmentedContentTile) && AbstractC22676k.m65745e(this.divider, productSizeGuideResponse.divider) && AbstractC22676k.m65745e(this.expandableContent, productSizeGuideResponse.expandableContent);
    }

    public final String getDescription() {
        return this.description;
    }

    public final DividerModel getDivider() {
        return this.divider;
    }

    public final ExpandableContentModel getExpandableContent() {
        return this.expandableContent;
    }

    public final SegmentedContentModel getSegmentedContentTile() {
        return this.segmentedContentTile;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.description);
        SegmentedContentModel segmentedContentModel = this.segmentedContentTile;
        int iHashCode = (iM30450d + (segmentedContentModel == null ? 0 : segmentedContentModel.hashCode())) * 31;
        DividerModel dividerModel = this.divider;
        int iHashCode2 = (iHashCode + (dividerModel == null ? 0 : dividerModel.hashCode())) * 31;
        ExpandableContentModel expandableContentModel = this.expandableContent;
        return iHashCode2 + (expandableContentModel != null ? expandableContentModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.description;
        SegmentedContentModel segmentedContentModel = this.segmentedContentTile;
        DividerModel dividerModel = this.divider;
        ExpandableContentModel expandableContentModel = this.expandableContent;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ProductSizeGuideResponse(title=", str, ", subtitle=", str2, ", description=");
        sbM32001t.append(str3);
        sbM32001t.append(", segmentedContentTile=");
        sbM32001t.append(segmentedContentModel);
        sbM32001t.append(", divider=");
        sbM32001t.append(dividerModel);
        sbM32001t.append(", expandableContent=");
        sbM32001t.append(expandableContentModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ ProductSizeGuideResponse(int i13, String str, String str2, String str3, SegmentedContentModel segmentedContentModel, DividerModel dividerModel, ExpandableContentModel expandableContentModel, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i13 & 2) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str2;
        }
        if ((i13 & 4) == 0) {
            this.description = "";
        } else {
            this.description = str3;
        }
        if ((i13 & 8) == 0) {
            this.segmentedContentTile = null;
        } else {
            this.segmentedContentTile = segmentedContentModel;
        }
        if ((i13 & 16) == 0) {
            this.divider = null;
        } else {
            this.divider = dividerModel;
        }
        if ((i13 & 32) == 0) {
            this.expandableContent = null;
        } else {
            this.expandableContent = expandableContentModel;
        }
    }

    public ProductSizeGuideResponse(String title, String subtitle, String description, SegmentedContentModel segmentedContentModel, DividerModel dividerModel, ExpandableContentModel expandableContentModel) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(description, "description");
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
        this.segmentedContentTile = segmentedContentModel;
        this.divider = dividerModel;
        this.expandableContent = expandableContentModel;
    }

    public /* synthetic */ ProductSizeGuideResponse(String str, String str2, String str3, SegmentedContentModel segmentedContentModel, DividerModel dividerModel, ExpandableContentModel expandableContentModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? null : segmentedContentModel, (i13 & 16) != 0 ? null : dividerModel, (i13 & 32) != 0 ? null : expandableContentModel);
    }
}
