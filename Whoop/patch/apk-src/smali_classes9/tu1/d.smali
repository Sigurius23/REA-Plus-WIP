.class public final Ltu1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Ltu1/g;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Ltu1/d;",
        "Lm91/f;",
        "Ltu1/g;",
        "<init>",
        "()V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Landroidx/compose/ui/Modifier;Ltu1/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "last-night-sleep_release"
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

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lqu1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ltu1/d;->e(Lkotlin/jvm/functions/Function1;Lqu1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ltu1/d;Landroidx/compose/ui/Modifier;Ltu1/g;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ltu1/d;->g(Ltu1/d;Landroidx/compose/ui/Modifier;Ltu1/g;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lqu1/c$a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ltu1/d;->f(Lkotlin/jvm/functions/Function1;Lqu1/c$a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;Lqu1/b;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Lqu1/c$a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Ltu1/d;Landroidx/compose/ui/Modifier;Ltu1/g;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Ltu1/d;->d(Landroidx/compose/ui/Modifier;Ltu1/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Ltu1/g;

    invoke-virtual/range {p0 .. p5}, Ltu1/d;->d(Landroidx/compose/ui/Modifier;Ltu1/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public d(Landroidx/compose/ui/Modifier;Ltu1/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ltu1/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object v7, p3

    move/from16 v8, p5

    const-string v0, "modifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p4

    check-cast v4, Lp1/q;

    const v0, -0x7ed08c4a

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x30

    if-nez v0, :cond_1

    invoke-virtual {v4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x20

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    :goto_0
    or-int/2addr v0, v8

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    and-int/lit16 v2, v8, 0x180

    const/16 v3, 0x100

    if-nez v2, :cond_3

    invoke-virtual {v4, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    const/16 v2, 0x80

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit16 v2, v0, 0x91

    const/16 v5, 0x90

    const/4 v6, 0x0

    const/4 v9, 0x1

    if-eq v2, v5, :cond_4

    move v2, v9

    goto :goto_3

    :cond_4
    move v2, v6

    :goto_3
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v4, v5, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_b

    and-int/lit16 v2, v0, 0x380

    if-ne v2, v3, :cond_5

    move v5, v9

    goto :goto_4

    :cond_5
    move v5, v6

    :goto_4
    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_6

    if-ne v10, v11, :cond_7

    :cond_6
    new-instance v10, Lsg2/b;

    const/16 v5, 0xd

    invoke-direct {v10, p3, v5}, Lsg2/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v4, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v10, Lkotlin/jvm/functions/Function1;

    if-ne v2, v3, :cond_8

    move v6, v9

    :cond_8
    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v6, :cond_9

    if-ne v2, v11, :cond_a

    :cond_9
    new-instance v2, Lsg2/b;

    const/16 v3, 0xe

    invoke-direct {v2, p3, v3}, Lsg2/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v3, v2

    check-cast v3, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v5, v0, 0x70

    const/4 v6, 0x1

    const/4 v0, 0x0

    move-object v1, p2

    move-object v2, v10

    invoke-static/range {v0 .. v6}, Ltu1/f;->o(Landroidx/compose/ui/Modifier;Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_b
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_c

    new-instance v0, Ltu1/c;

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, v7

    move v5, v8

    invoke-direct/range {v0 .. v6}, Ltu1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method
