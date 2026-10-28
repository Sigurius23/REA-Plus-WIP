.class public interface abstract Lz2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/g;
.implements La3/n;


# virtual methods
.method public a(Lz2/h;)Ljava/lang/Object;
    .locals 9

    move-object v0, p0

    check-cast v0, Lb2/v;

    iget-object v1, v0, Lb2/v;->w:Lb2/v;

    iget-boolean v1, v1, Lb2/v;->N:Z

    if-nez v1, :cond_0

    const-string v1, "ModifierLocal accessed from an unattached node"

    invoke-static {v1}, Lx2/a;->a(Ljava/lang/String;)V

    :cond_0
    iget-object v1, v0, Lb2/v;->w:Lb2/v;

    iget-boolean v1, v1, Lb2/v;->N:Z

    if-nez v1, :cond_1

    const-string v1, "visitAncestors called on an unattached node"

    invoke-static {v1}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_1
    iget-object v0, v0, Lb2/v;->w:Lb2/v;

    iget-object v0, v0, Lb2/v;->E:Lb2/v;

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_c

    iget-object v2, v1, La3/n0;->e0:La3/l1;

    iget-object v2, v2, La3/l1;->g:Ljava/lang/Object;

    check-cast v2, Lb2/v;

    iget v2, v2, Lb2/v;->z:I

    and-int/lit8 v2, v2, 0x20

    const/4 v3, 0x0

    if-eqz v2, :cond_a

    :goto_1
    if-eqz v0, :cond_a

    iget v2, v0, Lb2/v;->y:I

    and-int/lit8 v2, v2, 0x20

    if-eqz v2, :cond_9

    move-object v2, v0

    move-object v4, v3

    :goto_2
    if-eqz v2, :cond_9

    instance-of v5, v2, Lz2/e;

    if-eqz v5, :cond_2

    check-cast v2, Lz2/e;

    invoke-interface {v2}, Lz2/e;->v()Lv63/c;

    move-result-object v5

    invoke-virtual {v5, p1}, Lv63/c;->c(Lz2/h;)Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v2}, Lz2/e;->v()Lv63/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lv63/c;->e(Lz2/h;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    iget v5, v2, Lb2/v;->y:I

    and-int/lit8 v5, v5, 0x20

    if-eqz v5, :cond_8

    instance-of v5, v2, La3/o;

    if-eqz v5, :cond_8

    move-object v5, v2

    check-cast v5, La3/o;

    iget-object v5, v5, La3/o;->P:Lb2/v;

    const/4 v6, 0x0

    :goto_3
    const/4 v7, 0x1

    if-eqz v5, :cond_7

    iget v8, v5, Lb2/v;->y:I

    and-int/lit8 v8, v8, 0x20

    if-eqz v8, :cond_6

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v7, :cond_3

    move-object v2, v5

    goto :goto_4

    :cond_3
    if-nez v4, :cond_4

    new-instance v4, Lr1/c;

    const/16 v7, 0x10

    new-array v7, v7, [Lb2/v;

    invoke-direct {v4, v7}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_4
    if-eqz v2, :cond_5

    invoke-virtual {v4, v2}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v2, v3

    :cond_5
    invoke-virtual {v4, v5}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_6
    :goto_4
    iget-object v5, v5, Lb2/v;->F:Lb2/v;

    goto :goto_3

    :cond_7
    if-ne v6, v7, :cond_8

    goto :goto_2

    :cond_8
    invoke-static {v4}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v2

    goto :goto_2

    :cond_9
    iget-object v0, v0, Lb2/v;->E:Lb2/v;

    goto :goto_1

    :cond_a
    invoke-virtual {v1}, La3/n0;->G()La3/n0;

    move-result-object v1

    if-eqz v1, :cond_b

    iget-object v0, v1, La3/n0;->e0:La3/l1;

    if-eqz v0, :cond_b

    iget-object v0, v0, La3/l1;->f:Ljava/lang/Object;

    check-cast v0, La3/l2;

    goto/16 :goto_0

    :cond_b
    move-object v0, v3

    goto/16 :goto_0

    :cond_c
    iget-object p1, p1, Lz2/h;->a:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public v()Lv63/c;
    .locals 1

    sget-object v0, Lz2/b;->a:Lz2/b;

    return-object v0
.end method
