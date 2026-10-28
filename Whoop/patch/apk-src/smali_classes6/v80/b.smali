.class public abstract Lv80/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a%\u0010\u000c\u001a\u00020\u00042\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0013\u00b2\u0006\u000e\u0010\u000e\u001a\u00020\n8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u0011\u001a\u00020\u000f8\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010\u0012\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lv80/c;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "l",
        "(Lv80/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lkotlin/Function0;",
        "onClick",
        "",
        "buttonText",
        "C",
        "(Lc93/a;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V",
        "passwordValue",
        "",
        "hidePassword",
        "isKeyboardOpen",
        "textFieldFocusedAtLeastOnce",
        "activation_release"
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
.method private static final A(Lp1/t2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
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

.method private static final B(Lp1/c1;)Z
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

.method private static final C(Lc93/a;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object v8, p2

    check-cast v8, Lp1/q;

    const p2, -0x371fbb05

    invoke-virtual {v8, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_1

    invoke-virtual {v8, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v0, p3, 0x30

    if-nez v0, :cond_3

    invoke-virtual {v8, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x20

    goto :goto_2

    :cond_2
    const/16 v0, 0x10

    :goto_2
    or-int/2addr p2, v0

    :cond_3
    and-int/lit8 v0, p2, 0x13

    const/16 v1, 0x12

    if-eq v0, v1, :cond_4

    const/4 v0, 0x1

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    :goto_3
    and-int/lit8 v1, p2, 0x1

    invoke-virtual {v8, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Ld42/f;

    const/4 v1, 0x4

    invoke-direct {v0, p1, v1}, Ld42/f;-><init>(Ljava/lang/String;I)V

    const v1, -0x4e1695e2

    invoke-static {v1, v8, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    and-int/lit8 p2, p2, 0xe

    const/high16 v0, 0x30000000

    or-int v9, p2, v0

    const/16 v10, 0x1fe

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v10}, Ldt/b;->d(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;Lf0/t;Lg1/m1;Ll0/l1;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_5
    move-object v0, p0

    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_6

    new-instance p2, Lcp0/i;

    invoke-direct {p2, p3, p1, v0}, Lcp0/i;-><init>(ILjava/lang/String;Lc93/a;)V

    iput-object p2, p0, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final D(Ljava/lang/String;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 27

    const-string v0, "$this$TextButton"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v2, p2

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v2, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->k()Lb91/a;

    move-result-object v0

    invoke-virtual {v0}, Lb91/a;->d()Ll3/v0;

    move-result-object v3

    sget-object v4, Li2/t;->b:Li2/s;

    const-wide v0, 0xff0093e7L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    new-instance v5, Li2/x;

    invoke-direct {v5, v0, v1}, Li2/x;-><init>(J)V

    const-wide v0, 0xff4c9bd9L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    new-instance v6, Li2/x;

    invoke-direct {v6, v0, v1}, Li2/x;-><init>(J)V

    const-wide v0, 0xff66bcffL

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    new-instance v7, Li2/x;

    invoke-direct {v7, v0, v1}, Li2/x;-><init>(J)V

    filled-new-array {v5, v6, v7}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const-wide/16 v8, 0x0

    const/16 v10, 0xe

    const-wide/16 v6, 0x0

    invoke-static/range {v4 .. v10}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v4

    const-wide/16 v9, 0x0

    const v11, 0x1fffffe

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v11}, Ll3/v0;->a(Ll3/v0;Li2/t;JLp3/r;Lp3/i;JI)Ll3/v0;

    move-result-object v22

    new-instance v14, Lw3/k;

    const/4 v0, 0x5

    invoke-direct {v14, v0}, Lw3/k;-><init>(I)V

    const/16 v25, 0x0

    const v26, 0xfdfe

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    move-object/from16 v23, v2

    move-object/from16 v2, p0

    invoke-static/range {v2 .. v26}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    move-object/from16 v23, v2

    invoke-virtual/range {v23 .. v23}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final E(Lc93/a;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lv80/b;->C(Lc93/a;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lv80/b;->u(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;Lg2/v;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lv80/b;->p(Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p2, p0}, Lv80/b;->s(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lv80/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lv80/b;->v(Lv80/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lv80/c;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lv80/b;->r(Lkotlin/jvm/functions/Function1;Lv80/c;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lv80/b;->m(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/String;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lv80/b;->D(Ljava/lang/String;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lg2/i;Lu0/p0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lv80/b;->q(Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Li3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lv80/b;->o(Li3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Lv80/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lv80/b;->t(Lkotlin/jvm/functions/Function1;Lv80/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lc93/a;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lv80/b;->E(Lc93/a;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Lv80/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 56
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv80/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p2

    check-cast v11, Lp1/q;

    const v0, 0x31c446f4

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    const/16 v10, 0x20

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v3, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    move v4, v10

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :goto_3
    and-int/lit8 v4, v0, 0x13

    const/16 v12, 0x12

    const/4 v14, 0x0

    if-eq v4, v12, :cond_5

    const/4 v4, 0x1

    goto :goto_4

    :cond_5
    move v4, v14

    :goto_4
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v11, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_2f

    const/16 v15, 0x15

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_6

    new-instance v2, Lv01/k;

    invoke-direct {v2, v15}, Lv01/k;-><init>(I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    goto :goto_5

    :cond_7
    move-object v2, v3

    :goto_5
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_8

    invoke-virtual {v1}, Lv80/c;->j()Ld70/e;

    move-result-object v3

    invoke-virtual {v3}, Ld70/e;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v3, Lp1/c1;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_9

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v5

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v5, Lp1/c1;

    invoke-static {v11, v14}, Lk80/s;->h(Landroidx/compose/runtime/Composer;I)Lp1/t2;

    move-result-object v6

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_a

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lp1/c1;

    move/from16 p2, v12

    sget-object v12, Lb3/v1;->i:Lp1/u2;

    invoke-virtual {v11, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lg2/i;

    invoke-virtual {v1}, Lv80/c;->n()Z

    move-result v16

    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v10, :cond_b

    const/16 v16, 0x1

    goto :goto_6

    :cond_b
    move/from16 v16, v14

    :goto_6
    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    or-int v16, v16, v18

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    const/4 v15, 0x0

    if-nez v16, :cond_c

    if-ne v10, v4, :cond_d

    :cond_c
    new-instance v10, Lv80/b$a;

    invoke-direct {v10, v2, v1, v15}, Lv80/b$a;-><init>(Lkotlin/jvm/functions/Function1;Lv80/c;Lq83/d;)V

    invoke-virtual {v11, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v10, Lc93/m;

    invoke-static {v11, v10, v8}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v8, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v13, Lb2/e;->w:Lb2/m;

    invoke-static {v13, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    iget-wide v8, v11, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v11, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v22, La3/l;->a:La3/k;

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    move-object/from16 v23, v2

    iget-boolean v2, v11, Lp1/q;->S:Z

    if-eqz v2, :cond_e

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_e
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_7
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v11, v2, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v11, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    move-object/from16 v24, v3

    iget-boolean v3, v11, Lp1/q;->S:Z

    if-nez v3, :cond_f

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v25, v4

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_10

    goto :goto_8

    :cond_f
    move-object/from16 v25, v4

    :goto_8
    invoke-static {v8, v11, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v11, v3, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v26

    const/4 v8, 0x2

    int-to-float v4, v8

    const/16 v15, 0x8

    int-to-float v15, v15

    mul-float v27, v4, v15

    const/4 v4, 0x7

    int-to-float v4, v4

    mul-float v28, v4, v15

    const/16 v30, 0x0

    const/16 v31, 0x8

    move/from16 v29, v27

    invoke-static/range {v26 .. v31}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object/from16 v21, v5

    move-object/from16 v26, v6

    move/from16 v32, v27

    const/4 v5, 0x0

    const/4 v8, 0x1

    invoke-static {v5, v11, v8}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v6

    const/16 v8, 0xe

    invoke-static {v4, v6, v8}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Ll0/m;->d:Ll0/g;

    sget-object v6, Lb2/e;->M:Lb2/k;

    move/from16 v27, v15

    const/4 v15, 0x6

    invoke-static {v5, v6, v11, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    move-object v6, v9

    iget-wide v8, v11, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v11, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v11}, Lp1/q;->i0()V

    move/from16 v29, v15

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_11

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_11
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v11, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v11, Lp1/q;->S:Z

    if-nez v2, :cond_12

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    :cond_12
    invoke-static {v8, v11, v8, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v11, v3, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {v26 .. v26}, Lv80/b;->A(Lp1/t2;)Z

    move-result v2

    if-nez v2, :cond_14

    const v2, 0x2c8aa069    # 3.940005E-12f

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lv80/c;->i()Lkd1/o;

    move-result-object v2

    invoke-virtual {v1}, Lv80/c;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v1}, Lv80/c;->k()Ljava/lang/String;

    move-result-object v4

    sget v5, Lkd1/o;->a:I

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v6, 0x3

    or-int/2addr v6, v5

    move-object v5, v7

    const/4 v7, 0x0

    move-object v13, v5

    move-object v5, v11

    move-object/from16 v11, v21

    move-object/from16 v8, v23

    move-object/from16 v9, v24

    move-object/from16 v14, v25

    invoke-static/range {v2 .. v7}, Lk80/q;->b(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    const/4 v2, 0x0

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_14
    move-object v13, v7

    move-object v5, v11

    move-object/from16 v11, v21

    move-object/from16 v8, v23

    move-object/from16 v9, v24

    move-object/from16 v14, v25

    const/4 v2, 0x0

    const v3, 0x2c8d92f2

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v1}, Lv80/c;->m()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-static {v13}, Lv80/b;->B(Lp1/c1;)Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-virtual {v1}, Lv80/c;->n()Z

    move-result v3

    if-nez v3, :cond_15

    const v3, 0x2c91e7cd

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v5, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->f()J

    move-result-wide v3

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_15
    const/4 v6, 0x0

    const v3, 0x2c930801

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v6}, Lp1/q;->q(Z)V

    sget-wide v3, Li2/x;->m:J

    :goto_b
    if-eqz v2, :cond_16

    invoke-static {v13}, Lv80/b;->B(Lp1/c1;)Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-virtual {v1}, Lv80/c;->n()Z

    move-result v2

    if-nez v2, :cond_16

    const/4 v2, 0x1

    goto :goto_c

    :cond_16
    const/4 v2, 0x0

    :goto_c
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v14, :cond_17

    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v15, Lx60/b;->Q:I

    const/16 v21, 0xc

    new-instance v7, Lcom/whoop/design/util/TextResource$d$b;

    move/from16 v23, v2

    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v7, v2}, Lcom/whoop/design/util/TextResource$d$b;-><init>(Ljava/lang/Number;)V

    move-wide/from16 v24, v3

    const/4 v2, 0x1

    new-array v3, v2, [Lcom/whoop/design/util/TextResource$d;

    const/16 v22, 0x0

    aput-object v7, v3, v22

    invoke-direct {v6, v15, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(I[Lcom/whoop/design/util/TextResource$d;)V

    invoke-virtual {v5, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_d

    :cond_17
    move/from16 v23, v2

    move-wide/from16 v24, v3

    const/4 v2, 0x1

    const/16 v21, 0xc

    :goto_d
    check-cast v6, Lcom/whoop/design/util/TextResource$b;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v14, :cond_18

    new-instance v3, Lv01/k;

    const/16 v4, 0x16

    invoke-direct {v3, v4}, Lv01/k;-><init>(I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v4, 0x0

    invoke-static {v10, v4, v3}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v14, :cond_19

    new-instance v4, Lq12/c;

    const/16 v7, 0x15

    invoke-direct {v4, v7, v13}, Lq12/c;-><init>(ILp1/c1;)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v4}, Landroidx/compose/ui/focus/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v33

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float v35, v3, v27

    const/16 v37, 0x0

    const/16 v38, 0xd

    const/16 v34, 0x0

    const/16 v36, 0x0

    invoke-static/range {v33 .. v38}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move v7, v3

    invoke-virtual {v1}, Lv80/c;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v9}, Lv80/b;->w(Lp1/c1;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-static {v11}, Lv80/b;->y(Lp1/c1;)Z

    move-result v15

    if-eqz v15, :cond_1a

    new-instance v15, Lq3/s;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    goto :goto_e

    :cond_1a
    sget-object v15, Lq3/f0;->w:Lg40/h2;

    :goto_e
    invoke-static {v9}, Lv80/b;->w(Lp1/c1;)Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v16

    if-lez v16, :cond_1c

    invoke-static {v11}, Lv80/b;->y(Lp1/c1;)Z

    move-result v16

    if-eqz v16, :cond_1c

    const v2, 0x32fd06f5

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/k0;->Z()I

    move-result v34

    mul-float v2, v7, v7

    new-instance v7, Ly3/f;

    invoke-direct {v7, v2}, Ly3/f;-><init>(F)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v14, :cond_1b

    sget-object v2, Lv80/b$b;->w:Lv80/b$b;

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v36

    new-instance v33, Lqz0/c$a;

    const/16 v37, 0x0

    const/16 v38, 0x8

    const/16 v39, 0x0

    move-object/from16 v35, v7

    invoke-direct/range {v33 .. v39}, Lqz0/c$a;-><init>(ILy3/f;Ly81/e;Li2/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x0

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    :goto_f
    move-object/from16 v7, v33

    goto :goto_10

    :cond_1c
    invoke-static {v9}, Lv80/b;->w(Lp1/c1;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1e

    invoke-static {v11}, Lv80/b;->y(Lp1/c1;)Z

    move-result v2

    if-nez v2, :cond_1e

    const v2, 0x32fd2999

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/k0;->f0()I

    move-result v34

    mul-float v2, v7, v7

    new-instance v7, Ly3/f;

    invoke-direct {v7, v2}, Ly3/f;-><init>(F)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v14, :cond_1d

    sget-object v2, Lv80/b$c;->w:Lv80/b$c;

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v36

    new-instance v33, Lqz0/c$a;

    const/16 v37, 0x0

    const/16 v38, 0x8

    const/16 v39, 0x0

    move-object/from16 v35, v7

    invoke-direct/range {v33 .. v39}, Lqz0/c$a;-><init>(ILy3/f;Ly81/e;Li2/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x0

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_1e
    const/4 v2, 0x0

    const v7, 0x2cab70cd

    invoke-virtual {v5, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    const/4 v7, 0x0

    :goto_10
    invoke-virtual {v5, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v17, :cond_20

    if-ne v2, v14, :cond_1f

    goto :goto_11

    :cond_1f
    move-object/from16 v17, v3

    goto :goto_12

    :cond_20
    :goto_11
    new-instance v2, Lb30/l1;

    move-object/from16 v17, v3

    const/16 v3, 0x13

    invoke-direct {v2, v12, v3}, Lb30/l1;-><init>(Lg2/i;I)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_12
    move-object/from16 v34, v2

    check-cast v34, Lkotlin/jvm/functions/Function1;

    new-instance v33, Lu0/q0;

    move-object/from16 v35, v34

    move-object/from16 v36, v34

    move-object/from16 v37, v34

    move-object/from16 v38, v34

    move-object/from16 v39, v34

    invoke-direct/range {v33 .. v39}, Lu0/q0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    const/16 v2, 0x20

    if-ne v0, v2, :cond_21

    const/4 v2, 0x1

    goto :goto_13

    :cond_21
    const/4 v2, 0x0

    :goto_13
    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_22

    if-ne v3, v14, :cond_23

    :cond_22
    new-instance v3, Lre1/k;

    const/16 v2, 0xe

    invoke-direct {v3, v8, v1, v11, v2}, Lre1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_23
    check-cast v3, Lc93/a;

    const/16 v2, 0x20

    if-ne v0, v2, :cond_24

    const/4 v11, 0x1

    goto :goto_14

    :cond_24
    const/4 v11, 0x0

    :goto_14
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_25

    if-ne v12, v14, :cond_26

    :cond_25
    new-instance v12, Lp40/b;

    const/16 v11, 0xa

    invoke-direct {v12, v8, v9, v11}, Lp40/b;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v5, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_26
    move-object/from16 v19, v12

    check-cast v19, Lkotlin/jvm/functions/Function1;

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v11, v9, 0x3

    or-int/lit16 v11, v11, 0xc00

    shl-int/lit8 v9, v9, 0x6

    or-int/2addr v9, v11

    sget v11, Lqz0/c$a;->f:I

    shl-int/lit8 v11, v11, 0xf

    or-int/2addr v9, v11

    sget v11, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v11, v11, 0x12

    or-int/2addr v9, v11

    const/4 v11, 0x0

    const/16 v22, 0x6006

    move-object v12, v10

    move/from16 v10, v23

    const/16 v23, 0x1280

    move-object/from16 v20, v5

    const/16 v18, 0x2

    const/4 v5, 0x7

    move/from16 v26, v21

    move/from16 v21, v9

    const/4 v9, 0x0

    move/from16 v28, v11

    const/4 v11, 0x0

    move-object/from16 v30, v12

    const-string v12, "password_field_tag"

    move-object/from16 v31, v8

    move-object v8, v6

    move-object v6, v15

    const/4 v15, 0x0

    move/from16 v34, v18

    move-object/from16 v18, v3

    move-object/from16 v3, v17

    const/16 v17, 0x7

    move/from16 p1, v0

    move-object v2, v4

    move-object v4, v13

    move-object/from16 v42, v14

    move-wide/from16 v13, v24

    move/from16 v28, v27

    move-object/from16 v0, v30

    move-object/from16 v40, v31

    move-object/from16 v16, v33

    move/from16 v1, v34

    invoke-static/range {v2 .. v23}, Lk80/b;->c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILq3/g0;Lqz0/c;Lcom/whoop/design/util/TextResource;ZZZLjava/lang/String;JLc93/m;Lu0/q0;ILc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v20

    invoke-virtual/range {p0 .. p0}, Lv80/c;->m()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_27

    const v2, 0x2cbccb40

    move/from16 v4, v32

    invoke-static {v5, v2, v0, v4, v5}, Lte0/d;->z(Lp1/q;ILb2/t;FLp1/q;)V

    invoke-virtual/range {p0 .. p0}, Lv80/c;->m()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v6, 0x0

    invoke-static {v2, v3, v5, v6, v1}, Leo0/c;->h(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, v6}, Lp1/q;->q(Z)V

    goto :goto_15

    :cond_27
    move/from16 v4, v32

    const/4 v6, 0x0

    const v1, 0x2cbfdf92

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v6}, Lp1/q;->q(Z)V

    :goto_15
    invoke-virtual/range {p0 .. p0}, Lv80/c;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_2b

    invoke-virtual/range {p0 .. p0}, Lv80/c;->f()Lcom/whoop/activation/domain/models/ActivationFlowCtaDestinations;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/activation/domain/models/ActivationFlowCtaDestinations;->getShouldPopulateCta()Z

    move-result v1

    if-eqz v1, :cond_2b

    const v1, 0x2cc1ae83

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    move/from16 v1, p1

    const/16 v2, 0x20

    if-ne v1, v2, :cond_28

    const/4 v13, 0x1

    :goto_16
    move-object/from16 v2, p0

    goto :goto_17

    :cond_28
    move v13, v6

    goto :goto_16

    :goto_17
    invoke-virtual {v5, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v3, v13

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_2a

    move-object/from16 v3, v42

    if-ne v7, v3, :cond_29

    goto :goto_18

    :cond_29
    move-object/from16 v8, v40

    goto :goto_19

    :cond_2a
    move-object/from16 v3, v42

    :goto_18
    new-instance v7, Lui0/q;

    move-object/from16 v8, v40

    const/16 v9, 0xc

    invoke-direct {v7, v9, v8, v2}, Lui0/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_19
    check-cast v7, Lc93/a;

    invoke-virtual {v2}, Lv80/c;->g()Ljava/lang/String;

    move-result-object v9

    invoke-static {v7, v9, v5, v6}, Lv80/b;->C(Lc93/a;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v6}, Lp1/q;->q(Z)V

    :goto_1a
    const/4 v7, 0x6

    goto :goto_1b

    :cond_2b
    move-object/from16 v2, p0

    move/from16 v1, p1

    move-object/from16 v8, v40

    move-object/from16 v3, v42

    const v7, 0x2ccc3992

    invoke-virtual {v5, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v6}, Lp1/q;->q(Z)V

    goto :goto_1a

    :goto_1b
    int-to-float v7, v7

    mul-float v21, v7, v28

    const/16 v24, 0x0

    const/16 v25, 0x8

    move/from16 v23, v21

    move-object/from16 v20, v0

    move/from16 v22, v4

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v12, v20

    move/from16 v27, v22

    invoke-virtual {v2}, Lv80/c;->e()Ljava/lang/String;

    move-result-object v30

    sget-object v2, Liz0/l;->a:Liz0/l;

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v4, v5, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->b1()J

    move-result-wide v9

    invoke-virtual {v4, v5, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->b1()J

    move-result-wide v13

    invoke-virtual {v4, v5, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->b1()J

    move-result-wide v15

    invoke-static {v4, v5, v7}, Lih0/d0;->r(Lx81/d;Lp1/q;I)Ll3/v0;

    move-result-object v40

    const/16 v53, 0x0

    const v54, 0xff7fff

    const-wide/16 v41, 0x0

    const-wide/16 v43, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const-wide/16 v47, 0x0

    const/16 v49, 0x3

    const-wide/16 v50, 0x0

    const/16 v52, 0x0

    invoke-static/range {v40 .. v54}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v4

    sget v7, Liz0/l;->b:I

    shl-int/lit8 v26, v7, 0xf

    move/from16 v32, v27

    const/16 v27, 0x7fd8

    move-object/from16 v31, v8

    move-wide v11, v9

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    move/from16 v22, v6

    move-wide v6, v13

    const/4 v13, 0x0

    move-object/from16 v42, v3

    move-object v3, v4

    move-object/from16 v24, v5

    move-wide v4, v15

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v43, v22

    const/16 v22, 0x0

    move-object/from16 v25, v23

    const/16 v23, 0x0

    move-object/from16 v33, v25

    const/16 v25, 0x0

    move-object/from16 p1, v0

    move/from16 v0, v32

    move-object/from16 v55, v42

    move/from16 v32, v1

    move-object/from16 v1, v33

    invoke-virtual/range {v2 .. v27}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v5

    move-object/from16 v20, v24

    sget v2, Liz0/m;->p:I

    shl-int/lit8 v12, v2, 0x9

    const/16 v13, 0x1f4

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v3, p1

    move-object/from16 v11, v20

    move-object/from16 v2, v30

    invoke-static/range {v2 .. v13}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    move-object v5, v11

    const/16 v2, 0xd

    int-to-float v2, v2

    mul-float v2, v2, v28

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v5, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v10, 0x1

    invoke-virtual {v5, v10}, Lp1/q;->q(Z)V

    new-instance v11, Lny0/o;

    sget-object v12, Lny0/q$a;->f:Lny0/q$a;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/k0;->B()I

    move-result v13

    const/16 v22, 0x3fc

    const/16 v23, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v11 .. v23}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v2, Lb2/e;->y:Lb2/m;

    sget-object v3, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v3, v1, v2}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget v0, Lx60/b;->G:I

    const/4 v2, 0x0

    invoke-static {v0, v5, v2}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    move/from16 v1, v32

    const/16 v0, 0x20

    if-ne v1, v0, :cond_2c

    move v13, v10

    goto :goto_1c

    :cond_2c
    move v13, v2

    :goto_1c
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v13, :cond_2e

    move-object/from16 v14, v55

    if-ne v0, v14, :cond_2d

    goto :goto_1d

    :cond_2d
    move-object/from16 v12, v31

    goto :goto_1e

    :cond_2e
    :goto_1d
    new-instance v0, Luf0/e;

    const/16 v1, 0xb

    move-object/from16 v12, v31

    invoke-direct {v0, v12, v1}, Luf0/e;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1e
    move-object v6, v0

    check-cast v6, Lc93/a;

    sget v8, Lny0/o;->k:I

    const/16 v9, 0x8

    move-object/from16 v20, v5

    const/4 v5, 0x0

    move-object v2, v11

    move-object/from16 v7, v20

    invoke-static/range {v2 .. v9}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v7

    invoke-virtual {v5, v10}, Lp1/q;->q(Z)V

    move-object v3, v12

    goto :goto_1f

    :cond_2f
    move-object v5, v11

    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_1f
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_30

    new-instance v0, Lt80/b;

    const/16 v5, 0xd

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lt80/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_30
    return-void
.end method

.method private static final m(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lp1/c1;Z)V
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

.method private static final o(Li3/z;)Ll83/a0;
    .locals 4

    const-string v0, "$this$semantics"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc2/p;->a:Lc2/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lc2/o;->d:Lc2/g;

    sget-object v1, Li3/w;->a:[Lj93/z;

    sget-object v1, Li3/u;->q:Li3/y;

    sget-object v2, Li3/w;->a:[Lj93/z;

    const/16 v3, 0x8

    aget-object v2, v2, v3

    invoke-virtual {v1, p0, v0}, Li3/y;->a(Li3/z;Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lp1/c1;Lg2/v;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lv80/b;->B(Lp1/c1;)Z

    move-result v0

    if-nez v0, :cond_1

    check-cast p1, Lg2/w;

    invoke-virtual {p1}, Lg2/w;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-static {p0, p1}, Lv80/b;->n(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lg2/i;Lu0/p0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$KeyboardActions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lg2/i;->a(Lg2/i;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lkotlin/jvm/functions/Function1;Lv80/c;Lp1/c1;)Ll83/a0;
    .locals 10

    invoke-static {p2}, Lv80/b;->y(Lp1/c1;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p2, v0}, Lv80/b;->z(Lp1/c1;Z)V

    new-instance v1, Lh80/b$i;

    invoke-virtual {p1}, Lv80/c;->c()Ljava/lang/String;

    move-result-object v2

    const/16 v8, 0x22

    const/4 v9, 0x0

    const/4 v3, 0x0

    const-string v4, "icon"

    const-string v5, "eye"

    const-string v6, "account_creation"

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 3

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lv80/b;->x(Lp1/c1;Ljava/lang/String;)V

    new-instance p1, Lj80/a$u0;

    new-instance v0, Ld70/e;

    invoke-direct {v0, p2}, Ld70/e;-><init>(Ljava/lang/String;)V

    const/4 p2, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2, p2, v1}, Lj80/a$u0;-><init>(Ld70/e;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lkotlin/jvm/functions/Function1;Lv80/c;)Ll83/a0;
    .locals 11

    new-instance v0, Ll80/o$h;

    invoke-virtual {p1}, Lv80/c;->f()Lcom/whoop/activation/domain/models/ActivationFlowCtaDestinations;

    move-result-object v1

    invoke-direct {v0, v1}, Ll80/o$h;-><init>(Lcom/whoop/activation/domain/models/ActivationFlowCtaDestinations;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lh80/b$i;

    invoke-virtual {p1}, Lv80/c;->c()Ljava/lang/String;

    move-result-object v3

    const/16 v9, 0x36

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v6, "entered_wrong_email"

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Ll80/o$d;->a:Ll80/o$d;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lv80/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lv80/b;->l(Lv80/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lp1/c1;)Ljava/lang/String;
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

.method private static final x(Lp1/c1;Ljava/lang/String;)V
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

.method private static final y(Lp1/c1;)Z
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

.method private static final z(Lp1/c1;Z)V
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
