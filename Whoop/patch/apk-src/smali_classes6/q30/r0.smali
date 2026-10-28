.class public final Lq30/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final w:Lq30/n;


# direct methods
.method public constructor <init>(Lq30/n;)V
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq30/r0;->w:Lq30/n;

    return-void
.end method


# virtual methods
.method public final a(Ln30/d;Lq83/j;)Lq30/t0;
    .locals 13

    const-string v0, "errorReporter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lxl/a;

    invoke-direct {v1, p1}, Lxl/a;-><init>(Ln30/d;)V

    iget-object v0, v1, Lxl/a;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/security/KeyFactory;

    new-instance v3, Lq30/t0;

    iget-object v4, p0, Lq30/r0;->w:Lq30/n;

    move-object v5, v4

    iget-object v4, v5, Lq30/n;->w:Lo30/d;

    move-object v6, v5

    iget-object v5, v6, Lq30/n;->x:Ljava/lang/String;

    iget-object v7, v6, Lq30/n;->E:Lq30/m;

    iget-object v0, v7, Lq30/m;->w:[B

    const-string v8, "privateKeyEncoded"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v8, Ljava/security/spec/PKCS8EncodedKeySpec;

    invoke-direct {v8, v0}, Ljava/security/spec/PKCS8EncodedKeySpec;-><init>([B)V

    invoke-virtual {v2, v8}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object v0

    const-string v8, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/security/interfaces/ECPrivateKey;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v8

    if-nez v8, :cond_2

    move-object v8, v0

    check-cast v8, Ljava/security/interfaces/ECPrivateKey;

    iget-object v0, v7, Lq30/m;->x:[B

    const-string v7, "publicKeyEncoded"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_1
    new-instance v7, Ljava/security/spec/X509EncodedKeySpec;

    invoke-direct {v7, v0}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    invoke-virtual {v2, v7}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type java.security.interfaces.ECPublicKey"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/security/interfaces/ECPublicKey;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lxl/a;->x:Ljava/lang/Object;

    check-cast v1, Ln30/d;

    check-cast v1, Ln30/c;

    invoke-virtual {v1, v2}, Ln30/c;->c(Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_1

    move-object v7, v0

    check-cast v7, Ljava/security/interfaces/ECPublicKey;

    iget-object v0, v6, Lq30/n;->z:Ljava/lang/String;

    new-instance v10, Lo30/e;

    invoke-direct {v10, p1}, Lo30/e;-><init>(Ln30/d;)V

    iget-object v12, p0, Lq30/r0;->w:Lq30/n;

    move-object v9, p1

    move-object v11, p2

    move-object v6, v8

    move-object v8, v0

    invoke-direct/range {v3 .. v12}, Lq30/t0;-><init>(Lo30/d;Ljava/lang/String;Ljava/security/interfaces/ECPrivateKey;Ljava/security/interfaces/ECPublicKey;Ljava/lang/String;Ln30/d;Lo30/e;Lq83/j;Lq30/n;)V

    return-object v3

    :cond_1
    new-instance p1, Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;

    invoke-direct {p1, v1}, Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_2
    new-instance p1, Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;

    invoke-direct {p1, v8}, Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method
