.class public final Lsp/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lsp/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lsp/e;->a:I

    packed-switch v2, :pswitch_data_0

    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    sget-object v1, Lux/f;->w:Lux/f;

    return-object v1

    :pswitch_0
    const-class v2, Lur/a;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/app/PendingIntent;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance v3, Lur/c;

    invoke-direct {v3, v2, v1}, Lur/c;-><init>(Landroid/app/PendingIntent;Z)V

    return-object v3

    :pswitch_1
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v5, 0x0

    const/4 v6, -0x1

    const/4 v7, -0x1

    const/4 v8, 0x0

    const/4 v9, -0x1

    const/4 v10, -0x1

    const/4 v11, -0x1

    const/4 v12, -0x1

    const/4 v13, -0x1

    const/4 v14, -0x1

    const/4 v15, -0x1

    const/16 v16, -0x1

    const/16 v17, -0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, -0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_1

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    packed-switch v4, :pswitch_data_1

    :pswitch_2
    invoke-static {v1, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_1

    :pswitch_3
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v23

    goto :goto_1

    :pswitch_4
    invoke-static {v1, v3}, Lvo/b;->z(Landroid/os/Parcel;I)Ljava/lang/Integer;

    move-result-object v22

    goto :goto_1

    :pswitch_5
    invoke-static {v1, v3}, Lvo/b;->u(Landroid/os/Parcel;I)B

    move-result v21

    goto :goto_1

    :pswitch_6
    sget-object v4, Lcom/google/android/gms/maps/model/LatLngBounds;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object/from16 v20, v3

    check-cast v20, Lcom/google/android/gms/maps/model/LatLngBounds;

    goto :goto_1

    :pswitch_7
    invoke-static {v1, v3}, Lvo/b;->w(Landroid/os/Parcel;I)Ljava/lang/Float;

    move-result-object v19

    goto :goto_1

    :pswitch_8
    invoke-static {v1, v3}, Lvo/b;->w(Landroid/os/Parcel;I)Ljava/lang/Float;

    move-result-object v18

    goto :goto_1

    :pswitch_9
    invoke-static {v1, v3}, Lvo/b;->u(Landroid/os/Parcel;I)B

    move-result v17

    goto :goto_1

    :pswitch_a
    invoke-static {v1, v3}, Lvo/b;->u(Landroid/os/Parcel;I)B

    move-result v16

    goto :goto_1

    :pswitch_b
    invoke-static {v1, v3}, Lvo/b;->u(Landroid/os/Parcel;I)B

    move-result v15

    goto :goto_1

    :pswitch_c
    invoke-static {v1, v3}, Lvo/b;->u(Landroid/os/Parcel;I)B

    move-result v14

    goto :goto_1

    :pswitch_d
    invoke-static {v1, v3}, Lvo/b;->u(Landroid/os/Parcel;I)B

    move-result v13

    goto :goto_1

    :pswitch_e
    invoke-static {v1, v3}, Lvo/b;->u(Landroid/os/Parcel;I)B

    move-result v12

    goto :goto_1

    :pswitch_f
    invoke-static {v1, v3}, Lvo/b;->u(Landroid/os/Parcel;I)B

    move-result v11

    goto :goto_1

    :pswitch_10
    invoke-static {v1, v3}, Lvo/b;->u(Landroid/os/Parcel;I)B

    move-result v10

    goto :goto_1

    :pswitch_11
    invoke-static {v1, v3}, Lvo/b;->u(Landroid/os/Parcel;I)B

    move-result v9

    goto :goto_1

    :pswitch_12
    sget-object v4, Lcom/google/android/gms/maps/model/CameraPosition;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Lcom/google/android/gms/maps/model/CameraPosition;

    goto :goto_1

    :pswitch_13
    invoke-static {v1, v3}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v5

    goto :goto_1

    :pswitch_14
    invoke-static {v1, v3}, Lvo/b;->u(Landroid/os/Parcel;I)B

    move-result v7

    goto :goto_1

    :pswitch_15
    invoke-static {v1, v3}, Lvo/b;->u(Landroid/os/Parcel;I)B

    move-result v6

    goto :goto_1

    :cond_1
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lcom/google/android/gms/maps/GoogleMapOptions;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v2, -0x1

    iput v2, v1, Lcom/google/android/gms/maps/GoogleMapOptions;->y:I

    const/4 v2, 0x0

    iput-object v2, v1, Lcom/google/android/gms/maps/GoogleMapOptions;->N:Ljava/lang/Float;

    iput-object v2, v1, Lcom/google/android/gms/maps/GoogleMapOptions;->O:Ljava/lang/Float;

    iput-object v2, v1, Lcom/google/android/gms/maps/GoogleMapOptions;->P:Lcom/google/android/gms/maps/model/LatLngBounds;

    iput-object v2, v1, Lcom/google/android/gms/maps/GoogleMapOptions;->R:Ljava/lang/Integer;

    iput-object v2, v1, Lcom/google/android/gms/maps/GoogleMapOptions;->S:Ljava/lang/String;

    invoke-static {v6}, Lrg/j;->r(B)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Lcom/google/android/gms/maps/GoogleMapOptions;->w:Ljava/lang/Boolean;

    invoke-static {v7}, Lrg/j;->r(B)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Lcom/google/android/gms/maps/GoogleMapOptions;->x:Ljava/lang/Boolean;

    iput v5, v1, Lcom/google/android/gms/maps/GoogleMapOptions;->y:I

    iput-object v8, v1, Lcom/google/android/gms/maps/GoogleMapOptions;->z:Lcom/google/android/gms/maps/model/CameraPosition;

    invoke-static {v9}, Lrg/j;->r(B)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Lcom/google/android/gms/maps/GoogleMapOptions;->E:Ljava/lang/Boolean;

    invoke-static {v10}, Lrg/j;->r(B)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Lcom/google/android/gms/maps/GoogleMapOptions;->F:Ljava/lang/Boolean;

    invoke-static {v11}, Lrg/j;->r(B)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Lcom/google/android/gms/maps/GoogleMapOptions;->G:Ljava/lang/Boolean;

    invoke-static {v12}, Lrg/j;->r(B)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Lcom/google/android/gms/maps/GoogleMapOptions;->H:Ljava/lang/Boolean;

    invoke-static {v13}, Lrg/j;->r(B)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Lcom/google/android/gms/maps/GoogleMapOptions;->I:Ljava/lang/Boolean;

    invoke-static {v14}, Lrg/j;->r(B)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Lcom/google/android/gms/maps/GoogleMapOptions;->J:Ljava/lang/Boolean;

    invoke-static {v15}, Lrg/j;->r(B)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Lcom/google/android/gms/maps/GoogleMapOptions;->K:Ljava/lang/Boolean;

    invoke-static/range {v16 .. v16}, Lrg/j;->r(B)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Lcom/google/android/gms/maps/GoogleMapOptions;->L:Ljava/lang/Boolean;

    invoke-static/range {v17 .. v17}, Lrg/j;->r(B)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Lcom/google/android/gms/maps/GoogleMapOptions;->M:Ljava/lang/Boolean;

    move-object/from16 v3, v18

    iput-object v3, v1, Lcom/google/android/gms/maps/GoogleMapOptions;->N:Ljava/lang/Float;

    move-object/from16 v3, v19

    iput-object v3, v1, Lcom/google/android/gms/maps/GoogleMapOptions;->O:Ljava/lang/Float;

    move-object/from16 v3, v20

    iput-object v3, v1, Lcom/google/android/gms/maps/GoogleMapOptions;->P:Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-static/range {v21 .. v21}, Lrg/j;->r(B)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Lcom/google/android/gms/maps/GoogleMapOptions;->Q:Ljava/lang/Boolean;

    move-object/from16 v3, v22

    iput-object v3, v1, Lcom/google/android/gms/maps/GoogleMapOptions;->R:Ljava/lang/Integer;

    move-object/from16 v3, v23

    iput-object v3, v1, Lcom/google/android/gms/maps/GoogleMapOptions;->S:Ljava/lang/String;

    return-object v1

    :pswitch_16
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v6, v3

    move-object v9, v6

    move-object v11, v9

    move v7, v4

    move v8, v7

    move v10, v8

    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_2

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    packed-switch v4, :pswitch_data_2

    invoke-static {v1, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_2

    :pswitch_17
    invoke-static {v1, v3}, Lvo/b;->e(Landroid/os/Parcel;I)[I

    move-result-object v11

    goto :goto_2

    :pswitch_18
    invoke-static {v1, v3}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v10

    goto :goto_2

    :pswitch_19
    invoke-static {v1, v3}, Lvo/b;->e(Landroid/os/Parcel;I)[I

    move-result-object v9

    goto :goto_2

    :pswitch_1a
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v8

    goto :goto_2

    :pswitch_1b
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v7

    goto :goto_2

    :pswitch_1c
    sget-object v4, Luo/l;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Luo/l;

    goto :goto_2

    :cond_2
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v5, Luo/f;

    invoke-direct/range {v5 .. v11}, Luo/f;-><init>(Luo/l;ZZ[II[I)V

    return-object v5

    :pswitch_1d
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v6, v3

    move v9, v6

    move v10, v9

    move-object v7, v4

    move-object v8, v7

    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_8

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    const/4 v5, 0x1

    if-eq v4, v5, :cond_7

    const/4 v5, 0x2

    if-eq v4, v5, :cond_6

    const/4 v5, 0x3

    if-eq v4, v5, :cond_5

    const/4 v5, 0x4

    if-eq v4, v5, :cond_4

    const/4 v5, 0x5

    if-eq v4, v5, :cond_3

    invoke-static {v1, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_3

    :cond_3
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v10

    goto :goto_3

    :cond_4
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v9

    goto :goto_3

    :cond_5
    sget-object v4, Lcom/google/android/gms/common/a;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Lcom/google/android/gms/common/a;

    goto :goto_3

    :cond_6
    invoke-static {v1, v3}, Lvo/b;->x(Landroid/os/Parcel;I)Landroid/os/IBinder;

    move-result-object v7

    goto :goto_3

    :cond_7
    invoke-static {v1, v3}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v6

    goto :goto_3

    :cond_8
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v5, Luo/t;

    invoke-direct/range {v5 .. v10}, Luo/t;-><init>(ILandroid/os/IBinder;Lcom/google/android/gms/common/a;ZZ)V

    return-object v5

    :pswitch_1e
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v5, v4

    move v6, v5

    move-object v4, v3

    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v7

    if-ge v7, v2, :cond_d

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    int-to-char v8, v7

    const/4 v9, 0x1

    if-eq v8, v9, :cond_c

    const/4 v9, 0x2

    if-eq v8, v9, :cond_b

    const/4 v9, 0x3

    if-eq v8, v9, :cond_a

    const/4 v9, 0x4

    if-eq v8, v9, :cond_9

    invoke-static {v1, v7}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_4

    :cond_9
    sget-object v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v7, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    goto :goto_4

    :cond_a
    invoke-static {v1, v7}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v6

    goto :goto_4

    :cond_b
    sget-object v3, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v7, v3}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroid/accounts/Account;

    goto :goto_4

    :cond_c
    invoke-static {v1, v7}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v5

    goto :goto_4

    :cond_d
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Luo/s;

    invoke-direct {v1, v5, v3, v6, v4}, Luo/s;-><init>(ILandroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    return-object v1

    :pswitch_1f
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    move/from16 v19, v3

    move v9, v4

    move v10, v9

    move v11, v10

    move/from16 v18, v11

    move-object/from16 v16, v5

    move-object/from16 v17, v16

    move-wide v12, v6

    move-wide v14, v12

    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_e

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    packed-switch v4, :pswitch_data_3

    invoke-static {v1, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_5

    :pswitch_20
    invoke-static {v1, v3}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v3

    move/from16 v19, v3

    goto :goto_5

    :pswitch_21
    invoke-static {v1, v3}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v3

    move/from16 v18, v3

    goto :goto_5

    :pswitch_22
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v17, v3

    goto :goto_5

    :pswitch_23
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v16, v3

    goto :goto_5

    :pswitch_24
    invoke-static {v1, v3}, Lvo/b;->A(Landroid/os/Parcel;I)J

    move-result-wide v3

    move-wide v14, v3

    goto :goto_5

    :pswitch_25
    invoke-static {v1, v3}, Lvo/b;->A(Landroid/os/Parcel;I)J

    move-result-wide v3

    move-wide v12, v3

    goto :goto_5

    :pswitch_26
    invoke-static {v1, v3}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v3

    move v11, v3

    goto :goto_5

    :pswitch_27
    invoke-static {v1, v3}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v3

    move v10, v3

    goto :goto_5

    :pswitch_28
    invoke-static {v1, v3}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v3

    move v9, v3

    goto :goto_5

    :cond_e
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v8, Luo/j;

    invoke-direct/range {v8 .. v19}, Luo/j;-><init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V

    return-object v8

    :pswitch_29
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_6
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

    goto :goto_6

    :cond_f
    sget-object v3, Luo/j;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v5, v3}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v3

    goto :goto_6

    :cond_10
    invoke-static {v1, v5}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v4

    goto :goto_6

    :cond_11
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Luo/m;

    invoke-direct {v1, v4, v3}, Luo/m;-><init>(ILjava/util/List;)V

    return-object v1

    :pswitch_2a
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v2, :cond_14

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    int-to-char v6, v5

    const/4 v7, 0x1

    if-eq v6, v7, :cond_13

    const/4 v7, 0x2

    if-eq v6, v7, :cond_12

    invoke-static {v1, v5}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_7

    :cond_12
    invoke-static {v1, v5}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_7

    :cond_13
    invoke-static {v1, v5}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v4

    goto :goto_7

    :cond_14
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Luo/d;

    invoke-direct {v1, v4, v3}, Luo/d;-><init>(ILjava/lang/String;)V

    return-object v1

    :pswitch_2b
    const-string v2, "source"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_16

    const/4 v3, 0x1

    if-ne v2, v3, :cond_15

    new-instance v2, Ld8/a;

    const/16 v4, 0xe

    invoke-direct {v2, v3, v4}, Ld8/a;-><init>(II)V

    sget-object v3, Lw7/b;->a:Lw7/b;

    invoke-virtual {v3, v1, v2}, Lw7/b;->a(Landroid/os/Parcel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw7/a;

    goto :goto_8

    :cond_15
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v3, "Unknown storage: "

    invoke-static {v2, v3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_16
    invoke-virtual {v1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v1

    if-nez v1, :cond_17

    const/4 v1, 0x0

    goto :goto_8

    :cond_17
    invoke-static {v1}, Landroidx/health/platform/client/proto/r;->t([B)Landroidx/health/platform/client/proto/r;

    move-result-object v1

    new-instance v2, Landroidx/health/platform/client/exerciseroute/ExerciseRoute;

    invoke-direct {v2, v1}, Landroidx/health/platform/client/exerciseroute/ExerciseRoute;-><init>(Landroidx/health/platform/client/proto/r;)V

    move-object v1, v2

    :goto_8
    return-object v1

    :pswitch_2c
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lu40/f;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v3

    check-cast v3, Lc93/a;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v4

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {v2, v3, v4, v1}, Lu40/f;-><init>(Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-object v2

    :pswitch_2d
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_18

    move v6, v4

    goto :goto_9

    :cond_18
    move v6, v3

    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_19

    move v7, v4

    goto :goto_a

    :cond_19
    move v7, v3

    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_1a

    move v8, v4

    goto :goto_b

    :cond_1a
    move v8, v3

    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lu30/b;->valueOf(Ljava/lang/String;)Lu30/b;

    move-result-object v9

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    new-instance v10, Ljava/util/LinkedHashSet;

    invoke-direct {v10, v2}, Ljava/util/LinkedHashSet;-><init>(I)V

    :goto_c
    if-eq v3, v2, :cond_1b

    invoke-static {v1, v10, v3, v4}, Lte0/d;->e(Landroid/os/Parcel;Ljava/util/LinkedHashSet;II)I

    move-result v3

    goto :goto_c

    :cond_1b
    new-instance v5, Lu30/c;

    invoke-direct/range {v5 .. v10}, Lu30/c;-><init>(ZZZLu30/b;Ljava/util/Set;)V

    return-object v5

    :pswitch_2e
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lu30/a;

    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Lu30/a;-><init>(JLjava/lang/String;)V

    return-object v2

    :pswitch_2f
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    sget-object v1, Lu10/s;->w:Lu10/s;

    return-object v1

    :pswitch_30
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lu10/r;

    const-class v3, Lu10/r;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, La30/a;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lq20/y;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_1c

    const/4 v1, 0x1

    goto :goto_d

    :cond_1c
    const/4 v1, 0x0

    :goto_d
    invoke-direct {v2, v4, v3, v1}, Lu10/r;-><init>(La30/a;Lq20/y;Z)V

    return-object v2

    :pswitch_31
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lu10/i;

    const-class v3, Lu10/i;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Lv00/c0;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, La30/a;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lq20/y;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v4, v5, v3, v1}, Lu10/i;-><init>(Lv00/c0;La30/a;Lq20/y;Ljava/lang/String;)V

    return-object v2

    :pswitch_32
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lty/b;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v7

    invoke-direct/range {v3 .. v8}, Lty/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    return-object v3

    :pswitch_33
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ltv/c;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_1d

    move v2, v4

    move v4, v5

    goto :goto_e

    :cond_1d
    move v2, v4

    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    if-eqz v6, :cond_1e

    move v6, v5

    goto :goto_f

    :cond_1e
    move v6, v5

    move v5, v2

    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    move v8, v6

    move v6, v7

    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    move-result v7

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v9

    if-eqz v9, :cond_1f

    move v9, v8

    goto :goto_10

    :cond_1f
    move v9, v8

    move v8, v2

    :goto_10
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v10

    move v11, v9

    move v9, v10

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v10

    move v12, v11

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v11

    move v13, v12

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v14

    if-eqz v14, :cond_20

    goto :goto_11

    :cond_20
    move v13, v2

    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lev/r;->valueOf(Ljava/lang/String;)Lev/r;

    move-result-object v14

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v15

    const-class v2, Ltv/c;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Lev/e;

    invoke-direct/range {v3 .. v16}, Ltv/c;-><init>(ZZIFZIILjava/lang/String;Ljava/lang/String;ZLev/r;Ljava/lang/String;Lev/e;)V

    return-object v3

    :pswitch_34
    new-instance v2, Ltq/a;

    invoke-direct {v2, v1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    const-class v3, Ltq/a;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, v2, Ltq/a;->w:I

    return-object v2

    :pswitch_35
    new-instance v2, Ltd3/n;

    invoke-direct {v2, v1}, Ltd3/n;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_36
    new-instance v2, Ltd3/m;

    invoke-direct {v2, v1}, Ltd3/m;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_37
    new-instance v2, Ltd3/j;

    invoke-direct {v2}, Ltd3/j;-><init>()V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_21

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Ltd3/j;->a:Ljava/lang/String;

    :cond_21
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-ne v3, v4, :cond_24

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_23

    invoke-static {v3}, Landroid/bluetooth/BluetoothAdapter;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_22

    goto :goto_12

    :cond_22
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "invalid device address "

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_23
    :goto_12
    iput-object v3, v2, Ltd3/j;->b:Ljava/lang/String;

    :cond_24
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    const/4 v5, 0x0

    const-class v6, Landroid/os/ParcelUuid;

    if-ne v3, v4, :cond_27

    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroid/os/ParcelUuid;

    iput-object v3, v2, Ltd3/j;->c:Landroid/os/ParcelUuid;

    iput-object v5, v2, Ltd3/j;->d:Landroid/os/ParcelUuid;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    if-ne v7, v4, :cond_27

    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v7

    check-cast v7, Landroid/os/ParcelUuid;

    if-eqz v7, :cond_26

    if-eqz v3, :cond_25

    goto :goto_13

    :cond_25
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "uuid is null while uuidMask is not null!"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_26
    :goto_13
    iput-object v3, v2, Ltd3/j;->c:Landroid/os/ParcelUuid;

    iput-object v7, v2, Ltd3/j;->d:Landroid/os/ParcelUuid;

    :cond_27
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-ne v3, v4, :cond_2a

    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroid/os/ParcelUuid;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    if-ne v6, v4, :cond_2a

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    new-array v6, v6, [B

    invoke-virtual {v1, v6}, Landroid/os/Parcel;->readByteArray([B)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    if-nez v7, :cond_29

    if-eqz v3, :cond_28

    iput-object v3, v2, Ltd3/j;->e:Landroid/os/ParcelUuid;

    iput-object v6, v2, Ltd3/j;->f:[B

    iput-object v5, v2, Ltd3/j;->g:[B

    goto :goto_14

    :cond_28
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "serviceDataUuid is null!"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_29
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    new-array v7, v7, [B

    invoke-virtual {v1, v7}, Landroid/os/Parcel;->readByteArray([B)V

    invoke-virtual {v2, v3, v6, v7}, Ltd3/j;->b(Landroid/os/ParcelUuid;[B[B)V

    :cond_2a
    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    if-ne v6, v4, :cond_2d

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    new-array v4, v4, [B

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readByteArray([B)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    if-nez v6, :cond_2c

    if-ltz v3, :cond_2b

    iput v3, v2, Ltd3/j;->h:I

    iput-object v4, v2, Ltd3/j;->i:[B

    iput-object v5, v2, Ltd3/j;->j:[B

    goto :goto_15

    :cond_2b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "invalid manufacture id"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2c
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    new-array v5, v5, [B

    invoke-virtual {v1, v5}, Landroid/os/Parcel;->readByteArray([B)V

    invoke-virtual {v2, v3, v4, v5}, Ltd3/j;->a(I[B[B)V

    :cond_2d
    :goto_15
    new-instance v6, Ltd3/k;

    iget-object v7, v2, Ltd3/j;->a:Ljava/lang/String;

    iget-object v8, v2, Ltd3/j;->b:Ljava/lang/String;

    iget-object v9, v2, Ltd3/j;->c:Landroid/os/ParcelUuid;

    iget-object v10, v2, Ltd3/j;->d:Landroid/os/ParcelUuid;

    iget-object v11, v2, Ltd3/j;->e:Landroid/os/ParcelUuid;

    iget-object v12, v2, Ltd3/j;->f:[B

    iget-object v13, v2, Ltd3/j;->g:[B

    iget v14, v2, Ltd3/j;->h:I

    iget-object v15, v2, Ltd3/j;->i:[B

    iget-object v1, v2, Ltd3/j;->j:[B

    move-object/from16 v16, v1

    invoke-direct/range {v6 .. v16}, Ltd3/k;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;[B[BI[B[B)V

    return-object v6

    :pswitch_38
    const-string v2, "source"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-eqz v2, :cond_2f

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2e

    new-instance v2, Ld8/a;

    const/16 v4, 0xb

    invoke-direct {v2, v3, v4}, Ld8/a;-><init>(II)V

    sget-object v3, Lw7/b;->a:Lw7/b;

    invoke-virtual {v3, v1, v2}, Lw7/b;->a(Landroid/os/Parcel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw7/a;

    goto :goto_16

    :cond_2e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v3, "Unknown storage: "

    invoke-static {v2, v3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2f
    invoke-virtual {v1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_30

    move-object v1, v2

    goto :goto_16

    :cond_30
    invoke-static {v1}, Landroidx/health/platform/client/proto/j0;->v([B)Landroidx/health/platform/client/proto/j0;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/j0;->r()I

    move-result v3

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/j0;->t()Z

    move-result v4

    if-eqz v4, :cond_31

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/j0;->s()Ljava/lang/String;

    move-result-object v2

    :cond_31
    invoke-static {v3, v2}, Lrv/n;->i(ILjava/lang/String;)Lt7/c;

    move-result-object v1

    :goto_16
    return-object v1

    :pswitch_39
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lt30/s;

    sget-object v2, Lr30/e;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lr30/e;

    sget-object v2, Lr30/b;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lr30/b;

    const-class v2, Lt30/s;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lm30/h;

    sget-object v2, Lq30/n;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lq30/n;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lq30/r0;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v9

    sget-object v2, Lq30/n0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lq30/n0;

    invoke-direct/range {v3 .. v10}, Lt30/s;-><init>(Lr30/e;Lr30/b;Lm30/h;Lq30/n;Lq30/r0;ILq30/n0;)V

    return-object v3

    :pswitch_3a
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lt10/r;

    const-class v3, Lt10/r;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lq20/y;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_32

    const/4 v1, 0x1

    goto :goto_17

    :cond_32
    const/4 v1, 0x0

    :goto_17
    invoke-direct {v2, v3, v1}, Lt10/r;-><init>(Lq20/y;Z)V

    return-object v2

    :pswitch_3b
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    sget-object v1, Lt10/q;->w:Lt10/q;

    return-object v1

    :pswitch_3c
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lt10/p;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    const-class v2, Lt10/p;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Lv00/c0;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    if-eqz v6, :cond_33

    const/4 v6, 0x1

    goto :goto_18

    :cond_33
    const/4 v6, 0x0

    :goto_18
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v7

    check-cast v7, Lc10/n;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v9

    if-nez v9, :cond_34

    const/4 v9, 0x0

    goto :goto_19

    :cond_34
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    :goto_19
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lq20/y;

    invoke-direct/range {v3 .. v10}, Lt10/p;-><init>(Ljava/lang/String;Lv00/c0;ZLc10/n;Ljava/lang/String;Ljava/lang/Integer;Lq20/y;)V

    return-object v3

    :pswitch_3d
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    :goto_1a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v7

    if-ge v7, v2, :cond_39

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    int-to-char v8, v7

    const/4 v9, 0x1

    if-eq v8, v9, :cond_38

    const/4 v9, 0x2

    if-eq v8, v9, :cond_37

    const/4 v9, 0x3

    if-eq v8, v9, :cond_36

    const/4 v9, 0x4

    if-eq v8, v9, :cond_35

    invoke-static {v1, v7}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_1a

    :cond_35
    invoke-static {v1, v7}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v6

    goto :goto_1a

    :cond_36
    sget-object v5, Landroid/widget/RemoteViews;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v7, v5}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Landroid/widget/RemoteViews;

    goto :goto_1a

    :cond_37
    invoke-static {v1, v7}, Lvo/b;->e(Landroid/os/Parcel;I)[I

    move-result-object v4

    goto :goto_1a

    :cond_38
    invoke-static {v1, v7}, Lvo/b;->i(Landroid/os/Parcel;I)[Ljava/lang/String;

    move-result-object v3

    goto :goto_1a

    :cond_39
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lsp/g;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v3, v1, Lsp/g;->w:[Ljava/lang/String;

    iput-object v4, v1, Lsp/g;->x:[I

    iput-object v5, v1, Lsp/g;->y:Landroid/widget/RemoteViews;

    iput-object v6, v1, Lsp/g;->z:[B

    return-object v1

    :pswitch_3e
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    :goto_1b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_3b

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    const/4 v6, 0x1

    if-eq v5, v6, :cond_3a

    invoke-static {v1, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_1b

    :cond_3a
    sget-object v3, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v4, v3}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroid/app/PendingIntent;

    goto :goto_1b

    :cond_3b
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lsp/f;

    invoke-direct {v1, v3}, Lsp/f;-><init>(Landroid/app/PendingIntent;)V

    return-object v1

    :pswitch_3f
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    :goto_1c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_3d

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    const/4 v6, 0x1

    if-eq v5, v6, :cond_3c

    invoke-static {v1, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_1c

    :cond_3c
    invoke-static {v1, v4}, Lvo/b;->d(Landroid/os/Parcel;I)[B

    move-result-object v3

    goto :goto_1c

    :cond_3d
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lsp/d;

    invoke-direct {v1, v3}, Lsp/d;-><init>([B)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
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
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_16
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2
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
        :pswitch_2
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
    .packed-switch 0x1
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsp/e;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Lux/f;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Lur/a;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Lcom/google/android/gms/maps/GoogleMapOptions;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Luo/f;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Luo/t;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Luo/s;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Luo/j;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Luo/m;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Luo/d;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Landroidx/health/platform/client/exerciseroute/ExerciseRoute;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Lu40/f;

    return-object p1

    :pswitch_a
    new-array p1, p1, [Lu30/c;

    return-object p1

    :pswitch_b
    new-array p1, p1, [Lu30/a;

    return-object p1

    :pswitch_c
    new-array p1, p1, [Lu10/s;

    return-object p1

    :pswitch_d
    new-array p1, p1, [Lu10/r;

    return-object p1

    :pswitch_e
    new-array p1, p1, [Lu10/i;

    return-object p1

    :pswitch_f
    new-array p1, p1, [Lty/b;

    return-object p1

    :pswitch_10
    new-array p1, p1, [Ltv/c;

    return-object p1

    :pswitch_11
    new-array p1, p1, [Ltq/a;

    return-object p1

    :pswitch_12
    new-array p1, p1, [Ltd3/n;

    return-object p1

    :pswitch_13
    new-array p1, p1, [Ltd3/m;

    return-object p1

    :pswitch_14
    new-array p1, p1, [Ltd3/k;

    return-object p1

    :pswitch_15
    new-array p1, p1, [Lt7/c;

    return-object p1

    :pswitch_16
    new-array p1, p1, [Lt30/s;

    return-object p1

    :pswitch_17
    new-array p1, p1, [Lt10/r;

    return-object p1

    :pswitch_18
    new-array p1, p1, [Lt10/q;

    return-object p1

    :pswitch_19
    new-array p1, p1, [Lt10/p;

    return-object p1

    :pswitch_1a
    new-array p1, p1, [Lsp/g;

    return-object p1

    :pswitch_1b
    new-array p1, p1, [Lsp/f;

    return-object p1

    :pswitch_1c
    new-array p1, p1, [Lsp/d;

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
