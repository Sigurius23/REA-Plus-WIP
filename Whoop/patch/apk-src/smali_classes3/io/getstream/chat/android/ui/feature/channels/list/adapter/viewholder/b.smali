.class public final synthetic Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/b;->a:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Lio/getstream/chat/android/models/Channel;)V
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/b;->b:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->z(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;Lio/getstream/chat/android/models/Channel;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/b;->b:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;->j(Lc93/a;Lio/getstream/chat/android/models/Channel;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/b;->b:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;->c(Lc93/a;Lio/getstream/chat/android/models/Channel;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/b;->b:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;->a(Lc93/a;Lio/getstream/chat/android/models/Channel;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
