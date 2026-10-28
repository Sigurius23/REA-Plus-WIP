.class public abstract Lzc1/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "h",
        "(Landroidx/compose/runtime/Composer;I)V",
        "design-showcase_release"
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
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/h0;->o(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lh91/b;I)Lg51/c;
    .locals 0

    invoke-static {p0, p1}, Lzc1/h0;->n(Lh91/b;I)Lg51/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/h0;->k(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/h0;->i(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/h0;->m(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lh91/b;I)Lg51/c;
    .locals 0

    invoke-static {p0, p1}, Lzc1/h0;->j(Lh91/b;I)Lg51/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lh91/b;I)Lg51/c;
    .locals 0

    invoke-static {p0, p1}, Lzc1/h0;->l(Lh91/b;I)Lg51/c;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Landroidx/compose/runtime/Composer;I)V
    .locals 23

    move/from16 v0, p1

    move-object/from16 v10, p0

    check-cast v10, Lp1/q;

    const v1, -0x19c8caba

    invoke-virtual {v10, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {v10, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-ne v2, v14, :cond_1

    sget-object v3, Lwc1/a;->a:Lwc1/a;

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "US"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Lwc1/a;->b(Lwc1/a;Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;ILjava/lang/Object;)Lh91/b;

    move-result-object v2

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v2, Lp1/c1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v14, :cond_2

    sget-object v15, Lwc1/a;->a:Lwc1/a;

    sget-object v3, Ljava/util/Locale;->GERMANY:Ljava/util/Locale;

    const-string v4, "GERMANY"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v20, 0xe

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v3

    invoke-static/range {v15 .. v21}, Lwc1/a;->b(Lwc1/a;Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;ILjava/lang/Object;)Lh91/b;

    move-result-object v3

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v15, v3

    check-cast v15, Lp1/c1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v14, :cond_3

    sget-object v16, Lwc1/a;->a:Lwc1/a;

    new-instance v3, Ljava/util/Locale;

    const-string v4, "ar"

    const-string v5, "EG"

    invoke-direct {v3, v4, v5}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v21, 0xe

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v17, v3

    invoke-static/range {v16 .. v22}, Lwc1/a;->b(Lwc1/a;Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;ILjava/lang/Object;)Lh91/b;

    move-result-object v3

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v3, Lp1/c1;

    sget-object v4, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v4, v5, v10, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v4, v10, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_4

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_4
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v10, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v10, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v5, v10, Lp1/q;->S:Z

    if-nez v5, :cond_5

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    :cond_5
    invoke-static {v4, v10, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v10, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "US - Sunday Start - Strain"

    const/4 v4, 0x6

    invoke-static {v1, v10, v4}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lh91/b;

    sget-object v7, Lhy0/i0;->STRAIN:Lhy0/i0;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v14, :cond_7

    new-instance v1, Lyb0/e;

    const/16 v5, 0x12

    invoke-direct {v1, v5, v2}, Lyb0/e;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v14, :cond_8

    new-instance v1, Lz6/d;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lz6/d;-><init>(I)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v9, v1

    check-cast v9, Lc93/m;

    sget v1, Lh91/b;->k:I

    shl-int/lit8 v1, v1, 0x15

    const v2, 0x6186000

    or-int v11, v1, v2

    const/16 v12, 0x2f

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object/from16 v16, v3

    const/4 v3, 0x0

    move/from16 v17, v4

    const/4 v4, 0x0

    move-object/from16 v18, v6

    const/4 v6, 0x0

    move-object/from16 p0, v16

    move-object/from16 v13, v18

    invoke-static/range {v1 .. v12}, Lv81/c;->j(Landroidx/compose/ui/Modifier;IIFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lhy0/i0;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v1, v1

    invoke-static {v1, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v10, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v2, "Germany - Monday Start - Recovery"

    const/4 v3, 0x6

    invoke-static {v2, v10, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v15}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lh91/b;

    sget-object v7, Lhy0/i0;->RECOVERY:Lhy0/i0;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v14, :cond_9

    new-instance v2, Lyb0/e;

    const/16 v3, 0x13

    invoke-direct {v2, v3, v15}, Lyb0/e;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v5, v2

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v14, :cond_a

    new-instance v2, Lz6/d;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Lz6/d;-><init>(I)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v9, v2

    check-cast v9, Lc93/m;

    const/16 v12, 0x2f

    move v2, v1

    const/4 v1, 0x0

    move v3, v2

    const/4 v2, 0x0

    move v4, v3

    const/4 v3, 0x0

    move v6, v4

    const/4 v4, 0x0

    move v15, v6

    const/4 v6, 0x0

    invoke-static/range {v1 .. v12}, Lv81/c;->j(Landroidx/compose/ui/Modifier;IIFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lhy0/i0;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v15, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v10, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v1, "Egypt - Saturday Start - Sleep"

    const/4 v3, 0x6

    invoke-static {v1, v10, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-interface/range {p0 .. p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lh91/b;

    sget-object v7, Lhy0/i0;->SLEEP:Lhy0/i0;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v14, :cond_b

    new-instance v1, Lyb0/e;

    const/16 v2, 0x14

    move-object/from16 v3, p0

    invoke-direct {v1, v2, v3}, Lyb0/e;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v14, :cond_c

    new-instance v1, Lz6/d;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lz6/d;-><init>(I)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v9, v1

    check-cast v9, Lc93/m;

    const/16 v12, 0x2f

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v12}, Lv81/c;->j(Landroidx/compose/ui/Modifier;IIFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lhy0/i0;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-static {v13, v15, v10, v1}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    goto :goto_2

    :cond_d
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_e

    new-instance v2, Lzc1/j;

    const/16 v3, 0x12

    invoke-direct {v2, v0, v3}, Lzc1/j;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final i(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 13

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lkb1/e;

    if-eqz v0, :cond_0

    check-cast p1, Lkb1/e;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lh91/b;

    invoke-virtual {p1}, Lkb1/e;->d()Ljava/time/LocalDate;

    move-result-object v4

    const/16 v11, 0x1fb

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v1 .. v12}, Lh91/b;->b(Lh91/b;Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/Map;IZLjava/util/List;IILjava/lang/Object;)Lh91/b;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lh91/b;I)Lg51/c;
    .locals 3

    const-string v0, "domainState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Lkb1/h;->c(Lh91/b;IZILjava/lang/Object;)Lg51/c;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 13

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lkb1/e;

    if-eqz v0, :cond_0

    check-cast p1, Lkb1/e;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lh91/b;

    invoke-virtual {p1}, Lkb1/e;->d()Ljava/time/LocalDate;

    move-result-object v4

    const/16 v11, 0x1fb

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v1 .. v12}, Lh91/b;->b(Lh91/b;Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/Map;IZLjava/util/List;IILjava/lang/Object;)Lh91/b;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lh91/b;I)Lg51/c;
    .locals 3

    const-string v0, "domainState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Lkb1/h;->c(Lh91/b;IZILjava/lang/Object;)Lg51/c;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 13

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lkb1/e;

    if-eqz v0, :cond_0

    check-cast p1, Lkb1/e;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lh91/b;

    invoke-virtual {p1}, Lkb1/e;->d()Ljava/time/LocalDate;

    move-result-object v4

    const/16 v11, 0x1fb

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v1 .. v12}, Lh91/b;->b(Lh91/b;Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/Map;IZLjava/util/List;IILjava/lang/Object;)Lh91/b;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lh91/b;I)Lg51/c;
    .locals 3

    const-string v0, "domainState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Lkb1/h;->c(Lh91/b;IZILjava/lang/Object;)Lg51/c;

    move-result-object p0

    return-object p0
.end method

.method private static final o(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/h0;->h(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
