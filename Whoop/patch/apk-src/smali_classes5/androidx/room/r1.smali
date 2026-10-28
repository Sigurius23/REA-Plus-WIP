.class public abstract Landroidx/room/r1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final database:Landroidx/room/z0;

.field private final lock:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final stmt$delegate:Ll83/h;


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    const-string v0, "database"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/r1;->database:Landroidx/room/z0;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Landroidx/room/r1;->lock:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, La1/j;

    const/4 v0, 0x6

    invoke-direct {p1, p0, v0}, La1/j;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Landroidx/room/r1;->stmt$delegate:Ll83/h;

    return-void
.end method


# virtual methods
.method public final a()Lub/h;
    .locals 2

    invoke-virtual {p0}, Landroidx/room/r1;->createQuery()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Landroidx/room/r1;->database:Landroidx/room/z0;

    invoke-virtual {v1, v0}, Landroidx/room/z0;->compileStatement(Ljava/lang/String;)Lub/h;

    move-result-object v0

    return-object v0
.end method

.method public acquire()Lub/h;
    .locals 3

    invoke-virtual {p0}, Landroidx/room/r1;->assertNotMainThread()V

    iget-object v0, p0, Landroidx/room/r1;->lock:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/room/r1;->stmt$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lub/h;

    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroidx/room/r1;->a()Lub/h;

    move-result-object v0

    return-object v0
.end method

.method public assertNotMainThread()V
    .locals 1

    iget-object v0, p0, Landroidx/room/r1;->database:Landroidx/room/z0;

    invoke-virtual {v0}, Landroidx/room/z0;->assertNotMainThread()V

    return-void
.end method

.method public abstract createQuery()Ljava/lang/String;
.end method

.method public release(Lub/h;)V
    .locals 1

    const-string v0, "statement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/room/r1;->stmt$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lub/h;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Landroidx/room/r1;->lock:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_0
    return-void
.end method
