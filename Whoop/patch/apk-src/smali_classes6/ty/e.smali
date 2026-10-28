.class public final Lty/e;
.super Lyy/m0;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lyy/k0;

.field public final c:Li93/j;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/LinkedHashMap;

.field public f:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lty/e;->a:Ljava/lang/Object;

    new-instance p2, Lyy/d0;

    invoke-direct {p2, p1}, Lyy/d0;-><init>(Ljava/lang/String;)V

    sget-object p1, Lyy/k0;->y:Lyy/k0;

    iput-object p1, p0, Lty/e;->b:Lyy/k0;

    sget-object p1, Lyy/l0;->x:Lyy/l0;

    sget-object p1, Lyy/u;->a:Li93/j;

    iput-object p1, p0, Lty/e;->c:Li93/j;

    const-string p1, "https://m.stripe.com/6"

    iput-object p1, p0, Lty/e;->d:Ljava/lang/String;

    invoke-virtual {p2}, Lyy/e0;->a()Ljava/util/LinkedHashMap;

    move-result-object p1

    iput-object p1, p0, Lty/e;->e:Ljava/util/LinkedHashMap;

    iget-object p1, p2, Lyy/d0;->d:Ljava/util/Map;

    iput-object p1, p0, Lty/e;->f:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final getHeaders()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lty/e;->e:Ljava/util/LinkedHashMap;

    return-object v0
.end method

.method public final getMethod()Lyy/k0;
    .locals 1

    iget-object v0, p0, Lty/e;->b:Lyy/k0;

    return-object v0
.end method

.method public final getPostHeaders()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lty/e;->f:Ljava/util/Map;

    return-object v0
.end method

.method public final getRetryResponseCodes()Ljava/lang/Iterable;
    .locals 1

    iget-object v0, p0, Lty/e;->c:Li93/j;

    return-object v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lty/e;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final setPostHeaders(Ljava/util/Map;)V
    .locals 0

    iput-object p1, p0, Lty/e;->f:Ljava/util/Map;

    return-void
.end method

.method public final writePostBody(Ljava/io/OutputStream;)V
    .locals 7

    :try_start_0
    iget-object v0, p0, Lty/e;->a:Ljava/lang/Object;

    invoke-static {v0}, Ls/s;->o(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, "getBytes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v5, p1

    new-instance v0, Lcom/stripe/android/core/exception/InvalidRequestException;

    sget-object p1, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Unable to encode parameters to "

    const-string v2, ". Please contact support@stripe.com for assistance."

    invoke-static {v1, p1, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v2, 0x7

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/core/exception/InvalidRequestException;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lqy/f;)V

    throw v0
.end method
