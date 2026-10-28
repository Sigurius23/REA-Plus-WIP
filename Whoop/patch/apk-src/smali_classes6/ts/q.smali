.class public final Lts/q;
.super Lts/o;
.source "SourceFile"


# direct methods
.method public constructor <init>(La33/d;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lfs/b;->a:[B

    invoke-virtual {p1, v0}, La33/d;->v([B)Ljava/util/List;

    move-result-object v1

    iget-object v2, p1, La33/d;->y:Ljava/lang/Object;

    check-cast v2, Lcom/google/crypto/tink/internal/j0;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    if-eqz v2, :cond_2

    invoke-virtual {p1}, La33/d;->z()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/crypto/tink/internal/w;->b:Lcom/google/crypto/tink/internal/w;

    invoke-virtual {v1}, Lcom/google/crypto/tink/internal/w;->a()Lcom/google/crypto/tink/internal/v;

    move-result-object v1

    invoke-static {p1}, Lcom/google/crypto/tink/internal/a;->i(La33/d;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    invoke-virtual {p1, v0}, La33/d;->v([B)Ljava/util/List;

    move-result-object p1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/internal/j0;

    iget v2, v1, Lcom/google/crypto/tink/internal/j0;->d:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Lts/p;

    iget-object v4, v1, Lcom/google/crypto/tink/internal/j0;->a:Ljava/lang/Object;

    check-cast v4, Lts/m;

    iget v1, v1, Lcom/google/crypto/tink/internal/j0;->d:I

    invoke-direct {v3, v4, v1}, Lts/p;-><init>(Lts/m;I)V

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    return-void

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Primary key not set."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "No primitives provided."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
