.class final Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->runChannelQuery(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.ChannelLogicLegacyImpl"
    f = "ChannelLogicLegacyImpl.kt"
    l = {
        0xf1,
        0xf3
    }
    m = "runChannelQuery"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;->this$0:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;->result:Ljava/lang/Object;

    iget p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;->label:I

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;->this$0:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->access$runChannelQuery(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
