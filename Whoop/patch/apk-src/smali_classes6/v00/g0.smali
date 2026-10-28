.class public final Lv00/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lv00/g0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lv00/g0;->a:I

    packed-switch v2, :pswitch_data_0

    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lwx/d;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lwx/d;-><init>(Ljava/lang/String;)V

    return-object v2

    :pswitch_0
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lwx/c;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    invoke-direct {v2, v1}, Lwx/c;-><init>(Ljava/lang/Throwable;)V

    return-object v2

    :pswitch_1
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_1

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    const/4 v6, 0x2

    if-eq v5, v6, :cond_0

    invoke-static {v1, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    invoke-static {v1, v4}, Lvo/b;->x(Landroid/os/Parcel;I)Landroid/os/IBinder;

    move-result-object v3

    goto :goto_0

    :cond_1
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lwp/n;

    invoke-direct {v1, v3}, Lwp/n;-><init>(Landroid/os/IBinder;)V

    return-object v1

    :pswitch_2
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v7, v3

    move-object v14, v7

    move-object v15, v14

    move-object/from16 v17, v15

    move-object/from16 v18, v17

    move v9, v4

    move v11, v9

    move v12, v11

    move v13, v12

    move/from16 v16, v13

    move v8, v5

    move v10, v8

    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_2

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    packed-switch v4, :pswitch_data_1

    invoke-static {v1, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_1

    :pswitch_3
    sget-object v4, Lwp/p;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v18

    goto :goto_1

    :pswitch_4
    sget-object v4, Lwp/j;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v17

    goto :goto_1

    :pswitch_5
    invoke-static {v1, v3}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v16

    goto :goto_1

    :pswitch_6
    sget-object v4, Lwp/d;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v15, v3

    check-cast v15, Lwp/d;

    goto :goto_1

    :pswitch_7
    sget-object v4, Lwp/d;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Lwp/d;

    goto :goto_1

    :pswitch_8
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v13

    goto :goto_1

    :pswitch_9
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v12

    goto :goto_1

    :pswitch_a
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v11

    goto :goto_1

    :pswitch_b
    invoke-static {v1, v3}, Lvo/b;->v(Landroid/os/Parcel;I)F

    move-result v10

    goto :goto_1

    :pswitch_c
    invoke-static {v1, v3}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v9

    goto :goto_1

    :pswitch_d
    invoke-static {v1, v3}, Lvo/b;->v(Landroid/os/Parcel;I)F

    move-result v8

    goto :goto_1

    :pswitch_e
    sget-object v4, Lcom/google/android/gms/maps/model/LatLng;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v7

    goto :goto_1

    :cond_2
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v6, Lwp/m;

    invoke-direct/range {v6 .. v18}, Lwp/m;-><init>(Ljava/util/ArrayList;FIFZZZLwp/d;Lwp/d;ILjava/util/ArrayList;Ljava/util/ArrayList;)V

    return-object v6

    :pswitch_f
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move-object v4, v3

    move-object v5, v4

    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v6

    if-ge v6, v2, :cond_6

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    int-to-char v7, v6

    const/4 v8, 0x2

    if-eq v7, v8, :cond_5

    const/4 v8, 0x3

    if-eq v7, v8, :cond_4

    const/4 v8, 0x4

    if-eq v7, v8, :cond_3

    invoke-static {v1, v6}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_2

    :cond_3
    invoke-static {v1, v6}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :cond_4
    invoke-static {v1, v6}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_5
    sget-object v3, Lcom/google/android/gms/maps/model/LatLng;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v6, v3}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/maps/model/LatLng;

    goto :goto_2

    :cond_6
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lwp/k;

    invoke-direct {v1, v3, v4, v5}, Lwp/k;-><init>(Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :pswitch_10
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v2, :cond_9

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v6, v5

    const/4 v7, 0x2

    if-eq v6, v7, :cond_8

    const/4 v7, 0x3

    if-eq v6, v7, :cond_7

    invoke-static {v1, v5}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_3

    :cond_7
    invoke-static {v1, v5}, Lvo/b;->w(Landroid/os/Parcel;I)Ljava/lang/Float;

    move-result-object v3

    goto :goto_3

    :cond_8
    invoke-static {v1, v5}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v4

    goto :goto_3

    :cond_9
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lwp/j;

    invoke-direct {v1, v4, v3}, Lwp/j;-><init>(ILjava/lang/Float;)V

    return-object v1

    :pswitch_11
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    const/high16 v7, 0x3f000000    # 0.5f

    move v14, v5

    move v15, v14

    move/from16 v19, v15

    move/from16 v25, v19

    move/from16 v26, v25

    move/from16 v23, v6

    move/from16 v21, v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_a

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v3, v4

    packed-switch v3, :pswitch_data_2

    :pswitch_12
    invoke-static {v1, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_4

    :pswitch_13
    invoke-static {v1, v4}, Lvo/b;->v(Landroid/os/Parcel;I)F

    move-result v28

    goto :goto_4

    :pswitch_14
    invoke-static {v1, v4}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v27

    goto :goto_4

    :pswitch_15
    invoke-static {v1, v4}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v26

    goto :goto_4

    :pswitch_16
    invoke-static {v1, v4}, Lvo/b;->x(Landroid/os/Parcel;I)Landroid/os/IBinder;

    move-result-object v16

    goto :goto_4

    :pswitch_17
    invoke-static {v1, v4}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v25

    goto :goto_4

    :pswitch_18
    invoke-static {v1, v4}, Lvo/b;->v(Landroid/os/Parcel;I)F

    move-result v24

    goto :goto_4

    :pswitch_19
    invoke-static {v1, v4}, Lvo/b;->v(Landroid/os/Parcel;I)F

    move-result v23

    goto :goto_4

    :pswitch_1a
    invoke-static {v1, v4}, Lvo/b;->v(Landroid/os/Parcel;I)F

    move-result v22

    goto :goto_4

    :pswitch_1b
    invoke-static {v1, v4}, Lvo/b;->v(Landroid/os/Parcel;I)F

    move-result v21

    goto :goto_4

    :pswitch_1c
    invoke-static {v1, v4}, Lvo/b;->v(Landroid/os/Parcel;I)F

    move-result v20

    goto :goto_4

    :pswitch_1d
    invoke-static {v1, v4}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v19

    goto :goto_4

    :pswitch_1e
    invoke-static {v1, v4}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v15

    goto :goto_4

    :pswitch_1f
    invoke-static {v1, v4}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v14

    goto :goto_4

    :pswitch_20
    invoke-static {v1, v4}, Lvo/b;->v(Landroid/os/Parcel;I)F

    move-result v13

    goto :goto_4

    :pswitch_21
    invoke-static {v1, v4}, Lvo/b;->v(Landroid/os/Parcel;I)F

    move-result v12

    goto :goto_4

    :pswitch_22
    invoke-static {v1, v4}, Lvo/b;->x(Landroid/os/Parcel;I)Landroid/os/IBinder;

    move-result-object v11

    goto :goto_4

    :pswitch_23
    invoke-static {v1, v4}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v10

    goto :goto_4

    :pswitch_24
    invoke-static {v1, v4}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v9

    goto :goto_4

    :pswitch_25
    sget-object v3, Lcom/google/android/gms/maps/model/LatLng;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v4, v3}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Lcom/google/android/gms/maps/model/LatLng;

    goto :goto_4

    :cond_a
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lwp/i;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput v7, v1, Lwp/i;->E:F

    iput v6, v1, Lwp/i;->F:F

    const/4 v2, 0x1

    iput-boolean v2, v1, Lwp/i;->H:Z

    iput-boolean v5, v1, Lwp/i;->I:Z

    const/4 v2, 0x0

    iput v2, v1, Lwp/i;->J:F

    iput v7, v1, Lwp/i;->K:F

    iput v2, v1, Lwp/i;->L:F

    iput v6, v1, Lwp/i;->M:F

    iput v5, v1, Lwp/i;->O:I

    iput-object v8, v1, Lwp/i;->w:Lcom/google/android/gms/maps/model/LatLng;

    iput-object v9, v1, Lwp/i;->x:Ljava/lang/String;

    iput-object v10, v1, Lwp/i;->y:Ljava/lang/String;

    if-nez v11, :cond_b

    const/4 v2, 0x0

    iput-object v2, v1, Lwp/i;->z:Lwp/b;

    goto :goto_5

    :cond_b
    const/4 v2, 0x0

    new-instance v3, Lwp/b;

    invoke-static {v11}, Lcp/b;->X(Landroid/os/IBinder;)Lcp/a;

    move-result-object v4

    invoke-direct {v3, v4}, Lwp/b;-><init>(Lcp/a;)V

    iput-object v3, v1, Lwp/i;->z:Lwp/b;

    :goto_5
    iput v12, v1, Lwp/i;->E:F

    iput v13, v1, Lwp/i;->F:F

    iput-boolean v14, v1, Lwp/i;->G:Z

    iput-boolean v15, v1, Lwp/i;->H:Z

    move/from16 v5, v19

    iput-boolean v5, v1, Lwp/i;->I:Z

    move/from16 v3, v20

    iput v3, v1, Lwp/i;->J:F

    move/from16 v7, v21

    iput v7, v1, Lwp/i;->K:F

    move/from16 v3, v22

    iput v3, v1, Lwp/i;->L:F

    move/from16 v6, v23

    iput v6, v1, Lwp/i;->M:F

    move/from16 v3, v24

    iput v3, v1, Lwp/i;->N:F

    move/from16 v5, v26

    iput v5, v1, Lwp/i;->Q:I

    move/from16 v5, v25

    iput v5, v1, Lwp/i;->O:I

    invoke-static/range {v16 .. v16}, Lcp/b;->X(Landroid/os/IBinder;)Lcp/a;

    move-result-object v3

    if-nez v3, :cond_c

    move-object v4, v2

    goto :goto_6

    :cond_c
    invoke-static {v3}, Lcp/b;->c0(Lcp/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Landroid/view/View;

    :goto_6
    iput-object v4, v1, Lwp/i;->P:Landroid/view/View;

    move-object/from16 v4, v27

    iput-object v4, v1, Lwp/i;->R:Ljava/lang/String;

    move/from16 v3, v28

    iput v3, v1, Lwp/i;->S:F

    return-object v1

    :pswitch_26
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_e

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    const/4 v6, 0x2

    if-eq v5, v6, :cond_d

    invoke-static {v1, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_7

    :cond_d
    invoke-static {v1, v4}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_7

    :cond_e
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lwp/g;

    invoke-direct {v1, v3}, Lwp/g;-><init>(Ljava/lang/String;)V

    return-object v1

    :pswitch_27
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const-wide/16 v3, 0x0

    move-wide v5, v3

    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v7

    if-ge v7, v2, :cond_11

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    int-to-char v8, v7

    const/4 v9, 0x2

    const/16 v10, 0x8

    if-eq v8, v9, :cond_10

    const/4 v9, 0x3

    if-eq v8, v9, :cond_f

    invoke-static {v1, v7}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_8

    :cond_f
    invoke-static {v1, v7, v10}, Lvo/b;->G(Landroid/os/Parcel;II)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v5

    goto :goto_8

    :cond_10
    invoke-static {v1, v7, v10}, Lvo/b;->G(Landroid/os/Parcel;II)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v3

    goto :goto_8

    :cond_11
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {v1, v3, v4, v5, v6}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    return-object v1

    :pswitch_28
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move-object v4, v3

    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v2, :cond_14

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v6, v5

    const/4 v7, 0x2

    if-eq v6, v7, :cond_13

    const/4 v7, 0x3

    if-eq v6, v7, :cond_12

    invoke-static {v1, v5}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_9

    :cond_12
    sget-object v4, Lcom/google/android/gms/maps/model/LatLng;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v5, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/maps/model/LatLng;

    goto :goto_9

    :cond_13
    sget-object v3, Lcom/google/android/gms/maps/model/LatLng;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v5, v3}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/maps/model/LatLng;

    goto :goto_9

    :cond_14
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-direct {v1, v3, v4}, Lcom/google/android/gms/maps/model/LatLngBounds;-><init>(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V

    return-object v1

    :pswitch_29
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v3

    move-object v6, v5

    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v7

    if-ge v7, v2, :cond_18

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    int-to-char v8, v7

    const/4 v9, 0x2

    if-eq v8, v9, :cond_17

    const/4 v9, 0x3

    if-eq v8, v9, :cond_16

    const/4 v9, 0x4

    if-eq v8, v9, :cond_15

    invoke-static {v1, v7}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_a

    :cond_15
    invoke-static {v1, v7}, Lvo/b;->w(Landroid/os/Parcel;I)Ljava/lang/Float;

    move-result-object v6

    goto :goto_a

    :cond_16
    invoke-static {v1, v7}, Lvo/b;->x(Landroid/os/Parcel;I)Landroid/os/IBinder;

    move-result-object v5

    goto :goto_a

    :cond_17
    invoke-static {v1, v7}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v4

    goto :goto_a

    :cond_18
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lwp/d;

    if-nez v5, :cond_19

    goto :goto_b

    :cond_19
    invoke-static {v5}, Lcp/b;->X(Landroid/os/IBinder;)Lcp/a;

    move-result-object v2

    new-instance v3, Lwp/b;

    invoke-direct {v3, v2}, Lwp/b;-><init>(Lcp/a;)V

    :goto_b
    invoke-direct {v1, v4, v3, v6}, Lwp/d;-><init>(ILwp/b;Ljava/lang/Float;)V

    return-object v1

    :pswitch_2a
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v6

    if-ge v6, v2, :cond_1c

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    int-to-char v7, v6

    const/4 v8, 0x2

    if-eq v7, v8, :cond_1b

    const/4 v8, 0x3

    if-eq v7, v8, :cond_1a

    invoke-static {v1, v6}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_c

    :cond_1a
    const/16 v3, 0x8

    invoke-static {v1, v6, v3}, Lvo/b;->G(Landroid/os/Parcel;II)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v3

    goto :goto_c

    :cond_1b
    sget-object v5, Lwp/o;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v6, v5}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Lwp/o;

    goto :goto_c

    :cond_1c
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lwp/p;

    invoke-direct {v1, v5, v3, v4}, Lwp/p;-><init>(Lwp/o;D)V

    return-object v1

    :pswitch_2b
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v11, v3

    move v8, v4

    move v9, v8

    move v10, v9

    move v7, v5

    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_22

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    const/4 v5, 0x2

    if-eq v4, v5, :cond_21

    const/4 v5, 0x3

    if-eq v4, v5, :cond_20

    const/4 v5, 0x4

    if-eq v4, v5, :cond_1f

    const/4 v5, 0x5

    if-eq v4, v5, :cond_1e

    const/4 v5, 0x6

    if-eq v4, v5, :cond_1d

    invoke-static {v1, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_d

    :cond_1d
    sget-object v4, Lwp/n;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Lwp/n;

    goto :goto_d

    :cond_1e
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v10

    goto :goto_d

    :cond_1f
    invoke-static {v1, v3}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v9

    goto :goto_d

    :cond_20
    invoke-static {v1, v3}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v8

    goto :goto_d

    :cond_21
    invoke-static {v1, v3}, Lvo/b;->v(Landroid/os/Parcel;I)F

    move-result v7

    goto :goto_d

    :cond_22
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v6, Lwp/o;

    invoke-direct/range {v6 .. v11}, Lwp/o;-><init>(FIIZLwp/n;)V

    return-object v6

    :pswitch_2c
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v5, v3

    move-object v6, v4

    move v4, v5

    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v7

    if-ge v7, v2, :cond_27

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    int-to-char v8, v7

    const/4 v9, 0x2

    if-eq v8, v9, :cond_26

    const/4 v9, 0x3

    if-eq v8, v9, :cond_25

    const/4 v9, 0x4

    if-eq v8, v9, :cond_24

    const/4 v9, 0x5

    if-eq v8, v9, :cond_23

    invoke-static {v1, v7}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_e

    :cond_23
    invoke-static {v1, v7}, Lvo/b;->v(Landroid/os/Parcel;I)F

    move-result v5

    goto :goto_e

    :cond_24
    invoke-static {v1, v7}, Lvo/b;->v(Landroid/os/Parcel;I)F

    move-result v4

    goto :goto_e

    :cond_25
    invoke-static {v1, v7}, Lvo/b;->v(Landroid/os/Parcel;I)F

    move-result v3

    goto :goto_e

    :cond_26
    sget-object v6, Lcom/google/android/gms/maps/model/LatLng;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v7, v6}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/maps/model/LatLng;

    goto :goto_e

    :cond_27
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lcom/google/android/gms/maps/model/CameraPosition;

    invoke-direct {v1, v6, v3, v4, v5}, Lcom/google/android/gms/maps/model/CameraPosition;-><init>(Lcom/google/android/gms/maps/model/LatLng;FFF)V

    return-object v1

    :pswitch_2d
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    sget-object v1, Lw30/b;->w:Lw30/b;

    return-object v1

    :pswitch_2e
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_f
    if-eq v4, v2, :cond_28

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ly00/i;->valueOf(Ljava/lang/String;)Ly00/i;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_f

    :cond_28
    new-instance v1, Lw30/a;

    invoke-direct {v1, v3}, Lw30/a;-><init>(Ljava/util/List;)V

    return-object v1

    :pswitch_2f
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lw10/c;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    const-class v5, Lw10/c;

    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Ljz/e;

    invoke-direct {v2, v3, v4, v1}, Lw10/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljz/e;)V

    return-object v2

    :pswitch_30
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lw10/b;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lw10/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :pswitch_31
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lw10/a;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    const-class v4, Lw10/a;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Ljz/e;

    invoke-direct {v2, v3, v1}, Lw10/a;-><init>(Ljava/lang/String;Ljz/e;)V

    return-object v2

    :pswitch_32
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/stripe/android/core/model/CountryCode;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lcom/stripe/android/core/model/CountryCode;-><init>(Ljava/lang/String;)V

    return-object v2

    :pswitch_33
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/stripe/android/core/model/Country;

    sget-object v3, Lcom/stripe/android/core/model/CountryCode;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/core/model/CountryCode;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lcom/stripe/android/core/model/Country;-><init>(Lcom/stripe/android/core/model/CountryCode;Ljava/lang/String;)V

    return-object v2

    :pswitch_34
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lvx/b;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lvx/b;-><init>(Ljava/lang/String;)V

    return-object v2

    :pswitch_35
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    sget-object v1, Lvx/a;->w:Lvx/a;

    return-object v1

    :pswitch_36
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lvv/b;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_29

    const/4 v2, 0x1

    :goto_10
    move v9, v2

    goto :goto_11

    :cond_29
    const/4 v2, 0x0

    goto :goto_10

    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v8

    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    move-result v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    move-result v5

    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    move-result v6

    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    move-result v7

    invoke-direct/range {v3 .. v9}, Lvv/b;-><init>(FFFFIZ)V

    return-object v3

    :pswitch_37
    new-instance v2, Lvm/b;

    invoke-direct {v2, v1}, Lvm/b;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_38
    new-instance v2, Lvm/c;

    invoke-direct {v2, v1}, Lvm/c;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_39
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lv10/b;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v2

    instance-of v6, v2, Lcom/stripe/android/core/exception/StripeException;

    if-eqz v6, :cond_2a

    check-cast v2, Lcom/stripe/android/core/exception/StripeException;

    :goto_12
    move-object v6, v2

    goto :goto_13

    :cond_2a
    const/4 v2, 0x0

    goto :goto_12

    :goto_13
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    const/4 v7, 0x1

    if-ne v2, v7, :cond_2b

    goto :goto_14

    :cond_2b
    const/4 v7, 0x0

    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    const-class v2, Ly00/m6;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Ly00/m6;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v10

    invoke-direct/range {v3 .. v10}, Lv10/b;-><init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Ly00/m6;Ljava/lang/String;)V

    return-object v3

    :pswitch_3a
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_15
    if-eq v4, v2, :cond_2c

    const-class v5, Lv00/k0;

    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_15

    :cond_2c
    new-instance v1, Lv00/k0;

    invoke-direct {v1, v3}, Lv00/k0;-><init>(Ljava/util/List;)V

    return-object v1

    :pswitch_3b
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lv00/j0;

    const-class v3, Lv00/j0;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lh20/t1;

    invoke-direct {v2, v1}, Lv00/j0;-><init>(Lh20/t1;)V

    return-object v2

    :pswitch_3c
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    sget-object v1, Lv00/h0;->w:Lv00/h0;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2
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
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x2
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_12
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lv00/g0;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Lwx/d;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Lwx/c;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Lwp/n;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Lwp/m;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Lwp/k;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Lwp/j;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Lwp/i;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Lwp/g;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Lcom/google/android/gms/maps/model/LatLng;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Lcom/google/android/gms/maps/model/LatLngBounds;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Lwp/d;

    return-object p1

    :pswitch_a
    new-array p1, p1, [Lwp/p;

    return-object p1

    :pswitch_b
    new-array p1, p1, [Lwp/o;

    return-object p1

    :pswitch_c
    new-array p1, p1, [Lcom/google/android/gms/maps/model/CameraPosition;

    return-object p1

    :pswitch_d
    new-array p1, p1, [Lw30/b;

    return-object p1

    :pswitch_e
    new-array p1, p1, [Lw30/a;

    return-object p1

    :pswitch_f
    new-array p1, p1, [Lw10/c;

    return-object p1

    :pswitch_10
    new-array p1, p1, [Lw10/b;

    return-object p1

    :pswitch_11
    new-array p1, p1, [Lw10/a;

    return-object p1

    :pswitch_12
    new-array p1, p1, [Lcom/stripe/android/core/model/CountryCode;

    return-object p1

    :pswitch_13
    new-array p1, p1, [Lcom/stripe/android/core/model/Country;

    return-object p1

    :pswitch_14
    new-array p1, p1, [Lvx/b;

    return-object p1

    :pswitch_15
    new-array p1, p1, [Lvx/a;

    return-object p1

    :pswitch_16
    new-array p1, p1, [Lvv/b;

    return-object p1

    :pswitch_17
    new-array p1, p1, [Lvm/b;

    return-object p1

    :pswitch_18
    new-array p1, p1, [Lvm/c;

    return-object p1

    :pswitch_19
    new-array p1, p1, [Lv10/b;

    return-object p1

    :pswitch_1a
    new-array p1, p1, [Lv00/k0;

    return-object p1

    :pswitch_1b
    new-array p1, p1, [Lv00/j0;

    return-object p1

    :pswitch_1c
    new-array p1, p1, [Lv00/h0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
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
