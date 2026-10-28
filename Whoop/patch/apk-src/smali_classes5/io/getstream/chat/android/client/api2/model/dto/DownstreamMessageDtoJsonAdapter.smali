.class public final Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/moshi/JsonAdapter<",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001aR\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001aR\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u001aR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u001aR&\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\"0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010\u001aR \u0010%\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020$0\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010\u001aR \u0010\'\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020&0\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010\u001aR\u001a\u0010)\u001a\u0008\u0012\u0004\u0012\u00020(0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010\u001aR\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010\u001aR\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010\u001aR(\u0010-\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020,\u0018\u00010\"0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010\u001aR(\u0010/\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020.\u0018\u00010\"0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u0010\u001aR\u001a\u00100\u001a\u0008\u0012\u0004\u0012\u00020,0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u0010\u001aR\u001a\u00101\u001a\u0008\u0012\u0004\u0012\u00020&0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u0010\u001aR\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u0010\u001aR\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u0010\u001aR\u001c\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u0010\u001aR\u001c\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010\u001aR\u001c\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010\u001aR\u001c\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010\u001aR\u001c\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u0010\u001aR&\u0010@\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020?0\"0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010\u001aR\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010A8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008B\u0010C\u00a8\u0006D"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
        "Lqx/l0;",
        "moshi",
        "<init>",
        "(Lqx/l0;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "Lcom/squareup/moshi/JsonReader;",
        "reader",
        "fromJson",
        "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
        "Lqx/c0;",
        "writer",
        "value_",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;)V",
        "Lqx/v;",
        "options",
        "Lqx/v;",
        "",
        "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;",
        "listOfAttachmentDtoAdapter",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;",
        "nullableChannelInfoDtoAdapter",
        "stringAdapter",
        "nullableStringAdapter",
        "Ljava/util/Date;",
        "dateAdapter",
        "nullableDateAdapter",
        "",
        "mapOfStringStringAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;",
        "listOfDownstreamReactionDtoAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
        "listOfDownstreamUserDtoAdapter",
        "",
        "booleanAdapter",
        "nullableDownstreamUserDtoAdapter",
        "nullableDownstreamMessageDtoAdapter",
        "",
        "nullableMapOfStringIntAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;",
        "nullableMapOfStringDownstreamReactionGroupDtoAdapter",
        "intAdapter",
        "downstreamUserDtoAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;",
        "nullableDownstreamModerationDetailsDtoAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;",
        "nullableDownstreamModerationDtoAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;",
        "nullableDownstreamPollDtoAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;",
        "nullableDownstreamReminderInfoDtoAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;",
        "nullableDownstreamLocationDtoAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;",
        "nullableDownstreamMemberInfoDtoAdapter",
        "nullableBooleanAdapter",
        "",
        "mapOfStringAnyAdapter",
        "Ljava/lang/reflect/Constructor;",
        "constructorRef",
        "Ljava/lang/reflect/Constructor;",
        "stream-chat-android-client_release"
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
.field private final booleanAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private volatile constructorRef:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
            ">;"
        }
    .end annotation
.end field

.field private final dateAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field

.field private final downstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            ">;"
        }
    .end annotation
.end field

.field private final intAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final listOfAttachmentDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;",
            ">;>;"
        }
    .end annotation
.end field

.field private final listOfDownstreamReactionDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;",
            ">;>;"
        }
    .end annotation
.end field

.field private final listOfDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mapOfStringStringAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final nullableBooleanAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableChannelInfoDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableDownstreamLocationDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableDownstreamMemberInfoDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableDownstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableDownstreamModerationDetailsDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableDownstreamModerationDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableDownstreamPollDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableDownstreamReminderInfoDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableMapOfStringDownstreamReactionGroupDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;",
            ">;>;"
        }
    .end annotation
.end field

.field private final nullableMapOfStringIntAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field private final nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final options:Lqx/v;

.field private final stringAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lqx/l0;)V
    .locals 44

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "moshi"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    const-string v42, "deleted_for_me"

    const-string v43, "extraData"

    const-string v3, "attachments"

    const-string v4, "channel"

    const-string v5, "cid"

    const-string v6, "command"

    const-string v7, "created_at"

    const-string v8, "deleted_at"

    const-string v9, "html"

    const-string v10, "i18n"

    const-string v11, "id"

    const-string v12, "latest_reactions"

    const-string v13, "mentioned_users"

    const-string v14, "own_reactions"

    const-string v15, "parent_id"

    const-string v16, "pin_expires"

    const-string v17, "pinned"

    const-string v18, "pinned_at"

    const-string v19, "message_text_updated_at"

    const-string v20, "pinned_by"

    const-string v21, "quoted_message"

    const-string v22, "quoted_message_id"

    const-string v23, "reaction_counts"

    const-string v24, "reaction_scores"

    const-string v25, "reaction_groups"

    const-string v26, "reply_count"

    const-string v27, "deleted_reply_count"

    const-string v28, "shadowed"

    const-string v29, "show_in_channel"

    const-string v30, "silent"

    const-string v31, "text"

    const-string v32, "thread_participants"

    const-string v33, "type"

    const-string v34, "updated_at"

    const-string v35, "user"

    const-string v36, "moderation_details"

    const-string v37, "moderation"

    const-string v38, "poll"

    const-string v39, "reminder"

    const-string v40, "shared_location"

    const-string v41, "member"

    filled-new-array/range {v3 .. v43}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lqx/v;->a([Ljava/lang/String;)Lqx/v;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->options:Lqx/v;

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/reflect/Type;

    const/4 v4, 0x0

    const-class v5, Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;

    aput-object v5, v3, v4

    const-class v5, Ljava/util/List;

    invoke-static {v5, v3}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v3

    const-string v6, "attachments"

    sget-object v7, Lm83/a0;->w:Lm83/a0;

    invoke-virtual {v1, v3, v7, v6}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v3

    iput-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->listOfAttachmentDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v3, Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;

    const-string v6, "channel"

    invoke-virtual {v1, v3, v7, v6}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v3

    iput-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableChannelInfoDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-string v3, "cid"

    const-class v6, Ljava/lang/String;

    invoke-virtual {v1, v6, v7, v3}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v3

    iput-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-string v3, "command"

    invoke-virtual {v1, v6, v7, v3}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v3

    iput-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-string v3, "created_at"

    const-class v8, Ljava/util/Date;

    invoke-virtual {v1, v8, v7, v3}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v3

    iput-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-string v3, "deleted_at"

    invoke-virtual {v1, v8, v7, v3}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v3

    iput-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    const/4 v3, 0x2

    new-array v8, v3, [Ljava/lang/reflect/Type;

    aput-object v6, v8, v4

    aput-object v6, v8, v2

    const-class v9, Ljava/util/Map;

    invoke-static {v9, v8}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v8

    const-string v10, "i18n"

    invoke-virtual {v1, v8, v7, v10}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v8

    iput-object v8, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->mapOfStringStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v8, v2, [Ljava/lang/reflect/Type;

    const-class v10, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;

    aput-object v10, v8, v4

    invoke-static {v5, v8}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v8

    const-string v10, "latest_reactions"

    invoke-virtual {v1, v8, v7, v10}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v8

    iput-object v8, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->listOfDownstreamReactionDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v8, v2, [Ljava/lang/reflect/Type;

    const-class v10, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    aput-object v10, v8, v4

    invoke-static {v5, v8}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v5

    const-string v8, "mentioned_users"

    invoke-virtual {v1, v5, v7, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->listOfDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-string v8, "pinned"

    invoke-virtual {v1, v5, v7, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-string v5, "pinned_by"

    invoke-virtual {v1, v10, v7, v5}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v5, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    const-string v8, "quoted_message"

    invoke-virtual {v1, v5, v7, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDownstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v5, v3, [Ljava/lang/reflect/Type;

    aput-object v6, v5, v4

    const-class v8, Ljava/lang/Integer;

    aput-object v8, v5, v2

    invoke-static {v9, v5}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v5

    const-string v8, "reaction_counts"

    invoke-virtual {v1, v5, v7, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableMapOfStringIntAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v5, v3, [Ljava/lang/reflect/Type;

    aput-object v6, v5, v4

    const-class v8, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;

    aput-object v8, v5, v2

    invoke-static {v9, v5}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v5

    const-string v8, "reaction_groups"

    invoke-virtual {v1, v5, v7, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableMapOfStringDownstreamReactionGroupDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-string v8, "reply_count"

    invoke-virtual {v1, v5, v7, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-string v5, "user"

    invoke-virtual {v1, v10, v7, v5}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->downstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v5, Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;

    const-string v8, "moderation_details"

    invoke-virtual {v1, v5, v7, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDownstreamModerationDetailsDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v5, Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;

    const-string v8, "moderation"

    invoke-virtual {v1, v5, v7, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDownstreamModerationDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v5, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;

    const-string v8, "poll"

    invoke-virtual {v1, v5, v7, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDownstreamPollDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v5, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;

    const-string v8, "reminder"

    invoke-virtual {v1, v5, v7, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDownstreamReminderInfoDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v5, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;

    const-string v8, "shared_location"

    invoke-virtual {v1, v5, v7, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDownstreamLocationDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v5, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;

    const-string v8, "member"

    invoke-virtual {v1, v5, v7, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDownstreamMemberInfoDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v5, Ljava/lang/Boolean;

    const-string v8, "deleted_for_me"

    invoke-virtual {v1, v5, v7, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableBooleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v3, v3, [Ljava/lang/reflect/Type;

    aput-object v6, v3, v4

    const-class v4, Ljava/lang/Object;

    aput-object v4, v3, v2

    invoke-static {v9, v3}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v2

    const-string v3, "extraData"

    invoke-virtual {v1, v2, v7, v3}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->mapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method


# virtual methods
.method public fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;
    .locals 118

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "reader"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 3
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    const/4 v3, 0x0

    const/4 v4, -0x1

    move-object/from16 v19, v2

    move-object/from16 v30, v19

    move-object/from16 v31, v30

    move-object v12, v3

    move-object v14, v12

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v28, v17

    move-object/from16 v29, v28

    move-object/from16 v32, v29

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v41, v39

    move-object/from16 v46, v41

    move-object/from16 v48, v46

    move-object/from16 v49, v48

    move-object/from16 v50, v49

    move-object/from16 v51, v50

    move-object/from16 v52, v51

    move-object/from16 v53, v52

    move-object/from16 v54, v53

    move-object/from16 v55, v54

    move-object/from16 v61, v55

    move-object/from16 v63, v61

    move-object/from16 v64, v63

    move-object/from16 v65, v64

    move-object/from16 v66, v65

    move-object/from16 v67, v66

    move-object/from16 v68, v67

    move-object/from16 v69, v68

    move-object/from16 v70, v69

    move-object/from16 v71, v70

    move-object/from16 v72, v71

    move-object/from16 v73, v72

    move v2, v4

    .line 4
    :goto_0
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v5

    const-string v6, "attachments"

    const-string v7, "cid"

    const-string v8, "created_at"

    const-string v9, "html"

    const-string v10, "id"

    const-string v11, "latest_reactions"

    const-string v13, "mentioned_users"

    move/from16 v18, v5

    const-string v5, "own_reactions"

    move-object/from16 v42, v14

    const-string v14, "reply_count"

    move-object/from16 v43, v15

    const-string v15, "deleted_reply_count"

    move-object/from16 v62, v3

    const-string v3, "silent"

    move-object/from16 v40, v12

    const-string v12, "text"

    move/from16 v20, v2

    const-string v2, "type"

    move-object/from16 v21, v6

    const-string v6, "updated_at"

    move-object/from16 v22, v7

    const-string v7, "user"

    move-object/from16 v23, v8

    const-string v8, "extraData"

    if-eqz v18, :cond_15

    move-object/from16 v18, v9

    .line 5
    iget-object v9, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->options:Lqx/v;

    invoke-virtual {v1, v9}, Lcom/squareup/moshi/JsonReader;->T(Lqx/v;)I

    move-result v9

    packed-switch v9, :pswitch_data_0

    goto :goto_1

    .line 6
    :pswitch_0
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->mapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v73, v2

    check-cast v73, Ljava/util/Map;

    if-eqz v73, :cond_0

    :goto_1
    move/from16 v2, v20

    :goto_2
    move-object/from16 v12, v40

    :goto_3
    move-object/from16 v14, v42

    :goto_4
    move-object/from16 v15, v43

    :goto_5
    move-object/from16 v3, v62

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {v8, v8, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 8
    :pswitch_1
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableBooleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v72, v2

    check-cast v72, Ljava/lang/Boolean;

    goto :goto_1

    .line 9
    :pswitch_2
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDownstreamMemberInfoDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v71, v2

    check-cast v71, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;

    and-int/lit8 v2, v20, -0x41

    goto :goto_2

    .line 10
    :pswitch_3
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDownstreamLocationDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v70, v2

    check-cast v70, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;

    and-int/lit8 v2, v20, -0x21

    goto :goto_2

    .line 11
    :pswitch_4
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDownstreamReminderInfoDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v69, v2

    check-cast v69, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;

    and-int/lit8 v2, v20, -0x11

    goto :goto_2

    .line 12
    :pswitch_5
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDownstreamPollDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v68, v2

    check-cast v68, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;

    and-int/lit8 v2, v20, -0x9

    goto :goto_2

    .line 13
    :pswitch_6
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDownstreamModerationDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v67, v2

    check-cast v67, Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;

    and-int/lit8 v2, v20, -0x5

    goto :goto_2

    .line 14
    :pswitch_7
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDownstreamModerationDetailsDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v66, v2

    check-cast v66, Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;

    and-int/lit8 v2, v20, -0x3

    goto :goto_2

    .line 15
    :pswitch_8
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->downstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v65, v2

    check-cast v65, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    if-eqz v65, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v7, v7, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 16
    :pswitch_9
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v64, v2

    check-cast v64, Ljava/util/Date;

    if-eqz v64, :cond_2

    goto/16 :goto_1

    :cond_2
    invoke-static {v6, v6, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 17
    :pswitch_a
    iget-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v3, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v63, v3

    check-cast v63, Ljava/lang/String;

    if-eqz v63, :cond_3

    goto/16 :goto_1

    :cond_3
    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 18
    :pswitch_b
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->listOfDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_4

    const v2, -0x20000001

    and-int/2addr v4, v2

    move/from16 v2, v20

    move-object/from16 v12, v40

    move-object/from16 v14, v42

    move-object/from16 v15, v43

    goto/16 :goto_0

    .line 19
    :cond_4
    const-string v2, "thread_participants"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 20
    :pswitch_c
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v61, v2

    check-cast v61, Ljava/lang/String;

    if-eqz v61, :cond_5

    goto/16 :goto_1

    :cond_5
    invoke-static {v12, v12, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 21
    :pswitch_d
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v32, v2

    check-cast v32, Ljava/lang/Boolean;

    if-eqz v32, :cond_6

    goto/16 :goto_1

    :cond_6
    invoke-static {v3, v3, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 22
    :pswitch_e
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v31, v2

    check-cast v31, Ljava/lang/Boolean;

    if-eqz v31, :cond_7

    const v2, -0x4000001

    :goto_6
    and-int/2addr v4, v2

    goto/16 :goto_1

    .line 23
    :cond_7
    const-string v2, "show_in_channel"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 24
    :pswitch_f
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v30, v2

    check-cast v30, Ljava/lang/Boolean;

    if-eqz v30, :cond_8

    const v2, -0x2000001

    goto :goto_6

    :cond_8
    const-string v2, "shadowed"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 25
    :pswitch_10
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v29, v2

    check-cast v29, Ljava/lang/Integer;

    if-eqz v29, :cond_9

    goto/16 :goto_1

    .line 26
    :cond_9
    invoke-static {v15, v15, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 27
    :pswitch_11
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v28, v2

    check-cast v28, Ljava/lang/Integer;

    if-eqz v28, :cond_a

    goto/16 :goto_1

    :cond_a
    invoke-static {v14, v14, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 28
    :pswitch_12
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableMapOfStringDownstreamReactionGroupDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v55, v2

    check-cast v55, Ljava/util/Map;

    goto/16 :goto_1

    .line 29
    :pswitch_13
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableMapOfStringIntAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v54, v2

    check-cast v54, Ljava/util/Map;

    goto/16 :goto_1

    .line 30
    :pswitch_14
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableMapOfStringIntAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v53, v2

    check-cast v53, Ljava/util/Map;

    goto/16 :goto_1

    .line 31
    :pswitch_15
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v52, v2

    check-cast v52, Ljava/lang/String;

    goto/16 :goto_1

    .line 32
    :pswitch_16
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDownstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v51, v2

    check-cast v51, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    goto/16 :goto_1

    .line 33
    :pswitch_17
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v50, v2

    check-cast v50, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    goto/16 :goto_1

    .line 34
    :pswitch_18
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v49, v2

    check-cast v49, Ljava/util/Date;

    goto/16 :goto_1

    .line 35
    :pswitch_19
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v48, v2

    check-cast v48, Ljava/util/Date;

    goto/16 :goto_1

    .line 36
    :pswitch_1a
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v19, v2

    check-cast v19, Ljava/lang/Boolean;

    if-eqz v19, :cond_b

    and-int/lit16 v4, v4, -0x4001

    goto/16 :goto_1

    :cond_b
    const-string v2, "pinned"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 37
    :pswitch_1b
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v46, v2

    check-cast v46, Ljava/util/Date;

    goto/16 :goto_1

    .line 38
    :pswitch_1c
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Ljava/lang/String;

    goto/16 :goto_1

    .line 39
    :pswitch_1d
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->listOfDownstreamReactionDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Ljava/util/List;

    if-eqz v16, :cond_c

    goto/16 :goto_1

    .line 40
    :cond_c
    invoke-static {v5, v5, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 41
    :pswitch_1e
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->listOfDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Ljava/util/List;

    if-eqz v15, :cond_d

    move/from16 v2, v20

    move-object/from16 v12, v40

    move-object/from16 v14, v42

    goto/16 :goto_5

    .line 42
    :cond_d
    invoke-static {v13, v13, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 43
    :pswitch_1f
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->listOfDownstreamReactionDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Ljava/util/List;

    if-eqz v14, :cond_e

    move/from16 v2, v20

    move-object/from16 v12, v40

    goto/16 :goto_4

    .line 44
    :cond_e
    invoke-static {v11, v11, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 45
    :pswitch_20
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v41, v2

    check-cast v41, Ljava/lang/String;

    if-eqz v41, :cond_f

    goto/16 :goto_1

    :cond_f
    invoke-static {v10, v10, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 46
    :pswitch_21
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->mapOfStringStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Ljava/util/Map;

    if-eqz v12, :cond_10

    and-int/lit16 v4, v4, -0x81

    move/from16 v2, v20

    goto/16 :goto_3

    :cond_10
    const-string v2, "i18n"

    .line 47
    const-string v3, "i18n"

    .line 48
    invoke-static {v2, v3, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 49
    :pswitch_22
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v39, v2

    check-cast v39, Ljava/lang/String;

    if-eqz v39, :cond_11

    goto/16 :goto_1

    :cond_11
    move-object/from16 v9, v18

    invoke-static {v9, v9, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 50
    :pswitch_23
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v38, v2

    check-cast v38, Ljava/util/Date;

    goto/16 :goto_1

    .line 51
    :pswitch_24
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v37, v2

    check-cast v37, Ljava/util/Date;

    if-eqz v37, :cond_12

    goto/16 :goto_1

    :cond_12
    move-object/from16 v2, v23

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 52
    :pswitch_25
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v36, v2

    check-cast v36, Ljava/lang/String;

    goto/16 :goto_1

    .line 53
    :pswitch_26
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v35, v2

    check-cast v35, Ljava/lang/String;

    if-eqz v35, :cond_13

    goto/16 :goto_1

    :cond_13
    move-object/from16 v2, v22

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 54
    :pswitch_27
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableChannelInfoDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v34, v2

    check-cast v34, Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;

    goto/16 :goto_1

    .line 55
    :pswitch_28
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->listOfAttachmentDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v33, v2

    check-cast v33, Ljava/util/List;

    if-eqz v33, :cond_14

    goto/16 :goto_1

    :cond_14
    move-object/from16 v2, v21

    .line 56
    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 57
    :pswitch_29
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->b0()V

    .line 58
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    goto/16 :goto_1

    :cond_15
    move-object/from16 v0, v23

    .line 59
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    const v0, -0x26004081

    if-ne v4, v0, :cond_27

    const/16 v0, -0x7f

    move/from16 v18, v4

    move/from16 v4, v20

    if-ne v4, v0, :cond_26

    move-object/from16 v0, v32

    .line 60
    new-instance v32, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    if-eqz v33, :cond_25

    if-eqz v35, :cond_24

    if-eqz v37, :cond_23

    if-eqz v39, :cond_22

    .line 61
    const-string v4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>"

    move-object/from16 v9, v40

    invoke-static {v9, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v41, :cond_21

    if-eqz v42, :cond_20

    if-eqz v43, :cond_1f

    if-eqz v16, :cond_1e

    .line 62
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v47

    if-eqz v28, :cond_1d

    .line 63
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Integer;->intValue()I

    move-result v56

    if-eqz v29, :cond_1c

    .line 64
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Integer;->intValue()I

    move-result v57

    .line 65
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v58

    .line 66
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v59

    if-eqz v0, :cond_1b

    .line 67
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v60

    if-eqz v61, :cond_1a

    .line 68
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto>"

    move-object/from16 v3, v62

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v63, :cond_19

    if-eqz v64, :cond_18

    if-eqz v65, :cond_17

    if-eqz v73, :cond_16

    move-object/from16 v62, v3

    move-object/from16 v40, v9

    move-object/from16 v44, v16

    move-object/from16 v45, v17

    .line 69
    invoke-direct/range {v32 .. v73}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;-><init>(Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;IIZZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;Ljava/lang/Boolean;Ljava/util/Map;)V

    return-object v32

    .line 70
    :cond_16
    invoke-static {v8, v8, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 71
    :cond_17
    invoke-static {v7, v7, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 72
    :cond_18
    invoke-static {v6, v6, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 73
    :cond_19
    invoke-static {v2, v2, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 74
    :cond_1a
    invoke-static {v12, v12, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 75
    :cond_1b
    invoke-static {v3, v3, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 76
    :cond_1c
    invoke-static {v15, v15, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 77
    :cond_1d
    invoke-static {v14, v14, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 78
    :cond_1e
    invoke-static {v5, v5, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 79
    :cond_1f
    invoke-static {v13, v13, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 80
    :cond_20
    invoke-static {v11, v11, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 81
    :cond_21
    invoke-static {v10, v10, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 82
    :cond_22
    invoke-static {v9, v9, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    :cond_23
    move-object/from16 v0, v23

    .line 83
    invoke-static {v0, v0, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    :cond_24
    move-object/from16 v0, v22

    .line 84
    invoke-static {v0, v0, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    :cond_25
    move-object/from16 v0, v21

    .line 85
    invoke-static {v0, v0, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    :cond_26
    move/from16 v20, v4

    :goto_7
    move-object/from16 v4, p0

    goto :goto_8

    :cond_27
    move/from16 v18, v4

    goto :goto_7

    .line 86
    :goto_8
    iget-object v0, v4, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    if-nez v0, :cond_28

    .line 87
    const-class v114, Ljava/util/Map;

    .line 88
    sget-object v117, Lrx/f;->c:Ljava/lang/Class;

    const-class v74, Ljava/util/List;

    const-class v75, Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;

    const-class v76, Ljava/lang/String;

    const-class v77, Ljava/lang/String;

    const-class v78, Ljava/util/Date;

    const-class v79, Ljava/util/Date;

    const-class v80, Ljava/lang/String;

    const-class v81, Ljava/util/Map;

    const-class v82, Ljava/lang/String;

    const-class v83, Ljava/util/List;

    const-class v84, Ljava/util/List;

    const-class v85, Ljava/util/List;

    const-class v86, Ljava/lang/String;

    const-class v87, Ljava/util/Date;

    sget-object v88, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-class v89, Ljava/util/Date;

    const-class v90, Ljava/util/Date;

    const-class v91, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    const-class v92, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    const-class v93, Ljava/lang/String;

    const-class v94, Ljava/util/Map;

    const-class v95, Ljava/util/Map;

    const-class v96, Ljava/util/Map;

    sget-object v97, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v102, Ljava/lang/String;

    const-class v103, Ljava/util/List;

    const-class v104, Ljava/lang/String;

    const-class v105, Ljava/util/Date;

    const-class v106, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    const-class v107, Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;

    const-class v108, Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;

    const-class v109, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;

    const-class v110, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;

    const-class v111, Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;

    const-class v112, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;

    const-class v113, Ljava/lang/Boolean;

    move-object/from16 v98, v97

    move-object/from16 v99, v88

    move-object/from16 v100, v88

    move-object/from16 v101, v88

    move-object/from16 v115, v97

    move-object/from16 v116, v97

    filled-new-array/range {v74 .. v117}, [Ljava/lang/Class;

    move-result-object v0

    move-object/from16 v24, v9

    .line 89
    const-class v9, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    invoke-virtual {v9, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 90
    iput-object v0, v4, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    .line 91
    const-string v9, "also(...)"

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_9

    :cond_28
    move-object/from16 v24, v9

    :goto_9
    if-eqz v33, :cond_38

    if-eqz v35, :cond_37

    if-eqz v37, :cond_36

    if-eqz v39, :cond_35

    if-eqz v41, :cond_34

    if-eqz v42, :cond_33

    if-eqz v43, :cond_32

    if-eqz v16, :cond_31

    if-eqz v28, :cond_30

    if-eqz v29, :cond_2f

    if-eqz v32, :cond_2e

    if-eqz v61, :cond_2d

    if-eqz v63, :cond_2c

    if-eqz v64, :cond_2b

    if-eqz v65, :cond_2a

    if-eqz v73, :cond_29

    .line 92
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v47

    move-object/from16 v20, v48

    const/16 v48, 0x0

    move-object/from16 v5, v33

    move-object/from16 v6, v34

    move-object/from16 v7, v35

    move-object/from16 v8, v36

    move-object/from16 v9, v37

    move-object/from16 v10, v38

    move-object/from16 v11, v39

    move-object/from16 v12, v40

    move-object/from16 v13, v41

    move-object/from16 v14, v42

    move-object/from16 v15, v43

    move-object/from16 v18, v46

    move-object/from16 v21, v49

    move-object/from16 v22, v50

    move-object/from16 v23, v51

    move-object/from16 v24, v52

    move-object/from16 v25, v53

    move-object/from16 v26, v54

    move-object/from16 v27, v55

    move-object/from16 v33, v61

    move-object/from16 v34, v62

    move-object/from16 v35, v63

    move-object/from16 v36, v64

    move-object/from16 v37, v65

    move-object/from16 v38, v66

    move-object/from16 v39, v67

    move-object/from16 v40, v68

    move-object/from16 v41, v69

    move-object/from16 v42, v70

    move-object/from16 v43, v71

    move-object/from16 v44, v72

    move-object/from16 v45, v73

    move-object/from16 v46, v1

    .line 93
    filled-new-array/range {v5 .. v48}, [Ljava/lang/Object;

    move-result-object v1

    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 95
    const-string v1, "newInstance(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    return-object v0

    :cond_29
    invoke-static {v8, v8, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 96
    :cond_2a
    invoke-static {v7, v7, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 97
    :cond_2b
    invoke-static {v6, v6, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 98
    :cond_2c
    invoke-static {v2, v2, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 99
    :cond_2d
    invoke-static {v12, v12, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 100
    :cond_2e
    invoke-static {v3, v3, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 101
    :cond_2f
    invoke-static {v15, v15, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 102
    :cond_30
    invoke-static {v14, v14, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 103
    :cond_31
    invoke-static {v5, v5, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 104
    :cond_32
    invoke-static {v13, v13, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 105
    :cond_33
    invoke-static {v11, v11, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 106
    :cond_34
    invoke-static {v10, v10, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    :cond_35
    move-object/from16 v9, v24

    .line 107
    invoke-static {v9, v9, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    :cond_36
    move-object/from16 v0, v23

    .line 108
    invoke-static {v0, v0, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    :cond_37
    move-object/from16 v0, v22

    .line 109
    invoke-static {v0, v0, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    :cond_38
    move-object/from16 v0, v21

    .line 110
    invoke-static {v0, v0, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;)V
    .locals 2

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lqx/c0;->h()Lqx/c0;

    .line 3
    const-string v0, "attachments"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 4
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->listOfAttachmentDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getAttachments()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 5
    const-string v0, "channel"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 6
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableChannelInfoDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getChannel()Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 7
    const-string v0, "cid"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 8
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 9
    const-string v0, "command"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 10
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getCommand()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 11
    const-string v0, "created_at"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 12
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getCreated_at()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 13
    const-string v0, "deleted_at"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 14
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getDeleted_at()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 15
    const-string v0, "html"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 16
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getHtml()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 17
    const-string v0, "i18n"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 18
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->mapOfStringStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getI18n()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 19
    const-string v0, "id"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 20
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 21
    const-string v0, "latest_reactions"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 22
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->listOfDownstreamReactionDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getLatest_reactions()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 23
    const-string v0, "mentioned_users"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 24
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->listOfDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getMentioned_users()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 25
    const-string v0, "own_reactions"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 26
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->listOfDownstreamReactionDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getOwn_reactions()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 27
    const-string v0, "parent_id"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 28
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getParent_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 29
    const-string v0, "pin_expires"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 30
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getPin_expires()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 31
    const-string v0, "pinned"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 32
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getPinned()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 33
    const-string v0, "pinned_at"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 34
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getPinned_at()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 35
    const-string v0, "message_text_updated_at"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 36
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getMessage_text_updated_at()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 37
    const-string v0, "pinned_by"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 38
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getPinned_by()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 39
    const-string v0, "quoted_message"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 40
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDownstreamMessageDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getQuoted_message()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 41
    const-string v0, "quoted_message_id"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 42
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getQuoted_message_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 43
    const-string v0, "reaction_counts"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 44
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableMapOfStringIntAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getReaction_counts()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 45
    const-string v0, "reaction_scores"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 46
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableMapOfStringIntAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getReaction_scores()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 47
    const-string v0, "reaction_groups"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 48
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableMapOfStringDownstreamReactionGroupDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getReaction_groups()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 49
    const-string v0, "reply_count"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 50
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getReply_count()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 51
    const-string v0, "deleted_reply_count"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 52
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getDeleted_reply_count()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 53
    const-string v0, "shadowed"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 54
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getShadowed()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 55
    const-string v0, "show_in_channel"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 56
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getShow_in_channel()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 57
    const-string v0, "silent"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 58
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getSilent()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 59
    const-string v0, "text"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 60
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 61
    const-string v0, "thread_participants"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 62
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->listOfDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getThread_participants()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 63
    const-string v0, "type"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 64
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 65
    const-string v0, "updated_at"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 66
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getUpdated_at()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 67
    const-string v0, "user"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 68
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->downstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getUser()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 69
    const-string v0, "moderation_details"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 70
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDownstreamModerationDetailsDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getModeration_details()Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDetailsDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 71
    const-string v0, "moderation"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 72
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDownstreamModerationDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getModeration()Lio/getstream/chat/android/client/api2/model/dto/DownstreamModerationDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 73
    const-string v0, "poll"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 74
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDownstreamPollDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getPoll()Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 75
    const-string v0, "reminder"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 76
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDownstreamReminderInfoDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getReminder()Lio/getstream/chat/android/client/api2/model/dto/DownstreamReminderInfoDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 77
    const-string v0, "shared_location"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 78
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDownstreamLocationDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getShared_location()Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 79
    const-string v0, "member"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 80
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableDownstreamMemberInfoDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getMember()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberInfoDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 81
    const-string v0, "deleted_for_me"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 82
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->nullableBooleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getDeleted_for_me()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 83
    const-string v0, "extraData"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 84
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->mapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->getExtraData()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 85
    invoke-virtual {p1}, Lqx/c0;->m()Lqx/c0;

    return-void

    .line 86
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDtoJsonAdapter;->toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    const/16 v0, 0x2a

    const-string v1, "GeneratedJsonAdapter(DownstreamMessageDto)"

    invoke-static {v0, v1}, Lvl/b;->e(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
