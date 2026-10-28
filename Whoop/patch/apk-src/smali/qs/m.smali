.class public abstract Lqs/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lvs/i4;->CONFIG_NAME_FIELD_NUMBER:I

    :try_start_0
    invoke-static {}, Lqs/m;->a()V
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
    .locals 15

    sget-object v0, Lcom/google/crypto/tink/internal/y;->b:Lcom/google/crypto/tink/internal/y;

    sget-object v1, Lqs/g;->c:Lqs/g;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/y;->d(Lfs/l;)V

    sget-object v1, Lqs/g;->d:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v1, Lqs/g;->b:Lqs/g;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/y;->d(Lfs/l;)V

    sget v1, Lqs/i;->f:I

    invoke-static {v1}, Lih0/d0;->b(I)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v2, Lrs/d;->a:Lwe/o;

    sget-object v2, Lcom/google/crypto/tink/internal/z;->b:Lcom/google/crypto/tink/internal/z;

    sget-object v3, Lrs/d;->c:Lcom/google/crypto/tink/internal/d0;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/z;->f(Lcom/google/crypto/tink/internal/d0;)V

    sget-object v3, Lrs/d;->d:Lcom/google/crypto/tink/internal/b0;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/z;->e(Lcom/google/crypto/tink/internal/b0;)V

    sget-object v3, Lrs/d;->e:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v3, Lrs/d;->f:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    sget-object v3, Lqs/i;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, v3}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v3, Lqs/i;->b:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, v3}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v3, Lcom/google/crypto/tink/internal/x;->b:Lcom/google/crypto/tink/internal/x;

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    const-string v5, "HMAC_SHA256_128BITTAG"

    sget-object v6, Lqs/o;->a:Lqs/l;

    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lqs/l;->b()Lzt/q;

    move-result-object v5

    const/16 v6, 0x20

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iput-object v7, v5, Lzt/q;->x:Ljava/lang/Object;

    const/16 v8, 0x10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    iput-object v9, v5, Lzt/q;->y:Ljava/lang/Object;

    sget-object v10, Lqs/k;->e:Lqs/k;

    iput-object v10, v5, Lzt/q;->E:Ljava/lang/Object;

    sget-object v11, Lqs/j;->d:Lqs/j;

    iput-object v11, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->n()Lqs/l;

    move-result-object v5

    const-string v12, "HMAC_SHA256_128BITTAG_RAW"

    invoke-virtual {v4, v12, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lqs/l;->b()Lzt/q;

    move-result-object v5

    iput-object v7, v5, Lzt/q;->x:Ljava/lang/Object;

    iput-object v7, v5, Lzt/q;->y:Ljava/lang/Object;

    sget-object v12, Lqs/k;->b:Lqs/k;

    iput-object v12, v5, Lzt/q;->E:Ljava/lang/Object;

    iput-object v11, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->n()Lqs/l;

    move-result-object v5

    const-string v13, "HMAC_SHA256_256BITTAG"

    invoke-virtual {v4, v13, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lqs/l;->b()Lzt/q;

    move-result-object v5

    iput-object v7, v5, Lzt/q;->x:Ljava/lang/Object;

    iput-object v7, v5, Lzt/q;->y:Ljava/lang/Object;

    iput-object v10, v5, Lzt/q;->E:Ljava/lang/Object;

    iput-object v11, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->n()Lqs/l;

    move-result-object v5

    const-string v11, "HMAC_SHA256_256BITTAG_RAW"

    invoke-virtual {v4, v11, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lqs/l;->b()Lzt/q;

    move-result-object v5

    const/16 v11, 0x40

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    iput-object v11, v5, Lzt/q;->x:Ljava/lang/Object;

    iput-object v9, v5, Lzt/q;->y:Ljava/lang/Object;

    iput-object v12, v5, Lzt/q;->E:Ljava/lang/Object;

    sget-object v13, Lqs/j;->f:Lqs/j;

    iput-object v13, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->n()Lqs/l;

    move-result-object v5

    const-string v14, "HMAC_SHA512_128BITTAG"

    invoke-virtual {v4, v14, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lqs/l;->b()Lzt/q;

    move-result-object v5

    iput-object v11, v5, Lzt/q;->x:Ljava/lang/Object;

    iput-object v9, v5, Lzt/q;->y:Ljava/lang/Object;

    iput-object v10, v5, Lzt/q;->E:Ljava/lang/Object;

    iput-object v13, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->n()Lqs/l;

    move-result-object v5

    const-string v9, "HMAC_SHA512_128BITTAG_RAW"

    invoke-virtual {v4, v9, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lqs/l;->b()Lzt/q;

    move-result-object v5

    iput-object v11, v5, Lzt/q;->x:Ljava/lang/Object;

    iput-object v7, v5, Lzt/q;->y:Ljava/lang/Object;

    iput-object v12, v5, Lzt/q;->E:Ljava/lang/Object;

    iput-object v13, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->n()Lqs/l;

    move-result-object v5

    const-string v9, "HMAC_SHA512_256BITTAG"

    invoke-virtual {v4, v9, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lqs/l;->b()Lzt/q;

    move-result-object v5

    iput-object v11, v5, Lzt/q;->x:Ljava/lang/Object;

    iput-object v7, v5, Lzt/q;->y:Ljava/lang/Object;

    iput-object v10, v5, Lzt/q;->E:Ljava/lang/Object;

    iput-object v13, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->n()Lqs/l;

    move-result-object v5

    const-string v7, "HMAC_SHA512_256BITTAG_RAW"

    invoke-virtual {v4, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "HMAC_SHA512_512BITTAG"

    sget-object v7, Lqs/o;->b:Lqs/l;

    invoke-virtual {v4, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lqs/l;->b()Lzt/q;

    move-result-object v5

    iput-object v11, v5, Lzt/q;->x:Ljava/lang/Object;

    iput-object v11, v5, Lzt/q;->y:Ljava/lang/Object;

    iput-object v10, v5, Lzt/q;->E:Ljava/lang/Object;

    iput-object v13, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->n()Lqs/l;

    move-result-object v5

    const-string v7, "HMAC_SHA512_512BITTAG_RAW"

    invoke-virtual {v4, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v4}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/crypto/tink/internal/x;->b(Ljava/util/Map;)V

    sget-object v4, Lcom/google/crypto/tink/internal/t;->b:Lcom/google/crypto/tink/internal/t;

    sget-object v5, Lqs/i;->e:Lcom/google/crypto/tink/internal/s;

    const-class v7, Lqs/l;

    invoke-virtual {v4, v5, v7}, Lcom/google/crypto/tink/internal/t;->a(Lcom/google/crypto/tink/internal/s;Ljava/lang/Class;)V

    sget-object v5, Lcom/google/crypto/tink/internal/u;->b:Lcom/google/crypto/tink/internal/u;

    sget-object v9, Lqs/i;->d:Lgs/h;

    invoke-virtual {v5, v9, v7}, Lcom/google/crypto/tink/internal/u;->a(Lgs/h;Ljava/lang/Class;)V

    sget-object v5, Lcom/google/crypto/tink/internal/j;->d:Lcom/google/crypto/tink/internal/j;

    sget-object v7, Lqs/i;->c:Lcom/google/crypto/tink/internal/p;

    const/4 v9, 0x1

    invoke-virtual {v5, v7, v1, v9}, Lcom/google/crypto/tink/internal/j;->d(Lcom/google/crypto/tink/internal/p;IZ)V

    invoke-static {}, Lks/a;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    sget-object v1, Lqs/b;->a:Lcom/google/crypto/tink/internal/s;

    invoke-static {v9}, Lih0/d0;->a(I)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lrs/a;->a:Lcom/google/crypto/tink/internal/d0;

    invoke-virtual {v2, v1}, Lcom/google/crypto/tink/internal/z;->f(Lcom/google/crypto/tink/internal/d0;)V

    sget-object v1, Lrs/a;->b:Lcom/google/crypto/tink/internal/b0;

    invoke-virtual {v2, v1}, Lcom/google/crypto/tink/internal/z;->e(Lcom/google/crypto/tink/internal/b0;)V

    sget-object v1, Lrs/a;->c:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v2, v1}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v1, Lrs/a;->d:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v2, v1}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    sget-object v1, Lqs/b;->a:Lcom/google/crypto/tink/internal/s;

    const-class v2, Lqs/d;

    invoke-virtual {v4, v1, v2}, Lcom/google/crypto/tink/internal/t;->a(Lcom/google/crypto/tink/internal/s;Ljava/lang/Class;)V

    sget-object v1, Lqs/b;->b:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v1, Lqs/b;->c:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, Lqs/o;->c:Lqs/d;

    const-string v2, "AES_CMAC"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "AES256_CMAC"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lqs/d;->b()La3/p;

    move-result-object v1

    invoke-virtual {v1, v6}, La3/p;->S(I)V

    invoke-virtual {v1, v8}, La3/p;->V(I)V

    sget-object v2, Lqs/c;->e:Lqs/c;

    iput-object v2, v1, La3/p;->z:Ljava/lang/Object;

    invoke-virtual {v1}, La3/p;->o()Lqs/d;

    move-result-object v1

    const-string v2, "AES256_CMAC_RAW"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/google/crypto/tink/internal/x;->b(Ljava/util/Map;)V

    sget-object v0, Lqs/b;->d:Lcom/google/crypto/tink/internal/p;

    invoke-virtual {v5, v0, v9}, Lcom/google/crypto/tink/internal/j;->c(Lcom/google/crypto/tink/internal/p;Z)V

    return-void

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Registering AES CMAC is not supported in FIPS mode"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
