.class public final Lhh0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lhh0/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lhh0/b;",
        "Lm91/f;",
        "Lhh0/a;",
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
        "(Landroidx/compose/ui/Modifier;Lhh0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "bot_release"
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

.method public static synthetic a(Lhh0/b;Landroidx/compose/ui/Modifier;Lhh0/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lhh0/b;->c(Lhh0/b;Landroidx/compose/ui/Modifier;Lhh0/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lhh0/b;Landroidx/compose/ui/Modifier;Lhh0/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lhh0/b;->b(Landroidx/compose/ui/Modifier;Lhh0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Lhh0/a;

    invoke-virtual/range {p0 .. p5}, Lhh0/b;->b(Landroidx/compose/ui/Modifier;Lhh0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public b(Landroidx/compose/ui/Modifier;Lhh0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lhh0/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v2, "modifier"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "itemState"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onViewEvent"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, p4

    check-cast v3, Lp1/q;

    const v2, -0x5c0b6bbb

    invoke-virtual {v3, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p5, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v3, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p5

    goto :goto_1

    :cond_1
    move v2, p5

    :goto_1
    and-int/lit8 v4, p5, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v3, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    :cond_3
    and-int/lit8 v4, v2, 0x13

    const/16 v5, 0x12

    const/4 v7, 0x0

    if-eq v4, v5, :cond_4

    const/4 v4, 0x1

    goto :goto_3

    :cond_4
    move v4, v7

    :goto_3
    and-int/lit8 v5, v2, 0x1

    invoke-virtual {v3, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_8

    const v4, -0x3636f461

    invoke-virtual {v3, v4}, Lp1/q;->f0(I)V

    sget-object v4, Lpf3/a;->b:Lnf3/a;

    if-eqz v4, :cond_7

    iget-object v4, v4, Lnf3/a;->a:Lwf3/a;

    iget-object v4, v4, Lwf3/a;->d:Lxf3/c;

    const v5, -0x384098

    invoke-virtual {v3, v5}, Lp1/q;->f0(I)V

    const/4 v5, 0x0

    invoke-virtual {v3, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v3, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_5

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v9, v8, :cond_6

    :cond_5
    const-class v8, Lkd1/u;

    sget-object v9, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v9, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-virtual {v4, v5, v8, v5}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v3, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    invoke-virtual {v3, v7}, Lp1/q;->q(Z)V

    invoke-virtual {v3, v7}, Lp1/q;->q(Z)V

    check-cast v9, Lkd1/u;

    shr-int/lit8 v4, v2, 0x3

    and-int/lit8 v4, v4, 0xe

    shl-int/lit8 v2, v2, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v2, v4

    sget v4, Lkd1/u;->e:I

    shl-int/lit8 v4, v4, 0x6

    or-int/2addr v4, v2

    const/4 v5, 0x0

    move-object v1, p1

    move-object v0, p2

    move-object v2, v9

    invoke-static/range {v0 .. v5}, Lhh0/f;->i(Lhh0/a;Landroidx/compose/ui/Modifier;Lkd1/u;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "KoinApplication has not been started"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_9

    new-instance v0, Lg90/a;

    const/16 v6, 0x18

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lg90/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method
