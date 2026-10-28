.class public abstract Landroidx/compose/foundation/layout/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(FFI)Ll0/l1;
    .locals 2

    and-int/lit8 v0, p2, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    int-to-float p0, v1

    :cond_0
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    int-to-float p1, v1

    :cond_1
    new-instance p2, Ll0/l1;

    invoke-direct {p2, p0, p1, p0, p1}, Ll0/l1;-><init>(FFFF)V

    return-object p2
.end method

.method public static final b(FFFF)Ll0/l1;
    .locals 1

    new-instance v0, Ll0/l1;

    invoke-direct {v0, p0, p1, p2, p3}, Ll0/l1;-><init>(FFFF)V

    return-object v0
.end method

.method public static c(FFFFI)Ll0/l1;
    .locals 2

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    int-to-float p0, v1

    :cond_0
    and-int/lit8 v0, p4, 0x2

    if-eqz v0, :cond_1

    int-to-float p1, v1

    :cond_1
    and-int/lit8 v0, p4, 0x4

    if-eqz v0, :cond_2

    int-to-float p2, v1

    :cond_2
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_3

    int-to-float p3, v1

    :cond_3
    new-instance p4, Ll0/l1;

    invoke-direct {p4, p0, p1, p2, p3}, Ll0/l1;-><init>(FFFF)V

    return-object p4
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
    .locals 3

    new-instance v0, Landroidx/compose/foundation/layout/OffsetPxElement;

    new-instance v1, Ljp1/n;

    const/16 v2, 0x18

    invoke-direct {v1, p1, v2}, Ljp1/n;-><init>(Lkotlin/jvm/functions/Function1;I)V

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Landroidx/compose/foundation/layout/OffsetPxElement;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;
    .locals 3

    new-instance v0, Landroidx/compose/foundation/layout/OffsetElement;

    new-instance v1, Lcp0/v0;

    const/4 v2, 0x2

    invoke-direct {v1, p1, p2, v2}, Lcp0/v0;-><init>(FFI)V

    const/4 v2, 0x0

    invoke-direct {v0, p1, p2, v2, v1}, Landroidx/compose/foundation/layout/OffsetElement;-><init>(FFZLkotlin/jvm/functions/Function1;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/AspectRatioElement;

    invoke-direct {v0, p2, p1}, Landroidx/compose/foundation/layout/AspectRatioElement;-><init>(FZ)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Ll0/k1;Ly3/m;)F
    .locals 1

    sget-object v0, Ly3/m;->w:Ly3/m;

    if-ne p1, v0, :cond_0

    invoke-interface {p0, p1}, Ll0/k1;->c(Ly3/m;)F

    move-result p0

    return p0

    :cond_0
    invoke-interface {p0, p1}, Ll0/k1;->b(Ly3/m;)F

    move-result p0

    return p0
.end method

.method public static final i(Ll0/k1;Ly3/m;)F
    .locals 1

    sget-object v0, Ly3/m;->w:Ly3/m;

    if-ne p1, v0, :cond_0

    invoke-interface {p0, p1}, Ll0/k1;->b(Ly3/m;)F

    move-result p0

    return p0

    :cond_0
    invoke-interface {p0, p1}, Ll0/k1;->c(Ly3/m;)F

    move-result p0

    return p0
.end method

.method public static final j(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/IntrinsicHeightElement;

    invoke-direct {v0, p1}, Landroidx/compose/foundation/layout/IntrinsicHeightElement;-><init>(Ll0/a1;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final k(IJI)Z
    .locals 2

    invoke-static {p1, p2}, Ly3/a;->k(J)I

    move-result v0

    invoke-static {p1, p2}, Ly3/a;->i(J)I

    move-result v1

    if-gt p0, v1, :cond_0

    if-gt v0, p0, :cond_0

    invoke-static {p1, p2}, Ly3/a;->j(J)I

    move-result p0

    invoke-static {p1, p2}, Ly3/a;->h(J)I

    move-result p1

    if-gt p3, p1, :cond_0

    if-gt p0, p3, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final l(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
    .locals 3

    new-instance v0, Landroidx/compose/foundation/layout/OffsetPxElement;

    new-instance v1, Lb11/b;

    const/16 v2, 0xc

    invoke-direct {v1, p1, v2}, Lb11/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    const/4 v2, 0x1

    invoke-direct {v0, p1, v1, v2}, Landroidx/compose/foundation/layout/OffsetPxElement;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;
    .locals 3

    new-instance v0, Landroidx/compose/foundation/layout/OffsetElement;

    new-instance v1, Ll0/f1;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Ll0/f1;-><init>(FFI)V

    const/4 v2, 0x1

    invoke-direct {v0, p1, p2, v2, v1}, Landroidx/compose/foundation/layout/OffsetElement;-><init>(FFZLkotlin/jvm/functions/Function1;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;
    .locals 2

    and-int/lit8 v0, p3, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    int-to-float p1, v1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    int-to-float p2, v1

    :cond_1
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/layout/a;->m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 3

    new-instance v0, Landroidx/compose/foundation/layout/PaddingValuesElement;

    new-instance v1, La6/i;

    const/16 v2, 0x16

    invoke-direct {v1, p0, v2}, La6/i;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, p0, v1}, Landroidx/compose/foundation/layout/PaddingValuesElement;-><init>(Ll0/k1;La6/i;)V

    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 6

    new-instance v0, Landroidx/compose/foundation/layout/PaddingElement;

    new-instance v5, Lk71/f;

    const/4 v1, 0x1

    invoke-direct {v5, p0, v1}, Lk71/f;-><init>(FI)V

    move v2, p0

    move v3, p0

    move v4, p0

    move v1, p0

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/layout/PaddingElement;-><init>(FFFFLkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;
    .locals 6

    new-instance v0, Landroidx/compose/foundation/layout/PaddingElement;

    new-instance v5, Ll0/f1;

    const/4 v1, 0x1

    invoke-direct {v5, p1, p2, v1}, Ll0/f1;-><init>(FFI)V

    move v3, p1

    move v4, p2

    move v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/layout/PaddingElement;-><init>(FFFFLkotlin/jvm/functions/Function1;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;
    .locals 2

    and-int/lit8 v0, p3, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    int-to-float p1, v1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    int-to-float p2, v1

    :cond_1
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;
    .locals 6

    new-instance v0, Landroidx/compose/foundation/layout/PaddingElement;

    new-instance v5, Ll0/i1;

    invoke-direct {v5, p1, p2, p3, p4}, Ll0/i1;-><init>(FFFF)V

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/layout/PaddingElement;-><init>(FFFFLkotlin/jvm/functions/Function1;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;
    .locals 2

    and-int/lit8 v0, p5, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    int-to-float p1, v1

    :cond_0
    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_1

    int-to-float p2, v1

    :cond_1
    and-int/lit8 v0, p5, 0x4

    if-eqz v0, :cond_2

    int-to-float p3, v1

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    int-to-float p4, v1

    :cond_3
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final u(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/IntrinsicWidthElement;

    invoke-direct {v0, p1}, Landroidx/compose/foundation/layout/IntrinsicWidthElement;-><init>(Ll0/a1;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
