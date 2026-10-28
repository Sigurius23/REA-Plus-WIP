.class public final Loy/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:J

.field public final synthetic G:Z

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:J

.field public final synthetic y:Ll3/v0;

.field public final synthetic z:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;JLl3/v0;ZZJZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loy/h;->w:Ljava/lang/String;

    iput-wide p2, p0, Loy/h;->x:J

    iput-object p4, p0, Loy/h;->y:Ll3/v0;

    iput-boolean p5, p0, Loy/h;->z:Z

    iput-boolean p6, p0, Loy/h;->E:Z

    iput-wide p7, p0, Loy/h;->F:J

    iput-boolean p9, p0, Loy/h;->G:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Ll0/v;

    move-object/from16 v23, p2

    check-cast v23, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    sget-object v3, Lb2/e;->F:Lb2/m;

    sget-object v4, Lb2/e;->w:Lb2/m;

    const-string v5, "$this$BoxWithConstraints"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v5, v2, 0x6

    if-nez v5, :cond_1

    move-object/from16 v5, v23

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v2, v5

    :cond_1
    and-int/lit8 v2, v2, 0x13

    const/16 v5, 0x12

    if-ne v2, v5, :cond_3

    move-object/from16 v2, v23

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Lp1/q;->X()V

    goto/16 :goto_5

    :cond_3
    :goto_1
    sget-object v2, Lb2/e;->E:Lb2/m;

    check-cast v1, Landroidx/compose/foundation/layout/c;

    sget-object v5, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-virtual {v5, v6, v2}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v25, 0x0

    const v26, 0xfff8

    move-object v7, v3

    move-object v3, v2

    iget-object v2, v0, Loy/h;->w:Ljava/lang/String;

    move-object v8, v4

    move-object v9, v5

    iget-wide v4, v0, Loy/h;->x:J

    move-object v11, v6

    move-object v10, v7

    move-object v12, v8

    const/4 v8, 0x0

    move-object v13, v9

    const/4 v9, 0x0

    move-object v14, v10

    const/4 v10, 0x0

    move-object/from16 v16, v11

    move-object v15, v12

    const-wide/16 v11, 0x0

    move-object/from16 v17, v13

    const/4 v13, 0x0

    move-object/from16 v18, v14

    const/4 v14, 0x0

    move-object/from16 v19, v15

    move-object/from16 v20, v16

    const-wide/16 v15, 0x0

    move-object/from16 v21, v17

    const/16 v17, 0x0

    move-object/from16 v22, v18

    const/16 v18, 0x0

    move-object/from16 v24, v19

    const/16 v19, 0x0

    move-object/from16 v27, v20

    const/16 v20, 0x0

    move-object/from16 v28, v21

    const/16 v21, 0x0

    iget-object v6, v0, Loy/h;->y:Ll3/v0;

    move-object/from16 v7, v24

    const/16 v24, 0x0

    move-object/from16 p3, v1

    move-object/from16 v1, v27

    move-object/from16 v29, v28

    move-object/from16 v28, v7

    move-object/from16 v27, v22

    move-object/from16 v22, v6

    const-wide/16 v6, 0x0

    invoke-static/range {v2 .. v26}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    iget-boolean v2, v0, Loy/h;->z:Z

    const/4 v3, 0x1

    const/16 v4, 0x8

    const/4 v5, 0x0

    if-eqz v2, :cond_7

    move-object/from16 v10, v23

    check-cast v10, Lp1/q;

    const v2, 0x1157a635

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p3 .. p3}, Landroidx/compose/foundation/layout/c;->d()F

    move-result v2

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    int-to-float v14, v4

    const/4 v15, 0x0

    const/16 v16, 0xb

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v12, v28

    invoke-static {v12, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_4

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_2
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v10, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v10, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-nez v7, :cond_5

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    :cond_5
    invoke-static {v6, v10, v6, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v10, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v10, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/c1;

    invoke-virtual {v2}, Lg1/c1;->d()J

    move-result-wide v6

    move-object/from16 v14, v27

    move-object/from16 v13, v29

    invoke-virtual {v13, v1, v14}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, Lds/q;->e(JLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    goto/16 :goto_5

    :cond_7
    move-object/from16 v14, v27

    move-object/from16 v12, v28

    move-object/from16 v13, v29

    iget-boolean v2, v0, Loy/h;->E:Z

    if-eqz v2, :cond_c

    move-object/from16 v2, v23

    check-cast v2, Lp1/q;

    const v6, 0x115d8c20

    invoke-virtual {v2, v6}, Lp1/q;->e0(I)V

    invoke-virtual/range {p3 .. p3}, Landroidx/compose/foundation/layout/c;->d()F

    move-result v6

    invoke-static {v6, v1}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    int-to-float v4, v4

    const/16 v19, 0x0

    const/16 v20, 0xb

    const/16 v16, 0x0

    const/16 v17, 0x0

    move/from16 v18, v4

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v12, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v7, v2, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v2, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v10, v2, Lp1/q;->S:Z

    if-eqz v10, :cond_8

    invoke-virtual {v2, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_8
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_3
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v2, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v2, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v2, Lp1/q;->S:Z

    if-nez v8, :cond_9

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    :cond_9
    invoke-static {v7, v2, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v2, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v4, 0x7f0807dc

    invoke-static {v4, v2, v5}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v15

    const v4, 0x2c87b26f

    invoke-virtual {v2, v4}, Lp1/q;->e0(I)V

    iget-boolean v4, v0, Loy/h;->G:Z

    if-eqz v4, :cond_b

    sget-object v4, Lg1/j1;->a:Lp1/b0;

    invoke-virtual {v2, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    goto :goto_4

    :cond_b
    const/high16 v4, 0x3f000000    # 0.5f

    :goto_4
    invoke-virtual {v2, v5}, Lp1/q;->q(Z)V

    iget-wide v6, v0, Loy/h;->F:J

    invoke-static {v4, v6, v7}, Li2/x;->c(FJ)J

    move-result-wide v18

    invoke-virtual {v13, v1, v14}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    const/16 v21, 0x30

    const/16 v22, 0x0

    const-string v16, "lock"

    move-object/from16 v20, v2

    invoke-static/range {v15 .. v22}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v1, v20

    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v1, v5}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_c
    move-object/from16 v1, v23

    check-cast v1, Lp1/q;

    const v2, 0x116829f4

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v5}, Lp1/q;->q(Z)V

    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
