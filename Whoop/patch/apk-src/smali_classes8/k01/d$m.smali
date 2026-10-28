.class public final Lk01/d$m;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk01/d;->s(Landroidx/compose/ui/Modifier;Lk01/e;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "a",
        "(Landroidx/compose/runtime/Composer;I)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation


# instance fields
.field final synthetic E:Lk01/e;

.field final synthetic F:Z

.field final synthetic w:Lp1/c1;

.field final synthetic x:Le4/k;

.field final synthetic y:Lc93/a;

.field final synthetic z:Lk01/e;


# direct methods
.method public constructor <init>(Lp1/c1;Le4/k;Lc93/a;Lk01/e;Lk01/e;Z)V
    .locals 0

    iput-object p1, p0, Lk01/d$m;->w:Lp1/c1;

    iput-object p2, p0, Lk01/d$m;->x:Le4/k;

    iput-object p3, p0, Lk01/d$m;->y:Lc93/a;

    iput-object p4, p0, Lk01/d$m;->z:Lk01/e;

    iput-object p5, p0, Lk01/d$m;->E:Lk01/e;

    iput-boolean p6, p0, Lk01/d$m;->F:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 49

    move-object/from16 v0, p0

    const/4 v1, 0x3

    and-int/lit8 v2, p2, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lp1/q;->X()V

    return-void

    :cond_1
    :goto_0
    iget-object v2, v0, Lk01/d$m;->w:Lp1/c1;

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v2, v4}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    iget-object v2, v0, Lk01/d$m;->x:Le4/k;

    iget v4, v2, Le4/k;->b:I

    invoke-virtual {v2}, Le4/k;->e()V

    iget-object v2, v0, Lk01/d$m;->x:Le4/k;

    move-object/from16 v10, p1

    check-cast v10, Lp1/q;

    const v5, -0xfcfaabf

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Le4/k;->d()Lad3/z;

    move-result-object v5

    iget-object v5, v5, Lad3/z;->x:Ljava/lang/Object;

    check-cast v5, Le4/k;

    invoke-virtual {v5}, Le4/k;->c()Le4/f;

    move-result-object v13

    invoke-virtual {v5}, Le4/k;->c()Le4/f;

    move-result-object v14

    invoke-virtual {v5}, Le4/k;->c()Le4/f;

    move-result-object v15

    invoke-virtual {v5}, Le4/k;->c()Le4/f;

    move-result-object v6

    invoke-virtual {v5}, Le4/k;->c()Le4/f;

    move-result-object v7

    invoke-virtual {v5}, Le4/k;->c()Le4/f;

    move-result-object v8

    invoke-virtual {v5}, Le4/k;->c()Le4/f;

    move-result-object v9

    invoke-virtual {v5}, Le4/k;->c()Le4/f;

    move-result-object v11

    invoke-virtual {v5}, Le4/k;->c()Le4/f;

    move-result-object v5

    const/4 v12, 0x5

    move/from16 p2, v3

    new-array v3, v12, [Le4/q;

    move/from16 v31, v1

    const/4 v1, 0x0

    aput-object v13, v3, v1

    const/4 v12, 0x1

    aput-object v14, v3, v12

    aput-object v9, v3, p2

    aput-object v6, v3, v31

    const/4 v12, 0x4

    aput-object v7, v3, v12

    new-instance v12, Le4/o;

    iget v1, v2, Le4/k;->d:I

    move/from16 v18, v1

    add-int/lit8 v1, v18, 0x1

    iput v1, v2, Le4/k;->d:I

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v12, v1}, Le4/q;-><init>(Ljava/lang/Object;)V

    new-instance v1, Li4/a;

    move-object/from16 v18, v3

    move-object/from16 v19, v5

    const/4 v3, 0x0

    new-array v5, v3, [C

    invoke-direct {v1, v5}, Li4/b;-><init>([C)V

    const/4 v3, 0x0

    :goto_1
    const/4 v5, 0x5

    if-ge v3, v5, :cond_2

    aget-object v5, v18, v3

    move/from16 v20, v3

    iget-object v3, v5, Le4/q;->b:Ljava/util/LinkedHashMap;

    move-object/from16 v21, v5

    const-class v5, Le4/a;

    move-object/from16 v22, v6

    sget-object v6, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v6, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-interface {v5}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {v21 .. v21}, Le4/q;->a()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Li4/h;->j(Ljava/lang/String;)Li4/h;

    move-result-object v3

    invoke-virtual {v1, v3}, Li4/b;->j(Li4/c;)V

    add-int/lit8 v3, v20, 0x1

    move-object/from16 v6, v22

    goto :goto_1

    :cond_2
    move-object/from16 v22, v6

    new-instance v3, Li4/a;

    const/4 v5, 0x0

    new-array v6, v5, [C

    invoke-direct {v3, v6}, Li4/b;-><init>([C)V

    const-string v5, "spread"

    invoke-static {v5}, Li4/h;->j(Ljava/lang/String;)Li4/h;

    move-result-object v5

    invoke-virtual {v3, v5}, Li4/b;->j(Li4/c;)V

    new-instance v5, Li4/e;

    sget-object v6, Le4/b;->b:Le4/b;

    move-object/from16 v20, v7

    iget-object v7, v6, Le4/b;->a:Ljava/lang/Float;

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    move-result v7

    goto :goto_2

    :cond_3
    const/high16 v7, 0x3f000000    # 0.5f

    :goto_2
    invoke-direct {v5, v7}, Li4/e;-><init>(F)V

    invoke-virtual {v3, v5}, Li4/b;->j(Li4/c;)V

    invoke-virtual {v2, v12}, Le4/k;->a(Le4/q;)Li4/g;

    move-result-object v5

    new-instance v7, Li4/h;

    const-string v12, "hChain"

    invoke-virtual {v12}, Ljava/lang/String;->toCharArray()[C

    move-result-object v12

    invoke-direct {v7, v12}, Li4/c;-><init>([C)V

    move-object v12, v8

    move-object/from16 v21, v9

    const-wide/16 v8, 0x0

    iput-wide v8, v7, Li4/c;->x:J

    move-object v9, v11

    move-object/from16 v23, v12

    const/4 v8, 0x5

    int-to-long v11, v8

    invoke-virtual {v7, v11, v12}, Li4/c;->g(J)V

    const-string v8, "type"

    invoke-virtual {v5, v8, v7}, Li4/b;->B(Ljava/lang/String;Li4/c;)V

    const-string v7, "contains"

    invoke-virtual {v5, v7, v1}, Li4/b;->B(Ljava/lang/String;Li4/c;)V

    const-string v1, "style"

    invoke-virtual {v5, v1, v3}, Li4/b;->B(Ljava/lang/String;Li4/c;)V

    iget v1, v2, Le4/k;->b:I

    mul-int/lit16 v1, v1, 0x3f1

    add-int/lit8 v1, v1, 0x10

    const v3, 0x3b9aca07

    rem-int/2addr v1, v3

    iput v1, v2, Le4/k;->b:I

    const/4 v1, 0x0

    const/4 v5, 0x5

    :goto_3
    if-ge v1, v5, :cond_4

    aget-object v7, v18, v1

    invoke-virtual {v7}, Le4/q;->hashCode()I

    move-result v7

    iget v8, v2, Le4/k;->b:I

    mul-int/lit16 v8, v8, 0x3f1

    add-int/2addr v8, v7

    rem-int/2addr v8, v3

    iput v8, v2, Le4/k;->b:I

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_4
    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    move-result v1

    iget v5, v2, Le4/k;->b:I

    mul-int/lit16 v5, v5, 0x3f1

    add-int/2addr v5, v1

    rem-int/2addr v5, v3

    iput v5, v2, Le4/k;->b:I

    iget-object v1, v0, Lk01/d$m;->z:Lk01/e;

    invoke-virtual {v1}, Lk01/e;->c()I

    move-result v1

    const/4 v2, 0x6

    invoke-static {v1, v10, v2}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    invoke-virtual {v10, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v10, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_5

    if-ne v3, v6, :cond_6

    :cond_5
    new-instance v3, Lk01/d$a;

    invoke-direct {v3, v14, v15}, Lk01/d$a;-><init>(Le4/f;Le4/f;)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lkotlin/jvm/functions/Function1;

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v13, v3}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v24

    const/4 v3, 0x1

    int-to-float v3, v3

    const/4 v7, 0x4

    int-to-float v7, v7

    mul-float v27, v3, v7

    const/16 v28, 0x0

    const/16 v29, 0xb

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-static/range {v24 .. v29}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move/from16 v32, v27

    const/4 v11, 0x7

    int-to-float v11, v11

    mul-float/2addr v7, v11

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v11, Lx81/d;->a:Lx81/d;

    invoke-virtual {v11, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v16

    move-object v12, v11

    const/16 v11, 0x30

    move-object/from16 v18, v12

    const/4 v12, 0x0

    move-object/from16 v24, v6

    const/4 v6, 0x0

    move/from16 p1, v3

    move/from16 v39, v7

    move-object v7, v8

    move-object/from16 v37, v9

    move-wide/from16 v8, v16

    move-object/from16 v3, v18

    move-object/from16 v38, v19

    move-object/from16 v34, v20

    move-object/from16 v36, v21

    move-object/from16 v33, v22

    move-object/from16 v35, v23

    move-object/from16 v2, v24

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    iget-object v5, v0, Lk01/d$m;->z:Lk01/e;

    invoke-virtual {v5}, Lk01/e;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v10, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v10, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v10, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_7

    if-ne v7, v2, :cond_8

    :cond_7
    new-instance v7, Lk01/d$b;

    invoke-direct {v7, v15, v13}, Lk01/d$b;-><init>(Le4/f;Le4/f;)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v14, v7}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v7, 0x6

    invoke-virtual {v3, v10, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->A()Lb91/a;

    move-result-object v25

    invoke-virtual {v3, v10, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v7

    new-instance v9, Lw3/k;

    move/from16 v11, v31

    invoke-direct {v9, v11}, Lw3/k;-><init>(I)V

    const/16 v29, 0x0

    const v30, 0x2fdf8

    move-object/from16 v17, v9

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v16, v14

    move-object/from16 v18, v15

    const-wide/16 v14, 0x0

    move-object/from16 v19, v16

    const/16 v16, 0x0

    move-object/from16 v21, v18

    move-object/from16 v20, v19

    const-wide/16 v18, 0x0

    move-object/from16 v22, v20

    const/16 v20, 0x0

    move-object/from16 v23, v21

    const/16 v21, 0x0

    move-object/from16 v24, v22

    const/16 v22, 0x0

    move-object/from16 v26, v23

    const/16 v23, 0x0

    move-object/from16 v28, v24

    const/16 v24, 0x0

    move-object/from16 v40, v26

    const/16 v26, 0x0

    move-object/from16 v41, v28

    const/16 v28, 0x0

    move/from16 v42, v4

    move-object/from16 v43, v40

    move-object/from16 v4, v41

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    iget-object v5, v0, Lk01/d$m;->E:Lk01/e;

    invoke-virtual {v5}, Lk01/e;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    const/16 v8, 0x8

    const-wide v11, 0x3fb999999999999aL    # 0.1

    if-eqz v5, :cond_b

    iget-boolean v5, v0, Lk01/d$m;->F:Z

    if-eqz v5, :cond_b

    const v5, -0xfb6bbc7

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    iget-object v5, v0, Lk01/d$m;->E:Lk01/e;

    invoke-virtual {v5}, Lk01/e;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const/4 v9, 0x0

    invoke-static {v5, v10, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v9, :cond_9

    if-ne v13, v2, :cond_a

    :cond_9
    new-instance v13, Lk01/d$c;

    invoke-direct {v13, v4}, Lk01/d$c;-><init>(Le4/f;)V

    invoke-virtual {v10, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v13, Lkotlin/jvm/functions/Function1;

    move-object/from16 v9, v37

    invoke-static {v1, v9, v13}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    double-to-float v9, v11

    int-to-float v13, v8

    mul-float v15, v9, v13

    double-to-float v9, v6

    mul-float v18, v9, v13

    const/16 v19, 0x6

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v13, 0x6

    invoke-virtual {v3, v10, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v14

    invoke-virtual {v14}, Lb91/d;->E()Lb91/a;

    move-result-object v25

    invoke-virtual {v3, v10, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->y()J

    move-result-wide v13

    new-instance v15, Lw3/k;

    const/4 v6, 0x3

    invoke-direct {v15, v6}, Lw3/k;-><init>(I)V

    const/16 v29, 0x0

    const v30, 0x2fdf8

    move-object v6, v9

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move-wide/from16 v18, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-wide/from16 v47, v13

    move v14, v8

    move-wide/from16 v7, v47

    const/4 v13, 0x0

    move/from16 v16, v14

    move-object/from16 v17, v15

    const-wide/high16 v20, 0x3fe0000000000000L    # 0.5

    const-wide/16 v14, 0x0

    move/from16 v22, v16

    const/16 v16, 0x0

    move-wide/from16 v23, v18

    const-wide/16 v18, 0x0

    move-wide/from16 v40, v20

    const/16 v20, 0x0

    const/16 v21, 0x0

    move/from16 v26, v22

    const/16 v22, 0x0

    move-wide/from16 v44, v23

    const/16 v23, 0x0

    const/16 v24, 0x0

    move/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v37, v28

    const/16 v28, 0x0

    move/from16 v47, v37

    move-object/from16 v37, v3

    move/from16 v3, v47

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    const/4 v5, 0x0

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_b
    move-object/from16 v37, v3

    move v3, v8

    const/4 v5, 0x0

    const v6, -0xfad3cd2

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    :goto_4
    iget-object v6, v0, Lk01/d$m;->E:Lk01/e;

    invoke-virtual {v6}, Lk01/e;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {v6, v10, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    move-object/from16 v7, v36

    invoke-virtual {v10, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v5, v8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v5, :cond_c

    if-ne v8, v2, :cond_d

    :cond_c
    new-instance v8, Lk01/d$d;

    invoke-direct {v8, v4, v7}, Lk01/d$d;-><init>(Le4/f;Le4/f;)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v8, Lkotlin/jvm/functions/Function1;

    move-object/from16 v5, v43

    invoke-static {v1, v5, v8}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v8, 0x0

    const/4 v11, 0x3

    invoke-static {v5, v8, v11}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v12

    int-to-float v3, v3

    mul-float v13, p1, v3

    const-wide/high16 v14, 0x3fe0000000000000L    # 0.5

    double-to-float v5, v14

    mul-float v14, v5, v3

    const/16 v16, 0x0

    const/16 v17, 0x8

    move v15, v13

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move/from16 v36, v13

    move-object/from16 v9, v37

    const/4 v13, 0x6

    move/from16 v37, v14

    invoke-virtual {v9, v10, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->t()Lb91/a;

    move-result-object v25

    invoke-virtual {v9, v10, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->b1()J

    move-result-wide v11

    new-instance v13, Lw3/k;

    const/4 v14, 0x3

    invoke-direct {v13, v14}, Lw3/k;-><init>(I)V

    const/16 v29, 0x0

    const v30, 0x2fdf8

    move-object/from16 v18, v9

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move-object/from16 v21, v7

    move-wide/from16 v47, v11

    move-object v12, v8

    move-wide/from16 v7, v47

    const/4 v11, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    move-object/from16 v17, v13

    const/4 v13, 0x0

    move-object/from16 v16, v14

    const-wide/16 v14, 0x0

    move-object/from16 v19, v16

    const/16 v16, 0x0

    move-object/from16 v20, v18

    move-object/from16 v22, v19

    const-wide/16 v18, 0x0

    move-object/from16 v23, v20

    const/16 v20, 0x0

    move-object/from16 v24, v21

    const/16 v21, 0x0

    move-object/from16 v26, v22

    const/16 v22, 0x0

    move-object/from16 v28, v23

    const/16 v23, 0x0

    move-object/from16 v40, v24

    const/16 v24, 0x0

    move-object/from16 v41, v26

    const/16 v26, 0x0

    move-object/from16 v43, v28

    const/16 v28, 0x0

    move-object v0, v6

    move-object v6, v5

    move-object v5, v0

    move/from16 v44, v3

    move-object/from16 v3, v40

    move-object/from16 v0, v43

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    move-object/from16 v6, v33

    invoke-virtual {v10, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v5, v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_e

    if-ne v7, v2, :cond_f

    :cond_e
    new-instance v7, Lk01/d$e;

    invoke-direct {v7, v4, v6}, Lk01/d$e;-><init>(Le4/f;Le4/f;)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v3, v7}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move/from16 v5, p2

    int-to-float v5, v5

    mul-float v5, v5, v44

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v33, v6

    sget-object v6, Lhy0/g;->DOTTED:Lhy0/g;

    const/4 v13, 0x6

    invoke-virtual {v0, v10, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->Y0()J

    move-result-wide v12

    const/16 v16, 0x30

    const/16 v17, 0xbc

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v27, v10

    const-wide/16 v10, 0x0

    const/4 v14, 0x0

    move-object/from16 v15, v27

    move-object/from16 v4, v33

    invoke-static/range {v5 .. v17}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, p0

    move-object v10, v15

    iget-object v5, v13, Lk01/d$m;->E:Lk01/e;

    invoke-virtual {v5}, Lk01/e;->o()I

    move-result v5

    const/4 v7, 0x6

    invoke-static {v5, v10, v7}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    move-object/from16 v14, v34

    invoke-virtual {v10, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    move-object/from16 v15, v35

    invoke-virtual {v10, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_10

    if-ne v7, v2, :cond_11

    :cond_10
    new-instance v7, Lk01/d$f;

    invoke-direct {v7, v14, v15}, Lk01/d$f;-><init>(Le4/f;Le4/f;)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v4, v7}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v25

    const/16 v29, 0x0

    const/16 v30, 0xb

    const/16 v26, 0x0

    const/16 v27, 0x0

    move/from16 v28, v32

    invoke-static/range {v25 .. v30}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move/from16 v11, v39

    invoke-static {v11, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v6, 0x6

    invoke-virtual {v0, v10, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->f0()J

    move-result-wide v8

    const/16 v11, 0x30

    const/4 v12, 0x0

    const/4 v6, 0x0

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    iget-object v5, v13, Lk01/d$m;->E:Lk01/e;

    invoke-virtual {v5}, Lk01/e;->r()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v10, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v10, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_12

    if-ne v7, v2, :cond_13

    :cond_12
    new-instance v7, Lk01/d$g;

    invoke-direct {v7, v4, v15}, Lk01/d$g;-><init>(Le4/f;Le4/f;)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v14, v7}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v7, 0x6

    invoke-virtual {v0, v10, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->A()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v10, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->f0()J

    move-result-wide v7

    new-instance v4, Lw3/k;

    const/4 v11, 0x3

    invoke-direct {v4, v11}, Lw3/k;-><init>(I)V

    const/16 v29, 0x0

    const v30, 0x2fdf8

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v34, v14

    move-object/from16 v35, v15

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move-object/from16 v40, v3

    move-object/from16 v17, v4

    move-object/from16 v3, v34

    move-object/from16 v46, v35

    move-object/from16 v4, p0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    iget-object v5, v4, Lk01/d$m;->E:Lk01/e;

    invoke-virtual {v5}, Lk01/e;->t()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    if-eqz v5, :cond_16

    iget-boolean v5, v4, Lk01/d$m;->F:Z

    if-eqz v5, :cond_16

    const v5, -0xf80b682

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    iget-object v5, v4, Lk01/d$m;->E:Lk01/e;

    invoke-virtual {v5}, Lk01/e;->t()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v10, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_14

    if-ne v7, v2, :cond_15

    :cond_14
    new-instance v7, Lk01/d$h;

    invoke-direct {v7, v3}, Lk01/d$h;-><init>(Le4/f;)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object/from16 v6, v38

    invoke-static {v1, v6, v7}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const-wide v6, 0x3fb999999999999aL    # 0.1

    double-to-float v6, v6

    mul-float v15, v6, v44

    const/16 v17, 0x0

    const/16 v19, 0x6

    const/16 v16, 0x0

    move/from16 v18, v37

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v13, 0x6

    invoke-virtual {v0, v10, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->E()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v10, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->f0()J

    move-result-wide v7

    new-instance v9, Lw3/k;

    const/4 v11, 0x3

    invoke-direct {v9, v11}, Lw3/k;-><init>(I)V

    const/16 v29, 0x0

    const v30, 0x2fdf8

    move-object/from16 v17, v9

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    const/4 v6, 0x0

    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_16
    const/4 v6, 0x0

    const v5, -0xf774a52

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    :goto_5
    iget-object v5, v4, Lk01/d$m;->E:Lk01/e;

    invoke-virtual {v5}, Lk01/e;->s()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v10, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    move-object/from16 v7, v40

    invoke-virtual {v10, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v6, v8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_17

    if-ne v8, v2, :cond_18

    :cond_17
    new-instance v8, Lk01/d$i;

    invoke-direct {v8, v3, v7}, Lk01/d$i;-><init>(Le4/f;Le4/f;)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v8, Lkotlin/jvm/functions/Function1;

    move-object/from16 v15, v46

    invoke-static {v1, v15, v8}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v11, 0x3

    const/4 v14, 0x0

    invoke-static {v1, v14, v11}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/16 v17, 0x0

    const/16 v18, 0x8

    move/from16 v16, v36

    move/from16 v14, v36

    move/from16 v15, v37

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v13, 0x6

    invoke-virtual {v0, v10, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->t()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v10, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->f0()J

    move-result-wide v7

    new-instance v0, Lw3/k;

    invoke-direct {v0, v11}, Lw3/k;-><init>(I)V

    const/16 v29, 0x0

    const v30, 0x2fdf8

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move-object/from16 v17, v0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    const/4 v6, 0x0

    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    iget-object v0, v4, Lk01/d$m;->x:Le4/k;

    iget v0, v0, Le4/k;->b:I

    move/from16 v1, v42

    if-eq v0, v1, :cond_19

    iget-object v0, v4, Lk01/d$m;->y:Lc93/a;

    invoke-static {v0, v10}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    :cond_19
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lk01/d$m;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
