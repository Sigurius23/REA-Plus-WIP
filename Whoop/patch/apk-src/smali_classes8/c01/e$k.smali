.class final Lc01/e$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/r0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc01/e;->v(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic a:Ly3/c;


# direct methods
.method public constructor <init>(Ly3/c;)V
    .locals 0

    iput-object p1, p0, Lc01/e$k;->a:Ly3/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic f(ZLy2/j1;Ly2/j1;IILy2/i1;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lc01/e$k;->g(ZLy2/j1;Ly2/j1;IILy2/i1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(ZLy2/j1;Ly2/j1;IILy2/i1;)Ll83/a0;
    .locals 1

    const-string v0, "$this$layout"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-static {p1, v0, v0, p5}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    iget p0, p1, Ly2/j1;->w:I

    add-int/2addr p0, p3

    invoke-static {p2, p0, v0, p5}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v0, v0, p5}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    iget p0, p1, Ly2/j1;->x:I

    add-int/2addr p0, p4

    invoke-static {p2, v0, p0, p5}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 10
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

    const/16 v7, 0xa

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-wide v1, p3

    invoke-static/range {v1 .. v7}, Ly3/a;->b(JIIIII)J

    move-result-wide p3

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly2/q0;

    invoke-interface {v3, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v6

    const/4 v3, 0x1

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ly2/q0;

    invoke-interface {p2, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v7

    iget-object p2, p0, Lc01/e$k;->a:Ly3/c;

    int-to-float p3, v3

    const/4 p4, 0x4

    int-to-float p4, p4

    mul-float/2addr p3, p4

    invoke-interface {p2, p3}, Ly3/c;->F(F)I

    move-result v8

    iget-object p2, p0, Lc01/e$k;->a:Ly3/c;

    const-wide/high16 v4, 0x4004000000000000L    # 2.5

    double-to-float p3, v4

    mul-float/2addr p3, p4

    invoke-interface {p2, p3}, Ly3/c;->F(F)I

    move-result v9

    iget p2, v6, Ly2/j1;->w:I

    add-int/2addr p2, v8

    iget p3, v7, Ly2/j1;->w:I

    add-int/2addr p2, p3

    invoke-static {v1, v2}, Ly3/a;->i(J)I

    move-result p3

    if-gt p2, p3, :cond_0

    move v5, v3

    goto :goto_0

    :cond_0
    move v5, v0

    :goto_0
    if-eqz v5, :cond_1

    iget p2, v6, Ly2/j1;->w:I

    add-int/2addr p2, v8

    iget p3, v7, Ly2/j1;->w:I

    add-int/2addr p2, p3

    invoke-static {v1, v2}, Ly3/a;->k(J)I

    move-result p3

    invoke-static {v1, v2}, Ly3/a;->i(J)I

    move-result p4

    invoke-static {p2, p3, p4}, Le93/b;->n(III)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget p3, v6, Ly2/j1;->x:I

    iget p4, v7, Ly2/j1;->x:I

    invoke-static {p3, p4}, Ljava/lang/Math;->max(II)I

    move-result p3

    invoke-static {v1, v2}, Ly3/a;->j(J)I

    move-result p4

    invoke-static {v1, v2}, Ly3/a;->h(J)I

    move-result v0

    invoke-static {p3, p4, v0}, Le93/b;->n(III)I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    new-instance p4, Ll83/k;

    invoke-direct {p4, p2, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    invoke-static {v1, v2}, Ly3/a;->i(J)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget p3, v6, Ly2/j1;->x:I

    add-int/2addr p3, v9

    iget p4, v7, Ly2/j1;->x:I

    add-int/2addr p3, p4

    invoke-static {v1, v2}, Ly3/a;->j(J)I

    move-result p4

    invoke-static {v1, v2}, Ly3/a;->h(J)I

    move-result v0

    invoke-static {p3, p4, v0}, Le93/b;->n(III)I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    new-instance p4, Ll83/k;

    invoke-direct {p4, p2, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    iget-object p2, p4, Ll83/k;->w:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    iget-object p3, p4, Ll83/k;->x:Ljava/lang/Object;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    new-instance v4, Lc01/f;

    invoke-direct/range {v4 .. v9}, Lc01/f;-><init>(ZLy2/j1;Ly2/j1;II)V

    sget-object p4, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p2, p3, p4, v4}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

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
