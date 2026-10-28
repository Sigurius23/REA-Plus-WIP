.class public abstract Ly53/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly53/b;


# static fields
.field public static final synthetic x:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic closed:I

.field public final w:Ll83/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Ly53/c;

    const-string v1, "closed"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Ly53/c;->x:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ly53/c;->closed:I

    new-instance v0, La3/l0;

    const/16 v1, 0x17

    invoke-direct {v0, p0, v1}, La3/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Ly53/c;->w:Ll83/p;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    sget-object v2, Ly53/c;->x:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v2, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Ly53/c;->getCoroutineContext()Lq83/j;

    move-result-object v0

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

    new-instance v1, Lj43/a;

    const/16 v2, 0x18

    invoke-direct {v1, p0, v2}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Lbc3/k1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    return-void
.end method

.method public getCoroutineContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Ly53/c;->w:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq83/j;

    return-object v0
.end method
