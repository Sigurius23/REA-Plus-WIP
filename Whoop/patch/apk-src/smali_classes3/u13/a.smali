.class public final synthetic Lu13/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/models/Channel;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/models/Channel;I)V
    .locals 0

    iput p2, p0, Lu13/a;->w:I

    iput-object p1, p0, Lu13/a;->x:Lio/getstream/chat/android/models/Channel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lu13/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lu13/a;->x:Lio/getstream/chat/android/models/Channel;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDecoratorProvider;->a(Lio/getstream/chat/android/models/Channel;)Z

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lu13/a;->x:Lio/getstream/chat/android/models/Channel;

    invoke-static {v0}, Lio/getstream/chat/android/ui/common/utils/extensions/ChannelKt;->isDirectMessaging(Lio/getstream/chat/android/models/Channel;)Z

    move-result v0

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lu13/a;->x:Lio/getstream/chat/android/models/Channel;

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/ChannelKt;->isCurrentUserBanned(Lio/getstream/chat/android/models/Channel;)Z

    move-result v0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
