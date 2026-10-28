.class public final Lbm2/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lbm2/l1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lbm2/e1;",
        "Lm91/f;",
        "Lbm2/l1;",
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
        "(Landroidx/compose/ui/Modifier;Lbm2/l1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "trends_release"
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

.method public static synthetic a(Lbm2/e1;Landroidx/compose/ui/Modifier;Lbm2/l1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lbm2/e1;->d(Lbm2/e1;Landroidx/compose/ui/Modifier;Lbm2/l1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lbm2/e1;Landroidx/compose/ui/Modifier;Lbm2/l1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lbm2/e1;->b(Landroidx/compose/ui/Modifier;Lbm2/l1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    check-cast p2, Lbm2/l1;

    invoke-virtual/range {p0 .. p5}, Lbm2/e1;->b(Landroidx/compose/ui/Modifier;Lbm2/l1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public bridge synthetic Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 2
    check-cast p1, Lbm2/l1;

    invoke-virtual {p0, p1, p2, p3, p4}, Lbm2/e1;->c(Lbm2/l1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public b(Landroidx/compose/ui/Modifier;Lbm2/l1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lbm2/l1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v3, p2

    const-string v0, "modifier"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemState"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p4

    check-cast v15, Lp1/q;

    const v0, -0x398fde94

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x30

    const/16 v1, 0x10

    if-nez v0, :cond_1

    invoke-virtual {v15, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x20

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int v0, p5, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p5

    :goto_1
    and-int/lit8 v5, v0, 0x11

    const/4 v6, 0x1

    if-eq v5, v1, :cond_2

    move v1, v6

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    and-int/2addr v0, v6

    invoke-virtual {v15, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v3}, Lbm2/l1;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v3}, Lbm2/l1;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v3}, Lbm2/l1;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v3}, Lbm2/l1;->g()Lbm2/u0;

    move-result-object v8

    invoke-virtual {v3}, Lbm2/l1;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v3}, Lbm2/l1;->e()Ly81/e;

    move-result-object v11

    invoke-virtual {v3}, Lbm2/l1;->i()Lul2/b;

    move-result-object v10

    invoke-virtual {v3}, Lbm2/l1;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v3}, Lbm2/l1;->b()Ly81/e;

    move-result-object v13

    invoke-virtual {v3}, Lbm2/l1;->j()Lbm2/v0;

    move-result-object v14

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v1, v0, 0x3

    or-int/2addr v1, v0

    shl-int/lit8 v16, v0, 0x6

    or-int v1, v1, v16

    shl-int/lit8 v16, v0, 0xc

    or-int v1, v1, v16

    shl-int/lit8 v0, v0, 0x15

    or-int v16, v1, v0

    const/16 v17, 0x0

    invoke-static/range {v5 .. v17}, Lbm2/k1;->u(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lbm2/u0;Lcom/whoop/design/util/TextResource;Lul2/b;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Lbm2/v0;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_3
    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_4

    new-instance v0, Lbm2/d1;

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lbm2/d1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ll83/e;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method public bridge c(Lbm2/l1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbm2/l1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    invoke-super {p0, p1, p2, p3, p4}, Lm91/f;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
