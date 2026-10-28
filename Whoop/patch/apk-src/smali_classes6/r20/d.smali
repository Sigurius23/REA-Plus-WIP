.class public final Lr20/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lbc3/c0;

.field public final b:Ljava/lang/Object;

.field public final c:Z

.field public final d:Lkotlin/jvm/functions/Function1;

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final f:Lec3/h2;

.field public final g:Ln53/e;

.field public final h:Ln53/e;


# direct methods
.method public constructor <init>(Lbc3/c0;Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr20/d;->a:Lbc3/c0;

    iput-object p2, p0, Lr20/d;->b:Ljava/lang/Object;

    iput-boolean p3, p0, Lr20/d;->c:Z

    iput-object p4, p0, Lr20/d;->d:Lkotlin/jvm/functions/Function1;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p3, 0x0

    invoke-direct {p1, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lr20/d;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {p2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lr20/d;->f:Lec3/h2;

    new-instance p2, Lqt2/w;

    const/16 p3, 0xd

    invoke-direct {p2, p3}, Lqt2/w;-><init>(I)V

    invoke-static {p1, p2}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p2

    iput-object p2, p0, Lr20/d;->g:Ln53/e;

    new-instance p2, Lqt2/w;

    const/16 p3, 0xe

    invoke-direct {p2, p3}, Lqt2/w;-><init>(I)V

    invoke-static {p1, p2}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lr20/d;->h:Ln53/e;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    iget-object v0, p0, Lr20/d;->f:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lr20/d;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lr20/d;->c()V

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 5

    :cond_0
    iget-object v0, p0, Lr20/d;->f:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/util/List;

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/io/Closeable;

    if-eqz v4, :cond_1

    move-object v4, v3

    check-cast v4, Ljava/io/Closeable;

    invoke-interface {v4}, Ljava/io/Closeable;->close()V

    :cond_1
    iget-object v4, p0, Lr20/d;->d:Lkotlin/jvm/functions/Function1;

    invoke-interface {v4, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public final d(Ljava/util/List;)V
    .locals 3

    const-string v0, "screens"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lr20/d;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lr20/d;->f:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    instance-of v2, v1, Ljava/io/Closeable;

    if-eqz v2, :cond_0

    check-cast v1, Ljava/io/Closeable;

    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final e(Lr20/s;)V
    .locals 1

    iget-object v0, p0, Lr20/d;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lr20/d;->f(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 4

    :cond_0
    iget-object v0, p0, Lr20/d;->f:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/util/List;

    iget-boolean v3, p0, Lr20/d;->c:Z

    if-eqz v3, :cond_1

    check-cast v2, Ljava/lang/Iterable;

    iget-object v3, p0, Lr20/d;->b:Ljava/lang/Object;

    invoke-static {v2, v3}, Lm83/s;->b1(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {p1, v2}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    goto :goto_0

    :cond_1
    check-cast v2, Ljava/util/Collection;

    invoke-static {p1, v2}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    :goto_0
    invoke-virtual {v0, v1, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method
