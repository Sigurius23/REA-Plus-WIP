package com.whoop.design.models.items;

import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36957d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b$\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCBp\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012+\b\u0002\u0010\u0010\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tj\u0004\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bo\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010#\u001a\u00020\u00012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020!0\tH\u0016¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010&J\u0012\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b*\u0010+J\u001e\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b,\u0010-J3\u0010.\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tj\u0004\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000fHÆ\u0003¢\u0006\u0004\b.\u0010-J\u007f\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2+\b\u0002\u0010\u0010\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tj\u0004\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000fHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010&J\u0010\u00102\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\u00072\b\u00104\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010(R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b;\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b\b\u0010+R0\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010-\"\u0004\b?\u0010@RE\u0010\u0010\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tj\u0004\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010=\u001a\u0004\bA\u0010-\"\u0004\bB\u0010@¨\u0006E"}, m65681d2 = {"Lcom/whoop/design/models/items/FabItemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "title", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "icon", "", "isVisible", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/FabItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/navigation/models/GenericInteraction;", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "()Ljava/util/Map;", "component6", "copy", "(Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/FabItemModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lcom/whoop/navigation/models/GenericInteraction;", "getInteraction", "getIcon", "Ljava/lang/Boolean;", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FabItemModel implements WithGeneratedBindings {
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final String icon;
    private final GenericInteraction interaction;
    private final Boolean isVisible;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36957d(7)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/FabItemModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/FabItemModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FabItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FabItemModel(int i13, String str, GenericInteraction genericInteraction, String str2, Boolean bool, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, FabItemModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.interaction = genericInteraction;
        this.icon = str2;
        if ((i13 & 8) == 0) {
            this.isVisible = null;
        } else {
            this.isVisible = bool;
        }
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
    public static /* synthetic */ FabItemModel copy$default(FabItemModel fabItemModel, String str, GenericInteraction genericInteraction, String str2, Boolean bool, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = fabItemModel.title;
        }
        if ((i13 & 2) != 0) {
            genericInteraction = fabItemModel.interaction;
        }
        if ((i13 & 4) != 0) {
            str2 = fabItemModel.icon;
        }
        if ((i13 & 8) != 0) {
            bool = fabItemModel.isVisible;
        }
        if ((i13 & 16) != 0) {
            map = fabItemModel.bindings;
        }
        if ((i13 & 32) != 0) {
            map2 = fabItemModel.aggregateBindings;
        }
        Map map3 = map;
        Map map4 = map2;
        return fabItemModel.copy(str, genericInteraction, str2, bool, map3, map4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(FabItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeSerializableElement(serialDesc, 1, GenericInteraction$$serializer.INSTANCE, self.interaction);
        output.encodeStringElement(serialDesc, 2, self.icon);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.isVisible != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, BooleanSerializer.INSTANCE, self.isVisible);
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
    public WithGeneratedBindings bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return FabItemModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsVisible() {
        return this.isVisible;
    }

    public final Map<String, String> component5() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component6() {
        return this.aggregateBindings;
    }

    public final FabItemModel copy(String title, GenericInteraction interaction, String icon, Boolean isVisible, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(interaction, "interaction");
        AbstractC22676k.m65750j(icon, "icon");
        return new FabItemModel(title, interaction, icon, isVisible, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FabItemModel)) {
            return false;
        }
        FabItemModel fabItemModel = (FabItemModel) other;
        return AbstractC22676k.m65745e(this.title, fabItemModel.title) && AbstractC22676k.m65745e(this.interaction, fabItemModel.interaction) && AbstractC22676k.m65745e(this.icon, fabItemModel.icon) && AbstractC22676k.m65745e(this.isVisible, fabItemModel.isVisible) && AbstractC22676k.m65745e(this.bindings, fabItemModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, fabItemModel.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.interaction.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.icon);
        Boolean bool = this.isVisible;
        int iHashCode = (iM30450d + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, String> map = this.bindings;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
    }

    public final Boolean isVisible() {
        return this.isVisible;
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
        String str = this.title;
        GenericInteraction genericInteraction = this.interaction;
        String str2 = this.icon;
        Boolean bool = this.isVisible;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sb4 = new StringBuilder("FabItemModel(title=");
        sb4.append(str);
        sb4.append(", interaction=");
        sb4.append(genericInteraction);
        sb4.append(", icon=");
        AbstractC36095b.m114692t(bool, str2, ", isVisible=", ", bindings=", sb4);
        return AbstractC30802r.m94765n(sb4, map, ", aggregateBindings=", map2, ")");
    }

    public FabItemModel(String title, GenericInteraction interaction, String icon, Boolean bool, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(interaction, "interaction");
        AbstractC22676k.m65750j(icon, "icon");
        this.title = title;
        this.interaction = interaction;
        this.icon = icon;
        this.isVisible = bool;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    public /* synthetic */ FabItemModel(String str, GenericInteraction genericInteraction, String str2, Boolean bool, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, genericInteraction, str2, (i13 & 8) != 0 ? null : bool, (i13 & 16) != 0 ? null : map, (i13 & 32) != 0 ? null : map2);
    }
}
