.class public final Lb11/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lb11/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lb11/a;",
        "Lm91/f;",
        "Lb11/h;",
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
        "(Landroidx/compose/ui/Modifier;Lb11/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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

.method public static synthetic a(Lb11/j$a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lb11/a;->f(Lb11/j$a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lb11/a;Landroidx/compose/ui/Modifier;Lb11/h;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lb11/a;->g(Lb11/a;Landroidx/compose/ui/Modifier;Lb11/h;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lb11/h;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lb11/a;->e(Lkotlin/jvm/functions/Function1;Lb11/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;Lb11/h;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lb11/h;->getEvent()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lb11/j$a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lb11/a;Landroidx/compose/ui/Modifier;Lb11/h;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lb11/a;->d(Landroidx/compose/ui/Modifier;Lb11/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Lb11/h;

    invoke-virtual/range {p0 .. p5}, Lb11/a;->d(Landroidx/compose/ui/Modifier;Lb11/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public d(Landroidx/compose/ui/Modifier;Lb11/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lb11/h;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move v7, p5

    const-string v0, "modifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p4

    check-cast v4, Lp1/q;

    const v0, -0x5491962d

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x30

    const/16 v2, 0x20

    if-nez v0, :cond_2

    and-int/lit8 v0, v7, 0x40

    if-nez v0, :cond_0

    invoke-virtual {v4, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    const/16 v0, 0x10

    :goto_1
    or-int/2addr v0, v7

    goto :goto_2

    :cond_2
    move v0, v7

    :goto_2
    and-int/lit16 v3, v7, 0x180

    const/16 v5, 0x100

    if-nez v3, :cond_4

    invoke-virtual {v4, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    move v3, v5

    goto :goto_3

    :cond_3
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v0, v3

    :cond_4
    and-int/lit16 v3, v0, 0x91

    const/16 v6, 0x90

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v3, v6, :cond_5

    move v3, v9

    goto :goto_4

    :cond_5
    move v3, v8

    :goto_4
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v4, v6, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_c

    and-int/lit16 v3, v0, 0x380

    if-ne v3, v5, :cond_6

    move v3, v9

    goto :goto_5

    :cond_6
    move v3, v8

    :goto_5
    and-int/lit8 v5, v0, 0x70

    if-eq v5, v2, :cond_7

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_8

    invoke-virtual {v4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    :cond_7
    move v8, v9

    :cond_8
    or-int v0, v3, v8

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_9

    if-ne v2, v3, :cond_a

    :cond_9
    new-instance v2, Li;

    const/16 v0, 0xe

    invoke-direct {v2, v0, p3, p2}, Li;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v2, Lc93/a;

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_b

    new-instance v0, Lb01/f;

    const/16 v3, 0xe

    invoke-direct {v0, v3}, Lb01/f;-><init>(I)V

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    or-int/lit16 v5, v5, 0xc00

    const/4 v6, 0x1

    const/4 v0, 0x0

    move-object v1, p2

    invoke-static/range {v0 .. v6}, Lb11/g;->o(Landroidx/compose/ui/Modifier;Lb11/h;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_6

    :cond_c
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_d

    new-instance v0, Lm;

    const/16 v6, 0xb

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, v7

    invoke-direct/range {v0 .. v6}, Lm;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method
