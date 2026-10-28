package com.whoop.homenotificationscenter.domain.cache;

import com.whoop.network.request.HttpTimeoutConfig;
import com.whoop.network.request.PutApiRequest;
import i63.C18181t;
import ih0.AbstractC18489d0;
import java.util.Map;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import sr2.AbstractC32943y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u000e\u0012\n\u0012\b\u0018\u00010\u0002j\u0002`\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\u000b\u0010\nJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m65681d2 = {"Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;", "Lcom/whoop/network/request/PutApiRequest;", "Ll83/a0;", "Lcom/whoop/network/request/NoRequestBody;", "", "cardId", "basePath", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "path", "getPath", "hasBody", "Z", "getHasBody", "()Z", "", "getBody", "()Ljava/lang/Void;", "body", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class NotificationCenterReadCardRequest implements PutApiRequest<C23454a0> {
    public static final int $stable = 0;
    private final String basePath;
    private final String cardId;
    private final boolean hasBody;
    private final String path;

    public NotificationCenterReadCardRequest(String cardId, String basePath) {
        AbstractC22676k.m65750j(cardId, "cardId");
        AbstractC22676k.m65750j(basePath, "basePath");
        this.cardId = cardId;
        this.basePath = basePath;
        this.path = AbstractC18489d0.m53370k(basePath, "/seen/", cardId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getCardId() {
        return this.cardId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getBasePath() {
        return this.basePath;
    }

    public static /* synthetic */ NotificationCenterReadCardRequest copy$default(NotificationCenterReadCardRequest notificationCenterReadCardRequest, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = notificationCenterReadCardRequest.cardId;
        }
        if ((i13 & 2) != 0) {
            str2 = notificationCenterReadCardRequest.basePath;
        }
        return notificationCenterReadCardRequest.copy(str, str2);
    }

    public final NotificationCenterReadCardRequest copy(String cardId, String basePath) {
        AbstractC22676k.m65750j(cardId, "cardId");
        AbstractC22676k.m65750j(basePath, "basePath");
        return new NotificationCenterReadCardRequest(cardId, basePath);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationCenterReadCardRequest)) {
            return false;
        }
        NotificationCenterReadCardRequest notificationCenterReadCardRequest = (NotificationCenterReadCardRequest) other;
        return AbstractC22676k.m65745e(this.cardId, notificationCenterReadCardRequest.cardId) && AbstractC22676k.m65745e(this.basePath, notificationCenterReadCardRequest.basePath);
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
        return this.basePath.hashCode() + (this.cardId.hashCode() * 31);
    }

    public String toString() {
        return AbstractC2875y.m8300m("NotificationCenterReadCardRequest(cardId=", this.cardId, ", basePath=", this.basePath, ")");
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public /* bridge */ String url(AbstractC32943y abstractC32943y) {
        return super.url(abstractC32943y);
    }

    public /* synthetic */ NotificationCenterReadCardRequest(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? NotificationsCenterGetRequest.NOTIFICATION_WRAPPER_V2_PATH : str2);
    }
}
