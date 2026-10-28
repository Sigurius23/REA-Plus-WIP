.class public Lio/getstream/chat/android/ui/feature/channels/actions/internal/DefaultChannelOptionItemsFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J,\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\t\u001a\u00020\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/actions/internal/DefaultChannelOptionItemsFactory;",
        "Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "createChannelOptionItems",
        "",
        "Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;",
        "selectedChannel",
        "Lio/getstream/chat/android/models/Channel;",
        "ownCapabilities",
        "",
        "",
        "style",
        "Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/DefaultChannelOptionItemsFactory;->context:Landroid/content/Context;

    return-void
.end method

.method private static final createChannelOptionItems$lambda$0()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final createChannelOptionItems$lambda$1()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final createChannelOptionItems$lambda$2()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method


# virtual methods
.method public final createChannelOptionItems(Lio/getstream/chat/android/models/Channel;Ljava/util/Set;Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Channel;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;",
            ">;"
        }
    .end annotation

    move-object v1, p1

    move-object/from16 v0, p2

    const-string v2, "selectedChannel"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "ownCapabilities"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "style"

    move-object/from16 v7, p3

    invoke-static {v7, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "leave-channel"

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "delete-channel"

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v7}, Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;->getViewInfoEnabled()Z

    move-result v0

    const/4 v9, 0x7

    const/4 v10, 0x0

    const-string v11, "getString(...)"

    if-eqz v0, :cond_0

    new-instance v0, Lio/getstream/chat/android/ui/common/state/channels/actions/ViewInfo;

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/DefaultChannelOptionItemsFactory;->context:Landroid/content/Context;

    sget v4, Lio/getstream/chat/android/ui/R$string;->stream_ui_channel_list_view_info:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lou1/a;

    invoke-direct {v4, v9}, Lou1/a;-><init>(I)V

    invoke-direct {v0, p1, v3, v4}, Lio/getstream/chat/android/ui/common/state/channels/actions/ViewInfo;-><init>(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lc93/a;)V

    move-object v12, v0

    goto :goto_0

    :cond_0
    move-object v12, v10

    :goto_0
    invoke-virtual {v7}, Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;->getLeaveGroupEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz v2, :cond_1

    new-instance v0, Lio/getstream/chat/android/ui/common/state/channels/actions/LeaveGroup;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/DefaultChannelOptionItemsFactory;->context:Landroid/content/Context;

    sget v3, Lio/getstream/chat/android/ui/R$string;->stream_ui_channel_list_leave_channel:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lou1/a;

    invoke-direct {v3, v9}, Lou1/a;-><init>(I)V

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/ui/common/state/channels/actions/LeaveGroup;-><init>(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lc93/a;Lio/getstream/chat/android/ui/common/state/channels/actions/ConfirmationPopup;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v13, v0

    goto :goto_1

    :cond_1
    move-object v13, v10

    :goto_1
    invoke-virtual {v7}, Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;->getDeleteConversationEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz v8, :cond_2

    new-instance v0, Lio/getstream/chat/android/ui/common/state/channels/actions/DeleteConversation;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/channels/actions/internal/DefaultChannelOptionItemsFactory;->context:Landroid/content/Context;

    sget v2, Lio/getstream/chat/android/ui/R$string;->stream_ui_channel_list_delete_channel:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lou1/a;

    invoke-direct {v3, v9}, Lou1/a;-><init>(I)V

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/ui/common/state/channels/actions/DeleteConversation;-><init>(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lc93/a;Lio/getstream/chat/android/ui/common/state/channels/actions/ConfirmationPopup;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v10, v0

    :cond_2
    const/4 v0, 0x3

    new-array v0, v0, [Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;

    const/4 v1, 0x0

    aput-object v12, v0, v1

    const/4 v1, 0x1

    aput-object v13, v0, v1

    const/4 v1, 0x2

    aput-object v10, v0, v1

    invoke-static {v0}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
