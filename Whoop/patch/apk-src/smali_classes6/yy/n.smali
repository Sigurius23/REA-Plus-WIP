.class public final Lyy/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lab/i0;

.field public final c:Lqy/d;

.field public final d:Lq30/w0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lab/i0;Lqy/d;Lq30/w0;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyy/n;->a:Landroid/content/Context;

    iput-object p2, p0, Lyy/n;->b:Lab/i0;

    iput-object p3, p0, Lyy/n;->c:Lqy/d;

    iput-object p4, p0, Lyy/n;->d:Lq30/w0;

    return-void
.end method


# virtual methods
.method public final a(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lyy/k;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lyy/k;

    iget v1, v0, Lyy/k;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lyy/k;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lyy/k;

    invoke-direct {v0, p0, p2}, Lyy/k;-><init>(Lyy/n;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lyy/k;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lyy/k;->E:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lyy/k;->x:Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    iget-object v2, v0, Lyy/k;->w:Lyy/n;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lyy/k;->x:Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    iget-object v2, v0, Lyy/k;->w:Lyy/n;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lyy/k;->w:Lyy/n;

    iput-object p1, v0, Lyy/k;->x:Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    iput v6, v0, Lyy/k;->E:I

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    if-ne p2, v1, :cond_5

    goto :goto_4

    :cond_5
    move-object v2, p0

    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_7

    iput-object v2, v0, Lyy/k;->w:Lyy/n;

    iput-object p1, v0, Lyy/k;->x:Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    iput v5, v0, Lyy/k;->E:I

    invoke-virtual {v2, p1, v0}, Lyy/n;->b(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_7

    goto :goto_3

    :cond_7
    const/4 v6, 0x0

    :goto_3
    if-nez v6, :cond_8

    const/4 p2, 0x0

    iput-object p2, v0, Lyy/k;->w:Lyy/n;

    iput-object p2, v0, Lyy/k;->x:Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    iput v4, v0, Lyy/k;->E:I

    invoke-virtual {v2, p1, v0}, Lyy/n;->c(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_4
    return-object v1

    :cond_8
    return-object v3
.end method

.method public final b(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Ls83/c;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Lyy/l;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lyy/l;

    iget v3, v2, Lyy/l;->E:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lyy/l;->E:I

    goto :goto_0

    :cond_0
    new-instance v2, Lyy/l;

    invoke-direct {v2, v1, v0}, Lyy/l;-><init>(Lyy/n;Ls83/c;)V

    :goto_0
    iget-object v0, v2, Lyy/l;->y:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lyy/l;->E:I

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lyy/l;->x:Ljava/lang/Object;

    check-cast v3, Lds/v;

    iget-object v2, v2, Lyy/l;->w:Ljava/lang/Object;

    check-cast v2, Lyy/l;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v4, v2, Lyy/l;->x:Ljava/lang/Object;

    check-cast v4, Lic/p0;

    iget-object v8, v2, Lyy/l;->w:Ljava/lang/Object;

    check-cast v8, Lyy/n;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    const-string v0, "context"

    iget-object v4, v1, Lyy/n;->a:Landroid/content/Context;

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Ljc/v;->g(Landroid/content/Context;)Ljc/v;

    move-result-object v4

    iput-object v1, v2, Lyy/l;->w:Ljava/lang/Object;

    iput-object v4, v2, Lyy/l;->x:Ljava/lang/Object;

    iput v7, v2, Lyy/l;->E:I

    iget-object v0, v1, Lyy/n;->d:Lq30/w0;

    iget-object v8, v0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v8, Lbc3/z;

    new-instance v9, Lo23/p;

    const/16 v10, 0x14

    move-object/from16 v11, p1

    invoke-direct {v9, v11, v0, v6, v10}, Lo23/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v8, v9, v2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_4

    goto/16 :goto_3

    :cond_4
    :goto_1
    check-cast v0, Ljava/lang/String;

    sget-object v8, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->w:Lab/i0;

    const-string v8, "id"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Ll83/k;

    const-string v9, "data"

    invoke-direct {v8, v9, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v8}, [Ll83/k;

    move-result-object v0

    new-instance v8, Lb0/b;

    invoke-direct {v8, v7}, Lb0/b;-><init>(I)V

    const/4 v9, 0x0

    aget-object v0, v0, v9

    iget-object v9, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    invoke-virtual {v8, v0, v9}, Lb0/b;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8}, Lb0/b;->b()Lic/g;

    move-result-object v0

    new-instance v8, Lrc/e;

    sget-object v8, Lic/x;->w:Lic/x;

    new-instance v8, Ljava/util/LinkedHashSet;

    invoke-direct {v8}, Ljava/util/LinkedHashSet;-><init>()V

    sget-object v11, Lic/x;->x:Lic/x;

    new-instance v10, Lrc/e;

    invoke-direct {v10, v6}, Lrc/e;-><init>(Landroid/net/NetworkRequest;)V

    invoke-static {v8}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v20

    new-instance v9, Lic/e;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, -0x1

    move-wide/from16 v18, v16

    invoke-direct/range {v9 .. v20}, Lic/e;-><init>(Lrc/e;Lic/x;ZZZZJJLjava/util/Set;)V

    new-instance v6, Lic/z;

    const-class v8, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;

    invoke-direct {v6, v8}, Lic/q0;-><init>(Ljava/lang/Class;)V

    const-string v8, "SendAnalyticsRequestV2Worker"

    invoke-virtual {v6, v8}, Lic/q0;->a(Ljava/lang/String;)Lic/q0;

    move-result-object v6

    check-cast v6, Lic/z;

    invoke-virtual {v6, v0}, Lic/q0;->h(Lic/g;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/z;

    invoke-virtual {v0, v9}, Lic/q0;->f(Lic/e;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/z;

    invoke-virtual {v0}, Lic/q0;->b()Lic/r0;

    move-result-object v0

    check-cast v0, Lic/a0;

    :try_start_1
    invoke-virtual {v4, v0}, Lic/p0;->c(Lic/r0;)Lic/e0;

    move-result-object v0

    const-string v4, "enqueue(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lic/f0;

    iget-object v0, v0, Lic/f0;->c:Ld4/l;

    iget-object v4, v0, Ld4/l;->x:Ld4/k;

    invoke-virtual {v4}, Ld4/h;->isDone()Z

    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v6, :cond_6

    :try_start_2
    invoke-virtual {v4}, Ld4/h;->get()Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    :catch_0
    move-exception v0

    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_5

    goto :goto_2

    :cond_5
    move-object v0, v2

    :goto_2
    throw v0

    :cond_6
    iput-object v2, v2, Lyy/l;->w:Ljava/lang/Object;

    iput-object v0, v2, Lyy/l;->x:Ljava/lang/Object;

    iput v5, v2, Lyy/l;->E:I

    new-instance v5, Lbc3/m;

    invoke-static {v2}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v2

    invoke-direct {v5, v7, v2}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v5}, Lbc3/m;->s()V

    new-instance v2, Lds/s;

    const/16 v6, 0x13

    invoke-direct {v2, v6, v5, v0}, Lds/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sget-object v6, Lic/j;->w:Lic/j;

    invoke-virtual {v4, v2, v6}, Ld4/h;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    new-instance v2, Lj43/a;

    const/16 v4, 0x19

    invoke-direct {v2, v0, v4}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v5, v2}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v5}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_7

    :goto_3
    return-object v3

    :cond_7
    :goto_4
    const-string v2, "result.await()"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lic/d0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_6

    :goto_5
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_6
    instance-of v0, v0, Ll83/m;

    xor-int/2addr v0, v7

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final c(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Ls83/c;)Ljava/lang/Object;
    .locals 6

    const-string v0, "EVENT: "

    instance-of v1, p2, Lyy/m;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lyy/m;

    iget v2, v1, Lyy/m;->F:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lyy/m;->F:I

    goto :goto_0

    :cond_0
    new-instance v1, Lyy/m;

    invoke-direct {v1, p0, p2}, Lyy/m;-><init>(Lyy/n;Ls83/c;)V

    :goto_0
    iget-object p2, v1, Lyy/m;->z:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lyy/m;->F:I

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v5, :cond_1

    iget-object p1, v1, Lyy/m;->y:Lyy/n;

    iget-object v2, v1, Lyy/m;->x:Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    iget-object v1, v1, Lyy/m;->w:Lyy/n;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, Lyy/n;->b:Lab/i0;

    iput-object p0, v1, Lyy/m;->w:Lyy/n;

    iput-object p1, v1, Lyy/m;->x:Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    iput-object p0, v1, Lyy/m;->y:Lyy/n;

    iput v5, v1, Lyy/m;->F:I

    invoke-virtual {p2, p1, v1}, Lab/i0;->r(Lyy/m0;Ls83/c;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p2, v2, :cond_3

    return-object v2

    :cond_3
    move-object v1, p0

    move-object v2, p1

    move-object p1, v1

    :goto_1
    :try_start_2
    iget-object p1, p1, Lyy/n;->c:Lqy/d;

    invoke-virtual {v2}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->getEventName()Ljava/lang/String;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lqy/d;->a(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object p1, v4

    goto :goto_3

    :catchall_1
    move-exception p1

    move-object v1, p0

    :goto_2
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_3
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object p2, v1, Lyy/n;->c:Lqy/d;

    const-string v0, "Exception while making analytics request"

    invoke-virtual {p2, v0, p1}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    return-object v4
.end method
