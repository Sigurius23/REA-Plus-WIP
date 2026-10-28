.class public final Lyx/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Lyx/a;


# instance fields
.field public final E:Ljava/lang/String;

.field public final F:Z

.field public final G:Lm30/g;

.field public final H:Ljava/lang/String;

.field public final I:Z

.field public final J:Z

.field public final K:Ljava/lang/Integer;

.field public final L:Ljava/lang/String;

.field public final M:Z

.field public final N:Ljava/lang/String;

.field public final O:Z

.field public final w:Ljava/lang/String;

.field public final x:I

.field public final y:Ljava/lang/String;

.field public final z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lyx/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lyx/b;->CREATOR:Lyx/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLm30/g;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Z)V
    .locals 1

    const-string v0, "objectId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientSecret"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKey"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lyx/b;->w:Ljava/lang/String;

    .line 3
    iput p2, p0, Lyx/b;->x:I

    .line 4
    iput-object p3, p0, Lyx/b;->y:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lyx/b;->z:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lyx/b;->E:Ljava/lang/String;

    .line 7
    iput-boolean p6, p0, Lyx/b;->F:Z

    .line 8
    iput-object p7, p0, Lyx/b;->G:Lm30/g;

    .line 9
    iput-object p8, p0, Lyx/b;->H:Ljava/lang/String;

    .line 10
    iput-boolean p9, p0, Lyx/b;->I:Z

    .line 11
    iput-boolean p10, p0, Lyx/b;->J:Z

    .line 12
    iput-object p11, p0, Lyx/b;->K:Ljava/lang/Integer;

    .line 13
    iput-object p12, p0, Lyx/b;->L:Ljava/lang/String;

    .line 14
    iput-boolean p13, p0, Lyx/b;->M:Z

    .line 15
    iput-object p14, p0, Lyx/b;->N:Ljava/lang/String;

    move/from16 p1, p15

    .line 16
    iput-boolean p1, p0, Lyx/b;->O:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLm30/g;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;ZI)V
    .locals 19

    move/from16 v0, p16

    and-int/lit8 v1, v0, 0x40

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v10, v2

    goto :goto_0

    :cond_0
    move-object/from16 v10, p7

    :goto_0
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    move v13, v1

    goto :goto_1

    :cond_1
    move/from16 v13, p10

    :goto_1
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_2

    move-object/from16 v17, v2

    goto :goto_2

    :cond_2
    move-object/from16 v17, p14

    :goto_2
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    move/from16 v18, v0

    :goto_3
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move/from16 v9, p6

    move-object/from16 v11, p8

    move/from16 v12, p9

    move-object/from16 v14, p11

    move-object/from16 v15, p12

    move/from16 v16, p13

    goto :goto_4

    :cond_3
    move/from16 v18, p15

    goto :goto_3

    .line 17
    :goto_4
    invoke-direct/range {v3 .. v18}, Lyx/b;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLm30/g;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Z)V

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
    instance-of v1, p1, Lyx/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lyx/b;

    iget-object v1, p0, Lyx/b;->w:Ljava/lang/String;

    iget-object v3, p1, Lyx/b;->w:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lyx/b;->x:I

    iget v3, p1, Lyx/b;->x:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lyx/b;->y:Ljava/lang/String;

    iget-object v3, p1, Lyx/b;->y:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lyx/b;->z:Ljava/lang/String;

    iget-object v3, p1, Lyx/b;->z:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lyx/b;->E:Ljava/lang/String;

    iget-object v3, p1, Lyx/b;->E:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lyx/b;->F:Z

    iget-boolean v3, p1, Lyx/b;->F:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lyx/b;->G:Lm30/g;

    iget-object v3, p1, Lyx/b;->G:Lm30/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lyx/b;->H:Ljava/lang/String;

    iget-object v3, p1, Lyx/b;->H:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lyx/b;->I:Z

    iget-boolean v3, p1, Lyx/b;->I:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lyx/b;->J:Z

    iget-boolean v3, p1, Lyx/b;->J:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lyx/b;->K:Ljava/lang/Integer;

    iget-object v3, p1, Lyx/b;->K:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lyx/b;->L:Ljava/lang/String;

    iget-object v3, p1, Lyx/b;->L:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-boolean v1, p0, Lyx/b;->M:Z

    iget-boolean v3, p1, Lyx/b;->M:Z

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lyx/b;->N:Ljava/lang/String;

    iget-object v3, p1, Lyx/b;->N:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-boolean v1, p0, Lyx/b;->O:Z

    iget-boolean p1, p1, Lyx/b;->O:Z

    if-eq v1, p1, :cond_10

    return v2

    :cond_10
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lyx/b;->w:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lyx/b;->x:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lyx/b;->y:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lyx/b;->z:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Lyx/b;->E:Ljava/lang/String;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v3, p0, Lyx/b;->F:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lyx/b;->G:Lm30/g;

    if-nez v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lm30/g;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lyx/b;->H:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v3, p0, Lyx/b;->I:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lyx/b;->J:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lyx/b;->K:Ljava/lang/Integer;

    if-nez v3, :cond_3

    move v3, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lyx/b;->L:Ljava/lang/String;

    invoke-static {v0, v1, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v3, p0, Lyx/b;->M:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lyx/b;->N:Ljava/lang/String;

    if-nez v3, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Lyx/b;->O:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", requestCode="

    const-string v1, ", clientSecret="

    iget v2, p0, Lyx/b;->x:I

    const-string v3, "Args(objectId="

    iget-object v4, p0, Lyx/b;->w:Ljava/lang/String;

    invoke-static {v2, v3, v4, v0, v1}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", url="

    const-string v2, ", returnUrl="

    iget-object v3, p0, Lyx/b;->y:Ljava/lang/String;

    iget-object v4, p0, Lyx/b;->z:Ljava/lang/String;

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", enableLogging="

    const-string v2, ", toolbarCustomization="

    iget-object v3, p0, Lyx/b;->E:Ljava/lang/String;

    iget-boolean v4, p0, Lyx/b;->F:Z

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    iget-object v1, p0, Lyx/b;->G:Lm30/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stripeAccountId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lyx/b;->H:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", shouldCancelSource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", shouldCancelIntentOnUserNavigation="

    const-string v2, ", statusBarColor="

    iget-boolean v3, p0, Lyx/b;->I:Z

    iget-boolean v4, p0, Lyx/b;->J:Z

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", publishableKey="

    const-string v2, ", isInstantApp="

    iget-object v3, p0, Lyx/b;->K:Ljava/lang/Integer;

    iget-object v4, p0, Lyx/b;->L:Ljava/lang/String;

    invoke-static {v3, v1, v4, v2, v0}, Lev/n;->x(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", referrer="

    const-string v2, ", forceInAppWebView="

    iget-boolean v3, p0, Lyx/b;->M:Z

    iget-object v4, p0, Lyx/b;->N:Ljava/lang/String;

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ")"

    iget-boolean v2, p0, Lyx/b;->O:Z

    invoke-static {v0, v2, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyx/b;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lyx/b;->x:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lyx/b;->y:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lyx/b;->z:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lyx/b;->E:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lyx/b;->F:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    iget-object v0, p0, Lyx/b;->G:Lm30/g;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lyx/b;->H:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lyx/b;->I:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-boolean p2, p0, Lyx/b;->J:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-object p2, p0, Lyx/b;->K:Ljava/lang/Integer;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    iget-object p2, p0, Lyx/b;->L:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lyx/b;->M:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-object p2, p0, Lyx/b;->N:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lyx/b;->O:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    return-void
.end method
