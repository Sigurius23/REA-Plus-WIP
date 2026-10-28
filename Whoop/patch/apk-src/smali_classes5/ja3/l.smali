.class public final Lja3/l;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;
.implements Lud3/k;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;

.field public final y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lja3/l;->w:I

    iput-object p2, p0, Lja3/l;->y:Ljava/lang/Object;

    iput-object p3, p0, Lja3/l;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lja3/l;->w:I

    const/16 v1, 0x24

    const/16 v2, 0x2e

    const/4 v3, 0x0

    const/4 v4, 0x1

    packed-switch v0, :pswitch_data_0

    move-object v8, p1

    check-cast v8, Lz1/j;

    sget-object p1, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    sget-wide v6, Lz1/l;->e:J

    int-to-long v0, v4

    add-long/2addr v0, v6

    sput-wide v0, Lz1/l;->e:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    iget-object p1, p0, Lja3/l;->y:Ljava/lang/Object;

    move-object v9, p1

    check-cast v9, Lkotlin/jvm/functions/Function1;

    iget-object p1, p0, Lja3/l;->x:Ljava/lang/Object;

    move-object v10, p1

    check-cast v10, Lkotlin/jvm/functions/Function1;

    new-instance v5, Lz1/b;

    invoke-direct/range {v5 .. v10}, Lz1/b;-><init>(JLz1/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-object v5

    :catchall_0
    move-exception v0

    monitor-exit p1

    throw v0

    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    :try_start_1
    iget-object p1, p0, Lja3/l;->y:Ljava/lang/Object;

    check-cast p1, Lzd3/o;

    invoke-virtual {p1}, Lzd3/o;->cancel()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    instance-of v0, p1, Landroidx/work/impl/WorkerStoppedException;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lja3/l;->y:Ljava/lang/Object;

    check-cast v0, Lic/v;

    check-cast p1, Landroidx/work/impl/WorkerStoppedException;

    iget p1, p1, Landroidx/work/impl/WorkerStoppedException;->w:I

    invoke-virtual {v0, p1}, Lic/v;->stop(I)V

    :cond_0
    iget-object p1, p0, Lja3/l;->x:Ljava/lang/Object;

    check-cast p1, Lds/v;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lja3/l;->y:Ljava/lang/Object;

    check-cast v0, Lja3/v;

    iget-object v4, v0, Lja3/a0;->b:Lzt/q;

    iget-object v5, p0, Lja3/l;->x:Ljava/lang/Object;

    check-cast v5, Lzt/q;

    iget-object v6, v5, Lzt/q;->x:Ljava/lang/Object;

    check-cast v6, Lia3/a;

    check-cast p1, Lja3/r;

    const-string v7, "request"

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Lva3/c;

    iget-object v0, v0, Lja3/v;->o:Lja3/q;

    iget-object v8, v0, Lu93/g0;->F:Lva3/e;

    iget-object v9, p1, Lja3/r;->a:Lva3/h;

    invoke-direct {v7, v8, v9}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    iget-object p1, p1, Lja3/r;->b:Lx93/n;

    if-eqz p1, :cond_3

    iget-object v8, v6, Lia3/a;->c:Laj/d;

    iget-object v9, v4, Lzt/q;->x:Ljava/lang/Object;

    check-cast v9, Lia3/a;

    iget-object v9, v9, Lia3/a;->d:Loa3/f;

    invoke-virtual {v9}, Loa3/f;->c()Lhb3/i;

    move-result-object v9

    iget-object v9, v9, Lhb3/i;->c:Lhb3/j;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, Lsa3/e;->g:Lsa3/e;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v10, "metadataVersion"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lx93/n;->c()Lva3/e;

    move-result-object v9

    if-eqz v9, :cond_2

    iget-object v9, v9, Lva3/e;->a:Lva3/f;

    iget-object v9, v9, Lva3/f;->a:Ljava/lang/String;

    if-nez v9, :cond_1

    goto :goto_0

    :cond_1
    iget-object v8, v8, Laj/d;->w:Ljava/lang/Object;

    check-cast v8, Ljava/lang/ClassLoader;

    invoke-static {v8, v9}, Lva3/d;->k(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    if-eqz v8, :cond_2

    invoke-static {v8}, Lva3/g;->l(Ljava/lang/Class;)Lw93/b;

    move-result-object v8

    if-eqz v8, :cond_2

    new-instance v9, Lbu/c;

    invoke-direct {v9, v8}, Lbu/c;-><init>(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    :goto_0
    move-object v9, v3

    goto :goto_1

    :cond_3
    iget-object v8, v6, Lia3/a;->c:Laj/d;

    iget-object v9, v4, Lzt/q;->x:Ljava/lang/Object;

    check-cast v9, Lia3/a;

    iget-object v9, v9, Lia3/a;->d:Loa3/f;

    invoke-virtual {v9}, Loa3/f;->c()Lhb3/i;

    move-result-object v9

    iget-object v9, v9, Lhb3/i;->c:Lhb3/j;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, Lsa3/e;->g:Lsa3/e;

    invoke-virtual {v8, v7, v9}, Laj/d;->h(Lva3/c;Lsa3/e;)Lbu/c;

    move-result-object v9

    :goto_1
    if-eqz v9, :cond_4

    iget-object v8, v9, Lbu/c;->w:Ljava/lang/Object;

    check-cast v8, Lw93/b;

    goto :goto_2

    :cond_4
    move-object v8, v3

    :goto_2
    if-eqz v8, :cond_5

    iget-object v9, v8, Lw93/b;->a:Ljava/lang/Class;

    invoke-static {v9}, Lx93/c;->a(Ljava/lang/Class;)Lva3/c;

    move-result-object v9

    goto :goto_3

    :cond_5
    move-object v9, v3

    :goto_3
    if-eqz v9, :cond_6

    invoke-virtual {v9}, Lva3/c;->g()Z

    move-result v10

    if-nez v10, :cond_12

    iget-boolean v9, v9, Lva3/c;->c:Z

    if-eqz v9, :cond_6

    goto/16 :goto_9

    :cond_6
    sget-object v9, Lja3/t;->a:Lja3/t;

    if-nez v8, :cond_7

    goto :goto_5

    :cond_7
    iget-object v10, v8, Lw93/b;->b:Lpa3/b;

    iget-object v10, v10, Lpa3/b;->d:Ljava/lang/Object;

    check-cast v10, Lpa3/a;

    sget-object v11, Lpa3/a;->E:Lpa3/a;

    if-ne v10, v11, :cond_9

    iget-object v4, v4, Lzt/q;->x:Ljava/lang/Object;

    check-cast v4, Lia3/a;

    iget-object v4, v4, Lia3/a;->d:Loa3/f;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v8}, Loa3/f;->g(Lw93/b;)Lhb3/d;

    move-result-object v10

    if-nez v10, :cond_8

    move-object v4, v3

    goto :goto_4

    :cond_8
    invoke-virtual {v4}, Loa3/f;->c()Lhb3/i;

    move-result-object v4

    iget-object v4, v4, Lhb3/i;->t:Lhb3/g;

    iget-object v8, v8, Lw93/b;->a:Ljava/lang/Class;

    invoke-static {v8}, Lx93/c;->a(Ljava/lang/Class;)Lva3/c;

    move-result-object v8

    invoke-virtual {v4, v8, v10}, Lhb3/g;->a(Lva3/c;Lhb3/d;)Lr93/e;

    move-result-object v4

    :goto_4
    if-eqz v4, :cond_a

    new-instance v9, Lja3/s;

    invoke-direct {v9, v4}, Lja3/s;-><init>(Lr93/e;)V

    goto :goto_5

    :cond_9
    sget-object v9, Lja3/u;->a:Lja3/u;

    :cond_a
    :goto_5
    instance-of v4, v9, Lja3/s;

    if-eqz v4, :cond_b

    check-cast v9, Lja3/s;

    iget-object v3, v9, Lja3/s;->a:Lr93/e;

    goto/16 :goto_9

    :cond_b
    instance-of v4, v9, Lja3/u;

    if-eqz v4, :cond_c

    goto/16 :goto_9

    :cond_c
    instance-of v4, v9, Lja3/t;

    if-eqz v4, :cond_13

    if-nez p1, :cond_f

    iget-object p1, v6, Lia3/a;->b:Laj/c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v7, Lva3/c;->a:Lva3/e;

    iget-object v7, v7, Lva3/c;->b:Lva3/e;

    iget-object v7, v7, Lva3/e;->a:Lva3/f;

    iget-object v7, v7, Lva3/f;->a:Ljava/lang/String;

    invoke-static {v7, v2, v1}, Lyb3/y;->L(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object v1

    iget-object v7, v4, Lva3/e;->a:Lva3/f;

    invoke-virtual {v7}, Lva3/f;->c()Z

    move-result v7

    if-eqz v7, :cond_d

    goto :goto_6

    :cond_d
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v4, Lva3/e;->a:Lva3/f;

    iget-object v4, v4, Lva3/f;->a:Ljava/lang/String;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_6
    iget-object p1, p1, Laj/c;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/ClassLoader;

    invoke-static {p1, v1}, Lva3/d;->k(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    if-eqz p1, :cond_e

    new-instance v1, Lx93/n;

    invoke-direct {v1, p1}, Lx93/n;-><init>(Ljava/lang/Class;)V

    move-object p1, v1

    goto :goto_7

    :cond_e
    move-object p1, v3

    :cond_f
    :goto_7
    sget-object v1, Lma3/g;->w:[Lma3/g;

    if-eqz p1, :cond_10

    invoke-virtual {p1}, Lx93/n;->c()Lva3/e;

    move-result-object v1

    goto :goto_8

    :cond_10
    move-object v1, v3

    :goto_8
    if-eqz v1, :cond_12

    iget-object v2, v1, Lva3/e;->a:Lva3/f;

    invoke-virtual {v2}, Lva3/f;->c()Z

    move-result v2

    if-nez v2, :cond_12

    invoke-virtual {v1}, Lva3/e;->b()Lva3/e;

    move-result-object v1

    iget-object v2, v0, Lu93/g0;->F:Lva3/e;

    invoke-virtual {v1, v2}, Lva3/e;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    goto :goto_9

    :cond_11
    new-instance v1, Lja3/i;

    invoke-direct {v1, v5, v0, p1, v3}, Lja3/i;-><init>(Lzt/q;Lr93/k;Lx93/n;Lr93/e;)V

    iget-object p1, v6, Lia3/a;->s:Lfa3/l;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v3, v1

    :cond_12
    :goto_9
    return-object v3

    :cond_13
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_3
    iget-object v0, p0, Lja3/l;->y:Ljava/lang/Object;

    check-cast v0, Lja3/o;

    iget-object v5, p0, Lja3/l;->x:Ljava/lang/Object;

    check-cast v5, Lzt/q;

    move-object v8, p1

    check-cast v8, Lva3/h;

    const-string p1, "name"

    invoke-static {v8, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, v0, Lja3/o;->r:Lkb3/i;

    iget-object v6, v0, Lja3/o;->n:Lr93/e;

    invoke-virtual {p1}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    invoke-interface {p1, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_16

    iget-object p1, v5, Lzt/q;->x:Ljava/lang/Object;

    check-cast p1, Lia3/a;

    iget-object p1, p1, Lia3/a;->b:Laj/c;

    invoke-static {v6}, Lcb3/e;->f(Lr93/h;)Lva3/c;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, v8}, Lva3/c;->d(Lva3/h;)Lva3/c;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v0, Lva3/c;->a:Lva3/e;

    iget-object v0, v0, Lva3/c;->b:Lva3/e;

    iget-object v0, v0, Lva3/e;->a:Lva3/f;

    iget-object v0, v0, Lva3/f;->a:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Lyb3/y;->L(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object v0

    iget-object v1, v4, Lva3/e;->a:Lva3/f;

    invoke-virtual {v1}, Lva3/f;->c()Z

    move-result v1

    if-eqz v1, :cond_14

    goto :goto_a

    :cond_14
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v4, Lva3/e;->a:Lva3/f;

    iget-object v4, v4, Lva3/f;->a:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_a
    iget-object p1, p1, Laj/c;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/ClassLoader;

    invoke-static {p1, v0}, Lva3/d;->k(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    if-eqz p1, :cond_15

    new-instance v0, Lx93/n;

    invoke-direct {v0, p1}, Lx93/n;-><init>(Ljava/lang/Class;)V

    goto :goto_b

    :cond_15
    move-object v0, v3

    :goto_b
    if-eqz v0, :cond_19

    new-instance p1, Lja3/i;

    invoke-direct {p1, v5, v6, v0, v3}, Lja3/i;-><init>(Lzt/q;Lr93/k;Lx93/n;Lr93/e;)V

    iget-object v0, v5, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v0, v0, Lia3/a;->s:Lfa3/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v3, p1

    goto/16 :goto_c

    :cond_16
    iget-object p1, v0, Lja3/o;->s:Lkb3/i;

    invoke-virtual {p1}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    invoke-interface {p1, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_18

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object p1

    iget-object v0, v5, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v0, v0, Lia3/a;->x:Ldb3/e;

    check-cast v0, Ldb3/a;

    invoke-virtual {v0, v6, v8, p1, v5}, Ldb3/a;->c(Lr93/e;Lva3/h;Ln83/c;Lzt/q;)V

    invoke-static {p1}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object p1

    invoke-virtual {p1}, Lm83/h;->a()I

    move-result v0

    if-eqz v0, :cond_19

    if-ne v0, v4, :cond_17

    invoke-static {p1}, Lm83/s;->p1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lr93/e;

    goto :goto_c

    :cond_17
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Multiple classes with same name are generated: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    iget-object p1, v0, Lja3/o;->t:Lkb3/i;

    invoke-virtual {p1}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-interface {p1, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx93/t;

    if-eqz p1, :cond_19

    iget-object v1, v5, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Lia3/a;

    iget-object v2, v1, Lia3/a;->a:Lkb3/n;

    new-instance v3, Lbg/j;

    const/4 v4, 0x3

    invoke-direct {v3, v0, v4}, Lbg/j;-><init>(Ljava/lang/Object;I)V

    check-cast v2, Lkb3/k;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v9, Lkb3/i;

    invoke-direct {v9, v2, v3}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iget-object v6, v1, Lia3/a;->a:Lkb3/n;

    iget-object v7, v0, Lja3/o;->n:Lr93/e;

    invoke-static {v5, p1}, Lhg3/i;->j0(Lzt/q;Lma3/b;)Lia3/c;

    move-result-object v10

    iget-object v0, v1, Lia3/a;->j:Lw93/d;

    invoke-virtual {v0, p1}, Lw93/d;->c(Lma3/d;)Lw93/f;

    move-result-object v11

    invoke-static/range {v6 .. v11}, Lu93/u;->X(Lkb3/n;Lr93/e;Lva3/h;Lkb3/i;Ls93/i;Lr93/s0;)Lu93/u;

    move-result-object v3

    :cond_19
    :goto_c
    return-object v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onFailure(Lud3/j;Ljava/io/IOException;)V
    .locals 0

    check-cast p1, Lzd3/o;

    iget-boolean p1, p1, Lzd3/o;->R:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lja3/l;->x:Ljava/lang/Object;

    check-cast p1, Lbc3/m;

    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    invoke-virtual {p1, p2}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onResponse(Lud3/j;Lud3/x0;)V
    .locals 0

    iget-object p1, p0, Lja3/l;->x:Ljava/lang/Object;

    check-cast p1, Lbc3/m;

    invoke-virtual {p1, p2}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
