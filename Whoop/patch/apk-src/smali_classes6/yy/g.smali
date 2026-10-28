.class public final Lyy/g;
.super Lyy/m0;
.source "SourceFile"


# instance fields
.field public final a:Lyy/k0;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/util/Map;

.field public final d:Lyy/f;

.field public final e:Lqy/c;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Li93/j;

.field public final j:Ljava/util/LinkedHashMap;

.field public k:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lyy/k0;Ljava/lang/String;Ljava/util/Map;Lyy/f;Lqy/c;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    const-string v0, "baseUrl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiVersion"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyy/g;->a:Lyy/k0;

    iput-object p2, p0, Lyy/g;->b:Ljava/lang/String;

    iput-object p3, p0, Lyy/g;->c:Ljava/util/Map;

    iput-object p4, p0, Lyy/g;->d:Lyy/f;

    iput-object p5, p0, Lyy/g;->e:Lqy/c;

    iput-object p6, p0, Lyy/g;->f:Ljava/lang/String;

    iput-object p7, p0, Lyy/g;->g:Ljava/lang/String;

    if-eqz p3, :cond_0

    invoke-static {p3}, Lyy/q;->b(Ljava/util/Map;)Ljava/util/HashMap;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p2, p1}, Lyy/q;->g(Ljava/lang/String;Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Lyv0/h;

    const/16 p1, 0xa

    invoke-direct {v4, p1}, Lyv0/h;-><init>(I)V

    const/16 v5, 0x1e

    const-string v1, "&"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    const-string p1, ""

    :cond_1
    iput-object p1, p0, Lyy/g;->h:Ljava/lang/String;

    new-instance p1, Lyy/c0;

    invoke-direct {p1, p4, p5, p6, p7}, Lyy/c0;-><init>(Lyy/f;Lqy/c;Ljava/lang/String;Ljava/lang/String;)V

    sget-object p2, Lyy/l0;->x:Lyy/l0;

    sget-object p2, Lyy/u;->a:Li93/j;

    iput-object p2, p0, Lyy/g;->i:Li93/j;

    invoke-virtual {p1}, Lyy/e0;->a()Ljava/util/LinkedHashMap;

    move-result-object p2

    iput-object p2, p0, Lyy/g;->j:Ljava/util/LinkedHashMap;

    iget-object p1, p1, Lyy/c0;->h:Ljava/util/Map;

    iput-object p1, p0, Lyy/g;->k:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lyy/g;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lyy/g;

    iget-object v1, p0, Lyy/g;->a:Lyy/k0;

    iget-object v2, p1, Lyy/g;->a:Lyy/k0;

    if-eq v1, v2, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lyy/g;->b:Ljava/lang/String;

    iget-object v2, p1, Lyy/g;->b:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lyy/g;->c:Ljava/util/Map;

    iget-object v2, p1, Lyy/g;->c:Ljava/util/Map;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    iget-object v1, p0, Lyy/g;->d:Lyy/f;

    iget-object v2, p1, Lyy/g;->d:Lyy/f;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    iget-object v1, p0, Lyy/g;->e:Lqy/c;

    iget-object v2, p1, Lyy/g;->e:Lqy/c;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_0

    :cond_6
    iget-object v1, p0, Lyy/g;->f:Ljava/lang/String;

    iget-object v2, p1, Lyy/g;->f:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_0

    :cond_7
    iget-object v1, p0, Lyy/g;->g:Ljava/lang/String;

    iget-object p1, p1, Lyy/g;->g:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_8
    return v0
.end method

.method public final getHeaders()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lyy/g;->j:Ljava/util/LinkedHashMap;

    return-object v0
.end method

.method public final getMethod()Lyy/k0;
    .locals 1

    iget-object v0, p0, Lyy/g;->a:Lyy/k0;

    return-object v0
.end method

.method public final getPostHeaders()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lyy/g;->k:Ljava/util/Map;

    return-object v0
.end method

.method public final getRetryResponseCodes()Ljava/lang/Iterable;
    .locals 1

    iget-object v0, p0, Lyy/g;->i:Li93/j;

    return-object v0
.end method

.method public final getShouldCache()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 8

    sget-object v0, Lyy/k0;->x:Lyy/k0;

    iget-object v1, p0, Lyy/g;->b:Ljava/lang/String;

    iget-object v2, p0, Lyy/g;->a:Lyy/k0;

    if-eq v0, v2, :cond_1

    sget-object v0, Lyy/k0;->z:Lyy/k0;

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    return-object v1

    :cond_1
    :goto_0
    iget-object v0, p0, Lyy/g;->h:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/4 v0, 0x0

    const-string v3, "?"

    invoke-static {v1, v3, v0}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v3, "&"

    :cond_3
    const/4 v6, 0x0

    const/16 v7, 0x3e

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lyy/g;->a:Lyy/k0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lyy/g;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Lyy/g;->c:Ljava/util/Map;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lyy/g;->d:Lyy/f;

    invoke-virtual {v3}, Lyy/f;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-object v0, p0, Lyy/g;->e:Lqy/c;

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lqy/c;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-object v0, p0, Lyy/g;->f:Ljava/lang/String;

    invoke-static {v3, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lyy/g;->g:Ljava/lang/String;

    invoke-static {v0, v1, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final setPostHeaders(Ljava/util/Map;)V
    .locals 0

    iput-object p1, p0, Lyy/g;->k:Ljava/util/Map;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lyy/g;->a:Lyy/k0;

    iget-object v0, v0, Lyy/k0;->w:Ljava/lang/String;

    iget-object v1, p0, Lyy/g;->b:Ljava/lang/String;

    const-string v2, " "

    invoke-static {v0, v2, v1}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writePostBody(Ljava/io/OutputStream;)V
    .locals 7

    :try_start_0
    iget-object v0, p0, Lyy/g;->h:Ljava/lang/String;

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
