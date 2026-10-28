.class public final Lio/ktor/utils/io/jvm/javaio/g;
.super Lio/ktor/utils/io/jvm/javaio/b;
.source "SourceFile"


# instance fields
.field public final synthetic g:Lio/ktor/utils/io/jvm/javaio/h;


# direct methods
.method public constructor <init>(Lbc3/k1;Lio/ktor/utils/io/jvm/javaio/h;)V
    .locals 0

    iput-object p2, p0, Lio/ktor/utils/io/jvm/javaio/g;->g:Lio/ktor/utils/io/jvm/javaio/h;

    invoke-direct {p0, p1}, Lio/ktor/utils/io/jvm/javaio/b;-><init>(Lbc3/k1;)V

    return-void
.end method


# virtual methods
.method public final a(Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p1, Lio/ktor/utils/io/jvm/javaio/f;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/ktor/utils/io/jvm/javaio/f;

    iget v1, v0, Lio/ktor/utils/io/jvm/javaio/f;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/ktor/utils/io/jvm/javaio/f;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/ktor/utils/io/jvm/javaio/f;

    invoke-direct {v0, p0, p1}, Lio/ktor/utils/io/jvm/javaio/f;-><init>(Lio/ktor/utils/io/jvm/javaio/g;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lio/ktor/utils/io/jvm/javaio/f;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/ktor/utils/io/jvm/javaio/f;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_4

    const/4 v4, 0x2

    if-eq v2, v3, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v2, v0, Lio/ktor/utils/io/jvm/javaio/f;->w:Lio/ktor/utils/io/jvm/javaio/g;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lio/ktor/utils/io/jvm/javaio/f;->w:Lio/ktor/utils/io/jvm/javaio/g;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    const-string v5, "null cannot be cast to non-null type kotlin.ByteArray"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, [B

    iget-object v5, v2, Lio/ktor/utils/io/jvm/javaio/g;->g:Lio/ktor/utils/io/jvm/javaio/h;

    iget-object v5, v5, Lio/ktor/utils/io/jvm/javaio/h;->w:Lio/ktor/utils/io/q;

    iget v6, v2, Lio/ktor/utils/io/jvm/javaio/b;->d:I

    iget v7, v2, Lio/ktor/utils/io/jvm/javaio/b;->e:I

    iput-object v2, v0, Lio/ktor/utils/io/jvm/javaio/f;->w:Lio/ktor/utils/io/jvm/javaio/g;

    iput v4, v0, Lio/ktor/utils/io/jvm/javaio/f;->z:I

    check-cast v5, Lio/ktor/utils/io/m;

    invoke-virtual {v5, p1, v6, v7, v0}, Lio/ktor/utils/io/m;->s([BIILs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    const/4 v4, -0x1

    if-ne p1, v4, :cond_5

    iget-object v0, v2, Lio/ktor/utils/io/jvm/javaio/g;->g:Lio/ktor/utils/io/jvm/javaio/h;

    iget-object v0, v0, Lio/ktor/utils/io/jvm/javaio/h;->x:Lbc3/l1;

    invoke-virtual {v0}, Lbc3/l1;->complete()Z

    iput p1, v2, Lio/ktor/utils/io/jvm/javaio/b;->result:I

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 p1, 0x0

    move-object v2, p0

    :cond_5
    iput p1, v2, Lio/ktor/utils/io/jvm/javaio/b;->result:I

    iput-object v2, v0, Lio/ktor/utils/io/jvm/javaio/f;->w:Lio/ktor/utils/io/jvm/javaio/g;

    iput v3, v0, Lio/ktor/utils/io/jvm/javaio/f;->z:I

    const/4 p1, 0x0

    :goto_2
    iget-object v3, v2, Lio/ktor/utils/io/jvm/javaio/b;->state:Ljava/lang/Object;

    instance-of v4, v3, Ljava/lang/Thread;

    if-eqz v4, :cond_6

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p1

    move-object v4, v3

    goto :goto_3

    :cond_6
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v4

    move-object v8, v4

    move-object v4, p1

    move-object p1, v8

    :goto_3
    sget-object v5, Lio/ktor/utils/io/jvm/javaio/b;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_7
    invoke-virtual {v5, v2, v3, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    if-eqz v4, :cond_9

    sget-object p1, Lio/ktor/utils/io/jvm/javaio/j;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/ktor/utils/io/jvm/javaio/i;

    if-nez p1, :cond_8

    sget-object p1, Lio/ktor/utils/io/jvm/javaio/e;->b:Lio/ktor/utils/io/jvm/javaio/e;

    :cond_8
    invoke-interface {p1, v4}, Lio/ktor/utils/io/jvm/javaio/i;->b(Ljava/lang/Object;)V

    :cond_9
    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object v1

    :cond_a
    invoke-virtual {v5, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eq v6, v3, :cond_7

    move-object p1, v4

    goto :goto_2

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already suspended or in finished state"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
