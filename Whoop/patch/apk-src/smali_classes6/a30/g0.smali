.class public final La30/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La30/j0;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "La30/g0;",
            ">;"
        }
    .end annotation
.end field

.field public static final w:La30/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La30/g0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La30/g0;->w:La30/g0;

    new-instance v0, La10/a;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, La10/a;-><init>(I)V

    sput-object v0, La30/g0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final P()Ljava/util/List;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, La30/g0;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public final g()Lj00/d0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    const v0, 0xd44675d

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "AlreadyRegistered"

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
