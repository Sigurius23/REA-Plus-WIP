.class public final Lmn/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lmn/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lmn/b;->a:I

    packed-switch v2, :pswitch_data_0

    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lp10/h;

    const-class v2, Lp10/h;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Ly00/d5;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Ly00/u5;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v6

    check-cast v6, Ly00/j5;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lp10/g;->valueOf(Ljava/lang/String;)Lp10/g;

    move-result-object v7

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v8

    invoke-virtual {v1, v8}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v8

    check-cast v8, Lwz/g0;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lj00/i0;

    invoke-direct/range {v3 .. v9}, Lp10/h;-><init>(Ly00/d5;Ly00/u5;Ly00/j5;Lp10/g;Lwz/g0;Lj00/i0;)V

    return-object v3

    :pswitch_0
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lp10/c;

    const-class v3, Lp10/c;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Le10/v0;

    invoke-direct {v2, v1}, Lp10/c;-><init>(Le10/v0;)V

    return-object v2

    :pswitch_1
    new-instance v2, Lon/e;

    invoke-direct {v2, v1}, Lon/e;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_2
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v6

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v8

    new-instance v3, Lon/c;

    invoke-direct/range {v3 .. v8}, Lon/c;-><init>(JJI)V

    return-object v3

    :pswitch_3
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const-class v3, Lon/c;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    new-instance v1, Lon/d;

    invoke-direct {v1, v2}, Lon/d;-><init>(Ljava/util/ArrayList;)V

    return-object v1

    :pswitch_4
    new-instance v2, Lon/b;

    invoke-direct {v2, v1}, Lon/b;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_5
    new-instance v2, Lon/a;

    invoke-direct {v2, v1}, Lon/a;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_6
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lio/getstream/video/android/model/StreamCallId;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-direct {v2, v3, v4, v5, v1}, Lio/getstream/video/android/model/StreamCallId;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v2

    :pswitch_7
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lo10/g;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    const-class v2, Lo10/g;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Ly00/r3;

    invoke-direct/range {v3 .. v8}, Lo10/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/r3;)V

    return-object v3

    :pswitch_8
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lo10/d;

    const-class v3, Lo10/d;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Le10/v0;

    invoke-direct {v2, v1}, Lo10/d;-><init>(Le10/v0;)V

    return-object v2

    :pswitch_9
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lo10/a;

    sget-object v3, Lwz/g0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwz/g0;

    const-class v4, Lo10/a;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Lwz/n0;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwz/h0;->valueOf(Ljava/lang/String;)Lwz/h0;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Lo10/a;-><init>(Lwz/g0;Lwz/n0;Lwz/h0;)V

    return-object v2

    :pswitch_a
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    move v6, v3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_1

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    packed-switch v4, :pswitch_data_1

    invoke-static {v1, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_1

    :pswitch_b
    invoke-static {v1, v3}, Lvo/b;->x(Landroid/os/Parcel;I)Landroid/os/IBinder;

    move-result-object v3

    move-object v11, v3

    goto :goto_1

    :pswitch_c
    invoke-static {v1, v3}, Lvo/b;->x(Landroid/os/Parcel;I)Landroid/os/IBinder;

    move-result-object v3

    move-object v10, v3

    goto :goto_1

    :pswitch_d
    sget-object v4, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroid/app/PendingIntent;

    move-object v9, v3

    goto :goto_1

    :pswitch_e
    invoke-static {v1, v3}, Lvo/b;->x(Landroid/os/Parcel;I)Landroid/os/IBinder;

    move-result-object v3

    move-object v8, v3

    goto :goto_1

    :pswitch_f
    sget-object v4, Lnp/j;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lnp/j;

    move-object v7, v3

    goto :goto_1

    :pswitch_10
    invoke-static {v1, v3}, Lvo/b;->y(Landroid/os/Parcel;I)I

    move-result v3

    move v6, v3

    goto :goto_1

    :cond_1
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v5, Lnp/k;

    invoke-direct/range {v5 .. v11}, Lnp/k;-><init>(ILnp/j;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;Landroid/os/IBinder;)V

    return-object v5

    :pswitch_11
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    sget-object v3, Lnp/j;->L:Ljava/util/List;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide v6, 0x7fffffffffffffffL

    move-object v10, v3

    move-object v9, v4

    move-object v11, v9

    move-object v15, v11

    move-object/from16 v18, v15

    move v12, v5

    move v13, v12

    move v14, v13

    move/from16 v16, v14

    move/from16 v17, v16

    move-wide/from16 v19, v6

    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_3

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-char v4, v3

    const/4 v5, 0x1

    if-eq v4, v5, :cond_2

    packed-switch v4, :pswitch_data_2

    invoke-static {v1, v3}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_2

    :pswitch_12
    invoke-static {v1, v3}, Lvo/b;->A(Landroid/os/Parcel;I)J

    move-result-wide v3

    move-wide/from16 v19, v3

    goto :goto_2

    :pswitch_13
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v18, v3

    goto :goto_2

    :pswitch_14
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v3

    move/from16 v17, v3

    goto :goto_2

    :pswitch_15
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v3

    move/from16 v16, v3

    goto :goto_2

    :pswitch_16
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    move-object v15, v3

    goto :goto_2

    :pswitch_17
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v3

    move v14, v3

    goto :goto_2

    :pswitch_18
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v3

    move v13, v3

    goto :goto_2

    :pswitch_19
    invoke-static {v1, v3}, Lvo/b;->t(Landroid/os/Parcel;I)Z

    move-result v3

    move v12, v3

    goto :goto_2

    :pswitch_1a
    invoke-static {v1, v3}, Lvo/b;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v3

    move-object v11, v3

    goto :goto_2

    :pswitch_1b
    sget-object v4, Luo/d;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->l(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v3

    move-object v10, v3

    goto :goto_2

    :cond_2
    sget-object v4, Lcom/google/android/gms/location/LocationRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v3, v4}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/location/LocationRequest;

    move-object v9, v3

    goto :goto_2

    :cond_3
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v8, Lnp/j;

    invoke-direct/range {v8 .. v20}, Lnp/j;-><init>(Lcom/google/android/gms/location/LocationRequest;Ljava/util/List;Ljava/lang/String;ZZZLjava/lang/String;ZZLjava/lang/String;J)V

    return-object v8

    :pswitch_1c
    invoke-static {v1}, Lvo/b;->F(Landroid/os/Parcel;)I

    move-result v2

    const/4 v3, 0x0

    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    move-result v4

    if-ge v4, v2, :cond_5

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    int-to-char v5, v4

    const/4 v6, 0x1

    if-eq v5, v6, :cond_4

    invoke-static {v1, v4}, Lvo/b;->E(Landroid/os/Parcel;I)V

    goto :goto_3

    :cond_4
    sget-object v3, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v1, v4, v3}, Lvo/b;->g(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/common/api/Status;

    goto :goto_3

    :cond_5
    invoke-static {v1, v2}, Lvo/b;->m(Landroid/os/Parcel;I)V

    new-instance v1, Lnp/b;

    invoke-direct {v1, v3}, Lnp/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v1

    :pswitch_1d
    new-instance v2, Lnn/n;

    invoke-direct {v2, v1}, Lnn/n;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_1e
    new-instance v2, Lnn/m;

    invoke-direct {v2, v1}, Lnn/m;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_1f
    new-instance v2, Lnn/l;

    invoke-direct {v2, v1}, Lnn/l;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_20
    new-instance v2, Lnn/k;

    invoke-direct {v2, v1}, Lnn/k;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_21
    new-instance v2, Lnn/j;

    invoke-direct {v2, v1}, Lnn/j;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_22
    new-instance v2, Lnn/f;

    invoke-direct {v2, v1}, Lnn/f;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_23
    new-instance v2, Lnn/e;

    invoke-direct {v2, v1}, Lnn/e;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_24
    new-instance v2, Lnn/d;

    invoke-direct {v2, v1}, Lnn/d;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_25
    new-instance v2, Lnn/c;

    invoke-direct {v2, v1}, Lnn/c;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_26
    new-instance v2, Lnn/b;

    invoke-direct {v2, v1}, Lnn/b;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_27
    new-instance v2, Lnn/a;

    invoke-direct {v2, v1}, Lnn/a;-><init>(Landroid/os/Parcel;)V

    return-object v2

    :pswitch_28
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ln20/h;

    const-class v3, Ln20/h;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, La30/f1;

    sget-object v4, Lh20/x1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v4, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh20/x1;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, 0x1

    goto :goto_4

    :cond_6
    const/4 v1, 0x0

    :goto_4
    invoke-direct {v2, v3, v4, v1}, Ln20/h;-><init>(La30/f1;Lh20/x1;Z)V

    return-object v2

    :pswitch_29
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    const-class v2, Lmy/a;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lh20/c2;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lh20/h2;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Lh20/w2;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Lh20/i1;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Li20/b;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eqz v3, :cond_7

    move v3, v10

    move v10, v11

    goto :goto_5

    :cond_7
    move v3, v10

    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v12

    if-eqz v12, :cond_8

    move v12, v11

    goto :goto_6

    :cond_8
    move v12, v11

    move v11, v3

    :goto_6
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v13

    invoke-virtual {v1, v13}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v13

    check-cast v13, Lh20/l1;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v14

    move v15, v12

    move-object v12, v13

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    :goto_7
    if-eq v3, v14, :cond_9

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Ly00/i;->valueOf(Ljava/lang/String;)Ly00/i;

    move-result-object v15

    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    const/4 v15, 0x1

    goto :goto_7

    :cond_9
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-eqz v3, :cond_a

    const/4 v14, 0x1

    goto :goto_8

    :cond_a
    const/4 v14, 0x0

    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v15

    const/4 v3, 0x0

    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v16

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lh20/t1;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    move-object/from16 v19, v2

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v20, v3

    const/4 v3, 0x0

    :goto_9
    if-eq v3, v0, :cond_b

    move/from16 v21, v0

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    move/from16 v0, v21

    goto :goto_9

    :cond_b
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v21, v2

    const/4 v2, 0x0

    :goto_a
    if-eq v2, v0, :cond_c

    move/from16 v22, v0

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    move/from16 v0, v22

    goto :goto_a

    :cond_c
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lh20/g3;

    move-object/from16 v18, v21

    const/4 v2, 0x1

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v21

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lwz/d0;

    move-object/from16 v23, v0

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    move-object/from16 v24, v2

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    move-object/from16 v25, v3

    const/4 v3, 0x0

    :goto_b
    if-eq v3, v0, :cond_d

    move/from16 v26, v0

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v27

    move/from16 v28, v3

    invoke-static/range {v27 .. v27}, Lh20/i3;->valueOf(Ljava/lang/String;)Lh20/i3;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v28, 0x1

    move/from16 v0, v26

    goto :goto_b

    :cond_d
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lh20/q3;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-eqz v3, :cond_e

    const/16 v17, 0x1

    goto :goto_c

    :cond_e
    const/16 v17, 0x0

    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v26

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    move-object/from16 v27, v1

    check-cast v27, Lh20/h1;

    new-instance v3, Lmy/a;

    move-object/from16 v22, v24

    move-object/from16 v19, v25

    move-object/from16 v24, v0

    move/from16 v25, v17

    move-object/from16 v17, v20

    move-object/from16 v20, v23

    move-object/from16 v23, v2

    invoke-direct/range {v3 .. v27}, Lmy/a;-><init>(Ljava/lang/String;Lh20/c2;Lh20/h2;Lh20/w2;Lh20/i1;Li20/b;ZZLh20/l1;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Lh20/t1;Ljava/util/List;Ljava/util/List;Lh20/g3;Ljava/lang/String;Lwz/d0;Ljava/util/Map;Lh20/q3;ZLjava/lang/String;Lh20/h1;)V

    return-object v3

    :pswitch_2a
    new-instance v0, Lmq/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/16 v2, 0xff

    iput v2, v0, Lmq/b;->I:I

    const/4 v2, -0x2

    iput v2, v0, Lmq/b;->K:I

    iput v2, v0, Lmq/b;->L:I

    iput v2, v0, Lmq/b;->M:I

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v2, v0, Lmq/b;->T:Ljava/lang/Boolean;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    iput v2, v0, Lmq/b;->w:I

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    iput-object v2, v0, Lmq/b;->x:Ljava/lang/Integer;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    iput-object v2, v0, Lmq/b;->y:Ljava/lang/Integer;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    iput-object v2, v0, Lmq/b;->z:Ljava/lang/Integer;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    iput-object v2, v0, Lmq/b;->E:Ljava/lang/Integer;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    iput-object v2, v0, Lmq/b;->F:Ljava/lang/Integer;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    iput-object v2, v0, Lmq/b;->G:Ljava/lang/Integer;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    iput-object v2, v0, Lmq/b;->H:Ljava/lang/Integer;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    iput v2, v0, Lmq/b;->I:I

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lmq/b;->J:Ljava/lang/String;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    iput v2, v0, Lmq/b;->K:I

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    iput v2, v0, Lmq/b;->L:I

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    iput v2, v0, Lmq/b;->M:I

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lmq/b;->O:Ljava/lang/CharSequence;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lmq/b;->P:Ljava/lang/CharSequence;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    iput v2, v0, Lmq/b;->Q:I

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    iput-object v2, v0, Lmq/b;->S:Ljava/lang/Integer;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    iput-object v2, v0, Lmq/b;->U:Ljava/lang/Integer;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    iput-object v2, v0, Lmq/b;->V:Ljava/lang/Integer;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    iput-object v2, v0, Lmq/b;->W:Ljava/lang/Integer;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    iput-object v2, v0, Lmq/b;->X:Ljava/lang/Integer;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    iput-object v2, v0, Lmq/b;->Y:Ljava/lang/Integer;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    iput-object v2, v0, Lmq/b;->Z:Ljava/lang/Integer;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    iput-object v2, v0, Lmq/b;->c0:Ljava/lang/Integer;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    iput-object v2, v0, Lmq/b;->a0:Ljava/lang/Integer;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    iput-object v2, v0, Lmq/b;->b0:Ljava/lang/Integer;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    iput-object v2, v0, Lmq/b;->T:Ljava/lang/Boolean;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Ljava/util/Locale;

    iput-object v2, v0, Lmq/b;->N:Ljava/util/Locale;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    iput-object v1, v0, Lmq/b;->d0:Ljava/lang/Boolean;

    return-object v0

    :pswitch_2b
    new-instance v0, Lmn/d;

    invoke-direct {v0, v1}, Lmn/d;-><init>(Landroid/os/Parcel;)V

    return-object v0

    :pswitch_2c
    new-instance v0, Lmn/c;

    invoke-direct {v0, v1}, Lmn/c;-><init>(Landroid/os/Parcel;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
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
        :pswitch_11
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

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x5
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
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lmn/b;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Lp10/h;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Lp10/c;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Lon/e;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Lon/c;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Lon/d;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Lon/b;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Lon/a;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Lio/getstream/video/android/model/StreamCallId;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Lo10/g;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Lo10/d;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Lo10/a;

    return-object p1

    :pswitch_a
    new-array p1, p1, [Lnp/k;

    return-object p1

    :pswitch_b
    new-array p1, p1, [Lnp/j;

    return-object p1

    :pswitch_c
    new-array p1, p1, [Lnp/b;

    return-object p1

    :pswitch_d
    new-array p1, p1, [Lnn/n;

    return-object p1

    :pswitch_e
    new-array p1, p1, [Lnn/m;

    return-object p1

    :pswitch_f
    new-array p1, p1, [Lnn/l;

    return-object p1

    :pswitch_10
    new-array p1, p1, [Lnn/k;

    return-object p1

    :pswitch_11
    new-array p1, p1, [Lnn/j;

    return-object p1

    :pswitch_12
    new-array p1, p1, [Lnn/f;

    return-object p1

    :pswitch_13
    new-array p1, p1, [Lnn/e;

    return-object p1

    :pswitch_14
    new-array p1, p1, [Lnn/d;

    return-object p1

    :pswitch_15
    new-array p1, p1, [Lnn/c;

    return-object p1

    :pswitch_16
    new-array p1, p1, [Lnn/b;

    return-object p1

    :pswitch_17
    new-array p1, p1, [Lnn/a;

    return-object p1

    :pswitch_18
    new-array p1, p1, [Ln20/h;

    return-object p1

    :pswitch_19
    new-array p1, p1, [Lmy/a;

    return-object p1

    :pswitch_1a
    new-array p1, p1, [Lmq/b;

    return-object p1

    :pswitch_1b
    new-array p1, p1, [Lmn/d;

    return-object p1

    :pswitch_1c
    new-array p1, p1, [Lmn/c;

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
