.class public final Ll1/h4;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll1/h4;

.field public static final b:F

.field public static final c:F

.field public static final d:F

.field public static final e:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ll1/h4;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll1/h4;->a:Ll1/h4;

    const/16 v0, 0x38

    int-to-float v0, v0

    sput v0, Ll1/h4;->b:F

    const/16 v0, 0x118

    int-to-float v0, v0

    sput v0, Ll1/h4;->c:F

    const/4 v0, 0x1

    int-to-float v0, v0

    sput v0, Ll1/h4;->d:F

    const/4 v0, 0x2

    int-to-float v0, v0

    sput v0, Ll1/h4;->e:F

    return-void
.end method

.method public static c(Ll1/m;Lf1/y1;)Ll1/e4;
    .locals 89

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Ll1/m;->d0:Ll1/e4;

    if-eqz v2, :cond_1

    iget-object v3, v2, Ll1/e4;->k:Lf1/y1;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v2

    :cond_0
    invoke-static {v2, v1}, Ll1/e4;->b(Ll1/e4;Lf1/y1;)Ll1/e4;

    move-result-object v1

    iput-object v1, v0, Ll1/m;->d0:Ll1/e4;

    return-object v1

    :cond_1
    new-instance v1, Ll1/e4;

    sget-object v2, Lo1/m;->y:Lo1/f;

    invoke-static {v0, v2}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v2

    sget-object v4, Lo1/m;->D:Lo1/f;

    invoke-static {v0, v4}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v4

    sget-object v6, Lo1/m;->g:Lo1/f;

    invoke-static {v0, v6}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v7

    sget v9, Lo1/m;->h:F

    invoke-static {v9, v7, v8}, Li2/x;->c(FJ)J

    move-result-wide v7

    sget-object v10, Lo1/m;->s:Lo1/f;

    invoke-static {v0, v10}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v10

    sget-object v12, Lo1/m;->c:Lo1/f;

    move-wide v13, v10

    invoke-static {v0, v12}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v10

    invoke-static {v0, v12}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v15

    move-wide/from16 v18, v15

    move-wide/from16 v16, v13

    invoke-static {v0, v12}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v14

    invoke-static {v0, v12}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v12

    move-object/from16 v20, v1

    sget-object v1, Lo1/m;->b:Lo1/f;

    invoke-static {v0, v1}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v21

    sget-object v1, Lo1/m;->r:Lo1/f;

    invoke-static {v0, v1}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v23

    sget-object v1, Lo1/m;->x:Lo1/f;

    invoke-static {v0, v1}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v25

    sget-object v1, Lo1/m;->a:Lo1/f;

    invoke-static {v0, v1}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v27

    sget-object v1, Lo1/m;->e:Lo1/f;

    move-wide/from16 v29, v2

    invoke-static {v0, v1}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v1

    sget v3, Lo1/m;->f:F

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    sget-object v3, Lo1/m;->q:Lo1/f;

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v31

    sget-object v3, Lo1/m;->A:Lo1/f;

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v33

    sget-object v3, Lo1/m;->I:Lo1/f;

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v35

    sget-object v3, Lo1/m;->k:Lo1/f;

    move-wide/from16 v37, v1

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v1

    sget v3, Lo1/m;->l:F

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    sget-object v3, Lo1/m;->u:Lo1/f;

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v39

    sget-object v3, Lo1/m;->C:Lo1/f;

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v41

    sget-object v3, Lo1/m;->K:Lo1/f;

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v43

    sget-object v3, Lo1/m;->o:Lo1/f;

    move-wide/from16 v45, v1

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v1

    sget v3, Lo1/m;->p:F

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    sget-object v3, Lo1/m;->w:Lo1/f;

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v47

    sget-object v3, Lo1/m;->z:Lo1/f;

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v49

    sget-object v3, Lo1/m;->H:Lo1/f;

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v51

    sget-object v3, Lo1/m;->i:Lo1/f;

    move-wide/from16 v53, v1

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v1

    sget v3, Lo1/m;->j:F

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    sget-object v3, Lo1/m;->t:Lo1/f;

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v55

    sget-object v3, Lo1/m;->E:Lo1/f;

    move-wide/from16 v57, v16

    move-wide/from16 v59, v29

    move-wide/from16 v29, v31

    move-wide/from16 v31, v33

    move-wide/from16 v33, v35

    move-wide/from16 v35, v45

    move-wide/from16 v45, v47

    move-wide/from16 v47, v49

    move-wide/from16 v49, v51

    move-wide/from16 v51, v1

    move-wide/from16 v16, v12

    move-wide/from16 v12, v18

    move-object/from16 v1, v20

    move-wide/from16 v18, v21

    move-wide/from16 v20, v23

    move-wide/from16 v23, v25

    move-wide/from16 v25, v27

    move-wide/from16 v27, v37

    move-wide/from16 v37, v39

    move-wide/from16 v39, v41

    move-wide/from16 v41, v43

    move-wide/from16 v43, v53

    move-wide/from16 v53, v55

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v55

    move-wide/from16 v61, v57

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v57

    move-object/from16 v22, v1

    invoke-static {v0, v6}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v1

    invoke-static {v9, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v63

    sget-object v3, Lo1/m;->B:Lo1/f;

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v65

    sget-object v3, Lo1/m;->J:Lo1/f;

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v67

    sget-object v3, Lo1/m;->m:Lo1/f;

    move-wide/from16 v69, v1

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v1

    sget v3, Lo1/m;->n:F

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    sget-object v3, Lo1/m;->v:Lo1/f;

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v71

    sget-object v3, Lo1/m;->F:Lo1/f;

    move-wide/from16 v73, v59

    move-wide/from16 v59, v69

    move-wide/from16 v69, v71

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v71

    move-wide/from16 v75, v73

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v73

    move-wide/from16 v77, v1

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v1

    invoke-static {v9, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v79

    sget-object v3, Lo1/m;->G:Lo1/f;

    move-wide/from16 v81, v61

    move-wide/from16 v61, v63

    move-wide/from16 v63, v65

    move-wide/from16 v65, v67

    move-wide/from16 v67, v77

    move-wide/from16 v77, v79

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v79

    move-wide/from16 v83, v81

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v81

    move-wide/from16 v85, v1

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v1

    invoke-static {v9, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    invoke-static {v0, v3}, Ll1/n;->c(Ll1/m;Lo1/f;)J

    move-result-wide v87

    move-wide v6, v7

    move-wide/from16 v8, v83

    move-wide/from16 v83, v1

    move-object/from16 v1, v22

    move-wide/from16 v2, v75

    move-wide/from16 v75, v85

    move-wide/from16 v85, v87

    move-object/from16 v22, p1

    invoke-direct/range {v1 .. v86}, Ll1/e4;-><init>(JJJJJJJJJJLf1/y1;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)V

    iput-object v1, v0, Ll1/m;->d0:Ll1/e4;

    return-object v1
.end method

.method public static d()Ll0/l1;
    .locals 4

    sget v0, Lm1/l0;->a:F

    sget v1, Lm1/l0;->b:F

    const/4 v2, 0x0

    int-to-float v2, v2

    new-instance v3, Ll0/l1;

    invoke-direct {v3, v0, v1, v0, v2}, Ll0/l1;-><init>(FFFF)V

    return-object v3
.end method


# virtual methods
.method public final a(ZLj0/i;Ll1/e4;Li2/a1;Landroidx/compose/runtime/Composer;I)V
    .locals 20

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v10, p5

    check-cast v10, Lp1/q;

    const v0, -0x30cbc77a    # -3.0236032E9f

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v10, v2}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p6, v0

    const/4 v1, 0x0

    invoke-virtual {v10, v1}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_1

    const/16 v6, 0x20

    goto :goto_1

    :cond_1
    const/16 v6, 0x10

    :goto_1
    or-int/2addr v0, v6

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x100

    goto :goto_2

    :cond_2
    const/16 v6, 0x80

    :goto_2
    or-int/2addr v0, v6

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x4000

    goto :goto_3

    :cond_3
    const/16 v6, 0x2000

    :goto_3
    or-int/2addr v0, v6

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/high16 v6, 0x20000

    goto :goto_4

    :cond_4
    const/high16 v6, 0x10000

    :goto_4
    or-int/2addr v0, v6

    const v6, 0x2492493

    and-int/2addr v6, v0

    const v7, 0x2492492

    if-eq v6, v7, :cond_5

    const/4 v6, 0x1

    goto :goto_5

    :cond_5
    move v6, v1

    :goto_5
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v10, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-virtual {v10}, Lp1/q;->Z()V

    and-int/lit8 v6, p6, 0x1

    if-eqz v6, :cond_7

    invoke-virtual {v10}, Lp1/q;->C()Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v10}, Lp1/q;->X()V

    :cond_7
    :goto_6
    invoke-virtual {v10}, Lp1/q;->r()V

    shr-int/lit8 v0, v0, 0x6

    and-int/lit8 v0, v0, 0xe

    invoke-static {v3, v10, v0}, Lse/h;->x(Lj0/i;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v0

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v2, :cond_8

    iget-wide v6, v4, Ll1/e4;->g:J

    goto :goto_7

    :cond_8
    if-eqz v0, :cond_9

    iget-wide v6, v4, Ll1/e4;->e:J

    goto :goto_7

    :cond_9
    iget-wide v6, v4, Ll1/e4;->f:J

    :goto_7
    sget-object v0, Lo1/n;->z:Lo1/n;

    invoke-static {v0, v10}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v8

    const/4 v11, 0x0

    const/16 v12, 0xc

    const/4 v9, 0x0

    invoke-static/range {v6 .. v12}, Lc0/m1;->a(JLd0/c0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v17

    new-instance v13, Lhc3/j;

    const/4 v14, 0x0

    const/4 v15, 0x2

    const-class v16, Lp1/t2;

    const-string v18, "value"

    const-string v19, "getValue()Ljava/lang/Object;"

    invoke-direct/range {v13 .. v19}, Lhc3/j;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ll1/g4;

    invoke-direct {v0, v13}, Ll1/g4;-><init>(Lkotlin/jvm/internal/v;)V

    sget v6, Lm1/l0;->a:F

    new-instance v6, Llq0/d;

    const/4 v7, 0x7

    invoke-direct {v6, v7, v5, v0}, Llq0/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v6}, Landroidx/compose/ui/draw/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance v6, Landroidx/compose/material3/IndicatorLineElement;

    invoke-direct {v6, v2, v3, v4, v5}, Landroidx/compose/material3/IndicatorLineElement;-><init>(ZLj0/i;Ll1/e4;Li2/a1;)V

    invoke-interface {v0, v6}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v10, v1}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_8

    :cond_a
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_b

    new-instance v0, Lb30/m1;

    move-object/from16 v1, p0

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lb30/m1;-><init>(Ll1/h4;ZLj0/i;Ll1/e4;Li2/a1;I)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method public final b(Ljava/lang/String;Lc93/m;ZZLq3/g0;Lj0/i;Lc93/m;Li2/a1;Ll1/e4;Ll0/k1;Lc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 31

    move-object/from16 v2, p1

    move-object/from16 v6, p5

    move/from16 v13, p13

    move-object/from16 v0, p12

    check-cast v0, Lp1/q;

    const v1, 0x6bb456c1

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v13, 0x6

    const/4 v4, 0x4

    if-nez v1, :cond_1

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v13

    goto :goto_1

    :cond_1
    move v1, v13

    :goto_1
    and-int/lit8 v5, v13, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p2

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x20

    goto :goto_2

    :cond_2
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v1, v9

    goto :goto_3

    :cond_3
    move-object/from16 v5, p2

    :goto_3
    and-int/lit16 v9, v13, 0x180

    move/from16 v15, p3

    if-nez v9, :cond_5

    invoke-virtual {v0, v15}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x100

    goto :goto_4

    :cond_4
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v1, v9

    :cond_5
    and-int/lit16 v9, v13, 0xc00

    const/16 v12, 0x400

    const/16 v14, 0x800

    if-nez v9, :cond_7

    move/from16 v9, p4

    invoke-virtual {v0, v9}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_6

    move/from16 v16, v14

    goto :goto_5

    :cond_6
    move/from16 v16, v12

    :goto_5
    or-int v1, v1, v16

    goto :goto_6

    :cond_7
    move/from16 v9, p4

    :goto_6
    and-int/lit16 v3, v13, 0x6000

    const/16 v16, 0x2000

    if-nez v3, :cond_9

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    const/16 v3, 0x4000

    goto :goto_7

    :cond_8
    move/from16 v3, v16

    :goto_7
    or-int/2addr v1, v3

    :cond_9
    const/high16 v3, 0x30000

    and-int/2addr v3, v13

    const/high16 v18, 0x20000

    const/high16 v19, 0x10000

    if-nez v3, :cond_b

    move-object/from16 v3, p6

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_a

    move/from16 v20, v18

    goto :goto_8

    :cond_a
    move/from16 v20, v19

    :goto_8
    or-int v1, v1, v20

    goto :goto_9

    :cond_b
    move-object/from16 v3, p6

    :goto_9
    const/high16 v20, 0x180000

    and-int v20, v13, v20

    const/4 v8, 0x0

    if-nez v20, :cond_d

    invoke-virtual {v0, v8}, Lp1/q;->h(Z)Z

    move-result v20

    if-eqz v20, :cond_c

    const/high16 v20, 0x100000

    goto :goto_a

    :cond_c
    const/high16 v20, 0x80000

    :goto_a
    or-int v1, v1, v20

    :cond_d
    const/high16 v20, 0xc00000

    and-int v22, v13, v20

    const/4 v10, 0x0

    if-nez v22, :cond_f

    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_e

    const/high16 v22, 0x800000

    goto :goto_b

    :cond_e
    const/high16 v22, 0x400000

    :goto_b
    or-int v1, v1, v22

    :cond_f
    const/high16 v22, 0x6000000

    and-int v24, v13, v22

    move-object/from16 v11, p7

    if-nez v24, :cond_11

    invoke-virtual {v0, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_10

    const/high16 v25, 0x4000000

    goto :goto_c

    :cond_10
    const/high16 v25, 0x2000000

    :goto_c
    or-int v1, v1, v25

    :cond_11
    const/high16 v25, 0x30000000

    and-int v25, v13, v25

    if-nez v25, :cond_13

    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_12

    const/high16 v25, 0x20000000

    goto :goto_d

    :cond_12
    const/high16 v25, 0x10000000

    :goto_d
    or-int v1, v1, v25

    :cond_13
    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_14

    move/from16 v25, v4

    goto :goto_e

    :cond_14
    const/16 v25, 0x2

    :goto_e
    or-int v22, v22, v25

    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_15

    const/16 v21, 0x20

    goto :goto_f

    :cond_15
    const/16 v21, 0x10

    :goto_f
    or-int v17, v22, v21

    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_16

    const/16 v23, 0x100

    goto :goto_10

    :cond_16
    const/16 v23, 0x80

    :goto_10
    or-int v17, v17, v23

    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_17

    move v12, v14

    :cond_17
    or-int v10, v17, v12

    move-object/from16 v12, p8

    invoke-virtual {v0, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_18

    const/16 v16, 0x4000

    :cond_18
    or-int v10, v10, v16

    move-object/from16 v14, p9

    invoke-virtual {v0, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_19

    goto :goto_11

    :cond_19
    move/from16 v18, v19

    :goto_11
    or-int v10, v10, v18

    const/high16 v16, 0xc80000

    or-int v10, v10, v16

    const v16, 0x12492493

    and-int v8, v1, v16

    const v7, 0x12492492

    const/16 v22, 0x1

    if-ne v8, v7, :cond_1b

    const v7, 0x2492493

    and-int/2addr v7, v10

    const v8, 0x2492492

    if-eq v7, v8, :cond_1a

    goto :goto_12

    :cond_1a
    const/4 v7, 0x0

    goto :goto_13

    :cond_1b
    :goto_12
    move/from16 v7, v22

    :goto_13
    and-int/lit8 v8, v1, 0x1

    invoke-virtual {v0, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_22

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v7, v13, 0x1

    const v8, -0x380001

    if-eqz v7, :cond_1d

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v7

    if-eqz v7, :cond_1c

    goto :goto_14

    :cond_1c
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int v7, v10, v8

    move-object/from16 v25, p10

    move-object/from16 v27, p11

    goto :goto_15

    :cond_1d
    :goto_14
    sget v7, Lm1/l0;->a:F

    move/from16 v16, v8

    new-instance v8, Ll0/l1;

    invoke-direct {v8, v7, v7, v7, v7}, Ll0/l1;-><init>(FFFF)V

    and-int v7, v10, v16

    new-instance v14, Ll1/y2;

    const/16 v19, 0x1

    move-object/from16 v17, p9

    move-object/from16 v16, v3

    move-object/from16 v18, v12

    invoke-direct/range {v14 .. v19}, Ll1/y2;-><init>(ZLj0/i;Ll1/e4;Li2/a1;I)V

    const v3, 0x18e8c5b6

    invoke-static {v3, v0, v14}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    move-object/from16 v27, v3

    move-object/from16 v25, v8

    :goto_15
    invoke-virtual {v0}, Lp1/q;->r()V

    and-int/lit8 v3, v1, 0xe

    if-ne v3, v4, :cond_1e

    move/from16 v3, v22

    goto :goto_16

    :cond_1e
    const/4 v3, 0x0

    :goto_16
    const v4, 0xe000

    and-int v8, v1, v4

    const/16 v10, 0x4000

    if-ne v8, v10, :cond_1f

    goto :goto_17

    :cond_1f
    const/16 v22, 0x0

    :goto_17
    or-int v3, v3, v22

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v3, :cond_20

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v8, v3, :cond_21

    :cond_20
    new-instance v3, Ll3/g;

    invoke-direct {v3, v2}, Ll3/g;-><init>(Ljava/lang/String;)V

    invoke-interface {v6, v3}, Lq3/g0;->a(Ll3/g;)Lq3/e0;

    move-result-object v8

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    check-cast v8, Lq3/e0;

    iget-object v3, v8, Lq3/e0;->a:Ll3/g;

    iget-object v15, v3, Ll3/g;->x:Ljava/lang/String;

    sget-object v14, Lm1/m0;->w:Lm1/m0;

    new-instance v17, Ll1/k4;

    invoke-direct/range {v17 .. v17}, Ll1/k4;-><init>()V

    const v3, -0x50a724b7

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    shl-int/lit8 v3, v1, 0x3

    and-int/lit16 v3, v3, 0x380

    or-int/lit8 v3, v3, 0x6

    shr-int/lit8 v8, v1, 0x9

    const/high16 v10, 0x70000

    and-int/2addr v10, v8

    or-int/2addr v3, v10

    const/high16 v10, 0x380000

    and-int v12, v8, v10

    or-int/2addr v3, v12

    shl-int/lit8 v12, v7, 0x15

    const/high16 v16, 0x1c00000

    and-int v16, v12, v16

    or-int v3, v3, v16

    const/high16 v16, 0xe000000

    and-int v16, v12, v16

    or-int v3, v3, v16

    const/high16 v16, 0x70000000

    and-int v12, v12, v16

    or-int v29, v3, v12

    shr-int/lit8 v3, v7, 0x9

    and-int/lit8 v3, v3, 0xe

    shr-int/lit8 v12, v1, 0x6

    and-int/lit8 v12, v12, 0x70

    or-int/2addr v3, v12

    and-int/lit16 v12, v1, 0x380

    or-int/2addr v3, v12

    and-int/lit16 v8, v8, 0x1c00

    or-int/2addr v3, v8

    shr-int/lit8 v1, v1, 0x3

    and-int/2addr v1, v4

    or-int/2addr v1, v3

    shl-int/lit8 v3, v7, 0x3

    and-int/2addr v3, v10

    or-int/2addr v1, v3

    or-int v30, v1, v20

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    move/from16 v22, p3

    move-object/from16 v24, p6

    move-object/from16 v26, p9

    move-object/from16 v28, v0

    move-object/from16 v16, v5

    move/from16 v21, v9

    move-object/from16 v19, v11

    invoke-static/range {v14 .. v30}, Lm1/l0;->a(Lm1/m0;Ljava/lang/CharSequence;Lc93/m;Ll1/k4;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;ZZZLj0/i;Ll0/k1;Ll1/e4;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v11, v25

    move-object/from16 v12, v27

    goto :goto_18

    :cond_22
    move-object/from16 v28, v0

    invoke-virtual/range {v28 .. v28}, Lp1/q;->X()V

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    :goto_18
    invoke-virtual/range {v28 .. v28}, Lp1/q;->u()Lp1/v1;

    move-result-object v14

    if-eqz v14, :cond_23

    new-instance v0, Ll1/f4;

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v13}, Ll1/f4;-><init>(Ll1/h4;Ljava/lang/String;Lc93/m;ZZLq3/g0;Lj0/i;Lc93/m;Li2/a1;Ll1/e4;Ll0/k1;Lc93/m;I)V

    iput-object v0, v14, Lp1/v1;->d:Lc93/m;

    :cond_23
    return-void
.end method
