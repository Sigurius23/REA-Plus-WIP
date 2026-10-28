.class public abstract Lv63/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lz53/g;Le63/e;Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Ly53/a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ly53/a;

    iget v1, v0, Ly53/a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly53/a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Ly53/a;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ly53/a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ly53/a;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p1, v0, Ly53/a;->x:Le63/e;

    iget-object p0, v0, Ly53/a;->w:Lz53/g;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p1, Le63/e;->e:Lbc3/k1;

    iput-object p0, v0, Ly53/a;->w:Lz53/g;

    iput-object p1, v0, Ly53/a;->x:Le63/e;

    iput v4, v0, Ly53/a;->z:I

    sget-object v2, Ly53/f;->a:Lbc3/b0;

    new-instance v2, Lbc3/l1;

    invoke-direct {v2, p2}, Lbc3/l1;-><init>(Lbc3/k1;)V

    iget-object p2, p0, Lz53/g;->G:Lq83/j;

    invoke-interface {p2, v2}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p2

    sget-object v5, Ly53/f;->a:Lbc3/b0;

    invoke-interface {p2, v5}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p2

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v5

    sget-object v6, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v5, v6}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v5

    check-cast v5, Lbc3/k1;

    if-nez v5, :cond_4

    goto :goto_1

    :cond_4
    new-instance v6, La3/m1;

    const/16 v7, 0x1d

    invoke-direct {v6, v2, v7}, La3/m1;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v5, v4, v4, v6}, Lbc3/k1;->invokeOnCompletion(ZZLkotlin/jvm/functions/Function1;)Lbc3/s0;

    move-result-object v5

    new-instance v6, La63/a0;

    invoke-direct {v6, v5, v4}, La63/a0;-><init>(Lbc3/s0;I)V

    invoke-virtual {v2, v6}, Lbc3/t1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    :goto_1
    if-ne p2, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    check-cast p2, Lq83/j;

    new-instance v2, Ly53/g;

    invoke-direct {v2, p2}, Ly53/g;-><init>(Lq83/j;)V

    invoke-interface {p2, v2}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p2

    new-instance v2, La6/c;

    const/16 v4, 0x1b

    const/4 v5, 0x0

    invoke-direct {v2, p0, p1, v5, v4}, La6/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p0, p2, v2, v3}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object p0

    iput-object v5, v0, Ly53/a;->w:Lz53/g;

    iput-object v5, v0, Ly53/a;->x:Le63/e;

    iput v3, v0, Ly53/a;->z:I

    invoke-virtual {p0, v0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_6

    :goto_3
    return-object v1

    :cond_6
    return-object p0
.end method

.method public static final b(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    const-string v1, "datastore/"

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final c(Lwc/c;)Lve/c;
    .locals 1

    new-instance v0, Lxc/a;

    invoke-direct {v0, p0}, Lxc/a;-><init>(Lwc/c;)V

    return-object v0
.end method

.method public static d(Lv63/e;)[B
    .locals 8

    invoke-virtual {p0}, Lv63/g;->s()J

    move-result-wide v0

    const-wide/32 v2, 0x7fffffff

    cmp-long v2, v0, v2

    if-gtz v2, :cond_6

    long-to-int v0, v0

    const-string v1, "<this>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v0, :cond_5

    new-array v1, v0, [B

    const/4 v2, 0x1

    invoke-static {p0, v2}, Lw63/b;->b(Lv63/g;I)Lw63/a;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    move v5, v4

    :cond_1
    :try_start_0
    iget v6, v3, Lio/seon/androidsdk/service/e1;->c:I

    iget v7, v3, Lio/seon/androidsdk/service/e1;->b:I

    sub-int/2addr v6, v7

    invoke-static {v0, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    invoke-static {v3, v1, v5, v6}, Lv63/c;->l(Lw63/a;[BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    sub-int/2addr v0, v6

    add-int/2addr v5, v6

    if-lez v0, :cond_2

    :try_start_1
    invoke-static {p0, v3}, Lw63/b;->c(Lv63/g;Lw63/a;)Lw63/a;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v3, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v0

    move v2, v4

    goto :goto_1

    :cond_2
    invoke-static {p0, v3}, Lw63/b;->a(Lv63/g;Lw63/a;)V

    :goto_0
    if-gtz v0, :cond_3

    return-object v1

    :cond_3
    new-instance p0, Ljava/io/EOFException;

    const-string v1, "Premature end of stream: expected "

    const-string v2, " bytes"

    invoke-static {v0, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_1
    move-exception v0

    :goto_1
    if-eqz v2, :cond_4

    invoke-static {p0, v3}, Lw63/b;->a(Lv63/g;Lw63/a;)V

    :cond_4
    throw v0

    :cond_5
    sget-object p0, Lw63/b;->a:[B

    return-object p0

    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unable to convert to a ByteArray: packet is too big"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e(Lv63/e;Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "charset"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object p1

    const-string v0, "charset.newDecoder()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0}, Lhg3/i;->D(Ljava/nio/charset/CharsetDecoder;Lv63/g;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lw53/b;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lw53/d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lw53/d;

    iget v1, v0, Lw53/d;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw53/d;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lw53/d;

    invoke-direct {v0, p1}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lw53/d;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lw53/d;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lw53/d;->w:Lw53/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lw53/b;->d()Lf63/c;

    move-result-object p1

    invoke-virtual {p1}, Lf63/c;->b()Lio/ktor/utils/io/q;

    move-result-object p1

    iput-object p0, v0, Lw53/d;->w:Lw53/b;

    iput v3, v0, Lw53/d;->y:I

    check-cast p1, Lio/ktor/utils/io/m;

    invoke-virtual {p1, v0}, Lio/ktor/utils/io/m;->v(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lv63/e;

    invoke-static {p1}, Lv63/h;->d(Lv63/e;)[B

    move-result-object p1

    new-instance v0, Lw53/e;

    iget-object v1, p0, Lw53/b;->w:Lv53/c;

    invoke-virtual {p0}, Lw53/b;->c()Le63/b;

    move-result-object v2

    invoke-virtual {p0}, Lw53/b;->d()Lf63/c;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0, p1}, Lw53/e;-><init>(Lv53/c;Le63/b;Lf63/c;[B)V

    return-object v0
.end method

.method public static final g(Lud3/x0;)Lud3/x0;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lud3/x0;->h()Lud3/w0;

    move-result-object v0

    new-instance v1, Lwd3/d;

    iget-object p0, p0, Lud3/x0;->G:Lud3/a1;

    invoke-virtual {p0}, Lud3/a1;->k()Lud3/h0;

    move-result-object v2

    invoke-virtual {p0}, Lud3/a1;->i()J

    move-result-wide v3

    invoke-direct {v1, v2, v3, v4}, Lwd3/d;-><init>(Lud3/h0;J)V

    iput-object v1, v0, Lud3/w0;->g:Lud3/a1;

    invoke-virtual {v0}, Lud3/w0;->a()Lud3/x0;

    move-result-object p0

    return-object p0
.end method
