package com.whoop.design.models.celebration;

import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import ty1.C34260e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001fJT\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001aJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001fR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b0\u0010\u001f¨\u00063"}, m65681d2 = {"Lcom/whoop/design/models/celebration/SlotGroupModel;", "", "", "id", "max", "", "layerPattern", "", "indicatorLayers", "wrapperLayers", "<init>", "(IILjava/lang/String;Ljava/util/List;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILjava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/celebration/SlotGroupModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "component5", "copy", "(IILjava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/whoop/design/models/celebration/SlotGroupModel;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "getMax", "Ljava/lang/String;", "getLayerPattern", "Ljava/util/List;", "getIndicatorLayers", "getWrapperLayers", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SlotGroupModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final int id;
    private final List<String> indicatorLayers;
    private final String layerPattern;
    private final int max;
    private final List<String> wrapperLayers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/celebration/SlotGroupModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/celebration/SlotGroupModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SlotGroupModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C34260e(24)), AbstractC30060g.m92087G(enumC23463i, new C34260e(25))};
    }

    public /* synthetic */ SlotGroupModel(int i13, int i14, int i15, String str, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, SlotGroupModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = i14;
        this.max = i15;
        this.layerPattern = str;
        this.indicatorLayers = list;
        this.wrapperLayers = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SlotGroupModel copy$default(SlotGroupModel slotGroupModel, int i13, int i14, String str, List list, List list2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = slotGroupModel.id;
        }
        if ((i15 & 2) != 0) {
            i14 = slotGroupModel.max;
        }
        if ((i15 & 4) != 0) {
            str = slotGroupModel.layerPattern;
        }
        if ((i15 & 8) != 0) {
            list = slotGroupModel.indicatorLayers;
        }
        if ((i15 & 16) != 0) {
            list2 = slotGroupModel.wrapperLayers;
        }
        List list3 = list2;
        String str2 = str;
        return slotGroupModel.copy(i13, i14, str2, list, list3);
    }

    public static final /* synthetic */ void write$Self$design_models_release(SlotGroupModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.id);
        output.encodeIntElement(serialDesc, 1, self.max);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.layerPattern);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.indicatorLayers);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.wrapperLayers);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLayerPattern() {
        return this.layerPattern;
    }

    public final List<String> component4() {
        return this.indicatorLayers;
    }

    public final List<String> component5() {
        return this.wrapperLayers;
    }

    public final SlotGroupModel copy(int id4, int max, String layerPattern, List<String> indicatorLayers, List<String> wrapperLayers) {
        return new SlotGroupModel(id4, max, layerPattern, indicatorLayers, wrapperLayers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotGroupModel)) {
            return false;
        }
        SlotGroupModel slotGroupModel = (SlotGroupModel) other;
        return this.id == slotGroupModel.id && this.max == slotGroupModel.max && AbstractC22676k.m65745e(this.layerPattern, slotGroupModel.layerPattern) && AbstractC22676k.m65745e(this.indicatorLayers, slotGroupModel.indicatorLayers) && AbstractC22676k.m65745e(this.wrapperLayers, slotGroupModel.wrapperLayers);
    }

    public final int getId() {
        return this.id;
    }

    public final List<String> getIndicatorLayers() {
        return this.indicatorLayers;
    }

    public final String getLayerPattern() {
        return this.layerPattern;
    }

    public final int getMax() {
        return this.max;
    }

    public final List<String> getWrapperLayers() {
        return this.wrapperLayers;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.max, Integer.hashCode(this.id) * 31, 31);
        String str = this.layerPattern;
        int iHashCode = (iM30448b + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.indicatorLayers;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.wrapperLayers;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.id;
        int i14 = this.max;
        String str = this.layerPattern;
        List<String> list = this.indicatorLayers;
        List<String> list2 = this.wrapperLayers;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "SlotGroupModel(id=", ", max=", ", layerPattern=");
        AbstractC36095b.m114694v(str, ", indicatorLayers=", ", wrapperLayers=", sbM30465s, list);
        return AbstractC3855a.m11829m(sbM30465s, list2, ")");
    }

    public SlotGroupModel(int i13, int i14, String str, List<String> list, List<String> list2) {
        this.id = i13;
        this.max = i14;
        this.layerPattern = str;
        this.indicatorLayers = list;
        this.wrapperLayers = list2;
    }
}
