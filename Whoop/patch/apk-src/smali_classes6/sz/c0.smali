.class public final Lsz/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lsz/c0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Lsz/b0;

.field public final F:Z

.field public final G:Z

.field public final H:Ljava/util/List;

.field public final w:Lsz/g;

.field public final x:Ljava/lang/String;

.field public final y:Ljava/lang/String;

.field public final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsz/h;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lsz/h;-><init>(I)V

    sput-object v0, Lsz/c0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(Lsz/g;Ljava/lang/String;Ljava/lang/String;ZLsz/b0;Ljava/util/List;)V
    .locals 9

    const/4 v6, 0x1

    const/4 v7, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    move-object v8, p6

    .line 1
    invoke-direct/range {v0 .. v8}, Lsz/c0;-><init>(Lsz/g;Ljava/lang/String;Ljava/lang/String;ZLsz/b0;ZZLjava/util/List;)V

    return-void
.end method

.method public constructor <init>(Lsz/g;Ljava/lang/String;Ljava/lang/String;ZLsz/b0;ZZLjava/util/List;)V
    .locals 1

    const-string v0, "environment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "merchantCountryCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "merchantName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingAddressConfig"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalEnabledNetworks"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lsz/c0;->w:Lsz/g;

    .line 4
    iput-object p2, p0, Lsz/c0;->x:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lsz/c0;->y:Ljava/lang/String;

    .line 6
    iput-boolean p4, p0, Lsz/c0;->z:Z

    .line 7
    iput-object p5, p0, Lsz/c0;->E:Lsz/b0;

    .line 8
    iput-boolean p6, p0, Lsz/c0;->F:Z

    .line 9
    iput-boolean p7, p0, Lsz/c0;->G:Z

    .line 10
    iput-object p8, p0, Lsz/c0;->H:Ljava/util/List;

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
    instance-of v1, p1, Lsz/c0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lsz/c0;

    iget-object v1, p0, Lsz/c0;->w:Lsz/g;

    iget-object v3, p1, Lsz/c0;->w:Lsz/g;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lsz/c0;->x:Ljava/lang/String;

    iget-object v3, p1, Lsz/c0;->x:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lsz/c0;->y:Ljava/lang/String;

    iget-object v3, p1, Lsz/c0;->y:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lsz/c0;->z:Z

    iget-boolean v3, p1, Lsz/c0;->z:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lsz/c0;->E:Lsz/b0;

    iget-object v3, p1, Lsz/c0;->E:Lsz/b0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lsz/c0;->F:Z

    iget-boolean v3, p1, Lsz/c0;->F:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lsz/c0;->G:Z

    iget-boolean v3, p1, Lsz/c0;->G:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lsz/c0;->H:Ljava/util/List;

    iget-object p1, p1, Lsz/c0;->H:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lsz/c0;->w:Lsz/g;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lsz/c0;->x:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lsz/c0;->y:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lsz/c0;->z:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lsz/c0;->E:Lsz/b0;

    invoke-virtual {v2}, Lsz/b0;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lsz/c0;->F:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lsz/c0;->G:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lsz/c0;->H:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Config(environment="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lsz/c0;->w:Lsz/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", merchantCountryCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lsz/c0;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", merchantName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isEmailRequired="

    const-string v2, ", billingAddressConfig="

    iget-object v3, p0, Lsz/c0;->y:Ljava/lang/String;

    iget-boolean v4, p0, Lsz/c0;->z:Z

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    iget-object v1, p0, Lsz/c0;->E:Lsz/b0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", existingPaymentMethodRequired="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lsz/c0;->F:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", allowCreditCards="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lsz/c0;->G:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", additionalEnabledNetworks="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lsz/c0;->H:Ljava/util/List;

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

    iget-object v0, p0, Lsz/c0;->w:Lsz/g;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lsz/c0;->x:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lsz/c0;->y:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lsz/c0;->z:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lsz/c0;->E:Lsz/b0;

    invoke-virtual {v0, p1, p2}, Lsz/b0;->writeToParcel(Landroid/os/Parcel;I)V

    iget-boolean p2, p0, Lsz/c0;->F:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lsz/c0;->G:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lsz/c0;->H:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    return-void
.end method
