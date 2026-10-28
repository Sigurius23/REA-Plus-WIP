.class public final Luo/d0;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Luo/d0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public w:Landroid/os/Bundle;

.field public x:[Lcom/google/android/gms/common/c;

.field public y:I

.field public z:Luo/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/fragment/app/q1;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Landroidx/fragment/app/q1;-><init>(I)V

    sput-object v0, Luo/d0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const/16 v0, 0x4f45

    invoke-static {p1, v0}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result v0

    const/4 v1, 0x1

    iget-object v2, p0, Luo/d0;->w:Landroid/os/Bundle;

    invoke-static {p1, v1, v2}, Lvo/c;->e(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    const/4 v1, 0x2

    iget-object v2, p0, Luo/d0;->x:[Lcom/google/android/gms/common/c;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->p(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    iget v1, p0, Luo/d0;->y:I

    const/4 v2, 0x3

    const/4 v3, 0x4

    invoke-static {p1, v2, v3}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v1, p0, Luo/d0;->z:Luo/f;

    invoke-static {p1, v3, v1, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    invoke-static {p1, v0}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
