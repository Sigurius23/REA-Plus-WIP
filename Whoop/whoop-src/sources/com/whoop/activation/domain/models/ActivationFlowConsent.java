package com.whoop.activation.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
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
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fBO\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010\"JH\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\"R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b4\u0010\"¨\u00067"}, m65681d2 = {"Lcom/whoop/activation/domain/models/ActivationFlowConsent;", "", "", "", "ids", "summary", "Lcom/whoop/activation/domain/models/ActivationFlowTermExpansion;", "expansion", "", "expansionRequired", "required", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/whoop/activation/domain/models/ActivationFlowTermExpansion;ZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lcom/whoop/activation/domain/models/ActivationFlowTermExpansion;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/ActivationFlowConsent;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/whoop/activation/domain/models/ActivationFlowTermExpansion;", "component4", "()Z", "component5", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/whoop/activation/domain/models/ActivationFlowTermExpansion;ZZ)Lcom/whoop/activation/domain/models/ActivationFlowConsent;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getIds", "Ljava/lang/String;", "getSummary", "Lcom/whoop/activation/domain/models/ActivationFlowTermExpansion;", "getExpansion", "Z", "getExpansionRequired", "getRequired", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ActivationFlowConsent {
    private static final InterfaceC23462h[] $childSerializers;
    private final ActivationFlowTermExpansion expansion;
    private final boolean expansionRequired;
    private final List<String> ids;
    private final boolean required;
    private final String summary;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/ActivationFlowConsent$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/ActivationFlowConsent;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ActivationFlowConsent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C29968a(14)), null, AbstractC30060g.m92087G(enumC23463i, new C29968a(15)), null, null};
    }

    public /* synthetic */ ActivationFlowConsent(int i13, List list, String str, ActivationFlowTermExpansion activationFlowTermExpansion, boolean z4, boolean z13, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, ActivationFlowConsent$$serializer.INSTANCE.getDescriptor());
        }
        this.ids = list;
        this.summary = str;
        this.expansion = activationFlowTermExpansion;
        this.expansionRequired = z4;
        this.required = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.activation.domain.models.ActivationFlowTermExpansion", ActivationFlowTermExpansion.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivationFlowConsent copy$default(ActivationFlowConsent activationFlowConsent, List list, String str, ActivationFlowTermExpansion activationFlowTermExpansion, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = activationFlowConsent.ids;
        }
        if ((i13 & 2) != 0) {
            str = activationFlowConsent.summary;
        }
        if ((i13 & 4) != 0) {
            activationFlowTermExpansion = activationFlowConsent.expansion;
        }
        if ((i13 & 8) != 0) {
            z4 = activationFlowConsent.expansionRequired;
        }
        if ((i13 & 16) != 0) {
            z13 = activationFlowConsent.required;
        }
        boolean z14 = z13;
        ActivationFlowTermExpansion activationFlowTermExpansion2 = activationFlowTermExpansion;
        return activationFlowConsent.copy(list, str, activationFlowTermExpansion2, z4, z14);
    }

    public static final /* synthetic */ void write$Self$activation_release(ActivationFlowConsent self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.ids);
        output.encodeStringElement(serialDesc, 1, self.summary);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.expansion);
        output.encodeBooleanElement(serialDesc, 3, self.expansionRequired);
        output.encodeBooleanElement(serialDesc, 4, self.required);
    }

    public final List<String> component1() {
        return this.ids;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ActivationFlowTermExpansion getExpansion() {
        return this.expansion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getExpansionRequired() {
        return this.expansionRequired;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    public final ActivationFlowConsent copy(List<String> ids, String summary, ActivationFlowTermExpansion expansion, boolean expansionRequired, boolean required) {
        AbstractC22676k.m65750j(ids, "ids");
        AbstractC22676k.m65750j(summary, "summary");
        AbstractC22676k.m65750j(expansion, "expansion");
        return new ActivationFlowConsent(ids, summary, expansion, expansionRequired, required);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivationFlowConsent)) {
            return false;
        }
        ActivationFlowConsent activationFlowConsent = (ActivationFlowConsent) other;
        return AbstractC22676k.m65745e(this.ids, activationFlowConsent.ids) && AbstractC22676k.m65745e(this.summary, activationFlowConsent.summary) && this.expansion == activationFlowConsent.expansion && this.expansionRequired == activationFlowConsent.expansionRequired && this.required == activationFlowConsent.required;
    }

    public final ActivationFlowTermExpansion getExpansion() {
        return this.expansion;
    }

    public final boolean getExpansionRequired() {
        return this.expansionRequired;
    }

    public final List<String> getIds() {
        return this.ids;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final String getSummary() {
        return this.summary;
    }

    public int hashCode() {
        return Boolean.hashCode(this.required) + AbstractC2875y.m8289b((this.expansion.hashCode() + AbstractC11266d.m30450d(this.ids.hashCode() * 31, 31, this.summary)) * 31, 31, this.expansionRequired);
    }

    public String toString() {
        List<String> list = this.ids;
        String str = this.summary;
        ActivationFlowTermExpansion activationFlowTermExpansion = this.expansion;
        boolean z4 = this.expansionRequired;
        boolean z13 = this.required;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("ActivationFlowConsent(ids=", ", summary=", str, ", expansion=", list);
        sbM79507k.append(activationFlowTermExpansion);
        sbM79507k.append(", expansionRequired=");
        sbM79507k.append(z4);
        sbM79507k.append(", required=");
        return AbstractC18489d0.m53372m(sbM79507k, z13, ")");
    }

    public ActivationFlowConsent(List<String> ids, String summary, ActivationFlowTermExpansion expansion, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(ids, "ids");
        AbstractC22676k.m65750j(summary, "summary");
        AbstractC22676k.m65750j(expansion, "expansion");
        this.ids = ids;
        this.summary = summary;
        this.expansion = expansion;
        this.expansionRequired = z4;
        this.required = z13;
    }
}
