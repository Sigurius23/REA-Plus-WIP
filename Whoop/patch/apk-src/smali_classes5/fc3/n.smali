.class public final Lfc3/n;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ldc3/h;

.field public w:I

.field public final synthetic x:[Lec3/l;

.field public final synthetic y:I

.field public final synthetic z:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>([Lec3/l;ILjava/util/concurrent/atomic/AtomicInteger;Ldc3/h;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lfc3/n;->x:[Lec3/l;

    iput p2, p0, Lfc3/n;->y:I

    iput-object p3, p0, Lfc3/n;->z:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p4, p0, Lfc3/n;->E:Ldc3/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6

    new-instance v0, Lfc3/n;

    iget-object v3, p0, Lfc3/n;->z:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v4, p0, Lfc3/n;->E:Ldc3/h;

    iget-object v1, p0, Lfc3/n;->x:[Lec3/l;

    iget v2, p0, Lfc3/n;->y:I

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lfc3/n;-><init>([Lec3/l;ILjava/util/concurrent/atomic/AtomicInteger;Ldc3/h;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lfc3/n;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfc3/n;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfc3/n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lfc3/n;->w:I

    const/4 v2, 0x0

    iget-object v3, p0, Lfc3/n;->z:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v4, p0, Lfc3/n;->E:Ldc3/h;

    const/4 v5, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v5, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lfc3/n;->x:[Lec3/l;

    iget v1, p0, Lfc3/n;->y:I

    aget-object p1, p1, v1

    new-instance v6, Lfc3/m;

    invoke-direct {v6, v4, v1}, Lfc3/m;-><init>(Ldc3/h;I)V

    iput v5, p0, Lfc3/n;->w:I

    invoke-interface {p1, v6, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {v4, v2}, Ldc3/h;->r(Ljava/lang/Throwable;)Z

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_1
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v4, v2}, Ldc3/h;->r(Ljava/lang/Throwable;)Z

    :cond_4
    throw p1
.end method
