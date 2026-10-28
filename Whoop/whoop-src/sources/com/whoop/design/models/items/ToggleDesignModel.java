package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import w91.C36964k;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0002RQB\u0096\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012+\b\u0002\u0010\u0015\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000ej\u0004\u0018\u0001`\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ#\u0010\u001f\u001a\u00020\u00022\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b)\u0010\"J\u0012\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u001e\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-J3\u0010.\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000ej\u0004\u0018\u0001`\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014HÆ\u0003¢\u0006\u0004\b.\u0010-J£\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2+\b\u0002\u0010\u0015\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000ej\u0004\u0018\u0001`\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b1\u0010\"J\u0010\u00102\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\u00052\b\u00104\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b5\u00106J'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010@\u001a\u0004\bA\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010B\u001a\u0004\b\u0006\u0010$R \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010B\u0012\u0004\bC\u0010D\u001a\u0004\b\u0007\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\bF\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\bG\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bH\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010I\u001a\u0004\bJ\u0010+R0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010K\u001a\u0004\bL\u0010-\"\u0004\bM\u0010NRE\u0010\u0015\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000ej\u0004\u0018\u0001`\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010K\u001a\u0004\bO\u0010-\"\u0004\bP\u0010N¨\u0006S"}, m65681d2 = {"Lcom/whoop/design/models/items/ToggleDesignModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "label", "", "isEnabled", "isReadOnly", "Lcom/whoop/navigation/models/GenericInteraction;", "toggleOnInteraction", "toggleOffInteraction", "style", "Ly81/f;", "toggledOnColor", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/lang/String;ZZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;Ly81/f;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;Ly81/f;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "()Lcom/whoop/navigation/models/GenericInteraction;", "component5", "component6", "component7", "()Ly81/f;", "component8", "()Ljava/util/Map;", "component9", "copy", "(Ljava/lang/String;ZZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;Ly81/f;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/ToggleDesignModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ToggleDesignModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getLabel", "Z", "isReadOnly$annotations", "()V", "Lcom/whoop/navigation/models/GenericInteraction;", "getToggleOnInteraction", "getToggleOffInteraction", "getStyle", "Ly81/f;", "getToggledOnColor", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ToggleDesignModel implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final boolean isEnabled;
    private final boolean isReadOnly;
    private final String label;
    private final String style;
    private final GenericInteraction toggleOffInteraction;
    private final GenericInteraction toggleOnInteraction;
    private final EnumC39333f toggledOnColor;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ToggleDesignModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ToggleDesignModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ToggleDesignModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36964k(18)), AbstractC30060g.m92087G(enumC23463i, new C36964k(19)), null};
    }

    public /* synthetic */ ToggleDesignModel(int i13, String str, boolean z4, boolean z13, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, String str2, EnumC39333f enumC39333f, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, ToggleDesignModel$$serializer.INSTANCE.getDescriptor());
        }
        this.label = str;
        this.isEnabled = z4;
        if ((i13 & 4) == 0) {
            this.isReadOnly = false;
        } else {
            this.isReadOnly = z13;
        }
        if ((i13 & 8) == 0) {
            this.toggleOnInteraction = null;
        } else {
            this.toggleOnInteraction = genericInteraction;
        }
        if ((i13 & 16) == 0) {
            this.toggleOffInteraction = null;
        } else {
            this.toggleOffInteraction = genericInteraction2;
        }
        if ((i13 & 32) == 0) {
            this.style = null;
        } else {
            this.style = str2;
        }
        if ((i13 & 64) == 0) {
            this.toggledOnColor = null;
        } else {
            this.toggledOnColor = enumC39333f;
        }
        if ((i13 & 128) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 256) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ToggleDesignModel copy$default(ToggleDesignModel toggleDesignModel, String str, boolean z4, boolean z13, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, String str2, EnumC39333f enumC39333f, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = toggleDesignModel.label;
        }
        if ((i13 & 2) != 0) {
            z4 = toggleDesignModel.isEnabled;
        }
        if ((i13 & 4) != 0) {
            z13 = toggleDesignModel.isReadOnly;
        }
        if ((i13 & 8) != 0) {
            genericInteraction = toggleDesignModel.toggleOnInteraction;
        }
        if ((i13 & 16) != 0) {
            genericInteraction2 = toggleDesignModel.toggleOffInteraction;
        }
        if ((i13 & 32) != 0) {
            str2 = toggleDesignModel.style;
        }
        if ((i13 & 64) != 0) {
            enumC39333f = toggleDesignModel.toggledOnColor;
        }
        if ((i13 & 128) != 0) {
            map = toggleDesignModel.bindings;
        }
        if ((i13 & 256) != 0) {
            map2 = toggleDesignModel.aggregateBindings;
        }
        Map map3 = map;
        Map map4 = map2;
        String str3 = str2;
        EnumC39333f enumC39333f2 = enumC39333f;
        GenericInteraction genericInteraction3 = genericInteraction2;
        boolean z14 = z13;
        return toggleDesignModel.copy(str, z4, z14, genericInteraction, genericInteraction3, str3, enumC39333f2, map3, map4);
    }

    @InterfaceC37143h("is_disabled")
    public static /* synthetic */ void isReadOnly$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(ToggleDesignModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.label);
        output.encodeBooleanElement(serialDesc, 1, self.isEnabled);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.isReadOnly) {
            output.encodeBooleanElement(serialDesc, 2, self.isReadOnly);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.toggleOnInteraction != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, GenericInteraction$$serializer.INSTANCE, self.toggleOnInteraction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.toggleOffInteraction != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, GenericInteraction$$serializer.INSTANCE, self.toggleOffInteraction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.style != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.style);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.toggledOnColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.toggledOnColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public WithGeneratedBindings bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return ToggleDesignModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final GenericInteraction getToggleOnInteraction() {
        return this.toggleOnInteraction;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final GenericInteraction getToggleOffInteraction() {
        return this.toggleOffInteraction;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final EnumC39333f getToggledOnColor() {
        return this.toggledOnColor;
    }

    public final Map<String, String> component8() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component9() {
        return this.aggregateBindings;
    }

    public final ToggleDesignModel copy(String label, boolean isEnabled, boolean isReadOnly, GenericInteraction toggleOnInteraction, GenericInteraction toggleOffInteraction, String style, EnumC39333f toggledOnColor, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(label, "label");
        return new ToggleDesignModel(label, isEnabled, isReadOnly, toggleOnInteraction, toggleOffInteraction, style, toggledOnColor, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToggleDesignModel)) {
            return false;
        }
        ToggleDesignModel toggleDesignModel = (ToggleDesignModel) other;
        return AbstractC22676k.m65745e(this.label, toggleDesignModel.label) && this.isEnabled == toggleDesignModel.isEnabled && this.isReadOnly == toggleDesignModel.isReadOnly && AbstractC22676k.m65745e(this.toggleOnInteraction, toggleDesignModel.toggleOnInteraction) && AbstractC22676k.m65745e(this.toggleOffInteraction, toggleDesignModel.toggleOffInteraction) && AbstractC22676k.m65745e(this.style, toggleDesignModel.style) && this.toggledOnColor == toggleDesignModel.toggledOnColor && AbstractC22676k.m65745e(this.bindings, toggleDesignModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, toggleDesignModel.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getStyle() {
        return this.style;
    }

    public final GenericInteraction getToggleOffInteraction() {
        return this.toggleOffInteraction;
    }

    public final GenericInteraction getToggleOnInteraction() {
        return this.toggleOnInteraction;
    }

    public final EnumC39333f getToggledOnColor() {
        return this.toggledOnColor;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.label.hashCode() * 31, 31, this.isEnabled), 31, this.isReadOnly);
        GenericInteraction genericInteraction = this.toggleOnInteraction;
        int iHashCode = (iM8289b + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        GenericInteraction genericInteraction2 = this.toggleOffInteraction;
        int iHashCode2 = (iHashCode + (genericInteraction2 == null ? 0 : genericInteraction2.hashCode())) * 31;
        String str = this.style;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        EnumC39333f enumC39333f = this.toggledOnColor;
        int iHashCode4 = (iHashCode3 + (enumC39333f == null ? 0 : enumC39333f.hashCode())) * 31;
        Map<String, String> map = this.bindings;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode5 + (map2 != null ? map2.hashCode() : 0);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isReadOnly() {
        return this.isReadOnly;
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
        String str = this.label;
        boolean z4 = this.isEnabled;
        boolean z13 = this.isReadOnly;
        GenericInteraction genericInteraction = this.toggleOnInteraction;
        GenericInteraction genericInteraction2 = this.toggleOffInteraction;
        String str2 = this.style;
        EnumC39333f enumC39333f = this.toggledOnColor;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("ToggleDesignModel(label=", str, ", isEnabled=", ", isReadOnly=", z4);
        sbM73379l.append(z13);
        sbM73379l.append(", toggleOnInteraction=");
        sbM73379l.append(genericInteraction);
        sbM73379l.append(", toggleOffInteraction=");
        sbM73379l.append(genericInteraction2);
        sbM73379l.append(", style=");
        sbM73379l.append(str2);
        sbM73379l.append(", toggledOnColor=");
        sbM73379l.append(enumC39333f);
        sbM73379l.append(", bindings=");
        sbM73379l.append(map);
        sbM73379l.append(", aggregateBindings=");
        return AbstractC13673n.m38565l(sbM73379l, map2, ")");
    }

    public ToggleDesignModel(String label, boolean z4, boolean z13, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, String str, EnumC39333f enumC39333f, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(label, "label");
        this.label = label;
        this.isEnabled = z4;
        this.isReadOnly = z13;
        this.toggleOnInteraction = genericInteraction;
        this.toggleOffInteraction = genericInteraction2;
        this.style = str;
        this.toggledOnColor = enumC39333f;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    public /* synthetic */ ToggleDesignModel(String str, boolean z4, boolean z13, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, String str2, EnumC39333f enumC39333f, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z4, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? null : genericInteraction, (i13 & 16) != 0 ? null : genericInteraction2, (i13 & 32) != 0 ? null : str2, (i13 & 64) != 0 ? null : enumC39333f, (i13 & 128) != 0 ? null : map, (i13 & 256) != 0 ? null : map2);
    }
}
