package com.whoop.design.models.items;

import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36960g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CBBn\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012+\b\u0002\u0010\u000f\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\bj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bo\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\"\u001a\u00020\u00002\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020 0\bH\u0016¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010%J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010%J\u001e\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b*\u0010+J3\u0010,\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\bj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b,\u0010+J\u007f\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2+\b\u0002\u0010\u000f\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\bj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010%J\u0010\u00100\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010'R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b:\u0010%R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b;\u0010%R0\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010+\"\u0004\b>\u0010?RE\u0010\u000f\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\bj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010<\u001a\u0004\b@\u0010+\"\u0004\bA\u0010?¨\u0006D"}, m65681d2 = {"Lcom/whoop/design/models/items/MultiWheelPickerWheel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "key", "Lcom/whoop/design/models/items/WheelContent;", "content", "unitLabel", "selectedValue", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/WheelContent;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/items/WheelContent;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/MultiWheelPickerWheel;Lzc3/c;Lyc3/g;)V", "write$Self", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/items/MultiWheelPickerWheel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/items/WheelContent;", "component3", "component4", "component5", "()Ljava/util/Map;", "component6", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/items/WheelContent;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/MultiWheelPickerWheel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "Lcom/whoop/design/models/items/WheelContent;", "getContent", "getUnitLabel", "getSelectedValue", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MultiWheelPickerWheel implements WithGeneratedBindings {
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final WheelContent content;
    private final String key;
    private final String selectedValue;
    private final String unitLabel;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36960g(26)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/MultiWheelPickerWheel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/MultiWheelPickerWheel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MultiWheelPickerWheel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MultiWheelPickerWheel(int i13, String str, WheelContent wheelContent, String str2, String str3, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, MultiWheelPickerWheel$$serializer.INSTANCE.getDescriptor());
        }
        this.key = str;
        this.content = wheelContent;
        this.unitLabel = str2;
        this.selectedValue = str3;
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
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiWheelPickerWheel copy$default(MultiWheelPickerWheel multiWheelPickerWheel, String str, WheelContent wheelContent, String str2, String str3, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = multiWheelPickerWheel.key;
        }
        if ((i13 & 2) != 0) {
            wheelContent = multiWheelPickerWheel.content;
        }
        if ((i13 & 4) != 0) {
            str2 = multiWheelPickerWheel.unitLabel;
        }
        if ((i13 & 8) != 0) {
            str3 = multiWheelPickerWheel.selectedValue;
        }
        if ((i13 & 16) != 0) {
            map = multiWheelPickerWheel.bindings;
        }
        if ((i13 & 32) != 0) {
            map2 = multiWheelPickerWheel.aggregateBindings;
        }
        Map map3 = map;
        Map map4 = map2;
        return multiWheelPickerWheel.copy(str, wheelContent, str2, str3, map3, map4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(MultiWheelPickerWheel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.key);
        output.encodeSerializableElement(serialDesc, 1, WheelContent$$serializer.INSTANCE, self.content);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.unitLabel);
        output.encodeStringElement(serialDesc, 3, self.selectedValue);
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

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WheelContent getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUnitLabel() {
        return this.unitLabel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSelectedValue() {
        return this.selectedValue;
    }

    public final Map<String, String> component5() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component6() {
        return this.aggregateBindings;
    }

    public final MultiWheelPickerWheel copy(String key, WheelContent content, String unitLabel, String selectedValue, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(selectedValue, "selectedValue");
        return new MultiWheelPickerWheel(key, content, unitLabel, selectedValue, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiWheelPickerWheel)) {
            return false;
        }
        MultiWheelPickerWheel multiWheelPickerWheel = (MultiWheelPickerWheel) other;
        return AbstractC22676k.m65745e(this.key, multiWheelPickerWheel.key) && AbstractC22676k.m65745e(this.content, multiWheelPickerWheel.content) && AbstractC22676k.m65745e(this.unitLabel, multiWheelPickerWheel.unitLabel) && AbstractC22676k.m65745e(this.selectedValue, multiWheelPickerWheel.selectedValue) && AbstractC22676k.m65745e(this.bindings, multiWheelPickerWheel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, multiWheelPickerWheel.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final WheelContent getContent() {
        return this.content;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getSelectedValue() {
        return this.selectedValue;
    }

    public final String getUnitLabel() {
        return this.unitLabel;
    }

    public int hashCode() {
        int iHashCode = (this.content.hashCode() + (this.key.hashCode() * 31)) * 31;
        String str = this.unitLabel;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.selectedValue);
        Map<String, String> map = this.bindings;
        int iHashCode2 = (iM30450d + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
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
        String str = this.key;
        WheelContent wheelContent = this.content;
        String str2 = this.unitLabel;
        String str3 = this.selectedValue;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sb4 = new StringBuilder("MultiWheelPickerWheel(key=");
        sb4.append(str);
        sb4.append(", content=");
        sb4.append(wheelContent);
        sb4.append(", unitLabel=");
        AbstractC11266d.m30444B(sb4, str2, ", selectedValue=", str3, ", bindings=");
        return AbstractC30802r.m94765n(sb4, map, ", aggregateBindings=", map2, ")");
    }

    public MultiWheelPickerWheel(String key, WheelContent content, String str, String selectedValue, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(selectedValue, "selectedValue");
        this.key = key;
        this.content = content;
        this.unitLabel = str;
        this.selectedValue = selectedValue;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public MultiWheelPickerWheel bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return MultiWheelPickerWheelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    public /* synthetic */ MultiWheelPickerWheel(String str, WheelContent wheelContent, String str2, String str3, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, wheelContent, str2, str3, (i13 & 16) != 0 ? null : map, (i13 & 32) != 0 ? null : map2);
    }
}
