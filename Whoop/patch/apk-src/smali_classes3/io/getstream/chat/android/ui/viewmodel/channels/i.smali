.class public final synthetic Lio/getstream/chat/android/ui/viewmodel/channels/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;


# instance fields
.field public final synthetic a:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/i;->a:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    return-void
.end method


# virtual methods
.method public final onClick(Lio/getstream/chat/android/models/Channel;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/i;->a:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding;->i(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/Channel;)V

    return-void
.end method
