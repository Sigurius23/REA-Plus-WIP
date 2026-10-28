.class public final Lg40/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/z0;


# static fields
.field public static final a:Lg40/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg40/b0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lg40/b0;->a:Lg40/b0;

    return-void
.end method


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 8

    const-string v0, "$this$Layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/util/ArrayList;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v1, 0x1

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ne v2, v1, :cond_3

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ne v2, v1, :cond_2

    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/q0;

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v3, 0x0

    const v4, 0x7fffffff

    const/4 v5, 0x0

    move-wide v1, p3

    invoke-static/range {v1 .. v7}, Ly3/a;->b(JIIIII)J

    move-result-wide p3

    invoke-interface {v0, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p3

    invoke-static {v1, v2}, Ly3/a;->i(J)I

    move-result p4

    iget v0, p3, Ly2/j1;->w:I

    sub-int v3, p4, v0

    invoke-static {p2}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ly2/q0;

    move v4, v3

    invoke-static/range {v1 .. v7}, Ly3/a;->b(JIIIII)J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    sget-object p4, Ly2/d;->a:Ly2/m;

    invoke-virtual {p2, p4}, Ly2/j1;->c0(Ly2/a;)I

    move-result v0

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_1

    invoke-virtual {p2, p4}, Ly2/j1;->c0(Ly2/a;)I

    move-result p4

    int-to-double v0, p4

    const-wide v2, 0x3ff3333333333333L    # 1.2

    mul-double/2addr v0, v2

    double-to-int p4, v0

    iget v0, p3, Ly2/j1;->x:I

    sub-int/2addr v0, p4

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    iget v1, p3, Ly2/j1;->w:I

    iget v2, p2, Ly2/j1;->w:I

    add-int/2addr v1, v2

    iget v2, p3, Ly2/j1;->x:I

    if-le p4, v2, :cond_0

    add-int/2addr v2, v0

    iget v3, p2, Ly2/j1;->x:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_0

    :cond_0
    iget v3, p2, Ly2/j1;->x:I

    add-int/2addr v3, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    :goto_0
    new-instance v3, Lg1/c;

    invoke-direct {v3, p4, p3, v0, p2}, Lg1/c;-><init>(ILy2/j1;ILy2/j1;)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, v1, v2, p2, v3}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "textContentPlaceable should have a first baseline"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "textContentMeasurables should only emit one composable"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "startContentMeasurables should only emit one composable"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
