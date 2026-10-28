.class public final Lm30/d;
.super Lm30/a;
.source "SourceFile"

# interfaces
.implements Lm30/b;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lm30/d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public E:I

.field public z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljz/h;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Ljz/h;-><init>(I)V

    sput-object v0, Lm30/d;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lm30/d;

    if-eqz v0, :cond_0

    check-cast p1, Lm30/d;

    iget-object v0, p0, Lm30/d;->z:Ljava/lang/String;

    iget-object v1, p1, Lm30/d;->z:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lm30/d;->E:I

    iget p1, p1, Lm30/d;->E:I

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lm30/d;->z:Ljava/lang/String;

    iget v1, p0, Lm30/d;->E:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ls30/e;->g([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Lm30/a;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Lm30/d;->z:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lm30/d;->E:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
