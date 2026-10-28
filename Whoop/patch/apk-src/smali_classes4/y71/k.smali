.class public final Ly71/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Ly71/o;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Ly71/k;",
        "Lm91/f;",
        "Ly71/o;",
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
        "(Landroidx/compose/ui/Modifier;Ly71/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ly71/o;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ly71/k;->f(Lkotlin/jvm/functions/Function1;Ly71/o;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ly71/o;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Ly71/k;->g(Ly71/o;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ly71/o;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ly71/k;->h(Lkotlin/jvm/functions/Function1;Ly71/o;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ly71/k;Landroidx/compose/ui/Modifier;Ly71/o;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ly71/k;->i(Ly71/k;Landroidx/compose/ui/Modifier;Ly71/o;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Ly71/o;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Ly71/o;->getEvent()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Ly71/o;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Ly71/o;->j()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ly71/o;->h()Lcom/whoop/navigation/e;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ly71/o;->getEvent()Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Ly71/o;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Ly71/o;->getEvent()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Ly71/k;Landroidx/compose/ui/Modifier;Ly71/o;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Ly71/k;->e(Landroidx/compose/ui/Modifier;Ly71/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Ly71/o;

    invoke-virtual/range {p0 .. p5}, Ly71/k;->e(Landroidx/compose/ui/Modifier;Ly71/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public e(Landroidx/compose/ui/Modifier;Ly71/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ly71/o;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move/from16 v7, p5

    const-string v1, "modifier"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "itemState"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onViewEvent"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p4

    check-cast v4, Lp1/q;

    const v1, -0x4e6d25d0

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v7, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v7

    goto :goto_1

    :cond_1
    move v1, v7

    :goto_1
    and-int/lit8 v3, v7, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit16 v3, v7, 0x180

    const/16 v5, 0x100

    if-nez v3, :cond_5

    invoke-virtual {v4, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    move v3, v5

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v1, v3

    :cond_5
    and-int/lit16 v3, v1, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eq v3, v8, :cond_6

    move v3, v9

    goto :goto_4

    :cond_6
    move v3, v10

    :goto_4
    and-int/lit8 v8, v1, 0x1

    invoke-virtual {v4, v8, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-virtual {p2}, Ly71/o;->c()Ly71/l;

    move-result-object v3

    instance-of v8, v3, Ly71/l$a;

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-eqz v8, :cond_a

    const v8, -0x67bad7bf

    invoke-virtual {v4, v8}, Lp1/q;->e0(I)V

    check-cast v3, Ly71/l$a;

    and-int/lit16 v8, v1, 0x380

    if-ne v8, v5, :cond_7

    goto :goto_5

    :cond_7
    move v9, v10

    :goto_5
    invoke-virtual {v4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v5, v9

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v5, :cond_8

    if-ne v8, v11, :cond_9

    :cond_8
    new-instance v8, Lam2/n0;

    const/4 v5, 0x1

    invoke-direct {v8, p3, p2, v5}, Lam2/n0;-><init>(Lkotlin/jvm/functions/Function1;Ly71/o;I)V

    invoke-virtual {v4, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v8, Lc93/a;

    shr-int/lit8 v5, v1, 0x3

    and-int/lit8 v5, v5, 0xe

    shl-int/lit8 v1, v1, 0x6

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v5, v1

    move-object v2, p1

    move-object v0, p2

    move-object v1, v3

    move-object v3, v8

    invoke-static/range {v0 .. v5}, Ly71/f;->d(Ly71/o;Ly71/l$a;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v10}, Lp1/q;->q(Z)V

    goto/16 :goto_8

    :cond_a
    instance-of v2, v3, Ly71/l$b;

    if-eqz v2, :cond_e

    const v2, -0x67bac391

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    check-cast v3, Ly71/l$b;

    invoke-virtual {v4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit16 v8, v1, 0x380

    if-ne v8, v5, :cond_b

    goto :goto_6

    :cond_b
    move v9, v10

    :goto_6
    or-int/2addr v2, v9

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_c

    if-ne v5, v11, :cond_d

    :cond_c
    new-instance v5, Lam2/n0;

    const/4 v2, 0x2

    invoke-direct {v5, p2, p3, v2}, Lam2/n0;-><init>(Ly71/o;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v5, Lc93/a;

    shr-int/lit8 v2, v1, 0x3

    and-int/lit8 v2, v2, 0xe

    shl-int/lit8 v1, v1, 0x6

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v1, v2

    move-object v0, v5

    move v5, v1

    move-object v1, v3

    move-object v3, v0

    move-object v2, p1

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Ly71/i;->f(Ly71/o;Ly71/l$b;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v10}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_e
    instance-of v2, v3, Ly71/l$c;

    if-eqz v2, :cond_12

    const v2, -0x67ba9357

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    check-cast v3, Ly71/l$c;

    and-int/lit16 v2, v1, 0x380

    if-ne v2, v5, :cond_f

    goto :goto_7

    :cond_f
    move v9, v10

    :goto_7
    invoke-virtual {v4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v2, v9

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_10

    if-ne v5, v11, :cond_11

    :cond_10
    new-instance v5, Lam2/n0;

    const/4 v2, 0x3

    invoke-direct {v5, p3, p2, v2}, Lam2/n0;-><init>(Lkotlin/jvm/functions/Function1;Ly71/o;I)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v5, Lc93/a;

    shr-int/lit8 v2, v1, 0x3

    and-int/lit8 v2, v2, 0xe

    shl-int/lit8 v1, v1, 0x6

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v1, v2

    move-object v0, v5

    move v5, v1

    move-object v1, v3

    move-object v3, v0

    move-object v2, p1

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Ly71/i;->h(Ly71/o;Ly71/l$c;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v10}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_12
    const v0, -0x67bae2dc

    invoke-static {v0, v4, v10}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_13
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_14

    new-instance v0, Ly71/j;

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, v7

    invoke-direct/range {v0 .. v6}, Ly71/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method
