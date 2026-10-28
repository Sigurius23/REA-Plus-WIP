.class public final Lv10/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lv10/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Ljava/lang/String;

.field public final F:Ly00/m6;

.field public final G:Ljava/lang/String;

.field public final w:Ljava/lang/String;

.field public final x:I

.field public final y:Lcom/stripe/android/core/exception/StripeException;

.field public final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv00/g0;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lv00/g0;-><init>(I)V

    sput-object v0, Lv10/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Ljava/lang/String;I)V
    .locals 10

    and-int/lit8 v0, p7, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object v3, p1

    :goto_0
    and-int/lit8 p1, p7, 0x2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    move v4, v0

    goto :goto_1

    :cond_1
    move v4, p2

    :goto_1
    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    move-object v5, v1

    goto :goto_2

    :cond_2
    move-object v5, p3

    :goto_2
    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    move v6, v0

    goto :goto_3

    :cond_3
    move v6, p4

    :goto_3
    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_4

    move-object v7, v1

    goto :goto_4

    :cond_4
    move-object v7, p5

    :goto_4
    and-int/lit8 p1, p7, 0x40

    if-eqz p1, :cond_5

    move-object v9, v1

    goto :goto_5

    :cond_5
    move-object/from16 v9, p6

    :goto_5
    const/4 v8, 0x0

    move-object v2, p0

    .line 1
    invoke-direct/range {v2 .. v9}, Lv10/b;-><init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Ly00/m6;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Ly00/m6;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lv10/b;->w:Ljava/lang/String;

    .line 4
    iput p2, p0, Lv10/b;->x:I

    .line 5
    iput-object p3, p0, Lv10/b;->y:Lcom/stripe/android/core/exception/StripeException;

    .line 6
    iput-boolean p4, p0, Lv10/b;->z:Z

    .line 7
    iput-object p5, p0, Lv10/b;->E:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lv10/b;->F:Ly00/m6;

    .line 9
    iput-object p7, p0, Lv10/b;->G:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b()Landroid/os/Bundle;
    .locals 2

    new-instance v0, Ll83/k;

    const-string v1, "extra_args"

    invoke-direct {v0, v1, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

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
    instance-of v1, p1, Lv10/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lv10/b;

    iget-object v1, p0, Lv10/b;->w:Ljava/lang/String;

    iget-object v3, p1, Lv10/b;->w:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lv10/b;->x:I

    iget v3, p1, Lv10/b;->x:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lv10/b;->y:Lcom/stripe/android/core/exception/StripeException;

    iget-object v3, p1, Lv10/b;->y:Lcom/stripe/android/core/exception/StripeException;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lv10/b;->z:Z

    iget-boolean v3, p1, Lv10/b;->z:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lv10/b;->E:Ljava/lang/String;

    iget-object v3, p1, Lv10/b;->E:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lv10/b;->F:Ly00/m6;

    iget-object v3, p1, Lv10/b;->F:Ly00/m6;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lv10/b;->G:Ljava/lang/String;

    iget-object p1, p1, Lv10/b;->G:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final f()Lv10/c;
    .locals 8

    iget-object v0, p0, Lv10/b;->y:Lcom/stripe/android/core/exception/StripeException;

    if-nez v0, :cond_1

    iget-object v0, p0, Lv10/b;->w:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v1, Lv10/c;

    iget-object v6, p0, Lv10/b;->F:Ly00/m6;

    iget-object v7, p0, Lv10/b;->G:Ljava/lang/String;

    iget-object v2, p0, Lv10/b;->w:Ljava/lang/String;

    iget v3, p0, Lv10/b;->x:I

    iget-boolean v4, p0, Lv10/b;->z:Z

    iget-object v5, p0, Lv10/b;->E:Ljava/lang/String;

    invoke-direct/range {v1 .. v7}, Lv10/c;-><init>(Ljava/lang/String;IZLjava/lang/String;Ly00/m6;Ljava/lang/String;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid client_secret value in result Intent."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    throw v0
.end method

.method public final hashCode()I
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lv10/b;->w:Ljava/lang/String;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v1, v2

    iget v3, p0, Lv10/b;->x:I

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lv10/b;->y:Lcom/stripe/android/core/exception/StripeException;

    if-nez v3, :cond_1

    move v3, v0

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/stripe/android/core/exception/StripeException;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-boolean v3, p0, Lv10/b;->z:Z

    invoke-static {v1, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v1

    iget-object v3, p0, Lv10/b;->E:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v0

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lv10/b;->F:Ly00/m6;

    if-nez v3, :cond_3

    move v3, v0

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ly00/m6;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v2, p0, Lv10/b;->G:Ljava/lang/String;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", flowOutcome="

    const-string v1, ", exception="

    iget v2, p0, Lv10/b;->x:I

    const-string v3, "Unvalidated(clientSecret="

    iget-object v4, p0, Lv10/b;->w:Ljava/lang/String;

    invoke-static {v2, v3, v4, v0, v1}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lv10/b;->y:Lcom/stripe/android/core/exception/StripeException;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", canCancelSource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lv10/b;->z:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", sourceId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lv10/b;->E:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", source="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lv10/b;->F:Ly00/m6;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stripeAccountId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    iget-object v2, p0, Lv10/b;->G:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lv10/b;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lv10/b;->x:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lv10/b;->y:Lcom/stripe/android/core/exception/StripeException;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-boolean v1, p0, Lv10/b;->z:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lv10/b;->E:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lv10/b;->F:Ly00/m6;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lv10/b;->G:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
