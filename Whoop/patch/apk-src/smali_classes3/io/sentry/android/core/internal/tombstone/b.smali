.class public final Lio/sentry/android/core/internal/tombstone/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final E:Ljava/util/HashMap;

.field public final w:Ljava/io/InputStream;

.field public final x:Ljava/util/List;

.field public final y:Ljava/util/List;

.field public final z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/internal/tombstone/b;->E:Ljava/util/HashMap;

    iput-object p1, p0, Lio/sentry/android/core/internal/tombstone/b;->w:Ljava/io/InputStream;

    iput-object p2, p0, Lio/sentry/android/core/internal/tombstone/b;->x:Ljava/util/List;

    iput-object p3, p0, Lio/sentry/android/core/internal/tombstone/b;->y:Ljava/util/List;

    iput-object p4, p0, Lio/sentry/android/core/internal/tombstone/b;->z:Ljava/lang/String;

    const-string p1, "SIGILL"

    const-string p2, "IllegalInstruction"

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "SIGTRAP"

    const-string p2, "Trap"

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "SIGABRT"

    const-string p2, "Abort"

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "SIGBUS"

    const-string p2, "BusError"

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "SIGFPE"

    const-string p2, "FloatingPointException"

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "SIGSEGV"

    const-string p2, "Segfault"

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b()Lio/sentry/e5;
    .locals 35

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/sentry/android/core/internal/tombstone/b;->w:Ljava/io/InputStream;

    if-eqz v1, :cond_3d

    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v3, 0x2000

    new-array v3, v3, [B

    :goto_0
    invoke-virtual {v1, v3}, Ljava/io/InputStream;->read([B)I

    move-result v4

    const/4 v5, -0x1

    const/4 v6, 0x0

    if-eq v4, v5, :cond_0

    invoke-virtual {v2, v3, v6, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    new-instance v1, Led3/a;

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Led3/a;-><init>([BIB)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    const-string v12, ""

    move v13, v6

    move v14, v13

    move-object/from16 v16, v12

    const/4 v15, 0x0

    :goto_1
    invoke-virtual {v1}, Led3/a;->x()I

    move-result v17

    const-wide/16 v18, 0x0

    if-eqz v17, :cond_25

    ushr-int/lit8 v6, v17, 0x3

    and-int/lit8 v11, v17, 0x7

    move-object/from16 v17, v12

    const/16 v20, 0x6

    packed-switch v6, :pswitch_data_0

    :pswitch_0
    invoke-virtual {v1, v11}, Led3/a;->M(I)V

    move-object/from16 v23, v1

    move-object/from16 v25, v3

    move-object/from16 v22, v4

    move-object/from16 v26, v5

    move/from16 v24, v14

    goto/16 :goto_8

    :pswitch_1
    const/4 v12, 0x2

    invoke-static {v6, v12, v11}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->q()Led3/a;

    move-result-object v6

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    :goto_2
    invoke-virtual {v6}, Led3/a;->x()I

    move-result v12

    if-eqz v12, :cond_7

    move-object/from16 v23, v1

    ushr-int/lit8 v1, v12, 0x3

    and-int/lit8 v12, v12, 0x7

    move/from16 v24, v14

    const/4 v14, 0x1

    if-eq v1, v14, :cond_6

    const/4 v14, 0x2

    if-eq v1, v14, :cond_1

    invoke-virtual {v6, v12}, Led3/a;->M(I)V

    move-object/from16 v18, v6

    goto :goto_5

    :cond_1
    invoke-static {v1, v14, v12}, Led3/a;->d(III)V

    invoke-virtual {v6}, Led3/a;->q()Led3/a;

    move-result-object v1

    :goto_3
    invoke-virtual {v1}, Led3/a;->x()I

    move-result v12

    if-eqz v12, :cond_5

    ushr-int/lit8 v14, v12, 0x3

    and-int/lit8 v12, v12, 0x7

    move-object/from16 v18, v6

    const/4 v6, 0x1

    if-eq v14, v6, :cond_4

    const/4 v6, 0x2

    if-eq v14, v6, :cond_3

    const/4 v6, 0x3

    if-eq v14, v6, :cond_2

    invoke-virtual {v1, v12}, Led3/a;->M(I)V

    goto :goto_4

    :cond_2
    const/4 v6, 0x0

    invoke-static {v14, v6, v12}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->F()J

    goto :goto_4

    :cond_3
    const/4 v6, 0x0

    invoke-static {v14, v6, v12}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->F()J

    goto :goto_4

    :cond_4
    const/4 v6, 0x2

    invoke-static {v14, v6, v12}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->q()Led3/a;

    move-result-object v6

    invoke-static {v6}, Lug/m;->u(Led3/a;)Lni/a;

    :goto_4
    move-object/from16 v6, v18

    const/4 v14, 0x2

    goto :goto_3

    :cond_5
    move-object/from16 v18, v6

    new-instance v1, Lng3/o;

    const/4 v6, 0x5

    const/4 v12, 0x0

    invoke-direct {v1, v6, v12}, Lng3/o;-><init>(IZ)V

    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_5
    const/4 v14, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v18, v6

    const/4 v14, 0x0

    invoke-static {v1, v14, v12}, Led3/a;->d(III)V

    invoke-virtual/range {v18 .. v18}, Led3/a;->F()J

    :goto_6
    move-object/from16 v6, v18

    move-object/from16 v1, v23

    move/from16 v14, v24

    goto :goto_2

    :cond_7
    move-object/from16 v23, v1

    move/from16 v24, v14

    const/4 v14, 0x0

    invoke-static {v11}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    :cond_8
    :goto_7
    move-object/from16 v25, v3

    move-object/from16 v22, v4

    move-object/from16 v26, v5

    :cond_9
    :goto_8
    move/from16 v14, v24

    goto/16 :goto_21

    :pswitch_2
    move-object/from16 v23, v1

    move/from16 v24, v14

    const/4 v12, 0x2

    const/4 v14, 0x0

    invoke-static {v6, v12, v11}, Led3/a;->d(III)V

    invoke-virtual/range {v23 .. v23}, Led3/a;->q()Led3/a;

    move-result-object v1

    invoke-static {v1, v7}, Lug/m;->w(Led3/a;Ljava/util/HashMap;)V

    goto :goto_7

    :pswitch_3
    move-object/from16 v23, v1

    move/from16 v24, v14

    const/4 v14, 0x0

    invoke-static {v6, v14, v11}, Led3/a;->d(III)V

    invoke-virtual/range {v23 .. v23}, Led3/a;->F()J

    move-result-wide v11

    long-to-int v1, v11

    invoke-static/range {v20 .. v20}, Le4/p;->f(I)[I

    move-result-object v6

    array-length v11, v6

    const/4 v12, 0x0

    :goto_9
    if-ge v12, v11, :cond_8

    aget v14, v6, v12

    invoke-static {v14}, Le4/p;->e(I)I

    move-result v14

    if-ne v14, v1, :cond_a

    goto :goto_7

    :cond_a
    add-int/lit8 v12, v12, 0x1

    goto :goto_9

    :pswitch_4
    move-object/from16 v23, v1

    move/from16 v24, v14

    const/4 v14, 0x0

    invoke-static {v6, v14, v11}, Led3/a;->d(III)V

    invoke-virtual/range {v23 .. v23}, Led3/a;->f()Z

    goto :goto_7

    :pswitch_5
    move-object/from16 v23, v1

    move/from16 v24, v14

    const/4 v14, 0x0

    invoke-static {v6, v14, v11}, Led3/a;->d(III)V

    invoke-virtual/range {v23 .. v23}, Led3/a;->F()J

    goto :goto_7

    :pswitch_6
    move-object/from16 v23, v1

    move/from16 v24, v14

    const/4 v12, 0x2

    invoke-static {v6, v12, v11}, Led3/a;->d(III)V

    invoke-virtual/range {v23 .. v23}, Led3/a;->q()Led3/a;

    move-result-object v1

    :goto_a
    invoke-virtual {v1}, Led3/a;->x()I

    move-result v6

    if-eqz v6, :cond_d

    ushr-int/lit8 v11, v6, 0x3

    and-int/lit8 v6, v6, 0x7

    const/4 v14, 0x1

    if-eq v11, v14, :cond_c

    if-eq v11, v12, :cond_b

    invoke-virtual {v1, v6}, Led3/a;->M(I)V

    goto :goto_b

    :cond_b
    invoke-static {v11, v12, v6}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->h()[B

    goto :goto_b

    :cond_c
    invoke-static {v11, v12, v6}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->h()[B

    :goto_b
    const/4 v12, 0x2

    goto :goto_a

    :cond_d
    new-instance v1, Lng3/n;

    const/4 v6, 0x3

    invoke-direct {v1, v6}, Lng3/n;-><init>(I)V

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_7

    :pswitch_7
    move-object/from16 v23, v1

    move/from16 v24, v14

    const/4 v14, 0x0

    invoke-static {v6, v14, v11}, Led3/a;->d(III)V

    invoke-virtual/range {v23 .. v23}, Led3/a;->F()J

    goto/16 :goto_7

    :pswitch_8
    move-object/from16 v23, v1

    move/from16 v24, v14

    const/4 v12, 0x2

    invoke-static {v6, v12, v11}, Led3/a;->d(III)V

    invoke-virtual/range {v23 .. v23}, Led3/a;->q()Led3/a;

    move-result-object v1

    :goto_c
    invoke-virtual {v1}, Led3/a;->x()I

    move-result v6

    if-eqz v6, :cond_12

    ushr-int/lit8 v11, v6, 0x3

    and-int/lit8 v6, v6, 0x7

    const/4 v14, 0x1

    if-eq v11, v14, :cond_11

    if-eq v11, v12, :cond_10

    const/4 v14, 0x3

    if-eq v11, v14, :cond_f

    const/4 v14, 0x4

    if-eq v11, v14, :cond_e

    invoke-virtual {v1, v6}, Led3/a;->M(I)V

    goto :goto_d

    :cond_e
    const/4 v14, 0x0

    invoke-static {v11, v14, v6}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->F()J

    goto :goto_d

    :cond_f
    const/4 v14, 0x0

    invoke-static {v11, v12, v6}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->u()Ljava/lang/String;

    goto :goto_d

    :cond_10
    const/4 v14, 0x0

    invoke-static {v11, v12, v6}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->u()Ljava/lang/String;

    goto :goto_d

    :cond_11
    const/4 v14, 0x0

    invoke-static {v11, v14, v6}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->F()J

    :goto_d
    const/4 v12, 0x2

    goto :goto_c

    :cond_12
    new-instance v1, Lng3/o;

    const/4 v6, 0x3

    const/4 v11, 0x0

    invoke-direct {v1, v6, v11}, Lng3/o;-><init>(IZ)V

    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_7

    :pswitch_9
    move-object/from16 v23, v1

    move/from16 v24, v14

    const/4 v12, 0x2

    invoke-static {v6, v12, v11}, Led3/a;->d(III)V

    invoke-virtual/range {v23 .. v23}, Led3/a;->q()Led3/a;

    move-result-object v1

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    :goto_e
    invoke-virtual {v1}, Led3/a;->x()I

    move-result v11

    if-eqz v11, :cond_16

    ushr-int/lit8 v12, v11, 0x3

    and-int/lit8 v11, v11, 0x7

    const/4 v14, 0x1

    if-eq v12, v14, :cond_15

    const/4 v14, 0x2

    if-eq v12, v14, :cond_13

    invoke-virtual {v1, v11}, Led3/a;->M(I)V

    move-object/from16 v18, v1

    move v1, v14

    goto/16 :goto_12

    :cond_13
    invoke-static {v12, v14, v11}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->q()Led3/a;

    move-result-object v11

    :goto_f
    invoke-virtual {v11}, Led3/a;->x()I

    move-result v12

    if-eqz v12, :cond_14

    ushr-int/lit8 v14, v12, 0x3

    and-int/lit8 v12, v12, 0x7

    packed-switch v14, :pswitch_data_1

    invoke-virtual {v11, v12}, Led3/a;->M(I)V

    move-object/from16 v18, v1

    :goto_10
    const/4 v1, 0x2

    goto :goto_11

    :pswitch_a
    move-object/from16 v18, v1

    const/4 v1, 0x2

    invoke-static {v14, v1, v12}, Led3/a;->d(III)V

    invoke-virtual {v11}, Led3/a;->u()Ljava/lang/String;

    goto :goto_11

    :pswitch_b
    move-object/from16 v18, v1

    const/4 v1, 0x2

    invoke-static {v14, v1, v12}, Led3/a;->d(III)V

    invoke-virtual {v11}, Led3/a;->u()Ljava/lang/String;

    goto :goto_10

    :pswitch_c
    move-object/from16 v18, v1

    const/4 v1, 0x0

    invoke-static {v14, v1, v12}, Led3/a;->d(III)V

    invoke-virtual {v11}, Led3/a;->F()J

    goto :goto_10

    :pswitch_d
    move-object/from16 v18, v1

    const/4 v1, 0x0

    invoke-static {v14, v1, v12}, Led3/a;->d(III)V

    invoke-virtual {v11}, Led3/a;->F()J

    goto :goto_10

    :pswitch_e
    move-object/from16 v18, v1

    const/4 v1, 0x0

    invoke-static {v14, v1, v12}, Led3/a;->d(III)V

    invoke-virtual {v11}, Led3/a;->F()J

    goto :goto_10

    :pswitch_f
    move-object/from16 v18, v1

    const/4 v1, 0x2

    invoke-static {v14, v1, v12}, Led3/a;->d(III)V

    invoke-virtual {v11}, Led3/a;->u()Ljava/lang/String;

    :goto_11
    move-object/from16 v1, v18

    goto :goto_f

    :cond_14
    move-object/from16 v18, v1

    const/4 v1, 0x2

    new-instance v11, Lng3/o;

    const/4 v12, 0x4

    const/4 v14, 0x0

    invoke-direct {v11, v12, v14}, Lng3/o;-><init>(IZ)V

    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_12

    :cond_15
    move-object/from16 v18, v1

    const/4 v1, 0x2

    invoke-static {v12, v1, v11}, Led3/a;->d(III)V

    invoke-virtual/range {v18 .. v18}, Led3/a;->u()Ljava/lang/String;

    :goto_12
    move-object/from16 v1, v18

    goto/16 :goto_e

    :cond_16
    new-instance v1, Lng3/n;

    const/4 v11, 0x4

    invoke-direct {v1, v11}, Lng3/n;-><init>(I)V

    invoke-static {v6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_7

    :pswitch_10
    move-object/from16 v23, v1

    move/from16 v24, v14

    const/4 v1, 0x2

    invoke-static {v6, v1, v11}, Led3/a;->d(III)V

    invoke-virtual/range {v23 .. v23}, Led3/a;->q()Led3/a;

    move-result-object v1

    move-object/from16 v33, v17

    move-object/from16 v34, v33

    move-wide/from16 v26, v18

    move-wide/from16 v28, v26

    move-wide/from16 v30, v28

    const/16 v32, 0x0

    :goto_13
    invoke-virtual {v1}, Led3/a;->x()I

    move-result v6

    if-eqz v6, :cond_17

    ushr-int/lit8 v11, v6, 0x3

    and-int/lit8 v6, v6, 0x7

    packed-switch v11, :pswitch_data_2

    invoke-virtual {v1, v6}, Led3/a;->M(I)V

    goto :goto_13

    :pswitch_11
    const/4 v14, 0x0

    invoke-static {v11, v14, v6}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->F()J

    goto :goto_13

    :pswitch_12
    const/4 v12, 0x2

    const/4 v14, 0x0

    invoke-static {v11, v12, v6}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->u()Ljava/lang/String;

    move-result-object v34

    goto :goto_13

    :pswitch_13
    const/4 v12, 0x2

    const/4 v14, 0x0

    invoke-static {v11, v12, v6}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->u()Ljava/lang/String;

    move-result-object v33

    goto :goto_13

    :pswitch_14
    const/4 v14, 0x0

    invoke-static {v11, v14, v6}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->f()Z

    goto :goto_13

    :pswitch_15
    const/4 v14, 0x0

    invoke-static {v11, v14, v6}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->f()Z

    goto :goto_13

    :pswitch_16
    const/4 v14, 0x0

    invoke-static {v11, v14, v6}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->f()Z

    move-result v6

    move/from16 v32, v6

    goto :goto_13

    :pswitch_17
    const/4 v14, 0x0

    invoke-static {v11, v14, v6}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->F()J

    move-result-wide v11

    move-wide/from16 v30, v11

    goto :goto_13

    :pswitch_18
    const/4 v14, 0x0

    invoke-static {v11, v14, v6}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->F()J

    move-result-wide v11

    move-wide/from16 v28, v11

    goto :goto_13

    :pswitch_19
    const/4 v14, 0x0

    invoke-static {v11, v14, v6}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->F()J

    move-result-wide v11

    move-wide/from16 v26, v11

    goto :goto_13

    :cond_17
    new-instance v25, Lni/b;

    invoke-direct/range {v25 .. v34}, Lni/b;-><init>(JJJZLjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v25

    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_7

    :pswitch_1a
    move-object/from16 v23, v1

    move/from16 v24, v14

    const/4 v12, 0x2

    invoke-static {v6, v12, v11}, Led3/a;->d(III)V

    invoke-virtual/range {v23 .. v23}, Led3/a;->q()Led3/a;

    move-result-object v1

    invoke-static {v1, v5}, Lug/m;->w(Led3/a;Ljava/util/HashMap;)V

    goto/16 :goto_7

    :pswitch_1b
    move-object/from16 v23, v1

    move/from16 v24, v14

    const/4 v12, 0x2

    invoke-static {v6, v12, v11}, Led3/a;->d(III)V

    invoke-virtual/range {v23 .. v23}, Led3/a;->q()Led3/a;

    move-result-object v1

    :goto_14
    invoke-virtual {v1}, Led3/a;->x()I

    move-result v6

    if-eqz v6, :cond_22

    ushr-int/lit8 v11, v6, 0x3

    and-int/lit8 v6, v6, 0x7

    const/4 v14, 0x1

    if-eq v11, v14, :cond_21

    if-eq v11, v12, :cond_19

    invoke-virtual {v1, v6}, Led3/a;->M(I)V

    :cond_18
    move-object/from16 v18, v1

    move-object/from16 v25, v3

    move-object/from16 v26, v5

    goto/16 :goto_1c

    :cond_19
    invoke-static {v11, v12, v6}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->q()Led3/a;

    move-result-object v6

    :goto_15
    invoke-virtual {v6}, Led3/a;->x()I

    move-result v11

    if-eqz v11, :cond_18

    ushr-int/lit8 v14, v11, 0x3

    and-int/lit8 v11, v11, 0x7

    move-object/from16 v18, v1

    const/4 v1, 0x1

    if-eq v14, v1, :cond_1e

    if-eq v14, v12, :cond_1c

    const/4 v1, 0x3

    if-eq v14, v1, :cond_1a

    invoke-virtual {v6, v11}, Led3/a;->M(I)V

    move-object/from16 v25, v3

    move-object/from16 v26, v5

    goto/16 :goto_1b

    :cond_1a
    invoke-static {v14, v12, v11}, Led3/a;->d(III)V

    invoke-virtual {v6}, Led3/a;->q()Led3/a;

    move-result-object v11

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    :goto_16
    invoke-virtual {v11}, Led3/a;->x()I

    move-result v19

    if-eqz v19, :cond_1b

    ushr-int/lit8 v1, v19, 0x3

    move-object/from16 v25, v3

    and-int/lit8 v3, v19, 0x7

    packed-switch v1, :pswitch_data_3

    invoke-virtual {v11, v3}, Led3/a;->M(I)V

    move-object/from16 v26, v5

    goto :goto_17

    :pswitch_1c
    move-object/from16 v26, v5

    const/4 v5, 0x2

    invoke-static {v1, v5, v3}, Led3/a;->d(III)V

    invoke-virtual {v11}, Led3/a;->q()Led3/a;

    move-result-object v1

    invoke-static {v1}, Lug/m;->u(Led3/a;)Lni/a;

    move-result-object v1

    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_17

    :pswitch_1d
    move-object/from16 v26, v5

    const/4 v5, 0x0

    invoke-static {v1, v5, v3}, Led3/a;->d(III)V

    invoke-virtual {v11}, Led3/a;->F()J

    goto :goto_18

    :pswitch_1e
    move-object/from16 v26, v5

    const/4 v5, 0x2

    invoke-static {v1, v5, v3}, Led3/a;->d(III)V

    invoke-virtual {v11}, Led3/a;->q()Led3/a;

    move-result-object v1

    invoke-static {v1}, Lug/m;->u(Led3/a;)Lni/a;

    move-result-object v1

    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_17
    const/4 v5, 0x0

    goto :goto_18

    :pswitch_1f
    move-object/from16 v26, v5

    const/4 v5, 0x0

    invoke-static {v1, v5, v3}, Led3/a;->d(III)V

    invoke-virtual {v11}, Led3/a;->F()J

    goto :goto_18

    :pswitch_20
    move-object/from16 v26, v5

    const/4 v5, 0x0

    invoke-static {v1, v5, v3}, Led3/a;->d(III)V

    invoke-virtual {v11}, Led3/a;->F()J

    goto :goto_18

    :pswitch_21
    move-object/from16 v26, v5

    const/4 v5, 0x0

    invoke-static {v1, v5, v3}, Led3/a;->d(III)V

    invoke-virtual {v11}, Led3/a;->F()J

    :goto_18
    move-object/from16 v3, v25

    move-object/from16 v5, v26

    const/4 v1, 0x3

    goto :goto_16

    :cond_1b
    move-object/from16 v25, v3

    move-object/from16 v26, v5

    const/4 v5, 0x0

    invoke-static {v12}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    invoke-static {v14}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    goto :goto_1b

    :cond_1c
    move-object/from16 v25, v3

    move-object/from16 v26, v5

    const/4 v5, 0x0

    invoke-static {v14, v5, v11}, Led3/a;->d(III)V

    invoke-virtual {v6}, Led3/a;->F()J

    move-result-wide v11

    long-to-int v1, v11

    invoke-static/range {v20 .. v20}, Le4/p;->f(I)[I

    move-result-object v3

    array-length v5, v3

    const/4 v11, 0x0

    :goto_19
    if-ge v11, v5, :cond_20

    aget v12, v3, v11

    invoke-static {v12}, Le4/p;->e(I)I

    move-result v12

    if-ne v12, v1, :cond_1d

    goto :goto_1b

    :cond_1d
    add-int/lit8 v11, v11, 0x1

    goto :goto_19

    :cond_1e
    move-object/from16 v25, v3

    move-object/from16 v26, v5

    const/4 v5, 0x0

    invoke-static {v14, v5, v11}, Led3/a;->d(III)V

    invoke-virtual {v6}, Led3/a;->F()J

    move-result-wide v11

    long-to-int v1, v11

    const/16 v21, 0x2

    invoke-static/range {v21 .. v21}, Le4/p;->f(I)[I

    move-result-object v3

    array-length v5, v3

    const/4 v11, 0x0

    :goto_1a
    if-ge v11, v5, :cond_20

    aget v12, v3, v11

    invoke-static {v12}, Le4/p;->e(I)I

    move-result v12

    if-ne v12, v1, :cond_1f

    goto :goto_1b

    :cond_1f
    add-int/lit8 v11, v11, 0x1

    goto :goto_1a

    :cond_20
    :goto_1b
    move-object/from16 v1, v18

    move-object/from16 v3, v25

    move-object/from16 v5, v26

    const/4 v12, 0x2

    goto/16 :goto_15

    :cond_21
    move-object/from16 v18, v1

    move-object/from16 v25, v3

    move-object/from16 v26, v5

    invoke-static {v11, v12, v6}, Led3/a;->d(III)V

    invoke-virtual/range {v18 .. v18}, Led3/a;->u()Ljava/lang/String;

    :goto_1c
    move-object/from16 v1, v18

    move-object/from16 v3, v25

    move-object/from16 v5, v26

    goto/16 :goto_14

    :cond_22
    move-object/from16 v25, v3

    move-object/from16 v26, v5

    new-instance v1, Lng3/o;

    const/4 v3, 0x2

    const/4 v5, 0x0

    invoke-direct {v1, v3, v5}, Lng3/o;-><init>(IZ)V

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v22, v4

    goto/16 :goto_8

    :pswitch_22
    move-object/from16 v23, v1

    move-object/from16 v25, v3

    move-object/from16 v26, v5

    move/from16 v24, v14

    const/4 v12, 0x2

    invoke-static {v6, v12, v11}, Led3/a;->d(III)V

    invoke-virtual/range {v23 .. v23}, Led3/a;->u()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v22, v4

    goto/16 :goto_21

    :pswitch_23
    move-object/from16 v23, v1

    move-object/from16 v25, v3

    move-object/from16 v26, v5

    move/from16 v24, v14

    const/4 v12, 0x2

    invoke-static {v6, v12, v11}, Led3/a;->d(III)V

    invoke-virtual/range {v23 .. v23}, Led3/a;->q()Led3/a;

    move-result-object v1

    move-object/from16 v6, v17

    move-object v11, v6

    const/4 v3, 0x0

    const/4 v5, 0x0

    :goto_1d
    invoke-virtual {v1}, Led3/a;->x()I

    move-result v12

    if-eqz v12, :cond_23

    ushr-int/lit8 v14, v12, 0x3

    and-int/lit8 v12, v12, 0x7

    packed-switch v14, :pswitch_data_4

    invoke-virtual {v1, v12}, Led3/a;->M(I)V

    :goto_1e
    move-object/from16 v22, v4

    const/4 v4, 0x2

    goto/16 :goto_1f

    :pswitch_24
    const/4 v15, 0x2

    invoke-static {v14, v15, v12}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->q()Led3/a;

    move-result-object v12

    invoke-static {v12}, Lug/m;->v(Led3/a;)Lng3/n;

    goto :goto_1e

    :pswitch_25
    const/4 v15, 0x0

    invoke-static {v14, v15, v12}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->F()J

    goto :goto_1e

    :pswitch_26
    const/4 v15, 0x0

    invoke-static {v14, v15, v12}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->f()Z

    goto :goto_1e

    :pswitch_27
    const/4 v15, 0x0

    invoke-static {v14, v15, v12}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->F()J

    goto :goto_1e

    :pswitch_28
    const/4 v15, 0x0

    invoke-static {v14, v15, v12}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->F()J

    goto :goto_1e

    :pswitch_29
    const/4 v15, 0x0

    invoke-static {v14, v15, v12}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->f()Z

    goto :goto_1e

    :pswitch_2a
    const/4 v11, 0x2

    const/4 v15, 0x0

    invoke-static {v14, v11, v12}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->u()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v22, v4

    move v4, v11

    move-object v11, v12

    goto :goto_1f

    :pswitch_2b
    const/4 v15, 0x0

    const/16 v21, 0x2

    invoke-static {v14, v15, v12}, Led3/a;->d(III)V

    move-object/from16 v22, v4

    invoke-virtual {v1}, Led3/a;->F()J

    move-result-wide v4

    long-to-int v4, v4

    move v5, v4

    move/from16 v4, v21

    goto :goto_1f

    :pswitch_2c
    move-object/from16 v22, v4

    const/4 v4, 0x2

    const/4 v15, 0x0

    invoke-static {v14, v4, v12}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->u()Ljava/lang/String;

    move-result-object v6

    goto :goto_1f

    :pswitch_2d
    move-object/from16 v22, v4

    const/4 v4, 0x2

    const/4 v15, 0x0

    invoke-static {v14, v15, v12}, Led3/a;->d(III)V

    invoke-virtual {v1}, Led3/a;->F()J

    move-result-wide v14

    long-to-int v3, v14

    :goto_1f
    move-object/from16 v4, v22

    goto/16 :goto_1d

    :cond_23
    move-object/from16 v22, v4

    new-instance v15, Lcom/google/android/material/textfield/p;

    invoke-direct {v15, v3, v5, v6, v11}, Lcom/google/android/material/textfield/p;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_8

    :pswitch_2e
    move-object/from16 v23, v1

    move-object/from16 v25, v3

    move-object/from16 v22, v4

    move-object/from16 v26, v5

    move/from16 v24, v14

    const/4 v4, 0x2

    invoke-static {v6, v4, v11}, Led3/a;->d(III)V

    invoke-virtual/range {v23 .. v23}, Led3/a;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :pswitch_2f
    move-object/from16 v23, v1

    move-object/from16 v25, v3

    move-object/from16 v22, v4

    move-object/from16 v26, v5

    move/from16 v24, v14

    const/4 v4, 0x2

    invoke-static {v6, v4, v11}, Led3/a;->d(III)V

    invoke-virtual/range {v23 .. v23}, Led3/a;->u()Ljava/lang/String;

    goto/16 :goto_21

    :pswitch_30
    move-object/from16 v23, v1

    move-object/from16 v25, v3

    move-object/from16 v22, v4

    move-object/from16 v26, v5

    move/from16 v24, v14

    const/4 v14, 0x0

    invoke-static {v6, v14, v11}, Led3/a;->d(III)V

    invoke-virtual/range {v23 .. v23}, Led3/a;->F()J

    goto/16 :goto_8

    :pswitch_31
    move-object/from16 v23, v1

    move-object/from16 v25, v3

    move-object/from16 v22, v4

    move-object/from16 v26, v5

    const/4 v14, 0x0

    invoke-static {v6, v14, v11}, Led3/a;->d(III)V

    invoke-virtual/range {v23 .. v23}, Led3/a;->F()J

    move-result-wide v3

    long-to-int v1, v3

    move v14, v1

    goto/16 :goto_21

    :pswitch_32
    move-object/from16 v23, v1

    move-object/from16 v25, v3

    move-object/from16 v22, v4

    move-object/from16 v26, v5

    move/from16 v24, v14

    const/4 v14, 0x0

    invoke-static {v6, v14, v11}, Led3/a;->d(III)V

    invoke-virtual/range {v23 .. v23}, Led3/a;->F()J

    move-result-wide v3

    long-to-int v13, v3

    goto/16 :goto_8

    :pswitch_33
    move-object/from16 v23, v1

    move-object/from16 v25, v3

    move-object/from16 v22, v4

    move-object/from16 v26, v5

    move/from16 v24, v14

    const/4 v12, 0x2

    invoke-static {v6, v12, v11}, Led3/a;->d(III)V

    invoke-virtual/range {v23 .. v23}, Led3/a;->u()Ljava/lang/String;

    goto :goto_21

    :pswitch_34
    move-object/from16 v23, v1

    move-object/from16 v25, v3

    move-object/from16 v22, v4

    move-object/from16 v26, v5

    move/from16 v24, v14

    const/4 v12, 0x2

    invoke-static {v6, v12, v11}, Led3/a;->d(III)V

    invoke-virtual/range {v23 .. v23}, Led3/a;->u()Ljava/lang/String;

    goto :goto_21

    :pswitch_35
    move-object/from16 v23, v1

    move-object/from16 v25, v3

    move-object/from16 v22, v4

    move-object/from16 v26, v5

    move/from16 v24, v14

    const/4 v12, 0x2

    invoke-static {v6, v12, v11}, Led3/a;->d(III)V

    invoke-virtual/range {v23 .. v23}, Led3/a;->u()Ljava/lang/String;

    goto :goto_21

    :pswitch_36
    move-object/from16 v23, v1

    move-object/from16 v25, v3

    move-object/from16 v22, v4

    move-object/from16 v26, v5

    move/from16 v24, v14

    const/4 v14, 0x0

    invoke-static {v6, v14, v11}, Led3/a;->d(III)V

    invoke-virtual/range {v23 .. v23}, Led3/a;->F()J

    move-result-wide v3

    long-to-int v1, v3

    invoke-static/range {v20 .. v20}, Le4/p;->f(I)[I

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_20
    if-ge v5, v4, :cond_9

    aget v6, v3, v5

    invoke-static {v6}, Le4/p;->e(I)I

    move-result v6

    if-ne v6, v1, :cond_24

    goto/16 :goto_8

    :cond_24
    add-int/lit8 v5, v5, 0x1

    goto :goto_20

    :goto_21
    move-object/from16 v12, v17

    move-object/from16 v4, v22

    move-object/from16 v1, v23

    move-object/from16 v3, v25

    move-object/from16 v5, v26

    const/4 v6, 0x0

    goto/16 :goto_1

    :cond_25
    move-object/from16 v25, v3

    move-object/from16 v22, v4

    move-object/from16 v26, v5

    move-object/from16 v17, v12

    move/from16 v24, v14

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-static/range {v25 .. v25}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    invoke-static/range {v22 .. v22}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    invoke-static/range {v26 .. v26}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v7}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    invoke-static {v8}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    invoke-static {v9}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    invoke-static {v10}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    new-instance v4, Lio/sentry/e5;

    invoke-direct {v4}, Lio/sentry/e5;-><init>()V

    sget-object v5, Lio/sentry/n5;->FATAL:Lio/sentry/n5;

    iput-object v5, v4, Lio/sentry/e5;->U:Lio/sentry/n5;

    const-string v5, "native"

    iput-object v5, v4, Lio/sentry/r4;->H:Ljava/lang/String;

    new-instance v5, Lio/sentry/protocol/o;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    const-string v6, " "

    invoke-static {v6, v1}, Ljava/lang/String;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    const-string v6, ")"

    const-string v7, " ("

    if-eqz v15, :cond_27

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_26

    const-string v8, ": "

    move-object/from16 v12, v16

    invoke-virtual {v12, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    goto :goto_22

    :cond_26
    move-object/from16 v12, v17

    :goto_22
    iget-object v8, v15, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget v9, v15, Lcom/google/android/material/textfield/p;->b:I

    iget-object v10, v15, Lcom/google/android/material/textfield/p;->e:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget v11, v15, Lcom/google/android/material/textfield/p;->c:I

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "Fatal signal "

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, "), "

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, "), pid = "

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v5, Lio/sentry/protocol/o;->w:Ljava/lang/String;

    goto :goto_23

    :cond_27
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v8, "Fatal exit pid = "

    invoke-static {v13, v8, v7, v1, v6}, Lq63/c;->h(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v5, Lio/sentry/protocol/o;->w:Ljava/lang/String;

    :goto_23
    iput-object v5, v4, Lio/sentry/e5;->Q:Lio/sentry/protocol/o;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v11, 0x0

    :cond_28
    :goto_24
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lni/b;

    iget-boolean v6, v5, Lni/b;->d:Z

    iget-object v7, v5, Lni/b;->f:Ljava/lang/String;

    iget-object v8, v5, Lni/b;->e:Ljava/lang/String;

    iget-wide v9, v5, Lni/b;->b:J

    if-nez v6, :cond_29

    goto :goto_24

    :cond_29
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_28

    const-string v6, "/dev/"

    invoke-virtual {v8, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2a

    goto :goto_24

    :cond_2a
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    iget-wide v12, v5, Lni/b;->c:J

    cmp-long v12, v12, v18

    if-nez v12, :cond_2b

    const/4 v12, 0x1

    goto :goto_25

    :cond_2b
    const/4 v12, 0x0

    :goto_25
    if-nez v6, :cond_2e

    if-eqz v12, :cond_2e

    if-eqz v11, :cond_2c

    iget-object v6, v11, Lai/h;->z:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2c

    iput-wide v9, v11, Lai/h;->y:J

    goto :goto_24

    :cond_2c
    if-eqz v11, :cond_2d

    invoke-virtual {v11}, Lai/h;->t()Lio/sentry/protocol/DebugImage;

    move-result-object v6

    if-eqz v6, :cond_2d

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2d
    new-instance v6, Lai/h;

    const/4 v11, 0x4

    invoke-direct {v6, v11}, Lai/h;-><init>(I)V

    iput-object v8, v6, Lai/h;->z:Ljava/lang/Object;

    iput-object v7, v6, Lai/h;->E:Ljava/lang/Object;

    iget-wide v7, v5, Lni/b;->a:J

    iput-wide v7, v6, Lai/h;->x:J

    iput-wide v9, v6, Lai/h;->y:J

    move-object v11, v6

    goto :goto_24

    :cond_2e
    if-eqz v11, :cond_28

    iget-object v5, v11, Lai/h;->z:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_28

    iput-wide v9, v11, Lai/h;->y:J

    goto :goto_24

    :cond_2f
    if-eqz v11, :cond_30

    invoke-virtual {v11}, Lai/h;->t()Lio/sentry/protocol/DebugImage;

    move-result-object v3

    if-eqz v3, :cond_30

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_30
    new-instance v3, Lio/sentry/protocol/d;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v5, v3, Lio/sentry/protocol/d;->x:Ljava/util/List;

    iput-object v3, v4, Lio/sentry/r4;->N:Lio/sentry/protocol/d;

    new-instance v1, Lio/sentry/protocol/u;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    if-eqz v15, :cond_31

    iget-object v3, v15, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iput-object v3, v1, Lio/sentry/protocol/u;->w:Ljava/lang/String;

    iget-object v5, v0, Lio/sentry/android/core/internal/tombstone/b;->E:Ljava/util/HashMap;

    invoke-virtual {v5, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iput-object v3, v1, Lio/sentry/protocol/u;->x:Ljava/lang/String;

    new-instance v3, Lio/sentry/protocol/n;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    sget-object v5, Lio/sentry/android/core/internal/tombstone/a;->TOMBSTONE:Lio/sentry/android/core/internal/tombstone/a;

    invoke-virtual {v5}, Lio/sentry/android/core/internal/tombstone/a;->getValue()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/n;->w:Ljava/lang/String;

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v5, v3, Lio/sentry/protocol/n;->z:Ljava/lang/Boolean;

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v5, v3, Lio/sentry/protocol/n;->G:Ljava/lang/Boolean;

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    iget v6, v15, Lcom/google/android/material/textfield/p;->b:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v7, "number"

    invoke-virtual {v5, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v6, v15, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    const-string v7, "name"

    invoke-virtual {v5, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v6, v15, Lcom/google/android/material/textfield/p;->c:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v7, "code"

    invoke-virtual {v5, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v6, v15, Lcom/google/android/material/textfield/p;->e:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    const-string v7, "code_name"

    invoke-virtual {v5, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6, v5}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v6, v3, Lio/sentry/protocol/n;->E:Ljava/util/AbstractMap;

    iput-object v3, v1, Lio/sentry/protocol/u;->F:Lio/sentry/protocol/n;

    :cond_31
    move/from16 v6, v24

    int-to-long v7, v6

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v1, Lio/sentry/protocol/u;->z:Ljava/lang/Long;

    new-instance v3, Ljava/util/ArrayList;

    const/4 v14, 0x1

    invoke-direct {v3, v14}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Laa3/u0;

    invoke-direct {v1, v3}, Laa3/u0;-><init>(Ljava/util/List;)V

    iput-object v1, v4, Lio/sentry/e5;->T:Laa3/u0;

    invoke-virtual {v4}, Lio/sentry/e5;->d()Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/protocol/u;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_26
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lni/d;

    new-instance v8, Lio/sentry/protocol/c0;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    int-to-long v9, v5

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iput-object v5, v8, Lio/sentry/protocol/c0;->w:Ljava/lang/Long;

    iget-object v5, v7, Lni/d;->b:Ljava/lang/String;

    iput-object v5, v8, Lio/sentry/protocol/c0;->y:Ljava/lang/String;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iget-object v9, v7, Lni/d;->d:Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_27
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    const-string v11, "0x%x"

    if-eqz v10, :cond_39

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lni/a;

    iget-object v12, v10, Lni/a;->c:Ljava/lang/String;

    iget-object v13, v10, Lni/a;->b:Ljava/lang/String;

    const-string v15, "libart.so"

    invoke-virtual {v12, v15}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_32

    goto :goto_27

    :cond_32
    const-string v15, "<anonymous"

    invoke-virtual {v12, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_33

    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    move-result v15

    if-eqz v15, :cond_33

    goto :goto_27

    :cond_33
    new-instance v15, Lio/sentry/protocol/z;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    iput-object v12, v15, Lio/sentry/protocol/z;->L:Ljava/lang/String;

    iput-object v13, v15, Lio/sentry/protocol/z;->E:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-wide v14, v10, Lni/a;->a:J

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v10

    invoke-static {v11, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    move-object/from16 v11, v16

    iput-object v10, v11, Lio/sentry/protocol/z;->Q:Ljava/lang/String;

    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_34

    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_28

    :cond_34
    iget-object v10, v0, Lio/sentry/android/core/internal/tombstone/b;->x:Ljava/util/List;

    iget-object v14, v0, Lio/sentry/android/core/internal/tombstone/b;->y:Ljava/util/List;

    invoke-static {v13, v10, v14}, Laj/d;->q(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/lang/Boolean;

    move-result-object v10

    :goto_28
    iget-object v13, v0, Lio/sentry/android/core/internal/tombstone/b;->z:Ljava/lang/String;

    if-eqz v13, :cond_35

    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_35

    const/4 v14, 0x1

    goto :goto_29

    :cond_35
    const/4 v14, 0x0

    :goto_29
    if-eqz v10, :cond_36

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-nez v10, :cond_37

    :cond_36
    if-eqz v14, :cond_38

    :cond_37
    const/4 v14, 0x1

    goto :goto_2a

    :cond_38
    const/4 v14, 0x0

    :goto_2a
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    iput-object v10, v11, Lio/sentry/protocol/z;->K:Ljava/lang/Boolean;

    const/4 v14, 0x0

    invoke-virtual {v5, v14, v11}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const/4 v14, 0x1

    goto :goto_27

    :cond_39
    const/4 v14, 0x0

    new-instance v9, Lio/sentry/protocol/b0;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    iput-object v5, v9, Lio/sentry/protocol/b0;->w:Ljava/util/List;

    sget-object v5, Lio/sentry/protocol/a0;->NONE:Lio/sentry/protocol/a0;

    iput-object v5, v9, Lio/sentry/protocol/b0;->z:Lio/sentry/protocol/a0;

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    iget-object v10, v7, Lni/d;->c:Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2b
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_3a

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lni/c;

    iget-object v13, v12, Lni/c;->a:Ljava/lang/String;

    iget-wide v14, v12, Lni/c;->b:J

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    filled-new-array {v12}, [Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5, v13, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v14, 0x0

    goto :goto_2b

    :cond_3a
    iput-object v5, v9, Lio/sentry/protocol/b0;->x:Ljava/util/AbstractMap;

    iput-object v9, v8, Lio/sentry/protocol/c0;->I:Lio/sentry/protocol/b0;

    iget v5, v7, Lni/d;->a:I

    if-ne v6, v5, :cond_3b

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v5, v8, Lio/sentry/protocol/c0;->E:Ljava/lang/Boolean;

    iput-object v9, v1, Lio/sentry/protocol/u;->E:Lio/sentry/protocol/b0;

    :cond_3b
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v14, 0x1

    goto/16 :goto_26

    :cond_3c
    new-instance v1, Laa3/u0;

    invoke-direct {v1, v3}, Laa3/u0;-><init>(Ljava/util/List;)V

    iput-object v1, v4, Lio/sentry/e5;->S:Laa3/u0;

    return-object v4

    :cond_3d
    new-instance v1, Ljava/io/IOException;

    const-string v2, "No InputStream provided; use parse(Tombstone) instead."

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_23
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_22
        :pswitch_1b
        :pswitch_1a
        :pswitch_10
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
    .end packed-switch
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lio/sentry/android/core/internal/tombstone/b;->w:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    :cond_0
    return-void
.end method
