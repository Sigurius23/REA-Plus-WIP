.class public final Lh20/x1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lh20/x1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Li20/b;

.field public final F:Z

.field public final G:Z

.field public final H:Lh20/h1;

.field public final I:Ljava/lang/String;

.field public final J:Lh20/l1;

.field public final K:Ljava/util/List;

.field public final L:Z

.field public final M:Ljava/util/List;

.field public final N:Ljava/util/List;

.field public final O:Lh20/x2;

.field public final P:Lh20/t1;

.field public final Q:Ljava/util/List;

.field public final R:Ljava/util/List;

.field public final S:Lh20/w2;

.field public final T:Lh20/q3;

.field public final U:Lh20/g3;

.field public final V:Ljava/lang/String;

.field public final W:Ljava/util/Map;

.field public final X:Z

.field public final Y:Ljava/lang/String;

.field public final w:Ljava/lang/String;

.field public final x:Lh20/c2;

.field public final y:Lh20/h2;

.field public final z:Lh20/i1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh20/n;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lh20/n;-><init>(I)V

    sput-object v0, Lh20/x1;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lh20/c2;Lh20/h2;Lh20/i1;Li20/b;ZZLh20/h1;Ljava/lang/String;Lh20/l1;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Lh20/x2;Lh20/t1;Ljava/util/List;Ljava/util/List;Lh20/w2;Lh20/q3;Lh20/g3;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;)V
    .locals 13

    move-object/from16 v0, p8

    move-object/from16 v1, p10

    move-object/from16 v2, p11

    move-object/from16 v3, p13

    move-object/from16 v4, p14

    move-object/from16 v5, p15

    move-object/from16 v6, p16

    move-object/from16 v7, p17

    move-object/from16 v8, p18

    move-object/from16 v9, p19

    move-object/from16 v10, p20

    move-object/from16 v11, p23

    const-string v12, "merchantDisplayName"

    invoke-static {p1, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "appearance"

    invoke-static {v0, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "billingDetailsCollectionConfiguration"

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "preferredNetworks"

    invoke-static {v2, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "paymentMethodOrder"

    invoke-static {v3, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "externalPaymentMethods"

    invoke-static {v4, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "paymentMethodLayout"

    invoke-static {v5, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "cardBrandAcceptance"

    invoke-static {v6, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "allowedCardFundingTypes"

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "customPaymentMethods"

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "link"

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "walletButtons"

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "termsDisplay"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh20/x1;->w:Ljava/lang/String;

    iput-object p2, p0, Lh20/x1;->x:Lh20/c2;

    move-object/from16 p1, p3

    iput-object p1, p0, Lh20/x1;->y:Lh20/h2;

    move-object/from16 p1, p4

    iput-object p1, p0, Lh20/x1;->z:Lh20/i1;

    move-object/from16 p1, p5

    iput-object p1, p0, Lh20/x1;->E:Li20/b;

    move/from16 p1, p6

    iput-boolean p1, p0, Lh20/x1;->F:Z

    move/from16 p1, p7

    iput-boolean p1, p0, Lh20/x1;->G:Z

    iput-object v0, p0, Lh20/x1;->H:Lh20/h1;

    move-object/from16 p1, p9

    iput-object p1, p0, Lh20/x1;->I:Ljava/lang/String;

    iput-object v1, p0, Lh20/x1;->J:Lh20/l1;

    iput-object v2, p0, Lh20/x1;->K:Ljava/util/List;

    move/from16 p1, p12

    iput-boolean p1, p0, Lh20/x1;->L:Z

    iput-object v3, p0, Lh20/x1;->M:Ljava/util/List;

    iput-object v4, p0, Lh20/x1;->N:Ljava/util/List;

    iput-object v5, p0, Lh20/x1;->O:Lh20/x2;

    iput-object v6, p0, Lh20/x1;->P:Lh20/t1;

    iput-object v7, p0, Lh20/x1;->Q:Ljava/util/List;

    iput-object v8, p0, Lh20/x1;->R:Ljava/util/List;

    iput-object v9, p0, Lh20/x1;->S:Lh20/w2;

    iput-object v10, p0, Lh20/x1;->T:Lh20/q3;

    move-object/from16 p1, p21

    iput-object p1, p0, Lh20/x1;->U:Lh20/g3;

    move-object/from16 p1, p22

    iput-object p1, p0, Lh20/x1;->V:Ljava/lang/String;

    iput-object v11, p0, Lh20/x1;->W:Ljava/util/Map;

    move/from16 p1, p24

    iput-boolean p1, p0, Lh20/x1;->X:Z

    move-object/from16 p1, p25

    iput-object p1, p0, Lh20/x1;->Y:Ljava/lang/String;

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
    instance-of v1, p1, Lh20/x1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lh20/x1;

    iget-object v1, p0, Lh20/x1;->w:Ljava/lang/String;

    iget-object v3, p1, Lh20/x1;->w:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lh20/x1;->x:Lh20/c2;

    iget-object v3, p1, Lh20/x1;->x:Lh20/c2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lh20/x1;->y:Lh20/h2;

    iget-object v3, p1, Lh20/x1;->y:Lh20/h2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lh20/x1;->z:Lh20/i1;

    iget-object v3, p1, Lh20/x1;->z:Lh20/i1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lh20/x1;->E:Li20/b;

    iget-object v3, p1, Lh20/x1;->E:Li20/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lh20/x1;->F:Z

    iget-boolean v3, p1, Lh20/x1;->F:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lh20/x1;->G:Z

    iget-boolean v3, p1, Lh20/x1;->G:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lh20/x1;->H:Lh20/h1;

    iget-object v3, p1, Lh20/x1;->H:Lh20/h1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lh20/x1;->I:Ljava/lang/String;

    iget-object v3, p1, Lh20/x1;->I:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lh20/x1;->J:Lh20/l1;

    iget-object v3, p1, Lh20/x1;->J:Lh20/l1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lh20/x1;->K:Ljava/util/List;

    iget-object v3, p1, Lh20/x1;->K:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lh20/x1;->L:Z

    iget-boolean v3, p1, Lh20/x1;->L:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lh20/x1;->M:Ljava/util/List;

    iget-object v3, p1, Lh20/x1;->M:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lh20/x1;->N:Ljava/util/List;

    iget-object v3, p1, Lh20/x1;->N:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lh20/x1;->O:Lh20/x2;

    iget-object v3, p1, Lh20/x1;->O:Lh20/x2;

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lh20/x1;->P:Lh20/t1;

    iget-object v3, p1, Lh20/x1;->P:Lh20/t1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lh20/x1;->Q:Ljava/util/List;

    iget-object v3, p1, Lh20/x1;->Q:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lh20/x1;->R:Ljava/util/List;

    iget-object v3, p1, Lh20/x1;->R:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lh20/x1;->S:Lh20/w2;

    iget-object v3, p1, Lh20/x1;->S:Lh20/w2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lh20/x1;->T:Lh20/q3;

    iget-object v3, p1, Lh20/x1;->T:Lh20/q3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lh20/x1;->U:Lh20/g3;

    iget-object v3, p1, Lh20/x1;->U:Lh20/g3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lh20/x1;->V:Ljava/lang/String;

    iget-object v3, p1, Lh20/x1;->V:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lh20/x1;->W:Ljava/util/Map;

    iget-object v3, p1, Lh20/x1;->W:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-boolean v1, p0, Lh20/x1;->X:Z

    iget-boolean v3, p1, Lh20/x1;->X:Z

    if-eq v1, v3, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lh20/x1;->Y:Ljava/lang/String;

    iget-object p1, p1, Lh20/x1;->Y:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1a

    return v2

    :cond_1a
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lh20/x1;->w:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    const/4 v2, 0x0

    iget-object v3, p0, Lh20/x1;->x:Lh20/c2;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Lh20/c2;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lh20/x1;->y:Lh20/h2;

    if-nez v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lh20/h2;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lh20/x1;->z:Lh20/i1;

    if-nez v3, :cond_2

    move v3, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lh20/i1;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lh20/x1;->E:Li20/b;

    if-nez v3, :cond_3

    move v3, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Li20/b;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v3, p0, Lh20/x1;->F:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lh20/x1;->G:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lh20/x1;->H:Lh20/h1;

    invoke-virtual {v3}, Lh20/h1;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-object v0, p0, Lh20/x1;->I:Ljava/lang/String;

    if-nez v0, :cond_4

    move v0, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-object v0, p0, Lh20/x1;->J:Lh20/l1;

    invoke-virtual {v0}, Lh20/l1;->hashCode()I

    move-result v0

    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lh20/x1;->K:Ljava/util/List;

    invoke-static {v0, v1, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v3, p0, Lh20/x1;->L:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lh20/x1;->M:Ljava/util/List;

    invoke-static {v0, v1, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v3, p0, Lh20/x1;->N:Ljava/util/List;

    invoke-static {v0, v1, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v3, p0, Lh20/x1;->O:Lh20/x2;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-object v0, p0, Lh20/x1;->P:Lh20/t1;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lh20/x1;->Q:Ljava/util/List;

    invoke-static {v0, v1, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v3, p0, Lh20/x1;->R:Ljava/util/List;

    invoke-static {v0, v1, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v3, p0, Lh20/x1;->S:Lh20/w2;

    invoke-virtual {v3}, Lh20/w2;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-object v0, p0, Lh20/x1;->T:Lh20/q3;

    invoke-virtual {v0}, Lh20/q3;->hashCode()I

    move-result v0

    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lh20/x1;->U:Lh20/g3;

    if-nez v3, :cond_5

    move v3, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Lh20/g3;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lh20/x1;->V:Ljava/lang/String;

    if-nez v3, :cond_6

    move v3, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lh20/x1;->W:Ljava/util/Map;

    invoke-static {v3, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-boolean v3, p0, Lh20/x1;->X:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lh20/x1;->Y:Ljava/lang/String;

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Configuration(merchantDisplayName="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lh20/x1;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", customer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/x1;->x:Lh20/c2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", googlePay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/x1;->y:Lh20/h2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", defaultBillingDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/x1;->z:Lh20/i1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shippingDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/x1;->E:Li20/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", allowsDelayedPaymentMethods="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lh20/x1;->F:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", allowsPaymentMethodsRequiringShippingAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lh20/x1;->G:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", appearance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/x1;->H:Lh20/h1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", primaryButtonLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/x1;->I:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", billingDetailsCollectionConfiguration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/x1;->J:Lh20/l1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", preferredNetworks="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", allowsRemovalOfLastSavedPaymentMethod="

    const-string v2, ", paymentMethodOrder="

    iget-object v3, p0, Lh20/x1;->K:Ljava/util/List;

    iget-boolean v4, p0, Lh20/x1;->L:Z

    invoke-static {v1, v2, v0, v3, v4}, Lnh3/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Z)V

    const-string v1, ", externalPaymentMethods="

    const-string v2, ", paymentMethodLayout="

    iget-object v3, p0, Lh20/x1;->M:Ljava/util/List;

    iget-object v4, p0, Lh20/x1;->N:Ljava/util/List;

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    iget-object v1, p0, Lh20/x1;->O:Lh20/x2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cardBrandAcceptance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/x1;->P:Lh20/t1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", allowedCardFundingTypes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", customPaymentMethods="

    const-string v2, ", link="

    iget-object v3, p0, Lh20/x1;->Q:Ljava/util/List;

    iget-object v4, p0, Lh20/x1;->R:Ljava/util/List;

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    iget-object v1, p0, Lh20/x1;->S:Lh20/w2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", walletButtons="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/x1;->T:Lh20/q3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shopPayConfiguration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/x1;->U:Lh20/g3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", googlePlacesApiKey="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/x1;->V:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", termsDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh20/x1;->W:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", opensCardScannerAutomatically="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lh20/x1;->X:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", userOverrideCountry="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    iget-object v2, p0, Lh20/x1;->Y:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh20/x1;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Lh20/x1;->x:Lh20/c2;

    if-nez v2, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Lh20/c2;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v2, p0, Lh20/x1;->y:Lh20/h2;

    if-nez v2, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Lh20/h2;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object v2, p0, Lh20/x1;->z:Lh20/i1;

    if-nez v2, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Lh20/i1;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_2
    iget-object v2, p0, Lh20/x1;->E:Li20/b;

    invoke-virtual {p1, v2, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-boolean v2, p0, Lh20/x1;->F:Z

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v2, p0, Lh20/x1;->G:Z

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v2, p0, Lh20/x1;->H:Lh20/h1;

    invoke-virtual {v2, p1, p2}, Lh20/h1;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v2, p0, Lh20/x1;->I:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Lh20/x1;->J:Lh20/l1;

    invoke-virtual {v2, p1, p2}, Lh20/l1;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v2, p0, Lh20/x1;->K:Ljava/util/List;

    invoke-static {v2, p1}, Ld13/a;->o(Ljava/util/List;Landroid/os/Parcel;)Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly00/i;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    iget-boolean v2, p0, Lh20/x1;->L:Z

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v2, p0, Lh20/x1;->M:Ljava/util/List;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object v2, p0, Lh20/x1;->N:Ljava/util/List;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object v2, p0, Lh20/x1;->O:Lh20/x2;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Lh20/x1;->P:Lh20/t1;

    invoke-virtual {p1, v2, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v2, p0, Lh20/x1;->Q:Ljava/util/List;

    invoke-static {v2, p1}, Ld13/a;->o(Ljava/util/List;Landroid/os/Parcel;)Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh20/u1;

    invoke-virtual {v3, p1, p2}, Lh20/u1;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_4

    :cond_4
    iget-object v2, p0, Lh20/x1;->R:Ljava/util/List;

    invoke-static {v2, p1}, Ld13/a;->o(Ljava/util/List;Landroid/os/Parcel;)Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh20/y1;

    invoke-virtual {v3, p1, p2}, Lh20/y1;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_5

    :cond_5
    iget-object v2, p0, Lh20/x1;->S:Lh20/w2;

    invoke-virtual {v2, p1, p2}, Lh20/w2;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v2, p0, Lh20/x1;->T:Lh20/q3;

    invoke-virtual {v2, p1, p2}, Lh20/q3;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v2, p0, Lh20/x1;->U:Lh20/g3;

    if-nez v2, :cond_6

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_6

    :cond_6
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Lh20/g3;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_6
    iget-object v0, p0, Lh20/x1;->V:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lh20/x1;->W:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Parcelable;

    invoke-virtual {p1, v2, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh20/i3;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_7

    :cond_7
    iget-boolean p2, p0, Lh20/x1;->X:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lh20/x1;->Y:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
