.class public abstract Lh83/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll73/b;
.implements Ln73/b;


# instance fields
.field final w:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Leg3/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lh83/a;->w:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lh83/a;->w:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leg3/b;

    const-wide v1, 0x7fffffffffffffffL

    invoke-interface {v0, v1, v2}, Leg3/b;->request(J)V

    return-void
.end method

.method public final b(Leg3/b;)V
    .locals 3

    iget-object v0, p0, Lh83/a;->w:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "next is null"

    invoke-static {p1, v2}, Lr73/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    const/4 v2, 0x0

    invoke-virtual {v0, v2, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lh83/a;->a()V

    return-void

    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Leg3/b;->cancel()V

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, La83/c;->w:La83/c;

    if-eq p1, v0, :cond_2

    invoke-static {v1}, Lj93/l0;->X(Ljava/lang/Class;)V

    :cond_2
    return-void
.end method

.method public final dispose()V
    .locals 1

    iget-object v0, p0, Lh83/a;->w:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, La83/c;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    return-void
.end method

.method public final isDisposed()Z
    .locals 2

    iget-object v0, p0, Lh83/a;->w:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, La83/c;->w:La83/c;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
