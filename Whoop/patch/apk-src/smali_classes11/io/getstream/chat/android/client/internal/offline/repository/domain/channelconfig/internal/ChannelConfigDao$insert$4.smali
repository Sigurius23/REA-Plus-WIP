.class final Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao$insert$4;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;->insert$suspendImpl(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;Lq83/d;)Ljava/lang/Object;
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
    c = "io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao"
    f = "ChannelConfigDao.kt"
    l = {
        0x25,
        0x26
    }
    m = "insert$suspendImpl"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao$insert$4;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao$insert$4;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao$insert$4;->result:Ljava/lang/Object;

    iget p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao$insert$4;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao$insert$4;->label:I

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao$insert$4;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;->insert$suspendImpl(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
