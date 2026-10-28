.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u00087\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 >2\u00020\u0001:\u0001>B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u000c\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0011\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0086\u0002J\u0006\u0010\'\u001a\u00020\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\u00a9\u0001\u00108\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00109\u001a\u00020\u00032\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010:\u001a\u00020;H\u00d6\u0001J\t\u0010<\u001a\u00020=H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0016R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0016R\u0011\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u0016R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0016\u00a8\u0006?"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;",
        "",
        "text",
        "",
        "replyText",
        "reactions",
        "attachments",
        "replies",
        "syncStatus",
        "deleted",
        "positions",
        "pinned",
        "user",
        "mentions",
        "footer",
        "poll",
        "threadMode",
        "showOriginalText",
        "isMessageRead",
        "<init>",
        "(ZZZZZZZZZZZZZZZZ)V",
        "getText",
        "()Z",
        "getReplyText",
        "getReactions",
        "getAttachments",
        "getReplies",
        "getSyncStatus",
        "getDeleted",
        "getPositions",
        "getPinned",
        "getUser",
        "getMentions",
        "getFooter",
        "getPoll",
        "getThreadMode",
        "getShowOriginalText",
        "plus",
        "other",
        "anyChanged",
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
        "copy",
        "equals",
        "hashCode",
        "",
        "toString",
        "",
        "Companion",
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


# static fields
.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff$Companion;

.field private static final EMPTY:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;

.field private static final FULL:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;


# instance fields
.field private final attachments:Z

.field private final deleted:Z

.field private final footer:Z

.field private final isMessageRead:Z

.field private final mentions:Z

.field private final pinned:Z

.field private final poll:Z

.field private final positions:Z

.field private final reactions:Z

.field private final replies:Z

.field private final replyText:Z

.field private final showOriginalText:Z

.field private final syncStatus:Z

.field private final text:Z

.field private final threadMode:Z

.field private final user:Z


# direct methods
.method static constructor <clinit>()V
    .locals 19

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff$Companion;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;

    const/16 v16, 0x0

    const/16 v17, 0x0

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

    invoke-direct/range {v1 .. v17}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;-><init>(ZZZZZZZZZZZZZZZZ)V

    sput-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->EMPTY:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;

    const/16 v17, 0x1

    const/16 v18, 0x1

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x1

    const/4 v9, 0x1

    const/4 v10, 0x1

    const/4 v11, 0x1

    const/4 v12, 0x1

    const/4 v13, 0x1

    const/4 v14, 0x1

    const/4 v15, 0x1

    const/16 v16, 0x1

    invoke-direct/range {v2 .. v18}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;-><init>(ZZZZZZZZZZZZZZZZ)V

    sput-object v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->FULL:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;

    return-void
.end method

.method public constructor <init>(ZZZZZZZZZZZZZZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->text:Z

    iput-boolean p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->replyText:Z

    iput-boolean p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->reactions:Z

    iput-boolean p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->attachments:Z

    iput-boolean p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->replies:Z

    iput-boolean p6, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->syncStatus:Z

    iput-boolean p7, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->deleted:Z

    iput-boolean p8, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->positions:Z

    iput-boolean p9, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->pinned:Z

    iput-boolean p10, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->user:Z

    iput-boolean p11, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->mentions:Z

    iput-boolean p12, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->footer:Z

    iput-boolean p13, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->poll:Z

    iput-boolean p14, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->threadMode:Z

    iput-boolean p15, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->showOriginalText:Z

    move/from16 p1, p16

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->isMessageRead:Z

    return-void
.end method

.method public static final synthetic access$getEMPTY$cp()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->EMPTY:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;

    return-object v0
.end method

.method public static final synthetic access$getFULL$cp()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->FULL:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;

    return-object v0
.end method

.method public static copy$default(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;ZZZZZZZZZZZZZZZZILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p17

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-boolean v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->text:Z

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-boolean v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->replyText:Z

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-boolean v4, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->reactions:Z

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-boolean v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->attachments:Z

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-boolean v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->replies:Z

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->syncStatus:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-boolean v8, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->deleted:Z

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->positions:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->pinned:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-boolean v11, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->user:Z

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-boolean v12, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->mentions:Z

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-boolean v13, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->footer:Z

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-boolean v14, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->poll:Z

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-boolean v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->threadMode:Z

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-boolean v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->showOriginalText:Z

    goto :goto_e

    :cond_e
    move/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    iget-boolean v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->isMessageRead:Z

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;

    move-object/from16 p0, v0

    move/from16 p16, v1

    move/from16 p15, v2

    move/from16 p2, v3

    move/from16 p3, v4

    move/from16 p4, v5

    move/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v13

    move/from16 p13, v14

    move/from16 p14, v15

    invoke-direct/range {p0 .. p16}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;-><init>(ZZZZZZZZZZZZZZZZ)V

    return-object v0
.end method


# virtual methods
.method public final anyChanged()Z
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->EMPTY:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->text:Z

    return v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->user:Z

    return v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->mentions:Z

    return v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->footer:Z

    return v0
.end method

.method public final component13()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->poll:Z

    return v0
.end method

.method public final component14()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->threadMode:Z

    return v0
.end method

.method public final component15()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->showOriginalText:Z

    return v0
.end method

.method public final component16()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->isMessageRead:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->replyText:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->reactions:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->attachments:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->replies:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->syncStatus:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->deleted:Z

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->positions:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->pinned:Z

    return v0
.end method

.method public final copy(ZZZZZZZZZZZZZZZZ)Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;
    .locals 17

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    move/from16 v13, p13

    move/from16 v14, p14

    move/from16 v15, p15

    move/from16 v16, p16

    invoke-direct/range {v0 .. v16}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;-><init>(ZZZZZZZZZZZZZZZZ)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->text:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->text:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->replyText:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->replyText:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->reactions:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->reactions:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->attachments:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->attachments:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->replies:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->replies:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->syncStatus:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->syncStatus:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->deleted:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->deleted:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->positions:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->positions:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->pinned:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->pinned:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->user:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->user:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->mentions:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->mentions:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->footer:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->footer:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->poll:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->poll:Z

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->threadMode:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->threadMode:Z

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->showOriginalText:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->showOriginalText:Z

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->isMessageRead:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->isMessageRead:Z

    if-eq v1, p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public final getAttachments()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->attachments:Z

    return v0
.end method

.method public final getDeleted()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->deleted:Z

    return v0
.end method

.method public final getFooter()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->footer:Z

    return v0
.end method

.method public final getMentions()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->mentions:Z

    return v0
.end method

.method public final getPinned()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->pinned:Z

    return v0
.end method

.method public final getPoll()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->poll:Z

    return v0
.end method

.method public final getPositions()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->positions:Z

    return v0
.end method

.method public final getReactions()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->reactions:Z

    return v0
.end method

.method public final getReplies()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->replies:Z

    return v0
.end method

.method public final getReplyText()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->replyText:Z

    return v0
.end method

.method public final getShowOriginalText()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->showOriginalText:Z

    return v0
.end method

.method public final getSyncStatus()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->syncStatus:Z

    return v0
.end method

.method public final getText()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->text:Z

    return v0
.end method

.method public final getThreadMode()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->threadMode:Z

    return v0
.end method

.method public final getUser()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->user:Z

    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->text:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->replyText:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->reactions:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->attachments:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->replies:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->syncStatus:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->deleted:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->positions:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->pinned:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->user:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->mentions:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->footer:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->poll:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->threadMode:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->showOriginalText:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->isMessageRead:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isMessageRead()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->isMessageRead:Z

    return v0
.end method

.method public final plus(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "other"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;

    iget-boolean v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->text:Z

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v2, :cond_1

    iget-boolean v2, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->text:Z

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v4

    move v4, v5

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v4

    :goto_1
    iget-boolean v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->replyText:Z

    if-nez v6, :cond_3

    iget-boolean v6, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->replyText:Z

    if-eqz v6, :cond_2

    goto :goto_2

    :cond_2
    move v6, v5

    goto :goto_3

    :cond_3
    :goto_2
    move v6, v5

    move v5, v2

    :goto_3
    iget-boolean v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->reactions:Z

    if-nez v7, :cond_5

    iget-boolean v7, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->reactions:Z

    if-eqz v7, :cond_4

    goto :goto_4

    :cond_4
    move v7, v6

    goto :goto_5

    :cond_5
    :goto_4
    move v7, v6

    move v6, v2

    :goto_5
    iget-boolean v8, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->attachments:Z

    if-nez v8, :cond_7

    iget-boolean v8, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->attachments:Z

    if-eqz v8, :cond_6

    goto :goto_6

    :cond_6
    move v8, v7

    goto :goto_7

    :cond_7
    :goto_6
    move v8, v7

    move v7, v2

    :goto_7
    iget-boolean v9, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->replies:Z

    if-nez v9, :cond_9

    iget-boolean v9, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->replies:Z

    if-eqz v9, :cond_8

    goto :goto_8

    :cond_8
    move v9, v8

    goto :goto_9

    :cond_9
    :goto_8
    move v9, v8

    move v8, v2

    :goto_9
    iget-boolean v10, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->syncStatus:Z

    if-nez v10, :cond_b

    iget-boolean v10, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->syncStatus:Z

    if-eqz v10, :cond_a

    goto :goto_a

    :cond_a
    move v10, v9

    goto :goto_b

    :cond_b
    :goto_a
    move v10, v9

    move v9, v2

    :goto_b
    iget-boolean v11, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->deleted:Z

    if-nez v11, :cond_d

    iget-boolean v11, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->deleted:Z

    if-eqz v11, :cond_c

    goto :goto_c

    :cond_c
    move v11, v10

    goto :goto_d

    :cond_d
    :goto_c
    move v11, v10

    move v10, v2

    :goto_d
    iget-boolean v12, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->positions:Z

    if-nez v12, :cond_f

    iget-boolean v12, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->positions:Z

    if-eqz v12, :cond_e

    goto :goto_e

    :cond_e
    move v12, v11

    goto :goto_f

    :cond_f
    :goto_e
    move v12, v11

    move v11, v2

    :goto_f
    iget-boolean v13, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->pinned:Z

    if-nez v13, :cond_11

    iget-boolean v13, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->pinned:Z

    if-eqz v13, :cond_10

    goto :goto_10

    :cond_10
    move v13, v12

    goto :goto_11

    :cond_11
    :goto_10
    move v13, v12

    move v12, v2

    :goto_11
    iget-boolean v14, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->user:Z

    if-nez v14, :cond_13

    iget-boolean v14, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->user:Z

    if-eqz v14, :cond_12

    goto :goto_12

    :cond_12
    move v14, v13

    goto :goto_13

    :cond_13
    :goto_12
    move v14, v13

    move v13, v2

    :goto_13
    iget-boolean v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->mentions:Z

    if-nez v15, :cond_15

    iget-boolean v15, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->mentions:Z

    if-eqz v15, :cond_14

    goto :goto_14

    :cond_14
    move v15, v14

    goto :goto_15

    :cond_15
    :goto_14
    move v15, v14

    move v14, v2

    :goto_15
    iget-boolean v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->footer:Z

    if-nez v2, :cond_16

    iget-boolean v2, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->footer:Z

    if-eqz v2, :cond_17

    :cond_16
    const/4 v15, 0x1

    :cond_17
    iget-boolean v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->poll:Z

    if-nez v2, :cond_19

    iget-boolean v2, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->poll:Z

    if-eqz v2, :cond_18

    goto :goto_16

    :cond_18
    const/16 v16, 0x0

    goto :goto_17

    :cond_19
    :goto_16
    const/16 v16, 0x1

    :goto_17
    iget-boolean v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->threadMode:Z

    if-nez v2, :cond_1b

    iget-boolean v2, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->threadMode:Z

    if-eqz v2, :cond_1a

    goto :goto_18

    :cond_1a
    const/16 v17, 0x0

    goto :goto_19

    :cond_1b
    :goto_18
    const/16 v17, 0x1

    :goto_19
    iget-boolean v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->showOriginalText:Z

    if-nez v2, :cond_1d

    iget-boolean v2, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->showOriginalText:Z

    if-eqz v2, :cond_1c

    goto :goto_1a

    :cond_1c
    const/16 v18, 0x0

    goto :goto_1b

    :cond_1d
    :goto_1a
    const/16 v18, 0x1

    :goto_1b
    iget-boolean v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->isMessageRead:Z

    if-nez v2, :cond_1f

    iget-boolean v1, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->isMessageRead:Z

    if-eqz v1, :cond_1e

    goto :goto_1c

    :cond_1e
    const/16 v19, 0x0

    goto :goto_1d

    :cond_1f
    :goto_1c
    const/16 v19, 0x1

    :goto_1d
    invoke-direct/range {v3 .. v19}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;-><init>(ZZZZZZZZZZZZZZZZ)V

    return-object v3
.end method

.method public final toString()Ljava/lang/String;
    .locals 19

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->text:Z

    iget-boolean v2, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->replyText:Z

    iget-boolean v3, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->reactions:Z

    iget-boolean v4, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->attachments:Z

    iget-boolean v5, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->replies:Z

    iget-boolean v6, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->syncStatus:Z

    iget-boolean v7, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->deleted:Z

    iget-boolean v8, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->positions:Z

    iget-boolean v9, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->pinned:Z

    iget-boolean v10, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->user:Z

    iget-boolean v11, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->mentions:Z

    iget-boolean v12, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->footer:Z

    iget-boolean v13, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->poll:Z

    iget-boolean v14, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->threadMode:Z

    iget-boolean v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->showOriginalText:Z

    move/from16 v16, v15

    iget-boolean v15, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->isMessageRead:Z

    const-string v0, ", replyText="

    move/from16 v17, v15

    const-string v15, ", reactions="

    move/from16 v18, v13

    const-string v13, "MessageListItemPayloadDiff(text="

    invoke-static {v13, v0, v15, v1, v2}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", attachments="

    const-string v2, ", replies="

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", syncStatus="

    const-string v2, ", deleted="

    invoke-static {v0, v5, v1, v6, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", positions="

    const-string v2, ", pinned="

    invoke-static {v0, v7, v1, v8, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", user="

    const-string v2, ", mentions="

    invoke-static {v0, v9, v1, v10, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", footer="

    const-string v2, ", poll="

    invoke-static {v0, v11, v1, v12, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", threadMode="

    const-string v2, ", showOriginalText="

    move/from16 v3, v18

    invoke-static {v0, v3, v1, v14, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", isMessageRead="

    const-string v2, ")"

    move/from16 v3, v16

    move/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
