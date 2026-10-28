.class public final Lq20/s;
.super Lq20/t;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lq20/s;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Lt20/g;

.field public final F:Lq20/r;

.field public final G:Ly00/d5;

.field public final H:Lq20/h;

.field public final I:Ly00/u5;

.field public final J:Ly00/j5;

.field public final x:Ljava/lang/String;

.field public final y:I

.field public final z:Lq20/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq20/p;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lq20/p;-><init>(I)V

    sput-object v0, Lq20/s;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILq20/q;Lt20/g;Lq20/r;Ly00/d5;Lq20/h;Ly00/u5;Ly00/j5;)V
    .locals 1

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "screenState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodCreateParams"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerRequestedSave"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq20/s;->x:Ljava/lang/String;

    iput p2, p0, Lq20/s;->y:I

    iput-object p3, p0, Lq20/s;->z:Lq20/q;

    iput-object p4, p0, Lq20/s;->E:Lt20/g;

    iput-object p5, p0, Lq20/s;->F:Lq20/r;

    iput-object p6, p0, Lq20/s;->G:Ly00/d5;

    iput-object p7, p0, Lq20/s;->H:Lq20/h;

    iput-object p8, p0, Lq20/s;->I:Ly00/u5;

    iput-object p9, p0, Lq20/s;->J:Ly00/j5;

    return-void
.end method


# virtual methods
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
    instance-of v1, p1, Lq20/s;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lq20/s;

    iget-object v1, p0, Lq20/s;->x:Ljava/lang/String;

    iget-object v3, p1, Lq20/s;->x:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lq20/s;->y:I

    iget v3, p1, Lq20/s;->y:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lq20/s;->z:Lq20/q;

    iget-object v3, p1, Lq20/s;->z:Lq20/q;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lq20/s;->E:Lt20/g;

    iget-object v3, p1, Lq20/s;->E:Lt20/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lq20/s;->F:Lq20/r;

    iget-object v3, p1, Lq20/s;->F:Lq20/r;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lq20/s;->G:Ly00/d5;

    iget-object v3, p1, Lq20/s;->G:Ly00/d5;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lq20/s;->H:Lq20/h;

    iget-object v3, p1, Lq20/s;->H:Lq20/h;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lq20/s;->I:Ly00/u5;

    iget-object v3, p1, Lq20/s;->I:Ly00/u5;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lq20/s;->J:Ly00/j5;

    iget-object p1, p1, Lq20/s;->J:Ly00/j5;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final f(Ljava/lang/String;Z)Lzy/c;
    .locals 0

    const-string p2, "merchantName"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lq20/s;->E:Lt20/g;

    iget-object p1, p1, Lt20/g;->z:Lt20/b;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lt20/b;->F:Lzy/c;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final h()Lq20/h;
    .locals 1

    iget-object v0, p0, Lq20/s;->H:Lq20/h;

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lq20/s;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lq20/s;->y:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lq20/s;->z:Lq20/q;

    invoke-virtual {v2}, Lq20/q;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lq20/s;->E:Lt20/g;

    invoke-virtual {v0}, Lt20/g;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    const/4 v2, 0x0

    iget-object v3, p0, Lq20/s;->F:Lq20/r;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Lq20/r;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lq20/s;->G:Ly00/d5;

    invoke-virtual {v3}, Ly00/d5;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-object v0, p0, Lq20/s;->H:Lq20/h;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lq20/s;->I:Ly00/u5;

    if-nez v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lq20/s;->J:Ly00/j5;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public final i()Ly00/d5;
    .locals 1

    iget-object v0, p0, Lq20/s;->G:Ly00/d5;

    return-object v0
.end method

.method public final k()Ly00/j5;
    .locals 1

    iget-object v0, p0, Lq20/s;->J:Ly00/j5;

    return-object v0
.end method

.method public final s()Ly00/u5;
    .locals 1

    iget-object v0, p0, Lq20/s;->I:Ly00/u5;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", iconResource="

    const-string v1, ", input="

    iget v2, p0, Lq20/s;->y:I

    const-string v3, "USBankAccount(label="

    iget-object v4, p0, Lq20/s;->x:Ljava/lang/String;

    invoke-static {v2, v3, v4, v0, v1}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lq20/s;->z:Lq20/q;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", screenState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq20/s;->E:Lt20/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", instantDebits="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq20/s;->F:Lq20/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentMethodCreateParams="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq20/s;->G:Ly00/d5;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", customerRequestedSave="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq20/s;->H:Lq20/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentMethodOptionsParams="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq20/s;->I:Ly00/u5;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentMethodExtraParams="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq20/s;->J:Ly00/j5;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq20/s;->x:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lq20/s;->y:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lq20/s;->z:Lq20/q;

    invoke-virtual {v0, p1, p2}, Lq20/q;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lq20/s;->E:Lt20/g;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lq20/s;->F:Lq20/r;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lq20/r;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lq20/s;->G:Ly00/d5;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lq20/s;->H:Lq20/h;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lq20/s;->I:Ly00/u5;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lq20/s;->J:Ly00/j5;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
