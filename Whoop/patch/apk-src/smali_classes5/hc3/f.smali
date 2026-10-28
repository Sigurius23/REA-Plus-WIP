.class public final Lhc3/f;
.super Lbc3/o0;
.source "SourceFile"

# interfaces
.implements Ls83/d;
.implements Lq83/d;


# static fields
.field public static final synthetic H:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field public final E:Lq83/d;

.field public F:Ljava/lang/Object;

.field public final G:Ljava/lang/Object;

.field private volatile synthetic _reusableCancellableContinuation$volatile:Ljava/lang/Object;

.field public final z:Lbc3/z;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "_reusableCancellableContinuation$volatile"

    const-class v2, Lhc3/f;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lhc3/f;->H:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lbc3/z;Lq83/d;)V
    .locals 1

    const/4 v0, -0x1

    invoke-direct {p0, v0}, Lbc3/o0;-><init>(I)V

    iput-object p1, p0, Lhc3/f;->z:Lbc3/z;

    iput-object p2, p0, Lhc3/f;->E:Lq83/d;

    sget-object p1, Lhc3/b;->b:Lhc3/x;

    iput-object p1, p0, Lhc3/f;->F:Ljava/lang/Object;

    invoke-interface {p2}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lhc3/b;->l(Lq83/j;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lhc3/f;->G:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final d()Lq83/d;
    .locals 0

    return-object p0
.end method

.method public final getCallerFrame()Ls83/d;
    .locals 2

    iget-object v0, p0, Lhc3/f;->E:Lq83/d;

    instance-of v1, v0, Ls83/d;

    if-eqz v1, :cond_0

    check-cast v0, Ls83/d;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Lhc3/f;->E:Lq83/d;

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    return-object v0
.end method

.method public final j()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lhc3/f;->F:Ljava/lang/Object;

    sget-object v1, Lhc3/b;->b:Lhc3/x;

    iput-object v1, p0, Lhc3/f;->F:Ljava/lang/Object;

    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 8

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v2, p1

    goto :goto_0

    :cond_0
    new-instance v2, Lbc3/w;

    invoke-direct {v2, v0, v1}, Lbc3/w;-><init>(Ljava/lang/Throwable;Z)V

    :goto_0
    iget-object v0, p0, Lhc3/f;->E:Lq83/d;

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v3

    iget-object v4, p0, Lhc3/f;->z:Lbc3/z;

    invoke-static {v4, v3}, Lhc3/b;->i(Lbc3/z;Lq83/j;)Z

    move-result v3

    if-eqz v3, :cond_1

    iput-object v2, p0, Lhc3/f;->F:Ljava/lang/Object;

    iput v1, p0, Lbc3/o0;->y:I

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    invoke-static {v4, p1, p0}, Lhc3/b;->h(Lbc3/z;Lq83/j;Ljava/lang/Runnable;)V

    return-void

    :cond_1
    invoke-static {}, Lbc3/g2;->a()Lbc3/a1;

    move-result-object v3

    iget-wide v4, v3, Lbc3/a1;->w:J

    const-wide v6, 0x100000000L

    cmp-long v4, v4, v6

    if-ltz v4, :cond_2

    iput-object v2, p0, Lhc3/f;->F:Ljava/lang/Object;

    iput v1, p0, Lbc3/o0;->y:I

    invoke-virtual {v3, p0}, Lbc3/a1;->T(Lbc3/o0;)V

    return-void

    :cond_2
    const/4 v1, 0x1

    invoke-virtual {v3, v1}, Lbc3/a1;->b0(Z)V

    :try_start_0
    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    iget-object v4, p0, Lhc3/f;->G:Ljava/lang/Object;

    invoke-static {v2, v4}, Lhc3/b;->m(Lq83/j;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v0, p1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {v2, v4}, Lhc3/b;->f(Lq83/j;Ljava/lang/Object;)V

    :cond_3
    invoke-virtual {v3}, Lbc3/a1;->p0()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez p1, :cond_3

    :goto_1
    invoke-virtual {v3, v1}, Lbc3/a1;->s(Z)V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_2

    :catchall_1
    move-exception p1

    :try_start_3
    invoke-static {v2, v4}, Lhc3/b;->f(Lq83/j;Ljava/lang/Object;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_2
    :try_start_4
    invoke-virtual {p0, p1}, Lbc3/o0;->i(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_1

    :goto_3
    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v3, v1}, Lbc3/a1;->s(Z)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DispatchedContinuation["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lhc3/f;->z:Lbc3/z;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhc3/f;->E:Lq83/d;

    invoke-static {v1}, Lbc3/f0;->H(Lq83/d;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
