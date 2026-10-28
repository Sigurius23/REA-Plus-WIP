.class public final Lwo1/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lso1/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lwo1/s;",
        "Lm91/f;",
        "Lso1/b;",
        "<init>",
        "()V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "f",
        "(Landroidx/compose/ui/Modifier;Lso1/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/time/LocalDate;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lwo1/s;->i(Lkotlin/jvm/functions/Function1;Ljava/time/LocalDate;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lvy0/y;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lwo1/s;->j(Lkotlin/jvm/functions/Function1;Lvy0/y;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lwo1/s;Landroidx/compose/ui/Modifier;Lso1/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lwo1/s;->k(Lwo1/s;Landroidx/compose/ui/Modifier;Lso1/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p2, p1, p0}, Lwo1/s;->g(Lkotlin/jvm/functions/Function1;ILjava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lwo1/s;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;ILjava/lang/String;)Ll83/a0;
    .locals 0

    const-string p1, "date"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lwo1/u$a;

    invoke-direct {p1, p2}, Lwo1/u$a;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwo1/u$c;

    invoke-direct {v0, p1}, Lwo1/u$c;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;Ljava/time/LocalDate;)Ll83/a0;
    .locals 1

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwo1/u$b;

    invoke-direct {v0, p1}, Lwo1/u$b;-><init>(Ljava/time/LocalDate;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Lvy0/y;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwo1/u$d;

    invoke-direct {v0, p1}, Lwo1/u$d;-><init>(Lvy0/y;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lwo1/s;Landroidx/compose/ui/Modifier;Lso1/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lwo1/s;->f(Landroidx/compose/ui/Modifier;Lso1/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Lso1/b;

    invoke-virtual/range {p0 .. p5}, Lwo1/s;->f(Landroidx/compose/ui/Modifier;Lso1/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public f(Landroidx/compose/ui/Modifier;Lso1/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lso1/b;",
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

    move-object/from16 v5, p4

    check-cast v5, Lp1/q;

    const v1, 0x43f1d621

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v9, 0x30

    if-nez v1, :cond_2

    and-int/lit8 v1, v9, 0x40

    if-nez v1, :cond_0

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v1, v9

    goto :goto_2

    :cond_2
    move v1, v9

    :goto_2
    and-int/lit16 v2, v9, 0x180

    const/16 v3, 0x100

    if-nez v2, :cond_4

    invoke-virtual {v5, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_4
    and-int/lit16 v2, v1, 0x91

    const/16 v4, 0x90

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v2, v4, :cond_5

    move v2, v7

    goto :goto_4

    :cond_5
    move v2, v6

    :goto_4
    and-int/lit8 v4, v1, 0x1

    invoke-virtual {v5, v4, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_12

    and-int/lit16 v2, v1, 0x380

    if-ne v2, v3, :cond_6

    move v4, v7

    goto :goto_5

    :cond_6
    move v4, v6

    :goto_5
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v4, :cond_7

    if-ne v11, v12, :cond_8

    :cond_7
    new-instance v11, Lcom/whoop/profile/view/h;

    const/16 v4, 0x9

    invoke-direct {v11, v8, v4}, Lcom/whoop/profile/view/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v11, Lc93/m;

    if-ne v2, v3, :cond_9

    move v4, v7

    goto :goto_6

    :cond_9
    move v4, v6

    :goto_6
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v4, :cond_a

    if-ne v13, v12, :cond_b

    :cond_a
    new-instance v13, Lwo1/h;

    const/4 v4, 0x2

    invoke-direct {v13, v8, v4}, Lwo1/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v13, Lkotlin/jvm/functions/Function1;

    if-ne v2, v3, :cond_c

    move v4, v7

    goto :goto_7

    :cond_c
    move v4, v6

    :goto_7
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v4, :cond_d

    if-ne v14, v12, :cond_e

    :cond_d
    new-instance v14, Lwo1/h;

    const/4 v4, 0x3

    invoke-direct {v14, v8, v4}, Lwo1/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v14, Lkotlin/jvm/functions/Function1;

    if-ne v2, v3, :cond_f

    move v6, v7

    :cond_f
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v6, :cond_10

    if-ne v2, v12, :cond_11

    :cond_10
    new-instance v2, Lwo1/h;

    const/4 v3, 0x4

    invoke-direct {v2, v8, v3}, Lwo1/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object v4, v2

    check-cast v4, Lkotlin/jvm/functions/Function1;

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v3, Lh91/b;->k:I

    or-int/2addr v2, v3

    sget v3, Lvy0/d0;->b:I

    or-int/2addr v2, v3

    shr-int/lit8 v1, v1, 0x3

    and-int/lit8 v1, v1, 0xe

    or-int v6, v2, v1

    const/4 v7, 0x0

    move-object v1, v11

    move-object v2, v13

    move-object v3, v14

    invoke-static/range {v0 .. v7}, Lwo1/t;->l(Lso1/b;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_8

    :cond_12
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_13

    new-instance v0, Lwm1/e;

    const/4 v6, 0x5

    move-object v1, p0

    move-object/from16 v3, p2

    move-object v4, v8

    move v5, v9

    move-object v2, v10

    invoke-direct/range {v0 .. v6}, Lwm1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method
