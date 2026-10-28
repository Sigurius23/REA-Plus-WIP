.class public interface abstract Landroidx/compose/ui/Modifier;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
.end method

.method public abstract c(Lkotlin/jvm/functions/Function1;)Z
.end method

.method public e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 1

    sget-object v0, Lb2/t;->w:Lb2/t;

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lb2/o;

    invoke-direct {v0, p0, p1}, Lb2/o;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;)V

    return-object v0
.end method
