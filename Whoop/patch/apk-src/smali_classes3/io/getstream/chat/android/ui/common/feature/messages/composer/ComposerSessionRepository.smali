.class public final Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository$EditMode;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0001\u0018\u00002\u00020\u0001:\u0001,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n*\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J%\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u001aH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u001b*\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J%\u0010%\u001a\u00020$2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0008\u0010#\u001a\u0004\u0018\u00010\"\u00a2\u0006\u0004\u0008%\u0010&J\u0013\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0004\u0008\'\u0010(J\u000f\u0010)\u001a\u0004\u0018\u00010\"\u00a2\u0006\u0004\u0008)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010+\u00a8\u0006-"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;",
        "",
        "Landroidx/lifecycle/k1;",
        "savedStateHandle",
        "<init>",
        "(Landroidx/lifecycle/k1;)V",
        "Lorg/json/JSONObject;",
        "sessionJson",
        "()Lorg/json/JSONObject;",
        "Lorg/json/JSONArray;",
        "",
        "Lio/getstream/chat/android/models/Attachment;",
        "toAttachmentList",
        "(Lorg/json/JSONArray;)Ljava/util/List;",
        "attachment",
        "attachmentToJson",
        "(Lio/getstream/chat/android/models/Attachment;)Lorg/json/JSONObject;",
        "json",
        "jsonToAttachment",
        "(Lorg/json/JSONObject;)Lio/getstream/chat/android/models/Attachment;",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "messageToJson",
        "(Lio/getstream/chat/android/models/Message;)Lorg/json/JSONObject;",
        "jsonToMessage",
        "(Lorg/json/JSONObject;)Lio/getstream/chat/android/models/Message;",
        "",
        "",
        "extraData",
        "extraDataToJson",
        "(Ljava/util/Map;)Lorg/json/JSONObject;",
        "sourceUriString",
        "(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;",
        "selectedAttachments",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository$EditMode;",
        "editMode",
        "Ll83/a0;",
        "save",
        "(Ljava/util/List;Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository$EditMode;)V",
        "restoreSelectedAttachments",
        "()Ljava/util/List;",
        "restoreEditMode",
        "()Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository$EditMode;",
        "Landroidx/lifecycle/k1;",
        "EditMode",
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
.field private final savedStateHandle:Landroidx/lifecycle/k1;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/k1;)V
    .locals 1

    const-string v0, "savedStateHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;->savedStateHandle:Landroidx/lifecycle/k1;

    return-void
.end method

.method private final attachmentToJson(Lio/getstream/chat/android/models/Attachment;)Lorg/json/JSONObject;
    .locals 3

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;->sourceUriString(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "uri"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getType()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v2, "type"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    const-string v1, "name"

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "fileSize"

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getFileSize()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getMimeType()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v2, "mimeType"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_2
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getAssetUrl()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v2, "assetUrl"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_3
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    const-string v2, "imageUrl"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_4
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getThumbUrl()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    const-string v2, "thumbUrl"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_5
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getTitle()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    const-string v2, "title"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_6
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getExtraData()Ljava/util/Map;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;->extraDataToJson(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_7

    const-string v1, "extraData"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_7
    return-object v0
.end method

.method private final extraDataToJson(Ljava/util/Map;)Lorg/json/JSONObject;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lorg/json/JSONObject;"
        }
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    const-string v3, "io.getstream.sourceUri"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    instance-of v3, v1, Ljava/lang/String;

    if-eqz v3, :cond_1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :cond_1
    instance-of v3, v1, Ljava/lang/Boolean;

    if-eqz v3, :cond_2

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    goto :goto_0

    :cond_2
    instance-of v3, v1, Ljava/lang/Integer;

    if-eqz v3, :cond_3

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    goto :goto_0

    :cond_3
    instance-of v3, v1, Ljava/lang/Long;

    if-eqz v3, :cond_4

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    goto :goto_0

    :cond_4
    instance-of v3, v1, Ljava/lang/Double;

    if-eqz v3, :cond_5

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    goto :goto_0

    :cond_5
    instance-of v3, v1, Ljava/lang/Float;

    if-eqz v3, :cond_0

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    float-to-double v3, v1

    invoke-virtual {v0, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    goto :goto_0

    :cond_6
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result p1

    if-lez p1, :cond_7

    return-object v0

    :cond_7
    const/4 p1, 0x0

    return-object p1
.end method

.method private final jsonToAttachment(Lorg/json/JSONObject;)Lio/getstream/chat/android/models/Attachment;
    .locals 30

    move-object/from16 v0, p1

    const-string v1, "uri"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    if-lez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    const-string v2, "name"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_1

    goto :goto_1

    :cond_1
    move-object v4, v3

    :goto_1
    const-string v5, "assetUrl"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_2

    move-object v13, v5

    goto :goto_2

    :cond_2
    move-object v13, v3

    :goto_2
    const-string v5, "imageUrl"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_3

    move-object v12, v5

    goto :goto_3

    :cond_3
    move-object v12, v3

    :goto_3
    const-string v5, "thumbUrl"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_4

    move-object v11, v5

    goto :goto_4

    :cond_4
    move-object v11, v3

    :goto_4
    if-nez v1, :cond_6

    if-nez v4, :cond_6

    if-nez v13, :cond_6

    if-nez v12, :cond_6

    if-eqz v11, :cond_5

    goto :goto_5

    :cond_5
    return-object v3

    :cond_6
    :goto_5
    new-instance v4, Ln83/f;

    invoke-direct {v4}, Ln83/f;-><init>()V

    const-string v5, "extraData"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v6

    const-string v7, "keys(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v4, v7, v8}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_7
    if-eqz v1, :cond_8

    const-string v5, "io.getstream.sourceUri"

    invoke-virtual {v4, v5, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    invoke-virtual {v4}, Ln83/f;->b()Ln83/f;

    move-result-object v27

    const-string v1, "type"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_9

    move-object/from16 v19, v1

    goto :goto_7

    :cond_9
    move-object/from16 v19, v3

    :goto_7
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v21

    const-string v1, "fileSize"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v16

    const-string v1, "mimeType"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_a

    move-object v15, v1

    goto :goto_8

    :cond_a
    move-object v15, v3

    :goto_8
    const-string v1, "title"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_b

    move-object/from16 v17, v0

    goto :goto_9

    :cond_b
    move-object/from16 v17, v3

    :goto_9
    new-instance v7, Lio/getstream/chat/android/models/Attachment;

    const v28, 0x7d447    # 7.18999E-40f

    const/16 v29, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v7 .. v29}, Lio/getstream/chat/android/models/Attachment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/io/File;Lio/getstream/chat/android/models/Attachment$UploadState;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

.method private final jsonToMessage(Lorg/json/JSONObject;)Lio/getstream/chat/android/models/Message;
    .locals 56

    move-object/from16 v0, p1

    const-string v1, "msgId"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v3, 0x0

    if-lez v2, :cond_0

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object v5, v3

    :goto_0
    if-nez v5, :cond_1

    return-object v3

    :cond_1
    const-string v1, "msgCid"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_2

    move-object v6, v1

    goto :goto_1

    :cond_2
    move-object v6, v3

    :goto_1
    if-nez v6, :cond_3

    return-object v3

    :cond_3
    const-string v1, "msgText"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v1, "optString(...)"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "msgParentId"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lez v4, :cond_4

    move-object v9, v2

    goto :goto_2

    :cond_4
    move-object v9, v3

    :goto_2
    const-string v2, "msgType"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lio/getstream/chat/android/models/Message;

    const/4 v8, 0x0

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

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const v53, -0x8018

    const v54, 0xffff

    const/16 v55, 0x0

    move-object/from16 v20, v0

    invoke-direct/range {v4 .. v55}, Lio/getstream/chat/android/models/Message;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method

.method private final messageToJson(Lio/getstream/chat/android/models/Message;)Lorg/json/JSONObject;
    .locals 3

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "msgId"

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "msgCid"

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "msgText"

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "msgParentId"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    const-string v1, "msgType"

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getType()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0
.end method

.method private final sessionJson()Lorg/json/JSONObject;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;->savedStateHandle:Landroidx/lifecycle/k1;

    const-string v1, "stream_composer_session"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    return-object v1
.end method

.method private final sourceUriString(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getExtraData()Ljava/util/Map;

    move-result-object p1

    const-string v0, "io.getstream.sourceUri"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final toAttachmentList(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    invoke-static {v0, v1}, Le93/b;->i0(II)Li93/j;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Lm83/e0;

    invoke-virtual {v2}, Lm83/e0;->nextInt()I

    move-result v2

    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "getJSONObject(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;->jsonToAttachment(Lorg/json/JSONObject;)Lio/getstream/chat/android/models/Attachment;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method


# virtual methods
.method public final restoreEditMode()Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository$EditMode;
    .locals 3

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;->sessionJson()Lorg/json/JSONObject;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const-string v2, "stream_composer_edit_message"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-direct {p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;->jsonToMessage(Lorg/json/JSONObject;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    const-string v1, "stream_composer_edit_attachments"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;->toAttachmentList(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_2
    sget-object v0, Lm83/y;->w:Lm83/y;

    :goto_0
    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository$EditMode;

    invoke-direct {v1, v2, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository$EditMode;-><init>(Lio/getstream/chat/android/models/Message;Ljava/util/List;)V

    :cond_3
    :goto_1
    return-object v1
.end method

.method public final restoreSelectedAttachments()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;->sessionJson()Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "stream_composer_selected_attachments"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;->toAttachmentList(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method

.method public final save(Ljava/util/List;Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository$EditMode;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository$EditMode;",
            ")V"
        }
    .end annotation

    const-string v0, "selectedAttachments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const-string v1, "stream_composer_session"

    if-eqz v0, :cond_0

    if-nez p2, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;->savedStateHandle:Landroidx/lifecycle/k1;

    invoke-virtual {p1, v1}, Landroidx/lifecycle/k1;->d(Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/models/Attachment;

    invoke-direct {p0, v4}, Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;->attachmentToJson(Lio/getstream/chat/android/models/Attachment;)Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Lorg/json/JSONArray;

    invoke-direct {p1, v2}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    const-string v2, "stream_composer_selected_attachments"

    invoke-virtual {v0, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository$EditMode;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;->messageToJson(Lio/getstream/chat/android/models/Message;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v2, "stream_composer_edit_message"

    invoke-virtual {v0, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository$EditMode;->getAttachments()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {p2, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Attachment;

    invoke-direct {p0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;->attachmentToJson(Lio/getstream/chat/android/models/Attachment;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance p1, Lorg/json/JSONArray;

    invoke-direct {p1, p2}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    const-string p2, "stream_composer_edit_attachments"

    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;->savedStateHandle:Landroidx/lifecycle/k1;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
