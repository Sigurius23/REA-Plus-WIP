.class public abstract Lto/d;
.super Lcom/google/android/gms/common/api/internal/BasePendingResult;
.source "SourceFile"


# virtual methods
.method public abstract c0(Lcom/google/android/gms/common/api/d;)V
.end method

.method public final d0(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->b()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Failed result must not be success"

    invoke-static {v0, v1}, Luo/w;->b(ZLjava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->X(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->a0(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method
