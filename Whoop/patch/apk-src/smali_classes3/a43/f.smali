.class public final La43/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field public E:Ljava/lang/Object;

.field public final F:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final w:Lc53/a;

.field public final x:Landroidx/lifecycle/x;

.field public final y:Ll83/p;

.field public z:Z


# direct methods
.method public constructor <init>(Lc53/a;Landroidx/lifecycle/x;)V
    .locals 1

    const-string v0, "lifecycle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La43/f;->w:Lc53/a;

    iput-object p2, p0, La43/f;->x:Landroidx/lifecycle/x;

    const-string p1, "Video:LifecycleObserver"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, La43/f;->y:Ll83/p;

    sget-object p1, Lm83/a0;->w:Lm83/a0;

    iput-object p1, p0, La43/f;->E:Ljava/lang/Object;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, La43/f;->F:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method public final a(La43/b;Ls83/c;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, La43/f;->E:Ljava/lang/Object;

    invoke-static {p1, v0}, Ldt/b;->y(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object p1

    iput-object p1, p0, La43/f;->E:Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    const/4 v0, 0x0

    iget-object v1, p0, La43/f;->F:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lt33/a;->a:Lbc3/w1;

    new-instance v0, La43/d;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, La43/d;-><init>(La43/f;Lq83/d;I)V

    invoke-static {p1, v0, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final b(La43/b;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, La43/e;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, La43/e;

    iget v1, v0, La43/e;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, La43/e;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, La43/e;

    invoke-direct {v0, p0, p2}, La43/e;-><init>(La43/f;Ls83/c;)V

    :goto_0
    iget-object p2, v0, La43/e;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La43/e;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, La43/e;->x:La43/b;

    iget-object v0, v0, La43/e;->w:La43/f;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, La43/f;->F:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {p2, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p2

    if-eqz p2, :cond_3

    iput-boolean v2, p0, La43/f;->z:Z

    sget-object p2, Lt33/a;->a:Lbc3/w1;

    new-instance v2, La43/d;

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-direct {v2, p0, v4, v5}, La43/d;-><init>(La43/f;Lq83/d;I)V

    iput-object p0, v0, La43/e;->w:La43/f;

    iput-object p1, v0, La43/e;->x:La43/b;

    iput v3, v0, La43/e;->E:I

    invoke-static {p2, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    iget-object p2, v0, La43/f;->E:Ljava/lang/Object;

    invoke-static {p1, p2}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object p1

    iput-object p1, v0, La43/f;->E:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onResume(Landroidx/lifecycle/g0;)V
    .locals 7

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La43/f;->y:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-boolean v1, p0, La43/f;->z:Z

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[onResume] owner: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", recurringResumeEvent: "

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v2, v3, p1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-boolean p1, p0, La43/f;->z:Z

    if-eqz p1, :cond_1

    new-instance p1, Le;

    const/4 v0, 0x6

    invoke-direct {p1, p0, v4, v0}, Le;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v0, 0x3

    iget-object v1, p0, La43/f;->w:Lc53/a;

    invoke-static {v1, v4, v4, p1, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_1
    const/4 p1, 0x1

    iput-boolean p1, p0, La43/f;->z:Z

    return-void
.end method

.method public final onStop(Landroidx/lifecycle/g0;)V
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La1/h;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2, v1}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    iget-object v1, p0, La43/f;->w:Lc53/a;

    invoke-static {v1, v2, v2, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
