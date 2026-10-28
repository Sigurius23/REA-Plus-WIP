.class public final Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u00022\u001e\u0008\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003B+\u0012\"\u0010\u0006\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\n\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0096B\u00a2\u0006\u0004\u0008\n\u0010\u000bR0\u0010\u0006\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u000cR2\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;",
        "T",
        "R",
        "Lkotlin/Function2;",
        "Lq83/d;",
        "",
        "initializer",
        "<init>",
        "(Lc93/m;)V",
        "param",
        "invoke",
        "(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;",
        "Lc93/m;",
        "Ljava/util/HashMap;",
        "Lkotlin/collections/HashMap;",
        "values",
        "Ljava/util/HashMap;",
        "Lmc3/a;",
        "mutex",
        "Lmc3/a;",
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
.field private final initializer:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final mutex:Lmc3/a;

.field private values:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "TT;TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc93/m;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            ")V"
        }
    .end annotation

    const-string v0, "initializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;->initializer:Lc93/m;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;->values:Ljava/util/HashMap;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;->mutex:Lmc3/a;

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;->invoke(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lq83/d<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy$invoke$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy$invoke$1;

    iget v1, v0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy$invoke$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy$invoke$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy$invoke$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy$invoke$1;-><init>(Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy$invoke$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    .line 2
    iget v2, v0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy$invoke$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy$invoke$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    iget-object v0, v0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy$invoke$1;->L$0:Ljava/lang/Object;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p2

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy$invoke$1;->I$0:I

    iget-object v2, v0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy$invoke$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lmc3/a;

    iget-object v5, v0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy$invoke$1;->L$0:Ljava/lang/Object;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, v2

    move v2, p1

    move-object p1, v5

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    .line 3
    iget-object p2, p0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;->values:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_7

    iget-object p2, p0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;->mutex:Lmc3/a;

    .line 4
    iput-object p1, v0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy$invoke$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy$invoke$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy$invoke$1;->I$0:I

    iput v5, v0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy$invoke$1;->label:I

    invoke-interface {p2, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_2

    :cond_4
    move v2, v3

    .line 5
    :goto_1
    :try_start_1
    iget-object v5, p0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;->values:Ljava/util/HashMap;

    invoke-virtual {v5, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_6

    iget-object v5, p0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;->initializer:Lc93/m;

    iput-object p1, v0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy$invoke$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy$invoke$1;->L$1:Ljava/lang/Object;

    iput v2, v0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy$invoke$1;->I$0:I

    iput v3, v0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy$invoke$1;->I$1:I

    iput v4, v0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy$invoke$1;->label:I

    invoke-interface {v5, p1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v7, v0

    move-object v0, p1

    move-object p1, p2

    move-object p2, v7

    .line 6
    :goto_3
    :try_start_2
    iget-object v1, p0, Lio/getstream/chat/android/core/internal/lazy/ParameterizedLazy;->values:Ljava/util/HashMap;

    invoke-interface {v1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v5, p2

    move-object p2, p1

    goto :goto_4

    :catchall_1
    move-exception p1

    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    goto :goto_5

    .line 7
    :cond_6
    :goto_4
    invoke-interface {p2, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v5

    :goto_5
    invoke-interface {p1, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p2

    :cond_7
    return-object p2
.end method
