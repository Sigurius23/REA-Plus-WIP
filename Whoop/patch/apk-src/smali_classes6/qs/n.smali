.class public final Lqs/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs/j;


# direct methods
.method public constructor <init>(La33/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, La33/d;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/crypto/tink/internal/w;->b:Lcom/google/crypto/tink/internal/w;

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/w;->a()Lcom/google/crypto/tink/internal/v;

    move-result-object v0

    invoke-static {p1}, Lcom/google/crypto/tink/internal/a;->i(La33/d;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method
