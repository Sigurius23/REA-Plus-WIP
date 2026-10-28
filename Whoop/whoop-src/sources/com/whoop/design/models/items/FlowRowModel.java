package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36957d;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B/\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001f\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001d¨\u00060"}, m65681d2 = {"Lcom/whoop/design/models/items/FlowRowModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "items", "", "verticalAlignment", "Lcom/whoop/design/models/items/FlowRowHorizontalSpacing;", "horizontalSpacing", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/FlowRowHorizontalSpacing;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/FlowRowHorizontalSpacing;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/FlowRowModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/whoop/design/models/items/FlowRowHorizontalSpacing;", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/FlowRowHorizontalSpacing;)Lcom/whoop/design/models/items/FlowRowModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "Ljava/lang/String;", "getVerticalAlignment", "Lcom/whoop/design/models/items/FlowRowHorizontalSpacing;", "getHorizontalSpacing", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FlowRowModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final FlowRowHorizontalSpacing horizontalSpacing;
    private final List<DesignSystemModel> items;
    private final String verticalAlignment;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/FlowRowModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/FlowRowModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FlowRowModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C36957d(25)), null, AbstractC30060g.m92087G(enumC23463i, new C36957d(26))};
    }

    public /* synthetic */ FlowRowModel(int i13, List list, String str, FlowRowHorizontalSpacing flowRowHorizontalSpacing, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, FlowRowModel$$serializer.INSTANCE.getDescriptor());
        }
        this.items = list;
        if ((i13 & 2) == 0) {
            this.verticalAlignment = null;
        } else {
            this.verticalAlignment = str;
        }
        if ((i13 & 4) == 0) {
            this.horizontalSpacing = null;
        } else {
            this.horizontalSpacing = flowRowHorizontalSpacing;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return FlowRowHorizontalSpacing.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlowRowModel copy$default(FlowRowModel flowRowModel, List list, String str, FlowRowHorizontalSpacing flowRowHorizontalSpacing, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = flowRowModel.items;
        }
        if ((i13 & 2) != 0) {
            str = flowRowModel.verticalAlignment;
        }
        if ((i13 & 4) != 0) {
            flowRowHorizontalSpacing = flowRowModel.horizontalSpacing;
        }
        return flowRowModel.copy(list, str, flowRowHorizontalSpacing);
    }

    public static final /* synthetic */ void write$Self$design_models_release(FlowRowModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.items);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.verticalAlignment != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.verticalAlignment);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.horizontalSpacing == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.horizontalSpacing);
    }

    public final List<DesignSystemModel> component1() {
        return this.items;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVerticalAlignment() {
        return this.verticalAlignment;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FlowRowHorizontalSpacing getHorizontalSpacing() {
        return this.horizontalSpacing;
    }

    public final FlowRowModel copy(List<? extends DesignSystemModel> items, String verticalAlignment, FlowRowHorizontalSpacing horizontalSpacing) {
        return new FlowRowModel(items, verticalAlignment, horizontalSpacing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlowRowModel)) {
            return false;
        }
        FlowRowModel flowRowModel = (FlowRowModel) other;
        return AbstractC22676k.m65745e(this.items, flowRowModel.items) && AbstractC22676k.m65745e(this.verticalAlignment, flowRowModel.verticalAlignment) && this.horizontalSpacing == flowRowModel.horizontalSpacing;
    }

    public final FlowRowHorizontalSpacing getHorizontalSpacing() {
        return this.horizontalSpacing;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final String getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public int hashCode() {
        List<DesignSystemModel> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.verticalAlignment;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        FlowRowHorizontalSpacing flowRowHorizontalSpacing = this.horizontalSpacing;
        return iHashCode2 + (flowRowHorizontalSpacing != null ? flowRowHorizontalSpacing.hashCode() : 0);
    }

    public String toString() {
        List<DesignSystemModel> list = this.items;
        String str = this.verticalAlignment;
        FlowRowHorizontalSpacing flowRowHorizontalSpacing = this.horizontalSpacing;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("FlowRowModel(items=", ", verticalAlignment=", str, ", horizontalSpacing=", list);
        sbM79507k.append(flowRowHorizontalSpacing);
        sbM79507k.append(")");
        return sbM79507k.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlowRowModel(List<? extends DesignSystemModel> list, String str, FlowRowHorizontalSpacing flowRowHorizontalSpacing) {
        this.items = list;
        this.verticalAlignment = str;
        this.horizontalSpacing = flowRowHorizontalSpacing;
    }

    public /* synthetic */ FlowRowModel(List list, String str, FlowRowHorizontalSpacing flowRowHorizontalSpacing, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : flowRowHorizontalSpacing);
    }
}
