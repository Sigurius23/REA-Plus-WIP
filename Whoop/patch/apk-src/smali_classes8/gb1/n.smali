.class public abstract Lgb1/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008\u00b2\u0006\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00038\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "d",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;",
        "Ly2/y;",
        "",
        "h",
        "(Ly2/y;)Ljava/lang/Integer;",
        "coordinates",
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


# direct methods
.method public static synthetic a(Lp1/c1;Ly2/y;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lgb1/n;->g(Lp1/c1;Ly2/y;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lp1/c1;)Ly2/y;
    .locals 0

    invoke-static {p0}, Lgb1/n;->e(Lp1/c1;)Ly2/y;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Ly2/y;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Lgb1/n;->h(Ly2/y;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 7

    const-string p2, "<this>"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p2, v0, :cond_0

    new-instance p2, Lr0/c;

    invoke-direct {p2}, Lr0/c;-><init>()V

    invoke-virtual {p1, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast p2, Lr0/a;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-ne v1, v0, :cond_1

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {p1, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v1, Lp1/c1;

    sget-object v3, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {p1}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object v3

    iget-object v3, v3, Ll0/c2;->c:Ll0/b;

    sget-object v4, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {p1, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly3/c;

    invoke-virtual {v3}, Ll0/b;->e()Lv4/b;

    move-result-object v3

    iget v3, v3, Lv4/b;->d:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p1, v3}, Lp1/q;->e(I)Z

    move-result v5

    invoke-virtual {p1, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_2

    if-ne v6, v0, :cond_3

    :cond_2
    new-instance v6, Lgb1/n$a;

    invoke-direct {v6, p2, v1, v3, v2}, Lgb1/n$a;-><init>(Lr0/a;Lp1/c1;ILq83/d;)V

    invoke-virtual {p1, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v6, Lc93/m;

    invoke-static {p1, v6, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p0, p2}, Landroidx/compose/foundation/relocation/a;->a(Landroidx/compose/ui/Modifier;Lr0/a;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_4

    new-instance p2, Lgb1/m;

    const/4 v0, 0x0

    invoke-direct {p2, v1, v0}, Lgb1/m;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-static {p0, p2}, Landroidx/compose/ui/layout/b;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lp1/c1;)Ly2/y;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ly2/y;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly2/y;

    return-object p0
.end method

.method private static final f(Lp1/c1;Ly2/y;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ly2/y;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final g(Lp1/c1;Ly2/y;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lgb1/n;->f(Lp1/c1;Ly2/y;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Ly2/y;)Ljava/lang/Integer;
    .locals 8

    invoke-interface {p0}, Ly2/y;->c()Ly2/y;

    move-result-object v0

    :goto_0
    move-object v7, v0

    move-object v0, p0

    move-object p0, v7

    if-eqz p0, :cond_1

    invoke-interface {p0}, Ly2/y;->n()J

    move-result-wide v1

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    long-to-int v1, v1

    invoke-interface {v0}, Ly2/y;->n()J

    move-result-wide v5

    and-long/2addr v5, v3

    long-to-int v0, v5

    if-ge v1, v0, :cond_0

    invoke-interface {p0}, Ly2/y;->n()J

    move-result-wide v0

    and-long/2addr v0, v3

    long-to-int p0, v0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ly2/y;->c()Ly2/y;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method
