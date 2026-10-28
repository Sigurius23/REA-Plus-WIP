.class public abstract Lgs/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lvs/i4;->CONFIG_NAME_FIELD_NUMBER:I

    :try_start_0
    invoke-static {}, Lgs/a;->a()V
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
    .locals 14

    sget-object v0, Lcom/google/crypto/tink/internal/y;->b:Lcom/google/crypto/tink/internal/y;

    sget-object v1, Lgs/f;->a:Lgs/f;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/y;->d(Lfs/l;)V

    sget-object v1, Lgs/f;->b:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    invoke-static {}, Lqs/m;->a()V

    sget v1, Lgs/i;->e:I

    invoke-static {v1}, Lih0/d0;->b(I)Z

    move-result v2

    if-eqz v2, :cond_8

    sget-object v2, Lhs/a;->a:Lcom/google/crypto/tink/internal/d0;

    sget-object v2, Lcom/google/crypto/tink/internal/z;->b:Lcom/google/crypto/tink/internal/z;

    sget-object v3, Lhs/a;->a:Lcom/google/crypto/tink/internal/d0;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/z;->f(Lcom/google/crypto/tink/internal/d0;)V

    sget-object v3, Lhs/a;->b:Lcom/google/crypto/tink/internal/b0;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/z;->e(Lcom/google/crypto/tink/internal/b0;)V

    sget-object v3, Lhs/a;->c:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v3, Lhs/a;->d:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    sget-object v3, Lgs/i;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, v3}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v3, Lcom/google/crypto/tink/internal/x;->b:Lcom/google/crypto/tink/internal/x;

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    const-string v5, "AES128_CTR_HMAC_SHA256"

    sget-object v6, Lgs/h0;->e:Lgs/k;

    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lgs/k;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v5

    const/16 v6, 0x10

    invoke-virtual {v5, v6}, Lcom/google/crypto/tink/internal/k0;->M(I)V

    const/16 v7, 0x20

    invoke-virtual {v5, v7}, Lcom/google/crypto/tink/internal/k0;->P(I)V

    invoke-virtual {v5, v6}, Lcom/google/crypto/tink/internal/k0;->S(I)V

    invoke-virtual {v5, v6}, Lcom/google/crypto/tink/internal/k0;->Q(I)V

    sget-object v8, Lgs/j;->e:Lgs/j;

    iput-object v8, v5, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    sget-object v9, Lgs/j;->j:Lgs/j;

    iput-object v9, v5, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    invoke-virtual {v5}, Lcom/google/crypto/tink/internal/k0;->f()Lgs/k;

    move-result-object v5

    const-string v10, "AES128_CTR_HMAC_SHA256_RAW"

    invoke-virtual {v4, v10, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "AES256_CTR_HMAC_SHA256"

    sget-object v10, Lgs/h0;->f:Lgs/k;

    invoke-virtual {v4, v5, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lgs/k;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v5

    invoke-virtual {v5, v7}, Lcom/google/crypto/tink/internal/k0;->M(I)V

    invoke-virtual {v5, v7}, Lcom/google/crypto/tink/internal/k0;->P(I)V

    invoke-virtual {v5, v7}, Lcom/google/crypto/tink/internal/k0;->S(I)V

    invoke-virtual {v5, v6}, Lcom/google/crypto/tink/internal/k0;->Q(I)V

    iput-object v8, v5, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    iput-object v9, v5, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    invoke-virtual {v5}, Lcom/google/crypto/tink/internal/k0;->f()Lgs/k;

    move-result-object v5

    const-string v8, "AES256_CTR_HMAC_SHA256_RAW"

    invoke-virtual {v4, v8, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v4}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/crypto/tink/internal/x;->b(Ljava/util/Map;)V

    sget-object v4, Lcom/google/crypto/tink/internal/u;->b:Lcom/google/crypto/tink/internal/u;

    sget-object v5, Lgs/i;->c:Lgs/h;

    const-class v8, Lgs/k;

    invoke-virtual {v4, v5, v8}, Lcom/google/crypto/tink/internal/u;->a(Lgs/h;Ljava/lang/Class;)V

    sget-object v5, Lcom/google/crypto/tink/internal/t;->b:Lcom/google/crypto/tink/internal/t;

    sget-object v9, Lgs/i;->d:Lcom/google/crypto/tink/internal/s;

    invoke-virtual {v5, v9, v8}, Lcom/google/crypto/tink/internal/t;->a(Lcom/google/crypto/tink/internal/s;Ljava/lang/Class;)V

    sget-object v8, Lcom/google/crypto/tink/internal/j;->d:Lcom/google/crypto/tink/internal/j;

    sget-object v9, Lgs/i;->b:Lcom/google/crypto/tink/internal/p;

    const/4 v10, 0x1

    invoke-virtual {v8, v9, v1, v10}, Lcom/google/crypto/tink/internal/j;->d(Lcom/google/crypto/tink/internal/p;IZ)V

    sget v1, Lgs/p;->e:I

    invoke-static {v1}, Lih0/d0;->b(I)Z

    move-result v9

    if-eqz v9, :cond_7

    sget-object v9, Lhs/c;->a:Lcom/google/crypto/tink/internal/d0;

    invoke-virtual {v2, v9}, Lcom/google/crypto/tink/internal/z;->f(Lcom/google/crypto/tink/internal/d0;)V

    sget-object v9, Lhs/c;->b:Lcom/google/crypto/tink/internal/b0;

    invoke-virtual {v2, v9}, Lcom/google/crypto/tink/internal/z;->e(Lcom/google/crypto/tink/internal/b0;)V

    sget-object v9, Lhs/c;->c:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v2, v9}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v9, Lhs/c;->d:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v2, v9}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    sget-object v9, Lgs/p;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, v9}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    const-string v11, "AES128_GCM"

    sget-object v12, Lgs/h0;->a:Lgs/q;

    invoke-virtual {v9, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lgs/q;->b()Lzt/q;

    move-result-object v11

    invoke-virtual {v11}, Lzt/q;->I()V

    invoke-virtual {v11, v6}, Lzt/q;->K(I)V

    invoke-virtual {v11}, Lzt/q;->L()V

    sget-object v12, Lgs/j;->p:Lgs/j;

    iput-object v12, v11, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v11}, Lzt/q;->j()Lgs/q;

    move-result-object v11

    const-string v13, "AES128_GCM_RAW"

    invoke-virtual {v9, v13, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v11, "AES256_GCM"

    sget-object v13, Lgs/h0;->b:Lgs/q;

    invoke-virtual {v9, v11, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lgs/q;->b()Lzt/q;

    move-result-object v11

    invoke-virtual {v11}, Lzt/q;->I()V

    invoke-virtual {v11, v7}, Lzt/q;->K(I)V

    invoke-virtual {v11}, Lzt/q;->L()V

    iput-object v12, v11, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v11}, Lzt/q;->j()Lgs/q;

    move-result-object v11

    const-string v12, "AES256_GCM_RAW"

    invoke-virtual {v9, v12, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v9}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v9

    invoke-virtual {v3, v9}, Lcom/google/crypto/tink/internal/x;->b(Ljava/util/Map;)V

    sget-object v9, Lgs/p;->c:Lgs/h;

    const-class v11, Lgs/q;

    invoke-virtual {v4, v9, v11}, Lcom/google/crypto/tink/internal/u;->a(Lgs/h;Ljava/lang/Class;)V

    sget-object v9, Lgs/p;->d:Lcom/google/crypto/tink/internal/s;

    invoke-virtual {v5, v9, v11}, Lcom/google/crypto/tink/internal/t;->a(Lcom/google/crypto/tink/internal/s;Ljava/lang/Class;)V

    sget-object v9, Lgs/p;->b:Lcom/google/crypto/tink/internal/p;

    invoke-virtual {v8, v9, v1, v10}, Lcom/google/crypto/tink/internal/j;->d(Lcom/google/crypto/tink/internal/p;IZ)V

    invoke-static {}, Lks/a;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    sget-object v1, Lgs/m;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-static {v10}, Lih0/d0;->a(I)Z

    move-result v1

    if-eqz v1, :cond_6

    sget-object v1, Lhs/b;->a:Lcom/google/crypto/tink/internal/d0;

    invoke-virtual {v2, v1}, Lcom/google/crypto/tink/internal/z;->f(Lcom/google/crypto/tink/internal/d0;)V

    sget-object v1, Lhs/b;->b:Lcom/google/crypto/tink/internal/b0;

    invoke-virtual {v2, v1}, Lcom/google/crypto/tink/internal/z;->e(Lcom/google/crypto/tink/internal/b0;)V

    sget-object v1, Lhs/b;->c:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v2, v1}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v1, Lhs/b;->d:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v2, v1}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    sget-object v1, Lgs/m;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v9, "AES128_EAX"

    sget-object v11, Lgs/h0;->c:Lgs/n;

    invoke-virtual {v1, v9, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lgs/n;->b()Lzt/q;

    move-result-object v9

    invoke-virtual {v9, v6}, Lzt/q;->J(I)V

    invoke-virtual {v9, v6}, Lzt/q;->K(I)V

    invoke-virtual {v9}, Lzt/q;->L()V

    sget-object v11, Lgs/j;->m:Lgs/j;

    iput-object v11, v9, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v9}, Lzt/q;->g()Lgs/n;

    move-result-object v9

    const-string v12, "AES128_EAX_RAW"

    invoke-virtual {v1, v12, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v9, "AES256_EAX"

    sget-object v12, Lgs/h0;->d:Lgs/n;

    invoke-virtual {v1, v9, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lgs/n;->b()Lzt/q;

    move-result-object v9

    invoke-virtual {v9, v6}, Lzt/q;->J(I)V

    invoke-virtual {v9, v7}, Lzt/q;->K(I)V

    invoke-virtual {v9}, Lzt/q;->L()V

    iput-object v11, v9, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v9}, Lzt/q;->g()Lgs/n;

    move-result-object v9

    const-string v11, "AES256_EAX_RAW"

    invoke-virtual {v1, v11, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/google/crypto/tink/internal/x;->b(Ljava/util/Map;)V

    sget-object v1, Lgs/m;->c:Lcom/google/crypto/tink/internal/s;

    const-class v9, Lgs/n;

    invoke-virtual {v5, v1, v9}, Lcom/google/crypto/tink/internal/t;->a(Lcom/google/crypto/tink/internal/s;Ljava/lang/Class;)V

    sget-object v1, Lgs/m;->b:Lcom/google/crypto/tink/internal/p;

    invoke-virtual {v8, v1, v10}, Lcom/google/crypto/tink/internal/j;->c(Lcom/google/crypto/tink/internal/p;Z)V

    sget-object v1, Lgs/s;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-static {v10}, Lih0/d0;->a(I)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Lhs/d;->a:Lcom/google/crypto/tink/internal/d0;

    invoke-virtual {v2, v1}, Lcom/google/crypto/tink/internal/z;->f(Lcom/google/crypto/tink/internal/d0;)V

    sget-object v1, Lhs/d;->b:Lcom/google/crypto/tink/internal/b0;

    invoke-virtual {v2, v1}, Lcom/google/crypto/tink/internal/z;->e(Lcom/google/crypto/tink/internal/b0;)V

    sget-object v1, Lhs/d;->c:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v2, v1}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v1, Lhs/d;->d:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v2, v1}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    :try_start_0
    const-string v1, "AES/GCM-SIV/NoPadding"

    invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v1, Lgs/s;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, Lgs/t;->b()Lcom/google/crypto/tink/internal/l0;

    move-result-object v1

    invoke-virtual {v1, v6}, Lcom/google/crypto/tink/internal/l0;->h0(I)V

    sget-object v2, Lgs/j;->q:Lgs/j;

    iput-object v2, v1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/google/crypto/tink/internal/l0;->C()Lgs/t;

    move-result-object v1

    const-string v9, "AES128_GCM_SIV"

    invoke-virtual {v0, v9, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lgs/t;->b()Lcom/google/crypto/tink/internal/l0;

    move-result-object v1

    invoke-virtual {v1, v6}, Lcom/google/crypto/tink/internal/l0;->h0(I)V

    sget-object v6, Lgs/j;->s:Lgs/j;

    iput-object v6, v1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/google/crypto/tink/internal/l0;->C()Lgs/t;

    move-result-object v1

    const-string v9, "AES128_GCM_SIV_RAW"

    invoke-virtual {v0, v9, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lgs/t;->b()Lcom/google/crypto/tink/internal/l0;

    move-result-object v1

    invoke-virtual {v1, v7}, Lcom/google/crypto/tink/internal/l0;->h0(I)V

    iput-object v2, v1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/google/crypto/tink/internal/l0;->C()Lgs/t;

    move-result-object v1

    const-string v2, "AES256_GCM_SIV"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lgs/t;->b()Lcom/google/crypto/tink/internal/l0;

    move-result-object v1

    invoke-virtual {v1, v7}, Lcom/google/crypto/tink/internal/l0;->h0(I)V

    iput-object v6, v1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/google/crypto/tink/internal/l0;->C()Lgs/t;

    move-result-object v1

    const-string v2, "AES256_GCM_SIV_RAW"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/google/crypto/tink/internal/x;->b(Ljava/util/Map;)V

    sget-object v0, Lgs/s;->c:Lgs/h;

    const-class v1, Lgs/t;

    invoke-virtual {v4, v0, v1}, Lcom/google/crypto/tink/internal/u;->a(Lgs/h;Ljava/lang/Class;)V

    sget-object v0, Lgs/s;->b:Lcom/google/crypto/tink/internal/s;

    invoke-virtual {v5, v0, v1}, Lcom/google/crypto/tink/internal/t;->a(Lcom/google/crypto/tink/internal/s;Ljava/lang/Class;)V

    sget-object v0, Lgs/s;->d:Lcom/google/crypto/tink/internal/p;

    invoke-virtual {v8, v0, v10}, Lcom/google/crypto/tink/internal/j;->c(Lcom/google/crypto/tink/internal/p;Z)V

    :catch_0
    sget-object v0, Lgs/v;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-static {v10}, Lih0/d0;->a(I)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lhs/f;->a:Lcom/google/crypto/tink/internal/d0;

    sget-object v0, Lcom/google/crypto/tink/internal/z;->b:Lcom/google/crypto/tink/internal/z;

    sget-object v1, Lhs/f;->a:Lcom/google/crypto/tink/internal/d0;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/z;->f(Lcom/google/crypto/tink/internal/d0;)V

    sget-object v1, Lhs/f;->b:Lcom/google/crypto/tink/internal/b0;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/z;->e(Lcom/google/crypto/tink/internal/b0;)V

    sget-object v1, Lhs/f;->c:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v1, Lhs/f;->d:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    sget-object v1, Lcom/google/crypto/tink/internal/y;->b:Lcom/google/crypto/tink/internal/y;

    sget-object v2, Lgs/v;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v1, v2}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v2, Lcom/google/crypto/tink/internal/t;->b:Lcom/google/crypto/tink/internal/t;

    sget-object v3, Lgs/v;->b:Lcom/google/crypto/tink/internal/s;

    const-class v4, Lgs/w;

    invoke-virtual {v2, v3, v4}, Lcom/google/crypto/tink/internal/t;->a(Lcom/google/crypto/tink/internal/s;Ljava/lang/Class;)V

    sget-object v3, Lcom/google/crypto/tink/internal/x;->b:Lcom/google/crypto/tink/internal/x;

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    sget-object v5, Lgs/j;->t:Lgs/j;

    new-instance v6, Lgs/w;

    invoke-direct {v6, v5}, Lgs/w;-><init>(Lgs/j;)V

    const-string v5, "CHACHA20_POLY1305"

    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lgs/j;->v:Lgs/j;

    new-instance v6, Lgs/w;

    invoke-direct {v6, v5}, Lgs/w;-><init>(Lgs/j;)V

    const-string v5, "CHACHA20_POLY1305_RAW"

    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v4}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/crypto/tink/internal/x;->b(Ljava/util/Map;)V

    sget-object v4, Lcom/google/crypto/tink/internal/j;->d:Lcom/google/crypto/tink/internal/j;

    sget-object v5, Lgs/v;->c:Lcom/google/crypto/tink/internal/p;

    invoke-virtual {v4, v5, v10}, Lcom/google/crypto/tink/internal/j;->c(Lcom/google/crypto/tink/internal/p;Z)V

    sget-object v5, Lgs/x;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-static {v10}, Lih0/d0;->a(I)Z

    move-result v5

    if-eqz v5, :cond_3

    sget-object v5, Lgs/d0;->a:Lcom/google/crypto/tink/internal/d0;

    invoke-virtual {v0, v5}, Lcom/google/crypto/tink/internal/z;->f(Lcom/google/crypto/tink/internal/d0;)V

    sget-object v5, Lgs/d0;->b:Lcom/google/crypto/tink/internal/b0;

    invoke-virtual {v0, v5}, Lcom/google/crypto/tink/internal/z;->e(Lcom/google/crypto/tink/internal/b0;)V

    sget-object v5, Lgs/d0;->c:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v0, v5}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v5, Lgs/d0;->d:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v0, v5}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    sget-object v5, Lgs/x;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v1, v5}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v5, Lgs/x;->c:Lcom/google/crypto/tink/internal/s;

    const-class v6, Lgs/c0;

    invoke-virtual {v2, v5, v6}, Lcom/google/crypto/tink/internal/t;->a(Lcom/google/crypto/tink/internal/s;Ljava/lang/Class;)V

    sget-object v5, Lgs/x;->b:Lcom/google/crypto/tink/internal/p;

    invoke-virtual {v4, v5, v10}, Lcom/google/crypto/tink/internal/j;->c(Lcom/google/crypto/tink/internal/p;Z)V

    sget-object v5, Lgs/z;->a:Lcom/google/crypto/tink/internal/p;

    invoke-static {v10}, Lih0/d0;->a(I)Z

    move-result v5

    if-eqz v5, :cond_2

    sget-object v5, Lgs/g0;->a:Lcom/google/crypto/tink/internal/d0;

    invoke-virtual {v0, v5}, Lcom/google/crypto/tink/internal/z;->f(Lcom/google/crypto/tink/internal/d0;)V

    sget-object v5, Lgs/g0;->b:Lcom/google/crypto/tink/internal/b0;

    invoke-virtual {v0, v5}, Lcom/google/crypto/tink/internal/z;->e(Lcom/google/crypto/tink/internal/b0;)V

    sget-object v5, Lgs/g0;->c:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v0, v5}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v5, Lgs/g0;->d:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v0, v5}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    sget-object v5, Lgs/z;->b:Lcom/google/crypto/tink/internal/s;

    const-class v6, Lgs/f0;

    invoke-virtual {v2, v5, v6}, Lcom/google/crypto/tink/internal/t;->a(Lcom/google/crypto/tink/internal/s;Ljava/lang/Class;)V

    sget-object v5, Lgs/z;->c:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v1, v5}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v5, Lgs/z;->a:Lcom/google/crypto/tink/internal/p;

    invoke-virtual {v4, v5, v10}, Lcom/google/crypto/tink/internal/j;->c(Lcom/google/crypto/tink/internal/p;Z)V

    sget-object v5, Lgs/j0;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-static {v10}, Lih0/d0;->a(I)Z

    move-result v5

    if-eqz v5, :cond_1

    sget-object v5, Lhs/k;->a:Lcom/google/crypto/tink/internal/d0;

    invoke-virtual {v0, v5}, Lcom/google/crypto/tink/internal/z;->f(Lcom/google/crypto/tink/internal/d0;)V

    sget-object v5, Lhs/k;->b:Lcom/google/crypto/tink/internal/b0;

    invoke-virtual {v0, v5}, Lcom/google/crypto/tink/internal/z;->e(Lcom/google/crypto/tink/internal/b0;)V

    sget-object v5, Lhs/k;->c:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v0, v5}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v5, Lhs/k;->d:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v0, v5}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    sget-object v0, Lgs/j0;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v1, v0}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, Lgs/j;->w:Lgs/j;

    new-instance v5, Lgs/k0;

    invoke-direct {v5, v1}, Lgs/k0;-><init>(Lgs/j;)V

    const-string v1, "XCHACHA20_POLY1305"

    invoke-virtual {v0, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lgs/j;->y:Lgs/j;

    new-instance v5, Lgs/k0;

    invoke-direct {v5, v1}, Lgs/k0;-><init>(Lgs/j;)V

    const-string v1, "XCHACHA20_POLY1305_RAW"

    invoke-virtual {v0, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/google/crypto/tink/internal/x;->b(Ljava/util/Map;)V

    sget-object v0, Lgs/j0;->d:Lcom/google/crypto/tink/internal/s;

    const-class v1, Lgs/k0;

    invoke-virtual {v2, v0, v1}, Lcom/google/crypto/tink/internal/t;->a(Lcom/google/crypto/tink/internal/s;Ljava/lang/Class;)V

    sget-object v0, Lcom/google/crypto/tink/internal/u;->b:Lcom/google/crypto/tink/internal/u;

    sget-object v2, Lgs/j0;->c:Lgs/h;

    invoke-virtual {v0, v2, v1}, Lcom/google/crypto/tink/internal/u;->a(Lgs/h;Ljava/lang/Class;)V

    sget-object v0, Lgs/j0;->b:Lcom/google/crypto/tink/internal/p;

    invoke-virtual {v4, v0, v10}, Lcom/google/crypto/tink/internal/j;->c(Lcom/google/crypto/tink/internal/p;Z)V

    return-void

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Registering XChaCha20Poly1305 is not supported in FIPS mode"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Registering KMS Envelope AEAD is not supported in FIPS mode"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Registering KMS AEAD is not supported in FIPS mode"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Registering ChaCha20Poly1305 is not supported in FIPS mode"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Registering AES GCM SIV is not supported in FIPS mode"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Registering AES EAX is not supported in FIPS mode"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
