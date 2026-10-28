.class public final Ldq/f;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ldq/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public E:Z

.field public F:Ljava/lang/String;

.field public w:Ljava/util/ArrayList;

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/String;

.field public z:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldq/x;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ldq/x;-><init>(I)V

    sput-object v0, Ldq/f;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const/16 p2, 0x4f45

    invoke-static {p1, p2}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result p2

    const/4 v0, 0x2

    iget-object v1, p0, Ldq/f;->w:Ljava/util/ArrayList;

    invoke-static {p1, v0, v1}, Lvo/c;->j(Landroid/os/Parcel;ILjava/util/List;)V

    iget-object v0, p0, Ldq/f;->x:Ljava/lang/String;

    const/4 v1, 0x4

    invoke-static {p1, v1, v0}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v0, 0x5

    iget-object v2, p0, Ldq/f;->y:Ljava/lang/String;

    invoke-static {p1, v0, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v0, 0x6

    iget-object v2, p0, Ldq/f;->z:Ljava/util/ArrayList;

    invoke-static {p1, v0, v2}, Lvo/c;->j(Landroid/os/Parcel;ILjava/util/List;)V

    iget-boolean v0, p0, Ldq/f;->E:Z

    const/4 v2, 0x7

    invoke-static {p1, v2, v1}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/16 v0, 0x8

    iget-object v1, p0, Ldq/f;->F:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    invoke-static {p1, p2}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
