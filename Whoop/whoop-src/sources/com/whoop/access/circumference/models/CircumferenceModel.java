package com.whoop.access.circumference.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import java.util.Map;
import jx2.C22038b;
import k50.AbstractC22198a;
import k50.AbstractC22199b;
import k50.C22200c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0002NOB\u008a\u0001\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\r\u0012+\b\u0002\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0013¢\u0006\u0004\b\u0015\u0010\u0016Bu\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\r\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ#\u0010\u001e\u001a\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001c0\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003HÆ\u0003¢\u0006\u0004\b'\u0010!J\u001e\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b(\u0010)J3\u0010*\u001a%\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0013HÆ\u0003¢\u0006\u0004\b*\u0010)J\u0097\u0001\u0010+\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\r2+\b\u0002\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0013HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b-\u0010%J\u0010\u0010.\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b2\u00103J'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\b@\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bB\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bC\u0010%R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010=\u0012\u0004\bE\u0010F\u001a\u0004\bD\u0010!R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010G\u001a\u0004\bH\u0010)\"\u0004\bI\u0010JRE\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010G\u001a\u0004\bK\u0010)\"\u0004\bL\u0010J¨\u0006P"}, m65681d2 = {"Lcom/whoop/access/circumference/models/CircumferenceModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "Lcom/whoop/design/models/DesignSystemModel;", "", "Lcom/whoop/access/circumference/models/SegmentedControlDisplayModel;", "segmentedControlLabels", "Lcom/whoop/access/circumference/models/CircumferencePickerModel;", "circumferencePicker", "", "stateUpdateUnitKey", "unitType", "Lk50/c;", "foreignMeasurements", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/util/List;Lcom/whoop/access/circumference/models/CircumferencePickerModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/whoop/access/circumference/models/CircumferencePickerModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/access/circumference/models/CircumferenceModel;", "component1", "()Ljava/util/List;", "component2", "()Lcom/whoop/access/circumference/models/CircumferencePickerModel;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()Ljava/util/Map;", "component7", "copy", "(Ljava/util/List;Lcom/whoop/access/circumference/models/CircumferencePickerModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/access/circumference/models/CircumferenceModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$access_release", "(Lcom/whoop/access/circumference/models/CircumferenceModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/util/List;", "getSegmentedControlLabels", "Lcom/whoop/access/circumference/models/CircumferencePickerModel;", "getCircumferencePicker", "Ljava/lang/String;", "getStateUpdateUnitKey", "getUnitType", "getForeignMeasurements", "getForeignMeasurements$annotations", "()V", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "a", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CircumferenceModel implements WithGeneratedBindings, DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final CircumferencePickerModel circumferencePicker;
    private final List<C22200c> foreignMeasurements;
    private final List<SegmentedControlDisplayModel> segmentedControlLabels;
    private final String stateUpdateUnitKey;
    private final String unitType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.access.circumference.models.CircumferenceModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/access/circumference/models/CircumferenceModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/access/circumference/models/CircumferenceModel;", "serializer", "()Lwc3/c;", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CircumferenceModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C22038b(1)), null, null, null, AbstractC30060g.m92087G(enumC23463i, new C22038b(2)), null};
    }

    public /* synthetic */ CircumferenceModel(int i13, List list, CircumferencePickerModel circumferencePickerModel, String str, String str2, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (6 != (i13 & 6)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 6, CircumferenceModel$$serializer.INSTANCE.getDescriptor());
        }
        int i14 = i13 & 1;
        C25271y c25271y = C25271y.f99162w;
        if (i14 == 0) {
            this.segmentedControlLabels = c25271y;
        } else {
            this.segmentedControlLabels = list;
        }
        this.circumferencePicker = circumferencePickerModel;
        this.stateUpdateUnitKey = str;
        if ((i13 & 8) == 0) {
            this.unitType = null;
        } else {
            this.unitType = str2;
        }
        this.foreignMeasurements = c25271y;
        if ((i13 & 16) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 32) == 0) {
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
    public static /* synthetic */ CircumferenceModel copy$default(CircumferenceModel circumferenceModel, List list, CircumferencePickerModel circumferencePickerModel, String str, String str2, List list2, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = circumferenceModel.segmentedControlLabels;
        }
        if ((i13 & 2) != 0) {
            circumferencePickerModel = circumferenceModel.circumferencePicker;
        }
        if ((i13 & 4) != 0) {
            str = circumferenceModel.stateUpdateUnitKey;
        }
        if ((i13 & 8) != 0) {
            str2 = circumferenceModel.unitType;
        }
        if ((i13 & 16) != 0) {
            list2 = circumferenceModel.foreignMeasurements;
        }
        if ((i13 & 32) != 0) {
            map = circumferenceModel.bindings;
        }
        if ((i13 & 64) != 0) {
            map2 = circumferenceModel.aggregateBindings;
        }
        Map map3 = map;
        Map map4 = map2;
        List list3 = list2;
        String str3 = str;
        return circumferenceModel.copy(list, circumferencePickerModel, str3, str2, list3, map3, map4);
    }

    public static /* synthetic */ void getForeignMeasurements$annotations() {
    }

    public static final /* synthetic */ void write$Self$access_release(CircumferenceModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.segmentedControlLabels, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.segmentedControlLabels);
        }
        output.encodeSerializableElement(serialDesc, 1, CircumferencePickerModel$$serializer.INSTANCE, self.circumferencePicker);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.stateUpdateUnitKey);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.unitType != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.unitType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public /* bridge */ /* synthetic */ WithGeneratedBindings bind(Map map) {
        return bind((Map<String, ? extends Object>) map);
    }

    public final List<SegmentedControlDisplayModel> component1() {
        return this.segmentedControlLabels;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CircumferencePickerModel getCircumferencePicker() {
        return this.circumferencePicker;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStateUpdateUnitKey() {
        return this.stateUpdateUnitKey;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUnitType() {
        return this.unitType;
    }

    public final List<C22200c> component5() {
        return this.foreignMeasurements;
    }

    public final Map<String, String> component6() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component7() {
        return this.aggregateBindings;
    }

    public final CircumferenceModel copy(List<SegmentedControlDisplayModel> segmentedControlLabels, CircumferencePickerModel circumferencePicker, String stateUpdateUnitKey, String unitType, List<C22200c> foreignMeasurements, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(segmentedControlLabels, "segmentedControlLabels");
        AbstractC22676k.m65750j(circumferencePicker, "circumferencePicker");
        AbstractC22676k.m65750j(foreignMeasurements, "foreignMeasurements");
        return new CircumferenceModel(segmentedControlLabels, circumferencePicker, stateUpdateUnitKey, unitType, foreignMeasurements, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CircumferenceModel)) {
            return false;
        }
        CircumferenceModel circumferenceModel = (CircumferenceModel) other;
        return AbstractC22676k.m65745e(this.segmentedControlLabels, circumferenceModel.segmentedControlLabels) && AbstractC22676k.m65745e(this.circumferencePicker, circumferenceModel.circumferencePicker) && AbstractC22676k.m65745e(this.stateUpdateUnitKey, circumferenceModel.stateUpdateUnitKey) && AbstractC22676k.m65745e(this.unitType, circumferenceModel.unitType) && AbstractC22676k.m65745e(this.foreignMeasurements, circumferenceModel.foreignMeasurements) && AbstractC22676k.m65745e(this.bindings, circumferenceModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, circumferenceModel.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final CircumferencePickerModel getCircumferencePicker() {
        return this.circumferencePicker;
    }

    public final List<C22200c> getForeignMeasurements() {
        return this.foreignMeasurements;
    }

    public final List<SegmentedControlDisplayModel> getSegmentedControlLabels() {
        return this.segmentedControlLabels;
    }

    public final String getStateUpdateUnitKey() {
        return this.stateUpdateUnitKey;
    }

    public final String getUnitType() {
        return this.unitType;
    }

    public int hashCode() {
        int iHashCode = (this.circumferencePicker.hashCode() + (this.segmentedControlLabels.hashCode() * 31)) * 31;
        String str = this.stateUpdateUnitKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.unitType;
        int iM31983b = AbstractC11895b.m31983b((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.foreignMeasurements);
        Map<String, String> map = this.bindings;
        int iHashCode3 = (iM31983b + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode3 + (map2 != null ? map2.hashCode() : 0);
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
        List<SegmentedControlDisplayModel> list = this.segmentedControlLabels;
        CircumferencePickerModel circumferencePickerModel = this.circumferencePicker;
        String str = this.stateUpdateUnitKey;
        String str2 = this.unitType;
        List<C22200c> list2 = this.foreignMeasurements;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sb4 = new StringBuilder("CircumferenceModel(segmentedControlLabels=");
        sb4.append(list);
        sb4.append(", circumferencePicker=");
        sb4.append(circumferencePickerModel);
        sb4.append(", stateUpdateUnitKey=");
        AbstractC11266d.m30444B(sb4, str, ", unitType=", str2, ", foreignMeasurements=");
        sb4.append(list2);
        sb4.append(", bindings=");
        sb4.append(map);
        sb4.append(", aggregateBindings=");
        return AbstractC13673n.m38565l(sb4, map2, ")");
    }

    public CircumferenceModel(List<SegmentedControlDisplayModel> segmentedControlLabels, CircumferencePickerModel circumferencePicker, String str, String str2, List<C22200c> foreignMeasurements, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(segmentedControlLabels, "segmentedControlLabels");
        AbstractC22676k.m65750j(circumferencePicker, "circumferencePicker");
        AbstractC22676k.m65750j(foreignMeasurements, "foreignMeasurements");
        this.segmentedControlLabels = segmentedControlLabels;
        this.circumferencePicker = circumferencePicker;
        this.stateUpdateUnitKey = str;
        this.unitType = str2;
        this.foreignMeasurements = foreignMeasurements;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public CircumferenceModel bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        CircumferenceModel circumferenceModelM63629a = AbstractC22199b.m63629a(this, getBindings(), getAggregateBindings(), accumulatedState);
        AbstractC22676k.m65748h(circumferenceModelM63629a, "null cannot be cast to non-null type com.whoop.access.circumference.models.CircumferenceModel");
        return copy$default(circumferenceModelM63629a, null, null, null, null, AbstractC22198a.m63628b(accumulatedState, this.stateUpdateUnitKey), null, null, 111, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CircumferenceModel(List list, CircumferencePickerModel circumferencePickerModel, String str, String str2, List list2, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 1;
        C25271y c25271y = C25271y.f99162w;
        this(i14 != 0 ? c25271y : list, circumferencePickerModel, str, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? c25271y : list2, (i13 & 32) != 0 ? null : map, (i13 & 64) != 0 ? null : map2);
    }
}
