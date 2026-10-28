package com.whoop.design.models.items.heightweight;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.design.models.items.heightpicker.HeightPickerModel;
import com.whoop.design.models.items.heightpicker.HeightPickerModel$$serializer;
import com.whoop.design.models.items.weightpicker.WeightPickerModel;
import com.whoop.design.models.items.weightpicker.WeightPickerModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import u91.C34656a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0002LKBA\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eB\u007f\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0011\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\r\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010#\u001a\u00020\u00002\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020!0\u0011H\u0016¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b-\u0010,JP\u0010.\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b0\u0010,J\u0010\u00101\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b5\u00106R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b?\u0010,R0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DRE\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`E¢\u0006\f\bF\u0012\b\bG\u0012\u0004\b\t0H8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010@\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010D¨\u0006M"}, m65681d2 = {"Lcom/whoop/design/models/items/heightweight/HeightWeightModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "Lcom/whoop/design/models/DesignSystemModel;", "", "Lcom/whoop/design/models/items/heightweight/SegmentedControlDisplayModel;", "segmentedControl", "Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;", "heightPicker", "Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;", "weightPicker", "", "stateUpdateUnitKey", "unitType", "<init>", "(Ljava/util/List;Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/heightweight/HeightWeightModel;Lzc3/c;Lyc3/g;)V", "write$Self", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/items/heightweight/HeightWeightModel;", "component1", "()Ljava/util/List;", "component2", "()Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;", "component3", "()Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;", "component4", "()Ljava/lang/String;", "component5", "copy", "(Ljava/util/List;Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/heightweight/HeightWeightModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSegmentedControl", "Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;", "getHeightPicker", "Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;", "getWeightPicker", "Ljava/lang/String;", "getStateUpdateUnitKey", "getUnitType", "Ljava/util/Map;", "getBindings", "()Ljava/util/Map;", "setBindings", "(Ljava/util/Map;)V", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HeightWeightModel implements WithGeneratedBindings, DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final HeightPickerModel heightPicker;
    private final List<SegmentedControlDisplayModel> segmentedControl;
    private final String stateUpdateUnitKey;
    private final String unitType;
    private final WeightPickerModel weightPicker;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/heightweight/HeightWeightModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/heightweight/HeightWeightModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HeightWeightModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C34656a(3)), null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C34656a(4)), null};
    }

    public /* synthetic */ HeightWeightModel(int i13, List list, HeightPickerModel heightPickerModel, WeightPickerModel weightPickerModel, String str, String str2, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (14 != (i13 & 14)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 14, HeightWeightModel$$serializer.INSTANCE.getDescriptor());
        }
        this.segmentedControl = (i13 & 1) == 0 ? C25271y.f99162w : list;
        this.heightPicker = heightPickerModel;
        this.weightPicker = weightPickerModel;
        this.stateUpdateUnitKey = str;
        if ((i13 & 16) == 0) {
            this.unitType = null;
        } else {
            this.unitType = str2;
        }
        if ((i13 & 32) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 64) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SegmentedControlDisplayModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeightWeightModel copy$default(HeightWeightModel heightWeightModel, List list, HeightPickerModel heightPickerModel, WeightPickerModel weightPickerModel, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = heightWeightModel.segmentedControl;
        }
        if ((i13 & 2) != 0) {
            heightPickerModel = heightWeightModel.heightPicker;
        }
        if ((i13 & 4) != 0) {
            weightPickerModel = heightWeightModel.weightPicker;
        }
        if ((i13 & 8) != 0) {
            str = heightWeightModel.stateUpdateUnitKey;
        }
        if ((i13 & 16) != 0) {
            str2 = heightWeightModel.unitType;
        }
        String str3 = str2;
        WeightPickerModel weightPickerModel2 = weightPickerModel;
        return heightWeightModel.copy(list, heightPickerModel, weightPickerModel2, str, str3);
    }

    public static final /* synthetic */ void write$Self$design_models_release(HeightWeightModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.segmentedControl, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.segmentedControl);
        }
        output.encodeNullableSerializableElement(serialDesc, 1, HeightPickerModel$$serializer.INSTANCE, self.heightPicker);
        output.encodeNullableSerializableElement(serialDesc, 2, WeightPickerModel$$serializer.INSTANCE, self.weightPicker);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.stateUpdateUnitKey);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.unitType != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.unitType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public /* bridge */ /* synthetic */ WithGeneratedBindings bind(Map map) {
        return bind((Map<String, ? extends Object>) map);
    }

    public final List<SegmentedControlDisplayModel> component1() {
        return this.segmentedControl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HeightPickerModel getHeightPicker() {
        return this.heightPicker;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final WeightPickerModel getWeightPicker() {
        return this.weightPicker;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStateUpdateUnitKey() {
        return this.stateUpdateUnitKey;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUnitType() {
        return this.unitType;
    }

    public final HeightWeightModel copy(List<SegmentedControlDisplayModel> segmentedControl, HeightPickerModel heightPicker, WeightPickerModel weightPicker, String stateUpdateUnitKey, String unitType) {
        AbstractC22676k.m65750j(segmentedControl, "segmentedControl");
        return new HeightWeightModel(segmentedControl, heightPicker, weightPicker, stateUpdateUnitKey, unitType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeightWeightModel)) {
            return false;
        }
        HeightWeightModel heightWeightModel = (HeightWeightModel) other;
        return AbstractC22676k.m65745e(this.segmentedControl, heightWeightModel.segmentedControl) && AbstractC22676k.m65745e(this.heightPicker, heightWeightModel.heightPicker) && AbstractC22676k.m65745e(this.weightPicker, heightWeightModel.weightPicker) && AbstractC22676k.m65745e(this.stateUpdateUnitKey, heightWeightModel.stateUpdateUnitKey) && AbstractC22676k.m65745e(this.unitType, heightWeightModel.unitType);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final HeightPickerModel getHeightPicker() {
        return this.heightPicker;
    }

    public final List<SegmentedControlDisplayModel> getSegmentedControl() {
        return this.segmentedControl;
    }

    public final String getStateUpdateUnitKey() {
        return this.stateUpdateUnitKey;
    }

    public final String getUnitType() {
        return this.unitType;
    }

    public final WeightPickerModel getWeightPicker() {
        return this.weightPicker;
    }

    public int hashCode() {
        int iHashCode = this.segmentedControl.hashCode() * 31;
        HeightPickerModel heightPickerModel = this.heightPicker;
        int iHashCode2 = (iHashCode + (heightPickerModel == null ? 0 : heightPickerModel.hashCode())) * 31;
        WeightPickerModel weightPickerModel = this.weightPicker;
        int iHashCode3 = (iHashCode2 + (weightPickerModel == null ? 0 : weightPickerModel.hashCode())) * 31;
        String str = this.stateUpdateUnitKey;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.unitType;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setAggregateBindings(Map<String, AggregateBinding> map) {
        this.aggregateBindings = map;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setBindings(Map<String, String> map) {
        this.bindings = map;
    }

    public String toString() {
        List<SegmentedControlDisplayModel> list = this.segmentedControl;
        HeightPickerModel heightPickerModel = this.heightPicker;
        WeightPickerModel weightPickerModel = this.weightPicker;
        String str = this.stateUpdateUnitKey;
        String str2 = this.unitType;
        StringBuilder sb4 = new StringBuilder("HeightWeightModel(segmentedControl=");
        sb4.append(list);
        sb4.append(", heightPicker=");
        sb4.append(heightPickerModel);
        sb4.append(", weightPicker=");
        sb4.append(weightPickerModel);
        sb4.append(", stateUpdateUnitKey=");
        sb4.append(str);
        sb4.append(", unitType=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public HeightWeightModel bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return HeightWeightModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    public HeightWeightModel(List<SegmentedControlDisplayModel> segmentedControl, HeightPickerModel heightPickerModel, WeightPickerModel weightPickerModel, String str, String str2) {
        AbstractC22676k.m65750j(segmentedControl, "segmentedControl");
        this.segmentedControl = segmentedControl;
        this.heightPicker = heightPickerModel;
        this.weightPicker = weightPickerModel;
        this.stateUpdateUnitKey = str;
        this.unitType = str2;
    }

    public /* synthetic */ HeightWeightModel(List list, HeightPickerModel heightPickerModel, WeightPickerModel weightPickerModel, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, heightPickerModel, weightPickerModel, str, (i13 & 16) != 0 ? null : str2);
    }
}
