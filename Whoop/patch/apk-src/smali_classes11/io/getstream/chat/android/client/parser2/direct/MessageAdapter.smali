.class public final Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/moshi/JsonAdapter<",
        "Lio/getstream/chat/android/models/Message;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u00a3\u0001\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0001\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0001\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0001\u0012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0001\u0012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0001\u0012\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0001\u0012\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0001\u0012\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0001\u0012\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0019\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\u0008 \u0010!J\u0019\u0010\"\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008\"\u0010#J!\u0010\"\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0008\u0010$\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\"\u0010%J!\u0010*\u001a\u00020)2\u0006\u0010\'\u001a\u00020&2\u0008\u0010(\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008*\u0010+R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010,R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010,R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010-R\u001a\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010,R\u001a\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010,R\u001a\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010,R\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010,R\u001a\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010,R\u001a\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010,R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010,R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010.\u00a8\u0006/"
    }
    d2 = {
        "Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/models/Message;",
        "Lio/getstream/chat/android/models/Attachment;",
        "attachmentAdapter",
        "Lio/getstream/chat/android/models/ChannelInfo;",
        "channelInfoAdapter",
        "Lio/getstream/chat/android/models/Reaction;",
        "reactionAdapter",
        "Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;",
        "reactionGroupAdapter",
        "Lio/getstream/chat/android/models/User;",
        "userAdapter",
        "Lio/getstream/chat/android/models/MessageModerationDetails;",
        "moderationDetailsAdapter",
        "Lio/getstream/chat/android/models/Moderation;",
        "moderationAdapter",
        "Lio/getstream/chat/android/models/Poll;",
        "pollAdapter",
        "Lio/getstream/chat/android/models/MessageReminderInfo;",
        "reminderAdapter",
        "Lio/getstream/chat/android/models/Location;",
        "locationAdapter",
        "Ljava/util/Date;",
        "dateAdapter",
        "Lio/getstream/chat/android/models/MessageTransformer;",
        "messageTransformer",
        "<init>",
        "(Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lio/getstream/chat/android/models/MessageTransformer;)V",
        "Lcom/squareup/moshi/JsonReader;",
        "reader",
        "",
        "parseMemberChannelRole",
        "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;",
        "fromJson",
        "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/Message;",
        "fallbackChannelInfo",
        "(Lcom/squareup/moshi/JsonReader;Lio/getstream/chat/android/models/ChannelInfo;)Lio/getstream/chat/android/models/Message;",
        "Lqx/c0;",
        "p0",
        "p1",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Lio/getstream/chat/android/models/Message;)V",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;",
        "Lio/getstream/chat/android/models/MessageTransformer;",
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
.field private final attachmentAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;"
        }
    .end annotation
.end field

.field private final channelInfoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/ChannelInfo;",
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

.field private final locationAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/Location;",
            ">;"
        }
    .end annotation
.end field

.field private final messageTransformer:Lio/getstream/chat/android/models/MessageTransformer;

.field private final moderationAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/Moderation;",
            ">;"
        }
    .end annotation
.end field

.field private final moderationDetailsAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/MessageModerationDetails;",
            ">;"
        }
    .end annotation
.end field

.field private final pollAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/Poll;",
            ">;"
        }
    .end annotation
.end field

.field private final reactionAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;"
        }
    .end annotation
.end field

.field private final reactionGroupAdapter:Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;

.field private final reminderAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/MessageReminderInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final userAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lio/getstream/chat/android/models/MessageTransformer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/ChannelInfo;",
            ">;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;",
            "Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/MessageModerationDetails;",
            ">;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/Moderation;",
            ">;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/Poll;",
            ">;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/MessageReminderInfo;",
            ">;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/models/Location;",
            ">;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Date;",
            ">;",
            "Lio/getstream/chat/android/models/MessageTransformer;",
            ")V"
        }
    .end annotation

    const-string v0, "attachmentAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelInfoAdapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactionAdapter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactionGroupAdapter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userAdapter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moderationDetailsAdapter"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moderationAdapter"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollAdapter"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reminderAdapter"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationAdapter"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateAdapter"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageTransformer"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->attachmentAdapter:Lcom/squareup/moshi/JsonAdapter;

    iput-object p2, p0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->channelInfoAdapter:Lcom/squareup/moshi/JsonAdapter;

    iput-object p3, p0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->reactionAdapter:Lcom/squareup/moshi/JsonAdapter;

    iput-object p4, p0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->reactionGroupAdapter:Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;

    iput-object p5, p0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->userAdapter:Lcom/squareup/moshi/JsonAdapter;

    iput-object p6, p0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->moderationDetailsAdapter:Lcom/squareup/moshi/JsonAdapter;

    iput-object p7, p0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->moderationAdapter:Lcom/squareup/moshi/JsonAdapter;

    iput-object p8, p0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->pollAdapter:Lcom/squareup/moshi/JsonAdapter;

    iput-object p9, p0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->reminderAdapter:Lcom/squareup/moshi/JsonAdapter;

    iput-object p10, p0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->locationAdapter:Lcom/squareup/moshi/JsonAdapter;

    iput-object p11, p0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    iput-object p12, p0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->messageTransformer:Lio/getstream/chat/android/models/MessageTransformer;

    return-void
.end method

.method private final parseMemberChannelRole(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    sget-object v1, Lqx/w;->y:Lqx/w;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    return-object v2

    :cond_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    :goto_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "channel_role"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableString(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    return-object v2
.end method


# virtual methods
.method public final fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/Message;
    .locals 1

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;Lio/getstream/chat/android/models/ChannelInfo;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1
.end method

.method public final fromJson(Lcom/squareup/moshi/JsonReader;Lio/getstream/chat/android/models/ChannelInfo;)Lio/getstream/chat/android/models/Message;
    .locals 110

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "reader"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v2

    sget-object v3, Lqx/w;->I:Lqx/w;

    const/4 v4, 0x0

    if-ne v2, v3, :cond_0

    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->i()V

    return-object v4

    .line 4
    :cond_0
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    move-object v2, v4

    move-object v3, v2

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v17, v15

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v37, v30

    move-object/from16 v39, v37

    move-object/from16 v40, v39

    move-object/from16 v41, v40

    move-object/from16 v45, v41

    move-object/from16 v46, v45

    move-object/from16 v47, v46

    move-object/from16 v48, v47

    move-object/from16 v50, v48

    move-object/from16 v51, v50

    move-object/from16 v52, v51

    move-object/from16 v57, v52

    move-object/from16 v58, v57

    .line 5
    :goto_0
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v31

    move-object/from16 v32, v15

    const-string v15, "silent"

    move-object/from16 v33, v13

    const-string v13, "deleted_reply_count"

    move-object/from16 v34, v11

    const-string v11, "attachments"

    move-object/from16 v35, v10

    const-string v10, "updated_at"

    move-object/from16 v36, v8

    const-string v8, "latest_reactions"

    move-object/from16 v38, v5

    const-string v5, "id"

    move-object/from16 v42, v14

    const-string v14, "cid"

    move-object/from16 v43, v3

    const-string v3, "html"

    move-object/from16 v44, v6

    const-string v6, "text"

    move-object/from16 v49, v9

    const-string v9, "type"

    move-object/from16 v53, v2

    const-string v2, "user"

    move-object/from16 v54, v7

    const-string v7, "reply_count"

    move-object/from16 v55, v12

    const-string v12, "created_at"

    move-object/from16 v56, v4

    const-string v4, "mentioned_users"

    move-object/from16 v59, v15

    const-string v15, "own_reactions"

    if-eqz v31, :cond_2a

    move-object/from16 v31, v13

    .line 6
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextName()Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_29

    .line 7
    invoke-virtual {v13}, Ljava/lang/String;->hashCode()I

    move-result v60

    sparse-switch v60, :sswitch_data_0

    goto/16 :goto_f

    :sswitch_0
    const-string v2, "parent_id"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_f

    .line 8
    :cond_1
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableString(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;

    move-result-object v21

    :goto_1
    move-object/from16 v15, v32

    :goto_2
    move-object/from16 v13, v33

    :goto_3
    move-object/from16 v11, v34

    :goto_4
    move-object/from16 v10, v35

    :goto_5
    move-object/from16 v8, v36

    :goto_6
    move-object/from16 v5, v38

    :goto_7
    move-object/from16 v14, v42

    :goto_8
    move-object/from16 v3, v43

    :goto_9
    move-object/from16 v6, v44

    :goto_a
    move-object/from16 v9, v49

    :goto_b
    move-object/from16 v2, v53

    :goto_c
    move-object/from16 v7, v54

    :goto_d
    move-object/from16 v12, v55

    :goto_e
    move-object/from16 v4, v56

    goto :goto_0

    .line 9
    :sswitch_1
    const-string v2, "reaction_scores"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_f

    .line 10
    :cond_2
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->parseIntMap(Lcom/squareup/moshi/JsonReader;)Ljava/util/Map;

    move-result-object v24

    goto :goto_1

    .line 11
    :sswitch_2
    const-string v2, "deleted_for_me"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto/16 :goto_f

    .line 12
    :cond_3
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableBoolean(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Boolean;

    move-result-object v30

    goto :goto_1

    .line 13
    :sswitch_3
    const-string v2, "deleted_at"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto/16 :goto_f

    .line 14
    :cond_4
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v26, v2

    check-cast v26, Ljava/util/Date;

    goto :goto_1

    .line 15
    :sswitch_4
    const-string v2, "reaction_groups"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto/16 :goto_f

    .line 16
    :cond_5
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->reactionGroupAdapter:Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;->parseReactionGroupsMap(Lcom/squareup/moshi/JsonReader;)Ljava/util/Map;

    move-result-object v25

    goto :goto_1

    .line 17
    :sswitch_5
    const-string v2, "reaction_counts"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto/16 :goto_f

    .line 18
    :cond_6
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->parseIntMap(Lcom/squareup/moshi/JsonReader;)Ljava/util/Map;

    move-result-object v23

    goto :goto_1

    .line 19
    :sswitch_6
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto/16 :goto_f

    .line 20
    :cond_7
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    iget-object v3, v0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->reactionAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1, v3}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->parseList(Lcom/squareup/moshi/JsonReader;Lcom/squareup/moshi/JsonAdapter;)Ljava/util/List;

    move-result-object v5

    move-object/from16 v15, v32

    move-object/from16 v13, v33

    move-object/from16 v11, v34

    move-object/from16 v10, v35

    move-object/from16 v8, v36

    goto/16 :goto_7

    .line 21
    :sswitch_7
    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto/16 :goto_f

    .line 22
    :cond_8
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    iget-object v3, v0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->userAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1, v3}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->parseList(Lcom/squareup/moshi/JsonReader;Lcom/squareup/moshi/JsonAdapter;)Ljava/util/List;

    move-result-object v14

    move-object/from16 v15, v32

    move-object/from16 v13, v33

    move-object/from16 v11, v34

    move-object/from16 v10, v35

    move-object/from16 v8, v36

    move-object/from16 v5, v38

    goto/16 :goto_8

    .line 23
    :sswitch_8
    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto/16 :goto_f

    .line 24
    :cond_9
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Date;

    move-object/from16 v15, v32

    move-object/from16 v13, v33

    move-object/from16 v11, v34

    move-object/from16 v10, v35

    move-object/from16 v8, v36

    move-object/from16 v5, v38

    move-object/from16 v14, v42

    move-object/from16 v3, v43

    move-object/from16 v6, v44

    move-object/from16 v9, v49

    goto/16 :goto_c

    .line 25
    :sswitch_9
    const-string v2, "pin_expires"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto/16 :goto_f

    .line 26
    :cond_a
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v40, v2

    check-cast v40, Ljava/util/Date;

    goto/16 :goto_1

    .line 27
    :sswitch_a
    const-string v2, "thread_participants"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    goto/16 :goto_f

    .line 28
    :cond_b
    sget-object v3, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v3, v1, v2}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->rejectExplicitNull(Lcom/squareup/moshi/JsonReader;Ljava/lang/String;)V

    .line 29
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->userAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v3, v1, v2}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->parseList(Lcom/squareup/moshi/JsonReader;Lcom/squareup/moshi/JsonAdapter;)Ljava/util/List;

    move-result-object v29

    goto/16 :goto_1

    .line 30
    :sswitch_b
    const-string v2, "moderation_details"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    goto/16 :goto_f

    .line 31
    :cond_c
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->moderationDetailsAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v45, v2

    check-cast v45, Lio/getstream/chat/android/models/MessageModerationDetails;

    goto/16 :goto_1

    .line 32
    :sswitch_c
    const-string v2, "message_text_updated_at"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto/16 :goto_f

    .line 33
    :cond_d
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v47, v2

    check-cast v47, Ljava/util/Date;

    goto/16 :goto_1

    .line 34
    :sswitch_d
    const-string v2, "command"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    goto/16 :goto_f

    .line 35
    :cond_e
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableString(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;

    move-result-object v19

    goto/16 :goto_1

    .line 36
    :sswitch_e
    const-string v2, "channel"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    goto/16 :goto_f

    .line 37
    :cond_f
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->channelInfoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Lio/getstream/chat/android/models/ChannelInfo;

    goto/16 :goto_1

    .line 38
    :sswitch_f
    invoke-virtual {v13, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    goto/16 :goto_f

    .line 39
    :cond_10
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextInt()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    move-object/from16 v15, v32

    move-object/from16 v13, v33

    move-object/from16 v11, v34

    move-object/from16 v10, v35

    goto/16 :goto_6

    .line 40
    :sswitch_10
    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    goto/16 :goto_f

    .line 41
    :cond_11
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->userAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v57, v2

    check-cast v57, Lio/getstream/chat/android/models/User;

    goto/16 :goto_1

    .line 42
    :sswitch_11
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    goto/16 :goto_f

    .line 43
    :cond_12
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v15

    goto/16 :goto_2

    .line 44
    :sswitch_12
    invoke-virtual {v13, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    goto/16 :goto_f

    .line 45
    :cond_13
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v15, v32

    goto/16 :goto_3

    .line 46
    :sswitch_13
    const-string v2, "poll"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    goto/16 :goto_f

    .line 47
    :cond_14
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->pollAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v48, v2

    check-cast v48, Lio/getstream/chat/android/models/Poll;

    goto/16 :goto_1

    .line 48
    :sswitch_14
    invoke-virtual {v13, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    goto/16 :goto_f

    .line 49
    :cond_15
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v15, v32

    move-object/from16 v13, v33

    move-object/from16 v11, v34

    move-object/from16 v10, v35

    move-object/from16 v8, v36

    move-object/from16 v5, v38

    move-object/from16 v14, v42

    move-object/from16 v3, v43

    move-object/from16 v6, v44

    goto/16 :goto_b

    .line 50
    :sswitch_15
    const-string v2, "i18n"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_16

    goto/16 :goto_f

    .line 51
    :cond_16
    sget-object v3, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v3, v1, v2}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->rejectExplicitNull(Lcom/squareup/moshi/JsonReader;Ljava/lang/String;)V

    .line 52
    invoke-virtual {v3, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->parseStringMap(Lcom/squareup/moshi/JsonReader;)Ljava/util/Map;

    move-result-object v20

    goto/16 :goto_1

    .line 53
    :sswitch_16
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_17

    goto/16 :goto_f

    .line 54
    :cond_17
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v15, v32

    move-object/from16 v13, v33

    move-object/from16 v11, v34

    move-object/from16 v10, v35

    move-object/from16 v8, v36

    move-object/from16 v5, v38

    move-object/from16 v14, v42

    move-object/from16 v3, v43

    move-object/from16 v6, v44

    move-object/from16 v9, v49

    move-object/from16 v2, v53

    goto/16 :goto_d

    .line 55
    :sswitch_17
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_18

    goto/16 :goto_f

    .line 56
    :cond_18
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v15, v32

    move-object/from16 v13, v33

    move-object/from16 v11, v34

    move-object/from16 v10, v35

    move-object/from16 v8, v36

    move-object/from16 v5, v38

    move-object/from16 v14, v42

    move-object/from16 v3, v43

    goto/16 :goto_a

    .line 57
    :sswitch_18
    const-string v2, "show_in_channel"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_19

    goto/16 :goto_f

    .line 58
    :cond_19
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->h()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v28

    goto/16 :goto_1

    .line 59
    :sswitch_19
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1a

    goto/16 :goto_f

    .line 60
    :cond_1a
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    iget-object v3, v0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->reactionAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1, v3}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->parseList(Lcom/squareup/moshi/JsonReader;Lcom/squareup/moshi/JsonAdapter;)Ljava/util/List;

    move-result-object v3

    move-object/from16 v15, v32

    move-object/from16 v13, v33

    move-object/from16 v11, v34

    move-object/from16 v10, v35

    move-object/from16 v8, v36

    move-object/from16 v5, v38

    move-object/from16 v14, v42

    goto/16 :goto_9

    .line 61
    :sswitch_1a
    const-string v2, "quoted_message_id"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    goto/16 :goto_f

    .line 62
    :cond_1b
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->readNullableString(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;

    move-result-object v37

    goto/16 :goto_1

    .line 63
    :sswitch_1b
    const-string v2, "pinned_by"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1c

    goto/16 :goto_f

    .line 64
    :cond_1c
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->userAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v41, v2

    check-cast v41, Lio/getstream/chat/android/models/User;

    goto/16 :goto_1

    .line 65
    :sswitch_1c
    const-string v2, "pinned_at"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1d

    goto/16 :goto_f

    .line 66
    :cond_1d
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v39, v2

    check-cast v39, Ljava/util/Date;

    goto/16 :goto_1

    .line 67
    :sswitch_1d
    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1e

    goto/16 :goto_f

    .line 68
    :cond_1e
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/util/Date;

    move-object/from16 v18, v4

    goto/16 :goto_1

    .line 69
    :sswitch_1e
    const-string v2, "reminder"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1f

    goto/16 :goto_f

    .line 70
    :cond_1f
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->reminderAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v50, v2

    check-cast v50, Lio/getstream/chat/android/models/MessageReminderInfo;

    goto/16 :goto_1

    .line 71
    :sswitch_1f
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_20

    goto/16 :goto_f

    .line 72
    :cond_20
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    iget-object v3, v0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->attachmentAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1, v3}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->parseList(Lcom/squareup/moshi/JsonReader;Lcom/squareup/moshi/JsonAdapter;)Ljava/util/List;

    move-result-object v12

    move-object/from16 v15, v32

    move-object/from16 v13, v33

    move-object/from16 v11, v34

    move-object/from16 v10, v35

    move-object/from16 v8, v36

    move-object/from16 v5, v38

    move-object/from16 v14, v42

    move-object/from16 v3, v43

    move-object/from16 v6, v44

    move-object/from16 v9, v49

    move-object/from16 v2, v53

    move-object/from16 v7, v54

    goto/16 :goto_e

    .line 73
    :sswitch_20
    const-string v2, "shadowed"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_21

    goto/16 :goto_f

    .line 74
    :cond_21
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->h()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v27

    goto/16 :goto_1

    :sswitch_21
    move-object/from16 v2, v31

    .line 75
    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_22

    goto/16 :goto_f

    .line 76
    :cond_22
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->nextInt()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    move-object/from16 v15, v32

    move-object/from16 v13, v33

    move-object/from16 v11, v34

    goto/16 :goto_5

    :sswitch_22
    move-object/from16 v2, v59

    .line 77
    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_23

    goto/16 :goto_f

    .line 78
    :cond_23
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->h()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    move-object/from16 v15, v32

    move-object/from16 v13, v33

    goto/16 :goto_4

    .line 79
    :sswitch_23
    const-string v2, "pinned"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_24

    goto :goto_f

    .line 80
    :cond_24
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->h()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v22

    goto/16 :goto_1

    .line 81
    :sswitch_24
    const-string v2, "member"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_25

    goto :goto_f

    .line 82
    :cond_25
    invoke-direct/range {p0 .. p1}, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->parseMemberChannelRole(Lcom/squareup/moshi/JsonReader;)Ljava/lang/String;

    move-result-object v52

    goto/16 :goto_1

    .line 83
    :sswitch_25
    const-string v2, "quoted_message"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_26

    goto :goto_f

    .line 84
    :cond_26
    invoke-virtual/range {p0 .. p2}, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;Lio/getstream/chat/android/models/ChannelInfo;)Lio/getstream/chat/android/models/Message;

    move-result-object v58

    goto/16 :goto_1

    .line 85
    :sswitch_26
    const-string v2, "shared_location"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_27

    goto :goto_f

    .line 86
    :cond_27
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->locationAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v51, v2

    check-cast v51, Lio/getstream/chat/android/models/Location;

    goto/16 :goto_1

    .line 87
    :sswitch_27
    const-string v2, "moderation"

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_28

    goto :goto_f

    .line 88
    :cond_28
    iget-object v2, v0, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->moderationAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v46, v2

    check-cast v46, Lio/getstream/chat/android/models/Moderation;

    goto/16 :goto_1

    .line 89
    :cond_29
    :goto_f
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    invoke-static {v13}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object/from16 v3, v56

    invoke-virtual {v2, v13, v1, v3}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->accumulateExtraData(Ljava/lang/String;Lcom/squareup/moshi/JsonReader;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    move-object/from16 v15, v32

    move-object/from16 v13, v33

    move-object/from16 v11, v34

    move-object/from16 v10, v35

    move-object/from16 v8, v36

    move-object/from16 v5, v38

    move-object/from16 v14, v42

    move-object/from16 v3, v43

    move-object/from16 v6, v44

    move-object/from16 v9, v49

    move-object/from16 v2, v53

    move-object/from16 v7, v54

    move-object/from16 v12, v55

    goto/16 :goto_0

    :cond_2a
    move-object v0, v13

    move-object/from16 v13, v59

    .line 90
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    move-object/from16 v31, v2

    .line 91
    sget-object v2, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->INSTANCE:Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;

    move-object/from16 v59, v10

    move-object/from16 v10, v55

    invoke-virtual {v2, v10, v11, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v11, v54

    .line 92
    invoke-virtual {v2, v11, v14, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v14, v53

    .line 93
    invoke-virtual {v2, v14, v12, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v12, v49

    .line 94
    invoke-virtual {v2, v12, v3, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v3, v44

    .line 95
    invoke-virtual {v2, v3, v5, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v5, v43

    .line 96
    invoke-virtual {v2, v5, v8, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v8, v42

    .line 97
    invoke-virtual {v2, v8, v4, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v4, v38

    .line 98
    invoke-virtual {v2, v4, v15, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v15, v36

    .line 99
    invoke-virtual {v2, v15, v7, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v7, v35

    .line 100
    invoke-virtual {v2, v7, v0, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v0, v34

    .line 101
    invoke-virtual {v2, v0, v13, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v13, v33

    .line 102
    invoke-virtual {v2, v13, v6, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v6, v32

    .line 103
    invoke-virtual {v2, v6, v9, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v9, v18

    move-object/from16 v0, v59

    .line 104
    invoke-virtual {v2, v9, v0, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-object/from16 v4, v31

    move-object/from16 v0, v57

    .line 105
    invoke-virtual {v2, v0, v4, v1}, Lio/getstream/chat/android/client/parser2/direct/JsonParsingUtils;->requireField(Ljava/lang/Object;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    if-nez v17, :cond_2b

    move-object/from16 v35, p2

    goto :goto_10

    :cond_2b
    move-object/from16 v35, v17

    :goto_10
    if-eqz v58, :cond_2d

    if-eqz v35, :cond_2c

    .line 106
    invoke-virtual/range {v58 .. v58}, Lio/getstream/chat/android/models/Message;->getChannelInfo()Lio/getstream/chat/android/models/ChannelInfo;

    move-result-object v1

    if-nez v1, :cond_2c

    const v108, 0xffff

    const/16 v109, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    const/16 v77, 0x0

    const/16 v78, 0x0

    const/16 v79, 0x0

    const/16 v80, 0x0

    const/16 v81, 0x0

    const/16 v82, 0x0

    const/16 v83, 0x0

    const/16 v84, 0x0

    const/16 v85, 0x0

    const/16 v86, 0x0

    const/16 v87, 0x0

    const/16 v89, 0x0

    const/16 v90, 0x0

    const/16 v91, 0x0

    const/16 v92, 0x0

    const/16 v93, 0x0

    const/16 v94, 0x0

    const/16 v95, 0x0

    const/16 v96, 0x0

    const/16 v97, 0x0

    const/16 v98, 0x0

    const/16 v99, 0x0

    const/16 v100, 0x0

    const/16 v101, 0x0

    const/16 v102, 0x0

    const/16 v103, 0x0

    const/16 v104, 0x0

    const/16 v105, 0x0

    const/16 v106, 0x0

    const v107, -0x20000001

    move-object/from16 v88, v35

    .line 107
    invoke-static/range {v58 .. v109}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v58

    :cond_2c
    move-object/from16 v36, v58

    goto :goto_11

    :cond_2d
    const/16 v36, 0x0

    .line 108
    :goto_11
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 109
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2e
    :goto_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/models/Reaction;

    .line 110
    invoke-virtual {v5}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2e

    .line 111
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_12

    .line 112
    :cond_2f
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 113
    invoke-interface/range {v38 .. v38}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_13
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_31

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v17, v5

    check-cast v17, Lio/getstream/chat/android/models/Reaction;

    move-object/from16 v18, v0

    .line 114
    invoke-virtual/range {v17 .. v17}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_30

    .line 115
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_30
    move-object/from16 v0, v18

    goto :goto_13

    :cond_31
    move-object/from16 v18, v0

    if-eqz v48, :cond_32

    .line 116
    invoke-virtual/range {v48 .. v48}, Lio/getstream/chat/android/models/Poll;->getUpdatedAt()Ljava/util/Date;

    move-result-object v0

    goto :goto_14

    :cond_32
    const/4 v0, 0x0

    :goto_14
    filled-new-array {v9, v0}, [Ljava/util/Date;

    move-result-object v0

    .line 117
    invoke-static {v0}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 118
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 119
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_33

    const/4 v4, 0x0

    goto :goto_16

    .line 120
    :cond_33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 121
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_34

    goto :goto_16

    .line 122
    :cond_34
    move-object v5, v4

    check-cast v5, Ljava/util/Date;

    .line 123
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v16

    .line 124
    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 125
    move-object/from16 v31, v5

    check-cast v31, Ljava/util/Date;

    .line 126
    invoke-virtual/range {v31 .. v31}, Ljava/util/Date;->getTime()J

    move-result-wide v31

    cmp-long v33, v16, v31

    if-gez v33, :cond_35

    move-object v4, v5

    move-wide/from16 v16, v31

    .line 127
    :cond_35
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_41

    .line 128
    :goto_16
    check-cast v4, Ljava/util/Date;

    if-nez v4, :cond_36

    move-object v4, v9

    .line 129
    :cond_36
    sget-object v0, Lm83/z;->w:Lm83/z;

    if-nez v20, :cond_37

    move-object/from16 v33, v0

    goto :goto_17

    :cond_37
    move-object/from16 v33, v20

    :goto_17
    const/4 v5, 0x0

    if-eqz v22, :cond_38

    .line 130
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    move/from16 v38, v9

    goto :goto_18

    :cond_38
    move/from16 v38, v5

    :goto_18
    if-nez v23, :cond_39

    .line 131
    new-instance v23, Ljava/util/LinkedHashMap;

    invoke-direct/range {v23 .. v23}, Ljava/util/LinkedHashMap;-><init>()V

    :cond_39
    move-object/from16 v17, v23

    if-nez v24, :cond_3a

    .line 132
    new-instance v24, Ljava/util/LinkedHashMap;

    invoke-direct/range {v24 .. v24}, Ljava/util/LinkedHashMap;-><init>()V

    :cond_3a
    if-nez v25, :cond_3b

    move-object/from16 v25, v0

    :cond_3b
    if-eqz v27, :cond_3c

    .line 133
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    move/from16 v32, v9

    goto :goto_19

    :cond_3c
    move/from16 v32, v5

    :goto_19
    if-eqz v28, :cond_3d

    .line 134
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    goto :goto_1a

    :cond_3d
    move v9, v5

    .line 135
    :goto_1a
    sget-object v49, Lm83/y;->w:Lm83/y;

    if-nez v29, :cond_3e

    move-object/from16 v42, v49

    goto :goto_1b

    :cond_3e
    move-object/from16 v42, v29

    :goto_1b
    if-eqz v30, :cond_3f

    .line 136
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    :cond_3f
    move/from16 v53, v5

    if-nez v56, :cond_40

    move-object/from16 v30, v0

    goto :goto_1c

    :cond_40
    move-object/from16 v30, v56

    .line 137
    :goto_1c
    new-instance v5, Lio/getstream/chat/android/models/Message;

    .line 138
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v15

    .line 139
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v16

    .line 140
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v31

    const/16 v55, 0x60

    const/16 v56, 0x0

    move-object/from16 v29, v18

    move-object/from16 v18, v24

    move-object/from16 v24, v14

    move-object v14, v8

    move-object v8, v13

    const/4 v13, 0x0

    const/16 v20, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const v54, 0x604080

    move-object/from16 v22, v1

    move-object/from16 v23, v2

    move/from16 v34, v9

    move-object v7, v11

    move-object v9, v12

    move-object/from16 v11, v19

    move-object/from16 v19, v25

    move-object/from16 v25, v4

    move-object v12, v10

    move-object/from16 v10, v21

    move-object/from16 v21, v6

    move-object v6, v3

    .line 141
    invoke-direct/range {v5 .. v56}, Lio/getstream/chat/android/models/Message;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, p0

    .line 142
    iget-object v0, v1, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->messageTransformer:Lio/getstream/chat/android/models/MessageTransformer;

    invoke-interface {v0, v5}, Lio/getstream/chat/android/models/MessageTransformer;->transform(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    return-object v0

    :cond_41
    move-object v5, v2

    move-object/from16 v54, v11

    move-object v2, v1

    move-object/from16 v1, p0

    move-object v1, v2

    move-object v2, v5

    goto/16 :goto_15

    :sswitch_data_0
    .sparse-switch
        -0x782e1ada -> :sswitch_27
        -0x71f4b9b1 -> :sswitch_26
        -0x6c60afd0 -> :sswitch_25
        -0x403d7566 -> :sswitch_24
        -0x3ae5ec28 -> :sswitch_23
        -0x35c86bab -> :sswitch_22
        -0x334f5fac -> :sswitch_21
        -0x2d154241 -> :sswitch_20
        -0x2c0c3450 -> :sswitch_1f
        -0x1ee93f8e -> :sswitch_1e
        -0x119c6dc9 -> :sswitch_1d
        -0xa535206 -> :sswitch_1c
        -0xa5351e2 -> :sswitch_1b
        -0x78a0c76 -> :sswitch_1a
        -0x762874e -> :sswitch_19
        -0xf11995 -> :sswitch_18
        0xd1b -> :sswitch_17
        0x180be -> :sswitch_16
        0x307a1e -> :sswitch_15
        0x3107ab -> :sswitch_14
        0x3497bf -> :sswitch_13
        0x36452d -> :sswitch_12
        0x368f3a -> :sswitch_11
        0x36ebcb -> :sswitch_10
        0x8566f7a -> :sswitch_f
        0x2c0b7d03 -> :sswitch_e
        0x38a5df4b -> :sswitch_d
        0x39c9fc51 -> :sswitch_c
        0x49adf829 -> :sswitch_b
        0x4a0ef3b5 -> :sswitch_a
        0x4a1b9a8a -> :sswitch_9
        0x51a3a8ea -> :sswitch_8
        0x594e5e52 -> :sswitch_7
        0x5cf9e5f1 -> :sswitch_6
        0x606ee41a -> :sswitch_5
        0x6769ecaa -> :sswitch_4
        0x69349e19 -> :sswitch_3
        0x6b8cf3b4 -> :sswitch_2
        0x7b10a6f7 -> :sswitch_1
        0x7b66b0d0 -> :sswitch_0
    .end sparse-switch
.end method

.method public final bridge synthetic fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1
.end method

.method public final toJson(Lqx/c0;Lio/getstream/chat/android/models/Message;)V
    .locals 0

    const-string p2, "p0"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    .line 2
    const-string p2, "Serialization not supported for direct-to-domain path"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final bridge synthetic toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/chat/android/models/Message;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;->toJson(Lqx/c0;Lio/getstream/chat/android/models/Message;)V

    const/4 p1, 0x0

    throw p1
.end method
