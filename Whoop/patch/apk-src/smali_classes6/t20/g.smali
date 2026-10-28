.class public final Lt20/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lt20/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Lzy/c;

.field public final w:Z

.field public final x:Ljava/lang/String;

.field public final y:Z

.field public final z:Lt20/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt20/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lt20/a;-><init>(I)V

    sput-object v0, Lt20/g;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;ZLt20/b;Lzy/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lt20/g;->w:Z

    iput-object p2, p0, Lt20/g;->x:Ljava/lang/String;

    iput-boolean p3, p0, Lt20/g;->y:Z

    iput-object p4, p0, Lt20/g;->z:Lt20/b;

    iput-object p5, p0, Lt20/g;->E:Lzy/c;

    return-void
.end method

.method public static b(Lt20/g;ZLt20/b;I)Lt20/g;
    .locals 6

    iget-boolean v1, p0, Lt20/g;->w:Z

    iget-object v2, p0, Lt20/g;->x:Ljava/lang/String;

    and-int/lit8 v0, p3, 0x4

    if-eqz v0, :cond_0

    iget-boolean p1, p0, Lt20/g;->y:Z

    :cond_0
    move v3, p1

    and-int/lit8 p1, p3, 0x8

    if-eqz p1, :cond_1

    iget-object p2, p0, Lt20/g;->z:Lt20/b;

    :cond_1
    move-object v4, p2

    and-int/lit8 p1, p3, 0x10

    if-eqz p1, :cond_2

    iget-object p1, p0, Lt20/g;->E:Lzy/c;

    :goto_0
    move-object v5, p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lt20/g;

    invoke-direct/range {v0 .. v5}, Lt20/g;-><init>(ZLjava/lang/String;ZLt20/b;Lzy/c;)V

    return-object v0
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
    instance-of v1, p1, Lt20/g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lt20/g;

    iget-boolean v1, p0, Lt20/g;->w:Z

    iget-boolean v3, p1, Lt20/g;->w:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lt20/g;->x:Ljava/lang/String;

    iget-object v3, p1, Lt20/g;->x:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lt20/g;->y:Z

    iget-boolean v3, p1, Lt20/g;->y:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lt20/g;->z:Lt20/b;

    iget-object v3, p1, Lt20/g;->z:Lt20/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lt20/g;->E:Lzy/c;

    iget-object p1, p1, Lt20/g;->E:Lzy/c;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-boolean v0, p0, Lt20/g;->w:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    const/4 v2, 0x0

    iget-object v3, p0, Lt20/g;->x:Ljava/lang/String;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v3, p0, Lt20/g;->y:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lt20/g;->z:Lt20/b;

    if-nez v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lt20/b;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lt20/g;->E:Lzy/c;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", promoText="

    const-string v1, ", _isProcessing="

    const-string v2, "BankFormScreenState(isPaymentFlow="

    iget-object v3, p0, Lt20/g;->x:Ljava/lang/String;

    iget-boolean v4, p0, Lt20/g;->w:Z

    invoke-static {v2, v0, v3, v1, v4}, Lev/n;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lt20/g;->y:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", linkedBankAccount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt20/g;->z:Lt20/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", error="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt20/g;->E:Lzy/c;

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

    iget-boolean v0, p0, Lt20/g;->w:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lt20/g;->x:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lt20/g;->y:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lt20/g;->z:Lt20/b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lt20/b;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lt20/g;->E:Lzy/c;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
