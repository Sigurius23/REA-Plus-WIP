.class public final Lio/getstream/chat/android/client/utils/coroutine/CoroutineContextKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0010\u0008\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lq83/j;",
        "Lbc3/k1;",
        "exclusion",
        "Ljava/util/concurrent/CancellationException;",
        "Lkotlinx/coroutines/CancellationException;",
        "cause",
        "Ll83/a0;",
        "cancelChildrenExcept",
        "(Lq83/j;Lbc3/k1;Ljava/util/concurrent/CancellationException;)V",
        "stream-chat-android-client_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final cancelChildrenExcept(Lq83/j;Lbc3/k1;Ljava/util/concurrent/CancellationException;)V
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p0, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p0

    check-cast p0, Lbc3/k1;

    if-eqz p0, :cond_1

    invoke-interface {p0}, Lbc3/k1;->getChildren()Lxb3/i;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-interface {p0}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/k1;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0, p2}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static synthetic cancelChildrenExcept$default(Lq83/j;Lbc3/k1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/utils/coroutine/CoroutineContextKt;->cancelChildrenExcept(Lq83/j;Lbc3/k1;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method
