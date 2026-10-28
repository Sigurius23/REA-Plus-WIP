.class public abstract Lws/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lvs/i4;->CONFIG_NAME_FIELD_NUMBER:I

    :try_start_0
    invoke-static {}, Lws/b0;->a()V
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

    const/16 v0, 0x1000

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0xc00

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Lcom/google/crypto/tink/internal/y;->b:Lcom/google/crypto/tink/internal/y;

    sget-object v3, Lws/m;->b:Lws/m;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/y;->d(Lfs/l;)V

    sget-object v3, Lws/m;->c:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v3, Lws/m;->d:Lws/m;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/y;->d(Lfs/l;)V

    sget-object v3, Lws/m;->e:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget v3, Lws/f;->f:I

    invoke-static {v3}, Lih0/d0;->b(I)Z

    move-result v4

    if-eqz v4, :cond_4

    sget-object v4, Lxs/b;->a:Lcom/google/crypto/tink/internal/d0;

    sget-object v4, Lcom/google/crypto/tink/internal/z;->b:Lcom/google/crypto/tink/internal/z;

    sget-object v5, Lxs/b;->a:Lcom/google/crypto/tink/internal/d0;

    invoke-virtual {v4, v5}, Lcom/google/crypto/tink/internal/z;->f(Lcom/google/crypto/tink/internal/d0;)V

    sget-object v5, Lxs/b;->b:Lcom/google/crypto/tink/internal/b0;

    invoke-virtual {v4, v5}, Lcom/google/crypto/tink/internal/z;->e(Lcom/google/crypto/tink/internal/b0;)V

    sget-object v5, Lxs/b;->c:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v4, v5}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v5, Lxs/b;->d:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v4, v5}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    sget-object v5, Lxs/b;->e:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v4, v5}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v5, Lxs/b;->f:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v4, v5}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    sget-object v5, Lcom/google/crypto/tink/internal/x;->b:Lcom/google/crypto/tink/internal/x;

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    const-string v7, "ECDSA_P256"

    sget-object v8, Lws/l;->a:Lws/c;

    invoke-virtual {v6, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "ECDSA_P256_IEEE_P1363"

    sget-object v8, Lws/l;->d:Lws/c;

    invoke-virtual {v6, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lws/c;->b()Lzt/q;

    move-result-object v7

    sget-object v8, Lws/b;->c:Lws/b;

    iput-object v8, v7, Lzt/q;->z:Ljava/lang/Object;

    sget-object v8, Lws/a;->c:Lws/a;

    iput-object v8, v7, Lzt/q;->y:Ljava/lang/Object;

    sget-object v8, Lws/b;->f:Lws/b;

    iput-object v8, v7, Lzt/q;->x:Ljava/lang/Object;

    sget-object v8, Lws/b;->k:Lws/b;

    iput-object v8, v7, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v7}, Lzt/q;->o()Lws/c;

    move-result-object v7

    const-string v8, "ECDSA_P256_RAW"

    invoke-virtual {v6, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX"

    sget-object v8, Lws/l;->f:Lws/c;

    invoke-virtual {v6, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "ECDSA_P384"

    sget-object v8, Lws/l;->b:Lws/c;

    invoke-virtual {v6, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "ECDSA_P384_IEEE_P1363"

    sget-object v8, Lws/l;->e:Lws/c;

    invoke-virtual {v6, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lws/c;->b()Lzt/q;

    move-result-object v7

    sget-object v8, Lws/b;->e:Lws/b;

    iput-object v8, v7, Lzt/q;->z:Ljava/lang/Object;

    sget-object v8, Lws/a;->d:Lws/a;

    iput-object v8, v7, Lzt/q;->y:Ljava/lang/Object;

    sget-object v9, Lws/b;->g:Lws/b;

    iput-object v9, v7, Lzt/q;->x:Ljava/lang/Object;

    sget-object v10, Lws/b;->h:Lws/b;

    iput-object v10, v7, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v7}, Lzt/q;->o()Lws/c;

    move-result-object v7

    const-string v11, "ECDSA_P384_SHA512"

    invoke-virtual {v6, v11, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lws/c;->b()Lzt/q;

    move-result-object v7

    sget-object v11, Lws/b;->d:Lws/b;

    iput-object v11, v7, Lzt/q;->z:Ljava/lang/Object;

    iput-object v8, v7, Lzt/q;->y:Ljava/lang/Object;

    iput-object v9, v7, Lzt/q;->x:Ljava/lang/Object;

    iput-object v10, v7, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v7}, Lzt/q;->o()Lws/c;

    move-result-object v7

    const-string v8, "ECDSA_P384_SHA384"

    invoke-virtual {v6, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "ECDSA_P521"

    sget-object v8, Lws/l;->c:Lws/c;

    invoke-virtual {v6, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "ECDSA_P521_IEEE_P1363"

    sget-object v8, Lws/l;->g:Lws/c;

    invoke-virtual {v6, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/google/crypto/tink/internal/x;->b(Ljava/util/Map;)V

    sget-object v6, Lws/f;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v2, v6}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v6, Lws/f;->b:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v2, v6}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v6, Lcom/google/crypto/tink/internal/t;->b:Lcom/google/crypto/tink/internal/t;

    sget-object v7, Lws/f;->e:Lcom/google/crypto/tink/internal/s;

    const-class v8, Lws/c;

    invoke-virtual {v6, v7, v8}, Lcom/google/crypto/tink/internal/t;->a(Lcom/google/crypto/tink/internal/s;Ljava/lang/Class;)V

    sget-object v7, Lcom/google/crypto/tink/internal/j;->d:Lcom/google/crypto/tink/internal/j;

    sget-object v8, Lws/f;->c:Lcom/google/crypto/tink/internal/o;

    const/4 v9, 0x1

    invoke-virtual {v7, v8, v3, v9}, Lcom/google/crypto/tink/internal/j;->d(Lcom/google/crypto/tink/internal/p;IZ)V

    sget-object v8, Lws/f;->d:Lcom/google/crypto/tink/internal/p;

    const/4 v10, 0x0

    invoke-virtual {v7, v8, v3, v10}, Lcom/google/crypto/tink/internal/j;->d(Lcom/google/crypto/tink/internal/p;IZ)V

    sget v3, Lws/t;->f:I

    invoke-static {v3}, Lih0/d0;->b(I)Z

    move-result v8

    if-eqz v8, :cond_3

    sget-object v8, Lxs/d;->a:Lcom/google/crypto/tink/internal/d0;

    invoke-virtual {v4, v8}, Lcom/google/crypto/tink/internal/z;->f(Lcom/google/crypto/tink/internal/d0;)V

    sget-object v8, Lxs/d;->b:Lcom/google/crypto/tink/internal/b0;

    invoke-virtual {v4, v8}, Lcom/google/crypto/tink/internal/z;->e(Lcom/google/crypto/tink/internal/b0;)V

    sget-object v8, Lxs/d;->c:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v4, v8}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v8, Lxs/d;->d:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v4, v8}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    sget-object v8, Lxs/d;->e:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v4, v8}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v8, Lxs/d;->f:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v4, v8}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    const-string v11, "RSA_SSA_PKCS1_3072_SHA256_F4"

    sget-object v12, Lws/l;->h:Lws/q;

    invoke-virtual {v8, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lws/q;->b()Lws/n;

    move-result-object v11

    sget-object v12, Lws/o;->b:Lws/o;

    iput-object v12, v11, Lws/n;->c:Lws/o;

    iput-object v1, v11, Lws/n;->a:Ljava/lang/Integer;

    sget-object v12, Lws/q;->e:Ljava/math/BigInteger;

    iput-object v12, v11, Lws/n;->b:Ljava/math/BigInteger;

    sget-object v13, Lws/p;->e:Lws/p;

    iput-object v13, v11, Lws/n;->d:Lws/p;

    invoke-virtual {v11}, Lws/n;->a()Lws/q;

    move-result-object v11

    const-string v14, "RSA_SSA_PKCS1_3072_SHA256_F4_RAW"

    invoke-virtual {v8, v14, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v11, "RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX"

    sget-object v14, Lws/l;->i:Lws/q;

    invoke-virtual {v8, v11, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v11, "RSA_SSA_PKCS1_4096_SHA512_F4"

    sget-object v14, Lws/l;->j:Lws/q;

    invoke-virtual {v8, v11, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lws/q;->b()Lws/n;

    move-result-object v11

    sget-object v14, Lws/o;->d:Lws/o;

    iput-object v14, v11, Lws/n;->c:Lws/o;

    iput-object v0, v11, Lws/n;->a:Ljava/lang/Integer;

    iput-object v12, v11, Lws/n;->b:Ljava/math/BigInteger;

    iput-object v13, v11, Lws/n;->d:Lws/p;

    invoke-virtual {v11}, Lws/n;->a()Lws/q;

    move-result-object v11

    const-string v12, "RSA_SSA_PKCS1_4096_SHA512_F4_RAW"

    invoke-virtual {v8, v12, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v8}, Lcom/google/crypto/tink/internal/x;->b(Ljava/util/Map;)V

    sget-object v8, Lws/t;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v2, v8}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v8, Lws/t;->b:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v2, v8}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v8, Lws/t;->e:Lcom/google/crypto/tink/internal/s;

    const-class v11, Lws/q;

    invoke-virtual {v6, v8, v11}, Lcom/google/crypto/tink/internal/t;->a(Lcom/google/crypto/tink/internal/s;Ljava/lang/Class;)V

    sget-object v8, Lws/t;->c:Lcom/google/crypto/tink/internal/o;

    invoke-virtual {v7, v8, v3, v9}, Lcom/google/crypto/tink/internal/j;->d(Lcom/google/crypto/tink/internal/p;IZ)V

    sget-object v8, Lws/t;->d:Lcom/google/crypto/tink/internal/p;

    invoke-virtual {v7, v8, v3, v10}, Lcom/google/crypto/tink/internal/j;->d(Lcom/google/crypto/tink/internal/p;IZ)V

    invoke-static {}, Lks/a;->a()Z

    move-result v3

    if-eqz v3, :cond_0

    return-void

    :cond_0
    sget-object v3, Lws/a0;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-static {v9}, Lih0/d0;->a(I)Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v3, Lxs/e;->a:Lcom/google/crypto/tink/internal/d0;

    invoke-virtual {v4, v3}, Lcom/google/crypto/tink/internal/z;->f(Lcom/google/crypto/tink/internal/d0;)V

    sget-object v3, Lxs/e;->b:Lcom/google/crypto/tink/internal/b0;

    invoke-virtual {v4, v3}, Lcom/google/crypto/tink/internal/z;->e(Lcom/google/crypto/tink/internal/b0;)V

    sget-object v3, Lxs/e;->c:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v4, v3}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v3, Lxs/e;->d:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v4, v3}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    sget-object v3, Lxs/e;->e:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v4, v3}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v3, Lxs/e;->f:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v4, v3}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, Lws/x;->b()Lws/u;

    move-result-object v8

    sget-object v11, Lws/v;->b:Lws/v;

    iput-object v11, v8, Lws/u;->c:Lws/v;

    iput-object v11, v8, Lws/u;->d:Lws/v;

    const/16 v12, 0x20

    invoke-virtual {v8, v12}, Lws/u;->b(I)V

    iput-object v1, v8, Lws/u;->a:Ljava/lang/Integer;

    sget-object v13, Lws/x;->g:Ljava/math/BigInteger;

    iput-object v13, v8, Lws/u;->b:Ljava/math/BigInteger;

    sget-object v14, Lws/w;->b:Lws/w;

    iput-object v14, v8, Lws/u;->f:Lws/w;

    invoke-virtual {v8}, Lws/u;->a()Lws/x;

    move-result-object v8

    const-string v15, "RSA_SSA_PSS_3072_SHA256_F4"

    invoke-virtual {v3, v15, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lws/x;->b()Lws/u;

    move-result-object v8

    iput-object v11, v8, Lws/u;->c:Lws/v;

    iput-object v11, v8, Lws/u;->d:Lws/v;

    invoke-virtual {v8, v12}, Lws/u;->b(I)V

    iput-object v1, v8, Lws/u;->a:Ljava/lang/Integer;

    iput-object v13, v8, Lws/u;->b:Ljava/math/BigInteger;

    sget-object v1, Lws/w;->e:Lws/w;

    iput-object v1, v8, Lws/u;->f:Lws/w;

    invoke-virtual {v8}, Lws/u;->a()Lws/x;

    move-result-object v8

    const-string v11, "RSA_SSA_PSS_3072_SHA256_F4_RAW"

    invoke-virtual {v3, v11, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v8, "RSA_SSA_PSS_3072_SHA256_SHA256_32_F4"

    sget-object v11, Lws/l;->k:Lws/x;

    invoke-virtual {v3, v8, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lws/x;->b()Lws/u;

    move-result-object v8

    sget-object v11, Lws/v;->d:Lws/v;

    iput-object v11, v8, Lws/u;->c:Lws/v;

    iput-object v11, v8, Lws/u;->d:Lws/v;

    const/16 v12, 0x40

    invoke-virtual {v8, v12}, Lws/u;->b(I)V

    iput-object v0, v8, Lws/u;->a:Ljava/lang/Integer;

    iput-object v13, v8, Lws/u;->b:Ljava/math/BigInteger;

    iput-object v14, v8, Lws/u;->f:Lws/w;

    invoke-virtual {v8}, Lws/u;->a()Lws/x;

    move-result-object v8

    const-string v14, "RSA_SSA_PSS_4096_SHA512_F4"

    invoke-virtual {v3, v14, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lws/x;->b()Lws/u;

    move-result-object v8

    iput-object v11, v8, Lws/u;->c:Lws/v;

    iput-object v11, v8, Lws/u;->d:Lws/v;

    invoke-virtual {v8, v12}, Lws/u;->b(I)V

    iput-object v0, v8, Lws/u;->a:Ljava/lang/Integer;

    iput-object v13, v8, Lws/u;->b:Ljava/math/BigInteger;

    iput-object v1, v8, Lws/u;->f:Lws/w;

    invoke-virtual {v8}, Lws/u;->a()Lws/x;

    move-result-object v0

    const-string v1, "RSA_SSA_PSS_4096_SHA512_F4_RAW"

    invoke-virtual {v3, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "RSA_SSA_PSS_4096_SHA512_SHA512_64_F4"

    sget-object v1, Lws/l;->l:Lws/x;

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/google/crypto/tink/internal/x;->b(Ljava/util/Map;)V

    sget-object v0, Lws/a0;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v2, v0}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v0, Lws/a0;->b:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v2, v0}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v0, Lws/a0;->e:Lcom/google/crypto/tink/internal/s;

    const-class v1, Lws/x;

    invoke-virtual {v6, v0, v1}, Lcom/google/crypto/tink/internal/t;->a(Lcom/google/crypto/tink/internal/s;Ljava/lang/Class;)V

    sget-object v0, Lws/a0;->c:Lcom/google/crypto/tink/internal/o;

    invoke-virtual {v7, v0, v9}, Lcom/google/crypto/tink/internal/j;->c(Lcom/google/crypto/tink/internal/p;Z)V

    sget-object v0, Lws/a0;->d:Lcom/google/crypto/tink/internal/p;

    invoke-virtual {v7, v0, v10}, Lcom/google/crypto/tink/internal/j;->c(Lcom/google/crypto/tink/internal/p;Z)V

    sget-object v0, Lws/j;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-static {v9}, Lih0/d0;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lxs/c;->a:Lcom/google/crypto/tink/internal/d0;

    invoke-virtual {v4, v0}, Lcom/google/crypto/tink/internal/z;->f(Lcom/google/crypto/tink/internal/d0;)V

    sget-object v0, Lxs/c;->b:Lcom/google/crypto/tink/internal/b0;

    invoke-virtual {v4, v0}, Lcom/google/crypto/tink/internal/z;->e(Lcom/google/crypto/tink/internal/b0;)V

    sget-object v0, Lxs/c;->c:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v4, v0}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v0, Lxs/c;->d:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v4, v0}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    sget-object v0, Lxs/c;->e:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v4, v0}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v0, Lxs/c;->f:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v4, v0}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lws/h;

    sget-object v3, Lws/g;->b:Lws/g;

    invoke-direct {v1, v3}, Lws/h;-><init>(Lws/g;)V

    const-string v3, "ED25519"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lws/h;

    sget-object v3, Lws/g;->e:Lws/g;

    invoke-direct {v1, v3}, Lws/h;-><init>(Lws/g;)V

    const-string v4, "ED25519_RAW"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lws/h;

    invoke-direct {v1, v3}, Lws/h;-><init>(Lws/g;)V

    const-string v3, "ED25519WithRawOutput"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/google/crypto/tink/internal/x;->b(Ljava/util/Map;)V

    sget-object v0, Lws/j;->f:Lcom/google/crypto/tink/internal/s;

    const-class v1, Lws/h;

    invoke-virtual {v6, v0, v1}, Lcom/google/crypto/tink/internal/t;->a(Lcom/google/crypto/tink/internal/s;Ljava/lang/Class;)V

    sget-object v0, Lcom/google/crypto/tink/internal/u;->b:Lcom/google/crypto/tink/internal/u;

    sget-object v3, Lws/j;->e:Lgs/h;

    invoke-virtual {v0, v3, v1}, Lcom/google/crypto/tink/internal/u;->a(Lgs/h;Ljava/lang/Class;)V

    sget-object v0, Lws/j;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v2, v0}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v0, Lws/j;->b:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v2, v0}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v0, Lws/j;->c:Lcom/google/crypto/tink/internal/o;

    invoke-virtual {v7, v0, v9}, Lcom/google/crypto/tink/internal/j;->c(Lcom/google/crypto/tink/internal/p;Z)V

    sget-object v0, Lws/j;->d:Lcom/google/crypto/tink/internal/p;

    invoke-virtual {v7, v0, v10}, Lcom/google/crypto/tink/internal/j;->c(Lcom/google/crypto/tink/internal/p;Z)V

    return-void

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Registering AES GCM SIV is not supported in FIPS mode"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Registering RSA SSA PSS is not supported in FIPS mode"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
