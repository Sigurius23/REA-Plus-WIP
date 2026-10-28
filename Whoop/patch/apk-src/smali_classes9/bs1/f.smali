.class public abstract Lbs1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u001aK\u0010\u000c\u001a\u00020\u00072\u0010\u0010\u0003\u001a\u000c\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\tH\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lh91/b;",
        "Lcom/whoop/design/models/calendar/CalendarDateModel;",
        "Lcom/whoop/design/domain/calendar/CalendarDomainState;",
        "calendarDomainState",
        "",
        "showCalendar",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "hideCalendar",
        "Lkotlin/Function1;",
        "",
        "onEvent",
        "h",
        "(Lh91/b;ZLc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "journal_release"
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
.method public static synthetic a(ILy3/c;)I
    .locals 0

    invoke-static {p1, p0}, Lbs1/f;->i(Ly3/c;I)I

    move-result p0

    return p0
.end method

.method public static synthetic b(Lh91/b;ZLc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lbs1/f;->o(Lh91/b;ZLc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc93/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2}, Lbs1/f;->l(Lkotlin/jvm/functions/Function1;Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lbs1/f;->k(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lc93/a;Lh91/b;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lbs1/f;->j(Lc93/a;Lh91/b;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lh91/b;I)Lg51/c;
    .locals 0

    invoke-static {p0, p1}, Lbs1/f;->n(Lh91/b;I)Lg51/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(ILkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lbs1/f;->m(Lkotlin/jvm/functions/Function1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lh91/b;ZLc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh91/b<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;Z",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    const-string v0, "calendarDomainState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hideCalendar"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p4

    check-cast v12, Lp1/q;

    const v0, 0x33460ac1

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v5, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v12, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v12, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v5

    goto :goto_2

    :cond_2
    move v0, v5

    :goto_2
    and-int/lit8 v1, v5, 0x30

    move/from16 v2, p1

    if-nez v1, :cond_4

    invoke-virtual {v12, v2}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x20

    goto :goto_3

    :cond_3
    const/16 v1, 0x10

    :goto_3
    or-int/2addr v0, v1

    :cond_4
    and-int/lit16 v1, v5, 0x180

    if-nez v1, :cond_6

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    const/16 v1, 0x100

    goto :goto_4

    :cond_5
    const/16 v1, 0x80

    :goto_4
    or-int/2addr v0, v1

    :cond_6
    and-int/lit16 v1, v5, 0xc00

    if-nez v1, :cond_8

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    const/16 v1, 0x800

    goto :goto_5

    :cond_7
    const/16 v1, 0x400

    :goto_5
    or-int/2addr v0, v1

    :cond_8
    and-int/lit16 v1, v0, 0x493

    const/16 v6, 0x492

    const/4 v7, 0x1

    if-eq v1, v6, :cond_9

    move v1, v7

    goto :goto_6

    :cond_9
    const/4 v1, 0x0

    :goto_6
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v12, v6, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_c

    sget-object v1, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v12, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly3/c;

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_a

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v8, v6, :cond_b

    :cond_a
    new-instance v8, Lbs1/a;

    const/4 v6, 0x0

    invoke-direct {v8, v1, v6}, Lbs1/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v12, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x0

    invoke-static {v1, v8, v7}, Lc0/w0;->p(Ld0/e2;Lkotlin/jvm/functions/Function1;I)Lc0/d1;

    move-result-object v6

    const/16 v8, 0xd

    invoke-static {v1, v1, v8}, Lc0/w0;->d(Ld0/c0;Lkotlin/jvm/functions/Function1;I)Lc0/d1;

    move-result-object v8

    invoke-virtual {v6, v8}, Lc0/c1;->a(Lc0/c1;)Lc0/d1;

    move-result-object v6

    invoke-static {v1, v7}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v7

    invoke-virtual {v6, v7}, Lc0/c1;->a(Lc0/c1;)Lc0/d1;

    move-result-object v8

    const/4 v6, 0x3

    invoke-static {v6, v1}, Lc0/w0;->t(ILkotlin/jvm/functions/Function1;)Lc0/f1;

    move-result-object v7

    const/16 v9, 0xf

    invoke-static {v1, v1, v1, v9}, Lc0/w0;->l(Ld0/c0;Lb2/l;Lkotlin/jvm/functions/Function1;I)Lc0/f1;

    move-result-object v9

    invoke-virtual {v7, v9}, Lc0/e1;->a(Lc0/e1;)Lc0/f1;

    move-result-object v7

    invoke-static {v1, v6}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v1

    invoke-virtual {v7, v1}, Lc0/e1;->a(Lc0/e1;)Lc0/f1;

    move-result-object v9

    new-instance v1, Lbs1/b;

    const/4 v7, 0x0

    invoke-direct {v1, v3, p0, v4, v7}, Lbs1/b;-><init>(Lc93/a;Lh91/b;Lkotlin/jvm/functions/Function1;I)V

    const v7, 0x3804a999

    invoke-static {v7, v12, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    shr-int/2addr v0, v6

    and-int/lit8 v0, v0, 0xe

    const v1, 0x30c00

    or-int v13, v0, v1

    const/16 v14, 0x12

    const/4 v7, 0x0

    const/4 v10, 0x0

    move v6, v2

    invoke-static/range {v6 .. v14}, Landroidx/compose/animation/b;->f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_7

    :cond_c
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_d

    new-instance v0, Lbs1/c;

    const/4 v6, 0x0

    move-object v1, p0

    move/from16 v2, p1

    invoke-direct/range {v0 .. v6}, Lbs1/c;-><init>(Lh91/b;ZLc93/a;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final i(Ly3/c;I)I
    .locals 0

    const/16 p1, 0x28

    int-to-float p1, p1

    invoke-interface {p0, p1}, Ly3/c;->F(F)I

    move-result p0

    neg-int p0, p0

    return p0
.end method

.method private static final j(Lc93/a;Lh91/b;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    const-string v3, "$this$AnimatedVisibility"

    move-object/from16 v4, p3

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "JournalCalendarTag"

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v2, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->u()J

    move-result-wide v8

    sget-object v10, Li2/w0;->a:Li2/v0;

    invoke-static {v3, v8, v9, v10}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    new-instance v12, Lj0/j;

    invoke-direct {v12}, Lj0/j;-><init>()V

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-nez v3, :cond_0

    if-ne v8, v9, :cond_1

    :cond_0
    new-instance v8, Lbs1/d;

    const/4 v3, 0x0

    invoke-direct {v8, v0, v3}, Lbs1/d;-><init>(Lc93/a;I)V

    invoke-virtual {v2, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object/from16 v16, v8

    check-cast v16, Lc93/a;

    const/16 v17, 0x1c

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v11 .. v17}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, Lb2/e;->w:Lb2/m;

    const/4 v11, 0x0

    invoke-static {v8, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v12, v2, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v2, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v15, v2, Lp1/q;->S:Z

    if-eqz v15, :cond_2

    invoke-virtual {v2, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_0
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v2, v15, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v2, v8, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v5, v2, Lp1/q;->S:Z

    if-nez v5, :cond_3

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    :cond_3
    invoke-static {v12, v2, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v2, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v6, v2, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->n()J

    move-result-wide v11

    invoke-static {v4, v11, v12, v10}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v10, Ll0/m;->c:Ll0/g;

    sget-object v11, Lb2/e;->M:Lb2/k;

    const/4 v12, 0x0

    invoke-static {v10, v11, v2, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v11, v2, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v2, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v2}, Lp1/q;->i0()V

    move-object/from16 p5, v6

    iget-boolean v6, v2, Lp1/q;->S:Z

    if-eqz v6, :cond_5

    invoke-virtual {v2, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_5
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_1
    invoke-static {v2, v15, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v2, Lp1/q;->S:Z

    if-nez v6, :cond_6

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    :cond_6
    invoke-static {v11, v2, v11, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    invoke-static {v2, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v19, Lhy0/i0;->JOURNAL:Lhy0/i0;

    invoke-virtual/range {p1 .. p1}, Lh91/b;->j()I

    move-result v15

    invoke-virtual {v2, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_8

    if-ne v5, v9, :cond_9

    :cond_8
    new-instance v5, Lat2/l;

    const/4 v3, 0x2

    invoke-direct {v5, v1, v0, v3}, Lat2/l;-><init>(Lkotlin/jvm/functions/Function1;Lc93/a;I)V

    invoke-virtual {v2, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object/from16 v17, v5

    check-cast v17, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v2, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_a

    if-ne v3, v9, :cond_b

    :cond_a
    new-instance v3, Lbs1/e;

    const/4 v0, 0x0

    invoke-direct {v3, v1, v0}, Lbs1/e;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v2, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object/from16 v18, v3

    check-cast v18, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_c

    new-instance v0, Ln;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Ln;-><init>(I)V

    invoke-virtual {v2, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object/from16 v21, v0

    check-cast v21, Lc93/m;

    sget v0, Lh91/b;->k:I

    shl-int/lit8 v0, v0, 0x15

    const/high16 v1, 0x6180000

    or-int v23, v0, v1

    const/16 v24, 0xb

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    move-object/from16 v20, p1

    move-object/from16 v22, v2

    invoke-static/range {v13 .. v24}, Lv81/c;->j(Landroidx/compose/ui/Modifier;IIFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lhy0/i0;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v0, v22

    invoke-virtual/range {p1 .. p1}, Lh91/b;->l()Z

    move-result v1

    if-eqz v1, :cond_d

    const v1, 0x4e133033    # 6.173524E8f

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    move-object/from16 v1, p5

    invoke-virtual {v1, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->k0()J

    move-result-wide v14

    invoke-virtual {v1, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->k0()J

    move-result-wide v1

    const v3, 0x3dcccccd    # 0.1f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v16

    const/16 v19, 0x6

    move-object/from16 v18, v0

    invoke-static/range {v13 .. v19}, Lg1/v4;->c(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;I)V

    const/4 v12, 0x0

    invoke-virtual {v0, v12}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_d
    const/4 v12, 0x0

    const v1, 0x4e1752cd    # 6.346965E8f

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v12}, Lp1/q;->q(Z)V

    :goto_2
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final k(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lkotlin/jvm/functions/Function1;Lc93/a;Ljava/lang/Object;)Ll83/a0;
    .locals 3

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lkb1/e;

    if-eqz v0, :cond_2

    check-cast p2, Lkb1/e;

    invoke-virtual {p2}, Lkb1/e;->g()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/whoop/design/models/calendar/CalendarDateModel;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lcom/whoop/design/models/calendar/CalendarDateModel;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/design/models/calendar/CalendarDateModel;->getCycleId()Ljava/lang/Long;

    move-result-object v2

    :cond_1
    new-instance v0, Lbs1/g$b;

    invoke-virtual {p2}, Lkb1/e;->d()Ljava/time/LocalDate;

    move-result-object p2

    invoke-virtual {p2}, Ljava/time/LocalDate;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "toString(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v2, p2}, Lbs1/g$b;-><init>(Ljava/lang/Long;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lkotlin/jvm/functions/Function1;I)Ll83/a0;
    .locals 1

    new-instance v0, Lbs1/g$a;

    invoke-direct {v0, p1}, Lbs1/g$a;-><init>(I)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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

.method private static final o(Lh91/b;ZLc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lbs1/f;->h(Lh91/b;ZLc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
