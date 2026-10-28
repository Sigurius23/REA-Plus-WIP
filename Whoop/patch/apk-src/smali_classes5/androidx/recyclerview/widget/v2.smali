.class public final Landroidx/recyclerview/widget/v2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/recyclerview/widget/v2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public E:I

.field public F:[I

.field public G:Ljava/util/ArrayList;

.field public H:Z

.field public I:Z

.field public J:Z

.field public w:I

.field public x:I

.field public y:I

.field public z:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/recyclerview/widget/v0;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/v0;-><init>(I)V

    sput-object v0, Landroidx/recyclerview/widget/v2;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget p2, p0, Landroidx/recyclerview/widget/v2;->w:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Landroidx/recyclerview/widget/v2;->x:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Landroidx/recyclerview/widget/v2;->y:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Landroidx/recyclerview/widget/v2;->y:I

    if-lez p2, :cond_0

    iget-object p2, p0, Landroidx/recyclerview/widget/v2;->z:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    :cond_0
    iget p2, p0, Landroidx/recyclerview/widget/v2;->E:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Landroidx/recyclerview/widget/v2;->E:I

    if-lez p2, :cond_1

    iget-object p2, p0, Landroidx/recyclerview/widget/v2;->F:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    :cond_1
    iget-boolean p2, p0, Landroidx/recyclerview/widget/v2;->H:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Landroidx/recyclerview/widget/v2;->I:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Landroidx/recyclerview/widget/v2;->J:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Landroidx/recyclerview/widget/v2;->G:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    return-void
.end method
