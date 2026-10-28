.class public final Ll1/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll1/b0;

.field public static final b:Li93/j;

.field public static final c:F

.field public static final d:Ll1/z;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ll1/b0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll1/b0;->a:Ll1/b0;

    new-instance v0, Li93/j;

    const/16 v1, 0x834

    const/4 v2, 0x1

    const/16 v3, 0x76c

    invoke-direct {v0, v3, v1, v2}, Li93/h;-><init>(III)V

    sput-object v0, Ll1/b0;->b:Li93/j;

    sget v0, Lo1/j;->a:F

    sput v0, Ll1/b0;->c:F

    new-instance v0, Ll1/z;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll1/b0;->d:Ll1/z;

    return-void
.end method

.method public static c(JJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;I)Ll1/y;
    .locals 75

    move/from16 v0, p37

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    sget-wide v1, Li2/x;->n:J

    goto :goto_0

    :cond_0
    move-wide/from16 v1, p0

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    sget-wide v3, Li2/x;->n:J

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_2

    sget-wide v5, Li2/x;->n:J

    goto :goto_2

    :cond_2
    move-wide/from16 v5, p4

    :goto_2
    and-int/lit8 v7, v0, 0x8

    if-eqz v7, :cond_3

    sget-wide v7, Li2/x;->n:J

    goto :goto_3

    :cond_3
    move-wide/from16 v7, p6

    :goto_3
    and-int/lit8 v9, v0, 0x10

    if-eqz v9, :cond_4

    sget-wide v9, Li2/x;->n:J

    goto :goto_4

    :cond_4
    move-wide/from16 v9, p8

    :goto_4
    and-int/lit8 v11, v0, 0x20

    if-eqz v11, :cond_5

    sget-wide v11, Li2/x;->n:J

    goto :goto_5

    :cond_5
    move-wide/from16 v11, p10

    :goto_5
    and-int/lit8 v13, v0, 0x40

    if-eqz v13, :cond_6

    sget-wide v13, Li2/x;->n:J

    goto :goto_6

    :cond_6
    move-wide/from16 v13, p12

    :goto_6
    and-int/lit16 v15, v0, 0x80

    if-eqz v15, :cond_7

    sget-wide v15, Li2/x;->n:J

    goto :goto_7

    :cond_7
    move-wide/from16 v15, p14

    :goto_7
    move-wide/from16 p0, v1

    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_8

    sget-wide v1, Li2/x;->n:J

    goto :goto_8

    :cond_8
    move-wide/from16 v1, p16

    :goto_8
    sget-wide v17, Li2/x;->n:J

    move-wide/from16 p2, v1

    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_9

    move-wide/from16 v1, v17

    goto :goto_9

    :cond_9
    move-wide/from16 v1, p22

    :goto_9
    move-wide/from16 p4, v1

    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_a

    move-wide/from16 v1, v17

    goto :goto_a

    :cond_a
    move-wide/from16 v1, p24

    :goto_a
    const/high16 v19, 0x800000

    and-int v0, v0, v19

    if-eqz v0, :cond_b

    move-wide/from16 v19, v17

    goto :goto_b

    :cond_b
    move-wide/from16 v19, p34

    :goto_b
    sget-object v0, Ll1/n;->a:Lp1/u2;

    move-wide/from16 p6, v1

    move-object/from16 v1, p36

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll1/m;

    iget-object v1, v0, Ll1/m;->Z:Ll1/y;

    if-nez v1, :cond_c

    move-object/from16 v1, p36

    check-cast v1, Lp1/q;

    const v2, 0x264a7f77

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lo1/g;->a:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v22

    sget-object v2, Lo1/g;->r:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v24

    sget-object v2, Lo1/g;->p:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v26

    sget-object v2, Lo1/g;->w:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v28

    sget-object v2, Lo1/g;->v:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v30

    move-wide/from16 v71, v3

    iget-wide v2, v0, Ll1/m;->s:J

    sget-object v4, Lo1/g;->E:Lo1/f;

    invoke-static {v0, v4}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v34

    move-wide/from16 v32, v2

    invoke-static {v0, v4}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v2

    const v4, 0x3ec28f5c    # 0.38f

    invoke-static {v4, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v36

    sget-object v2, Lo1/g;->m:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v38

    sget-object v3, Lo1/g;->C:Lo1/f;

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v40

    move-wide/from16 v73, v5

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v5

    invoke-static {v4, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v42

    sget-object v3, Lo1/g;->B:Lo1/f;

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v44

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v5

    invoke-static {v4, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v46

    sget-object v3, Lo1/g;->n:Lo1/f;

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v48

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v5

    invoke-static {v4, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v50

    sget-object v3, Lo1/g;->j:Lo1/f;

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v52

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v5

    invoke-static {v4, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v54

    sget-object v3, Lo1/g;->i:Lo1/f;

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v56

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v5

    invoke-static {v4, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v58

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v60

    sget-object v2, Lo1/g;->k:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v62

    sget-object v2, Lo1/g;->u:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v66

    sget-object v2, Lo1/g;->t:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v64

    sget-object v2, Lo1/i;->a:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v68

    sget-object v2, Ll1/t2;->a:Ll1/t2;

    invoke-static {v0, v1}, Ll1/t2;->d(Ll1/m;Landroidx/compose/runtime/Composer;)Ll1/e4;

    move-result-object v70

    new-instance v21, Ll1/y;

    invoke-direct/range {v21 .. v70}, Ll1/y;-><init>(JJJJJJJJJJJJJJJJJJJJJJJJLl1/e4;)V

    move-object/from16 v2, v21

    iput-object v2, v0, Ll1/m;->Z:Ll1/y;

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    move-object v1, v2

    goto :goto_c

    :cond_c
    move-wide/from16 v71, v3

    move-wide/from16 v73, v5

    const/4 v0, 0x0

    move-object/from16 v2, p36

    check-cast v2, Lp1/q;

    const v3, 0x26489319

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    :goto_c
    const-wide/16 v2, 0x10

    cmp-long v0, p0, v2

    if-eqz v0, :cond_d

    move-wide/from16 v22, p0

    goto :goto_d

    :cond_d
    iget-wide v4, v1, Ll1/y;->a:J

    move-wide/from16 v22, v4

    :goto_d
    cmp-long v0, v71, v2

    if-eqz v0, :cond_e

    move-wide/from16 v24, v71

    goto :goto_e

    :cond_e
    iget-wide v4, v1, Ll1/y;->b:J

    move-wide/from16 v24, v4

    :goto_e
    cmp-long v0, v73, v2

    if-eqz v0, :cond_f

    move-wide/from16 v26, v73

    goto :goto_f

    :cond_f
    iget-wide v5, v1, Ll1/y;->c:J

    move-wide/from16 v26, v5

    :goto_f
    cmp-long v0, v7, v2

    if-eqz v0, :cond_10

    :goto_10
    move-wide/from16 v28, v7

    goto :goto_11

    :cond_10
    iget-wide v7, v1, Ll1/y;->d:J

    goto :goto_10

    :goto_11
    cmp-long v0, v9, v2

    if-eqz v0, :cond_11

    :goto_12
    move-wide/from16 v30, v9

    goto :goto_13

    :cond_11
    iget-wide v9, v1, Ll1/y;->e:J

    goto :goto_12

    :goto_13
    cmp-long v0, v11, v2

    if-eqz v0, :cond_12

    :goto_14
    move-wide/from16 v32, v11

    goto :goto_15

    :cond_12
    iget-wide v11, v1, Ll1/y;->f:J

    goto :goto_14

    :goto_15
    cmp-long v0, v13, v2

    if-eqz v0, :cond_13

    :goto_16
    move-wide/from16 v34, v13

    goto :goto_17

    :cond_13
    iget-wide v13, v1, Ll1/y;->g:J

    goto :goto_16

    :goto_17
    cmp-long v0, v15, v2

    if-eqz v0, :cond_14

    move-wide/from16 v36, v15

    goto :goto_18

    :cond_14
    iget-wide v4, v1, Ll1/y;->h:J

    move-wide/from16 v36, v4

    :goto_18
    cmp-long v0, p2, v2

    if-eqz v0, :cond_15

    move-wide/from16 v38, p2

    goto :goto_19

    :cond_15
    iget-wide v4, v1, Ll1/y;->i:J

    move-wide/from16 v38, v4

    :goto_19
    cmp-long v0, p18, v2

    if-eqz v0, :cond_16

    move-wide/from16 v40, p18

    goto :goto_1a

    :cond_16
    iget-wide v4, v1, Ll1/y;->j:J

    move-wide/from16 v40, v4

    :goto_1a
    cmp-long v0, v17, v2

    if-eqz v0, :cond_17

    move-wide/from16 v42, v17

    goto :goto_1b

    :cond_17
    iget-wide v4, v1, Ll1/y;->k:J

    move-wide/from16 v42, v4

    :goto_1b
    cmp-long v0, p20, v2

    if-eqz v0, :cond_18

    move-wide/from16 v44, p20

    goto :goto_1c

    :cond_18
    iget-wide v4, v1, Ll1/y;->l:J

    move-wide/from16 v44, v4

    :goto_1c
    cmp-long v0, v17, v2

    if-eqz v0, :cond_19

    move-wide/from16 v46, v17

    goto :goto_1d

    :cond_19
    iget-wide v4, v1, Ll1/y;->m:J

    move-wide/from16 v46, v4

    :goto_1d
    cmp-long v0, p4, v2

    if-eqz v0, :cond_1a

    move-wide/from16 v48, p4

    goto :goto_1e

    :cond_1a
    iget-wide v4, v1, Ll1/y;->n:J

    move-wide/from16 v48, v4

    :goto_1e
    cmp-long v0, p6, v2

    if-eqz v0, :cond_1b

    move-wide/from16 v50, p6

    goto :goto_1f

    :cond_1b
    iget-wide v4, v1, Ll1/y;->o:J

    move-wide/from16 v50, v4

    :goto_1f
    cmp-long v0, p26, v2

    if-eqz v0, :cond_1c

    move-wide/from16 v52, p26

    goto :goto_20

    :cond_1c
    iget-wide v4, v1, Ll1/y;->p:J

    move-wide/from16 v52, v4

    :goto_20
    cmp-long v0, v17, v2

    if-eqz v0, :cond_1d

    move-wide/from16 v54, v17

    goto :goto_21

    :cond_1d
    iget-wide v4, v1, Ll1/y;->q:J

    move-wide/from16 v54, v4

    :goto_21
    cmp-long v0, p28, v2

    if-eqz v0, :cond_1e

    move-wide/from16 v56, p28

    goto :goto_22

    :cond_1e
    iget-wide v4, v1, Ll1/y;->r:J

    move-wide/from16 v56, v4

    :goto_22
    cmp-long v0, v17, v2

    if-eqz v0, :cond_1f

    move-wide/from16 v58, v17

    goto :goto_23

    :cond_1f
    iget-wide v4, v1, Ll1/y;->s:J

    move-wide/from16 v58, v4

    :goto_23
    cmp-long v0, p30, v2

    if-eqz v0, :cond_20

    move-wide/from16 v60, p30

    goto :goto_24

    :cond_20
    iget-wide v4, v1, Ll1/y;->t:J

    move-wide/from16 v60, v4

    :goto_24
    cmp-long v0, p32, v2

    if-eqz v0, :cond_21

    move-wide/from16 v62, p32

    goto :goto_25

    :cond_21
    iget-wide v4, v1, Ll1/y;->u:J

    move-wide/from16 v62, v4

    :goto_25
    cmp-long v0, v17, v2

    if-eqz v0, :cond_22

    move-wide/from16 v64, v17

    goto :goto_26

    :cond_22
    iget-wide v4, v1, Ll1/y;->v:J

    move-wide/from16 v64, v4

    :goto_26
    cmp-long v0, v17, v2

    if-eqz v0, :cond_23

    move-wide/from16 v66, v17

    goto :goto_27

    :cond_23
    iget-wide v4, v1, Ll1/y;->w:J

    move-wide/from16 v66, v4

    :goto_27
    cmp-long v0, v19, v2

    if-eqz v0, :cond_24

    move-wide/from16 v68, v19

    goto :goto_28

    :cond_24
    iget-wide v2, v1, Ll1/y;->x:J

    move-wide/from16 v68, v2

    :goto_28
    iget-object v0, v1, Ll1/y;->y:Ll1/e4;

    new-instance v21, Ll1/y;

    move-object/from16 v70, v0

    invoke-direct/range {v21 .. v70}, Ll1/y;-><init>(JJJJJJJJJJJJJJJJJJJJJJJJLl1/e4;)V

    return-object v21
.end method


# virtual methods
.method public final a(Ljava/lang/Long;ILl1/e0;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;I)V
    .locals 26

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v0, p7

    check-cast v0, Lp1/q;

    const v1, 0x72111f7c

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p8, v1

    invoke-virtual {v0, v3}, Lp1/q;->e(I)Z

    move-result v5

    if-eqz v5, :cond_1

    const/16 v5, 0x20

    goto :goto_1

    :cond_1
    const/16 v5, 0x10

    :goto_1
    or-int/2addr v1, v5

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x100

    goto :goto_2

    :cond_2
    const/16 v5, 0x80

    :goto_2
    or-int/2addr v1, v5

    move-wide/from16 v7, p5

    invoke-virtual {v0, v7, v8}, Lp1/q;->f(J)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x4000

    goto :goto_3

    :cond_3
    const/16 v5, 0x2000

    :goto_3
    or-int/2addr v1, v5

    const v5, 0x12493

    and-int/2addr v5, v1

    const v6, 0x12492

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v5, v6, :cond_4

    move v5, v10

    goto :goto_4

    :cond_4
    move v5, v9

    :goto_4
    and-int/lit8 v6, v1, 0x1

    invoke-virtual {v0, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v5, p8, 0x1

    if-eqz v5, :cond_6

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Lp1/q;->X()V

    :cond_6
    :goto_5
    invoke-virtual {v0}, Lp1/q;->r()V

    const v5, 0x7c7adbf1

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    sget-object v5, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    invoke-virtual {v0, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/res/Configuration;

    invoke-virtual {v5}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object v5

    invoke-virtual {v5, v9}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v5

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v2, v5, v9}, Ll1/e0;->a(Ljava/lang/Long;Ljava/util/Locale;Z)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v2, v5, v10}, Ll1/e0;->a(Ljava/lang/Long;Ljava/util/Locale;Z)Ljava/lang/String;

    move-result-object v5

    const-string v11, ""

    if-nez v5, :cond_9

    const v5, 0x16a92d4b

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    if-nez v3, :cond_7

    const v5, 0x32478caf

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    const v5, 0x7f1407d8

    invoke-static {v0, v5}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_7
    if-ne v3, v10, :cond_8

    const v5, 0x3247984a

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    const v5, 0x7f1407d3

    invoke-static {v0, v5}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_8
    const v5, 0x16ac8e42

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    move-object v5, v11

    :goto_6
    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_9
    const v12, 0x32476ef2

    invoke-virtual {v0, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    :goto_7
    if-nez v6, :cond_c

    const v6, 0x16ae15c3

    invoke-virtual {v0, v6}, Lp1/q;->e0(I)V

    if-nez v3, :cond_a

    const v6, 0x3247b541

    invoke-virtual {v0, v6}, Lp1/q;->e0(I)V

    const v6, 0x7f1407d5

    invoke-static {v0, v6}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_a
    if-ne v3, v10, :cond_b

    const v6, 0x3247bf20

    invoke-virtual {v0, v6}, Lp1/q;->e0(I)V

    const v6, 0x7f1407cd

    invoke-static {v0, v6}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_b
    const v6, 0x16b11ca2

    invoke-virtual {v0, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    move-object v6, v11

    :goto_8
    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_c
    const v12, 0x3247aa20

    invoke-virtual {v0, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    :goto_9
    if-nez v3, :cond_d

    const v11, 0x3247dd0c

    invoke-virtual {v0, v11}, Lp1/q;->e0(I)V

    const v11, 0x7f1407d6

    invoke-static {v0, v11}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_d
    if-ne v3, v10, :cond_e

    const v11, 0x3247e84b

    invoke-virtual {v0, v11}, Lp1/q;->e0(I)V

    const v11, 0x7f1407ce

    invoke-static {v0, v11}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_e
    const v12, 0x16b64222

    invoke-virtual {v0, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    :goto_a
    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    invoke-static {v11, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_f

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v11, v10, :cond_10

    :cond_f
    new-instance v11, Lht2/d;

    const/16 v10, 0xc

    invoke-direct {v11, v5, v10}, Lht2/d;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v11, Lkotlin/jvm/functions/Function1;

    move-object/from16 v5, p4

    invoke-static {v5, v9, v11}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    shr-int/lit8 v1, v1, 0x6

    and-int/lit16 v1, v1, 0x380

    const/16 v24, 0x6000

    const v25, 0x3bff8

    move-object v5, v6

    move-object v6, v9

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v22, v0

    move/from16 v23, v1

    invoke-static/range {v5 .. v25}, Ll1/o4;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    goto :goto_b

    :cond_11
    move-object/from16 v22, v0

    invoke-virtual/range {v22 .. v22}, Lp1/q;->X()V

    :goto_b
    invoke-virtual/range {v22 .. v22}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_12

    new-instance v0, Lio2/q;

    move-object/from16 v1, p0

    move-object/from16 v5, p4

    move-wide/from16 v6, p5

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lio2/q;-><init>(Ll1/b0;Ljava/lang/Long;ILl1/e0;Landroidx/compose/ui/Modifier;JI)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method public final b(JLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V
    .locals 24

    move/from16 v2, p4

    move-object/from16 v0, p5

    check-cast v0, Lp1/q;

    const v1, -0x174c5e2e

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v0, v2}, Lp1/q;->e(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p6, v1

    move-wide/from16 v5, p1

    invoke-virtual {v0, v5, v6}, Lp1/q;->f(J)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0x100

    goto :goto_1

    :cond_1
    const/16 v3, 0x80

    :goto_1
    or-int/2addr v1, v3

    and-int/lit16 v3, v1, 0x493

    const/16 v4, 0x492

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v3, v4, :cond_2

    move v3, v8

    goto :goto_2

    :cond_2
    move v3, v7

    :goto_2
    and-int/lit8 v4, v1, 0x1

    invoke-virtual {v0, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v3, p6, 0x1

    if-eqz v3, :cond_4

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Lp1/q;->X()V

    :cond_4
    :goto_3
    invoke-virtual {v0}, Lp1/q;->r()V

    if-nez v2, :cond_5

    const v3, -0x75ad6a1c

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    const v3, 0x7f1407e1

    invoke-static {v0, v3}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    and-int/lit16 v1, v1, 0x3f0

    const/16 v22, 0x0

    const v23, 0x3fff8

    move v4, v7

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v20, v0

    move/from16 v21, v1

    move v0, v4

    move-object/from16 v4, p3

    invoke-static/range {v3 .. v23}, Ll1/o4;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v20

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_5
    move-object v3, v0

    move v0, v7

    if-ne v2, v8, :cond_6

    const v4, -0x75ad4d9d

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    const v4, 0x7f1407d4

    invoke-static {v3, v4}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    and-int/lit16 v1, v1, 0x3f0

    const/16 v22, 0x0

    const v23, 0x3fff8

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-wide/from16 v5, p1

    move/from16 v21, v1

    move-object/from16 v20, v3

    move-object v3, v4

    move-object/from16 v4, p3

    invoke-static/range {v3 .. v23}, Ll1/o4;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v20

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_6
    const v1, -0x3ff9a6d0

    invoke-virtual {v3, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_7
    move-object v3, v0

    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_8

    new-instance v0, Li20/k0;

    move-object/from16 v1, p0

    move-wide/from16 v4, p1

    move-object/from16 v3, p3

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Li20/k0;-><init>(Ll1/b0;ILandroidx/compose/ui/Modifier;JI)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method
