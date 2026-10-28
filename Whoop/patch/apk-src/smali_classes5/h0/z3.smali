.class public final Lh0/z3;
.super La3/o;
.source "SourceFile"

# interfaces
.implements La3/f2;
.implements La3/m;


# instance fields
.field public Q:Lh0/a4;

.field public R:Lgo1/a;

.field public S:Z

.field public final T:Leg/j;

.field public final U:Ldc3/h;

.field public V:Le10/k0;

.field public final W:Lu2/h0;

.field public X:La3/f2;


# direct methods
.method public constructor <init>(Lh0/a4;Lgo1/a;)V
    .locals 1

    invoke-direct {p0}, La3/o;-><init>()V

    iput-object p1, p0, Lh0/z3;->Q:Lh0/a4;

    iput-object p2, p0, Lh0/z3;->R:Lgo1/a;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lh0/z3;->S:Z

    new-instance p1, Leg/j;

    const/16 p2, 0x1b

    invoke-direct {p1, p0, p2}, Leg/j;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lh0/z3;->T:Leg/j;

    const/4 p1, 0x0

    const/4 p2, 0x6

    const v0, 0x7fffffff

    invoke-static {v0, p2, p1}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object p1

    iput-object p1, p0, Lh0/z3;->U:Ldc3/h;

    new-instance p1, La1/f;

    const/4 p2, 0x5

    invoke-direct {p1, p0, p2}, La1/f;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lu2/c0;->a(Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Lu2/h0;

    move-result-object p1

    invoke-virtual {p0, p1}, La3/o;->X0(La3/n;)La3/n;

    iput-object p1, p0, Lh0/z3;->W:Lu2/h0;

    return-void
.end method


# virtual methods
.method public final P0()V
    .locals 1

    invoke-static {p0}, Lh0/q3;->n(La3/m;)Le10/k0;

    move-result-object v0

    iput-object v0, p0, Lh0/z3;->V:Le10/k0;

    return-void
.end method

.method public final b0()V
    .locals 1

    iget-object v0, p0, Lh0/z3;->W:Lu2/h0;

    invoke-virtual {v0}, Lu2/h0;->b0()V

    iget-object v0, p0, Lh0/z3;->X:La3/f2;

    if-eqz v0, :cond_0

    invoke-interface {v0}, La3/f2;->b0()V

    :cond_0
    return-void
.end method

.method public final r0(Lu2/k;Lu2/l;J)V
    .locals 6

    iget-object v0, p0, Lh0/z3;->V:Le10/k0;

    iget-boolean v1, p0, Lh0/z3;->S:Z

    if-eqz v1, :cond_1

    iget-object v1, p1, Lu2/k;->a:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu2/r;

    iget v4, v4, Lu2/r;->i:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lh0/z3;->X:La3/f2;

    if-nez v1, :cond_1

    new-instance v1, Lf1/k0;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p0, v0}, Lf1/k0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lu2/c0;->a(Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Lu2/h0;

    move-result-object v0

    invoke-virtual {p0, v0}, La3/o;->X0(La3/n;)La3/n;

    iput-object v0, p0, Lh0/z3;->X:La3/f2;

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v0, p0, Lh0/z3;->W:Lu2/h0;

    invoke-virtual {v0, p1, p2, p3, p4}, Lu2/h0;->r0(Lu2/k;Lu2/l;J)V

    iget-object v0, p0, Lh0/z3;->X:La3/f2;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1, p2, p3, p4}, La3/f2;->r0(Lu2/k;Lu2/l;J)V

    :cond_2
    return-void
.end method
