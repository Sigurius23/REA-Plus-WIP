.class public final Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/network/request/PutApiRequest;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/whoop/network/request/PutApiRequest<",
        "Ll83/a0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0010\u0001\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u000e\u0012\n\u0012\u0008\u0018\u00010\u0002j\u0002`\u00030\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u0008\u001a\u00020\u0004H\u00c2\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\n\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\tJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0015\u001a\u0004\u0008\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00128\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;",
        "Lcom/whoop/network/request/PutApiRequest;",
        "Ll83/a0;",
        "Lcom/whoop/network/request/NoRequestBody;",
        "",
        "basePath",
        "<init>",
        "(Ljava/lang/String;)V",
        "component1",
        "()Ljava/lang/String;",
        "copy",
        "(Ljava/lang/String;)Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;",
        "toString",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "path",
        "getPath",
        "hasBody",
        "Z",
        "getHasBody",
        "()Z",
        "",
        "getBody",
        "()Ljava/lang/Void;",
        "body",
        "home-notifications-center_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final basePath:Ljava/lang/String;

.field private final hasBody:Z

.field private final path:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "basePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;->basePath:Ljava/lang/String;

    .line 4
    const-string v0, "/unseen"

    .line 5
    invoke-static {p1, v0}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 6
    iput-object p1, p0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;->path:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 12
    const-string p1, "app-notifications-service/v1/app/notification-cards"

    .line 13
    :cond_0
    invoke-direct {p0, p1}, Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method private final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;->basePath:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;->basePath:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;->copy(Ljava/lang/String;)Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(Ljava/lang/String;)Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;
    .locals 1

    const-string v0, "basePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;

    invoke-direct {v0, p1}, Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;

    iget-object v1, p0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;->basePath:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;->basePath:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public bridge synthetic getBody()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;->getBody()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public getBody()Ljava/lang/Void;
    .locals 1

    .line 1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getHasBody()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;->hasBody:Z

    return v0
.end method

.method public bridge getHeaders()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Lcom/whoop/network/request/PutApiRequest;->getHeaders()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge getHttpTimeoutConfig()Lcom/whoop/network/request/HttpTimeoutConfig;
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/PutApiRequest;->getHttpTimeoutConfig()Lcom/whoop/network/request/HttpTimeoutConfig;

    move-result-object v0

    return-object v0
.end method

.method public bridge getMethod()Li63/t;
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/PutApiRequest;->getMethod()Li63/t;

    move-result-object v0

    return-object v0
.end method

.method public bridge getParameters()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Lcom/whoop/network/request/PutApiRequest;->getParameters()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;->path:Ljava/lang/String;

    return-object v0
.end method

.method public bridge getTag()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/PutApiRequest;->getTag()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;->basePath:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationsCenterReplayRequest;->basePath:Ljava/lang/String;

    const-string v1, "NotificationsCenterReplayRequest(basePath="

    const-string v2, ")"

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge url(Lsr2/y;)Ljava/lang/String;
    .locals 0

    invoke-super {p0, p1}, Lcom/whoop/network/request/PutApiRequest;->url(Lsr2/y;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
