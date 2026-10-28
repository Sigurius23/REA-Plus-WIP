.class public abstract Lcom/google/android/gms/common/api/a;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/crypto/tink/internal/k0;Ljava/lang/Object;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;)Lcom/google/android/gms/common/api/d;
    .locals 0

    invoke-virtual/range {p0 .. p6}, Lcom/google/android/gms/common/api/a;->b(Landroid/content/Context;Landroid/os/Looper;Lcom/google/crypto/tink/internal/k0;Ljava/lang/Object;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;)Lcom/google/android/gms/common/api/d;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/content/Context;Landroid/os/Looper;Lcom/google/crypto/tink/internal/k0;Ljava/lang/Object;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;)Lcom/google/android/gms/common/api/d;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "buildClient must be implemented"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
