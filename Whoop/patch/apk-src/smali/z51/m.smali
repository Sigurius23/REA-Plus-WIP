.class public final Lz51/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lz51/r;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lz51/m;",
        "Lm91/f;",
        "Lz51/r;",
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
        "(Landroidx/compose/ui/Modifier;Lz51/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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

.method public static synthetic a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lz51/m;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lz51/m;Landroidx/compose/ui/Modifier;Lz51/r;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lz51/m;->e(Lz51/m;Landroidx/compose/ui/Modifier;Lz51/r;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lz51/m;Landroidx/compose/ui/Modifier;Lz51/r;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lz51/m;->c(Landroidx/compose/ui/Modifier;Lz51/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Lz51/r;

    invoke-virtual/range {p0 .. p5}, Lz51/m;->c(Landroidx/compose/ui/Modifier;Lz51/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public c(Landroidx/compose/ui/Modifier;Lz51/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lz51/r;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "modifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, p4

    check-cast v7, Lp1/q;

    const p4, -0x59bac545

    invoke-virtual {v7, p4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p4, p5, 0x30

    if-nez p4, :cond_1

    invoke-virtual {v7, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_0

    const/16 p4, 0x20

    goto :goto_0

    :cond_0
    const/16 p4, 0x10

    :goto_0
    or-int/2addr p4, p5

    goto :goto_1

    :cond_1
    move p4, p5

    :goto_1
    and-int/lit16 v0, p5, 0x180

    const/16 v1, 0x100

    if-nez v0, :cond_3

    invoke-virtual {v7, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    goto :goto_2

    :cond_2
    const/16 v0, 0x80

    :goto_2
    or-int/2addr p4, v0

    :cond_3
    and-int/lit16 v0, p4, 0x91

    const/16 v2, 0x90

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v0, v2, :cond_4

    move v0, v4

    goto :goto_3

    :cond_4
    move v0, v3

    :goto_3
    and-int/lit8 v2, p4, 0x1

    invoke-virtual {v7, v2, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_8

    move v0, v1

    invoke-virtual {p2}, Lz51/r;->f()Lz51/s;

    move-result-object v1

    invoke-virtual {p2}, Lz51/r;->a()F

    move-result v2

    move v5, v3

    invoke-virtual {p2}, Lz51/r;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    move v6, v4

    invoke-virtual {p2}, Lz51/r;->e()Z

    move-result v4

    move v8, v5

    invoke-virtual {p2}, Lz51/r;->b()F

    move-result v5

    and-int/lit16 p4, p4, 0x380

    if-ne p4, v0, :cond_5

    goto :goto_4

    :cond_5
    move v6, v8

    :goto_4
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p4

    if-nez v6, :cond_6

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p4, v0, :cond_7

    :cond_6
    new-instance p4, Lwo1/h;

    const/16 v0, 0x17

    invoke-direct {p4, p3, v0}, Lwo1/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, p4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v6, p4

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v1 .. v9}, Lz51/o;->k(Lz51/s;FLcom/whoop/design/util/TextResource;ZFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_8
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object p4

    if-eqz p4, :cond_9

    new-instance v0, Ly71/j;

    const/16 v6, 0xb

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v6}, Ly71/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p4, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method
