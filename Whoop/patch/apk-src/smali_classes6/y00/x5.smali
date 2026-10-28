.class public final Ly00/x5;
.super Ly00/y5;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ly00/x5;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Ljava/util/Set;

.field public final F:Ly00/r3;

.field public final w:Ljava/lang/Integer;

.field public final x:Ljava/lang/Integer;

.field public final y:Ly00/w5;

.field public final z:Ly00/v3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly00/r5;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ly00/r5;-><init>(I)V

    sput-object v0, Ly00/x5;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Ly00/w5;Ly00/v3;Ljava/util/Set;Ly00/r3;)V
    .locals 1

    sget-object v0, Ly00/f4;->G:Lt9/c0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly00/x5;->w:Ljava/lang/Integer;

    iput-object p2, p0, Ly00/x5;->x:Ljava/lang/Integer;

    iput-object p3, p0, Ly00/x5;->y:Ly00/w5;

    iput-object p4, p0, Ly00/x5;->z:Ly00/v3;

    iput-object p5, p0, Ly00/x5;->E:Ljava/util/Set;

    iput-object p6, p0, Ly00/x5;->F:Ly00/r3;

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

    instance-of v0, p1, Ly00/x5;

    if-eqz v0, :cond_0

    check-cast p1, Ly00/x5;

    iget-object v0, p1, Ly00/x5;->w:Ljava/lang/Integer;

    iget-object v1, p0, Ly00/x5;->w:Ljava/lang/Integer;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Ly00/x5;->x:Ljava/lang/Integer;

    iget-object v1, p0, Ly00/x5;->x:Ljava/lang/Integer;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Ly00/x5;->y:Ly00/w5;

    iget-object v1, p0, Ly00/x5;->y:Ly00/w5;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Ly00/x5;->z:Ly00/v3;

    iget-object v0, p0, Ly00/x5;->z:Ly00/v3;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Ly00/x5;->y:Ly00/w5;

    iget-object v1, p0, Ly00/x5;->z:Ly00/v3;

    iget-object v2, p0, Ly00/x5;->w:Ljava/lang/Integer;

    iget-object v3, p0, Ly00/x5;->x:Ljava/lang/Integer;

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", expiryYear="

    const-string v1, ", networks="

    const-string v2, "PaymentMethodCreateParams.Card.(expiryMonth="

    iget-object v3, p0, Ly00/x5;->w:Ljava/lang/Integer;

    iget-object v4, p0, Ly00/x5;->x:Ljava/lang/Integer;

    invoke-static {v2, v3, v0, v4, v1}, Lvl/b;->l(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ly00/x5;->y:Ly00/w5;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", billingDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/x5;->z:Ly00/v3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Ly00/x5;->w:Ljava/lang/Integer;

    if-nez v2, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v0, v2}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_0
    iget-object v2, p0, Ly00/x5;->x:Ljava/lang/Integer;

    if-nez v2, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-static {p1, v0, v2}, Lc13/a;->u(Landroid/os/Parcel;ILjava/lang/Integer;)V

    :goto_1
    iget-object v2, p0, Ly00/x5;->y:Ly00/w5;

    if-nez v2, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/w5;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_2
    iget-object v2, p0, Ly00/x5;->z:Ly00/v3;

    if-nez v2, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/v3;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_3
    iget-object v2, p0, Ly00/x5;->E:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_4

    :cond_4
    iget-object v2, p0, Ly00/x5;->F:Ly00/r3;

    if-nez v2, :cond_5

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_5
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/r3;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
