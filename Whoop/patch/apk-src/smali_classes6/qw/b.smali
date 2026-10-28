.class public final Lqw/b;
.super Low/z;
.source "SourceFile"


# instance fields
.field public volatile a:Low/z;

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Low/m;

.field public final synthetic e:Lvw/a;

.field public final synthetic f:Lqw/c;


# direct methods
.method public constructor <init>(Lqw/c;ZZLow/m;Lvw/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqw/b;->f:Lqw/c;

    iput-boolean p2, p0, Lqw/b;->b:Z

    iput-boolean p3, p0, Lqw/b;->c:Z

    iput-object p4, p0, Lqw/b;->d:Low/m;

    iput-object p5, p0, Lqw/b;->e:Lvw/a;

    return-void
.end method


# virtual methods
.method public final b(Lww/a;)Ljava/lang/Object;
    .locals 10

    iget-boolean v0, p0, Lqw/b;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lww/a;->skipValue()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lqw/b;->a:Low/z;

    if-nez v0, :cond_b

    iget-object v0, p0, Lqw/b;->d:Low/m;

    iget-object v1, p0, Lqw/b;->f:Lqw/c;

    iget-object v2, p0, Lqw/b;->e:Lvw/a;

    iget-object v3, v0, Low/m;->d:Lrw/q;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v3, Lrw/q;->y:Ljava/lang/Object;

    check-cast v4, Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v5, Lrw/q;->z:Lrw/a;

    const/4 v6, 0x1

    if-ne v1, v5, :cond_1

    goto :goto_0

    :cond_1
    iget-object v5, v2, Lvw/a;->a:Ljava/lang/Class;

    invoke-virtual {v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Low/a0;

    if-eqz v7, :cond_2

    if-ne v7, v1, :cond_6

    goto :goto_0

    :cond_2
    const-class v7, Lpw/a;

    invoke-virtual {v5, v7}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v7

    check-cast v7, Lpw/a;

    if-nez v7, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {v7}, Lpw/a;->value()Ljava/lang/Class;

    move-result-object v7

    const-class v8, Low/a0;

    invoke-virtual {v8, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-nez v8, :cond_4

    goto :goto_1

    :cond_4
    iget-object v8, v3, Lrw/q;->x:Ljava/lang/Object;

    check-cast v8, Lf1/p1;

    new-instance v9, Lvw/a;

    invoke-direct {v9, v7}, Lvw/a;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {v8, v9, v6}, Lf1/p1;->j(Lvw/a;Z)Lqw/o;

    move-result-object v7

    invoke-interface {v7}, Lqw/o;->construct()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Low/a0;

    invoke-virtual {v4, v5, v7}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Low/a0;

    if-eqz v4, :cond_5

    move-object v7, v4

    :cond_5
    if-ne v7, v1, :cond_6

    :goto_0
    move-object v1, v3

    :cond_6
    :goto_1
    iget-object v3, v0, Low/m;->e:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :cond_7
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Low/a0;

    if-nez v4, :cond_8

    if-ne v5, v1, :cond_7

    move v4, v6

    goto :goto_2

    :cond_8
    invoke-interface {v5, v0, v2}, Low/a0;->a(Low/m;Lvw/a;)Low/z;

    move-result-object v5

    if-eqz v5, :cond_7

    move-object v0, v5

    goto :goto_3

    :cond_9
    if-nez v4, :cond_a

    invoke-virtual {v0, v2}, Low/m;->c(Lvw/a;)Low/z;

    move-result-object v0

    :goto_3
    iput-object v0, p0, Lqw/b;->a:Low/z;

    goto :goto_4

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "GSON cannot serialize or deserialize "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    :goto_4
    invoke-virtual {v0, p1}, Low/z;->b(Lww/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lww/b;Ljava/lang/Object;)V
    .locals 10

    iget-boolean v0, p0, Lqw/b;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lww/b;->m()Lww/b;

    return-void

    :cond_0
    iget-object v0, p0, Lqw/b;->a:Low/z;

    if-nez v0, :cond_b

    iget-object v0, p0, Lqw/b;->d:Low/m;

    iget-object v1, p0, Lqw/b;->f:Lqw/c;

    iget-object v2, p0, Lqw/b;->e:Lvw/a;

    iget-object v3, v0, Low/m;->d:Lrw/q;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v3, Lrw/q;->y:Ljava/lang/Object;

    check-cast v4, Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v5, Lrw/q;->z:Lrw/a;

    const/4 v6, 0x1

    if-ne v1, v5, :cond_1

    goto :goto_0

    :cond_1
    iget-object v5, v2, Lvw/a;->a:Ljava/lang/Class;

    invoke-virtual {v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Low/a0;

    if-eqz v7, :cond_2

    if-ne v7, v1, :cond_6

    goto :goto_0

    :cond_2
    const-class v7, Lpw/a;

    invoke-virtual {v5, v7}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v7

    check-cast v7, Lpw/a;

    if-nez v7, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {v7}, Lpw/a;->value()Ljava/lang/Class;

    move-result-object v7

    const-class v8, Low/a0;

    invoke-virtual {v8, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-nez v8, :cond_4

    goto :goto_1

    :cond_4
    iget-object v8, v3, Lrw/q;->x:Ljava/lang/Object;

    check-cast v8, Lf1/p1;

    new-instance v9, Lvw/a;

    invoke-direct {v9, v7}, Lvw/a;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {v8, v9, v6}, Lf1/p1;->j(Lvw/a;Z)Lqw/o;

    move-result-object v7

    invoke-interface {v7}, Lqw/o;->construct()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Low/a0;

    invoke-virtual {v4, v5, v7}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Low/a0;

    if-eqz v4, :cond_5

    move-object v7, v4

    :cond_5
    if-ne v7, v1, :cond_6

    :goto_0
    move-object v1, v3

    :cond_6
    :goto_1
    iget-object v3, v0, Low/m;->e:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :cond_7
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Low/a0;

    if-nez v4, :cond_8

    if-ne v5, v1, :cond_7

    move v4, v6

    goto :goto_2

    :cond_8
    invoke-interface {v5, v0, v2}, Low/a0;->a(Low/m;Lvw/a;)Low/z;

    move-result-object v5

    if-eqz v5, :cond_7

    move-object v0, v5

    goto :goto_3

    :cond_9
    if-nez v4, :cond_a

    invoke-virtual {v0, v2}, Low/m;->c(Lvw/a;)Low/z;

    move-result-object v0

    :goto_3
    iput-object v0, p0, Lqw/b;->a:Low/z;

    goto :goto_4

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "GSON cannot serialize or deserialize "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    :goto_4
    invoke-virtual {v0, p1, p2}, Low/z;->c(Lww/b;Ljava/lang/Object;)V

    return-void
.end method
