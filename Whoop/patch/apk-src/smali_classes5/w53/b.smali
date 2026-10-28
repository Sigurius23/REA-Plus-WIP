.class public Lw53/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc3/c0;


# static fields
.field public static final E:Lo63/a;

.field public static final synthetic z:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic received:I

.field public final w:Lv53/c;

.field public x:Le63/b;

.field public y:Lf63/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo63/a;

    const-string v1, "CustomResponse"

    invoke-direct {v0, v1}, Lo63/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lw53/b;->E:Lo63/a;

    const-class v0, Lw53/b;

    const-string v1, "received"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lw53/b;->z:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lv53/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw53/b;->w:Lv53/c;

    const/4 p1, 0x0

    iput p1, p0, Lw53/b;->received:I

    return-void
.end method


# virtual methods
.method public final a(Ls63/a;Lq83/d;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lw53/a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lw53/a;

    iget v1, v0, Lw53/a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw53/a;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lw53/a;

    invoke-direct {v0, p0, p2}, Lw53/a;-><init>(Lw53/b;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lw53/a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lw53/a;->E:I

    const-string v3, "type"

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lw53/a;->x:Ls63/a;

    iget-object v0, v0, Lw53/a;->w:Lw53/b;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    goto/16 :goto_7

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lw53/a;->x:Ls63/a;

    iget-object v2, v0, Lw53/a;->w:Lw53/b;

    :try_start_1
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    move-object v0, v2

    goto/16 :goto_7

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    invoke-virtual {p0}, Lw53/b;->d()Lf63/c;

    move-result-object p2

    iget-object v2, p1, Ls63/a;->a:Lj93/d;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p0}, Lw53/b;->d()Lf63/c;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {p0}, Lw53/b;->d()Lf63/c;

    move-result-object p2

    invoke-static {p2}, Lj93/l0;->q(Lf63/c;)V

    return-object p1

    :catchall_2
    move-exception p1

    move-object v0, p0

    goto/16 :goto_7

    :cond_4
    :try_start_3
    invoke-virtual {p0}, Lw53/b;->b()Z

    move-result p2

    if-nez p2, :cond_6

    sget-object p2, Lw53/b;->z:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v2, 0x0

    invoke-virtual {p2, p0, v2, v5}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result p2

    if-eqz p2, :cond_5

    goto :goto_1

    :cond_5
    new-instance p1, Lio/ktor/client/call/DoubleReceiveException;

    invoke-direct {p1, p0}, Lio/ktor/client/call/DoubleReceiveException;-><init>(Lw53/b;)V

    throw p1

    :cond_6
    :goto_1
    invoke-virtual {p0}, Lw53/b;->c()Le63/b;

    move-result-object p2

    invoke-interface {p2}, Le63/b;->getAttributes()Lo63/f;

    move-result-object p2

    sget-object v2, Lw53/b;->E:Lo63/a;

    invoke-virtual {p2, v2}, Lo63/f;->d(Lo63/a;)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_7

    iput-object p0, v0, Lw53/a;->w:Lw53/b;

    iput-object p1, v0, Lw53/a;->x:Ls63/a;

    iput v5, v0, Lw53/a;->E:I

    invoke-virtual {p0}, Lw53/b;->e()Ljava/lang/Object;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne p2, v1, :cond_7

    goto :goto_3

    :cond_7
    move-object v2, p0

    :goto_2
    :try_start_4
    new-instance v5, Lf63/d;

    invoke-direct {v5, p1, p2}, Lf63/d;-><init>(Ls63/a;Ljava/lang/Object;)V

    iget-object p2, v2, Lw53/b;->w:Lv53/c;

    iget-object p2, p2, Lv53/c;->F:Lf63/b;

    iput-object v2, v0, Lw53/a;->w:Lw53/b;

    iput-object p1, v0, Lw53/a;->x:Ls63/a;

    iput v4, v0, Lw53/a;->E:I

    invoke-virtual {p2, v2, v5, v0}, Lr63/d;->a(Ljava/lang/Object;Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-ne p2, v1, :cond_8

    :goto_3
    return-object v1

    :cond_8
    move-object v0, v2

    :goto_4
    :try_start_5
    check-cast p2, Lf63/d;

    iget-object p2, p2, Lf63/d;->b:Ljava/lang/Object;

    sget-object v1, Lj63/a;->a:Lj63/a;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_5

    :cond_9
    const/4 p2, 0x0

    :goto_5
    if-eqz p2, :cond_b

    iget-object v1, p1, Ls63/a;->a:Lj93/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_6

    :cond_a
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, p2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    iget-object p1, p1, Ls63/a;->a:Lj93/d;

    new-instance v1, Lio/ktor/client/call/NoTransformationFoundException;

    invoke-virtual {v0}, Lw53/b;->d()Lf63/c;

    move-result-object v2

    invoke-direct {v1, v2, p2, p1}, Lio/ktor/client/call/NoTransformationFoundException;-><init>(Lf63/c;Lj93/d;Lj93/d;)V

    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :cond_b
    :goto_6
    invoke-virtual {v0}, Lw53/b;->d()Lf63/c;

    move-result-object p1

    invoke-static {p1}, Lj93/l0;->q(Lf63/c;)V

    return-object p2

    :goto_7
    :try_start_6
    invoke-virtual {v0}, Lw53/b;->d()Lf63/c;

    move-result-object p2

    const-string v1, "Receive failed"

    invoke-static {v1, p1}, Ldc/a;->d(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v1

    invoke-static {p2, v1}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception p1

    invoke-virtual {v0}, Lw53/b;->d()Lf63/c;

    move-result-object p2

    invoke-static {p2}, Lj93/l0;->q(Lf63/c;)V

    throw p1
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final c()Le63/b;
    .locals 1

    iget-object v0, p0, Lw53/b;->x:Le63/b;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "request"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final d()Lf63/c;
    .locals 1

    iget-object v0, p0, Lw53/b;->y:Lf63/c;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "response"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public e()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lw53/b;->d()Lf63/c;

    move-result-object v0

    invoke-virtual {v0}, Lf63/c;->b()Lio/ktor/utils/io/q;

    move-result-object v0

    return-object v0
.end method

.method public final getCoroutineContext()Lq83/j;
    .locals 1

    invoke-virtual {p0}, Lw53/b;->d()Lf63/c;

    move-result-object v0

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HttpClientCall["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lw53/b;->c()Le63/b;

    move-result-object v1

    invoke-interface {v1}, Le63/b;->getUrl()Li63/e0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lw53/b;->d()Lf63/c;

    move-result-object v1

    invoke-virtual {v1}, Lf63/c;->e()Li63/v;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
