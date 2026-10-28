.class public final Ltp/m;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ltp/m;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Z

.field public final F:Z

.field public final w:Z

.field public final x:Z

.field public final y:Z

.field public final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ltp/a0;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Ltp/a0;-><init>(I)V

    sput-object v0, Ltp/m;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZZZZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ltp/m;->w:Z

    iput-boolean p2, p0, Ltp/m;->x:Z

    iput-boolean p3, p0, Ltp/m;->y:Z

    iput-boolean p4, p0, Ltp/m;->z:Z

    iput-boolean p5, p0, Ltp/m;->E:Z

    iput-boolean p6, p0, Ltp/m;->F:Z

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

    iget-boolean v0, p0, Ltp/m;->w:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x2

    invoke-static {p1, v0, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget-boolean v0, p0, Ltp/m;->x:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x3

    invoke-static {p1, v0, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget-boolean v0, p0, Ltp/m;->y:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {p1, v1, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget-boolean v0, p0, Ltp/m;->z:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x5

    invoke-static {p1, v0, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget-boolean v0, p0, Ltp/m;->E:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x6

    invoke-static {p1, v0, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget-boolean v0, p0, Ltp/m;->F:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {p1, p2}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
