.class public final Lly0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lly0/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lly0/b;",
        "Lm91/f;",
        "Lly0/f;",
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
        "(Landroidx/compose/ui/Modifier;Lly0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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

.method public static synthetic a(Lly0/b;Landroidx/compose/ui/Modifier;Lly0/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lly0/b;->d(Lly0/b;Landroidx/compose/ui/Modifier;Lly0/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lly0/b;Landroidx/compose/ui/Modifier;Lly0/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lly0/b;->b(Landroidx/compose/ui/Modifier;Lly0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    check-cast p2, Lly0/f;

    invoke-virtual/range {p0 .. p5}, Lly0/b;->b(Landroidx/compose/ui/Modifier;Lly0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public bridge synthetic Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 2
    check-cast p1, Lly0/f;

    invoke-virtual {p0, p1, p2, p3, p4}, Lly0/b;->c(Lly0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public b(Landroidx/compose/ui/Modifier;Lly0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lly0/f;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v11, p2

    const-string v1, "modifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "itemState"

    invoke-static {v11, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onViewEvent"

    move-object/from16 v12, p3

    invoke-static {v12, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p4

    check-cast v8, Lp1/q;

    const v1, 0x303a3114

    invoke-virtual {v8, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p5, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p5, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p5

    :goto_1
    and-int/lit8 v2, p5, 0x30

    if-nez v2, :cond_4

    and-int/lit8 v2, p5, 0x40

    if-nez v2, :cond_2

    invoke-virtual {v8, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_2

    :cond_2
    invoke-virtual {v8, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_2
    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_3

    :cond_3
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v1, v2

    :cond_4
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x0

    if-eq v2, v3, :cond_5

    const/4 v2, 0x1

    goto :goto_4

    :cond_5
    move v2, v4

    :goto_4
    and-int/lit8 v3, v1, 0x1

    invoke-virtual {v8, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_a

    move v2, v1

    invoke-virtual {v11}, Lly0/f;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move v3, v2

    invoke-virtual {v11}, Lly0/f;->f()Lb91/a;

    move-result-object v2

    move v5, v3

    invoke-virtual {v11}, Lly0/f;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v11}, Lly0/f;->c()Lly0/a;

    move-result-object v6

    const/4 v7, 0x0

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Lly0/a;->a()Ly71/g;

    move-result-object v6

    goto :goto_5

    :cond_6
    move-object v6, v7

    :goto_5
    invoke-virtual {v11}, Lly0/f;->c()Lly0/a;

    move-result-object v9

    if-eqz v9, :cond_7

    invoke-virtual {v9}, Lly0/a;->b()Ly81/f;

    move-result-object v9

    goto :goto_6

    :cond_7
    move-object v9, v7

    :goto_6
    if-nez v9, :cond_8

    const v9, 0x43dc27fa

    invoke-virtual {v8, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_8
    const v7, 0xa7274e7

    invoke-virtual {v8, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v8, v4}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    invoke-static {v8, v4, v9, v10}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v7

    :goto_7
    if-eqz v7, :cond_9

    iget-wide v9, v7, Li2/x;->a:J

    goto :goto_8

    :cond_9
    sget-wide v9, Li2/x;->m:J

    :goto_8
    invoke-virtual {v11}, Lly0/f;->h()Z

    move-result v7

    and-int/lit8 v4, v5, 0xe

    move-wide v13, v9

    move v9, v4

    move-object v4, v6

    move-wide v5, v13

    const/4 v10, 0x0

    invoke-static/range {v0 .. v10}, Lly0/e;->g(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Ly71/g;JZLandroidx/compose/runtime/Composer;II)V

    goto :goto_9

    :cond_a
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_b

    new-instance v0, Llf0/p1;

    const/16 v2, 0x10

    move-object v3, p0

    move-object/from16 v4, p1

    move/from16 v1, p5

    move-object v5, v11

    move-object v6, v12

    invoke-direct/range {v0 .. v6}, Llf0/p1;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method public bridge c(Lly0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lly0/f;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    invoke-super {p0, p1, p2, p3, p4}, Lm91/f;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
