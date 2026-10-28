package com.whoop.activation.domain.models;

import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
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
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 JL\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u001bR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010 ¨\u00063"}, m65681d2 = {"Lcom/whoop/activation/domain/models/ActivationFlowCountry;", "", "", "name", "countryCode", "countryFlag", "ageLimit", "", "Lcom/whoop/activation/domain/models/ActivationFlowState;", "states", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/ActivationFlowCountry;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/activation/domain/models/ActivationFlowCountry;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getCountryCode", "getCountryFlag", "getAgeLimit", "Ljava/util/List;", "getStates", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ActivationFlowCountry {
    private final String ageLimit;
    private final String countryCode;
    private final String countryFlag;
    private final String name;
    private final List<ActivationFlowState> states;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C29968a(17))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/ActivationFlowCountry$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/ActivationFlowCountry;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ActivationFlowCountry$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ActivationFlowCountry(int i13, String str, String str2, String str3, String str4, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, ActivationFlowCountry$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        this.countryCode = str2;
        this.countryFlag = str3;
        this.ageLimit = str4;
        this.states = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ActivationFlowState$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivationFlowCountry copy$default(ActivationFlowCountry activationFlowCountry, String str, String str2, String str3, String str4, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = activationFlowCountry.name;
        }
        if ((i13 & 2) != 0) {
            str2 = activationFlowCountry.countryCode;
        }
        if ((i13 & 4) != 0) {
            str3 = activationFlowCountry.countryFlag;
        }
        if ((i13 & 8) != 0) {
            str4 = activationFlowCountry.ageLimit;
        }
        if ((i13 & 16) != 0) {
            list = activationFlowCountry.states;
        }
        List list2 = list;
        String str5 = str3;
        return activationFlowCountry.copy(str, str2, str5, str4, list2);
    }

    public static final /* synthetic */ void write$Self$activation_release(ActivationFlowCountry self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.name);
        output.encodeStringElement(serialDesc, 1, self.countryCode);
        output.encodeStringElement(serialDesc, 2, self.countryFlag);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.ageLimit);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.states);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCountryFlag() {
        return this.countryFlag;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAgeLimit() {
        return this.ageLimit;
    }

    public final List<ActivationFlowState> component5() {
        return this.states;
    }

    public final ActivationFlowCountry copy(String name, String countryCode, String countryFlag, String ageLimit, List<ActivationFlowState> states) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(countryCode, "countryCode");
        AbstractC22676k.m65750j(countryFlag, "countryFlag");
        return new ActivationFlowCountry(name, countryCode, countryFlag, ageLimit, states);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivationFlowCountry)) {
            return false;
        }
        ActivationFlowCountry activationFlowCountry = (ActivationFlowCountry) other;
        return AbstractC22676k.m65745e(this.name, activationFlowCountry.name) && AbstractC22676k.m65745e(this.countryCode, activationFlowCountry.countryCode) && AbstractC22676k.m65745e(this.countryFlag, activationFlowCountry.countryFlag) && AbstractC22676k.m65745e(this.ageLimit, activationFlowCountry.ageLimit) && AbstractC22676k.m65745e(this.states, activationFlowCountry.states);
    }

    public final String getAgeLimit() {
        return this.ageLimit;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCountryFlag() {
        return this.countryFlag;
    }

    public final String getName() {
        return this.name;
    }

    public final List<ActivationFlowState> getStates() {
        return this.states;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.name.hashCode() * 31, 31, this.countryCode), 31, this.countryFlag);
        String str = this.ageLimit;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        List<ActivationFlowState> list = this.states;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.countryCode;
        String str3 = this.countryFlag;
        String str4 = this.ageLimit;
        List<ActivationFlowState> list = this.states;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ActivationFlowCountry(name=", str, ", countryCode=", str2, ", countryFlag=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", ageLimit=", str4, ", states=");
        return AbstractC3855a.m11829m(sbM32001t, list, ")");
    }

    public ActivationFlowCountry(String name, String countryCode, String countryFlag, String str, List<ActivationFlowState> list) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(countryCode, "countryCode");
        AbstractC22676k.m65750j(countryFlag, "countryFlag");
        this.name = name;
        this.countryCode = countryCode;
        this.countryFlag = countryFlag;
        this.ageLimit = str;
        this.states = list;
    }
}
