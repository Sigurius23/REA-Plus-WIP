.class public final Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$special$$inlined$CoroutineExceptionHandler$1;
.super Lq83/a;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/CoroutineExceptionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/api/state/StateRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lkotlin/jvm/functions/Function1;Lec3/l;Lio/getstream/chat/android/client/api/MessageBufferConfig;Lbc3/c0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "io/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$special$$inlined$CoroutineExceptionHandler$1",
        "Lq83/a;",
        "Lkotlinx/coroutines/CoroutineExceptionHandler;",
        "Lq83/j;",
        "context",
        "",
        "exception",
        "Ll83/a0;",
        "handleException",
        "(Lq83/j;Ljava/lang/Throwable;)V",
        "kotlinx-coroutines-core"
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
.field final synthetic this$0:Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;


# direct methods
.method public constructor <init>(Lbc3/a0;Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;)V
    .locals 0

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$special$$inlined$CoroutineExceptionHandler$1;->this$0:Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;

    invoke-direct {p0, p1}, Lq83/a;-><init>(Lq83/i;)V

    return-void
.end method


# virtual methods
.method public final handleException(Lq83/j;Ljava/lang/Throwable;)V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$special$$inlined$CoroutineExceptionHandler$1;->this$0:Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->access$getLogger(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;)Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->F:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[uncaughtCoroutineException] throwable: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", context: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v2, v3, p1, p2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
