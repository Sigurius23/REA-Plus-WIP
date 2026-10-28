.class public final Lu10/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lk20/a;

.field public final b:Lr20/d;

.field public final c:Ln53/e;

.field public final d:Lec3/w1;

.field public final e:Lec3/q1;


# direct methods
.method public constructor <init>(Lbc3/c0;Lu10/p;Lk20/a;)V
    .locals 3

    new-instance v0, Lr20/d;

    new-instance v1, Lu0/r;

    const/16 v2, 0xc

    invoke-direct {v1, v2}, Lu0/r;-><init>(I)V

    const/4 v2, 0x0

    invoke-direct {v0, p1, p2, v2, v1}, Lr20/d;-><init>(Lbc3/c0;Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lu10/q;->a:Lk20/a;

    iput-object v0, p0, Lu10/q;->b:Lr20/d;

    iget-object p1, v0, Lr20/d;->g:Ln53/e;

    iput-object p1, p0, Lu10/q;->c:Ln53/e;

    const/4 p2, 0x0

    const/4 v0, 0x6

    const/4 v1, 0x1

    invoke-static {v1, v2, p2, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Lu10/q;->d:Lec3/w1;

    invoke-static {p2}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object p2

    iput-object p2, p0, Lu10/q;->e:Lec3/q1;

    iget-object p1, p1, Ln53/e;->y:Ll83/e;

    check-cast p1, Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu10/p;

    instance-of p2, p1, Lu10/n;

    if-eqz p2, :cond_0

    new-instance p1, Lk20/i;

    iget-object p2, p3, Lk20/a;->a:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    const/4 v0, 0x4

    invoke-direct {p1, p2, v0}, Lk20/i;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;I)V

    invoke-static {p3, p1}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    return-void

    :cond_0
    instance-of p1, p1, Lu10/o;

    if-eqz p1, :cond_1

    new-instance p1, Lk20/k;

    const/4 p2, 0x4

    invoke-direct {p1, p2}, Lk20/k;-><init>(I)V

    invoke-static {p3, p1}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final a(Lu10/j;)V
    .locals 6

    instance-of v0, p1, Lu10/k;

    const/4 v1, 0x0

    iget-object v2, p0, Lu10/q;->a:Lk20/a;

    iget-object v3, p0, Lu10/q;->d:Lec3/w1;

    iget-object v4, p0, Lu10/q;->c:Ln53/e;

    iget-object v5, p0, Lu10/q;->b:Lr20/d;

    if-eqz v0, :cond_3

    iget-object p1, v4, Ln53/e;->y:Ll83/e;

    check-cast p1, Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu10/p;

    instance-of v0, p1, Lu10/n;

    if-nez v0, :cond_1

    instance-of p1, p1, Lu10/o;

    if-eqz p1, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lk20/k;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Lk20/k;-><init>(I)V

    invoke-static {v2, p1}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {v5}, Lr20/d;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v5}, Lr20/d;->b()V

    return-void

    :cond_2
    invoke-virtual {v3, v1}, Lec3/w1;->a(Ljava/lang/Object;)Z

    return-void

    :cond_3
    instance-of v0, p1, Lu10/l;

    if-eqz v0, :cond_6

    iget-object v0, v4, Ln53/e;->y:Ll83/e;

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu10/p;

    instance-of v1, v0, Lu10/n;

    if-nez v1, :cond_5

    instance-of v0, v0, Lu10/o;

    if-eqz v0, :cond_4

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lk20/k;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lk20/k;-><init>(I)V

    invoke-static {v2, v0}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    goto :goto_1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    :goto_1
    check-cast p1, Lu10/l;

    iget-boolean p1, p1, Lu10/l;->b:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v3, p1}, Lec3/w1;->a(Ljava/lang/Object;)Z

    return-void

    :cond_6
    instance-of v0, p1, Lu10/m;

    if-eqz v0, :cond_8

    check-cast p1, Lu10/m;

    iget-object p1, p1, Lu10/m;->b:Lu10/o;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lqt2/e;

    const/4 v3, 0x7

    invoke-direct {v0, v3, v5, p1}, Lqt2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, v5, Lr20/d;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x1

    invoke-virtual {p1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result p1

    if-nez p1, :cond_7

    iget-object p1, v5, Lr20/d;->a:Lbc3/c0;

    new-instance v3, Lr20/c;

    invoke-direct {v3, v0, v5, v1}, Lr20/c;-><init>(Lc93/a;Lr20/d;Lq83/d;)V

    const/4 v0, 0x3

    invoke-static {p1, v1, v1, v3, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lk20/k;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Lk20/k;-><init>(I)V

    invoke-static {v2, p1}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    return-void

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
