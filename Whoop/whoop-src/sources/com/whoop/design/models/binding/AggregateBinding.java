package com.whoop.design.models.binding;

import ad3.C0771n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r70.C31050b;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B/\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u0006/"}, m65681d2 = {"Lcom/whoop/design/models/binding/AggregateBinding;", "", "", "", "states", "operation", "Lkotlinx/serialization/json/JsonElement;", "operationParameter", "<init>", "(Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$state_binding_annotations", "(Lcom/whoop/design/models/binding/AggregateBinding;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Lkotlinx/serialization/json/JsonElement;", "copy", "(Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lcom/whoop/design/models/binding/AggregateBinding;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getStates", "Ljava/lang/String;", "getOperation", "Lkotlinx/serialization/json/JsonElement;", "getOperationParameter", "Companion", "$serializer", "state-binding-annotations"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AggregateBinding {
    private final String operation;
    private final JsonElement operationParameter;
    private final List<String> states;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C31050b(26)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/binding/AggregateBinding$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/binding/AggregateBinding;", "serializer", "()Lwc3/c;", "state-binding-annotations"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AggregateBinding$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AggregateBinding() {
        this((List) null, (String) null, (JsonElement) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AggregateBinding copy$default(AggregateBinding aggregateBinding, List list, String str, JsonElement jsonElement, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = aggregateBinding.states;
        }
        if ((i13 & 2) != 0) {
            str = aggregateBinding.operation;
        }
        if ((i13 & 4) != 0) {
            jsonElement = aggregateBinding.operationParameter;
        }
        return aggregateBinding.copy(list, str, jsonElement);
    }

    public static final /* synthetic */ void write$Self$state_binding_annotations(AggregateBinding self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.states, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.states);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.operation != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.operation);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.operationParameter == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, C0771n.f2806a, self.operationParameter);
    }

    public final List<String> component1() {
        return this.states;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOperation() {
        return this.operation;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JsonElement getOperationParameter() {
        return this.operationParameter;
    }

    public final AggregateBinding copy(List<String> states, String operation, JsonElement operationParameter) {
        AbstractC22676k.m65750j(states, "states");
        return new AggregateBinding(states, operation, operationParameter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AggregateBinding)) {
            return false;
        }
        AggregateBinding aggregateBinding = (AggregateBinding) other;
        return AbstractC22676k.m65745e(this.states, aggregateBinding.states) && AbstractC22676k.m65745e(this.operation, aggregateBinding.operation) && AbstractC22676k.m65745e(this.operationParameter, aggregateBinding.operationParameter);
    }

    public final String getOperation() {
        return this.operation;
    }

    public final JsonElement getOperationParameter() {
        return this.operationParameter;
    }

    public final List<String> getStates() {
        return this.states;
    }

    public int hashCode() {
        int iHashCode = this.states.hashCode() * 31;
        String str = this.operation;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        JsonElement jsonElement = this.operationParameter;
        return iHashCode2 + (jsonElement != null ? jsonElement.hashCode() : 0);
    }

    public String toString() {
        List<String> list = this.states;
        String str = this.operation;
        JsonElement jsonElement = this.operationParameter;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("AggregateBinding(states=", ", operation=", str, ", operationParameter=", list);
        sbM79507k.append(jsonElement);
        sbM79507k.append(")");
        return sbM79507k.toString();
    }

    public /* synthetic */ AggregateBinding(int i13, List list, String str, JsonElement jsonElement, SerializationConstructorMarker serializationConstructorMarker) {
        this.states = (i13 & 1) == 0 ? C25271y.f99162w : list;
        if ((i13 & 2) == 0) {
            this.operation = null;
        } else {
            this.operation = str;
        }
        if ((i13 & 4) == 0) {
            this.operationParameter = null;
        } else {
            this.operationParameter = jsonElement;
        }
    }

    public AggregateBinding(List<String> states, String str, JsonElement jsonElement) {
        AbstractC22676k.m65750j(states, "states");
        this.states = states;
        this.operation = str;
        this.operationParameter = jsonElement;
    }

    public /* synthetic */ AggregateBinding(List list, String str, JsonElement jsonElement, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : jsonElement);
    }
}
