.class public final Lz21/b$d;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz21/b;->k(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;ZLny0/v0;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic E:Ljava/util/List;

.field final synthetic F:Lc93/a;

.field final synthetic G:Lp1/c1;

.field final synthetic H:Ljava/util/List;

.field final synthetic I:Lp1/c1;

.field final synthetic J:Z

.field final synthetic K:Lny0/v0;

.field final synthetic L:Lkotlin/jvm/functions/Function1;

.field final synthetic M:Z

.field final synthetic N:Lkotlin/jvm/functions/Function1;

.field final synthetic w:Lp1/c1;

.field final synthetic x:Le4/k;

.field final synthetic y:Lc93/a;

.field final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public constructor <init>(Lp1/c1;Le4/k;Lc93/a;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lc93/a;Lp1/c1;Ljava/util/List;Lp1/c1;ZLny0/v0;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lz21/b$d;->w:Lp1/c1;

    iput-object p2, p0, Lz21/b$d;->x:Le4/k;

    iput-object p3, p0, Lz21/b$d;->y:Lc93/a;

    iput-object p4, p0, Lz21/b$d;->z:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lz21/b$d;->E:Ljava/util/List;

    iput-object p6, p0, Lz21/b$d;->F:Lc93/a;

    iput-object p7, p0, Lz21/b$d;->G:Lp1/c1;

    iput-object p8, p0, Lz21/b$d;->H:Ljava/util/List;

    iput-object p9, p0, Lz21/b$d;->I:Lp1/c1;

    iput-boolean p10, p0, Lz21/b$d;->J:Z

    iput-object p11, p0, Lz21/b$d;->K:Lny0/v0;

    iput-object p12, p0, Lz21/b$d;->L:Lkotlin/jvm/functions/Function1;

    iput-boolean p13, p0, Lz21/b$d;->M:Z

    iput-object p14, p0, Lz21/b$d;->N:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 42

    move-object/from16 v0, p0

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    move-object/from16 v1, p1

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    return-void

    :cond_1
    :goto_0
    iget-object v1, v0, Lz21/b$d;->w:Lp1/c1;

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v1, v3}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    iget-object v1, v0, Lz21/b$d;->x:Le4/k;

    iget v3, v1, Le4/k;->b:I

    invoke-virtual {v1}, Le4/k;->e()V

    iget-object v1, v0, Lz21/b$d;->x:Le4/k;

    move-object/from16 v13, p1

    check-cast v13, Lp1/q;

    const v4, 0x582e5f68

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Le4/k;->d()Lad3/z;

    move-result-object v4

    iget-object v4, v4, Lad3/z;->x:Ljava/lang/Object;

    check-cast v4, Le4/k;

    invoke-virtual {v4}, Le4/k;->c()Le4/f;

    move-result-object v5

    invoke-virtual {v4}, Le4/k;->c()Le4/f;

    move-result-object v6

    invoke-virtual {v4}, Le4/k;->c()Le4/f;

    move-result-object v4

    iget-object v7, v0, Lz21/b$d;->z:Lcom/whoop/design/util/TextResource;

    sget-object v8, Lb2/t;->w:Lb2/t;

    sget-object v9, Lp1/l;->a:Lp1/v0;

    const/4 v10, 0x6

    const/4 v11, 0x0

    if-eqz v7, :cond_4

    const v7, 0x582ec8c1

    invoke-virtual {v13, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v7, :cond_2

    if-ne v12, v9, :cond_3

    :cond_2
    new-instance v12, Lz21/b$e;

    invoke-direct {v12, v4}, Lz21/b$e;-><init>(Le4/f;)V

    invoke-virtual {v13, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v12, Lkotlin/jvm/functions/Function1;

    invoke-static {v8, v5, v12}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/high16 v12, 0x3f000000    # 0.5f

    invoke-static {v12, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    iget-object v12, v0, Lz21/b$d;->z:Lcom/whoop/design/util/TextResource;

    invoke-static {v12, v13, v11}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v12

    sget-object v14, Lx81/d;->a:Lx81/d;

    invoke-virtual {v14, v13, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->c1()J

    move-result-wide v15

    invoke-virtual {v14, v13, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v14

    invoke-virtual {v14}, Lb91/d;->a()Lb91/a;

    move-result-object v24

    const/16 v28, 0x0

    const v29, 0x2fff8

    move-object v14, v8

    move-object/from16 v17, v9

    const-wide/16 v8, 0x0

    move/from16 v18, v10

    const/4 v10, 0x0

    move/from16 v19, v11

    const/4 v11, 0x0

    move-object/from16 v20, v4

    move-object v4, v12

    const/4 v12, 0x0

    move-object/from16 v26, v13

    move-object/from16 v21, v14

    const-wide/16 v13, 0x0

    move-object/from16 v22, v5

    move-object v5, v7

    move-wide/from16 v40, v15

    move-object/from16 v16, v6

    move-wide/from16 v6, v40

    const/4 v15, 0x0

    move-object/from16 v23, v16

    const/16 v16, 0x0

    move-object/from16 v25, v17

    move/from16 v27, v18

    const-wide/16 v17, 0x0

    move/from16 v30, v19

    const/16 v19, 0x0

    move-object/from16 v31, v20

    const/16 v20, 0x0

    move-object/from16 v32, v21

    const/16 v21, 0x0

    move-object/from16 v33, v22

    const/16 v22, 0x0

    move-object/from16 v34, v23

    const/16 v23, 0x0

    move-object/from16 v35, v25

    const/16 v25, 0x0

    move/from16 v36, v27

    const/16 v27, 0x0

    move-object/from16 v2, v31

    move-object/from16 v31, v1

    move/from16 v1, v30

    move/from16 v30, v3

    move-object v3, v2

    move-object/from16 v38, v32

    move-object/from16 v37, v33

    move-object/from16 v2, v34

    move-object/from16 v39, v35

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v26

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_4
    move-object/from16 v31, v1

    move/from16 v30, v3

    move-object v3, v4

    move-object/from16 v37, v5

    move-object v2, v6

    move-object/from16 v38, v8

    move-object/from16 v39, v9

    move v1, v11

    const v4, 0x5835a6cb

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    :goto_1
    iget-object v4, v0, Lz21/b$d;->E:Ljava/util/List;

    if-eqz v4, :cond_7

    const v4, 0x58366ddf

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    iget-object v4, v0, Lz21/b$d;->F:Lc93/a;

    if-eqz v4, :cond_5

    invoke-interface {v4}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li2/x;

    goto :goto_2

    :cond_5
    const/4 v4, 0x0

    :goto_2
    if-nez v4, :cond_6

    const v4, -0x477a149e

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/b;->a:Lx81/b;

    const/4 v5, 0x6

    invoke-virtual {v4, v13, v5}, Lx81/b;->a(Landroidx/compose/runtime/Composer;I)Ly81/a;

    move-result-object v4

    invoke-virtual {v4}, Ly81/a;->c()J

    move-result-wide v4

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    :goto_3
    move-wide v6, v4

    goto :goto_4

    :cond_6
    const v5, -0x477a1b47

    invoke-virtual {v13, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    iget-wide v4, v4, Li2/x;->a:J

    goto :goto_3

    :goto_4
    new-instance v4, Lz21/b$f;

    iget-object v5, v0, Lz21/b$d;->G:Lp1/c1;

    move-object/from16 v8, v31

    invoke-direct {v4, v8, v2, v3, v5}, Lz21/b$f;-><init>(Le4/k;Le4/f;Le4/f;Lp1/c1;)V

    const v2, 0x7db47190

    invoke-static {v2, v13, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v12

    const/16 v14, 0x6000

    const/16 v15, 0xd

    const-wide/16 v4, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    invoke-static/range {v4 .. v15}, Ly81/c;->b(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    const v2, 0x5840edab

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    :goto_5
    sget-object v2, Lb2/e;->K:Lb2/l;

    sget-object v4, Ll0/m;->e:Ll0/h;

    const/4 v5, 0x2

    int-to-float v5, v5

    const/4 v6, 0x4

    int-to-float v6, v6

    mul-float/2addr v5, v6

    const/4 v6, 0x0

    const/4 v14, 0x1

    move-object/from16 v7, v38

    invoke-static {v7, v6, v5, v14}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v6, v37

    invoke-virtual {v13, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_8

    move-object/from16 v7, v39

    if-ne v8, v7, :cond_9

    :cond_8
    new-instance v8, Lz21/b$g;

    invoke-direct {v8, v6}, Lz21/b$g;-><init>(Le4/f;)V

    invoke-virtual {v13, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v3, v8}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v5, 0x36

    invoke-static {v4, v2, v13, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v4, v13, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v13, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-eqz v7, :cond_a

    invoke-virtual {v13, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_6
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v13, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v13, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v5, v13, Lp1/q;->S:Z

    if-nez v5, :cond_b

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_c

    :cond_b
    invoke-static {v4, v13, v4, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v13, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v4, v0, Lz21/b$d;->H:Ljava/util/List;

    iget-object v2, v0, Lz21/b$d;->I:Lp1/c1;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    new-instance v15, Lz21/b$h;

    iget-boolean v2, v0, Lz21/b$d;->J:Z

    iget-object v3, v0, Lz21/b$d;->K:Lny0/v0;

    iget-object v6, v0, Lz21/b$d;->L:Lkotlin/jvm/functions/Function1;

    iget-boolean v7, v0, Lz21/b$d;->M:Z

    iget-object v8, v0, Lz21/b$d;->F:Lc93/a;

    iget-object v9, v0, Lz21/b$d;->E:Ljava/util/List;

    iget-object v10, v0, Lz21/b$d;->H:Ljava/util/List;

    iget-object v11, v0, Lz21/b$d;->N:Lkotlin/jvm/functions/Function1;

    iget-object v12, v0, Lz21/b$d;->I:Lp1/c1;

    iget-object v1, v0, Lz21/b$d;->G:Lp1/c1;

    move-object/from16 v25, v1

    move/from16 v16, v2

    move-object/from16 v17, v3

    move-object/from16 v18, v6

    move/from16 v19, v7

    move-object/from16 v20, v8

    move-object/from16 v21, v9

    move-object/from16 v22, v10

    move-object/from16 v23, v11

    move-object/from16 v24, v12

    invoke-direct/range {v15 .. v25}, Lz21/b$h;-><init>(ZLny0/v0;Lkotlin/jvm/functions/Function1;ZLc93/a;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;)V

    const v1, 0x78929af

    invoke-static {v1, v13, v15}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    const/high16 v11, 0x30000

    const/16 v12, 0x1c

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v10, v13

    invoke-static/range {v4 .. v12}, Lf31/c;->e(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ll0/i;Lb2/g;Lc93/o;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v14}, Lp1/q;->q(Z)V

    const/4 v1, 0x0

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    iget-object v1, v0, Lz21/b$d;->x:Le4/k;

    iget v1, v1, Le4/k;->b:I

    move/from16 v2, v30

    if-eq v1, v2, :cond_d

    iget-object v1, v0, Lz21/b$d;->y:Lc93/a;

    invoke-static {v1, v13}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    :cond_d
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lz21/b$d;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
