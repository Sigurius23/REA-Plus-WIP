.class public abstract Lls/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lvs/i4;->CONFIG_NAME_FIELD_NUMBER:I

    :try_start_0
    invoke-static {}, Lls/e;->a()V
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
    .locals 5

    sget-object v0, Lcom/google/crypto/tink/internal/y;->b:Lcom/google/crypto/tink/internal/y;

    sget-object v1, Lls/g;->a:Lls/g;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/y;->d(Lfs/l;)V

    sget-object v1, Lls/g;->b:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    invoke-static {}, Lks/a;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    sget-object v1, Lls/b;->a:Lcom/google/crypto/tink/internal/f0;

    const/4 v1, 0x1

    invoke-static {v1}, Lih0/d0;->a(I)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, Lms/a;->a:Lcom/google/crypto/tink/internal/d0;

    sget-object v2, Lcom/google/crypto/tink/internal/z;->b:Lcom/google/crypto/tink/internal/z;

    sget-object v3, Lms/a;->a:Lcom/google/crypto/tink/internal/d0;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/z;->f(Lcom/google/crypto/tink/internal/d0;)V

    sget-object v3, Lms/a;->b:Lcom/google/crypto/tink/internal/b0;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/z;->e(Lcom/google/crypto/tink/internal/b0;)V

    sget-object v3, Lms/a;->c:Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/z;->d(Lcom/google/crypto/tink/internal/m;)V

    sget-object v3, Lms/a;->d:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/z;->c(Lcom/google/crypto/tink/internal/k;)V

    sget-object v2, Lls/b;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, v2}, Lcom/google/crypto/tink/internal/y;->c(Lcom/google/crypto/tink/internal/f0;)V

    sget-object v0, Lcom/google/crypto/tink/internal/x;->b:Lcom/google/crypto/tink/internal/x;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v3, "AES256_SIV"

    sget-object v4, Lls/h;->a:Lls/d;

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lls/d;->b()Lcom/google/crypto/tink/internal/l0;

    move-result-object v3

    const/16 v4, 0x40

    invoke-virtual {v3, v4}, Lcom/google/crypto/tink/internal/l0;->h0(I)V

    sget-object v4, Lls/c;->d:Lls/c;

    iput-object v4, v3, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    invoke-virtual {v3}, Lcom/google/crypto/tink/internal/l0;->D()Lls/d;

    move-result-object v3

    const-string v4, "AES256_SIV_RAW"

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/crypto/tink/internal/x;->b(Ljava/util/Map;)V

    sget-object v0, Lcom/google/crypto/tink/internal/u;->b:Lcom/google/crypto/tink/internal/u;

    sget-object v2, Lls/b;->c:Lgs/h;

    const-class v3, Lls/d;

    invoke-virtual {v0, v2, v3}, Lcom/google/crypto/tink/internal/u;->a(Lgs/h;Ljava/lang/Class;)V

    sget-object v0, Lcom/google/crypto/tink/internal/t;->b:Lcom/google/crypto/tink/internal/t;

    sget-object v2, Lls/b;->d:Lcom/google/crypto/tink/internal/s;

    invoke-virtual {v0, v2, v3}, Lcom/google/crypto/tink/internal/t;->a(Lcom/google/crypto/tink/internal/s;Ljava/lang/Class;)V

    sget-object v0, Lcom/google/crypto/tink/internal/j;->d:Lcom/google/crypto/tink/internal/j;

    sget-object v2, Lls/b;->b:Lcom/google/crypto/tink/internal/p;

    invoke-virtual {v0, v2, v1}, Lcom/google/crypto/tink/internal/j;->c(Lcom/google/crypto/tink/internal/p;Z)V

    return-void

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Registering AES SIV is not supported in FIPS mode"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
