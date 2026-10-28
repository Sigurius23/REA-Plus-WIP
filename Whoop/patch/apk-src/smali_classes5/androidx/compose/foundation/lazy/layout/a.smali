.class public abstract Landroidx/compose/foundation/lazy/layout/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lp0/o;Laj/d;Lh0/d2;)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;

    invoke-direct {v0, p0, p1, p2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;-><init>(Lp0/o;Laj/d;Lh0/d2;)V

    return-object v0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Lj93/u;Lp0/s0;Lh0/d2;Z)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;

    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;-><init>(Lc93/a;Lp0/s0;Lh0/d2;Z)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
