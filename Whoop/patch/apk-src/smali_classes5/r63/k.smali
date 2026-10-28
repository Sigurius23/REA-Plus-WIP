.class public final Lr63/k;
.super Lr63/e;
.source "SourceFile"


# instance fields
.field public final E:[Lq83/d;

.field public F:I

.field public G:I

.field public final x:Ljava/util/List;

.field public final y:Lr63/j;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;)V
    .locals 1

    const-string v0, "initial"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "blocks"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lr63/e;-><init>(Ljava/lang/Object;)V

    iput-object p3, p0, Lr63/k;->x:Ljava/util/List;

    new-instance p2, Lr63/j;

    invoke-direct {p2, p0}, Lr63/j;-><init>(Lr63/k;)V

    iput-object p2, p0, Lr63/k;->y:Lr63/j;

    iput-object p1, p0, Lr63/k;->z:Ljava/lang/Object;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lq83/d;

    iput-object p1, p0, Lr63/k;->E:[Lq83/d;

    const/4 p1, -0x1

    iput p1, p0, Lr63/k;->F:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lr63/k;->G:I

    iget-object v0, p0, Lr63/k;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lr63/k;->z:Ljava/lang/Object;

    iget p1, p0, Lr63/k;->F:I

    if-gez p1, :cond_1

    invoke-virtual {p0, p2}, Lr63/k;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Already started"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr63/k;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public final c(Lq83/d;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lr63/k;->G:I

    iget-object v1, p0, Lr63/k;->x:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lr63/k;->z:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v0

    iget v1, p0, Lr63/k;->F:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Lr63/k;->F:I

    iget-object v3, p0, Lr63/k;->E:[Lq83/d;

    aput-object v0, v3, v1

    invoke-virtual {p0, v2}, Lr63/k;->e(Z)Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Lr63/k;->F:I

    if-ltz v0, :cond_1

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lr63/k;->F:I

    const/4 v1, 0x0

    aput-object v1, v3, v0

    iget-object v0, p0, Lr63/k;->z:Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No more continuations to resume"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    :goto_0
    sget-object v1, Lr83/a;->w:Lr83/a;

    if-ne v0, v1, :cond_3

    const-string v1, "frame"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    return-object v0
.end method

.method public final d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lr63/k;->z:Ljava/lang/Object;

    invoke-virtual {p0, p2}, Lr63/k;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final e(Z)Z
    .locals 4

    :cond_0
    iget v0, p0, Lr63/k;->G:I

    iget-object v1, p0, Lr63/k;->x:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    if-ne v0, v2, :cond_2

    if-nez p1, :cond_1

    iget-object p1, p0, Lr63/k;->z:Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lr63/k;->f(Ljava/lang/Object;)V

    return v3

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Lr63/k;->G:I

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function3;

    :try_start_0
    iget-object v1, p0, Lr63/k;->z:Ljava/lang/Object;

    iget-object v2, p0, Lr63/k;->y:Lr63/j;

    invoke-interface {v0, p0, v1, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lr83/a;->w:Lr83/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v1, :cond_0

    return v3

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    invoke-virtual {p0, p1}, Lr63/k;->f(Ljava/lang/Object;)V

    return v3
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 4

    iget v0, p0, Lr63/k;->F:I

    if-ltz v0, :cond_4

    iget-object v1, p0, Lr63/k;->E:[Lq83/d;

    aget-object v0, v1, v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v2, p0, Lr63/k;->F:I

    add-int/lit8 v3, v2, -0x1

    iput v3, p0, Lr63/k;->F:I

    const/4 v3, 0x0

    aput-object v3, v1, v2

    instance-of v1, p1, Ll83/m;

    if-nez v1, :cond_0

    invoke-interface {v0, p1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p1, v1}, Lio/ktor/utils/io/x;->b(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object p1, v1

    :catchall_0
    :cond_3
    :goto_0
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    invoke-interface {v0, p1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No more continuations to resume"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getCoroutineContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Lr63/k;->y:Lr63/j;

    invoke-virtual {v0}, Lr63/j;->getContext()Lq83/j;

    move-result-object v0

    return-object v0
.end method
