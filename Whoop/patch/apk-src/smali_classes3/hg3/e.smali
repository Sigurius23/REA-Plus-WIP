.class public final Lhg3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfg3/b;


# instance fields
.field public E:Lgg3/a;

.field public final F:Ljava/util/Queue;

.field public final G:Z

.field public final w:Ljava/lang/String;

.field public volatile x:Lfg3/b;

.field public y:Ljava/lang/Boolean;

.field public z:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/concurrent/LinkedBlockingQueue;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhg3/e;->w:Ljava/lang/String;

    iput-object p2, p0, Lhg3/e;->F:Ljava/util/Queue;

    iput-boolean p3, p0, Lhg3/e;->G:Z

    return-void
.end method


# virtual methods
.method public final A(Lgg3/d;)V
    .locals 2

    invoke-virtual {p0}, Lhg3/e;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lhg3/e;->z:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lhg3/e;->x:Lfg3/b;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public final B(Lfg3/b;)V
    .locals 0

    iput-object p1, p0, Lhg3/e;->x:Lfg3/b;

    return-void
.end method

.method public final a()Z
    .locals 1

    invoke-virtual {p0}, Lhg3/e;->w()Lfg3/b;

    move-result-object v0

    invoke-interface {v0}, Lfg3/b;->a()Z

    move-result v0

    return v0
.end method

.method public final b()Z
    .locals 1

    invoke-virtual {p0}, Lhg3/e;->w()Lfg3/b;

    move-result-object v0

    invoke-interface {v0}, Lfg3/b;->b()Z

    move-result v0

    return v0
.end method

.method public final varargs c(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Lhg3/e;->w()Lfg3/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lfg3/b;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final d()Z
    .locals 1

    invoke-virtual {p0}, Lhg3/e;->w()Lfg3/b;

    move-result-object v0

    invoke-interface {v0}, Lfg3/b;->d()Z

    move-result v0

    return v0
.end method

.method public final debug(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lhg3/e;->w()Lfg3/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lfg3/b;->debug(Ljava/lang/String;)V

    return-void
.end method

.method public final e()Z
    .locals 1

    invoke-virtual {p0}, Lhg3/e;->w()Lfg3/b;

    move-result-object v0

    invoke-interface {v0}, Lfg3/b;->e()Z

    move-result v0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lhg3/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lhg3/e;

    iget-object v2, p0, Lhg3/e;->w:Ljava/lang/String;

    iget-object p1, p1, Lhg3/e;->w:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public final error(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lhg3/e;->w()Lfg3/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lfg3/b;->error(Ljava/lang/String;)V

    return-void
.end method

.method public final varargs f(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Lhg3/e;->w()Lfg3/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lfg3/b;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final g(I)Lig3/a;
    .locals 1

    invoke-virtual {p0}, Lhg3/e;->w()Lfg3/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lfg3/b;->g(I)Lig3/a;

    move-result-object p1

    return-object p1
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lhg3/e;->w:Ljava/lang/String;

    return-object v0
.end method

.method public final varargs h(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Lhg3/e;->w()Lfg3/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lfg3/b;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lhg3/e;->w:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0}, Lhg3/e;->w()Lfg3/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lfg3/b;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final info(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lhg3/e;->w()Lfg3/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lfg3/b;->info(Ljava/lang/String;)V

    return-void
.end method

.method public final j(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0}, Lhg3/e;->w()Lfg3/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lfg3/b;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final k(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0}, Lhg3/e;->w()Lfg3/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lfg3/b;->k(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final varargs l(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Lhg3/e;->w()Lfg3/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lfg3/b;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final m(I)Lig3/a;
    .locals 1

    invoke-virtual {p0}, Lhg3/e;->w()Lfg3/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lfg3/b;->m(I)Lig3/a;

    move-result-object p1

    return-object p1
.end method

.method public final n(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0}, Lhg3/e;->w()Lfg3/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lfg3/b;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final o(Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Lhg3/e;->w()Lfg3/b;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lfg3/b;->o(Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Object;)V

    return-void
.end method

.method public final p()Z
    .locals 1

    invoke-virtual {p0}, Lhg3/e;->w()Lfg3/b;

    move-result-object v0

    invoke-interface {v0}, Lfg3/b;->p()Z

    move-result v0

    return v0
.end method

.method public final q(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Lhg3/e;->w()Lfg3/b;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lfg3/b;->q(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;)V

    return-void
.end method

.method public final r(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0}, Lhg3/e;->w()Lfg3/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lfg3/b;->r(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final s(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lhg3/e;->w()Lfg3/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lfg3/b;->s(Ljava/lang/String;)V

    return-void
.end method

.method public final t(I)Z
    .locals 1

    invoke-virtual {p0}, Lhg3/e;->w()Lfg3/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lfg3/b;->t(I)Z

    move-result p1

    return p1
.end method

.method public final varargs u(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Lhg3/e;->w()Lfg3/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lfg3/b;->u(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final v(Ljava/lang/String;Ljava/lang/Number;)V
    .locals 1

    invoke-virtual {p0}, Lhg3/e;->w()Lfg3/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lfg3/b;->v(Ljava/lang/String;Ljava/lang/Number;)V

    return-void
.end method

.method public final w()Lfg3/b;
    .locals 3

    iget-object v0, p0, Lhg3/e;->x:Lfg3/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhg3/e;->x:Lfg3/b;

    return-object v0

    :cond_0
    iget-boolean v0, p0, Lhg3/e;->G:Z

    if-eqz v0, :cond_1

    sget-object v0, Lhg3/b;->w:Lhg3/b;

    return-object v0

    :cond_1
    iget-object v0, p0, Lhg3/e;->E:Lgg3/a;

    if-nez v0, :cond_2

    new-instance v0, Lgg3/a;

    iget-object v1, p0, Lhg3/e;->F:Ljava/util/Queue;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p0, v0, Lgg3/a;->x:Lhg3/e;

    iget-object v2, p0, Lhg3/e;->w:Ljava/lang/String;

    iput-object v2, v0, Lgg3/a;->w:Ljava/lang/String;

    iput-object v1, v0, Lgg3/a;->y:Ljava/util/Queue;

    iput-object v0, p0, Lhg3/e;->E:Lgg3/a;

    :cond_2
    iget-object v0, p0, Lhg3/e;->E:Lgg3/a;

    return-object v0
.end method

.method public final warn(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lhg3/e;->w()Lfg3/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lfg3/b;->warn(Ljava/lang/String;)V

    return-void
.end method

.method public final x()Z
    .locals 3

    iget-object v0, p0, Lhg3/e;->y:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lhg3/e;->x:Lfg3/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "log"

    const-class v2, Lgg3/c;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lhg3/e;->z:Ljava/lang/reflect/Method;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Lhg3/e;->y:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lhg3/e;->y:Ljava/lang/Boolean;

    :goto_0
    iget-object v0, p0, Lhg3/e;->y:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final y()Z
    .locals 1

    iget-object v0, p0, Lhg3/e;->x:Lfg3/b;

    instance-of v0, v0, Lhg3/b;

    return v0
.end method

.method public final z()Z
    .locals 1

    iget-object v0, p0, Lhg3/e;->x:Lfg3/b;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
