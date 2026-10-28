.class public final Lt40/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Ln;

.field public final c:Lq30/u0;

.field public final d:Lmc3/a;

.field public final e:Ll83/p;

.field public f:Lsr/k;


# direct methods
.method public constructor <init>(Ln;Lq30/u0;)V
    .locals 3

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v1, 0x866dab52c2L

    iput-wide v1, p0, Lt40/f;->a:J

    iput-object p1, p0, Lt40/f;->b:Ln;

    iput-object p2, p0, Lt40/f;->c:Lq30/u0;

    iput-object v0, p0, Lt40/f;->d:Lmc3/a;

    new-instance p1, Lsc0/c;

    const/4 p2, 0x7

    invoke-direct {p1, p0, p2}, Lsc0/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lt40/f;->e:Ll83/p;

    return-void
.end method


# virtual methods
.method public final a(Ls83/c;)Ljava/lang/Object;
    .locals 13

    const-string v0, "Preparing integrity token provider - instance: "

    const-string v1, "Integrity token already prepared - instance: "

    instance-of v2, p1, Lt40/c;

    if-eqz v2, :cond_0

    move-object v2, p1

    check-cast v2, Lt40/c;

    iget v3, v2, Lt40/c;->F:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lt40/c;->F:I

    goto :goto_0

    :cond_0
    new-instance v2, Lt40/c;

    invoke-direct {v2, p0, p1}, Lt40/c;-><init>(Lt40/f;Ls83/c;)V

    :goto_0
    iget-object p1, v2, Lt40/c;->z:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lt40/c;->F:I

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v0, v2, Lt40/c;->y:Lmc3/a;

    iget-object v1, v2, Lt40/c;->x:Lt40/f;

    iget-object v2, v2, Lt40/c;->w:Lt40/f;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v4, v2, Lt40/c;->y:Lmc3/a;

    iget-object v9, v2, Lt40/c;->x:Lt40/f;

    iget-object v10, v2, Lt40/c;->w:Lt40/f;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object p1, v4

    goto :goto_1

    :catchall_1
    move-exception p1

    goto/16 :goto_5

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object p1, p0, Lt40/f;->d:Lmc3/a;

    iput-object p0, v2, Lt40/c;->w:Lt40/f;

    iput-object p0, v2, Lt40/c;->x:Lt40/f;

    iput-object p1, v2, Lt40/c;->y:Lmc3/a;

    iput v7, v2, Lt40/c;->F:I

    invoke-interface {p1, v2}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    if-ne v4, v3, :cond_4

    goto/16 :goto_2

    :cond_4
    move-object v9, p0

    move-object v10, v9

    :goto_1
    :try_start_3
    iget-object v4, v9, Lt40/f;->f:Lsr/k;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    iget-object v11, v9, Lt40/f;->e:Ll83/p;

    const-string v12, "Integrity"

    if-eqz v4, :cond_5

    :try_start_4
    invoke-virtual {v11}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsr/b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v12, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    invoke-interface {p1, v8}, Lmc3/a;->i(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    return-object v5

    :catchall_2
    move-exception v0

    move-object v2, v0

    move-object v0, p1

    move-object p1, v2

    move-object v2, v10

    goto/16 :goto_4

    :cond_5
    :try_start_6
    invoke-virtual {v11}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsr/b;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v12, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v11}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsr/b;

    int-to-byte v1, v6

    iget-wide v11, v9, Lt40/f;->a:J

    or-int/2addr v1, v7

    int-to-byte v1, v1

    const/4 v4, 0x3

    if-eq v1, v4, :cond_8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    and-int/lit8 v2, v1, 0x1

    if-nez v2, :cond_6

    const-string v2, " cloudProjectNumber"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    and-int/2addr v1, v6

    if-nez v1, :cond_7

    const-string v1, " webViewRequestMode"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Missing required properties:"

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    new-instance v1, Lsr/n;

    invoke-direct {v1, v11, v12}, Lsr/n;-><init>(J)V

    invoke-virtual {v0, v1}, Lsr/b;->a(Lsr/n;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iput-object v10, v2, Lt40/c;->w:Lt40/f;

    iput-object v9, v2, Lt40/c;->x:Lt40/f;

    iput-object p1, v2, Lt40/c;->y:Lmc3/a;

    iput v6, v2, Lt40/c;->F:I

    invoke-static {v0, v2}, Lrs/b;->d(Lcom/google/android/gms/tasks/Task;Ls83/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    if-ne v0, v3, :cond_9

    :goto_2
    return-object v3

    :cond_9
    move-object v1, v0

    move-object v0, p1

    move-object p1, v1

    move-object v1, v9

    move-object v2, v10

    :goto_3
    :try_start_7
    check-cast p1, Lcom/google/android/gms/tasks/Task;

    invoke-static {p1}, Lrs/b;->l(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    move-result-object p1

    instance-of v3, p1, Ll83/m;

    if-nez v3, :cond_a

    move-object v3, p1

    check-cast v3, Lsr/k;

    iput-object v3, v1, Lt40/f;->f:Lsr/k;

    :cond_a
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Lsr/k;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    invoke-interface {v0, v8}, Lmc3/a;->i(Ljava/lang/Object;)V

    goto :goto_6

    :catchall_3
    move-exception p1

    move-object v10, v2

    goto :goto_5

    :goto_4
    invoke-interface {v0, v8}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :catchall_4
    move-exception p1

    move-object v10, p0

    :goto_5
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    move-object v2, v10

    :goto_6
    instance-of v0, p1, Ll83/m;

    if-nez v0, :cond_b

    check-cast p1, Lsr/k;

    goto :goto_7

    :cond_b
    move-object v5, p1

    :goto_7
    invoke-static {v5}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_c

    goto :goto_8

    :cond_c
    :try_start_9
    iget-object v0, v2, Lt40/f;->b:Ln;

    const-string v1, "Integrity - Failed to prepare integrity token"

    invoke-virtual {v0, v1, p1}, Ln;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/stripe/attestation/AttestationError;->w:Ljava/lang/Object;

    invoke-static {p1}, Lrj/o;->s(Ljava/lang/Throwable;)Lcom/stripe/attestation/AttestationError;

    move-result-object p1

    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    :catchall_5
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v5

    :goto_8
    return-object v5
.end method

.method public final b(Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Lt40/d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lt40/d;

    iget v1, v0, Lt40/d;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lt40/d;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lt40/d;

    invoke-direct {v0, p0, p1}, Lt40/d;-><init>(Lt40/f;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lt40/d;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lt40/d;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lt40/d;->w:Lt40/f;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lt40/d;->x:Lt40/f;

    iget-object v4, v0, Lt40/d;->w:Lt40/f;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    move-object v0, v4

    goto :goto_5

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object p1, p0, Lt40/f;->f:Lsr/k;

    if-nez p1, :cond_5

    iput-object p0, v0, Lt40/d;->w:Lt40/f;

    iput-object p0, v0, Lt40/d;->x:Lt40/f;

    iput v4, v0, Lt40/d;->E:I

    invoke-virtual {p0, v0}, Lt40/f;->a(Ls83/c;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne p1, v1, :cond_4

    goto :goto_3

    :cond_4
    move-object v2, p0

    move-object v4, v2

    :goto_1
    :try_start_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :catchall_2
    move-exception p1

    move-object v0, p0

    goto :goto_5

    :cond_5
    move-object v2, p0

    move-object v4, v2

    :goto_2
    iget-object p1, v2, Lt40/f;->f:Lsr/k;

    if-eqz p1, :cond_8

    sget v2, Lxr/h;->y:I

    sget-object v2, Lxr/j;->G:Lxr/j;

    if-eqz v2, :cond_7

    new-instance v5, Lsr/o;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v2}, Lsr/o;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    invoke-virtual {p1, v5}, Lsr/k;->a(Lsr/o;)Lcq/u;

    move-result-object p1

    const-string v2, "request(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v0, Lt40/d;->w:Lt40/f;

    iput-object v6, v0, Lt40/d;->x:Lt40/f;

    iput v3, v0, Lt40/d;->E:I

    invoke-static {p1, v0}, Lrs/b;->d(Lcom/google/android/gms/tasks/Task;Ls83/c;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne p1, v1, :cond_6

    :goto_3
    return-object v1

    :cond_6
    move-object v0, v4

    :goto_4
    :try_start_4
    check-cast p1, Lcom/google/android/gms/tasks/Task;

    invoke-static {p1}, Lrs/b;->l(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Lsr/j;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_6

    :cond_7
    :try_start_5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null verdictOptOut"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    const-string p1, "Integrity token provider is not initialized after prepare()"

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_5
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_6
    instance-of v1, p1, Ll83/m;

    if-nez v1, :cond_9

    check-cast p1, Lsr/j;

    iget-object p1, p1, Lsr/j;->a:Ljava/lang/String;

    :cond_9
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_a

    goto :goto_7

    :cond_a
    :try_start_6
    iget-object p1, v0, Lt40/f;->b:Ln;

    const-string v0, "Integrity - Failed to request integrity token"

    invoke-virtual {p1, v0, v1}, Ln;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lcom/stripe/attestation/AttestationError;->w:Ljava/lang/Object;

    invoke-static {v1}, Lrj/o;->s(Ljava/lang/Throwable;)Lcom/stripe/attestation/AttestationError;

    move-result-object p1

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_7
    return-object p1
.end method

.method public final c(Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lt40/e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lt40/e;

    iget v1, v0, Lt40/e;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lt40/e;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lt40/e;

    invoke-direct {v0, p0, p1}, Lt40/e;-><init>(Lt40/f;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lt40/e;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lt40/e;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Lt40/e;->y:I

    invoke-virtual {p0, v0}, Lt40/f;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method
