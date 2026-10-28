.class public interface abstract Lcom/whoop/network/request/GetApiRequest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz02/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lz02/a<",
        "Ll83/a0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0001\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008f\u0018\u00002\u000e\u0012\n\u0012\u0008\u0018\u00010\u0002j\u0002`\u00030\u0001R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\u000c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/network/request/GetApiRequest;",
        "Lz02/a;",
        "Ll83/a0;",
        "Lcom/whoop/network/request/NoRequestBody;",
        "Li63/t;",
        "getMethod",
        "()Li63/t;",
        "method",
        "",
        "getBody",
        "()Ljava/lang/Void;",
        "body",
        "",
        "getHasBody",
        "()Z",
        "hasBody",
        "network_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic access$getBody$jd(Lcom/whoop/network/request/GetApiRequest;)Ljava/lang/Void;
    .locals 0

    invoke-super {p0}, Lcom/whoop/network/request/GetApiRequest;->getBody()Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$getHasBody$jd(Lcom/whoop/network/request/GetApiRequest;)Z
    .locals 0

    invoke-super {p0}, Lcom/whoop/network/request/GetApiRequest;->getHasBody()Z

    move-result p0

    return p0
.end method

.method public static synthetic access$getHeaders$jd(Lcom/whoop/network/request/GetApiRequest;)Ljava/util/Map;
    .locals 0

    invoke-super {p0}, Lcom/whoop/network/request/GetApiRequest;->getHeaders()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$getHttpTimeoutConfig$jd(Lcom/whoop/network/request/GetApiRequest;)Lcom/whoop/network/request/HttpTimeoutConfig;
    .locals 0

    invoke-super {p0}, Lcom/whoop/network/request/GetApiRequest;->getHttpTimeoutConfig()Lcom/whoop/network/request/HttpTimeoutConfig;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$getMethod$jd(Lcom/whoop/network/request/GetApiRequest;)Li63/t;
    .locals 0

    invoke-super {p0}, Lcom/whoop/network/request/GetApiRequest;->getMethod()Li63/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$getParameters$jd(Lcom/whoop/network/request/GetApiRequest;)Ljava/util/Map;
    .locals 0

    invoke-super {p0}, Lcom/whoop/network/request/GetApiRequest;->getParameters()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$getTag$jd(Lcom/whoop/network/request/GetApiRequest;)Ljava/lang/String;
    .locals 0

    invoke-super {p0}, Lcom/whoop/network/request/GetApiRequest;->getTag()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$url$jd(Lcom/whoop/network/request/GetApiRequest;Lsr2/y;)Ljava/lang/String;
    .locals 0

    invoke-super {p0, p1}, Lcom/whoop/network/request/GetApiRequest;->url(Lsr2/y;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getBody()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-interface {p0}, Lcom/whoop/network/request/GetApiRequest;->getBody()Ljava/lang/Void;

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

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic getHeaders()Ljava/util/Map;
    .locals 1

    invoke-super {p0}, Lz02/a;->getHeaders()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getHttpTimeoutConfig()Lcom/whoop/network/request/HttpTimeoutConfig;
    .locals 1

    invoke-super {p0}, Lz02/a;->getHttpTimeoutConfig()Lcom/whoop/network/request/HttpTimeoutConfig;

    move-result-object v0

    return-object v0
.end method

.method public getMethod()Li63/t;
    .locals 1

    sget-object v0, Li63/t;->b:Li63/t;

    sget-object v0, Li63/t;->b:Li63/t;

    return-object v0
.end method

.method public bridge synthetic getParameters()Ljava/util/Map;
    .locals 1

    invoke-super {p0}, Lz02/a;->getParameters()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public abstract synthetic getPath()Ljava/lang/String;
.end method

.method public bridge synthetic getTag()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lz02/a;->getTag()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic url(Lsr2/y;)Ljava/lang/String;
    .locals 0

    invoke-super {p0, p1}, Lz02/a;->url(Lsr2/y;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
