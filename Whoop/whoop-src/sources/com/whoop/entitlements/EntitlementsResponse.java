package com.whoop.entitlements;

import androidx.annotation.Keep;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import we1.C37224h;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B'\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB;\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006-"}, m65681d2 = {"Lcom/whoop/entitlements/EntitlementsResponse;", "", "", "", "Lcom/whoop/entitlements/EntitlementResponse;", "entitlements", "Lcom/whoop/entitlements/EntitlementsContext;", "context", "<init>", "(Ljava/util/Map;Lcom/whoop/entitlements/EntitlementsContext;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/Map;Lcom/whoop/entitlements/EntitlementsContext;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$entitlements_release", "(Lcom/whoop/entitlements/EntitlementsResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/Map;", "component2", "()Lcom/whoop/entitlements/EntitlementsContext;", "copy", "(Ljava/util/Map;Lcom/whoop/entitlements/EntitlementsContext;)Lcom/whoop/entitlements/EntitlementsResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getEntitlements", "Lcom/whoop/entitlements/EntitlementsContext;", "getContext", "Companion", "$serializer", "a", "entitlements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class EntitlementsResponse {
    private final EntitlementsContext context;
    private final Map<String, EntitlementResponse> entitlements;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37224h(0)), null};

    /* JADX INFO: renamed from: com.whoop.entitlements.EntitlementsResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/entitlements/EntitlementsResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/entitlements/EntitlementsResponse;", "serializer", "()Lwc3/c;", "entitlements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return EntitlementsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EntitlementsResponse() {
        this((Map) null, (EntitlementsContext) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, EntitlementResponse$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EntitlementsResponse copy$default(EntitlementsResponse entitlementsResponse, Map map, EntitlementsContext entitlementsContext, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = entitlementsResponse.entitlements;
        }
        if ((i13 & 2) != 0) {
            entitlementsContext = entitlementsResponse.context;
        }
        return entitlementsResponse.copy(map, entitlementsContext);
    }

    public static final /* synthetic */ void write$Self$entitlements_release(EntitlementsResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.entitlements, C25272z.f99163w)) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.entitlements);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && AbstractC22676k.m65745e(self.context, new EntitlementsContext(null))) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 1, EntitlementsContext$$serializer.INSTANCE, self.context);
    }

    public final Map<String, EntitlementResponse> component1() {
        return this.entitlements;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EntitlementsContext getContext() {
        return this.context;
    }

    public final EntitlementsResponse copy(Map<String, EntitlementResponse> entitlements, EntitlementsContext context) {
        AbstractC22676k.m65750j(entitlements, "entitlements");
        AbstractC22676k.m65750j(context, "context");
        return new EntitlementsResponse(entitlements, context);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntitlementsResponse)) {
            return false;
        }
        EntitlementsResponse entitlementsResponse = (EntitlementsResponse) other;
        return AbstractC22676k.m65745e(this.entitlements, entitlementsResponse.entitlements) && AbstractC22676k.m65745e(this.context, entitlementsResponse.context);
    }

    public final EntitlementsContext getContext() {
        return this.context;
    }

    public final Map<String, EntitlementResponse> getEntitlements() {
        return this.entitlements;
    }

    public int hashCode() {
        return this.context.hashCode() + (this.entitlements.hashCode() * 31);
    }

    public String toString() {
        return "EntitlementsResponse(entitlements=" + this.entitlements + ", context=" + this.context + ")";
    }

    public /* synthetic */ EntitlementsResponse(int i13, Map map, EntitlementsContext entitlementsContext, SerializationConstructorMarker serializationConstructorMarker) {
        this.entitlements = (i13 & 1) == 0 ? C25272z.f99163w : map;
        if ((i13 & 2) == 0) {
            this.context = new EntitlementsContext(null);
        } else {
            this.context = entitlementsContext;
        }
    }

    public EntitlementsResponse(Map<String, EntitlementResponse> entitlements, EntitlementsContext context) {
        AbstractC22676k.m65750j(entitlements, "entitlements");
        AbstractC22676k.m65750j(context, "context");
        this.entitlements = entitlements;
        this.context = context;
    }

    public /* synthetic */ EntitlementsResponse(Map map, EntitlementsContext entitlementsContext, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25272z.f99163w : map, (i13 & 2) != 0 ? new EntitlementsContext(null) : entitlementsContext);
    }
}
