.class public final Ly00/g5;
.super Ly00/j5;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ly00/g5;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final x:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly00/i4;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ly00/i4;-><init>(I)V

    sput-object v0, Ly00/g5;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Boolean;)V
    .locals 1

    sget-object v0, Ly00/f4;->H:Ly00/f4;

    invoke-direct {p0, v0}, Ly00/j5;-><init>(Ly00/f4;)V

    iput-object p1, p0, Ly00/g5;->x:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final b()Ljava/util/List;
    .locals 3

    iget-object v0, p0, Ly00/g5;->x:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Ll83/k;

    const-string v2, "set_as_default_payment_method"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ly00/g5;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly00/g5;

    iget-object v1, p0, Ly00/g5;->x:Ljava/lang/Boolean;

    iget-object p1, p1, Ly00/g5;->x:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Ly00/g5;->x:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const-string v0, "Link(setAsDefault="

    const-string v1, ")"

    iget-object v2, p0, Ly00/g5;->x:Ljava/lang/Boolean;

    invoke-static {v0, v2, v1}, Lte0/d;->j(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Ly00/g5;->x:Ljava/lang/Boolean;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_0
    const/4 v0, 0x1

    invoke-static {p1, v0, p2}, Lvl/b;->s(Landroid/os/Parcel;ILjava/lang/Boolean;)V

    return-void
.end method
