.class public abstract Landroidx/compose/foundation/selection/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/Modifier;ZLj0/i;Lf0/v0;ZLi3/i;Lc93/a;)Landroidx/compose/ui/Modifier;
    .locals 9

    instance-of v0, p3, Lf0/v0;

    if-eqz v0, :cond_0

    move-object v3, p3

    check-cast v3, Lf0/v0;

    new-instance v0, Landroidx/compose/foundation/selection/SelectableElement;

    const/4 v4, 0x0

    move v1, p1

    move-object v2, p2

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/selection/SelectableElement;-><init>(ZLj0/i;Lf0/v0;ZZLi3/i;Lc93/a;)V

    goto :goto_0

    :cond_0
    if-nez p3, :cond_1

    new-instance v0, Landroidx/compose/foundation/selection/SelectableElement;

    const/4 v4, 0x0

    const/4 v3, 0x0

    move v1, p1

    move-object v2, p2

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/selection/SelectableElement;-><init>(ZLj0/i;Lf0/v0;ZZLi3/i;Lc93/a;)V

    goto :goto_0

    :cond_1
    sget-object v7, Lb2/t;->w:Lb2/t;

    if-eqz p2, :cond_2

    invoke-static {v7, p2, p3}, Landroidx/compose/foundation/d;->a(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    new-instance v0, Landroidx/compose/foundation/selection/SelectableElement;

    const/4 v4, 0x0

    const/4 v3, 0x0

    move v1, p1

    move-object v2, p2

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/selection/SelectableElement;-><init>(ZLj0/i;Lf0/v0;ZZLi3/i;Lc93/a;)V

    invoke-interface {v8, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    goto :goto_0

    :cond_2
    new-instance v0, Landroidx/compose/foundation/selection/a;

    const/4 v6, 0x0

    move v2, p1

    move-object v1, p3

    move v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/selection/a;-><init>(Lf0/v0;ZZLi3/i;Ll83/e;I)V

    invoke-static {v7, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    :goto_0
    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;ZZLc93/a;)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Ls0/a;

    invoke-direct {v0, p1, p2, p3}, Ls0/a;-><init>(ZZLc93/a;)V

    invoke-static {p0, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroidx/compose/ui/Modifier;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;
    .locals 8

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    move-object v6, p2

    new-instance v0, Landroidx/compose/foundation/selection/SelectableElement;

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v2, 0x0

    const/4 v5, 0x1

    move v1, p1

    move-object v7, p3

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/selection/SelectableElement;-><init>(ZLj0/i;Lf0/v0;ZZLi3/i;Lc93/a;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
