package com.whoop.activation.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q41.C29968a;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006+"}, m65681d2 = {"Lcom/whoop/activation/domain/models/ActivationFlowCreateAccountResponse;", "", "Lcom/whoop/activation/domain/models/ActivationFlowStartState;", "startState", "Lcom/whoop/activation/domain/models/ActivationFlowBff;", "activationBff", "<init>", "(Lcom/whoop/activation/domain/models/ActivationFlowStartState;Lcom/whoop/activation/domain/models/ActivationFlowBff;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/activation/domain/models/ActivationFlowStartState;Lcom/whoop/activation/domain/models/ActivationFlowBff;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/ActivationFlowCreateAccountResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/activation/domain/models/ActivationFlowStartState;", "component2", "()Lcom/whoop/activation/domain/models/ActivationFlowBff;", "copy", "(Lcom/whoop/activation/domain/models/ActivationFlowStartState;Lcom/whoop/activation/domain/models/ActivationFlowBff;)Lcom/whoop/activation/domain/models/ActivationFlowCreateAccountResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/activation/domain/models/ActivationFlowStartState;", "getStartState", "Lcom/whoop/activation/domain/models/ActivationFlowBff;", "getActivationBff", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ActivationFlowCreateAccountResponse {
    private final ActivationFlowBff activationBff;
    private final ActivationFlowStartState startState;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C29968a(18)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/ActivationFlowCreateAccountResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/ActivationFlowCreateAccountResponse;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ActivationFlowCreateAccountResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ActivationFlowCreateAccountResponse(int i13, ActivationFlowStartState activationFlowStartState, ActivationFlowBff activationFlowBff, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i13 & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2, ActivationFlowCreateAccountResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.startState = null;
        } else {
            this.startState = activationFlowStartState;
        }
        this.activationBff = activationFlowBff;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.activation.domain.models.ActivationFlowStartState", ActivationFlowStartState.values());
    }

    public static /* synthetic */ ActivationFlowCreateAccountResponse copy$default(ActivationFlowCreateAccountResponse activationFlowCreateAccountResponse, ActivationFlowStartState activationFlowStartState, ActivationFlowBff activationFlowBff, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            activationFlowStartState = activationFlowCreateAccountResponse.startState;
        }
        if ((i13 & 2) != 0) {
            activationFlowBff = activationFlowCreateAccountResponse.activationBff;
        }
        return activationFlowCreateAccountResponse.copy(activationFlowStartState, activationFlowBff);
    }

    public static final /* synthetic */ void write$Self$activation_release(ActivationFlowCreateAccountResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.startState != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.startState);
        }
        output.encodeSerializableElement(serialDesc, 1, ActivationFlowBff$$serializer.INSTANCE, self.activationBff);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ActivationFlowStartState getStartState() {
        return this.startState;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ActivationFlowBff getActivationBff() {
        return this.activationBff;
    }

    public final ActivationFlowCreateAccountResponse copy(ActivationFlowStartState startState, ActivationFlowBff activationBff) {
        AbstractC22676k.m65750j(activationBff, "activationBff");
        return new ActivationFlowCreateAccountResponse(startState, activationBff);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivationFlowCreateAccountResponse)) {
            return false;
        }
        ActivationFlowCreateAccountResponse activationFlowCreateAccountResponse = (ActivationFlowCreateAccountResponse) other;
        return this.startState == activationFlowCreateAccountResponse.startState && AbstractC22676k.m65745e(this.activationBff, activationFlowCreateAccountResponse.activationBff);
    }

    public final ActivationFlowBff getActivationBff() {
        return this.activationBff;
    }

    public final ActivationFlowStartState getStartState() {
        return this.startState;
    }

    public int hashCode() {
        ActivationFlowStartState activationFlowStartState = this.startState;
        return this.activationBff.hashCode() + ((activationFlowStartState == null ? 0 : activationFlowStartState.hashCode()) * 31);
    }

    public String toString() {
        return "ActivationFlowCreateAccountResponse(startState=" + this.startState + ", activationBff=" + this.activationBff + ")";
    }

    public ActivationFlowCreateAccountResponse(ActivationFlowStartState activationFlowStartState, ActivationFlowBff activationBff) {
        AbstractC22676k.m65750j(activationBff, "activationBff");
        this.startState = activationFlowStartState;
        this.activationBff = activationBff;
    }

    public /* synthetic */ ActivationFlowCreateAccountResponse(ActivationFlowStartState activationFlowStartState, ActivationFlowBff activationFlowBff, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : activationFlowStartState, activationFlowBff);
    }
}
