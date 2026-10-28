.class public final Lz23/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lpg3/p;


# direct methods
.method public constructor <init>(Lpg3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz23/a;->a:Lpg3/p;

    return-void
.end method

.method public static a(Lz23/a;Ljava/lang/String;Ljava/lang/String;Lb33/f;Lb33/g;Ljava/lang/String;Ls93/k;Ljava/lang/String;Ljava/lang/Long;Lb33/c;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb33/i;Ljava/lang/Boolean;Lw23/t;Ljava/lang/Boolean;Ljava/lang/Boolean;I)Lio/getstream/android/video/generated/models/ClientEvent;
    .locals 32

    move/from16 v0, p20

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v11, 0x0

    goto :goto_0

    :cond_0
    move-object/from16 v11, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    const/16 v27, 0x0

    goto :goto_1

    :cond_1
    move-object/from16 v27, p2

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    const/16 v24, 0x0

    goto :goto_2

    :cond_2
    move-object/from16 v24, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    goto :goto_3

    :cond_3
    move-object/from16 v1, p6

    :goto_3
    and-int/lit8 v3, v0, 0x40

    if-eqz v3, :cond_4

    const/4 v12, 0x0

    goto :goto_4

    :cond_4
    move-object/from16 v12, p7

    :goto_4
    and-int/lit16 v3, v0, 0x80

    if-eqz v3, :cond_5

    const/4 v3, 0x0

    goto :goto_5

    :cond_5
    move-object/from16 v3, p8

    :goto_5
    and-int/lit16 v4, v0, 0x100

    if-eqz v4, :cond_6

    const/4 v4, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v4, p9

    :goto_6
    and-int/lit16 v5, v0, 0x200

    if-eqz v5, :cond_7

    const/16 v17, 0x0

    goto :goto_7

    :cond_7
    move-object/from16 v17, p10

    :goto_7
    and-int/lit16 v5, v0, 0x400

    if-eqz v5, :cond_8

    const/16 v19, 0x0

    goto :goto_8

    :cond_8
    move-object/from16 v19, p11

    :goto_8
    and-int/lit16 v5, v0, 0x800

    if-eqz v5, :cond_9

    const/16 v18, 0x0

    goto :goto_9

    :cond_9
    move-object/from16 v18, p12

    :goto_9
    and-int/lit16 v5, v0, 0x1000

    if-eqz v5, :cond_a

    const/4 v5, 0x0

    goto :goto_a

    :cond_a
    move-object/from16 v5, p13

    :goto_a
    and-int/lit16 v6, v0, 0x2000

    if-eqz v6, :cond_b

    const/16 v22, 0x0

    goto :goto_b

    :cond_b
    move-object/from16 v22, p14

    :goto_b
    and-int/lit16 v6, v0, 0x4000

    if-eqz v6, :cond_c

    const/4 v6, 0x0

    goto :goto_c

    :cond_c
    move-object/from16 v6, p15

    :goto_c
    const v7, 0x8000

    and-int/2addr v7, v0

    if-eqz v7, :cond_d

    const/16 v31, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v31, p16

    :goto_d
    const/high16 v7, 0x10000

    and-int/2addr v7, v0

    if-eqz v7, :cond_e

    const/4 v7, 0x0

    goto :goto_e

    :cond_e
    move-object/from16 v7, p17

    :goto_e
    const/high16 v8, 0x100000

    and-int/2addr v8, v0

    if-eqz v8, :cond_f

    const/4 v8, 0x0

    goto :goto_f

    :cond_f
    move-object/from16 v8, p18

    :goto_f
    const/high16 v9, 0x200000

    and-int/2addr v0, v9

    if-eqz v0, :cond_10

    const/4 v0, 0x0

    goto :goto_10

    :cond_10
    move-object/from16 v0, p19

    :goto_10
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v9, p4

    iget-object v9, v9, Lb33/g;->w:Ljava/lang/String;

    invoke-interface/range {p3 .. p3}, Lb33/f;->getValue()Ljava/lang/String;

    move-result-object v23

    sget-object v10, Ljg3/p;->F:Ljg3/p;

    sget-object v13, Ljg3/i;->H:Lg73/a;

    const-string v13, "zone"

    invoke-static {v10, v13}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    sget-object v15, Ljg3/c;->H:Ljg3/c;

    move-object/from16 p1, v3

    const/4 v15, 0x0

    const-wide/16 v2, 0x3e8

    invoke-static {v13, v14, v2, v3}, Lcom/squareup/wire/n;->A(JJ)J

    move-result-wide v2

    move-object/from16 p2, v15

    const/16 v15, 0x3e8

    invoke-static {v15, v13, v14}, Lcom/squareup/wire/n;->B(IJ)I

    move-result v13

    const v14, 0xf4240

    mul-int/2addr v13, v14

    invoke-static {v13, v2, v3}, Ljg3/c;->o0(IJ)Ljg3/c;

    move-result-object v2

    invoke-virtual {v10}, Ljg3/o;->k()Log3/h;

    move-result-object v3

    invoke-virtual {v3, v2}, Log3/h;->a(Ljg3/c;)Ljg3/p;

    move-result-object v3

    invoke-static {v2, v3}, Ljg3/i;->q0(Ljg3/c;Ljg3/o;)Ljg3/i;

    move-result-object v25

    new-instance v2, Lx33/a;

    invoke-static {}, Lx33/a;->a()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x200

    invoke-static {v3, v2}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v28

    sget-object v2, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lt23/i3;->b:Lt23/j3;

    if-eqz v2, :cond_11

    check-cast v2, Lt23/b4;

    invoke-virtual {v2}, Lt23/b4;->r()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v29, v2

    goto :goto_11

    :cond_11
    move-object/from16 v29, p2

    :goto_11
    if-eqz p1, :cond_12

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_12

    :cond_12
    move-object/from16 v2, p2

    :goto_12
    if-eqz v7, :cond_13

    iget-object v3, v7, Lw23/t;->w:Ljava/lang/String;

    move-object v10, v3

    goto :goto_13

    :cond_13
    move-object/from16 v10, p2

    :goto_13
    if-eqz v4, :cond_14

    iget-object v3, v4, Lb33/c;->w:Ljava/lang/String;

    move-object v14, v3

    goto :goto_14

    :cond_14
    move-object/from16 v14, p2

    :goto_14
    if-eqz v6, :cond_15

    iget-object v3, v6, Lb33/i;->w:Ljava/lang/String;

    move-object v15, v3

    goto :goto_15

    :cond_15
    move-object/from16 v15, p2

    :goto_15
    invoke-static/range {p2 .. p2}, Lz23/a;->b(Ljava/lang/Boolean;)Ljava/lang/String;

    move-result-object v20

    invoke-static {v8}, Lz23/a;->b(Ljava/lang/Boolean;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v0}, Lz23/a;->b(Ljava/lang/Boolean;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v3, p0

    iget-object v3, v3, Lz23/a;->a:Lpg3/p;

    iget-object v3, v3, Lpg3/p;->y:Ljava/lang/Object;

    check-cast v3, Lec3/r1;

    iget-object v3, v3, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Ljava/lang/String;

    if-eqz v1, :cond_16

    invoke-virtual {v1}, Ls93/k;->e()Ljava/lang/String;

    move-result-object v1

    move-object v7, v1

    goto :goto_16

    :cond_16
    move-object/from16 v7, p2

    :goto_16
    new-instance v3, Lio/getstream/android/video/generated/models/ClientEvent;

    const/16 v16, 0x0

    const-string v21, "1.28.0"

    const/16 v26, 0x0

    const/16 v30, 0x0

    move-object v8, v2

    move-object v4, v5

    move-object v5, v0

    invoke-direct/range {v3 .. v31}, Lio/getstream/android/video/generated/models/ClientEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-object v3
.end method

.method public static b(Ljava/lang/Boolean;)Ljava/lang/String;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "GRANTED"

    return-object p0

    :cond_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const-string p0, "FAILED"

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method
