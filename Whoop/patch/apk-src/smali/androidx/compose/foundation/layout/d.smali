.class public abstract Landroidx/compose/foundation/layout/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/compose/foundation/layout/FillElement;

.field public static final b:Landroidx/compose/foundation/layout/FillElement;

.field public static final c:Landroidx/compose/foundation/layout/FillElement;

.field public static final d:Landroidx/compose/foundation/layout/WrapContentElement;

.field public static final e:Landroidx/compose/foundation/layout/WrapContentElement;

.field public static final f:Landroidx/compose/foundation/layout/WrapContentElement;

.field public static final g:Landroidx/compose/foundation/layout/WrapContentElement;

.field public static final h:Landroidx/compose/foundation/layout/WrapContentElement;

.field public static final i:Landroidx/compose/foundation/layout/WrapContentElement;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Landroidx/compose/foundation/layout/FillElement;

    sget-object v2, Ll0/f0;->x:Ll0/f0;

    const-string v1, "fillMaxWidth"

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v0, v2, v3, v1}, Landroidx/compose/foundation/layout/FillElement;-><init>(Ll0/f0;FLjava/lang/String;)V

    sput-object v0, Landroidx/compose/foundation/layout/d;->a:Landroidx/compose/foundation/layout/FillElement;

    new-instance v0, Landroidx/compose/foundation/layout/FillElement;

    sget-object v7, Ll0/f0;->w:Ll0/f0;

    const-string v1, "fillMaxHeight"

    invoke-direct {v0, v7, v3, v1}, Landroidx/compose/foundation/layout/FillElement;-><init>(Ll0/f0;FLjava/lang/String;)V

    sput-object v0, Landroidx/compose/foundation/layout/d;->b:Landroidx/compose/foundation/layout/FillElement;

    new-instance v0, Landroidx/compose/foundation/layout/FillElement;

    sget-object v10, Ll0/f0;->y:Ll0/f0;

    const-string v1, "fillMaxSize"

    invoke-direct {v0, v10, v3, v1}, Landroidx/compose/foundation/layout/FillElement;-><init>(Ll0/f0;FLjava/lang/String;)V

    sput-object v0, Landroidx/compose/foundation/layout/d;->c:Landroidx/compose/foundation/layout/FillElement;

    sget-object v5, Lb2/e;->N:Lb2/k;

    new-instance v1, Landroidx/compose/foundation/layout/WrapContentElement;

    new-instance v4, Ll0/c;

    const/4 v0, 0x1

    invoke-direct {v4, v5, v0}, Ll0/c;-><init>(Lb2/f;I)V

    const-string v6, "wrapContentWidth"

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v6}, Landroidx/compose/foundation/layout/WrapContentElement;-><init>(Ll0/f0;ZLc93/m;Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v1, Landroidx/compose/foundation/layout/d;->d:Landroidx/compose/foundation/layout/WrapContentElement;

    sget-object v5, Lb2/e;->M:Lb2/k;

    new-instance v1, Landroidx/compose/foundation/layout/WrapContentElement;

    new-instance v4, Ll0/c;

    invoke-direct {v4, v5, v0}, Ll0/c;-><init>(Lb2/f;I)V

    const-string v6, "wrapContentWidth"

    invoke-direct/range {v1 .. v6}, Landroidx/compose/foundation/layout/WrapContentElement;-><init>(Ll0/f0;ZLc93/m;Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v1, Landroidx/compose/foundation/layout/d;->e:Landroidx/compose/foundation/layout/WrapContentElement;

    sget-object v8, Lb2/e;->K:Lb2/l;

    new-instance v4, Landroidx/compose/foundation/layout/WrapContentElement;

    move-object v5, v7

    new-instance v7, Ll0/d;

    invoke-direct {v7, v8, v0}, Ll0/d;-><init>(Lb2/g;I)V

    const-string v9, "wrapContentHeight"

    move v6, v3

    invoke-direct/range {v4 .. v9}, Landroidx/compose/foundation/layout/WrapContentElement;-><init>(Ll0/f0;ZLc93/m;Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v4, Landroidx/compose/foundation/layout/d;->f:Landroidx/compose/foundation/layout/WrapContentElement;

    sget-object v8, Lb2/e;->J:Lb2/l;

    new-instance v4, Landroidx/compose/foundation/layout/WrapContentElement;

    new-instance v7, Ll0/d;

    invoke-direct {v7, v8, v0}, Ll0/d;-><init>(Lb2/g;I)V

    const-string v9, "wrapContentHeight"

    invoke-direct/range {v4 .. v9}, Landroidx/compose/foundation/layout/WrapContentElement;-><init>(Ll0/f0;ZLc93/m;Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v4, Landroidx/compose/foundation/layout/d;->g:Landroidx/compose/foundation/layout/WrapContentElement;

    sget-object v12, Lb2/e;->E:Lb2/m;

    new-instance v8, Landroidx/compose/foundation/layout/WrapContentElement;

    new-instance v11, Lc41/l3;

    const/16 v0, 0x8

    invoke-direct {v11, v12, v0}, Lc41/l3;-><init>(Ljava/lang/Object;I)V

    const-string v13, "wrapContentSize"

    move-object v9, v10

    move v10, v3

    invoke-direct/range {v8 .. v13}, Landroidx/compose/foundation/layout/WrapContentElement;-><init>(Ll0/f0;ZLc93/m;Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v8, Landroidx/compose/foundation/layout/d;->h:Landroidx/compose/foundation/layout/WrapContentElement;

    sget-object v12, Lb2/e;->w:Lb2/m;

    new-instance v8, Landroidx/compose/foundation/layout/WrapContentElement;

    new-instance v11, Lc41/l3;

    invoke-direct {v11, v12, v0}, Lc41/l3;-><init>(Ljava/lang/Object;I)V

    const-string v13, "wrapContentSize"

    invoke-direct/range {v8 .. v13}, Landroidx/compose/foundation/layout/WrapContentElement;-><init>(Ll0/f0;ZLc93/m;Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v8, Landroidx/compose/foundation/layout/d;->i:Landroidx/compose/foundation/layout/WrapContentElement;

    return-void
.end method

.method public static final a(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;

    invoke-direct {v0, p1, p2}, Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;-><init>(FF)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;
    .locals 2

    and-int/lit8 v0, p3, 0x1

    const/high16 v1, 0x7fc00000    # Float.NaN

    if-eqz v0, :cond_0

    move p1, v1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move p2, v1

    :cond_1
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p0, v0

    if-nez v0, :cond_0

    sget-object p0, Landroidx/compose/foundation/layout/d;->b:Landroidx/compose/foundation/layout/FillElement;

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/foundation/layout/FillElement;

    sget-object v1, Ll0/f0;->w:Ll0/f0;

    const-string v2, "fillMaxHeight"

    invoke-direct {v0, v1, p0, v2}, Landroidx/compose/foundation/layout/FillElement;-><init>(Ll0/f0;FLjava/lang/String;)V

    move-object p0, v0

    :goto_0
    invoke-interface {p1, p0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p0, v0

    if-nez v0, :cond_0

    sget-object p0, Landroidx/compose/foundation/layout/d;->c:Landroidx/compose/foundation/layout/FillElement;

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/foundation/layout/FillElement;

    sget-object v1, Ll0/f0;->y:Ll0/f0;

    const-string v2, "fillMaxSize"

    invoke-direct {v0, v1, p0, v2}, Landroidx/compose/foundation/layout/FillElement;-><init>(Ll0/f0;FLjava/lang/String;)V

    move-object p0, v0

    :goto_0
    invoke-interface {p1, p0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p0, v0

    if-nez v0, :cond_0

    sget-object p0, Landroidx/compose/foundation/layout/d;->a:Landroidx/compose/foundation/layout/FillElement;

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/foundation/layout/FillElement;

    sget-object v1, Ll0/f0;->x:Ll0/f0;

    const-string v2, "fillMaxWidth"

    invoke-direct {v0, v1, p0, v2}, Landroidx/compose/foundation/layout/FillElement;-><init>(Ll0/f0;FLjava/lang/String;)V

    move-object p0, v0

    :goto_0
    invoke-interface {p1, p0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 7

    new-instance v0, Landroidx/compose/foundation/layout/SizeElement;

    const/4 v6, 0x1

    const/4 v5, 0x5

    const/4 v1, 0x0

    const/4 v3, 0x0

    move v4, p0

    move v2, p0

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/layout/SizeElement;-><init>(FFFFIZ)V

    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;
    .locals 7

    new-instance v0, Landroidx/compose/foundation/layout/SizeElement;

    const/4 v6, 0x1

    const/4 v5, 0x5

    const/4 v1, 0x0

    const/4 v3, 0x0

    move v2, p1

    move v4, p2

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/layout/SizeElement;-><init>(FFFFIZ)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;
    .locals 2

    and-int/lit8 v0, p3, 0x1

    const/high16 v1, 0x7fc00000    # Float.NaN

    if-eqz v0, :cond_0

    move p1, v1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move p2, v1

    :cond_1
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/layout/d;->i(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final k(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 7

    new-instance v0, Landroidx/compose/foundation/layout/SizeElement;

    const/4 v6, 0x0

    const/4 v5, 0x5

    const/4 v1, 0x0

    const/4 v3, 0x0

    move v4, p0

    move v2, p0

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/layout/SizeElement;-><init>(FFFFIZ)V

    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final l(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 6

    new-instance v0, Landroidx/compose/foundation/layout/SizeElement;

    const/4 v5, 0x0

    move v2, p0

    move v3, p0

    move v4, p0

    move v1, p0

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/layout/SizeElement;-><init>(FFFFZ)V

    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;
    .locals 6

    new-instance v0, Landroidx/compose/foundation/layout/SizeElement;

    const/4 v5, 0x0

    move v3, p1

    move v4, p2

    move v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/layout/SizeElement;-><init>(FFFFZ)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static n(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;
    .locals 8

    and-int/lit8 v0, p5, 0x1

    const/high16 v1, 0x7fc00000    # Float.NaN

    if-eqz v0, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, p1

    :goto_0
    and-int/lit8 p1, p5, 0x2

    if-eqz p1, :cond_1

    move v4, v1

    goto :goto_1

    :cond_1
    move v4, p2

    :goto_1
    and-int/lit8 p1, p5, 0x4

    if-eqz p1, :cond_2

    move v5, v1

    goto :goto_2

    :cond_2
    move v5, p3

    :goto_2
    and-int/lit8 p1, p5, 0x8

    if-eqz p1, :cond_3

    move v6, v1

    goto :goto_3

    :cond_3
    move v6, p4

    :goto_3
    new-instance v2, Landroidx/compose/foundation/layout/SizeElement;

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Landroidx/compose/foundation/layout/SizeElement;-><init>(FFFFZ)V

    invoke-interface {p0, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final o(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 7

    new-instance v0, Landroidx/compose/foundation/layout/SizeElement;

    const/4 v6, 0x0

    const/16 v5, 0xa

    const/4 v2, 0x0

    const/4 v4, 0x0

    move v3, p0

    move v1, p0

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/layout/SizeElement;-><init>(FFFFIZ)V

    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 6

    new-instance v0, Landroidx/compose/foundation/layout/SizeElement;

    const/4 v5, 0x1

    move v2, p0

    move v3, p0

    move v4, p0

    move v1, p0

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/layout/SizeElement;-><init>(FFFFZ)V

    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final q(JLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 1

    invoke-static {p0, p1}, Ly3/h;->c(J)F

    move-result v0

    invoke-static {p0, p1}, Ly3/h;->b(J)F

    move-result p0

    invoke-static {p2, v0, p0}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;
    .locals 6

    new-instance v0, Landroidx/compose/foundation/layout/SizeElement;

    const/4 v5, 0x1

    move v3, p1

    move v4, p2

    move v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/layout/SizeElement;-><init>(FFFFZ)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;
    .locals 6

    new-instance v0, Landroidx/compose/foundation/layout/SizeElement;

    const/4 v5, 0x1

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/layout/SizeElement;-><init>(FFFFZ)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;
    .locals 2

    and-int/lit8 v0, p5, 0x1

    const/high16 v1, 0x7fc00000    # Float.NaN

    if-eqz v0, :cond_0

    move p1, v1

    :cond_0
    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_1

    move p2, v1

    :cond_1
    and-int/lit8 v0, p5, 0x4

    if-eqz v0, :cond_2

    move p3, v1

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move p4, v1

    :cond_3
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/layout/d;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 7

    new-instance v0, Landroidx/compose/foundation/layout/SizeElement;

    const/4 v6, 0x1

    const/16 v5, 0xa

    const/4 v2, 0x0

    const/4 v4, 0x0

    move v3, p0

    move v1, p0

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/layout/SizeElement;-><init>(FFFFIZ)V

    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static v(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;
    .locals 9

    and-int/lit8 v0, p3, 0x1

    const/high16 v1, 0x7fc00000    # Float.NaN

    if-eqz v0, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, p1

    :goto_0
    and-int/lit8 p1, p3, 0x2

    if-eqz p1, :cond_1

    move v5, v1

    goto :goto_1

    :cond_1
    move v5, p2

    :goto_1
    new-instance v2, Landroidx/compose/foundation/layout/SizeElement;

    const/4 v8, 0x1

    const/16 v7, 0xa

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Landroidx/compose/foundation/layout/SizeElement;-><init>(FFFFIZ)V

    invoke-interface {p0, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final w(Landroidx/compose/ui/Modifier;Lb2/g;Z)Landroidx/compose/ui/Modifier;
    .locals 6

    sget-object v0, Lb2/e;->K:Lb2/l;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-nez p2, :cond_0

    sget-object p1, Landroidx/compose/foundation/layout/d;->f:Landroidx/compose/foundation/layout/WrapContentElement;

    goto :goto_0

    :cond_0
    sget-object v0, Lb2/e;->J:Lb2/l;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p2, :cond_1

    sget-object p1, Landroidx/compose/foundation/layout/d;->g:Landroidx/compose/foundation/layout/WrapContentElement;

    goto :goto_0

    :cond_1
    new-instance v0, Landroidx/compose/foundation/layout/WrapContentElement;

    sget-object v1, Ll0/f0;->w:Ll0/f0;

    new-instance v3, Ll0/d;

    const/4 v2, 0x1

    invoke-direct {v3, p1, v2}, Ll0/d;-><init>(Lb2/g;I)V

    const-string v5, "wrapContentHeight"

    move-object v4, p1

    move v2, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/layout/WrapContentElement;-><init>(Ll0/f0;ZLc93/m;Ljava/lang/Object;Ljava/lang/String;)V

    move-object p1, v0

    :goto_0
    invoke-interface {p0, p1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Lb2/e;->K:Lb2/l;

    :cond_0
    const/4 p2, 0x0

    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/layout/d;->w(Landroidx/compose/ui/Modifier;Lb2/g;Z)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static y(Landroidx/compose/ui/Modifier;Lb2/m;ZI)Landroidx/compose/ui/Modifier;
    .locals 8

    sget-object v0, Lb2/e;->E:Lb2/m;

    and-int/lit8 v1, p3, 0x1

    if-eqz v1, :cond_0

    move-object v6, v0

    goto :goto_0

    :cond_0
    move-object v6, p1

    :goto_0
    and-int/lit8 p1, p3, 0x2

    if-eqz p1, :cond_1

    const/4 p2, 0x0

    :cond_1
    move v4, p2

    invoke-virtual {v6, v0}, Lb2/m;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    if-nez v4, :cond_2

    sget-object p1, Landroidx/compose/foundation/layout/d;->h:Landroidx/compose/foundation/layout/WrapContentElement;

    goto :goto_1

    :cond_2
    sget-object p1, Lb2/e;->w:Lb2/m;

    invoke-virtual {v6, p1}, Lb2/m;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    if-nez v4, :cond_3

    sget-object p1, Landroidx/compose/foundation/layout/d;->i:Landroidx/compose/foundation/layout/WrapContentElement;

    goto :goto_1

    :cond_3
    new-instance v2, Landroidx/compose/foundation/layout/WrapContentElement;

    sget-object v3, Ll0/f0;->y:Ll0/f0;

    new-instance v5, Lc41/l3;

    const/16 p1, 0x8

    invoke-direct {v5, v6, p1}, Lc41/l3;-><init>(Ljava/lang/Object;I)V

    const-string v7, "wrapContentSize"

    invoke-direct/range {v2 .. v7}, Landroidx/compose/foundation/layout/WrapContentElement;-><init>(Ll0/f0;ZLc93/m;Ljava/lang/Object;Ljava/lang/String;)V

    move-object p1, v2

    :goto_1
    invoke-interface {p0, p1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static z(Landroidx/compose/ui/Modifier;Lb2/f;I)Landroidx/compose/ui/Modifier;
    .locals 8

    sget-object v0, Lb2/e;->N:Lb2/k;

    and-int/lit8 v1, p2, 0x1

    if-eqz v1, :cond_0

    move-object v6, v0

    goto :goto_0

    :cond_0
    move-object v6, p1

    :goto_0
    and-int/lit8 p1, p2, 0x2

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    :goto_1
    move v4, p1

    goto :goto_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_1

    :goto_2
    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    if-nez v4, :cond_2

    sget-object p1, Landroidx/compose/foundation/layout/d;->d:Landroidx/compose/foundation/layout/WrapContentElement;

    goto :goto_3

    :cond_2
    sget-object p1, Lb2/e;->M:Lb2/k;

    invoke-static {v6, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    if-nez v4, :cond_3

    sget-object p1, Landroidx/compose/foundation/layout/d;->e:Landroidx/compose/foundation/layout/WrapContentElement;

    goto :goto_3

    :cond_3
    new-instance v2, Landroidx/compose/foundation/layout/WrapContentElement;

    sget-object v3, Ll0/f0;->x:Ll0/f0;

    new-instance v5, Ll0/c;

    const/4 p1, 0x1

    invoke-direct {v5, v6, p1}, Ll0/c;-><init>(Lb2/f;I)V

    const-string v7, "wrapContentWidth"

    invoke-direct/range {v2 .. v7}, Landroidx/compose/foundation/layout/WrapContentElement;-><init>(Ll0/f0;ZLc93/m;Ljava/lang/Object;Ljava/lang/String;)V

    move-object p1, v2

    :goto_3
    invoke-interface {p0, p1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
