.class public abstract Lys/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lvs/i4;->CONFIG_NAME_FIELD_NUMBER:I

    :try_start_0
    invoke-static {}, Lys/i;->a()V
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
    .locals 8

    sget-object v0, Lcom/google/crypto/tink/internal/y;->b:Lcom/google/crypto/tink/internal/y;

    sget-object v1, Lys/k;->a:Lys/k;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/y;->d(Lfs/l;)V

    sget-object v1, Lys/k;->b:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    invoke-static {}, Lks/a;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    sget-object v1, Lys/b;->a:Lcom/google/crypto/tink/internal/f0;

    const/4 v1, 0x1

    invoke-static {v1}, Lih0/d0;->a(I)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v2, Lzs/b;->a:Lcom/google/crypto/tink/internal/d0;

    sget-object v2, Lcom/google/crypto/tink/internal/z;->b:Lcom/google/crypto/tink/internal/z;

    sget-object v3, Lzs/b;->a:Lcom/google/crypto/tink/internal/d0;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/z;->f(Lcom/google/crypto/tink/internal/d0;)V

    sget-object v3, Lzs/b;->b:Lcom/google/crypto/tink/internal/b0;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/z;->e(Lcom/google/crypto/tink/internal/b0;)V

    sget-object v3, Lzs/b;->c:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v3, Lzs/b;->d:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    sget-object v3, Lcom/google/crypto/tink/internal/x;->b:Lcom/google/crypto/tink/internal/x;

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    const-string v5, "AES128_CTR_HMAC_SHA256_4KB"

    sget-object v6, Lys/h;->a:Lys/d;

    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "AES128_CTR_HMAC_SHA256_1MB"

    sget-object v6, Lys/h;->b:Lys/d;

    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "AES256_CTR_HMAC_SHA256_4KB"

    sget-object v6, Lys/h;->c:Lys/d;

    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "AES256_CTR_HMAC_SHA256_1MB"

    sget-object v6, Lys/h;->d:Lys/d;

    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v4}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/crypto/tink/internal/x;->b(Ljava/util/Map;)V

    sget-object v4, Lcom/google/crypto/tink/internal/t;->b:Lcom/google/crypto/tink/internal/t;

    sget-object v5, Lys/b;->b:Lcom/google/crypto/tink/internal/s;

    const-class v6, Lys/d;

    invoke-virtual {v4, v5, v6}, Lcom/google/crypto/tink/internal/t;->a(Lcom/google/crypto/tink/internal/s;Ljava/lang/Class;)V

    sget-object v5, Lys/b;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, v5}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v5, Lcom/google/crypto/tink/internal/j;->d:Lcom/google/crypto/tink/internal/j;

    sget-object v6, Lys/b;->c:Lcom/google/crypto/tink/internal/p;

    invoke-virtual {v5, v6, v1}, Lcom/google/crypto/tink/internal/j;->c(Lcom/google/crypto/tink/internal/p;Z)V

    sget-object v6, Lys/f;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-static {v1}, Lih0/d0;->a(I)Z

    move-result v6

    if-eqz v6, :cond_1

    sget-object v6, Lzs/c;->a:Lcom/google/crypto/tink/internal/d0;

    invoke-virtual {v2, v6}, Lcom/google/crypto/tink/internal/z;->f(Lcom/google/crypto/tink/internal/d0;)V

    sget-object v6, Lzs/c;->b:Lcom/google/crypto/tink/internal/b0;

    invoke-virtual {v2, v6}, Lcom/google/crypto/tink/internal/z;->e(Lcom/google/crypto/tink/internal/b0;)V

    sget-object v6, Lzs/c;->c:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v2, v6}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v6, Lzs/c;->d:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v2, v6}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v6, "AES128_GCM_HKDF_4KB"

    sget-object v7, Lys/h;->e:Lys/g;

    invoke-virtual {v2, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "AES128_GCM_HKDF_1MB"

    sget-object v7, Lys/h;->f:Lys/g;

    invoke-virtual {v2, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "AES256_GCM_HKDF_4KB"

    sget-object v7, Lys/h;->g:Lys/g;

    invoke-virtual {v2, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "AES256_GCM_HKDF_1MB"

    sget-object v7, Lys/h;->h:Lys/g;

    invoke-virtual {v2, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/google/crypto/tink/internal/x;->b(Ljava/util/Map;)V

    sget-object v2, Lcom/google/crypto/tink/internal/u;->b:Lcom/google/crypto/tink/internal/u;

    sget-object v3, Lys/f;->d:Lgs/h;

    const-class v6, Lys/g;

    invoke-virtual {v2, v3, v6}, Lcom/google/crypto/tink/internal/u;->a(Lgs/h;Ljava/lang/Class;)V

    sget-object v2, Lys/f;->c:Lcom/google/crypto/tink/internal/s;

    invoke-virtual {v4, v2, v6}, Lcom/google/crypto/tink/internal/t;->a(Lcom/google/crypto/tink/internal/s;Ljava/lang/Class;)V

    sget-object v2, Lys/f;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, v2}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v0, Lys/f;->b:Lcom/google/crypto/tink/internal/p;

    invoke-virtual {v5, v0, v1}, Lcom/google/crypto/tink/internal/j;->c(Lcom/google/crypto/tink/internal/p;Z)V

    return-void

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Registering AES-GCM HKDF Streaming AEAD is not supported in FIPS mode"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Registering AES CTR HMAC Streaming AEAD is not supported in FIPS mode"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
