.class public final synthetic Lqa/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyr/e;
.implements Lqw/o;
.implements Llo/h;
.implements Llo/i;
.implements Lrm/e;
.implements Lh5/u;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lqa/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lrm/u;)V
    .locals 0

    .line 2
    const/16 p1, 0xc

    iput p1, p0, Lqa/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Llo/f;)V
    .locals 1

    check-cast p1, Lrm/z0;

    new-instance v0, Lrm/y0;

    invoke-direct {v0, p2}, Lrm/y0;-><init>(Llo/f;)V

    invoke-interface {p1, v0}, Lrm/z0;->k(Lrm/y0;)V

    return-void
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lqa/b;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lsm/d;

    check-cast p1, Llo/t;

    invoke-direct {v0, p1}, Lsm/d;-><init>(Llo/t;)V

    return-object v0

    :pswitch_0
    check-cast p1, Lqa/a;

    iget-wide v0, p1, Lqa/a;->b:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const-wide/16 v0, 0x0

    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public construct()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lqa/b;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    return-object v0

    :pswitch_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    :pswitch_2
    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentSkipListMap;-><init>()V

    return-object v0

    :pswitch_3
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    return-object v0

    :pswitch_4
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    return-object v0

    :pswitch_5
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    return-object v0

    :pswitch_6
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    return-object v0

    :pswitch_7
    new-instance v0, Lqw/n;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lqw/n;-><init>(Z)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
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

.method public e(Landroid/os/Bundle;)Lrm/f;
    .locals 48

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lqa/b;->w:I

    const-string v3, ""

    const/4 v12, 0x7

    const/4 v13, 0x6

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v18, 0x0

    const/4 v6, 0x5

    const/4 v7, 0x4

    const/4 v8, -0x1

    const/4 v14, 0x3

    const/4 v15, 0x2

    const/4 v9, 0x0

    const/16 v10, 0x24

    const/4 v11, 0x1

    packed-switch v2, :pswitch_data_0

    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    if-nez v2, :cond_0

    move-object/from16 v3, v18

    goto :goto_1

    :cond_0
    sget-object v4, Lrm/c0;->h0:Lqa/b;

    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    sget-object v6, Lzr/g0;->x:Lzr/e0;

    sget-object v6, Lzr/w0;->E:Lzr/w0;

    if-nez v5, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v4, v5}, Llo/a;->q(Lrm/e;Ljava/util/ArrayList;)Lzr/w0;

    move-result-object v6

    :goto_0
    invoke-static {v11, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lsn/w0;

    new-array v4, v9, [Lrm/c0;

    invoke-virtual {v6, v4}, Lzr/b0;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Lrm/c0;

    invoke-direct {v3, v2, v4}, Lsn/w0;-><init>(Ljava/lang/String;[Lrm/c0;)V

    :goto_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v11, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v2

    iget v4, v3, Lsn/w0;->w:I

    new-array v5, v4, [I

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    move-object v2, v5

    :goto_2
    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v5

    invoke-static {v14, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroid/os/BaseBundle;->getBooleanArray(Ljava/lang/String;)[Z

    move-result-object v1

    new-array v4, v4, [Z

    if-eqz v1, :cond_3

    goto :goto_3

    :cond_3
    move-object v1, v4

    :goto_3
    new-instance v4, Lrm/p1;

    invoke-direct {v4, v3, v2, v5, v1}, Lrm/p1;-><init>(Lsn/w0;[II[Z)V

    return-object v4

    :pswitch_0
    invoke-static {v11, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_4

    sget-object v3, Lrm/k0;->F:Lqa/b;

    invoke-virtual {v3, v2}, Lqa/b;->e(Landroid/os/Bundle;)Lrm/f;

    move-result-object v2

    check-cast v2, Lrm/k0;

    move-object/from16 v29, v2

    goto :goto_4

    :cond_4
    move-object/from16 v29, v18

    :goto_4
    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v31

    invoke-static {v14, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v33

    invoke-static {v7, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v35

    invoke-static {v6, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v9}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v37

    invoke-static {v13, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v9}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v38

    invoke-static {v12, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_5

    new-instance v39, Lrm/h0;

    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v40

    invoke-static {v11, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v42

    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v44

    invoke-static {v14, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    const v6, -0x800001

    invoke-virtual {v2, v3, v6}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v46

    invoke-static {v7, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v6}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v47

    invoke-direct/range {v39 .. v47}, Lrm/h0;-><init>(JJJFF)V

    :goto_5
    const/16 v2, 0x8

    goto :goto_6

    :cond_5
    move-object/from16 v39, v18

    goto :goto_5

    :goto_6
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v9}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    const/16 v3, 0x9

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    const-wide/16 v6, 0x0

    invoke-virtual {v1, v3, v6, v7}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v40

    const/16 v3, 0xa

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v42

    const/16 v3, 0xb

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v44

    const/16 v3, 0xc

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v45

    const/16 v3, 0xd

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v6, v7}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v46

    new-instance v27, Lrm/n1;

    invoke-direct/range {v27 .. v27}, Lrm/n1;-><init>()V

    sget-object v28, Lrm/n1;->S:Ljava/lang/Object;

    const/16 v30, 0x0

    invoke-virtual/range {v27 .. v47}, Lrm/n1;->b(Ljava/lang/Object;Lrm/k0;Ljava/lang/Object;JJJZZLrm/h0;JJIIJ)V

    move-object/from16 v1, v27

    iput-boolean v2, v1, Lrm/n1;->L:Z

    return-object v1

    :pswitch_1
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v27

    invoke-static {v11, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v28

    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    const-wide/16 v3, 0x0

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v30

    invoke-static {v14, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v33

    invoke-static {v7, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_6

    sget-object v2, Ltn/b;->H:Lsm/c;

    invoke-virtual {v2, v1}, Lsm/c;->e(Landroid/os/Bundle;)Lrm/f;

    move-result-object v1

    check-cast v1, Ltn/b;

    :goto_7
    move-object/from16 v32, v1

    goto :goto_8

    :cond_6
    sget-object v1, Ltn/b;->F:Ltn/b;

    goto :goto_7

    :goto_8
    new-instance v24, Lrm/m1;

    invoke-direct/range {v24 .. v24}, Lrm/m1;-><init>()V

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-virtual/range {v24 .. v33}, Lrm/m1;->h(Ljava/lang/Object;Ljava/lang/Object;IJJLtn/b;Z)V

    return-object v24

    :pswitch_2
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    if-ne v2, v14, :cond_7

    move v2, v11

    goto :goto_9

    :cond_7
    move v2, v9

    :goto_9
    invoke-static {v2}, Llo/a;->e(Z)V

    invoke-static {v11, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v9}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_8

    new-instance v2, Lrm/k1;

    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v9}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-direct {v2, v1}, Lrm/k1;-><init>(Z)V

    goto :goto_a

    :cond_8
    new-instance v2, Lrm/k1;

    invoke-direct {v2}, Lrm/k1;-><init>()V

    :goto_a
    return-object v2

    :pswitch_3
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    if-ne v2, v15, :cond_9

    move v9, v11

    :cond_9
    invoke-static {v9}, Llo/a;->e(Z)V

    invoke-static {v11, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    const/high16 v4, -0x40800000    # -1.0f

    invoke-virtual {v1, v3, v4}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v1

    cmpl-float v3, v1, v4

    if-nez v3, :cond_a

    new-instance v1, Lrm/i1;

    invoke-direct {v1, v2}, Lrm/i1;-><init>(I)V

    goto :goto_b

    :cond_a
    new-instance v3, Lrm/i1;

    invoke-direct {v3, v2, v1}, Lrm/i1;-><init>(IF)V

    move-object v1, v3

    :goto_b
    return-object v1

    :pswitch_4
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    if-eqz v2, :cond_14

    if-eq v2, v11, :cond_11

    if-eq v2, v15, :cond_e

    if-ne v2, v14, :cond_d

    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    if-ne v2, v14, :cond_b

    move v2, v11

    goto :goto_c

    :cond_b
    move v2, v9

    :goto_c
    invoke-static {v2}, Llo/a;->e(Z)V

    invoke-static {v11, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v9}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_c

    new-instance v2, Lrm/k1;

    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v9}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-direct {v2, v1}, Lrm/k1;-><init>(Z)V

    goto/16 :goto_e

    :cond_c
    new-instance v2, Lrm/k1;

    invoke-direct {v2}, Lrm/k1;-><init>()V

    goto/16 :goto_e

    :cond_d
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const/16 v3, 0x1f

    const-string v4, "Unknown RatingType: "

    invoke-static {v3, v2, v4}, Lr80/c;->j(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_e
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    if-ne v2, v15, :cond_f

    move v9, v11

    :cond_f
    invoke-static {v9}, Llo/a;->e(Z)V

    invoke-static {v11, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    const/high16 v4, -0x40800000    # -1.0f

    invoke-virtual {v1, v3, v4}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v1

    cmpl-float v3, v1, v4

    if-nez v3, :cond_10

    new-instance v1, Lrm/i1;

    invoke-direct {v1, v2}, Lrm/i1;-><init>(I)V

    move-object v2, v1

    goto :goto_e

    :cond_10
    new-instance v3, Lrm/i1;

    invoke-direct {v3, v2, v1}, Lrm/i1;-><init>(IF)V

    move-object v2, v3

    goto :goto_e

    :cond_11
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    if-ne v2, v11, :cond_12

    move v9, v11

    :cond_12
    invoke-static {v9}, Llo/a;->e(Z)V

    invoke-static {v11, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    const/high16 v4, -0x40800000    # -1.0f

    invoke-virtual {v1, v2, v4}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v1

    cmpl-float v2, v1, v4

    if-nez v2, :cond_13

    new-instance v2, Lrm/u0;

    invoke-direct {v2}, Lrm/u0;-><init>()V

    goto :goto_e

    :cond_13
    new-instance v2, Lrm/u0;

    invoke-direct {v2, v1}, Lrm/u0;-><init>(F)V

    goto :goto_e

    :cond_14
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    if-nez v2, :cond_15

    move v2, v11

    goto :goto_d

    :cond_15
    move v2, v9

    :goto_d
    invoke-static {v2}, Llo/a;->e(Z)V

    invoke-static {v11, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v9}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_16

    new-instance v2, Lrm/d0;

    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v9}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-direct {v2, v1}, Lrm/d0;-><init>(Z)V

    goto :goto_e

    :cond_16
    new-instance v2, Lrm/d0;

    invoke-direct {v2}, Lrm/d0;-><init>()V

    :goto_e
    return-object v2

    :pswitch_5
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    if-ne v2, v11, :cond_17

    move v9, v11

    :cond_17
    invoke-static {v9}, Llo/a;->e(Z)V

    invoke-static {v11, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    const/high16 v4, -0x40800000    # -1.0f

    invoke-virtual {v1, v2, v4}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v1

    cmpl-float v2, v1, v4

    if-nez v2, :cond_18

    new-instance v1, Lrm/u0;

    invoke-direct {v1}, Lrm/u0;-><init>()V

    goto :goto_f

    :cond_18
    new-instance v2, Lrm/u0;

    invoke-direct {v2, v1}, Lrm/u0;-><init>(F)V

    move-object v1, v2

    :goto_f
    return-object v1

    :pswitch_6
    new-instance v2, Lrm/l0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v3

    iput-object v3, v2, Lrm/l0;->a:Ljava/lang/CharSequence;

    invoke-static {v11, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v3

    iput-object v3, v2, Lrm/l0;->b:Ljava/lang/CharSequence;

    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v3

    iput-object v3, v2, Lrm/l0;->c:Ljava/lang/CharSequence;

    invoke-static {v14, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v3

    iput-object v3, v2, Lrm/l0;->d:Ljava/lang/CharSequence;

    invoke-static {v7, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v3

    iput-object v3, v2, Lrm/l0;->e:Ljava/lang/CharSequence;

    invoke-static {v6, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v3

    iput-object v3, v2, Lrm/l0;->f:Ljava/lang/CharSequence;

    invoke-static {v13, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v3

    iput-object v3, v2, Lrm/l0;->g:Ljava/lang/CharSequence;

    invoke-static {v12, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroid/net/Uri;

    iput-object v3, v2, Lrm/l0;->h:Landroid/net/Uri;

    const/16 v3, 0xa

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v3

    const/16 v4, 0x1d

    invoke-static {v4, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_19

    invoke-static {v4, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_10

    :cond_19
    move-object/from16 v4, v18

    :goto_10
    if-nez v3, :cond_1a

    :goto_11
    move-object/from16 v3, v18

    goto :goto_12

    :cond_1a
    invoke-virtual {v3}, [B->clone()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v18, v3

    check-cast v18, [B

    goto :goto_11

    :goto_12
    iput-object v3, v2, Lrm/l0;->k:[B

    iput-object v4, v2, Lrm/l0;->l:Ljava/lang/Integer;

    const/16 v3, 0xb

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroid/net/Uri;

    iput-object v3, v2, Lrm/l0;->m:Landroid/net/Uri;

    const/16 v3, 0x16

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v3

    iput-object v3, v2, Lrm/l0;->x:Ljava/lang/CharSequence;

    const/16 v3, 0x17

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v3

    iput-object v3, v2, Lrm/l0;->y:Ljava/lang/CharSequence;

    const/16 v3, 0x18

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v3

    iput-object v3, v2, Lrm/l0;->z:Ljava/lang/CharSequence;

    const/16 v3, 0x1b

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v3

    iput-object v3, v2, Lrm/l0;->C:Ljava/lang/CharSequence;

    const/16 v3, 0x1c

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v3

    iput-object v3, v2, Lrm/l0;->D:Ljava/lang/CharSequence;

    const/16 v3, 0x1e

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v3

    iput-object v3, v2, Lrm/l0;->E:Ljava/lang/CharSequence;

    const/16 v3, 0x3e8

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    iput-object v3, v2, Lrm/l0;->F:Landroid/os/Bundle;

    const/16 v3, 0x8

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    sget-object v5, Lrm/f1;->w:Lqa/b;

    if-eqz v4, :cond_1b

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    if-eqz v3, :cond_1b

    invoke-virtual {v5, v3}, Lqa/b;->e(Landroid/os/Bundle;)Lrm/f;

    move-result-object v3

    check-cast v3, Lrm/f1;

    iput-object v3, v2, Lrm/l0;->i:Lrm/f1;

    :cond_1b
    const/16 v3, 0x9

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1c

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    if-eqz v3, :cond_1c

    invoke-virtual {v5, v3}, Lqa/b;->e(Landroid/os/Bundle;)Lrm/f;

    move-result-object v3

    check-cast v3, Lrm/f1;

    iput-object v3, v2, Lrm/l0;->j:Lrm/f1;

    :cond_1c
    const/16 v3, 0xc

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1d

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lrm/l0;->n:Ljava/lang/Integer;

    :cond_1d
    const/16 v3, 0xd

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1e

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lrm/l0;->o:Ljava/lang/Integer;

    :cond_1e
    const/16 v3, 0xe

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1f

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lrm/l0;->p:Ljava/lang/Integer;

    :cond_1f
    const/16 v3, 0xf

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_20

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iput-object v3, v2, Lrm/l0;->q:Ljava/lang/Boolean;

    :cond_20
    const/16 v3, 0x10

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_21

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lrm/l0;->r:Ljava/lang/Integer;

    :cond_21
    const/16 v3, 0x11

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_22

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lrm/l0;->s:Ljava/lang/Integer;

    :cond_22
    const/16 v3, 0x12

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_23

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lrm/l0;->t:Ljava/lang/Integer;

    :cond_23
    const/16 v3, 0x13

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_24

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lrm/l0;->u:Ljava/lang/Integer;

    :cond_24
    const/16 v3, 0x14

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_25

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lrm/l0;->v:Ljava/lang/Integer;

    :cond_25
    const/16 v3, 0x15

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_26

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lrm/l0;->w:Ljava/lang/Integer;

    :cond_26
    const/16 v3, 0x19

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_27

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lrm/l0;->A:Ljava/lang/Integer;

    :cond_27
    const/16 v3, 0x1a

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_28

    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v2, Lrm/l0;->B:Ljava/lang/Integer;

    :cond_28
    new-instance v1, Lrm/m0;

    invoke-direct {v1, v2}, Lrm/m0;-><init>(Lrm/l0;)V

    return-object v1

    :pswitch_7
    new-instance v3, Lrm/h0;

    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v8

    invoke-static {v11, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v11

    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    invoke-static {v14, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    const v6, -0x800001

    invoke-virtual {v1, v2, v6}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v2

    invoke-static {v7, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7, v6}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v1

    move-wide v6, v8

    move-wide v8, v4

    move-wide v4, v6

    move v10, v2

    move-wide v6, v11

    move v11, v1

    invoke-direct/range {v3 .. v11}, Lrm/h0;-><init>(JJJFF)V

    return-object v3

    :pswitch_8
    new-instance v2, Lrm/e0;

    invoke-direct {v2}, Lrm/e0;-><init>()V

    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    const-wide/16 v4, 0x0

    invoke-virtual {v1, v3, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v12

    cmp-long v3, v12, v4

    if-ltz v3, :cond_29

    move v3, v11

    goto :goto_13

    :cond_29
    move v3, v9

    :goto_13
    invoke-static {v3}, Llo/a;->e(Z)V

    iput-wide v12, v2, Lrm/e0;->a:J

    invoke-static {v11, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    const-wide/high16 v12, -0x8000000000000000L

    move-wide/from16 v22, v4

    invoke-virtual {v1, v3, v12, v13}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    cmp-long v3, v4, v12

    if-eqz v3, :cond_2b

    cmp-long v3, v4, v22

    if-ltz v3, :cond_2a

    goto :goto_14

    :cond_2a
    move v11, v9

    :cond_2b
    :goto_14
    invoke-static {v11}, Llo/a;->e(Z)V

    iput-wide v4, v2, Lrm/e0;->b:J

    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v9}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v2, Lrm/e0;->c:Z

    invoke-static {v14, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v9}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v2, Lrm/e0;->d:Z

    invoke-static {v7, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v9}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v2, Lrm/e0;->e:Z

    new-instance v1, Lrm/g0;

    invoke-direct {v1, v2}, Lrm/f0;-><init>(Lrm/e0;)V

    return-object v1

    :pswitch_9
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v11, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    if-nez v2, :cond_2c

    sget-object v2, Lrm/h0;->F:Lrm/h0;

    move-object/from16 v20, v2

    goto :goto_15

    :cond_2c
    new-instance v18, Lrm/h0;

    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v19

    invoke-static {v11, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v21

    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v23

    invoke-static {v14, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    const v6, -0x800001

    invoke-virtual {v2, v3, v6}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v25

    invoke-static {v7, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v6}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v26

    invoke-direct/range {v18 .. v26}, Lrm/h0;-><init>(JJJFF)V

    move-object/from16 v20, v18

    :goto_15
    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    if-nez v2, :cond_2d

    sget-object v2, Lrm/m0;->h0:Lrm/m0;

    :goto_16
    move-object/from16 v21, v2

    goto :goto_17

    :cond_2d
    sget-object v3, Lrm/m0;->i0:Lqa/b;

    invoke-virtual {v3, v2}, Lqa/b;->e(Landroid/os/Bundle;)Lrm/f;

    move-result-object v2

    check-cast v2, Lrm/m0;

    goto :goto_16

    :goto_17
    invoke-static {v14, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    if-nez v1, :cond_2e

    sget-object v1, Lrm/g0;->G:Lrm/g0;

    :goto_18
    move-object/from16 v18, v1

    goto :goto_19

    :cond_2e
    sget-object v2, Lrm/f0;->F:Lqa/b;

    invoke-virtual {v2, v1}, Lqa/b;->e(Landroid/os/Bundle;)Lrm/f;

    move-result-object v1

    check-cast v1, Lrm/g0;

    goto :goto_18

    :goto_19
    new-instance v16, Lrm/k0;

    const/16 v19, 0x0

    invoke-direct/range {v16 .. v21}, Lrm/k0;-><init>(Ljava/lang/String;Lrm/g0;Lrm/i0;Lrm/h0;Lrm/m0;)V

    return-object v16

    :pswitch_a
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    if-nez v2, :cond_2f

    move v2, v11

    goto :goto_1a

    :cond_2f
    move v2, v9

    :goto_1a
    invoke-static {v2}, Llo/a;->e(Z)V

    invoke-static {v11, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v9}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_30

    new-instance v2, Lrm/d0;

    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v9}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-direct {v2, v1}, Lrm/d0;-><init>(Z)V

    goto :goto_1b

    :cond_30
    new-instance v2, Lrm/d0;

    invoke-direct {v2}, Lrm/d0;-><init>()V

    :goto_1b
    return-object v2

    :pswitch_b
    sget-object v2, Lrm/c0;->g0:Lrm/c0;

    new-instance v3, Lrm/b0;

    invoke-direct {v3}, Lrm/b0;-><init>()V

    if-eqz v1, :cond_31

    const-class v4, Llo/a;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    sget v5, Llo/y;->a:I

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    :cond_31
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v2, Lrm/c0;->w:Ljava/lang/String;

    if-eqz v4, :cond_32

    goto :goto_1c

    :cond_32
    move-object v4, v5

    :goto_1c
    iput-object v4, v3, Lrm/b0;->a:Ljava/lang/String;

    invoke-static {v11, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v2, Lrm/c0;->x:Ljava/lang/String;

    if-eqz v4, :cond_33

    goto :goto_1d

    :cond_33
    move-object v4, v5

    :goto_1d
    iput-object v4, v3, Lrm/b0;->b:Ljava/lang/String;

    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v2, Lrm/c0;->y:Ljava/lang/String;

    if-eqz v4, :cond_34

    goto :goto_1e

    :cond_34
    move-object v4, v5

    :goto_1e
    iput-object v4, v3, Lrm/b0;->c:Ljava/lang/String;

    invoke-static {v14, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    iget v5, v2, Lrm/c0;->z:I

    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    iput v4, v3, Lrm/b0;->d:I

    invoke-static {v7, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    iget v5, v2, Lrm/c0;->E:I

    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    iput v4, v3, Lrm/b0;->e:I

    invoke-static {v6, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    iget v5, v2, Lrm/c0;->F:I

    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    iput v4, v3, Lrm/b0;->f:I

    invoke-static {v13, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    iget v5, v2, Lrm/c0;->G:I

    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    iput v4, v3, Lrm/b0;->g:I

    invoke-static {v12, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v2, Lrm/c0;->I:Ljava/lang/String;

    if-eqz v4, :cond_35

    goto :goto_1f

    :cond_35
    move-object v4, v5

    :goto_1f
    iput-object v4, v3, Lrm/b0;->h:Ljava/lang/String;

    const/16 v4, 0x8

    invoke-static {v4, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Lin/c;

    iget-object v5, v2, Lrm/c0;->J:Lin/c;

    if-eqz v4, :cond_36

    goto :goto_20

    :cond_36
    move-object v4, v5

    :goto_20
    iput-object v4, v3, Lrm/b0;->i:Lin/c;

    const/16 v4, 0x9

    invoke-static {v4, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v2, Lrm/c0;->K:Ljava/lang/String;

    if-eqz v4, :cond_37

    goto :goto_21

    :cond_37
    move-object v4, v5

    :goto_21
    iput-object v4, v3, Lrm/b0;->j:Ljava/lang/String;

    const/16 v4, 0xa

    invoke-static {v4, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v2, Lrm/c0;->L:Ljava/lang/String;

    if-eqz v4, :cond_38

    goto :goto_22

    :cond_38
    move-object v4, v5

    :goto_22
    iput-object v4, v3, Lrm/b0;->k:Ljava/lang/String;

    const/16 v4, 0xb

    invoke-static {v4, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    iget v5, v2, Lrm/c0;->M:I

    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    iput v4, v3, Lrm/b0;->l:I

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    move v5, v9

    :goto_23
    const/16 v6, 0xc

    invoke-static {v6, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v7}, Lq63/c;->b(ILjava/lang/String;)I

    move-result v13

    invoke-static {v13, v12}, Lq63/c;->b(ILjava/lang/String;)I

    move-result v13

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v13}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "_"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v6

    if-nez v6, :cond_3a

    iput-object v4, v3, Lrm/b0;->m:Ljava/util/List;

    const/16 v7, 0xd

    invoke-static {v7, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Lvm/c;

    iput-object v4, v3, Lrm/b0;->n:Lvm/c;

    const/16 v4, 0xe

    invoke-static {v4, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    iget-wide v5, v2, Lrm/c0;->P:J

    invoke-virtual {v1, v4, v5, v6}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    iput-wide v4, v3, Lrm/b0;->o:J

    const/16 v4, 0xf

    invoke-static {v4, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    iget v5, v2, Lrm/c0;->Q:I

    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    iput v4, v3, Lrm/b0;->p:I

    const/16 v4, 0x10

    invoke-static {v4, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    iget v5, v2, Lrm/c0;->R:I

    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    iput v4, v3, Lrm/b0;->q:I

    const/16 v4, 0x11

    invoke-static {v4, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    iget v5, v2, Lrm/c0;->S:F

    invoke-virtual {v1, v4, v5}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v4

    iput v4, v3, Lrm/b0;->r:F

    const/16 v4, 0x12

    invoke-static {v4, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    iget v5, v2, Lrm/c0;->T:I

    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    iput v4, v3, Lrm/b0;->s:I

    const/16 v4, 0x13

    invoke-static {v4, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    iget v5, v2, Lrm/c0;->U:F

    invoke-virtual {v1, v4, v5}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v4

    iput v4, v3, Lrm/b0;->t:F

    const/16 v4, 0x14

    invoke-static {v4, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v4

    iput-object v4, v3, Lrm/b0;->u:[B

    const/16 v4, 0x15

    invoke-static {v4, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    iget v5, v2, Lrm/c0;->W:I

    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    iput v4, v3, Lrm/b0;->v:I

    const/16 v4, 0x16

    invoke-static {v4, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4

    if-nez v4, :cond_39

    move-object/from16 v5, v18

    goto :goto_24

    :cond_39
    new-instance v5, Lmo/b;

    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v6

    invoke-static {v11, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v7

    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v8

    invoke-static {v14, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v4

    invoke-direct {v5, v6, v7, v8, v4}, Lmo/b;-><init>(III[B)V

    :goto_24
    iput-object v5, v3, Lrm/b0;->w:Lmo/b;

    const/16 v4, 0x17

    invoke-static {v4, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    iget v5, v2, Lrm/c0;->Y:I

    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    iput v4, v3, Lrm/b0;->x:I

    const/16 v4, 0x18

    invoke-static {v4, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    iget v5, v2, Lrm/c0;->Z:I

    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    iput v4, v3, Lrm/b0;->y:I

    const/16 v4, 0x19

    invoke-static {v4, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    iget v5, v2, Lrm/c0;->a0:I

    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    iput v4, v3, Lrm/b0;->z:I

    const/16 v4, 0x1a

    invoke-static {v4, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    iget v5, v2, Lrm/c0;->b0:I

    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    iput v4, v3, Lrm/b0;->A:I

    const/16 v4, 0x1b

    invoke-static {v4, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    iget v5, v2, Lrm/c0;->c0:I

    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    iput v4, v3, Lrm/b0;->B:I

    const/16 v4, 0x1c

    invoke-static {v4, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    iget v5, v2, Lrm/c0;->d0:I

    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    iput v4, v3, Lrm/b0;->C:I

    const/16 v4, 0x1d

    invoke-static {v4, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    iget v2, v2, Lrm/c0;->e0:I

    invoke-virtual {v1, v4, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, v3, Lrm/b0;->D:I

    new-instance v1, Lrm/c0;

    invoke-direct {v1, v3}, Lrm/c0;-><init>(Lrm/b0;)V

    return-object v1

    :cond_3a
    const/16 v7, 0xd

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_23

    :pswitch_data_0
    .packed-switch 0xf
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

.method public invoke(Ljava/lang/Object;)V
    .locals 4

    iget v0, p0, Lqa/b;->w:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-static {p1}, Lnh3/a;->d(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1

    :pswitch_1
    check-cast p1, Lrm/z0;

    invoke-interface {p1}, Lrm/z0;->onRenderedFirstFrame()V

    return-void

    :pswitch_2
    check-cast p1, Lrm/z0;

    invoke-interface {p1}, Lrm/z0;->m()V

    return-void

    :pswitch_3
    check-cast p1, Lrm/z0;

    new-instance v0, Lcom/google/android/exoplayer2/ExoTimeoutException;

    const-string v1, "Player release timed out."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    new-instance v1, Lcom/google/android/exoplayer2/ExoPlaybackException;

    const/4 v2, 0x2

    const/16 v3, 0x3eb

    invoke-direct {v1, v2, v0, v3}, Lcom/google/android/exoplayer2/ExoPlaybackException;-><init>(ILjava/lang/Exception;I)V

    invoke-interface {p1, v1}, Lrm/z0;->n(Lcom/google/android/exoplayer2/PlaybackException;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public o(Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 3

    sget v0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->E:I

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x7

    iget-object p2, p2, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {p2, v0}, Lh5/o1;->g(I)Lv4/b;

    move-result-object p2

    const-string v0, "getInsets(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p2, Lv4/b;->d:I

    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getPaddingEnd()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/view/View;->setPaddingRelative(IIII)V

    sget-object p1, Lh5/q1;->b:Lh5/q1;

    return-object p1
.end method
