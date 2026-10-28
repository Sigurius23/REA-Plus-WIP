.class public final Lc0/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/r0;


# instance fields
.field public final a:Lc0/j0;

.field public b:Z


# direct methods
.method public constructor <init>(Lc0/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc0/y;->a:Lc0/j0;

    return-void
.end method


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 7

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    move-object v1, p2

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly2/q0;

    invoke-interface {v5, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v5

    iget v6, v5, Ly2/j1;->w:I

    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget v6, v5, Ly2/j1;->x:I

    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ly2/r;->A()Z

    move-result p2

    const-wide p3, 0xffffffffL

    const/16 v1, 0x20

    iget-object v2, p0, Lc0/y;->a:Lc0/j0;

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    iput-boolean p2, p0, Lc0/y;->b:Z

    iget-object p2, v2, Lc0/j0;->a:Lp1/k1;

    int-to-long v5, v3

    shl-long v1, v5, v1

    int-to-long v5, v4

    and-long/2addr p3, v5

    or-long/2addr p3, v1

    new-instance v1, Ly3/l;

    invoke-direct {v1, p3, p4}, Ly3/l;-><init>(J)V

    invoke-virtual {p2, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-boolean p2, p0, Lc0/y;->b:Z

    if-nez p2, :cond_2

    iget-object p2, v2, Lc0/j0;->a:Lp1/k1;

    int-to-long v5, v3

    shl-long v1, v5, v1

    int-to-long v5, v4

    and-long/2addr p3, v5

    or-long/2addr p3, v1

    new-instance v1, Ly3/l;

    invoke-direct {v1, p3, p4}, Ly3/l;-><init>(J)V

    invoke-virtual {p2, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_2
    :goto_1
    new-instance p2, La3/m1;

    const/16 p3, 0x8

    invoke-direct {p2, v0, p3}, La3/m1;-><init>(Ljava/lang/Object;I)V

    sget-object p3, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, v3, v4, p3, p2}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ly2/r;Ljava/util/List;I)I
    .locals 3

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    return v0

    :cond_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly2/q0;

    invoke-interface {p1, p3}, Ly2/q0;->C(I)I

    move-result p1

    invoke-static {p2}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v0

    const/4 v1, 0x1

    if-gt v1, v0, :cond_2

    :goto_0
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly2/q0;

    invoke-interface {v2, p3}, Ly2/q0;->C(I)I

    move-result v2

    if-le v2, p1, :cond_1

    move p1, v2

    :cond_1
    if-eq v1, v0, :cond_2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return p1
.end method

.method public final c(Ly2/r;Ljava/util/List;I)I
    .locals 3

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    return v0

    :cond_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly2/q0;

    invoke-interface {p1, p3}, Ly2/q0;->Q(I)I

    move-result p1

    invoke-static {p2}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v0

    const/4 v1, 0x1

    if-gt v1, v0, :cond_2

    :goto_0
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly2/q0;

    invoke-interface {v2, p3}, Ly2/q0;->Q(I)I

    move-result v2

    if-le v2, p1, :cond_1

    move p1, v2

    :cond_1
    if-eq v1, v0, :cond_2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return p1
.end method

.method public final d(Ly2/r;Ljava/util/List;I)I
    .locals 3

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    return v0

    :cond_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly2/q0;

    invoke-interface {p1, p3}, Ly2/q0;->b(I)I

    move-result p1

    invoke-static {p2}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v0

    const/4 v1, 0x1

    if-gt v1, v0, :cond_2

    :goto_0
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly2/q0;

    invoke-interface {v2, p3}, Ly2/q0;->b(I)I

    move-result v2

    if-le v2, p1, :cond_1

    move p1, v2

    :cond_1
    if-eq v1, v0, :cond_2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return p1
.end method

.method public final e(Ly2/r;Ljava/util/List;I)I
    .locals 3

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    return v0

    :cond_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly2/q0;

    invoke-interface {p1, p3}, Ly2/q0;->O(I)I

    move-result p1

    invoke-static {p2}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v0

    const/4 v1, 0x1

    if-gt v1, v0, :cond_2

    :goto_0
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly2/q0;

    invoke-interface {v2, p3}, Ly2/q0;->O(I)I

    move-result v2

    if-le v2, p1, :cond_1

    move p1, v2

    :cond_1
    if-eq v1, v0, :cond_2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return p1
.end method
