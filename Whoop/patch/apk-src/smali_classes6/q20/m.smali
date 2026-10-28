.class public final Lq20/m;
.super Lq20/y;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lq20/m;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final x:Lwz/h0;

.field public final y:Lwz/u0;

.field public final z:Ly00/j0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpn/a;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lpn/a;-><init>(I)V

    sput-object v0, Lq20/m;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lwz/h0;Lwz/u0;Ly00/j0;)V
    .locals 1

    const-string v0, "linkExpressMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lq20/m;->x:Lwz/h0;

    .line 3
    iput-object p2, p0, Lq20/m;->y:Lwz/u0;

    .line 4
    iput-object p3, p0, Lq20/m;->z:Ly00/j0;

    return-void
.end method

.method public synthetic constructor <init>(Lwz/h0;Lwz/u0;Ly00/j0;I)V
    .locals 2

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    .line 5
    sget-object p1, Lwz/h0;->w:Lwz/h0;

    :cond_0
    and-int/lit8 v0, p4, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object p2, v1

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v1

    .line 6
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lq20/m;-><init>(Lwz/h0;Lwz/u0;Ly00/j0;)V

    return-void
.end method

.method public static h(Lq20/m;Lwz/u0;)Lq20/m;
    .locals 2

    iget-object v0, p0, Lq20/m;->x:Lwz/h0;

    iget-object v1, p0, Lq20/m;->z:Ly00/j0;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p0, "linkExpressMode"

    invoke-static {v0, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lq20/m;

    invoke-direct {p0, v0, p1, v1}, Lq20/m;-><init>(Lwz/h0;Lwz/u0;Ly00/j0;)V

    return-object p0
.end method


# virtual methods
.method public final b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
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
    instance-of v1, p1, Lq20/m;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lq20/m;

    iget-object v1, p0, Lq20/m;->x:Lwz/h0;

    iget-object v3, p1, Lq20/m;->x:Lwz/h0;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lq20/m;->y:Lwz/u0;

    iget-object v3, p1, Lq20/m;->y:Lwz/u0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lq20/m;->z:Ly00/j0;

    iget-object p1, p1, Lq20/m;->z:Ly00/j0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final f(Ljava/lang/String;Z)Lzy/c;
    .locals 0

    const-string p2, "merchantName"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lq20/m;->x:Lwz/h0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    const/4 v1, 0x0

    iget-object v2, p0, Lq20/m;->y:Lwz/u0;

    if-nez v2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lq20/m;->z:Ly00/j0;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ly00/j0;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Link(linkExpressMode="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lq20/m;->x:Lwz/h0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", selectedPayment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq20/m;->y:Lwz/u0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shippingAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq20/m;->z:Ly00/j0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq20/m;->x:Lwz/h0;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lq20/m;->y:Lwz/u0;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lq20/m;->z:Ly00/j0;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
