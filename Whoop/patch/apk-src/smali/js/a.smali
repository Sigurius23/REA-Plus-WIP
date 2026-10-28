.class public abstract Ljs/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lvs/i4;->CONFIG_NAME_FIELD_NUMBER:I

    :try_start_0
    invoke-static {}, Ljs/a;->a()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static a()V
    .locals 9

    invoke-static {}, Lls/e;->a()V

    invoke-static {}, Lns/q;->a()V

    sget v0, Lts/n;->a:I

    sget-object v0, Lcom/google/crypto/tink/internal/y;->b:Lcom/google/crypto/tink/internal/y;

    sget-object v1, Lts/r;->a:Lts/r;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/y;->d(Lfs/l;)V

    sget-object v1, Lts/r;->b:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget v1, Lts/j;->e:I

    invoke-static {v1}, Lih0/d0;->b(I)Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object v2, Lus/c;->a:Lcom/google/crypto/tink/internal/d0;

    sget-object v2, Lcom/google/crypto/tink/internal/z;->b:Lcom/google/crypto/tink/internal/z;

    sget-object v3, Lus/c;->a:Lcom/google/crypto/tink/internal/d0;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/z;->f(Lcom/google/crypto/tink/internal/d0;)V

    sget-object v3, Lus/c;->b:Lcom/google/crypto/tink/internal/b0;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/z;->e(Lcom/google/crypto/tink/internal/b0;)V

    sget-object v3, Lus/c;->c:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v3, Lus/c;->d:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    sget-object v3, Lts/j;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, v3}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v3, Lcom/google/crypto/tink/internal/x;->b:Lcom/google/crypto/tink/internal/x;

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    const-string v5, "HMAC_SHA256_PRF"

    sget-object v6, Lts/l;->b:Lts/k;

    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "HMAC_SHA512_PRF"

    sget-object v6, Lts/l;->c:Lts/k;

    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v4}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/crypto/tink/internal/x;->b(Ljava/util/Map;)V

    sget-object v4, Lcom/google/crypto/tink/internal/t;->b:Lcom/google/crypto/tink/internal/t;

    sget-object v5, Lts/j;->c:Lcom/google/crypto/tink/internal/s;

    const-class v6, Lts/k;

    invoke-virtual {v4, v5, v6}, Lcom/google/crypto/tink/internal/t;->a(Lcom/google/crypto/tink/internal/s;Ljava/lang/Class;)V

    sget-object v5, Lcom/google/crypto/tink/internal/u;->b:Lcom/google/crypto/tink/internal/u;

    sget-object v7, Lts/j;->d:Lgs/h;

    invoke-virtual {v5, v7, v6}, Lcom/google/crypto/tink/internal/u;->a(Lgs/h;Ljava/lang/Class;)V

    sget-object v5, Lcom/google/crypto/tink/internal/j;->d:Lcom/google/crypto/tink/internal/j;

    sget-object v6, Lts/j;->b:Lcom/google/crypto/tink/internal/p;

    const/4 v7, 0x1

    invoke-virtual {v5, v6, v1, v7}, Lcom/google/crypto/tink/internal/j;->d(Lcom/google/crypto/tink/internal/p;IZ)V

    invoke-static {}, Lks/a;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_0

    :cond_0
    sget-object v1, Lts/c;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-static {v7}, Lih0/d0;->a(I)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Lus/a;->a:Lcom/google/crypto/tink/internal/d0;

    invoke-virtual {v2, v1}, Lcom/google/crypto/tink/internal/z;->f(Lcom/google/crypto/tink/internal/d0;)V

    sget-object v1, Lus/a;->b:Lcom/google/crypto/tink/internal/b0;

    invoke-virtual {v2, v1}, Lcom/google/crypto/tink/internal/z;->e(Lcom/google/crypto/tink/internal/b0;)V

    sget-object v1, Lus/a;->c:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v2, v1}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v1, Lus/a;->d:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v2, v1}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    sget-object v1, Lts/c;->c:Lcom/google/crypto/tink/internal/s;

    const-class v6, Lts/d;

    invoke-virtual {v4, v1, v6}, Lcom/google/crypto/tink/internal/t;->a(Lcom/google/crypto/tink/internal/s;Ljava/lang/Class;)V

    sget-object v1, Lts/c;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sget-object v6, Lts/l;->d:Lts/d;

    const-string v8, "AES256_CMAC_PRF"

    invoke-virtual {v1, v8, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v8, "AES_CMAC_PRF"

    invoke-virtual {v1, v8, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/google/crypto/tink/internal/x;->b(Ljava/util/Map;)V

    sget-object v1, Lts/c;->b:Lcom/google/crypto/tink/internal/p;

    invoke-virtual {v5, v1, v7}, Lcom/google/crypto/tink/internal/j;->c(Lcom/google/crypto/tink/internal/p;Z)V

    sget-object v1, Lts/f;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-static {v7}, Lih0/d0;->a(I)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lus/b;->a:Lcom/google/crypto/tink/internal/d0;

    invoke-virtual {v2, v1}, Lcom/google/crypto/tink/internal/z;->f(Lcom/google/crypto/tink/internal/d0;)V

    sget-object v1, Lus/b;->b:Lcom/google/crypto/tink/internal/b0;

    invoke-virtual {v2, v1}, Lcom/google/crypto/tink/internal/z;->e(Lcom/google/crypto/tink/internal/b0;)V

    sget-object v1, Lus/b;->c:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v2, v1}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v1, Lus/b;->d:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v2, v1}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    sget-object v1, Lts/f;->b:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v1, Lts/f;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v0, Lts/f;->d:Lcom/google/crypto/tink/internal/s;

    const-class v1, Lts/h;

    invoke-virtual {v4, v0, v1}, Lcom/google/crypto/tink/internal/t;->a(Lcom/google/crypto/tink/internal/s;Ljava/lang/Class;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "HKDF_SHA256"

    sget-object v2, Lts/l;->a:Lts/h;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/google/crypto/tink/internal/x;->b(Ljava/util/Map;)V

    sget-object v0, Lts/f;->c:Lcom/google/crypto/tink/internal/p;

    invoke-virtual {v5, v0, v7}, Lcom/google/crypto/tink/internal/j;->c(Lcom/google/crypto/tink/internal/p;Z)V

    :goto_0
    invoke-static {}, Lws/b0;->a()V

    invoke-static {}, Lys/i;->a()V

    return-void

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Registering HKDF PRF is not supported in FIPS mode"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Registering AES CMAC PRF is not supported in FIPS mode"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
