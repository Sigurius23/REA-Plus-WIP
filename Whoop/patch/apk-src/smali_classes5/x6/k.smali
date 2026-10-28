.class public final Lx6/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/LinkedHashMap;

.field public final synthetic b:Lx6/l;


# direct methods
.method public constructor <init>(Lx6/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/k;->b:Lx6/l;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lx6/k;->a:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Lx6/h;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lx6/h;

    iget v1, v0, Lx6/h;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx6/h;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lx6/h;

    invoke-direct {v0, p0, p3}, Lx6/h;-><init>(Lx6/k;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lx6/h;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lx6/h;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p2, v0, Lx6/h;->w:Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lx6/k;->b:Lx6/l;

    iget-object p3, p3, Lx6/l;->c:Lx6/s;

    iput-object p2, v0, Lx6/h;->w:Ljava/lang/String;

    iput v3, v0, Lx6/h;->z:I

    invoke-virtual {p3, p1, p2, v0}, Lx6/s;->a(Landroid/content/Context;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object p3, p0, Lx6/k;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {p3, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lp6/l;

    const/4 p3, 0x0

    if-eqz p2, :cond_4

    iget-object p2, p2, Lp6/l;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    goto :goto_2

    :cond_4
    move p2, p3

    :goto_2
    if-eqz p2, :cond_5

    if-eqz p1, :cond_5

    goto :goto_3

    :cond_5
    move v3, p3

    :goto_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lp6/l;Ls83/c;)Ljava/lang/Object;
    .locals 13

    instance-of v0, p2, Lx6/i;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lx6/i;

    iget v1, v0, Lx6/i;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx6/i;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lx6/i;

    invoke-direct {v0, p0, p2}, Lx6/i;-><init>(Lx6/k;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lx6/i;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lx6/i;->y:I

    const/4 v3, 0x0

    iget-object v4, p0, Lx6/k;->a:Ljava/util/LinkedHashMap;

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v7, :cond_2

    if-ne v2, v6, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p1, Lp6/l;->d:Ldc3/h;

    iget-object v2, p1, Lp6/l;->a:Ljava/lang/String;

    iget-object v8, p1, Lp6/l;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v9, p1, Lp6/l;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    :cond_4
    invoke-virtual {p2}, Ldc3/h;->f()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v11}, Ldc3/o;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-eqz v12, :cond_5

    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    instance-of v11, v11, Ldc3/n;

    if-eqz v11, :cond_4

    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    if-nez p2, :cond_9

    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_6

    goto :goto_2

    :cond_6
    iput v6, v0, Lx6/i;->y:I

    invoke-static {p1, v10, v0}, Lp6/l;->d(Lp6/l;Ljava/util/ArrayList;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    goto :goto_3

    :cond_7
    :goto_1
    move-object p1, p2

    check-cast p1, Lp6/l;

    iget-object v0, p1, Lp6/l;->a:Ljava/lang/String;

    invoke-interface {v4, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp6/l;

    if-eqz p1, :cond_8

    iget-object v0, p1, Lp6/l;->d:Ldc3/h;

    invoke-virtual {v0, v5}, Ldc3/h;->r(Ljava/lang/Throwable;)Z

    iget-object v0, p1, Lp6/l;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object p1, p1, Lp6/l;->m:Lbc3/l1;

    invoke-virtual {p1, v5}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_8
    return-object p2

    :cond_9
    :goto_2
    const-string p1, "Closing session "

    const-string p2, " wasOpen="

    invoke-static {p1, v2, p2}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    xor-int/2addr p2, v7

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p2, " hasError="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p2, " events="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "GlanceSessionManager"

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iput v7, v0, Lx6/i;->y:I

    invoke-interface {v4, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp6/l;

    if-eqz p1, :cond_a

    iget-object p2, p1, Lp6/l;->d:Ldc3/h;

    invoke-virtual {p2, v5}, Ldc3/h;->r(Ljava/lang/Throwable;)Z

    iget-object p2, p1, Lp6/l;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object p1, p1, Lp6/l;->m:Lbc3/l1;

    invoke-virtual {p1, v5}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_a
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    if-ne p1, v1, :cond_b

    :goto_3
    return-object v1

    :cond_b
    :goto_4
    return-object v5
.end method

.method public final c(Landroid/content/Context;Lp6/l;Ls83/c;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    iget-object v4, v0, Lx6/k;->b:Lx6/l;

    iget-object v5, v4, Lx6/l;->c:Lx6/s;

    iget-object v6, v4, Lx6/l;->a:Ljava/lang/Class;

    instance-of v7, v3, Lx6/j;

    if-eqz v7, :cond_0

    move-object v7, v3

    check-cast v7, Lx6/j;

    iget v8, v7, Lx6/j;->z:I

    const/high16 v9, -0x80000000

    and-int v10, v8, v9

    if-eqz v10, :cond_0

    sub-int/2addr v8, v9

    iput v8, v7, Lx6/j;->z:I

    goto :goto_0

    :cond_0
    new-instance v7, Lx6/j;

    invoke-direct {v7, v0, v3}, Lx6/j;-><init>(Lx6/k;Ls83/c;)V

    :goto_0
    iget-object v3, v7, Lx6/j;->x:Ljava/lang/Object;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v9, v7, Lx6/j;->z:I

    const-string v10, "context"

    sget-object v11, Ll83/a0;->a:Ll83/a0;

    const/4 v12, 0x0

    const/4 v13, 0x2

    const/4 v14, 0x1

    if-eqz v9, :cond_3

    if-eq v9, v14, :cond_2

    if-ne v9, v13, :cond_1

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v11

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v7, Lx6/j;->w:Landroid/content/Context;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, Lx6/k;->a:Ljava/util/LinkedHashMap;

    iget-object v9, v2, Lp6/l;->a:Ljava/lang/String;

    invoke-interface {v3, v9, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp6/l;

    if-eqz v3, :cond_4

    iget-object v9, v3, Lp6/l;->d:Ldc3/h;

    invoke-virtual {v9, v12}, Ldc3/h;->r(Ljava/lang/Throwable;)Z

    iget-object v9, v3, Lp6/l;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v15, 0x0

    invoke-virtual {v9, v15}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v3, v3, Lp6/l;->m:Lbc3/l1;

    invoke-virtual {v3, v12}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_4
    new-instance v3, Lic/z;

    invoke-direct {v3, v6}, Lic/z;-><init>(Ljava/lang/Class;)V

    iget-object v9, v4, Lx6/l;->b:Lx31/a;

    invoke-virtual {v9, v4, v2}, Lx31/a;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lic/g;

    invoke-virtual {v3, v4}, Lic/q0;->h(Lic/g;)Lic/q0;

    move-result-object v3

    check-cast v3, Lic/z;

    invoke-virtual {v3}, Lic/q0;->b()Lic/r0;

    move-result-object v3

    check-cast v3, Lic/a0;

    iget-object v2, v2, Lp6/l;->a:Ljava/lang/String;

    sget-object v4, Lic/l;->w:Lic/l;

    iput-object v1, v7, Lx6/j;->w:Landroid/content/Context;

    iput v14, v7, Lx6/j;->z:I

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Ljc/v;->g(Landroid/content/Context;)Ljc/v;

    move-result-object v9

    invoke-virtual {v9, v2, v4, v3}, Lic/p0;->e(Ljava/lang/String;Lic/l;Lic/a0;)Lic/e0;

    move-result-object v2

    check-cast v2, Lic/f0;

    iget-object v2, v2, Lic/f0;->c:Ld4/l;

    invoke-static {v2, v7}, Ltx/f;->x(Lds/v;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v8, :cond_5

    goto :goto_1

    :cond_5
    move-object v2, v11

    :goto_1
    if-ne v2, v8, :cond_6

    goto :goto_5

    :cond_6
    :goto_2
    iput-object v12, v7, Lx6/j;->w:Landroid/content/Context;

    iput v13, v7, Lx6/j;->z:I

    sget-object v2, Lic/l;->x:Lic/l;

    new-instance v3, Lic/z;

    invoke-direct {v3, v6}, Lic/z;-><init>(Ljava/lang/Class;)V

    const-wide/16 v13, 0xe42

    sget-object v4, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v13, v14, v4}, Lic/q0;->g(JLjava/util/concurrent/TimeUnit;)Lic/q0;

    move-result-object v3

    check-cast v3, Lic/z;

    new-instance v14, Lrc/e;

    invoke-direct {v14, v12}, Lrc/e;-><init>(Landroid/net/NetworkRequest;)V

    sget-object v15, Lic/x;->w:Lic/x;

    new-instance v4, Ljava/util/LinkedHashSet;

    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {v4}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v24

    new-instance v13, Lic/e;

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, -0x1

    move-wide/from16 v22, v20

    invoke-direct/range {v13 .. v24}, Lic/e;-><init>(Lrc/e;Lic/x;ZZZZJJLjava/util/Set;)V

    invoke-virtual {v3, v13}, Lic/q0;->f(Lic/e;)Lic/q0;

    move-result-object v3

    check-cast v3, Lic/z;

    invoke-virtual {v3}, Lic/q0;->b()Lic/r0;

    move-result-object v3

    check-cast v3, Lic/a0;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Ljc/v;->g(Landroid/content/Context;)Ljc/v;

    move-result-object v1

    const-string v4, "sessionWorkerKeepEnabled"

    invoke-virtual {v1, v4, v2, v3}, Lic/p0;->e(Ljava/lang/String;Lic/l;Lic/a0;)Lic/e0;

    move-result-object v1

    check-cast v1, Lic/f0;

    iget-object v1, v1, Lic/f0;->c:Ld4/l;

    invoke-static {v1, v7}, Ltx/f;->x(Lds/v;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v8, :cond_7

    goto :goto_3

    :cond_7
    move-object v1, v11

    :goto_3
    if-ne v1, v8, :cond_8

    goto :goto_4

    :cond_8
    move-object v1, v11

    :goto_4
    if-ne v1, v8, :cond_9

    :goto_5
    return-object v8

    :cond_9
    return-object v11
.end method
