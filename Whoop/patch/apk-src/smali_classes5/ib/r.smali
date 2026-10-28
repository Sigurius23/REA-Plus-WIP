.class public final Lib/r;
.super Ljava/util/AbstractList;
.source "SourceFile"


# static fields
.field public static final I:Ljava/util/ArrayList;


# instance fields
.field public E:I

.field public F:I

.field public G:I

.field public H:I

.field public w:I

.field public final x:Ljava/util/ArrayList;

.field public y:I

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lib/r;->I:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lib/r;->w:I

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lib/r;->x:Ljava/util/ArrayList;

    .line 4
    iput v0, p0, Lib/r;->y:I

    .line 5
    iput v0, p0, Lib/r;->z:I

    .line 6
    iput v0, p0, Lib/r;->E:I

    const/4 v1, 0x1

    .line 7
    iput v1, p0, Lib/r;->F:I

    .line 8
    iput v0, p0, Lib/r;->G:I

    .line 9
    iput v0, p0, Lib/r;->H:I

    return-void
.end method

.method public constructor <init>(Lib/r;)V
    .locals 2

    .line 10
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 11
    iget v0, p1, Lib/r;->w:I

    iput v0, p0, Lib/r;->w:I

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Lib/r;->x:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lib/r;->x:Ljava/util/ArrayList;

    .line 13
    iget v0, p1, Lib/r;->y:I

    iput v0, p0, Lib/r;->y:I

    .line 14
    iget v0, p1, Lib/r;->z:I

    iput v0, p0, Lib/r;->z:I

    .line 15
    iget v0, p1, Lib/r;->E:I

    iput v0, p0, Lib/r;->E:I

    .line 16
    iget v0, p1, Lib/r;->F:I

    iput v0, p0, Lib/r;->F:I

    .line 17
    iget v0, p1, Lib/r;->G:I

    iput v0, p0, Lib/r;->G:I

    .line 18
    iget p1, p1, Lib/r;->H:I

    iput p1, p0, Lib/r;->H:I

    return-void
.end method


# virtual methods
.method public final a(II)V
    .locals 6

    iget v0, p0, Lib/r;->w:I

    iget v1, p0, Lib/r;->F:I

    div-int/2addr v0, v1

    const/4 v1, 0x0

    iget-object v2, p0, Lib/r;->x:Ljava/util/ArrayList;

    if-ge p1, v0, :cond_1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    sub-int v5, v0, p1

    if-ge v4, v5, :cond_0

    invoke-virtual {v2, v3, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    iget v0, p0, Lib/r;->F:I

    mul-int/2addr v5, v0

    iget v0, p0, Lib/r;->E:I

    add-int/2addr v0, v5

    iput v0, p0, Lib/r;->E:I

    iget v0, p0, Lib/r;->w:I

    sub-int/2addr v0, v5

    iput v0, p0, Lib/r;->w:I

    goto :goto_1

    :cond_1
    move p1, v0

    :goto_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/2addr v0, p1

    if-lt p2, v0, :cond_3

    iget v0, p0, Lib/r;->y:I

    add-int/lit8 v3, p2, 0x1

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/2addr v4, p1

    sub-int/2addr v3, v4

    iget v4, p0, Lib/r;->F:I

    mul-int/2addr v3, v4

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    :goto_2
    sub-int v4, p2, p1

    if-gt v3, v4, :cond_2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-virtual {v2, v4, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    iget p1, p0, Lib/r;->E:I

    add-int/2addr p1, v0

    iput p1, p0, Lib/r;->E:I

    iget p1, p0, Lib/r;->y:I

    sub-int/2addr p1, v0

    iput p1, p0, Lib/r;->y:I

    :cond_3
    return-void
.end method

.method public final c()I
    .locals 6

    iget v0, p0, Lib/r;->w:I

    iget-object v1, p0, Lib/r;->x:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    if-eqz v4, :cond_0

    sget-object v5, Lib/r;->I:Ljava/util/ArrayList;

    if-eq v4, v5, :cond_0

    goto :goto_1

    :cond_0
    iget v4, p0, Lib/r;->F:I

    add-int/2addr v0, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return v0
.end method

.method public final d()I
    .locals 5

    iget v0, p0, Lib/r;->y:I

    iget-object v1, p0, Lib/r;->x:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-ltz v2, :cond_1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_0

    sget-object v4, Lib/r;->I:Ljava/util/ArrayList;

    if-eq v3, v4, :cond_0

    goto :goto_1

    :cond_0
    iget v3, p0, Lib/r;->F:I

    add-int/2addr v0, v3

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    return v0
.end method

.method public final e(II)Z
    .locals 2

    iget v0, p0, Lib/r;->w:I

    div-int/2addr v0, p1

    if-lt p2, v0, :cond_1

    iget-object p1, p0, Lib/r;->x:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/2addr v1, v0

    if-lt p2, v1, :cond_0

    goto :goto_0

    :cond_0
    sub-int/2addr p2, v0

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_1

    sget-object p2, Lib/r;->I:Ljava/util/ArrayList;

    if-eq p1, p2, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final f(IIILjava/util/List;)V
    .locals 0

    iput p1, p0, Lib/r;->w:I

    iget-object p1, p0, Lib/r;->x:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput p2, p0, Lib/r;->y:I

    iput p3, p0, Lib/r;->z:I

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p1

    iput p1, p0, Lib/r;->E:I

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p1

    iput p1, p0, Lib/r;->F:I

    const/4 p1, 0x0

    iput p1, p0, Lib/r;->G:I

    iput p1, p0, Lib/r;->H:I

    return-void
.end method

.method public final g(ILjava/util/List;Lib/q;)V
    .locals 6

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lib/r;->F:I

    iget-object v2, p0, Lib/r;->x:Ljava/util/ArrayList;

    if-eq v0, v1, :cond_4

    invoke-virtual {p0}, Lib/r;->size()I

    move-result v1

    iget v3, p0, Lib/r;->F:I

    rem-int v4, v1, v3

    sub-int/2addr v1, v4

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne p1, v1, :cond_0

    if-ge v0, v3, :cond_0

    move v1, v5

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    iget v3, p0, Lib/r;->y:I

    if-nez v3, :cond_1

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ne v3, v5, :cond_1

    iget v3, p0, Lib/r;->F:I

    if-le v0, v3, :cond_1

    move v4, v5

    :cond_1
    if-nez v4, :cond_3

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "page introduces incorrect tiling"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    if-eqz v4, :cond_4

    iput v0, p0, Lib/r;->F:I

    :cond_4
    iget v1, p0, Lib/r;->F:I

    div-int v1, p1, v1

    invoke-virtual {p0, v1, v1}, Lib/r;->a(II)V

    iget v3, p0, Lib/r;->w:I

    iget v4, p0, Lib/r;->F:I

    div-int/2addr v3, v4

    sub-int/2addr v1, v3

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_6

    sget-object v4, Lib/r;->I:Ljava/util/ArrayList;

    if-ne v3, v4, :cond_5

    goto :goto_2

    :cond_5
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string p3, "Invalid position "

    const-string v0, ": data already loaded"

    invoke-static {p1, p3, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    :goto_2
    invoke-virtual {v2, v1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    if-eqz p3, :cond_7

    invoke-interface {p3, p1, v0}, Lib/q;->a(II)V

    :cond_7
    return-void
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 5

    if-ltz p1, :cond_6

    invoke-virtual {p0}, Lib/r;->size()I

    move-result v0

    if-ge p1, v0, :cond_6

    iget v0, p0, Lib/r;->w:I

    sub-int/2addr p1, v0

    const/4 v0, 0x0

    if-ltz p1, :cond_5

    iget v1, p0, Lib/r;->E:I

    if-lt p1, v1, :cond_0

    goto :goto_2

    :cond_0
    iget v1, p0, Lib/r;->F:I

    iget-object v2, p0, Lib/r;->x:Ljava/util/ArrayList;

    if-lez v1, :cond_1

    div-int v3, p1, v1

    rem-int/2addr p1, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-le v4, p1, :cond_2

    goto :goto_1

    :cond_2
    sub-int/2addr p1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_5

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    :goto_2
    return-object v0

    :cond_6
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Index: "

    const-string v2, ", Size: "

    invoke-static {p1, v1, v2}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p0}, Lib/r;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final size()I
    .locals 2

    iget v0, p0, Lib/r;->w:I

    iget v1, p0, Lib/r;->E:I

    add-int/2addr v0, v1

    iget v1, p0, Lib/r;->y:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "leading "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lib/r;->w:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", storage "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lib/r;->E:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", trailing "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lib/r;->y:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lib/r;->x:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_0

    const-string v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
