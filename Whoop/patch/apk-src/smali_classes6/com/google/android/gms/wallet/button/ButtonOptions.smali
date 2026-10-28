.class public final Lcom/google/android/gms/wallet/button/ButtonOptions;
.super Lvo/a;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/wallet/button/ButtonOptions;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public w:I

.field public x:I

.field public y:I

.field public z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldq/x;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Ldq/x;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/wallet/button/ButtonOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Le10/k0;
    .locals 3

    new-instance v0, Le10/k0;

    new-instance v1, Lcom/google/android/gms/wallet/button/ButtonOptions;

    invoke-direct {v1}, Lcom/google/android/gms/wallet/button/ButtonOptions;-><init>()V

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Le10/k0;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lcom/google/android/gms/wallet/button/ButtonOptions;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/wallet/button/ButtonOptions;

    iget v0, p0, Lcom/google/android/gms/wallet/button/ButtonOptions;->w:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v2, p1, Lcom/google/android/gms/wallet/button/ButtonOptions;->w:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/wallet/button/ButtonOptions;->x:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v2, p1, Lcom/google/android/gms/wallet/button/ButtonOptions;->x:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/wallet/button/ButtonOptions;->y:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v2, p1, Lcom/google/android/gms/wallet/button/ButtonOptions;->y:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wallet/button/ButtonOptions;->z:Ljava/lang/String;

    iget-object p1, p1, Lcom/google/android/gms/wallet/button/ButtonOptions;->z:Ljava/lang/String;

    invoke-static {v0, p1}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/button/ButtonOptions;->w:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const/16 p2, 0x4f45

    invoke-static {p1, p2}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result p2

    iget v0, p0, Lcom/google/android/gms/wallet/button/ButtonOptions;->w:I

    const/4 v1, 0x1

    const/4 v2, 0x4

    invoke-static {p1, v1, v2}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/google/android/gms/wallet/button/ButtonOptions;->x:I

    const/4 v1, 0x2

    invoke-static {p1, v1, v2}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/google/android/gms/wallet/button/ButtonOptions;->y:I

    const/4 v1, 0x3

    invoke-static {p1, v1, v2}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/google/android/gms/wallet/button/ButtonOptions;->z:Ljava/lang/String;

    invoke-static {p1, v2, v0}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    invoke-static {p1, p2}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
