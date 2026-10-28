.class public final Laq/f;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Laq/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:I

.field public final x:Lcom/google/android/gms/common/a;

.field public final y:Luo/t;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La10/a;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, La10/a;-><init>(I)V

    sput-object v0, Laq/f;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILcom/google/android/gms/common/a;Luo/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Laq/f;->w:I

    iput-object p2, p0, Laq/f;->x:Lcom/google/android/gms/common/a;

    iput-object p3, p0, Laq/f;->y:Luo/t;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const/16 v0, 0x4f45

    invoke-static {p1, v0}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result v0

    const/4 v1, 0x4

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget v1, p0, Laq/f;->w:I

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v1, 0x2

    iget-object v2, p0, Laq/f;->x:Lcom/google/android/gms/common/a;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/4 v1, 0x3

    iget-object v2, p0, Laq/f;->y:Luo/t;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    invoke-static {p1, v0}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
