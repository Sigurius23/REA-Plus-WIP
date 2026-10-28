.class public abstract Lue1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005\u001a-\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "Lf0/r1;",
        "scrollState",
        "",
        "alphaMagnifier",
        "translationYMagnifier",
        "b",
        "(Landroidx/compose/ui/Modifier;Lf0/r1;FF)Landroidx/compose/ui/Modifier;",
        "education_release"
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
.method public static synthetic a(Lf0/r1;FFLi2/g0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lue1/b;->d(Lf0/r1;FFLi2/g0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Lf0/r1;FF)Landroidx/compose/ui/Modifier;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scrollState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lrn0/a;

    const/4 v1, 0x1

    invoke-direct {v0, p1, p2, p3, v1}, Lrn0/a;-><init>(Lf0/r1;FFI)V

    sget-object p1, Lb2/t;->w:Lb2/t;

    invoke-static {p1, v0}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-interface {p0, p1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lf0/r1;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/high16 p2, 0x43480000    # 200.0f

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const p3, 0x3dcccccd    # 0.1f

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lue1/b;->b(Landroidx/compose/ui/Modifier;Lf0/r1;FF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lf0/r1;FFLi2/g0;)Ll83/a0;
    .locals 2

    const-string v0, "$this$graphicsLayer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    int-to-float v0, v0

    iget-object v1, p0, Lf0/r1;->a:Lp1/h1;

    invoke-virtual {v1}, Lp1/h1;->x()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, p1

    sub-float/2addr v0, v1

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    check-cast p3, Li2/x0;

    invoke-virtual {p3, p1}, Li2/x0;->a(F)V

    iget-object p0, p0, Lf0/r1;->a:Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    neg-int p0, p0

    int-to-float p0, p0

    mul-float/2addr p0, p2

    invoke-virtual {p3, p0}, Li2/x0;->E(F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
