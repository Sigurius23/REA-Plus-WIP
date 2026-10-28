.class public final Lv53/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc3/c0;
.implements Ljava/io/Closeable;


# static fields
.field public static final synthetic L:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public final E:Le63/f;

.field public final F:Lf63/b;

.field public final G:Le63/f;

.field public final H:Lf63/b;

.field public final I:Lo63/f;

.field public final J:Lad3/z;

.field public final K:Lv53/e;

.field private volatile synthetic closed:I

.field public final w:Lz53/g;

.field public final x:Z

.field public final y:Lbc3/l1;

.field public final z:Lq83/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lv53/c;

    const-string v1, "closed"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lv53/c;->L:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lz53/g;Lv53/e;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv53/c;->w:Lz53/g;

    const/4 v0, 0x0

    iput v0, p0, Lv53/c;->closed:I

    iget-object v1, p1, Lz53/g;->G:Lq83/j;

    sget-object v2, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v1, v2}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v1

    check-cast v1, Lbc3/k1;

    new-instance v2, Lbc3/l1;

    invoke-direct {v2, v1}, Lbc3/l1;-><init>(Lbc3/k1;)V

    iput-object v2, p0, Lv53/c;->y:Lbc3/l1;

    iget-object v1, p1, Lz53/g;->G:Lq83/j;

    invoke-interface {v1, v2}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v1

    iput-object v1, p0, Lv53/c;->z:Lq83/j;

    new-instance v1, Le63/f;

    iget-boolean v3, p2, Lv53/e;->h:Z

    invoke-direct {v1, v3, v0}, Le63/f;-><init>(ZI)V

    iput-object v1, p0, Lv53/c;->E:Le63/f;

    new-instance v1, Lf63/b;

    iget-boolean v3, p2, Lv53/e;->h:Z

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lf63/b;-><init>(ZI)V

    iput-object v1, p0, Lv53/c;->F:Lf63/b;

    new-instance v1, Le63/f;

    iget-boolean v3, p2, Lv53/e;->h:Z

    invoke-direct {v1, v3, v4}, Le63/f;-><init>(ZI)V

    iput-object v1, p0, Lv53/c;->G:Le63/f;

    new-instance v3, Lf63/b;

    iget-boolean v5, p2, Lv53/e;->h:Z

    invoke-direct {v3, v5, v0}, Lf63/b;-><init>(ZI)V

    iput-object v3, p0, Lv53/c;->H:Lf63/b;

    new-instance v3, Lo63/f;

    invoke-direct {v3}, Lo63/f;-><init>()V

    iput-object v3, p0, Lv53/c;->I:Lo63/f;

    new-instance v3, Lad3/z;

    const/16 v5, 0xc

    invoke-direct {v3, v5}, Lad3/z;-><init>(I)V

    iput-object v3, p0, Lv53/c;->J:Lad3/z;

    new-instance v3, Lv53/e;

    invoke-direct {v3}, Lv53/e;-><init>()V

    iput-object v3, p0, Lv53/c;->K:Lv53/e;

    iget-boolean v5, p0, Lv53/c;->x:Z

    if-eqz v5, :cond_0

    new-instance v5, Lj43/a;

    const/16 v6, 0x13

    invoke-direct {v5, p0, v6}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v5}, Lbc3/t1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    :cond_0
    sget-object v2, Le63/f;->o:Lhc3/x;

    new-instance v5, La63/w;

    const/4 v6, 0x0

    invoke-direct {v5, p0, p1, v6}, La63/w;-><init>(Lv53/c;Lz53/g;Lq83/d;)V

    invoke-virtual {v1, v2, v5}, Lr63/d;->f(Lhc3/x;Lkotlin/jvm/functions/Function3;)V

    sget-object p1, Le63/f;->p:Lhc3/x;

    new-instance v2, La63/j;

    const/16 v5, 0x9

    invoke-direct {v2, p0, v0, v6, v5}, La63/j;-><init>(Ljava/lang/Object;ZLq83/d;I)V

    invoke-virtual {v1, p1, v2}, Lr63/d;->f(Lhc3/x;Lkotlin/jvm/functions/Function3;)V

    sget-object p1, La63/z;->a:La63/a;

    sget-object v0, Lv53/a;->z:Lv53/a;

    invoke-virtual {v3, p1, v0}, Lv53/e;->a(La63/q;Lkotlin/jvm/functions/Function1;)V

    sget-object p1, La63/d;->a:La63/a;

    invoke-virtual {v3, p1, v0}, Lv53/e;->a(La63/q;Lkotlin/jvm/functions/Function1;)V

    iget-boolean p1, p2, Lv53/e;->f:Z

    if-eqz p1, :cond_1

    sget-object p1, Lv53/a;->x:Lv53/a;

    iget-object v1, v3, Lv53/e;->c:Ljava/util/LinkedHashMap;

    const-string v2, "DefaultTransformers"

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p1, La63/e0;->b:La63/a;

    invoke-virtual {v3, p1, v0}, Lv53/e;->a(La63/q;Lkotlin/jvm/functions/Function1;)V

    sget-object p1, La63/o;->d:La63/a;

    invoke-virtual {v3, p1, v0}, Lv53/e;->a(La63/q;Lkotlin/jvm/functions/Function1;)V

    iget-boolean v1, p2, Lv53/e;->e:Z

    if-eqz v1, :cond_2

    sget-object v1, La63/x;->a:La63/a;

    invoke-virtual {v3, v1, v0}, Lv53/e;->a(La63/q;Lkotlin/jvm/functions/Function1;)V

    :cond_2
    iget-boolean v1, p2, Lv53/e;->e:Z

    iput-boolean v1, v3, Lv53/e;->e:Z

    iget-boolean v1, p2, Lv53/e;->f:Z

    iput-boolean v1, v3, Lv53/e;->f:Z

    iget-boolean v1, p2, Lv53/e;->g:Z

    iput-boolean v1, v3, Lv53/e;->g:Z

    iget-object v1, v3, Lv53/e;->a:Ljava/util/LinkedHashMap;

    iget-object v2, p2, Lv53/e;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v1, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    iget-object v1, v3, Lv53/e;->b:Ljava/util/LinkedHashMap;

    iget-object v2, p2, Lv53/e;->b:Ljava/util/LinkedHashMap;

    invoke-interface {v1, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    iget-object v1, v3, Lv53/e;->c:Ljava/util/LinkedHashMap;

    iget-object v2, p2, Lv53/e;->c:Ljava/util/LinkedHashMap;

    invoke-interface {v1, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    iget-boolean p2, p2, Lv53/e;->f:Z

    if-eqz p2, :cond_3

    sget-object p2, La63/u;->d:La63/a;

    invoke-virtual {v3, p2, v0}, Lv53/e;->a(La63/q;Lkotlin/jvm/functions/Function1;)V

    :cond_3
    sget-object p2, La63/g;->a:Lo63/a;

    new-instance p2, La3/m1;

    invoke-direct {p2, v3, v4}, La3/m1;-><init>(Ljava/lang/Object;I)V

    sget-object v0, La63/p;->a:Lo63/a;

    invoke-virtual {v3, p1, p2}, Lv53/e;->a(La63/q;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v3, Lv53/e;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    iget-object p1, v3, Lv53/e;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_5
    iget-object p1, p0, Lv53/c;->F:Lf63/b;

    sget-object p2, Lf63/b;->j:Lhc3/x;

    new-instance v0, La63/c;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v6, v1}, La63/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {p1, p2, v0}, Lr63/d;->f(Lhc3/x;Lkotlin/jvm/functions/Function3;)V

    iput-boolean v4, p0, Lv53/c;->x:Z

    return-void
.end method


# virtual methods
.method public final b(Le63/d;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lv53/b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lv53/b;

    iget v1, v0, Lv53/b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lv53/b;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lv53/b;

    invoke-direct {v0, p0, p2}, Lv53/b;-><init>(Lv53/c;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lv53/b;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lv53/b;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lv53/c;->J:Lad3/z;

    sget-object v2, Lg63/b;->a:Lio/sentry/hints/j;

    invoke-virtual {p2, v2}, Lad3/z;->v(Lio/sentry/hints/j;)V

    iget-object p2, p1, Le63/d;->d:Ljava/lang/Object;

    iput v3, v0, Lv53/b;->y:I

    iget-object v2, p0, Lv53/c;->E:Le63/f;

    invoke-virtual {v2, p1, p2, v0}, Lr63/d;->a(Ljava/lang/Object;Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const-string p1, "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lw53/b;

    return-object p2
.end method

.method public final close()V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    sget-object v2, Lv53/c;->L:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v2, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lv53/c;->I:Lo63/f;

    sget-object v1, La63/r;->a:Lo63/a;

    invoke-virtual {v0, v1}, Lo63/f;->b(Lo63/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo63/f;

    invoke-virtual {v0}, Lo63/f;->c()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo63/a;

    const-string v3, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lo63/f;->b(Lo63/a;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/io/Closeable;

    if-eqz v3, :cond_1

    check-cast v2, Ljava/io/Closeable;

    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lv53/c;->y:Lbc3/l1;

    invoke-virtual {v0}, Lbc3/l1;->complete()Z

    iget-boolean v0, p0, Lv53/c;->x:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lv53/c;->w:Lz53/g;

    invoke-virtual {v0}, Lz53/g;->close()V

    :cond_3
    :goto_1
    return-void
.end method

.method public final getCoroutineContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Lv53/c;->z:Lq83/j;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HttpClient["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lv53/c;->w:Lz53/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
