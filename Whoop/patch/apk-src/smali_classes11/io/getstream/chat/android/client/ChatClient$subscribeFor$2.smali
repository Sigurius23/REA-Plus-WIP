.class public final Lio/getstream/chat/android/client/ChatClient$subscribeFor$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/ChatClient;->subscribeFor(Landroidx/lifecycle/g0;[Ljava/lang/Class;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "io/getstream/chat/android/client/ChatClient$subscribeFor$2",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Landroidx/lifecycle/g0;",
        "owner",
        "Ll83/a0;",
        "onDestroy",
        "(Landroidx/lifecycle/g0;)V",
        "stream-chat-android-client_release"
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
.field final synthetic $disposable:Lio/getstream/chat/android/client/utils/observable/Disposable;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/utils/observable/Disposable;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/ChatClient$subscribeFor$2;->$disposable:Lio/getstream/chat/android/client/utils/observable/Disposable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDestroy(Landroidx/lifecycle/g0;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/ChatClient$subscribeFor$2;->$disposable:Lio/getstream/chat/android/client/utils/observable/Disposable;

    invoke-interface {p1}, Lio/getstream/chat/android/client/utils/observable/Disposable;->dispose()V

    return-void
.end method
