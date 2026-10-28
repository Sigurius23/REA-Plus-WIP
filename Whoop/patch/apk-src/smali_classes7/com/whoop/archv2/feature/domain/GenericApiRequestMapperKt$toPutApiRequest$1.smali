.class public final Lcom/whoop/archv2/feature/domain/GenericApiRequestMapperKt$toPutApiRequest$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/network/request/PutApiRequest;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/whoop/network/request/PutApiRequest<",
        "Lkotlinx/serialization/json/JsonElement;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0008\u000b\u0008\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0005\u001a\u0004\u0008\u0012\u0010\u0007\u00a8\u0006\u0013"
    }
    d2 = {
        "com/whoop/archv2/feature/domain/GenericApiRequestMapperKt$toPutApiRequest$1",
        "Lcom/whoop/network/request/PutApiRequest;",
        "Lkotlinx/serialization/json/JsonElement;",
        "",
        "path",
        "Ljava/lang/String;",
        "getPath",
        "()Ljava/lang/String;",
        "",
        "parameters",
        "Ljava/util/Map;",
        "getParameters",
        "()Ljava/util/Map;",
        "body",
        "Lkotlinx/serialization/json/JsonElement;",
        "getBody",
        "()Lkotlinx/serialization/json/JsonElement;",
        "tag",
        "getTag",
        "arch-v2_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final body:Lkotlinx/serialization/json/JsonElement;

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

.field private final tag:Ljava/lang/String;


# direct methods
.method public constructor <init>(La12/a;Lcom/whoop/navigation/models/ApiRequest;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, La12/a;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/archv2/feature/domain/GenericApiRequestMapperKt$toPutApiRequest$1;->path:Ljava/lang/String;

    invoke-virtual {p1}, La12/a;->b()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/archv2/feature/domain/GenericApiRequestMapperKt$toPutApiRequest$1;->parameters:Ljava/util/Map;

    invoke-virtual {p2}, Lcom/whoop/navigation/models/ApiRequest;->getBody()Lkotlinx/serialization/json/JsonElement;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/archv2/feature/domain/GenericApiRequestMapperKt$toPutApiRequest$1;->body:Lkotlinx/serialization/json/JsonElement;

    if-nez p3, :cond_0

    const-class p1, Lcom/whoop/navigation/models/ApiRequest;

    sget-object p2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {p2, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-interface {p1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object p3

    :cond_0
    iput-object p3, p0, Lcom/whoop/archv2/feature/domain/GenericApiRequestMapperKt$toPutApiRequest$1;->tag:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic getBody()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/whoop/archv2/feature/domain/GenericApiRequestMapperKt$toPutApiRequest$1;->getBody()Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    return-object v0
.end method

.method public getBody()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/GenericApiRequestMapperKt$toPutApiRequest$1;->body:Lkotlinx/serialization/json/JsonElement;

    return-object v0
.end method

.method public bridge getHasBody()Z
    .locals 1

    invoke-super {p0}, Lcom/whoop/network/request/PutApiRequest;->getHasBody()Z

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

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/GenericApiRequestMapperKt$toPutApiRequest$1;->parameters:Ljava/util/Map;

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/GenericApiRequestMapperKt$toPutApiRequest$1;->path:Ljava/lang/String;

    return-object v0
.end method

.method public getTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/GenericApiRequestMapperKt$toPutApiRequest$1;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public bridge url(Lsr2/y;)Ljava/lang/String;
    .locals 0

    invoke-super {p0, p1}, Lcom/whoop/network/request/PutApiRequest;->url(Lsr2/y;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
