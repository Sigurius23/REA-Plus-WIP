.class public final Lr30/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lr30/e;",
            ">;"
        }
    .end annotation
.end field

.field public static final c0:Ljava/util/List;


# instance fields
.field public final E:Lr30/j;

.field public final F:Z

.field public final G:Ljava/lang/String;

.field public final H:Ljava/lang/String;

.field public final I:Ljava/lang/String;

.field public final J:Ljava/lang/String;

.field public final K:Z

.field public final L:Ljava/util/List;

.field public final M:Ljava/lang/String;

.field public final N:Ljava/lang/String;

.field public final O:Lr30/d;

.field public final P:Ljava/util/List;

.field public final Q:Ljava/lang/String;

.field public final R:Ljava/lang/String;

.field public final S:Ljava/lang/String;

.field public final T:Ljava/lang/String;

.field public final U:Lr30/d;

.field public final V:Ljava/lang/String;

.field public final W:Lq30/q0;

.field public final X:Ljava/lang/String;

.field public final Y:Ljava/lang/String;

.field public final Z:Ljava/lang/String;

.field public final a0:Ljava/lang/String;

.field public final b0:Ljava/lang/String;

.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public final y:Ljava/lang/String;

.field public final z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq30/j0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lq30/j0;-><init>(I)V

    sput-object v0, Lr30/e;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v0, "Y"

    const-string v1, "N"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lr30/e;->c0:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lr30/j;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Lr30/d;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lr30/d;Ljava/lang/String;Lq30/q0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    move-object/from16 v0, p17

    move-object/from16 v1, p23

    const-string v2, "serverTransId"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "acsTransId"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "messageVersion"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "sdkTransId"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr30/e;->w:Ljava/lang/String;

    iput-object p2, p0, Lr30/e;->x:Ljava/lang/String;

    iput-object p3, p0, Lr30/e;->y:Ljava/lang/String;

    iput-object p4, p0, Lr30/e;->z:Ljava/lang/String;

    iput-object p5, p0, Lr30/e;->E:Lr30/j;

    iput-boolean p6, p0, Lr30/e;->F:Z

    iput-object p7, p0, Lr30/e;->G:Ljava/lang/String;

    iput-object p8, p0, Lr30/e;->H:Ljava/lang/String;

    iput-object p9, p0, Lr30/e;->I:Ljava/lang/String;

    iput-object p10, p0, Lr30/e;->J:Ljava/lang/String;

    iput-boolean p11, p0, Lr30/e;->K:Z

    iput-object p12, p0, Lr30/e;->L:Ljava/util/List;

    move-object/from16 p1, p13

    iput-object p1, p0, Lr30/e;->M:Ljava/lang/String;

    move-object/from16 p1, p14

    iput-object p1, p0, Lr30/e;->N:Ljava/lang/String;

    move-object/from16 p1, p15

    iput-object p1, p0, Lr30/e;->O:Lr30/d;

    move-object/from16 p1, p16

    iput-object p1, p0, Lr30/e;->P:Ljava/util/List;

    iput-object v0, p0, Lr30/e;->Q:Ljava/lang/String;

    move-object/from16 p1, p18

    iput-object p1, p0, Lr30/e;->R:Ljava/lang/String;

    move-object/from16 p1, p19

    iput-object p1, p0, Lr30/e;->S:Ljava/lang/String;

    move-object/from16 p1, p20

    iput-object p1, p0, Lr30/e;->T:Ljava/lang/String;

    move-object/from16 p1, p21

    iput-object p1, p0, Lr30/e;->U:Lr30/d;

    move-object/from16 p1, p22

    iput-object p1, p0, Lr30/e;->V:Ljava/lang/String;

    iput-object v1, p0, Lr30/e;->W:Lq30/q0;

    move-object/from16 p1, p24

    iput-object p1, p0, Lr30/e;->X:Ljava/lang/String;

    move-object/from16 p1, p25

    iput-object p1, p0, Lr30/e;->Y:Ljava/lang/String;

    move-object/from16 p1, p26

    iput-object p1, p0, Lr30/e;->Z:Ljava/lang/String;

    move-object/from16 p1, p27

    iput-object p1, p0, Lr30/e;->a0:Ljava/lang/String;

    move-object/from16 p1, p28

    iput-object p1, p0, Lr30/e;->b0:Ljava/lang/String;

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
    instance-of v1, p1, Lr30/e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lr30/e;

    iget-object v1, p0, Lr30/e;->w:Ljava/lang/String;

    iget-object v3, p1, Lr30/e;->w:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lr30/e;->x:Ljava/lang/String;

    iget-object v3, p1, Lr30/e;->x:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lr30/e;->y:Ljava/lang/String;

    iget-object v3, p1, Lr30/e;->y:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lr30/e;->z:Ljava/lang/String;

    iget-object v3, p1, Lr30/e;->z:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lr30/e;->E:Lr30/j;

    iget-object v3, p1, Lr30/e;->E:Lr30/j;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lr30/e;->F:Z

    iget-boolean v3, p1, Lr30/e;->F:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lr30/e;->G:Ljava/lang/String;

    iget-object v3, p1, Lr30/e;->G:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lr30/e;->H:Ljava/lang/String;

    iget-object v3, p1, Lr30/e;->H:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lr30/e;->I:Ljava/lang/String;

    iget-object v3, p1, Lr30/e;->I:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lr30/e;->J:Ljava/lang/String;

    iget-object v3, p1, Lr30/e;->J:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lr30/e;->K:Z

    iget-boolean v3, p1, Lr30/e;->K:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lr30/e;->L:Ljava/util/List;

    iget-object v3, p1, Lr30/e;->L:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lr30/e;->M:Ljava/lang/String;

    iget-object v3, p1, Lr30/e;->M:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lr30/e;->N:Ljava/lang/String;

    iget-object v3, p1, Lr30/e;->N:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lr30/e;->O:Lr30/d;

    iget-object v3, p1, Lr30/e;->O:Lr30/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lr30/e;->P:Ljava/util/List;

    iget-object v3, p1, Lr30/e;->P:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lr30/e;->Q:Ljava/lang/String;

    iget-object v3, p1, Lr30/e;->Q:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lr30/e;->R:Ljava/lang/String;

    iget-object v3, p1, Lr30/e;->R:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lr30/e;->S:Ljava/lang/String;

    iget-object v3, p1, Lr30/e;->S:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lr30/e;->T:Ljava/lang/String;

    iget-object v3, p1, Lr30/e;->T:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lr30/e;->U:Lr30/d;

    iget-object v3, p1, Lr30/e;->U:Lr30/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lr30/e;->V:Ljava/lang/String;

    iget-object v3, p1, Lr30/e;->V:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lr30/e;->W:Lq30/q0;

    iget-object v3, p1, Lr30/e;->W:Lq30/q0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lr30/e;->X:Ljava/lang/String;

    iget-object v3, p1, Lr30/e;->X:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lr30/e;->Y:Ljava/lang/String;

    iget-object v3, p1, Lr30/e;->Y:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lr30/e;->Z:Ljava/lang/String;

    iget-object v3, p1, Lr30/e;->Z:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lr30/e;->a0:Ljava/lang/String;

    iget-object v3, p1, Lr30/e;->a0:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lr30/e;->b0:Ljava/lang/String;

    iget-object p1, p1, Lr30/e;->b0:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1d

    return v2

    :cond_1d
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lr30/e;->w:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lr30/e;->x:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Lr30/e;->y:Ljava/lang/String;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lr30/e;->z:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lr30/e;->E:Lr30/j;

    if-nez v3, :cond_2

    move v3, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v3, p0, Lr30/e;->F:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lr30/e;->G:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lr30/e;->H:Ljava/lang/String;

    if-nez v3, :cond_4

    move v3, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lr30/e;->I:Ljava/lang/String;

    if-nez v3, :cond_5

    move v3, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lr30/e;->J:Ljava/lang/String;

    if-nez v3, :cond_6

    move v3, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v3, p0, Lr30/e;->K:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lr30/e;->L:Ljava/util/List;

    if-nez v3, :cond_7

    move v3, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lr30/e;->M:Ljava/lang/String;

    if-nez v3, :cond_8

    move v3, v2

    goto :goto_8

    :cond_8
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lr30/e;->N:Ljava/lang/String;

    if-nez v3, :cond_9

    move v3, v2

    goto :goto_9

    :cond_9
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_9
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lr30/e;->O:Lr30/d;

    if-nez v3, :cond_a

    move v3, v2

    goto :goto_a

    :cond_a
    invoke-virtual {v3}, Lr30/d;->hashCode()I

    move-result v3

    :goto_a
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lr30/e;->P:Ljava/util/List;

    if-nez v3, :cond_b

    move v3, v2

    goto :goto_b

    :cond_b
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_b
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lr30/e;->Q:Ljava/lang/String;

    invoke-static {v0, v1, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lr30/e;->R:Ljava/lang/String;

    if-nez v3, :cond_c

    move v3, v2

    goto :goto_c

    :cond_c
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_c
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lr30/e;->S:Ljava/lang/String;

    if-nez v3, :cond_d

    move v3, v2

    goto :goto_d

    :cond_d
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_d
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lr30/e;->T:Ljava/lang/String;

    if-nez v3, :cond_e

    move v3, v2

    goto :goto_e

    :cond_e
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_e
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lr30/e;->U:Lr30/d;

    if-nez v3, :cond_f

    move v3, v2

    goto :goto_f

    :cond_f
    invoke-virtual {v3}, Lr30/d;->hashCode()I

    move-result v3

    :goto_f
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lr30/e;->V:Ljava/lang/String;

    if-nez v3, :cond_10

    move v3, v2

    goto :goto_10

    :cond_10
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_10
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lr30/e;->W:Lq30/q0;

    iget-object v3, v3, Lq30/q0;->w:Ljava/lang/String;

    invoke-static {v0, v1, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lr30/e;->X:Ljava/lang/String;

    if-nez v3, :cond_11

    move v3, v2

    goto :goto_11

    :cond_11
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_11
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lr30/e;->Y:Ljava/lang/String;

    if-nez v3, :cond_12

    move v3, v2

    goto :goto_12

    :cond_12
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_12
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lr30/e;->Z:Ljava/lang/String;

    if-nez v3, :cond_13

    move v3, v2

    goto :goto_13

    :cond_13
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_13
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lr30/e;->a0:Ljava/lang/String;

    if-nez v3, :cond_14

    move v3, v2

    goto :goto_14

    :cond_14
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_14
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lr30/e;->b0:Ljava/lang/String;

    if-nez v1, :cond_15

    goto :goto_15

    :cond_15
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_15
    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", acsTransId="

    const-string v1, ", acsHtml="

    const-string v2, "ChallengeResponseData(serverTransId="

    iget-object v3, p0, Lr30/e;->w:Ljava/lang/String;

    iget-object v4, p0, Lr30/e;->x:Ljava/lang/String;

    invoke-static {v2, v3, v0, v4, v1}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", acsHtmlRefresh="

    const-string v2, ", uiType="

    iget-object v3, p0, Lr30/e;->y:Ljava/lang/String;

    iget-object v4, p0, Lr30/e;->z:Ljava/lang/String;

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lr30/e;->E:Lr30/j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isChallengeCompleted="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lr30/e;->F:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", challengeInfoHeader="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", challengeInfoLabel="

    const-string v2, ", challengeInfoText="

    iget-object v3, p0, Lr30/e;->G:Ljava/lang/String;

    iget-object v4, p0, Lr30/e;->H:Ljava/lang/String;

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", challengeAdditionalInfoText="

    const-string v2, ", shouldShowChallengeInfoTextIndicator="

    iget-object v3, p0, Lr30/e;->I:Ljava/lang/String;

    iget-object v4, p0, Lr30/e;->J:Ljava/lang/String;

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", challengeSelectOptions="

    const-string v2, ", expandInfoLabel="

    iget-object v3, p0, Lr30/e;->L:Ljava/util/List;

    iget-boolean v4, p0, Lr30/e;->K:Z

    invoke-static {v1, v2, v0, v3, v4}, Lm4/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Z)V

    const-string v1, ", expandInfoText="

    const-string v2, ", issuerImage="

    iget-object v3, p0, Lr30/e;->M:Ljava/lang/String;

    iget-object v4, p0, Lr30/e;->N:Ljava/lang/String;

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lr30/e;->O:Lr30/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", messageExtensions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr30/e;->P:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", messageVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", oobAppUrl="

    const-string v2, ", oobAppLabel="

    iget-object v3, p0, Lr30/e;->Q:Ljava/lang/String;

    iget-object v4, p0, Lr30/e;->R:Ljava/lang/String;

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", oobContinueLabel="

    const-string v2, ", paymentSystemImage="

    iget-object v3, p0, Lr30/e;->S:Ljava/lang/String;

    iget-object v4, p0, Lr30/e;->T:Ljava/lang/String;

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lr30/e;->U:Lr30/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", resendInformationLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr30/e;->V:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sdkTransId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr30/e;->W:Lq30/q0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", submitAuthenticationLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr30/e;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", whitelistingInfoText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", whyInfoLabel="

    const-string v2, ", whyInfoText="

    iget-object v3, p0, Lr30/e;->Y:Ljava/lang/String;

    iget-object v4, p0, Lr30/e;->Z:Ljava/lang/String;

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", transStatus="

    const-string v2, ")"

    iget-object v3, p0, Lr30/e;->a0:Ljava/lang/String;

    iget-object v4, p0, Lr30/e;->b0:Ljava/lang/String;

    invoke-static {v0, v3, v1, v4, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lr30/e;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lr30/e;->x:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lr30/e;->y:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lr30/e;->z:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Lr30/e;->E:Lr30/j;

    if-nez v2, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_0
    iget-boolean v2, p0, Lr30/e;->F:Z

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v2, p0, Lr30/e;->G:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Lr30/e;->H:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Lr30/e;->I:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Lr30/e;->J:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v2, p0, Lr30/e;->K:Z

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v2, p0, Lr30/e;->L:Ljava/util/List;

    if-nez v2, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr30/c;

    invoke-virtual {v3, p1, p2}, Lr30/c;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    :cond_2
    :goto_2
    iget-object v2, p0, Lr30/e;->M:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Lr30/e;->N:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Lr30/e;->O:Lr30/d;

    if-nez v2, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Lr30/d;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_3
    iget-object v2, p0, Lr30/e;->P:Ljava/util/List;

    if-nez v2, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_5

    :cond_4
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr30/h;

    invoke-virtual {v3, p1, p2}, Lr30/h;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_4

    :cond_5
    :goto_5
    iget-object v2, p0, Lr30/e;->Q:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Lr30/e;->R:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Lr30/e;->S:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Lr30/e;->T:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Lr30/e;->U:Lr30/d;

    if-nez v2, :cond_6

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_6

    :cond_6
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Lr30/d;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_6
    iget-object v0, p0, Lr30/e;->V:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lr30/e;->W:Lq30/q0;

    invoke-virtual {v0, p1, p2}, Lq30/q0;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Lr30/e;->X:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lr30/e;->Y:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lr30/e;->Z:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lr30/e;->a0:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lr30/e;->b0:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
