.class public final synthetic Lio/getstream/chat/android/ui/feature/channels/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView$ActionButtonClickListener;
.implements Lio/getstream/chat/android/ui/feature/channels/header/ChannelListHeaderView$UserAvatarClickListener;
.implements Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$SearchResultSelectedListener;
.implements Lio/getstream/chat/android/ui/feature/search/SearchInputView$InputChangedListener;


# instance fields
.field public final synthetic a:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/a;->a:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/a;->a:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->y(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;)V

    return-void
.end method

.method public onInputChanged(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/a;->a:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->C(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;Ljava/lang/String;)V

    return-void
.end method

.method public onSearchResultSelected(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/a;->a:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->A(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public onUserAvatarClick()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/a;->a:Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->B(Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;)V

    return-void
.end method
