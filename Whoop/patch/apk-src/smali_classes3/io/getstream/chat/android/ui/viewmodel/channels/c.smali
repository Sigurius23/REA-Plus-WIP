.class public final synthetic Lio/getstream/chat/android/ui/viewmodel/channels/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/viewmodel/channels/c;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/c;->x:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/c;->x:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    check-cast p1, Ln23/e;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->l(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Ln23/e;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/c;->x:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    check-cast p1, Lio/getstream/chat/android/models/FilterObject;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->j(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/FilterObject;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/c;->x:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    check-cast p1, Ln23/e;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$requestMoreChannels$1;->f(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Ln23/e;)V

    goto :goto_0

    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/c;->x:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->f(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Z)V

    goto :goto_0

    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/c;->x:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->k(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Z)V

    goto :goto_0

    :pswitch_4
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/c;->x:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->i(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Ljava/util/List;)V

    goto :goto_0

    :pswitch_5
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/c;->x:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    check-cast p1, Lio/getstream/chat/android/client/api/state/ChannelsStateData;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$init$1$1;->l(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/client/api/state/ChannelsStateData;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
