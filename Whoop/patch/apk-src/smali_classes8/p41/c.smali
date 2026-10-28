.class public abstract Lp41/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\"\u0017\u0010\u000e\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0011\u00b2\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lp41/d;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Landroidx/compose/ui/Modifier;Lp41/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "a",
        "Lp41/d;",
        "l",
        "()Lp41/d;",
        "fakeToggleCardButtonState",
        "",
        "isExpanded",
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


# static fields
.field private static final a:Lp41/d;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lp41/d;

    const-string v1, "SEE MORE"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const-string v2, "SEE LESS"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget-object v3, Lgz0/m0;->CARET_DOWN:Lgz0/m0;

    sget-object v4, Lgz0/m0;->CARET_UP:Lgz0/m0;

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-direct/range {v0 .. v6}, Lp41/d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Z)V

    sput-object v0, Lp41/c;->a:Lp41/d;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lp41/c;->h(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp41/d;Lc0/o;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lp41/c;->j(Lp41/d;Lc0/o;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lp41/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lp41/c;->k(Landroidx/compose/ui/Modifier;Lp41/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lc0/q;)Lc0/l0;
    .locals 0

    invoke-static {p0}, Lp41/c;->i(Lc0/q;)Lc0/l0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lp41/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lp41/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, -0xa728a34

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v4, 0x6

    move v5, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v4, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v5, v4

    :goto_1
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit16 v6, v4, 0x180

    const/16 v7, 0x100

    if-nez v6, :cond_6

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    move v6, v7

    goto :goto_3

    :cond_5
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_6
    and-int/lit16 v6, v5, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x0

    const/4 v15, 0x1

    if-eq v6, v8, :cond_7

    move v6, v15

    goto :goto_4

    :cond_7
    move v6, v9

    :goto_4
    and-int/lit8 v8, v5, 0x1

    invoke-virtual {v12, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_12

    if-eqz v0, :cond_8

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_5

    :cond_8
    move-object v0, v1

    :goto_5
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v1, v6, :cond_9

    invoke-virtual {v2}, Lp41/d;->h()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v12, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v1, Lp1/c1;

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v6, :cond_a

    invoke-static {v12}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v8

    :cond_a
    move-object/from16 v17, v8

    check-cast v17, Lj0/i;

    and-int/lit16 v5, v5, 0x380

    if-ne v5, v7, :cond_b

    move v9, v15

    :cond_b
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v9, :cond_c

    if-ne v5, v6, :cond_d

    :cond_c
    new-instance v5, Lbs1/i;

    const/16 v7, 0x1d

    invoke-direct {v5, v3, v1, v7}, Lbs1/i;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object/from16 v21, v5

    check-cast v21, Lc93/a;

    const/16 v22, 0x1c

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, Lb2/e;->K:Lb2/l;

    sget-object v8, Ll0/m;->e:Ll0/h;

    const/16 v9, 0x36

    invoke-static {v8, v7, v12, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v8, v12, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v12, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_e

    invoke-virtual {v12, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_e
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_6
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v12, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v12, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-nez v9, :cond_f

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_10

    :cond_f
    invoke-static {v8, v12, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v12, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1}, Lp41/c;->f(Lp1/c1;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_11

    new-instance v1, Lov2/f;

    const/16 v6, 0x16

    invoke-direct {v1, v6}, Lov2/f;-><init>(I)V

    invoke-virtual {v12, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object v7, v1

    check-cast v7, Lkotlin/jvm/functions/Function1;

    new-instance v1, Las1/j;

    const/4 v6, 0x7

    invoke-direct {v1, v2, v6}, Las1/j;-><init>(Ljava/lang/Object;I)V

    const v6, -0x4a4cba0d

    invoke-static {v6, v12, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    const v13, 0x186180

    const/16 v14, 0x2a

    const/4 v6, 0x0

    const/4 v8, 0x0

    const-string v9, "content_animation"

    const/4 v10, 0x0

    invoke-static/range {v5 .. v14}, Landroidx/compose/animation/a;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/n;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    move-object v1, v0

    goto :goto_7

    :cond_12
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_13

    new-instance v0, Lot1/f;

    const/16 v6, 0xb

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lot1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final f(Lp1/c1;)Z
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

.method private static final g(Lp1/c1;Z)V
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

.method private static final h(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-static {p1}, Lp41/c;->f(Lp1/c1;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p1, v0}, Lp41/c;->g(Lp1/c1;Z)V

    new-instance v0, Lp41/a;

    invoke-static {p1}, Lp41/c;->f(Lp1/c1;)Z

    move-result p1

    invoke-direct {v0, p1}, Lp41/a;-><init>(Z)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lc0/q;)Lc0/l0;
    .locals 5

    const-string v0, "$this$AnimatedContent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p0, 0xc8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-static {p0, v0, v1, v2}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v3

    const/4 v4, 0x2

    invoke-static {v3, v4}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v3

    invoke-static {p0, v0, v1, v2}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object p0

    invoke-static {p0, v4}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object p0

    invoke-static {v3, p0}, Landroidx/compose/animation/a;->c(Lc0/d1;Lc0/f1;)Lc0/l0;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lp41/d;Lc0/o;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 35

    move-object/from16 v5, p3

    const-string v0, "$this$AnimatedContent"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lb2/e;->K:Lb2/l;

    const/4 v1, 0x1

    int-to-float v2, v1

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    const/16 v3, 0x36

    invoke-static {v2, v0, v5, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    move-object v2, v5

    check-cast v2, Lp1/q;

    iget-wide v3, v2, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    iget-object v9, v2, Lp1/q;->a:Lhb3/a0;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v9, v2, Lp1/q;->S:Z

    if-eqz v9, :cond_0

    invoke-virtual {v2, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_0
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v5, v8, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v5, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v4, v2, Lp1/q;->S:Z

    if-nez v4, :cond_1

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    :cond_1
    invoke-static {v3, v2, v3, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v5, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz p2, :cond_3

    invoke-virtual/range {p0 .. p0}, Lp41/d;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_1

    :cond_3
    invoke-virtual/range {p0 .. p0}, Lp41/d;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    :goto_1
    const/4 v3, 0x0

    invoke-static {v0, v5, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v4, 0x6

    invoke-virtual {v3, v5, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->k()Lb91/a;

    move-result-object v20

    invoke-virtual {v3, v5, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v7

    new-instance v12, Lw3/k;

    const/4 v9, 0x3

    invoke-direct {v12, v9}, Lw3/k;-><init>(I)V

    const/16 v24, 0x0

    const v25, 0x2fdfa

    move v9, v1

    const/4 v1, 0x0

    move v10, v4

    const-wide/16 v4, 0x0

    move-object v11, v6

    const/4 v6, 0x0

    move-object v13, v3

    move-wide/from16 v33, v7

    move-object v8, v2

    move-wide/from16 v2, v33

    const/4 v7, 0x0

    move-object v14, v8

    const/4 v8, 0x0

    move/from16 v16, v9

    move v15, v10

    const-wide/16 v9, 0x0

    move-object/from16 v17, v11

    const/4 v11, 0x0

    move-object/from16 v19, v13

    move-object/from16 v18, v14

    const-wide/16 v13, 0x0

    move/from16 v21, v15

    const/4 v15, 0x0

    move/from16 v22, v16

    const/16 v16, 0x0

    move-object/from16 v23, v17

    const/16 v17, 0x0

    move-object/from16 v26, v18

    const/16 v18, 0x0

    move-object/from16 v27, v19

    const/16 v19, 0x0

    move/from16 v28, v21

    const/16 v21, 0x0

    move-object/from16 v29, v23

    const/16 v23, 0x0

    move-object/from16 v22, p3

    move-object/from16 v30, v26

    move-object/from16 v31, v27

    move-object/from16 v32, v29

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v22

    if-eqz p2, :cond_4

    invoke-virtual/range {p0 .. p0}, Lp41/d;->f()Lgz0/m0;

    move-result-object v0

    :goto_2
    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    const/4 v15, 0x6

    goto :goto_3

    :cond_4
    invoke-virtual/range {p0 .. p0}, Lp41/d;->c()Lgz0/m0;

    move-result-object v0

    goto :goto_2

    :goto_3
    invoke-static {v0, v5, v15}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    move-object/from16 v13, v31

    invoke-virtual {v13, v5, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v3

    const-wide/high16 v1, 0x400c000000000000L    # 3.5

    double-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float/2addr v1, v2

    move-object/from16 v11, v32

    invoke-static {v1, v11}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v6, 0x1b0

    const/4 v7, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v7}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v14, v30

    const/4 v9, 0x1

    invoke-virtual {v14, v9}, Lp1/q;->q(Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final k(Landroidx/compose/ui/Modifier;Lp41/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lp41/c;->e(Landroidx/compose/ui/Modifier;Lp41/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final l()Lp41/d;
    .locals 1

    sget-object v0, Lp41/c;->a:Lp41/d;

    return-object v0
.end method
