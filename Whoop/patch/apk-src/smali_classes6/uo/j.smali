.class public final Luo/j;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Luo/j;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:J

.field public final F:Ljava/lang/String;

.field public final G:Ljava/lang/String;

.field public final H:I

.field public final I:I

.field public final w:I

.field public final x:I

.field public final y:I

.field public final z:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsp/e;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lsp/e;-><init>(I)V

    sput-object v0, Luo/j;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Luo/j;->w:I

    iput p2, p0, Luo/j;->x:I

    iput p3, p0, Luo/j;->y:I

    iput-wide p4, p0, Luo/j;->z:J

    iput-wide p6, p0, Luo/j;->E:J

    iput-object p8, p0, Luo/j;->F:Ljava/lang/String;

    iput-object p9, p0, Luo/j;->G:Ljava/lang/String;

    iput p10, p0, Luo/j;->H:I

    iput p11, p0, Luo/j;->I:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const/16 p2, 0x4f45

    invoke-static {p1, p2}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result p2

    const/4 v0, 0x1

    const/4 v1, 0x4

    invoke-static {p1, v0, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget v0, p0, Luo/j;->w:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x2

    invoke-static {p1, v0, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget v0, p0, Luo/j;->x:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x3

    invoke-static {p1, v0, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget v0, p0, Luo/j;->y:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/16 v0, 0x8

    invoke-static {p1, v1, v0}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget-wide v2, p0, Luo/j;->z:J

    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    const/4 v2, 0x5

    invoke-static {p1, v2, v0}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget-wide v2, p0, Luo/j;->E:J

    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    const/4 v2, 0x6

    iget-object v3, p0, Luo/j;->F:Ljava/lang/String;

    invoke-static {p1, v2, v3}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v2, 0x7

    iget-object v3, p0, Luo/j;->G:Ljava/lang/String;

    invoke-static {p1, v2, v3}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    invoke-static {p1, v0, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget v0, p0, Luo/j;->H:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/16 v0, 0x9

    invoke-static {p1, v0, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget v0, p0, Luo/j;->I:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {p1, p2}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
