.class public final Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/moshi/JsonAdapter<",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u0018R\u001a\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u0018R\"\u0010!\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010\u0018R\u001a\u0010%\u001a\u0008\u0012\u0004\u0012\u00020$0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010\u0018R\"\u0010\'\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020&\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010\u0018R \u0010(\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u001f0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010\u0018R(\u0010*\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010)0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010\u0018R\"\u0010,\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020+\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010\u0018R\"\u0010-\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010\u0018R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u0010\u0018R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u0010\u0018R&\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002020)0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u0010\u0018R\u001e\u00105\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00085\u00106\u00a8\u00067"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
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
        "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
        "Lqx/c0;",
        "writer",
        "value_",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;)V",
        "Lqx/v;",
        "options",
        "Lqx/v;",
        "stringAdapter",
        "Lcom/squareup/moshi/JsonAdapter;",
        "nullableStringAdapter",
        "",
        "nullableBooleanAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;",
        "nullablePrivacySettingsDtoAdapter",
        "booleanAdapter",
        "",
        "Lio/getstream/chat/android/client/api2/model/dto/DeviceDto;",
        "nullableListOfDeviceDtoAdapter",
        "Ljava/util/Date;",
        "nullableDateAdapter",
        "",
        "intAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMuteDto;",
        "nullableListOfDownstreamMuteDtoAdapter",
        "listOfStringAdapter",
        "",
        "nullableMapOfStringStringAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;",
        "nullableListOfDownstreamChannelMuteDtoAdapter",
        "nullableListOfStringAdapter",
        "",
        "nullableLongAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;",
        "nullableDownstreamPushPreferenceDtoAdapter",
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

.field private final listOfStringAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
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

.field private final nullableBooleanAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/lang/Boolean;",
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

.field private final nullableDownstreamPushPreferenceDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableListOfDeviceDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DeviceDto;",
            ">;>;"
        }
    .end annotation
.end field

.field private final nullableListOfDownstreamChannelMuteDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;",
            ">;>;"
        }
    .end annotation
.end field

.field private final nullableListOfDownstreamMuteDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMuteDto;",
            ">;>;"
        }
    .end annotation
.end field

.field private final nullableListOfStringAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final nullableLongAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableMapOfStringStringAdapter:Lcom/squareup/moshi/JsonAdapter;
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

.field private final nullablePrivacySettingsDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;",
            ">;"
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
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "moshi"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    const-string v27, "push_preferences"

    const-string v28, "extraData"

    const-string v3, "id"

    const-string v4, "name"

    const-string v5, "image"

    const-string v6, "role"

    const-string v7, "invisible"

    const-string v8, "privacy_settings"

    const-string v9, "language"

    const-string v10, "banned"

    const-string v11, "devices"

    const-string v12, "online"

    const-string v13, "created_at"

    const-string v14, "deactivated_at"

    const-string v15, "updated_at"

    const-string v16, "last_active"

    const-string v17, "total_unread_count"

    const-string v18, "unread_channels"

    const-string v19, "unread_count"

    const-string v20, "unread_threads"

    const-string v21, "mutes"

    const-string v22, "teams"

    const-string v23, "teams_role"

    const-string v24, "channel_mutes"

    const-string v25, "blocked_user_ids"

    const-string v26, "avg_response_time"

    filled-new-array/range {v3 .. v28}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lqx/v;->a([Ljava/lang/String;)Lqx/v;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->options:Lqx/v;

    const-string v2, "id"

    const-class v3, Ljava/lang/String;

    sget-object v4, Lm83/a0;->w:Lm83/a0;

    invoke-virtual {v1, v3, v4, v2}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-string v2, "name"

    invoke-virtual {v1, v3, v4, v2}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v2, Ljava/lang/Boolean;

    const-string v5, "invisible"

    invoke-virtual {v1, v2, v4, v5}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableBooleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v2, Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;

    const-string v5, "privacy_settings"

    invoke-virtual {v1, v2, v4, v5}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullablePrivacySettingsDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-string v5, "banned"

    invoke-virtual {v1, v2, v4, v5}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    const/4 v2, 0x1

    new-array v5, v2, [Ljava/lang/reflect/Type;

    const/4 v6, 0x0

    const-class v7, Lio/getstream/chat/android/client/api2/model/dto/DeviceDto;

    aput-object v7, v5, v6

    const-class v7, Ljava/util/List;

    invoke-static {v7, v5}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v5

    const-string v8, "devices"

    invoke-virtual {v1, v5, v4, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableListOfDeviceDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v5, Ljava/util/Date;

    const-string v8, "created_at"

    invoke-virtual {v1, v5, v4, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-string v8, "total_unread_count"

    invoke-virtual {v1, v5, v4, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v5, v2, [Ljava/lang/reflect/Type;

    const-class v8, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMuteDto;

    aput-object v8, v5, v6

    invoke-static {v7, v5}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v5

    const-string v8, "mutes"

    invoke-virtual {v1, v5, v4, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableListOfDownstreamMuteDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v5, v2, [Ljava/lang/reflect/Type;

    aput-object v3, v5, v6

    invoke-static {v7, v5}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v5

    const-string v8, "teams"

    invoke-virtual {v1, v5, v4, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->listOfStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    const/4 v5, 0x2

    new-array v8, v5, [Ljava/lang/reflect/Type;

    aput-object v3, v8, v6

    aput-object v3, v8, v2

    const-class v9, Ljava/util/Map;

    invoke-static {v9, v8}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v8

    const-string v10, "teams_role"

    invoke-virtual {v1, v8, v4, v10}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v8

    iput-object v8, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableMapOfStringStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v8, v2, [Ljava/lang/reflect/Type;

    const-class v10, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;

    aput-object v10, v8, v6

    invoke-static {v7, v8}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v8

    const-string v10, "channel_mutes"

    invoke-virtual {v1, v8, v4, v10}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v8

    iput-object v8, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableListOfDownstreamChannelMuteDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v8, v2, [Ljava/lang/reflect/Type;

    aput-object v3, v8, v6

    invoke-static {v7, v8}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v7

    const-string v8, "blocked_user_ids"

    invoke-virtual {v1, v7, v4, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v7

    iput-object v7, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableListOfStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v7, Ljava/lang/Long;

    const-string v8, "avg_response_time"

    invoke-virtual {v1, v7, v4, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v7

    iput-object v7, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableLongAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v7, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;

    const-string v8, "push_preferences"

    invoke-virtual {v1, v7, v4, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v7

    iput-object v7, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableDownstreamPushPreferenceDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v5, v5, [Ljava/lang/reflect/Type;

    aput-object v3, v5, v6

    const-class v3, Ljava/lang/Object;

    aput-object v3, v5, v2

    invoke-static {v9, v5}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v2

    const-string v3, "extraData"

    invoke-virtual {v1, v2, v4, v3}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->mapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method


# virtual methods
.method public fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;
    .locals 78

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "reader"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 3
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    const/4 v3, 0x0

    const/4 v4, -0x1

    move-object/from16 v19, v2

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v12, v10

    move-object v14, v12

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v23, v18

    move-object/from16 v25, v23

    move-object/from16 v26, v25

    move-object/from16 v30, v26

    move-object/from16 v32, v30

    move-object/from16 v46, v32

    move-object/from16 v47, v46

    move-object/from16 v48, v47

    move-object/from16 v49, v48

    .line 4
    :goto_0
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v2

    const-string v11, "id"

    const-string v13, "role"

    move/from16 v24, v2

    const-string v2, "banned"

    move-object/from16 v27, v5

    const-string v5, "online"

    move-object/from16 v28, v6

    const-string v6, "extraData"

    if-eqz v24, :cond_a

    move-object/from16 v24, v7

    .line 5
    iget-object v7, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->options:Lqx/v;

    invoke-virtual {v1, v7}, Lcom/squareup/moshi/JsonReader;->T(Lqx/v;)I

    move-result v7

    packed-switch v7, :pswitch_data_0

    goto :goto_1

    .line 6
    :pswitch_0
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->mapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v49, v2

    check-cast v49, Ljava/util/Map;

    if-eqz v49, :cond_0

    :goto_1
    move-object/from16 v7, v24

    :goto_2
    move-object/from16 v5, v27

    :goto_3
    move-object/from16 v6, v28

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {v6, v6, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 8
    :pswitch_1
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableDownstreamPushPreferenceDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v48, v2

    check-cast v48, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;

    goto :goto_1

    .line 9
    :pswitch_2
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableLongAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v47, v2

    check-cast v47, Ljava/lang/Long;

    goto :goto_1

    .line 10
    :pswitch_3
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableListOfStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v46, v2

    check-cast v46, Ljava/util/List;

    goto :goto_1

    .line 11
    :pswitch_4
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableListOfDownstreamChannelMuteDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v26, v2

    check-cast v26, Ljava/util/List;

    goto :goto_1

    .line 12
    :pswitch_5
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableMapOfStringStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v25, v2

    check-cast v25, Ljava/util/Map;

    goto :goto_1

    .line 13
    :pswitch_6
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->listOfStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_1

    const v2, -0x80001

    :goto_4
    and-int/2addr v4, v2

    goto :goto_1

    :cond_1
    const-string v2, "teams"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 14
    :pswitch_7
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableListOfDownstreamMuteDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v23, v2

    check-cast v23, Ljava/util/List;

    goto :goto_1

    .line 15
    :pswitch_8
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v22, v2

    check-cast v22, Ljava/lang/Integer;

    if-eqz v22, :cond_2

    const v2, -0x20001

    goto :goto_4

    .line 16
    :cond_2
    const-string v2, "unread_threads"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 17
    :pswitch_9
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v21, v2

    check-cast v21, Ljava/lang/Integer;

    if-eqz v21, :cond_3

    const v2, -0x10001

    goto :goto_4

    :cond_3
    const-string v2, "unread_count"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 18
    :pswitch_a
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v20, v2

    check-cast v20, Ljava/lang/Integer;

    if-eqz v20, :cond_4

    const v2, -0x8001

    goto :goto_4

    .line 19
    :cond_4
    const-string v2, "unread_channels"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 20
    :pswitch_b
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v19, v2

    check-cast v19, Ljava/lang/Integer;

    if-eqz v19, :cond_5

    and-int/lit16 v4, v4, -0x4001

    goto/16 :goto_1

    .line 21
    :cond_5
    const-string v2, "total_unread_count"

    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 22
    :pswitch_c
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Ljava/util/Date;

    goto/16 :goto_1

    .line 23
    :pswitch_d
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Ljava/util/Date;

    goto/16 :goto_1

    .line 24
    :pswitch_e
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Ljava/util/Date;

    goto/16 :goto_1

    .line 25
    :pswitch_f
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Ljava/util/Date;

    goto/16 :goto_1

    .line 26
    :pswitch_10
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Ljava/lang/Boolean;

    if-eqz v14, :cond_6

    goto/16 :goto_1

    :cond_6
    invoke-static {v5, v5, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 27
    :pswitch_11
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableListOfDeviceDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v32, v2

    check-cast v32, Ljava/util/List;

    goto/16 :goto_1

    .line 28
    :pswitch_12
    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v5, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v5

    move-object v12, v5

    check-cast v12, Ljava/lang/Boolean;

    if-eqz v12, :cond_7

    goto/16 :goto_1

    :cond_7
    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 29
    :pswitch_13
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v30, v2

    check-cast v30, Ljava/lang/String;

    goto/16 :goto_1

    .line 30
    :pswitch_14
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullablePrivacySettingsDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;

    goto/16 :goto_1

    .line 31
    :pswitch_15
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableBooleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Ljava/lang/Boolean;

    and-int/lit8 v4, v4, -0x11

    goto/16 :goto_1

    .line 32
    :pswitch_16
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ljava/lang/String;

    if-eqz v8, :cond_8

    goto/16 :goto_1

    :cond_8
    invoke-static {v13, v13, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 33
    :pswitch_17
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/lang/String;

    goto/16 :goto_2

    .line 34
    :pswitch_18
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ljava/lang/String;

    move-object/from16 v7, v24

    move-object/from16 v5, v27

    goto/16 :goto_0

    .line 35
    :pswitch_19
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_9

    move-object/from16 v7, v24

    goto/16 :goto_3

    :cond_9
    invoke-static {v11, v11, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 36
    :pswitch_1a
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->b0()V

    .line 37
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    goto/16 :goto_1

    :cond_a
    move-object/from16 v24, v7

    .line 38
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    const v7, -0xbc011

    if-ne v4, v7, :cond_10

    move-object/from16 v42, v23

    .line 39
    new-instance v23, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    if-eqz v27, :cond_f

    if-eqz v8, :cond_e

    if-eqz v12, :cond_d

    .line 40
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v31

    if-eqz v14, :cond_c

    .line 41
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v33

    .line 42
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Integer;->intValue()I

    move-result v38

    .line 43
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Integer;->intValue()I

    move-result v39

    .line 44
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Integer;->intValue()I

    move-result v40

    .line 45
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Integer;->intValue()I

    move-result v41

    .line 46
    const-string v2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v49, :cond_b

    move-object/from16 v43, v3

    move-object/from16 v29, v10

    move-object/from16 v34, v15

    move-object/from16 v35, v16

    move-object/from16 v36, v17

    move-object/from16 v37, v18

    move-object/from16 v44, v25

    move-object/from16 v45, v26

    move-object/from16 v25, v28

    move-object/from16 v28, v9

    move-object/from16 v26, v24

    move-object/from16 v24, v27

    move-object/from16 v27, v8

    .line 47
    invoke-direct/range {v23 .. v49}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;Ljava/lang/String;ZLjava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;IIIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;Ljava/util/Map;)V

    return-object v23

    .line 48
    :cond_b
    invoke-static {v6, v6, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 49
    :cond_c
    invoke-static {v5, v5, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 50
    :cond_d
    invoke-static {v2, v2, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 51
    :cond_e
    invoke-static {v13, v13, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 52
    :cond_f
    invoke-static {v11, v11, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    :cond_10
    move-object/from16 v43, v3

    move-object/from16 v42, v23

    move-object/from16 v7, v24

    move-object/from16 v44, v25

    move-object/from16 v24, v27

    move-object/from16 v25, v28

    .line 53
    iget-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    if-nez v3, :cond_11

    .line 54
    const-class v75, Ljava/util/Map;

    .line 55
    sget-object v77, Lrx/f;->c:Ljava/lang/Class;

    const-class v50, Ljava/lang/String;

    const-class v51, Ljava/lang/String;

    const-class v52, Ljava/lang/String;

    const-class v53, Ljava/lang/String;

    const-class v54, Ljava/lang/Boolean;

    const-class v55, Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;

    const-class v56, Ljava/lang/String;

    sget-object v57, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-class v58, Ljava/util/List;

    const-class v60, Ljava/util/Date;

    const-class v61, Ljava/util/Date;

    const-class v62, Ljava/util/Date;

    const-class v63, Ljava/util/Date;

    sget-object v64, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v68, Ljava/util/List;

    const-class v69, Ljava/util/List;

    const-class v70, Ljava/util/Map;

    const-class v71, Ljava/util/List;

    const-class v72, Ljava/util/List;

    const-class v73, Ljava/lang/Long;

    const-class v74, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;

    move-object/from16 v59, v57

    move-object/from16 v65, v64

    move-object/from16 v66, v64

    move-object/from16 v67, v64

    move-object/from16 v76, v64

    filled-new-array/range {v50 .. v77}, [Ljava/lang/Class;

    move-result-object v3

    move/from16 v23, v4

    .line 56
    const-class v4, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    invoke-virtual {v4, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    .line 57
    iput-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    .line 58
    const-string v4, "also(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_5

    :cond_11
    move/from16 v23, v4

    :goto_5
    if-eqz v24, :cond_16

    if-eqz v8, :cond_15

    if-eqz v12, :cond_14

    if-eqz v14, :cond_13

    if-eqz v49, :cond_12

    .line 59
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v31

    move-object/from16 v13, v32

    const/16 v32, 0x0

    move-object/from16 v5, v24

    move-object/from16 v6, v25

    move-object/from16 v11, v30

    move-object/from16 v23, v42

    move-object/from16 v24, v43

    move-object/from16 v25, v44

    move-object/from16 v27, v46

    move-object/from16 v28, v47

    move-object/from16 v29, v48

    move-object/from16 v30, v49

    .line 60
    filled-new-array/range {v5 .. v32}, [Ljava/lang/Object;

    move-result-object v1

    .line 61
    invoke-virtual {v3, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 62
    const-string v2, "newInstance(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    return-object v1

    :cond_12
    invoke-static {v6, v6, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 63
    :cond_13
    invoke-static {v5, v5, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 64
    :cond_14
    invoke-static {v2, v2, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 65
    :cond_15
    invoke-static {v13, v13, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 66
    :cond_16
    invoke-static {v11, v11, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    nop

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;)V
    .locals 2

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lqx/c0;->h()Lqx/c0;

    .line 3
    const-string v0, "id"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 4
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 5
    const-string v0, "name"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 6
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 7
    const-string v0, "image"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 8
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->getImage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 9
    const-string v0, "role"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 10
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->getRole()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 11
    const-string v0, "invisible"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 12
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableBooleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->getInvisible()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 13
    const-string v0, "privacy_settings"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 14
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullablePrivacySettingsDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->getPrivacy_settings()Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 15
    const-string v0, "language"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 16
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 17
    const-string v0, "banned"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 18
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->getBanned()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 19
    const-string v0, "devices"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 20
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableListOfDeviceDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->getDevices()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 21
    const-string v0, "online"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 22
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->getOnline()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 23
    const-string v0, "created_at"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 24
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->getCreated_at()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 25
    const-string v0, "deactivated_at"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 26
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->getDeactivated_at()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 27
    const-string v0, "updated_at"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 28
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->getUpdated_at()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 29
    const-string v0, "last_active"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 30
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableDateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->getLast_active()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 31
    const-string v0, "total_unread_count"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 32
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->getTotal_unread_count()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 33
    const-string v0, "unread_channels"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 34
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->getUnread_channels()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 35
    const-string v0, "unread_count"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 36
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->getUnread_count()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 37
    const-string v0, "unread_threads"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 38
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->getUnread_threads()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 39
    const-string v0, "mutes"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 40
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableListOfDownstreamMuteDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->getMutes()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 41
    const-string v0, "teams"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 42
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->listOfStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->getTeams()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 43
    const-string v0, "teams_role"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 44
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableMapOfStringStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->getTeams_role()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 45
    const-string v0, "channel_mutes"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 46
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableListOfDownstreamChannelMuteDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->getChannel_mutes()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 47
    const-string v0, "blocked_user_ids"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 48
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableListOfStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->getBlocked_user_ids()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 49
    const-string v0, "avg_response_time"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 50
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableLongAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->getAvg_response_time()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 51
    const-string v0, "push_preferences"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 52
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->nullableDownstreamPushPreferenceDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->getPush_preferences()Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 53
    const-string v0, "extraData"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 54
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->mapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->getExtraData()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 55
    invoke-virtual {p1}, Lqx/c0;->m()Lqx/c0;

    return-void

    .line 56
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDtoJsonAdapter;->toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    const/16 v0, 0x27

    const-string v1, "GeneratedJsonAdapter(DownstreamUserDto)"

    invoke-static {v0, v1}, Lvl/b;->e(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
