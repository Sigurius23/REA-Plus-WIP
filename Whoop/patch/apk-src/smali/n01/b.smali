.class public final Ln01/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Ln01/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Ln01/b;",
        "Lm91/f;",
        "Ln01/e;",
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
        "(Landroidx/compose/ui/Modifier;Ln01/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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

.method public static synthetic a(Ln01/e;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ZLjava/util/List;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ln01/b;->d(Ln01/e;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ZLjava/util/List;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ln01/b;Landroidx/compose/ui/Modifier;Ln01/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ln01/b;->e(Ln01/b;Landroidx/compose/ui/Modifier;Ln01/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ln01/e;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ZLjava/util/List;)Ll83/a0;
    .locals 5

    const-string v0, "cellId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultingSelection"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ln01/a;->a:Ln01/a;

    invoke-virtual {p0}, Ln01/e;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ln01/e;->c()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lry0/d;

    invoke-virtual {v4}, Lry0/d;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    move-object v2, p4

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    invoke-virtual {p0}, Ln01/e;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v3, v2, v4}, Ln01/a;->a(Ljava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0, p2, p3, p4}, Ln01/d;->j(Ln01/e;Ljava/lang/String;ZLjava/util/List;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, p0, p1}, Ln01/d;->k(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Ln01/b;Landroidx/compose/ui/Modifier;Ln01/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Ln01/b;->c(Landroidx/compose/ui/Modifier;Ln01/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Ln01/e;

    invoke-virtual/range {p0 .. p5}, Ln01/b;->c(Landroidx/compose/ui/Modifier;Ln01/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public c(Landroidx/compose/ui/Modifier;Ln01/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ln01/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move v8, p5

    const-string v1, "modifier"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "itemState"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onViewEvent"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p4

    check-cast v5, Lp1/q;

    const v1, 0x33b49eed

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v8, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v5, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v8

    goto :goto_1

    :cond_1
    move v1, v8

    :goto_1
    and-int/lit8 v3, v8, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v5, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit16 v3, v8, 0x180

    const/16 v4, 0x100

    if-nez v3, :cond_5

    invoke-virtual {v5, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    move v3, v4

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v1, v3

    :cond_5
    and-int/lit16 v3, v1, 0x93

    const/16 v6, 0x92

    const/4 v7, 0x0

    const/4 v9, 0x1

    if-eq v3, v6, :cond_6

    move v3, v9

    goto :goto_4

    :cond_6
    move v3, v7

    :goto_4
    and-int/lit8 v6, v1, 0x1

    invoke-virtual {v5, v6, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual {v5, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    and-int/lit16 v6, v1, 0x380

    if-ne v6, v4, :cond_7

    move v7, v9

    :cond_7
    or-int/2addr v3, v7

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_8

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v4, v3, :cond_9

    :cond_8
    new-instance v4, Lih1/f;

    const/16 v3, 0x1a

    invoke-direct {v4, v3, p2, p3}, Lih1/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v4, Lkotlin/jvm/functions/Function3;

    and-int/lit8 v3, v1, 0xe

    shl-int/lit8 v1, v1, 0x3

    and-int/lit16 v1, v1, 0x380

    or-int v6, v3, v1

    const/16 v7, 0xa

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    move-object v2, p2

    invoke-static/range {v0 .. v7}, Ln01/d;->e(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Ln01/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_a
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_b

    new-instance v0, Lmh0/b;

    const/16 v2, 0xc

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move v1, v8

    invoke-direct/range {v0 .. v6}, Lmh0/b;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method
