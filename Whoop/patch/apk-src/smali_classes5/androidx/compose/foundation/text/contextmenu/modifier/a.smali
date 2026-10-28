.class public abstract Landroidx/compose/foundation/text/contextmenu/modifier/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/Modifier;Lc93/m;)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/text/contextmenu/modifier/AddTextContextMenuDataComponentsWithContextElement;

    invoke-direct {v0, p1}, Landroidx/compose/foundation/text/contextmenu/modifier/AddTextContextMenuDataComponentsWithContextElement;-><init>(Lc93/m;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureElement;

    invoke-direct {v0, p0}, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureElement;-><init>(Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lro/i;Lkotlin/jvm/functions/Function1;Lf1/j1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;

    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;-><init>(Lro/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lh2/c;Ly2/y;Ly2/y;)Lh2/c;
    .locals 2

    invoke-interface {p1}, Ly2/y;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ly2/y;->g()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lh2/c;->f()J

    move-result-wide v0

    invoke-static {p1}, Ly2/q1;->h(Ly2/y;)Ly2/y;

    move-result-object p1

    invoke-interface {p2, p1, v0, v1}, Ly2/y;->k(Ly2/y;J)J

    move-result-wide p1

    invoke-virtual {p0}, Lh2/c;->e()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Lhg3/i;->j(JJ)Lh2/c;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    sget-object p0, Lh2/c;->e:Lh2/c;

    return-object p0
.end method
