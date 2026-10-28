.class public final Lh51/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lh51/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lh51/a;",
        "Lm91/f;",
        "Lh51/f;",
        "<init>",
        "()V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Landroidx/compose/ui/Modifier;Lh51/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lh51/f;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lh51/a;->h(Lkotlin/jvm/functions/Function1;Lh51/f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lh51/a;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lh51/a;->f(Landroidx/compose/ui/Modifier;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lh51/a;Landroidx/compose/ui/Modifier;Lh51/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lh51/a;->i(Lh51/a;Landroidx/compose/ui/Modifier;Lh51/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Landroidx/compose/ui/Modifier;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p3, "it"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const p1, 0x1bc4588b

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "tileStateEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Lh51/f;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lh51/f;->getEvent()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lh51/a;Landroidx/compose/ui/Modifier;Lh51/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lh51/a;->e(Landroidx/compose/ui/Modifier;Lh51/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Lh51/f;

    invoke-virtual/range {p0 .. p5}, Lh51/a;->e(Landroidx/compose/ui/Modifier;Lh51/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public e(Landroidx/compose/ui/Modifier;Lh51/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lh51/f;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    const-string v0, "modifier"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemState"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v1, -0x21cb0061

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v5, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v5

    goto :goto_1

    :cond_1
    move v1, v5

    :goto_1
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v1, v6

    :cond_3
    and-int/lit16 v6, v5, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v1, v6

    :cond_5
    and-int/lit16 v6, v1, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v6, v8, :cond_6

    move v6, v10

    goto :goto_4

    :cond_6
    move v6, v9

    :goto_4
    and-int/lit8 v8, v1, 0x1

    invoke-virtual {v0, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-virtual {v3}, Lh51/f;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v3}, Lh51/f;->n()Li91/a;

    move-result-object v8

    move-object v11, v8

    invoke-virtual {v3}, Lh51/f;->o()Lb91/c;

    move-result-object v8

    move v12, v9

    invoke-virtual {v3}, Lh51/f;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    move v13, v10

    invoke-virtual {v3}, Lh51/f;->c()Ly71/g;

    move-result-object v10

    move-object v14, v11

    invoke-virtual {v3}, Lh51/f;->j()Z

    move-result v11

    move v15, v12

    invoke-virtual {v3}, Lh51/f;->l()Z

    move-result v12

    move/from16 v16, v13

    invoke-virtual {v3}, Lh51/f;->h()Ljava/util/List;

    move-result-object v13

    move/from16 v17, v15

    new-instance v15, Law0/a;

    const/4 v7, 0x5

    invoke-direct {v15, v7, v2}, Law0/a;-><init>(ILandroidx/compose/ui/Modifier;)V

    move/from16 v7, v16

    invoke-virtual {v3}, Lh51/f;->f()Ly81/e;

    move-result-object v16

    move/from16 v18, v17

    invoke-virtual {v3}, Lh51/f;->i()Li91/a;

    move-result-object v17

    move/from16 v19, v18

    invoke-virtual {v3}, Lh51/f;->g()Lkd1/o;

    move-result-object v18

    and-int/lit16 v1, v1, 0x380

    const/16 v7, 0x100

    if-ne v1, v7, :cond_7

    const/4 v7, 0x1

    goto :goto_5

    :cond_7
    move/from16 v7, v19

    :goto_5
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-nez v7, :cond_8

    if-ne v2, v5, :cond_9

    :cond_8
    new-instance v2, Lge0/c;

    const/16 v7, 0x11

    invoke-direct {v2, v4, v7}, Lge0/c;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/16 v7, 0x100

    if-ne v1, v7, :cond_a

    const/16 v19, 0x1

    :cond_a
    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int v1, v19, v1

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v1, :cond_b

    if-ne v7, v5, :cond_c

    :cond_b
    new-instance v7, Lf1/w1;

    const/16 v1, 0x18

    invoke-direct {v7, v1, v4, v3}, Lf1/w1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object/from16 v20, v7

    check-cast v20, Lc93/a;

    invoke-virtual {v3}, Lh51/f;->k()Z

    move-result v21

    const/16 v24, 0x0

    const/16 v25, 0x100

    move-object v7, v14

    const/4 v14, 0x0

    const/16 v23, 0x0

    move-object/from16 v22, v0

    move-object/from16 v19, v2

    invoke-static/range {v6 .. v25}, Lh51/d;->m(Lcom/whoop/design/util/TextResource;Li91/a;Lb91/c;Lcom/whoop/design/util/TextResource;Ly71/g;ZZLjava/util/List;Lb2/f;Lkotlin/jvm/functions/Function3;Ly81/e;Li91/a;Lkd1/o;Lkotlin/jvm/functions/Function1;Lc93/a;ZLandroidx/compose/runtime/Composer;III)V

    goto :goto_6

    :cond_d
    move-object/from16 v22, v0

    invoke-virtual/range {v22 .. v22}, Lp1/q;->X()V

    :goto_6
    invoke-virtual/range {v22 .. v22}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_e

    new-instance v0, Lg90/a;

    const/16 v6, 0x12

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lg90/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method
