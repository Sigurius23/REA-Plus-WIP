package com.whoop.activation.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q41.C29968a;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJD\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u001f¨\u00062"}, m65681d2 = {"Lcom/whoop/activation/domain/models/AccountTransitionLegacyAfterActivationResponse;", "", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "Lcom/whoop/navigation/e;", "onComplete", "", "", "eventProperties", "<init>", "(Ljava/util/List;Lcom/whoop/navigation/e;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/whoop/navigation/e;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/AccountTransitionLegacyAfterActivationResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/whoop/navigation/e;", "component3", "()Ljava/util/Map;", "copy", "(Ljava/util/List;Lcom/whoop/navigation/e;Ljava/util/Map;)Lcom/whoop/activation/domain/models/AccountTransitionLegacyAfterActivationResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "Lcom/whoop/navigation/e;", "getOnComplete", "Ljava/util/Map;", "getEventProperties", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AccountTransitionLegacyAfterActivationResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final Map<String, String> eventProperties;
    private final List<DesignSystemModel> items;
    private final C9598e onComplete;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/AccountTransitionLegacyAfterActivationResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/AccountTransitionLegacyAfterActivationResponse;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AccountTransitionLegacyAfterActivationResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C29968a(4)), AbstractC30060g.m92087G(enumC23463i, new C29968a(5)), AbstractC30060g.m92087G(enumC23463i, new C29968a(6))};
    }

    public /* synthetic */ AccountTransitionLegacyAfterActivationResponse(int i13, List list, C9598e c9598e, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, AccountTransitionLegacyAfterActivationResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.items = list;
        if ((i13 & 2) == 0) {
            this.onComplete = null;
        } else {
            this.onComplete = c9598e;
        }
        if ((i13 & 4) == 0) {
            this.eventProperties = null;
        } else {
            this.eventProperties = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountTransitionLegacyAfterActivationResponse copy$default(AccountTransitionLegacyAfterActivationResponse accountTransitionLegacyAfterActivationResponse, List list, C9598e c9598e, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = accountTransitionLegacyAfterActivationResponse.items;
        }
        if ((i13 & 2) != 0) {
            c9598e = accountTransitionLegacyAfterActivationResponse.onComplete;
        }
        if ((i13 & 4) != 0) {
            map = accountTransitionLegacyAfterActivationResponse.eventProperties;
        }
        return accountTransitionLegacyAfterActivationResponse.copy(list, c9598e, map);
    }

    public static final /* synthetic */ void write$Self$activation_release(AccountTransitionLegacyAfterActivationResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.items);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.onComplete != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.onComplete);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.eventProperties == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.eventProperties);
    }

    public final List<DesignSystemModel> component1() {
        return this.items;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C9598e getOnComplete() {
        return this.onComplete;
    }

    public final Map<String, String> component3() {
        return this.eventProperties;
    }

    public final AccountTransitionLegacyAfterActivationResponse copy(List<? extends DesignSystemModel> items, C9598e onComplete, Map<String, String> eventProperties) {
        AbstractC22676k.m65750j(items, "items");
        return new AccountTransitionLegacyAfterActivationResponse(items, onComplete, eventProperties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountTransitionLegacyAfterActivationResponse)) {
            return false;
        }
        AccountTransitionLegacyAfterActivationResponse accountTransitionLegacyAfterActivationResponse = (AccountTransitionLegacyAfterActivationResponse) other;
        return AbstractC22676k.m65745e(this.items, accountTransitionLegacyAfterActivationResponse.items) && AbstractC22676k.m65745e(this.onComplete, accountTransitionLegacyAfterActivationResponse.onComplete) && AbstractC22676k.m65745e(this.eventProperties, accountTransitionLegacyAfterActivationResponse.eventProperties);
    }

    public final Map<String, String> getEventProperties() {
        return this.eventProperties;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final C9598e getOnComplete() {
        return this.onComplete;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        C9598e c9598e = this.onComplete;
        int iHashCode2 = (iHashCode + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        Map<String, String> map = this.eventProperties;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        List<DesignSystemModel> list = this.items;
        C9598e c9598e = this.onComplete;
        Map<String, String> map = this.eventProperties;
        StringBuilder sb4 = new StringBuilder("AccountTransitionLegacyAfterActivationResponse(items=");
        sb4.append(list);
        sb4.append(", onComplete=");
        sb4.append(c9598e);
        sb4.append(", eventProperties=");
        return AbstractC13673n.m38565l(sb4, map, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountTransitionLegacyAfterActivationResponse(List<? extends DesignSystemModel> items, C9598e c9598e, Map<String, String> map) {
        AbstractC22676k.m65750j(items, "items");
        this.items = items;
        this.onComplete = c9598e;
        this.eventProperties = map;
    }

    public /* synthetic */ AccountTransitionLegacyAfterActivationResponse(List list, C9598e c9598e, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i13 & 2) != 0 ? null : c9598e, (i13 & 4) != 0 ? null : map);
    }
}
