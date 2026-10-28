.class public final Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$Companion$EMPTY_DISPOSABLE$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/utils/observable/Disposable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0006\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "io/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$Companion$EMPTY_DISPOSABLE$1",
        "Lio/getstream/chat/android/client/utils/observable/Disposable;",
        "Ll83/a0;",
        "dispose",
        "()V",
        "",
        "isDisposed",
        "Z",
        "()Z",
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
.field private final isDisposed:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$Companion$EMPTY_DISPOSABLE$1;->isDisposed:Z

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 0

    return-void
.end method

.method public final isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$Companion$EMPTY_DISPOSABLE$1;->isDisposed:Z

    return v0
.end method
