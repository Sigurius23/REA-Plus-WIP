.class public final Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u00088\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u00e9\u0001\u0008\u0007\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0005\u0012\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0005\u0012\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0005\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0016\u0012\u000e\u0008\u0002\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0018\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0016\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001c\u0012\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u0016\u0012\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u0016\u0012\u000e\u0008\u0002\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020 0\u0018\u0012\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\"\u0010#J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010B\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000f\u0010D\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0005H\u00c6\u0003J\u000f\u0010E\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0005H\u00c6\u0003J\u000f\u0010F\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0005H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\t\u0010H\u001a\u00020\u0012H\u00c6\u0003J\t\u0010I\u001a\u00020\u0014H\u00c6\u0003J\t\u0010J\u001a\u00020\u0016H\u00c6\u0003J\u000f\u0010K\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0018H\u00c6\u0003J\t\u0010L\u001a\u00020\u0016H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\t\u0010N\u001a\u00020\u001cH\u00c6\u0003J\t\u0010O\u001a\u00020\u0016H\u00c6\u0003J\t\u0010P\u001a\u00020\u0016H\u00c6\u0003J\u000f\u0010Q\u001a\u0008\u0012\u0004\u0012\u00020 0\u0018H\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u00e9\u0001\u0010S\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00052\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00052\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00052\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\u000e\u0008\u0002\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00182\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00162\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001c2\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u00162\u000e\u0008\u0002\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020 0\u00182\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001J\u0013\u0010T\u001a\u00020\u00162\u0008\u0010U\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010V\u001a\u00020\u0012H\u00d6\u0001J\t\u0010W\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0017\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010\'R\u0017\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010\'R\u0017\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010\'R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u00102R\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u00104R\u0017\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u00106R\u0011\u0010\u0019\u001a\u00020\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u00104R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u00109R\u0011\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u0010;R\u0011\u0010\u001d\u001a\u00020\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u00104R\u0011\u0010\u001e\u001a\u00020\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u00104R\u0017\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020 0\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u00106R\u0013\u0010!\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u0010@\u00a8\u0006X"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;",
        "",
        "inputValue",
        "",
        "attachments",
        "",
        "Lio/getstream/chat/android/models/Attachment;",
        "action",
        "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
        "validationErrors",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;",
        "mentionSuggestions",
        "Lio/getstream/chat/android/models/User;",
        "commandSuggestions",
        "Lio/getstream/chat/android/models/Command;",
        "linkPreview",
        "Lio/getstream/chat/android/models/LinkPreview;",
        "coolDownTime",
        "",
        "messageMode",
        "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;",
        "alsoSendToChannel",
        "",
        "ownCapabilities",
        "",
        "hasCommands",
        "currentUser",
        "recording",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;",
        "pollsEnabled",
        "sendEnabled",
        "selectedMentions",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention;",
        "activeCommand",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;)V",
        "getInputValue",
        "()Ljava/lang/String;",
        "getAttachments",
        "()Ljava/util/List;",
        "getAction",
        "()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
        "getValidationErrors",
        "getMentionSuggestions",
        "getCommandSuggestions",
        "getLinkPreview",
        "()Lio/getstream/chat/android/models/LinkPreview;",
        "getCoolDownTime",
        "()I",
        "getMessageMode",
        "()Lio/getstream/chat/android/ui/common/state/messages/MessageMode;",
        "getAlsoSendToChannel",
        "()Z",
        "getOwnCapabilities",
        "()Ljava/util/Set;",
        "getHasCommands",
        "getCurrentUser",
        "()Lio/getstream/chat/android/models/User;",
        "getRecording",
        "()Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;",
        "getPollsEnabled",
        "getSendEnabled",
        "getSelectedMentions",
        "getActiveCommand",
        "()Lio/getstream/chat/android/models/Command;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "stream-chat-android-ui-common_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final action:Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

.field private final activeCommand:Lio/getstream/chat/android/models/Command;

.field private final alsoSendToChannel:Z

.field private final attachments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;"
        }
    .end annotation
.end field

.field private final commandSuggestions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Command;",
            ">;"
        }
    .end annotation
.end field

.field private final coolDownTime:I

.field private final currentUser:Lio/getstream/chat/android/models/User;

.field private final hasCommands:Z

.field private final inputValue:Ljava/lang/String;

.field private final linkPreview:Lio/getstream/chat/android/models/LinkPreview;

.field private final mentionSuggestions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation
.end field

.field private final messageMode:Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

.field private final ownCapabilities:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final pollsEnabled:Z

.field private final recording:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

.field private final selectedMentions:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention;",
            ">;"
        }
    .end annotation
.end field

.field private final sendEnabled:Z

.field private final validationErrors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 21

    .line 1
    const v19, 0x3ffff

    const/16 v20, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

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

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v20}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;-><init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 22

    .line 2
    const-string v0, "inputValue"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v20, 0x3fffe

    const/16 v21, 0x0

    const/4 v3, 0x0

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

    move-object/from16 v1, p0

    invoke-direct/range {v1 .. v21}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;-><init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;)V"
        }
    .end annotation

    .line 3
    const-string v0, "inputValue"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachments"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v20, 0x3fffc

    const/16 v21, 0x0

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

    move-object/from16 v1, p0

    invoke-direct/range {v1 .. v21}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;-><init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
            ")V"
        }
    .end annotation

    .line 4
    const-string v0, "inputValue"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachments"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v20, 0x3fff8

    const/16 v21, 0x0

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

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v21}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;-><init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;",
            ">;)V"
        }
    .end annotation

    .line 5
    const-string v0, "inputValue"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachments"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validationErrors"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v20, 0x3fff0

    const/16 v21, 0x0

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

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v21}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;-><init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;)V"
        }
    .end annotation

    .line 6
    const-string v0, "inputValue"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachments"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validationErrors"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentionSuggestions"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v20, 0x3ffe0

    const/16 v21, 0x0

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

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v21}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;-><init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Command;",
            ">;)V"
        }
    .end annotation

    .line 7
    const-string v0, "inputValue"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachments"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validationErrors"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentionSuggestions"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commandSuggestions"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v20, 0x3ffc0

    const/16 v21, 0x0

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

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v21}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;-><init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Command;",
            ">;",
            "Lio/getstream/chat/android/models/LinkPreview;",
            ")V"
        }
    .end annotation

    .line 8
    const-string v0, "inputValue"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachments"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validationErrors"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentionSuggestions"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commandSuggestions"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v20, 0x3ff80

    const/16 v21, 0x0

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

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v21}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;-><init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;I)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Command;",
            ">;",
            "Lio/getstream/chat/android/models/LinkPreview;",
            "I)V"
        }
    .end annotation

    .line 9
    const-string v0, "inputValue"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachments"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validationErrors"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentionSuggestions"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commandSuggestions"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v20, 0x3ff00

    const/16 v21, 0x0

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

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v1 .. v21}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;-><init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Command;",
            ">;",
            "Lio/getstream/chat/android/models/LinkPreview;",
            "I",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;",
            ")V"
        }
    .end annotation

    .line 10
    const-string v0, "inputValue"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachments"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validationErrors"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentionSuggestions"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commandSuggestions"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageMode"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v20, 0x3fe00

    const/16 v21, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v1 .. v21}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;-><init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;Z)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Command;",
            ">;",
            "Lio/getstream/chat/android/models/LinkPreview;",
            "I",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;",
            "Z)V"
        }
    .end annotation

    .line 11
    const-string v0, "inputValue"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachments"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validationErrors"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentionSuggestions"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commandSuggestions"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageMode"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v20, 0x3fc00

    const/16 v21, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v11, p10

    invoke-direct/range {v1 .. v21}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;-><init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Command;",
            ">;",
            "Lio/getstream/chat/android/models/LinkPreview;",
            "I",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;",
            "Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 12
    const-string v0, "inputValue"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachments"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validationErrors"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentionSuggestions"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commandSuggestions"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageMode"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v20, 0x3f800

    const/16 v21, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v11, p10

    invoke-direct/range {v1 .. v21}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;-><init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;Z)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Command;",
            ">;",
            "Lio/getstream/chat/android/models/LinkPreview;",
            "I",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;",
            "Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .line 13
    const-string v0, "inputValue"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachments"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validationErrors"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentionSuggestions"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commandSuggestions"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageMode"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v20, 0x3f000

    const/16 v21, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v11, p10

    move/from16 v13, p12

    invoke-direct/range {v1 .. v21}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;-><init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Command;",
            ">;",
            "Lio/getstream/chat/android/models/LinkPreview;",
            "I",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;",
            "Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;Z",
            "Lio/getstream/chat/android/models/User;",
            ")V"
        }
    .end annotation

    .line 14
    const-string v0, "inputValue"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachments"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validationErrors"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentionSuggestions"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commandSuggestions"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageMode"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v20, 0x3e000

    const/16 v21, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v11, p10

    move/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v1 .. v21}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;-><init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Command;",
            ">;",
            "Lio/getstream/chat/android/models/LinkPreview;",
            "I",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;",
            "Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;Z",
            "Lio/getstream/chat/android/models/User;",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;",
            ")V"
        }
    .end annotation

    .line 15
    const-string v0, "inputValue"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachments"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validationErrors"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentionSuggestions"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commandSuggestions"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageMode"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recording"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v20, 0x3c000

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v11, p10

    move/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v1 .. v21}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;-><init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;Z)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Command;",
            ">;",
            "Lio/getstream/chat/android/models/LinkPreview;",
            "I",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;",
            "Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;Z",
            "Lio/getstream/chat/android/models/User;",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;",
            "Z)V"
        }
    .end annotation

    .line 16
    const-string v0, "inputValue"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachments"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validationErrors"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentionSuggestions"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commandSuggestions"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageMode"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recording"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v20, 0x38000

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v11, p10

    move/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v16, p15

    invoke-direct/range {v1 .. v21}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;-><init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZ)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Command;",
            ">;",
            "Lio/getstream/chat/android/models/LinkPreview;",
            "I",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;",
            "Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;Z",
            "Lio/getstream/chat/android/models/User;",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;",
            "ZZ)V"
        }
    .end annotation

    .line 17
    const-string v0, "inputValue"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachments"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validationErrors"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentionSuggestions"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commandSuggestions"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageMode"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recording"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v20, 0x30000

    const/16 v21, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v11, p10

    move/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v16, p15

    move/from16 v17, p16

    invoke-direct/range {v1 .. v21}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;-><init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Command;",
            ">;",
            "Lio/getstream/chat/android/models/LinkPreview;",
            "I",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;",
            "Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;Z",
            "Lio/getstream/chat/android/models/User;",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;",
            "ZZ",
            "Ljava/util/Set<",
            "+",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention;",
            ">;)V"
        }
    .end annotation

    .line 18
    const-string v0, "inputValue"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachments"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validationErrors"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentionSuggestions"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commandSuggestions"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageMode"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recording"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedMentions"

    move-object/from16 v1, p17

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v20, 0x20000

    const/16 v21, 0x0

    const/16 v19, 0x0

    move-object/from16 v4, p3

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v11, p10

    move/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v16, p15

    move/from16 v17, p16

    move-object/from16 v18, v1

    move-object/from16 v1, p0

    invoke-direct/range {v1 .. v21}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;-><init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Command;",
            ">;",
            "Lio/getstream/chat/android/models/LinkPreview;",
            "I",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;",
            "Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;Z",
            "Lio/getstream/chat/android/models/User;",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;",
            "ZZ",
            "Ljava/util/Set<",
            "+",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention;",
            ">;",
            "Lio/getstream/chat/android/models/Command;",
            ")V"
        }
    .end annotation

    move-object v0, p11

    move-object/from16 v1, p14

    move-object/from16 v2, p17

    const-string v3, "inputValue"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "attachments"

    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "validationErrors"

    invoke-static {p4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "mentionSuggestions"

    invoke-static {p5, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "commandSuggestions"

    invoke-static {p6, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "messageMode"

    invoke-static {p9, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "ownCapabilities"

    invoke-static {p11, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "recording"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "selectedMentions"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->inputValue:Ljava/lang/String;

    .line 21
    iput-object p2, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->attachments:Ljava/util/List;

    .line 22
    iput-object p3, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->action:Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    .line 23
    iput-object p4, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->validationErrors:Ljava/util/List;

    .line 24
    iput-object p5, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->mentionSuggestions:Ljava/util/List;

    .line 25
    iput-object p6, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->commandSuggestions:Ljava/util/List;

    .line 26
    iput-object p7, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->linkPreview:Lio/getstream/chat/android/models/LinkPreview;

    .line 27
    iput p8, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->coolDownTime:I

    .line 28
    iput-object p9, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->messageMode:Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    .line 29
    iput-boolean p10, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->alsoSendToChannel:Z

    .line 30
    iput-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->ownCapabilities:Ljava/util/Set;

    move/from16 p1, p12

    .line 31
    iput-boolean p1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->hasCommands:Z

    move-object/from16 p1, p13

    .line 32
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->currentUser:Lio/getstream/chat/android/models/User;

    .line 33
    iput-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->recording:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    move/from16 p1, p15

    .line 34
    iput-boolean p1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->pollsEnabled:Z

    move/from16 p1, p16

    .line 35
    iput-boolean p1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->sendEnabled:Z

    .line 36
    iput-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->selectedMentions:Ljava/util/Set;

    move-object/from16 p1, p18

    .line 37
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->activeCommand:Lio/getstream/chat/android/models/Command;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move/from16 v0, p19

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 38
    const-string v1, ""

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    .line 39
    sget-object v3, Lm83/y;->w:Lm83/y;

    if-eqz v2, :cond_1

    move-object v2, v3

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    const/4 v4, 0x0

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    move-object v6, v3

    goto :goto_3

    :cond_3
    move-object/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    move-object v7, v3

    goto :goto_4

    :cond_4
    move-object/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    goto :goto_5

    :cond_5
    move-object/from16 v3, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    const/4 v8, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    const/4 v9, 0x0

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_8

    .line 40
    sget-object v11, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$Normal;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/MessageMode$Normal;

    goto :goto_8

    :cond_8
    move-object/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v0, 0x200

    if-eqz v12, :cond_9

    const/4 v12, 0x0

    goto :goto_9

    :cond_9
    move/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v0, 0x400

    .line 41
    sget-object v14, Lm83/a0;->w:Lm83/a0;

    if-eqz v13, :cond_a

    move-object v13, v14

    goto :goto_a

    :cond_a
    move-object/from16 v13, p11

    :goto_a
    and-int/lit16 v15, v0, 0x800

    if-eqz v15, :cond_b

    const/4 v15, 0x0

    goto :goto_b

    :cond_b
    move/from16 v15, p12

    :goto_b
    and-int/lit16 v5, v0, 0x1000

    if-eqz v5, :cond_c

    const/4 v5, 0x0

    goto :goto_c

    :cond_c
    move-object/from16 v5, p13

    :goto_c
    and-int/lit16 v10, v0, 0x2000

    if-eqz v10, :cond_d

    .line 42
    sget-object v10, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;

    goto :goto_d

    :cond_d
    move-object/from16 v10, p14

    :goto_d
    move-object/from16 p20, v1

    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_e

    const/4 v1, 0x0

    goto :goto_e

    :cond_e
    move/from16 v1, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    const/16 v16, 0x1

    goto :goto_f

    :cond_f
    move/from16 v16, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_10

    goto :goto_10

    :cond_10
    move-object/from16 v14, p17

    :goto_10
    const/high16 v17, 0x20000

    and-int v0, v0, v17

    if-eqz v0, :cond_11

    const/16 p19, 0x0

    :goto_11
    move-object/from16 p1, p0

    move-object/from16 p2, p20

    move/from16 p16, v1

    move-object/from16 p3, v2

    move-object/from16 p7, v3

    move-object/from16 p4, v4

    move-object/from16 p14, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p8, v8

    move/from16 p9, v9

    move-object/from16 p15, v10

    move-object/from16 p10, v11

    move/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p18, v14

    move/from16 p13, v15

    move/from16 p17, v16

    goto :goto_12

    :cond_11
    move-object/from16 p19, p18

    goto :goto_11

    .line 43
    :goto_12
    invoke-direct/range {p1 .. p19}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;-><init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p19

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->inputValue:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->attachments:Ljava/util/List;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->action:Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->validationErrors:Ljava/util/List;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->mentionSuggestions:Ljava/util/List;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->commandSuggestions:Ljava/util/List;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->linkPreview:Lio/getstream/chat/android/models/LinkPreview;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->coolDownTime:I

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->messageMode:Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-boolean v11, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->alsoSendToChannel:Z

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->ownCapabilities:Ljava/util/Set;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-boolean v13, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->hasCommands:Z

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->currentUser:Lio/getstream/chat/android/models/User;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->recording:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-boolean v2, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->pollsEnabled:Z

    goto :goto_e

    :cond_e
    move/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-boolean v1, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->sendEnabled:Z

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p19, v16

    move/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->selectedMentions:Ljava/util/Set;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p19, v16

    if-eqz v16, :cond_11

    move-object/from16 p3, v1

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->activeCommand:Lio/getstream/chat/android/models/Command;

    move-object/from16 p18, p3

    move-object/from16 p19, v1

    :goto_11
    move/from16 p17, p2

    move/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move/from16 p9, v9

    move-object/from16 p10, v10

    move/from16 p11, v11

    move-object/from16 p12, v12

    move/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_12

    :cond_11
    move-object/from16 p19, p18

    move-object/from16 p18, v1

    goto :goto_11

    :goto_12
    invoke-virtual/range {p1 .. p19}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->copy(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->inputValue:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->alsoSendToChannel:Z

    return v0
.end method

.method public final component11()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->ownCapabilities:Ljava/util/Set;

    return-object v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->hasCommands:Z

    return v0
.end method

.method public final component13()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->currentUser:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final component14()Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->recording:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    return-object v0
.end method

.method public final component15()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->pollsEnabled:Z

    return v0
.end method

.method public final component16()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->sendEnabled:Z

    return v0
.end method

.method public final component17()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->selectedMentions:Ljava/util/Set;

    return-object v0
.end method

.method public final component18()Lio/getstream/chat/android/models/Command;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->activeCommand:Lio/getstream/chat/android/models/Command;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->attachments:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->action:Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->validationErrors:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->mentionSuggestions:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Command;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->commandSuggestions:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Lio/getstream/chat/android/models/LinkPreview;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->linkPreview:Lio/getstream/chat/android/models/LinkPreview;

    return-object v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->coolDownTime:I

    return v0
.end method

.method public final component9()Lio/getstream/chat/android/ui/common/state/messages/MessageMode;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->messageMode:Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Command;",
            ">;",
            "Lio/getstream/chat/android/models/LinkPreview;",
            "I",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;",
            "Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;Z",
            "Lio/getstream/chat/android/models/User;",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;",
            "ZZ",
            "Ljava/util/Set<",
            "+",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention;",
            ">;",
            "Lio/getstream/chat/android/models/Command;",
            ")",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;"
        }
    .end annotation

    const-string v0, "inputValue"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachments"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validationErrors"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentionSuggestions"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commandSuggestions"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageMode"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recording"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedMentions"

    move-object/from16 v1, p17

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    move-object/from16 v4, p3

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v11, p10

    move/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v16, p15

    move/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    invoke-direct/range {v1 .. v19}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;-><init>(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->inputValue:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->inputValue:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->attachments:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->attachments:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->action:Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->action:Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->validationErrors:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->validationErrors:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->mentionSuggestions:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->mentionSuggestions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->commandSuggestions:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->commandSuggestions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->linkPreview:Lio/getstream/chat/android/models/LinkPreview;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->linkPreview:Lio/getstream/chat/android/models/LinkPreview;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->coolDownTime:I

    iget v3, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->coolDownTime:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->messageMode:Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->messageMode:Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->alsoSendToChannel:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->alsoSendToChannel:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->ownCapabilities:Ljava/util/Set;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->ownCapabilities:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->hasCommands:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->hasCommands:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->currentUser:Lio/getstream/chat/android/models/User;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->currentUser:Lio/getstream/chat/android/models/User;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->recording:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->recording:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->pollsEnabled:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->pollsEnabled:Z

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->sendEnabled:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->sendEnabled:Z

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->selectedMentions:Ljava/util/Set;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->selectedMentions:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->activeCommand:Lio/getstream/chat/android/models/Command;

    iget-object p1, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->activeCommand:Lio/getstream/chat/android/models/Command;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    return v2

    :cond_13
    return v0
.end method

.method public final getAction()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->action:Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    return-object v0
.end method

.method public final getActiveCommand()Lio/getstream/chat/android/models/Command;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->activeCommand:Lio/getstream/chat/android/models/Command;

    return-object v0
.end method

.method public final getAlsoSendToChannel()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->alsoSendToChannel:Z

    return v0
.end method

.method public final getAttachments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->attachments:Ljava/util/List;

    return-object v0
.end method

.method public final getCommandSuggestions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Command;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->commandSuggestions:Ljava/util/List;

    return-object v0
.end method

.method public final getCoolDownTime()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->coolDownTime:I

    return v0
.end method

.method public final getCurrentUser()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->currentUser:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final getHasCommands()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->hasCommands:Z

    return v0
.end method

.method public final getInputValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->inputValue:Ljava/lang/String;

    return-object v0
.end method

.method public final getLinkPreview()Lio/getstream/chat/android/models/LinkPreview;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->linkPreview:Lio/getstream/chat/android/models/LinkPreview;

    return-object v0
.end method

.method public final getMentionSuggestions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->mentionSuggestions:Ljava/util/List;

    return-object v0
.end method

.method public final getMessageMode()Lio/getstream/chat/android/ui/common/state/messages/MessageMode;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->messageMode:Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    return-object v0
.end method

.method public final getOwnCapabilities()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->ownCapabilities:Ljava/util/Set;

    return-object v0
.end method

.method public final getPollsEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->pollsEnabled:Z

    return v0
.end method

.method public final getRecording()Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->recording:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    return-object v0
.end method

.method public final getSelectedMentions()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->selectedMentions:Ljava/util/Set;

    return-object v0
.end method

.method public final getSendEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->sendEnabled:Z

    return v0
.end method

.method public final getValidationErrors()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->validationErrors:Ljava/util/List;

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->inputValue:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->attachments:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->action:Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->validationErrors:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->mentionSuggestions:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->commandSuggestions:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->linkPreview:Lio/getstream/chat/android/models/LinkPreview;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lio/getstream/chat/android/models/LinkPreview;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->coolDownTime:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->messageMode:Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->alsoSendToChannel:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->ownCapabilities:Ljava/util/Set;

    invoke-static {v2, v0, v1}, Lm4/a;->a(Ljava/util/Set;II)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->hasCommands:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->currentUser:Lio/getstream/chat/android/models/User;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->recording:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->pollsEnabled:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->sendEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->selectedMentions:Ljava/util/Set;

    invoke-static {v2, v0, v1}, Lm4/a;->a(Ljava/util/Set;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->activeCommand:Lio/getstream/chat/android/models/Command;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Command;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->inputValue:Ljava/lang/String;

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->attachments:Ljava/util/List;

    iget-object v3, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->action:Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    iget-object v4, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->validationErrors:Ljava/util/List;

    iget-object v5, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->mentionSuggestions:Ljava/util/List;

    iget-object v6, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->commandSuggestions:Ljava/util/List;

    iget-object v7, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->linkPreview:Lio/getstream/chat/android/models/LinkPreview;

    iget v8, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->coolDownTime:I

    iget-object v9, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->messageMode:Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    iget-boolean v10, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->alsoSendToChannel:Z

    iget-object v11, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->ownCapabilities:Ljava/util/Set;

    iget-boolean v12, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->hasCommands:Z

    iget-object v13, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->currentUser:Lio/getstream/chat/android/models/User;

    iget-object v14, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->recording:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    iget-boolean v15, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->pollsEnabled:Z

    move/from16 v16, v15

    iget-boolean v15, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->sendEnabled:Z

    move/from16 v17, v15

    iget-object v15, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->selectedMentions:Ljava/util/Set;

    move-object/from16 v18, v15

    iget-object v15, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->activeCommand:Lio/getstream/chat/android/models/Command;

    const-string v0, ", attachments="

    move-object/from16 v19, v15

    const-string v15, ", action="

    move-object/from16 v20, v14

    const-string v14, "MessageComposerState(inputValue="

    invoke-static {v14, v1, v0, v15, v2}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", validationErrors="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mentionSuggestions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", commandSuggestions="

    const-string v2, ", linkPreview="

    invoke-static {v0, v5, v1, v6, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", coolDownTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", messageMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", alsoSendToChannel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", ownCapabilities="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hasCommands="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", currentUser="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", recording="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pollsEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sendEnabled="

    const-string v2, ", selectedMentions="

    move/from16 v3, v16

    move/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", activeCommand="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
