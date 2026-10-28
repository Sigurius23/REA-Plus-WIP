.class public final Lp00/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lp00/q;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Z

.field public final F:Ljava/lang/String;

.field public final G:Ljava/lang/String;

.field public final H:Z

.field public final I:Z

.field public final J:Lq00/o;

.field public final K:Lcom/stripe/android/model/ConsentUi$ConsentSection;

.field public final L:Z

.field public final w:Z

.field public final x:Z

.field public final y:Lzy/c;

.field public final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp00/p;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lp00/q;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZZLzy/c;ZZLjava/lang/String;Ljava/lang/String;ZZLq00/o;Lcom/stripe/android/model/ConsentUi$ConsentSection;Z)V
    .locals 1

    const-string v0, "redactedPhoneNumber"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "email"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lp00/q;->w:Z

    iput-boolean p2, p0, Lp00/q;->x:Z

    iput-object p3, p0, Lp00/q;->y:Lzy/c;

    iput-boolean p4, p0, Lp00/q;->z:Z

    iput-boolean p5, p0, Lp00/q;->E:Z

    iput-object p6, p0, Lp00/q;->F:Ljava/lang/String;

    iput-object p7, p0, Lp00/q;->G:Ljava/lang/String;

    iput-boolean p8, p0, Lp00/q;->H:Z

    iput-boolean p9, p0, Lp00/q;->I:Z

    iput-object p10, p0, Lp00/q;->J:Lq00/o;

    iput-object p11, p0, Lp00/q;->K:Lcom/stripe/android/model/ConsentUi$ConsentSection;

    iput-boolean p12, p0, Lp00/q;->L:Z

    return-void
.end method

.method public static b(Lp00/q;ZLzy/c;ZZI)Lp00/q;
    .locals 14

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lp00/q;->w:Z

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lp00/q;->x:Z

    :goto_1
    move v3, v0

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :goto_2
    and-int/lit8 v0, p5, 0x4

    if-eqz v0, :cond_2

    iget-object v0, p0, Lp00/q;->y:Lzy/c;

    move-object v4, v0

    goto :goto_3

    :cond_2
    move-object/from16 v4, p2

    :goto_3
    and-int/lit8 v0, p5, 0x8

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lp00/q;->z:Z

    move v5, v0

    goto :goto_4

    :cond_3
    move/from16 v5, p3

    :goto_4
    and-int/lit8 v0, p5, 0x10

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lp00/q;->E:Z

    move v6, v0

    goto :goto_5

    :cond_4
    move/from16 v6, p4

    :goto_5
    iget-object v7, p0, Lp00/q;->F:Ljava/lang/String;

    iget-object v8, p0, Lp00/q;->G:Ljava/lang/String;

    iget-boolean v9, p0, Lp00/q;->H:Z

    iget-boolean v10, p0, Lp00/q;->I:Z

    iget-object v11, p0, Lp00/q;->J:Lq00/o;

    iget-object v12, p0, Lp00/q;->K:Lcom/stripe/android/model/ConsentUi$ConsentSection;

    iget-boolean v13, p0, Lp00/q;->L:Z

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p0, "redactedPhoneNumber"

    invoke-static {v7, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "email"

    invoke-static {v8, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lp00/q;

    invoke-direct/range {v1 .. v13}, Lp00/q;-><init>(ZZLzy/c;ZZLjava/lang/String;Ljava/lang/String;ZZLq00/o;Lcom/stripe/android/model/ConsentUi$ConsentSection;Z)V

    return-object v1
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
    instance-of v1, p1, Lp00/q;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lp00/q;

    iget-boolean v1, p0, Lp00/q;->w:Z

    iget-boolean v3, p1, Lp00/q;->w:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lp00/q;->x:Z

    iget-boolean v3, p1, Lp00/q;->x:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lp00/q;->y:Lzy/c;

    iget-object v3, p1, Lp00/q;->y:Lzy/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lp00/q;->z:Z

    iget-boolean v3, p1, Lp00/q;->z:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lp00/q;->E:Z

    iget-boolean v3, p1, Lp00/q;->E:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lp00/q;->F:Ljava/lang/String;

    iget-object v3, p1, Lp00/q;->F:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lp00/q;->G:Ljava/lang/String;

    iget-object v3, p1, Lp00/q;->G:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lp00/q;->H:Z

    iget-boolean v3, p1, Lp00/q;->H:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lp00/q;->I:Z

    iget-boolean v3, p1, Lp00/q;->I:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lp00/q;->J:Lq00/o;

    iget-object v3, p1, Lp00/q;->J:Lq00/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lp00/q;->K:Lcom/stripe/android/model/ConsentUi$ConsentSection;

    iget-object v3, p1, Lp00/q;->K:Lcom/stripe/android/model/ConsentUi$ConsentSection;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lp00/q;->L:Z

    iget-boolean p1, p1, Lp00/q;->L:Z

    if-eq v1, p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-boolean v0, p0, Lp00/q;->w:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lp00/q;->x:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Lp00/q;->y:Lzy/c;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v3, p0, Lp00/q;->z:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lp00/q;->E:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lp00/q;->F:Ljava/lang/String;

    invoke-static {v0, v1, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lp00/q;->G:Ljava/lang/String;

    invoke-static {v0, v1, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v3, p0, Lp00/q;->H:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lp00/q;->I:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lp00/q;->J:Lq00/o;

    if-nez v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lq00/o;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lp00/q;->K:Lcom/stripe/android/model/ConsentUi$ConsentSection;

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lcom/stripe/android/model/ConsentUi$ConsentSection;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Lp00/q;->L:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", requestFocus="

    const-string v1, ", errorMessage="

    const-string v2, "VerificationViewState(isProcessing="

    iget-boolean v3, p0, Lp00/q;->w:Z

    iget-boolean v4, p0, Lp00/q;->x:Z

    invoke-static {v2, v0, v1, v3, v4}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lp00/q;->y:Lzy/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isSendingNewCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lp00/q;->z:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", didSendNewCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", redactedPhoneNumber="

    const-string v2, ", email="

    iget-boolean v3, p0, Lp00/q;->E:Z

    iget-object v4, p0, Lp00/q;->F:Ljava/lang/String;

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", isDialog="

    const-string v2, ", allowLogout="

    iget-object v3, p0, Lp00/q;->G:Ljava/lang/String;

    iget-boolean v4, p0, Lp00/q;->H:Z

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    iget-boolean v1, p0, Lp00/q;->I:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", defaultPayment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lp00/q;->J:Lq00/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", consentSection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lp00/q;->K:Lcom/stripe/android/model/ConsentUi$ConsentSection;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isProcessingWebAuth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lp00/q;->L:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

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

    iget-boolean v0, p0, Lp00/q;->w:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lp00/q;->x:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lp00/q;->y:Lzy/c;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-boolean v0, p0, Lp00/q;->z:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lp00/q;->E:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lp00/q;->F:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lp00/q;->G:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lp00/q;->H:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lp00/q;->I:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lp00/q;->J:Lq00/o;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lq00/o;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lp00/q;->K:Lcom/stripe/android/model/ConsentUi$ConsentSection;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-boolean p2, p0, Lp00/q;->L:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
