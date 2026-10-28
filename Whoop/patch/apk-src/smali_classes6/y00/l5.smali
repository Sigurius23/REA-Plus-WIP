.class public final Ly00/l5;
.super Ly00/u5;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ly00/l5;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Ljava/lang/Boolean;

.field public final x:Ljava/lang/String;

.field public final y:Ljava/lang/String;

.field public final z:Ly00/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly00/i4;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Ly00/i4;-><init>(I)V

    sput-object v0, Ly00/l5;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ly00/o;)V
    .locals 2

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object p2, v1

    :cond_0
    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_1

    move-object p3, v1

    .line 7
    :cond_1
    invoke-direct {p0, p2, v1, p3, v1}, Ly00/l5;-><init>(Ljava/lang/String;Ljava/lang/String;Ly00/o;Ljava/lang/Boolean;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ly00/o;Ljava/lang/Boolean;)V
    .locals 1

    .line 2
    sget-object v0, Ly00/f4;->I:Ly00/f4;

    invoke-direct {p0, v0}, Ly00/u5;-><init>(Ly00/f4;)V

    .line 3
    iput-object p1, p0, Ly00/l5;->x:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Ly00/l5;->y:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Ly00/l5;->z:Ly00/o;

    .line 6
    iput-object p4, p0, Ly00/l5;->E:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(Ly00/o;)V
    .locals 2

    const/4 v0, 0x0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1
    invoke-direct {p0, v0, v0, p1, v1}, Ly00/l5;-><init>(Ljava/lang/String;Ljava/lang/String;Ly00/o;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static f(Ly00/l5;Ljava/lang/String;Ly00/o;I)Ly00/l5;
    .locals 1

    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_0

    iget-object p1, p0, Ly00/l5;->x:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Ly00/l5;->y:Ljava/lang/String;

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_1

    iget-object p2, p0, Ly00/l5;->z:Ly00/o;

    :cond_1
    iget-object p3, p0, Ly00/l5;->E:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Ly00/l5;

    invoke-direct {p0, p1, v0, p2, p3}, Ly00/l5;-><init>(Ljava/lang/String;Ljava/lang/String;Ly00/o;Ljava/lang/Boolean;)V

    return-object p0
.end method


# virtual methods
.method public final b()Ljava/util/List;
    .locals 6

    new-instance v0, Ll83/k;

    const-string v1, "cvc"

    iget-object v2, p0, Ly00/l5;->x:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "network"

    iget-object v3, p0, Ly00/l5;->y:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "moto"

    iget-object v4, p0, Ly00/l5;->E:Ljava/lang/Boolean;

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v3, p0, Ly00/l5;->z:Ly00/o;

    if-eqz v3, :cond_0

    iget-object v3, v3, Ly00/o;->w:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    new-instance v4, Ll83/k;

    const-string v5, "setup_future_usage"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1, v2, v4}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ly00/l5;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly00/l5;

    iget-object v1, p0, Ly00/l5;->x:Ljava/lang/String;

    iget-object v3, p1, Ly00/l5;->x:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ly00/l5;->y:Ljava/lang/String;

    iget-object v3, p1, Ly00/l5;->y:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ly00/l5;->z:Ly00/o;

    iget-object v3, p1, Ly00/l5;->z:Ly00/o;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ly00/l5;->E:Ljava/lang/Boolean;

    iget-object p1, p1, Ly00/l5;->E:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Ly00/l5;->x:Ljava/lang/String;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ly00/l5;->y:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ly00/l5;->z:Ly00/o;

    if-nez v2, :cond_2

    move v2, v0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ly00/l5;->E:Ljava/lang/Boolean;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", network="

    const-string v1, ", setupFutureUsage="

    const-string v2, "Card(cvc="

    iget-object v3, p0, Ly00/l5;->x:Ljava/lang/String;

    iget-object v4, p0, Ly00/l5;->y:Ljava/lang/String;

    invoke-static {v2, v3, v0, v4, v1}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ly00/l5;->z:Ly00/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", moto="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/l5;->E:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Ly00/l5;->x:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Ly00/l5;->y:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 p2, 0x1

    const/4 v0, 0x0

    iget-object v1, p0, Ly00/l5;->z:Ly00/o;

    if-nez v1, :cond_0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_0
    iget-object v1, p0, Ly00/l5;->E:Ljava/lang/Boolean;

    if-nez v1, :cond_1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_1
    invoke-static {p1, p2, v1}, Lvl/b;->s(Landroid/os/Parcel;ILjava/lang/Boolean;)V

    return-void
.end method
