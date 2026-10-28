.class public final Lc41/o3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lc41/v3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lc41/o3;",
        "Lm91/f;",
        "Lc41/v3;",
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
        "(Landroidx/compose/ui/Modifier;Lc41/v3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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

.method public static synthetic a(Lc41/o3;Landroidx/compose/ui/Modifier;Lc41/v3;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lc41/o3;->c(Lc41/o3;Landroidx/compose/ui/Modifier;Lc41/v3;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lc41/o3;Landroidx/compose/ui/Modifier;Lc41/v3;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lc41/o3;->b(Landroidx/compose/ui/Modifier;Lc41/v3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Lc41/v3;

    invoke-virtual/range {p0 .. p5}, Lc41/o3;->b(Landroidx/compose/ui/Modifier;Lc41/v3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public b(Landroidx/compose/ui/Modifier;Lc41/v3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lc41/v3;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v3, p2

    move-object/from16 v15, p3

    move/from16 v0, p5

    const-string v1, "modifier"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "itemState"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onViewEvent"

    invoke-static {v15, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p4

    check-cast v1, Lp1/q;

    const v4, -0xd49ba7e

    invoke-virtual {v1, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v0, 0x30

    if-nez v4, :cond_2

    and-int/lit8 v4, v0, 0x40

    if-nez v4, :cond_0

    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_0
    if-eqz v4, :cond_1

    const/16 v4, 0x20

    goto :goto_1

    :cond_1
    const/16 v4, 0x10

    :goto_1
    or-int/2addr v4, v0

    goto :goto_2

    :cond_2
    move v4, v0

    :goto_2
    and-int/lit16 v5, v0, 0x180

    if-nez v5, :cond_4

    invoke-virtual {v1, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x100

    goto :goto_3

    :cond_3
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v4, v5

    :cond_4
    and-int/lit16 v5, v4, 0x91

    const/16 v6, 0x90

    const/4 v7, 0x0

    if-eq v5, v6, :cond_5

    const/4 v5, 0x1

    goto :goto_4

    :cond_5
    move v5, v7

    :goto_4
    and-int/lit8 v6, v4, 0x1

    invoke-virtual {v1, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v3}, Lc41/v3;->b()I

    move-result v5

    move v6, v4

    invoke-virtual {v3}, Lc41/v3;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move v8, v6

    invoke-virtual {v3}, Lc41/v3;->h()I

    move-result v6

    invoke-virtual {v3}, Lc41/v3;->g()Ly81/e;

    move-result-object v9

    invoke-interface {v9, v1, v7}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    move-wide v10, v9

    invoke-virtual {v3}, Lc41/v3;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v3}, Lc41/v3;->f()Ly81/e;

    move-result-object v12

    invoke-interface {v12, v1, v7}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    move-wide/from16 v19, v12

    move-wide v13, v10

    move-wide/from16 v10, v19

    invoke-virtual {v3}, Lc41/v3;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v3}, Lc41/v3;->c()Ly81/e;

    move-result-object v0

    invoke-interface {v0, v1, v7}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v16

    shl-int/lit8 v0, v8, 0x12

    const/high16 v7, 0xe000000

    and-int/2addr v0, v7

    const/16 v18, 0x0

    move-wide v7, v13

    move-wide/from16 v13, v16

    move/from16 v17, v0

    move-object/from16 v16, v1

    invoke-static/range {v4 .. v18}, Lc41/u3;->n(Lcom/whoop/design/util/TextResource;IIJLcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;JLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_6
    move-object/from16 v16, v1

    invoke-virtual/range {v16 .. v16}, Lp1/q;->X()V

    :goto_5
    invoke-virtual/range {v16 .. v16}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_7

    new-instance v0, Lbm2/d1;

    const/16 v6, 0x16

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lbm2/d1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ll83/e;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method
