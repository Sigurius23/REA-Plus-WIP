.class public final Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/utils/typing/TypingUpdatesBuffer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB-\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005H\u0082@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0013R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0014R\u001a\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0017R$\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0002@BX\u0082\u000e\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;",
        "Lio/getstream/chat/android/ui/common/utils/typing/TypingUpdatesBuffer;",
        "Lbc3/c0;",
        "coroutineScope",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onTypingStarted",
        "onTypingStopped",
        "<init>",
        "(Lbc3/c0;Lc93/a;Lc93/a;)V",
        "startTypingTimer",
        "(Lq83/d;)Ljava/lang/Object;",
        "handleTypingEvent",
        "()V",
        "",
        "inputText",
        "onKeystroke",
        "(Ljava/lang/String;)V",
        "clear",
        "Lbc3/c0;",
        "Lc93/a;",
        "Lbc3/k1;",
        "isTypingTimerJob",
        "Lbc3/k1;",
        "sendUpdatesJob",
        "",
        "value",
        "isTyping",
        "Z",
        "setTyping",
        "(Z)V",
        "Companion",
        "stream-chat-android-ui-common_release"
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
.field public static final $stable:I = 0x8

.field private static final Companion:Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer$Companion;

.field private static final DEFAULT_BUFFER_TYPING_UPDATES_INTERVAL:J = 0x3e8L

.field private static final DEFAULT_SEND_TYPING_UPDATES_INTERVAL:J = 0xbb8L


# instance fields
.field private final coroutineScope:Lbc3/c0;

.field private isTyping:Z

.field private isTypingTimerJob:Lbc3/k1;

.field private final onTypingStarted:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final onTypingStopped:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private sendUpdatesJob:Lbc3/k1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;->Companion:Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer$Companion;

    return-void
.end method

.method public constructor <init>(Lbc3/c0;Lc93/a;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lc93/a;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTypingStarted"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTypingStopped"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;->coroutineScope:Lbc3/c0;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;->onTypingStarted:Lc93/a;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;->onTypingStopped:Lc93/a;

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;Lc93/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    .line 5
    sget-object p1, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {p1}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;-><init>(Lbc3/c0;Lc93/a;Lc93/a;)V

    return-void
.end method

.method public static final synthetic access$getOnTypingStarted$p(Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;)Lc93/a;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;->onTypingStarted:Lc93/a;

    return-object p0
.end method

.method public static final synthetic access$getOnTypingStopped$p(Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;)Lc93/a;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;->onTypingStopped:Lc93/a;

    return-object p0
.end method

.method public static final synthetic access$isTyping$p(Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;)Z
    .locals 0

    iget-boolean p0, p0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;->isTyping:Z

    return p0
.end method

.method public static final synthetic access$startTypingTimer(Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;->startTypingTimer(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final handleTypingEvent()V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;->sendUpdatesJob:Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;->coroutineScope:Lbc3/c0;

    new-instance v2, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer$handleTypingEvent$1;

    invoke-direct {v2, p0, v1}, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer$handleTypingEvent$1;-><init>(Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v1, v1, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;->sendUpdatesJob:Lbc3/k1;

    return-void
.end method

.method private final setTyping(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;->isTyping:Z

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;->handleTypingEvent()V

    :cond_0
    return-void
.end method

.method private final startTypingTimer(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer$startTypingTimer$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer$startTypingTimer$1;

    iget v1, v0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer$startTypingTimer$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer$startTypingTimer$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer$startTypingTimer$1;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer$startTypingTimer$1;-><init>(Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer$startTypingTimer$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer$startTypingTimer$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer$startTypingTimer$1;->label:I

    const-wide/16 v2, 0x3e8

    invoke-static {v2, v3, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const/4 p1, 0x0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;->isTyping:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public final clear()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;->coroutineScope:Lbc3/c0;

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->l(Lq83/j;)V

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;->isTyping:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;->isTyping:Z

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;->onTypingStopped:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public final onKeystroke(Ljava/lang/String;)V
    .locals 3

    const-string v0, "inputText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;->isTypingTimerJob:Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v0, 0x0

    const/4 v2, 0x1

    if-nez p1, :cond_1

    move p1, v2

    goto :goto_0

    :cond_1
    move p1, v0

    :goto_0
    if-ne p1, v2, :cond_2

    iput-boolean v0, p0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;->isTyping:Z

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;->onTypingStopped:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :cond_2
    if-nez p1, :cond_4

    iget-boolean p1, p0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;->isTyping:Z

    if-nez p1, :cond_3

    invoke-direct {p0, v2}, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;->setTyping(Z)V

    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;->coroutineScope:Lbc3/c0;

    new-instance v0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer$onKeystroke$1;

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer$onKeystroke$1;-><init>(Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p1, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/utils/typing/internal/DefaultTypingUpdatesBuffer;->isTypingTimerJob:Lbc3/k1;

    return-void

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
