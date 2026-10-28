.class public final Lgq/d;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lgq/d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public E:J

.field public F:I

.field public w:I

.field public x:Ljava/lang/String;

.field public y:D

.field public z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgp/r0;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lgp/r0;-><init>(I)V

    sput-object v0, Lgq/d;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    const/16 p2, 0x4f45

    invoke-static {p1, p2}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result p2

    iget v0, p0, Lgq/d;->w:I

    const/4 v1, 0x2

    const/4 v2, 0x4

    invoke-static {p1, v1, v2}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x3

    iget-object v1, p0, Lgq/d;->x:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    iget-wide v0, p0, Lgq/d;->y:D

    const/16 v3, 0x8

    invoke-static {p1, v2, v3}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    const/4 v0, 0x5

    iget-object v1, p0, Lgq/d;->z:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    iget-wide v0, p0, Lgq/d;->E:J

    const/4 v4, 0x6

    invoke-static {p1, v4, v3}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget v0, p0, Lgq/d;->F:I

    const/4 v1, 0x7

    invoke-static {p1, v1, v2}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {p1, p2}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
