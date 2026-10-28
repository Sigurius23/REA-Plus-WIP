.class public final Ly11/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Ly11/l;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Ly11/h;",
        "Lm91/f;",
        "Ly11/l;",
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
        "(Landroidx/compose/ui/Modifier;Ly11/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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


# static fields
.field public static final a:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ly11/l;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ly11/h;->e(Lkotlin/jvm/functions/Function1;Ly11/l;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ly11/h;Landroidx/compose/ui/Modifier;Ly11/l;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ly11/h;->f(Ly11/h;Landroidx/compose/ui/Modifier;Ly11/l;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;Ly11/l;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Ly11/l;->getEvent()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Ly11/h;Landroidx/compose/ui/Modifier;Ly11/l;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Ly11/h;->c(Landroidx/compose/ui/Modifier;Ly11/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    check-cast p2, Ly11/l;

    invoke-virtual/range {p0 .. p5}, Ly11/h;->c(Landroidx/compose/ui/Modifier;Ly11/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public bridge synthetic Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 2
    check-cast p1, Ly11/l;

    invoke-virtual {p0, p1, p2, p3, p4}, Ly11/h;->d(Ly11/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public c(Landroidx/compose/ui/Modifier;Ly11/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ly11/l;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    const-string v0, "modifier"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemState"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v1, -0x76f85379

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v5, 0x30

    if-nez v1, :cond_1

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x20

    goto :goto_0

    :cond_0
    const/16 v1, 0x10

    :goto_0
    or-int/2addr v1, v5

    goto :goto_1

    :cond_1
    move v1, v5

    :goto_1
    and-int/lit16 v6, v5, 0x180

    if-nez v6, :cond_3

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x100

    goto :goto_2

    :cond_2
    const/16 v6, 0x80

    :goto_2
    or-int/2addr v1, v6

    :cond_3
    and-int/lit16 v6, v1, 0x91

    const/16 v8, 0x90

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eq v6, v8, :cond_4

    move v6, v9

    goto :goto_3

    :cond_4
    move v6, v10

    :goto_3
    and-int/lit8 v8, v1, 0x1

    invoke-virtual {v0, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-virtual {v3}, Ly11/l;->g()Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v3}, Ly11/l;->o()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    move-object v11, v8

    invoke-virtual {v3}, Ly11/l;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    move v12, v9

    invoke-virtual {v3}, Ly11/l;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v3}, Ly11/l;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    move-object v14, v11

    invoke-virtual {v3}, Ly11/l;->n()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v3}, Ly11/l;->e()Ly11/a;

    move-result-object v15

    invoke-virtual {v15, v0, v10}, Ly11/a;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v15

    move-object/from16 v17, v14

    invoke-virtual {v3}, Ly11/l;->q()Z

    move-result v14

    move/from16 v18, v12

    move-wide/from16 v28, v15

    move-object/from16 v16, v13

    move-wide/from16 v12, v28

    invoke-virtual {v3}, Ly11/l;->p()Z

    move-result v15

    move-object/from16 v19, v16

    invoke-virtual {v3}, Ly11/l;->i()Ljava/util/List;

    move-result-object v16

    move-object/from16 v20, v17

    invoke-virtual {v3}, Ly11/l;->j()Z

    move-result v17

    move/from16 v21, v18

    invoke-virtual {v3}, Ly11/l;->c()Ll83/k;

    move-result-object v18

    invoke-virtual {v3}, Ly11/l;->q()Z

    move-result v22

    if-nez v22, :cond_6

    invoke-virtual {v3}, Ly11/l;->p()Z

    move-result v22

    if-eqz v22, :cond_5

    goto :goto_4

    :cond_5
    move/from16 v22, v10

    goto :goto_5

    :cond_6
    :goto_4
    move/from16 v22, v21

    :goto_5
    invoke-static/range {v22 .. v22}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    const-string v2, "HorizontalTimeGraph Transition"

    const/16 v5, 0x30

    invoke-static {v7, v2, v0, v5, v10}, Ld0/d2;->f(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/z1;

    move-result-object v2

    move-object/from16 v7, v20

    invoke-virtual {v3}, Ly11/l;->k()Z

    move-result v20

    move/from16 v5, v21

    invoke-virtual {v3}, Ly11/l;->f()Z

    move-result v21

    invoke-virtual {v3}, Ly11/l;->m()Lcom/whoop/design/models/items/graph/LayoutDirection;

    move-result-object v22

    and-int/lit16 v1, v1, 0x380

    const/16 v5, 0x100

    if-ne v1, v5, :cond_7

    const/4 v10, 0x1

    :cond_7
    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v1, v10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_8

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v5, v1, :cond_9

    :cond_8
    new-instance v5, Lwr0/r;

    const/16 v1, 0xf

    invoke-direct {v5, v4, v3, v1}, Lwr0/r;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object/from16 v23, v5

    check-cast v23, Lc93/a;

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v25, 0x0

    move-object/from16 v24, v0

    move-object/from16 v10, v19

    move-object/from16 v19, v2

    invoke-static/range {v6 .. v27}, Ly11/k;->i(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JZZLjava/util/List;ZLl83/k;Ld0/z1;ZZLcom/whoop/design/models/items/graph/LayoutDirection;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    goto :goto_6

    :cond_a
    move-object/from16 v24, v0

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    :goto_6
    invoke-virtual/range {v24 .. v24}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_b

    new-instance v0, Lxn2/d;

    const/16 v6, 0x12

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lxn2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method public bridge d(Ly11/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly11/l;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    invoke-super {p0, p1, p2, p3, p4}, Lm91/f;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
