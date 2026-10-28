.class public final Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\rR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R#\u0010\u001a\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00190\u00180\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel;",
        "Landroidx/lifecycle/w1;",
        "",
        "cid",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "messageId",
        "<init>",
        "(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;)V",
        "Lec3/f2;",
        "Lio/getstream/chat/android/client/channel/state/ChannelState;",
        "observeChannelState",
        "()Lec3/f2;",
        "Ljava/lang/String;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "channelState",
        "Lec3/f2;",
        "Landroidx/lifecycle/p0;",
        "",
        "Lio/getstream/chat/android/models/User;",
        "typingUsers",
        "Landroidx/lifecycle/p0;",
        "getTypingUsers",
        "()Landroidx/lifecycle/p0;",
        "Companion",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final Companion:Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel$Companion;

.field private static final DEFAULT_MESSAGES_LIMIT:I = 0x1e

.field private static final TAG:Ljava/lang/String; = "Chat:TypingIndicatorVM"


# instance fields
.field private final channelState:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final chatClient:Lio/getstream/chat/android/client/ChatClient;

.field private final cid:Ljava/lang/String;

.field private final logger$delegate:Ll83/h;

.field private final messageId:Ljava/lang/String;

.field private final typingUsers:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel;->Companion:Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;)V
    .locals 1

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    .line 4
    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel;->cid:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    .line 6
    iput-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel;->messageId:Ljava/lang/String;

    .line 7
    const-string p1, "Chat:TypingIndicatorVM"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel;->logger$delegate:Ll83/h;

    .line 8
    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel;->observeChannelState()Lec3/f2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel;->channelState:Lec3/f2;

    .line 9
    new-instance p2, Lch/i;

    const/4 p3, 0x2

    invoke-direct {p2, p1, p3}, Lch/i;-><init>(Lec3/l;I)V

    .line 10
    new-instance p1, Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel$special$$inlined$flatMapLatest$1;

    const/4 p3, 0x3

    const/4 v0, 0x0

    .line 11
    invoke-direct {p1, p3, v0}, Ls83/i;-><init>(ILq83/d;)V

    .line 12
    invoke-static {p2, p1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    .line 13
    new-instance p2, Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel$special$$inlined$map$1;

    invoke-direct {p2, p1}, Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel$special$$inlined$map$1;-><init>(Lec3/l;)V

    .line 14
    invoke-static {p2, v0, p3}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel;->typingUsers:Landroidx/lifecycle/p0;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 1
    sget-object p2, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 2
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;)V

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final observeChannelState()Lec3/f2;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel;->messageId:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x1e

    :goto_0
    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    iget-object v2, p0, Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel;->cid:Ljava/lang/String;

    const-string v5, "[observeChannelState] cid: "

    const-string v6, ", messageLimit: "

    invoke-static {v0, v5, v2, v6}, Lm4/a;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    invoke-interface {v1, v4, v3, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel;->cid:Ljava/lang/String;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->watchChannelAsState(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ILbc3/c0;)Lec3/f2;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final getTypingUsers()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel;->typingUsers:Landroidx/lifecycle/p0;

    return-object v0
.end method
