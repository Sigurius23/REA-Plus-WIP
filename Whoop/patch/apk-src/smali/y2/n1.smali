.class public final Ly2/n1;
.super La3/i0;
.source "SourceFile"


# static fields
.field public static final b:Ly2/n1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly2/n1;

    const-string v1, "Undefined intrinsics block and it is required"

    invoke-direct {v0, v1}, La3/i0;-><init>(Ljava/lang/String;)V

    sput-object v0, Ly2/n1;->b:Ly2/n1;

    return-void
.end method


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 8

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    sget-object v1, Lm83/z;->w:Lm83/z;

    if-eqz v0, :cond_2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v2, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    move-object v2, p2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    move v4, v3

    move v5, v4

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly2/q0;

    invoke-interface {v6, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v6

    iget v7, v6, Ly2/j1;->w:I

    invoke-static {v7, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    iget v7, v6, Ly2/j1;->x:I

    invoke-static {v7, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v4, p3, p4}, Ly3/b;->g(IJ)I

    move-result p2

    invoke-static {v5, p3, p4}, Ly3/b;->f(IJ)I

    move-result p3

    new-instance p4, Lc4/g;

    const/4 v2, 0x2

    invoke-direct {p4, v0, v2}, Lc4/g;-><init>(Ljava/util/ArrayList;I)V

    invoke-interface {p1, p2, p3, v1, p4}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ly2/q0;

    invoke-interface {p2, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    iget v0, p2, Ly2/j1;->w:I

    invoke-static {v0, p3, p4}, Ly3/b;->g(IJ)I

    move-result v0

    iget v2, p2, Ly2/j1;->x:I

    invoke-static {v2, p3, p4}, Ly3/b;->f(IJ)I

    move-result p3

    new-instance p4, Lc0/g0;

    const/4 v2, 0x2

    invoke-direct {p4, p2, v2}, Lc0/g0;-><init>(Ly2/j1;I)V

    invoke-interface {p1, v0, p3, v1, p4}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {p3, p4}, Ly3/a;->k(J)I

    move-result p2

    invoke-static {p3, p4}, Ly3/a;->j(J)I

    move-result p3

    sget-object p4, Ly2/k1;->y:Ly2/k1;

    invoke-interface {p1, p2, p3, v1, p4}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method
