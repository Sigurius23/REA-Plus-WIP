package com.whoop.nativestore.pdp.domain.model;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import te0.AbstractC33745d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;
import zi1.C40674e0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006("}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/ProductAccordionListModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "Lcom/whoop/nativestore/pdp/domain/model/ProductAccordionEntry;", "accordions", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$native_store_release", "(Lcom/whoop/nativestore/pdp/domain/model/ProductAccordionListModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/whoop/nativestore/pdp/domain/model/ProductAccordionListModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAccordions", "Companion", "$serializer", "a", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProductAccordionListModel implements DesignSystemModel {
    private final List<ProductAccordionEntry> accordions;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C40674e0(23))};

    /* JADX INFO: renamed from: com.whoop.nativestore.pdp.domain.model.ProductAccordionListModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/model/ProductAccordionListModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/nativestore/pdp/domain/model/ProductAccordionListModel;", "serializer", "()Lwc3/c;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProductAccordionListModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductAccordionListModel() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ProductAccordionEntry$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductAccordionListModel copy$default(ProductAccordionListModel productAccordionListModel, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = productAccordionListModel.accordions;
        }
        return productAccordionListModel.copy(list);
    }

    public static final /* synthetic */ void write$Self$native_store_release(ProductAccordionListModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && AbstractC22676k.m65745e(self.accordions, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.accordions);
    }

    public final List<ProductAccordionEntry> component1() {
        return this.accordions;
    }

    public final ProductAccordionListModel copy(List<ProductAccordionEntry> accordions) {
        AbstractC22676k.m65750j(accordions, "accordions");
        return new ProductAccordionListModel(accordions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ProductAccordionListModel) && AbstractC22676k.m65745e(this.accordions, ((ProductAccordionListModel) other).accordions);
    }

    public final List<ProductAccordionEntry> getAccordions() {
        return this.accordions;
    }

    public int hashCode() {
        return this.accordions.hashCode();
    }

    public String toString() {
        return AbstractC33745d.m106654m("ProductAccordionListModel(accordions=", ")", this.accordions);
    }

    public /* synthetic */ ProductAccordionListModel(int i13, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.accordions = C25271y.f99162w;
        } else {
            this.accordions = list;
        }
    }

    public ProductAccordionListModel(List<ProductAccordionEntry> accordions) {
        AbstractC22676k.m65750j(accordions, "accordions");
        this.accordions = accordions;
    }

    public /* synthetic */ ProductAccordionListModel(List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list);
    }
}
