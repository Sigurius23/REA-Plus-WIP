.class public abstract Lwt1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a+\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a+\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u000c2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a-\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0013H\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a+\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00172\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001c\u00b2\u0006\u000c\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lkotlin/Function1;",
        "Lvt1/a$c;",
        "Ll83/a0;",
        "onNavEvent",
        "m",
        "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lvt1/c;",
        "viewState",
        "Lvt1/a;",
        "onEvent",
        "n",
        "(Lvt1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lvt1/c$a;",
        "x",
        "(Lvt1/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lvt1/e;",
        "regulatoryInfoViewState",
        "",
        "isImageLoaded",
        "Lkotlin/Function0;",
        "onImageLoadSuccess",
        "D",
        "(Lvt1/e;ZLc93/a;Landroidx/compose/runtime/Composer;I)V",
        "Lvt1/c$b;",
        "t",
        "(Lvt1/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lvt1/b;",
        "viewModel",
        "labrador_release"
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
.method private static final A(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lvt1/a$a;->a:Lvt1/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lwt1/a;->z(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lvt1/c$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lwt1/a;->x(Lvt1/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lvt1/e;ZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvt1/e;",
            "Z",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, -0x3d26497f

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    move-object/from16 v1, p0

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    const/16 v31, 0x20

    if-nez v5, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_2

    move/from16 v5, v31

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit16 v5, v4, 0x180

    const/16 v6, 0x100

    if-nez v5, :cond_5

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    move v5, v6

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    and-int/lit16 v5, v0, 0x93

    const/16 v7, 0x92

    const/4 v8, 0x0

    const/16 v32, 0x1

    if-eq v5, v7, :cond_6

    move/from16 v5, v32

    goto :goto_4

    :cond_6
    move v5, v8

    :goto_4
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v12, v7, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-virtual {v1}, Lvt1/e;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v5, v12, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v7, v12, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    invoke-virtual {v7, v12, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->O()Lb91/a;

    move-result-object v25

    sget v7, Lb91/a;->d:I

    shl-int/lit8 v29, v7, 0x12

    const v30, 0x2fffa

    move v7, v6

    const/4 v6, 0x0

    move v13, v8

    move-wide/from16 v35, v10

    move v11, v7

    move-wide/from16 v7, v35

    const-wide/16 v9, 0x0

    move v14, v11

    const/4 v11, 0x0

    move-object/from16 v27, v12

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move/from16 v16, v14

    move/from16 v17, v15

    const-wide/16 v14, 0x0

    move/from16 v18, v16

    const/16 v16, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    move/from16 v21, v19

    const-wide/16 v18, 0x0

    move/from16 v22, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v26, v23

    const/16 v23, 0x0

    move/from16 v28, v24

    const/16 v24, 0x0

    move/from16 v33, v26

    const/16 v26, 0x0

    move/from16 v34, v28

    const/16 v28, 0x0

    move/from16 v1, v34

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v27

    invoke-virtual/range {p0 .. p0}, Lvt1/e;->b()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_5
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lkd1/o;

    and-int/lit16 v6, v0, 0x380

    if-ne v6, v1, :cond_7

    move/from16 v8, v32

    goto :goto_6

    :cond_7
    const/4 v8, 0x0

    :goto_6
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-nez v8, :cond_8

    if-ne v6, v7, :cond_9

    :cond_8
    new-instance v6, Lpy0/a;

    const/16 v8, 0x16

    invoke-direct {v6, v3, v8}, Lpy0/a;-><init>(Lc93/a;I)V

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v7, :cond_a

    new-instance v8, Lwo1/e0;

    const/16 v7, 0x15

    invoke-direct {v8, v7}, Lwo1/e0;-><init>(I)V

    invoke-virtual {v12, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v7, v8

    check-cast v7, Lkotlin/jvm/functions/Function1;

    sget v8, Lkd1/o;->a:I

    or-int/lit16 v9, v8, 0x180

    const/4 v10, 0x0

    move-object v8, v12

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    move-object/from16 v27, v8

    const/high16 v6, 0x3f800000    # 1.0f

    if-eqz v2, :cond_b

    invoke-virtual {v5}, Ln2/a;->h()J

    move-result-wide v7

    shr-long v7, v7, v31

    long-to-int v7, v7

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    invoke-virtual {v5}, Ln2/a;->h()J

    move-result-wide v8

    const-wide v10, 0xffffffffL

    and-long/2addr v8, v10

    long-to-int v8, v8

    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    div-float/2addr v7, v8

    goto :goto_7

    :cond_b
    move v7, v6

    :goto_7
    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v9, 0x0

    invoke-static {v8, v9, v7}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-interface {v6, v7}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v13, 0x6030

    const/16 v14, 0x68

    const/4 v6, 0x0

    const/4 v8, 0x0

    move/from16 v33, v9

    sget-object v9, Ly2/j;->b:Ly2/b1;

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v12, v27

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    goto/16 :goto_5

    :cond_c
    move-object/from16 v27, v12

    goto :goto_8

    :cond_d
    move-object/from16 v27, v12

    invoke-virtual/range {v27 .. v27}, Lp1/q;->X()V

    :goto_8
    invoke-virtual/range {v27 .. v27}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Lsg2/o;

    const/4 v5, 0x6

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v5}, Lsg2/o;-><init>(Ljava/lang/Object;ZLjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final E(Lc93/a;Lcoil/compose/AsyncImagePainter$State$Success;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lmh/h;)Ll83/a0;
    .locals 1

    const-string v0, "$this$rememberImagePainter"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lnh/h;->c:Lnh/h;

    invoke-virtual {p0, v0}, Lmh/h;->e(Lnh/h;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lvt1/e;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lwt1/a;->D(Lvt1/e;ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic H(Ll83/h;)Lvt1/b;
    .locals 0

    invoke-static {p0}, Lwt1/a;->o(Ll83/h;)Lvt1/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwt1/a;->A(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ll83/h;Lvt1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lwt1/a;->q(Lkotlin/jvm/functions/Function1;Ll83/h;Lvt1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwt1/a;->u(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2, p3}, Lwt1/a;->r(Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lc93/a;Lcoil/compose/AsyncImagePainter$State$Success;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lwt1/a;->E(Lc93/a;Lcoil/compose/AsyncImagePainter$State$Success;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lvt1/e;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lwt1/a;->G(Lvt1/e;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lmh/h;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwt1/a;->F(Lmh/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwt1/a;->B(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lvt1/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lwt1/a;->s(Lvt1/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lvt1/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lwt1/a;->w(Lvt1/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwt1/a;->v(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lvt1/c$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lwt1/a;->C(Lvt1/c$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "onNavEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p1

    check-cast v4, Lp1/q;

    const p1, 0x37950018

    invoke-virtual {v4, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x6

    const/4 v0, 0x2

    const/4 v7, 0x4

    if-nez p1, :cond_1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v7

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    and-int/lit8 v1, p1, 0x3

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eq v1, v0, :cond_2

    move v0, v8

    goto :goto_2

    :cond_2
    move v0, v9

    :goto_2
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_b

    const v0, -0x649fae96

    invoke-virtual {v4, v0}, Lp1/q;->f0(I)V

    sget-object v0, Lpf3/a;->b:Lnf3/a;

    if-eqz v0, :cond_a

    iget-object v0, v0, Lnf3/a;->a:Lwf3/a;

    iget-object v0, v0, Lwf3/a;->d:Lxf3/c;

    const v1, -0x649fad62

    const v2, -0x384098

    invoke-static {v4, v1, v4, v9, v2}, Lvl/b;->r(Lp1/q;ILp1/q;ZI)Ljf3/a;

    move-result-object v1

    const/4 v10, 0x0

    invoke-virtual {v4, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v4, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_3

    if-ne v3, v11, :cond_4

    :cond_3
    sget-object v2, Ll83/i;->y:Ll83/i;

    new-instance v3, Lwt1/a$a;

    invoke-direct {v3, v0, v10, v10, v1}, Lwt1/a$a;-><init>(Lxf3/c;Lvf3/a;Lc93/a;Ljf3/a;)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    move-object v0, v3

    check-cast v0, Ll83/h;

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    invoke-static {v0}, Lwt1/a;->o(Ll83/h;)Lvt1/b;

    move-result-object v1

    invoke-virtual {v1}, Lvt1/b;->getViewState()Lec3/l;

    move-result-object v1

    sget-object v2, Lvt1/c$b;->e:Lvt1/c$b$a;

    invoke-virtual {v2}, Lvt1/c$b$a;->b()Lvt1/c$b;

    move-result-object v2

    sget v3, Lsz0/p0;->d:I

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/2addr v3, v5

    or-int/2addr v3, v5

    or-int/2addr v3, v5

    shl-int/lit8 v5, v3, 0x3

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v1

    invoke-static {v0}, Lwt1/a;->o(Ll83/h;)Lvt1/b;

    move-result-object v2

    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_5

    if-ne v5, v11, :cond_6

    :cond_5
    new-instance v5, Lwt1/a$b;

    invoke-direct {v5, v0, v10}, Lwt1/a$b;-><init>(Ll83/h;Lq83/d;)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v5, Lc93/m;

    invoke-static {v4, v5, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1}, Lwt1/a;->p(Lp1/t2;)Lvt1/c;

    move-result-object v1

    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit8 p1, p1, 0xe

    if-ne p1, v7, :cond_7

    goto :goto_3

    :cond_7
    move v8, v9

    :goto_3
    or-int p1, v2, v8

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez p1, :cond_8

    if-ne v2, v11, :cond_9

    :cond_8
    new-instance v2, Lce2/a;

    const/16 p1, 0x8

    invoke-direct {v2, p0, v0, p1}, Lce2/a;-><init>(Lkotlin/jvm/functions/Function1;Ll83/h;I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2, v4, v9}, Lwt1/a;->n(Lvt1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "KoinApplication has not been started"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_b
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_c

    new-instance v0, Lcd0/a;

    const/16 v1, 0x14

    invoke-direct {v0, p0, p2, v1}, Lcd0/a;-><init>(Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method public static final n(Lvt1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvt1/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, -0x3af69ec4

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, p3

    goto :goto_2

    :cond_2
    move v0, p3

    :goto_2
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_4

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x20

    goto :goto_3

    :cond_3
    const/16 v1, 0x10

    :goto_3
    or-int/2addr v0, v1

    :cond_4
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x0

    if-eq v1, v2, :cond_5

    const/4 v1, 0x1

    goto :goto_4

    :cond_5
    move v1, v3

    :goto_4
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p2, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_8

    instance-of v1, p0, Lvt1/c$b;

    if-eqz v1, :cond_6

    const v1, -0x57c9e2cb

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    move-object v1, p0

    check-cast v1, Lvt1/c$b;

    and-int/lit8 v0, v0, 0x7e

    invoke-static {v1, p1, p2, v0}, Lwt1/a;->t(Lvt1/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v3}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_6
    instance-of v1, p0, Lvt1/c$a;

    if-eqz v1, :cond_7

    const v1, -0x57c9d53e

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    move-object v1, p0

    check-cast v1, Lvt1/c$a;

    and-int/lit8 v0, v0, 0x7e

    invoke-static {v1, p1, p2, v0}, Lwt1/a;->x(Lvt1/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v3}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    const p0, -0x57c9ebfc

    invoke-static {p0, p2, v3}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_8
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_9

    new-instance v0, Lv90/e;

    const/16 v1, 0xd

    invoke-direct {v0, p0, p1, p3, v1}, Lv90/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final o(Ll83/h;)Lvt1/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")",
            "Lvt1/b;"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lvt1/b;

    return-object p0
.end method

.method private static final p(Lp1/t2;)Lvt1/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lvt1/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lvt1/c;

    return-object p0
.end method

.method private static final q(Lkotlin/jvm/functions/Function1;Ll83/h;Lvt1/a;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lvt1/a$d;

    if-eqz v0, :cond_0

    invoke-static {p1}, Lwt1/a;->o(Ll83/h;)Lvt1/b;

    move-result-object p0

    check-cast p2, Lvt1/a$d;

    invoke-virtual {p0, p2}, Lvt1/b;->p(Lvt1/a$d;)Lbc3/k1;

    goto :goto_0

    :cond_0
    instance-of p1, p2, Lvt1/a$c;

    if-eqz p1, :cond_1

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final r(Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lwt1/a;->m(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lvt1/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lwt1/a;->n(Lvt1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final t(Lvt1/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvt1/c$b;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, -0x7d22c82a

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v2, 0x6

    if-nez v4, :cond_2

    and-int/lit8 v4, v2, 0x8

    if-nez v4, :cond_0

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_0
    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_1

    :cond_1
    const/4 v4, 0x2

    :goto_1
    or-int/2addr v4, v2

    goto :goto_2

    :cond_2
    move v4, v2

    :goto_2
    and-int/lit8 v5, v2, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_4

    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v6

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v4, v5

    :cond_4
    and-int/lit8 v5, v4, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v5, v7, :cond_5

    move v5, v9

    goto :goto_4

    :cond_5
    move v5, v8

    :goto_4
    and-int/lit8 v7, v4, 0x1

    invoke-virtual {v3, v7, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_c

    move v5, v4

    invoke-virtual {v0}, Lvt1/c$b;->f()Lsz0/p0;

    move-result-object v4

    move v7, v5

    invoke-virtual {v0}, Lvt1/c$b;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    move v10, v7

    invoke-virtual {v0}, Lvt1/c$b;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    and-int/lit8 v10, v10, 0x70

    if-ne v10, v6, :cond_6

    move v11, v9

    goto :goto_5

    :cond_6
    move v11, v8

    :goto_5
    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-nez v11, :cond_7

    if-ne v12, v13, :cond_8

    :cond_7
    new-instance v12, Lw01/f;

    const/16 v11, 0xa

    invoke-direct {v12, v1, v11}, Lw01/f;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v3, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v12, Lc93/a;

    invoke-virtual {v0}, Lvt1/c$b;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    if-ne v10, v6, :cond_9

    move v8, v9

    :cond_9
    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v8, :cond_a

    if-ne v6, v13, :cond_b

    :cond_a
    new-instance v6, Lw01/f;

    const/16 v8, 0xb

    invoke-direct {v6, v1, v8}, Lw01/f;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v3, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v6, Lc93/a;

    const/high16 v8, 0x30000

    sget v9, Lsz0/p0;->d:I

    or-int/2addr v8, v9

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v10, v9, 0x3

    or-int/2addr v8, v10

    shl-int/lit8 v10, v9, 0x9

    or-int/2addr v8, v10

    shl-int/lit8 v9, v9, 0x15

    or-int v17, v8, v9

    const/16 v18, 0x0

    const/16 v19, 0xe44

    move-object v8, v12

    move-object v12, v6

    const/4 v6, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v3

    invoke-static/range {v4 .. v19}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    goto :goto_6

    :cond_c
    move-object/from16 v16, v3

    invoke-virtual/range {v16 .. v16}, Lp1/q;->X()V

    :goto_6
    invoke-virtual/range {v16 .. v16}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_d

    new-instance v4, Lv90/e;

    const/16 v5, 0xe

    invoke-direct {v4, v0, v1, v2, v5}, Lv90/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final u(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lvt1/a$b;->a:Lvt1/a$b;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lvt1/a$a;->a:Lvt1/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lvt1/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lwt1/a;->t(Lvt1/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lvt1/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvt1/c$a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v9, p2

    check-cast v9, Lp1/q;

    const v3, 0x89642c0

    invoke-virtual {v9, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit8 v4, v3, 0x13

    const/16 v13, 0x12

    const/4 v14, 0x0

    if-eq v4, v13, :cond_4

    const/4 v4, 0x1

    goto :goto_3

    :cond_4
    move v4, v14

    :goto_3
    and-int/lit8 v6, v3, 0x1

    invoke-virtual {v9, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v4, v6, :cond_5

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v4, Lp1/c1;

    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v7}, Lr;->f(Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v10, Ll0/m;->c:Ll0/g;

    sget-object v11, Lb2/e;->M:Lb2/k;

    invoke-static {v10, v11, v9, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    move/from16 p2, v13

    iget-wide v13, v9, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v9, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v12, v9, Lp1/q;->S:Z

    if-eqz v12, :cond_6

    invoke-virtual {v9, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_4
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v9, v12, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v9, v10, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v5, v9, Lp1/q;->S:Z

    if-nez v5, :cond_7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move/from16 v20, v3

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_5

    :cond_7
    move/from16 v20, v3

    :goto_5
    invoke-static {v13, v9, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v13, La3/k;->d:La3/i;

    invoke-static {v9, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v21, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual {v0}, Lvt1/c$a;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v22

    invoke-virtual {v0}, Lvt1/c$a;->c()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v24

    sget v3, Lrs1/f;->M:I

    invoke-static {v9, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v25

    const v38, 0xfff2

    const/16 v39, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    invoke-direct/range {v21 .. v39}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v3, v20, 0x70

    const/16 v5, 0x20

    if-ne v3, v5, :cond_9

    const/4 v3, 0x1

    goto :goto_6

    :cond_9
    const/4 v3, 0x0

    :goto_6
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_a

    if-ne v5, v6, :cond_b

    :cond_a
    new-instance v5, Lw01/f;

    const/16 v3, 0xc

    invoke-direct {v5, v1, v3}, Lw01/f;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v5, Lc93/a;

    sget v3, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v3, v3, 0x3

    move-object v7, v11

    const/16 v11, 0x35

    move-object/from16 v19, v10

    move v10, v3

    const/4 v3, 0x0

    move-object/from16 v20, v6

    move-object v6, v5

    const/4 v5, 0x0

    move-object/from16 v22, v7

    const/4 v7, 0x0

    move-object/from16 v23, v8

    const/4 v8, 0x0

    move-object/from16 v29, v4

    move-object/from16 v1, v19

    move-object/from16 v30, v20

    move-object/from16 v4, v21

    move-object/from16 v0, v22

    move-object/from16 v2, v23

    invoke-static/range {v3 .. v11}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x2

    int-to-float v4, v3

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v9, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v6, 0x0

    invoke-static {v2, v4, v6, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static {v6, v9, v7}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v8

    const/16 v10, 0xe

    invoke-static {v3, v8, v10}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    const/4 v8, 0x6

    invoke-static {v4, v0, v9, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v9, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-eqz v10, :cond_c

    invoke-virtual {v9, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_c
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v9, v12, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v9, Lp1/q;->S:Z

    if-nez v0, :cond_d

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    :cond_d
    invoke-static {v4, v9, v4, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v9, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lvt1/c$a;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v9, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v0, v9, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v10

    invoke-virtual {v0, v9, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->O()Lb91/a;

    move-result-object v23

    sget v8, Lb91/a;->d:I

    shl-int/lit8 v27, v8, 0x12

    const v28, 0x2fffa

    move v8, v4

    const/4 v4, 0x0

    move/from16 v17, v7

    move v12, v8

    const-wide/16 v7, 0x0

    move-object/from16 v25, v9

    const/4 v9, 0x0

    move/from16 v16, v6

    move-wide/from16 v40, v10

    move v11, v5

    move-wide/from16 v5, v40

    const/4 v10, 0x0

    move v13, v11

    const/4 v11, 0x0

    move v15, v12

    move v14, v13

    const-wide/16 v12, 0x0

    move/from16 v18, v14

    const/4 v14, 0x0

    move/from16 v19, v15

    const/4 v15, 0x0

    move/from16 v20, v16

    move/from16 v21, v17

    const-wide/16 v16, 0x0

    move/from16 v22, v18

    const/16 v18, 0x0

    move/from16 v24, v19

    const/16 v19, 0x0

    move/from16 v26, v20

    const/16 v20, 0x0

    move/from16 v31, v21

    const/16 v21, 0x0

    move/from16 v32, v22

    const/16 v22, 0x0

    move/from16 v33, v24

    const/16 v24, 0x0

    move/from16 v34, v26

    const/16 v26, 0x0

    move-object/from16 v31, v2

    move/from16 v2, v33

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v25

    invoke-virtual/range {p0 .. p0}, Lvt1/c$a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v9, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v9, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v5

    invoke-virtual {v0, v9, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v23

    const/4 v9, 0x0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v25

    const/4 v7, 0x1

    int-to-float v0, v7

    mul-float v0, v0, v32

    move-object/from16 v2, v31

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v9, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v0, 0x5842c9aa

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lvt1/c$a;->e()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvt1/e;

    invoke-static/range {v29 .. v29}, Lwt1/a;->y(Lp1/c1;)Z

    move-result v2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v4, v30

    if-ne v3, v4, :cond_f

    new-instance v3, Luz1/g;

    const/16 v5, 0xe

    move-object/from16 v6, v29

    invoke-direct {v3, v5, v6}, Luz1/g;-><init>(ILp1/c1;)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_9

    :cond_f
    move-object/from16 v6, v29

    :goto_9
    check-cast v3, Lc93/a;

    const/16 v5, 0x180

    invoke-static {v1, v2, v3, v9, v5}, Lwt1/a;->D(Lvt1/e;ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v30, v4

    move-object/from16 v29, v6

    goto :goto_8

    :cond_10
    const/4 v1, 0x0

    invoke-static {v9, v1, v7, v7}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_a

    :cond_11
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_12

    new-instance v1, Lv90/e;

    const/16 v2, 0xf

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move/from16 v5, p3

    invoke-direct {v1, v3, v4, v5, v2}, Lv90/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_12
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
