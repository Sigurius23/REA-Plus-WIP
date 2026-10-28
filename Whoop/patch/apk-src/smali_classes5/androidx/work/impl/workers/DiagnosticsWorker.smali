.class public final Landroidx/work/impl/workers/DiagnosticsWorker;
.super Landroidx/work/Worker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/work/impl/workers/DiagnosticsWorker;",
        "Landroidx/work/Worker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "parameters",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "work-runtime_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameters"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/work/Worker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    return-void
.end method


# virtual methods
.method public final a()Lic/t;
    .locals 10

    invoke-virtual {p0}, Lic/v;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Ljc/v;->g(Landroid/content/Context;)Ljc/v;

    move-result-object v0

    iget-object v1, v0, Ljc/v;->c:Landroidx/work/impl/WorkDatabase;

    const-string v2, "getWorkDatabase(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->h()Lqc/u;

    move-result-object v2

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->f()Lqc/l;

    move-result-object v3

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->i()Lqc/w;

    move-result-object v4

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->e()Lqc/i;

    move-result-object v1

    iget-object v0, v0, Ljc/v;->b:Lic/b;

    iget-object v0, v0, Lic/b;->d:Lic/y;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v7, 0x1

    invoke-virtual {v0, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v7

    sub-long/2addr v5, v7

    iget-object v0, v2, Lqc/u;->a:Landroidx/room/z0;

    new-instance v7, Lai1/b;

    const/16 v8, 0x1a

    invoke-direct {v7, v5, v6, v8}, Lai1/b;-><init>(JI)V

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v0, v5, v6, v7}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v7, v2, Lqc/u;->a:Landroidx/room/z0;

    new-instance v8, Lpl0/a;

    const/16 v9, 0x19

    invoke-direct {v8, v9}, Lpl0/a;-><init>(I)V

    invoke-static {v7, v5, v6, v8}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    iget-object v2, v2, Lqc/u;->a:Landroidx/room/z0;

    new-instance v8, Lpl0/a;

    const/16 v9, 0x1c

    invoke-direct {v8, v9}, Lpl0/a;-><init>(I)V

    invoke-static {v2, v5, v6, v8}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    move-object v5, v0

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_0

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v5

    sget-object v6, Ltc/a;->a:Ljava/lang/String;

    const-string v8, "Recently completed work:\n\n"

    invoke-virtual {v5, v6, v8}, Lic/w;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v5

    invoke-static {v3, v4, v1, v0}, Ltc/a;->a(Lqc/l;Lqc/w;Lqc/i;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v6, v0}, Lic/w;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    move-object v0, v7

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v0

    sget-object v5, Ltc/a;->a:Ljava/lang/String;

    const-string v6, "Running work:\n\n"

    invoke-virtual {v0, v5, v6}, Lic/w;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v0

    invoke-static {v3, v4, v1, v7}, Ltc/a;->a(Lqc/l;Lqc/w;Lqc/i;Ljava/util/List;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v5, v6}, Lic/w;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    move-object v0, v2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v0

    sget-object v5, Ltc/a;->a:Ljava/lang/String;

    const-string v6, "Enqueued work:\n\n"

    invoke-virtual {v0, v5, v6}, Lic/w;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v0

    invoke-static {v3, v4, v1, v2}, Ltc/a;->a(Lqc/l;Lqc/w;Lqc/i;Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Lic/w;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object v0

    return-object v0
.end method
