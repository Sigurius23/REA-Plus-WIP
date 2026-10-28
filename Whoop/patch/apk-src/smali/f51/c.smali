.class public final Lf51/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lf51/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J3\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\nH\u0017\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lf51/c;",
        "Lm91/f;",
        "Lf51/e;",
        "Lm91/p;",
        "itemViewFactory",
        "<init>",
        "(Lm91/p;)V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "b",
        "(Landroidx/compose/ui/Modifier;Lf51/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "a",
        "Lm91/p;",
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


# instance fields
.field private final a:Lm91/p;


# direct methods
.method public constructor <init>(Lm91/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf51/c;->a:Lm91/p;

    return-void
.end method

.method public synthetic constructor <init>(Lm91/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Lf51/c;-><init>(Lm91/p;)V

    return-void
.end method

.method public static synthetic a(Lf51/c;Landroidx/compose/ui/Modifier;Lf51/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lf51/c;->c(Lf51/c;Landroidx/compose/ui/Modifier;Lf51/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lf51/c;Landroidx/compose/ui/Modifier;Lf51/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lf51/c;->b(Landroidx/compose/ui/Modifier;Lf51/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Lf51/e;

    invoke-virtual/range {p0 .. p5}, Lf51/c;->b(Landroidx/compose/ui/Modifier;Lf51/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public b(Landroidx/compose/ui/Modifier;Lf51/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lf51/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move v0, p5

    const-string v5, "modifier"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "itemState"

    invoke-static {p2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onViewEvent"

    invoke-static {p3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p4

    check-cast v6, Lp1/q;

    const v5, 0x3819680e

    invoke-virtual {v6, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_1

    invoke-virtual {v6, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_1
    move v5, v0

    :goto_1
    and-int/lit8 v7, v0, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v6, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v5, v7

    :cond_3
    and-int/lit16 v7, v0, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v6, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v5, v7

    :cond_5
    and-int/lit16 v7, v0, 0xc00

    if-nez v7, :cond_7

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v5, v7

    :cond_7
    and-int/lit16 v7, v5, 0x493

    const/16 v8, 0x492

    const/4 v9, 0x0

    if-eq v7, v8, :cond_8

    const/4 v7, 0x1

    goto :goto_5

    :cond_8
    move v7, v9

    :goto_5
    and-int/lit8 v8, v5, 0x1

    invoke-virtual {v6, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_a

    iget-object v7, p0, Lf51/c;->a:Lm91/p;

    if-nez v7, :cond_9

    const v7, -0x68a041ab

    invoke-virtual {v6, v7}, Lp1/q;->e0(I)V

    invoke-static {}, Lm91/l;->C()Lp1/t1;

    move-result-object v7

    invoke-virtual {v6, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm91/p;

    :goto_6
    invoke-virtual {v6, v9}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_9
    const v8, -0x68a04683

    invoke-virtual {v6, v8}, Lp1/q;->e0(I)V

    goto :goto_6

    :goto_7
    and-int/lit8 v8, v5, 0x7e

    shl-int/lit8 v5, v5, 0x3

    and-int/lit16 v5, v5, 0x1c00

    or-int/2addr v5, v8

    const/4 v8, 0x0

    move-object v2, p1

    move-object v3, p2

    move-object v4, v7

    move v7, v5

    move-object v5, p3

    invoke-static/range {v2 .. v8}, Lf51/d;->h(Landroidx/compose/ui/Modifier;Lf51/e;Lm91/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_8

    :cond_a
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_b

    new-instance v0, Lf01/h1;

    const/4 v6, 0x7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lf01/h1;-><init>(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method
