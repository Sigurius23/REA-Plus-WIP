.class final Lio/getstream/chat/android/client/cdn/internal/CDNDataSource;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz8/f;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\'\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J!\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001a0\u001b0\u0019H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(\u00a8\u0006*"
    }
    d2 = {
        "Lio/getstream/chat/android/client/cdn/internal/CDNDataSource;",
        "Lz8/f;",
        "Lio/getstream/chat/android/client/cdn/CDN;",
        "cdn",
        "upstream",
        "<init>",
        "(Lio/getstream/chat/android/client/cdn/CDN;Lz8/f;)V",
        "Lz8/g;",
        "dataSpec",
        "",
        "open",
        "(Lz8/g;)J",
        "",
        "buffer",
        "",
        "offset",
        "length",
        "read",
        "([BII)I",
        "Ll83/a0;",
        "close",
        "()V",
        "Landroid/net/Uri;",
        "getUri",
        "()Landroid/net/Uri;",
        "",
        "",
        "",
        "getResponseHeaders",
        "()Ljava/util/Map;",
        "Lz8/n;",
        "transferListener",
        "addTransferListener",
        "(Lz8/n;)V",
        "Lio/getstream/chat/android/client/cdn/CDN;",
        "Lz8/f;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final cdn:Lio/getstream/chat/android/client/cdn/CDN;

.field private final logger$delegate:Ll83/h;

.field private final upstream:Lz8/f;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/cdn/CDN;Lz8/f;)V
    .locals 1

    const-string v0, "cdn"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upstream"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/cdn/internal/CDNDataSource;->cdn:Lio/getstream/chat/android/client/cdn/CDN;

    iput-object p2, p0, Lio/getstream/chat/android/client/cdn/internal/CDNDataSource;->upstream:Lz8/f;

    const-string p1, "Chat:CDNDataSource"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/cdn/internal/CDNDataSource;->logger$delegate:Ll83/h;

    return-void
.end method

.method public static final synthetic access$getCdn$p(Lio/getstream/chat/android/client/cdn/internal/CDNDataSource;)Lio/getstream/chat/android/client/cdn/CDN;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/cdn/internal/CDNDataSource;->cdn:Lio/getstream/chat/android/client/cdn/CDN;

    return-object p0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/cdn/internal/CDNDataSource;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method


# virtual methods
.method public final addTransferListener(Lz8/n;)V
    .locals 1

    const-string v0, "transferListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/cdn/internal/CDNDataSource;->upstream:Lz8/f;

    invoke-interface {v0, p1}, Lz8/f;->addTransferListener(Lz8/n;)V

    return-void
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/cdn/internal/CDNDataSource;->upstream:Lz8/f;

    invoke-interface {v0}, Lz8/f;->close()V

    return-void
.end method

.method public final getResponseHeaders()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/cdn/internal/CDNDataSource;->upstream:Lz8/f;

    invoke-interface {v0}, Lz8/f;->getResponseHeaders()Ljava/util/Map;

    move-result-object v0

    const-string v1, "getResponseHeaders(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getUri()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/cdn/internal/CDNDataSource;->upstream:Lz8/f;

    invoke-interface {v0}, Lz8/f;->getUri()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final open(Lz8/g;)J
    .locals 14

    const-string v0, "dataSpec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lz8/g;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string v2, "http"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "https"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/cdn/internal/CDNDataSource;->upstream:Lz8/f;

    invoke-interface {v0, p1}, Lz8/f;->open(Lz8/g;)J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v0, "toString(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    :try_start_0
    new-instance v0, Lio/getstream/chat/android/client/cdn/internal/CDNDataSource$open$cdnRequest$1;

    invoke-direct {v0, p0, v1, v2}, Lio/getstream/chat/android/client/cdn/internal/CDNDataSource$open$cdnRequest$1;-><init>(Lio/getstream/chat/android/client/cdn/internal/CDNDataSource;Ljava/lang/String;Lq83/d;)V

    sget-object v3, Lq83/k;->w:Lq83/k;

    invoke-static {v3, v0}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/cdn/CDNRequest;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-direct {p0}, Lio/getstream/chat/android/client/cdn/internal/CDNDataSource;->getLogger()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v5, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->F:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    const-string v4, "[open] CDN.fileRequest() failed for url: "

    const-string v7, ". Falling back to original request."

    invoke-static {v4, v1, v7}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v6, v5, v4, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    new-instance v0, Lio/getstream/chat/android/client/cdn/CDNRequest;

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3, v2}, Lio/getstream/chat/android/client/cdn/CDNRequest;-><init>(Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    new-instance v1, Ln83/f;

    invoke-direct {v1}, Ln83/f;-><init>()V

    iget-object v2, p1, Lz8/g;->d:Ljava/util/Map;

    const-string v3, "httpRequestHeaders"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ln83/f;->putAll(Ljava/util/Map;)V

    invoke-virtual {v0}, Lio/getstream/chat/android/client/cdn/CDNRequest;->getHeaders()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v1, v2}, Ln83/f;->putAll(Ljava/util/Map;)V

    :cond_2
    invoke-virtual {v1}, Ln83/f;->b()Ln83/f;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lbb/c;

    invoke-direct {v2}, Lbb/c;-><init>()V

    iget-object v3, p1, Lz8/g;->a:Landroid/net/Uri;

    iput-object v3, v2, Lbb/c;->f:Ljava/lang/Object;

    iget v3, p1, Lz8/g;->b:I

    iput v3, v2, Lbb/c;->b:I

    iget-object v3, p1, Lz8/g;->c:[B

    iput-object v3, v2, Lbb/c;->g:Ljava/lang/Object;

    iget-object v3, p1, Lz8/g;->d:Ljava/util/Map;

    iput-object v3, v2, Lbb/c;->h:Ljava/lang/Object;

    iget-wide v3, p1, Lz8/g;->e:J

    iput-wide v3, v2, Lbb/c;->c:J

    iget-wide v3, p1, Lz8/g;->f:J

    iput-wide v3, v2, Lbb/c;->e:J

    iget-object v3, p1, Lz8/g;->g:Ljava/lang/String;

    iput-object v3, v2, Lbb/c;->i:Ljava/lang/Object;

    iget p1, p1, Lz8/g;->h:I

    iput p1, v2, Lbb/c;->d:I

    invoke-virtual {v0}, Lio/getstream/chat/android/client/cdn/CDNRequest;->getUrl()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, v2, Lbb/c;->f:Ljava/lang/Object;

    iput-object v1, v2, Lbb/c;->h:Ljava/lang/Object;

    iget-object p1, v2, Lbb/c;->f:Ljava/lang/Object;

    check-cast p1, Landroid/net/Uri;

    const-string v0, "The uri must be set."

    invoke-static {p1, v0}, Lva3/g;->k(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lz8/g;

    iget-object p1, v2, Lbb/c;->f:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Landroid/net/Uri;

    iget v5, v2, Lbb/c;->b:I

    iget-object p1, v2, Lbb/c;->g:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, [B

    iget-object p1, v2, Lbb/c;->h:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Ljava/util/Map;

    iget-wide v8, v2, Lbb/c;->c:J

    iget-wide v10, v2, Lbb/c;->e:J

    iget-object p1, v2, Lbb/c;->i:Ljava/lang/Object;

    move-object v12, p1

    check-cast v12, Ljava/lang/String;

    iget v13, v2, Lbb/c;->d:I

    invoke-direct/range {v3 .. v13}, Lz8/g;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJLjava/lang/String;I)V

    iget-object p1, p0, Lio/getstream/chat/android/client/cdn/internal/CDNDataSource;->upstream:Lz8/f;

    invoke-interface {p1, v3}, Lz8/f;->open(Lz8/g;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final read([BII)I
    .locals 1

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/cdn/internal/CDNDataSource;->upstream:Lz8/f;

    invoke-interface {v0, p1, p2, p3}, Lu8/h;->read([BII)I

    move-result p1

    return p1
.end method
