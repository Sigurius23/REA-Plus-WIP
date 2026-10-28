.class final Ll81/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/r0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll81/d;->g(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Ljava/lang/Double;Ljava/lang/Double;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Ll81/d$a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic f(Ly2/j1;Ly2/j1;ILy2/i1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ll81/d$a;->g(Ly2/j1;Ly2/j1;ILy2/i1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Ly2/j1;Ly2/j1;ILy2/i1;)Ll83/a0;
    .locals 2

    const-string v0, "$this$layout"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p3, p0, v0, v0, v1}, Ly2/i1;->f(Ly2/j1;IIF)V

    iget p0, p1, Ly2/j1;->x:I

    sub-int/2addr p2, p0

    invoke-virtual {p3, p1, v0, p2, v1}, Ly2/i1;->f(Ly2/j1;IIF)V

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

    const v6, 0x7fffffff

    const/4 v7, 0x3

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

    const/4 v1, 0x1

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ly2/q0;

    invoke-interface {p2, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    iget p3, v0, Ly2/j1;->x:I

    iget p4, p2, Ly2/j1;->x:I

    add-int/2addr p3, p4

    iget p4, p0, Ll81/d$a;->a:I

    invoke-static {p3, p4}, Ljava/lang/Math;->max(II)I

    move-result p3

    iget p4, v0, Ly2/j1;->w:I

    iget v1, p2, Ly2/j1;->w:I

    invoke-static {p4, v1}, Ljava/lang/Math;->max(II)I

    move-result p4

    new-instance v1, Ll81/c;

    invoke-direct {v1, v0, p2, p3}, Ll81/c;-><init>(Ly2/j1;Ly2/j1;I)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p4, p3, p2, v1}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

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
