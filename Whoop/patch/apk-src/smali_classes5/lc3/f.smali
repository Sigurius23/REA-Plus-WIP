.class public final Llc3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc3/j;
.implements Llc3/g;
.implements Lbc3/o2;


# static fields
.field public static final synthetic F:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field public E:Ljava/lang/Object;

.field private volatile synthetic state$volatile:Ljava/lang/Object;

.field public final w:Lq83/j;

.field public x:Ljava/util/ArrayList;

.field public y:Ljava/lang/Object;

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "state$volatile"

    const-class v2, Llc3/f;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Llc3/f;->F:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lq83/j;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llc3/f;->w:Lq83/j;

    sget-object p1, Llc3/i;->a:Lhc3/x;

    iput-object p1, p0, Llc3/f;->state$volatile:Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x2

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Llc3/f;->x:Ljava/util/ArrayList;

    const/4 p1, -0x1

    iput p1, p0, Llc3/f;->z:I

    sget-object p1, Llc3/i;->d:Lhc3/x;

    iput-object p1, p0, Llc3/f;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    :goto_0
    sget-object p1, Llc3/f;->F:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Llc3/i;->b:Lhc3/x;

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    sget-object v1, Llc3/i;->c:Lhc3/x;

    invoke-virtual {p1, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object p1, p0, Llc3/f;->x:Ljava/util/ArrayList;

    if-nez p1, :cond_1

    :goto_1
    return-void

    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llc3/d;

    invoke-virtual {v0}, Llc3/d;->a()V

    goto :goto_2

    :cond_2
    sget-object p1, Llc3/i;->d:Lhc3/x;

    iput-object p1, p0, Llc3/f;->E:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Llc3/f;->x:Ljava/util/ArrayList;

    return-void

    :cond_3
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eq v1, v0, :cond_0

    goto :goto_0
.end method

.method public final b(Lhc3/v;I)V
    .locals 0

    iput-object p1, p0, Llc3/f;->y:Ljava/lang/Object;

    iput p2, p0, Llc3/f;->z:I

    return-void
.end method

.method public final c(Ls83/c;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Llc3/f;->F:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Llc3/d;

    iget-object v2, p0, Llc3/f;->E:Ljava/lang/Object;

    iget-object v3, p0, Llc3/f;->x:Ljava/util/ArrayList;

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Llc3/d;

    if-eq v4, v1, :cond_1

    invoke-virtual {v4}, Llc3/d;->a()V

    goto :goto_0

    :cond_2
    sget-object v3, Llc3/i;->b:Lhc3/x;

    invoke-virtual {v0, p0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Llc3/i;->d:Lhc3/x;

    iput-object v0, p0, Llc3/f;->E:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Llc3/f;->x:Ljava/util/ArrayList;

    :goto_1
    iget-object v0, v1, Llc3/d;->c:Lkotlin/jvm/functions/Function3;

    iget-object v3, v1, Llc3/d;->a:Ljava/lang/Object;

    iget-object v4, v1, Llc3/d;->d:Ljava/lang/Object;

    invoke-interface {v0, v3, v4, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, v1, Llc3/d;->e:Ls83/i;

    iget-object v1, v1, Llc3/d;->d:Ljava/lang/Object;

    sget-object v3, Llc3/i;->e:Lhc3/x;

    if-ne v1, v3, :cond_3

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :cond_3
    check-cast v2, Lc93/m;

    invoke-interface {v2, v0, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public final d(Ls83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p1, Llc3/e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Llc3/e;

    iget v1, v0, Llc3/e;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llc3/e;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Llc3/e;

    invoke-direct {v0, p0, p1}, Llc3/e;-><init>(Llc3/f;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Llc3/e;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llc3/e;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Llc3/e;->w:Llc3/f;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Llc3/e;->w:Llc3/f;

    iput v5, v0, Llc3/e;->z:I

    new-instance p1, Lbc3/m;

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v2

    invoke-direct {p1, v5, v2}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {p1}, Lbc3/m;->s()V

    :cond_4
    :goto_1
    sget-object v2, Llc3/f;->F:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    sget-object v8, Llc3/i;->a:Lhc3/x;

    if-ne v6, v8, :cond_7

    :cond_5
    invoke-virtual {v2, p0, v6, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-virtual {p1, p0}, Lbc3/m;->v(Lbc3/a2;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-eq v8, v6, :cond_5

    goto :goto_1

    :cond_7
    instance-of v9, v6, Ljava/util/List;

    if-eqz v9, :cond_a

    :cond_8
    invoke-virtual {v2, p0, v6, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v6}, Llc3/f;->e(Ljava/lang/Object;)Llc3/d;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v3, v6, Llc3/d;->g:Ljava/lang/Object;

    const/4 v7, -0x1

    iput v7, v6, Llc3/d;->h:I

    invoke-virtual {p0, v6, v5}, Llc3/f;->f(Llc3/d;Z)V

    goto :goto_2

    :cond_9
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-eq v7, v6, :cond_8

    goto :goto_1

    :cond_a
    instance-of v2, v6, Llc3/d;

    if-eqz v2, :cond_f

    check-cast v6, Llc3/d;

    iget-object v2, p0, Llc3/f;->E:Ljava/lang/Object;

    iget-object v5, v6, Llc3/d;->f:Lkotlin/jvm/functions/Function3;

    if-eqz v5, :cond_b

    iget-object v6, v6, Llc3/d;->d:Ljava/lang/Object;

    invoke-interface {v5, p0, v6, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/jvm/functions/Function3;

    goto :goto_3

    :cond_b
    move-object v2, v3

    :goto_3
    invoke-virtual {p1, v7, v2}, Lbc3/m;->g(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V

    :goto_4
    invoke-virtual {p1}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    sget-object v2, Lr83/a;->w:Lr83/a;

    if-ne p1, v2, :cond_c

    move-object v7, p1

    :cond_c
    if-ne v7, v1, :cond_d

    goto :goto_6

    :cond_d
    move-object v2, p0

    :goto_5
    iput-object v3, v0, Llc3/e;->w:Llc3/f;

    iput v4, v0, Llc3/e;->z:I

    invoke-virtual {v2, v0}, Llc3/f;->c(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_e

    :goto_6
    return-object v1

    :cond_e
    return-object p1

    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "unexpected state: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e(Ljava/lang/Object;)Llc3/d;
    .locals 4

    iget-object v0, p0, Llc3/f;->x:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Llc3/d;

    iget-object v3, v3, Llc3/d;->a:Ljava/lang/Object;

    if-ne v3, p1, :cond_1

    move-object v1, v2

    :cond_2
    check-cast v1, Llc3/d;

    if-eqz v1, :cond_3

    return-object v1

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Clause with object "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not found"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final f(Llc3/d;Z)V
    .locals 4

    iget-object v0, p1, Llc3/d;->a:Ljava/lang/Object;

    sget-object v1, Llc3/f;->F:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Llc3/d;

    if-eqz v2, :cond_0

    return-void

    :cond_0
    if-nez p2, :cond_3

    iget-object v2, p0, Llc3/f;->x:Ljava/util/ArrayList;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llc3/d;

    iget-object v3, v3, Llc3/d;->a:Ljava/lang/Object;

    if-eq v3, v0, :cond_2

    goto :goto_0

    :cond_2
    const-string p1, "Cannot use select clauses on the same object: "

    invoke-static {v0, p1}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    :goto_1
    iget-object v2, p1, Llc3/d;->b:Lkotlin/jvm/functions/Function3;

    iget-object v3, p1, Llc3/d;->d:Ljava/lang/Object;

    invoke-interface {v2, v0, p0, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llc3/f;->E:Ljava/lang/Object;

    sget-object v2, Llc3/i;->d:Lhc3/x;

    if-ne v0, v2, :cond_5

    if-nez p2, :cond_4

    iget-object p2, p0, Llc3/f;->x:Ljava/util/ArrayList;

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {p2, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_4
    iget-object p2, p0, Llc3/f;->y:Ljava/lang/Object;

    iput-object p2, p1, Llc3/d;->g:Ljava/lang/Object;

    iget p2, p0, Llc3/f;->z:I

    iput p2, p1, Llc3/d;->h:I

    const/4 p1, 0x0

    iput-object p1, p0, Llc3/f;->y:Ljava/lang/Object;

    const/4 p1, -0x1

    iput p1, p0, Llc3/f;->z:I

    return-void

    :cond_5
    invoke-virtual {v1, p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final g(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    :goto_0
    sget-object v0, Llc3/f;->F:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lbc3/k;

    const/4 v3, 0x2

    if-eqz v2, :cond_5

    invoke-virtual {p0, p1}, Llc3/f;->e(Ljava/lang/Object;)Llc3/d;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v4, v2, Llc3/d;->f:Lkotlin/jvm/functions/Function3;

    if-eqz v4, :cond_1

    iget-object v5, v2, Llc3/d;->d:Ljava/lang/Object;

    invoke-interface {v4, p0, v5, p2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/jvm/functions/Function3;

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :cond_2
    :goto_1
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    check-cast v1, Lbc3/k;

    iput-object p2, p0, Llc3/f;->E:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v1, p1, v4}, Lbc3/k;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lhc3/x;

    move-result-object p1

    if-nez p1, :cond_3

    sget-object p1, Llc3/i;->d:Lhc3/x;

    iput-object p1, p0, Llc3/f;->E:Ljava/lang/Object;

    return v3

    :cond_3
    invoke-interface {v1, p1}, Lbc3/k;->n(Ljava/lang/Object;)V

    const/4 p1, 0x0

    return p1

    :cond_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eq v5, v1, :cond_2

    goto :goto_0

    :cond_5
    sget-object v2, Llc3/i;->b:Lhc3/x;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    instance-of v2, v1, Llc3/d;

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    sget-object v2, Llc3/i;->c:Lhc3/x;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    return v3

    :cond_7
    sget-object v2, Llc3/i;->a:Lhc3/x;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    :cond_8
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    goto :goto_2

    :cond_9
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v1, :cond_8

    goto :goto_0

    :cond_a
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_d

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-static {p1, v2}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    :cond_b
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    :goto_2
    const/4 p1, 0x1

    return p1

    :cond_c
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v1, :cond_b

    goto/16 :goto_0

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Unexpected state: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    :goto_3
    const/4 p1, 0x3

    return p1
.end method
