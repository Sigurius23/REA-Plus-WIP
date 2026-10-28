.class public abstract Lcom/google/android/gms/common/k;
.super Llp/g;
.source "SourceFile"

# interfaces
.implements Luo/j0;


# instance fields
.field public final f:I


# direct methods
.method public constructor <init>([B)V
    .locals 2

    const-string v0, "com.google.android.gms.common.internal.ICertData"

    invoke-direct {p0, v0}, Llp/g;-><init>(Ljava/lang/String;)V

    array-length v0, p1

    const/16 v1, 0x19

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Luo/w;->a(Z)V

    invoke-static {p1}, Ljava/util/Arrays;->hashCode([B)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/common/k;->f:I

    return-void
.end method

.method public static c0(Ljava/lang/String;)[B
    .locals 1

    :try_start_0
    const-string v0, "ISO-8859-1"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method


# virtual methods
.method public abstract X()[B
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Luo/j0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    check-cast p1, Luo/j0;

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/common/k;

    iget v0, v0, Lcom/google/android/gms/common/k;->f:I

    iget v2, p0, Lcom/google/android/gms/common/k;->f:I

    if-eq v0, v2, :cond_1

    :goto_0
    return v1

    :cond_1
    check-cast p1, Lcom/google/android/gms/common/k;

    invoke-virtual {p1}, Lcom/google/android/gms/common/k;->X()[B

    move-result-object p1

    invoke-static {p1}, Lcp/b;->j0(Ljava/lang/Object;)Lcp/b;

    move-result-object p1

    invoke-static {p1}, Lcp/b;->c0(Lcp/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    invoke-virtual {p0}, Lcom/google/android/gms/common/k;->X()[B

    move-result-object v0

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    const-string v0, "GoogleCertificates"

    const-string v2, "Failed to get Google certificates from remote"

    invoke-static {v0, v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return v1
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/common/k;->f:I

    return v0
.end method

.method public final s(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 1

    const/4 p2, 0x1

    if-eq p1, p2, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    iget p1, p0, Lcom/google/android/gms/common/k;->f:I

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    return p2

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/common/k;->X()[B

    move-result-object p1

    invoke-static {p1}, Lcp/b;->j0(Ljava/lang/Object;)Lcp/b;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Llp/h;->b(Landroid/os/Parcel;Landroid/os/IInterface;)V

    return p2
.end method
