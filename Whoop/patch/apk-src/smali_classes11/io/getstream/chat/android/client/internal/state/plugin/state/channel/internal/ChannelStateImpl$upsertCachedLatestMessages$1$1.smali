.class final synthetic Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$upsertCachedLatestMessages$1$1;
.super Lkotlin/jvm/internal/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertCachedLatestMessages(Ljava/util/List;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
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


# static fields
.field public static final INSTANCE:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$upsertCachedLatestMessages$1$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$upsertCachedLatestMessages$1$1;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$upsertCachedLatestMessages$1$1;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$upsertCachedLatestMessages$1$1;->INSTANCE:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$upsertCachedLatestMessages$1$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    const-string v0, "getId()Ljava/lang/String;"

    const/4 v1, 0x0

    const-class v2, Lio/getstream/chat/android/models/Message;

    const-string v3, "id"

    invoke-direct {p0, v2, v3, v0, v1}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
