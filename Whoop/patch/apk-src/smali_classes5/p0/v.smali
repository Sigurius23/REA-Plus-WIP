.class public final Lp0/v;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/r;


# instance fields
.field public O:Landroidx/compose/foundation/lazy/layout/b;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/lazy/layout/b;)V
    .locals 0

    invoke-direct {p0}, Lb2/v;-><init>()V

    iput-object p1, p0, Lp0/v;->O:Landroidx/compose/foundation/lazy/layout/b;

    return-void
.end method


# virtual methods
.method public final O(La3/p0;)V
    .locals 17

    move-object/from16 v0, p1

    iget-object v1, v0, La3/p0;->w:Lk2/b;

    move-object/from16 v2, p0

    iget-object v3, v2, Lp0/v;->O:Landroidx/compose/foundation/lazy/layout/b;

    iget-object v3, v3, Landroidx/compose/foundation/lazy/layout/b;->i:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lp0/t;

    iget-object v7, v6, Lp0/t;->n:Ll2/c;

    if-nez v7, :cond_0

    goto :goto_1

    :cond_0
    iget-wide v8, v6, Lp0/t;->m:J

    const/16 v6, 0x20

    shr-long v10, v8, v6

    long-to-int v10, v10

    int-to-float v10, v10

    const-wide v11, 0xffffffffL

    and-long/2addr v8, v11

    long-to-int v8, v8

    int-to-float v8, v8

    iget-wide v13, v7, Ll2/c;->t:J

    move-wide v15, v11

    shr-long v11, v13, v6

    long-to-int v6, v11

    int-to-float v6, v6

    sub-float/2addr v10, v6

    and-long v11, v13, v15

    long-to-int v6, v11

    int-to-float v6, v6

    sub-float/2addr v8, v6

    iget-object v6, v1, Lk2/b;->x:La3/p;

    iget-object v6, v6, La3/p;->x:Ljava/lang/Object;

    check-cast v6, Laj/d;

    invoke-virtual {v6, v10, v8}, Laj/d;->B(FF)V

    :try_start_0
    invoke-static {v0, v7}, Lge3/g;->t(Lk2/e;Ll2/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v6, v1, Lk2/b;->x:La3/p;

    iget-object v6, v6, La3/p;->x:Ljava/lang/Object;

    check-cast v6, Laj/d;

    neg-float v7, v10

    neg-float v8, v8

    invoke-virtual {v6, v7, v8}, Laj/d;->B(FF)V

    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, v1, Lk2/b;->x:La3/p;

    iget-object v1, v1, La3/p;->x:Ljava/lang/Object;

    check-cast v1, Laj/d;

    neg-float v3, v10

    neg-float v4, v8

    invoke-virtual {v1, v3, v4}, Laj/d;->B(FF)V

    throw v0

    :cond_1
    invoke-virtual {v0}, La3/p0;->a()V

    return-void
.end method

.method public final P0()V
    .locals 1

    iget-object v0, p0, Lp0/v;->O:Landroidx/compose/foundation/lazy/layout/b;

    iput-object p0, v0, Landroidx/compose/foundation/lazy/layout/b;->j:Lp0/v;

    return-void
.end method

.method public final Q0()V
    .locals 2

    iget-object v0, p0, Lp0/v;->O:Landroidx/compose/foundation/lazy/layout/b;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/b;->e()V

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/compose/foundation/lazy/layout/b;->b:Lab/h0;

    const/4 v1, -0x1

    iput v1, v0, Landroidx/compose/foundation/lazy/layout/b;->c:I

    return-void
.end method

.method public final X0(Landroidx/compose/foundation/lazy/layout/b;)V
    .locals 2

    iget-object v0, p0, Lp0/v;->O:Landroidx/compose/foundation/lazy/layout/b;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lb2/v;->w:Lb2/v;

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp0/v;->O:Landroidx/compose/foundation/lazy/layout/b;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/b;->e()V

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/compose/foundation/lazy/layout/b;->b:Lab/h0;

    const/4 v1, -0x1

    iput v1, v0, Landroidx/compose/foundation/lazy/layout/b;->c:I

    iput-object p0, p1, Landroidx/compose/foundation/lazy/layout/b;->j:Lp0/v;

    iput-object p1, p0, Lp0/v;->O:Landroidx/compose/foundation/lazy/layout/b;

    :cond_0
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lp0/v;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lp0/v;

    iget-object v1, p0, Lp0/v;->O:Landroidx/compose/foundation/lazy/layout/b;

    iget-object p1, p1, Lp0/v;->O:Landroidx/compose/foundation/lazy/layout/b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lp0/v;->O:Landroidx/compose/foundation/lazy/layout/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DisplayingDisappearingItemsNode(animator="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lp0/v;->O:Landroidx/compose/foundation/lazy/layout/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
