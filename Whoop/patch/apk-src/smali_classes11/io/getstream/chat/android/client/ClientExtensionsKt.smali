.class public final Lio/getstream/chat/android/client/ClientExtensionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a.\u0010\u0006\u001a\u00020\u0005\"\n\u0008\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\u0008\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a6\u0010\u0006\u001a\u00020\u0005\"\n\u0008\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00082\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\u0008\u00a2\u0006\u0004\u0008\u0006\u0010\n\u001aC\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\"\u0010\r\u001a\u0012\u0012\u000e\u0008\u0001\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00000\u000c0\u000b\"\n\u0012\u0006\u0008\u0001\u0012\u00020\u00000\u000c2\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u000e\u001aK\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00082\"\u0010\r\u001a\u0012\u0012\u000e\u0008\u0001\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00000\u000c0\u000b\"\n\u0012\u0006\u0008\u0001\u0012\u00020\u00000\u000c2\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u000f\u001a.\u0010\u0010\u001a\u00020\u0005\"\n\u0008\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\u0008\u00a2\u0006\u0004\u0008\u0010\u0010\u0007\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "T",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Lio/getstream/chat/android/client/ChatEventListener;",
        "listener",
        "Lio/getstream/chat/android/client/utils/observable/Disposable;",
        "subscribeFor",
        "(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;",
        "Landroidx/lifecycle/g0;",
        "lifecycleOwner",
        "(Lio/getstream/chat/android/client/ChatClient;Landroidx/lifecycle/g0;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;",
        "",
        "Lj93/d;",
        "eventTypes",
        "(Lio/getstream/chat/android/client/ChatClient;[Lj93/d;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;",
        "(Lio/getstream/chat/android/client/ChatClient;Landroidx/lifecycle/g0;[Lj93/d;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;",
        "subscribeForSingle",
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
.method public static final subscribeFor(Lio/getstream/chat/android/client/ChatClient;Landroidx/lifecycle/g0;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Landroidx/lifecycle/g0;",
            "Lio/getstream/chat/android/client/ChatEventListener<",
            "TT;>;)",
            "Lio/getstream/chat/android/client/utils/observable/Disposable;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "lifecycleOwner"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "listener"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final subscribeFor(Lio/getstream/chat/android/client/ChatClient;Landroidx/lifecycle/g0;[Lj93/d;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Landroidx/lifecycle/g0;",
            "[",
            "Lj93/d;",
            "Lio/getstream/chat/android/client/ChatEventListener<",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;)",
            "Lio/getstream/chat/android/client/utils/observable/Disposable;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTypes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    array-length v1, p2

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p2, v3

    .line 9
    invoke-static {v4}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v4

    .line 10
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 11
    :cond_0
    new-array p2, v2, [Ljava/lang/Class;

    invoke-interface {v0, p2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    .line 12
    check-cast p2, [Ljava/lang/Class;

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/Class;

    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/client/ChatClient;->subscribeFor(Landroidx/lifecycle/g0;[Ljava/lang/Class;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;

    move-result-object p0

    return-object p0
.end method

.method public static final subscribeFor(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/client/ChatEventListener<",
            "TT;>;)",
            "Lio/getstream/chat/android/client/utils/observable/Disposable;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "listener"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final subscribeFor(Lio/getstream/chat/android/client/ChatClient;[Lj93/d;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "[",
            "Lj93/d;",
            "Lio/getstream/chat/android/client/ChatEventListener<",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;)",
            "Lio/getstream/chat/android/client/utils/observable/Disposable;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTypes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 2
    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p1, v3

    .line 3
    invoke-static {v4}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v4

    .line 4
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 5
    :cond_0
    new-array p1, v2, [Ljava/lang/Class;

    invoke-interface {v0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    .line 6
    check-cast p1, [Ljava/lang/Class;

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Class;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/ChatClient;->subscribeFor([Ljava/lang/Class;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;

    move-result-object p0

    return-object p0
.end method

.method public static final subscribeForSingle(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">(",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/client/ChatEventListener<",
            "TT;>;)",
            "Lio/getstream/chat/android/client/utils/observable/Disposable;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "listener"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    const/4 p0, 0x0

    throw p0
.end method
