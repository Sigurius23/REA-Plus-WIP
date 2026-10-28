.class public final Lwa3/z;
.super Lwa3/e;
.source "SourceFile"


# static fields
.field public static final H:[I


# instance fields
.field public final E:I

.field public final F:I

.field public G:I

.field public final x:I

.field public final y:Lwa3/e;

.field public final z:Lwa3/e;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x1

    move v2, v1

    :goto_0
    if-lez v1, :cond_0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/2addr v2, v1

    move v4, v2

    move v2, v1

    move v1, v4

    goto :goto_0

    :cond_0
    const v1, 0x7fffffff

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [I

    sput-object v1, Lwa3/z;->H:[I

    const/4 v1, 0x0

    :goto_1
    sget-object v2, Lwa3/z;->H:[I

    array-length v3, v2

    if-ge v1, v3, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public constructor <init>(Lwa3/e;Lwa3/e;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lwa3/z;->G:I

    iput-object p1, p0, Lwa3/z;->y:Lwa3/e;

    iput-object p2, p0, Lwa3/z;->z:Lwa3/e;

    invoke-virtual {p1}, Lwa3/e;->size()I

    move-result v0

    iput v0, p0, Lwa3/z;->E:I

    invoke-virtual {p2}, Lwa3/e;->size()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lwa3/z;->x:I

    invoke-virtual {p1}, Lwa3/e;->f()I

    move-result p1

    invoke-virtual {p2}, Lwa3/e;->f()I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lwa3/z;->F:I

    return-void
.end method


# virtual methods
.method public final e(III[B)V
    .locals 3

    add-int v0, p1, p3

    iget-object v1, p0, Lwa3/z;->y:Lwa3/e;

    iget v2, p0, Lwa3/z;->E:I

    if-gt v0, v2, :cond_0

    invoke-virtual {v1, p1, p2, p3, p4}, Lwa3/e;->e(III[B)V

    return-void

    :cond_0
    iget-object v0, p0, Lwa3/z;->z:Lwa3/e;

    if-lt p1, v2, :cond_1

    sub-int/2addr p1, v2

    invoke-virtual {v0, p1, p2, p3, p4}, Lwa3/e;->e(III[B)V

    return-void

    :cond_1
    sub-int/2addr v2, p1

    invoke-virtual {v1, p1, p2, v2, p4}, Lwa3/e;->e(III[B)V

    add-int/2addr p2, v2

    sub-int/2addr p3, v2

    const/4 p1, 0x0

    invoke-virtual {v0, p1, p2, p3, p4}, Lwa3/e;->e(III[B)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 12

    if-ne p1, p0, :cond_0

    goto :goto_3

    :cond_0
    instance-of v0, p1, Lwa3/e;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    check-cast p1, Lwa3/e;

    invoke-virtual {p1}, Lwa3/e;->size()I

    move-result v0

    iget v2, p0, Lwa3/z;->x:I

    if-eq v2, v0, :cond_2

    goto :goto_2

    :cond_2
    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    iget v0, p0, Lwa3/z;->G:I

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lwa3/e;->o()I

    move-result v0

    if-eqz v0, :cond_4

    iget v3, p0, Lwa3/z;->G:I

    if-eq v3, v0, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Laf3/u;

    invoke-direct {v0, p0}, Laf3/u;-><init>(Lwa3/e;)V

    invoke-virtual {v0}, Laf3/u;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwa3/u;

    new-instance v4, Laf3/u;

    invoke-direct {v4, p1}, Laf3/u;-><init>(Lwa3/e;)V

    invoke-virtual {v4}, Laf3/u;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwa3/u;

    move v5, v1

    move v6, v5

    move v7, v6

    :goto_0
    iget-object v8, v3, Lwa3/u;->x:[B

    array-length v8, v8

    sub-int/2addr v8, v5

    iget-object v9, p1, Lwa3/u;->x:[B

    array-length v9, v9

    sub-int/2addr v9, v6

    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v10

    if-nez v5, :cond_5

    invoke-virtual {v3, p1, v6, v10}, Lwa3/u;->t(Lwa3/u;II)Z

    move-result v11

    goto :goto_1

    :cond_5
    invoke-virtual {p1, v3, v5, v10}, Lwa3/u;->t(Lwa3/u;II)Z

    move-result v11

    :goto_1
    if-nez v11, :cond_6

    :goto_2
    return v1

    :cond_6
    add-int/2addr v7, v10

    if-lt v7, v2, :cond_8

    if-ne v7, v2, :cond_7

    :goto_3
    const/4 p1, 0x1

    return p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_8
    if-ne v10, v8, :cond_9

    invoke-virtual {v0}, Laf3/u;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwa3/u;

    move v5, v1

    goto :goto_4

    :cond_9
    add-int/2addr v5, v10

    :goto_4
    if-ne v10, v9, :cond_a

    invoke-virtual {v4}, Laf3/u;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwa3/u;

    move v6, v1

    goto :goto_0

    :cond_a
    add-int/2addr v6, v10

    goto :goto_0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lwa3/z;->F:I

    return v0
.end method

.method public final g()Z
    .locals 2

    sget-object v0, Lwa3/z;->H:[I

    iget v1, p0, Lwa3/z;->F:I

    aget v0, v0, v1

    iget v1, p0, Lwa3/z;->x:I

    if-lt v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lwa3/z;->G:I

    if-nez v0, :cond_1

    iget v0, p0, Lwa3/z;->x:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v0}, Lwa3/z;->m(III)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput v0, p0, Lwa3/z;->G:I

    :cond_1
    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lwa3/y;

    invoke-direct {v0, p0}, Lwa3/y;-><init>(Lwa3/z;)V

    return-object v0
.end method

.method public final j()Z
    .locals 4

    iget v0, p0, Lwa3/z;->E:I

    iget-object v1, p0, Lwa3/z;->y:Lwa3/e;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2, v0}, Lwa3/e;->n(III)I

    move-result v0

    iget-object v1, p0, Lwa3/z;->z:Lwa3/e;

    invoke-virtual {v1}, Lwa3/e;->size()I

    move-result v3

    invoke-virtual {v1, v0, v2, v3}, Lwa3/e;->n(III)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v2
.end method

.method public final m(III)I
    .locals 3

    add-int v0, p2, p3

    iget-object v1, p0, Lwa3/z;->y:Lwa3/e;

    iget v2, p0, Lwa3/z;->E:I

    if-gt v0, v2, :cond_0

    invoke-virtual {v1, p1, p2, p3}, Lwa3/e;->m(III)I

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Lwa3/z;->z:Lwa3/e;

    if-lt p2, v2, :cond_1

    sub-int/2addr p2, v2

    invoke-virtual {v0, p1, p2, p3}, Lwa3/e;->m(III)I

    move-result p1

    return p1

    :cond_1
    sub-int/2addr v2, p2

    invoke-virtual {v1, p1, p2, v2}, Lwa3/e;->m(III)I

    move-result p1

    const/4 p2, 0x0

    sub-int/2addr p3, v2

    invoke-virtual {v0, p1, p2, p3}, Lwa3/e;->m(III)I

    move-result p1

    return p1
.end method

.method public final n(III)I
    .locals 3

    add-int v0, p2, p3

    iget-object v1, p0, Lwa3/z;->y:Lwa3/e;

    iget v2, p0, Lwa3/z;->E:I

    if-gt v0, v2, :cond_0

    invoke-virtual {v1, p1, p2, p3}, Lwa3/e;->n(III)I

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Lwa3/z;->z:Lwa3/e;

    if-lt p2, v2, :cond_1

    sub-int/2addr p2, v2

    invoke-virtual {v0, p1, p2, p3}, Lwa3/e;->n(III)I

    move-result p1

    return p1

    :cond_1
    sub-int/2addr v2, p2

    invoke-virtual {v1, p1, p2, v2}, Lwa3/e;->n(III)I

    move-result p1

    const/4 p2, 0x0

    sub-int/2addr p3, v2

    invoke-virtual {v0, p1, p2, p3}, Lwa3/e;->n(III)I

    move-result p1

    return p1
.end method

.method public final o()I
    .locals 1

    iget v0, p0, Lwa3/z;->G:I

    return v0
.end method

.method public final p()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/String;

    iget v1, p0, Lwa3/z;->x:I

    if-nez v1, :cond_0

    sget-object v1, Lwa3/r;->a:[B

    goto :goto_0

    :cond_0
    new-array v2, v1, [B

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v3, v1, v2}, Lwa3/z;->e(III[B)V

    move-object v1, v2

    :goto_0
    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    return-object v0
.end method

.method public final r(Ljava/io/OutputStream;II)V
    .locals 3

    add-int v0, p2, p3

    iget-object v1, p0, Lwa3/z;->y:Lwa3/e;

    iget v2, p0, Lwa3/z;->E:I

    if-gt v0, v2, :cond_0

    invoke-virtual {v1, p1, p2, p3}, Lwa3/e;->r(Ljava/io/OutputStream;II)V

    return-void

    :cond_0
    iget-object v0, p0, Lwa3/z;->z:Lwa3/e;

    if-lt p2, v2, :cond_1

    sub-int/2addr p2, v2

    invoke-virtual {v0, p1, p2, p3}, Lwa3/e;->r(Ljava/io/OutputStream;II)V

    return-void

    :cond_1
    sub-int/2addr v2, p2

    invoke-virtual {v1, p1, p2, v2}, Lwa3/e;->r(Ljava/io/OutputStream;II)V

    const/4 p2, 0x0

    sub-int/2addr p3, v2

    invoke-virtual {v0, p1, p2, p3}, Lwa3/e;->r(Ljava/io/OutputStream;II)V

    return-void
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lwa3/z;->x:I

    return v0
.end method
