package com.whoop.design.models.items.ratingpicker;

import ad3.AbstractC0770m;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.BindCoercionKt;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.design.models.binding.StateBindingDeserializerKt;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import e93.AbstractC12889b;
import j93.InterfaceC21461d;
import java.util.Map;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xo1.C38492a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0002?>Bd\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012+\b\u0002\u0010\u000f\u001a%\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\bj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\u0004\b\u0010\u0010\u0011Ba\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010!\u001a\u00020\u00022\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f0\bH\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J\u001e\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b(\u0010)J3\u0010*\u001a%\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\bj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b*\u0010)Js\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2+\b\u0002\u0010\u000f\u001a%\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\bj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b-\u0010'J\u0010\u0010.\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b.\u0010$J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b4\u0010$R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b5\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010'R0\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u00108\u001a\u0004\b9\u0010)\"\u0004\b:\u0010;RE\u0010\u000f\u001a%\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\bj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u00108\u001a\u0004\b<\u0010)\"\u0004\b=\u0010;¨\u0006@"}, m65681d2 = {"Lcom/whoop/design/models/items/ratingpicker/RatingPickerModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "maximum", "numSelected", "", "stateUpdateValueKey", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(IILjava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILjava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ratingpicker/RatingPickerModel;Lzc3/c;Lyc3/g;)V", "write$Self", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/Map;", "component5", "copy", "(IILjava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/ratingpicker/RatingPickerModel;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMaximum", "getNumSelected", "Ljava/lang/String;", "getStateUpdateValueKey", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RatingPickerModel implements DesignSystemModel, WithGeneratedBindings {
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final int maximum;
    private final int numSelected;
    private final String stateUpdateValueKey;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C38492a(25)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ratingpicker/RatingPickerModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ratingpicker/RatingPickerModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RatingPickerModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RatingPickerModel(int i13, int i14, int i15, String str, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, RatingPickerModel$$serializer.INSTANCE.getDescriptor());
        }
        this.maximum = i14;
        this.numSelected = i15;
        this.stateUpdateValueKey = str;
        if ((i13 & 8) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 16) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RatingPickerModel copy$default(RatingPickerModel ratingPickerModel, int i13, int i14, String str, Map map, Map map2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = ratingPickerModel.maximum;
        }
        if ((i15 & 2) != 0) {
            i14 = ratingPickerModel.numSelected;
        }
        if ((i15 & 4) != 0) {
            str = ratingPickerModel.stateUpdateValueKey;
        }
        if ((i15 & 8) != 0) {
            map = ratingPickerModel.bindings;
        }
        if ((i15 & 16) != 0) {
            map2 = ratingPickerModel.aggregateBindings;
        }
        Map map3 = map2;
        String str2 = str;
        return ratingPickerModel.copy(i13, i14, str2, map, map3);
    }

    public static final /* synthetic */ void write$Self$design_models_release(RatingPickerModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.maximum);
        output.encodeIntElement(serialDesc, 1, self.numSelected);
        output.encodeStringElement(serialDesc, 2, self.stateUpdateValueKey);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    /* JADX WARN: Code duplicated, block: B:4:0x001e  */
    @Override // com.whoop.design.models.WithGeneratedBindings
    public WithGeneratedBindings bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        RatingPickerModel ratingPickerModelGeneratedBind = RatingPickerModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
        Object objUnwrapForCoercion = BindCoercionKt.unwrapForCoercion(accumulatedState.get(ratingPickerModelGeneratedBind.stateUpdateValueKey));
        if (objUnwrapForCoercion == null) {
            objUnwrapForCoercion = null;
        } else if (objUnwrapForCoercion instanceof JsonElement) {
            JsonElement jsonElement = (JsonElement) objUnwrapForCoercion;
            try {
                StateBindingDeserializerKt.getStateBindingJson().getClass();
                objUnwrapForCoercion = StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, jsonElement);
            } catch (Exception unused) {
                objUnwrapForCoercion = null;
            }
        } else if (!(objUnwrapForCoercion instanceof Integer)) {
            if (objUnwrapForCoercion instanceof Number) {
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    objUnwrapForCoercion = Integer.valueOf(((Number) objUnwrapForCoercion).intValue());
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    objUnwrapForCoercion = (Integer) Long.valueOf(((Number) objUnwrapForCoercion).longValue());
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    objUnwrapForCoercion = (Integer) Double.valueOf(((Number) objUnwrapForCoercion).doubleValue());
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    objUnwrapForCoercion = (Integer) Float.valueOf(((Number) objUnwrapForCoercion).floatValue());
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Short.TYPE))) {
                    objUnwrapForCoercion = (Integer) Short.valueOf(((Number) objUnwrapForCoercion).shortValue());
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE))) {
                    objUnwrapForCoercion = (Integer) Byte.valueOf(((Number) objUnwrapForCoercion).byteValue());
                } else {
                    objUnwrapForCoercion = null;
                }
            } else if (objUnwrapForCoercion instanceof String) {
                JsonPrimitive jsonPrimitiveM1841c = AbstractC0770m.m1841c((String) objUnwrapForCoercion);
                try {
                    StateBindingDeserializerKt.getStateBindingJson().getClass();
                    objUnwrapForCoercion = StateBindingDeserializerKt.getStateBindingJson().m1830a(IntSerializer.INSTANCE, jsonPrimitiveM1841c);
                } catch (Exception unused2) {
                    objUnwrapForCoercion = null;
                }
                if (objUnwrapForCoercion == null) {
                    objUnwrapForCoercion = null;
                }
            } else {
                objUnwrapForCoercion = null;
            }
        }
        Integer num = (Integer) objUnwrapForCoercion;
        return num != null ? copy$default(ratingPickerModelGeneratedBind, 0, AbstractC12889b.m36284n(num.intValue(), 0, ratingPickerModelGeneratedBind.maximum), null, null, null, 29, null) : ratingPickerModelGeneratedBind;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMaximum() {
        return this.maximum;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getNumSelected() {
        return this.numSelected;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStateUpdateValueKey() {
        return this.stateUpdateValueKey;
    }

    public final Map<String, String> component4() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component5() {
        return this.aggregateBindings;
    }

    public final RatingPickerModel copy(int maximum, int numSelected, String stateUpdateValueKey, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(stateUpdateValueKey, "stateUpdateValueKey");
        return new RatingPickerModel(maximum, numSelected, stateUpdateValueKey, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RatingPickerModel)) {
            return false;
        }
        RatingPickerModel ratingPickerModel = (RatingPickerModel) other;
        return this.maximum == ratingPickerModel.maximum && this.numSelected == ratingPickerModel.numSelected && AbstractC22676k.m65745e(this.stateUpdateValueKey, ratingPickerModel.stateUpdateValueKey) && AbstractC22676k.m65745e(this.bindings, ratingPickerModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, ratingPickerModel.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final int getMaximum() {
        return this.maximum;
    }

    public final int getNumSelected() {
        return this.numSelected;
    }

    public final String getStateUpdateValueKey() {
        return this.stateUpdateValueKey;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.numSelected, Integer.hashCode(this.maximum) * 31, 31), 31, this.stateUpdateValueKey);
        Map<String, String> map = this.bindings;
        int iHashCode = (iM30450d + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode + (map2 != null ? map2.hashCode() : 0);
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
        int i13 = this.maximum;
        int i14 = this.numSelected;
        String str = this.stateUpdateValueKey;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "RatingPickerModel(maximum=", ", numSelected=", ", stateUpdateValueKey=");
        AbstractC36095b.m114695w(sbM30465s, str, ", bindings=", map, ", aggregateBindings=");
        return AbstractC13673n.m38565l(sbM30465s, map2, ")");
    }

    public RatingPickerModel(int i13, int i14, String stateUpdateValueKey, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(stateUpdateValueKey, "stateUpdateValueKey");
        this.maximum = i13;
        this.numSelected = i14;
        this.stateUpdateValueKey = stateUpdateValueKey;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    public /* synthetic */ RatingPickerModel(int i13, int i14, String str, Map map, Map map2, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14, str, (i15 & 8) != 0 ? null : map, (i15 & 16) != 0 ? null : map2);
    }
}
