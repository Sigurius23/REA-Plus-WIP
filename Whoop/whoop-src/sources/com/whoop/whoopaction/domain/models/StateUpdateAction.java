package com.whoop.whoopaction.domain.models;

import ad3.C0771n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weeklyplan.customizeplan.domain.api.C10717a;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B%\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006,"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/StateUpdateAction;", "Lcom/whoop/whoopaction/domain/models/Action;", "", "", "Lkotlinx/serialization/json/JsonElement;", "state", "", "dismissModal", "<init>", "(Ljava/util/Map;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/Map;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whoop_action_release", "(Lcom/whoop/whoopaction/domain/models/StateUpdateAction;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/Map;", "component2", "()Z", "copy", "(Ljava/util/Map;Z)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getState", "Z", "getDismissModal", "Companion", "$serializer", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StateUpdateAction implements Action {
    private final boolean dismissModal;
    private final Map<String, JsonElement> state;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C10717a(24)), null};

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/StateUpdateAction$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whoopaction/domain/models/StateUpdateAction;", "serializer", "()Lwc3/c;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StateUpdateAction$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StateUpdateAction(int i13, Map map, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, StateUpdateAction$$serializer.INSTANCE.getDescriptor());
        }
        this.state = map;
        if ((i13 & 2) == 0) {
            this.dismissModal = false;
        } else {
            this.dismissModal = z4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, C0771n.f2806a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StateUpdateAction copy$default(StateUpdateAction stateUpdateAction, Map map, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = stateUpdateAction.state;
        }
        if ((i13 & 2) != 0) {
            z4 = stateUpdateAction.dismissModal;
        }
        return stateUpdateAction.copy(map, z4);
    }

    public static final /* synthetic */ void write$Self$whoop_action_release(StateUpdateAction self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.state);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.dismissModal) {
            output.encodeBooleanElement(serialDesc, 1, self.dismissModal);
        }
    }

    public final Map<String, JsonElement> component1() {
        return this.state;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getDismissModal() {
        return this.dismissModal;
    }

    public final StateUpdateAction copy(Map<String, ? extends JsonElement> state, boolean dismissModal) {
        AbstractC22676k.m65750j(state, "state");
        return new StateUpdateAction(state, dismissModal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StateUpdateAction)) {
            return false;
        }
        StateUpdateAction stateUpdateAction = (StateUpdateAction) other;
        return AbstractC22676k.m65745e(this.state, stateUpdateAction.state) && this.dismissModal == stateUpdateAction.dismissModal;
    }

    public final boolean getDismissModal() {
        return this.dismissModal;
    }

    public final Map<String, JsonElement> getState() {
        return this.state;
    }

    public int hashCode() {
        return Boolean.hashCode(this.dismissModal) + (this.state.hashCode() * 31);
    }

    public String toString() {
        return "StateUpdateAction(state=" + this.state + ", dismissModal=" + this.dismissModal + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StateUpdateAction(Map<String, ? extends JsonElement> state, boolean z4) {
        AbstractC22676k.m65750j(state, "state");
        this.state = state;
        this.dismissModal = z4;
    }

    public /* synthetic */ StateUpdateAction(Map map, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i13 & 2) != 0 ? false : z4);
    }
}
