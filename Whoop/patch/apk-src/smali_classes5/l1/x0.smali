.class public final Ll1/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ll1/y;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ll1/y;ZZZI)V
    .locals 0

    iput p6, p0, Ll1/x0;->w:I

    iput-object p1, p0, Ll1/x0;->x:Ljava/lang/String;

    iput-object p2, p0, Ll1/x0;->y:Ll1/y;

    iput-boolean p3, p0, Ll1/x0;->z:Z

    iput-boolean p4, p0, Ll1/x0;->E:Z

    iput-boolean p5, p0, Ll1/x0;->F:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    move-object/from16 v0, p0

    iget v1, v0, Ll1/x0;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v3, v4, :cond_0

    move v3, v6

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    and-int/2addr v2, v6

    move-object v11, v1

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_9

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Lb2/e;->E:Lb2/m;

    invoke-static {v3, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v4, v11, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v11, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-eqz v8, :cond_1

    invoke-virtual {v11, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v11, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v11, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v11, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, v11, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v11, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v1, v3, :cond_4

    new-instance v1, Lkx1/b;

    const/16 v3, 0x9

    invoke-direct {v1, v3}, Lkx1/b;-><init>(I)V

    invoke-virtual {v11, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v1}, Li3/n;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    iget-object v2, v0, Ll1/x0;->y:Ll1/y;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v3, v0, Ll1/x0;->E:Z

    iget-boolean v4, v0, Ll1/x0;->F:Z

    if-eqz v3, :cond_5

    if-eqz v4, :cond_5

    iget-wide v2, v2, Ll1/y;->j:J

    :goto_2
    move-wide v7, v2

    goto :goto_3

    :cond_5
    if-eqz v3, :cond_6

    if-nez v4, :cond_6

    iget-wide v2, v2, Ll1/y;->k:J

    goto :goto_2

    :cond_6
    iget-boolean v3, v0, Ll1/x0;->z:Z

    if-eqz v3, :cond_7

    if-eqz v4, :cond_7

    iget-wide v2, v2, Ll1/y;->i:J

    goto :goto_2

    :cond_7
    if-eqz v4, :cond_8

    iget-wide v2, v2, Ll1/y;->g:J

    goto :goto_2

    :cond_8
    iget-wide v2, v2, Ll1/y;->h:J

    goto :goto_2

    :goto_3
    sget-object v2, Lo1/n;->y:Lo1/n;

    invoke-static {v2, v11}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v9

    const/4 v12, 0x0

    const/16 v13, 0xc

    const/4 v10, 0x0

    invoke-static/range {v7 .. v13}, Lc0/m1;->a(JLd0/c0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v2

    move-object/from16 v24, v11

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v9, v2, Li2/x;->a:J

    new-instance v2, Lw3/k;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lw3/k;-><init>(I)V

    const/16 v26, 0x0

    const v27, 0x3fbf8

    iget-object v7, v0, Ll1/x0;->x:Ljava/lang/String;

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object v8, v1

    move-object/from16 v16, v2

    invoke-static/range {v7 .. v27}, Ll1/o4;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v24

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_9
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eq v3, v4, :cond_a

    move v3, v5

    goto :goto_5

    :cond_a
    move v3, v6

    :goto_5
    and-int/2addr v2, v5

    move-object v11, v1

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_13

    sget v1, Lo1/g;->g:F

    sget v2, Lo1/g;->e:F

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v1, v2}, Landroidx/compose/foundation/layout/d;->m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->E:Lb2/m;

    invoke-static {v2, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v7, v11, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v11, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-eqz v9, :cond_b

    invoke-virtual {v11, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_b
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_6
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v11, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v11, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v7, v11, Lp1/q;->S:Z

    if-nez v7, :cond_c

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    :cond_c
    invoke-static {v4, v11, v4, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v11, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_e

    new-instance v1, Lkx1/b;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Lkx1/b;-><init>(I)V

    invoke-virtual {v11, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v1}, Li3/n;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    iget-object v2, v0, Ll1/x0;->y:Ll1/y;

    iget-wide v3, v2, Ll1/y;->o:J

    iget-boolean v7, v0, Ll1/x0;->E:Z

    iget-boolean v8, v0, Ll1/x0;->F:Z

    if-eqz v7, :cond_10

    if-eqz v8, :cond_10

    iget-wide v3, v2, Ll1/y;->p:J

    :cond_f
    :goto_7
    move-wide v7, v3

    goto :goto_8

    :cond_10
    if-eqz v7, :cond_11

    if-nez v8, :cond_11

    iget-wide v3, v2, Ll1/y;->q:J

    goto :goto_7

    :cond_11
    iget-boolean v7, v0, Ll1/x0;->z:Z

    if-eqz v7, :cond_12

    if-eqz v8, :cond_12

    iget-wide v3, v2, Ll1/y;->t:J

    goto :goto_7

    :cond_12
    if-eqz v8, :cond_f

    iget-wide v3, v2, Ll1/y;->n:J

    goto :goto_7

    :goto_8
    const v2, -0x39c8238a

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lo1/n;->y:Lo1/n;

    invoke-static {v2, v11}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v9

    const/4 v12, 0x0

    const/16 v13, 0xc

    const/4 v10, 0x0

    invoke-static/range {v7 .. v13}, Lc0/m1;->a(JLd0/c0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v2

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v9, v2, Li2/x;->a:J

    new-instance v2, Lw3/k;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lw3/k;-><init>(I)V

    const/16 v26, 0x0

    const v27, 0x3fbf8

    iget-object v7, v0, Ll1/x0;->x:Ljava/lang/String;

    move-object/from16 v24, v11

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object v8, v1

    move-object/from16 v16, v2

    invoke-static/range {v7 .. v27}, Ll1/o4;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v24

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_13
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_9
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
