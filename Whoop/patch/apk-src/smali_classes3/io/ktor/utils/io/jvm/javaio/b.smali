.class public abstract Lio/ktor/utils/io/jvm/javaio/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field public final a:Lbc3/k1;

.field public final b:Lio/ktor/utils/io/jvm/javaio/a;

.field public final c:Lbc3/s0;

.field public d:I

.field public e:I

.field volatile synthetic result:I

.field volatile synthetic state:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "state"

    const-class v2, Lio/ktor/utils/io/jvm/javaio/b;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lio/ktor/utils/io/jvm/javaio/b;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lbc3/k1;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/ktor/utils/io/jvm/javaio/b;->a:Lbc3/k1;

    new-instance v0, Lio/ktor/utils/io/jvm/javaio/a;

    invoke-direct {v0, p0}, Lio/ktor/utils/io/jvm/javaio/a;-><init>(Lio/ktor/utils/io/jvm/javaio/b;)V

    iput-object v0, p0, Lio/ktor/utils/io/jvm/javaio/b;->b:Lio/ktor/utils/io/jvm/javaio/a;

    iput-object p0, p0, Lio/ktor/utils/io/jvm/javaio/b;->state:Ljava/lang/Object;

    const/4 v1, 0x0

    iput v1, p0, Lio/ktor/utils/io/jvm/javaio/b;->result:I

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    new-instance v2, La0/a1;

    const/16 v3, 0x1b

    invoke-direct {v2, p0, v3}, La0/a1;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p1, v2}, Lbc3/k1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    iput-object p1, p0, Lio/ktor/utils/io/jvm/javaio/b;->c:Lbc3/s0;

    new-instance p1, La6/e;

    const/4 v2, 0x6

    invoke-direct {p1, p0, v1, v2}, La6/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v1, 0x1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/ktor/utils/io/jvm/javaio/b;->state:Ljava/lang/Object;

    if-eq p1, p0, :cond_1

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public abstract a(Ls83/c;)Ljava/lang/Object;
.end method

.method public final b([BII)I
    .locals 5

    sget-object v0, Lio/ktor/utils/io/jvm/javaio/e;->b:Lio/ktor/utils/io/jvm/javaio/e;

    iput p2, p0, Lio/ktor/utils/io/jvm/javaio/b;->d:I

    iput p3, p0, Lio/ktor/utils/io/jvm/javaio/b;->e:I

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    const/4 p3, 0x0

    :goto_0
    iget-object v1, p0, Lio/ktor/utils/io/jvm/javaio/b;->state:Ljava/lang/Object;

    instance-of v2, v1, Lq83/d;

    if-eqz v2, :cond_0

    move-object p3, v1

    check-cast p3, Lq83/d;

    move-object v2, p2

    goto :goto_1

    :cond_0
    instance-of v2, v1, Ll83/a0;

    if-eqz v2, :cond_1

    iget p1, p0, Lio/ktor/utils/io/jvm/javaio/b;->result:I

    return p1

    :cond_1
    instance-of v2, v1, Ljava/lang/Throwable;

    if-nez v2, :cond_e

    instance-of v2, v1, Ljava/lang/Thread;

    if-nez v2, :cond_d

    invoke-static {v1, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    new-instance v2, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v2}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    :goto_1
    const-string v3, "when (value) {\n         \u2026Exception()\n            }"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lio/ktor/utils/io/jvm/javaio/b;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_2
    invoke-virtual {v3, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-static {p3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {p3, p1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    const-string p1, "thread"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/ktor/utils/io/jvm/javaio/b;->state:Ljava/lang/Object;

    if-eq p1, p2, :cond_3

    goto :goto_4

    :cond_3
    sget-object p1, Lio/ktor/utils/io/jvm/javaio/j;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/ktor/utils/io/jvm/javaio/i;

    if-nez p1, :cond_4

    move-object p1, v0

    :cond_4
    sget-object p3, Lio/ktor/utils/io/jvm/javaio/e;->c:Lio/ktor/utils/io/jvm/javaio/e;

    if-eq p1, p3, :cond_5

    goto :goto_2

    :cond_5
    sget-object p1, Lio/ktor/utils/io/jvm/javaio/d;->a:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lfg3/b;

    const-string p3, "Blocking network thread detected. \nIt can possible lead to a performance decline or even a deadlock.\nPlease make sure you\'re using blocking IO primitives like InputStream and OutputStream only in \nthe context of Dispatchers.IO:\n```\nwithContext(Dispatchers.IO) {\n    myInputStream.read()\n}\n```"

    invoke-interface {p1, p3}, Lfg3/b;->warn(Ljava/lang/String;)V

    :cond_6
    :goto_2
    sget-object p1, Lbc3/g2;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbc3/a1;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lbc3/a1;->o0()J

    move-result-wide v1

    goto :goto_3

    :cond_7
    const-wide v1, 0x7fffffffffffffffL

    :goto_3
    iget-object p1, p0, Lio/ktor/utils/io/jvm/javaio/b;->state:Ljava/lang/Object;

    if-ne p1, p2, :cond_9

    const-wide/16 v3, 0x0

    cmp-long p1, v1, v3

    if-lez p1, :cond_6

    sget-object p1, Lio/ktor/utils/io/jvm/javaio/j;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/ktor/utils/io/jvm/javaio/i;

    if-nez p1, :cond_8

    move-object p1, v0

    :cond_8
    invoke-interface {p1, v1, v2}, Lio/ktor/utils/io/jvm/javaio/i;->a(J)V

    goto :goto_2

    :cond_9
    :goto_4
    iget-object p1, p0, Lio/ktor/utils/io/jvm/javaio/b;->state:Ljava/lang/Object;

    instance-of p2, p1, Ljava/lang/Throwable;

    if-nez p2, :cond_a

    iget p1, p0, Lio/ktor/utils/io/jvm/javaio/b;->result:I

    return p1

    :cond_a
    check-cast p1, Ljava/lang/Throwable;

    throw p1

    :cond_b
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, v1, :cond_2

    goto/16 :goto_0

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Not yet started"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "There is already thread owning adapter"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    check-cast v1, Ljava/lang/Throwable;

    throw v1
.end method
