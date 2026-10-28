.class public final Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u0015\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0010\u0010\tJ\u0017\u0010\u0013\u001a\u00020\u00042\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R$\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR(\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u001f\u001a\u0004\u0008 \u0010!R$\u0010\"\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\"\u0010\u001f\u001a\u0004\u0008#\u0010!\"\u0004\u0008$\u0010\t\u00a8\u0006%"
    }
    d2 = {
        "Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;",
        "Ljava/io/Closeable;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "close",
        "",
        "template",
        "updateTemplateId",
        "(Ljava/lang/String;)V",
        "",
        "time",
        "joined",
        "(J)V",
        "leave",
        "token",
        "updateWithToken",
        "Llive/hms/video/sdk/models/HMSRoom;",
        "hmsRoom",
        "updateWithRoom",
        "(Llive/hms/video/sdk/models/HMSRoom;)V",
        "Llive/hms/video/sdk/models/HMSPeer;",
        "hmsPeer",
        "updateWithPeer",
        "(Llive/hms/video/sdk/models/HMSPeer;)V",
        "Llive/hms/video/database/entity/AnalyticsPeer;",
        "value",
        "analyticsPeer",
        "Llive/hms/video/database/entity/AnalyticsPeer;",
        "getAnalyticsPeer",
        "()Llive/hms/video/database/entity/AnalyticsPeer;",
        "Ljava/lang/String;",
        "getToken",
        "()Ljava/lang/String;",
        "websocketUrl",
        "getWebsocketUrl",
        "setWebsocketUrl",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private analyticsPeer:Llive/hms/video/database/entity/AnalyticsPeer;

.field private token:Ljava/lang/String;

.field private websocketUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 13

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Llive/hms/video/database/entity/AnalyticsPeer;

    const/16 v11, 0x3ff

    const/4 v12, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v0 .. v12}, Llive/hms/video/database/entity/AnalyticsPeer;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;->analyticsPeer:Llive/hms/video/database/entity/AnalyticsPeer;

    return-void
.end method

.method public static synthetic joined$default(Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;JILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    :cond_0
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;->joined(J)V

    return-void
.end method

.method public static synthetic leave$default(Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;JILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    :cond_0
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;->leave(J)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;->websocketUrl:Ljava/lang/String;

    iput-object v0, p0, Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;->token:Ljava/lang/String;

    return-void
.end method

.method public final getAnalyticsPeer()Llive/hms/video/database/entity/AnalyticsPeer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;->analyticsPeer:Llive/hms/video/database/entity/AnalyticsPeer;

    return-object v0
.end method

.method public final getToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;->token:Ljava/lang/String;

    return-object v0
.end method

.method public final getWebsocketUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;->websocketUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final joined(J)V
    .locals 2

    iget-object v0, p0, Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;->analyticsPeer:Llive/hms/video/database/entity/AnalyticsPeer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Llive/hms/video/database/entity/AnalyticsPeer;->setLeftAt(Ljava/lang/Long;)V

    iget-object v0, p0, Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;->analyticsPeer:Llive/hms/video/database/entity/AnalyticsPeer;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Llive/hms/video/database/entity/AnalyticsPeer;->setJoinedAt(Ljava/lang/Long;)V

    return-void
.end method

.method public final leave(J)V
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;->analyticsPeer:Llive/hms/video/database/entity/AnalyticsPeer;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Llive/hms/video/database/entity/AnalyticsPeer;->setLeftAt(Ljava/lang/Long;)V

    return-void
.end method

.method public final setWebsocketUrl(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;->websocketUrl:Ljava/lang/String;

    return-void
.end method

.method public final updateTemplateId(Ljava/lang/String;)V
    .locals 1

    const-string v0, "template"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;->analyticsPeer:Llive/hms/video/database/entity/AnalyticsPeer;

    invoke-virtual {v0, p1}, Llive/hms/video/database/entity/AnalyticsPeer;->setTemplateId(Ljava/lang/String;)V

    return-void
.end method

.method public final updateWithPeer(Llive/hms/video/sdk/models/HMSPeer;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;->analyticsPeer:Llive/hms/video/database/entity/AnalyticsPeer;

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSPeer;->getPeerID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Llive/hms/video/database/entity/AnalyticsPeer;->setPeerId(Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSPeer;->getHmsRole()Llive/hms/video/sdk/models/role/HMSRole;

    move-result-object v1

    invoke-virtual {v1}, Llive/hms/video/sdk/models/role/HMSRole;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Llive/hms/video/database/entity/AnalyticsPeer;->setRole(Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSPeer;->getMetadata()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Llive/hms/video/database/entity/AnalyticsPeer;->setUserData(Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSPeer;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Llive/hms/video/database/entity/AnalyticsPeer;->setUserName(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final updateWithRoom(Llive/hms/video/sdk/models/HMSRoom;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;->analyticsPeer:Llive/hms/video/database/entity/AnalyticsPeer;

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSRoom;->getSessionId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Llive/hms/video/database/entity/AnalyticsPeer;->setSessionId(Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSRoom;->getStartedAt()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Llive/hms/video/database/entity/AnalyticsPeer;->setSessionStartedAt(Ljava/lang/Long;)V

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSRoom;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Llive/hms/video/database/entity/AnalyticsPeer;->setRoomName(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final updateWithToken(Ljava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;->token:Ljava/lang/String;

    :cond_0
    return-void
.end method
