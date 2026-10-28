package com.whoop.communityreactions.domain.model;

import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ej1.C13228a;
import es0.AbstractC13589b;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@ABd\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012+\b\u0002\u0010\u000e\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\u0004\b\u000f\u0010\u0010Be\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010!\u001a\u00020\u00002\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001f0\u0007H\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b&\u0010'J\u001e\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b(\u0010)J3\u0010*\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b*\u0010)Js\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072+\b\u0002\u0010\u000e\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010$J\u0010\u0010.\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010'R0\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u00109\u001a\u0004\b:\u0010)\"\u0004\b;\u0010<RE\u0010\u000e\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u00109\u001a\u0004\b=\u0010)\"\u0004\b>\u0010<¨\u0006B"}, m65681d2 = {"Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "placeholder", "stateUpdateValueKey", "Lcom/whoop/navigation/models/GenericInteraction;", "submitAction", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_reactions_arch_mini_release", "(Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;Lzc3/c;Lyc3/g;)V", "write$Self", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/navigation/models/GenericInteraction;", "component4", "()Ljava/util/Map;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlaceholder", "getStateUpdateValueKey", "Lcom/whoop/navigation/models/GenericInteraction;", "getSubmitAction", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "a", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ReactionsInputModel implements WithGeneratedBindings {
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final String placeholder;
    private final String stateUpdateValueKey;
    private final GenericInteraction submitAction;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C13228a(22)), null};

    /* JADX INFO: renamed from: com.whoop.communityreactions.domain.model.ReactionsInputModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/communityreactions/domain/model/ReactionsInputModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;", "serializer", "()Lwc3/c;", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ReactionsInputModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ReactionsInputModel(int i13, String str, String str2, GenericInteraction genericInteraction, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, ReactionsInputModel$$serializer.INSTANCE.getDescriptor());
        }
        this.placeholder = str;
        this.stateUpdateValueKey = str2;
        this.submitAction = genericInteraction;
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
    public static /* synthetic */ ReactionsInputModel copy$default(ReactionsInputModel reactionsInputModel, String str, String str2, GenericInteraction genericInteraction, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = reactionsInputModel.placeholder;
        }
        if ((i13 & 2) != 0) {
            str2 = reactionsInputModel.stateUpdateValueKey;
        }
        if ((i13 & 4) != 0) {
            genericInteraction = reactionsInputModel.submitAction;
        }
        if ((i13 & 8) != 0) {
            map = reactionsInputModel.bindings;
        }
        if ((i13 & 16) != 0) {
            map2 = reactionsInputModel.aggregateBindings;
        }
        Map map3 = map2;
        GenericInteraction genericInteraction2 = genericInteraction;
        return reactionsInputModel.copy(str, str2, genericInteraction2, map, map3);
    }

    public static final /* synthetic */ void write$Self$community_reactions_arch_mini_release(ReactionsInputModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.placeholder);
        output.encodeStringElement(serialDesc, 1, self.stateUpdateValueKey);
        output.encodeSerializableElement(serialDesc, 2, GenericInteraction$$serializer.INSTANCE, self.submitAction);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public /* bridge */ /* synthetic */ WithGeneratedBindings bind(Map map) {
        return bind((Map<String, ? extends Object>) map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStateUpdateValueKey() {
        return this.stateUpdateValueKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GenericInteraction getSubmitAction() {
        return this.submitAction;
    }

    public final Map<String, String> component4() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component5() {
        return this.aggregateBindings;
    }

    public final ReactionsInputModel copy(String placeholder, String stateUpdateValueKey, GenericInteraction submitAction, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(placeholder, "placeholder");
        AbstractC22676k.m65750j(stateUpdateValueKey, "stateUpdateValueKey");
        AbstractC22676k.m65750j(submitAction, "submitAction");
        return new ReactionsInputModel(placeholder, stateUpdateValueKey, submitAction, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReactionsInputModel)) {
            return false;
        }
        ReactionsInputModel reactionsInputModel = (ReactionsInputModel) other;
        return AbstractC22676k.m65745e(this.placeholder, reactionsInputModel.placeholder) && AbstractC22676k.m65745e(this.stateUpdateValueKey, reactionsInputModel.stateUpdateValueKey) && AbstractC22676k.m65745e(this.submitAction, reactionsInputModel.submitAction) && AbstractC22676k.m65745e(this.bindings, reactionsInputModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, reactionsInputModel.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final String getStateUpdateValueKey() {
        return this.stateUpdateValueKey;
    }

    public final GenericInteraction getSubmitAction() {
        return this.submitAction;
    }

    public int hashCode() {
        int iHashCode = (this.submitAction.hashCode() + AbstractC11266d.m30450d(this.placeholder.hashCode() * 31, 31, this.stateUpdateValueKey)) * 31;
        Map<String, String> map = this.bindings;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
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
        String str = this.placeholder;
        String str2 = this.stateUpdateValueKey;
        GenericInteraction genericInteraction = this.submitAction;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ReactionsInputModel(placeholder=", str, ", stateUpdateValueKey=", str2, ", submitAction=");
        sbM32001t.append(genericInteraction);
        sbM32001t.append(", bindings=");
        sbM32001t.append(map);
        sbM32001t.append(", aggregateBindings=");
        return AbstractC13673n.m38565l(sbM32001t, map2, ")");
    }

    public ReactionsInputModel(String placeholder, String stateUpdateValueKey, GenericInteraction submitAction, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(placeholder, "placeholder");
        AbstractC22676k.m65750j(stateUpdateValueKey, "stateUpdateValueKey");
        AbstractC22676k.m65750j(submitAction, "submitAction");
        this.placeholder = placeholder;
        this.stateUpdateValueKey = stateUpdateValueKey;
        this.submitAction = submitAction;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public ReactionsInputModel bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return AbstractC13589b.m38350a(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    public /* synthetic */ ReactionsInputModel(String str, String str2, GenericInteraction genericInteraction, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, genericInteraction, (i13 & 8) != 0 ? null : map, (i13 & 16) != 0 ? null : map2);
    }
}
