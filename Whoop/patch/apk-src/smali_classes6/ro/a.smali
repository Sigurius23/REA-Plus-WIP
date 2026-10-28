.class public final Lro/a;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lro/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:I

.field public final x:I

.field public final y:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq30/j0;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lq30/j0;-><init>(I)V

    sput-object v0, Lro/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IILandroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lro/a;->w:I

    iput p2, p0, Lro/a;->x:I

    iput-object p3, p0, Lro/a;->y:Landroid/os/Bundle;

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

    iget v0, p0, Lro/a;->w:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x2

    invoke-static {p1, v0, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget v0, p0, Lro/a;->x:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x3

    iget-object v1, p0, Lro/a;->y:Landroid/os/Bundle;

    invoke-static {p1, v0, v1}, Lvo/c;->e(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    invoke-static {p1, p2}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
