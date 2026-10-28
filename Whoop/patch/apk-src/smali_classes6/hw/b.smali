.class public Lhw/b;
.super Ljw/c;
.source "SourceFile"

# interfaces
.implements Lgw/j;


# virtual methods
.method public final a(Lgw/k;[B[B)Lb30/m;
    .locals 7

    iget-object v0, p1, Lgw/c;->w:Lgw/a;

    check-cast v0, Lgw/i;

    if-eqz v0, :cond_1

    sget-object v1, Lgw/i;->K:Lgw/i;

    invoke-virtual {v0, v1}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, v0}, Ljw/a;->b(Lgw/f;)Ljavax/crypto/SecretKey;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-object v4, v0

    iget-object v6, p0, Ljw/a;->c:Lmw/a;

    const/4 v5, 0x0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-static/range {v1 .. v6}, Ljw/b;->c(Lgw/k;[B[BLjavax/crypto/SecretKey;Lxw/b;Lmw/a;)Lb30/m;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    sget-object p2, Ljw/c;->f:Ljava/util/Set;

    invoke-static {v0, p2}, Ljw/e;->l(Lgw/i;Ljava/util/Collection;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    const-string p2, "The algorithm \"alg\" header parameter must not be null"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
.end method
