.class public final Lio/getstream/chat/android/core/internal/coroutines/Tube;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/l;
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/l;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0008\u0012\u0004\u0012\u00028\u00000\u0003B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001e\u0010\u0008\u001a\u00020\u00072\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0000H\u0096@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR0\u0010\u0012\u001a\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00030\u0010j\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0003`\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/getstream/chat/android/core/internal/coroutines/Tube;",
        "T",
        "Lec3/l;",
        "Lec3/m;",
        "<init>",
        "()V",
        "collector",
        "Ll83/a0;",
        "collect",
        "(Lec3/m;Lq83/d;)Ljava/lang/Object;",
        "value",
        "emit",
        "(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;",
        "Lmc3/a;",
        "mutex",
        "Lmc3/a;",
        "Ljava/util/HashSet;",
        "Lkotlin/collections/HashSet;",
        "collectors",
        "Ljava/util/HashSet;",
        "stream-chat-android-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final collectors:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lec3/m;",
            ">;"
        }
    .end annotation
.end field

.field private final mutex:Lmc3/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/core/internal/coroutines/Tube;->mutex:Lmc3/a;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/core/internal/coroutines/Tube;->collectors:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;

    iget v1, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;-><init>(Lio/getstream/chat/android/core/internal/coroutines/Tube;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v5, :cond_4

    if-eq v2, v4, :cond_3

    if-eq v2, v3, :cond_2

    const/4 p1, 0x4

    if-eq v2, p1, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object p1, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    iget-object v1, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    iget-object v0, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_0
    iget-object p2, p0, Lio/getstream/chat/android/core/internal/coroutines/Tube;->collectors:Ljava/util/HashSet;

    invoke-virtual {p2, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1, v7}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v1

    :catchall_0
    move-exception p2

    invoke-interface {p1, v7}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p2

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    iget-object v0, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_3
    iget-object p1, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    iget-object p1, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    :try_start_1
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lkotlin/KotlinNothingValueException;

    invoke-direct {p2}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    :cond_4
    iget p1, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->I$0:I

    iget-object v2, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lmc3/a;

    iget-object v5, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lec3/m;

    :try_start_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move p2, p1

    move-object p1, v5

    goto :goto_1

    :catchall_1
    move-object p1, v5

    goto :goto_2

    :cond_5
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_3
    iget-object v2, p0, Lio/getstream/chat/android/core/internal/coroutines/Tube;->mutex:Lmc3/a;

    iput-object p1, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->L$1:Ljava/lang/Object;

    iput v6, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->I$0:I

    iput v5, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->label:I

    invoke-interface {v2, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-ne p2, v1, :cond_6

    goto :goto_3

    :cond_6
    move p2, v6

    :goto_1
    :try_start_4
    iget-object v5, p0, Lio/getstream/chat/android/core/internal/coroutines/Tube;->collectors:Ljava/util/HashSet;

    invoke-virtual {v5, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    invoke-interface {v2, v7}, Lmc3/a;->i(Ljava/lang/Object;)V

    iput-object p1, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->L$1:Ljava/lang/Object;

    iput p2, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->I$0:I

    iput v6, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->I$1:I

    iput v4, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->label:I

    invoke-static {v0}, Lbc3/m0;->a(Ls83/c;)V

    return-object v1

    :catchall_2
    move-exception p2

    invoke-interface {v2, v7}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    :goto_2
    iget-object p2, p0, Lio/getstream/chat/android/core/internal/coroutines/Tube;->mutex:Lmc3/a;

    iput-object p1, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->L$1:Ljava/lang/Object;

    iput v6, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->I$0:I

    iput v3, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$collect$1;->label:I

    invoke-interface {p2, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    move-object v0, p1

    move-object p1, p2

    :goto_4
    :try_start_6
    iget-object p2, p0, Lio/getstream/chat/android/core/internal/coroutines/Tube;->collectors:Ljava/util/HashSet;

    invoke-virtual {p2, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    invoke-interface {p1, v7}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_4
    move-exception p2

    invoke-interface {p1, v7}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p2
.end method

.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;

    iget v1, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;-><init>(Lio/getstream/chat/android/core/internal/coroutines/Tube;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->I$2:I

    iget v2, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->I$1:I

    iget v4, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->I$0:I

    iget-object v7, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->L$5:Ljava/lang/Object;

    check-cast v7, Lec3/m;

    iget-object v7, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->L$3:Ljava/lang/Object;

    check-cast v7, Ljava/util/Iterator;

    iget-object v8, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->L$2:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    iget-object v8, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->L$1:Ljava/lang/Object;

    check-cast v8, Lmc3/a;

    iget-object v9, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->L$0:Ljava/lang/Object;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->I$0:I

    iget-object v2, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lmc3/a;

    iget-object v4, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->L$0:Ljava/lang/Object;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move p2, p1

    move-object p1, v4

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, Lio/getstream/chat/android/core/internal/coroutines/Tube;->mutex:Lmc3/a;

    iput-object p1, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->L$1:Ljava/lang/Object;

    iput v5, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->I$0:I

    iput v4, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->label:I

    invoke-interface {v2, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_3

    :cond_4
    move p2, v5

    :goto_1
    :try_start_1
    iget-object v4, p0, Lio/getstream/chat/android/core/internal/coroutines/Tube;->collectors:Ljava/util/HashSet;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-object v9, p1

    move-object v8, v2

    move-object v7, v4

    move p1, v5

    move v2, p1

    move v4, p2

    :catchall_0
    :cond_5
    :goto_2
    :try_start_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lec3/m;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    iput-object v9, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->L$2:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->L$3:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->L$4:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->L$5:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->I$0:I

    iput v2, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->I$1:I

    iput p1, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->I$2:I

    iput v5, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->I$3:I

    iput v3, v0, Lio/getstream/chat/android/core/internal/coroutines/Tube$emit$1;->label:I

    invoke-interface {p2, v9, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-ne p2, v1, :cond_5

    :goto_3
    return-object v1

    :catchall_1
    move-exception p1

    move-object v2, v8

    goto :goto_4

    :cond_6
    invoke-interface {v8, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_2
    move-exception p1

    :goto_4
    invoke-interface {v2, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method
