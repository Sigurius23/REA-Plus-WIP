.class public final Lhy0/x1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lhy0/c2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lhy0/x1;",
        "Lm91/f;",
        "Lhy0/c2;",
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
        "(Landroidx/compose/ui/Modifier;Lhy0/c2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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

.method public static synthetic a(Lhy0/x1;Landroidx/compose/ui/Modifier;Lhy0/c2;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lhy0/x1;->c(Lhy0/x1;Landroidx/compose/ui/Modifier;Lhy0/c2;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lhy0/x1;Landroidx/compose/ui/Modifier;Lhy0/c2;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lhy0/x1;->b(Landroidx/compose/ui/Modifier;Lhy0/c2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Lhy0/c2;

    invoke-virtual/range {p0 .. p5}, Lhy0/x1;->b(Landroidx/compose/ui/Modifier;Lhy0/c2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public b(Landroidx/compose/ui/Modifier;Lhy0/c2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lhy0/c2;",
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

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v1, 0x7f601f40

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p5, 0x30

    const/16 v5, 0x10

    if-nez v1, :cond_2

    and-int/lit8 v1, p5, 0x40

    if-nez v1, :cond_0

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    move v1, v5

    :goto_1
    or-int v1, p5, v1

    goto :goto_2

    :cond_2
    move/from16 v1, p5

    :goto_2
    and-int/lit8 v6, v1, 0x11

    const/4 v7, 0x1

    if-eq v6, v5, :cond_3

    move v5, v7

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    :goto_3
    and-int/2addr v1, v7

    invoke-virtual {v0, v1, v5}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v3}, Lhy0/c2;->o()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v3}, Lhy0/c2;->h()Z

    move-result v6

    invoke-virtual {v3}, Lhy0/c2;->p()Lhy0/b2;

    move-result-object v7

    invoke-virtual {v3}, Lhy0/c2;->r()Z

    move-result v8

    invoke-virtual {v3}, Lhy0/c2;->m()Lhy0/s0;

    move-result-object v11

    invoke-virtual {v3}, Lhy0/c2;->f()Lgz0/m0;

    move-result-object v9

    invoke-virtual {v3}, Lhy0/c2;->q()Z

    move-result v12

    invoke-virtual {v3}, Lhy0/c2;->n()Z

    move-result v15

    invoke-virtual {v3}, Lhy0/c2;->k()I

    move-result v16

    invoke-virtual {v3}, Lhy0/c2;->j()I

    move-result v17

    invoke-virtual {v3}, Lhy0/c2;->g()F

    move-result v13

    invoke-virtual {v3}, Lhy0/c2;->c()Ll0/k1;

    move-result-object v14

    const/16 v22, 0x0

    const/16 v23, 0x6020

    const/4 v10, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    move-object/from16 v20, v0

    invoke-static/range {v5 .. v23}, Lhy0/z1;->e(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;FLhy0/s0;ZFLl0/k1;ZIILb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_4

    :cond_4
    move-object/from16 v20, v0

    invoke-virtual/range {v20 .. v20}, Lp1/q;->X()V

    :goto_4
    invoke-virtual/range {v20 .. v20}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_5

    new-instance v0, Lhy0/d1;

    const/4 v6, 0x2

    move-object/from16 v1, p0

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lhy0/d1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method
