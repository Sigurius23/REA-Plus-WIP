.class public final Landroidx/compose/ui/graphics/vector/VectorPainter;
.super Ln2/a;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/graphics/vector/VectorPainter;",
        "Ln2/a;",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final E:Lp1/k1;

.field public final F:Lp1/k1;

.field public final G:Lo2/d0;

.field public final H:Lp1/h1;

.field public I:F

.field public J:Li2/y;

.field public K:I


# direct methods
.method public constructor <init>(Lo2/b;)V
    .locals 3

    invoke-direct {p0}, Ln2/a;-><init>()V

    new-instance v0, Lh2/e;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lh2/e;-><init>(J)V

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/graphics/vector/VectorPainter;->E:Lp1/k1;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/graphics/vector/VectorPainter;->F:Lp1/k1;

    new-instance v0, Lo2/d0;

    invoke-direct {v0, p1}, Lo2/d0;-><init>(Lo2/b;)V

    new-instance p1, La3/l0;

    const/16 v1, 0x10

    invoke-direct {p1, p0, v1}, La3/l0;-><init>(Ljava/lang/Object;I)V

    iput-object p1, v0, Lo2/d0;->f:Lkotlin/jvm/internal/m;

    iput-object v0, p0, Landroidx/compose/ui/graphics/vector/VectorPainter;->G:Lo2/d0;

    new-instance p1, Lp1/h1;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lp1/h1;-><init>(I)V

    iput-object p1, p0, Landroidx/compose/ui/graphics/vector/VectorPainter;->H:Lp1/h1;

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Landroidx/compose/ui/graphics/vector/VectorPainter;->I:F

    const/4 p1, -0x1

    iput p1, p0, Landroidx/compose/ui/graphics/vector/VectorPainter;->K:I

    return-void
.end method


# virtual methods
.method public final b(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/graphics/vector/VectorPainter;->I:F

    return-void
.end method

.method public final e(Li2/y;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/graphics/vector/VectorPainter;->J:Li2/y;

    return-void
.end method

.method public final h()J
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/graphics/vector/VectorPainter;->E:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/e;

    iget-wide v0, v0, Lh2/e;->a:J

    return-wide v0
.end method

.method public final i(Lk2/e;)V
    .locals 10

    iget-object v0, p0, Landroidx/compose/ui/graphics/vector/VectorPainter;->J:Li2/y;

    iget-object v1, p0, Landroidx/compose/ui/graphics/vector/VectorPainter;->G:Lo2/d0;

    if-nez v0, :cond_0

    iget-object v0, v1, Lo2/d0;->g:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/y;

    :cond_0
    iget-object v2, p0, Landroidx/compose/ui/graphics/vector/VectorPainter;->F:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Lk2/e;->getLayoutDirection()Ly3/m;

    move-result-object v2

    sget-object v3, Ly3/m;->x:Ly3/m;

    if-ne v2, v3, :cond_1

    invoke-interface {p1}, Lk2/e;->B0()J

    move-result-wide v2

    invoke-interface {p1}, Lk2/e;->t0()La3/p;

    move-result-object v4

    invoke-virtual {v4}, La3/p;->A()J

    move-result-wide v5

    invoke-virtual {v4}, La3/p;->w()Li2/v;

    move-result-object v7

    invoke-interface {v7}, Li2/v;->q()V

    :try_start_0
    iget-object v7, v4, La3/p;->x:Ljava/lang/Object;

    check-cast v7, Laj/d;

    const/high16 v8, -0x40800000    # -1.0f

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-virtual {v7, v8, v2, v3, v9}, Laj/d;->w(FJF)V

    iget v2, p0, Landroidx/compose/ui/graphics/vector/VectorPainter;->I:F

    invoke-virtual {v1, p1, v2, v0}, Lo2/d0;->e(Lk2/e;FLi2/y;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v4, v5, v6}, Ld;->z(La3/p;J)V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {v4, v5, v6}, Ld;->z(La3/p;J)V

    throw p1

    :cond_1
    iget v2, p0, Landroidx/compose/ui/graphics/vector/VectorPainter;->I:F

    invoke-virtual {v1, p1, v2, v0}, Lo2/d0;->e(Lk2/e;FLi2/y;)V

    :goto_0
    iget-object p1, p0, Landroidx/compose/ui/graphics/vector/VectorPainter;->H:Lp1/h1;

    invoke-virtual {p1}, Lp1/h1;->x()I

    move-result p1

    iput p1, p0, Landroidx/compose/ui/graphics/vector/VectorPainter;->K:I

    return-void
.end method
