.class public final Luo/f;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Luo/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:I

.field public final F:[I

.field public final w:Luo/l;

.field public final x:Z

.field public final y:Z

.field public final z:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsp/e;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lsp/e;-><init>(I)V

    sput-object v0, Luo/f;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Luo/l;ZZ[II[I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luo/f;->w:Luo/l;

    iput-boolean p2, p0, Luo/f;->x:Z

    iput-boolean p3, p0, Luo/f;->y:Z

    iput-object p4, p0, Luo/f;->z:[I

    iput p5, p0, Luo/f;->E:I

    iput-object p6, p0, Luo/f;->F:[I

    return-void
.end method


# virtual methods
.method public final b()Luo/l;
    .locals 1

    iget-object v0, p0, Luo/f;->w:Luo/l;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const/16 v0, 0x4f45

    invoke-static {p1, v0}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result v0

    const/4 v1, 0x1

    iget-object v2, p0, Luo/f;->w:Luo/l;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/4 p2, 0x2

    const/4 v1, 0x4

    invoke-static {p1, p2, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget-boolean p2, p0, Luo/f;->x:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 p2, 0x3

    invoke-static {p1, p2, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget-boolean p2, p0, Luo/f;->y:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Luo/f;->z:[I

    invoke-static {p1, v1, p2}, Lvo/c;->i(Landroid/os/Parcel;I[I)V

    const/4 p2, 0x5

    invoke-static {p1, p2, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget p2, p0, Luo/f;->E:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 p2, 0x6

    iget-object v1, p0, Luo/f;->F:[I

    invoke-static {p1, p2, v1}, Lvo/c;->i(Landroid/os/Parcel;I[I)V

    invoke-static {p1, v0}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
