.class public abstract Lf01/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lf01/d;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Lf01/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "a",
        "Lf01/d;",
        "fakeActionCardState",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lf01/d;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lf01/d;

    const-string v1, "New impact unlocked"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v1, "Lorem ipsum dolor sit amet, consetetur. Lorem ipsum dolor sit amet, consetetur. Lorem ipsum dolor sit amet, consetetur. Lorem ipsum dolor sit amet, consetetur. Lorem ipsum dolor sit amet, consetetur."

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v1, "BUTTON TEXT"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v7, Lkd1/o$a;

    sget v1, Lgy0/a;->s:I

    invoke-direct {v7, v1}, Lkd1/o$a;-><init>(I)V

    sget-object v8, Lh01/a;->DEFAULT:Lh01/a;

    const/16 v10, 0x30

    const/4 v11, 0x0

    const-string v1, ""

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v0 .. v11}, Lf01/d;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lf01/r;Lkd1/o;Lh01/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lf01/c;->a:Lf01/d;

    return-void
.end method

.method public static synthetic a(Lf01/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lf01/c;->e(Lf01/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lf01/d;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lf01/c;->d(Lkotlin/jvm/functions/Function1;Lf01/d;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lf01/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf01/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onViewEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, -0x12edc3c8

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v2, 0x6

    const/4 v5, 0x4

    if-nez v4, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v6, v2, 0x30

    const/16 v7, 0x20

    if-nez v6, :cond_3

    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    move v6, v7

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_3
    and-int/lit8 v6, v4, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v6, v8, :cond_4

    move v6, v10

    goto :goto_3

    :cond_4
    move v6, v9

    :goto_3
    and-int/lit8 v8, v4, 0x1

    invoke-virtual {v3, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_a

    move v6, v4

    invoke-virtual {v0}, Lf01/d;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lf01/d;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v0}, Lf01/d;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    move-object v11, v8

    invoke-static {}, Lh01/d;->a()Ll0/k1;

    move-result-object v8

    move v12, v9

    invoke-virtual {v0}, Lf01/d;->g()Lh01/a;

    move-result-object v9

    move v14, v10

    sget-object v10, Lkd1/l;->NONE:Lkd1/l;

    invoke-virtual {v0}, Lf01/d;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    if-nez v15, :cond_5

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    :cond_5
    move/from16 v16, v12

    invoke-virtual {v0}, Lf01/d;->f()Lkd1/o;

    move-result-object v12

    invoke-virtual {v0}, Lf01/d;->c()Lgz0/m0;

    move-result-object v18

    and-int/lit8 v14, v6, 0x70

    if-ne v14, v7, :cond_6

    const/4 v7, 0x1

    goto :goto_4

    :cond_6
    move/from16 v7, v16

    :goto_4
    and-int/lit8 v6, v6, 0xe

    if-ne v6, v5, :cond_7

    const/16 v16, 0x1

    :cond_7
    or-int v5, v7, v16

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_8

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v6, v5, :cond_9

    :cond_8
    new-instance v6, Lcom/whoop/profile/view/edit/n;

    const/16 v5, 0x18

    invoke-direct {v6, v5, v1, v0}, Lcom/whoop/profile/view/edit/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object/from16 v20, v6

    check-cast v20, Lkotlin/jvm/functions/Function1;

    const/high16 v23, 0x30000

    const/16 v24, 0x3c08

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v14, 0x0

    move-object v5, v11

    move-object v11, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const v22, 0x180180

    move-object/from16 v21, v3

    invoke-static/range {v4 .. v24}, Lh01/p;->A(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLl0/k1;Lh01/a;Lkd1/l;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/navigation/e;ZLgz0/m0;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    goto :goto_5

    :cond_a
    move-object/from16 v21, v3

    invoke-virtual/range {v21 .. v21}, Lp1/q;->X()V

    :goto_5
    invoke-virtual/range {v21 .. v21}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_b

    new-instance v4, Lf01/b;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v1, v2, v5}, Lf01/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Lf01/d;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lh01/r;

    if-eqz v0, :cond_0

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lf01/d;->a()Lf01/r;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lf01/d;->h()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lf01/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lf01/c;->c(Lf01/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
