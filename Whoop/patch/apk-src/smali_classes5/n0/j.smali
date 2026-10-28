.class public final synthetic Ln0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Ln0/j;->w:I

    iput-object p1, p0, Ln0/j;->x:Ljava/lang/Object;

    iput-object p2, p0, Ln0/j;->y:Ljava/lang/Object;

    iput-object p3, p0, Ln0/j;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lp1/q;Lq1/a;Lp1/e2;Lp1/y0;)V
    .locals 0

    .line 2
    const/16 p4, 0xf

    iput p4, p0, Ln0/j;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/j;->x:Ljava/lang/Object;

    iput-object p2, p0, Ln0/j;->y:Ljava/lang/Object;

    iput-object p3, p0, Ln0/j;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    iget v0, p0, Ln0/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/education/view/EducationFragment;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/whoop/education/view/EducationFragment;->C(Lcom/whoop/education/view/EducationFragment;Ljava/lang/String;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lrc/n;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/UUID;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Lic/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "Ignoring setProgressAsync(...). WorkSpec ("

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v5

    sget-object v6, Lrc/n;->c:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Updating progress for "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v6, v1}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v0, Lrc/n;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/room/z0;->beginTransaction()V

    :try_start_0
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->h()Lqc/u;

    move-result-object v1

    invoke-virtual {v1, v4}, Lqc/u;->e(Ljava/lang/String;)Lqc/q;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, v1, Lqc/q;->b:Lic/m0;

    sget-object v5, Lic/m0;->x:Lic/m0;

    if-ne v1, v5, :cond_0

    new-instance v1, Lqc/m;

    invoke-direct {v1, v4, v2}, Lqc/m;-><init>(Ljava/lang/String;Lic/g;)V

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->g()Lqc/n;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v2, Lqc/n;->a:Landroidx/room/z0;

    new-instance v4, Lq11/c;

    const/4 v5, 0x5

    invoke-direct {v4, v5, v2, v1}, Lq11/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v3, v1, v2, v4}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ") is not in a RUNNING state."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v6, v2}, Lic/w;->g(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v0}, Landroidx/room/z0;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Landroidx/room/z0;->endTransaction()V

    const/4 v0, 0x0

    return-object v0

    :cond_1
    :try_start_1
    const-string v1, "Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    :try_start_2
    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v2

    const-string v3, "Error updating Worker progress"

    invoke-virtual {v2, v6, v3, v1}, Lic/w;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v1

    invoke-virtual {v0}, Landroidx/room/z0;->endTransaction()V

    throw v1

    :pswitch_1
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lr90/j;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lr90/c;->c(Lr90/j;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Lm62/k;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lr62/a;->b(Lkotlin/jvm/functions/Function1;Lm62/k;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Lny0/h;

    invoke-static {v0, v1, v2}, Lr51/e;->e(Lp1/c1;Lkotlin/jvm/functions/Function1;Lny0/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lr0/f;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/node/NodeCoordinator;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, La3/z0;

    invoke-static {v0, v1, v2}, Lr0/f;->X0(Lr0/f;Landroidx/compose/ui/node/NodeCoordinator;La3/z0;)Lh2/c;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v0, v0, Lr0/f;->O:Lh0/w;

    iget-wide v2, v0, Lh0/w;->W:J

    const-wide/16 v4, 0x0

    invoke-static {v2, v3, v4, v5}, Ly3/l;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "Expected BringIntoViewRequester to not be used before parents are placed."

    invoke-static {v2}, Lk0/a;->c(Ljava/lang/String;)V

    :cond_2
    iget-wide v2, v0, Lh0/w;->W:J

    invoke-virtual {v0, v1, v2, v3}, Lh0/w;->b1(Lh2/c;J)J

    move-result-wide v2

    const-wide v4, -0x7fffffff80000000L    # -1.0609978955E-314

    xor-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Lh2/c;->l(J)Lh2/c;

    move-result-object v0

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    return-object v0

    :pswitch_5
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lg2/i;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Lg1/y3;

    invoke-static {v0, v1, v2}, Lqu2/h;->m(Lg2/i;Lbc3/c0;Lg1/y3;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lql2/c;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Lh/i;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lql2/a;->k(Lql2/c;Lh/i;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Lm62/i$a;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lq62/d;->f(Lkotlin/jvm/functions/Function1;Lm62/i$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lp1/a;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Lp1/i2;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Lq1/k0;

    if-eqz v0, :cond_4

    invoke-virtual {v1, v0}, Lp1/i2;->c(Lp1/a;)I

    move-result v0

    iget v3, v1, Lp1/i2;->t:I

    sub-int/2addr v0, v3

    invoke-virtual {v1, v0}, Lp1/i2;->a(I)V

    :cond_4
    iget v0, v1, Lp1/i2;->t:I

    const/4 v3, 0x0

    invoke-static {v1, v3, v0, v3}, Lce/w;->t(Lp1/i2;Ljava/lang/Integer;ILjava/lang/Integer;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La2/b;

    if-eqz v1, :cond_5

    iget-object v3, v1, La2/b;->a:Ljava/lang/Integer;

    :cond_5
    invoke-interface {v2, v3}, Lq1/k0;->f(Ljava/lang/Integer;)Ljava/util/List;

    move-result-object v1

    if-eqz v3, :cond_7

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    invoke-static {v1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La2/b;

    check-cast v1, Ljava/lang/Iterable;

    const/4 v4, 0x1

    invoke-static {v1, v4}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, La2/b;

    const/4 v4, 0x0

    invoke-direct {v2, v4, v3}, La2/b;-><init>(Lcom/squareup/wire/n;Ljava/lang/Integer;)V

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v2, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    :cond_7
    :goto_3
    check-cast v0, Ljava/util/Collection;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Lnp1/j$g;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    invoke-static {v0, v1, v2}, Lpp1/i;->a(Lkotlin/jvm/functions/Function1;Lnp1/j$g;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v1, v2, v0}, Lpj2/r;->b(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lm62/g$e;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lp62/i;->b(Lm62/g$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Lp31/b;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lp31/f;->j(Lc93/a;Lp31/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lp1/q;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Lq1/a;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Lp1/e2;

    iget-object v3, v0, Lp1/q;->M:Lq1/b;

    iget-object v4, v3, Lq1/b;->b:Lq1/a;

    :try_start_3
    iput-object v1, v3, Lq1/b;->b:Lq1/a;

    iget-object v1, v0, Lp1/q;->G:Lp1/e2;

    iget-object v5, v0, Lp1/q;->o:[I

    iget-object v6, v0, Lp1/q;->v:La0/g0;

    const/4 v7, 0x0

    iput-object v7, v0, Lp1/q;->o:[I

    iput-object v7, v0, Lp1/q;->v:La0/g0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    :try_start_4
    iput-object v2, v0, Lp1/q;->G:Lp1/e2;

    iget-boolean v2, v3, Lq1/b;->e:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    const/4 v7, 0x0

    :try_start_5
    iput-boolean v7, v3, Lq1/b;->e:Z

    const/4 v7, 0x0

    throw v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v7

    :try_start_6
    iput-boolean v2, v3, Lq1/b;->e:Z

    throw v7
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception v2

    :try_start_7
    iput-object v1, v0, Lp1/q;->G:Lp1/e2;

    iput-object v5, v0, Lp1/q;->o:[I

    iput-object v6, v0, Lp1/q;->v:La0/g0;

    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    :catchall_4
    move-exception v0

    iput-object v4, v3, Lq1/b;->b:Lq1/a;

    throw v0

    :pswitch_e
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lq2/a;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Loz0/c;

    invoke-static {v0, v1, v2}, Loz0/b;->b(Lq2/a;Lkotlin/jvm/functions/Function1;Loz0/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Lpx2/f$a;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Lpx2/n;

    invoke-static {v0, v1, v2}, Lox2/h;->j(Lkotlin/jvm/functions/Function1;Lpx2/f$a;Lpx2/n;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lb3/x2;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Lpx2/b$b;

    invoke-static {v0, v1, v2}, Lox2/e;->n(Lb3/x2;Lkotlin/jvm/functions/Function1;Lpx2/b$b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lhw0/e;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lcom/whoop/core/details/view/a;->i(Lhw0/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Lm72/g$c;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    invoke-static {v0, v1, v2}, Lo72/h;->a(Lkotlin/jvm/functions/Function1;Lm72/g$c;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lny0/h0;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lny0/g0;->a(Lny0/h0;Lp1/c1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map;

    invoke-static {v0, v1, v2}, Lnx1/h;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/util/Map;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lnw0/g;->s(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lny0/h;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Lm91/o;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lnr0/f;->d(Lny0/h;Lm91/o;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Llo1/c$e;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lno1/f;->d(Llo1/c$e;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Llo0/e0;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lno0/v0;->b(Llo0/e0;Lp1/c1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Ll1/w3;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    invoke-static {v0, v1, v2}, Lno0/l0;->D(Lbc3/c0;Ll1/w3;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Ll1/w3;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lno0/i;->j(Lbc3/c0;Ll1/w3;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Lnk1/d;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    invoke-static {v0, v1, v2}, Lnk1/c;->i(Lkotlin/jvm/functions/Function1;Lnk1/d;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    iget-object v0, p0, Ln0/j;->x:Ljava/lang/Object;

    check-cast v0, Lp1/f0;

    iget-object v1, p0, Ln0/j;->y:Ljava/lang/Object;

    check-cast v1, Ln0/u;

    iget-object v2, p0, Ln0/j;->z:Ljava/lang/Object;

    check-cast v2, Landroidx/compose/foundation/lazy/b;

    invoke-virtual {v0}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/f;

    new-instance v3, Lab/h0;

    iget-object v4, v1, Ln0/u;->e:Ll2/a;

    iget-object v4, v4, Ll2/a;->e:Ljava/lang/Object;

    check-cast v4, Lp0/f0;

    invoke-virtual {v4}, Lp0/f0;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li93/j;

    invoke-direct {v3, v4, v0}, Lab/h0;-><init>(Li93/j;Lp0/y;)V

    new-instance v4, Ln0/i;

    invoke-direct {v4, v1, v0, v2, v3}, Ln0/i;-><init>(Ln0/u;Ln0/f;Landroidx/compose/foundation/lazy/b;Lab/h0;)V

    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
