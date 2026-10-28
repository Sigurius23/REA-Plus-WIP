.class public final Lfc3/t;
.super Ls83/c;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public E:Lq83/d;

.field public final w:Lec3/m;

.field public final x:Lq83/j;

.field public final y:I

.field public z:Lq83/j;


# direct methods
.method public constructor <init>(Lec3/m;Lq83/j;)V
    .locals 2

    sget-object v0, Lfc3/r;->w:Lfc3/r;

    sget-object v1, Lq83/k;->w:Lq83/k;

    invoke-direct {p0, v1, v0}, Ls83/c;-><init>(Lq83/j;Lq83/d;)V

    iput-object p1, p0, Lfc3/t;->w:Lec3/m;

    iput-object p2, p0, Lfc3/t;->x:Lq83/j;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance v0, Lf91/b;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lf91/b;-><init>(I)V

    invoke-interface {p2, p1, v0}, Lq83/j;->fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, p0, Lfc3/t;->y:I

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 1

    :try_start_0
    invoke-virtual {p0, p2, p1}, Lfc3/t;->f(Lq83/d;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_0
    move-exception p1

    new-instance v0, Lfc3/p;

    invoke-interface {p2}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Lfc3/p;-><init>(Lq83/j;Ljava/lang/Throwable;)V

    iput-object v0, p0, Lfc3/t;->z:Lq83/j;

    throw p1
.end method

.method public final f(Lq83/d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-interface {p1}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->o(Lq83/j;)V

    iget-object v1, p0, Lfc3/t;->z:Lq83/j;

    if-eq v1, v0, :cond_2

    instance-of v2, v1, Lfc3/p;

    if-nez v2, :cond_1

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lc41/l3;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, Lc41/l3;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1, v2}, Lq83/j;->fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget v2, p0, Lfc3/t;->y:I

    if-ne v1, v2, :cond_0

    iput-object v0, p0, Lfc3/t;->z:Lq83/j;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Flow invariant is violated:\n\t\tFlow was collected in "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lfc3/t;->x:Lq83/j;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",\n\t\tbut emission happened in "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ".\n\t\tPlease refer to \'flow\' documentation or use \'flowOn\' instead"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    check-cast v1, Lfc3/p;

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "\n            Flow exception transparency is violated:\n                Previous \'emit\' call has thrown exception "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Lfc3/p;->x:Ljava/lang/Throwable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", but then emission attempt of value \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\' has been detected.\n                Emissions from \'catch\' blocks are prohibited in order to avoid unspecified behaviour, \'Flow.catch\' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lyb3/s;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    iput-object p1, p0, Lfc3/t;->E:Lq83/d;

    sget-object p1, Lfc3/v;->a:Lkotlin/jvm/functions/Function3;

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>"

    iget-object v1, p0, Lfc3/t;->w:Lec3/m;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v1, p2, p0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    const/4 p2, 0x0

    iput-object p2, p0, Lfc3/t;->E:Lq83/d;

    :cond_3
    return-object p1
.end method

.method public final getCallerFrame()Ls83/d;
    .locals 2

    iget-object v0, p0, Lfc3/t;->E:Lq83/d;

    instance-of v1, v0, Ls83/d;

    if-eqz v1, :cond_0

    check-cast v0, Ls83/d;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Lfc3/t;->z:Lq83/j;

    if-nez v0, :cond_0

    sget-object v0, Lq83/k;->w:Lq83/k;

    :cond_0
    return-object v0
.end method

.method public final getStackTraceElement()Ljava/lang/StackTraceElement;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lfc3/p;

    invoke-virtual {p0}, Lfc3/t;->getContext()Lq83/j;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lfc3/p;-><init>(Lq83/j;Ljava/lang/Throwable;)V

    iput-object v1, p0, Lfc3/t;->z:Lq83/j;

    :cond_0
    iget-object v0, p0, Lfc3/t;->E:Lq83/d;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    :cond_1
    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1
.end method
