.class public final Luo/l;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Luo/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:I

.field public final w:I

.field public final x:Z

.field public final y:Z

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/fragment/app/q1;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Landroidx/fragment/app/q1;-><init>(I)V

    sput-object v0, Luo/l;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IZZII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Luo/l;->w:I

    iput-boolean p2, p0, Luo/l;->x:Z

    iput-boolean p3, p0, Luo/l;->y:Z

    iput p4, p0, Luo/l;->z:I

    iput p5, p0, Luo/l;->E:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const/16 p2, 0x4f45

    invoke-static {p1, p2}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result p2

    const/4 v0, 0x1

    const/4 v1, 0x4

    invoke-static {p1, v0, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget v0, p0, Luo/l;->w:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x2

    invoke-static {p1, v0, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget-boolean v0, p0, Luo/l;->x:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x3

    invoke-static {p1, v0, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget-boolean v0, p0, Luo/l;->y:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {p1, v1, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget v0, p0, Luo/l;->z:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x5

    invoke-static {p1, v0, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget v0, p0, Luo/l;->E:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {p1, p2}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
