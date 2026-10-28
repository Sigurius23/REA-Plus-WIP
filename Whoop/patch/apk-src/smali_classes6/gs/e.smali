.class public final Lgs/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs/a;


# instance fields
.field public final a:La33/d;

.field public final b:Lu00/e;

.field public final c:Lu00/e;


# direct methods
.method public constructor <init>(La33/d;)V
    .locals 2

    sget-object v0, Lcom/google/crypto/tink/internal/a;->h:Lu00/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgs/e;->a:La33/d;

    invoke-virtual {p1}, La33/d;->z()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/crypto/tink/internal/w;->b:Lcom/google/crypto/tink/internal/w;

    invoke-virtual {v1}, Lcom/google/crypto/tink/internal/w;->a()Lcom/google/crypto/tink/internal/v;

    move-result-object v1

    invoke-static {p1}, Lcom/google/crypto/tink/internal/a;->i(La33/d;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v0, p0, Lgs/e;->b:Lu00/e;

    iput-object v0, p0, Lgs/e;->c:Lu00/e;

    return-void

    :cond_0
    iput-object v0, p0, Lgs/e;->b:Lu00/e;

    iput-object v0, p0, Lgs/e;->c:Lu00/e;

    return-void
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 3

    iget-object v0, p0, Lgs/e;->b:Lu00/e;

    iget-object v1, p0, Lgs/e;->a:La33/d;

    :try_start_0
    iget-object v2, v1, La33/d;->y:Ljava/lang/Object;

    check-cast v2, Lcom/google/crypto/tink/internal/j0;

    iget-object v2, v2, Lcom/google/crypto/tink/internal/j0;->a:Ljava/lang/Object;

    check-cast v2, Lfs/a;

    invoke-interface {v2, p1, p2}, Lfs/a;->a([B[B)[B

    move-result-object p2

    iget-object v1, v1, La33/d;->y:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/internal/j0;

    iget v1, v1, Lcom/google/crypto/tink/internal/j0;->d:I

    array-length p1, p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw p1
.end method

.method public final b([B[B)[B
    .locals 4

    array-length v0, p1

    iget-object v1, p0, Lgs/e;->a:La33/d;

    iget-object v2, p0, Lgs/e;->c:Lu00/e;

    const/4 v3, 0x5

    if-le v0, v3, :cond_0

    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    invoke-virtual {v1, v0}, La33/d;->v([B)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/crypto/tink/internal/j0;

    :try_start_0
    iget-object v3, v3, Lcom/google/crypto/tink/internal/j0;->a:Ljava/lang/Object;

    check-cast v3, Lfs/a;

    invoke-interface {v3, p1, p2}, Lfs/a;->b([B[B)[B

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v3

    :cond_0
    sget-object v0, Lfs/b;->a:[B

    invoke-virtual {v1, v0}, La33/d;->v([B)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/internal/j0;

    :try_start_1
    iget-object v1, v1, Lcom/google/crypto/tink/internal/j0;->a:Ljava/lang/Object;

    check-cast v1, Lfs/a;

    invoke-interface {v1, p1, p2}, Lfs/a;->b([B[B)[B

    move-result-object v1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "decryption failed"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
