.class public final Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/HideChannelListenerState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J.\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ(\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ6\u0010\u0011\u001a\u00020\u000c2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/HideChannelListenerState;",
        "Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "logic",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V",
        "",
        "channelType",
        "channelId",
        "",
        "clearHistory",
        "Ln23/h;",
        "Ll83/a0;",
        "onHideChannelPrecondition",
        "(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;",
        "onHideChannelRequest",
        "result",
        "onHideChannelResult",
        "(Ln23/h;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
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
.field private final logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V
    .locals 1

    const-string v0, "logic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/HideChannelListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    return-void
.end method


# virtual methods
.method public final onHideChannelPrecondition(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p3, Ll83/k;

    invoke-direct {p3, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p3}, Lio/getstream/chat/android/client/extensions/internal/PairKt;->toCid(Ll83/k;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/internal/ValidationKt;->validateCidWithResult(Ljava/lang/String;)Ln23/h;

    move-result-object p1

    invoke-virtual {p1}, Ln23/h;->d()Ln23/h;

    move-result-object p1

    return-object p1
.end method

.method public final onHideChannelRequest(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/HideChannelListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p3, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object p1

    const/4 p2, 0x1

    invoke-interface {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->setHidden(Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onHideChannelResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p5, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/HideChannelListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p5, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object p2

    instance-of p3, p1, Ln23/g;

    if-eqz p3, :cond_0

    if-eqz p4, :cond_1

    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    invoke-interface {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->hideMessagesBefore(Ljava/util/Date;)V

    invoke-interface {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->removeMessagesBefore(Ljava/util/Date;)V

    goto :goto_0

    :cond_0
    instance-of p1, p1, Ln23/f;

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->setHidden(Z)V

    :cond_1
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
