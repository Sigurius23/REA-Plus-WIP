.class public abstract Lu81/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aS\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062$\u0010\r\u001a \u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\u0008\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lt81/r;",
        "state",
        "",
        "currentZoom",
        "",
        "currentScrollPosition",
        "Lh2/b;",
        "doubleTapOffset",
        "Lkotlin/Function4;",
        "Lu81/d;",
        "Lu81/b;",
        "",
        "Ll83/a0;",
        "onDiscreteZoom",
        "a",
        "(Lt81/r;FIJLc93/n;)V",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lt81/r;FIJLc93/n;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt81/r;",
            "FIJ",
            "Lc93/n;",
            ")V"
        }
    .end annotation

    const-string v0, "state"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDiscreteZoom"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lu81/d;

    sget-object v1, Lu81/c;->a:Lu81/c;

    invoke-virtual {p0}, Lt81/r;->m()Lt81/e;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lu81/c;->a(FLt81/e;)F

    move-result v1

    invoke-direct {v0, p1, v1}, Lu81/d;-><init>(FF)V

    invoke-virtual {p0}, Lt81/r;->i()Lh71/k;

    move-result-object p0

    invoke-virtual {p0}, Lh71/k;->g()Lg61/b;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lg61/b;->h()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    goto :goto_0

    :cond_0
    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    :goto_0
    sget-object v1, Lt81/a;->a:Lt81/a;

    invoke-virtual {v0}, Lu81/d;->a()F

    move-result v5

    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    move v4, p1

    move v6, p2

    move-wide v2, p3

    invoke-virtual/range {v1 .. v8}, Lt81/a;->a(JFFID)I

    move-result p0

    new-instance p1, Lu81/b;

    invoke-direct {p1, v6, p0}, Lu81/b;-><init>(II)V

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p5, v0, p1, p0, p0}, Lc93/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
