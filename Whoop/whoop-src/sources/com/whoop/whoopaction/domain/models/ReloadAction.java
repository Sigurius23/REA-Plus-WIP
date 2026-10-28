package com.whoop.whoopaction.domain.models;

import com.whoop.navigation.CachePolicyModel;
import com.whoop.navigation.CachePolicyModel$$serializer;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.ApiRequest$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weeklyplan.customizeplan.domain.api.C10717a;
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

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001d¨\u00062"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/ReloadAction;", "Lcom/whoop/whoopaction/domain/models/Action;", "Lcom/whoop/navigation/models/ApiRequest;", "request", "Lcom/whoop/whoopaction/domain/models/ReloadMode;", "reloadMode", "Lcom/whoop/navigation/CachePolicyModel;", "cachePolicy", "<init>", "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/whoopaction/domain/models/ReloadMode;Lcom/whoop/navigation/CachePolicyModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/navigation/models/ApiRequest;Lcom/whoop/whoopaction/domain/models/ReloadMode;Lcom/whoop/navigation/CachePolicyModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whoop_action_release", "(Lcom/whoop/whoopaction/domain/models/ReloadAction;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/navigation/models/ApiRequest;", "component2", "()Lcom/whoop/whoopaction/domain/models/ReloadMode;", "component3", "()Lcom/whoop/navigation/CachePolicyModel;", "copy", "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/whoopaction/domain/models/ReloadMode;Lcom/whoop/navigation/CachePolicyModel;)Lcom/whoop/whoopaction/domain/models/ReloadAction;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/navigation/models/ApiRequest;", "getRequest", "Lcom/whoop/whoopaction/domain/models/ReloadMode;", "getReloadMode", "Lcom/whoop/navigation/CachePolicyModel;", "getCachePolicy", "Companion", "$serializer", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ReloadAction implements Action {
    private final CachePolicyModel cachePolicy;
    private final ReloadMode reloadMode;
    private final ApiRequest request;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = CachePolicyModel.$stable | ApiRequest.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C10717a(21)), null};

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/ReloadAction$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whoopaction/domain/models/ReloadAction;", "serializer", "()Lwc3/c;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ReloadAction$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ReloadAction(int i13, ApiRequest apiRequest, ReloadMode reloadMode, CachePolicyModel cachePolicyModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, ReloadAction$$serializer.INSTANCE.getDescriptor());
        }
        this.request = apiRequest;
        if ((i13 & 2) == 0) {
            this.reloadMode = ReloadMode.PERSISTENT;
        } else {
            this.reloadMode = reloadMode;
        }
        if ((i13 & 4) == 0) {
            this.cachePolicy = null;
        } else {
            this.cachePolicy = cachePolicyModel;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return ReloadMode.INSTANCE.serializer();
    }

    public static /* synthetic */ ReloadAction copy$default(ReloadAction reloadAction, ApiRequest apiRequest, ReloadMode reloadMode, CachePolicyModel cachePolicyModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            apiRequest = reloadAction.request;
        }
        if ((i13 & 2) != 0) {
            reloadMode = reloadAction.reloadMode;
        }
        if ((i13 & 4) != 0) {
            cachePolicyModel = reloadAction.cachePolicy;
        }
        return reloadAction.copy(apiRequest, reloadMode, cachePolicyModel);
    }

    public static final /* synthetic */ void write$Self$whoop_action_release(ReloadAction self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, ApiRequest$$serializer.INSTANCE, self.request);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.reloadMode != ReloadMode.PERSISTENT) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.reloadMode);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.cachePolicy == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, CachePolicyModel$$serializer.INSTANCE, self.cachePolicy);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApiRequest getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ReloadMode getReloadMode() {
        return this.reloadMode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CachePolicyModel getCachePolicy() {
        return this.cachePolicy;
    }

    public final ReloadAction copy(ApiRequest request, ReloadMode reloadMode, CachePolicyModel cachePolicy) {
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(reloadMode, "reloadMode");
        return new ReloadAction(request, reloadMode, cachePolicy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReloadAction)) {
            return false;
        }
        ReloadAction reloadAction = (ReloadAction) other;
        return AbstractC22676k.m65745e(this.request, reloadAction.request) && this.reloadMode == reloadAction.reloadMode && AbstractC22676k.m65745e(this.cachePolicy, reloadAction.cachePolicy);
    }

    public final CachePolicyModel getCachePolicy() {
        return this.cachePolicy;
    }

    public final ReloadMode getReloadMode() {
        return this.reloadMode;
    }

    public final ApiRequest getRequest() {
        return this.request;
    }

    public int hashCode() {
        int iHashCode = (this.reloadMode.hashCode() + (this.request.hashCode() * 31)) * 31;
        CachePolicyModel cachePolicyModel = this.cachePolicy;
        return iHashCode + (cachePolicyModel == null ? 0 : cachePolicyModel.hashCode());
    }

    public String toString() {
        return "ReloadAction(request=" + this.request + ", reloadMode=" + this.reloadMode + ", cachePolicy=" + this.cachePolicy + ")";
    }

    public ReloadAction(ApiRequest request, ReloadMode reloadMode, CachePolicyModel cachePolicyModel) {
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(reloadMode, "reloadMode");
        this.request = request;
        this.reloadMode = reloadMode;
        this.cachePolicy = cachePolicyModel;
    }

    public /* synthetic */ ReloadAction(ApiRequest apiRequest, ReloadMode reloadMode, CachePolicyModel cachePolicyModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(apiRequest, (i13 & 2) != 0 ? ReloadMode.PERSISTENT : reloadMode, (i13 & 4) != 0 ? null : cachePolicyModel);
    }
}
