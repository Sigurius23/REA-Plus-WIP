.class public abstract Lbc3/z;
.super Lq83/a;
.source "SourceFile"

# interfaces
.implements Lq83/f;


# static fields
.field public static final Key:Lbc3/y;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lbc3/y;

    new-instance v1, La11/g;

    const/16 v2, 0xc

    invoke-direct {v1, v2}, La11/g;-><init>(I)V

    sget-object v2, Lq83/e;->w:Lq83/e;

    invoke-direct {v0, v2, v1}, Lq83/b;-><init>(Lq83/i;Lkotlin/jvm/functions/Function1;)V

    sput-object v0, Lbc3/z;->Key:Lbc3/y;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lq83/e;->w:Lq83/e;

    invoke-direct {p0, v0}, Lq83/a;-><init>(Lq83/i;)V

    return-void
.end method

.method public static synthetic limitedParallelism$default(Lbc3/z;ILjava/lang/String;ILjava/lang/Object;)Lbc3/z;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lbc3/z;->limitedParallelism(ILjava/lang/String;)Lbc3/z;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: limitedParallelism"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract dispatch(Lq83/j;Ljava/lang/Runnable;)V
.end method

.method public dispatchYield(Lq83/j;Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lhc3/b;->h(Lbc3/z;Lq83/j;Ljava/lang/Runnable;)V

    return-void
.end method

.method public get(Lq83/i;)Lq83/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lq83/h;",
            ">(",
            "Lq83/i;",
            ")TE;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, p1, Lq83/b;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lq83/b;

    invoke-interface {p0}, Lq83/h;->getKey()Lq83/i;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eq v1, p1, :cond_1

    iget-object v0, p1, Lq83/b;->x:Lq83/i;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return-object v2

    :cond_1
    :goto_0
    iget-object p1, p1, Lq83/b;->w:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq83/h;

    if-eqz p1, :cond_3

    return-object p1

    :cond_2
    sget-object v0, Lq83/e;->w:Lq83/e;

    if-ne v0, p1, :cond_3

    return-object p0

    :cond_3
    return-object v2
.end method

.method public final interceptContinuation(Lq83/d;)Lq83/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lq83/d<",
            "-TT;>;)",
            "Lq83/d<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lhc3/f;

    invoke-direct {v0, p0, p1}, Lhc3/f;-><init>(Lbc3/z;Lq83/d;)V

    return-object v0
.end method

.method public isDispatchNeeded(Lq83/j;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public synthetic limitedParallelism(I)Lbc3/z;
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, p1, v0}, Lbc3/z;->limitedParallelism(ILjava/lang/String;)Lbc3/z;

    move-result-object p1

    return-object p1
.end method

.method public limitedParallelism(ILjava/lang/String;)Lbc3/z;
    .locals 1

    .line 1
    invoke-static {p1}, Lhc3/b;->a(I)V

    .line 2
    new-instance v0, Lhc3/g;

    invoke-direct {v0, p0, p1, p2}, Lhc3/g;-><init>(Lbc3/z;ILjava/lang/String;)V

    return-object v0
.end method

.method public minusKey(Lq83/i;)Lq83/j;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/i;",
            ")",
            "Lq83/j;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, p1, Lq83/b;

    if-eqz v1, :cond_2

    check-cast p1, Lq83/b;

    invoke-interface {p0}, Lq83/h;->getKey()Lq83/i;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eq v1, p1, :cond_1

    iget-object v0, p1, Lq83/b;->x:Lq83/i;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    iget-object p1, p1, Lq83/b;->w:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq83/h;

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_2
    sget-object v0, Lq83/e;->w:Lq83/e;

    if-ne v0, p1, :cond_3

    :goto_1
    sget-object p1, Lq83/k;->w:Lq83/k;

    return-object p1

    :cond_3
    return-object p0
.end method

.method public final plus(Lbc3/z;)Lbc3/z;
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-object p1
.end method

.method public final releaseInterceptedContinuation(Lq83/d;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lhc3/f;

    sget-object v0, Lhc3/f;->H:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lhc3/b;->c:Lhc3/x;

    if-eq v1, v2, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lbc3/m;

    if-eqz v0, :cond_1

    check-cast p1, Lbc3/m;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lbc3/m;->o()V

    :cond_2
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lbc3/f0;->r(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
