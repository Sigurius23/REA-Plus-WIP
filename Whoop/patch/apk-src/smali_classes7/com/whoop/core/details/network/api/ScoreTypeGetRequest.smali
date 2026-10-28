.class public final Lcom/whoop/core/details/network/api/ScoreTypeGetRequest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/network/request/GetApiRequest;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010$\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/whoop/core/details/network/api/ScoreTypeGetRequest;",
        "Lcom/whoop/network/request/GetApiRequest;",
        "activityId",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "path",
        "getPath",
        "()Ljava/lang/String;",
        "parameters",
        "",
        "getParameters",
        "()Ljava/util/Map;",
        "core-details_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final parameters:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final path:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/whoop/core/details/network/api/ScoreTypeGetRequest;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string v0, "core-details-bff/v1/activity-score-type"

    iput-object v0, p0, Lcom/whoop/core/details/network/api/ScoreTypeGetRequest;->path:Ljava/lang/String;

    if-eqz p1, :cond_1

    .line 4
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "activityId"

    .line 5
    invoke-static {v0, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    goto :goto_1

    .line 6
    :cond_1
    :goto_0
    invoke-super {p0}, Lcom/whoop/network/request/GetApiRequest;->getParameters()Ljava/util/Map;

    move-result-object p1

    :goto_1
    iput-object p1, p0, Lcom/whoop/core/details/network/api/ScoreTypeGetRequest;->parameters:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 10
    :cond_0
    invoke-direct {p0, p1}, Lcom/whoop/core/details/network/api/ScoreTypeGetRequest;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic getBody()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/whoop/core/details/network/api/ScoreTypeGetRequest;->getBody()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public bridge getBody()Ljava/lang/Void;
    .locals 1

    .line 2
    invoke-super {p0}, Lcom/whoop/network/request/GetApiRequest;->getBody()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public bridge getHasBody()Z
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/GetApiRequest;->getHasBody()Z

    move-result v0

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

    invoke-super {p0}, Lcom/whoop/network/request/GetApiRequest;->getHeaders()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge getHttpTimeoutConfig()Lcom/whoop/network/request/HttpTimeoutConfig;
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/GetApiRequest;->getHttpTimeoutConfig()Lcom/whoop/network/request/HttpTimeoutConfig;

    move-result-object v0

    return-object v0
.end method

.method public bridge getMethod()Li63/t;
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/GetApiRequest;->getMethod()Li63/t;

    move-result-object v0

    return-object v0
.end method

.method public getParameters()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/core/details/network/api/ScoreTypeGetRequest;->parameters:Ljava/util/Map;

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/api/ScoreTypeGetRequest;->path:Ljava/lang/String;

    return-object v0
.end method

.method public bridge getTag()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/GetApiRequest;->getTag()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge url(Lsr2/y;)Ljava/lang/String;
    .locals 0

    invoke-super {p0, p1}, Lcom/whoop/network/request/GetApiRequest;->url(Lsr2/y;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
