.class public final Lcom/whoop/whoopaction/domain/models/RequestExtensionsKt$toActionApiRequest$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz02/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/whoopaction/domain/models/RequestExtensionsKt;->toActionApiRequest(Lcom/whoop/whoopaction/domain/models/Request;Ljava/lang/String;)Lz02/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lz02/a<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007*\u0001\u0000\u0008\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R&\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\u000c8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0004\u001a\u0004\u0008\u0012\u0010\u0006R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0004\u001a\u0004\u0008\u001e\u0010\u0006\u00a8\u0006\u001f"
    }
    d2 = {
        "com/whoop/whoopaction/domain/models/RequestExtensionsKt$toActionApiRequest$1",
        "Lz02/a;",
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
        "Li63/t;",
        "method",
        "Li63/t;",
        "getMethod",
        "()Li63/t;",
        "body",
        "getBody",
        "",
        "hasBody",
        "Z",
        "getHasBody",
        "()Z",
        "Lcom/whoop/network/request/HttpTimeoutConfig;",
        "httpTimeoutConfig",
        "Lcom/whoop/network/request/HttpTimeoutConfig;",
        "getHttpTimeoutConfig",
        "()Lcom/whoop/network/request/HttpTimeoutConfig;",
        "tag",
        "getTag",
        "whoop-action_release"
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
.field private final body:Ljava/lang/String;

.field private final hasBody:Z

.field private final httpTimeoutConfig:Lcom/whoop/network/request/HttpTimeoutConfig;

.field private final method:Li63/t;

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
.method public constructor <init>(La12/a;Lcom/whoop/whoopaction/domain/models/Request;Ljava/lang/String;)V
    .locals 10

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, La12/a;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whoopaction/domain/models/RequestExtensionsKt$toActionApiRequest$1;->path:Ljava/lang/String;

    invoke-virtual {p1}, La12/a;->b()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/whoopaction/domain/models/RequestExtensionsKt$toActionApiRequest$1;->parameters:Ljava/util/Map;

    sget-object p1, Li63/t;->b:Li63/t;

    invoke-virtual {p2}, Lcom/whoop/whoopaction/domain/models/Request;->getMethod()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toUpperCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li63/t;->b:Li63/t;

    iget-object v1, v0, Li63/t;->a:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Li63/t;->c:Li63/t;

    iget-object v1, v0, Li63/t;->a:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Li63/t;->d:Li63/t;

    iget-object v1, v0, Li63/t;->a:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    sget-object v0, Li63/t;->e:Li63/t;

    iget-object v1, v0, Li63/t;->a:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    sget-object v0, Li63/t;->f:Li63/t;

    iget-object v1, v0, Li63/t;->a:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_0

    :cond_4
    sget-object v0, Li63/t;->g:Li63/t;

    iget-object v1, v0, Li63/t;->a:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_0

    :cond_5
    sget-object v0, Li63/t;->h:Li63/t;

    iget-object v1, v0, Li63/t;->a:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_0

    :cond_6
    new-instance v0, Li63/t;

    invoke-direct {v0, p1}, Li63/t;-><init>(Ljava/lang/String;)V

    :goto_0
    iput-object v0, p0, Lcom/whoop/whoopaction/domain/models/RequestExtensionsKt$toActionApiRequest$1;->method:Li63/t;

    invoke-virtual {p2}, Lcom/whoop/whoopaction/domain/models/Request;->getBody()Lkotlinx/serialization/json/JsonElement;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_7
    move-object p1, v0

    :goto_1
    iput-object p1, p0, Lcom/whoop/whoopaction/domain/models/RequestExtensionsKt$toActionApiRequest$1;->body:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/whoop/whoopaction/domain/models/Request;->getBody()Lkotlinx/serialization/json/JsonElement;

    move-result-object p1

    if-eqz p1, :cond_8

    const/4 p1, 0x1

    goto :goto_2

    :cond_8
    const/4 p1, 0x0

    :goto_2
    iput-boolean p1, p0, Lcom/whoop/whoopaction/domain/models/RequestExtensionsKt$toActionApiRequest$1;->hasBody:Z

    invoke-virtual {p2}, Lcom/whoop/whoopaction/domain/models/Request;->getTimeoutMillis()Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    new-instance v1, Lcom/whoop/network/request/HttpTimeoutConfig;

    const/4 v8, 0x3

    const/4 v9, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    invoke-direct/range {v1 .. v9}, Lcom/whoop/network/request/HttpTimeoutConfig;-><init>(JJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v1

    :cond_9
    iput-object v0, p0, Lcom/whoop/whoopaction/domain/models/RequestExtensionsKt$toActionApiRequest$1;->httpTimeoutConfig:Lcom/whoop/network/request/HttpTimeoutConfig;

    iput-object p3, p0, Lcom/whoop/whoopaction/domain/models/RequestExtensionsKt$toActionApiRequest$1;->tag:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic getBody()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/whoop/whoopaction/domain/models/RequestExtensionsKt$toActionApiRequest$1;->getBody()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getBody()Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/RequestExtensionsKt$toActionApiRequest$1;->body:Ljava/lang/String;

    return-object v0
.end method

.method public getHasBody()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whoopaction/domain/models/RequestExtensionsKt$toActionApiRequest$1;->hasBody:Z

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

    invoke-super {p0}, Lz02/a;->getHeaders()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getHttpTimeoutConfig()Lcom/whoop/network/request/HttpTimeoutConfig;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/RequestExtensionsKt$toActionApiRequest$1;->httpTimeoutConfig:Lcom/whoop/network/request/HttpTimeoutConfig;

    return-object v0
.end method

.method public getMethod()Li63/t;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/RequestExtensionsKt$toActionApiRequest$1;->method:Li63/t;

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

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/RequestExtensionsKt$toActionApiRequest$1;->parameters:Ljava/util/Map;

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/RequestExtensionsKt$toActionApiRequest$1;->path:Ljava/lang/String;

    return-object v0
.end method

.method public getTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/RequestExtensionsKt$toActionApiRequest$1;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public bridge url(Lsr2/y;)Ljava/lang/String;
    .locals 0

    invoke-super {p0, p1}, Lz02/a;->url(Lsr2/y;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
