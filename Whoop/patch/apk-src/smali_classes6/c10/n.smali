.class public final Lc10/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lc10/n;",
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

.field public final K:Ljava/util/ArrayList;

.field public final L:Z

.field public final M:Ljava/util/List;

.field public final N:Ljava/util/List;

.field public final O:Lh20/t1;

.field public final P:Ljava/util/ArrayList;

.field public final Q:Ljava/util/ArrayList;

.field public final R:Z

.field public final S:Lh20/w2;

.field public final T:Lc10/o;

.field public final U:Ljava/util/LinkedHashMap;

.field public final V:Z

.field public final W:Ljava/lang/String;

.field public final w:Ljava/lang/String;

.field public final x:Lh20/c2;

.field public final y:Lh20/h2;

.field public final z:Lh20/i1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lay/b;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lay/b;-><init>(I)V

    sput-object v0, Lc10/n;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lh20/c2;Lh20/h2;Lh20/i1;Li20/b;ZZLh20/h1;Ljava/lang/String;Lh20/l1;Ljava/util/ArrayList;ZLjava/util/ArrayList;Ljava/util/ArrayList;Lh20/t1;Ljava/util/ArrayList;Ljava/util/ArrayList;ZLh20/w2;Lc10/o;Ljava/util/LinkedHashMap;ZLjava/lang/String;)V
    .locals 8

    move-object/from16 v0, p8

    move-object/from16 v1, p10

    move-object/from16 v2, p13

    move-object/from16 v3, p14

    move-object/from16 v4, p15

    move-object/from16 v5, p19

    move-object/from16 v6, p20

    const-string v7, "merchantDisplayName"

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "appearance"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "billingDetailsCollectionConfiguration"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "paymentMethodOrder"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "externalPaymentMethods"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "cardBrandAcceptance"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "link"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "formSheetAction"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc10/n;->w:Ljava/lang/String;

    iput-object p2, p0, Lc10/n;->x:Lh20/c2;

    iput-object p3, p0, Lc10/n;->y:Lh20/h2;

    iput-object p4, p0, Lc10/n;->z:Lh20/i1;

    iput-object p5, p0, Lc10/n;->E:Li20/b;

    iput-boolean p6, p0, Lc10/n;->F:Z

    iput-boolean p7, p0, Lc10/n;->G:Z

    iput-object v0, p0, Lc10/n;->H:Lh20/h1;

    move-object/from16 p1, p9

    iput-object p1, p0, Lc10/n;->I:Ljava/lang/String;

    iput-object v1, p0, Lc10/n;->J:Lh20/l1;

    move-object/from16 p1, p11

    iput-object p1, p0, Lc10/n;->K:Ljava/util/ArrayList;

    move/from16 p1, p12

    iput-boolean p1, p0, Lc10/n;->L:Z

    iput-object v2, p0, Lc10/n;->M:Ljava/util/List;

    iput-object v3, p0, Lc10/n;->N:Ljava/util/List;

    iput-object v4, p0, Lc10/n;->O:Lh20/t1;

    move-object/from16 p1, p16

    iput-object p1, p0, Lc10/n;->P:Ljava/util/ArrayList;

    move-object/from16 p1, p17

    iput-object p1, p0, Lc10/n;->Q:Ljava/util/ArrayList;

    move/from16 p1, p18

    iput-boolean p1, p0, Lc10/n;->R:Z

    iput-object v5, p0, Lc10/n;->S:Lh20/w2;

    iput-object v6, p0, Lc10/n;->T:Lc10/o;

    move-object/from16 p1, p21

    iput-object p1, p0, Lc10/n;->U:Ljava/util/LinkedHashMap;

    move/from16 p1, p22

    iput-boolean p1, p0, Lc10/n;->V:Z

    move-object/from16 p1, p23

    iput-object p1, p0, Lc10/n;->W:Ljava/lang/String;

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
    instance-of v0, p1, Lc10/n;

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p1, Lc10/n;

    iget-object v0, p0, Lc10/n;->w:Ljava/lang/String;

    iget-object v1, p1, Lc10/n;->w:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lc10/n;->x:Lh20/c2;

    iget-object v1, p1, Lc10/n;->x:Lh20/c2;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lc10/n;->y:Lh20/h2;

    iget-object v1, p1, Lc10/n;->y:Lh20/h2;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lc10/n;->z:Lh20/i1;

    iget-object v1, p1, Lc10/n;->z:Lh20/i1;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    iget-object v0, p0, Lc10/n;->E:Li20/b;

    iget-object v1, p1, Lc10/n;->E:Li20/b;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    iget-boolean v0, p0, Lc10/n;->F:Z

    iget-boolean v1, p1, Lc10/n;->F:Z

    if-eq v0, v1, :cond_7

    goto/16 :goto_0

    :cond_7
    iget-boolean v0, p0, Lc10/n;->G:Z

    iget-boolean v1, p1, Lc10/n;->G:Z

    if-eq v0, v1, :cond_8

    goto/16 :goto_0

    :cond_8
    iget-object v0, p0, Lc10/n;->H:Lh20/h1;

    iget-object v1, p1, Lc10/n;->H:Lh20/h1;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :cond_9
    iget-object v0, p0, Lc10/n;->I:Ljava/lang/String;

    iget-object v1, p1, Lc10/n;->I:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    :cond_a
    iget-object v0, p0, Lc10/n;->J:Lh20/l1;

    iget-object v1, p1, Lc10/n;->J:Lh20/l1;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_0

    :cond_b
    iget-object v0, p0, Lc10/n;->K:Ljava/util/ArrayList;

    iget-object v1, p1, Lc10/n;->K:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_0

    :cond_c
    iget-boolean v0, p0, Lc10/n;->L:Z

    iget-boolean v1, p1, Lc10/n;->L:Z

    if-eq v0, v1, :cond_d

    goto/16 :goto_0

    :cond_d
    iget-object v0, p0, Lc10/n;->M:Ljava/util/List;

    iget-object v1, p1, Lc10/n;->M:Ljava/util/List;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_0

    :cond_e
    iget-object v0, p0, Lc10/n;->N:Ljava/util/List;

    iget-object v1, p1, Lc10/n;->N:Ljava/util/List;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_0

    :cond_f
    iget-object v0, p0, Lc10/n;->O:Lh20/t1;

    iget-object v1, p1, Lc10/n;->O:Lh20/t1;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_0

    :cond_10
    iget-object v0, p0, Lc10/n;->P:Ljava/util/ArrayList;

    iget-object v1, p1, Lc10/n;->P:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_0

    :cond_11
    iget-object v0, p0, Lc10/n;->Q:Ljava/util/ArrayList;

    iget-object v1, p1, Lc10/n;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto :goto_0

    :cond_12
    iget-boolean v0, p0, Lc10/n;->R:Z

    iget-boolean v1, p1, Lc10/n;->R:Z

    if-eq v0, v1, :cond_13

    goto :goto_0

    :cond_13
    iget-object v0, p0, Lc10/n;->S:Lh20/w2;

    iget-object v1, p1, Lc10/n;->S:Lh20/w2;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto :goto_0

    :cond_14
    iget-object v0, p0, Lc10/n;->T:Lc10/o;

    iget-object v1, p1, Lc10/n;->T:Lc10/o;

    if-eq v0, v1, :cond_15

    goto :goto_0

    :cond_15
    iget-object v0, p0, Lc10/n;->U:Ljava/util/LinkedHashMap;

    iget-object v1, p1, Lc10/n;->U:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto :goto_0

    :cond_16
    iget-boolean v0, p0, Lc10/n;->V:Z

    iget-boolean v1, p1, Lc10/n;->V:Z

    if-eq v0, v1, :cond_17

    goto :goto_0

    :cond_17
    iget-object v0, p0, Lc10/n;->W:Ljava/lang/String;

    iget-object p1, p1, Lc10/n;->W:Ljava/lang/String;

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
    .locals 4

    iget-object v0, p0, Lc10/n;->w:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    const/4 v2, 0x0

    iget-object v3, p0, Lc10/n;->x:Lh20/c2;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Lh20/c2;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lc10/n;->y:Lh20/h2;

    if-nez v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lh20/h2;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lc10/n;->z:Lh20/i1;

    if-nez v3, :cond_2

    move v3, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lh20/i1;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lc10/n;->E:Li20/b;

    if-nez v3, :cond_3

    move v3, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Li20/b;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v3, p0, Lc10/n;->F:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lc10/n;->G:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lc10/n;->H:Lh20/h1;

    invoke-virtual {v3}, Lh20/h1;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-object v0, p0, Lc10/n;->I:Ljava/lang/String;

    if-nez v0, :cond_4

    move v0, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-object v0, p0, Lc10/n;->J:Lh20/l1;

    invoke-virtual {v0}, Lh20/l1;->hashCode()I

    move-result v0

    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lc10/n;->K:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-boolean v0, p0, Lc10/n;->L:Z

    invoke-static {v3, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lc10/n;->M:Ljava/util/List;

    invoke-static {v0, v1, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v3, p0, Lc10/n;->N:Ljava/util/List;

    invoke-static {v0, v1, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v3, p0, Lc10/n;->O:Lh20/t1;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-object v0, p0, Lc10/n;->P:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lc10/n;->Q:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-boolean v0, p0, Lc10/n;->R:Z

    invoke-static {v3, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lc10/n;->S:Lh20/w2;

    invoke-virtual {v3}, Lh20/w2;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-object v0, p0, Lc10/n;->T:Lc10/o;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lc10/n;->U:Ljava/util/LinkedHashMap;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v1

    iget-boolean v0, p0, Lc10/n;->V:Z

    invoke-static {v3, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lc10/n;->W:Ljava/lang/String;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Configuration(merchantDisplayName="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lc10/n;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", customer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc10/n;->x:Lh20/c2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", googlePay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc10/n;->y:Lh20/h2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", defaultBillingDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc10/n;->z:Lh20/i1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shippingDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc10/n;->E:Li20/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", allowsDelayedPaymentMethods="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lc10/n;->F:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", allowsPaymentMethodsRequiringShippingAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lc10/n;->G:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", appearance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc10/n;->H:Lh20/h1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", primaryButtonLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc10/n;->I:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", billingDetailsCollectionConfiguration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc10/n;->J:Lh20/l1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", preferredNetworks="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc10/n;->K:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", allowsRemovalOfLastSavedPaymentMethod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lc10/n;->L:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", paymentMethodOrder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", externalPaymentMethods="

    const-string v2, ", cardBrandAcceptance="

    iget-object v3, p0, Lc10/n;->M:Ljava/util/List;

    iget-object v4, p0, Lc10/n;->N:Ljava/util/List;

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    iget-object v1, p0, Lc10/n;->O:Lh20/t1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", allowedCardFundingTypes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc10/n;->P:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", customPaymentMethods="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc10/n;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", embeddedViewDisplaysMandateText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lc10/n;->R:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", link="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc10/n;->S:Lh20/w2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", formSheetAction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc10/n;->T:Lc10/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", termsDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc10/n;->U:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", opensCardScannerAutomatically="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lc10/n;->V:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", userOverrideCountry="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    iget-object v2, p0, Lc10/n;->W:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc10/n;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Lc10/n;->x:Lh20/c2;

    if-nez v2, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Lh20/c2;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v2, p0, Lc10/n;->y:Lh20/h2;

    if-nez v2, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Lh20/h2;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object v2, p0, Lc10/n;->z:Lh20/i1;

    if-nez v2, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Lh20/i1;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_2
    iget-object v0, p0, Lc10/n;->E:Li20/b;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-boolean v0, p0, Lc10/n;->F:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lc10/n;->G:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lc10/n;->H:Lh20/h1;

    invoke-virtual {v0, p1, p2}, Lh20/h1;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lc10/n;->I:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lc10/n;->J:Lh20/l1;

    invoke-virtual {v0, p1, p2}, Lh20/l1;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lc10/n;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly00/i;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    iget-boolean v0, p0, Lc10/n;->L:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lc10/n;->M:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object v0, p0, Lc10/n;->N:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object v0, p0, Lc10/n;->O:Lh20/t1;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lc10/n;->P:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh20/u1;

    invoke-virtual {v1, p1, p2}, Lh20/u1;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_4

    :cond_4
    iget-object v0, p0, Lc10/n;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh20/y1;

    invoke-virtual {v1, p1, p2}, Lh20/y1;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_5

    :cond_5
    iget-boolean v0, p0, Lc10/n;->R:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lc10/n;->S:Lh20/w2;

    invoke-virtual {v0, p1, p2}, Lh20/w2;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lc10/n;->T:Lc10/o;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lc10/n;->U:Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

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

    goto :goto_6

    :cond_6
    iget-boolean p2, p0, Lc10/n;->V:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lc10/n;->W:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
