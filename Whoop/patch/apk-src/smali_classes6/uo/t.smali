.class public final Luo/t;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Luo/t;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Z

.field public final w:I

.field public final x:Landroid/os/IBinder;

.field public final y:Lcom/google/android/gms/common/a;

.field public final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsp/e;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lsp/e;-><init>(I)V

    sput-object v0, Luo/t;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILandroid/os/IBinder;Lcom/google/android/gms/common/a;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Luo/t;->w:I

    iput-object p2, p0, Luo/t;->x:Landroid/os/IBinder;

    iput-object p3, p0, Luo/t;->y:Lcom/google/android/gms/common/a;

    iput-boolean p4, p0, Luo/t;->z:Z

    iput-boolean p5, p0, Luo/t;->E:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-nez p1, :cond_0

    goto :goto_3

    :cond_0
    if-ne p0, p1, :cond_1

    goto :goto_2

    :cond_1
    instance-of v0, p1, Luo/t;

    if-nez v0, :cond_2

    goto :goto_3

    :cond_2
    check-cast p1, Luo/t;

    iget-object v0, p0, Luo/t;->y:Lcom/google/android/gms/common/a;

    iget-object v1, p1, Luo/t;->y:Lcom/google/android/gms/common/a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x0

    iget-object v1, p0, Luo/t;->x:Landroid/os/IBinder;

    if-nez v1, :cond_3

    move-object v1, v0

    goto :goto_0

    :cond_3
    invoke-static {v1}, Luo/a;->X(Landroid/os/IBinder;)Luo/i;

    move-result-object v1

    :goto_0
    iget-object p1, p1, Luo/t;->x:Landroid/os/IBinder;

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    invoke-static {p1}, Luo/a;->X(Landroid/os/IBinder;)Luo/i;

    move-result-object v0

    :goto_1
    invoke-static {v1, v0}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    :goto_2
    const/4 p1, 0x1

    return p1

    :cond_5
    :goto_3
    const/4 p1, 0x0

    return p1
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const/16 v0, 0x4f45

    invoke-static {p1, v0}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x4

    invoke-static {p1, v1, v2}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget v1, p0, Luo/t;->w:I

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v1, 0x2

    iget-object v3, p0, Luo/t;->x:Landroid/os/IBinder;

    invoke-static {p1, v1, v3}, Lvo/c;->h(Landroid/os/Parcel;ILandroid/os/IBinder;)V

    const/4 v1, 0x3

    iget-object v3, p0, Luo/t;->y:Lcom/google/android/gms/common/a;

    invoke-static {p1, v1, v3, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    invoke-static {p1, v2, v2}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget-boolean p2, p0, Luo/t;->z:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 p2, 0x5

    invoke-static {p1, p2, v2}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget-boolean p2, p0, Luo/t;->E:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {p1, v0}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
