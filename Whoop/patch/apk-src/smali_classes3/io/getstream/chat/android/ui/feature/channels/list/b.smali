.class public final synthetic Lio/getstream/chat/android/ui/feature/channels/list/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/b;->c:Ljava/lang/Object;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/channels/list/b;->b:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/b;->b:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/channels/list/b;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onClick(Lio/getstream/chat/android/models/Channel;)V
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/b;->c:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/b;->b:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding;->c(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/Channel;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/b;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/b;->b:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->b(Landroid/content/Context;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/models/Channel;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
