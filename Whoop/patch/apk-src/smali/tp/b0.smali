.class public final Ltp/b0;
.super Lcom/google/android/gms/common/api/a;
.source "SourceFile"


# virtual methods
.method public final bridge synthetic a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/crypto/tink/internal/k0;Ljava/lang/Object;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;)Lcom/google/android/gms/common/api/d;
    .locals 7

    check-cast p4, Lcom/google/android/gms/common/api/b;

    new-instance v0, Lnp/i;

    const-string v5, "locationServices"

    move-object v1, p1

    move-object v2, p2

    move-object v6, p3

    move-object v3, p5

    move-object v4, p6

    invoke-direct/range {v0 .. v6}, Lnp/i;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;Ljava/lang/String;Lcom/google/crypto/tink/internal/k0;)V

    return-object v0
.end method
