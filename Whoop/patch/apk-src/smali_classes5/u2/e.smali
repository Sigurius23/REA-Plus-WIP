.class public abstract Lu2/e;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/p2;
.implements La3/f2;
.implements La3/m;


# instance fields
.field public O:La3/q;

.field public P:Lu2/a;

.field public Q:Z


# direct methods
.method public constructor <init>(Lu2/a;La3/q;)V
    .locals 0

    invoke-direct {p0}, Lb2/v;-><init>()V

    iput-object p2, p0, Lu2/e;->O:La3/q;

    iput-object p1, p0, Lu2/e;->P:Lu2/a;

    return-void
.end method


# virtual methods
.method public final Q0()V
    .locals 0

    invoke-virtual {p0}, Lu2/e;->b1()V

    return-void
.end method

.method public final S()J
    .locals 5

    iget-object v0, p0, Lu2/e;->O:La3/q;

    if-eqz v0, :cond_0

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v1

    iget-object v1, v1, La3/n0;->X:Ly3/c;

    sget v2, La3/n2;->b:I

    iget v2, v0, La3/q;->a:F

    invoke-interface {v1, v2}, Ly3/c;->F(F)I

    move-result v2

    iget v3, v0, La3/q;->b:F

    invoke-interface {v1, v3}, Ly3/c;->F(F)I

    move-result v3

    iget v4, v0, La3/q;->c:F

    invoke-interface {v1, v4}, Ly3/c;->F(F)I

    move-result v4

    iget v0, v0, La3/q;->d:F

    invoke-interface {v1, v0}, Ly3/c;->F(F)I

    move-result v0

    invoke-static {v2, v3, v4, v0}, La3/m2;->c(IIII)J

    move-result-wide v0

    return-wide v0

    :cond_0
    sget-wide v0, La3/n2;->a:J

    return-wide v0
.end method

.method public final X0()V
    .locals 3

    new-instance v0, Lkotlin/jvm/internal/g0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ld8/a;

    const/16 v2, 0xd

    invoke-direct {v1, v0, v2}, Ld8/a;-><init>(Ljava/lang/Object;I)V

    invoke-static {p0, v1}, La3/g;->s(La3/p2;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lu2/e;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lu2/e;->P:Lu2/a;

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lu2/e;->P:Lu2/a;

    :cond_1
    invoke-virtual {p0, v0}, Lu2/e;->Y0(Lu2/o;)V

    return-void
.end method

.method public abstract Y0(Lu2/o;)V
.end method

.method public final Z0()V
    .locals 2

    new-instance v0, Lkotlin/jvm/internal/b0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lkotlin/jvm/internal/b0;->w:Z

    new-instance v1, Le2/e;

    invoke-direct {v1, v0}, Le2/e;-><init>(Lkotlin/jvm/internal/b0;)V

    invoke-static {p0, v1}, La3/g;->t(La3/p2;Lkotlin/jvm/functions/Function1;)V

    iget-boolean v0, v0, Lkotlin/jvm/internal/b0;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lu2/e;->X0()V

    :cond_0
    return-void
.end method

.method public abstract a1(I)Z
.end method

.method public final b0()V
    .locals 0

    invoke-virtual {p0}, Lu2/e;->b1()V

    return-void
.end method

.method public final b1()V
    .locals 3

    iget-boolean v0, p0, Lu2/e;->Q:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu2/e;->Q:Z

    iget-boolean v0, p0, Lb2/v;->N:Z

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/g0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lb3/t;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lb3/t;-><init>(Lkotlin/jvm/internal/g0;I)V

    invoke-static {p0, v1}, La3/g;->s(La3/p2;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lu2/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lu2/e;->X0()V

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lu2/e;->Y0(Lu2/o;)V

    :cond_1
    return-void
.end method

.method public final r0(Lu2/k;Lu2/l;J)V
    .locals 1

    sget-object p3, Lu2/l;->x:Lu2/l;

    if-ne p2, p3, :cond_2

    iget-object p2, p1, Lu2/k;->a:Ljava/lang/Object;

    move-object p3, p2

    check-cast p3, Ljava/util/Collection;

    invoke-interface {p3}, Ljava/util/Collection;->size()I

    move-result p3

    const/4 p4, 0x0

    :goto_0
    if-ge p4, p3, :cond_2

    invoke-interface {p2, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu2/r;

    iget v0, v0, Lu2/r;->i:I

    invoke-virtual {p0, v0}, Lu2/e;->a1(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget p1, p1, Lu2/k;->f:I

    const/4 p2, 0x4

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu2/e;->Q:Z

    invoke-virtual {p0}, Lu2/e;->Z0()V

    return-void

    :cond_0
    const/4 p2, 0x5

    if-ne p1, p2, :cond_2

    invoke-virtual {p0}, Lu2/e;->b1()V

    return-void

    :cond_1
    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method
