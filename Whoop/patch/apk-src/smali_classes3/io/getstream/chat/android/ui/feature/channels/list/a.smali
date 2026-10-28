.class public final synthetic Lio/getstream/chat/android/ui/feature/channels/list/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ErrorEventHandler;
.implements Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelListUpdateListener;
.implements Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelOptionClickListener;
.implements Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelMemberClickListener;


# instance fields
.field public final synthetic a:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/a;->a:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChannelListUpdate(Ljava/util/List;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/a;->a:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->c(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Ljava/util/List;)V

    return-void
.end method

.method public onChannelOptionClick(Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/a;->a:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->f(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;)V

    return-void
.end method

.method public onErrorEvent(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/a;->a:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->d(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;)V

    return-void
.end method

.method public onMemberClick(Lio/getstream/chat/android/models/Member;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/a;->a:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->g(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/models/Member;)V

    return-void
.end method
