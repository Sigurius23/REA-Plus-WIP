.class public abstract Landroidx/compose/material3/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lc93/a;Lc93/m;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lm1/a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lm1/a;

    iget v1, v0, Lm1/a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lm1/a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lm1/a;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lm1/a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lm1/a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/compose/material3/internal/AnchoredDragFinishedSignal; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance p2, Lg1/s;

    const/4 v2, 0x0

    const/4 v4, 0x1

    invoke-direct {p2, p0, p1, v2, v4}, Lg1/s;-><init>(Lc93/a;Lc93/m;Lq83/d;I)V

    iput v3, v0, Lm1/a;->x:I

    invoke-static {p2, v0}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Landroidx/compose/material3/internal/AnchoredDragFinishedSignal; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p0, v1, :cond_3

    return-object v1

    :catch_0
    :cond_3
    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Lm1/g;Lc93/m;)Landroidx/compose/ui/Modifier;
    .locals 1

    sget-object v0, Lh0/d2;->w:Lh0/d2;

    new-instance v0, Landroidx/compose/material3/internal/DraggableAnchorsElement;

    invoke-direct {v0, p1, p2}, Landroidx/compose/material3/internal/DraggableAnchorsElement;-><init>(Lm1/g;Lc93/m;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
