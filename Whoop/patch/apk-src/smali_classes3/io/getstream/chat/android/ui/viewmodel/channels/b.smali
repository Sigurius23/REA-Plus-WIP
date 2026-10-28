.class public final synthetic Lio/getstream/chat/android/ui/viewmodel/channels/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

.field public final synthetic y:Lio/getstream/chat/android/models/Channel;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/Channel;I)V
    .locals 0

    iput p3, p0, Lio/getstream/chat/android/ui/viewmodel/channels/b;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/b;->x:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/channels/b;->y:Lio/getstream/chat/android/models/Channel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/b;->y:Lio/getstream/chat/android/models/Channel;

    check-cast p1, Ln23/e;

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/b;->x:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->n(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/Channel;Ln23/e;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/b;->y:Lio/getstream/chat/android/models/Channel;

    check-cast p1, Ln23/e;

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/b;->x:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->g(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/Channel;Ln23/e;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
