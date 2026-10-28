.class public final Landroidx/glance/session/SessionWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rB\u0019\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000c\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Landroidx/glance/session/SessionWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "appContext",
        "Landroidx/work/WorkerParameters;",
        "params",
        "Lx6/f;",
        "sessionManager",
        "Lx6/t;",
        "timeouts",
        "Lbc3/z;",
        "coroutineContext",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lx6/f;Lx6/t;Lbc3/z;)V",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "glance"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final E:Ljava/lang/String;

.field public final w:Landroidx/work/WorkerParameters;

.field public final x:Lx6/f;

.field public final y:Lx6/t;

.field public final z:Lbc3/z;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 8

    .line 8
    sget-object v3, Lx6/m;->a:Lx6/l;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 9
    invoke-direct/range {v0 .. v7}, Landroidx/glance/session/SessionWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;Lx6/f;Lx6/t;Lbc3/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;Lx6/f;Lx6/t;Lbc3/z;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 2
    iput-object p2, p0, Landroidx/glance/session/SessionWorker;->w:Landroidx/work/WorkerParameters;

    .line 3
    iput-object p3, p0, Landroidx/glance/session/SessionWorker;->x:Lx6/f;

    .line 4
    iput-object p4, p0, Landroidx/glance/session/SessionWorker;->y:Lx6/t;

    .line 5
    iput-object p5, p0, Landroidx/glance/session/SessionWorker;->z:Lbc3/z;

    .line 6
    invoke-virtual {p0}, Lic/v;->getInputData()Lic/g;

    move-result-object p1

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p2, "KEY"

    invoke-virtual {p1, p2}, Lic/g;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iput-object p1, p0, Landroidx/glance/session/SessionWorker;->E:Ljava/lang/String;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 7
    const-string p2, "SessionWorker must be started with a key"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;Lx6/f;Lx6/t;Lbc3/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 10
    sget-object p3, Lx6/m;->a:Lx6/l;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    .line 11
    new-instance p4, Lx6/t;

    invoke-direct {p4}, Lx6/t;-><init>()V

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    .line 12
    sget-object p3, Lbc3/q0;->a:Lkc3/e;

    .line 13
    sget-object p5, Lhc3/o;->a:Lbc3/w1;

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p5

    .line 14
    invoke-direct/range {v0 .. v5}, Landroidx/glance/session/SessionWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;Lx6/f;Lx6/t;Lbc3/z;)V

    return-void
.end method


# virtual methods
.method public final doWork(Lq83/d;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p1, Lx6/n;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lx6/n;

    iget v1, v0, Lx6/n;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx6/n;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lx6/n;

    check-cast p1, Ls83/c;

    invoke-direct {v0, p0, p1}, Lx6/n;-><init>(Landroidx/glance/session/SessionWorker;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lx6/n;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lx6/n;->E:I

    const/4 v3, 0x3

    iget-object v4, p0, Landroidx/glance/session/SessionWorker;->x:Lx6/f;

    const/4 v5, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, v0, Lx6/n;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_1
    iget v2, v0, Lx6/n;->w:I

    iget-object v6, v0, Lx6/n;->x:Ljava/lang/Object;

    check-cast v6, Lp6/l;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_2
    iget v2, v0, Lx6/n;->w:I

    iget-object v6, v0, Lx6/n;->x:Ljava/lang/Object;

    check-cast v6, Lp6/l;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    move-object v10, v0

    move-object v0, p1

    move-object p1, v10

    goto/16 :goto_5

    :pswitch_3
    iget-object v0, v0, Lx6/n;->x:Ljava/lang/Object;

    check-cast v0, Lic/u;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v0

    :pswitch_4
    iget v2, v0, Lx6/n;->w:I

    iget-object v6, v0, Lx6/n;->x:Ljava/lang/Object;

    check-cast v6, Lp6/l;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_3

    :pswitch_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lo23/p;

    const/16 v2, 0x11

    invoke-direct {p1, p0, v5, v2}, Lo23/p;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v2, 0x1

    iput v2, v0, Lx6/n;->E:I

    move-object v2, v4

    check-cast v2, Lx6/l;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, p1, v0}, Lx6/l;->b(Lx6/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto/16 :goto_6

    :cond_1
    :goto_1
    check-cast p1, Lp6/l;

    if-nez p1, :cond_3

    iget-object p1, p0, Landroidx/glance/session/SessionWorker;->w:Landroidx/work/WorkerParameters;

    iget p1, p1, Landroidx/work/WorkerParameters;->e:I

    iget-object v0, p0, Landroidx/glance/session/SessionWorker;->E:Ljava/lang/String;

    if-eqz p1, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "SessionWorker attempted restart but Session is not available for "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "GlanceSessionWorker"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No session available for key "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const/4 v2, 0x0

    :cond_4
    move-object v6, p1

    :goto_2
    if-eqz v6, :cond_a

    if-ge v2, v3, :cond_a

    add-int/lit8 v2, v2, 0x1

    :try_start_2
    iget-object p1, p0, Landroidx/glance/session/SessionWorker;->y:Lx6/t;

    iget-object p1, p1, Lx6/t;->d:Lux/f0;

    new-instance v7, Lx30/k0;

    const/4 v8, 0x1

    invoke-direct {v7, p0, v6, v5, v8}, Lx30/k0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object v6, v0, Lx6/n;->x:Ljava/lang/Object;

    iput v2, v0, Lx6/n;->w:I

    const/4 v8, 0x2

    iput v8, v0, Lx6/n;->E:I

    invoke-static {p1, v7, v0}, Ls4/i;->w(Lux/f0;Lx30/k0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto/16 :goto_6

    :cond_5
    :goto_3
    check-cast p1, Lic/u;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p1, :cond_7

    iget-object v2, v6, Lp6/l;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_6

    sget-object v2, Lbc3/y1;->w:Lbc3/y1;

    new-instance v4, Ls40/c0;

    const/16 v7, 0x1a

    invoke-direct {v4, p0, v6, v5, v7}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lx6/n;->x:Ljava/lang/Object;

    iput v3, v0, Lx6/n;->E:I

    invoke-static {v2, v4, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_6

    goto :goto_6

    :cond_6
    return-object p1

    :cond_7
    :try_start_3
    new-instance p1, Lx6/o;

    const/4 v7, 0x0

    invoke-direct {p1, v6, v5, v7}, Lx6/o;-><init>(Lp6/l;Lq83/d;I)V

    iput-object v6, v0, Lx6/n;->x:Ljava/lang/Object;

    iput v2, v0, Lx6/n;->w:I

    const/4 v7, 0x4

    iput v7, v0, Lx6/n;->E:I

    move-object v7, v4

    check-cast v7, Lx6/l;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v7, p1, v0}, Lx6/l;->b(Lx6/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_6

    :cond_8
    :goto_4
    check-cast p1, Lp6/l;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iget-object v7, v6, Lp6/l;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v7

    if-eqz v7, :cond_4

    sget-object v7, Lbc3/y1;->w:Lbc3/y1;

    new-instance v8, Ls40/c0;

    const/16 v9, 0x1a

    invoke-direct {v8, p0, v6, v5, v9}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lx6/n;->x:Ljava/lang/Object;

    iput v2, v0, Lx6/n;->w:I

    const/4 v6, 0x5

    iput v6, v0, Lx6/n;->E:I

    invoke-static {v7, v8, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_4

    goto :goto_6

    :goto_5
    iget-object v2, v6, Lp6/l;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_9

    sget-object v2, Lbc3/y1;->w:Lbc3/y1;

    new-instance v3, Ls40/c0;

    const/16 v4, 0x1a

    invoke-direct {v3, p0, v6, v5, v4}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object v0, p1, Lx6/n;->x:Ljava/lang/Object;

    const/4 v4, 0x6

    iput v4, p1, Lx6/n;->E:I

    invoke-static {v2, v3, p1}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_6
    return-object v1

    :cond_9
    :goto_7
    throw v0

    :cond_a
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v0, "TIMEOUT_EXIT_REASON"

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lic/g;

    invoke-direct {v0, p1}, Lic/g;-><init>(Ljava/util/LinkedHashMap;)V

    invoke-static {v0}, Lpf/c;->X(Lic/g;)[B

    new-instance p1, Lic/t;

    invoke-direct {p1, v0}, Lic/t;-><init>(Lic/g;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getCoroutineContext()Lbc3/z;
    .locals 1

    iget-object v0, p0, Landroidx/glance/session/SessionWorker;->z:Lbc3/z;

    return-object v0
.end method
