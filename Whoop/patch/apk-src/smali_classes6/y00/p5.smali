.class public final Ly00/p5;
.super Ly00/u5;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ly00/p5;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final x:Ly00/f4;

.field public final y:Ly00/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly00/i4;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Ly00/i4;-><init>(I)V

    sput-object v0, Ly00/p5;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ly00/f4;Ly00/o;)V
    .locals 1

    const-string v0, "paymentMethodType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setupFutureUsage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ly00/u5;-><init>(Ly00/f4;)V

    iput-object p1, p0, Ly00/p5;->x:Ly00/f4;

    iput-object p2, p0, Ly00/p5;->y:Ly00/o;

    return-void
.end method


# virtual methods
.method public final b()Ljava/util/List;
    .locals 3

    iget-object v0, p0, Ly00/p5;->y:Ly00/o;

    iget-object v0, v0, Ly00/o;->w:Ljava/lang/String;

    new-instance v1, Ll83/k;

    const-string v2, "setup_future_usage"

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
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ly00/p5;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly00/p5;

    iget-object v1, p0, Ly00/p5;->x:Ly00/f4;

    iget-object v3, p1, Ly00/p5;->x:Ly00/f4;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ly00/p5;->y:Ly00/o;

    iget-object p1, p1, Ly00/p5;->y:Ly00/o;

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Ly00/p5;->x:Ly00/f4;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ly00/p5;->y:Ly00/o;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SetupFutureUsage(paymentMethodType="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ly00/p5;->x:Ly00/f4;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", setupFutureUsage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/p5;->y:Ly00/o;

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

    iget-object v0, p0, Ly00/p5;->x:Ly00/f4;

    invoke-virtual {v0, p1, p2}, Ly00/f4;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Ly00/p5;->y:Ly00/o;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
