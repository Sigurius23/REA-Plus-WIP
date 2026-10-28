.class public final Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0011\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u0018J\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 \u00a2\u0006\u0004\u0008!\u0010\"J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020 \u00a2\u0006\u0004\u0008#\u0010\"J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0016\u00a2\u0006\u0004\u0008$\u0010\u0018J\r\u0010&\u001a\u00020%\u00a2\u0006\u0004\u0008&\u0010\'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010(R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010)R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010)R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010*R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010+R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010,R\u0016\u0010\u001c\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010+R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010-R\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010.R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000e\u00102R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u00103R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u00104R\u0016\u0010$\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008$\u0010+\u00a8\u00065"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;",
        "",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "",
        "cid",
        "(Ljava/lang/String;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;",
        "messageId",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;",
        "Ls23/g;",
        "mediaRecorder",
        "(Ls23/g;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandler;",
        "userLookupHandler",
        "userLookupHandlerCompat",
        "(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandler;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;",
        "(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;",
        "",
        "enforceUniqueReactions",
        "(Z)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;",
        "",
        "maxAttachmentCount",
        "(I)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;",
        "showSystemMessages",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;",
        "messageFooterVisibility",
        "(Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;",
        "dateSeparatorHandler",
        "(Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;",
        "threadDateSeparatorHandler",
        "threadLoadOlderToNewer",
        "Landroidx/lifecycle/a2;",
        "build",
        "()Landroidx/lifecycle/a2;",
        "Landroid/content/Context;",
        "Ljava/lang/String;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Z",
        "I",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;",
        "messagePositionHandler",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;",
        "Ls23/g;",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandler;",
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
.field private chatClient:Lio/getstream/chat/android/client/ChatClient;

.field private cid:Ljava/lang/String;

.field private final context:Landroid/content/Context;

.field private dateSeparatorHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;

.field private enforceUniqueReactions:Z

.field private maxAttachmentCount:I

.field private mediaRecorder:Ls23/g;

.field private messageFooterVisibility:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;

.field private messageId:Ljava/lang/String;

.field private messagePositionHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;

.field private showSystemMessages:Z

.field private threadDateSeparatorHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;

.field private threadLoadOlderToNewer:Z

.field private userLookupHandler:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;

.field private userLookupHandlerCompat:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->context:Landroid/content/Context;

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->enforceUniqueReactions:Z

    const/16 v1, 0x1e

    iput v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->maxAttachmentCount:I

    iput-boolean v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->showSystemMessages:Z

    sget-object v1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility$LastInGroup;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility$LastInGroup;

    iput-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->messageFooterVisibility:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;

    sget-object v1, Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;->Companion:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler$Companion;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler$Companion;->getDefaultDateSeparatorHandler()Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->dateSeparatorHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/list/a;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/a;-><init>(I)V

    iput-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->threadDateSeparatorHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;

    sget-object v1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;->Companion:Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v0, v4}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;->defaultHandler$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;JILjava/lang/Object;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->messagePositionHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;

    new-instance v0, Ls23/d;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "getApplicationContext(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Ls23/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->mediaRecorder:Ls23/g;

    return-void
.end method


# virtual methods
.method public final build()Landroidx/lifecycle/a2;
    .locals 25

    move-object/from16 v0, p0

    iget-object v3, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->cid:Ljava/lang/String;

    if-eqz v3, :cond_2

    new-instance v7, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;

    iget-object v8, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->context:Landroid/content/Context;

    iget-object v9, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->messageId:Ljava/lang/String;

    iget-object v10, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    move-object v11, v8

    iget-object v8, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->mediaRecorder:Ls23/g;

    iget-object v1, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->userLookupHandler:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;

    if-nez v1, :cond_1

    iget-object v1, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->userLookupHandlerCompat:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandler;

    if-eqz v1, :cond_0

    invoke-static {v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandlerKt;->toUserLookupHandler(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandler;)Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler;

    iget-object v2, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    iget-boolean v12, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->enforceUniqueReactions:Z

    iget v13, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->maxAttachmentCount:I

    iget-boolean v14, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->showSystemMessages:Z

    iget-object v15, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->messageFooterVisibility:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;

    iget-object v2, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->dateSeparatorHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;

    iget-object v4, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->threadDateSeparatorHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;

    iget-object v5, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->messagePositionHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;

    iget-boolean v6, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->threadLoadOlderToNewer:Z

    const v23, 0x160328

    const/16 v24, 0x0

    move-object/from16 v18, v5

    const/4 v5, 0x0

    move-object/from16 v17, v4

    move-object v4, v9

    move-object v9, v1

    move-object v1, v7

    const/4 v7, 0x0

    move/from16 v21, v6

    move-object v6, v10

    const/4 v10, 0x0

    move-object/from16 v16, v2

    move-object v2, v11

    const/4 v11, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v1 .. v24}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Channel cid should not be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final chatClient(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;
    .locals 1

    const-string v0, "chatClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    return-object p0
.end method

.method public final cid(Ljava/lang/String;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;
    .locals 1

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->cid:Ljava/lang/String;

    return-object p0
.end method

.method public final dateSeparatorHandler(Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;
    .locals 1

    const-string v0, "dateSeparatorHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->dateSeparatorHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;

    return-object p0
.end method

.method public final enforceUniqueReactions(Z)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->enforceUniqueReactions:Z

    return-object p0
.end method

.method public final maxAttachmentCount(I)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->maxAttachmentCount:I

    return-object p0
.end method

.method public final mediaRecorder(Ls23/g;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;
    .locals 1

    const-string v0, "mediaRecorder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->mediaRecorder:Ls23/g;

    return-object p0
.end method

.method public final messageFooterVisibility(Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;
    .locals 1

    const-string v0, "messageFooterVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->messageFooterVisibility:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;

    return-object p0
.end method

.method public final messageId(Ljava/lang/String;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->messageId:Ljava/lang/String;

    return-object p0
.end method

.method public final showSystemMessages(Z)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->showSystemMessages:Z

    return-object p0
.end method

.method public final threadDateSeparatorHandler(Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;
    .locals 1

    const-string v0, "threadDateSeparatorHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->threadDateSeparatorHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;

    return-object p0
.end method

.method public final threadLoadOlderToNewer(Z)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->threadLoadOlderToNewer:Z

    return-object p0
.end method

.method public final userLookupHandler(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;
    .locals 1

    const-string v0, "userLookupHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->userLookupHandler:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;

    return-object p0
.end method

.method public final userLookupHandlerCompat(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandler;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;
    .locals 1

    const-string v0, "userLookupHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;->userLookupHandlerCompat:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandler;

    return-object p0
.end method
