.class public final Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;
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
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0010\u0001\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u000e\u0012\n\u0012\u0008\u0018\u00010\u0002j\u0002`\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\t\u001a\u00020\u0004H\u00c2\u0003\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004H\u00c2\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\nJ$\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0017\u001a\u0004\u0008\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u00148\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;",
        "Lcom/whoop/network/request/PutApiRequest;",
        "Ll83/a0;",
        "Lcom/whoop/network/request/NoRequestBody;",
        "",
        "cardId",
        "basePath",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;",
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

.field private final cardId:Ljava/lang/String;

.field private final hasBody:Z

.field private final path:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "cardId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "basePath"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;->cardId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;->basePath:Ljava/lang/String;

    .line 4
    const-string v0, "/seen/"

    .line 5
    invoke-static {p2, v0, p1}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 6
    iput-object p1, p0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;->path:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 13
    const-string p2, "app-notifications-service/v1/app/notification-cards"

    .line 14
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;->cardId:Ljava/lang/String;

    return-object v0
.end method

.method private final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;->basePath:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;->cardId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;->basePath:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;->copy(Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;
    .locals 1

    const-string v0, "cardId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "basePath"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;

    invoke-direct {v0, p1, p2}, Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;

    iget-object v1, p0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;->cardId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;->cardId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;->basePath:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;->basePath:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public bridge synthetic getBody()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;->getBody()Ljava/lang/Void;

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

    iget-boolean v0, p0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;->hasBody:Z

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

    iget-object v0, p0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;->path:Ljava/lang/String;

    return-object v0
.end method

.method public bridge getTag()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/PutApiRequest;->getTag()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;->cardId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;->basePath:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;->cardId:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/homenotificationscenter/domain/cache/NotificationCenterReadCardRequest;->basePath:Ljava/lang/String;

    const-string v2, ", basePath="

    const-string v3, ")"

    const-string v4, "NotificationCenterReadCardRequest(cardId="

    invoke-static {v4, v0, v2, v1, v3}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge url(Lsr2/y;)Ljava/lang/String;
    .locals 0

    invoke-super {p0, p1}, Lcom/whoop/network/request/PutApiRequest;->url(Lsr2/y;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
