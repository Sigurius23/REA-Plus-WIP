.class public final Ly2/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/s1;


# instance fields
.field public final a:La0/h0;

.field public final synthetic b:Ly2/n0;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ly2/n0;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly2/m0;->b:Ly2/n0;

    iput-object p2, p0, Ly2/m0;->c:Ljava/lang/Object;

    sget-object p1, La0/u;->a:[I

    new-instance p1, La0/h0;

    invoke-direct {p1}, La0/h0;-><init>()V

    iput-object p1, p0, Ly2/m0;->a:La0/h0;

    return-void
.end method


# virtual methods
.method public final a(I)J
    .locals 6

    iget-object v0, p0, Ly2/m0;->b:Ly2/n0;

    iget-object v0, v0, Ly2/n0;->J:La0/v0;

    iget-object v1, p0, Ly2/m0;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La3/n0;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, La3/n0;->X()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, La3/n0;->q()Ljava/util/List;

    move-result-object v1

    check-cast v1, Lr1/b;

    iget-object v1, v1, Lr1/b;->w:Lr1/c;

    iget v1, v1, Lr1/c;->y:I

    if-ltz p1, :cond_0

    if-lt p1, v1, :cond_1

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Index ("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ") is out of bound of [0, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lx2/a;->d(Ljava/lang/String;)V

    :cond_1
    iget-object v1, p0, Ly2/m0;->a:La0/h0;

    invoke-virtual {v1, p1}, La0/h0;->b(I)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, La3/n0;->q()Ljava/util/List;

    move-result-object v1

    check-cast v1, Lr1/b;

    invoke-virtual {v1, p1}, Lr1/b;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La3/n0;

    invoke-virtual {v1}, La3/n0;->J()I

    move-result v1

    invoke-virtual {v0}, La3/n0;->q()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lr1/b;

    invoke-virtual {v0, p1}, Lr1/b;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La3/n0;

    invoke-virtual {p1}, La3/n0;->s()I

    move-result p1

    int-to-long v0, v1

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    int-to-long v2, p1

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    return-wide v0

    :cond_2
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final b()I
    .locals 2

    iget-object v0, p0, Ly2/m0;->b:Ly2/n0;

    iget-object v0, v0, Ly2/n0;->J:La0/v0;

    iget-object v1, p0, Ly2/m0;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La3/n0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La3/n0;->q()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lr1/b;

    iget-object v0, v0, Lr1/b;->w:Lr1/c;

    iget v0, v0, Lr1/c;->y:I

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c(Lbd3/k0;)V
    .locals 12

    iget-object v0, p0, Ly2/m0;->b:Ly2/n0;

    iget-object v0, v0, Ly2/n0;->J:La0/v0;

    iget-object v1, p0, Ly2/m0;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La3/n0;

    if-eqz v0, :cond_e

    iget-object v0, v0, La3/n0;->e0:La3/l1;

    if-eqz v0, :cond_e

    iget-object v0, v0, La3/l1;->g:Ljava/lang/Object;

    check-cast v0, Lb2/v;

    if-eqz v0, :cond_e

    iget-object v1, v0, Lb2/v;->w:Lb2/v;

    iget-boolean v1, v1, Lb2/v;->N:Z

    if-nez v1, :cond_0

    const-string v1, "visitSubtreeIf called on an unattached node"

    invoke-static {v1}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    new-instance v1, Lr1/c;

    const/16 v2, 0x10

    new-array v3, v2, [Lb2/v;

    invoke-direct {v1, v3}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iget-object v0, v0, Lb2/v;->w:Lb2/v;

    iget-object v3, v0, Lb2/v;->F:Lb2/v;

    if-nez v3, :cond_1

    invoke-static {v1, v0}, La3/g;->a(Lr1/c;Lb2/v;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v3}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    iget v0, v1, Lr1/c;->y:I

    if-eqz v0, :cond_e

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Lr1/c;->l(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb2/v;

    iget v3, v0, Lb2/v;->z:I

    const/high16 v4, 0x40000

    and-int/2addr v3, v4

    if-eqz v3, :cond_d

    move-object v3, v0

    :goto_1
    if-eqz v3, :cond_d

    iget v5, v3, Lb2/v;->y:I

    and-int/2addr v5, v4

    if-eqz v5, :cond_c

    const/4 v5, 0x0

    move-object v6, v3

    move-object v7, v5

    :goto_2
    if-eqz v6, :cond_c

    instance-of v8, v6, La3/p2;

    if-eqz v8, :cond_5

    check-cast v6, La3/p2;

    invoke-interface {v6}, La3/p2;->f()Ljava/lang/Object;

    move-result-object v8

    const-string v9, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode"

    invoke-virtual {v9, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {p1, v6}, Lbd3/k0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, La3/o2;->x:La3/o2;

    goto :goto_3

    :cond_3
    sget-object v6, La3/o2;->w:La3/o2;

    :goto_3
    sget-object v8, La3/o2;->y:La3/o2;

    if-ne v6, v8, :cond_4

    goto :goto_7

    :cond_4
    sget-object v8, La3/o2;->x:La3/o2;

    if-eq v6, v8, :cond_2

    goto :goto_6

    :cond_5
    iget v8, v6, Lb2/v;->y:I

    and-int/2addr v8, v4

    if-eqz v8, :cond_b

    instance-of v8, v6, La3/o;

    if-eqz v8, :cond_b

    move-object v8, v6

    check-cast v8, La3/o;

    iget-object v8, v8, La3/o;->P:Lb2/v;

    const/4 v9, 0x0

    :goto_4
    const/4 v10, 0x1

    if-eqz v8, :cond_a

    iget v11, v8, Lb2/v;->y:I

    and-int/2addr v11, v4

    if-eqz v11, :cond_9

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v10, :cond_6

    move-object v6, v8

    goto :goto_5

    :cond_6
    if-nez v7, :cond_7

    new-instance v7, Lr1/c;

    new-array v10, v2, [Lb2/v;

    invoke-direct {v7, v10}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_7
    if-eqz v6, :cond_8

    invoke-virtual {v7, v6}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v6, v5

    :cond_8
    invoke-virtual {v7, v8}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_9
    :goto_5
    iget-object v8, v8, Lb2/v;->F:Lb2/v;

    goto :goto_4

    :cond_a
    if-ne v9, v10, :cond_b

    goto :goto_2

    :cond_b
    :goto_6
    invoke-static {v7}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v6

    goto :goto_2

    :cond_c
    iget-object v3, v3, Lb2/v;->F:Lb2/v;

    goto :goto_1

    :cond_d
    invoke-static {v1, v0}, La3/g;->a(Lr1/c;Lb2/v;)V

    goto/16 :goto_0

    :cond_e
    :goto_7
    return-void
.end method

.method public final d(IJ)V
    .locals 5

    iget-object v0, p0, Ly2/m0;->b:Ly2/n0;

    iget-object v1, v0, Ly2/n0;->J:La0/v0;

    iget-object v2, p0, Ly2/m0;->c:Ljava/lang/Object;

    invoke-virtual {v1, v2}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La3/n0;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, La3/n0;->X()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1}, La3/n0;->q()Ljava/util/List;

    move-result-object v2

    check-cast v2, Lr1/b;

    iget-object v2, v2, Lr1/b;->w:Lr1/c;

    iget v2, v2, Lr1/c;->y:I

    if-ltz p1, :cond_0

    if-lt p1, v2, :cond_1

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Index ("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ") is out of bound of [0, "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x29

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lx2/a;->d(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v1}, La3/n0;->Y()Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "Pre-measure called on node that is not placed"

    invoke-static {v2}, Lx2/a;->a(Ljava/lang/String;)V

    :cond_2
    iget-object v0, v0, Ly2/n0;->w:La3/n0;

    const/4 v2, 0x1

    iput-boolean v2, v0, La3/n0;->P:Z

    invoke-static {v1}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v2

    invoke-virtual {v1}, La3/n0;->q()Ljava/util/List;

    move-result-object v1

    check-cast v1, Lr1/b;

    invoke-virtual {v1, p1}, Lr1/b;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La3/n0;

    check-cast v2, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v2, v1, p2, p3}, Landroidx/compose/ui/platform/AndroidComposeView;->y(La3/n0;J)V

    const/4 p2, 0x0

    iput-boolean p2, v0, La3/n0;->P:Z

    iget-object p2, p0, Ly2/m0;->a:La0/h0;

    invoke-virtual {p2, p1}, La0/h0;->a(I)Z

    :cond_3
    return-void
.end method

.method public final dispose()V
    .locals 6

    iget-object v0, p0, Ly2/m0;->b:Ly2/n0;

    iget-object v1, v0, Ly2/n0;->w:La3/n0;

    invoke-virtual {v0}, Ly2/n0;->d()V

    iget-object v2, v0, Ly2/n0;->J:La0/v0;

    iget-object v3, p0, Ly2/m0;->c:Ljava/lang/Object;

    invoke-virtual {v2, v3}, La0/v0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La3/n0;

    if-eqz v2, :cond_3

    iget v3, v0, Ly2/n0;->O:I

    if-lez v3, :cond_0

    goto :goto_0

    :cond_0
    const-string v3, "No pre-composed items to dispose"

    invoke-static {v3}, Lx2/a;->b(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v1}, La3/n0;->r()Ljava/util/List;

    move-result-object v3

    check-cast v3, Lr1/b;

    iget-object v3, v3, Lr1/b;->w:Lr1/c;

    invoke-virtual {v3, v2}, Lr1/c;->j(Ljava/lang/Object;)I

    move-result v3

    invoke-virtual {v1}, La3/n0;->r()Ljava/util/List;

    move-result-object v4

    check-cast v4, Lr1/b;

    iget-object v4, v4, Lr1/b;->w:Lr1/c;

    iget v4, v4, Lr1/c;->y:I

    iget v5, v0, Ly2/n0;->O:I

    sub-int/2addr v4, v5

    if-lt v3, v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v4, "Item is not in pre-composed item range"

    invoke-static {v4}, Lx2/a;->b(Ljava/lang/String;)V

    :goto_1
    iget v4, v0, Ly2/n0;->N:I

    const/4 v5, 0x1

    add-int/2addr v4, v5

    iput v4, v0, Ly2/n0;->N:I

    iget v4, v0, Ly2/n0;->O:I

    add-int/lit8 v4, v4, -0x1

    iput v4, v0, Ly2/n0;->O:I

    iget-object v4, v0, Ly2/n0;->F:La0/v0;

    invoke-virtual {v4, v2}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly2/f0;

    if-eqz v2, :cond_2

    invoke-static {v2}, Ly2/n0;->b(Ly2/f0;)V

    :cond_2
    invoke-virtual {v1}, La3/n0;->r()Ljava/util/List;

    move-result-object v2

    check-cast v2, Lr1/b;

    iget-object v2, v2, Lr1/b;->w:Lr1/c;

    iget v2, v2, Lr1/c;->y:I

    iget v4, v0, Ly2/n0;->O:I

    sub-int/2addr v2, v4

    iget v4, v0, Ly2/n0;->N:I

    sub-int/2addr v2, v4

    iput-boolean v5, v1, La3/n0;->P:Z

    invoke-virtual {v1, v3, v2, v5}, La3/n0;->i0(III)V

    const/4 v3, 0x0

    iput-boolean v3, v1, La3/n0;->P:Z

    invoke-virtual {v0, v2}, Ly2/n0;->c(I)V

    :cond_3
    return-void
.end method
