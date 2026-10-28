.class public final Lio/i;
.super Lio/k;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final E:I

.field public final F:Z

.field public final G:Z

.field public final H:Z

.field public final I:I

.field public final J:I

.field public final K:I

.field public final L:I

.field public final M:Z


# direct methods
.method public constructor <init>(ILsn/w0;ILio/f;ILjava/lang/String;)V
    .locals 6

    invoke-direct {p0, p1, p2, p3}, Lio/k;-><init>(ILsn/w0;I)V

    const/4 p1, 0x0

    invoke-static {p5, p1}, Lio/m;->b(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lio/i;->F:Z

    iget-object p2, p0, Lio/k;->z:Lrm/c0;

    iget p2, p2, Lrm/c0;->z:I

    iget p3, p4, Lio/f;->Z:I

    iget-object v0, p4, Lio/w;->S:Lzr/g0;

    not-int p3, p3

    and-int/2addr p2, p3

    and-int/lit8 p3, p2, 0x1

    const/4 v1, 0x1

    if-eqz p3, :cond_0

    move p3, v1

    goto :goto_0

    :cond_0
    move p3, p1

    :goto_0
    iput-boolean p3, p0, Lio/i;->G:Z

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    move p2, v1

    goto :goto_1

    :cond_1
    move p2, p1

    :goto_1
    iput-boolean p2, p0, Lio/i;->H:Z

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p2, ""

    invoke-static {p2}, Lzr/g0;->r(Ljava/lang/Object;)Lzr/w0;

    move-result-object p2

    goto :goto_2

    :cond_2
    move-object p2, v0

    :goto_2
    move p3, p1

    :goto_3
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    const v3, 0x7fffffff

    if-ge p3, v2, :cond_4

    iget-object v2, p0, Lio/k;->z:Lrm/c0;

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-boolean v5, p4, Lio/w;->U:Z

    invoke-static {v2, v4, v5}, Lio/m;->a(Lrm/c0;Ljava/lang/String;Z)I

    move-result v2

    if-lez v2, :cond_3

    goto :goto_4

    :cond_3
    add-int/lit8 p3, p3, 0x1

    goto :goto_3

    :cond_4
    move v2, p1

    move p3, v3

    :goto_4
    iput p3, p0, Lio/i;->I:I

    iput v2, p0, Lio/i;->J:I

    iget-object p2, p0, Lio/k;->z:Lrm/c0;

    iget p2, p2, Lrm/c0;->E:I

    iget p3, p4, Lio/w;->T:I

    if-eqz p2, :cond_5

    if-ne p2, p3, :cond_5

    goto :goto_5

    :cond_5
    and-int/2addr p2, p3

    invoke-static {p2}, Ljava/lang/Integer;->bitCount(I)I

    move-result v3

    :goto_5
    iput v3, p0, Lio/i;->K:I

    iget-object p2, p0, Lio/k;->z:Lrm/c0;

    iget p2, p2, Lrm/c0;->E:I

    and-int/lit16 p2, p2, 0x440

    if-eqz p2, :cond_6

    move p2, v1

    goto :goto_6

    :cond_6
    move p2, p1

    :goto_6
    iput-boolean p2, p0, Lio/i;->M:Z

    invoke-static {p6}, Lio/m;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_7

    move p2, v1

    goto :goto_7

    :cond_7
    move p2, p1

    :goto_7
    iget-object p3, p0, Lio/k;->z:Lrm/c0;

    invoke-static {p3, p6, p2}, Lio/m;->a(Lrm/c0;Ljava/lang/String;Z)I

    move-result p2

    iput p2, p0, Lio/i;->L:I

    if-gtz v2, :cond_a

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_8

    if-gtz v3, :cond_a

    :cond_8
    iget-boolean p3, p0, Lio/i;->G:Z

    if-nez p3, :cond_a

    iget-boolean p3, p0, Lio/i;->H:Z

    if-eqz p3, :cond_9

    if-lez p2, :cond_9

    goto :goto_8

    :cond_9
    move p2, p1

    goto :goto_9

    :cond_a
    :goto_8
    move p2, v1

    :goto_9
    iget-boolean p3, p4, Lio/f;->j0:Z

    invoke-static {p5, p3}, Lio/m;->b(IZ)Z

    move-result p3

    if-eqz p3, :cond_b

    if-eqz p2, :cond_b

    move p1, v1

    :cond_b
    iput p1, p0, Lio/i;->E:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lio/i;->E:I

    return v0
.end method

.method public final bridge synthetic b(Lio/k;)Z
    .locals 0

    check-cast p1, Lio/i;

    const/4 p1, 0x0

    return p1
.end method

.method public final c(Lio/i;)I
    .locals 7

    iget-boolean v0, p0, Lio/i;->F:Z

    iget-boolean v1, p1, Lio/i;->F:Z

    sget-object v2, Lzr/y;->a:Lzr/w;

    invoke-virtual {v2, v0, v1}, Lzr/w;->c(ZZ)Lzr/y;

    move-result-object v0

    iget v1, p0, Lio/i;->I:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p1, Lio/i;->I:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, Lzr/u0;->x:Lzr/u0;

    sget-object v4, Lzr/u0;->y:Lzr/u0;

    invoke-virtual {v0, v1, v2, v4}, Lzr/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lzr/y;

    move-result-object v0

    iget v1, p1, Lio/i;->J:I

    iget v2, p0, Lio/i;->J:I

    invoke-virtual {v0, v2, v1}, Lzr/y;->a(II)Lzr/y;

    move-result-object v0

    iget v1, p1, Lio/i;->K:I

    iget v5, p0, Lio/i;->K:I

    invoke-virtual {v0, v5, v1}, Lzr/y;->a(II)Lzr/y;

    move-result-object v0

    iget-boolean v1, p0, Lio/i;->G:Z

    iget-boolean v6, p1, Lio/i;->G:Z

    invoke-virtual {v0, v1, v6}, Lzr/y;->c(ZZ)Lzr/y;

    move-result-object v0

    iget-boolean v1, p0, Lio/i;->H:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean v6, p1, Lio/i;->H:Z

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v4

    :goto_0
    invoke-virtual {v0, v1, v6, v3}, Lzr/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lzr/y;

    move-result-object v0

    iget v1, p0, Lio/i;->L:I

    iget v2, p1, Lio/i;->L:I

    invoke-virtual {v0, v1, v2}, Lzr/y;->a(II)Lzr/y;

    move-result-object v0

    if-nez v5, :cond_1

    iget-boolean v1, p0, Lio/i;->M:Z

    iget-boolean p1, p1, Lio/i;->M:Z

    invoke-virtual {v0, v1, p1}, Lzr/y;->d(ZZ)Lzr/y;

    move-result-object v0

    :cond_1
    invoke-virtual {v0}, Lzr/y;->e()I

    move-result p1

    return p1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lio/i;

    invoke-virtual {p0, p1}, Lio/i;->c(Lio/i;)I

    move-result p1

    return p1
.end method
