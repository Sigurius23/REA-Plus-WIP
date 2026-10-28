.class public abstract Lg1/f9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lep0/a;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lep0/a;-><init>(I)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Lg1/f9;->a:Lp1/b0;

    return-void
.end method

.method public static final a(Ll3/v0;Lc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p2, Lp1/q;

    const v0, -0xcdfd31

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    if-eq v1, v2, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p2, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Lg1/f9;->a:Lp1/b0;

    invoke-virtual {p2, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll3/v0;

    invoke-virtual {v2, p0}, Ll3/v0;->e(Ll3/v0;)Ll3/v0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    and-int/lit8 v0, v0, 0x70

    const/16 v2, 0x8

    or-int/2addr v0, v2

    invoke-static {v1, p1, p2, v0}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_5
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, La11/j;

    const/4 v1, 0x5

    invoke-direct {v0, p0, p1, p3, v1}, La11/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V
    .locals 41

    move/from16 v0, p22

    move/from16 v1, p23

    move/from16 v2, p24

    move-object/from16 v3, p21

    check-cast v3, Lp1/q;

    const v4, 0x3d476b43

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v0, 0x6

    if-nez v4, :cond_1

    move-object/from16 v4, p0

    invoke-virtual {v3, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v0

    goto :goto_1

    :cond_1
    move-object/from16 v4, p0

    move v7, v0

    :goto_1
    and-int/lit8 v8, v2, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v7, v7, 0x30

    :cond_2
    move-object/from16 v11, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v11, v0, 0x30

    if-nez v11, :cond_2

    move-object/from16 v11, p1

    invoke-virtual {v3, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    const/16 v12, 0x20

    goto :goto_2

    :cond_4
    const/16 v12, 0x10

    :goto_2
    or-int/2addr v7, v12

    :goto_3
    and-int/lit8 v12, v2, 0x4

    if-eqz v12, :cond_5

    or-int/lit16 v7, v7, 0x180

    move-wide/from16 v5, p2

    goto :goto_5

    :cond_5
    and-int/lit16 v15, v0, 0x180

    move-wide/from16 v5, p2

    if-nez v15, :cond_7

    invoke-virtual {v3, v5, v6}, Lp1/q;->f(J)Z

    move-result v16

    if-eqz v16, :cond_6

    const/16 v16, 0x100

    goto :goto_4

    :cond_6
    const/16 v16, 0x80

    :goto_4
    or-int v7, v7, v16

    :cond_7
    :goto_5
    and-int/lit8 v16, v2, 0x8

    const/16 v17, 0x400

    const/16 v18, 0x800

    if-eqz v16, :cond_8

    or-int/lit16 v7, v7, 0xc00

    move-wide/from16 v10, p4

    goto :goto_7

    :cond_8
    and-int/lit16 v9, v0, 0xc00

    move-wide/from16 v10, p4

    if-nez v9, :cond_a

    invoke-virtual {v3, v10, v11}, Lp1/q;->f(J)Z

    move-result v20

    if-eqz v20, :cond_9

    move/from16 v20, v18

    goto :goto_6

    :cond_9
    move/from16 v20, v17

    :goto_6
    or-int v7, v7, v20

    :cond_a
    :goto_7
    and-int/lit8 v20, v2, 0x10

    const/16 v21, 0x2000

    const/16 v22, 0x4000

    if-eqz v20, :cond_c

    or-int/lit16 v7, v7, 0x6000

    :cond_b
    move-object/from16 v9, p6

    goto :goto_9

    :cond_c
    and-int/lit16 v9, v0, 0x6000

    if-nez v9, :cond_b

    move-object/from16 v9, p6

    invoke-virtual {v3, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_d

    move/from16 v24, v22

    goto :goto_8

    :cond_d
    move/from16 v24, v21

    :goto_8
    or-int v7, v7, v24

    :goto_9
    and-int/lit8 v24, v2, 0x20

    const/high16 v25, 0x20000

    const/high16 v26, 0x30000

    const/high16 v27, 0x10000

    if-eqz v24, :cond_e

    or-int v7, v7, v26

    move-object/from16 v13, p7

    goto :goto_b

    :cond_e
    and-int v28, v0, v26

    move-object/from16 v13, p7

    if-nez v28, :cond_10

    invoke-virtual {v3, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_f

    move/from16 v29, v25

    goto :goto_a

    :cond_f
    move/from16 v29, v27

    :goto_a
    or-int v7, v7, v29

    :cond_10
    :goto_b
    and-int/lit8 v29, v2, 0x40

    const/high16 v30, 0x80000

    const/high16 v31, 0x100000

    const/high16 v32, 0x180000

    if-eqz v29, :cond_11

    or-int v7, v7, v32

    move-object/from16 v14, p8

    goto :goto_d

    :cond_11
    and-int v33, v0, v32

    move-object/from16 v14, p8

    if-nez v33, :cond_13

    invoke-virtual {v3, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v34

    if-eqz v34, :cond_12

    move/from16 v34, v31

    goto :goto_c

    :cond_12
    move/from16 v34, v30

    :goto_c
    or-int v7, v7, v34

    :cond_13
    :goto_d
    and-int/lit16 v15, v2, 0x80

    const/high16 v35, 0xc00000

    if-eqz v15, :cond_14

    or-int v7, v7, v35

    move-wide/from16 v4, p9

    goto :goto_f

    :cond_14
    and-int v35, v0, v35

    move-wide/from16 v4, p9

    if-nez v35, :cond_16

    invoke-virtual {v3, v4, v5}, Lp1/q;->f(J)Z

    move-result v6

    if-eqz v6, :cond_15

    const/high16 v6, 0x800000

    goto :goto_e

    :cond_15
    const/high16 v6, 0x400000

    :goto_e
    or-int/2addr v7, v6

    :cond_16
    :goto_f
    and-int/lit16 v6, v2, 0x100

    const/high16 v35, 0x6000000

    if-eqz v6, :cond_17

    or-int v7, v7, v35

    move-object/from16 v0, p11

    goto :goto_11

    :cond_17
    and-int v35, v0, v35

    move-object/from16 v0, p11

    if-nez v35, :cond_19

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v35

    if-eqz v35, :cond_18

    const/high16 v35, 0x4000000

    goto :goto_10

    :cond_18
    const/high16 v35, 0x2000000

    :goto_10
    or-int v7, v7, v35

    :cond_19
    :goto_11
    and-int/lit16 v0, v2, 0x200

    const/high16 v35, 0x30000000

    if-eqz v0, :cond_1b

    or-int v7, v7, v35

    :cond_1a
    move/from16 v35, v0

    move-object/from16 v0, p12

    goto :goto_13

    :cond_1b
    and-int v35, p22, v35

    if-nez v35, :cond_1a

    move/from16 v35, v0

    move-object/from16 v0, p12

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v36

    if-eqz v36, :cond_1c

    const/high16 v36, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v36, 0x10000000

    :goto_12
    or-int v7, v7, v36

    :goto_13
    and-int/lit16 v0, v2, 0x400

    if-eqz v0, :cond_1d

    or-int/lit8 v34, v1, 0x6

    move-wide/from16 v4, p13

    goto :goto_15

    :cond_1d
    and-int/lit8 v36, v1, 0x6

    move-wide/from16 v4, p13

    if-nez v36, :cond_1f

    invoke-virtual {v3, v4, v5}, Lp1/q;->f(J)Z

    move-result v36

    if-eqz v36, :cond_1e

    const/16 v34, 0x4

    goto :goto_14

    :cond_1e
    const/16 v34, 0x2

    :goto_14
    or-int v34, v1, v34

    goto :goto_15

    :cond_1f
    move/from16 v34, v1

    :goto_15
    move/from16 v36, v0

    and-int/lit16 v0, v2, 0x800

    if-eqz v0, :cond_20

    or-int/lit8 v34, v34, 0x30

    move/from16 v37, v0

    :goto_16
    move/from16 v0, v34

    goto :goto_18

    :cond_20
    and-int/lit8 v37, v1, 0x30

    if-nez v37, :cond_22

    move/from16 v37, v0

    move/from16 v0, p15

    invoke-virtual {v3, v0}, Lp1/q;->e(I)Z

    move-result v38

    if-eqz v38, :cond_21

    const/16 v23, 0x20

    goto :goto_17

    :cond_21
    const/16 v23, 0x10

    :goto_17
    or-int v34, v34, v23

    goto :goto_16

    :cond_22
    move/from16 v37, v0

    move/from16 v0, p15

    goto :goto_16

    :goto_18
    and-int/lit16 v4, v2, 0x1000

    if-eqz v4, :cond_24

    or-int/lit16 v0, v0, 0x180

    :cond_23
    move/from16 v5, p16

    goto :goto_1a

    :cond_24
    and-int/lit16 v5, v1, 0x180

    if-nez v5, :cond_23

    move/from16 v5, p16

    invoke-virtual {v3, v5}, Lp1/q;->h(Z)Z

    move-result v19

    if-eqz v19, :cond_25

    const/16 v28, 0x100

    goto :goto_19

    :cond_25
    const/16 v28, 0x80

    :goto_19
    or-int v0, v0, v28

    :goto_1a
    move/from16 v19, v4

    and-int/lit16 v4, v2, 0x2000

    if-eqz v4, :cond_26

    or-int/lit16 v0, v0, 0xc00

    goto :goto_1b

    :cond_26
    move/from16 v23, v0

    and-int/lit16 v0, v1, 0xc00

    if-nez v0, :cond_28

    move/from16 v0, p17

    invoke-virtual {v3, v0}, Lp1/q;->e(I)Z

    move-result v28

    if-eqz v28, :cond_27

    move/from16 v17, v18

    :cond_27
    or-int v17, v23, v17

    move/from16 v0, v17

    goto :goto_1b

    :cond_28
    move/from16 v0, p17

    move/from16 v0, v23

    :goto_1b
    move/from16 v17, v4

    and-int/lit16 v4, v2, 0x4000

    if-eqz v4, :cond_2a

    or-int/lit16 v0, v0, 0x6000

    move/from16 v18, v0

    :cond_29
    move/from16 v0, p18

    goto :goto_1c

    :cond_2a
    move/from16 v18, v0

    and-int/lit16 v0, v1, 0x6000

    if-nez v0, :cond_29

    move/from16 v0, p18

    invoke-virtual {v3, v0}, Lp1/q;->e(I)Z

    move-result v23

    if-eqz v23, :cond_2b

    move/from16 v21, v22

    :cond_2b
    or-int v18, v18, v21

    :goto_1c
    const v21, 0x8000

    and-int v21, v2, v21

    if-eqz v21, :cond_2c

    or-int v18, v18, v26

    move-object/from16 v0, p19

    goto :goto_1e

    :cond_2c
    and-int v22, v1, v26

    move-object/from16 v0, p19

    if-nez v22, :cond_2e

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_2d

    goto :goto_1d

    :cond_2d
    move/from16 v25, v27

    :goto_1d
    or-int v18, v18, v25

    :cond_2e
    :goto_1e
    and-int v22, v1, v32

    if-nez v22, :cond_30

    and-int v22, v2, v27

    move-object/from16 v0, p20

    if-nez v22, :cond_2f

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_2f

    move/from16 v30, v31

    :cond_2f
    or-int v18, v18, v30

    goto :goto_1f

    :cond_30
    move-object/from16 v0, p20

    :goto_1f
    const v22, 0x12492493

    and-int v0, v7, v22

    const v1, 0x12492492

    const/16 v22, 0x1

    if-ne v0, v1, :cond_32

    const v0, 0x92493

    and-int v0, v18, v0

    const v1, 0x92492

    if-eq v0, v1, :cond_31

    goto :goto_20

    :cond_31
    const/4 v0, 0x0

    goto :goto_21

    :cond_32
    :goto_20
    move/from16 v0, v22

    :goto_21
    and-int/lit8 v1, v7, 0x1

    invoke-virtual {v3, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4b

    invoke-virtual {v3}, Lp1/q;->Z()V

    and-int/lit8 v0, p22, 0x1

    const v1, -0x380001

    if-eqz v0, :cond_36

    invoke-virtual {v3}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_33

    goto :goto_22

    :cond_33
    invoke-virtual {v3}, Lp1/q;->X()V

    and-int v0, v2, v27

    if-eqz v0, :cond_34

    and-int v18, v18, v1

    :cond_34
    move-object/from16 v0, p1

    move-wide/from16 v25, p2

    move-wide/from16 v15, p9

    move-object/from16 v6, p11

    move-object/from16 v12, p12

    move-wide/from16 v23, p13

    move/from16 v20, p15

    move/from16 v17, p17

    move/from16 v22, p18

    move-object/from16 v8, p19

    :cond_35
    move-object/from16 v4, p20

    goto/16 :goto_2d

    :cond_36
    :goto_22
    if-eqz v8, :cond_37

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_23

    :cond_37
    move-object/from16 v0, p1

    :goto_23
    if-eqz v12, :cond_38

    sget-wide v25, Li2/x;->n:J

    goto :goto_24

    :cond_38
    move-wide/from16 v25, p2

    :goto_24
    if-eqz v16, :cond_39

    sget-wide v10, Ly3/o;->c:J

    :cond_39
    const/4 v8, 0x0

    if-eqz v20, :cond_3a

    move-object v9, v8

    :cond_3a
    if-eqz v24, :cond_3b

    move-object v13, v8

    :cond_3b
    if-eqz v29, :cond_3c

    move-object v14, v8

    :cond_3c
    if-eqz v15, :cond_3d

    sget-wide v15, Ly3/o;->c:J

    goto :goto_25

    :cond_3d
    move-wide/from16 v15, p9

    :goto_25
    if-eqz v6, :cond_3e

    move-object v6, v8

    goto :goto_26

    :cond_3e
    move-object/from16 v6, p11

    :goto_26
    if-eqz v35, :cond_3f

    move-object v12, v8

    goto :goto_27

    :cond_3f
    move-object/from16 v12, p12

    :goto_27
    if-eqz v36, :cond_40

    sget-wide v23, Ly3/o;->c:J

    goto :goto_28

    :cond_40
    move-wide/from16 v23, p13

    :goto_28
    if-eqz v37, :cond_41

    move/from16 v20, v22

    goto :goto_29

    :cond_41
    move/from16 v20, p15

    :goto_29
    if-eqz v19, :cond_42

    move/from16 v5, v22

    :cond_42
    if-eqz v17, :cond_43

    const v17, 0x7fffffff

    goto :goto_2a

    :cond_43
    move/from16 v17, p17

    :goto_2a
    if-eqz v4, :cond_44

    goto :goto_2b

    :cond_44
    move/from16 v22, p18

    :goto_2b
    if-eqz v21, :cond_45

    goto :goto_2c

    :cond_45
    move-object/from16 v8, p19

    :goto_2c
    and-int v4, v2, v27

    if-eqz v4, :cond_35

    sget-object v4, Lg1/f9;->a:Lp1/b0;

    invoke-virtual {v3, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll3/v0;

    and-int v18, v18, v1

    :goto_2d
    invoke-virtual {v3}, Lp1/q;->r()V

    sget-object v1, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v3, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li2/x;

    move-object/from16 p16, v0

    iget-wide v0, v1, Li2/x;->a:J

    sget-object v2, Lg1/j1;->a:Lp1/b0;

    invoke-virtual {v3, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    const-wide/16 v27, 0x10

    cmp-long v19, v25, v27

    if-eqz v19, :cond_46

    move-wide/from16 v0, v25

    goto :goto_2e

    :cond_46
    invoke-virtual {v4}, Ll3/v0;->c()J

    move-result-wide v29

    cmp-long v19, v29, v27

    if-eqz v19, :cond_47

    invoke-virtual {v4}, Ll3/v0;->c()J

    move-result-wide v0

    goto :goto_2e

    :cond_47
    invoke-static {v2, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v0

    :goto_2e
    if-eqz v12, :cond_48

    iget v2, v12, Lw3/k;->a:I

    goto :goto_2f

    :cond_48
    const/high16 v2, -0x80000000

    :goto_2f
    const-wide/16 v27, 0x0

    const v19, 0xfd6f51

    move/from16 p12, v2

    move-object/from16 p1, v4

    move-object/from16 p11, v6

    move-object/from16 p7, v9

    move-wide/from16 p4, v10

    move-object/from16 p6, v13

    move-object/from16 p8, v14

    move-wide/from16 p9, v15

    move/from16 p15, v19

    move-wide/from16 p13, v23

    move-wide/from16 p2, v27

    invoke-static/range {p1 .. p15}, Ll3/v0;->f(Ll3/v0;JJLp3/r;Lp3/n;Lp3/i;JLw3/l;IJI)Ll3/v0;

    move-result-object v2

    invoke-virtual {v3, v0, v1}, Lp1/q;->f(J)Z

    move-result v19

    move-object/from16 p3, v2

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 p14, v4

    if-nez v19, :cond_49

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v2, v4, :cond_4a

    :cond_49
    new-instance v2, Lg1/e9;

    const/4 v4, 0x0

    invoke-direct {v2, v0, v1, v4}, Lg1/e9;-><init>(JI)V

    invoke-virtual {v3, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4a
    check-cast v2, Li2/a0;

    and-int/lit8 v0, v7, 0x7e

    shr-int/lit8 v1, v18, 0x6

    and-int/lit16 v1, v1, 0x1c00

    or-int/2addr v0, v1

    shl-int/lit8 v1, v18, 0x9

    const v4, 0xe000

    and-int/2addr v4, v1

    or-int/2addr v0, v4

    const/high16 v4, 0x70000

    and-int/2addr v4, v1

    or-int/2addr v0, v4

    const/high16 v4, 0x380000

    and-int/2addr v4, v1

    or-int/2addr v0, v4

    const/high16 v4, 0x1c00000

    and-int/2addr v1, v4

    or-int/2addr v0, v1

    const/16 v1, 0x200

    const/4 v4, 0x0

    move-object/from16 p1, p0

    move-object/from16 p2, p16

    move/from16 p12, v0

    move/from16 p13, v1

    move-object/from16 p9, v2

    move-object/from16 p11, v3

    move-object/from16 p10, v4

    move/from16 p6, v5

    move-object/from16 p4, v8

    move/from16 p7, v17

    move/from16 p5, v20

    move/from16 p8, v22

    invoke-static/range {p1 .. p13}, Lq83/g;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ll3/v0;Lkotlin/jvm/functions/Function1;IZIILi2/a0;Lu0/z0;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v1, p2

    move-object/from16 v0, p11

    move-object/from16 v21, p14

    move-object v2, v1

    move-object v7, v9

    move-object v9, v14

    move/from16 v18, v17

    move/from16 v19, v22

    move-wide/from16 v3, v25

    move/from16 v17, v5

    move-object/from16 v40, v12

    move-object v12, v6

    move-wide v5, v10

    move-wide v10, v15

    move/from16 v16, v20

    move-wide/from16 v14, v23

    move-object/from16 v20, v8

    move-object v8, v13

    move-object/from16 v13, v40

    goto :goto_30

    :cond_4b
    move-object v0, v3

    invoke-virtual {v0}, Lp1/q;->X()V

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move-object/from16 v12, p11

    move/from16 v16, p15

    move/from16 v18, p17

    move/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move/from16 v17, v5

    move-object v7, v9

    move-wide v5, v10

    move-object v8, v13

    move-object v9, v14

    move-wide/from16 v10, p9

    move-object/from16 v13, p12

    move-wide/from16 v14, p13

    :goto_30
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_4c

    move-object v1, v0

    new-instance v0, Lg1/c9;

    move/from16 v22, p22

    move/from16 v23, p23

    move/from16 v24, p24

    move-object/from16 v39, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v24}, Lg1/c9;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;III)V

    move-object/from16 v1, v39

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_4c
    return-void
.end method

.method public static final c(Ll3/g;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V
    .locals 61

    move-object/from16 v1, p0

    move/from16 v0, p23

    move/from16 v2, p24

    move/from16 v3, p25

    move-object/from16 v4, p22

    check-cast v4, Lp1/q;

    const v5, 0x2c5a8491

    invoke-virtual {v4, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_1

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_1
    move v5, v0

    :goto_1
    and-int/lit8 v8, v3, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v5, v5, 0x30

    :cond_2
    move-object/from16 v11, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v11, v0, 0x30

    if-nez v11, :cond_2

    move-object/from16 v11, p1

    invoke-virtual {v4, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    const/16 v12, 0x20

    goto :goto_2

    :cond_4
    const/16 v12, 0x10

    :goto_2
    or-int/2addr v5, v12

    :goto_3
    and-int/lit8 v12, v3, 0x4

    if-eqz v12, :cond_5

    or-int/lit16 v5, v5, 0x180

    move-wide/from16 v9, p2

    goto :goto_5

    :cond_5
    and-int/lit16 v15, v0, 0x180

    move-wide/from16 v9, p2

    if-nez v15, :cond_7

    invoke-virtual {v4, v9, v10}, Lp1/q;->f(J)Z

    move-result v16

    if-eqz v16, :cond_6

    const/16 v16, 0x100

    goto :goto_4

    :cond_6
    const/16 v16, 0x80

    :goto_4
    or-int v5, v5, v16

    :cond_7
    :goto_5
    and-int/lit8 v16, v3, 0x8

    const/16 v17, 0x400

    const/16 v18, 0x800

    if-eqz v16, :cond_8

    or-int/lit16 v5, v5, 0xc00

    move-wide/from16 v13, p4

    goto :goto_7

    :cond_8
    and-int/lit16 v6, v0, 0xc00

    move-wide/from16 v13, p4

    if-nez v6, :cond_a

    invoke-virtual {v4, v13, v14}, Lp1/q;->f(J)Z

    move-result v21

    if-eqz v21, :cond_9

    move/from16 v21, v18

    goto :goto_6

    :cond_9
    move/from16 v21, v17

    :goto_6
    or-int v5, v5, v21

    :cond_a
    :goto_7
    and-int/lit8 v21, v3, 0x10

    const/16 v22, 0x2000

    const/16 v23, 0x4000

    if-eqz v21, :cond_c

    or-int/lit16 v5, v5, 0x6000

    :cond_b
    move-object/from16 v6, p6

    goto :goto_9

    :cond_c
    and-int/lit16 v6, v0, 0x6000

    if-nez v6, :cond_b

    move-object/from16 v6, p6

    invoke-virtual {v4, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_d

    move/from16 v25, v23

    goto :goto_8

    :cond_d
    move/from16 v25, v22

    :goto_8
    or-int v5, v5, v25

    :goto_9
    and-int/lit8 v25, v3, 0x20

    const/high16 v26, 0x10000

    const/high16 v27, 0x30000

    const/high16 v28, 0x20000

    if-eqz v25, :cond_e

    or-int v5, v5, v27

    move-object/from16 v15, p7

    goto :goto_b

    :cond_e
    and-int v29, v0, v27

    move-object/from16 v15, p7

    if-nez v29, :cond_10

    invoke-virtual {v4, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_f

    move/from16 v30, v28

    goto :goto_a

    :cond_f
    move/from16 v30, v26

    :goto_a
    or-int v5, v5, v30

    :cond_10
    :goto_b
    and-int/lit8 v30, v3, 0x40

    const/high16 v31, 0x80000

    const/high16 v32, 0x100000

    const/high16 v33, 0x180000

    if-eqz v30, :cond_11

    or-int v5, v5, v33

    move-object/from16 v7, p8

    goto :goto_d

    :cond_11
    and-int v34, v0, v33

    move-object/from16 v7, p8

    if-nez v34, :cond_13

    invoke-virtual {v4, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v35

    if-eqz v35, :cond_12

    move/from16 v35, v32

    goto :goto_c

    :cond_12
    move/from16 v35, v31

    :goto_c
    or-int v5, v5, v35

    :cond_13
    :goto_d
    and-int/lit16 v0, v3, 0x80

    const/high16 v35, 0x400000

    const/high16 v36, 0x800000

    const/high16 v37, 0xc00000

    if-eqz v0, :cond_15

    or-int v5, v5, v37

    :cond_14
    move/from16 v38, v5

    move-wide/from16 v5, p9

    goto :goto_f

    :cond_15
    and-int v38, p23, v37

    if-nez v38, :cond_14

    move/from16 v38, v5

    move-wide/from16 v5, p9

    invoke-virtual {v4, v5, v6}, Lp1/q;->f(J)Z

    move-result v39

    if-eqz v39, :cond_16

    move/from16 v39, v36

    goto :goto_e

    :cond_16
    move/from16 v39, v35

    :goto_e
    or-int v38, v38, v39

    :goto_f
    move/from16 v39, v0

    and-int/lit16 v0, v3, 0x100

    const/high16 v40, 0x6000000

    if-eqz v0, :cond_18

    or-int v38, v38, v40

    :cond_17
    move/from16 v40, v0

    move-object/from16 v0, p11

    goto :goto_11

    :cond_18
    and-int v40, p23, v40

    if-nez v40, :cond_17

    move/from16 v40, v0

    move-object/from16 v0, p11

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v41

    if-eqz v41, :cond_19

    const/high16 v41, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v41, 0x2000000

    :goto_10
    or-int v38, v38, v41

    :goto_11
    and-int/lit16 v0, v3, 0x200

    const/high16 v41, 0x30000000

    if-eqz v0, :cond_1b

    or-int v38, v38, v41

    :cond_1a
    move/from16 v41, v0

    move-object/from16 v0, p12

    goto :goto_13

    :cond_1b
    and-int v41, p23, v41

    if-nez v41, :cond_1a

    move/from16 v41, v0

    move-object/from16 v0, p12

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v42

    if-eqz v42, :cond_1c

    const/high16 v42, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v42, 0x10000000

    :goto_12
    or-int v38, v38, v42

    :goto_13
    and-int/lit16 v0, v3, 0x400

    if-eqz v0, :cond_1d

    or-int/lit8 v19, v2, 0x6

    move-wide/from16 v5, p13

    goto :goto_15

    :cond_1d
    and-int/lit8 v42, v2, 0x6

    move-wide/from16 v5, p13

    if-nez v42, :cond_1f

    invoke-virtual {v4, v5, v6}, Lp1/q;->f(J)Z

    move-result v42

    if-eqz v42, :cond_1e

    const/16 v19, 0x4

    goto :goto_14

    :cond_1e
    const/16 v19, 0x2

    :goto_14
    or-int v19, v2, v19

    goto :goto_15

    :cond_1f
    move/from16 v19, v2

    :goto_15
    move/from16 v42, v0

    and-int/lit16 v0, v3, 0x800

    if-eqz v0, :cond_20

    or-int/lit8 v19, v19, 0x30

    move/from16 v43, v0

    :goto_16
    move/from16 v0, v19

    goto :goto_18

    :cond_20
    and-int/lit8 v43, v2, 0x30

    if-nez v43, :cond_22

    move/from16 v43, v0

    move/from16 v0, p15

    invoke-virtual {v4, v0}, Lp1/q;->e(I)Z

    move-result v44

    if-eqz v44, :cond_21

    const/16 v29, 0x20

    goto :goto_17

    :cond_21
    const/16 v29, 0x10

    :goto_17
    or-int v19, v19, v29

    goto :goto_16

    :cond_22
    move/from16 v43, v0

    move/from16 v0, p15

    goto :goto_16

    :goto_18
    and-int/lit16 v5, v3, 0x1000

    if-eqz v5, :cond_24

    or-int/lit16 v0, v0, 0x180

    :cond_23
    move/from16 v6, p16

    goto :goto_1a

    :cond_24
    and-int/lit16 v6, v2, 0x180

    if-nez v6, :cond_23

    move/from16 v6, p16

    invoke-virtual {v4, v6}, Lp1/q;->h(Z)Z

    move-result v19

    if-eqz v19, :cond_25

    const/16 v24, 0x100

    goto :goto_19

    :cond_25
    const/16 v24, 0x80

    :goto_19
    or-int v0, v0, v24

    :goto_1a
    move/from16 v19, v5

    and-int/lit16 v5, v3, 0x2000

    if-eqz v5, :cond_26

    or-int/lit16 v0, v0, 0xc00

    goto :goto_1b

    :cond_26
    move/from16 v20, v0

    and-int/lit16 v0, v2, 0xc00

    if-nez v0, :cond_28

    move/from16 v0, p17

    invoke-virtual {v4, v0}, Lp1/q;->e(I)Z

    move-result v24

    if-eqz v24, :cond_27

    move/from16 v17, v18

    :cond_27
    or-int v17, v20, v17

    move/from16 v0, v17

    goto :goto_1b

    :cond_28
    move/from16 v0, p17

    move/from16 v0, v20

    :goto_1b
    move/from16 v17, v5

    and-int/lit16 v5, v3, 0x4000

    if-eqz v5, :cond_2a

    or-int/lit16 v0, v0, 0x6000

    move/from16 v18, v0

    :cond_29
    move/from16 v0, p18

    goto :goto_1c

    :cond_2a
    move/from16 v18, v0

    and-int/lit16 v0, v2, 0x6000

    if-nez v0, :cond_29

    move/from16 v0, p18

    invoke-virtual {v4, v0}, Lp1/q;->e(I)Z

    move-result v20

    if-eqz v20, :cond_2b

    move/from16 v22, v23

    :cond_2b
    or-int v18, v18, v22

    :goto_1c
    const v20, 0x8000

    and-int v20, v3, v20

    if-eqz v20, :cond_2c

    or-int v18, v18, v27

    move-object/from16 v0, p19

    goto :goto_1e

    :cond_2c
    and-int v22, v2, v27

    move-object/from16 v0, p19

    if-nez v22, :cond_2e

    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_2d

    move/from16 v22, v28

    goto :goto_1d

    :cond_2d
    move/from16 v22, v26

    :goto_1d
    or-int v18, v18, v22

    :cond_2e
    :goto_1e
    and-int v22, v3, v26

    if-eqz v22, :cond_2f

    or-int v18, v18, v33

    move-object/from16 v0, p20

    goto :goto_1f

    :cond_2f
    and-int v23, v2, v33

    move-object/from16 v0, p20

    if-nez v23, :cond_31

    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_30

    move/from16 v31, v32

    :cond_30
    or-int v18, v18, v31

    :cond_31
    :goto_1f
    and-int v23, v2, v37

    if-nez v23, :cond_33

    and-int v23, v3, v28

    move-object/from16 v0, p21

    if-nez v23, :cond_32

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_32

    move/from16 v35, v36

    :cond_32
    or-int v18, v18, v35

    goto :goto_20

    :cond_33
    move-object/from16 v0, p21

    :goto_20
    const v23, 0x12492493

    and-int v0, v38, v23

    const v2, 0x12492492

    const/16 v23, 0x0

    const/16 v24, 0x1

    if-ne v0, v2, :cond_35

    const v0, 0x492493

    and-int v0, v18, v0

    const v2, 0x492492

    if-eq v0, v2, :cond_34

    goto :goto_21

    :cond_34
    move/from16 v0, v23

    goto :goto_22

    :cond_35
    :goto_21
    move/from16 v0, v24

    :goto_22
    and-int/lit8 v2, v38, 0x1

    invoke-virtual {v4, v2, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_55

    invoke-virtual {v4}, Lp1/q;->Z()V

    and-int/lit8 v0, p23, 0x1

    const p22, -0x1c00001

    sget-object v2, Lp1/l;->a:Lp1/v0;

    move/from16 v26, v0

    if-eqz v26, :cond_38

    invoke-virtual {v4}, Lp1/q;->C()Z

    move-result v26

    if-eqz v26, :cond_36

    goto :goto_23

    :cond_36
    invoke-virtual {v4}, Lp1/q;->X()V

    and-int v5, v3, v28

    if-eqz v5, :cond_37

    and-int v18, v18, p22

    :cond_37
    move-wide/from16 v25, p9

    move-object/from16 v0, p12

    move-wide/from16 v29, p13

    move/from16 v21, p15

    move/from16 v17, p17

    move/from16 v5, p18

    move-object/from16 v19, p19

    move-object/from16 v3, p20

    move-object/from16 v16, p21

    move-object v8, v11

    move-wide v11, v13

    move-object/from16 v13, p6

    move-object/from16 v14, p11

    goto/16 :goto_30

    :cond_38
    :goto_23
    if-eqz v8, :cond_39

    sget-object v8, Lb2/t;->w:Lb2/t;

    goto :goto_24

    :cond_39
    move-object v8, v11

    :goto_24
    if-eqz v12, :cond_3a

    sget-wide v9, Li2/x;->n:J

    :cond_3a
    if-eqz v16, :cond_3b

    sget-wide v11, Ly3/o;->c:J

    goto :goto_25

    :cond_3b
    move-wide v11, v13

    :goto_25
    if-eqz v21, :cond_3c

    const/4 v13, 0x0

    goto :goto_26

    :cond_3c
    move-object/from16 v13, p6

    :goto_26
    if-eqz v25, :cond_3d

    const/4 v15, 0x0

    :cond_3d
    if-eqz v30, :cond_3e

    const/4 v7, 0x0

    :cond_3e
    if-eqz v39, :cond_3f

    sget-wide v25, Ly3/o;->c:J

    goto :goto_27

    :cond_3f
    move-wide/from16 v25, p9

    :goto_27
    if-eqz v40, :cond_40

    const/4 v14, 0x0

    goto :goto_28

    :cond_40
    move-object/from16 v14, p11

    :goto_28
    if-eqz v41, :cond_41

    const/16 v16, 0x0

    goto :goto_29

    :cond_41
    move-object/from16 v16, p12

    :goto_29
    if-eqz v42, :cond_42

    sget-wide v29, Ly3/o;->c:J

    goto :goto_2a

    :cond_42
    move-wide/from16 v29, p13

    :goto_2a
    if-eqz v43, :cond_43

    move/from16 v21, v24

    goto :goto_2b

    :cond_43
    move/from16 v21, p15

    :goto_2b
    if-eqz v19, :cond_44

    move/from16 v6, v24

    :cond_44
    if-eqz v17, :cond_45

    const v17, 0x7fffffff

    goto :goto_2c

    :cond_45
    move/from16 v17, p17

    :goto_2c
    if-eqz v5, :cond_46

    move/from16 v5, v24

    goto :goto_2d

    :cond_46
    move/from16 v5, p18

    :goto_2d
    if-eqz v20, :cond_47

    sget-object v19, Lm83/z;->w:Lm83/z;

    goto :goto_2e

    :cond_47
    move-object/from16 v19, p19

    :goto_2e
    if-eqz v22, :cond_49

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_48

    new-instance v0, Lf0/q1;

    const/16 v3, 0x8

    invoke-direct {v0, v3}, Lf0/q1;-><init>(I)V

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_48
    check-cast v0, Lkotlin/jvm/functions/Function1;

    goto :goto_2f

    :cond_49
    move-object/from16 v0, p20

    :goto_2f
    and-int v3, p25, v28

    if-eqz v3, :cond_4a

    sget-object v3, Lg1/f9;->a:Lp1/b0;

    invoke-virtual {v4, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll3/v0;

    and-int v18, v18, p22

    move-object/from16 v60, v3

    move-object v3, v0

    move-object/from16 v0, v16

    move-object/from16 v16, v60

    goto :goto_30

    :cond_4a
    move-object v3, v0

    move-object/from16 v0, v16

    move-object/from16 v16, p21

    :goto_30
    invoke-virtual {v4}, Lp1/q;->r()V

    move-object/from16 p16, v3

    sget-object v3, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v4, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li2/x;

    move/from16 p18, v5

    move/from16 p17, v6

    iget-wide v5, v3, Li2/x;->a:J

    sget-object v3, Lg1/j1;->a:Lp1/b0;

    invoke-virtual {v4, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    const-wide/16 v27, 0x10

    cmp-long v22, v9, v27

    if-eqz v22, :cond_4b

    move-wide v5, v9

    goto :goto_31

    :cond_4b
    invoke-virtual/range {v16 .. v16}, Ll3/v0;->c()J

    move-result-wide v31

    cmp-long v22, v31, v27

    if-eqz v22, :cond_4c

    invoke-virtual/range {v16 .. v16}, Ll3/v0;->c()J

    move-result-wide v5

    goto :goto_31

    :cond_4c
    invoke-static {v3, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v5

    :goto_31
    sget-object v3, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v4, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/c1;

    move-object/from16 p8, v7

    move-object/from16 p19, v8

    invoke-virtual {v3}, Lg1/c1;->f()J

    move-result-wide v7

    invoke-virtual {v4, v7, v8}, Lp1/q;->f(J)Z

    move-result v3

    move/from16 p1, v3

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez p1, :cond_4d

    if-ne v3, v2, :cond_4e

    :cond_4d
    new-instance v3, Ll3/s0;

    new-instance v39, Ll3/m0;

    const/16 v57, 0x0

    const v58, 0xeffe

    const-wide/16 v42, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const-wide/16 v49, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const-wide/16 v54, 0x0

    sget-object v56, Lw3/l;->c:Lw3/l;

    move-wide/from16 v40, v7

    invoke-direct/range {v39 .. v58}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    move-object/from16 v7, v39

    const/4 v8, 0x0

    invoke-direct {v3, v7, v8, v8, v8}, Ll3/s0;-><init>(Ll3/m0;Ll3/m0;Ll3/m0;Ll3/m0;)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4e
    check-cast v3, Ll3/s0;

    and-int/lit8 v7, v38, 0xe

    const/4 v8, 0x4

    if-ne v7, v8, :cond_4f

    move/from16 v23, v24

    :cond_4f
    invoke-virtual {v4, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int v7, v23, v7

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_50

    if-ne v8, v2, :cond_51

    :cond_50
    new-instance v7, La6/i;

    const/16 v8, 0xf

    invoke-direct {v7, v3, v8}, La6/i;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v7}, Ll3/g;->d(Lkotlin/jvm/functions/Function1;)Ll3/g;

    move-result-object v8

    invoke-virtual {v4, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_51
    check-cast v8, Ll3/g;

    if-eqz v0, :cond_52

    iget v3, v0, Lw3/k;->a:I

    goto :goto_32

    :cond_52
    const/high16 v3, -0x80000000

    :goto_32
    const-wide/16 v22, 0x0

    const v7, 0xfd6f51

    move/from16 p12, v3

    move/from16 p15, v7

    move-wide/from16 p4, v11

    move-object/from16 p7, v13

    move-object/from16 p11, v14

    move-object/from16 p6, v15

    move-object/from16 p1, v16

    move-wide/from16 p2, v22

    move-wide/from16 p9, v25

    move-wide/from16 p13, v29

    invoke-static/range {p1 .. p15}, Ll3/v0;->f(Ll3/v0;JJLp3/r;Lp3/n;Lp3/i;JLw3/l;IJI)Ll3/v0;

    move-result-object v3

    move-object/from16 v7, p1

    move-object/from16 v14, p8

    move-object/from16 v16, p11

    invoke-virtual {v4, v5, v6}, Lp1/q;->f(J)Z

    move-result v20

    move-object/from16 p15, v0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v20, :cond_53

    if-ne v0, v2, :cond_54

    :cond_53
    new-instance v0, Lg1/e9;

    const/4 v2, 0x1

    invoke-direct {v0, v5, v6, v2}, Lg1/e9;-><init>(JI)V

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_54
    check-cast v0, Li2/a0;

    and-int/lit8 v2, v38, 0x70

    shr-int/lit8 v5, v18, 0x9

    and-int/lit16 v5, v5, 0x1c00

    or-int/2addr v2, v5

    shl-int/lit8 v5, v18, 0x9

    const v6, 0xe000

    and-int/2addr v6, v5

    or-int/2addr v2, v6

    const/high16 v6, 0x70000

    and-int/2addr v6, v5

    or-int/2addr v2, v6

    const/high16 v6, 0x380000

    and-int/2addr v6, v5

    or-int/2addr v2, v6

    const/high16 v6, 0x1c00000

    and-int/2addr v6, v5

    or-int/2addr v2, v6

    const/high16 v6, 0xe000000

    and-int/2addr v5, v6

    or-int/2addr v2, v5

    const/16 v5, 0x400

    const/4 v6, 0x0

    move-object/from16 p4, p16

    move/from16 p6, p17

    move/from16 p8, p18

    move-object/from16 p2, p19

    move-object/from16 p10, v0

    move/from16 p13, v2

    move-object/from16 p3, v3

    move-object/from16 p12, v4

    move/from16 p14, v5

    move-object/from16 p11, v6

    move-object/from16 p1, v8

    move/from16 p7, v17

    move-object/from16 p9, v19

    move/from16 p5, v21

    invoke-static/range {p1 .. p14}, Lq83/g;->a(Ll3/g;Landroidx/compose/ui/Modifier;Ll3/v0;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Li2/a0;Lu0/z0;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v8, p2

    move-object/from16 v2, p4

    move/from16 v6, p6

    move/from16 v5, p8

    move-object/from16 v0, p12

    move-object/from16 v22, v7

    move-wide v3, v9

    move-object v7, v13

    move-object v9, v14

    move/from16 v18, v17

    move-object/from16 v20, v19

    move-object/from16 v13, p15

    move/from16 v19, v5

    move/from16 v17, v6

    move-wide v5, v11

    move-object/from16 v12, v16

    move/from16 v16, v21

    move-wide/from16 v10, v25

    move-object/from16 v21, v2

    move-object v2, v8

    move-object v8, v15

    move-wide/from16 v14, v29

    goto :goto_33

    :cond_55
    move-object v0, v4

    invoke-virtual {v0}, Lp1/q;->X()V

    move-object/from16 v12, p11

    move/from16 v16, p15

    move/from16 v18, p17

    move/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move/from16 v17, v6

    move-wide v3, v9

    move-object v2, v11

    move-wide v5, v13

    move-object v8, v15

    move-wide/from16 v10, p9

    move-object/from16 v13, p12

    move-wide/from16 v14, p13

    move-object v9, v7

    move-object/from16 v7, p6

    :goto_33
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_56

    move-object/from16 v23, v0

    new-instance v0, Lg1/d9;

    const/16 v26, 0x0

    move/from16 v24, p24

    move/from16 v25, p25

    move-object/from16 v59, v23

    move/from16 v23, p23

    invoke-direct/range {v0 .. v26}, Lg1/d9;-><init>(Ljava/lang/Object;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;IIII)V

    move-object v1, v0

    move-object/from16 v0, v59

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_56
    return-void
.end method
