.class public final Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JP\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n\"\u0008\u0008\u0002\u0010\u0004*\u00020\u0001\"\u0008\u0008\u0003\u0010\u0005*\u00020\u00012\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0087\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine$Companion;",
        "",
        "<init>",
        "()V",
        "S",
        "E",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;",
        "Ll83/a0;",
        "builder",
        "Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;",
        "invoke",
        "(Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            "E:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine<",
            "TS;TE;>;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilderMarker;
    .end annotation

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;

    invoke-direct {v0}, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;-><init>()V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;->build$stream_chat_android_core()Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    move-result-object p1

    return-object p1
.end method
