.class public abstract Lpf/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpf/a;


# static fields
.field public static final synthetic y:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public final w:Lq83/j;

.field public volatile synthetic x:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lpf/f;

    const-string v1, "x"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lpf/f;->y:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v0

    new-instance v1, Lbc3/b0;

    const-string v2, "http-client-engine-OkHttp-context"

    invoke-direct {v1, v2}, Lbc3/b0;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lpf/f;->w:Lq83/j;

    const/4 v0, 0x0

    iput v0, p0, Lpf/f;->x:I

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    sget-object v2, Lpf/f;->y:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v2, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lpf/f;->w:Lq83/j;

    sget-object v1, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v0, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    instance-of v1, v0, Lbc3/u;

    if-eqz v1, :cond_1

    check-cast v0, Lbc3/u;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    :goto_1
    return-void

    :cond_2
    invoke-interface {v0}, Lbc3/u;->complete()Z

    new-instance v1, Lpf/b;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lpf/b;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Lbc3/k1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    return-void
.end method

.method public final getCoroutineContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Lpf/f;->w:Lq83/j;

    return-object v0
.end method

.method public shutdown()V
    .locals 0

    return-void
.end method
