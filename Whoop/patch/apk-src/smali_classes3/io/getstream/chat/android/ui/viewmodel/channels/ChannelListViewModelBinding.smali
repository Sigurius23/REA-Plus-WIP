.class public final Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a#\u0010\u0008\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;",
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;",
        "view",
        "Landroidx/lifecycle/g0;",
        "lifecycleOwner",
        "Ll83/a0;",
        "bind",
        "(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Landroidx/lifecycle/g0;)V",
        "bindView",
        "stream-chat-android-ui-components_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Landroidx/lifecycle/t0;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding;->bindView$lambda$1(Landroidx/lifecycle/t0;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;)Ll83/a0;

    return-void
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding;->bindView$lambda$13(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;)Ll83/a0;

    return-void
.end method

.method public static final bind(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Landroidx/lifecycle/g0;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/lifecycle/t0;

    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;-><init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v1}, Landroidx/lifecycle/t0;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->getState()Landroidx/lifecycle/p0;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/viewmodel/channels/g;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lio/getstream/chat/android/ui/viewmodel/channels/g;-><init>(Landroidx/lifecycle/t0;I)V

    new-instance v3, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding$sam$androidx_lifecycle_Observer$0;

    invoke-direct {v3, v2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/t0;->b(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->getPaginationState()Landroidx/lifecycle/p0;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/viewmodel/channels/g;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Lio/getstream/chat/android/ui/viewmodel/channels/g;-><init>(Landroidx/lifecycle/t0;I)V

    new-instance v3, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding$sam$androidx_lifecycle_Observer$0;

    invoke-direct {v3, v2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/t0;->b(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->getTypingEvents()Landroidx/lifecycle/p0;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/viewmodel/channels/g;

    const/4 v3, 0x2

    invoke-direct {v2, v0, v3}, Lio/getstream/chat/android/ui/viewmodel/channels/g;-><init>(Landroidx/lifecycle/t0;I)V

    new-instance v3, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding$sam$androidx_lifecycle_Observer$0;

    invoke-direct {v3, v2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/t0;->b(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->getDraftMessages()Landroidx/lifecycle/p0;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/viewmodel/channels/g;

    const/4 v3, 0x3

    invoke-direct {v2, v0, v3}, Lio/getstream/chat/android/ui/viewmodel/channels/g;-><init>(Landroidx/lifecycle/t0;I)V

    new-instance v3, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding$sam$androidx_lifecycle_Observer$0;

    invoke-direct {v3, v2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/t0;->b(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V

    invoke-static {v0}, Landroidx/lifecycle/x1;->a(Landroidx/lifecycle/t0;)Landroidx/lifecycle/t0;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/channels/f;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lio/getstream/chat/android/ui/viewmodel/channels/f;-><init>(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;I)V

    new-instance v2, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding$sam$androidx_lifecycle_Observer$0;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p2, v2}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/channels/h;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/viewmodel/channels/h;-><init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)V

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->setOnEndReachedListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$EndReachedListener;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/list/b;

    invoke-direct {v0, p1, p0}, Lio/getstream/chat/android/ui/feature/channels/list/b;-><init>(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)V

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->setChannelDeleteClickListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/channels/i;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/viewmodel/channels/i;-><init>(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)V

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->setChannelLeaveClickListener(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelClickListener;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->getErrorEvents()Landroidx/lifecycle/p0;

    move-result-object p0

    new-instance v0, Lio/getstream/chat/android/client/api/state/EventObserver;

    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/channels/f;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lio/getstream/chat/android/ui/viewmodel/channels/f;-><init>(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;I)V

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/api/state/EventObserver;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, p2, v0}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    return-void
.end method

.method private static final bindView$lambda$0(Landroidx/lifecycle/t0;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;)Ll83/a0;
    .locals 8

    invoke-virtual {p0}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;

    if-eqz v1, :cond_0

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->copy$default(Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final bindView$lambda$1(Landroidx/lifecycle/t0;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;)Ll83/a0;
    .locals 8

    invoke-virtual {p0}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;

    if-eqz v1, :cond_0

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v6, 0xd

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v7}, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->copy$default(Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final bindView$lambda$11(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/Channel;)V
    .locals 3

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget p0, Lio/getstream/chat/android/ui/R$string;->stream_ui_channel_list_delete_confirmation_title:I

    invoke-virtual {v0, p0}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    sget v0, Lio/getstream/chat/android/ui/R$string;->stream_ui_channel_list_delete_confirmation_message:I

    invoke-virtual {p0, v0}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    sget v0, Lio/getstream/chat/android/ui/R$string;->stream_ui_channel_list_delete_confirmation_positive_button:I

    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/channels/e;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/channels/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    sget p1, Lio/getstream/chat/android/ui/R$string;->stream_ui_channel_list_delete_confirmation_negative_button:I

    new-instance p2, Lio/getstream/chat/android/ui/utils/c;

    const/4 v0, 0x1

    invoke-direct {p2, v0}, Lio/getstream/chat/android/ui/utils/c;-><init>(I)V

    invoke-virtual {p0, p1, p2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    return-void
.end method

.method private static final bindView$lambda$11$lambda$10(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method private static final bindView$lambda$11$lambda$9(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/Channel;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-interface {p2}, Landroid/content/DialogInterface;->dismiss()V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->deleteChannel(Lio/getstream/chat/android/models/Channel;)V

    return-void
.end method

.method private static final bindView$lambda$12(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/Channel;)V
    .locals 1

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->leaveChannel(Lio/getstream/chat/android/models/Channel;)V

    return-void
.end method

.method private static final bindView$lambda$13(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->showError(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final bindView$lambda$2(Landroidx/lifecycle/t0;Ljava/util/Map;)Ll83/a0;
    .locals 8

    invoke-virtual {p0}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;

    if-eqz v1, :cond_0

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v6, 0xb

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v4, p1

    invoke-static/range {v1 .. v7}, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->copy$default(Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final bindView$lambda$3(Landroidx/lifecycle/t0;Ljava/util/Map;)Ll83/a0;
    .locals 8

    invoke-virtual {p0}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;

    if-eqz v1, :cond_0

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, p1

    invoke-static/range {v1 .. v7}, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->copy$default(Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final bindView$lambda$7(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;)Ll83/a0;
    .locals 7

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->getPaginationState()Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;->getEndOfChannels()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->getPaginationState()Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;->getLoadingMore()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->setPaginationEnabled(Z)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->getState()Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;->getChannels()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    sget-object v3, Lm83/y;->w:Lm83/y;

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Channel;

    new-instance v4, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->getTypingEvents()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/models/TypingEvent;

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lio/getstream/chat/android/models/TypingEvent;->getUsers()Ljava/util/List;

    move-result-object v5

    if-nez v5, :cond_1

    goto :goto_2

    :cond_1
    move-object v3, v5

    :cond_2
    :goto_2
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->getDraftMessages()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/models/DraftMessage;

    invoke-direct {v4, v2, v3, v5}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;-><init>(Lio/getstream/chat/android/models/Channel;Ljava/util/List;Lio/getstream/chat/android/models/DraftMessage;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    sget-object v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$LoadingMoreItem;->INSTANCE:Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$LoadingMoreItem;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->getPaginationState()Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;->getLoadingMore()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    :goto_3
    invoke-static {v0}, Lwb3/f;->L(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v1, v0}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;->getState()Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;->isLoading()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->showLoadingView()V

    goto :goto_4

    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_6

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->hideLoadingView()V

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->setChannels(Ljava/util/List;)V

    goto :goto_4

    :cond_6
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->hideLoadingView()V

    invoke-virtual {p0, v3}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;->setChannels(Ljava/util/List;)V

    :goto_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final bindView$lambda$8(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;)V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$Action$ReachedEndOfList;->INSTANCE:Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$Action$ReachedEndOfList;

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;->onAction(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$Action;)V

    return-void
.end method

.method public static synthetic c(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/Channel;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding;->bindView$lambda$11(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/Channel;)V

    return-void
.end method

.method public static synthetic d(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/Channel;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding;->bindView$lambda$11$lambda$9(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/Channel;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic e(Landroidx/lifecycle/t0;Ljava/util/Map;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding;->bindView$lambda$2(Landroidx/lifecycle/t0;Ljava/util/Map;)Ll83/a0;

    return-void
.end method

.method public static synthetic f(Landroidx/lifecycle/t0;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding;->bindView$lambda$0(Landroidx/lifecycle/t0;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;)Ll83/a0;

    return-void
.end method

.method public static synthetic g(Landroidx/lifecycle/t0;Ljava/util/Map;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding;->bindView$lambda$3(Landroidx/lifecycle/t0;Ljava/util/Map;)Ll83/a0;

    return-void
.end method

.method public static synthetic h(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding;->bindView$lambda$7(Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;)Ll83/a0;

    return-void
.end method

.method public static synthetic i(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/Channel;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelBinding;->bindView$lambda$12(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;Lio/getstream/chat/android/models/Channel;)V

    return-void
.end method
