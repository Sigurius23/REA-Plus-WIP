.class final Llw1/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/r0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llw1/h;->h(Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V
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


# static fields
.field public static final a:Llw1/h$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llw1/h$a;

    invoke-direct {v0}, Llw1/h$a;-><init>()V

    sput-object v0, Llw1/h$a;->a:Llw1/h$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic f(Ljava/util/ArrayList;ILy2/i1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Llw1/h$a;->h(Ljava/util/List;ILy2/i1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/util/ArrayList;ILy2/i1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Llw1/h$a;->i(Ljava/util/List;ILy2/i1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Ljava/util/List;ILy2/i1;)Ll83/a0;
    .locals 3

    const-string v0, "$this$layout"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly2/j1;

    iget v2, v1, Ly2/j1;->w:I

    sub-int v2, p1, v2

    invoke-static {v1, v2, v0, p2}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    iget v1, v1, Ly2/j1;->x:I

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Ljava/util/List;ILy2/i1;)Ll83/a0;
    .locals 3

    const-string v0, "$this$layout"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly2/j1;

    iget v2, v1, Ly2/j1;->x:I

    sub-int v2, p1, v2

    div-int/lit8 v2, v2, 0x2

    invoke-static {v1, v0, v2, p2}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    iget v1, v1, Ly2/j1;->w:I

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
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

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly2/q0;

    invoke-static {p3, p4}, Ly3/a;->h(J)I

    move-result v4

    invoke-interface {v3, v4}, Ly2/q0;->Q(I)I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_0

    :cond_0
    invoke-static {p3, p4}, Ly3/a;->i(J)I

    move-result v0

    if-le v2, v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly2/q0;

    if-eqz v0, :cond_2

    invoke-interface {v3, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v3

    move-wide v4, p3

    goto :goto_3

    :cond_2
    const/4 v9, 0x0

    const/16 v10, 0xc

    const/4 v6, 0x0

    const v7, 0x7fffffff

    const/4 v8, 0x0

    move-wide v4, p3

    invoke-static/range {v4 .. v10}, Ly3/a;->b(JIIIII)J

    move-result-wide p3

    invoke-interface {v3, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v3

    :goto_3
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-wide p3, v4

    goto :goto_2

    :cond_3
    move-wide v4, p3

    sget-object p2, Lm83/z;->w:Lm83/z;

    const/4 p3, 0x0

    if-eqz v0, :cond_9

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_5

    :cond_4
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ly2/j1;

    iget p3, p3, Ly2/j1;->w:I

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    :cond_5
    :goto_4
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/j1;

    iget v0, v0, Ly2/j1;->w:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    move-result v3

    if-gez v3, :cond_5

    move-object p3, v0

    goto :goto_4

    :cond_6
    :goto_5
    if-eqz p3, :cond_7

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    goto :goto_6

    :cond_7
    move p3, v1

    :goto_6
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_7
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/j1;

    iget v0, v0, Ly2/j1;->x:I

    add-int/2addr v1, v0

    goto :goto_7

    :cond_8
    invoke-static {p3, v4, v5}, Ly3/b;->g(IJ)I

    move-result p3

    invoke-static {v1, v4, v5}, Ly3/b;->f(IJ)I

    move-result p4

    new-instance v0, Llw1/g;

    const/4 v1, 0x0

    invoke-direct {v0, v2, p3, v1}, Llw1/g;-><init>(Ljava/util/ArrayList;II)V

    invoke-interface {p1, p3, p4, p2, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1

    :cond_9
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p4

    move v0, v1

    :goto_8
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly2/j1;

    iget v3, v3, Ly2/j1;->w:I

    add-int/2addr v0, v3

    goto :goto_8

    :cond_a
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_b

    goto :goto_a

    :cond_b
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ly2/j1;

    iget p3, p3, Ly2/j1;->x:I

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    :cond_c
    :goto_9
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly2/j1;

    iget v3, v3, Ly2/j1;->x:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    move-result v6

    if-gez v6, :cond_c

    move-object p3, v3

    goto :goto_9

    :cond_d
    :goto_a
    if-eqz p3, :cond_e

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :cond_e
    invoke-static {v0, v4, v5}, Ly3/b;->g(IJ)I

    move-result p3

    invoke-static {v1, v4, v5}, Ly3/b;->f(IJ)I

    move-result p4

    new-instance v0, Llw1/g;

    const/4 v1, 0x1

    invoke-direct {v0, v2, p4, v1}, Llw1/g;-><init>(Ljava/util/ArrayList;II)V

    invoke-interface {p1, p3, p4, p2, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

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
