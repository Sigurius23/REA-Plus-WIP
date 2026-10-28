.class public final Lc41/w4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lc41/a5;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lc41/w4;",
        "Lm91/f;",
        "Lc41/a5;",
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
        "(Landroidx/compose/ui/Modifier;Lc41/a5;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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

.method public static synthetic a(Lc41/w4;Landroidx/compose/ui/Modifier;Lc41/a5;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lc41/w4;->d(Lc41/w4;Landroidx/compose/ui/Modifier;Lc41/a5;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lc41/w4;Landroidx/compose/ui/Modifier;Lc41/a5;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lc41/w4;->b(Landroidx/compose/ui/Modifier;Lc41/a5;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    check-cast p2, Lc41/a5;

    invoke-virtual/range {p0 .. p5}, Lc41/w4;->b(Landroidx/compose/ui/Modifier;Lc41/a5;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public bridge synthetic Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 2
    check-cast p1, Lc41/a5;

    invoke-virtual {p0, p1, p2, p3, p4}, Lc41/w4;->c(Lc41/a5;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public b(Landroidx/compose/ui/Modifier;Lc41/a5;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lc41/a5;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v12, p3

    move/from16 v2, p5

    const-string v3, "modifier"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "itemState"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onViewEvent"

    invoke-static {v12, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p4

    check-cast v13, Lp1/q;

    const v3, 0x12981f42

    invoke-virtual {v13, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v4, v2, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit16 v4, v2, 0x180

    if-nez v4, :cond_5

    invoke-virtual {v13, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v3, v4

    :cond_5
    and-int/lit16 v4, v3, 0x93

    const/16 v5, 0x92

    if-eq v4, v5, :cond_6

    const/4 v4, 0x1

    goto :goto_4

    :cond_6
    const/4 v4, 0x0

    :goto_4
    and-int/lit8 v5, v3, 0x1

    invoke-virtual {v13, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-virtual/range {p2 .. p2}, Lc41/a5;->c()Ly81/f;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Lc41/a5;->e()Ljava/util/List;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Lc41/a5;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move-object v5, v4

    invoke-virtual/range {p2 .. p2}, Lc41/a5;->n()Z

    move-result v4

    move-object v6, v5

    invoke-virtual/range {p2 .. p2}, Lc41/a5;->m()Z

    move-result v5

    move-object v7, v6

    invoke-virtual/range {p2 .. p2}, Lc41/a5;->j()Lhy0/h1;

    move-result-object v6

    move-object v8, v7

    invoke-virtual/range {p2 .. p2}, Lc41/a5;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    move-object v9, v8

    invoke-virtual/range {p2 .. p2}, Lc41/a5;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    move-object v10, v9

    invoke-virtual/range {p2 .. p2}, Lc41/a5;->k()Lkotlin/jvm/functions/Function1;

    move-result-object v9

    move-object v11, v10

    invoke-virtual/range {p2 .. p2}, Lc41/a5;->i()Lc93/a;

    move-result-object v10

    move-object v14, v11

    invoke-virtual/range {p2 .. p2}, Lc41/a5;->g()Lc93/a;

    move-result-object v11

    move-object v15, v14

    and-int/lit8 v14, v3, 0xe

    and-int/lit16 v3, v3, 0x380

    const/16 v16, 0x0

    move-object/from16 v17, v15

    move v15, v3

    move-object/from16 v3, v17

    invoke-static/range {v0 .. v16}, Lc41/y4;->n(Landroidx/compose/ui/Modifier;Ly81/f;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZZLhy0/h1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    goto :goto_5

    :cond_7
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_8

    new-instance v0, Lbm2/d1;

    const/16 v6, 0x1c

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lbm2/d1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ll83/e;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method public bridge c(Lc41/a5;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc41/a5;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    invoke-super {p0, p1, p2, p3, p4}, Lm91/f;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
