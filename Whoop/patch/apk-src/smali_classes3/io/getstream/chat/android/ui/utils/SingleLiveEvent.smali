.class public final Lio/getstream/chat/android/ui/utils/SingleLiveEvent;
.super Landroidx/lifecycle/u0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/lifecycle/u0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0008\u001a\n\u0012\u0006\u0008\u0000\u0012\u00028\u00000\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/utils/SingleLiveEvent;",
        "T",
        "Landroidx/lifecycle/u0;",
        "<init>",
        "()V",
        "Landroidx/lifecycle/g0;",
        "owner",
        "Landroidx/lifecycle/v0;",
        "observer",
        "Ll83/a0;",
        "observe",
        "(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V",
        "value",
        "setValue",
        "(Ljava/lang/Object;)V",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "pending",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
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


# instance fields
.field private final pending:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/lifecycle/p0;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/utils/SingleLiveEvent;->pending:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/utils/SingleLiveEvent;Landroidx/lifecycle/v0;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/utils/SingleLiveEvent;->observe$lambda$0(Lio/getstream/chat/android/ui/utils/SingleLiveEvent;Landroidx/lifecycle/v0;Ljava/lang/Object;)Ll83/a0;

    return-void
.end method

.method private static final observe$lambda$0(Lio/getstream/chat/android/ui/utils/SingleLiveEvent;Landroidx/lifecycle/v0;Ljava/lang/Object;)Ll83/a0;
    .locals 2

    iget-object p0, p0, Lio/getstream/chat/android/ui/utils/SingleLiveEvent;->pending:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p2}, Landroidx/lifecycle/v0;->onChanged(Ljava/lang/Object;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/g0;",
            "Landroidx/lifecycle/v0;",
            ")V"
        }
    .end annotation

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "observer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;

    const/16 v1, 0x13

    invoke-direct {v0, v1, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p2, Lio/getstream/chat/android/ui/utils/SingleLiveEventKt$sam$androidx_lifecycle_Observer$0;

    invoke-direct {p2, v0}, Lio/getstream/chat/android/ui/utils/SingleLiveEventKt$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-super {p0, p1, p2}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    return-void
.end method

.method public final setValue(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/utils/SingleLiveEvent;->pending:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-super {p0, p1}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
