.class public final Lcom/whoop/domain/model/AndroidUri;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/domain/model/WhoopUri;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\tH\u0016J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\tH\u0016J\n\u0010\u0018\u001a\u00020\tH\u0096\u0080\u0004J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0083\u0004J\n\u0010\u001f\u001a\u00020 H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0016\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0016\u0010\u000c\u001a\u0004\u0018\u00010\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000bR\u001a\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000fX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u000b\u00a8\u0006!"
    }
    d2 = {
        "Lcom/whoop/domain/model/AndroidUri;",
        "Lcom/whoop/domain/model/WhoopUri;",
        "uri",
        "Landroid/net/Uri;",
        "<init>",
        "(Landroid/net/Uri;)V",
        "getUri",
        "()Landroid/net/Uri;",
        "host",
        "",
        "getHost",
        "()Ljava/lang/String;",
        "scheme",
        "getScheme",
        "pathSegments",
        "",
        "getPathSegments",
        "()Ljava/util/List;",
        "query",
        "getQuery",
        "getQueryParameter",
        "key",
        "parse",
        "deepLinkString",
        "toString",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "essentials_release"
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
.field private final host:Ljava/lang/String;

.field private final pathSegments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final query:Ljava/lang/String;

.field private final scheme:Ljava/lang/String;

.field private final uri:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/net/Uri;)V
    .locals 1

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/domain/model/AndroidUri;->uri:Landroid/net/Uri;

    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/domain/model/AndroidUri;->host:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/domain/model/AndroidUri;->scheme:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_0
    iput-object v0, p0, Lcom/whoop/domain/model/AndroidUri;->pathSegments:Ljava/util/List;

    invoke-virtual {p1}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/domain/model/AndroidUri;->query:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/AndroidUri;Landroid/net/Uri;ILjava/lang/Object;)Lcom/whoop/domain/model/AndroidUri;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/whoop/domain/model/AndroidUri;->uri:Landroid/net/Uri;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/whoop/domain/model/AndroidUri;->copy(Landroid/net/Uri;)Lcom/whoop/domain/model/AndroidUri;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/AndroidUri;->uri:Landroid/net/Uri;

    return-object v0
.end method

.method public final copy(Landroid/net/Uri;)Lcom/whoop/domain/model/AndroidUri;
    .locals 1

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/domain/model/AndroidUri;

    invoke-direct {v0, p1}, Lcom/whoop/domain/model/AndroidUri;-><init>(Landroid/net/Uri;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/domain/model/AndroidUri;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/model/AndroidUri;

    iget-object v1, p0, Lcom/whoop/domain/model/AndroidUri;->uri:Landroid/net/Uri;

    iget-object p1, p1, Lcom/whoop/domain/model/AndroidUri;->uri:Landroid/net/Uri;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public getHost()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/AndroidUri;->host:Ljava/lang/String;

    return-object v0
.end method

.method public getPathSegments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/domain/model/AndroidUri;->pathSegments:Ljava/util/List;

    return-object v0
.end method

.method public getQuery()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/AndroidUri;->query:Ljava/lang/String;

    return-object v0
.end method

.method public getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/domain/model/AndroidUri;->uri:Landroid/net/Uri;

    invoke-virtual {v0, p1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getScheme()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/AndroidUri;->scheme:Ljava/lang/String;

    return-object v0
.end method

.method public final getUri()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/AndroidUri;->uri:Landroid/net/Uri;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/AndroidUri;->uri:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->hashCode()I

    move-result v0

    return v0
.end method

.method public parse(Ljava/lang/String;)Lcom/whoop/domain/model/AndroidUri;
    .locals 2

    const-string v0, "deepLinkString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/whoop/domain/model/AndroidUri;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const-string v1, "parse(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Lcom/whoop/domain/model/AndroidUri;-><init>(Landroid/net/Uri;)V

    return-object v0
.end method

.method public bridge synthetic parse(Ljava/lang/String;)Lcom/whoop/domain/model/WhoopUri;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/domain/model/AndroidUri;->parse(Ljava/lang/String;)Lcom/whoop/domain/model/AndroidUri;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/whoop/domain/model/AndroidUri;->uri:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
