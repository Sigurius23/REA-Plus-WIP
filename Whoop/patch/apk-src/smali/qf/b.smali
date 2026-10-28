.class public final Lqf/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final synthetic P:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final synthetic Q:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final synthetic R:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final synthetic S:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;


# instance fields
.field public volatile synthetic E:J

.field public volatile synthetic F:J

.field public final G:Lqg/c;

.field public final H:Lqg/c;

.field public final I:Lqg/d;

.field public final J:Lqg/d;

.field public final K:Lqg/d;

.field public final L:Lqg/d;

.field public final M:Lqg/d;

.field public final N:Lqg/d;

.field public final O:Lqg/c;

.field public volatile synthetic w:J

.field public volatile synthetic x:J

.field public volatile synthetic y:J

.field public volatile synthetic z:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "w"

    const-class v1, Lqf/b;

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "x"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, Lqf/b;->P:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "y"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, Lqf/b;->Q:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "z"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "E"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, Lqf/b;->R:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "F"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, Lqf/b;->S:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lmg/h;)V
    .locals 2

    const-string v0, "provider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Lmg/h;->a()Lqg/g;

    move-result-object p1

    check-cast p1, Lqg/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lqf/b;->w:J

    iput-wide v0, p0, Lqf/b;->x:J

    iput-wide v0, p0, Lqf/b;->y:J

    iput-wide v0, p0, Lqf/b;->z:J

    iput-wide v0, p0, Lqf/b;->E:J

    iput-wide v0, p0, Lqf/b;->F:J

    sget-object p1, Lqg/d;->a:Lqg/c;

    iput-object p1, p0, Lqf/b;->G:Lqg/c;

    iput-object p1, p0, Lqf/b;->H:Lqg/c;

    sget-object v0, Lqg/b;->a:Lqg/d;

    iput-object v0, p0, Lqf/b;->I:Lqg/d;

    new-instance v1, Landroidx/room/u;

    iput-object v0, p0, Lqf/b;->J:Lqg/d;

    iput-object v0, p0, Lqf/b;->K:Lqg/d;

    new-instance v1, Landroidx/room/u;

    iput-object v0, p0, Lqf/b;->L:Lqg/d;

    sget-object v0, Lqg/h;->a:Lqg/d;

    iput-object v0, p0, Lqf/b;->M:Lqg/d;

    iput-object v0, p0, Lqf/b;->N:Lqg/d;

    iput-object p1, p0, Lqf/b;->O:Lqg/c;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 5

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    iget-object v1, p0, Lqf/b;->I:Lqg/d;

    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-static {v1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v1

    :goto_0
    new-instance v2, Ll83/n;

    invoke-direct {v2, v1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lqf/b;->J:Lqg/d;

    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v1, v0

    goto :goto_1

    :catchall_1
    move-exception v1

    invoke-static {v1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v1

    :goto_1
    new-instance v3, Ll83/n;

    invoke-direct {v3, v1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lqf/b;->L:Lqg/d;

    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object v1, v0

    goto :goto_2

    :catchall_2
    move-exception v1

    invoke-static {v1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v1

    :goto_2
    new-instance v4, Ll83/n;

    invoke-direct {v4, v1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lqf/b;->K:Lqg/d;

    :try_start_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_3
    new-instance v1, Ll83/n;

    invoke-direct {v1, v0}, Ll83/n;-><init>(Ljava/lang/Object;)V

    filled-new-array {v2, v3, v4, v1}, [Ll83/n;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll83/n;

    iget-object v2, v2, Ll83/n;->w:Ljava/lang/Object;

    invoke-static {v2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_1
    invoke-static {v1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    if-eqz v0, :cond_3

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Throwable;

    invoke-virtual {v0, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_5

    :cond_2
    throw v0

    :cond_3
    return-void
.end method
