.class public final Ly00/l3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly00/c8;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ly00/l3;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Ly00/d3;

.field public final F:Ly00/e3;

.field public final G:Ljava/lang/String;

.field public final H:Ly00/g3;

.field public final I:Ljava/lang/String;

.field public final J:J

.field public final K:Ljava/lang/String;

.field public final L:Ljava/lang/String;

.field public final M:Z

.field public final N:Ly00/o4;

.field public final O:Ljava/lang/String;

.field public final P:Ljava/lang/String;

.field public final Q:Lcom/stripe/android/model/StripeIntent$Status;

.field public final R:Lcom/stripe/android/model/StripeIntent$Usage;

.field public final S:Ly00/i3;

.field public final T:Ly00/j3;

.field public final U:Ljava/util/List;

.field public final V:Ljava/util/List;

.field public final W:Ly00/b8;

.field public final X:Ljava/lang/String;

.field public final Y:Z

.field public final w:Ljava/lang/String;

.field public final x:Ljava/util/List;

.field public final y:Ljava/lang/Long;

.field public final z:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly00/u2;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Ly00/u2;-><init>(I)V

    sput-object v0, Ly00/l3;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;JLy00/d3;Ly00/e3;Ljava/lang/String;Ly00/g3;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZLy00/o4;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Ly00/i3;Ly00/j3;Ljava/util/List;Ljava/util/List;Ly00/b8;Ljava/lang/String;Z)V
    .locals 3

    move-object/from16 v0, p23

    move-object/from16 v1, p24

    const-string v2, "paymentMethodTypes"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "captureMethod"

    invoke-static {p7, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "confirmationMethod"

    invoke-static {p9, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "unactivatedPaymentMethods"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "linkFundingSources"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ly00/l3;->w:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Ly00/l3;->x:Ljava/util/List;

    .line 4
    iput-object p3, p0, Ly00/l3;->y:Ljava/lang/Long;

    .line 5
    iput-wide p4, p0, Ly00/l3;->z:J

    .line 6
    iput-object p6, p0, Ly00/l3;->E:Ly00/d3;

    .line 7
    iput-object p7, p0, Ly00/l3;->F:Ly00/e3;

    .line 8
    iput-object p8, p0, Ly00/l3;->G:Ljava/lang/String;

    .line 9
    iput-object p9, p0, Ly00/l3;->H:Ly00/g3;

    .line 10
    iput-object p10, p0, Ly00/l3;->I:Ljava/lang/String;

    .line 11
    iput-wide p11, p0, Ly00/l3;->J:J

    move-object/from16 p1, p13

    .line 12
    iput-object p1, p0, Ly00/l3;->K:Ljava/lang/String;

    move-object/from16 p1, p14

    .line 13
    iput-object p1, p0, Ly00/l3;->L:Ljava/lang/String;

    move/from16 p1, p15

    .line 14
    iput-boolean p1, p0, Ly00/l3;->M:Z

    move-object/from16 p1, p16

    .line 15
    iput-object p1, p0, Ly00/l3;->N:Ly00/o4;

    move-object/from16 p1, p17

    .line 16
    iput-object p1, p0, Ly00/l3;->O:Ljava/lang/String;

    move-object/from16 p1, p18

    .line 17
    iput-object p1, p0, Ly00/l3;->P:Ljava/lang/String;

    move-object/from16 p1, p19

    .line 18
    iput-object p1, p0, Ly00/l3;->Q:Lcom/stripe/android/model/StripeIntent$Status;

    move-object/from16 p1, p20

    .line 19
    iput-object p1, p0, Ly00/l3;->R:Lcom/stripe/android/model/StripeIntent$Usage;

    move-object/from16 p1, p21

    .line 20
    iput-object p1, p0, Ly00/l3;->S:Ly00/i3;

    move-object/from16 p1, p22

    .line 21
    iput-object p1, p0, Ly00/l3;->T:Ly00/j3;

    .line 22
    iput-object v0, p0, Ly00/l3;->U:Ljava/util/List;

    .line 23
    iput-object v1, p0, Ly00/l3;->V:Ljava/util/List;

    move-object/from16 p1, p25

    .line 24
    iput-object p1, p0, Ly00/l3;->W:Ly00/b8;

    move-object/from16 p1, p26

    .line 25
    iput-object p1, p0, Ly00/l3;->X:Ljava/lang/String;

    move/from16 p1, p27

    .line 26
    iput-boolean p1, p0, Ly00/l3;->Y:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;JLy00/d3;Ly00/e3;Ljava/lang/String;Ly00/g3;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZLy00/o4;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Ly00/i3;Ly00/j3;Ljava/util/List;Ljava/util/List;Ly00/b8;Ljava/lang/String;ZI)V
    .locals 31

    move/from16 v0, p28

    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_0

    const-wide/16 v1, 0x0

    move-wide v7, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v7, p4

    :goto_0
    and-int/lit8 v1, v0, 0x10

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v9, v2

    goto :goto_1

    :cond_1
    move-object/from16 v9, p6

    :goto_1
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2

    .line 27
    sget-object v1, Ly00/e3;->y:Ly00/e3;

    move-object v10, v1

    goto :goto_2

    :cond_2
    move-object/from16 v10, p7

    :goto_2
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_3

    .line 28
    sget-object v1, Ly00/g3;->y:Ly00/g3;

    move-object v12, v1

    goto :goto_3

    :cond_3
    move-object/from16 v12, p9

    :goto_3
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_4

    move-object/from16 v17, v2

    goto :goto_4

    :cond_4
    move-object/from16 v17, p14

    :goto_4
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_5

    move-object/from16 v19, v2

    goto :goto_5

    :cond_5
    move-object/from16 v19, p16

    :goto_5
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_6

    move-object/from16 v20, v2

    goto :goto_6

    :cond_6
    move-object/from16 v20, p17

    :goto_6
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_7

    move-object/from16 v21, v2

    goto :goto_7

    :cond_7
    move-object/from16 v21, p18

    :goto_7
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_8

    move-object/from16 v22, v2

    goto :goto_8

    :cond_8
    move-object/from16 v22, p19

    :goto_8
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_9

    move-object/from16 v23, v2

    goto :goto_9

    :cond_9
    move-object/from16 v23, p20

    :goto_9
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_a

    move-object/from16 v24, v2

    goto :goto_a

    :cond_a
    move-object/from16 v24, p21

    :goto_a
    const/high16 v1, 0x80000

    and-int/2addr v1, v0

    if-eqz v1, :cond_b

    move-object/from16 v25, v2

    goto :goto_b

    :cond_b
    move-object/from16 v25, p22

    :goto_b
    const/high16 v1, 0x200000

    and-int/2addr v1, v0

    if-eqz v1, :cond_c

    .line 29
    sget-object v1, Lm83/y;->w:Lm83/y;

    move-object/from16 v27, v1

    goto :goto_c

    :cond_c
    move-object/from16 v27, p24

    :goto_c
    const/high16 v1, 0x400000

    and-int/2addr v1, v0

    if-eqz v1, :cond_d

    move-object/from16 v28, v2

    goto :goto_d

    :cond_d
    move-object/from16 v28, p25

    :goto_d
    const/high16 v1, 0x1000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_e

    const/4 v0, 0x0

    move/from16 v30, v0

    :goto_e
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v11, p8

    move-object/from16 v13, p10

    move-wide/from16 v14, p11

    move-object/from16 v16, p13

    move/from16 v18, p15

    move-object/from16 v26, p23

    move-object/from16 v29, p26

    goto :goto_f

    :cond_e
    move/from16 v30, p27

    goto :goto_e

    .line 30
    :goto_f
    invoke-direct/range {v3 .. v30}, Ly00/l3;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;JLy00/d3;Ly00/e3;Ljava/lang/String;Ly00/g3;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZLy00/o4;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Ly00/i3;Ly00/j3;Ljava/util/List;Ljava/util/List;Ly00/b8;Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final G()Ljava/util/Map;
    .locals 2

    iget-object v0, p0, Ly00/l3;->X:Ljava/lang/String;

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

    iget-object v0, p0, Ly00/l3;->O:Ljava/lang/String;

    return-object v0
.end method

.method public final O()Lcom/stripe/android/model/StripeIntent$NextActionType;
    .locals 2

    iget-object v0, p0, Ly00/l3;->W:Ly00/b8;

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
    instance-of v1, v0, Ly00/o7;

    if-eqz v1, :cond_6

    sget-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->M:Lcom/stripe/android/model/StripeIntent$NextActionType;

    return-object v0

    :cond_6
    instance-of v1, v0, Ly00/p7;

    if-eqz v1, :cond_7

    sget-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->N:Lcom/stripe/android/model/StripeIntent$NextActionType;

    return-object v0

    :cond_7
    instance-of v1, v0, Ly00/z7;

    if-eqz v1, :cond_8

    sget-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->G:Lcom/stripe/android/model/StripeIntent$NextActionType;

    return-object v0

    :cond_8
    instance-of v1, v0, Ly00/y7;

    if-eqz v1, :cond_9

    sget-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->H:Lcom/stripe/android/model/StripeIntent$NextActionType;

    return-object v0

    :cond_9
    instance-of v1, v0, Ly00/j7;

    if-eqz v1, :cond_a

    sget-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->I:Lcom/stripe/android/model/StripeIntent$NextActionType;

    return-object v0

    :cond_a
    instance-of v1, v0, Ly00/i7;

    if-eqz v1, :cond_b

    sget-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->F:Lcom/stripe/android/model/StripeIntent$NextActionType;

    return-object v0

    :cond_b
    instance-of v1, v0, Ly00/x7;

    if-eqz v1, :cond_c

    sget-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->O:Lcom/stripe/android/model/StripeIntent$NextActionType;

    return-object v0

    :cond_c
    instance-of v1, v0, Ly00/h7;

    if-nez v1, :cond_e

    instance-of v1, v0, Ly00/a8;

    if-nez v1, :cond_e

    if-nez v0, :cond_d

    goto :goto_0

    :cond_d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_e
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final X()Z
    .locals 1

    iget-boolean v0, p0, Ly00/l3;->Y:Z

    return v0
.end method

.method public final Y()Ly00/o4;
    .locals 1

    iget-object v0, p0, Ly00/l3;->N:Ly00/o4;

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Z
    .locals 6

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, -0x1

    iget-object v1, p0, Ly00/l3;->R:Lcom/stripe/android/model/StripeIntent$Usage;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    sget-object v2, Ly00/k3;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    :goto_0
    const-string v2, "setup_future_usage"

    iget-object v3, p0, Ly00/l3;->X:Ljava/lang/String;

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v1, v0, :cond_2

    if-eq v1, v5, :cond_4

    const/4 v0, 0x2

    if-eq v1, v0, :cond_4

    const/4 v0, 0x3

    if-ne v1, v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_1
    if-eqz v3, :cond_3

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    goto :goto_2

    :cond_3
    move v0, v4

    :goto_2
    if-eqz v0, :cond_7

    :cond_4
    if-eqz v3, :cond_6

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_5
    const/4 p1, 0x0

    :goto_3
    const-string v0, "none"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    goto :goto_4

    :cond_6
    move p1, v4

    :goto_4
    if-nez p1, :cond_7

    return v5

    :cond_7
    return v4
.end method

.method public final c()Lcom/stripe/android/model/StripeIntent$Status;
    .locals 1

    iget-object v0, p0, Ly00/l3;->Q:Lcom/stripe/android/model/StripeIntent$Status;

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
    instance-of v1, p1, Ly00/l3;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly00/l3;

    iget-object v1, p0, Ly00/l3;->w:Ljava/lang/String;

    iget-object v3, p1, Ly00/l3;->w:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ly00/l3;->x:Ljava/util/List;

    iget-object v3, p1, Ly00/l3;->x:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ly00/l3;->y:Ljava/lang/Long;

    iget-object v3, p1, Ly00/l3;->y:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Ly00/l3;->z:J

    iget-wide v5, p1, Ly00/l3;->z:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ly00/l3;->E:Ly00/d3;

    iget-object v3, p1, Ly00/l3;->E:Ly00/d3;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Ly00/l3;->F:Ly00/e3;

    iget-object v3, p1, Ly00/l3;->F:Ly00/e3;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Ly00/l3;->G:Ljava/lang/String;

    iget-object v3, p1, Ly00/l3;->G:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Ly00/l3;->H:Ly00/g3;

    iget-object v3, p1, Ly00/l3;->H:Ly00/g3;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Ly00/l3;->I:Ljava/lang/String;

    iget-object v3, p1, Ly00/l3;->I:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-wide v3, p0, Ly00/l3;->J:J

    iget-wide v5, p1, Ly00/l3;->J:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Ly00/l3;->K:Ljava/lang/String;

    iget-object v3, p1, Ly00/l3;->K:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Ly00/l3;->L:Ljava/lang/String;

    iget-object v3, p1, Ly00/l3;->L:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-boolean v1, p0, Ly00/l3;->M:Z

    iget-boolean v3, p1, Ly00/l3;->M:Z

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Ly00/l3;->N:Ly00/o4;

    iget-object v3, p1, Ly00/l3;->N:Ly00/o4;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Ly00/l3;->O:Ljava/lang/String;

    iget-object v3, p1, Ly00/l3;->O:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Ly00/l3;->P:Ljava/lang/String;

    iget-object v3, p1, Ly00/l3;->P:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Ly00/l3;->Q:Lcom/stripe/android/model/StripeIntent$Status;

    iget-object v3, p1, Ly00/l3;->Q:Lcom/stripe/android/model/StripeIntent$Status;

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Ly00/l3;->R:Lcom/stripe/android/model/StripeIntent$Usage;

    iget-object v3, p1, Ly00/l3;->R:Lcom/stripe/android/model/StripeIntent$Usage;

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Ly00/l3;->S:Ly00/i3;

    iget-object v3, p1, Ly00/l3;->S:Ly00/i3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Ly00/l3;->T:Ly00/j3;

    iget-object v3, p1, Ly00/l3;->T:Ly00/j3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Ly00/l3;->U:Ljava/util/List;

    iget-object v3, p1, Ly00/l3;->U:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Ly00/l3;->V:Ljava/util/List;

    iget-object v3, p1, Ly00/l3;->V:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Ly00/l3;->W:Ly00/b8;

    iget-object v3, p1, Ly00/l3;->W:Ly00/b8;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Ly00/l3;->X:Ljava/lang/String;

    iget-object v3, p1, Ly00/l3;->X:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-boolean v1, p0, Ly00/l3;->Y:Z

    iget-boolean p1, p1, Ly00/l3;->Y:Z

    if-eq v1, p1, :cond_1a

    return v2

    :cond_1a
    return v0
.end method

.method public final g0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Ly00/l3;->U:Ljava/util/List;

    return-object v0
.end method

.method public final getClientSecret()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly00/l3;->G:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly00/l3;->w:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 5

    const/4 v0, 0x0

    iget-object v1, p0, Ly00/l3;->w:Ljava/lang/String;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/l3;->x:Ljava/util/List;

    invoke-static {v1, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v1

    iget-object v3, p0, Ly00/l3;->y:Ljava/lang/Long;

    if-nez v3, :cond_1

    move v3, v0

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-wide v3, p0, Ly00/l3;->z:J

    invoke-static {v1, v3, v4, v2}, Ld;->e(IJI)I

    move-result v1

    iget-object v3, p0, Ly00/l3;->E:Ly00/d3;

    if-nez v3, :cond_2

    move v3, v0

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/l3;->F:Ly00/e3;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v1

    mul-int/2addr v3, v2

    iget-object v1, p0, Ly00/l3;->G:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v0

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v3, v1

    mul-int/2addr v3, v2

    iget-object v1, p0, Ly00/l3;->H:Ly00/g3;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/l3;->I:Ljava/lang/String;

    if-nez v3, :cond_4

    move v3, v0

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-wide v3, p0, Ly00/l3;->J:J

    invoke-static {v1, v3, v4, v2}, Ld;->e(IJI)I

    move-result v1

    iget-object v3, p0, Ly00/l3;->K:Ljava/lang/String;

    if-nez v3, :cond_5

    move v3, v0

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/l3;->L:Ljava/lang/String;

    if-nez v3, :cond_6

    move v3, v0

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-boolean v3, p0, Ly00/l3;->M:Z

    invoke-static {v1, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v1

    iget-object v3, p0, Ly00/l3;->N:Ly00/o4;

    if-nez v3, :cond_7

    move v3, v0

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Ly00/o4;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/l3;->O:Ljava/lang/String;

    if-nez v3, :cond_8

    move v3, v0

    goto :goto_8

    :cond_8
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/l3;->P:Ljava/lang/String;

    if-nez v3, :cond_9

    move v3, v0

    goto :goto_9

    :cond_9
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_9
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/l3;->Q:Lcom/stripe/android/model/StripeIntent$Status;

    if-nez v3, :cond_a

    move v3, v0

    goto :goto_a

    :cond_a
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_a
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/l3;->R:Lcom/stripe/android/model/StripeIntent$Usage;

    if-nez v3, :cond_b

    move v3, v0

    goto :goto_b

    :cond_b
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_b
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/l3;->S:Ly00/i3;

    if-nez v3, :cond_c

    move v3, v0

    goto :goto_c

    :cond_c
    invoke-virtual {v3}, Ly00/i3;->hashCode()I

    move-result v3

    :goto_c
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/l3;->T:Ly00/j3;

    if-nez v3, :cond_d

    move v3, v0

    goto :goto_d

    :cond_d
    invoke-virtual {v3}, Ly00/j3;->hashCode()I

    move-result v3

    :goto_d
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/l3;->U:Ljava/util/List;

    invoke-static {v1, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v1

    iget-object v3, p0, Ly00/l3;->V:Ljava/util/List;

    invoke-static {v1, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v1

    iget-object v3, p0, Ly00/l3;->W:Ly00/b8;

    if-nez v3, :cond_e

    move v3, v0

    goto :goto_e

    :cond_e
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_e
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/l3;->X:Ljava/lang/String;

    if-nez v3, :cond_f

    goto :goto_f

    :cond_f
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_f
    add-int/2addr v1, v0

    mul-int/2addr v1, v2

    iget-boolean v0, p0, Ly00/l3;->Y:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final i0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Ly00/l3;->V:Ljava/util/List;

    return-object v0
.end method

.method public final j0()Z
    .locals 3

    sget-object v0, Lcom/stripe/android/model/StripeIntent$Status;->z:Lcom/stripe/android/model/StripeIntent$Status;

    sget-object v1, Lcom/stripe/android/model/StripeIntent$Status;->H:Lcom/stripe/android/model/StripeIntent$Status;

    sget-object v2, Lcom/stripe/android/model/StripeIntent$Status;->G:Lcom/stripe/android/model/StripeIntent$Status;

    filled-new-array {v0, v1, v2}, [Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, Ly00/l3;->Q:Lcom/stripe/android/model/StripeIntent$Status;

    invoke-static {v0, v1}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final m()Ly00/b8;
    .locals 1

    iget-object v0, p0, Ly00/l3;->W:Ly00/b8;

    return-object v0
.end method

.method public final p()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Ly00/l3;->x:Ljava/util/List;

    return-object v0
.end method

.method public final q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly00/l3;->I:Ljava/lang/String;

    return-object v0
.end method

.method public final q0()Z
    .locals 1

    iget-boolean v0, p0, Ly00/l3;->M:Z

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", paymentMethodTypes="

    const-string v1, ", amount="

    const-string v2, "PaymentIntent(id="

    iget-object v3, p0, Ly00/l3;->w:Ljava/lang/String;

    iget-object v4, p0, Ly00/l3;->x:Ljava/util/List;

    invoke-static {v2, v3, v0, v1, v4}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ly00/l3;->y:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", canceledAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ly00/l3;->z:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", cancellationReason="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/l3;->E:Ly00/d3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", captureMethod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/l3;->F:Ly00/e3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", clientSecret="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/l3;->G:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", confirmationMethod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/l3;->H:Ly00/g3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", countryCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/l3;->I:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", created="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ly00/l3;->J:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", currency="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/l3;->K:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/l3;->L:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isLiveMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ly00/l3;->M:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", paymentMethod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/l3;->N:Ly00/o4;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentMethodId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/l3;->O:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", receiptEmail="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/l3;->P:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/l3;->Q:Lcom/stripe/android/model/StripeIntent$Status;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", setupFutureUsage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/l3;->R:Lcom/stripe/android/model/StripeIntent$Usage;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lastPaymentError="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/l3;->S:Ly00/i3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shipping="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/l3;->T:Ly00/j3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", unactivatedPaymentMethods="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/l3;->U:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", linkFundingSources="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/l3;->V:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", nextActionData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/l3;->W:Ly00/b8;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentMethodOptionsJsonString="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ly00/l3;->X:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", automaticPaymentMethodsEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ly00/l3;->Y:Z

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

    iget-object v0, p0, Ly00/l3;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Ly00/l3;->x:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Ly00/l3;->y:Ljava/lang/Long;

    if-nez v2, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    :goto_0
    iget-wide v2, p0, Ly00/l3;->z:J

    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    iget-object v2, p0, Ly00/l3;->E:Ly00/d3;

    if-nez v2, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_1
    iget-object v2, p0, Ly00/l3;->F:Ly00/e3;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/l3;->G:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/l3;->H:Ly00/g3;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/l3;->I:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-wide v2, p0, Ly00/l3;->J:J

    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    iget-object v2, p0, Ly00/l3;->K:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/l3;->L:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v2, p0, Ly00/l3;->M:Z

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v2, p0, Ly00/l3;->N:Ly00/o4;

    if-nez v2, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/o4;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_2
    iget-object v2, p0, Ly00/l3;->O:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/l3;->P:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/l3;->Q:Lcom/stripe/android/model/StripeIntent$Status;

    if-nez v2, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_3
    iget-object v2, p0, Ly00/l3;->R:Lcom/stripe/android/model/StripeIntent$Usage;

    if-nez v2, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_4
    iget-object v2, p0, Ly00/l3;->S:Ly00/i3;

    if-nez v2, :cond_5

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/i3;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_5
    iget-object v2, p0, Ly00/l3;->T:Ly00/j3;

    if-nez v2, :cond_6

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_6

    :cond_6
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/j3;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_6
    iget-object v0, p0, Ly00/l3;->U:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object v0, p0, Ly00/l3;->V:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object v0, p0, Ly00/l3;->W:Ly00/b8;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Ly00/l3;->X:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Ly00/l3;->Y:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method public final z()Z
    .locals 2

    iget-object v0, p0, Ly00/l3;->Q:Lcom/stripe/android/model/StripeIntent$Status;

    sget-object v1, Lcom/stripe/android/model/StripeIntent$Status;->E:Lcom/stripe/android/model/StripeIntent$Status;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
