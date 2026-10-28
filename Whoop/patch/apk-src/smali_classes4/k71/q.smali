.class public final Lk71/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lk71/c0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lk71/q;",
        "Lm91/f;",
        "Lk71/c0;",
        "<init>",
        "()V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Landroidx/compose/ui/Modifier;Lk71/c0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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

.method public static synthetic a(Lk71/q;Landroidx/compose/ui/Modifier;Lk71/c0;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lk71/q;->e(Lk71/q;Landroidx/compose/ui/Modifier;Lk71/c0;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lk71/c0;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lk71/q;->d(Lkotlin/jvm/functions/Function1;Lk71/c0;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Lk71/c0;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lk71/c0;->getEvent()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lk71/q;Landroidx/compose/ui/Modifier;Lk71/c0;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lk71/q;->c(Landroidx/compose/ui/Modifier;Lk71/c0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Lk71/c0;

    invoke-virtual/range {p0 .. p5}, Lk71/q;->c(Landroidx/compose/ui/Modifier;Lk71/c0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public c(Landroidx/compose/ui/Modifier;Lk71/c0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lk71/c0;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v15, p3

    move/from16 v2, p5

    const-string v3, "modifier"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "itemState"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onViewEvent"

    invoke-static {v15, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p4

    check-cast v3, Lp1/q;

    const v4, 0x3bb96565

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v2, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v5, v2, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit16 v5, v2, 0x180

    const/16 v6, 0x100

    if-nez v5, :cond_5

    invoke-virtual {v3, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    move v5, v6

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v4, v5

    :cond_5
    and-int/lit16 v5, v4, 0x93

    const/16 v7, 0x92

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v5, v7, :cond_6

    move v5, v9

    goto :goto_4

    :cond_6
    move v5, v8

    :goto_4
    and-int/lit8 v7, v4, 0x1

    invoke-virtual {v3, v7, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-virtual {v1}, Lk71/c0;->c()Ly81/e;

    move-result-object v5

    invoke-virtual {v1}, Lk71/c0;->o()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Lk71/c0;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v1}, Lk71/c0;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v1}, Lk71/c0;->k()Ly81/e;

    move-result-object v10

    move-object v12, v5

    invoke-virtual {v1}, Lk71/c0;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v1}, Lk71/c0;->i()Ly71/g;

    move-result-object v13

    move-object v14, v7

    invoke-virtual {v1}, Lk71/c0;->f()Lkd1/l;

    move-result-object v7

    move/from16 v16, v8

    invoke-virtual {v1}, Lk71/c0;->g()F

    move-result v8

    move/from16 v17, v9

    invoke-virtual {v1}, Lk71/c0;->h()Lm91/u;

    move-result-object v9

    move-object/from16 v18, v10

    invoke-virtual {v1}, Lk71/c0;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    move-object/from16 v19, v12

    invoke-virtual {v1}, Lk71/c0;->p()Z

    move-result v12

    move-object/from16 v20, v13

    invoke-virtual {v1}, Lk71/c0;->n()Ljava/util/List;

    move-result-object v13

    and-int/lit16 v0, v4, 0x380

    if-ne v0, v6, :cond_7

    move/from16 v16, v17

    :cond_7
    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int v0, v16, v0

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_8

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v6, v0, :cond_9

    :cond_8
    new-instance v6, Lbp0/n;

    const/16 v0, 0x14

    invoke-direct {v6, v15, v1, v0}, Lbp0/n;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v3, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v6, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v17, v4, 0xe

    shl-int/lit8 v0, v4, 0x9

    const/high16 v4, 0x70000

    and-int/2addr v0, v4

    move-object/from16 v1, v19

    const/16 v19, 0x0

    move-object/from16 v16, v3

    move-object v3, v14

    move-object/from16 v4, v18

    move/from16 v18, v0

    move-object v14, v6

    move-object/from16 v6, v20

    move-object/from16 v0, p1

    invoke-static/range {v0 .. v19}, Lk71/z;->K(Landroidx/compose/ui/Modifier;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly71/g;Lkd1/l;FLm91/u;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    goto :goto_5

    :cond_a
    move-object/from16 v16, v3

    invoke-virtual/range {v16 .. v16}, Lp1/q;->X()V

    :goto_5
    invoke-virtual/range {v16 .. v16}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_b

    new-instance v0, La11/e;

    const/16 v6, 0xc

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, La11/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method
