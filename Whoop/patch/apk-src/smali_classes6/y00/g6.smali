.class public final Ly00/g6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly00/c8;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ly00/g6;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Ljava/lang/String;

.field public final F:Ljava/lang/String;

.field public final G:Z

.field public final H:Ly00/o4;

.field public final I:Ljava/lang/String;

.field public final J:Ljava/util/List;

.field public final K:Lcom/stripe/android/model/StripeIntent$Status;

.field public final L:Lcom/stripe/android/model/StripeIntent$Usage;

.field public final M:Ly00/f6;

.field public final N:Ljava/util/List;

.field public final O:Ljava/util/List;

.field public final P:Ly00/b8;

.field public final Q:Ljava/lang/String;

.field public final R:Z

.field public final w:Ljava/lang/String;

.field public final x:Ly00/c6;

.field public final y:J

.field public final z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly00/r5;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Ly00/r5;-><init>(I)V

    sput-object v0, Ly00/g6;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JLjava/lang/String;ZLjava/util/List;Lcom/stripe/android/model/StripeIntent$Usage;Ljava/util/List;Ljava/util/List;Z)V
    .locals 20

    const/4 v12, 0x0

    const/16 v17, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/16 v18, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v8, p5

    move-object/from16 v11, p6

    move-object/from16 v13, p7

    move-object/from16 v15, p8

    move-object/from16 v16, p9

    move/from16 v19, p10

    .line 1
    invoke-direct/range {v0 .. v19}, Ly00/g6;-><init>(Ljava/lang/String;Ly00/c6;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLy00/o4;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Ly00/f6;Ljava/util/List;Ljava/util/List;Ly00/b8;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ly00/c6;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLy00/o4;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Ly00/f6;Ljava/util/List;Ljava/util/List;Ly00/b8;Ljava/lang/String;Z)V
    .locals 3

    move-object/from16 v0, p15

    move-object/from16 v1, p16

    const-string v2, "paymentMethodTypes"

    invoke-static {p11, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "unactivatedPaymentMethods"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "linkFundingSources"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Ly00/g6;->w:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Ly00/g6;->x:Ly00/c6;

    .line 5
    iput-wide p3, p0, Ly00/g6;->y:J

    .line 6
    iput-object p5, p0, Ly00/g6;->z:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Ly00/g6;->E:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Ly00/g6;->F:Ljava/lang/String;

    .line 9
    iput-boolean p8, p0, Ly00/g6;->G:Z

    .line 10
    iput-object p9, p0, Ly00/g6;->H:Ly00/o4;

    .line 11
    iput-object p10, p0, Ly00/g6;->I:Ljava/lang/String;

    .line 12
    iput-object p11, p0, Ly00/g6;->J:Ljava/util/List;

    .line 13
    iput-object p12, p0, Ly00/g6;->K:Lcom/stripe/android/model/StripeIntent$Status;

    move-object/from16 p1, p13

    .line 14
    iput-object p1, p0, Ly00/g6;->L:Lcom/stripe/android/model/StripeIntent$Usage;

    move-object/from16 p1, p14

    .line 15
    iput-object p1, p0, Ly00/g6;->M:Ly00/f6;

    .line 16
    iput-object v0, p0, Ly00/g6;->N:Ljava/util/List;

    .line 17
    iput-object v1, p0, Ly00/g6;->O:Ljava/util/List;

    move-object/from16 p1, p17

    .line 18
    iput-object p1, p0, Ly00/g6;->P:Ly00/b8;

    move-object/from16 p1, p18

    .line 19
    iput-object p1, p0, Ly00/g6;->Q:Ljava/lang/String;

    move/from16 p1, p19

    .line 20
    iput-boolean p1, p0, Ly00/g6;->R:Z

    return-void
.end method

.method public static b(Ly00/g6;Ly00/o4;Ljava/util/List;I)Ly00/g6;
    .locals 23

    move-object/from16 v0, p0

    move/from16 v1, p3

    iget-object v2, v0, Ly00/g6;->w:Ljava/lang/String;

    move-object v3, v2

    iget-object v2, v0, Ly00/g6;->x:Ly00/c6;

    move-object v5, v3

    iget-wide v3, v0, Ly00/g6;->y:J

    move-object v6, v5

    iget-object v5, v0, Ly00/g6;->z:Ljava/lang/String;

    move-object v7, v6

    iget-object v6, v0, Ly00/g6;->E:Ljava/lang/String;

    move-object v8, v7

    iget-object v7, v0, Ly00/g6;->F:Ljava/lang/String;

    move-object v9, v8

    iget-boolean v8, v0, Ly00/g6;->G:Z

    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_0

    iget-object v10, v0, Ly00/g6;->H:Ly00/o4;

    goto :goto_0

    :cond_0
    move-object/from16 v10, p1

    :goto_0
    iget-object v11, v0, Ly00/g6;->I:Ljava/lang/String;

    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_1

    iget-object v1, v0, Ly00/g6;->J:Ljava/util/List;

    goto :goto_1

    :cond_1
    move-object/from16 v1, p2

    :goto_1
    iget-object v12, v0, Ly00/g6;->K:Lcom/stripe/android/model/StripeIntent$Status;

    iget-object v13, v0, Ly00/g6;->L:Lcom/stripe/android/model/StripeIntent$Usage;

    iget-object v14, v0, Ly00/g6;->M:Ly00/f6;

    iget-object v15, v0, Ly00/g6;->N:Ljava/util/List;

    move-object/from16 v16, v2

    iget-object v2, v0, Ly00/g6;->O:Ljava/util/List;

    move-wide/from16 v17, v3

    iget-object v3, v0, Ly00/g6;->P:Ly00/b8;

    iget-object v4, v0, Ly00/g6;->Q:Ljava/lang/String;

    move-object/from16 v19, v3

    iget-boolean v3, v0, Ly00/g6;->R:Z

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "paymentMethodTypes"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unactivatedPaymentMethods"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkFundingSources"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly00/g6;

    move-object/from16 v20, v11

    move-object v11, v1

    move-object v1, v9

    move-object v9, v10

    move-object/from16 v10, v20

    move-object/from16 v20, v16

    move-object/from16 v16, v2

    move-object/from16 v2, v20

    move-object/from16 v20, v19

    move/from16 v19, v3

    move-wide/from16 v21, v17

    move-object/from16 v18, v4

    move-wide/from16 v3, v21

    move-object/from16 v17, v20

    invoke-direct/range {v0 .. v19}, Ly00/g6;-><init>(Ljava/lang/String;Ly00/c6;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLy00/o4;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Ly00/f6;Ljava/util/List;Ljava/util/List;Ly00/b8;Ljava/lang/String;Z)V

    return-object v0
.end method


# virtual methods
.method public final G()Ljava/util/Map;
    .locals 2

    iget-object v0, p0, Ly00/g6;->Q:Ljava/lang/String;

    if-eqz v0, :cond_1

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ls/s;->m(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    sget-object v0, Lm83/z;->w:Lm83/z;

    return-object v0
.end method

.method public final K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly00/g6;->I:Ljava/lang/String;

    return-object v0
.end method

.method public final O()Lcom/stripe/android/model/StripeIntent$NextActionType;
    .locals 2

    iget-object v0, p0, Ly00/g6;->P:Ly00/b8;

    instance-of v1, v0, Ly00/w7;

    if-eqz v1, :cond_0

    sget-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->z:Lcom/stripe/android/model/StripeIntent$NextActionType;

    return-object v0

    :cond_0
    instance-of v1, v0, Ly00/r7;

    if-eqz v1, :cond_1

    sget-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->y:Lcom/stripe/android/model/StripeIntent$NextActionType;

    return-object v0

    :cond_1
    instance-of v1, v0, Ly00/n7;

    if-eqz v1, :cond_2

    sget-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->E:Lcom/stripe/android/model/StripeIntent$NextActionType;

    return-object v0

    :cond_2
    instance-of v1, v0, Ly00/k7;

    if-eqz v1, :cond_3

    sget-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->J:Lcom/stripe/android/model/StripeIntent$NextActionType;

    return-object v0

    :cond_3
    instance-of v1, v0, Ly00/l7;

    if-eqz v1, :cond_4

    sget-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->K:Lcom/stripe/android/model/StripeIntent$NextActionType;

    return-object v0

    :cond_4
    instance-of v1, v0, Ly00/m7;

    if-eqz v1, :cond_5

    sget-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->L:Lcom/stripe/android/model/StripeIntent$NextActionType;

    return-object v0

    :cond_5
    instance-of v1, v0, Ly00/z7;

    if-eqz v1, :cond_6

    sget-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->G:Lcom/stripe/android/model/StripeIntent$NextActionType;

    return-object v0

    :cond_6
    instance-of v1, v0, Ly00/j7;

    if-eqz v1, :cond_7

    sget-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->I:Lcom/stripe/android/model/StripeIntent$NextActionType;

    return-object v0

    :cond_7
    instance-of v1, v0, Ly00/h7;

    if-nez v1, :cond_9

    instance-of v1, v0, Ly00/i7;

    if-nez v1, :cond_9

    instance-of v1, v0, Ly00/a8;

    if-nez v1, :cond_9

    instance-of v1, v0, Ly00/y7;

    if-nez v1, :cond_9

    instance-of v1, v0, Ly00/x7;

    if-nez v1, :cond_9

    instance-of v1, v0, Ly00/o7;

    if-nez v1, :cond_9

    instance-of v1, v0, Ly00/p7;

    if-nez v1, :cond_9

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_9
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final X()Z
    .locals 1

    iget-boolean v0, p0, Ly00/g6;->R:Z

    return v0
.end method

.method public final Y()Ly00/o4;
    .locals 1

    iget-object v0, p0, Ly00/g6;->H:Ly00/o4;

    return-object v0
.end method

.method public final c()Lcom/stripe/android/model/StripeIntent$Status;
    .locals 1

    iget-object v0, p0, Ly00/g6;->K:Lcom/stripe/android/model/StripeIntent$Status;

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
    instance-of v1, p1, Ly00/g6;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly00/g6;

    iget-object v1, p0, Ly00/g6;->w:Ljava/lang/String;

    iget-object v3, p1, Ly00/g6;->w:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ly00/g6;->x:Ly00/c6;

    iget-object v3, p1, Ly00/g6;->x:Ly00/c6;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Ly00/g6;->y:J

    iget-wide v5, p1, Ly00/g6;->y:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ly00/g6;->z:Ljava/lang/String;

    iget-object v3, p1, Ly00/g6;->z:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ly00/g6;->E:Ljava/lang/String;

    iget-object v3, p1, Ly00/g6;->E:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Ly00/g6;->F:Ljava/lang/String;

    iget-object v3, p1, Ly00/g6;->F:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Ly00/g6;->G:Z

    iget-boolean v3, p1, Ly00/g6;->G:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Ly00/g6;->H:Ly00/o4;

    iget-object v3, p1, Ly00/g6;->H:Ly00/o4;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Ly00/g6;->I:Ljava/lang/String;

    iget-object v3, p1, Ly00/g6;->I:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Ly00/g6;->J:Ljava/util/List;

    iget-object v3, p1, Ly00/g6;->J:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Ly00/g6;->K:Lcom/stripe/android/model/StripeIntent$Status;

    iget-object v3, p1, Ly00/g6;->K:Lcom/stripe/android/model/StripeIntent$Status;

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Ly00/g6;->L:Lcom/stripe/android/model/StripeIntent$Usage;

    iget-object v3, p1, Ly00/g6;->L:Lcom/stripe/android/model/StripeIntent$Usage;

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Ly00/g6;->M:Ly00/f6;

    iget-object v3, p1, Ly00/g6;->M:Ly00/f6;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Ly00/g6;->N:Ljava/util/List;

    iget-object v3, p1, Ly00/g6;->N:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Ly00/g6;->O:Ljava/util/List;

    iget-object v3, p1, Ly00/g6;->O:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Ly00/g6;->P:Ly00/b8;

    iget-object v3, p1, Ly00/g6;->P:Ly00/b8;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Ly00/g6;->Q:Ljava/lang/String;

    iget-object v3, p1, Ly00/g6;->Q:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-boolean v1, p0, Ly00/g6;->R:Z

    iget-boolean p1, p1, Ly00/g6;->R:Z

    if-eq v1, p1, :cond_13

    return v2

    :cond_13
    return v0
.end method

.method public final g0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Ly00/g6;->N:Ljava/util/List;

    return-object v0
.end method

.method public final getClientSecret()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly00/g6;->E:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly00/g6;->w:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 5

    const/4 v0, 0x0

    iget-object v1, p0, Ly00/g6;->w:Ljava/lang/String;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/g6;->x:Ly00/c6;

    if-nez v3, :cond_1

    move v3, v0

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-wide v3, p0, Ly00/g6;->y:J

    invoke-static {v1, v3, v4, v2}, Ld;->e(IJI)I

    move-result v1

    iget-object v3, p0, Ly00/g6;->z:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v0

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/g6;->E:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v0

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/g6;->F:Ljava/lang/String;

    if-nez v3, :cond_4

    move v3, v0

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-boolean v3, p0, Ly00/g6;->G:Z

    invoke-static {v1, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v1

    iget-object v3, p0, Ly00/g6;->H:Ly00/o4;

    if-nez v3, :cond_5

    move v3, v0

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ly00/o4;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/g6;->I:Ljava/lang/String;

    if-nez v3, :cond_6

    move v3, v0

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/g6;->J:Ljava/util/List;

    invoke-static {v1, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v1

    iget-object v3, p0, Ly00/g6;->K:Lcom/stripe/android/model/StripeIntent$Status;

    if-nez v3, :cond_7

    move v3, v0

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/g6;->L:Lcom/stripe/android/model/StripeIntent$Usage;

    if-nez v3, :cond_8

    move v3, v0

    goto :goto_8

    :cond_8
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/g6;->M:Ly00/f6;

    if-nez v3, :cond_9

    move v3, v0

    goto :goto_9

    :cond_9
    invoke-virtual {v3}, Ly00/f6;->hashCode()I

    move-result v3

    :goto_9
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/g6;->N:Ljava/util/List;

    invoke-static {v1, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v1

    iget-object v3, p0, Ly00/g6;->O:Ljava/util/List;

    invoke-static {v1, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v1

    iget-object v3, p0, Ly00/g6;->P:Ly00/b8;

    if-nez v3, :cond_a

    move v3, v0

    goto :goto_a

    :cond_a
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_a
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/g6;->Q:Ljava/lang/String;

    if-nez v3, :cond_b

    goto :goto_b

    :cond_b
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_b
    add-int/2addr v1, v0

    mul-int/2addr v1, v2

    iget-boolean v0, p0, Ly00/g6;->R:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final i0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Ly00/g6;->O:Ljava/util/List;

    return-object v0
.end method

.method public final j0()Z
    .locals 2

    sget-object v0, Lcom/stripe/android/model/StripeIntent$Status;->z:Lcom/stripe/android/model/StripeIntent$Status;

    sget-object v1, Lcom/stripe/android/model/StripeIntent$Status;->G:Lcom/stripe/android/model/StripeIntent$Status;

    filled-new-array {v0, v1}, [Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, Ly00/g6;->K:Lcom/stripe/android/model/StripeIntent$Status;

    invoke-static {v0, v1}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final m()Ly00/b8;
    .locals 1

    iget-object v0, p0, Ly00/g6;->P:Ly00/b8;

    return-object v0
.end method

.method public final p()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Ly00/g6;->J:Ljava/util/List;

    return-object v0
.end method

.method public final q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly00/g6;->z:Ljava/lang/String;

    return-object v0
.end method

.method public final q0()Z
    .locals 1

    iget-boolean v0, p0, Ly00/g6;->G:Z

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SetupIntent(id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ly00/g6;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", cancellationReason="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/g6;->x:Ly00/c6;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", created="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ly00/g6;->y:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", countryCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/g6;->z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", clientSecret="

    const-string v2, ", description="

    iget-object v3, p0, Ly00/g6;->E:Ljava/lang/String;

    iget-object v4, p0, Ly00/g6;->F:Ljava/lang/String;

    invoke-static {v0, v1, v3, v2, v4}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", isLiveMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ly00/g6;->G:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", paymentMethod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/g6;->H:Ly00/o4;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentMethodId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/g6;->I:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentMethodTypes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/g6;->J:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/g6;->K:Lcom/stripe/android/model/StripeIntent$Status;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", usage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/g6;->L:Lcom/stripe/android/model/StripeIntent$Usage;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lastSetupError="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/g6;->M:Ly00/f6;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", unactivatedPaymentMethods="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/g6;->N:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", linkFundingSources="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/g6;->O:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", nextActionData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/g6;->P:Ly00/b8;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentMethodOptionsJsonString="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/g6;->Q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", automaticPaymentMethodsEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ly00/g6;->R:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly00/g6;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Ly00/g6;->x:Ly00/c6;

    if-nez v2, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_0
    iget-wide v2, p0, Ly00/g6;->y:J

    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    iget-object v2, p0, Ly00/g6;->z:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/g6;->E:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/g6;->F:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v2, p0, Ly00/g6;->G:Z

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v2, p0, Ly00/g6;->H:Ly00/o4;

    if-nez v2, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/o4;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object v2, p0, Ly00/g6;->I:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/g6;->J:Ljava/util/List;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object v2, p0, Ly00/g6;->K:Lcom/stripe/android/model/StripeIntent$Status;

    if-nez v2, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_2
    iget-object v2, p0, Ly00/g6;->L:Lcom/stripe/android/model/StripeIntent$Usage;

    if-nez v2, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_3
    iget-object v2, p0, Ly00/g6;->M:Ly00/f6;

    if-nez v2, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/f6;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_4
    iget-object v0, p0, Ly00/g6;->N:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object v0, p0, Ly00/g6;->O:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object v0, p0, Ly00/g6;->P:Ly00/b8;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Ly00/g6;->Q:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Ly00/g6;->R:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method public final z()Z
    .locals 2

    iget-object v0, p0, Ly00/g6;->K:Lcom/stripe/android/model/StripeIntent$Status;

    sget-object v1, Lcom/stripe/android/model/StripeIntent$Status;->E:Lcom/stripe/android/model/StripeIntent$Status;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
