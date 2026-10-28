.class public final synthetic Lio/getstream/chat/android/ui/viewmodel/channels/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$EndReachedListener;


# instance fields
.field public final synthetic a:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/h;->a:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    return-void
.end method


# virtual methods
.method public final onEndReached()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/h;->a:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;

    sget-object v1, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$Action$ReachedEndOfList;->INSTANCE:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$Action$ReachedEndOfList;

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->onAction(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$Action;)V

    return-void
.end method
