.class public final Lio/getstream/chat/android/models/DraftMessage;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/models/CustomObject;
.implements Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/models/DraftMessage$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u000f\n\u0002\u0008\u0008\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u00012\u00020\u0002:\u0001HB\u009f\u0001\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\t\u0012\u0014\u0008\u0002\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0016\u0010)\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010*2\u0006\u0010+\u001a\u00020\u0004H\u0016J9\u0010,\u001a\u0002H-\"\u0004\u0008\u0000\u0010.\"\u0004\u0008\u0001\u0010-*\u000e\u0012\u0004\u0012\u0002H.\u0012\u0004\u0012\u0002H-0\r2\u0006\u0010/\u001a\u0002H.2\u0006\u00100\u001a\u0002H-H\u0002\u00a2\u0006\u0002\u00101J\u0006\u00102\u001a\u000203J\u0008\u00104\u001a\u00020\u0004H\u0016J\u0008\u00105\u001a\u000206H\u0007J\t\u00107\u001a\u00020\u0004H\u00c6\u0003J\t\u00108\u001a\u00020\u0004H\u00c6\u0003J\t\u00109\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000f\u0010;\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\u000f\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u00040\tH\u00c6\u0003J\u0015\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003J\t\u0010>\u001a\u00020\u0010H\u00c6\u0003J\t\u0010?\u001a\u00020\u0010H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u00a1\u0001\u0010C\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\t2\u0014\u0008\u0002\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\r2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\u0013\u0010D\u001a\u00020\u00102\u0008\u0010E\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010F\u001a\u00020GH\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0019R\u0017\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001eR \u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0011\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010\u0019R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\u0019\u00a8\u0006I"
    }
    d2 = {
        "Lio/getstream/chat/android/models/DraftMessage;",
        "Lio/getstream/chat/android/models/CustomObject;",
        "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;",
        "id",
        "",
        "cid",
        "text",
        "parentId",
        "attachments",
        "",
        "Lio/getstream/chat/android/models/Attachment;",
        "mentionedUsersIds",
        "extraData",
        "",
        "",
        "silent",
        "",
        "showInChannel",
        "replyMessage",
        "Lio/getstream/chat/android/models/Message;",
        "command",
        "args",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZLio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;)V",
        "getId",
        "()Ljava/lang/String;",
        "getCid",
        "getText",
        "getParentId",
        "getAttachments",
        "()Ljava/util/List;",
        "getMentionedUsersIds",
        "getExtraData",
        "()Ljava/util/Map;",
        "getSilent",
        "()Z",
        "getShowInChannel",
        "getReplyMessage",
        "()Lio/getstream/chat/android/models/Message;",
        "getCommand",
        "getArgs",
        "getComparableField",
        "",
        "fieldName",
        "get",
        "B",
        "A",
        "key",
        "default",
        "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
        "identifierHash",
        "",
        "toString",
        "newBuilder",
        "Lio/getstream/chat/android/models/DraftMessage$Builder;",
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
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "Builder",
        "stream-chat-android-core"
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
.field private final args:Ljava/lang/String;

.field private final attachments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;"
        }
    .end annotation
.end field

.field private final cid:Ljava/lang/String;

.field private final command:Ljava/lang/String;

.field private final extraData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final id:Ljava/lang/String;

.field private final mentionedUsersIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final parentId:Ljava/lang/String;

.field private final replyMessage:Lio/getstream/chat/android/models/Message;

.field private final showInChannel:Z

.field private final silent:Z

.field private final text:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 15

    .line 1
    const/16 v13, 0xfff

    const/4 v14, 0x0

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

    move-object v0, p0

    invoke-direct/range {v0 .. v14}, Lio/getstream/chat/android/models/DraftMessage;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZLio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZLio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;ZZ",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachments"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentionedUsersIds"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/models/DraftMessage;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lio/getstream/chat/android/models/DraftMessage;->cid:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lio/getstream/chat/android/models/DraftMessage;->text:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lio/getstream/chat/android/models/DraftMessage;->parentId:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lio/getstream/chat/android/models/DraftMessage;->attachments:Ljava/util/List;

    .line 8
    iput-object p6, p0, Lio/getstream/chat/android/models/DraftMessage;->mentionedUsersIds:Ljava/util/List;

    .line 9
    iput-object p7, p0, Lio/getstream/chat/android/models/DraftMessage;->extraData:Ljava/util/Map;

    .line 10
    iput-boolean p8, p0, Lio/getstream/chat/android/models/DraftMessage;->silent:Z

    .line 11
    iput-boolean p9, p0, Lio/getstream/chat/android/models/DraftMessage;->showInChannel:Z

    .line 12
    iput-object p10, p0, Lio/getstream/chat/android/models/DraftMessage;->replyMessage:Lio/getstream/chat/android/models/Message;

    .line 13
    iput-object p11, p0, Lio/getstream/chat/android/models/DraftMessage;->command:Ljava/lang/String;

    .line 14
    iput-object p12, p0, Lio/getstream/chat/android/models/DraftMessage;->args:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZLio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x1

    .line 15
    const-string v2, ""

    if-eqz v1, :cond_0

    move-object p1, v2

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    move-object p2, v2

    :cond_1
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    move-object v2, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    move-object v1, v3

    goto :goto_1

    :cond_3
    move-object v1, p4

    :goto_1
    and-int/lit8 v4, v0, 0x10

    sget-object v5, Lm83/y;->w:Lm83/y;

    if-eqz v4, :cond_4

    move-object v4, v5

    goto :goto_2

    :cond_4
    move-object/from16 v4, p5

    :goto_2
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    goto :goto_3

    :cond_5
    move-object/from16 v5, p6

    :goto_3
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    .line 16
    sget-object v6, Lm83/z;->w:Lm83/z;

    goto :goto_4

    :cond_6
    move-object/from16 v6, p7

    :goto_4
    and-int/lit16 v7, v0, 0x80

    const/4 v8, 0x0

    if-eqz v7, :cond_7

    move v7, v8

    goto :goto_5

    :cond_7
    move/from16 v7, p8

    :goto_5
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    goto :goto_6

    :cond_8
    move/from16 v8, p9

    :goto_6
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_9

    move-object v9, v3

    goto :goto_7

    :cond_9
    move-object/from16 v9, p10

    :goto_7
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_a

    move-object v10, v3

    goto :goto_8

    :cond_a
    move-object/from16 v10, p11

    :goto_8
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_b

    move-object/from16 p13, v3

    :goto_9
    move-object p3, p2

    move-object/from16 p5, v1

    move-object p4, v2

    move-object/from16 p6, v4

    move-object/from16 p7, v5

    move-object/from16 p8, v6

    move/from16 p9, v7

    move/from16 p10, v8

    move-object/from16 p11, v9

    move-object/from16 p12, v10

    move-object p2, p1

    move-object p1, p0

    goto :goto_a

    :cond_b
    move-object/from16 p13, p12

    goto :goto_9

    .line 17
    :goto_a
    invoke-direct/range {p1 .. p13}, Lio/getstream/chat/android/models/DraftMessage;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZLio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZLio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/models/DraftMessage;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/models/DraftMessage;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/models/DraftMessage;->cid:Ljava/lang/String;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/models/DraftMessage;->text:Ljava/lang/String;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/models/DraftMessage;->parentId:Ljava/lang/String;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/models/DraftMessage;->attachments:Ljava/util/List;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/models/DraftMessage;->mentionedUsersIds:Ljava/util/List;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lio/getstream/chat/android/models/DraftMessage;->extraData:Ljava/util/Map;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-boolean p8, p0, Lio/getstream/chat/android/models/DraftMessage;->silent:Z

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-boolean p9, p0, Lio/getstream/chat/android/models/DraftMessage;->showInChannel:Z

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lio/getstream/chat/android/models/DraftMessage;->replyMessage:Lio/getstream/chat/android/models/Message;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lio/getstream/chat/android/models/DraftMessage;->command:Ljava/lang/String;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lio/getstream/chat/android/models/DraftMessage;->args:Ljava/lang/String;

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move p11, p9

    move-object p12, p10

    move-object p9, p7

    move p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lio/getstream/chat/android/models/DraftMessage;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZLio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/models/DraftMessage;

    move-result-object p0

    return-object p0
.end method

.method private final get(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TA;+TB;>;TA;TB;)TB;"
        }
    .end annotation

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    return-object p3

    :cond_0
    return-object p1
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/DraftMessage;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lio/getstream/chat/android/models/Message;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/DraftMessage;->replyMessage:Lio/getstream/chat/android/models/Message;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/DraftMessage;->command:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/DraftMessage;->args:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/DraftMessage;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/DraftMessage;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/DraftMessage;->parentId:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/DraftMessage;->attachments:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/DraftMessage;->mentionedUsersIds:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/DraftMessage;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/DraftMessage;->silent:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/DraftMessage;->showInChannel:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZLio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/models/DraftMessage;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;ZZ",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/models/DraftMessage;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachments"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentionedUsersIds"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/models/DraftMessage;

    move-object v2, p1

    move-object/from16 v5, p4

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lio/getstream/chat/android/models/DraftMessage;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZLio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/models/DraftMessage;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/models/DraftMessage;

    iget-object v1, p0, Lio/getstream/chat/android/models/DraftMessage;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/DraftMessage;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/models/DraftMessage;->cid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/DraftMessage;->cid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/models/DraftMessage;->text:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/DraftMessage;->text:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/models/DraftMessage;->parentId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/DraftMessage;->parentId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/models/DraftMessage;->attachments:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/DraftMessage;->attachments:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/models/DraftMessage;->mentionedUsersIds:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/DraftMessage;->mentionedUsersIds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/models/DraftMessage;->extraData:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/models/DraftMessage;->extraData:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lio/getstream/chat/android/models/DraftMessage;->silent:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/models/DraftMessage;->silent:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lio/getstream/chat/android/models/DraftMessage;->showInChannel:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/models/DraftMessage;->showInChannel:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/chat/android/models/DraftMessage;->replyMessage:Lio/getstream/chat/android/models/Message;

    iget-object v3, p1, Lio/getstream/chat/android/models/DraftMessage;->replyMessage:Lio/getstream/chat/android/models/Message;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/models/DraftMessage;->command:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/DraftMessage;->command:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/models/DraftMessage;->args:Ljava/lang/String;

    iget-object p1, p1, Lio/getstream/chat/android/models/DraftMessage;->args:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getArgs()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/DraftMessage;->args:Ljava/lang/String;

    return-object v0
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

    iget-object v0, p0, Lio/getstream/chat/android/models/DraftMessage;->attachments:Ljava/util/List;

    return-object v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/DraftMessage;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCommand()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/DraftMessage;->command:Ljava/lang/String;

    return-object v0
.end method

.method public getComparableField(Ljava/lang/String;)Ljava/lang/Comparable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Comparable<",
            "*>;"
        }
    .end annotation

    const-string v0, "fieldName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "parent_id"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :sswitch_1
    const-string v0, "parentId"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/models/DraftMessage;->parentId:Ljava/lang/String;

    return-object p1

    :sswitch_2
    const-string v0, "text"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lio/getstream/chat/android/models/DraftMessage;->text:Ljava/lang/String;

    return-object p1

    :sswitch_3
    const-string v0, "cid"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lio/getstream/chat/android/models/DraftMessage;->cid:Ljava/lang/String;

    return-object p1

    :sswitch_4
    const-string v0, "id"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/models/DraftMessage;->id:Ljava/lang/String;

    return-object p1

    :sswitch_5
    const-string v0, "silent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :goto_0
    invoke-virtual {p0}, Lio/getstream/chat/android/models/DraftMessage;->getExtraData()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/Comparable;

    if-eqz v0, :cond_4

    check-cast p1, Ljava/lang/Comparable;

    return-object p1

    :cond_4
    const/4 p1, 0x0

    return-object p1

    :cond_5
    iget-boolean p1, p0, Lio/getstream/chat/android/models/DraftMessage;->silent:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x35c86bab -> :sswitch_5
        0xd1b -> :sswitch_4
        0x180be -> :sswitch_3
        0x36452d -> :sswitch_2
        0x460b8f65 -> :sswitch_1
        0x7b66b0d0 -> :sswitch_0
    .end sparse-switch
.end method

.method public getExtraData()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/DraftMessage;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public getExtraValue(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;)TT;"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lio/getstream/chat/android/models/CustomObject;->getExtraValue(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/DraftMessage;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getMentionedUsersIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/DraftMessage;->mentionedUsersIds:Ljava/util/List;

    return-object v0
.end method

.method public final getParentId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/DraftMessage;->parentId:Ljava/lang/String;

    return-object v0
.end method

.method public final getReplyMessage()Lio/getstream/chat/android/models/Message;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/DraftMessage;->replyMessage:Lio/getstream/chat/android/models/Message;

    return-object v0
.end method

.method public final getShowInChannel()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/DraftMessage;->showInChannel:Z

    return v0
.end method

.method public final getSilent()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/DraftMessage;->silent:Z

    return v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/DraftMessage;->text:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/models/DraftMessage;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/DraftMessage;->cid:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/DraftMessage;->text:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/DraftMessage;->parentId:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/DraftMessage;->attachments:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/DraftMessage;->mentionedUsersIds:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/DraftMessage;->extraData:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/models/DraftMessage;->silent:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/models/DraftMessage;->showInChannel:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/DraftMessage;->replyMessage:Lio/getstream/chat/android/models/Message;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/DraftMessage;->command:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/chat/android/models/DraftMessage;->args:Ljava/lang/String;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    return v0
.end method

.method public final identifierHash()J
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/models/DraftMessage;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/models/DraftMessage;->parentId:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    :cond_0
    int-to-long v0, v0

    return-wide v0
.end method

.method public final newBuilder()Lio/getstream/chat/android/models/DraftMessage$Builder;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/models/DraftMessage$Builder;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/models/DraftMessage$Builder;-><init>(Lio/getstream/chat/android/models/DraftMessage;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Message(id=\""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/models/DraftMessage;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\", text=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/DraftMessage;->text:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\", cid=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/getstream/chat/android/models/DraftMessage;->cid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/getstream/chat/android/models/DraftMessage;->parentId:Ljava/lang/String;

    if-eqz v2, :cond_0

    const-string v2, ", parentId="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/getstream/chat/android/models/DraftMessage;->parentId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v2, p0, Lio/getstream/chat/android/models/DraftMessage;->attachments:Ljava/util/List;

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, ", attachments="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/getstream/chat/android/models/DraftMessage;->attachments:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_1
    iget-object v2, p0, Lio/getstream/chat/android/models/DraftMessage;->mentionedUsersIds:Ljava/util/List;

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, ", mentionedUsersIds="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/getstream/chat/android/models/DraftMessage;->mentionedUsersIds:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_2
    const-string v2, ", silent="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lio/getstream/chat/android/models/DraftMessage;->silent:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", showInChannel="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lio/getstream/chat/android/models/DraftMessage;->showInChannel:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/getstream/chat/android/models/DraftMessage;->replyMessage:Lio/getstream/chat/android/models/Message;

    if-eqz v2, :cond_3

    const-string v2, ", replyMessage="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/getstream/chat/android/models/DraftMessage;->replyMessage:Lio/getstream/chat/android/models/Message;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_3
    iget-object v2, p0, Lio/getstream/chat/android/models/DraftMessage;->command:Ljava/lang/String;

    if-eqz v2, :cond_4

    const-string v2, ", command=\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/getstream/chat/android/models/DraftMessage;->command:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    iget-object v2, p0, Lio/getstream/chat/android/models/DraftMessage;->args:Ljava/lang/String;

    if-eqz v2, :cond_5

    const-string v2, ", args=\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/getstream/chat/android/models/DraftMessage;->args:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    invoke-virtual {p0}, Lio/getstream/chat/android/models/DraftMessage;->getExtraData()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    const-string v1, ", extraData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/DraftMessage;->getExtraData()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_6
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
