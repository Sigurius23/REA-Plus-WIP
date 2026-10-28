.class public final Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<STATE:",
        "Ljava/lang/Object;",
        "EVENT:",
        "Ljava/lang/Object;",
        "S::TSTATE;>",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilderMarker;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0008\t\u0008\u0007\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u0001*\u0008\u0008\u0001\u0010\u0003*\u00020\u0001*\u0008\u0008\u0002\u0010\u0004*\u00028\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J;\u0010\u000b\u001a\u00020\n\"\n\u0008\u0003\u0010\u0007\u0018\u0001*\u00028\u00012\u001a\u0008\u0008\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00000\u0008H\u0087\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ/\u0010\u000e\u001a\u00020\n2\u001a\u0008\u0004\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\u0008H\u0087\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000cJE\u0010\u0012\u001a8\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00028\u00010\u0010\u0012&\u0012$\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0008j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00110\u000fH\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\'\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\u00080\u0014H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016RV\u0010\u0018\u001a8\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00028\u00010\u0010\u0012&\u0012$\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0008j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00110\u00178\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0019\u0012\u0004\u0008\u001b\u0010\u0006\u001a\u0004\u0008\u001a\u0010\u0013R8\u0010\u001c\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\u00080\u00148\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010\u001d\u0012\u0004\u0008\u001f\u0010\u0006\u001a\u0004\u0008\u001e\u0010\u0016\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006 "
    }
    d2 = {
        "Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;",
        "",
        "STATE",
        "EVENT",
        "S",
        "<init>",
        "()V",
        "E",
        "Lkotlin/Function2;",
        "func",
        "Ll83/a0;",
        "onEvent",
        "(Lc93/m;)V",
        "listener",
        "onEnter",
        "",
        "Lj93/d;",
        "Lio/getstream/chat/android/core/internal/fsm/builder/StateFunction;",
        "get",
        "()Ljava/util/Map;",
        "",
        "getEnterListeners",
        "()Ljava/util/List;",
        "",
        "eventHandlers",
        "Ljava/util/Map;",
        "getEventHandlers",
        "getEventHandlers$annotations",
        "onEnterListeners",
        "Ljava/util/List;",
        "getOnEnterListeners",
        "getOnEnterListeners$annotations",
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
.field private final eventHandlers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lj93/d;",
            "Lc93/m;",
            ">;"
        }
    .end annotation
.end field

.field private final onEnterListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc93/m;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->eventHandlers:Ljava/util/Map;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->onEnterListeners:Ljava/util/List;

    return-void
.end method

.method public static synthetic getEventHandlers$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getOnEnterListeners$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final get()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lj93/d;",
            "Lc93/m;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->eventHandlers:Ljava/util/Map;

    return-object v0
.end method

.method public final getEnterListeners()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lc93/m;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->onEnterListeners:Ljava/util/List;

    return-object v0
.end method

.method public final getEventHandlers()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lj93/d;",
            "Lc93/m;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->eventHandlers:Ljava/util/Map;

    return-object v0
.end method

.method public final getOnEnterListeners()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lc93/m;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->onEnterListeners:Ljava/util/List;

    return-object v0
.end method

.method public final onEnter(Lc93/m;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            ")V"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilderMarker;
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->onEnterListeners:Ljava/util/List;

    new-instance v1, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder$onEnter$1;

    invoke-direct {v1, p1}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder$onEnter$1;-><init>(Lc93/m;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final onEvent(Lc93/m;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::TEVENT;>(",
            "Lc93/m;",
            ")V"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilderMarker;
    .end annotation

    const-string v0, "func"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    const/4 p1, 0x0

    throw p1
.end method
