.class public final Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/a2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001:\u0001EB\u00e7\u0001\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0014\u0008\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u0010\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0013\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0015\u0012\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0019\u0012\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001b\u0012\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001b\u0012\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u001e\u0012\u0008\u0008\u0002\u0010 \u001a\u00020\u0015\u0012\u0008\u0008\u0002\u0010!\u001a\u00020\u0015\u0012\u0008\u0008\u0002\u0010\"\u001a\u00020\u0015\u0012\u0008\u0008\u0002\u0010#\u001a\u00020\u0015\u00a2\u0006\u0004\u0008$\u0010%J/\u0010,\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\'*\u00020&2\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010+\u001a\u00020*H\u0002\u00a2\u0006\u0004\u0008,\u0010-J/\u00100\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\'*\u00020&2\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010/\u001a\u00020.H\u0016\u00a2\u0006\u0004\u00080\u00101J\'\u00100\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\'*\u00020&2\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00028\u00000(H\u0016\u00a2\u0006\u0004\u00080\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u00103R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u00103R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u00103R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u00105R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u00106R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u00107R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u00108R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u00109R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010:R\u0014\u0010\u0017\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u00109R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010:R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010;R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010<R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010<R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010=R\u0014\u0010 \u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010:R\u0014\u0010!\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010:R\u0014\u0010\"\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010:R\u0014\u0010#\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010:R#\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010?0>8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008@\u0010A\u001a\u0004\u0008B\u0010C\u00a8\u0006F"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;",
        "Landroidx/lifecycle/a2;",
        "Landroid/content/Context;",
        "context",
        "",
        "cid",
        "messageId",
        "parentMessageId",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "Ls23/g;",
        "mediaRecorder",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;",
        "userLookupHandler",
        "Lkotlin/Function1;",
        "Ljava/io/File;",
        "fileToUri",
        "",
        "messageLimit",
        "",
        "enforceUniqueReactions",
        "maxAttachmentCount",
        "showSystemMessages",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;",
        "messageFooterVisibility",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;",
        "dateSeparatorHandler",
        "threadDateSeparatorHandler",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;",
        "messagePositionHandler",
        "showDateSeparatorInEmptyThread",
        "showThreadSeparatorInEmptyThread",
        "threadLoadOlderToNewer",
        "isComposerDraftMessagesEnabled",
        "<init>",
        "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZ)V",
        "Landroidx/lifecycle/w1;",
        "T",
        "Ljava/lang/Class;",
        "modelClass",
        "Landroidx/lifecycle/k1;",
        "savedStateHandle",
        "createInternal",
        "(Ljava/lang/Class;Landroidx/lifecycle/k1;)Landroidx/lifecycle/w1;",
        "Ll8/c;",
        "extras",
        "create",
        "(Ljava/lang/Class;Ll8/c;)Landroidx/lifecycle/w1;",
        "(Ljava/lang/Class;)Landroidx/lifecycle/w1;",
        "Ljava/lang/String;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "Ls23/g;",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;",
        "Lkotlin/jvm/functions/Function1;",
        "I",
        "Z",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;",
        "Lec3/f2;",
        "Lio/getstream/chat/android/client/channel/state/ChannelState;",
        "channelStateFlow$delegate",
        "Ll83/h;",
        "getChannelStateFlow",
        "()Lec3/f2;",
        "channelStateFlow",
        "Builder",
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
.field private final channelStateFlow$delegate:Ll83/h;

.field private final chatClient:Lio/getstream/chat/android/client/ChatClient;

.field private final cid:Ljava/lang/String;

.field private final clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

.field private final dateSeparatorHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;

.field private final enforceUniqueReactions:Z

.field private final fileToUri:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final isComposerDraftMessagesEnabled:Z

.field private final maxAttachmentCount:I

.field private final mediaRecorder:Ls23/g;

.field private final messageFooterVisibility:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;

.field private final messageId:Ljava/lang/String;

.field private final messageLimit:I

.field private final messagePositionHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;

.field private final parentMessageId:Ljava/lang/String;

.field private final showDateSeparatorInEmptyThread:Z

.field private final showSystemMessages:Z

.field private final showThreadSeparatorInEmptyThread:Z

.field private final threadDateSeparatorHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;

.field private final threadLoadOlderToNewer:Z

.field private final userLookupHandler:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 25

    .line 1
    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v23, 0x1ffffc

    const/16 v24, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v1, p0

    invoke-direct/range {v1 .. v24}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 25

    .line 2
    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v23, 0x1ffff8

    const/16 v24, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v24}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 25

    .line 3
    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v23, 0x1ffff0

    const/16 v24, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    invoke-direct/range {v1 .. v24}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;)V
    .locals 25

    .line 4
    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v23, 0x1fffe0

    const/16 v24, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    invoke-direct/range {v1 .. v24}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;)V
    .locals 25

    .line 5
    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v23, 0x1fffc0

    const/16 v24, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    invoke-direct/range {v1 .. v24}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;)V
    .locals 25

    .line 6
    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mediaRecorder"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v23, 0x1fff80

    const/16 v24, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    invoke-direct/range {v1 .. v24}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;)V
    .locals 25

    .line 7
    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mediaRecorder"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userLookupHandler"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v23, 0x1fff00

    const/16 v24, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    invoke-direct/range {v1 .. v24}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/client/setup/state/ClientState;",
            "Ls23/g;",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    .line 8
    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mediaRecorder"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userLookupHandler"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileToUri"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v23, 0x1ffe00

    const/16 v24, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    invoke-direct/range {v1 .. v24}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;I)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/client/setup/state/ClientState;",
            "Ls23/g;",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;",
            "Lkotlin/jvm/functions/Function1;",
            "I)V"
        }
    .end annotation

    .line 9
    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mediaRecorder"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userLookupHandler"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileToUri"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v23, 0x1ffc00

    const/16 v24, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v11, p10

    invoke-direct/range {v1 .. v24}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZ)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/client/setup/state/ClientState;",
            "Ls23/g;",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;",
            "Lkotlin/jvm/functions/Function1;",
            "IZ)V"
        }
    .end annotation

    .line 10
    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mediaRecorder"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userLookupHandler"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileToUri"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v23, 0x1ff800

    const/16 v24, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v11, p10

    move/from16 v12, p11

    invoke-direct/range {v1 .. v24}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZI)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/client/setup/state/ClientState;",
            "Ls23/g;",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;",
            "Lkotlin/jvm/functions/Function1;",
            "IZI)V"
        }
    .end annotation

    .line 11
    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mediaRecorder"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userLookupHandler"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileToUri"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v23, 0x1ff000

    const/16 v24, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    invoke-direct/range {v1 .. v24}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZ)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/client/setup/state/ClientState;",
            "Ls23/g;",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;",
            "Lkotlin/jvm/functions/Function1;",
            "IZIZ)V"
        }
    .end annotation

    .line 12
    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mediaRecorder"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userLookupHandler"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileToUri"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v23, 0x1fe000

    const/16 v24, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    invoke-direct/range {v1 .. v24}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/client/setup/state/ClientState;",
            "Ls23/g;",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;",
            "Lkotlin/jvm/functions/Function1;",
            "IZIZ",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;",
            ")V"
        }
    .end annotation

    .line 13
    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mediaRecorder"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userLookupHandler"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileToUri"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageFooterVisibility"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v23, 0x1fc000

    const/16 v24, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    invoke-direct/range {v1 .. v24}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/client/setup/state/ClientState;",
            "Ls23/g;",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;",
            "Lkotlin/jvm/functions/Function1;",
            "IZIZ",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;",
            ")V"
        }
    .end annotation

    .line 14
    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mediaRecorder"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userLookupHandler"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileToUri"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageFooterVisibility"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateSeparatorHandler"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v23, 0x1f8000

    const/16 v24, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move-object/from16 v16, v1

    move-object/from16 v1, p0

    invoke-direct/range {v1 .. v24}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/client/setup/state/ClientState;",
            "Ls23/g;",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;",
            "Lkotlin/jvm/functions/Function1;",
            "IZIZ",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;",
            ")V"
        }
    .end annotation

    .line 15
    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mediaRecorder"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userLookupHandler"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileToUri"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageFooterVisibility"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateSeparatorHandler"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadDateSeparatorHandler"

    move-object/from16 v4, p16

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v23, 0x1f0000

    const/16 v24, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v5, p4

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move-object/from16 v16, v1

    move-object/from16 v17, v4

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v24}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/client/setup/state/ClientState;",
            "Ls23/g;",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;",
            "Lkotlin/jvm/functions/Function1;",
            "IZIZ",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;",
            ")V"
        }
    .end annotation

    .line 16
    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mediaRecorder"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userLookupHandler"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileToUri"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageFooterVisibility"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateSeparatorHandler"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadDateSeparatorHandler"

    move-object/from16 v4, p16

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messagePositionHandler"

    move-object/from16 v5, p17

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v23, 0x1e0000

    const/16 v24, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move-object/from16 v16, v1

    move-object/from16 v17, v4

    move-object/from16 v18, v5

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    invoke-direct/range {v1 .. v24}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;Z)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/client/setup/state/ClientState;",
            "Ls23/g;",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;",
            "Lkotlin/jvm/functions/Function1;",
            "IZIZ",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;",
            "Z)V"
        }
    .end annotation

    .line 17
    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mediaRecorder"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userLookupHandler"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileToUri"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageFooterVisibility"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateSeparatorHandler"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadDateSeparatorHandler"

    move-object/from16 v4, p16

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messagePositionHandler"

    move-object/from16 v5, p17

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v23, 0x1c0000

    const/16 v24, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v19, p18

    move-object/from16 v16, v1

    move-object/from16 v17, v4

    move-object/from16 v18, v5

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    invoke-direct/range {v1 .. v24}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZ)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/client/setup/state/ClientState;",
            "Ls23/g;",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;",
            "Lkotlin/jvm/functions/Function1;",
            "IZIZ",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;",
            "ZZ)V"
        }
    .end annotation

    .line 18
    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mediaRecorder"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userLookupHandler"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileToUri"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageFooterVisibility"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateSeparatorHandler"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadDateSeparatorHandler"

    move-object/from16 v4, p16

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messagePositionHandler"

    move-object/from16 v5, p17

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v23, 0x180000

    const/16 v24, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v19, p18

    move/from16 v20, p19

    move-object/from16 v16, v1

    move-object/from16 v17, v4

    move-object/from16 v18, v5

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    invoke-direct/range {v1 .. v24}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZ)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/client/setup/state/ClientState;",
            "Ls23/g;",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;",
            "Lkotlin/jvm/functions/Function1;",
            "IZIZ",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;",
            "ZZZ)V"
        }
    .end annotation

    .line 19
    const-string v0, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mediaRecorder"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userLookupHandler"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileToUri"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageFooterVisibility"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateSeparatorHandler"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadDateSeparatorHandler"

    move-object/from16 v4, p16

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messagePositionHandler"

    move-object/from16 v5, p17

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v23, 0x100000

    const/16 v24, 0x0

    const/16 v22, 0x0

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v19, p18

    move/from16 v20, p19

    move/from16 v21, p20

    move-object/from16 v16, v1

    move-object/from16 v17, v4

    move-object/from16 v18, v5

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    invoke-direct/range {v1 .. v24}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZ)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/client/setup/state/ClientState;",
            "Ls23/g;",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;",
            "Lkotlin/jvm/functions/Function1;",
            "IZIZ",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;",
            "ZZZZ)V"
        }
    .end annotation

    move-object v0, p6

    move-object/from16 v1, p7

    move-object/from16 v2, p8

    move-object/from16 v3, p9

    move-object/from16 v4, p14

    move-object/from16 v5, p15

    move-object/from16 v6, p16

    move-object/from16 v7, p17

    const-string v8, "context"

    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "cid"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "chatClient"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "clientState"

    invoke-static {p6, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "mediaRecorder"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "userLookupHandler"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "fileToUri"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "messageFooterVisibility"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "dateSeparatorHandler"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "threadDateSeparatorHandler"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "messagePositionHandler"

    invoke-static {v7, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->cid:Ljava/lang/String;

    .line 22
    iput-object p3, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->messageId:Ljava/lang/String;

    .line 23
    iput-object p4, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->parentMessageId:Ljava/lang/String;

    .line 24
    iput-object p5, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    .line 25
    iput-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    .line 26
    iput-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->mediaRecorder:Ls23/g;

    .line 27
    iput-object v2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->userLookupHandler:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;

    .line 28
    iput-object v3, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->fileToUri:Lkotlin/jvm/functions/Function1;

    move/from16 p1, p10

    .line 29
    iput p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->messageLimit:I

    move/from16 p1, p11

    .line 30
    iput-boolean p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->enforceUniqueReactions:Z

    move/from16 p1, p12

    .line 31
    iput p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->maxAttachmentCount:I

    move/from16 p1, p13

    .line 32
    iput-boolean p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->showSystemMessages:Z

    .line 33
    iput-object v4, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->messageFooterVisibility:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;

    .line 34
    iput-object v5, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->dateSeparatorHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;

    .line 35
    iput-object v6, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->threadDateSeparatorHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;

    .line 36
    iput-object v7, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->messagePositionHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;

    move/from16 p1, p18

    .line 37
    iput-boolean p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->showDateSeparatorInEmptyThread:Z

    move/from16 p1, p19

    .line 38
    iput-boolean p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->showThreadSeparatorInEmptyThread:Z

    move/from16 p1, p20

    .line 39
    iput-boolean p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->threadLoadOlderToNewer:Z

    move/from16 p1, p21

    .line 40
    iput-boolean p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->isComposerDraftMessagesEnabled:Z

    .line 41
    new-instance p1, Lio/getstream/chat/android/ui/viewmodel/messages/b;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->channelStateFlow$delegate:Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 25

    move/from16 v0, p22

    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v6, v2

    goto :goto_0

    :cond_0
    move-object/from16 v6, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    move-object v7, v2

    goto :goto_1

    :cond_1
    move-object/from16 v7, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    .line 42
    sget-object v1, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v1

    move-object v8, v1

    goto :goto_2

    :cond_2
    move-object/from16 v8, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    .line 43
    invoke-virtual {v8}, Lio/getstream/chat/android/client/ChatClient;->getClientState()Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object v1

    move-object v9, v1

    goto :goto_3

    :cond_3
    move-object/from16 v9, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    .line 44
    new-instance v1, Ls23/d;

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "getApplicationContext(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v3}, Ls23/d;-><init>(Landroid/content/Context;)V

    move-object v10, v1

    goto :goto_4

    :cond_4
    move-object/from16 v10, p7

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    .line 45
    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler;

    const/4 v3, 0x4

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 p5, p2

    move-object/from16 p3, v1

    move/from16 p7, v3

    move-object/from16 p8, v4

    move-object/from16 p6, v5

    move-object/from16 p4, v8

    invoke-direct/range {p3 .. p8}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v11, v1

    goto :goto_5

    :cond_5
    move-object/from16 v11, p8

    :goto_5
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_6

    .line 46
    new-instance v1, Lio/getstream/chat/android/ui/common/utils/extensions/a;

    const/16 v3, 0x1b

    invoke-direct {v1, v3}, Lio/getstream/chat/android/ui/common/utils/extensions/a;-><init>(I)V

    move-object v12, v1

    goto :goto_6

    :cond_6
    move-object/from16 v12, p9

    :goto_6
    and-int/lit16 v1, v0, 0x200

    const/16 v3, 0x1e

    if-eqz v1, :cond_7

    move v13, v3

    goto :goto_7

    :cond_7
    move/from16 v13, p10

    :goto_7
    and-int/lit16 v1, v0, 0x400

    const/4 v4, 0x1

    if-eqz v1, :cond_8

    move v14, v4

    goto :goto_8

    :cond_8
    move/from16 v14, p11

    :goto_8
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_9

    move v15, v3

    goto :goto_9

    :cond_9
    move/from16 v15, p12

    :goto_9
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_a

    move/from16 v16, v4

    goto :goto_a

    :cond_a
    move/from16 v16, p13

    :goto_a
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_b

    .line 47
    sget-object v1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility$LastInGroup;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility$LastInGroup;

    move-object/from16 v17, v1

    goto :goto_b

    :cond_b
    move-object/from16 v17, p14

    :goto_b
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_c

    .line 48
    sget-object v1, Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;->Companion:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler$Companion;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler$Companion;->getDefaultDateSeparatorHandler()Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;

    move-result-object v1

    move-object/from16 v18, v1

    goto :goto_c

    :cond_c
    move-object/from16 v18, p15

    :goto_c
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_d

    .line 49
    sget-object v1, Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;->Companion:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler$Companion;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler$Companion;->getDefaultThreadDateSeparatorHandler()Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;

    move-result-object v1

    move-object/from16 v19, v1

    goto :goto_d

    :cond_d
    move-object/from16 v19, p16

    :goto_d
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_e

    .line 50
    sget-object v1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;->Companion:Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;

    move-object/from16 p3, v6

    const-wide/16 v5, 0x0

    invoke-static {v1, v5, v6, v4, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;->defaultHandler$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;JILjava/lang/Object;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;

    move-result-object v1

    move-object/from16 v20, v1

    goto :goto_e

    :cond_e
    move-object/from16 p3, v6

    move-object/from16 v20, p17

    :goto_e
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    const/4 v2, 0x0

    if-eqz v1, :cond_f

    move/from16 v21, v2

    goto :goto_f

    :cond_f
    move/from16 v21, p18

    :goto_f
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_10

    move/from16 v22, v2

    goto :goto_10

    :cond_10
    move/from16 v22, p19

    :goto_10
    const/high16 v1, 0x80000

    and-int/2addr v1, v0

    if-eqz v1, :cond_11

    move/from16 v23, v2

    goto :goto_11

    :cond_11
    move/from16 v23, p20

    :goto_11
    const/high16 v1, 0x100000

    and-int/2addr v0, v1

    if-eqz v0, :cond_12

    .line 51
    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getDraftMessagesEnabled()Z

    move-result v0

    move/from16 v24, v0

    :goto_12
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    goto :goto_13

    :cond_12
    move/from16 v24, p21

    goto :goto_12

    .line 52
    :goto_13
    invoke-direct/range {v3 .. v24}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZ)V

    return-void
.end method

.method private static final _init_$lambda$0(Ljava/io/File;)Ljava/lang/String;
    .locals 1

    const-string v0, "file"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lbc3/k1;)Lbc3/e2;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->channelStateFlow_delegate$lambda$2$lambda$1(Lbc3/k1;)Lq83/j;

    move-result-object p0

    check-cast p0, Lbc3/e2;

    return-object p0
.end method

.method public static synthetic b(Ljava/io/File;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->_init_$lambda$0(Ljava/io/File;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;)Lec3/r1;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->channelStateFlow_delegate$lambda$2(Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;)Lec3/f2;

    move-result-object p0

    check-cast p0, Lec3/r1;

    return-object p0
.end method

.method private static final channelStateFlow_delegate$lambda$2(Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;)Lec3/f2;
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    new-instance v1, Lio/getstream/chat/android/ui/common/utils/extensions/a;

    const/16 v2, 0x1a

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/common/utils/extensions/a;-><init>(I)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/ChatClient;->inheritScope(Lkotlin/jvm/functions/Function1;)Lbc3/c0;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->messageId:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->parentMessageId:Ljava/lang/String;

    if-nez v2, :cond_0

    iget-object v2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-object v3, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->cid:Ljava/lang/String;

    iget p0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->messageLimit:I

    invoke-static {v2, v3, p0, v1, v0}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->watchChannelAsState(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ILjava/lang/String;Lbc3/c0;)Lec3/f2;

    move-result-object p0

    return-object p0

    :cond_0
    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->cid:Ljava/lang/String;

    iget p0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->messageLimit:I

    invoke-static {v1, v2, p0, v0}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->watchChannelAsState(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ILbc3/c0;)Lec3/f2;

    move-result-object p0

    return-object p0
.end method

.method private static final channelStateFlow_delegate$lambda$2$lambda$1(Lbc3/k1;)Lq83/j;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbc3/e2;

    invoke-direct {v0, p0}, Lbc3/l1;-><init>(Lbc3/k1;)V

    return-object v0
.end method

.method private final createInternal(Ljava/lang/Class;Landroidx/lifecycle/k1;)Landroidx/lifecycle/w1;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/w1;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Landroidx/lifecycle/k1;",
            ")TT;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-class v2, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v3, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;

    iget-object v4, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->cid:Ljava/lang/String;

    iget-object v7, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->messageId:Ljava/lang/String;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v9}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_0
    const-class v2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    iget-object v3, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->cid:Ljava/lang/String;

    new-instance v4, Li7/g;

    const/16 v2, 0xc

    invoke-direct {v4, v2}, Li7/g;-><init>(I)V

    iget-boolean v5, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->threadLoadOlderToNewer:Z

    iget v8, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->messageLimit:I

    iget-object v6, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->messageId:Ljava/lang/String;

    iget-object v7, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->parentMessageId:Ljava/lang/String;

    iget-object v9, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-object v10, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->getChannelStateFlow()Lec3/f2;

    move-result-object v11

    iget-boolean v14, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->enforceUniqueReactions:Z

    iget-boolean v12, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->showSystemMessages:Z

    iget-object v13, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->messageFooterVisibility:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;

    iget-object v15, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->dateSeparatorHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;

    iget-object v2, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->threadDateSeparatorHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;

    move-object/from16 v16, v2

    iget-object v2, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->messagePositionHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;

    move-object/from16 v17, v2

    iget-boolean v2, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->showDateSeparatorInEmptyThread:Z

    move/from16 v18, v2

    iget-boolean v2, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->showThreadSeparatorInEmptyThread:Z

    move/from16 v19, v2

    new-instance v2, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-direct/range {v2 .. v19}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;-><init>(Ljava/lang/String;Lio/getstream/chat/android/ui/common/helper/ClipboardHandler;ZLjava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Lec3/f2;ZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;ZLio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZ)V

    iget-object v3, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-direct {v1, v2, v3}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/client/ChatClient;)V

    return-object v1

    :cond_1
    const-class v2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;

    iget-object v3, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->cid:Ljava/lang/String;

    iget-object v4, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-object v6, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->mediaRecorder:Ls23/g;

    iget-object v7, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->userLookupHandler:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;

    iget-object v8, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->fileToUri:Lkotlin/jvm/functions/Function1;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->getChannelStateFlow()Lec3/f2;

    move-result-object v5

    new-instance v9, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;

    iget v10, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->maxAttachmentCount:I

    iget-boolean v12, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->isComposerDraftMessagesEnabled:Z

    const/16 v14, 0xa

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;-><init>(IZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    const/16 v12, 0x80

    const/4 v13, 0x0

    const/4 v10, 0x0

    move-object/from16 v11, p2

    invoke-direct/range {v2 .. v13}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lec3/f2;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;Lec3/l;Landroidx/lifecycle/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)V

    return-object v1

    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "ChannelViewModelFactory can only create instances of the following classes: ChannelHeaderViewModel, MessageListViewModel, or MessageComposerViewModel."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private static final createInternal$lambda$3(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic d(Lio/getstream/chat/android/models/Message;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->createInternal$lambda$3(Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method private final getChannelStateFlow()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->channelStateFlow$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lec3/f2;

    return-object v0
.end method


# virtual methods
.method public final create(Lj93/d;Ll8/c;)Landroidx/lifecycle/w1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/w1;",
            ">(",
            "Lj93/d;",
            "Ll8/c;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/lifecycle/a2;->create(Lj93/d;Ll8/c;)Landroidx/lifecycle/w1;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Class;)Landroidx/lifecycle/w1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/w1;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Landroidx/lifecycle/k1;

    invoke-direct {v0}, Landroidx/lifecycle/k1;-><init>()V

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->createInternal(Ljava/lang/Class;Landroidx/lifecycle/k1;)Landroidx/lifecycle/w1;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Class;Ll8/c;)Landroidx/lifecycle/w1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/w1;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ll8/c;",
            ")TT;"
        }
    .end annotation

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p2}, Landroidx/lifecycle/o1;->e(Ll8/c;)Landroidx/lifecycle/k1;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;->createInternal(Ljava/lang/Class;Landroidx/lifecycle/k1;)Landroidx/lifecycle/w1;

    move-result-object p1

    return-object p1
.end method
