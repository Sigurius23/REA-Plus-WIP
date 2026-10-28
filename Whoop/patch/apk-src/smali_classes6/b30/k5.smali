.class public final Lb30/k5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:Lx30/f0;

.field public final synthetic x:Z

.field public final synthetic y:Lg2/s;

.field public final synthetic z:Lp1/t2;


# direct methods
.method public constructor <init>(Lx30/f0;ZLg2/s;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/k5;->w:Lx30/f0;

    iput-boolean p2, p0, Lb30/k5;->x:Z

    iput-object p3, p0, Lb30/k5;->y:Lg2/s;

    iput-object p4, p0, Lb30/k5;->z:Lp1/t2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 41

    move-object/from16 v1, p1

    check-cast v1, Lc0/i0;

    move-object/from16 v9, p2

    check-cast v9, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    const-string v2, "$this$AnimatedVisibility"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x14

    int-to-float v4, v1

    const/4 v6, 0x0

    const/16 v7, 0xd

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Ld40/p;->a:Ld40/n;

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object v3

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x0

    invoke-static {v3, v4, v9, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    invoke-static {v9}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v4

    move-object v6, v9

    check-cast v6, Lp1/q;

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v9, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v10, v6, Lp1/q;->S:Z

    if-eqz v10, :cond_0

    invoke-virtual {v6, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_0
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v9, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v9, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v11, v6, Lp1/q;->S:Z

    if-nez v11, :cond_1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2

    :cond_1
    invoke-static {v4, v6, v4, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v9, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x7f14107d

    invoke-static {v9, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v9}, Lg1/l3;->c(Landroidx/compose/runtime/Composer;)Lg1/h9;

    move-result-object v11

    iget-object v11, v11, Lg1/h9;->i:Ll3/v0;

    invoke-static {v9}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v12

    iget-wide v12, v12, Ld40/n;->e:J

    const/16 v25, 0x0

    const v26, 0xfffa

    move-object v14, v3

    const/4 v3, 0x0

    move-object v15, v6

    move-object/from16 v16, v7

    const-wide/16 v6, 0x0

    move-object/from16 v17, v8

    const/4 v8, 0x0

    move-object/from16 v23, v9

    const/4 v9, 0x0

    move-object/from16 v18, v10

    const/4 v10, 0x0

    move/from16 v19, v5

    move-object/from16 v22, v11

    move-wide/from16 v39, v12

    move-object v13, v4

    move-wide/from16 v4, v39

    const-wide/16 v11, 0x0

    move-object/from16 v20, v13

    const/4 v13, 0x0

    move-object/from16 v21, v14

    const/4 v14, 0x0

    move-object/from16 v24, v15

    move-object/from16 v27, v16

    const-wide/16 v15, 0x0

    move-object/from16 v28, v17

    const/16 v17, 0x0

    move-object/from16 v29, v18

    const/16 v18, 0x0

    move/from16 v30, v19

    const/16 v19, 0x0

    move-object/from16 v31, v20

    const/16 v20, 0x0

    move-object/from16 v32, v21

    const/16 v21, 0x0

    move-object/from16 v33, v24

    const/16 v24, 0x0

    move-object v0, v2

    move-object v2, v1

    move-object v1, v0

    move-object/from16 v37, v27

    move-object/from16 v34, v28

    move-object/from16 v35, v29

    move/from16 v0, v30

    move-object/from16 v38, v31

    move-object/from16 v36, v32

    invoke-static/range {v2 .. v26}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v23

    int-to-float v2, v0

    const/16 v3, 0x8

    int-to-float v3, v3

    invoke-static {v1, v2, v3, v2, v3}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Ll0/a1;->w:Ll0/a1;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/a;->j(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v3, Lb30/j5;

    move-object/from16 v12, p0

    iget-object v4, v12, Lb30/k5;->w:Lx30/f0;

    iget-boolean v5, v12, Lb30/k5;->x:Z

    iget-object v6, v12, Lb30/k5;->y:Lg2/s;

    invoke-direct {v3, v4, v5, v6, v0}, Lb30/j5;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    const v4, 0x185779ac

    invoke-static {v4, v9, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const v10, 0x30006

    const/16 v11, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v11}, Lse/a;->p(Landroidx/compose/ui/Modifier;Li2/a1;ZJLf0/t;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    iget-object v2, v12, Lb30/k5;->z:Lp1/t2;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg40/h1;

    const v3, 0x103884fb

    move-object/from16 v15, v33

    invoke-virtual {v15, v3}, Lp1/q;->e0(I)V

    const/4 v3, 0x1

    if-nez v2, :cond_3

    goto :goto_6

    :cond_3
    sget-object v4, Ll0/m;->a:Ll0/e;

    sget-object v5, Lb2/e;->J:Lb2/l;

    invoke-static {v4, v5, v9, v0}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    invoke-static {v9}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v5

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v9, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v7, v15, Lp1/q;->S:Z

    if-eqz v7, :cond_4

    move-object/from16 v7, v34

    invoke-virtual {v15, v7}, Lp1/q;->l(Lc93/a;)V

    :goto_1
    move-object/from16 v7, v35

    goto :goto_2

    :cond_4
    invoke-virtual {v15}, Lp1/q;->s0()V

    goto :goto_1

    :goto_2
    invoke-static {v9, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v14, v36

    invoke-static {v9, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v15, Lp1/q;->S:Z

    if-nez v4, :cond_5

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    :cond_5
    move-object/from16 v4, v37

    goto :goto_4

    :cond_6
    :goto_3
    move-object/from16 v13, v38

    goto :goto_5

    :goto_4
    invoke-static {v5, v15, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_3

    :goto_5
    invoke-static {v9, v13, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-static {v2, v1, v9, v0}, Lse/a;->r(Lg40/h1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v15, v3}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v15, v3}, Lp1/q;->q(Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
