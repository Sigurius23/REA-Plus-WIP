.class public final Lh20/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lh20/n;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lh20/n;->a:I

    packed-switch v2, :pswitch_data_0

    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lh20/c2;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    const-class v5, Lh20/c2;

    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lh20/b2;

    invoke-direct {v2, v3, v4, v1}, Lh20/c2;-><init>(Ljava/lang/String;Ljava/lang/String;Lh20/b2;)V

    return-object v2

    :pswitch_0
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lh20/a2;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lh20/a2;-><init>(Ljava/lang/String;)V

    return-object v2

    :pswitch_1
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lh20/z1;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lh20/z1;-><init>(Ljava/lang/String;)V

    return-object v2

    :pswitch_2
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lh20/y1;

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    const-class v4, Lh20/y1;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Lzy/c;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-direct {v2, v3, v4, v1}, Lh20/y1;-><init>(Ljava/lang/String;Lzy/c;Z)V

    return-object v2

    :pswitch_3
    const-string v2, "parcel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    sget-object v2, Lh20/c2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    :goto_1
    move-object v5, v2

    check-cast v5, Lh20/c2;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    sget-object v2, Lh20/h2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    :goto_2
    move-object v6, v2

    check-cast v6, Lh20/h2;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_3

    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    sget-object v2, Lh20/i1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    :goto_3
    move-object v7, v2

    check-cast v7, Lh20/i1;

    const-class v2, Lh20/x1;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v8

    invoke-virtual {v1, v8}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v8

    check-cast v8, Li20/b;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v9

    const/4 v10, 0x0

    if-eqz v9, :cond_4

    const/4 v9, 0x1

    goto :goto_4

    :cond_4
    move v9, v10

    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v12

    if-eqz v12, :cond_5

    move v12, v10

    const/4 v10, 0x1

    goto :goto_5

    :cond_5
    move v12, v10

    :goto_5
    sget-object v13, Lh20/h1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v13, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lh20/h1;

    move v14, v12

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v12

    sget-object v15, Lh20/l1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v15, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lh20/l1;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    move/from16 v17, v14

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14, v3}, Ljava/util/ArrayList;-><init>(I)V

    move/from16 v11, v17

    :goto_6
    if-eq v11, v3, :cond_6

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v19 .. v19}, Ly00/i;->valueOf(Ljava/lang/String;)Ly00/i;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v0, p0

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    move-object v11, v13

    move-object v13, v15

    if-eqz v0, :cond_7

    const/4 v15, 0x1

    :goto_7
    const/4 v0, 0x0

    goto :goto_8

    :cond_7
    move/from16 v15, v17

    goto :goto_7

    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v16

    move/from16 v3, v17

    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v17

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v19 .. v19}, Lh20/x2;->valueOf(Ljava/lang/String;)Lh20/x2;

    move-result-object v19

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lh20/t1;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    move-object/from16 v22, v0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v23, v2

    const/4 v2, 0x0

    :goto_9
    if-eq v2, v3, :cond_8

    move/from16 v24, v3

    sget-object v3, Lh20/u1;->CREATOR:Landroid/os/Parcelable$Creator;

    move-object/from16 v25, v4

    const/4 v4, 0x1

    invoke-static {v3, v1, v0, v2, v4}, Lnh3/a;->b(Landroid/os/Parcelable$Creator;Landroid/os/Parcel;Ljava/util/ArrayList;II)I

    move-result v2

    move/from16 v3, v24

    move-object/from16 v4, v25

    goto :goto_9

    :cond_8
    move-object/from16 v25, v4

    const/4 v4, 0x1

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_a
    move-object/from16 v24, v0

    if-eq v4, v2, :cond_9

    sget-object v0, Lh20/y1;->CREATOR:Landroid/os/Parcelable$Creator;

    move/from16 v26, v2

    const/4 v2, 0x1

    invoke-static {v0, v1, v3, v4, v2}, Lnh3/a;->b(Landroid/os/Parcelable$Creator;Landroid/os/Parcel;Ljava/util/ArrayList;II)I

    move-result v4

    move-object/from16 v0, v24

    move/from16 v2, v26

    goto :goto_a

    :cond_9
    const/4 v2, 0x1

    sget-object v0, Lh20/w2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh20/w2;

    sget-object v4, Lh20/q3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v4, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh20/q3;

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v18

    if-nez v18, :cond_a

    const/4 v2, 0x0

    goto :goto_b

    :cond_a
    sget-object v2, Lh20/g3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    :goto_b
    check-cast v2, Lh20/g3;

    move-object/from16 v20, v23

    move-object/from16 v23, v4

    move-object/from16 v4, v25

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v25

    move-object/from16 v26, v0

    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    move-object/from16 v27, v2

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    move-object/from16 v28, v3

    const/4 v3, 0x0

    :goto_c
    if-eq v3, v0, :cond_b

    move/from16 v29, v0

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v30

    move/from16 v31, v3

    invoke-static/range {v30 .. v30}, Lh20/i3;->valueOf(Ljava/lang/String;)Lh20/i3;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v31, 0x1

    move/from16 v0, v29

    goto :goto_c

    :cond_b
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_c

    const/16 v18, 0x1

    :goto_d
    move-object/from16 v21, v28

    goto :goto_e

    :cond_c
    const/16 v18, 0x0

    goto :goto_d

    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v28

    new-instance v3, Lh20/x1;

    move-object/from16 v20, v24

    move-object/from16 v24, v27

    move/from16 v27, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v22

    move-object/from16 v22, v26

    move-object/from16 v26, v2

    invoke-direct/range {v3 .. v28}, Lh20/x1;-><init>(Ljava/lang/String;Lh20/c2;Lh20/h2;Lh20/i1;Li20/b;ZZLh20/h1;Ljava/lang/String;Lh20/l1;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Lh20/x2;Lh20/t1;Ljava/util/List;Ljava/util/List;Lh20/w2;Lh20/q3;Lh20/g3;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;)V

    return-object v3

    :pswitch_4
    const-string v0, "parcel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, v1

    new-instance v1, Lh20/v1;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v5

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v7

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v8

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v9

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v10

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v11

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v12

    invoke-direct/range {v1 .. v12}, Lh20/v1;-><init>(IIIIIIIIIII)V

    return-object v1

    :pswitch_5
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lh20/u1;->valueOf(Ljava/lang/String;)Lh20/u1;

    move-result-object v0

    return-object v0

    :pswitch_6
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    :goto_f
    if-eq v3, v1, :cond_d

    sget-object v4, Lh20/r1;->CREATOR:Landroid/os/Parcelable$Creator;

    const/4 v5, 0x1

    invoke-static {v4, v0, v2, v3, v5}, Lnh3/a;->b(Landroid/os/Parcelable$Creator;Landroid/os/Parcel;Ljava/util/ArrayList;II)I

    move-result v3

    goto :goto_f

    :cond_d
    new-instance v0, Lh20/s1;

    invoke-direct {v0, v2}, Lh20/s1;-><init>(Ljava/util/ArrayList;)V

    return-object v0

    :pswitch_7
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lh20/r1;->valueOf(Ljava/lang/String;)Lh20/r1;

    move-result-object v0

    return-object v0

    :pswitch_8
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    :goto_10
    if-eq v3, v1, :cond_e

    sget-object v4, Lh20/r1;->CREATOR:Landroid/os/Parcelable$Creator;

    const/4 v5, 0x1

    invoke-static {v4, v0, v2, v3, v5}, Lnh3/a;->b(Landroid/os/Parcelable$Creator;Landroid/os/Parcel;Ljava/util/ArrayList;II)I

    move-result v3

    goto :goto_10

    :cond_e
    new-instance v0, Lh20/q1;

    invoke-direct {v0, v2}, Lh20/q1;-><init>(Ljava/util/ArrayList;)V

    return-object v0

    :pswitch_9
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    sget-object v0, Lh20/p1;->w:Lh20/p1;

    return-object v0

    :pswitch_a
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lh20/o1;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lh20/n1;->valueOf(Ljava/lang/String;)Lh20/n1;

    move-result-object v0

    invoke-direct {v1, v0}, Lh20/o1;-><init>(Lh20/n1;)V

    return-object v1

    :pswitch_b
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lh20/k1;->valueOf(Ljava/lang/String;)Lh20/k1;

    move-result-object v3

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lh20/k1;->valueOf(Ljava/lang/String;)Lh20/k1;

    move-result-object v4

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lh20/k1;->valueOf(Ljava/lang/String;)Lh20/k1;

    move-result-object v5

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lh20/j1;->valueOf(Ljava/lang/String;)Lh20/j1;

    move-result-object v6

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v2, 0x0

    const/4 v7, 0x1

    if-eqz v1, :cond_f

    move v1, v7

    goto :goto_11

    :cond_f
    move v1, v2

    :goto_11
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v8

    new-instance v9, Ljava/util/LinkedHashSet;

    invoke-direct {v9, v8}, Ljava/util/LinkedHashSet;-><init>(I)V

    :goto_12
    if-eq v2, v8, :cond_10

    invoke-static {v0, v9, v2, v7}, Lte0/d;->e(Landroid/os/Parcel;Ljava/util/LinkedHashSet;II)I

    move-result v2

    goto :goto_12

    :cond_10
    new-instance v2, Lh20/l1;

    move v7, v1

    move-object v8, v9

    invoke-direct/range {v2 .. v8}, Lh20/l1;-><init>(Lh20/k1;Lh20/k1;Lh20/k1;Lh20/j1;ZLjava/util/Set;)V

    return-object v2

    :pswitch_c
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lh20/i1;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_11

    const/4 v2, 0x0

    goto :goto_13

    :cond_11
    sget-object v2, Lh20/x0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    :goto_13
    check-cast v2, Lh20/x0;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v3, v4, v0}, Lh20/i1;-><init>(Lh20/x0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :pswitch_d
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lh20/e1;

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v2

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    invoke-direct {v1, v2, v0}, Lh20/e1;-><init>(FF)V

    return-object v1

    :pswitch_e
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lh20/d1;

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v3

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v4

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v5

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v1, :cond_12

    move v1, v6

    move v6, v7

    goto :goto_14

    :cond_12
    move v1, v6

    :goto_14
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v8

    if-eqz v8, :cond_13

    goto :goto_15

    :cond_13
    move v7, v1

    :goto_15
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v8

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v9

    sget-object v1, Lh20/c1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lh20/c1;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lh20/c1;

    invoke-direct/range {v2 .. v11}, Lh20/d1;-><init>(FFFZZFFLh20/c1;Lh20/c1;)V

    return-object v2

    :pswitch_f
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lh20/c1;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-direct {v1, v2, v3, v0}, Lh20/c1;-><init>(III)V

    return-object v1

    :pswitch_10
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lh20/b1;

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v3

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v4

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v5

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v1, :cond_14

    move v1, v6

    move v6, v7

    move v8, v6

    goto :goto_16

    :cond_14
    move v1, v6

    move v8, v7

    :goto_16
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v7

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v9

    if-eqz v9, :cond_15

    goto :goto_17

    :cond_15
    move v8, v1

    :goto_17
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v9

    sget-object v1, Lh20/a1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lh20/a1;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lh20/a1;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v12

    invoke-direct/range {v2 .. v12}, Lh20/b1;-><init>(FFFZFZFLh20/a1;Lh20/a1;I)V

    return-object v2

    :pswitch_11
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lh20/a1;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-direct {v1, v2, v0}, Lh20/a1;-><init>(II)V

    return-object v1

    :pswitch_12
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lh20/z0;

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v3

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v4

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v5

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v1, :cond_16

    move v1, v6

    move v6, v7

    goto :goto_18

    :cond_16
    move v1, v6

    :goto_18
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v8

    if-eqz v8, :cond_17

    goto :goto_19

    :cond_17
    move v7, v1

    :goto_19
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v8

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v9

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v10

    sget-object v1, Lh20/y0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lh20/y0;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lh20/y0;

    invoke-direct/range {v2 .. v12}, Lh20/z0;-><init>(FFFZZFFFLh20/y0;Lh20/y0;)V

    return-object v2

    :pswitch_13
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lh20/y0;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-direct {v1, v2, v0}, Lh20/y0;-><init>(II)V

    return-object v1

    :pswitch_14
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lh20/g1;

    const-class v2, Lh20/g1;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lh20/f1;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_18

    move-object v3, v4

    goto :goto_1a

    :cond_18
    sget-object v3, Lh20/j2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    :goto_1a
    check-cast v3, Lh20/j2;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-nez v5, :cond_19

    move-object v5, v4

    goto :goto_1b

    :cond_19
    sget-object v5, Lh20/k3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v5, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v5

    :goto_1b
    check-cast v5, Lh20/k3;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v6

    if-nez v6, :cond_1a

    goto :goto_1c

    :cond_1a
    sget-object v4, Lh20/k3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v4, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v4

    :goto_1c
    check-cast v4, Lh20/k3;

    invoke-direct {v1, v2, v3, v5, v4}, Lh20/g1;-><init>(Lh20/f1;Lh20/j2;Lh20/k3;Lh20/k3;)V

    return-object v1

    :pswitch_15
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lh20/h1;

    sget-object v1, Lh20/v1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh20/v1;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lh20/v1;

    sget-object v1, Lh20/c3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lh20/c3;

    sget-object v1, Lh20/l3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lh20/l3;

    sget-object v1, Lh20/y2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lh20/y2;

    sget-object v1, Lh20/g1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lh20/g1;

    sget-object v1, Lh20/j2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lh20/j2;

    sget-object v10, Lh20/h3;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v10, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lh20/h3;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lh20/j2;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lh20/i2;->valueOf(Ljava/lang/String;)Lh20/i2;

    move-result-object v12

    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v13

    invoke-direct/range {v2 .. v13}, Lh20/h1;-><init>(Lh20/v1;Lh20/v1;Lh20/c3;Lh20/l3;Lh20/y2;Lh20/g1;Lh20/j2;Lh20/h3;Lh20/j2;Lh20/i2;F)V

    return-object v2

    :pswitch_16
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lh20/x0;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-direct/range {v2 .. v8}, Lh20/x0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :pswitch_17
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Lh20/m0;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lq20/y;

    sget-object v3, Lwz/d;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwz/d;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-nez v4, :cond_1b

    const/4 v0, 0x0

    goto :goto_1e

    :cond_1b
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v6, 0x0

    :goto_1d
    if-eq v6, v4, :cond_1c

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v7

    invoke-virtual {v0, v7}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1d

    :cond_1c
    move-object v0, v5

    :goto_1e
    new-instance v1, Lh20/m0;

    invoke-direct {v1, v2, v3, v0}, Lh20/m0;-><init>(Lq20/y;Lwz/d;Ljava/util/List;)V

    return-object v1

    :pswitch_18
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    const-class v2, Lh20/l0;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lq20/y;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-nez v4, :cond_1d

    const/4 v2, 0x0

    goto :goto_20

    :cond_1d
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v4

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v6, 0x0

    :goto_1f
    if-eq v6, v4, :cond_1e

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v7

    invoke-virtual {v0, v7}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1f

    :cond_1e
    move-object v2, v5

    :goto_20
    sget-object v4, Lwz/d;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v4, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwz/d;

    new-instance v4, Lh20/l0;

    invoke-direct {v4, v1, v3, v2, v0}, Lh20/l0;-><init>(Ljava/lang/Throwable;Lq20/y;Ljava/util/List;Lwz/d;)V

    return-object v4

    :pswitch_19
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, La30/f1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, La30/f1;

    sget-object v1, Lh20/x1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lh20/x1;

    sget-object v1, Lwz/d;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lwz/d;

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const/4 v2, 0x0

    const/4 v6, 0x1

    if-eqz v1, :cond_1f

    move v1, v6

    goto :goto_21

    :cond_1f
    move v1, v2

    :goto_21
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v7

    if-eqz v7, :cond_20

    move v7, v6

    goto :goto_22

    :cond_20
    move v7, v2

    :goto_22
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v8

    new-instance v9, Ljava/util/LinkedHashSet;

    invoke-direct {v9, v8}, Ljava/util/LinkedHashSet;-><init>(I)V

    :goto_23
    if-eq v2, v8, :cond_21

    invoke-static {v0, v9, v2, v6}, Lte0/d;->e(Landroid/os/Parcel;Ljava/util/LinkedHashSet;II)I

    move-result v2

    goto :goto_23

    :cond_21
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lh20/f0;

    move v6, v1

    move-object v8, v9

    move-object v9, v0

    invoke-direct/range {v2 .. v9}, Lh20/f0;-><init>(La30/f1;Lh20/x1;Lwz/d;ZZLjava/util/Set;Ljava/lang/String;)V

    return-object v2

    :pswitch_1a
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lh20/q;

    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lh20/q;-><init>(Ljava/lang/String;)V

    return-object v1

    :pswitch_1b
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    sget-object v0, Lh20/p;->w:Lh20/p;

    return-object v0

    :pswitch_1c
    move-object v0, v1

    const-string v1, "parcel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    sget-object v0, Lh20/o;->w:Lh20/o;

    return-object v0

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

    iget v0, p0, Lh20/n;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Lh20/c2;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Lh20/a2;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Lh20/z1;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Lh20/y1;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Lh20/x1;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Lh20/v1;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Lh20/u1;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Lh20/s1;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Lh20/r1;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Lh20/q1;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Lh20/p1;

    return-object p1

    :pswitch_a
    new-array p1, p1, [Lh20/o1;

    return-object p1

    :pswitch_b
    new-array p1, p1, [Lh20/l1;

    return-object p1

    :pswitch_c
    new-array p1, p1, [Lh20/i1;

    return-object p1

    :pswitch_d
    new-array p1, p1, [Lh20/e1;

    return-object p1

    :pswitch_e
    new-array p1, p1, [Lh20/d1;

    return-object p1

    :pswitch_f
    new-array p1, p1, [Lh20/c1;

    return-object p1

    :pswitch_10
    new-array p1, p1, [Lh20/b1;

    return-object p1

    :pswitch_11
    new-array p1, p1, [Lh20/a1;

    return-object p1

    :pswitch_12
    new-array p1, p1, [Lh20/z0;

    return-object p1

    :pswitch_13
    new-array p1, p1, [Lh20/y0;

    return-object p1

    :pswitch_14
    new-array p1, p1, [Lh20/g1;

    return-object p1

    :pswitch_15
    new-array p1, p1, [Lh20/h1;

    return-object p1

    :pswitch_16
    new-array p1, p1, [Lh20/x0;

    return-object p1

    :pswitch_17
    new-array p1, p1, [Lh20/m0;

    return-object p1

    :pswitch_18
    new-array p1, p1, [Lh20/l0;

    return-object p1

    :pswitch_19
    new-array p1, p1, [Lh20/f0;

    return-object p1

    :pswitch_1a
    new-array p1, p1, [Lh20/q;

    return-object p1

    :pswitch_1b
    new-array p1, p1, [Lh20/p;

    return-object p1

    :pswitch_1c
    new-array p1, p1, [Lh20/o;

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
