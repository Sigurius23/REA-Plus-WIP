package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import w91.C36956c;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FEBe\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bq\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#Jt\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u0010\u0010'\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-J'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b;\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b<\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b=\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b>\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bB\u0010!R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bD\u0010#¨\u0006G"}, m65681d2 = {"Lcom/whoop/design/models/items/DesignItemGridModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "", "columnWidth", "minHorizontalSpacing", "minVerticalSpacing", "minHorizontalPadding", "minVerticalPadding", "Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;", "verticalAlignment", "", "numberOfColumns", "", "items", "<init>", "(Ljava/lang/String;DDDDDLcom/whoop/design/models/items/DesignItemGridVerticalAlignment;Ljava/lang/Integer;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;DDDDDLcom/whoop/design/models/items/DesignItemGridVerticalAlignment;Ljava/lang/Integer;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()D", "component3", "component4", "component5", "component6", "component7", "()Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;", "component8", "()Ljava/lang/Integer;", "component9", "()Ljava/util/List;", "copy", "(Ljava/lang/String;DDDDDLcom/whoop/design/models/items/DesignItemGridVerticalAlignment;Ljava/lang/Integer;Ljava/util/List;)Lcom/whoop/design/models/items/DesignItemGridModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/DesignItemGridModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "D", "getColumnWidth", "getMinHorizontalSpacing", "getMinVerticalSpacing", "getMinHorizontalPadding", "getMinVerticalPadding", "Lcom/whoop/design/models/items/DesignItemGridVerticalAlignment;", "getVerticalAlignment", "Ljava/lang/Integer;", "getNumberOfColumns", "Ljava/util/List;", "getItems", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DesignItemGridModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final double columnWidth;
    private final String id;
    private final List<DesignSystemModel> items;
    private final double minHorizontalPadding;
    private final double minHorizontalSpacing;
    private final double minVerticalPadding;
    private final double minVerticalSpacing;
    private final Integer numberOfColumns;
    private final DesignItemGridVerticalAlignment verticalAlignment;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/DesignItemGridModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/DesignItemGridModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DesignItemGridModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36956c(16)), null, AbstractC30060g.m92087G(enumC23463i, new C36956c(17))};
    }

    public /* synthetic */ DesignItemGridModel(int i13, String str, double d3, double d14, double d15, double d16, double d17, DesignItemGridVerticalAlignment designItemGridVerticalAlignment, Integer num, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (259 != (i13 & 259)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 259, DesignItemGridModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.columnWidth = d3;
        if ((i13 & 4) == 0) {
            this.minHorizontalSpacing = 0.0d;
        } else {
            this.minHorizontalSpacing = d14;
        }
        if ((i13 & 8) == 0) {
            this.minVerticalSpacing = 0.0d;
        } else {
            this.minVerticalSpacing = d15;
        }
        if ((i13 & 16) == 0) {
            this.minHorizontalPadding = 0.0d;
        } else {
            this.minHorizontalPadding = d16;
        }
        if ((i13 & 32) == 0) {
            this.minVerticalPadding = 0.0d;
        } else {
            this.minVerticalPadding = d17;
        }
        if ((i13 & 64) == 0) {
            this.verticalAlignment = null;
        } else {
            this.verticalAlignment = designItemGridVerticalAlignment;
        }
        if ((i13 & 128) == 0) {
            this.numberOfColumns = null;
        } else {
            this.numberOfColumns = num;
        }
        this.items = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return DesignItemGridVerticalAlignment.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    public static final /* synthetic */ void write$Self$design_models_release(DesignItemGridModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeDoubleElement(serialDesc, 1, self.columnWidth);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || Double.compare(self.minHorizontalSpacing, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 2, self.minHorizontalSpacing);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || Double.compare(self.minVerticalSpacing, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 3, self.minVerticalSpacing);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || Double.compare(self.minHorizontalPadding, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 4, self.minHorizontalPadding);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || Double.compare(self.minVerticalPadding, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 5, self.minVerticalPadding);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.verticalAlignment != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.verticalAlignment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.numberOfColumns != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, IntSerializer.INSTANCE, self.numberOfColumns);
        }
        output.encodeSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.items);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getColumnWidth() {
        return this.columnWidth;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getMinHorizontalSpacing() {
        return this.minHorizontalSpacing;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getMinVerticalSpacing() {
        return this.minVerticalSpacing;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getMinHorizontalPadding() {
        return this.minHorizontalPadding;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getMinVerticalPadding() {
        return this.minVerticalPadding;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DesignItemGridVerticalAlignment getVerticalAlignment() {
        return this.verticalAlignment;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getNumberOfColumns() {
        return this.numberOfColumns;
    }

    public final List<DesignSystemModel> component9() {
        return this.items;
    }

    public final DesignItemGridModel copy(String id4, double columnWidth, double minHorizontalSpacing, double minVerticalSpacing, double minHorizontalPadding, double minVerticalPadding, DesignItemGridVerticalAlignment verticalAlignment, Integer numberOfColumns, List<? extends DesignSystemModel> items) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        return new DesignItemGridModel(id4, columnWidth, minHorizontalSpacing, minVerticalSpacing, minHorizontalPadding, minVerticalPadding, verticalAlignment, numberOfColumns, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DesignItemGridModel)) {
            return false;
        }
        DesignItemGridModel designItemGridModel = (DesignItemGridModel) other;
        return AbstractC22676k.m65745e(this.id, designItemGridModel.id) && Double.compare(this.columnWidth, designItemGridModel.columnWidth) == 0 && Double.compare(this.minHorizontalSpacing, designItemGridModel.minHorizontalSpacing) == 0 && Double.compare(this.minVerticalSpacing, designItemGridModel.minVerticalSpacing) == 0 && Double.compare(this.minHorizontalPadding, designItemGridModel.minHorizontalPadding) == 0 && Double.compare(this.minVerticalPadding, designItemGridModel.minVerticalPadding) == 0 && this.verticalAlignment == designItemGridModel.verticalAlignment && AbstractC22676k.m65745e(this.numberOfColumns, designItemGridModel.numberOfColumns) && AbstractC22676k.m65745e(this.items, designItemGridModel.items);
    }

    public final double getColumnWidth() {
        return this.columnWidth;
    }

    public final String getId() {
        return this.id;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final double getMinHorizontalPadding() {
        return this.minHorizontalPadding;
    }

    public final double getMinHorizontalSpacing() {
        return this.minHorizontalSpacing;
    }

    public final double getMinVerticalPadding() {
        return this.minVerticalPadding;
    }

    public final double getMinVerticalSpacing() {
        return this.minVerticalSpacing;
    }

    public final Integer getNumberOfColumns() {
        return this.numberOfColumns;
    }

    public final DesignItemGridVerticalAlignment getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public int hashCode() {
        int iM48499a = AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(this.id.hashCode() * 31, 31, this.columnWidth), 31, this.minHorizontalSpacing), 31, this.minVerticalSpacing), 31, this.minHorizontalPadding), 31, this.minVerticalPadding);
        DesignItemGridVerticalAlignment designItemGridVerticalAlignment = this.verticalAlignment;
        int iHashCode = (iM48499a + (designItemGridVerticalAlignment == null ? 0 : designItemGridVerticalAlignment.hashCode())) * 31;
        Integer num = this.numberOfColumns;
        return this.items.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        double d3 = this.columnWidth;
        double d14 = this.minHorizontalSpacing;
        double d15 = this.minVerticalSpacing;
        double d16 = this.minHorizontalPadding;
        double d17 = this.minVerticalPadding;
        DesignItemGridVerticalAlignment designItemGridVerticalAlignment = this.verticalAlignment;
        Integer num = this.numberOfColumns;
        List<DesignSystemModel> list = this.items;
        StringBuilder sb4 = new StringBuilder("DesignItemGridModel(id=");
        sb4.append(str);
        sb4.append(", columnWidth=");
        sb4.append(d3);
        AbstractC31061c.m95622B(sb4, ", minHorizontalSpacing=", d14, ", minVerticalSpacing=");
        sb4.append(d15);
        AbstractC31061c.m95622B(sb4, ", minHorizontalPadding=", d16, ", minVerticalPadding=");
        sb4.append(d17);
        sb4.append(", verticalAlignment=");
        sb4.append(designItemGridVerticalAlignment);
        sb4.append(", numberOfColumns=");
        sb4.append(num);
        sb4.append(", items=");
        sb4.append(list);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DesignItemGridModel(String id4, double d3, double d14, double d15, double d16, double d17, DesignItemGridVerticalAlignment designItemGridVerticalAlignment, Integer num, List<? extends DesignSystemModel> items) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        this.id = id4;
        this.columnWidth = d3;
        this.minHorizontalSpacing = d14;
        this.minVerticalSpacing = d15;
        this.minHorizontalPadding = d16;
        this.minVerticalPadding = d17;
        this.verticalAlignment = designItemGridVerticalAlignment;
        this.numberOfColumns = num;
        this.items = items;
    }

    public /* synthetic */ DesignItemGridModel(String str, double d3, double d14, double d15, double d16, double d17, DesignItemGridVerticalAlignment designItemGridVerticalAlignment, Integer num, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, d3, (i13 & 4) != 0 ? 0.0d : d14, (i13 & 8) != 0 ? 0.0d : d15, (i13 & 16) != 0 ? 0.0d : d16, (i13 & 32) != 0 ? 0.0d : d17, (i13 & 64) != 0 ? null : designItemGridVerticalAlignment, (i13 & 128) != 0 ? null : num, list);
    }
}
