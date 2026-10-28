.class public interface abstract Landroidx/compose/foundation/lazy/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroidx/compose/foundation/lazy/a;Landroidx/compose/ui/Modifier;I)Landroidx/compose/ui/Modifier;
    .locals 12

    and-int/lit8 v0, p2, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x5

    const/high16 v3, 0x43c80000    # 400.0f

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    invoke-static {v4, v3, v2, v1}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const/4 v5, 0x1

    int-to-long v6, v5

    const/16 v8, 0x20

    shl-long v8, v6, v8

    const-wide v10, 0xffffffffL

    and-long/2addr v6, v10

    or-long/2addr v6, v8

    new-instance v8, Ly3/j;

    invoke-direct {v8, v6, v7}, Ly3/j;-><init>(J)V

    invoke-static {v4, v3, v5, v8}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v5

    and-int/lit8 p2, p2, 0x4

    if-eqz p2, :cond_1

    invoke-static {v4, v3, v2, v1}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v1

    :cond_1
    check-cast p0, Landroidx/compose/foundation/lazy/b;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;

    invoke-direct {p0, v0, v5, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;-><init>(Ld0/c0;Ld0/i1;Ld0/c0;)V

    invoke-interface {p1, p0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroidx/compose/foundation/lazy/a;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 6

    check-cast p0, Landroidx/compose/foundation/lazy/b;

    iget-object v3, p0, Landroidx/compose/foundation/lazy/b;->b:Lp1/h1;

    new-instance v0, Landroidx/compose/foundation/lazy/ParentSizeElement;

    const-string v4, "fillParentMaxHeight"

    const/4 v5, 0x2

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/lazy/ParentSizeElement;-><init>(FLp1/h1;Lp1/h1;Ljava/lang/String;I)V

    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
