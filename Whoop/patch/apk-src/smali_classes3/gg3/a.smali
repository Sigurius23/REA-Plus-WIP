.class public final Lgg3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfg3/b;
.implements Ljava/io/Serializable;


# instance fields
.field public w:Ljava/lang/String;

.field public x:Lhg3/e;

.field public y:Ljava/util/Queue;


# virtual methods
.method public final a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final varargs c(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1, p2}, Lgg3/a;->w(ILjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final debug(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1, v1}, Lgg3/a;->x(ILjava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    return-void
.end method

.method public final e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final error(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1, v1}, Lgg3/a;->x(ILjava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    return-void
.end method

.method public final varargs f(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p1, p2}, Lgg3/a;->w(ILjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lgg3/a;->w:Ljava/lang/String;

    return-object v0
.end method

.method public final varargs h(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1, p2}, Lgg3/a;->w(ILjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final i(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, Lgg3/a;->x(ILjava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    return-void
.end method

.method public final info(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1, v1}, Lgg3/a;->x(ILjava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    return-void
.end method

.method public final j(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, Lgg3/a;->x(ILjava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    return-void
.end method

.method public final k(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, Lgg3/a;->x(ILjava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    return-void
.end method

.method public final varargs l(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x5

    invoke-virtual {p0, v0, p1, p2}, Lgg3/a;->w(ILjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final n(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, Lgg3/a;->x(ILjava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    return-void
.end method

.method public final o(Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Object;)V
    .locals 2

    instance-of v0, p3, Ljava/lang/Throwable;

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    check-cast p3, Ljava/lang/Throwable;

    invoke-virtual {p0, v1, p1, p3, p2}, Lgg3/a;->x(ILjava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    return-void

    :cond_0
    filled-new-array {p2, p3}, [Ljava/lang/Object;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p0, v1, p1, p3, p2}, Lgg3/a;->x(ILjava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    return-void
.end method

.method public final p()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final q(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;)V
    .locals 2

    instance-of v0, p3, Ljava/lang/Throwable;

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    check-cast p3, Ljava/lang/Throwable;

    invoke-virtual {p0, v1, p1, p3, p2}, Lgg3/a;->x(ILjava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    return-void

    :cond_0
    filled-new-array {p2, p3}, [Ljava/lang/Object;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p0, v1, p1, p3, p2}, Lgg3/a;->x(ILjava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    return-void
.end method

.method public final r(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, Lgg3/a;->x(ILjava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    return-void
.end method

.method public final s(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1, v1}, Lgg3/a;->x(ILjava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    return-void
.end method

.method public final varargs u(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x3

    invoke-virtual {p0, v0, p1, p2}, Lgg3/a;->w(ILjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final v(Ljava/lang/String;Ljava/lang/Number;)V
    .locals 2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-virtual {p0, v1, p1, v0, p2}, Lgg3/a;->x(ILjava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    return-void
.end method

.method public final w(ILjava/lang/String;[Ljava/lang/Object;)V
    .locals 4

    array-length v0, p3

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    array-length v0, p3

    add-int/lit8 v0, v0, -0x1

    aget-object v0, p3, v0

    instance-of v2, v0, Ljava/lang/Throwable;

    if-eqz v2, :cond_1

    check-cast v0, Ljava/lang/Throwable;

    goto :goto_1

    :cond_1
    :goto_0
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_4

    array-length v1, p3

    if-eqz v1, :cond_3

    array-length v1, p3

    add-int/lit8 v1, v1, -0x1

    new-array v2, v1, [Ljava/lang/Object;

    if-lez v1, :cond_2

    const/4 v3, 0x0

    invoke-static {p3, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    invoke-virtual {p0, p1, p2, v0, v2}, Lgg3/a;->x(ILjava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "non-sensical empty or null argument array"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-virtual {p0, p1, p2, v1, p3}, Lgg3/a;->x(ILjava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    return-void
.end method

.method public final warn(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1, v1}, Lgg3/a;->x(ILjava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    return-void
.end method

.method public final x(ILjava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
    .locals 0

    new-instance p2, Lgg3/d;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    iput p1, p2, Lgg3/d;->w:I

    iget-object p1, p0, Lgg3/a;->x:Lhg3/e;

    iput-object p1, p2, Lgg3/d;->x:Lhg3/e;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    iput-object p4, p2, Lgg3/d;->y:[Ljava/lang/Object;

    iget-object p1, p0, Lgg3/a;->y:Ljava/util/Queue;

    invoke-interface {p1, p2}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-void
.end method
