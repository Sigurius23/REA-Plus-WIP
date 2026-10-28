.class public final Ll1/m2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Z

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc93/m;Ld0/e;Ll1/w3;Lc93/m;Lx1/b;Lc93/a;Lbc3/c0;Z)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ll1/m2;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/m2;->x:Ljava/lang/Object;

    iput-object p2, p0, Ll1/m2;->G:Ljava/lang/Object;

    iput-object p3, p0, Ll1/m2;->y:Ljava/lang/Object;

    iput-object p4, p0, Ll1/m2;->H:Ljava/lang/Object;

    iput-object p5, p0, Ll1/m2;->I:Ljava/lang/Object;

    iput-object p6, p0, Ll1/m2;->z:Ljava/lang/Object;

    iput-object p7, p0, Ll1/m2;->E:Ljava/lang/Object;

    iput-boolean p8, p0, Ll1/m2;->F:Z

    return-void
.end method

.method public constructor <init>(Ll1/w3;Lc93/a;Lbc3/c0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc93/m;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ll1/m2;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/m2;->y:Ljava/lang/Object;

    iput-object p2, p0, Ll1/m2;->z:Ljava/lang/Object;

    iput-object p3, p0, Ll1/m2;->E:Ljava/lang/Object;

    iput-boolean p4, p0, Ll1/m2;->F:Z

    iput-object p5, p0, Ll1/m2;->G:Ljava/lang/Object;

    iput-object p6, p0, Ll1/m2;->H:Ljava/lang/Object;

    iput-object p7, p0, Ll1/m2;->I:Ljava/lang/Object;

    iput-object p8, p0, Ll1/m2;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll3/v0;Ll3/v0;Ld0/v1;Ld0/v1;ZLd0/v1;Lkotlin/jvm/functions/Function3;Lm1/i0;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ll1/m2;->w:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/m2;->y:Ljava/lang/Object;

    iput-object p2, p0, Ll1/m2;->z:Ljava/lang/Object;

    iput-object p3, p0, Ll1/m2;->E:Ljava/lang/Object;

    iput-object p4, p0, Ll1/m2;->G:Ljava/lang/Object;

    iput-boolean p5, p0, Ll1/m2;->F:Z

    iput-object p6, p0, Ll1/m2;->H:Ljava/lang/Object;

    iput-object p7, p0, Ll1/m2;->I:Ljava/lang/Object;

    iput-object p8, p0, Ll1/m2;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    iget v1, v0, Ll1/m2;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq v3, v4, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    and-int/2addr v2, v5

    move-object v8, v1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v0, Ll1/m2;->y:Ljava/lang/Object;

    check-cast v1, Ll3/v0;

    iget-object v2, v0, Ll1/m2;->z:Ljava/lang/Object;

    check-cast v2, Ll3/v0;

    iget-object v3, v0, Ll1/m2;->E:Ljava/lang/Object;

    check-cast v3, Lp1/t2;

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-static {v1, v2, v3}, Ljc/x;->a0(Ll3/v0;Ll3/v0;F)Ll3/v0;

    move-result-object v9

    iget-object v1, v0, Ll1/m2;->H:Ljava/lang/Object;

    check-cast v1, Lp1/t2;

    iget-boolean v2, v0, Ll1/m2;->F:Z

    if-eqz v2, :cond_1

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li2/x;

    iget-wide v10, v1, Li2/x;->a:J

    const/16 v22, 0x0

    const v23, 0xfffffe

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    invoke-static/range {v9 .. v23}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v9

    :cond_1
    move-object v6, v9

    iget-object v1, v0, Ll1/m2;->G:Ljava/lang/Object;

    check-cast v1, Lp1/t2;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li2/x;

    iget-wide v4, v1, Li2/x;->a:J

    new-instance v1, Lb30/w2;

    iget-object v2, v0, Ll1/m2;->I:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function3;

    iget-object v3, v0, Ll1/m2;->x:Ljava/lang/Object;

    check-cast v3, Lm1/i0;

    const/16 v7, 0x17

    invoke-direct {v1, v7, v2, v3}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x44fdd1bf

    invoke-static {v2, v8, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const/16 v9, 0x180

    invoke-static/range {v4 .. v9}, Lm1/l0;->b(JLl3/v0;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_2
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    iget-object v1, v0, Ll1/m2;->y:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Ll1/w3;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget-object v4, v0, Ll1/m2;->G:Ljava/lang/Object;

    check-cast v4, Ld0/e;

    and-int/lit8 v5, v2, 0x3

    const/4 v6, 0x2

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eq v5, v6, :cond_3

    move v5, v11

    goto :goto_2

    :cond_3
    move v5, v12

    :goto_2
    and-int/2addr v2, v11

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v5}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_a

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    iget-object v5, v0, Ll1/m2;->x:Ljava/lang/Object;

    check-cast v5, Lc93/m;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v5, v1, v6}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll0/b2;

    invoke-static {v2, v5}, Ll0/f;->p(Landroidx/compose/ui/Modifier;Ll0/b2;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v1, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v6, v5, :cond_5

    :cond_4
    new-instance v6, Lio/getstream/chat/android/ui/viewmodel/typing/a;

    const/16 v5, 0x18

    invoke-direct {v6, v4, v5}, Lio/getstream/chat/android/ui/viewmodel/typing/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v6}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v4, Ll1/e;

    const/4 v5, 0x1

    invoke-direct {v4, v3, v5}, Ll1/e;-><init>(Ll1/w3;I)V

    invoke-static {v2, v4}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    iget-object v4, v0, Ll1/m2;->H:Ljava/lang/Object;

    move-object v10, v4

    check-cast v10, Lc93/m;

    iget-object v4, v0, Ll1/m2;->I:Ljava/lang/Object;

    move-object v13, v4

    check-cast v13, Lx1/b;

    iget-object v4, v0, Ll1/m2;->z:Ljava/lang/Object;

    check-cast v4, Lc93/a;

    iget-object v5, v0, Ll1/m2;->E:Ljava/lang/Object;

    check-cast v5, Lbc3/c0;

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v7, v1, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v7, v1, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v1, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v14, v1, Lp1/q;->S:Z

    if-eqz v14, :cond_6

    invoke-virtual {v1, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_6
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_3
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v1, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v1, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v1, Lp1/q;->S:Z

    if-nez v8, :cond_7

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    :cond_7
    invoke-static {v7, v1, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v1, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v10, :cond_9

    const v2, 0x50a4256d

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    const v2, 0x7f1407c8

    invoke-static {v1, v2}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    const v2, 0x7f1407c9

    invoke-static {v1, v2}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    const v2, 0x7f1407cb

    invoke-static {v1, v2}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    new-instance v2, Ll1/m2;

    iget-boolean v6, v0, Ll1/m2;->F:Z

    invoke-direct/range {v2 .. v10}, Ll1/m2;-><init>(Ll1/w3;Lc93/a;Lbc3/c0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc93/m;)V

    const v3, 0x773d37a4

    invoke-static {v3, v1, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    const/16 v3, 0x36

    invoke-static {v2, v1, v3}, Ll1/t3;->a(Lx1/b;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v1, v12}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_9
    const v2, 0x50d311ed

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v12}, Lp1/q;->q(Z)V

    :goto_4
    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, Ll0/z;->a:Ll0/z;

    invoke-virtual {v13, v3, v1, v2}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v11}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_a
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget-object v3, v0, Ll1/m2;->E:Ljava/lang/Object;

    check-cast v3, Lbc3/c0;

    iget-object v4, v0, Ll1/m2;->z:Ljava/lang/Object;

    check-cast v4, Lc93/a;

    iget-object v5, v0, Ll1/m2;->y:Ljava/lang/Object;

    move-object v8, v5

    check-cast v8, Ll1/w3;

    and-int/lit8 v5, v2, 0x3

    const/4 v6, 0x2

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v5, v6, :cond_b

    move v5, v15

    goto :goto_6

    :cond_b
    move v5, v14

    :goto_6
    and-int/2addr v2, v15

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v5}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-virtual {v1, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v2, v5

    invoke-virtual {v1, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v2, v5

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_c

    if-ne v5, v6, :cond_d

    :cond_c
    new-instance v5, Lkf0/g;

    invoke-direct {v5, v8, v4, v3}, Lkf0/g;-><init>(Ll1/w3;Lc93/a;Lbc3/c0;)V

    invoke-virtual {v1, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v5, Lc93/a;

    const/4 v2, 0x7

    sget-object v7, Lb2/t;->w:Lb2/t;

    const/4 v9, 0x0

    invoke-static {v7, v14, v9, v5, v2}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    iget-boolean v5, v0, Ll1/m2;->F:Z

    invoke-virtual {v1, v5}, Lp1/q;->h(Z)Z

    move-result v5

    invoke-virtual {v1, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v5, v7

    iget-object v7, v0, Ll1/m2;->G:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v1, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v5, v7

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v4, v5

    iget-object v5, v0, Ll1/m2;->H:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v1, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v1, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v3, v4

    iget-object v4, v0, Ll1/m2;->I:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, Ll1/m2;->G:Ljava/lang/Object;

    move-object v9, v4

    check-cast v9, Ljava/lang/String;

    iget-object v4, v0, Ll1/m2;->H:Ljava/lang/Object;

    move-object v10, v4

    check-cast v10, Ljava/lang/String;

    iget-object v4, v0, Ll1/m2;->I:Ljava/lang/Object;

    move-object v11, v4

    check-cast v11, Ljava/lang/String;

    iget-object v4, v0, Ll1/m2;->z:Ljava/lang/Object;

    move-object v12, v4

    check-cast v12, Lc93/a;

    iget-object v4, v0, Ll1/m2;->E:Ljava/lang/Object;

    move-object v13, v4

    check-cast v13, Lbc3/c0;

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_e

    if-ne v4, v6, :cond_f

    :cond_e
    new-instance v6, Lih0/r;

    iget-boolean v7, v0, Ll1/m2;->F:Z

    invoke-direct/range {v6 .. v13}, Lih0/r;-><init>(ZLl1/w3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc93/a;Lbc3/c0;)V

    invoke-virtual {v1, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v6

    :cond_f
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v15, v4}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    iget-object v3, v0, Ll1/m2;->x:Ljava/lang/Object;

    check-cast v3, Lc93/m;

    sget-object v4, Lb2/e;->w:Lb2/m;

    invoke-static {v4, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v5, v1, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v1, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v8, v1, Lp1/q;->S:Z

    if-eqz v8, :cond_10

    invoke-virtual {v1, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_10
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_7
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v1, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v1, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v1, Lp1/q;->S:Z

    if-nez v6, :cond_11

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_12

    :cond_11
    invoke-static {v5, v1, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v1, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v3, v1, v15}, Ldc/b;->z(ILc93/m;Lp1/q;Z)V

    goto :goto_8

    :cond_13
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_8
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
