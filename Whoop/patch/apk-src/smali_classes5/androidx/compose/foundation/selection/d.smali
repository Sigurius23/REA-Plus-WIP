.class public abstract Landroidx/compose/foundation/selection/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/Modifier;ZLj0/i;Lf0/v0;ZLi3/i;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
    .locals 9

    instance-of v0, p3, Lf0/v0;

    if-eqz v0, :cond_0

    move-object v3, p3

    check-cast v3, Lf0/v0;

    new-instance v0, Landroidx/compose/foundation/selection/ToggleableElement;

    const/4 v4, 0x0

    move v1, p1

    move-object v2, p2

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/selection/ToggleableElement;-><init>(ZLj0/i;Lf0/v0;ZZLi3/i;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_0
    if-nez p3, :cond_1

    new-instance v0, Landroidx/compose/foundation/selection/ToggleableElement;

    const/4 v4, 0x0

    const/4 v3, 0x0

    move v1, p1

    move-object v2, p2

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/selection/ToggleableElement;-><init>(ZLj0/i;Lf0/v0;ZZLi3/i;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_1
    sget-object v7, Lb2/t;->w:Lb2/t;

    if-eqz p2, :cond_2

    invoke-static {v7, p2, p3}, Landroidx/compose/foundation/d;->a(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    new-instance v0, Landroidx/compose/foundation/selection/ToggleableElement;

    const/4 v4, 0x0

    const/4 v3, 0x0

    move v1, p1

    move-object v2, p2

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/selection/ToggleableElement;-><init>(ZLj0/i;Lf0/v0;ZZLi3/i;Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v8, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    goto :goto_0

    :cond_2
    new-instance v0, Landroidx/compose/foundation/selection/a;

    const/4 v6, 0x1

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

.method public static b(Landroidx/compose/ui/Modifier;ZZLi3/i;Lkotlin/jvm/functions/Function1;I)Landroidx/compose/ui/Modifier;
    .locals 8

    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_0

    const/4 p2, 0x1

    :cond_0
    move v5, p2

    and-int/lit8 p2, p5, 0x4

    if-eqz p2, :cond_1

    const/4 p3, 0x0

    :cond_1
    move-object v6, p3

    new-instance v0, Landroidx/compose/foundation/selection/ToggleableElement;

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v2, 0x0

    move v1, p1

    move-object v7, p4

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/selection/ToggleableElement;-><init>(ZLj0/i;Lf0/v0;ZZLi3/i;Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lk3/a;Landroidx/compose/material/d;ZLi3/i;Lc93/a;)Landroidx/compose/ui/Modifier;
    .locals 7

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    new-instance v0, Landroidx/compose/foundation/selection/TriStateToggleableElement;

    move-object v1, p0

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/selection/TriStateToggleableElement;-><init>(Lk3/a;Lj0/i;Landroidx/compose/material/d;ZLi3/i;Lc93/a;)V

    return-object v0

    :cond_0
    move-object v1, p0

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object p0, v2

    move-object v2, p1

    if-nez v2, :cond_1

    new-instance v0, Landroidx/compose/foundation/selection/TriStateToggleableElement;

    const/4 v3, 0x0

    move-object v2, p0

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/selection/TriStateToggleableElement;-><init>(Lk3/a;Lj0/i;Landroidx/compose/material/d;ZLi3/i;Lc93/a;)V

    return-object v0

    :cond_1
    new-instance p0, Landroidx/compose/foundation/selection/c;

    move-object v3, v1

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Landroidx/compose/foundation/selection/c;-><init>(Lf0/v0;Lk3/a;ZLi3/i;Lc93/a;)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    invoke-static {p0, v1}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
