.class public final Ly00/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly00/z0;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ly00/w0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Ljava/lang/String;

.field public final w:J

.field public final x:Ljava/lang/String;

.field public final y:Lcom/stripe/android/model/StripeIntent$Usage;

.field public final z:Ly00/e3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly00/k;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Ly00/k;-><init>(I)V

    sput-object v0, Ly00/w0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Lcom/stripe/android/model/StripeIntent$Usage;Ly00/e3;Ljava/lang/String;)V
    .locals 1

    const-string v0, "currency"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "captureMethod"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ly00/w0;->w:J

    iput-object p3, p0, Ly00/w0;->x:Ljava/lang/String;

    iput-object p4, p0, Ly00/w0;->y:Lcom/stripe/android/model/StripeIntent$Usage;

    iput-object p5, p0, Ly00/w0;->z:Ly00/e3;

    iput-object p6, p0, Ly00/w0;->E:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final D()Lcom/stripe/android/model/StripeIntent$Usage;
    .locals 1

    iget-object v0, p0, Ly00/w0;->y:Lcom/stripe/android/model/StripeIntent$Usage;

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ly00/w0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly00/w0;

    iget-wide v3, p0, Ly00/w0;->w:J

    iget-wide v5, p1, Ly00/w0;->w:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ly00/w0;->x:Ljava/lang/String;

    iget-object v3, p1, Ly00/w0;->x:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ly00/w0;->y:Lcom/stripe/android/model/StripeIntent$Usage;

    iget-object v3, p1, Ly00/w0;->y:Lcom/stripe/android/model/StripeIntent$Usage;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ly00/w0;->z:Ly00/e3;

    iget-object v3, p1, Ly00/w0;->z:Ly00/e3;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ly00/w0;->E:Ljava/lang/String;

    iget-object p1, p1, Ly00/w0;->E:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-wide v0, p0, Ly00/w0;->w:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Ly00/w0;->x:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Ly00/w0;->y:Lcom/stripe/android/model/StripeIntent$Usage;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Ly00/w0;->z:Ly00/e3;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-object v0, p0, Ly00/w0;->E:Ljava/lang/String;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v3, v2

    return v3
.end method

.method public final k0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly00/w0;->x:Ljava/lang/String;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, "Payment(amount="

    const-string v1, ", currency="

    iget-wide v2, p0, Ly00/w0;->w:J

    iget-object v4, p0, Ly00/w0;->x:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v4}, Lvl/b;->m(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", setupFutureUsage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/w0;->y:Lcom/stripe/android/model/StripeIntent$Usage;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", captureMethod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/w0;->z:Ly00/e3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentMethodOptionsJsonString="

    const-string v2, ")"

    iget-object v3, p0, Ly00/w0;->E:Ljava/lang/String;

    invoke-static {v0, v1, v3, v2}, Lb9/y;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v()Ljava/lang/String;
    .locals 1

    const-string v0, "payment"

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Ly00/w0;->w:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object p2, p0, Ly00/w0;->x:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Ly00/w0;->y:Lcom/stripe/android/model/StripeIntent$Usage;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_0
    iget-object p2, p0, Ly00/w0;->z:Ly00/e3;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Ly00/w0;->E:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
