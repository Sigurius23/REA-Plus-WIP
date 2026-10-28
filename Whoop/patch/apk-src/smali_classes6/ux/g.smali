.class public final Lux/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lux/g;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 42

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lux/g;->a:I

    packed-switch v2, :pswitch_data_0

    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    sget-object v1, Lv00/f0;->w:Lv00/f0;

    return-object v1

    :pswitch_0
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lv00/e0;

    const-class v3, Lv00/e0;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Ly00/r3;

    invoke-direct {v2, v1}, Lv00/e0;-><init>(Ly00/r3;)V

    return-object v2

    :pswitch_1
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lv00/c0;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ly00/c8;

    sget-object v3, Lh20/l1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lh20/l1;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    const/4 v7, 0x1

    if-eqz v3, :cond_0

    move v3, v7

    goto :goto_0

    :cond_0
    move v3, v7

    const/4 v7, 0x0

    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v8

    if-eqz v8, :cond_1

    move v8, v3

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v9

    if-eqz v9, :cond_2

    move v9, v3

    goto :goto_2

    :cond_2
    const/4 v9, 0x0

    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v10

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11, v10}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v12, 0x0

    :goto_3
    if-eq v12, v10, :cond_3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lv00/s0;->valueOf(Ljava/lang/String;)Lv00/s0;

    move-result-object v13

    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v10

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v12

    invoke-virtual {v1, v12}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v12

    check-cast v12, Lw30/c;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v15

    const/16 v16, 0x0

    if-nez v15, :cond_4

    move-object/from16 v15, v16

    goto :goto_4

    :cond_4
    sget-object v15, Lh20/i1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v15, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v15

    :goto_4
    check-cast v15, Lh20/i1;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Li20/b;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v19, v2

    const/4 v2, 0x0

    :goto_5
    if-eq v2, v4, :cond_5

    move/from16 v20, v2

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v20, 0x1

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v20, v0

    const/4 v0, 0x0

    :goto_6
    if-eq v0, v2, :cond_6

    move/from16 v21, v0

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v21, 0x1

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v21, v3

    const/4 v3, 0x0

    :goto_7
    if-eq v3, v0, :cond_7

    move/from16 v22, v0

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    move/from16 v0, v22

    goto :goto_7

    :cond_7
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lv00/p;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    if-eqz v3, :cond_8

    move-object/from16 v3, v21

    const/16 v21, 0x1

    :goto_8
    move-object/from16 v22, v0

    goto :goto_9

    :cond_8
    move-object/from16 v3, v21

    const/16 v21, 0x0

    goto :goto_8

    :goto_9
    sget-object v0, Lh20/w2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh20/w2;

    move-object/from16 v23, v0

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lv00/i0;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v24

    if-nez v24, :cond_9

    move-object/from16 v24, v16

    :goto_a
    move-object/from16 v25, v0

    goto :goto_b

    :cond_9
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v24

    invoke-static/range {v24 .. v24}, Ly00/p2;->valueOf(Ljava/lang/String;)Ly00/p2;

    move-result-object v24

    goto :goto_a

    :goto_b
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, La30/m0;

    move-object/from16 v26, v0

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lq20/c;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v27

    if-nez v27, :cond_a

    :goto_c
    move-object/from16 v27, v16

    move-object/from16 v16, v0

    goto :goto_d

    :cond_a
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lf20/b;->valueOf(Ljava/lang/String;)Lf20/b;

    move-result-object v16

    goto :goto_c

    :goto_d
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v28, v0

    check-cast v28, Lux/a;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v29, v0

    check-cast v29, Lux/b;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    move-object/from16 v30, v2

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    move-object/from16 v31, v3

    const/4 v3, 0x0

    :goto_e
    if-eq v3, v0, :cond_b

    move/from16 v32, v0

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v33

    move/from16 v34, v3

    invoke-static/range {v33 .. v33}, Lh20/i3;->valueOf(Ljava/lang/String;)Lh20/i3;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v34, 0x1

    move/from16 v0, v32

    goto :goto_e

    :cond_b
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    move-object/from16 v3, v31

    if-eqz v0, :cond_c

    const/16 v31, 0x1

    goto :goto_f

    :cond_c
    const/16 v31, 0x0

    :goto_f
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v32, v0

    check-cast v32, Ly00/c3;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_d

    const/16 v33, 0x1

    goto :goto_10

    :cond_d
    const/16 v33, 0x0

    :goto_10
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v34, v0

    check-cast v34, Ly00/n;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_e

    const/16 v35, 0x1

    goto :goto_11

    :cond_e
    const/16 v35, 0x0

    :goto_11
    sget-object v0, Lh20/h1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v36, v0

    check-cast v36, Lh20/h1;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v37

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v38, v0

    check-cast v38, Lv00/a0;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v39, v0

    check-cast v39, Lv00/n;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v40, v0

    check-cast v40, Ly00/r1;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_f

    const/16 v41, 0x1

    :goto_12
    move-object/from16 v18, v4

    goto :goto_13

    :cond_f
    const/16 v41, 0x0

    goto :goto_12

    :goto_13
    new-instance v4, Lv00/c0;

    move-object/from16 v17, v11

    move-object v11, v10

    move-object/from16 v10, v17

    move-object/from16 v17, v20

    move-object/from16 v20, v22

    move-object/from16 v22, v23

    move-object/from16 v23, v25

    move-object/from16 v25, v26

    move-object/from16 v19, v30

    move-object/from16 v30, v2

    move-object/from16 v26, v16

    move-object/from16 v16, v3

    invoke-direct/range {v4 .. v41}, Lv00/c0;-><init>(Ly00/c8;Lh20/l1;ZZZLjava/util/List;Ljava/util/List;Lw30/c;Ljava/lang/String;Ljava/lang/String;Lh20/i1;Li20/b;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lv00/p;ZLh20/w2;Lv00/i0;Ly00/p2;La30/m0;Lq20/c;Lf20/b;Lux/a;Lux/b;Ljava/util/Map;ZLy00/c3;ZLy00/n;ZLh20/h1;Ljava/lang/String;Lv00/a0;Lv00/n;Ly00/r1;Z)V

    return-object v4

    :pswitch_2
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lv00/z;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lv00/z;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_3
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lv00/x;

    sget-object v2, Lh20/u2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh20/u2;

    invoke-direct {v0, v1}, Lv00/x;-><init>(Lh20/u2;)V

    return-object v0

    :pswitch_4
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lv00/w;

    sget-object v2, Lh20/u2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh20/u2;

    invoke-direct {v0, v1}, Lv00/w;-><init>(Lh20/u2;)V

    return-object v0

    :pswitch_5
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lv00/v;

    sget-object v2, Lh20/u2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh20/u2;

    invoke-direct {v0, v1}, Lv00/v;-><init>(Lh20/u2;)V

    return-object v0

    :pswitch_6
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lv00/u;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lv00/t;->valueOf(Ljava/lang/String;)Lv00/t;

    move-result-object v1

    invoke-direct {v0, v1}, Lv00/u;-><init>(Lv00/t;)V

    return-object v0

    :pswitch_7
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    sget-object v0, Lv00/s;->w:Lv00/s;

    return-object v0

    :pswitch_8
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lv00/r;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lv00/r;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_9
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lv00/q;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    const-class v5, Lv00/q;

    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Lzy/c;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_10

    const/4 v1, 0x1

    :goto_14
    move v6, v1

    move-object v1, v0

    goto :goto_15

    :cond_10
    const/4 v1, 0x0

    goto :goto_14

    :goto_15
    invoke-direct/range {v1 .. v6}, Lv00/q;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzy/c;Z)V

    return-object v1

    :pswitch_a
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lv00/o;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lmy/b;->valueOf(Ljava/lang/String;)Lmy/b;

    move-result-object v2

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_11

    move v3, v5

    goto :goto_16

    :cond_11
    move v3, v4

    :goto_16
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    if-eqz v6, :cond_12

    move v6, v5

    goto :goto_17

    :cond_12
    move v6, v4

    :goto_17
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_13

    move v4, v5

    :cond_13
    invoke-direct {v0, v2, v3, v6, v4}, Lv00/o;-><init>(Lmy/b;ZZZ)V

    return-object v0

    :pswitch_b
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lv00/p;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-eqz v5, :cond_14

    const/4 v5, 0x1

    goto :goto_18

    :cond_14
    const/4 v5, 0x0

    :goto_18
    sget-object v6, Lv00/o;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v6, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lv00/o;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lv00/p;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLv00/o;)V

    return-object v1

    :pswitch_c
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lv00/l;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lv00/l;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_d
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lv00/k;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_15

    const/4 v1, 0x0

    goto :goto_1a

    :cond_15
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_16

    const/4 v1, 0x1

    goto :goto_19

    :cond_16
    const/4 v1, 0x0

    :goto_19
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    :goto_1a
    invoke-direct {v0, v1}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    return-object v0

    :pswitch_e
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    const/4 v3, 0x0

    :goto_1b
    if-eq v3, v0, :cond_17

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    const-class v5, Lv00/j;

    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1b

    :cond_17
    new-instance v0, Lv00/j;

    invoke-direct {v0, v2}, Lv00/j;-><init>(Ljava/util/Map;)V

    return-object v0

    :pswitch_f
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    const/4 v3, 0x0

    :goto_1c
    if-eq v3, v0, :cond_18

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    const-class v5, Lv00/n;

    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1c

    :cond_18
    new-instance v0, Lv00/n;

    invoke-direct {v0, v2}, Lv00/n;-><init>(Ljava/util/Map;)V

    return-object v0

    :pswitch_10
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lux/h0;

    sget-object v2, Ly00/g6;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly00/g6;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v3, v1}, Lux/h0;-><init>(Ly00/g6;ILjava/lang/String;)V

    return-object v0

    :pswitch_11
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lux/c0;

    sget-object v2, Ly00/g6;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly00/g6;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Lux/c0;-><init>(Ljava/lang/String;Ly00/g6;)V

    return-object v0

    :pswitch_12
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lux/b0;

    sget-object v2, Ly00/l3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly00/l3;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lux/b0;-><init>(Ly00/l3;Ljava/lang/String;)V

    return-object v0

    :pswitch_13
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lux/a0;

    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type com.stripe.android.core.exception.StripeException"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lcom/stripe/android/core/exception/StripeException;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-direct {v0, v2, v1}, Lux/a0;-><init>(Lcom/stripe/android/core/exception/StripeException;I)V

    return-object v0

    :pswitch_14
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lux/z;

    sget-object v2, Ly00/l3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly00/l3;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v3, v1}, Lux/z;-><init>(Ly00/l3;ILjava/lang/String;)V

    return-object v0

    :pswitch_15
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lux/y;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lux/y;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_16
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lux/s;

    const-class v2, Lux/s;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lm30/h;

    invoke-direct {v0, v1}, Lux/s;-><init>(Lm30/h;)V

    return-object v0

    :pswitch_17
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lux/r;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    sget-object v3, Lux/s;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lux/s;

    invoke-direct {v0, v2, v1}, Lux/r;-><init>(ILux/s;)V

    return-object v0

    :pswitch_18
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, v1

    new-instance v1, Lux/p;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lux/o;->valueOf(Ljava/lang/String;)Lux/o;

    move-result-object v3

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    const/4 v7, 0x0

    if-nez v6, :cond_19

    move-object v6, v7

    move-object v8, v6

    goto :goto_1d

    :cond_19
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    move-object v8, v7

    :goto_1d
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v9

    if-nez v9, :cond_1a

    goto :goto_1e

    :cond_1a
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lux/n;->valueOf(Ljava/lang/String;)Lux/n;

    move-result-object v0

    move-object v8, v0

    :goto_1e
    invoke-direct/range {v1 .. v8}, Lux/p;-><init>(Ljava/lang/String;Lux/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lux/n;)V

    return-object v1

    :pswitch_19
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lux/m;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lux/l;->valueOf(Ljava/lang/String;)Lux/l;

    move-result-object v0

    invoke-direct {v1, v0}, Lux/m;-><init>(Lux/l;)V

    return-object v1

    :pswitch_1a
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lux/k;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lux/m;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lux/m;

    invoke-direct {v1, v2, v0}, Lux/k;-><init>(Ljava/lang/String;Lux/m;)V

    return-object v1

    :pswitch_1b
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lux/j;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1b

    move v2, v4

    goto :goto_1f

    :cond_1b
    move v2, v3

    :goto_1f
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lux/i;->valueOf(Ljava/lang/String;)Lux/i;

    move-result-object v5

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_1c

    move v3, v4

    :cond_1c
    invoke-direct {v1, v2, v5, v3}, Lux/j;-><init>(ZLux/i;Z)V

    return-object v1

    :pswitch_1c
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    sget-object v0, Lux/h;->w:Lux/h;

    return-object v0

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

    iget v0, p0, Lux/g;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Lv00/f0;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Lv00/e0;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Lv00/c0;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Lv00/z;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Lv00/x;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Lv00/w;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Lv00/v;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Lv00/u;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Lv00/s;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Lv00/r;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Lv00/q;

    return-object p1

    :pswitch_a
    new-array p1, p1, [Lv00/o;

    return-object p1

    :pswitch_b
    new-array p1, p1, [Lv00/p;

    return-object p1

    :pswitch_c
    new-array p1, p1, [Lv00/l;

    return-object p1

    :pswitch_d
    new-array p1, p1, [Lv00/k;

    return-object p1

    :pswitch_e
    new-array p1, p1, [Lv00/j;

    return-object p1

    :pswitch_f
    new-array p1, p1, [Lv00/n;

    return-object p1

    :pswitch_10
    new-array p1, p1, [Lux/h0;

    return-object p1

    :pswitch_11
    new-array p1, p1, [Lux/c0;

    return-object p1

    :pswitch_12
    new-array p1, p1, [Lux/b0;

    return-object p1

    :pswitch_13
    new-array p1, p1, [Lux/a0;

    return-object p1

    :pswitch_14
    new-array p1, p1, [Lux/z;

    return-object p1

    :pswitch_15
    new-array p1, p1, [Lux/y;

    return-object p1

    :pswitch_16
    new-array p1, p1, [Lux/s;

    return-object p1

    :pswitch_17
    new-array p1, p1, [Lux/r;

    return-object p1

    :pswitch_18
    new-array p1, p1, [Lux/p;

    return-object p1

    :pswitch_19
    new-array p1, p1, [Lux/m;

    return-object p1

    :pswitch_1a
    new-array p1, p1, [Lux/k;

    return-object p1

    :pswitch_1b
    new-array p1, p1, [Lux/j;

    return-object p1

    :pswitch_1c
    new-array p1, p1, [Lux/h;

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
