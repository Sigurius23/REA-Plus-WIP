.class public final Leh3/e;
.super Lxg3/k;
.source "SourceFile"

# interfaces
.implements Leh3/q;


# static fields
.field public static final b:J

.field public static final c:Ljava/util/concurrent/TimeUnit;

.field public static final d:Leh3/d;

.field public static final e:Leh3/b;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    sput-object v0, Leh3/e;->c:Ljava/util/concurrent/TimeUnit;

    new-instance v0, Leh3/d;

    sget-object v1, Lgh3/i;->x:Lgh3/h;

    invoke-direct {v0, v1}, Leh3/d;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    sput-object v0, Leh3/e;->d:Leh3/d;

    invoke-virtual {v0}, Leh3/k;->b()V

    new-instance v0, Leh3/b;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-direct {v0, v1, v2, v3, v1}, Leh3/b;-><init>(Lgh3/i;JLjava/util/concurrent/TimeUnit;)V

    sput-object v0, Leh3/e;->e:Leh3/b;

    invoke-virtual {v0}, Leh3/b;->a()V

    const-string v0, "rx.io-scheduler.keepalive"

    const/16 v1, 0x3c

    invoke-static {v0, v1}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    sput-wide v0, Leh3/e;->b:J

    return-void
.end method

.method public constructor <init>(Lgh3/i;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Leh3/e;->e:Leh3/b;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Leh3/e;->a:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v2, Leh3/b;

    sget-wide v3, Leh3/e;->b:J

    sget-object v5, Leh3/e;->c:Ljava/util/concurrent/TimeUnit;

    invoke-direct {v2, p1, v3, v4, v5}, Leh3/b;-><init>(Lgh3/i;JLjava/util/concurrent/TimeUnit;)V

    :cond_0
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-eq p1, v1, :cond_0

    invoke-virtual {v2}, Leh3/b;->a()V

    return-void
.end method


# virtual methods
.method public final a()Lxg3/j;
    .locals 2

    new-instance v0, Leh3/c;

    iget-object v1, p0, Leh3/e;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leh3/b;

    invoke-direct {v0, v1}, Leh3/c;-><init>(Leh3/b;)V

    return-object v0
.end method

.method public final shutdown()V
    .locals 3

    :cond_0
    iget-object v0, p0, Leh3/e;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leh3/b;

    sget-object v2, Leh3/e;->e:Leh3/b;

    if-ne v1, v2, :cond_1

    return-void

    :cond_1
    invoke-static {v0, v1, v2}, Ld13/a;->u(Ljava/util/concurrent/atomic/AtomicReference;Leh3/b;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Leh3/b;->a()V

    return-void
.end method
