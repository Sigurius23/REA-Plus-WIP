.class final Le81/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/r0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le81/k;->E(Ljava/util/List;La01/h;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic a:Lp1/z0;


# direct methods
.method public constructor <init>(Lp1/z0;)V
    .locals 0

    iput-object p1, p0, Le81/k$a;->a:Lp1/z0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic f(Ly2/j1;Ly2/j1;Ly2/j1;Ly2/i1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Le81/k$a;->g(Ly2/j1;Ly2/j1;Ly2/j1;Ly2/i1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Ly2/j1;Ly2/j1;Ly2/j1;Ly2/i1;)Ll83/a0;
    .locals 2

    const-string v0, "$this$layout"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p3, p0, v0, v0, v1}, Ly2/i1;->f(Ly2/j1;IIF)V

    invoke-virtual {p3, p1, v0, v0, v1}, Ly2/i1;->f(Ly2/j1;IIF)V

    invoke-virtual {p3, p2, v0, v0, v1}, Ly2/i1;->f(Ly2/j1;IIF)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 11
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

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly2/q0;

    const/4 v2, 0x1

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly2/q0;

    const/4 v4, 0x2

    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ly2/q0;

    const/4 v9, 0x0

    const/16 v10, 0xb

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-wide v4, p3

    invoke-static/range {v4 .. v10}, Ly3/a;->b(JIIIII)J

    move-result-wide p3

    invoke-interface {v3, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p3

    iget-object p4, p0, Le81/k$a;->a:Lp1/z0;

    iget v3, p3, Ly2/j1;->x:I

    int-to-float v3, v3

    check-cast p4, Lp1/g1;

    invoke-virtual {p4, v3}, Lp1/g1;->y(F)V

    iget p4, p3, Ly2/j1;->w:I

    const v3, 0x7fffffff

    invoke-static {p4, p4, v0, v3}, Ly3/b;->a(IIII)J

    move-result-wide v6

    invoke-interface {p2, v6, v7}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    iget v3, p3, Ly2/j1;->x:I

    iget v6, p2, Ly2/j1;->x:I

    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    move-result v3

    if-ltz p4, :cond_0

    move v6, v2

    goto :goto_0

    :cond_0
    move v6, v0

    :goto_0
    if-ltz v3, :cond_1

    move v0, v2

    :cond_1
    and-int/2addr v0, v6

    if-nez v0, :cond_2

    const-string v0, "width and height must be >= 0"

    invoke-static {v0}, Ly3/i;->a(Ljava/lang/String;)V

    :cond_2
    invoke-static {p4, p4, v3, v3}, Ly3/b;->h(IIII)J

    move-result-wide v2

    invoke-interface {v1, v2, v3}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v0

    iget v1, p3, Ly2/j1;->x:I

    invoke-static {v4, v5}, Ly3/a;->j(J)I

    move-result v2

    if-ge v1, v2, :cond_3

    move v1, v2

    :cond_3
    new-instance v2, Le81/j;

    invoke-direct {v2, v0, p3, p2}, Le81/j;-><init>(Ly2/j1;Ly2/j1;Ly2/j1;)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p4, v1, p2, v2}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

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
