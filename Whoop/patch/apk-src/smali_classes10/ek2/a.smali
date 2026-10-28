.class public abstract Lek2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a]\u0010\u000c\u001a\u00020\u00062\u0010\u0010\u0003\u001a\u000c\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u00042\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\nH\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lh91/b;",
        "Lcom/whoop/design/models/calendar/CalendarDateModel;",
        "Lcom/whoop/design/domain/calendar/CalendarDomainState;",
        "calendarDomainState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onCalendarPaged",
        "Ljava/time/LocalDate;",
        "onDateClicked",
        "Lkotlin/Function0;",
        "onBackgroundClick",
        "h",
        "(Lh91/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "tilt-graph_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Ljava/time/LocalDate;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lek2/a;->j(Ljava/time/LocalDate;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lh91/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lek2/a;->o(Lh91/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lek2/a;->m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lh91/b;I)Lg51/c;
    .locals 0

    invoke-static {p0, p1}, Lek2/a;->n(Lh91/b;I)Lg51/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lek2/a;->l(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(I)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lek2/a;->i(I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g()Ll83/a0;
    .locals 1

    invoke-static {}, Lek2/a;->k()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final h(Lh91/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh91/b<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v12, p5

    const-string v0, "calendarDomainState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v0, -0x4b4d1718

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v12, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v12, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v12

    goto :goto_2

    :cond_2
    move v0, v12

    :goto_2
    and-int/lit8 v4, p6, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v5, v12, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_3

    :cond_5
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v0, v6

    :goto_4
    and-int/lit8 v6, p6, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v0, v0, 0x180

    :cond_6
    move-object/from16 v8, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v8, v12, 0x180

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-virtual {v9, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x100

    goto :goto_5

    :cond_8
    const/16 v10, 0x80

    :goto_5
    or-int/2addr v0, v10

    :goto_6
    and-int/lit8 v10, p6, 0x8

    const/16 v11, 0x800

    if-eqz v10, :cond_a

    or-int/lit16 v0, v0, 0xc00

    :cond_9
    move-object/from16 v13, p3

    goto :goto_8

    :cond_a
    and-int/lit16 v13, v12, 0xc00

    if-nez v13, :cond_9

    move-object/from16 v13, p3

    invoke-virtual {v9, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_b

    move v14, v11

    goto :goto_7

    :cond_b
    const/16 v14, 0x400

    :goto_7
    or-int/2addr v0, v14

    :goto_8
    and-int/lit16 v14, v0, 0x493

    const/16 v15, 0x492

    const/4 v1, 0x0

    if-eq v14, v15, :cond_c

    const/4 v14, 0x1

    goto :goto_9

    :cond_c
    move v14, v1

    :goto_9
    and-int/lit8 v15, v0, 0x1

    invoke-virtual {v9, v15, v14}, Lp1/q;->U(IZ)Z

    move-result v14

    if-eqz v14, :cond_24

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_e

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v14, :cond_d

    new-instance v4, Lej1/n;

    const/16 v5, 0xa

    invoke-direct {v4, v5}, Lej1/n;-><init>(I)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v5, v4

    :cond_e
    if-eqz v6, :cond_10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v14, :cond_f

    new-instance v4, Lej1/n;

    const/16 v6, 0xb

    invoke-direct {v4, v6}, Lej1/n;-><init>(I)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v15, v4

    goto :goto_a

    :cond_10
    move-object v15, v8

    :goto_a
    if-eqz v10, :cond_12

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v14, :cond_11

    new-instance v4, Lej1/a;

    const/4 v6, 0x1

    invoke-direct {v4, v6}, Lej1/a;-><init>(I)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v4, Lc93/a;

    move-object v13, v4

    :cond_12
    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v14, :cond_13

    sget-object v10, Lek2/a$a;->w:Lek2/a$a;

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-static {v10}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v10

    invoke-interface {v10, v9, v1}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v3

    sget-object v10, Li2/w0;->a:Li2/v0;

    invoke-static {v8, v3, v4, v10}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    new-instance v18, Lj0/j;

    invoke-direct/range {v18 .. v18}, Lj0/j;-><init>()V

    and-int/lit16 v3, v0, 0x1c00

    if-ne v3, v11, :cond_14

    const/4 v3, 0x1

    goto :goto_b

    :cond_14
    move v3, v1

    :goto_b
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_15

    if-ne v4, v14, :cond_16

    :cond_15
    new-instance v4, Ld42/o;

    const/16 v3, 0xd

    invoke-direct {v4, v13, v3}, Ld42/o;-><init>(Lc93/a;I)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    move-object/from16 v22, v4

    check-cast v22, Lc93/a;

    const/16 v23, 0x1c

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v17 .. v23}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->w:Lb2/m;

    invoke-static {v4, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v9, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v1, v9, Lp1/q;->S:Z

    if-eqz v1, :cond_17

    invoke-virtual {v9, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_17
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_c
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v9, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v9, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v2, v9, Lp1/q;->S:Z

    if-nez v2, :cond_18

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v20, v5

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_19

    goto :goto_d

    :cond_18
    move-object/from16 v20, v5

    :goto_d
    invoke-static {v10, v9, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v9, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v3, v9, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    move-object/from16 v21, v13

    invoke-virtual {v10}, Ly81/i;->n()J

    move-result-wide v12

    const/4 v10, 0x4

    int-to-float v10, v10

    mul-float v19, v10, v10

    move/from16 v22, v10

    invoke-static/range {v19 .. v19}, Lt0/j;->e(F)Lt0/i;

    move-result-object v10

    invoke-static {v6, v12, v13, v10}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const-wide/high16 v12, 0x3fd8000000000000L    # 0.375

    double-to-float v12, v12

    mul-float v12, v12, v22

    invoke-virtual {v3, v9, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    move-object/from16 v22, v14

    invoke-virtual {v3}, Ly81/i;->W0()J

    move-result-wide v13

    invoke-static/range {v19 .. v19}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    invoke-static {v10, v12, v13, v14, v3}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v10, 0x0

    invoke-static {v3, v10, v5}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v12, Lb2/e;->x:Lb2/m;

    sget-object v13, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v13, v3, v12}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v4, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    move-object/from16 p1, v6

    iget-wide v5, v9, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v9, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v14, v9, Lp1/q;->S:Z

    if-eqz v14, :cond_1a

    invoke-virtual {v9, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_1a
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v9, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v9, Lp1/q;->S:Z

    if-nez v1, :cond_1b

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    :cond_1b
    invoke-static {v5, v9, v5, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1c
    invoke-static {v9, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v1, 0x32

    int-to-float v1, v1

    const/4 v2, 0x0

    move-object/from16 v4, p1

    const/4 v3, 0x2

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/foundation/layout/d;->v(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v5, v1, v2, v3}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lh91/b;->j()I

    move-result v2

    sget-object v6, Lhy0/i0;->EMPTY:Lhy0/i0;

    and-int/lit16 v3, v0, 0x380

    const/16 v5, 0x100

    if-ne v3, v5, :cond_1d

    const/4 v3, 0x1

    goto :goto_f

    :cond_1d
    move v3, v10

    :goto_f
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v14, v22

    if-nez v3, :cond_1e

    if-ne v5, v14, :cond_1f

    :cond_1e
    new-instance v5, Ldk2/i;

    const/16 v3, 0x8

    invoke-direct {v5, v15, v3}, Ldk2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v14, :cond_20

    new-instance v3, Ldw1/a;

    const/16 v7, 0x9

    invoke-direct {v3, v7}, Ldw1/a;-><init>(I)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    move-object v8, v3

    check-cast v8, Lc93/m;

    shl-int/lit8 v3, v0, 0xc

    const/high16 v7, 0x70000

    and-int/2addr v3, v7

    const v7, 0x6180006

    or-int/2addr v3, v7

    sget v7, Lh91/b;->k:I

    shl-int/lit8 v7, v7, 0x15

    or-int/2addr v3, v7

    const/high16 v7, 0x1c00000

    shl-int/lit8 v0, v0, 0x15

    and-int/2addr v0, v7

    or-int/2addr v0, v3

    const/16 v11, 0xa

    move/from16 v18, v10

    move v10, v0

    move-object v0, v1

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object/from16 v7, p0

    move-object/from16 v16, v15

    const/high16 v12, 0x3f800000    # 1.0f

    move-object v15, v4

    move-object v4, v5

    move-object/from16 v5, v20

    invoke-static/range {v0 .. v11}, Lv81/c;->j(Landroidx/compose/ui/Modifier;IIFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lhy0/i0;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {p0 .. p0}, Lh91/b;->l()Z

    move-result v0

    if-eqz v0, :cond_23

    const v0, -0xa3c5132

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-static {v12, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->H:Lb2/m;

    invoke-virtual {v13, v0, v1}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v14, :cond_21

    sget-object v0, Lek2/a$b;->w:Lek2/a$b;

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    const/4 v10, 0x0

    invoke-interface {v0, v9, v10}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v2

    const v0, 0x3dcccccd    # 0.1f

    invoke-static {v0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v4

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v14, :cond_22

    sget-object v0, Lek2/a$c;->w:Lek2/a$c;

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_22
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    invoke-interface {v0, v9, v10}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v2

    const/4 v7, 0x0

    move-object v6, v9

    invoke-static/range {v1 .. v7}, Lg1/v4;->c(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    :goto_10
    const/4 v0, 0x1

    goto :goto_11

    :cond_23
    const/4 v10, 0x0

    const v0, -0xa36f192

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    goto :goto_10

    :goto_11
    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    move-object/from16 v3, v16

    move-object/from16 v2, v20

    move-object/from16 v4, v21

    goto :goto_12

    :cond_24
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v2, v5

    move-object v3, v8

    move-object v4, v13

    :goto_12
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_25

    new-instance v0, La81/f;

    const/16 v7, 0x14

    move-object/from16 v1, p0

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, La81/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_25
    return-void
.end method

.method private static final i(I)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Ljava/time/LocalDate;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final l(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "argument"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lkb1/e;

    if-eqz v0, :cond_0

    check-cast p1, Lkb1/e;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lkb1/e;->d()Ljava/time/LocalDate;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lh91/b;I)Lg51/c;
    .locals 3

    const-string v0, "calendar"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Lkb1/h;->c(Lh91/b;IZILjava/lang/Object;)Lg51/c;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Lh91/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lek2/a;->h(Lh91/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
