.class public final Ly00/u2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ly00/u2;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Ly00/u2;->a:I

    packed-switch v2, :pswitch_data_0

    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ly00/h4;->valueOf(Ljava/lang/String;)Ly00/h4;

    move-result-object v1

    return-object v1

    :pswitch_0
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ly00/l4;

    sget-object v2, Ly00/h4;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ly00/h4;

    sget-object v2, Ly00/j4;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ly00/j4;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    sget-object v2, Ly00/k4;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    :goto_0
    move-object v10, v2

    check-cast v10, Ly00/k4;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v11

    invoke-direct/range {v3 .. v11}, Ly00/l4;-><init>(Ly00/h4;Ly00/j4;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/k4;Ljava/lang/String;)V

    return-object v3

    :pswitch_1
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ly00/f4;->valueOf(Ljava/lang/String;)Ly00/f4;

    move-result-object v1

    return-object v1

    :pswitch_2
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ly00/e4;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-direct/range {v3 .. v8}, Ly00/e4;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    :pswitch_3
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ly00/d4;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ly00/d4;-><init>(Ljava/lang/String;)V

    return-object v2

    :pswitch_4
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ly00/c4;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Ly00/c4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :pswitch_5
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ly00/b4;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Ly00/b4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :pswitch_6
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ly00/o4;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v6, :cond_2

    move v9, v7

    move v6, v8

    goto :goto_2

    :cond_2
    move v6, v7

    move v9, v6

    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v10

    if-nez v10, :cond_3

    const/4 v10, 0x0

    goto :goto_3

    :cond_3
    sget-object v10, Ly00/f4;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v10, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v10

    :goto_3
    check-cast v10, Ly00/f4;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v11

    if-nez v11, :cond_4

    const/4 v11, 0x0

    goto :goto_4

    :cond_4
    sget-object v11, Ly00/v3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v11, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v11

    :goto_4
    check-cast v11, Ly00/v3;

    move v12, v8

    move-object v8, v10

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v13

    if-nez v13, :cond_5

    const/4 v13, 0x0

    goto :goto_5

    :cond_5
    sget-object v13, Ly00/z3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v13, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v13

    :goto_5
    check-cast v13, Ly00/z3;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v14

    if-nez v14, :cond_6

    const/4 v14, 0x0

    goto :goto_6

    :cond_6
    sget-object v14, Ly00/a4;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v14, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v14

    :goto_6
    check-cast v14, Ly00/a4;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v15

    if-nez v15, :cond_7

    const/4 v15, 0x0

    goto :goto_7

    :cond_7
    sget-object v15, Ly00/b4;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v15, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v15

    :goto_7
    check-cast v15, Ly00/b4;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v16

    if-nez v16, :cond_8

    const/4 v5, 0x0

    goto :goto_8

    :cond_8
    sget-object v5, Ly00/c4;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v5, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v5

    :goto_8
    check-cast v5, Ly00/c4;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v17

    if-nez v17, :cond_9

    const/4 v9, 0x0

    goto :goto_9

    :cond_9
    sget-object v9, Ly00/e4;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v9, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v9

    :goto_9
    check-cast v9, Ly00/e4;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v18

    if-nez v18, :cond_a

    const/4 v12, 0x0

    goto :goto_a

    :cond_a
    sget-object v12, Ly00/s3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v12, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v12

    :goto_a
    check-cast v12, Ly00/s3;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v19

    if-nez v19, :cond_b

    const/4 v0, 0x0

    goto :goto_b

    :cond_b
    sget-object v0, Ly00/t3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    :goto_b
    check-cast v0, Ly00/t3;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v19

    if-nez v19, :cond_c

    move-object/from16 v19, v0

    const/4 v0, 0x0

    goto :goto_c

    :cond_c
    move-object/from16 v19, v0

    sget-object v0, Ly00/m4;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    :goto_c
    check-cast v0, Ly00/m4;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v20

    if-nez v20, :cond_d

    move-object/from16 v20, v0

    const/4 v0, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v20, v0

    sget-object v0, Ly00/d4;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    :goto_d
    check-cast v0, Ly00/d4;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v21

    if-nez v21, :cond_e

    move-object/from16 v21, v0

    const/4 v0, 0x0

    goto :goto_e

    :cond_e
    move-object/from16 v21, v0

    sget-object v0, Ly00/l4;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    :goto_e
    check-cast v0, Ly00/l4;

    const-class v22, Ly00/o4;

    move-object/from16 v23, v0

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Ly00/s2;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v22

    if-eqz v22, :cond_f

    const/16 v22, 0x1

    goto :goto_f

    :cond_f
    const/16 v22, 0x0

    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v17

    move-object/from16 v16, v0

    if-nez v17, :cond_10

    const/4 v0, 0x0

    goto :goto_10

    :cond_10
    sget-object v0, Ly00/r3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    :goto_10
    check-cast v0, Ly00/r3;

    move-object/from16 v17, v15

    move-object v15, v9

    move-object v9, v11

    move-object v11, v13

    move-object/from16 v13, v17

    move-object/from16 v17, v19

    move-object/from16 v18, v20

    move-object/from16 v19, v21

    move-object/from16 v20, v23

    move-object/from16 v23, v0

    move-object/from16 v21, v16

    move-object/from16 v16, v12

    move-object v12, v14

    move-object v14, v5

    move-object v5, v2

    invoke-direct/range {v3 .. v23}, Ly00/o4;-><init>(Ljava/lang/String;Ljava/lang/Long;ZLjava/lang/String;Ly00/f4;Ly00/v3;Ljava/lang/String;Ly00/z3;Ly00/a4;Ly00/b4;Ly00/c4;Ly00/e4;Ly00/s3;Ly00/t3;Ly00/m4;Ly00/d4;Ly00/l4;Ly00/s2;ZLy00/r3;)V

    return-object v3

    :pswitch_7
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly00/a4;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_11

    const/4 v1, 0x1

    goto :goto_11

    :cond_11
    const/4 v1, 0x0

    :goto_11
    invoke-direct {v0, v1}, Ly00/a4;-><init>(Z)V

    return-object v0

    :pswitch_8
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly00/y3;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_12

    const/4 v1, 0x1

    goto :goto_12

    :cond_12
    const/4 v1, 0x0

    :goto_12
    invoke-direct {v0, v1}, Ly00/y3;-><init>(Z)V

    return-object v0

    :pswitch_9
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2, v0}, Ljava/util/LinkedHashSet;-><init>(I)V

    const/4 v3, 0x0

    move v4, v3

    :goto_13
    const/4 v5, 0x1

    if-eq v4, v0, :cond_13

    invoke-static {v1, v2, v4, v5}, Lte0/d;->e(Landroid/os/Parcel;Ljava/util/LinkedHashSet;II)I

    move-result v4

    goto :goto_13

    :cond_13
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_14

    move v3, v5

    :cond_14
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ly00/x3;

    invoke-direct {v1, v3, v0, v2}, Ly00/x3;-><init>(ZLjava/lang/String;Ljava/util/Set;)V

    return-object v1

    :pswitch_a
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly00/z3;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ly00/i;->valueOf(Ljava/lang/String;)Ly00/i;

    move-result-object v2

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_15

    move-object v3, v4

    goto :goto_14

    :cond_15
    sget-object v3, Ly00/w3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    :goto_14
    check-cast v3, Ly00/w3;

    move-object v5, v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    if-nez v6, :cond_16

    move-object v6, v5

    goto :goto_15

    :cond_16
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    :goto_15
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    if-nez v7, :cond_17

    move-object v7, v5

    goto :goto_16

    :cond_17
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    :goto_16
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    move-object v9, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    move-object v10, v9

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v11

    if-nez v11, :cond_18

    move-object v11, v10

    goto :goto_17

    :cond_18
    sget-object v11, Ly00/y3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v11, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v11

    :goto_17
    check-cast v11, Ly00/y3;

    const-class v12, Ly00/z3;

    invoke-virtual {v12}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v12

    invoke-virtual {v1, v12}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v12

    check-cast v12, La10/j;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v13

    if-nez v13, :cond_19

    goto :goto_18

    :cond_19
    sget-object v10, Ly00/x3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v10, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v10

    :goto_18
    check-cast v10, Ly00/x3;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v13

    move-object v1, v12

    move-object v12, v10

    move-object v10, v11

    move-object v11, v1

    move-object v1, v0

    invoke-direct/range {v1 .. v13}, Ly00/z3;-><init>(Ly00/i;Ly00/w3;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/y3;La10/j;Ly00/x3;Ljava/lang/String;)V

    return-object v1

    :pswitch_b
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly00/w3;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v3, v1}, Ly00/w3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_c
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly00/v3;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_1a

    const/4 v2, 0x0

    goto :goto_19

    :cond_1a
    sget-object v2, Ly00/c;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    :goto_19
    check-cast v2, Ly00/c;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v3, v4, v1}, Ly00/v3;-><init>(Ly00/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_d
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly00/t3;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v3, v1}, Ly00/t3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_e
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly00/s3;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v3, v1}, Ly00/s3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_f
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ly00/r3;->valueOf(Ljava/lang/String;)Ly00/r3;

    move-result-object v0

    return-object v0

    :pswitch_10
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    sget-object v0, Ly00/p3;->w:Ly00/p3;

    return-object v0

    :pswitch_11
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly00/o3;

    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ly00/o3;-><init>(J)V

    return-object v0

    :pswitch_12
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    sget-object v0, Ly00/n3;->w:Ly00/n3;

    return-object v0

    :pswitch_13
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly00/j3;

    sget-object v2, Ly00/c;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly00/c;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Ly00/j3;-><init>(Ly00/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :pswitch_14
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly00/i3;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v8

    const/4 v9, 0x0

    if-nez v8, :cond_1b

    move-object v8, v9

    goto :goto_1a

    :cond_1b
    sget-object v8, Ly00/o4;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v8, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v8

    :goto_1a
    check-cast v8, Ly00/o4;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v10

    if-nez v10, :cond_1c

    :goto_1b
    move-object v1, v0

    goto :goto_1c

    :cond_1c
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ly00/h3;->valueOf(Ljava/lang/String;)Ly00/h3;

    move-result-object v9

    goto :goto_1b

    :goto_1c
    invoke-direct/range {v1 .. v9}, Ly00/i3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/o4;Ly00/h3;)V

    return-object v1

    :pswitch_15
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly00/l3;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_1d

    move-object v4, v5

    move-object v7, v4

    goto :goto_1d

    :cond_1d
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    move-object v7, v5

    :goto_1d
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v5

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v8

    if-nez v8, :cond_1e

    move-object v8, v7

    goto :goto_1e

    :cond_1e
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ly00/d3;->valueOf(Ljava/lang/String;)Ly00/d3;

    move-result-object v8

    :goto_1e
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ly00/e3;->valueOf(Ljava/lang/String;)Ly00/e3;

    move-result-object v9

    move-object v10, v7

    move-object v7, v8

    move-object v8, v9

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ly00/g3;->valueOf(Ljava/lang/String;)Ly00/g3;

    move-result-object v11

    move-object v12, v10

    move-object v10, v11

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v11

    move-object v14, v12

    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v12

    move-object v15, v14

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v16, v15

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v17

    const/16 v18, 0x0

    const/16 v19, 0x1

    if-eqz v17, :cond_1f

    move-object/from16 v17, v16

    move/from16 v16, v19

    goto :goto_1f

    :cond_1f
    move-object/from16 v17, v16

    move/from16 v16, v18

    :goto_1f
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v20

    if-nez v20, :cond_20

    move-object/from16 v20, v0

    move-object/from16 v0, v17

    goto :goto_20

    :cond_20
    move-object/from16 v20, v0

    sget-object v0, Ly00/o4;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    :goto_20
    check-cast v0, Ly00/o4;

    move/from16 v21, v18

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v18

    move/from16 v22, v19

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v23

    if-nez v23, :cond_21

    move-object/from16 v23, v17

    goto :goto_21

    :cond_21
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v23

    invoke-static/range {v23 .. v23}, Lcom/stripe/android/model/StripeIntent$Status;->valueOf(Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v23

    :goto_21
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v24

    if-nez v24, :cond_22

    move-object/from16 v24, v17

    goto :goto_22

    :cond_22
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v24

    invoke-static/range {v24 .. v24}, Lcom/stripe/android/model/StripeIntent$Usage;->valueOf(Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent$Usage;

    move-result-object v24

    :goto_22
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v25

    if-nez v25, :cond_23

    move-object/from16 v25, v0

    move-object/from16 v0, v17

    goto :goto_23

    :cond_23
    move-object/from16 v25, v0

    sget-object v0, Ly00/i3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    :goto_23
    check-cast v0, Ly00/i3;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v26

    if-nez v26, :cond_24

    move-object/from16 v30, v17

    move-object/from16 v17, v0

    move-object/from16 v0, v30

    goto :goto_24

    :cond_24
    move-object/from16 v17, v0

    sget-object v0, Ly00/j3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    :goto_24
    check-cast v0, Ly00/j3;

    move/from16 v26, v21

    move-object/from16 v21, v24

    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v24

    move/from16 v27, v22

    move-object/from16 v22, v17

    move-object/from16 v17, v25

    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v25

    const-class v28, Ly00/l3;

    move-object/from16 v29, v0

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Ly00/b8;

    move/from16 v28, v27

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v27

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_25

    move-object/from16 v26, v0

    move-object/from16 v1, v20

    move-object/from16 v20, v23

    move-object/from16 v23, v29

    goto :goto_25

    :cond_25
    move/from16 v28, v26

    move-object/from16 v1, v20

    move-object/from16 v20, v23

    move-object/from16 v23, v29

    move-object/from16 v26, v0

    :goto_25
    invoke-direct/range {v1 .. v28}, Ly00/l3;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;JLy00/d3;Ly00/e3;Ljava/lang/String;Ly00/g3;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZLy00/o4;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Ly00/i3;Ly00/j3;Ljava/util/List;Ljava/util/List;Ly00/b8;Ljava/lang/String;Z)V

    return-object v1

    :pswitch_16
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly00/c3;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Ly00/c3;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_17
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly00/b3;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ly00/b3;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_18
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly00/a3;

    sget-object v2, Ly00/z2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly00/z2;

    invoke-direct {v0, v1}, Ly00/a3;-><init>(Ly00/z2;)V

    return-object v0

    :pswitch_19
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly00/z2;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_26

    const/4 v1, 0x1

    goto :goto_26

    :cond_26
    const/4 v1, 0x0

    :goto_26
    invoke-direct {v0, v1}, Ly00/z2;-><init>(Z)V

    return-object v0

    :pswitch_1a
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly00/w2;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_27

    const/4 v1, 0x1

    goto :goto_27

    :cond_27
    const/4 v1, 0x0

    :goto_27
    invoke-direct {v0, v2, v3, v1}, Ly00/w2;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0

    :pswitch_1b
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly00/x2;

    const-class v2, Ly00/x2;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Ly00/w2;

    invoke-direct {v0, v1}, Ly00/x2;-><init>(Ly00/w2;)V

    return-object v0

    :pswitch_1c
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly00/v2;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ly00/f4;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly00/f4;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-nez v4, :cond_28

    const/4 v4, 0x0

    goto :goto_28

    :cond_28
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :goto_28
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Ly00/v2;-><init>(Ljava/lang/String;Ly00/f4;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

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

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ly00/u2;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Ly00/h4;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Ly00/l4;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Ly00/f4;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Ly00/e4;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Ly00/d4;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Ly00/c4;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Ly00/b4;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Ly00/o4;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Ly00/a4;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Ly00/y3;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Ly00/x3;

    return-object p1

    :pswitch_a
    new-array p1, p1, [Ly00/z3;

    return-object p1

    :pswitch_b
    new-array p1, p1, [Ly00/w3;

    return-object p1

    :pswitch_c
    new-array p1, p1, [Ly00/v3;

    return-object p1

    :pswitch_d
    new-array p1, p1, [Ly00/t3;

    return-object p1

    :pswitch_e
    new-array p1, p1, [Ly00/s3;

    return-object p1

    :pswitch_f
    new-array p1, p1, [Ly00/r3;

    return-object p1

    :pswitch_10
    new-array p1, p1, [Ly00/p3;

    return-object p1

    :pswitch_11
    new-array p1, p1, [Ly00/o3;

    return-object p1

    :pswitch_12
    new-array p1, p1, [Ly00/n3;

    return-object p1

    :pswitch_13
    new-array p1, p1, [Ly00/j3;

    return-object p1

    :pswitch_14
    new-array p1, p1, [Ly00/i3;

    return-object p1

    :pswitch_15
    new-array p1, p1, [Ly00/l3;

    return-object p1

    :pswitch_16
    new-array p1, p1, [Ly00/c3;

    return-object p1

    :pswitch_17
    new-array p1, p1, [Ly00/b3;

    return-object p1

    :pswitch_18
    new-array p1, p1, [Ly00/a3;

    return-object p1

    :pswitch_19
    new-array p1, p1, [Ly00/z2;

    return-object p1

    :pswitch_1a
    new-array p1, p1, [Ly00/w2;

    return-object p1

    :pswitch_1b
    new-array p1, p1, [Ly00/x2;

    return-object p1

    :pswitch_1c
    new-array p1, p1, [Ly00/v2;

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
