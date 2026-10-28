package com.whoop.whoopaction.domain.models;

import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weeklyplan.customizeplan.domain.api.C10717a;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25272z;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import uw2.C35316a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bBE\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ<\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001dR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u001f¨\u00064"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/PermissionParameters;", "Lcom/whoop/whoopaction/domain/models/OSActionParameters;", "Lcom/whoop/whoopaction/domain/models/PermissionType;", "permission", "Lcom/whoop/whoopaction/domain/models/PermissionActionContext;", "context", "", "Lcom/whoop/whoopaction/domain/models/ActionErrorCode;", "Lcom/whoop/navigation/models/GenericInteraction;", "onError", "<init>", "(Lcom/whoop/whoopaction/domain/models/PermissionType;Lcom/whoop/whoopaction/domain/models/PermissionActionContext;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/whoopaction/domain/models/PermissionType;Lcom/whoop/whoopaction/domain/models/PermissionActionContext;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whoop_action_release", "(Lcom/whoop/whoopaction/domain/models/PermissionParameters;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/whoopaction/domain/models/PermissionType;", "component2", "()Lcom/whoop/whoopaction/domain/models/PermissionActionContext;", "component3", "()Ljava/util/Map;", "copy", "(Lcom/whoop/whoopaction/domain/models/PermissionType;Lcom/whoop/whoopaction/domain/models/PermissionActionContext;Ljava/util/Map;)Lcom/whoop/whoopaction/domain/models/PermissionParameters;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/whoopaction/domain/models/PermissionType;", "getPermission", "Lcom/whoop/whoopaction/domain/models/PermissionActionContext;", "getContext", "Ljava/util/Map;", "getOnError", "Companion", "$serializer", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PermissionParameters implements OSActionParameters {
    private static final InterfaceC23462h[] $childSerializers;
    private final PermissionActionContext context;
    private final Map<ActionErrorCode, GenericInteraction> onError;
    private final PermissionType permission;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/PermissionParameters$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whoopaction/domain/models/PermissionParameters;", "serializer", "()Lwc3/c;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PermissionParameters$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C10717a(16)), null, AbstractC30060g.m92087G(enumC23463i, new C10717a(17))};
    }

    public PermissionParameters() {
        this((PermissionType) null, (PermissionActionContext) null, (Map) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return PermissionType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new LinkedHashMapSerializer(C35316a.f150501a, GenericInteraction$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PermissionParameters copy$default(PermissionParameters permissionParameters, PermissionType permissionType, PermissionActionContext permissionActionContext, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            permissionType = permissionParameters.permission;
        }
        if ((i13 & 2) != 0) {
            permissionActionContext = permissionParameters.context;
        }
        if ((i13 & 4) != 0) {
            map = permissionParameters.onError;
        }
        return permissionParameters.copy(permissionType, permissionActionContext, map);
    }

    public static final /* synthetic */ void write$Self$whoop_action_release(PermissionParameters self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.permission != PermissionType.UNKNOWN) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.permission);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.context != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, PermissionActionContext$$serializer.INSTANCE, self.context);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && AbstractC22676k.m65745e(self.onError, C25272z.f99163w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.onError);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PermissionType getPermission() {
        return this.permission;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PermissionActionContext getContext() {
        return this.context;
    }

    public final Map<ActionErrorCode, GenericInteraction> component3() {
        return this.onError;
    }

    public final PermissionParameters copy(PermissionType permission, PermissionActionContext context, Map<ActionErrorCode, GenericInteraction> onError) {
        AbstractC22676k.m65750j(permission, "permission");
        AbstractC22676k.m65750j(onError, "onError");
        return new PermissionParameters(permission, context, onError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermissionParameters)) {
            return false;
        }
        PermissionParameters permissionParameters = (PermissionParameters) other;
        return this.permission == permissionParameters.permission && AbstractC22676k.m65745e(this.context, permissionParameters.context) && AbstractC22676k.m65745e(this.onError, permissionParameters.onError);
    }

    public final PermissionActionContext getContext() {
        return this.context;
    }

    public final Map<ActionErrorCode, GenericInteraction> getOnError() {
        return this.onError;
    }

    public final PermissionType getPermission() {
        return this.permission;
    }

    public int hashCode() {
        int iHashCode = this.permission.hashCode() * 31;
        PermissionActionContext permissionActionContext = this.context;
        return this.onError.hashCode() + ((iHashCode + (permissionActionContext == null ? 0 : permissionActionContext.hashCode())) * 31);
    }

    public String toString() {
        PermissionType permissionType = this.permission;
        PermissionActionContext permissionActionContext = this.context;
        Map<ActionErrorCode, GenericInteraction> map = this.onError;
        StringBuilder sb4 = new StringBuilder("PermissionParameters(permission=");
        sb4.append(permissionType);
        sb4.append(", context=");
        sb4.append(permissionActionContext);
        sb4.append(", onError=");
        return AbstractC13673n.m38565l(sb4, map, ")");
    }

    public /* synthetic */ PermissionParameters(int i13, PermissionType permissionType, PermissionActionContext permissionActionContext, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        this.permission = (i13 & 1) == 0 ? PermissionType.UNKNOWN : permissionType;
        if ((i13 & 2) == 0) {
            this.context = null;
        } else {
            this.context = permissionActionContext;
        }
        if ((i13 & 4) == 0) {
            this.onError = C25272z.f99163w;
        } else {
            this.onError = map;
        }
    }

    public PermissionParameters(PermissionType permission, PermissionActionContext permissionActionContext, Map<ActionErrorCode, GenericInteraction> onError) {
        AbstractC22676k.m65750j(permission, "permission");
        AbstractC22676k.m65750j(onError, "onError");
        this.permission = permission;
        this.context = permissionActionContext;
        this.onError = onError;
    }

    public /* synthetic */ PermissionParameters(PermissionType permissionType, PermissionActionContext permissionActionContext, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? PermissionType.UNKNOWN : permissionType, (i13 & 2) != 0 ? null : permissionActionContext, (i13 & 4) != 0 ? C25272z.f99163w : map);
    }
}
