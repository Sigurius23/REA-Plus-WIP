package com.whoop.advancedlabs.multiconsentscreen.domain.models;

import com.whoop.advancedlabs.domain.models.ConsentResponse;
import com.whoop.advancedlabs.domain.models.ConsentResponse$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import eb1.C13005a;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ6\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u0019R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u001b¨\u0006."}, m65681d2 = {"Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse;", "", "", "Lcom/whoop/advancedlabs/domain/models/ConsentResponse;", "consentModels", "", "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentType;", "", "consentVersions", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/util/List;Ljava/util/Map;)Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getConsentModels", "Ljava/util/Map;", "getConsentVersions", "Companion", "$serializer", "a", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MultiConsentResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<ConsentResponse> consentModels;
    private final Map<ConsentType, Integer> consentVersions;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.advancedlabs.multiconsentscreen.domain.models.MultiConsentResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MultiConsentResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C13005a(11)), AbstractC30060g.m92087G(enumC23463i, new C13005a(12))};
    }

    public /* synthetic */ MultiConsentResponse(int i13, List list, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, MultiConsentResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.consentModels = list;
        this.consentVersions = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ConsentResponse$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new LinkedHashMapSerializer(ConsentType.INSTANCE.serializer(), IntSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiConsentResponse copy$default(MultiConsentResponse multiConsentResponse, List list, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = multiConsentResponse.consentModels;
        }
        if ((i13 & 2) != 0) {
            map = multiConsentResponse.consentVersions;
        }
        return multiConsentResponse.copy(list, map);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(MultiConsentResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.consentModels);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.consentVersions);
    }

    public final List<ConsentResponse> component1() {
        return this.consentModels;
    }

    public final Map<ConsentType, Integer> component2() {
        return this.consentVersions;
    }

    public final MultiConsentResponse copy(List<ConsentResponse> consentModels, Map<ConsentType, Integer> consentVersions) {
        AbstractC22676k.m65750j(consentModels, "consentModels");
        AbstractC22676k.m65750j(consentVersions, "consentVersions");
        return new MultiConsentResponse(consentModels, consentVersions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiConsentResponse)) {
            return false;
        }
        MultiConsentResponse multiConsentResponse = (MultiConsentResponse) other;
        return AbstractC22676k.m65745e(this.consentModels, multiConsentResponse.consentModels) && AbstractC22676k.m65745e(this.consentVersions, multiConsentResponse.consentVersions);
    }

    public final List<ConsentResponse> getConsentModels() {
        return this.consentModels;
    }

    public final Map<ConsentType, Integer> getConsentVersions() {
        return this.consentVersions;
    }

    public int hashCode() {
        return this.consentVersions.hashCode() + (this.consentModels.hashCode() * 31);
    }

    public String toString() {
        return "MultiConsentResponse(consentModels=" + this.consentModels + ", consentVersions=" + this.consentVersions + ")";
    }

    public MultiConsentResponse(List<ConsentResponse> consentModels, Map<ConsentType, Integer> consentVersions) {
        AbstractC22676k.m65750j(consentModels, "consentModels");
        AbstractC22676k.m65750j(consentVersions, "consentVersions");
        this.consentModels = consentModels;
        this.consentVersions = consentVersions;
    }
}
