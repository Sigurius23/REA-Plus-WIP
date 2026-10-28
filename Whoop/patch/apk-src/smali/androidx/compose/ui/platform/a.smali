.class public abstract Landroidx/compose/ui/platform/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/TestTagElement;

    invoke-direct {v0, p1}, Landroidx/compose/ui/platform/TestTagElement;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
