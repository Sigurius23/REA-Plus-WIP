package com.whoop.home.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import we1.C37224h;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b&\u0010'\u001a\u0004\b\u0003\u0010\u0018R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006,"}, m65681d2 = {"Lcom/whoop/home/domain/models/AutopopMetadata;", "", "", "isTestVariant", "", "Lcom/whoop/navigation/e;", "destinations", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/AutopopMetadata;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/Boolean;Ljava/util/List;)Lcom/whoop/home/domain/models/AutopopMetadata;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "isTestVariant$annotations", "()V", "Ljava/util/List;", "getDestinations", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AutopopMetadata {

    @SerializedName("destinations")
    private final List<C9598e> destinations;

    @SerializedName("test_variant")
    private final Boolean isTestVariant;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37224h(11))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/AutopopMetadata$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/AutopopMetadata;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AutopopMetadata$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AutopopMetadata(int i13, Boolean bool, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, AutopopMetadata$$serializer.INSTANCE.getDescriptor());
        }
        this.isTestVariant = bool;
        this.destinations = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AutopopMetadata copy$default(AutopopMetadata autopopMetadata, Boolean bool, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bool = autopopMetadata.isTestVariant;
        }
        if ((i13 & 2) != 0) {
            list = autopopMetadata.destinations;
        }
        return autopopMetadata.copy(bool, list);
    }

    @InterfaceC37143h("test_variant")
    public static /* synthetic */ void isTestVariant$annotations() {
    }

    public static final /* synthetic */ void write$Self$home_release(AutopopMetadata self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.isTestVariant);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.destinations);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsTestVariant() {
        return this.isTestVariant;
    }

    public final List<C9598e> component2() {
        return this.destinations;
    }

    public final AutopopMetadata copy(Boolean isTestVariant, List<C9598e> destinations) {
        AbstractC22676k.m65750j(destinations, "destinations");
        return new AutopopMetadata(isTestVariant, destinations);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutopopMetadata)) {
            return false;
        }
        AutopopMetadata autopopMetadata = (AutopopMetadata) other;
        return AbstractC22676k.m65745e(this.isTestVariant, autopopMetadata.isTestVariant) && AbstractC22676k.m65745e(this.destinations, autopopMetadata.destinations);
    }

    public final List<C9598e> getDestinations() {
        return this.destinations;
    }

    public int hashCode() {
        Boolean bool = this.isTestVariant;
        return this.destinations.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31);
    }

    public final Boolean isTestVariant() {
        return this.isTestVariant;
    }

    public String toString() {
        return "AutopopMetadata(isTestVariant=" + this.isTestVariant + ", destinations=" + this.destinations + ")";
    }

    public AutopopMetadata(Boolean bool, List<C9598e> destinations) {
        AbstractC22676k.m65750j(destinations, "destinations");
        this.isTestVariant = bool;
        this.destinations = destinations;
    }
}
