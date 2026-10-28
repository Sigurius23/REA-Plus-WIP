package com.whoop.core.details.activitytargets.domain;

import a12.AbstractC0142b;
import a12.C0141a;
import com.whoop.network.request.GetApiRequest;
import com.whoop.network.request.HttpTimeoutConfig;
import i63.C18181t;
import java.util.Map;
import l83.C23454a0;
import m83.C25272z;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import sr2.AbstractC32943y;
import xv0.AbstractC38668a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001d"}, m65681d2 = {"Lcom/whoop/core/details/activitytargets/domain/ActivityDetailsTargetsMiniArchFetchRequest;", "Lcom/whoop/network/request/GetApiRequest;", "", "path", "", "parameters", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/whoop/core/details/activitytargets/domain/ActivityDetailsTargetsMiniArchFetchRequest;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "Ljava/util/Map;", "getParameters", "Companion", "a", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ActivityDetailsTargetsMiniArchFetchRequest implements GetApiRequest {
    private final Map<String, String> parameters;
    private final String path;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.core.details.activitytargets.domain.ActivityDetailsTargetsMiniArchFetchRequest$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/core/details/activitytargets/domain/ActivityDetailsTargetsMiniArchFetchRequest$a;", "", "<init>", "()V", "", "path", "Lcom/whoop/core/details/activitytargets/domain/ActivityDetailsTargetsMiniArchFetchRequest;", "a", "(Ljava/lang/String;)Lcom/whoop/core/details/activitytargets/domain/ActivityDetailsTargetsMiniArchFetchRequest;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ActivityDetailsTargetsMiniArchFetchRequest m19667a(String path) {
            AbstractC22676k.m65750j(path, "path");
            C0141a c0141aM360e = AbstractC0142b.m360e(AbstractC38668a.m124002a(path));
            return new ActivityDetailsTargetsMiniArchFetchRequest(c0141aM360e.getBasePath(), c0141aM360e.m354b());
        }

        private Companion() {
        }
    }

    public ActivityDetailsTargetsMiniArchFetchRequest(String path, Map<String, String> parameters) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(parameters, "parameters");
        this.path = path;
        this.parameters = parameters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivityDetailsTargetsMiniArchFetchRequest copy$default(ActivityDetailsTargetsMiniArchFetchRequest activityDetailsTargetsMiniArchFetchRequest, String str, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = activityDetailsTargetsMiniArchFetchRequest.path;
        }
        if ((i13 & 2) != 0) {
            map = activityDetailsTargetsMiniArchFetchRequest.parameters;
        }
        return activityDetailsTargetsMiniArchFetchRequest.copy(str, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final Map<String, String> component2() {
        return this.parameters;
    }

    public final ActivityDetailsTargetsMiniArchFetchRequest copy(String path, Map<String, String> parameters) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(parameters, "parameters");
        return new ActivityDetailsTargetsMiniArchFetchRequest(path, parameters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityDetailsTargetsMiniArchFetchRequest)) {
            return false;
        }
        ActivityDetailsTargetsMiniArchFetchRequest activityDetailsTargetsMiniArchFetchRequest = (ActivityDetailsTargetsMiniArchFetchRequest) other;
        return AbstractC22676k.m65745e(this.path, activityDetailsTargetsMiniArchFetchRequest.path) && AbstractC22676k.m65745e(this.parameters, activityDetailsTargetsMiniArchFetchRequest.parameters);
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ boolean getHasBody() {
        return super.getHasBody();
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ Map<String, String> getHeaders() {
        return super.getHeaders();
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ HttpTimeoutConfig getHttpTimeoutConfig() {
        return super.getHttpTimeoutConfig();
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ C18181t getMethod() {
        return super.getMethod();
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public Map<String, String> getParameters() {
        return this.parameters;
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public String getPath() {
        return this.path;
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ String getTag() {
        return super.getTag();
    }

    public int hashCode() {
        return this.parameters.hashCode() + (this.path.hashCode() * 31);
    }

    public String toString() {
        return AbstractC36095b.m114680h("ActivityDetailsTargetsMiniArchFetchRequest(path=", this.path, ", parameters=", ")", this.parameters);
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ String url(AbstractC32943y abstractC32943y) {
        return super.url(abstractC32943y);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Void, l83.a0] */
    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ C23454a0 getBody() {
        return super.getBody();
    }

    public /* synthetic */ ActivityDetailsTargetsMiniArchFetchRequest(String str, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? C25272z.f99163w : map);
    }
}
