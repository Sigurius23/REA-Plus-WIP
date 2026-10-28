.class public final Lo11/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lo11/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lo11/b;",
        "Lm91/f;",
        "Lo11/h;",
        "<init>",
        "()V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "b",
        "(Landroidx/compose/ui/Modifier;Lo11/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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

.method public static synthetic a(Lo11/b;Landroidx/compose/ui/Modifier;Lo11/h;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lo11/b;->c(Lo11/b;Landroidx/compose/ui/Modifier;Lo11/h;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lo11/b;Landroidx/compose/ui/Modifier;Lo11/h;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lo11/b;->b(Landroidx/compose/ui/Modifier;Lo11/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Lo11/h;

    invoke-virtual/range {p0 .. p5}, Lo11/b;->b(Landroidx/compose/ui/Modifier;Lo11/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public b(Landroidx/compose/ui/Modifier;Lo11/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lo11/h;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v7, p2

    move-object/from16 v4, p3

    move/from16 v0, p5

    const-string v1, "modifier"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "itemState"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onViewEvent"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p4

    check-cast v5, Lp1/q;

    const v1, -0x5615bbd8

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v0, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v5, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v0

    goto :goto_1

    :cond_1
    move v1, v0

    :goto_1
    and-int/lit8 v3, v0, 0x30

    if-nez v3, :cond_4

    and-int/lit8 v3, v0, 0x40

    if-nez v3, :cond_2

    invoke-virtual {v5, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_2

    :cond_2
    invoke-virtual {v5, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_2
    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_3

    :cond_3
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v1, v3

    :cond_4
    and-int/lit16 v3, v0, 0x180

    if-nez v3, :cond_6

    invoke-virtual {v5, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    const/16 v3, 0x100

    goto :goto_4

    :cond_5
    const/16 v3, 0x80

    :goto_4
    or-int/2addr v1, v3

    :cond_6
    and-int/lit16 v3, v1, 0x93

    const/16 v6, 0x92

    const/4 v8, 0x0

    if-eq v3, v6, :cond_7

    const/4 v3, 0x1

    goto :goto_5

    :cond_7
    move v3, v8

    :goto_5
    and-int/lit8 v6, v1, 0x1

    invoke-virtual {v5, v6, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_b

    instance-of v3, v7, Lo11/h$b;

    if-eqz v3, :cond_8

    const v3, 0x34d48d38

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    move-object v3, v7

    check-cast v3, Lo11/h$b;

    move v6, v8

    invoke-virtual {v3}, Lo11/h$b;->m()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v3}, Lo11/h$b;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v3}, Lo11/h$b;->o()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v3}, Lo11/h$b;->h()Z

    move-result v11

    invoke-virtual {v3}, Lo11/h$b;->f()Z

    move-result v12

    invoke-virtual {v3}, Lo11/h$b;->j()Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v3}, Lo11/h$b;->l()Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v3}, Lo11/h$b;->n()Z

    move-result v15

    invoke-virtual {v3}, Lo11/h$b;->e()Z

    move-result v16

    invoke-virtual {v3}, Lo11/h$b;->g()Z

    move-result v17

    invoke-virtual {v3}, Lo11/h$b;->k()Ljava/lang/Object;

    move-result-object v18

    invoke-virtual {v3}, Lo11/h$b;->p()I

    move-result v19

    and-int/lit16 v1, v1, 0x380

    const/16 v24, 0x0

    const/16 v22, 0x0

    move/from16 v23, v1

    move-object/from16 v20, v4

    move-object/from16 v21, v5

    move v3, v6

    invoke-static/range {v8 .. v24}, Lo11/g;->P(Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLjava/lang/Object;Ljava/lang/Object;ZZZLjava/lang/Object;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    goto/16 :goto_6

    :cond_8
    move v3, v8

    instance-of v4, v7, Lo11/h$c;

    if-eqz v4, :cond_9

    const v4, 0x34e22f05    # 4.2129992E-7f

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    move-object v4, v7

    check-cast v4, Lo11/h$c;

    invoke-virtual {v4}, Lo11/h$c;->a()Lsz0/q;

    move-result-object v0

    move v6, v1

    invoke-virtual {v4}, Lo11/h$c;->b()Lsz0/q;

    move-result-object v1

    invoke-virtual {v4}, Lo11/h$c;->c()Lsz0/q;

    move-result-object v2

    invoke-virtual {v4}, Lo11/h$c;->e()Z

    move-result v4

    shl-int/lit8 v6, v6, 0xc

    const v8, 0xe000

    and-int/2addr v6, v8

    move v8, v3

    move v3, v4

    move-object/from16 v4, p1

    invoke-static/range {v0 .. v6}, Lo11/g;->Q(Lsz0/q;Lsz0/q;Lsz0/q;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_9
    move v8, v3

    instance-of v0, v7, Lo11/h$a;

    if-eqz v0, :cond_a

    const v0, 0x34e819e7

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    move-object v0, v7

    check-cast v0, Lo11/h$a;

    move v3, v8

    invoke-virtual {v0}, Lo11/h$a;->n()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v0}, Lo11/h$a;->p()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v0}, Lo11/h$a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v0}, Lo11/h$a;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v0}, Lo11/h$a;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v0}, Lo11/h$a;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v0}, Lo11/h$a;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v0}, Lo11/h$a;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v21

    invoke-virtual {v0}, Lo11/h$a;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v19

    invoke-virtual {v0}, Lo11/h$a;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v20

    invoke-virtual {v0}, Lo11/h$a;->o()Lcom/whoop/design/util/TextResource;

    move-result-object v22

    invoke-virtual {v0}, Lo11/h$a;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v23

    invoke-virtual {v0}, Lo11/h$a;->q()Z

    move-result v17

    invoke-virtual {v0}, Lo11/h$a;->b()Z

    move-result v18

    invoke-virtual {v0}, Lo11/h$a;->j()Ljava/util/List;

    move-result-object v16

    invoke-virtual {v0}, Lo11/h$a;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v25, 0x0

    move-object/from16 v24, v5

    invoke-static/range {v8 .. v27}, Lo11/g;->y(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;ZZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_a
    move v3, v8

    const v0, -0x27960f0c

    invoke-static {v0, v5, v3}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_b
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_c

    new-instance v0, Lno0/m0;

    const/16 v6, 0x15

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v5, p5

    move-object v3, v7

    invoke-direct/range {v0 .. v6}, Lno0/m0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method
