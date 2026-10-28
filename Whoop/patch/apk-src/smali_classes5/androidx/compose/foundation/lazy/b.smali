.class public final Landroidx/compose/foundation/lazy/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/lazy/a;


# instance fields
.field public a:Lp1/h1;

.field public b:Lp1/h1;


# virtual methods
.method public final c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 6

    iget-object v2, p0, Landroidx/compose/foundation/lazy/b;->a:Lp1/h1;

    new-instance v0, Landroidx/compose/foundation/lazy/ParentSizeElement;

    const-string v4, "fillParentMaxWidth"

    const/4 v5, 0x4

    const/4 v3, 0x0

    move v1, p1

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/lazy/ParentSizeElement;-><init>(FLp1/h1;Lp1/h1;Ljava/lang/String;I)V

    invoke-interface {p2, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method
