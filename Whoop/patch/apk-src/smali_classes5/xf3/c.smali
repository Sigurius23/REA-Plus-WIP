.class public final Lxf3/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lvf3/a;

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:Lnf3/a;

.field public final e:Ljava/util/ArrayList;

.field public f:Ljava/lang/Object;

.field public final g:Ljava/util/ArrayList;

.field public final h:Lm83/m;

.field public i:Z


# direct methods
.method public constructor <init>(Lvf3/a;Ljava/lang/String;ZLnf3/a;)V
    .locals 1

    const-string v0, "scopeQualifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxf3/c;->a:Lvf3/a;

    iput-object p2, p0, Lxf3/c;->b:Ljava/lang/String;

    iput-boolean p3, p0, Lxf3/c;->c:Z

    iput-object p4, p0, Lxf3/c;->d:Lnf3/a;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lxf3/c;->e:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lxf3/c;->g:Ljava/util/ArrayList;

    new-instance p1, Lm83/m;

    invoke-direct {p1}, Lm83/m;-><init>()V

    iput-object p1, p0, Lxf3/c;->h:Lm83/m;

    return-void
.end method


# virtual methods
.method public final a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;
    .locals 6

    const-string v0, "clazz"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxf3/c;->d:Lnf3/a;

    iget-object v1, v0, Lnf3/a;->c:Lq83/g;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lq83/g;->D(I)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x27

    const-string v2, ""

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, " with qualifier \'"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    iget-object v3, v0, Lnf3/a;->c:Lq83/g;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "+- \'"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Lag3/a;->a(Lj93/d;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lq83/g;->r(Ljava/lang/String;)V

    new-instance v1, Lxf3/a;

    invoke-direct {v1, p0, p3, p2, p1}, Lxf3/a;-><init>(Lxf3/c;Lvf3/a;Lj93/d;Lc93/a;)V

    invoke-static {v1}, Lv63/b;->g(Lxf3/a;)Ll83/k;

    move-result-object p1

    iget-object p3, p1, Ll83/k;->w:Ljava/lang/Object;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    iget-object p1, v0, Lnf3/a;->c:Lq83/g;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "|- \'"

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Lag3/a;->a(Lj93/d;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\' in "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p2, " ms"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lq83/g;->r(Ljava/lang/String;)V

    return-object p3

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lxf3/c;->d(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lj93/d;)Ljava/util/ArrayList;
    .locals 6

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La3/p;

    const/4 v1, 0x0

    iget-object v2, p0, Lxf3/c;->d:Lnf3/a;

    invoke-direct {v0, v2, p0, v1}, La3/p;-><init>(Lnf3/a;Lxf3/c;Luf3/a;)V

    iget-object v1, v2, Lnf3/a;->b:Ls/m2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v1, Ls/m2;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lrf3/b;

    iget-object v4, v4, Lrf3/b;->a:Lqf3/b;

    iget-object v4, v4, Lqf3/b;->a:Lvf3/a;

    iget-object v5, v0, La3/p;->y:Ljava/lang/Object;

    check-cast v5, Lxf3/c;

    iget-object v5, v5, Lxf3/c;->a:Lvf3/a;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lrf3/b;

    iget-object v5, v4, Lrf3/b;->a:Lqf3/b;

    iget-object v5, v5, Lqf3/b;->b:Lj93/d;

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    iget-object v4, v4, Lrf3/b;->a:Lqf3/b;

    iget-object v4, v4, Lqf3/b;->f:Ljava/lang/Object;

    invoke-interface {v4, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    :cond_3
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lrf3/b;

    invoke-virtual {v3, v0}, Lrf3/b;->b(La3/p;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lxf3/c;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lxf3/c;

    invoke-virtual {v3, p1}, Lxf3/c;->b(Lj93/d;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-static {v0, v3}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_3

    :cond_6
    invoke-static {v2, v0}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;
    .locals 3

    const-string v0, " on scope "

    iget-object v1, p0, Lxf3/c;->d:Lnf3/a;

    const-string v2, "clazz"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0, p1, p2, p3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Lorg/koin/core/error/ClosedScopeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/koin/core/error/NoBeanDefFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    iget-object p1, v1, Lnf3/a;->c:Lq83/g;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v1, "|- No instance found for "

    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Lag3/a;->a(Lj93/d;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lq83/g;->r(Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    iget-object p1, v1, Lnf3/a;->c:Lq83/g;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v1, "|- Scope closed - no instance found for "

    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Lag3/a;->a(Lj93/d;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lq83/g;->r(Ljava/lang/String;)V

    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final d(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;
    .locals 11

    iget-boolean v0, p0, Lxf3/c;->i:Z

    const-string v1, "msg"

    if-nez v0, :cond_e

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object v2, v0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Luf3/a;

    :goto_0
    iget-object v3, p0, Lxf3/c;->h:Lm83/m;

    iget-object v4, p0, Lxf3/c;->d:Lnf3/a;

    if-eqz v2, :cond_1

    iget-object v5, v4, Lnf3/a;->c:Lq83/g;

    new-instance v6, La3/l0;

    const/16 v7, 0x15

    invoke-direct {v6, v2, v7}, La3/l0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v5, v6}, Lq83/g;->J(Lc93/a;)V

    invoke-virtual {v3, v2}, Lm83/m;->addFirst(Ljava/lang/Object;)V

    :cond_1
    new-instance v5, La3/p;

    invoke-direct {v5, v4, p0, v2}, La3/p;-><init>(Lnf3/a;Lxf3/c;Luf3/a;)V

    iget-object v6, v4, Lnf3/a;->b:Ls/m2;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v7, "clazz"

    invoke-static {p2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "scopeQualifier"

    iget-object v8, p0, Lxf3/c;->a:Lvf3/a;

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v7

    iget-object v6, v6, Ls/m2;->x:Ljava/lang/Object;

    check-cast v6, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v6, v7}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lrf3/b;

    if-nez v6, :cond_2

    move-object v5, v0

    goto :goto_1

    :cond_2
    invoke-virtual {v6, v5}, Lrf3/b;->b(La3/p;)Ljava/lang/Object;

    move-result-object v5

    :goto_1
    const/4 v6, 0x4

    const-string v7, "lvl"

    const/4 v8, 0x1

    if-nez v5, :cond_b

    iget-object v5, v4, Lnf3/a;->c:Lq83/g;

    new-instance v9, Lxf3/b;

    const/4 v10, 0x0

    invoke-direct {v9, p2, p3, v10}, Lxf3/b;-><init>(Lj93/d;Lvf3/a;I)V

    invoke-virtual {v5, v9}, Lq83/g;->J(Lc93/a;)V

    invoke-virtual {v3}, Lm83/m;->g()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Luf3/a;

    if-nez v5, :cond_3

    move-object v5, v0

    goto :goto_2

    :cond_3
    invoke-virtual {v5, p2}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object v5

    :goto_2
    if-nez v5, :cond_b

    iget-object v5, v4, Lnf3/a;->c:Lq83/g;

    new-instance v9, Lxf3/b;

    const/4 v10, 0x1

    invoke-direct {v9, p2, p3, v10}, Lxf3/b;-><init>(Lj93/d;Lvf3/a;I)V

    invoke-virtual {v5, v9}, Lq83/g;->J(Lc93/a;)V

    iget-object v5, p0, Lxf3/c;->f:Ljava/lang/Object;

    if-nez v5, :cond_5

    :cond_4
    move-object v5, v0

    goto :goto_3

    :cond_5
    invoke-interface {p2, v5}, Lj93/d;->isInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    iget-object v5, p0, Lxf3/c;->f:Ljava/lang/Object;

    :goto_3
    if-nez v5, :cond_b

    iget-object v5, v4, Lnf3/a;->c:Lq83/g;

    new-instance v9, Lxf3/b;

    const/4 v10, 0x2

    invoke-direct {v9, p2, p3, v10}, Lxf3/b;-><init>(Lj93/d;Lvf3/a;I)V

    invoke-virtual {v5, v9}, Lq83/g;->J(Lc93/a;)V

    iget-object v5, p0, Lxf3/c;->e:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxf3/c;

    invoke-virtual {v0, p1, p2, p3}, Lxf3/c;->c(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_6

    :cond_7
    move-object v5, v0

    if-nez v5, :cond_b

    invoke-virtual {v3}, Lm83/m;->clear()V

    iget-object p1, v4, Lnf3/a;->c:Lq83/g;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v7}, Lih0/d0;->w(ILjava/lang/String;)V

    invoke-virtual {p1, v8}, Lq83/g;->D(I)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {v6, v8}, Le4/p;->b(II)I

    move-result v0

    if-gtz v0, :cond_8

    const-string v0, "| clear parameter stack"

    invoke-virtual {p1, v8, v0}, Lq83/g;->I(ILjava/lang/String;)V

    :cond_8
    const/16 p1, 0x27

    const-string v0, ""

    if-eqz p3, :cond_a

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, " & qualifier:\'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_9

    goto :goto_4

    :cond_9
    move-object v0, p3

    :cond_a
    :goto_4
    new-instance p3, Lorg/koin/core/error/NoBeanDefFoundException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "|- No definition found for class:\'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Lag3/a;->a(Lj93/d;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". Check your definitions!"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p3, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p3

    :cond_b
    if-eqz v2, :cond_d

    iget-object p1, v4, Lnf3/a;->c:Lq83/g;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v7}, Lih0/d0;->w(ILjava/lang/String;)V

    invoke-virtual {p1, v8}, Lq83/g;->D(I)Z

    move-result p2

    if-eqz p2, :cond_c

    invoke-static {v6, v8}, Le4/p;->b(II)I

    move-result p2

    if-gtz p2, :cond_c

    const-string p2, "| remove parameters from stack"

    invoke-virtual {p1, v8, p2}, Lq83/g;->I(ILjava/lang/String;)V

    :cond_c
    invoke-virtual {v3}, Lm83/m;->q()Ljava/lang/Object;

    :cond_d
    return-object v5

    :cond_e
    new-instance p1, Lorg/koin/core/error/ClosedScopeException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Scope \'"

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, p0, Lxf3/c;->b:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "\' is closed"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lxf3/c;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lxf3/c;

    iget-object v0, p0, Lxf3/c;->a:Lvf3/a;

    iget-object v1, p1, Lxf3/c;->a:Lvf3/a;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lxf3/c;->b:Ljava/lang/String;

    iget-object v1, p1, Lxf3/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-boolean v0, p0, Lxf3/c;->c:Z

    iget-boolean v1, p1, Lxf3/c;->c:Z

    if-eq v0, v1, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lxf3/c;->d:Lnf3/a;

    iget-object p1, p1, Lxf3/c;->d:Lnf3/a;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_5
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lxf3/c;->a:Lvf3/a;

    check-cast v0, Lvf3/c;

    iget-object v0, v0, Lvf3/c;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lxf3/c;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lxf3/c;->c:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    :cond_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lxf3/c;->d:Lnf3/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lxf3/c;->b:Ljava/lang/String;

    const-string v2, "\']"

    invoke-static {v1, v2, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
