.class public final Lpg3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpg3/e;


# instance fields
.field public final w:Ljava/util/concurrent/Executor;

.field public final x:Lpg3/e;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lpg3/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpg3/q;->w:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lpg3/q;->x:Lpg3/e;

    return-void
.end method


# virtual methods
.method public final F0()Z
    .locals 1

    iget-object v0, p0, Lpg3/q;->x:Lpg3/e;

    invoke-interface {v0}, Lpg3/e;->F0()Z

    move-result v0

    return v0
.end method

.method public final R0(Lpg3/h;)V
    .locals 2

    new-instance v0, Lpg3/p;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, p1}, Lpg3/p;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lpg3/q;->x:Lpg3/e;

    invoke-interface {p1, v0}, Lpg3/e;->R0(Lpg3/h;)V

    return-void
.end method

.method public final cancel()V
    .locals 1

    iget-object v0, p0, Lpg3/q;->x:Lpg3/e;

    invoke-interface {v0}, Lpg3/e;->cancel()V

    return-void
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lpg3/q;->clone()Lpg3/e;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Lpg3/e;
    .locals 3

    .line 2
    new-instance v0, Lpg3/q;

    iget-object v1, p0, Lpg3/q;->x:Lpg3/e;

    invoke-interface {v1}, Lpg3/e;->clone()Lpg3/e;

    move-result-object v1

    iget-object v2, p0, Lpg3/q;->w:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v2, v1}, Lpg3/q;-><init>(Ljava/util/concurrent/Executor;Lpg3/e;)V

    return-object v0
.end method

.method public final m()Lud3/o0;
    .locals 1

    iget-object v0, p0, Lpg3/q;->x:Lpg3/e;

    invoke-interface {v0}, Lpg3/e;->m()Lud3/o0;

    move-result-object v0

    return-object v0
.end method
