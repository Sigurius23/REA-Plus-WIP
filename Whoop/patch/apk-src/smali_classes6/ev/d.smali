.class public final Lev/d;
.super Lev/e;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lev/d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Ljava/lang/String;

.field public final F:Ljava/util/List;

.field public final G:Ljava/util/List;

.field public final H:Z

.field public final I:Z

.field public final J:I

.field public final K:F

.field public final L:Ljava/lang/String;

.field public final M:Ljava/lang/String;

.field public final N:Ljava/lang/String;

.field public final O:I

.field public final P:Ljava/lang/String;

.field public final Q:F

.field public final R:Ljava/lang/String;

.field public final S:Ljava/util/List;

.field public final T:Ljava/util/List;

.field public final U:I

.field public final V:Ljava/lang/String;

.field public final W:Ljava/lang/String;

.field public final w:Ljava/lang/String;

.field public final x:Ljava/util/List;

.field public final y:F

.field public final z:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Leq/b;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Leq/b;-><init>(I)V

    sput-object v0, Lev/d;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;FLjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZIFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;FLjava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)V
    .locals 6

    move/from16 v0, p10

    move-object/from16 v1, p19

    move-object/from16 v2, p20

    move/from16 v3, p21

    move-object/from16 v4, p22

    const-string v5, "modelUri"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "modelScaleMode"

    invoke-static {v0, v5}, Lih0/d0;->w(ILjava/lang/String;)V

    const-string v5, "materialOverrides"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "nodeOverrides"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "modelElevationReference"

    invoke-static {v3, v5}, Lih0/d0;->w(ILjava/lang/String;)V

    const-string v5, "modelColorUseTheme"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lev/d;->w:Ljava/lang/String;

    iput-object p2, p0, Lev/d;->x:Ljava/util/List;

    iput p3, p0, Lev/d;->y:F

    iput-object p4, p0, Lev/d;->z:Ljava/util/List;

    iput-object p5, p0, Lev/d;->E:Ljava/lang/String;

    iput-object p6, p0, Lev/d;->F:Ljava/util/List;

    iput-object p7, p0, Lev/d;->G:Ljava/util/List;

    iput-boolean p8, p0, Lev/d;->H:Z

    iput-boolean p9, p0, Lev/d;->I:Z

    iput v0, p0, Lev/d;->J:I

    move/from16 p1, p11

    iput p1, p0, Lev/d;->K:F

    move-object/from16 p1, p12

    iput-object p1, p0, Lev/d;->L:Ljava/lang/String;

    move-object/from16 p1, p13

    iput-object p1, p0, Lev/d;->M:Ljava/lang/String;

    move-object/from16 p1, p14

    iput-object p1, p0, Lev/d;->N:Ljava/lang/String;

    move/from16 p1, p15

    iput p1, p0, Lev/d;->O:I

    move-object/from16 p1, p16

    iput-object p1, p0, Lev/d;->P:Ljava/lang/String;

    move/from16 p1, p17

    iput p1, p0, Lev/d;->Q:F

    move-object/from16 p1, p18

    iput-object p1, p0, Lev/d;->R:Ljava/lang/String;

    iput-object v1, p0, Lev/d;->S:Ljava/util/List;

    iput-object v2, p0, Lev/d;->T:Ljava/util/List;

    iput v3, p0, Lev/d;->U:I

    iput-object v4, p0, Lev/d;->V:Ljava/lang/String;

    move-object/from16 p1, p23

    iput-object p1, p0, Lev/d;->W:Ljava/lang/String;

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

    if-ne p0, p1, :cond_0

    goto/16 :goto_1

    :cond_0
    instance-of v0, p1, Lev/d;

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p1, Lev/d;

    iget-object v0, p0, Lev/d;->w:Ljava/lang/String;

    iget-object v1, p1, Lev/d;->w:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lev/d;->x:Ljava/util/List;

    iget-object v1, p1, Lev/d;->x:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    iget v0, p0, Lev/d;->y:F

    iget v1, p1, Lev/d;->y:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lev/d;->z:Ljava/util/List;

    iget-object v1, p1, Lev/d;->z:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    iget-object v0, p0, Lev/d;->E:Ljava/lang/String;

    iget-object v1, p1, Lev/d;->E:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    iget-object v0, p0, Lev/d;->F:Ljava/util/List;

    iget-object v1, p1, Lev/d;->F:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    iget-object v0, p0, Lev/d;->G:Ljava/util/List;

    iget-object v1, p1, Lev/d;->G:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    iget-boolean v0, p0, Lev/d;->H:Z

    iget-boolean v1, p1, Lev/d;->H:Z

    if-eq v0, v1, :cond_9

    goto/16 :goto_0

    :cond_9
    iget-boolean v0, p0, Lev/d;->I:Z

    iget-boolean v1, p1, Lev/d;->I:Z

    if-eq v0, v1, :cond_a

    goto/16 :goto_0

    :cond_a
    iget v0, p0, Lev/d;->J:I

    iget v1, p1, Lev/d;->J:I

    if-eq v0, v1, :cond_b

    goto/16 :goto_0

    :cond_b
    iget v0, p0, Lev/d;->K:F

    iget v1, p1, Lev/d;->K:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_c

    goto/16 :goto_0

    :cond_c
    iget-object v0, p0, Lev/d;->L:Ljava/lang/String;

    iget-object v1, p1, Lev/d;->L:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto/16 :goto_0

    :cond_d
    iget-object v0, p0, Lev/d;->M:Ljava/lang/String;

    iget-object v1, p1, Lev/d;->M:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_0

    :cond_e
    iget-object v0, p0, Lev/d;->N:Ljava/lang/String;

    iget-object v1, p1, Lev/d;->N:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_0

    :cond_f
    iget v0, p0, Lev/d;->O:I

    iget v1, p1, Lev/d;->O:I

    if-eq v0, v1, :cond_10

    goto :goto_0

    :cond_10
    iget-object v0, p0, Lev/d;->P:Ljava/lang/String;

    iget-object v1, p1, Lev/d;->P:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_0

    :cond_11
    iget v0, p0, Lev/d;->Q:F

    iget v1, p1, Lev/d;->Q:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_12

    goto :goto_0

    :cond_12
    iget-object v0, p0, Lev/d;->R:Ljava/lang/String;

    iget-object v1, p1, Lev/d;->R:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto :goto_0

    :cond_13
    iget-object v0, p0, Lev/d;->S:Ljava/util/List;

    iget-object v1, p1, Lev/d;->S:Ljava/util/List;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto :goto_0

    :cond_14
    iget-object v0, p0, Lev/d;->T:Ljava/util/List;

    iget-object v1, p1, Lev/d;->T:Ljava/util/List;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_0

    :cond_15
    iget v0, p0, Lev/d;->U:I

    iget v1, p1, Lev/d;->U:I

    if-eq v0, v1, :cond_16

    goto :goto_0

    :cond_16
    iget-object v0, p0, Lev/d;->V:Ljava/lang/String;

    iget-object v1, p1, Lev/d;->V:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto :goto_0

    :cond_17
    iget-object v0, p0, Lev/d;->W:Ljava/lang/String;

    iget-object p1, p1, Lev/d;->W:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_18

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_18
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 5

    iget-object v0, p0, Lev/d;->w:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lev/d;->x:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget v2, p0, Lev/d;->y:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lev/d;->z:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Lev/d;->E:Ljava/lang/String;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lev/d;->F:Ljava/util/List;

    invoke-static {v0, v1, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v3, p0, Lev/d;->G:Ljava/util/List;

    invoke-static {v0, v1, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    const/4 v3, 0x1

    iget-boolean v4, p0, Lev/d;->H:Z

    if-eqz v4, :cond_1

    move v4, v3

    :cond_1
    add-int/2addr v0, v4

    mul-int/2addr v0, v1

    iget-boolean v4, p0, Lev/d;->I:Z

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    move v3, v4

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget v3, p0, Lev/d;->J:I

    invoke-static {v3}, Le4/p;->e(I)I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget v0, p0, Lev/d;->K:F

    invoke-static {v0, v3, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v3, p0, Lev/d;->L:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v2

    goto :goto_2

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lev/d;->M:Ljava/lang/String;

    if-nez v3, :cond_4

    move v3, v2

    goto :goto_3

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lev/d;->N:Ljava/lang/String;

    if-nez v3, :cond_5

    move v3, v2

    goto :goto_4

    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget v3, p0, Lev/d;->O:I

    invoke-static {v3, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v3, p0, Lev/d;->P:Ljava/lang/String;

    if-nez v3, :cond_6

    move v3, v2

    goto :goto_5

    :cond_6
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget v3, p0, Lev/d;->Q:F

    invoke-static {v3, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v3, p0, Lev/d;->R:Ljava/lang/String;

    if-nez v3, :cond_7

    move v3, v2

    goto :goto_6

    :cond_7
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lev/d;->S:Ljava/util/List;

    invoke-static {v0, v1, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v3, p0, Lev/d;->T:Ljava/util/List;

    invoke-static {v0, v1, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget v3, p0, Lev/d;->U:I

    invoke-static {v3}, Le4/p;->e(I)I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-object v0, p0, Lev/d;->V:Ljava/lang/String;

    invoke-static {v3, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lev/d;->W:Ljava/lang/String;

    if-nez v1, :cond_8

    goto :goto_7

    :cond_8
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LocationPuck3D(modelUri="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lev/d;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", position="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lev/d;->x:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", modelOpacity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lev/d;->y:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", modelScale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lev/d;->z:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", modelScaleExpression="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lev/d;->E:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", modelTranslation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lev/d;->F:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", modelRotation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lev/d;->G:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", modelCastShadows="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lev/d;->H:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", modelReceiveShadows="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lev/d;->I:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", modelScaleMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    iget v2, p0, Lev/d;->J:I

    if-eq v2, v1, :cond_1

    const/4 v1, 0x2

    if-eq v2, v1, :cond_0

    const-string v1, "null"

    goto :goto_0

    :cond_0
    const-string v1, "VIEWPORT"

    goto :goto_0

    :cond_1
    const-string v1, "MAP"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", modelEmissiveStrength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lev/d;->K:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", modelEmissiveStrengthExpression="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lev/d;->L:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", modelOpacityExpression="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lev/d;->M:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", modelRotationExpression="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lev/d;->N:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", modelColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lev/d;->O:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", modelColorExpression="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lev/d;->P:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", modelColorMixIntensity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lev/d;->Q:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", modelColorMixIntensityExpression="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lev/d;->R:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", materialOverrides="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lev/d;->S:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", nodeOverrides="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lev/d;->T:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", modelElevationReference="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    iget v2, p0, Lev/d;->U:I

    if-eq v2, v1, :cond_3

    const/4 v1, 0x2

    if-eq v2, v1, :cond_2

    const-string v1, "null"

    goto :goto_1

    :cond_2
    const-string v1, "GROUND"

    goto :goto_1

    :cond_3
    const-string v1, "SEA"

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", modelColorUseTheme="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lev/d;->V:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", modelColorUseThemeExpression="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lev/d;->W:Ljava/lang/String;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lev/d;->w:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lev/d;->x:Ljava/util/List;

    invoke-static {p2, p1}, Ld13/a;->o(Ljava/util/List;Landroid/os/Parcel;)Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    goto :goto_0

    :cond_0
    iget p2, p0, Lev/d;->y:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget-object p2, p0, Lev/d;->z:Ljava/util/List;

    invoke-static {p2, p1}, Ld13/a;->o(Ljava/util/List;Landroid/os/Parcel;)Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lev/d;->E:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lev/d;->F:Ljava/util/List;

    invoke-static {p2, p1}, Ld13/a;->o(Ljava/util/List;Landroid/os/Parcel;)Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    goto :goto_2

    :cond_2
    iget-object p2, p0, Lev/d;->G:Ljava/util/List;

    invoke-static {p2, p1}, Ld13/a;->o(Ljava/util/List;Landroid/os/Parcel;)Ljava/util/Iterator;

    move-result-object p2

    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    goto :goto_3

    :cond_3
    iget-boolean p2, p0, Lev/d;->H:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lev/d;->I:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 p2, 0x1

    iget v0, p0, Lev/d;->J:I

    if-eq v0, p2, :cond_5

    const/4 p2, 0x2

    if-ne v0, p2, :cond_4

    const-string p2, "VIEWPORT"

    goto :goto_4

    :cond_4
    const/4 p1, 0x0

    throw p1

    :cond_5
    const-string p2, "MAP"

    :goto_4
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lev/d;->K:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget-object p2, p0, Lev/d;->L:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lev/d;->M:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lev/d;->N:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lev/d;->O:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lev/d;->P:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lev/d;->Q:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    iget-object p2, p0, Lev/d;->R:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lev/d;->S:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object p2, p0, Lev/d;->T:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    const/4 p2, 0x1

    iget v0, p0, Lev/d;->U:I

    if-eq v0, p2, :cond_7

    const/4 p2, 0x2

    if-ne v0, p2, :cond_6

    const-string p2, "GROUND"

    goto :goto_5

    :cond_6
    const/4 p1, 0x0

    throw p1

    :cond_7
    const-string p2, "SEA"

    :goto_5
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lev/d;->V:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lev/d;->W:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
