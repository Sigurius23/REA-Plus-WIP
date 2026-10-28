.class public abstract Landroidx/compose/foundation/relocation/a;
.super Ljava/lang/Object;


# direct methods
.method public static final a(Landroidx/compose/ui/Modifier;Lr0/a;)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;

    invoke-direct {v0, p1}, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;-><init>(Lr0/a;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
