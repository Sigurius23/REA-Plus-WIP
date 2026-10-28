.class public final Leh3/i;
.super Lxg3/k;
.source "SourceFile"

# interfaces
.implements Leh3/q;


# static fields
.field public static final b:I

.field public static final c:Leh3/h;

.field public static final d:Leh3/g;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "rx.scheduler.max-computation-threads"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v2

    if-lez v0, :cond_0

    if-le v0, v2, :cond_1

    :cond_0
    move v0, v2

    :cond_1
    sput v0, Leh3/i;->b:I

    new-instance v0, Leh3/h;

    sget-object v2, Lgh3/i;->x:Lgh3/h;

    invoke-direct {v0, v2}, Leh3/k;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    sput-object v0, Leh3/i;->c:Leh3/h;

    invoke-virtual {v0}, Leh3/k;->b()V

    new-instance v0, Leh3/g;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Leh3/g;-><init>(Lgh3/i;I)V

    sput-object v0, Leh3/i;->d:Leh3/g;

    return-void
.end method

.method public constructor <init>(Lgh3/i;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Leh3/i;->d:Leh3/g;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Leh3/i;->a:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v2, Leh3/g;

    sget v3, Leh3/i;->b:I

    invoke-direct {v2, p1, v3}, Leh3/g;-><init>(Lgh3/i;I)V

    :cond_0
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-eq p1, v1, :cond_0

    iget-object p1, v2, Leh3/g;->b:[Leh3/h;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v2, p1, v1

    invoke-virtual {v2}, Leh3/k;->b()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public final a()Lxg3/j;
    .locals 8

    new-instance v0, Leh3/f;

    iget-object v1, p0, Leh3/i;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leh3/g;

    iget v2, v1, Leh3/g;->a:I

    if-nez v2, :cond_0

    sget-object v1, Leh3/i;->c:Leh3/h;

    goto :goto_0

    :cond_0
    iget-object v3, v1, Leh3/g;->b:[Leh3/h;

    iget-wide v4, v1, Leh3/g;->c:J

    const-wide/16 v6, 0x1

    add-long/2addr v6, v4

    iput-wide v6, v1, Leh3/g;->c:J

    int-to-long v1, v2

    rem-long/2addr v4, v1

    long-to-int v1, v4

    aget-object v1, v3, v1

    :goto_0
    invoke-direct {v0, v1}, Leh3/f;-><init>(Leh3/h;)V

    return-object v0
.end method

.method public final shutdown()V
    .locals 4

    :cond_0
    iget-object v0, p0, Leh3/i;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leh3/g;

    sget-object v2, Leh3/i;->d:Leh3/g;

    if-ne v1, v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v0, v1, v2}, Ld13/a;->v(Ljava/util/concurrent/atomic/AtomicReference;Leh3/g;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v1, Leh3/g;->b:[Leh3/h;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    invoke-virtual {v3}, Leh3/k;->b()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method
