.class public final Lwo1/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lso1/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lwo1/d0;",
        "Lm91/f;",
        "Lso1/c;",
        "<init>",
        "()V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "g",
        "(Landroidx/compose/ui/Modifier;Lso1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "hormonal-insights_release"
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

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lso1/c;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lwo1/d0;->k(Lkotlin/jvm/functions/Function1;Lso1/c;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lyn1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lwo1/d0;->i(Lkotlin/jvm/functions/Function1;Lyn1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lro1/g;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lwo1/d0;->h(Lkotlin/jvm/functions/Function1;Lro1/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lwo1/d0;Landroidx/compose/ui/Modifier;Lso1/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lwo1/d0;->m(Lwo1/d0;Landroidx/compose/ui/Modifier;Lso1/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lso1/c;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lwo1/d0;->j(Lkotlin/jvm/functions/Function1;Lso1/c;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Lyn1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lwo1/d0;->l(Lkotlin/jvm/functions/Function1;Lyn1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Lro1/g;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lro1/g$e;

    if-eqz v0, :cond_0

    check-cast p1, Lro1/g$e;

    invoke-virtual {p1}, Lro1/g$e;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;Lyn1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Lso1/c;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lso1/a0$d;

    invoke-virtual {p1}, Lso1/c;->l()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p2, p1}, Lso1/a0$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;Lso1/c;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lso1/a0$d;

    invoke-virtual {p1}, Lso1/c;->j()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lso1/a0$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lyn1/a$v;->a:Lyn1/a$v;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lkotlin/jvm/functions/Function1;Lyn1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lwo1/d0;Landroidx/compose/ui/Modifier;Lso1/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lwo1/d0;->g(Landroidx/compose/ui/Modifier;Lso1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Lso1/c;

    invoke-virtual/range {p0 .. p5}, Lwo1/d0;->g(Landroidx/compose/ui/Modifier;Lso1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public g(Landroidx/compose/ui/Modifier;Lso1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lso1/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p2

    move-object/from16 v8, p3

    move/from16 v9, p5

    const-string v1, "modifier"

    move-object/from16 v10, p1

    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "itemState"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onViewEvent"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p4

    check-cast v3, Lp1/q;

    const v1, 0x2e05aa6

    invoke-virtual {v3, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v9, 0x30

    if-nez v1, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x20

    goto :goto_0

    :cond_0
    const/16 v1, 0x10

    :goto_0
    or-int/2addr v1, v9

    goto :goto_1

    :cond_1
    move v1, v9

    :goto_1
    and-int/lit16 v2, v9, 0x180

    const/16 v4, 0x100

    if-nez v2, :cond_3

    invoke-virtual {v3, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v4

    goto :goto_2

    :cond_2
    const/16 v2, 0x80

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v1, 0x91

    const/16 v5, 0x90

    const/4 v6, 0x1

    const/4 v11, 0x0

    if-eq v2, v5, :cond_4

    move v2, v6

    goto :goto_3

    :cond_4
    move v2, v11

    :goto_3
    and-int/lit8 v5, v1, 0x1

    invoke-virtual {v3, v5, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_15

    and-int/lit16 v2, v1, 0x380

    if-ne v2, v4, :cond_5

    move v5, v6

    goto :goto_4

    :cond_5
    move v5, v11

    :goto_4
    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_6

    if-ne v7, v12, :cond_7

    :cond_6
    new-instance v7, Lwo1/h;

    const/4 v5, 0x6

    invoke-direct {v7, v8, v5}, Lwo1/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v3, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0}, Lso1/c;->p()Z

    move-result v5

    if-eqz v5, :cond_b

    const v5, -0x45a48dad

    invoke-virtual {v3, v5}, Lp1/q;->e0(I)V

    if-ne v2, v4, :cond_8

    goto :goto_5

    :cond_8
    move v6, v11

    :goto_5
    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v6, :cond_9

    if-ne v2, v12, :cond_a

    :cond_9
    new-instance v2, Lwo1/h;

    const/4 v4, 0x7

    invoke-direct {v2, v8, v4}, Lwo1/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v3, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v2, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v1, v1, 0x3

    and-int/lit8 v4, v1, 0xe

    const/4 v5, 0x0

    move-object v1, v7

    invoke-static/range {v0 .. v5}, Lwo1/h0;->g(Lso1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v3, v11}, Lp1/q;->q(Z)V

    goto/16 :goto_9

    :cond_b
    const v5, -0x45a1371e

    invoke-virtual {v3, v5}, Lp1/q;->e0(I)V

    if-ne v2, v4, :cond_c

    move v5, v6

    goto :goto_6

    :cond_c
    move v5, v11

    :goto_6
    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v5, v13

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v5, :cond_d

    if-ne v13, v12, :cond_e

    :cond_d
    new-instance v13, Lwo1/c0;

    const/4 v5, 0x0

    invoke-direct {v13, v0, v8, v5}, Lwo1/c0;-><init>(Lso1/c;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v3, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v13, Lkotlin/jvm/functions/Function1;

    if-ne v2, v4, :cond_f

    move v5, v6

    goto :goto_7

    :cond_f
    move v5, v11

    :goto_7
    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v5, v14

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v5, :cond_10

    if-ne v14, v12, :cond_11

    :cond_10
    new-instance v14, Lwo1/c0;

    const/4 v5, 0x1

    invoke-direct {v14, v0, v8, v5}, Lwo1/c0;-><init>(Lso1/c;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v3, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v14, Lkotlin/jvm/functions/Function1;

    if-ne v2, v4, :cond_12

    goto :goto_8

    :cond_12
    move v6, v11

    :goto_8
    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v6, :cond_13

    if-ne v2, v12, :cond_14

    :cond_13
    new-instance v2, Lwo1/h;

    const/16 v4, 0x8

    invoke-direct {v2, v8, v4}, Lwo1/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v3, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object v4, v2

    check-cast v4, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v1, v1, 0x3

    and-int/lit8 v6, v1, 0xe

    move-object v1, v7

    const/4 v7, 0x0

    move-object v5, v3

    move-object v2, v14

    move-object v3, v1

    move-object v1, v13

    invoke-static/range {v0 .. v7}, Lwo1/f0;->i(Lso1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v5

    invoke-virtual {v3, v11}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_15
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_16

    new-instance v0, Lwm1/e;

    const/16 v6, 0x9

    move-object v1, p0

    move-object/from16 v3, p2

    move-object v4, v8

    move v5, v9

    move-object v2, v10

    invoke-direct/range {v0 .. v6}, Lwm1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method
