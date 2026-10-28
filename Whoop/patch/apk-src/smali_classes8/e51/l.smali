.class public abstract Le51/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u001aK\u0010\u000c\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0014\u0008\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0018\u00b2\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002\u00b2\u0006\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00158\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u0017\u001a\u00020\u000e8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Le51/n;",
        "state",
        "Ll0/k1;",
        "contentPadding",
        "Ln0/u;",
        "listState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "i",
        "(Landroidx/compose/ui/Modifier;Le51/n;Ll0/k1;Ln0/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "C",
        "(Ln0/u;)I",
        "v",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "isUserScrolling",
        "",
        "selectedTagId",
        "selectedIndex",
        "design_release"
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
.method public static final synthetic A(Lp1/c1;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Le51/l;->s(Lp1/c1;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic B(Ln0/u;)I
    .locals 0

    invoke-static {p0}, Le51/l;->C(Ln0/u;)I

    move-result p0

    return p0
.end method

.method private static final C(Ln0/u;)I
    .locals 4

    invoke-virtual {p0}, Ln0/u;->h()Ln0/n;

    move-result-object v0

    iget v1, v0, Ln0/n;->m:I

    iget v2, v0, Ln0/n;->l:I

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x3

    add-int/2addr v1, v2

    iget-object v0, v0, Ln0/n;->k:Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ln0/g;

    check-cast v3, Ln0/o;

    iget v3, v3, Ln0/o;->o:I

    if-gt v3, v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    check-cast v2, Ln0/g;

    if-eqz v2, :cond_2

    check-cast v2, Ln0/o;

    iget p0, v2, Ln0/o;->a:I

    return p0

    :cond_2
    iget-object p0, p0, Ln0/u;->e:Ll2/a;

    iget-object p0, p0, Ll2/a;->b:Ljava/lang/Object;

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    return p0
.end method

.method public static synthetic a(Le51/n;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Le51/l;->m(Le51/n;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Le51/l;->j(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Le51/l;->w(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Le51/n;Lbc3/c0;Lp1/c1;Lp1/c1;Ln0/u;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Le51/l;->k(Lkotlin/jvm/functions/Function1;Le51/n;Lbc3/c0;Lp1/c1;Lp1/c1;Ln0/u;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Le51/n;Lp1/c1;)I
    .locals 0

    invoke-static {p0, p1}, Le51/l;->t(Le51/n;Lp1/c1;)I

    move-result p0

    return p0
.end method

.method public static synthetic f(Li3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Le51/l;->l(Li3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Le51/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Le51/l;->n(Le51/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Landroidx/compose/ui/Modifier;Le51/n;Ll0/k1;Ln0/u;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Le51/l;->o(Landroidx/compose/ui/Modifier;Le51/n;Ll0/k1;Ln0/u;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Landroidx/compose/ui/Modifier;Le51/n;Ll0/k1;Ln0/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Le51/n;",
            "Ll0/k1;",
            "Ln0/u;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v8, p6

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p5

    check-cast v9, Lp1/q;

    const v0, 0x773888b8

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p7, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v8, 0x6

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v8, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v8

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v3, v8

    :goto_1
    and-int/lit8 v4, v8, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, p7, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v5, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v5, v8, 0x180

    if-nez v5, :cond_5

    move-object/from16 v5, p2

    invoke-virtual {v9, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_3

    :cond_7
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v3, v6

    :goto_4
    and-int/lit16 v6, v8, 0xc00

    const/16 v7, 0x800

    if-nez v6, :cond_a

    and-int/lit8 v6, p7, 0x8

    if-nez v6, :cond_8

    move-object/from16 v6, p3

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    move v11, v7

    goto :goto_5

    :cond_8
    move-object/from16 v6, p3

    :cond_9
    const/16 v11, 0x400

    :goto_5
    or-int/2addr v3, v11

    goto :goto_6

    :cond_a
    move-object/from16 v6, p3

    :goto_6
    and-int/lit8 v11, p7, 0x10

    if-eqz v11, :cond_c

    or-int/lit16 v3, v3, 0x6000

    :cond_b
    move-object/from16 v13, p4

    goto :goto_8

    :cond_c
    and-int/lit16 v13, v8, 0x6000

    if-nez v13, :cond_b

    move-object/from16 v13, p4

    invoke-virtual {v9, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_d

    const/16 v14, 0x4000

    goto :goto_7

    :cond_d
    const/16 v14, 0x2000

    :goto_7
    or-int/2addr v3, v14

    :goto_8
    and-int/lit16 v14, v3, 0x2493

    const/16 v15, 0x2492

    const/4 v6, 0x0

    if-eq v14, v15, :cond_e

    const/4 v14, 0x1

    goto :goto_9

    :cond_e
    move v14, v6

    :goto_9
    and-int/lit8 v15, v3, 0x1

    invoke-virtual {v9, v15, v14}, Lp1/q;->U(IZ)Z

    move-result v14

    if-eqz v14, :cond_35

    invoke-virtual {v9}, Lp1/q;->Z()V

    and-int/lit8 v14, v8, 0x1

    const/4 v15, 0x3

    move/from16 v16, v14

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-eqz v16, :cond_11

    invoke-virtual {v9}, Lp1/q;->C()Z

    move-result v16

    if-eqz v16, :cond_f

    goto :goto_b

    :cond_f
    invoke-virtual {v9}, Lp1/q;->X()V

    and-int/lit8 v0, p7, 0x8

    if-eqz v0, :cond_10

    and-int/lit16 v3, v3, -0x1c01

    :cond_10
    move-object/from16 v4, p3

    move-object v11, v1

    move-object/from16 v20, v5

    :goto_a
    move-object v1, v13

    move v13, v3

    goto :goto_f

    :cond_11
    :goto_b
    if-eqz v0, :cond_12

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_c

    :cond_12
    move-object v0, v1

    :goto_c
    if-eqz v4, :cond_13

    const/4 v1, 0x0

    invoke-static {v1, v1, v15}, Landroidx/compose/foundation/layout/a;->a(FFI)Ll0/l1;

    move-result-object v1

    goto :goto_d

    :cond_13
    move-object v1, v5

    :goto_d
    and-int/lit8 v4, p7, 0x8

    if-eqz v4, :cond_14

    invoke-static {v6, v6, v9, v15}, Ln0/x;->a(IILandroidx/compose/runtime/Composer;I)Ln0/u;

    move-result-object v4

    and-int/lit16 v3, v3, -0x1c01

    goto :goto_e

    :cond_14
    move-object/from16 v4, p3

    :goto_e
    if-eqz v11, :cond_16

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v14, :cond_15

    new-instance v5, Ldo0/c;

    const/16 v11, 0x1b

    invoke-direct {v5, v11}, Ldo0/c;-><init>(I)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v11, v0

    move-object/from16 v20, v1

    move v13, v3

    move-object v1, v5

    goto :goto_f

    :cond_16
    move-object v11, v0

    move-object/from16 v20, v1

    goto :goto_a

    :goto_f
    invoke-virtual {v9}, Lp1/q;->r()V

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v14, :cond_17

    invoke-static {v9}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v0

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object v3, v0

    check-cast v3, Lbc3/c0;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v14, :cond_18

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v0, Lp1/c1;

    invoke-virtual {v2}, Le51/n;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v9, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_19

    if-ne v6, v14, :cond_1c

    :cond_19
    invoke-virtual {v2}, Le51/n;->f()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1b

    invoke-virtual {v2}, Le51/n;->g()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le51/p;

    if-eqz v5, :cond_1a

    invoke-virtual {v5}, Le51/p;->b()Ljava/lang/String;

    move-result-object v5

    goto :goto_10

    :cond_1a
    const/4 v5, 0x0

    :cond_1b
    :goto_10
    invoke-static {v5}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    move-object v5, v6

    check-cast v5, Lp1/c1;

    invoke-virtual {v2}, Le51/n;->g()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v6, :cond_1d

    if-ne v15, v14, :cond_1e

    :cond_1d
    new-instance v6, Le51/k;

    const/4 v15, 0x1

    invoke-direct {v6, v2, v5, v15}, Le51/k;-><init>(Le51/n;Ljava/lang/Object;I)V

    invoke-static {v6}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v15

    invoke-virtual {v9, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v15, Lp1/t2;

    invoke-virtual {v2}, Le51/n;->c()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v2}, Le51/n;->e()Le51/m;

    move-result-object v10

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v19

    and-int/lit16 v12, v13, 0x1c00

    xor-int/lit16 v12, v12, 0xc00

    if-le v12, v7, :cond_20

    invoke-virtual {v9, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v21

    if-nez v21, :cond_1f

    goto :goto_11

    :cond_1f
    move-object/from16 p2, v0

    goto :goto_12

    :cond_20
    :goto_11
    move-object/from16 p2, v0

    and-int/lit16 v0, v13, 0xc00

    if-ne v0, v7, :cond_21

    :goto_12
    const/4 v0, 0x1

    goto :goto_13

    :cond_21
    const/4 v0, 0x0

    :goto_13
    or-int v0, v19, v0

    invoke-virtual {v9, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    or-int v0, v0, v19

    const v19, 0xe000

    move-object/from16 p3, v15

    and-int v15, v13, v19

    const/16 v7, 0x4000

    if-ne v15, v7, :cond_22

    const/4 v7, 0x1

    goto :goto_14

    :cond_22
    const/4 v7, 0x0

    :goto_14
    or-int/2addr v0, v7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_24

    if-ne v7, v14, :cond_23

    goto :goto_15

    :cond_23
    move-object/from16 v22, v3

    move-object v0, v7

    move-object v7, v6

    move-object v6, v4

    move-object/from16 v4, p2

    goto :goto_16

    :cond_24
    :goto_15
    new-instance v0, Le51/l$a;

    move-object v7, v6

    const/4 v6, 0x0

    move-object/from16 v22, v3

    move-object v3, v1

    move-object v1, v2

    move-object v2, v4

    move-object/from16 v4, p2

    invoke-direct/range {v0 .. v6}, Le51/l$a;-><init>(Le51/n;Ln0/u;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lq83/d;)V

    move-object v6, v2

    move-object v2, v1

    move-object v1, v3

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_16
    check-cast v0, Lc93/m;

    invoke-static {v6, v7, v10, v0, v9}, Lp1/x;->i(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    const/4 v10, 0x0

    invoke-static {v3, v7, v9, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v7, v9, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    move-object/from16 p4, v1

    iget-boolean v1, v9, Lp1/q;->S:Z

    if-eqz v1, :cond_25

    invoke-virtual {v9, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_17

    :cond_25
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_17
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v9, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v9, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v9, Lp1/q;->S:Z

    if-nez v3, :cond_26

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_27

    :cond_26
    invoke-static {v7, v9, v7, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_27
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v9, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Le51/n;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v8, 0x1

    if-le v0, v8, :cond_2f

    const v0, -0x4ae870f0

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    const v0, -0xaaca381

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Le51/n;->g()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v10, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v3, 0x6

    if-eqz v1, :cond_28

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le51/p;

    new-instance v7, Lm81/g;

    invoke-virtual {v1}, Le51/p;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Le51/p;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move-object/from16 v21, v0

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v9, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v0

    const/4 v3, 0x0

    invoke-direct {v7, v8, v3, v1, v0}, Lm81/g;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lb91/a;)V

    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v21

    const/4 v8, 0x1

    goto :goto_18

    :cond_28
    const/4 v1, 0x0

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    invoke-static/range {p3 .. p3}, Le51/l;->u(Lp1/t2;)I

    move-result v8

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v9, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v23

    invoke-virtual {v2}, Le51/n;->h()F

    move-result v0

    new-instance v3, Ly3/f;

    invoke-direct {v3, v0}, Ly3/f;-><init>(F)V

    invoke-virtual {v9, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/16 v7, 0x4000

    if-ne v15, v7, :cond_29

    const/16 v16, 0x1

    goto :goto_19

    :cond_29
    move/from16 v16, v1

    :goto_19
    or-int v0, v0, v16

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    or-int v0, v0, v16

    move-object/from16 v1, v22

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v21

    or-int v0, v0, v21

    const/16 v7, 0x800

    if-le v12, v7, :cond_2a

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_2b

    :cond_2a
    and-int/lit16 v12, v13, 0xc00

    if-ne v12, v7, :cond_2c

    :cond_2b
    const/4 v7, 0x1

    goto :goto_1a

    :cond_2c
    const/4 v7, 0x0

    :goto_1a
    or-int/2addr v0, v7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_2e

    if-ne v7, v14, :cond_2d

    goto :goto_1b

    :cond_2d
    move-object/from16 v1, p4

    move-object v12, v3

    const/16 v16, 0x4000

    goto :goto_1c

    :cond_2e
    :goto_1b
    new-instance v0, Lam2/b;

    const/4 v7, 0x5

    move-object v12, v3

    const/16 v16, 0x4000

    move-object v3, v1

    move-object/from16 v1, p4

    invoke-direct/range {v0 .. v7}, Lam2/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lbc3/c0;Lp1/c1;Lp1/c1;Ljava/lang/Object;I)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v7, v0

    :goto_1c
    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x3

    const/16 v18, 0x0

    const/16 v19, 0x30

    move-object v3, v14

    const/4 v14, 0x0

    move v4, v15

    const/4 v15, 0x0

    move-object/from16 v25, v3

    move-object/from16 v16, v7

    move-object/from16 v17, v9

    move-object v9, v10

    move-object v0, v11

    move v3, v13

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v7, 0x1

    move v10, v8

    move-object v13, v12

    move-wide/from16 v11, v23

    const/4 v8, 0x4

    invoke-static/range {v9 .. v19}, Lm81/e;->l(Ljava/util/List;IJLy3/f;Lm81/f;Lm81/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v9, v17

    const/4 v10, 0x0

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    goto :goto_1d

    :cond_2f
    move-object/from16 v1, p4

    move v7, v8

    move-object v0, v11

    move v3, v13

    move-object/from16 v25, v14

    move v4, v15

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v8, 0x4

    const/4 v10, 0x0

    const v11, -0x4ad524cc

    invoke-virtual {v9, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    :goto_1d
    int-to-float v8, v8

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float/2addr v8, v11

    invoke-static {v8}, Ll0/m;->i(F)Ll0/k;

    move-result-object v12

    float-to-double v13, v5

    const-wide/16 v15, 0x0

    cmpl-double v8, v13, v15

    if-lez v8, :cond_30

    goto :goto_1e

    :cond_30
    const-string v8, "invalid weight; must be greater than zero"

    invoke-static {v8}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_1e
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v8, v5, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v5, v8}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/4 v5, 0x3

    int-to-float v5, v5

    mul-float v15, v5, v11

    const/16 v17, 0x0

    const/16 v18, 0xd

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v11, v25

    if-ne v8, v11, :cond_31

    new-instance v8, Ldo0/c;

    const/16 v13, 0x1c

    invoke-direct {v8, v13}, Ldo0/c;-><init>(I)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_31
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v10, v8}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    const/16 v13, 0x4000

    if-ne v4, v13, :cond_32

    move v10, v7

    :cond_32
    or-int v4, v8, v10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_33

    if-ne v8, v11, :cond_34

    :cond_33
    new-instance v8, Le51/i;

    invoke-direct {v8, v2, v1}, Le51/i;-><init>(Le51/n;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_34
    move-object/from16 v17, v8

    check-cast v17, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v4, v3, 0x6

    and-int/lit8 v4, v4, 0x70

    or-int/lit16 v4, v4, 0x6000

    and-int/lit16 v3, v3, 0x380

    or-int v19, v4, v3

    move-object/from16 v11, v20

    const/16 v20, 0x1e8

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v10, v6

    move-object/from16 v18, v9

    move-object v9, v5

    invoke-static/range {v9 .. v20}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v9, v18

    invoke-virtual {v9, v7}, Lp1/q;->q(Z)V

    move-object v5, v1

    move-object v4, v6

    move-object v3, v11

    move-object v1, v0

    goto :goto_1f

    :cond_35
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object/from16 v4, p3

    move-object v3, v5

    move-object v5, v13

    :goto_1f
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_36

    new-instance v0, La01/f;

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, La01/f;-><init>(Landroidx/compose/ui/Modifier;Le51/n;Ll0/k1;Ln0/u;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_36
    return-void
.end method

.method private static final j(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;Le51/n;Lbc3/c0;Lp1/c1;Lp1/c1;Ln0/u;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "tagId"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-static {p3, v0}, Le51/l;->q(Lp1/c1;Z)V

    invoke-static {p4, p6}, Le51/l;->s(Lp1/c1;Ljava/lang/String;)V

    new-instance p4, Le51/h$b;

    invoke-direct {p4, p6}, Le51/h$b;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, p4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Le51/n;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 p1, 0x0

    move p4, p1

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le51/e;

    invoke-virtual {v0}, Le51/e;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_1
    const/4 p4, -0x1

    :goto_1
    if-ltz p4, :cond_2

    new-instance p0, Le51/l$b;

    const/4 p1, 0x0

    invoke-direct {p0, p5, p4, p3, p1}, Le51/l$b;-><init>(Ln0/u;ILp1/c1;Lq83/d;)V

    const/4 p3, 0x3

    invoke-static {p2, p1, p1, p0, p3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_2

    :cond_2
    invoke-static {p3, p1}, Le51/l;->q(Lp1/c1;Z)V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Li3/z;)Ll83/a0;
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "anchor_selector_lazy_column"

    invoke-static {v0, p0}, Li3/w;->k(Ljava/lang/String;Li3/z;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Le51/n;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 5

    const-string v0, "$this$LazyColumn"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le51/n;->c()Ljava/util/List;

    move-result-object p0

    new-instance v0, Ldo0/c;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Ldo0/c;-><init>(I)V

    sget-object v1, Le51/l$d;->w:Le51/l$d;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    new-instance v3, Le51/l$e;

    invoke-direct {v3, v0, p0}, Le51/l$e;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v0, Le51/l$f;

    invoke-direct {v0, v1, p0}, Le51/l$f;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v1, Le51/l$g;

    invoke-direct {v1, p0, p1}, Le51/l$g;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    new-instance p0, Lx1/b;

    const/4 p1, 0x1

    const v4, 0x2fd4df92

    invoke-direct {p0, v1, p1, v4}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    check-cast p2, Ln0/f;

    invoke-virtual {p2, v2, v3, v0, p0}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Le51/e;)Ljava/lang/Object;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le51/e;->k()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Landroidx/compose/ui/Modifier;Le51/n;Ll0/k1;Ln0/u;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Le51/l;->i(Landroidx/compose/ui/Modifier;Le51/n;Ll0/k1;Ln0/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final q(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final r(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final s(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final t(Le51/n;Lp1/c1;)I
    .locals 4

    invoke-virtual {p0}, Le51/n;->g()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le51/p;

    invoke-virtual {v2}, Le51/p;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Le51/l;->r(Lp1/c1;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    :goto_1
    if-gez v1, :cond_2

    return v0

    :cond_2
    return v1
.end method

.method private static final u(Lp1/t2;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method public static final v(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, 0x459ac3e5

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Le51/l$h;

    invoke-direct {v1}, Le51/l$h;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lcom/whoop/profile/view/edit/preview/a;

    const/16 v1, 0x10

    invoke-direct {v0, p1, v1}, Lcom/whoop/profile/view/edit/preview/a;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final w(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Le51/l;->v(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic x(Lp1/c1;)Z
    .locals 0

    invoke-static {p0}, Le51/l;->p(Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic y(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Le51/l;->q(Lp1/c1;Z)V

    return-void
.end method

.method public static final synthetic z(Lp1/c1;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Le51/l;->r(Lp1/c1;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
