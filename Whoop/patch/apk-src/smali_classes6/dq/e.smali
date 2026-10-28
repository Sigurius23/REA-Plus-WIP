.class public final Ldq/e;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ldq/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public w:Ljava/lang/String;

.field public x:Ljava/lang/String;

.field public y:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldq/x;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Ldq/x;-><init>(I)V

    sput-object v0, Ldq/e;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const/16 p2, 0x4f45

    invoke-static {p1, p2}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result p2

    iget-object v0, p0, Ldq/e;->w:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-static {p1, v1, v0}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    iget-object v0, p0, Ldq/e;->x:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-static {p1, v2, v0}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    iget v0, p0, Ldq/e;->y:I

    const/4 v3, 0x1

    if-eq v0, v3, :cond_0

    if-eq v0, v1, :cond_0

    if-eq v0, v2, :cond_0

    const/4 v0, 0x0

    :cond_0
    const/4 v1, 0x4

    invoke-static {p1, v1, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {p1, p2}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
