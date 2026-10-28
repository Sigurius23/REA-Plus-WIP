.class public final Ltp/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ltp/a0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Ltp/a0;->a:I

    packed-switch v2, :pswitch_data_0

    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v2, :cond_2

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v6, v5

    const/4 v7, 0x1

    if-eq v6, v7, :cond_1

    const/4 v7, 0x2

    if-eq v6, v7, :cond_0

    invoke-static {v1, v5}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    invoke-static {v1, v5}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v4

    goto :goto_0

    :cond_1
    invoke-static {v1, v5}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v3

    goto :goto_0

    :cond_2
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Ltp/f;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput v3, v1, Ltp/f;->w:I

    iput v4, v1, Ltp/f;->x:I

    return-object v1

    :pswitch_0
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move-object v4, v3

    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v2, :cond_5

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v6, v5

    const/4 v7, 0x1

    if-eq v6, v7, :cond_4

    const/4 v7, 0x2

    if-eq v6, v7, :cond_3

    invoke-static {v1, v5}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_1

    :cond_3
    invoke-static {v1, v5}, Lvo/b;->c(Landroid/os/Parcel;I)Landroid/os/Bundle;

    move-result-object v4

    goto :goto_1

    :cond_4
    sget-object v3, Ltp/c;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v5, v3}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v3

    goto :goto_1

    :cond_5
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Ltp/e;

    invoke-direct {v1, v3, v4}, Ltp/e;-><init>(Ljava/util/ArrayList;Landroid/os/Bundle;)V

    return-object v1

    :pswitch_1
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v7

    if-ge v7, v2, :cond_a

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    int-to-char v8, v7

    const/4 v9, 0x1

    if-eq v8, v9, :cond_9

    const/4 v9, 0x2

    if-eq v8, v9, :cond_8

    const/4 v9, 0x3

    if-eq v8, v9, :cond_7

    const/4 v9, 0x4

    if-eq v8, v9, :cond_6

    invoke-static {v1, v7}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_2

    :cond_6
    invoke-static {v1, v7}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    :cond_7
    sget-object v5, Luo/d;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v7, v5}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v5

    goto :goto_2

    :cond_8
    invoke-static {v1, v7}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_9
    sget-object v3, Ltp/b;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v7, v3}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v3

    goto :goto_2

    :cond_a
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Ltp/d;

    invoke-direct {v1, v3, v4, v5, v6}, Ltp/d;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V

    return-object v1

    :pswitch_2
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-wide v5, v4

    move v4, v3

    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v7

    if-ge v7, v2, :cond_e

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    int-to-char v8, v7

    const/4 v9, 0x1

    if-eq v8, v9, :cond_d

    const/4 v9, 0x2

    if-eq v8, v9, :cond_c

    const/4 v9, 0x3

    if-eq v8, v9, :cond_b

    invoke-static {v1, v7}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_3

    :cond_b
    invoke-static {v1, v7}, Lvo/b;->A(Landroid/os/Parcel;I)J

    move-result-wide v5

    goto :goto_3

    :cond_c
    invoke-static {v1, v7}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v4

    goto :goto_3

    :cond_d
    invoke-static {v1, v7}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v3

    goto :goto_3

    :cond_e
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Ltp/c;

    invoke-direct {v1, v3, v5, v6, v4}, Ltp/c;-><init>(IJI)V

    return-object v1

    :pswitch_3
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v2, :cond_11

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v6, v5

    const/4 v7, 0x1

    if-eq v6, v7, :cond_10

    const/4 v7, 0x2

    if-eq v6, v7, :cond_f

    invoke-static {v1, v5}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_4

    :cond_f
    invoke-static {v1, v5}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v4

    goto :goto_4

    :cond_10
    invoke-static {v1, v5}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v3

    goto :goto_4

    :cond_11
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Ltp/b;

    invoke-direct {v1, v3, v4}, Ltp/b;-><init>(II)V

    return-object v1

    :pswitch_4
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move-object v7, v3

    move-wide v8, v4

    move-wide v10, v8

    move v12, v6

    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v13

    const/4 v14, 0x1

    if-ge v13, v2, :cond_17

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v13

    int-to-char v15, v13

    if-eq v15, v14, :cond_16

    const/4 v14, 0x2

    if-eq v15, v14, :cond_15

    const/4 v14, 0x3

    if-eq v15, v14, :cond_14

    const/4 v14, 0x4

    if-eq v15, v14, :cond_13

    const/4 v14, 0x5

    if-eq v15, v14, :cond_12

    invoke-static {v1, v13}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_5

    :cond_12
    invoke-static {v1, v13}, Lvo/b;->c(Landroid/os/Parcel;I)Landroid/os/Bundle;

    move-result-object v7

    goto :goto_5

    :cond_13
    invoke-static {v1, v13}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v12

    goto :goto_5

    :cond_14
    invoke-static {v1, v13}, Lvo/b;->A(Landroid/os/Parcel;I)J

    move-result-wide v10

    goto :goto_5

    :cond_15
    invoke-static {v1, v13}, Lvo/b;->A(Landroid/os/Parcel;I)J

    move-result-wide v8

    goto :goto_5

    :cond_16
    sget-object v3, Ltp/f;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v13, v3}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v3

    goto :goto_5

    :cond_17
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lcom/google/android/gms/location/ActivityRecognitionResult;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    if-eqz v3, :cond_18

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_18

    move v2, v14

    goto :goto_6

    :cond_18
    move v2, v6

    :goto_6
    const-string v13, "Must have at least 1 detected activity"

    invoke-static {v2, v13}, Luo/w;->b(ZLjava/lang/String;)V

    cmp-long v2, v8, v4

    if-lez v2, :cond_19

    cmp-long v2, v10, v4

    if-lez v2, :cond_19

    move v6, v14

    :cond_19
    const-string v2, "Must set times"

    invoke-static {v6, v2}, Luo/w;->b(ZLjava/lang/String;)V

    iput-object v3, v1, Lcom/google/android/gms/location/ActivityRecognitionResult;->w:Ljava/util/ArrayList;

    iput-wide v8, v1, Lcom/google/android/gms/location/ActivityRecognitionResult;->x:J

    iput-wide v10, v1, Lcom/google/android/gms/location/ActivityRecognitionResult;->y:J

    iput v12, v1, Lcom/google/android/gms/location/ActivityRecognitionResult;->z:I

    iput-object v7, v1, Lcom/google/android/gms/location/ActivityRecognitionResult;->E:Landroid/os/Bundle;

    return-object v1

    :pswitch_5
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    move v6, v5

    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v7

    if-ge v7, v2, :cond_1e

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    int-to-char v8, v7

    const/4 v9, 0x1

    if-eq v8, v9, :cond_1d

    const/4 v9, 0x2

    if-eq v8, v9, :cond_1c

    const/4 v9, 0x3

    if-eq v8, v9, :cond_1b

    const/4 v9, 0x4

    if-eq v8, v9, :cond_1a

    invoke-static {v1, v7}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_7

    :cond_1a
    invoke-static {v1, v7}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v6

    goto :goto_7

    :cond_1b
    invoke-static {v1, v7}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v5

    goto :goto_7

    :cond_1c
    invoke-static {v1, v7}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v4

    goto :goto_7

    :cond_1d
    invoke-static {v1, v7}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v3

    goto :goto_7

    :cond_1e
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Ltp/e0;

    invoke-direct {v1, v3, v4, v5, v6}, Ltp/e0;-><init>(IIII)V

    return-object v1

    :pswitch_6
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v2, :cond_21

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v6, v5

    const/4 v7, 0x1

    if-eq v6, v7, :cond_20

    const/4 v7, 0x2

    if-eq v6, v7, :cond_1f

    invoke-static {v1, v5}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_8

    :cond_1f
    invoke-static {v1, v5}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v4

    goto :goto_8

    :cond_20
    sget-object v3, Ltp/e0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v5, v3}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v3

    goto :goto_8

    :cond_21
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Ltp/n;

    invoke-direct {v1, v3, v4}, Ltp/n;-><init>(Ljava/util/ArrayList;I)V

    return-object v1

    :pswitch_7
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x1

    const-wide/16 v4, -0x1

    move v7, v3

    move v8, v7

    move-wide v9, v4

    move-wide v11, v9

    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_26

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    if-eq v5, v3, :cond_25

    const/4 v6, 0x2

    if-eq v5, v6, :cond_24

    const/4 v6, 0x3

    if-eq v5, v6, :cond_23

    const/4 v6, 0x4

    if-eq v5, v6, :cond_22

    invoke-static {v1, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_9

    :cond_22
    invoke-static {v1, v4}, Lvo/b;->A(Landroid/os/Parcel;I)J

    move-result-wide v4

    move-wide v11, v4

    goto :goto_9

    :cond_23
    invoke-static {v1, v4}, Lvo/b;->A(Landroid/os/Parcel;I)J

    move-result-wide v4

    move-wide v9, v4

    goto :goto_9

    :cond_24
    invoke-static {v1, v4}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v8

    goto :goto_9

    :cond_25
    invoke-static {v1, v4}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v7

    goto :goto_9

    :cond_26
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v6, Ltp/d0;

    invoke-direct/range {v6 .. v12}, Ltp/d0;-><init>(IIJJ)V

    return-object v6

    :pswitch_8
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move v5, v3

    move v6, v5

    move v7, v6

    move v8, v7

    move v9, v8

    move v10, v9

    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_27

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    packed-switch v4, :pswitch_data_1

    invoke-static {v1, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_a

    :pswitch_9
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v3

    move v10, v3

    goto :goto_a

    :pswitch_a
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v3

    move v9, v3

    goto :goto_a

    :pswitch_b
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v3

    move v8, v3

    goto :goto_a

    :pswitch_c
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v3

    move v7, v3

    goto :goto_a

    :pswitch_d
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v3

    move v6, v3

    goto :goto_a

    :pswitch_e
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v3

    move v5, v3

    goto :goto_a

    :cond_27
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v4, Ltp/m;

    invoke-direct/range {v4 .. v10}, Ltp/m;-><init>(ZZZZZZ)V

    return-object v4

    :pswitch_f
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move-object v4, v3

    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v2, :cond_2a

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v6, v5

    const/4 v7, 0x1

    if-eq v6, v7, :cond_29

    const/4 v7, 0x2

    if-eq v6, v7, :cond_28

    invoke-static {v1, v5}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_b

    :cond_28
    sget-object v4, Ltp/m;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v5, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Ltp/m;

    goto :goto_b

    :cond_29
    sget-object v3, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v5, v3}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/common/api/Status;

    goto :goto_b

    :cond_2a
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Ltp/l;

    invoke-direct {v1, v3, v4}, Ltp/l;-><init>(Lcom/google/android/gms/common/api/Status;Ltp/m;)V

    return-object v1

    :pswitch_10
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v5, v4

    move v6, v5

    move-object v4, v3

    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v7

    if-ge v7, v2, :cond_2f

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    int-to-char v8, v7

    const/4 v9, 0x1

    if-eq v8, v9, :cond_2e

    const/4 v9, 0x2

    if-eq v8, v9, :cond_2d

    const/4 v9, 0x3

    if-eq v8, v9, :cond_2c

    const/4 v9, 0x5

    if-eq v8, v9, :cond_2b

    invoke-static {v1, v7}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_c

    :cond_2b
    sget-object v4, Ltp/c0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v7, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Ltp/c0;

    goto :goto_c

    :cond_2c
    invoke-static {v1, v7}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v6

    goto :goto_c

    :cond_2d
    invoke-static {v1, v7}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v5

    goto :goto_c

    :cond_2e
    sget-object v3, Lcom/google/android/gms/location/LocationRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v7, v3}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v3

    goto :goto_c

    :cond_2f
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Ltp/j;

    invoke-direct {v1, v3, v5, v6, v4}, Ltp/j;-><init>(Ljava/util/ArrayList;ZZLtp/c0;)V

    return-object v1

    :pswitch_11
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const-string v3, ""

    move-object v4, v3

    move-object v5, v4

    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v6

    if-ge v6, v2, :cond_33

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    int-to-char v7, v6

    const/4 v8, 0x1

    if-eq v7, v8, :cond_32

    const/4 v8, 0x2

    if-eq v7, v8, :cond_31

    const/4 v8, 0x5

    if-eq v7, v8, :cond_30

    invoke-static {v1, v6}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_d

    :cond_30
    invoke-static {v1, v6}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_d

    :cond_31
    invoke-static {v1, v6}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v5

    goto :goto_d

    :cond_32
    invoke-static {v1, v6}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v4

    goto :goto_d

    :cond_33
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Ltp/c0;

    invoke-direct {v1, v3, v4, v5}, Ltp/c0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :pswitch_12
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    sget-object v3, Lcom/google/android/gms/location/LocationResult;->x:Ljava/util/List;

    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_35

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    const/4 v6, 0x1

    if-eq v5, v6, :cond_34

    invoke-static {v1, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_e

    :cond_34
    sget-object v3, Landroid/location/Location;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v4, v3}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v3

    goto :goto_e

    :cond_35
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lcom/google/android/gms/location/LocationResult;

    invoke-direct {v1, v3}, Lcom/google/android/gms/location/LocationResult;-><init>(Ljava/util/List;)V

    return-object v1

    :pswitch_13
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/16 v3, 0x66

    const-wide/32 v4, 0x36ee80

    const-wide/32 v6, 0x927c0

    const/4 v8, 0x0

    const-wide v9, 0x7fffffffffffffffL

    const v11, 0x7fffffff

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    move-wide v14, v13

    move v13, v12

    move v12, v11

    move-wide v10, v9

    move v9, v8

    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v0

    if-ge v0, v2, :cond_36

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    move/from16 v16, v9

    int-to-char v9, v0

    packed-switch v9, :pswitch_data_2

    invoke-static {v1, v0}, Lvo/b;->E(Landroid/os/Parcel;I)V

    :goto_10
    move/from16 v9, v16

    goto :goto_f

    :pswitch_14
    invoke-static {v1, v0}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v0

    move v9, v0

    goto :goto_f

    :pswitch_15
    invoke-static {v1, v0}, Lvo/b;->A(Landroid/os/Parcel;I)J

    move-result-wide v14

    goto :goto_10

    :pswitch_16
    invoke-static {v1, v0}, Lvo/b;->v(Landroid/os/Parcel;I)F

    move-result v0

    move v13, v0

    goto :goto_10

    :pswitch_17
    invoke-static {v1, v0}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v0

    move v12, v0

    goto :goto_10

    :pswitch_18
    invoke-static {v1, v0}, Lvo/b;->A(Landroid/os/Parcel;I)J

    move-result-wide v9

    move-wide v10, v9

    goto :goto_10

    :pswitch_19
    invoke-static {v1, v0}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v0

    move v8, v0

    goto :goto_10

    :pswitch_1a
    invoke-static {v1, v0}, Lvo/b;->A(Landroid/os/Parcel;I)J

    move-result-wide v6

    goto :goto_10

    :pswitch_1b
    invoke-static {v1, v0}, Lvo/b;->A(Landroid/os/Parcel;I)J

    move-result-wide v4

    goto :goto_10

    :pswitch_1c
    invoke-static {v1, v0}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v0

    move v3, v0

    goto :goto_10

    :cond_36
    move/from16 v16, v9

    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lcom/google/android/gms/location/LocationRequest;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput v3, v0, Lcom/google/android/gms/location/LocationRequest;->w:I

    iput-wide v4, v0, Lcom/google/android/gms/location/LocationRequest;->x:J

    iput-wide v6, v0, Lcom/google/android/gms/location/LocationRequest;->y:J

    iput-boolean v8, v0, Lcom/google/android/gms/location/LocationRequest;->z:Z

    iput-wide v10, v0, Lcom/google/android/gms/location/LocationRequest;->E:J

    iput v12, v0, Lcom/google/android/gms/location/LocationRequest;->F:I

    iput v13, v0, Lcom/google/android/gms/location/LocationRequest;->G:F

    iput-wide v14, v0, Lcom/google/android/gms/location/LocationRequest;->H:J

    move/from16 v8, v16

    iput-boolean v8, v0, Lcom/google/android/gms/location/LocationRequest;->I:Z

    return-object v0

    :pswitch_1d
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v0

    const/16 v2, 0x3e8

    const/4 v3, 0x1

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move v7, v3

    move v8, v7

    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v9

    if-ge v9, v0, :cond_3c

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v9

    int-to-char v10, v9

    if-eq v10, v3, :cond_3b

    const/4 v11, 0x2

    if-eq v10, v11, :cond_3a

    const/4 v11, 0x3

    if-eq v10, v11, :cond_39

    const/4 v11, 0x4

    if-eq v10, v11, :cond_38

    const/4 v11, 0x5

    if-eq v10, v11, :cond_37

    invoke-static {v1, v9}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_11

    :cond_37
    sget-object v6, Ltp/d0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v9, v6}, Lvo/b;->k(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Ltp/d0;

    goto :goto_11

    :cond_38
    invoke-static {v1, v9}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v2

    goto :goto_11

    :cond_39
    invoke-static {v1, v9}, Lvo/b;->A(Landroid/os/Parcel;I)J

    move-result-wide v4

    goto :goto_11

    :cond_3a
    invoke-static {v1, v9}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v8

    goto :goto_11

    :cond_3b
    invoke-static {v1, v9}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v7

    goto :goto_11

    :cond_3c
    invoke-static {v1, v0}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v0, Lcom/google/android/gms/location/LocationAvailability;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput v2, v0, Lcom/google/android/gms/location/LocationAvailability;->z:I

    iput v7, v0, Lcom/google/android/gms/location/LocationAvailability;->w:I

    iput v8, v0, Lcom/google/android/gms/location/LocationAvailability;->x:I

    iput-wide v4, v0, Lcom/google/android/gms/location/LocationAvailability;->y:J

    iput-object v6, v0, Lcom/google/android/gms/location/LocationAvailability;->E:[Ltp/d0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1d
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
    .end packed-switch
.end method

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ltp/a0;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Ltp/f;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Ltp/e;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Ltp/d;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Ltp/c;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Ltp/b;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Lcom/google/android/gms/location/ActivityRecognitionResult;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Ltp/e0;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Ltp/n;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Ltp/d0;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Ltp/m;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Ltp/l;

    return-object p1

    :pswitch_a
    new-array p1, p1, [Ltp/j;

    return-object p1

    :pswitch_b
    new-array p1, p1, [Ltp/c0;

    return-object p1

    :pswitch_c
    new-array p1, p1, [Lcom/google/android/gms/location/LocationResult;

    return-object p1

    :pswitch_d
    new-array p1, p1, [Lcom/google/android/gms/location/LocationRequest;

    return-object p1

    :pswitch_e
    new-array p1, p1, [Lcom/google/android/gms/location/LocationAvailability;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
