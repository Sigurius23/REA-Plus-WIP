.class public final synthetic Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

.field public final synthetic y:Lio/getstream/chat/android/models/SyncStatus;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Lio/getstream/chat/android/models/SyncStatus;II)V
    .locals 0

    iput p4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/a;->x:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/a;->y:Lio/getstream/chat/android/models/SyncStatus;

    iput p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/a;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/a;->z:I

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/a;->x:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/a;->y:Lio/getstream/chat/android/models/SyncStatus;

    invoke-static {v1, v2, v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->a(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Lio/getstream/chat/android/models/SyncStatus;ILtb/a;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/a;->z:I

    check-cast p1, Ltb/a;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/a;->x:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/a;->y:Lio/getstream/chat/android/models/SyncStatus;

    invoke-static {v1, v2, v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->c(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;Lio/getstream/chat/android/models/SyncStatus;ILtb/a;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
