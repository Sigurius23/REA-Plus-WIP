.class public Lbc3/l1;
.super Lbc3/t1;
.source "SourceFile"

# interfaces
.implements Lbc3/u;


# instance fields
.field public final y:Z


# direct methods
.method public constructor <init>(Lbc3/k1;)V
    .locals 5

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lbc3/t1;-><init>(Z)V

    invoke-virtual {p0, p1}, Lbc3/t1;->H(Lbc3/k1;)V

    sget-object p1, Lbc3/t1;->x:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbc3/p;

    instance-of v2, v1, Lbc3/q;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Lbc3/q;

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    const/4 v2, 0x0

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lbc3/m1;->h()Lbc3/t1;

    move-result-object v1

    :goto_1
    invoke-virtual {v1}, Lbc3/t1;->C()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_3

    :cond_1
    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbc3/p;

    instance-of v4, v1, Lbc3/q;

    if-eqz v4, :cond_2

    check-cast v1, Lbc3/q;

    goto :goto_2

    :cond_2
    move-object v1, v3

    :goto_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lbc3/m1;->h()Lbc3/t1;

    move-result-object v1

    goto :goto_1

    :cond_3
    move v0, v2

    :goto_3
    iput-boolean v0, p0, Lbc3/l1;->y:Z

    return-void
.end method


# virtual methods
.method public final C()Z
    .locals 1

    iget-boolean v0, p0, Lbc3/l1;->y:Z

    return v0
.end method

.method public final D()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final complete()Z
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p0, v0}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final completeExceptionally(Ljava/lang/Throwable;)Z
    .locals 2

    new-instance v0, Lbc3/w;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lbc3/w;-><init>(Ljava/lang/Throwable;Z)V

    invoke-virtual {p0, v0}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
