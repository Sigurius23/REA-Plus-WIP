.class public final Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/PostExternalWebCheckoutRequest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/network/request/PostApiRequest;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/whoop/network/request/PostApiRequest<",
        "Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/PostExternalWebCheckoutRequestBody;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u00020\tX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/PostExternalWebCheckoutRequest;",
        "Lcom/whoop/network/request/PostApiRequest;",
        "Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/PostExternalWebCheckoutRequestBody;",
        "body",
        "<init>",
        "(Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/PostExternalWebCheckoutRequestBody;)V",
        "getBody",
        "()Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/PostExternalWebCheckoutRequestBody;",
        "path",
        "",
        "getPath",
        "()Ljava/lang/String;",
        "universal-checkout_release"
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
.field private final body:Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/PostExternalWebCheckoutRequestBody;

.field private final path:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/PostExternalWebCheckoutRequestBody;)V
    .locals 1

    const-string v0, "body"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/PostExternalWebCheckoutRequest;->body:Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/PostExternalWebCheckoutRequestBody;

    const-string p1, "commerce-service/v1/truemed/payment-session"

    iput-object p1, p0, Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/PostExternalWebCheckoutRequest;->path:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getBody()Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/PostExternalWebCheckoutRequestBody;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/PostExternalWebCheckoutRequest;->body:Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/PostExternalWebCheckoutRequestBody;

    return-object v0
.end method

.method public bridge synthetic getBody()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/PostExternalWebCheckoutRequest;->getBody()Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/PostExternalWebCheckoutRequestBody;

    move-result-object v0

    return-object v0
.end method

.method public bridge getHasBody()Z
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/PostApiRequest;->getHasBody()Z

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

    invoke-super {p0}, Lcom/whoop/network/request/PostApiRequest;->getHeaders()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge getHttpTimeoutConfig()Lcom/whoop/network/request/HttpTimeoutConfig;
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/PostApiRequest;->getHttpTimeoutConfig()Lcom/whoop/network/request/HttpTimeoutConfig;

    move-result-object v0

    return-object v0
.end method

.method public bridge getMethod()Li63/t;
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/PostApiRequest;->getMethod()Li63/t;

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

    invoke-super {p0}, Lcom/whoop/network/request/PostApiRequest;->getParameters()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/PostExternalWebCheckoutRequest;->path:Ljava/lang/String;

    return-object v0
.end method

.method public bridge getTag()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/PostApiRequest;->getTag()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge url(Lsr2/y;)Ljava/lang/String;
    .locals 0

    invoke-super {p0, p1}, Lcom/whoop/network/request/PostApiRequest;->url(Lsr2/y;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
