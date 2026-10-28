.class public abstract Lns/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lvs/i4;->CONFIG_NAME_FIELD_NUMBER:I

    :try_start_0
    invoke-static {}, Lns/q;->a()V
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
    .locals 16

    sget-object v0, Lcom/google/crypto/tink/internal/y;->b:Lcom/google/crypto/tink/internal/y;

    sget-object v1, Lns/r;->b:Lns/r;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/y;->d(Lfs/l;)V

    sget-object v1, Lns/r;->c:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v1, Lns/r;->d:Lns/r;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/y;->d(Lfs/l;)V

    sget-object v1, Lns/r;->e:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    invoke-static {}, Lgs/a;->a()V

    invoke-static {}, Lls/e;->a()V

    invoke-static {}, Lks/a;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    sget-object v1, Lns/a;->a:Lcom/google/crypto/tink/internal/f0;

    const/4 v1, 0x1

    invoke-static {v1}, Lih0/d0;->a(I)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v2, Los/b;->a:Lcom/google/crypto/tink/internal/d0;

    sget-object v2, Lcom/google/crypto/tink/internal/z;->b:Lcom/google/crypto/tink/internal/z;

    sget-object v3, Los/b;->a:Lcom/google/crypto/tink/internal/d0;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/z;->f(Lcom/google/crypto/tink/internal/d0;)V

    sget-object v3, Los/b;->b:Lcom/google/crypto/tink/internal/b0;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/z;->e(Lcom/google/crypto/tink/internal/b0;)V

    sget-object v3, Los/b;->c:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v3, Los/b;->d:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    sget-object v3, Los/b;->e:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v3, Los/b;->f:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    sget-object v3, Lcom/google/crypto/tink/internal/x;->b:Lcom/google/crypto/tink/internal/x;

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, Lns/f;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v5

    sget-object v6, Lns/b;->b:Lns/b;

    iput-object v6, v5, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    sget-object v7, Lns/c;->d:Lns/c;

    iput-object v7, v5, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    sget-object v8, Lns/d;->c:Lns/d;

    iput-object v8, v5, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    sget-object v9, Lns/e;->b:Lns/e;

    iput-object v9, v5, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    invoke-static {}, Lgs/q;->b()Lzt/q;

    move-result-object v10

    invoke-virtual {v10}, Lzt/q;->I()V

    const/16 v11, 0x10

    invoke-virtual {v10, v11}, Lzt/q;->K(I)V

    invoke-virtual {v10}, Lzt/q;->L()V

    sget-object v12, Lgs/j;->p:Lgs/j;

    iput-object v12, v10, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v10}, Lzt/q;->j()Lgs/q;

    move-result-object v10

    invoke-virtual {v5, v10}, Lcom/google/crypto/tink/internal/k0;->O(Lfs/k;)V

    invoke-virtual {v5}, Lcom/google/crypto/tink/internal/k0;->j()Lns/f;

    move-result-object v5

    const-string v10, "ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM"

    invoke-virtual {v4, v10, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lns/f;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v5

    iput-object v6, v5, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    iput-object v7, v5, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    iput-object v8, v5, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    sget-object v10, Lns/e;->d:Lns/e;

    iput-object v10, v5, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    invoke-static {}, Lgs/q;->b()Lzt/q;

    move-result-object v13

    invoke-virtual {v13}, Lzt/q;->I()V

    invoke-virtual {v13, v11}, Lzt/q;->K(I)V

    invoke-virtual {v13}, Lzt/q;->L()V

    iput-object v12, v13, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v13}, Lzt/q;->j()Lgs/q;

    move-result-object v13

    invoke-virtual {v5, v13}, Lcom/google/crypto/tink/internal/k0;->O(Lfs/k;)V

    invoke-virtual {v5}, Lcom/google/crypto/tink/internal/k0;->j()Lns/f;

    move-result-object v5

    const-string v13, "ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW"

    invoke-virtual {v4, v13, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lns/f;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v5

    iput-object v6, v5, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    iput-object v7, v5, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    sget-object v13, Lns/d;->b:Lns/d;

    iput-object v13, v5, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    iput-object v9, v5, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    invoke-static {}, Lgs/q;->b()Lzt/q;

    move-result-object v14

    invoke-virtual {v14}, Lzt/q;->I()V

    invoke-virtual {v14, v11}, Lzt/q;->K(I)V

    invoke-virtual {v14}, Lzt/q;->L()V

    iput-object v12, v14, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v14}, Lzt/q;->j()Lgs/q;

    move-result-object v14

    invoke-virtual {v5, v14}, Lcom/google/crypto/tink/internal/k0;->O(Lfs/k;)V

    invoke-virtual {v5}, Lcom/google/crypto/tink/internal/k0;->j()Lns/f;

    move-result-object v5

    const-string v14, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM"

    invoke-virtual {v4, v14, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lns/f;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v5

    iput-object v6, v5, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    iput-object v7, v5, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    iput-object v13, v5, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    iput-object v10, v5, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    invoke-static {}, Lgs/q;->b()Lzt/q;

    move-result-object v14

    invoke-virtual {v14}, Lzt/q;->I()V

    invoke-virtual {v14, v11}, Lzt/q;->K(I)V

    invoke-virtual {v14}, Lzt/q;->L()V

    iput-object v12, v14, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v14}, Lzt/q;->j()Lgs/q;

    move-result-object v14

    invoke-virtual {v5, v14}, Lcom/google/crypto/tink/internal/k0;->O(Lfs/k;)V

    invoke-virtual {v5}, Lcom/google/crypto/tink/internal/k0;->j()Lns/f;

    move-result-object v5

    const-string v14, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW"

    invoke-virtual {v4, v14, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lns/f;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v5

    iput-object v6, v5, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    iput-object v7, v5, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    iput-object v13, v5, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    iput-object v10, v5, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    invoke-static {}, Lgs/q;->b()Lzt/q;

    move-result-object v14

    invoke-virtual {v14}, Lzt/q;->I()V

    invoke-virtual {v14, v11}, Lzt/q;->K(I)V

    invoke-virtual {v14}, Lzt/q;->L()V

    iput-object v12, v14, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v14}, Lzt/q;->j()Lgs/q;

    move-result-object v12

    invoke-virtual {v5, v12}, Lcom/google/crypto/tink/internal/k0;->O(Lfs/k;)V

    invoke-virtual {v5}, Lcom/google/crypto/tink/internal/k0;->j()Lns/f;

    move-result-object v5

    const-string v12, "ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX"

    invoke-virtual {v4, v12, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lns/f;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v5

    iput-object v6, v5, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    iput-object v7, v5, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    iput-object v8, v5, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    iput-object v9, v5, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    invoke-static {}, Lgs/k;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v12

    invoke-virtual {v12, v11}, Lcom/google/crypto/tink/internal/k0;->M(I)V

    const/16 v14, 0x20

    invoke-virtual {v12, v14}, Lcom/google/crypto/tink/internal/k0;->P(I)V

    invoke-virtual {v12, v11}, Lcom/google/crypto/tink/internal/k0;->S(I)V

    invoke-virtual {v12, v11}, Lcom/google/crypto/tink/internal/k0;->Q(I)V

    sget-object v15, Lgs/j;->e:Lgs/j;

    iput-object v15, v12, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    sget-object v1, Lgs/j;->j:Lgs/j;

    iput-object v1, v12, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    invoke-virtual {v12}, Lcom/google/crypto/tink/internal/k0;->f()Lgs/k;

    move-result-object v12

    invoke-virtual {v5, v12}, Lcom/google/crypto/tink/internal/k0;->O(Lfs/k;)V

    invoke-virtual {v5}, Lcom/google/crypto/tink/internal/k0;->j()Lns/f;

    move-result-object v5

    const-string v12, "ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256"

    invoke-virtual {v4, v12, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lns/f;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v5

    iput-object v6, v5, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    iput-object v7, v5, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    iput-object v8, v5, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    iput-object v10, v5, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    invoke-static {}, Lgs/k;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v8

    invoke-virtual {v8, v11}, Lcom/google/crypto/tink/internal/k0;->M(I)V

    invoke-virtual {v8, v14}, Lcom/google/crypto/tink/internal/k0;->P(I)V

    invoke-virtual {v8, v11}, Lcom/google/crypto/tink/internal/k0;->S(I)V

    invoke-virtual {v8, v11}, Lcom/google/crypto/tink/internal/k0;->Q(I)V

    iput-object v15, v8, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    iput-object v1, v8, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    invoke-virtual {v8}, Lcom/google/crypto/tink/internal/k0;->f()Lgs/k;

    move-result-object v8

    invoke-virtual {v5, v8}, Lcom/google/crypto/tink/internal/k0;->O(Lfs/k;)V

    invoke-virtual {v5}, Lcom/google/crypto/tink/internal/k0;->j()Lns/f;

    move-result-object v5

    const-string v8, "ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW"

    invoke-virtual {v4, v8, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lns/f;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v5

    iput-object v6, v5, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    iput-object v7, v5, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    iput-object v13, v5, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    iput-object v9, v5, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    invoke-static {}, Lgs/k;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v8

    invoke-virtual {v8, v11}, Lcom/google/crypto/tink/internal/k0;->M(I)V

    invoke-virtual {v8, v14}, Lcom/google/crypto/tink/internal/k0;->P(I)V

    invoke-virtual {v8, v11}, Lcom/google/crypto/tink/internal/k0;->S(I)V

    invoke-virtual {v8, v11}, Lcom/google/crypto/tink/internal/k0;->Q(I)V

    iput-object v15, v8, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    iput-object v1, v8, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    invoke-virtual {v8}, Lcom/google/crypto/tink/internal/k0;->f()Lgs/k;

    move-result-object v8

    invoke-virtual {v5, v8}, Lcom/google/crypto/tink/internal/k0;->O(Lfs/k;)V

    invoke-virtual {v5}, Lcom/google/crypto/tink/internal/k0;->j()Lns/f;

    move-result-object v5

    const-string v8, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256"

    invoke-virtual {v4, v8, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lns/f;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v5

    iput-object v6, v5, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    iput-object v7, v5, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    iput-object v13, v5, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    iput-object v10, v5, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    invoke-static {}, Lgs/k;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v6

    invoke-virtual {v6, v11}, Lcom/google/crypto/tink/internal/k0;->M(I)V

    invoke-virtual {v6, v14}, Lcom/google/crypto/tink/internal/k0;->P(I)V

    invoke-virtual {v6, v11}, Lcom/google/crypto/tink/internal/k0;->S(I)V

    invoke-virtual {v6, v11}, Lcom/google/crypto/tink/internal/k0;->Q(I)V

    iput-object v15, v6, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    iput-object v1, v6, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    invoke-virtual {v6}, Lcom/google/crypto/tink/internal/k0;->f()Lgs/k;

    move-result-object v1

    invoke-virtual {v5, v1}, Lcom/google/crypto/tink/internal/k0;->O(Lfs/k;)V

    invoke-virtual {v5}, Lcom/google/crypto/tink/internal/k0;->j()Lns/f;

    move-result-object v1

    const-string v5, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW"

    invoke-virtual {v4, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v4}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/google/crypto/tink/internal/x;->b(Ljava/util/Map;)V

    sget-object v1, Lns/a;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v1, Lns/a;->b:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v1, Lcom/google/crypto/tink/internal/t;->b:Lcom/google/crypto/tink/internal/t;

    sget-object v4, Lns/a;->e:Lcom/google/crypto/tink/internal/s;

    const-class v5, Lns/f;

    invoke-virtual {v1, v4, v5}, Lcom/google/crypto/tink/internal/t;->a(Lcom/google/crypto/tink/internal/s;Ljava/lang/Class;)V

    sget-object v4, Lcom/google/crypto/tink/internal/j;->d:Lcom/google/crypto/tink/internal/j;

    sget-object v5, Lns/a;->c:Lcom/google/crypto/tink/internal/o;

    const/4 v6, 0x1

    invoke-virtual {v4, v5, v6}, Lcom/google/crypto/tink/internal/j;->c(Lcom/google/crypto/tink/internal/p;Z)V

    sget-object v5, Lns/a;->d:Lcom/google/crypto/tink/internal/p;

    const/4 v7, 0x0

    invoke-virtual {v4, v5, v7}, Lcom/google/crypto/tink/internal/j;->c(Lcom/google/crypto/tink/internal/p;Z)V

    sget-object v5, Los/c;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-static {v6}, Lih0/d0;->a(I)Z

    move-result v5

    if-eqz v5, :cond_1

    sget-object v5, Lns/o;->a:Lcom/google/crypto/tink/internal/d0;

    invoke-virtual {v2, v5}, Lcom/google/crypto/tink/internal/z;->f(Lcom/google/crypto/tink/internal/d0;)V

    sget-object v5, Lns/o;->b:Lcom/google/crypto/tink/internal/b0;

    invoke-virtual {v2, v5}, Lcom/google/crypto/tink/internal/z;->e(Lcom/google/crypto/tink/internal/b0;)V

    sget-object v5, Lns/o;->c:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v2, v5}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v5, Lns/o;->d:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v2, v5}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    sget-object v5, Lns/o;->e:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v2, v5}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v5, Lns/o;->f:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v2, v5}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, Lns/m;->b()Lzt/q;

    move-result-object v5

    sget-object v6, Lns/l;->b:Lns/l;

    iput-object v6, v5, Lzt/q;->E:Ljava/lang/Object;

    sget-object v8, Lns/k;->G:Lns/k;

    iput-object v8, v5, Lzt/q;->x:Ljava/lang/Object;

    sget-object v9, Lns/j;->z:Lns/j;

    iput-object v9, v5, Lzt/q;->y:Ljava/lang/Object;

    sget-object v10, Lns/i;->z:Lns/i;

    iput-object v10, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->k()Lns/m;

    move-result-object v5

    const-string v11, "DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM"

    invoke-virtual {v2, v11, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lns/m;->b()Lzt/q;

    move-result-object v5

    sget-object v11, Lns/l;->d:Lns/l;

    iput-object v11, v5, Lzt/q;->E:Ljava/lang/Object;

    iput-object v8, v5, Lzt/q;->x:Ljava/lang/Object;

    iput-object v9, v5, Lzt/q;->y:Ljava/lang/Object;

    iput-object v10, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->k()Lns/m;

    move-result-object v5

    const-string v12, "DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW"

    invoke-virtual {v2, v12, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lns/m;->b()Lzt/q;

    move-result-object v5

    iput-object v6, v5, Lzt/q;->E:Ljava/lang/Object;

    iput-object v8, v5, Lzt/q;->x:Ljava/lang/Object;

    iput-object v9, v5, Lzt/q;->y:Ljava/lang/Object;

    sget-object v12, Lns/i;->E:Lns/i;

    iput-object v12, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->k()Lns/m;

    move-result-object v5

    const-string v13, "DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM"

    invoke-virtual {v2, v13, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lns/m;->b()Lzt/q;

    move-result-object v5

    iput-object v11, v5, Lzt/q;->E:Ljava/lang/Object;

    iput-object v8, v5, Lzt/q;->x:Ljava/lang/Object;

    iput-object v9, v5, Lzt/q;->y:Ljava/lang/Object;

    iput-object v12, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->k()Lns/m;

    move-result-object v5

    const-string v13, "DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW"

    invoke-virtual {v2, v13, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lns/m;->b()Lzt/q;

    move-result-object v5

    iput-object v6, v5, Lzt/q;->E:Ljava/lang/Object;

    iput-object v8, v5, Lzt/q;->x:Ljava/lang/Object;

    iput-object v9, v5, Lzt/q;->y:Ljava/lang/Object;

    sget-object v13, Lns/i;->F:Lns/i;

    iput-object v13, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->k()Lns/m;

    move-result-object v5

    const-string v14, "DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305"

    invoke-virtual {v2, v14, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lns/m;->b()Lzt/q;

    move-result-object v5

    iput-object v11, v5, Lzt/q;->E:Ljava/lang/Object;

    iput-object v8, v5, Lzt/q;->x:Ljava/lang/Object;

    iput-object v9, v5, Lzt/q;->y:Ljava/lang/Object;

    iput-object v13, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->k()Lns/m;

    move-result-object v5

    const-string v8, "DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW"

    invoke-virtual {v2, v8, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lns/m;->b()Lzt/q;

    move-result-object v5

    iput-object v6, v5, Lzt/q;->E:Ljava/lang/Object;

    sget-object v8, Lns/k;->z:Lns/k;

    iput-object v8, v5, Lzt/q;->x:Ljava/lang/Object;

    iput-object v9, v5, Lzt/q;->y:Ljava/lang/Object;

    iput-object v10, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->k()Lns/m;

    move-result-object v5

    const-string v13, "DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM"

    invoke-virtual {v2, v13, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lns/m;->b()Lzt/q;

    move-result-object v5

    iput-object v11, v5, Lzt/q;->E:Ljava/lang/Object;

    iput-object v8, v5, Lzt/q;->x:Ljava/lang/Object;

    iput-object v9, v5, Lzt/q;->y:Ljava/lang/Object;

    iput-object v10, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->k()Lns/m;

    move-result-object v5

    const-string v13, "DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW"

    invoke-virtual {v2, v13, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lns/m;->b()Lzt/q;

    move-result-object v5

    iput-object v6, v5, Lzt/q;->E:Ljava/lang/Object;

    iput-object v8, v5, Lzt/q;->x:Ljava/lang/Object;

    iput-object v9, v5, Lzt/q;->y:Ljava/lang/Object;

    iput-object v12, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->k()Lns/m;

    move-result-object v5

    const-string v13, "DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM"

    invoke-virtual {v2, v13, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lns/m;->b()Lzt/q;

    move-result-object v5

    iput-object v11, v5, Lzt/q;->E:Ljava/lang/Object;

    iput-object v8, v5, Lzt/q;->x:Ljava/lang/Object;

    iput-object v9, v5, Lzt/q;->y:Ljava/lang/Object;

    iput-object v12, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->k()Lns/m;

    move-result-object v5

    const-string v8, "DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW"

    invoke-virtual {v2, v8, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lns/m;->b()Lzt/q;

    move-result-object v5

    iput-object v6, v5, Lzt/q;->E:Ljava/lang/Object;

    sget-object v8, Lns/k;->E:Lns/k;

    iput-object v8, v5, Lzt/q;->x:Ljava/lang/Object;

    sget-object v9, Lns/j;->E:Lns/j;

    iput-object v9, v5, Lzt/q;->y:Ljava/lang/Object;

    iput-object v10, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->k()Lns/m;

    move-result-object v5

    const-string v13, "DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM"

    invoke-virtual {v2, v13, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lns/m;->b()Lzt/q;

    move-result-object v5

    iput-object v11, v5, Lzt/q;->E:Ljava/lang/Object;

    iput-object v8, v5, Lzt/q;->x:Ljava/lang/Object;

    iput-object v9, v5, Lzt/q;->y:Ljava/lang/Object;

    iput-object v10, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->k()Lns/m;

    move-result-object v5

    const-string v13, "DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW"

    invoke-virtual {v2, v13, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lns/m;->b()Lzt/q;

    move-result-object v5

    iput-object v6, v5, Lzt/q;->E:Ljava/lang/Object;

    iput-object v8, v5, Lzt/q;->x:Ljava/lang/Object;

    iput-object v9, v5, Lzt/q;->y:Ljava/lang/Object;

    iput-object v12, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->k()Lns/m;

    move-result-object v5

    const-string v13, "DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM"

    invoke-virtual {v2, v13, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lns/m;->b()Lzt/q;

    move-result-object v5

    iput-object v11, v5, Lzt/q;->E:Ljava/lang/Object;

    iput-object v8, v5, Lzt/q;->x:Ljava/lang/Object;

    iput-object v9, v5, Lzt/q;->y:Ljava/lang/Object;

    iput-object v12, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->k()Lns/m;

    move-result-object v5

    const-string v8, "DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW"

    invoke-virtual {v2, v8, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lns/m;->b()Lzt/q;

    move-result-object v5

    iput-object v6, v5, Lzt/q;->E:Ljava/lang/Object;

    sget-object v8, Lns/k;->F:Lns/k;

    iput-object v8, v5, Lzt/q;->x:Ljava/lang/Object;

    sget-object v9, Lns/j;->F:Lns/j;

    iput-object v9, v5, Lzt/q;->y:Ljava/lang/Object;

    iput-object v10, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->k()Lns/m;

    move-result-object v5

    const-string v13, "DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM"

    invoke-virtual {v2, v13, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lns/m;->b()Lzt/q;

    move-result-object v5

    iput-object v11, v5, Lzt/q;->E:Ljava/lang/Object;

    iput-object v8, v5, Lzt/q;->x:Ljava/lang/Object;

    iput-object v9, v5, Lzt/q;->y:Ljava/lang/Object;

    iput-object v10, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->k()Lns/m;

    move-result-object v5

    const-string v10, "DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW"

    invoke-virtual {v2, v10, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lns/m;->b()Lzt/q;

    move-result-object v5

    iput-object v6, v5, Lzt/q;->E:Ljava/lang/Object;

    iput-object v8, v5, Lzt/q;->x:Ljava/lang/Object;

    iput-object v9, v5, Lzt/q;->y:Ljava/lang/Object;

    iput-object v12, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->k()Lns/m;

    move-result-object v5

    const-string v6, "DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lns/m;->b()Lzt/q;

    move-result-object v5

    iput-object v11, v5, Lzt/q;->E:Ljava/lang/Object;

    iput-object v8, v5, Lzt/q;->x:Ljava/lang/Object;

    iput-object v9, v5, Lzt/q;->y:Ljava/lang/Object;

    iput-object v12, v5, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v5}, Lzt/q;->k()Lns/m;

    move-result-object v5

    const-string v6, "DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/google/crypto/tink/internal/x;->b(Ljava/util/Map;)V

    sget-object v2, Los/c;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, v2}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v2, Los/c;->b:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, v2}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v0, Los/c;->e:Lcom/google/crypto/tink/internal/s;

    const-class v2, Lns/m;

    invoke-virtual {v1, v0, v2}, Lcom/google/crypto/tink/internal/t;->a(Lcom/google/crypto/tink/internal/s;Ljava/lang/Class;)V

    sget-object v0, Los/c;->c:Lcom/google/crypto/tink/internal/o;

    const/4 v6, 0x1

    invoke-virtual {v4, v0, v6}, Lcom/google/crypto/tink/internal/j;->c(Lcom/google/crypto/tink/internal/p;Z)V

    sget-object v0, Los/c;->d:Lcom/google/crypto/tink/internal/p;

    invoke-virtual {v4, v0, v7}, Lcom/google/crypto/tink/internal/j;->c(Lcom/google/crypto/tink/internal/p;Z)V

    return-void

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Registering HPKE Hybrid Encryption is not supported in FIPS mode"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Registering ECIES Hybrid Encryption is not supported in FIPS mode"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
