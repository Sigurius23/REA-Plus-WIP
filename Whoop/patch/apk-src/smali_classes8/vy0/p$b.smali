.class final Lvy0/p$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/r0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvy0/p;->k0(Ljava/lang/String;FFILc93/a;Lc93/a;ZZLc93/a;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:F


# direct methods
.method public constructor <init>(FF)V
    .locals 0

    iput p1, p0, Lvy0/p$b;->a:F

    iput p2, p0, Lvy0/p$b;->b:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic f(FLy2/j1;ILy2/j1;Ly2/i1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lvy0/p$b;->g(FLy2/j1;ILy2/j1;Ly2/i1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(FLy2/j1;ILy2/j1;Ly2/i1;)Ll83/a0;
    .locals 2

    const-string v0, "$this$layout"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    cmpl-float v0, p0, v0

    const/4 v1, 0x0

    if-lez v0, :cond_1

    iget v0, p1, Ly2/j1;->x:I

    sub-int/2addr p2, v0

    div-int/lit8 p2, p2, 0x2

    if-gez p2, :cond_0

    move p2, v1

    :cond_0
    invoke-static {p1, v1, p2, p4}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    :cond_1
    const/high16 p1, 0x3f800000    # 1.0f

    cmpg-float p0, p0, p1

    if-gez p0, :cond_2

    invoke-static {p3, v1, v1, p4}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    :cond_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly2/t0;",
            "Ljava/util/List<",
            "+",
            "Ly2/q0;",
            ">;J)",
            "Ly2/s0;"
        }
    .end annotation

    const-string v0, "$this$Layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurables"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/16 v7, 0xb

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-wide v1, p3

    invoke-static/range {v1 .. v7}, Ly3/a;->b(JIIIII)J

    move-result-wide p3

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/q0;

    invoke-interface {v0, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v0

    const/4 v3, 0x1

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ly2/q0;

    invoke-interface {p2, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    iget p3, v0, Ly2/j1;->w:I

    iget p4, p2, Ly2/j1;->w:I

    invoke-static {p3, p4}, Ljava/lang/Math;->max(II)I

    move-result p3

    invoke-static {p3, v1, v2}, Ly3/b;->g(IJ)I

    move-result p3

    iget p4, p2, Ly2/j1;->x:I

    int-to-float p4, p4

    iget v3, v0, Ly2/j1;->x:I

    int-to-float v3, v3

    iget v4, p0, Lvy0/p$b;->a:F

    invoke-static {p4, v3, v4}, Le93/b;->O(FFF)F

    move-result p4

    invoke-static {p4}, Le93/b;->X(F)I

    move-result p4

    invoke-static {p4, v1, v2}, Ly3/b;->f(IJ)I

    move-result p4

    iget v1, p0, Lvy0/p$b;->b:F

    new-instance v2, Lvy0/q;

    invoke-direct {v2, v1, v0, p4, p2}, Lvy0/q;-><init>(FLy2/j1;ILy2/j1;)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p3, p4, p2, v2}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method

.method public bridge b(Ly2/r;Ljava/util/List;I)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly2/r;",
            "Ljava/util/List<",
            "+",
            "Ly2/q0;",
            ">;I)I"
        }
    .end annotation

    invoke-super {p0, p1, p2, p3}, Ly2/r0;->b(Ly2/r;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public bridge c(Ly2/r;Ljava/util/List;I)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly2/r;",
            "Ljava/util/List<",
            "+",
            "Ly2/q0;",
            ">;I)I"
        }
    .end annotation

    invoke-super {p0, p1, p2, p3}, Ly2/r0;->c(Ly2/r;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public bridge d(Ly2/r;Ljava/util/List;I)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly2/r;",
            "Ljava/util/List<",
            "+",
            "Ly2/q0;",
            ">;I)I"
        }
    .end annotation

    invoke-super {p0, p1, p2, p3}, Ly2/r0;->d(Ly2/r;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public bridge e(Ly2/r;Ljava/util/List;I)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly2/r;",
            "Ljava/util/List<",
            "+",
            "Ly2/q0;",
            ">;I)I"
        }
    .end annotation

    invoke-super {p0, p1, p2, p3}, Ly2/r0;->e(Ly2/r;Ljava/util/List;I)I

    move-result p1

    return p1
.end method
