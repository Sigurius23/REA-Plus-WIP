package com.whoop.homenotificationscenter.domain.cache;

import com.whoop.network.request.HttpTimeoutConfig;
import com.whoop.network.request.PutApiRequest;
import i63.C18181t;
import java.util.Map;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import sr2.AbstractC32943y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u000e\u0012\n\u0012\b\u0018\u00010\u0002j\u0002`\u00030\u0001B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\tJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m65681d2 = {"Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;", "Lcom/whoop/network/request/PutApiRequest;", "Ll83/a0;", "Lcom/whoop/network/request/NoRequestBody;", "", "basePath", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "path", "getPath", "hasBody", "Z", "getHasBody", "()Z", "", "getBody", "()Ljava/lang/Void;", "body", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class NotificationsCenterReplayRequest implements PutApiRequest<C23454a0> {
    public static final int $stable = 0;
    private final String basePath;
    private final boolean hasBody;
    private final String path;

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationsCenterReplayRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getBasePath() {
        return this.basePath;
    }

    public static /* synthetic */ NotificationsCenterReplayRequest copy$default(NotificationsCenterReplayRequest notificationsCenterReplayRequest, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = notificationsCenterReplayRequest.basePath;
        }
        return notificationsCenterReplayRequest.copy(str);
    }

    public final NotificationsCenterReplayRequest copy(String basePath) {
        AbstractC22676k.m65750j(basePath, "basePath");
        return new NotificationsCenterReplayRequest(basePath);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NotificationsCenterReplayRequest) && AbstractC22676k.m65745e(this.basePath, ((NotificationsCenterReplayRequest) other).basePath);
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public Void getBody() {
        return null;
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public boolean getHasBody() {
        return this.hasBody;
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public /* bridge */ Map<String, String> getHeaders() {
        return super.getHeaders();
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public /* bridge */ HttpTimeoutConfig getHttpTimeoutConfig() {
        return super.getHttpTimeoutConfig();
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public /* bridge */ C18181t getMethod() {
        return super.getMethod();
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public /* bridge */ Map<String, String> getParameters() {
        return super.getParameters();
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public String getPath() {
        return this.path;
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public /* bridge */ String getTag() {
        return super.getTag();
    }

    public int hashCode() {
        return this.basePath.hashCode();
    }

    public String toString() {
        return AbstractC11895b.m31996o("NotificationsCenterReplayRequest(basePath=", this.basePath, ")");
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public /* bridge */ String url(AbstractC32943y abstractC32943y) {
        return super.url(abstractC32943y);
    }

    public NotificationsCenterReplayRequest(String basePath) {
        AbstractC22676k.m65750j(basePath, "basePath");
        this.basePath = basePath;
        this.path = AbstractC2875y.m8299l(basePath, "/unseen");
    }

    public /* synthetic */ NotificationsCenterReplayRequest(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? NotificationsCenterGetRequest.NOTIFICATION_WRAPPER_V2_PATH : str);
    }
}
