.class public final Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/moshi/JsonAdapter<",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u0019R\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u0019R\"\u0010$\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020#\u0018\u00010\"0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010\u0019R.\u0010&\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020#0\"\u0018\u00010%0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\u0019R\u001c\u0010\'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010\u0019R \u0010)\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020(0\"0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010\u0019R \u0010*\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020#0\"0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010\u0019R(\u0010+\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001a\u0018\u00010%0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010\u0019R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010\u0019R(\u0010.\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020-\u0018\u00010%0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010\u0019\u00a8\u0006/"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;",
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
        "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;",
        "Lqx/c0;",
        "writer",
        "value_",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;)V",
        "Lqx/v;",
        "options",
        "Lqx/v;",
        "",
        "booleanAdapter",
        "Lcom/squareup/moshi/JsonAdapter;",
        "",
        "intAdapter",
        "Ljava/util/Date;",
        "dateAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
        "nullableDownstreamUserDtoAdapter",
        "stringAdapter",
        "nullableBooleanAdapter",
        "",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;",
        "nullableListOfDownstreamVoteDtoAdapter",
        "",
        "nullableMapOfStringListOfDownstreamVoteDtoAdapter",
        "nullableIntAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollOptionDto;",
        "listOfDownstreamPollOptionDtoAdapter",
        "listOfDownstreamVoteDtoAdapter",
        "nullableMapOfStringIntAdapter",
        "nullableStringAdapter",
        "",
        "nullableMapOfStringAnyAdapter",
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

.field private final dateAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Date;",
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

.field private final listOfDownstreamPollOptionDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollOptionDto;",
            ">;>;"
        }
    .end annotation
.end field

.field private final listOfDownstreamVoteDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;",
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

.field private final nullableDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableIntAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final nullableListOfDownstreamVoteDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;",
            ">;>;"
        }
    .end annotation
.end field

.field private final nullableMapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;
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

.field private final nullableMapOfStringListOfDownstreamVoteDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;",
            ">;>;>;"
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
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "moshi"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    const-string v22, "voting_visibility"

    const-string v23, "extraData"

    const-string v3, "allow_answers"

    const-string v4, "allow_user_suggested_options"

    const-string v5, "answers_count"

    const-string v6, "created_at"

    const-string v7, "created_by"

    const-string v8, "created_by_id"

    const-string v9, "description"

    const-string v10, "enforce_unique_vote"

    const-string v11, "id"

    const-string v12, "is_closed"

    const-string v13, "latest_answers"

    const-string v14, "latest_votes_by_option"

    const-string v15, "max_votes_allowed"

    const-string v16, "name"

    const-string v17, "options"

    const-string v18, "own_votes"

    const-string v19, "updated_at"

    const-string v20, "vote_count"

    const-string v21, "vote_counts_by_option"

    filled-new-array/range {v3 .. v23}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lqx/v;->a([Ljava/lang/String;)Lqx/v;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->options:Lqx/v;

    const-string v2, "allow_answers"

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    sget-object v4, Lm83/a0;->w:Lm83/a0;

    invoke-virtual {v1, v3, v4, v2}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-string v3, "answers_count"

    invoke-virtual {v1, v2, v4, v3}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v2, Ljava/util/Date;

    const-string v3, "created_at"

    invoke-virtual {v1, v2, v4, v3}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v2, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    const-string v3, "created_by"

    invoke-virtual {v1, v2, v4, v3}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->nullableDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-string v2, "created_by_id"

    const-class v3, Ljava/lang/String;

    invoke-virtual {v1, v3, v4, v2}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-class v2, Ljava/lang/Boolean;

    const-string v5, "is_closed"

    invoke-virtual {v1, v2, v4, v5}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v2

    iput-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->nullableBooleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    const/4 v2, 0x1

    new-array v5, v2, [Ljava/lang/reflect/Type;

    const/4 v6, 0x0

    const-class v7, Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;

    aput-object v7, v5, v6

    const-class v8, Ljava/util/List;

    invoke-static {v8, v5}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v5

    const-string v9, "latest_answers"

    invoke-virtual {v1, v5, v4, v9}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v5

    iput-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->nullableListOfDownstreamVoteDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v5, v2, [Ljava/lang/reflect/Type;

    aput-object v7, v5, v6

    invoke-static {v8, v5}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v5

    const/4 v9, 0x2

    new-array v10, v9, [Ljava/lang/reflect/Type;

    aput-object v3, v10, v6

    aput-object v5, v10, v2

    const-class v5, Ljava/util/Map;

    invoke-static {v5, v10}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v10

    const-string v11, "latest_votes_by_option"

    invoke-virtual {v1, v10, v4, v11}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v10

    iput-object v10, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->nullableMapOfStringListOfDownstreamVoteDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-string v10, "max_votes_allowed"

    const-class v11, Ljava/lang/Integer;

    invoke-virtual {v1, v11, v4, v10}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v10

    iput-object v10, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->nullableIntAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v10, v2, [Ljava/lang/reflect/Type;

    const-class v12, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollOptionDto;

    aput-object v12, v10, v6

    invoke-static {v8, v10}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v10

    const-string v12, "options"

    invoke-virtual {v1, v10, v4, v12}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v10

    iput-object v10, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->listOfDownstreamPollOptionDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v10, v2, [Ljava/lang/reflect/Type;

    aput-object v7, v10, v6

    invoke-static {v8, v10}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v7

    const-string v8, "own_votes"

    invoke-virtual {v1, v7, v4, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v7

    iput-object v7, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->listOfDownstreamVoteDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v7, v9, [Ljava/lang/reflect/Type;

    aput-object v3, v7, v6

    aput-object v11, v7, v2

    invoke-static {v5, v7}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v7

    const-string v8, "vote_counts_by_option"

    invoke-virtual {v1, v7, v4, v8}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v7

    iput-object v7, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->nullableMapOfStringIntAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-string v7, "voting_visibility"

    invoke-virtual {v1, v3, v4, v7}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v7

    iput-object v7, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    new-array v7, v9, [Ljava/lang/reflect/Type;

    aput-object v3, v7, v6

    const-class v3, Ljava/lang/Object;

    aput-object v3, v7, v2

    invoke-static {v5, v7}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v2

    const-string v3, "extraData"

    invoke-virtual {v1, v2, v4, v3}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v1

    iput-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->nullableMapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method


# virtual methods
.method public fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;
    .locals 38

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "reader"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    const/4 v2, 0x0

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v9, v6

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v14, v12

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v24, v22

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    .line 3
    :goto_0
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v7

    const-string v8, "options"

    const-string v13, "options_"

    move-object/from16 v23, v2

    const-string v2, "allow_answers"

    move-object/from16 v27, v3

    const-string v3, "allow_user_suggested_options"

    move-object/from16 v28, v4

    const-string v4, "answers_count"

    move-object/from16 v29, v5

    const-string v5, "created_at"

    move-object/from16 v30, v6

    const-string v6, "created_by_id"

    move/from16 v31, v7

    const-string v7, "description"

    move-object/from16 v32, v9

    const-string v9, "enforce_unique_vote"

    move-object/from16 v33, v10

    const-string v10, "id"

    move-object/from16 v34, v11

    const-string v11, "name"

    move-object/from16 v35, v12

    const-string v12, "own_votes"

    move-object/from16 v36, v14

    const-string v14, "updated_at"

    move-object/from16 v37, v15

    const-string v15, "vote_count"

    if-eqz v31, :cond_d

    move-object/from16 v31, v2

    .line 4
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->options:Lqx/v;

    invoke-virtual {v1, v2}, Lcom/squareup/moshi/JsonReader;->T(Lqx/v;)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    .line 5
    :pswitch_0
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->nullableMapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v26, v2

    check-cast v26, Ljava/util/Map;

    :goto_1
    move-object/from16 v2, v23

    :goto_2
    move-object/from16 v3, v27

    :goto_3
    move-object/from16 v4, v28

    :goto_4
    move-object/from16 v5, v29

    :goto_5
    move-object/from16 v6, v30

    :goto_6
    move-object/from16 v9, v32

    :goto_7
    move-object/from16 v10, v33

    :goto_8
    move-object/from16 v11, v34

    :goto_9
    move-object/from16 v12, v35

    :goto_a
    move-object/from16 v14, v36

    :goto_b
    move-object/from16 v15, v37

    goto :goto_0

    .line 6
    :pswitch_1
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v25, v2

    check-cast v25, Ljava/lang/String;

    goto :goto_1

    .line 7
    :pswitch_2
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->nullableMapOfStringIntAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v24, v2

    check-cast v24, Ljava/util/Map;

    goto :goto_1

    .line 8
    :pswitch_3
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ljava/lang/Integer;

    if-eqz v6, :cond_0

    move-object/from16 v2, v23

    move-object/from16 v3, v27

    move-object/from16 v4, v28

    move-object/from16 v5, v29

    goto :goto_6

    :cond_0
    invoke-static {v15, v15, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 9
    :pswitch_4
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v22, v2

    check-cast v22, Ljava/util/Date;

    if-eqz v22, :cond_1

    :goto_c
    goto :goto_1

    :cond_1
    invoke-static {v14, v14, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 10
    :pswitch_5
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->listOfDownstreamVoteDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v21, v2

    check-cast v21, Ljava/util/List;

    if-eqz v21, :cond_2

    goto :goto_c

    .line 11
    :cond_2
    invoke-static {v12, v12, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 12
    :pswitch_6
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->listOfDownstreamPollOptionDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v20, v2

    check-cast v20, Ljava/util/List;

    if-eqz v20, :cond_3

    goto :goto_c

    .line 13
    :cond_3
    invoke-static {v13, v8, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 14
    :pswitch_7
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v19, v2

    check-cast v19, Ljava/lang/String;

    if-eqz v19, :cond_4

    goto :goto_c

    :cond_4
    invoke-static {v11, v11, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 15
    :pswitch_8
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->nullableIntAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Ljava/lang/Integer;

    goto/16 :goto_1

    .line 16
    :pswitch_9
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->nullableMapOfStringListOfDownstreamVoteDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Ljava/util/Map;

    goto/16 :goto_1

    .line 17
    :pswitch_a
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->nullableListOfDownstreamVoteDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Ljava/util/List;

    goto/16 :goto_1

    .line 18
    :pswitch_b
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->nullableBooleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Ljava/lang/Boolean;

    move-object/from16 v2, v23

    move-object/from16 v3, v27

    move-object/from16 v4, v28

    move-object/from16 v5, v29

    move-object/from16 v6, v30

    move-object/from16 v9, v32

    move-object/from16 v10, v33

    move-object/from16 v11, v34

    move-object/from16 v12, v35

    move-object/from16 v14, v36

    goto/16 :goto_0

    .line 19
    :pswitch_c
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Ljava/lang/String;

    if-eqz v14, :cond_5

    move-object/from16 v2, v23

    move-object/from16 v3, v27

    move-object/from16 v4, v28

    move-object/from16 v5, v29

    move-object/from16 v6, v30

    move-object/from16 v9, v32

    move-object/from16 v10, v33

    move-object/from16 v11, v34

    move-object/from16 v12, v35

    goto/16 :goto_b

    :cond_5
    invoke-static {v10, v10, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 20
    :pswitch_d
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/lang/Boolean;

    if-eqz v5, :cond_6

    move-object/from16 v2, v23

    move-object/from16 v3, v27

    move-object/from16 v4, v28

    goto/16 :goto_5

    .line 21
    :cond_6
    invoke-static {v9, v9, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 22
    :pswitch_e
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Ljava/lang/String;

    if-eqz v12, :cond_7

    move-object/from16 v2, v23

    move-object/from16 v3, v27

    move-object/from16 v4, v28

    move-object/from16 v5, v29

    move-object/from16 v6, v30

    move-object/from16 v9, v32

    move-object/from16 v10, v33

    move-object/from16 v11, v34

    goto/16 :goto_a

    .line 23
    :cond_7
    invoke-static {v7, v7, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 24
    :pswitch_f
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Ljava/lang/String;

    if-eqz v11, :cond_8

    move-object/from16 v2, v23

    move-object/from16 v3, v27

    move-object/from16 v4, v28

    move-object/from16 v5, v29

    move-object/from16 v6, v30

    move-object/from16 v9, v32

    move-object/from16 v10, v33

    goto/16 :goto_9

    .line 25
    :cond_8
    invoke-static {v6, v6, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 26
    :pswitch_10
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->nullableDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    move-object/from16 v2, v23

    move-object/from16 v3, v27

    move-object/from16 v4, v28

    move-object/from16 v5, v29

    move-object/from16 v6, v30

    move-object/from16 v9, v32

    goto/16 :goto_8

    .line 27
    :pswitch_11
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Ljava/util/Date;

    if-eqz v9, :cond_9

    move-object/from16 v2, v23

    move-object/from16 v3, v27

    move-object/from16 v4, v28

    move-object/from16 v5, v29

    move-object/from16 v6, v30

    goto/16 :goto_7

    :cond_9
    invoke-static {v5, v5, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 28
    :pswitch_12
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_a

    move-object v4, v2

    move-object/from16 v2, v23

    move-object/from16 v3, v27

    goto/16 :goto_4

    .line 29
    :cond_a
    invoke-static {v4, v4, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 30
    :pswitch_13
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    if-eqz v2, :cond_b

    move-object v3, v2

    move-object/from16 v2, v23

    goto/16 :goto_3

    .line 31
    :cond_b
    invoke-static {v3, v3, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 32
    :pswitch_14
    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    if-eqz v2, :cond_c

    goto/16 :goto_2

    :cond_c
    move-object/from16 v2, v31

    .line 33
    invoke-static {v2, v2, v1}, Lrx/f;->m(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v1

    throw v1

    .line 34
    :pswitch_15
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->b0()V

    .line 35
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->skipValue()V

    goto/16 :goto_1

    .line 36
    :cond_d
    invoke-virtual {v1}, Lcom/squareup/moshi/JsonReader;->endObject()V

    move-object v0, v5

    .line 37
    new-instance v5, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;

    if-eqz v23, :cond_1a

    .line 38
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v27, :cond_19

    .line 39
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v28, :cond_18

    .line 40
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-eqz v32, :cond_17

    if-eqz v34, :cond_16

    if-eqz v35, :cond_15

    if-eqz v29, :cond_14

    .line 41
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v36, :cond_13

    if-eqz v19, :cond_12

    if-eqz v20, :cond_11

    if-eqz v21, :cond_10

    if-eqz v22, :cond_f

    if-eqz v30, :cond_e

    .line 42
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Integer;->intValue()I

    move-result v23

    move v13, v0

    move v6, v2

    move v7, v3

    move v8, v4

    move-object/from16 v9, v32

    move-object/from16 v10, v33

    move-object/from16 v11, v34

    move-object/from16 v12, v35

    move-object/from16 v14, v36

    move-object/from16 v15, v37

    .line 43
    invoke-direct/range {v5 .. v26}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;-><init>(ZZILjava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;ILjava/util/Map;Ljava/lang/String;Ljava/util/Map;)V

    return-object v5

    .line 44
    :cond_e
    invoke-static {v15, v15, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 45
    :cond_f
    invoke-static {v14, v14, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 46
    :cond_10
    invoke-static {v12, v12, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 47
    :cond_11
    invoke-static {v13, v8, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 48
    :cond_12
    invoke-static {v11, v11, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 49
    :cond_13
    invoke-static {v10, v10, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 50
    :cond_14
    invoke-static {v9, v9, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 51
    :cond_15
    invoke-static {v7, v7, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 52
    :cond_16
    invoke-static {v6, v6, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 53
    :cond_17
    invoke-static {v0, v0, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 54
    :cond_18
    invoke-static {v4, v4, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 55
    :cond_19
    invoke-static {v3, v3, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    .line 56
    :cond_1a
    invoke-static {v2, v2, v1}, Lrx/f;->g(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/moshi/JsonReader;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;)V
    .locals 2

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lqx/c0;->h()Lqx/c0;

    .line 3
    const-string v0, "allow_answers"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 4
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->getAllow_answers()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 5
    const-string v0, "allow_user_suggested_options"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 6
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->getAllow_user_suggested_options()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 7
    const-string v0, "answers_count"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 8
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->getAnswers_count()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 9
    const-string v0, "created_at"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 10
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->getCreated_at()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 11
    const-string v0, "created_by"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 12
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->nullableDownstreamUserDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->getCreated_by()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 13
    const-string v0, "created_by_id"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 14
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->getCreated_by_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 15
    const-string v0, "description"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 16
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 17
    const-string v0, "enforce_unique_vote"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 18
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->booleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->getEnforce_unique_vote()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 19
    const-string v0, "id"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 20
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 21
    const-string v0, "is_closed"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 22
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->nullableBooleanAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->is_closed()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 23
    const-string v0, "latest_answers"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 24
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->nullableListOfDownstreamVoteDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->getLatest_answers()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 25
    const-string v0, "latest_votes_by_option"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 26
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->nullableMapOfStringListOfDownstreamVoteDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->getLatest_votes_by_option()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 27
    const-string v0, "max_votes_allowed"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 28
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->nullableIntAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->getMax_votes_allowed()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 29
    const-string v0, "name"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 30
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->stringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 31
    const-string v0, "options"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 32
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->listOfDownstreamPollOptionDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->getOptions()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 33
    const-string v0, "own_votes"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 34
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->listOfDownstreamVoteDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->getOwn_votes()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 35
    const-string v0, "updated_at"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 36
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->dateAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->getUpdated_at()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 37
    const-string v0, "vote_count"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 38
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->intAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->getVote_count()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 39
    const-string v0, "vote_counts_by_option"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 40
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->nullableMapOfStringIntAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->getVote_counts_by_option()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 41
    const-string v0, "voting_visibility"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 42
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->nullableStringAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->getVoting_visibility()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 43
    const-string v0, "extraData"

    invoke-virtual {p1, v0}, Lqx/c0;->x(Ljava/lang/String;)Lqx/c0;

    .line 44
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->nullableMapOfStringAnyAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->getExtraData()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    .line 45
    invoke-virtual {p1}, Lqx/c0;->m()Lqx/c0;

    return-void

    .line 46
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDtoJsonAdapter;->toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    const/16 v0, 0x27

    const-string v1, "GeneratedJsonAdapter(DownstreamPollDto)"

    invoke-static {v0, v1}, Lvl/b;->e(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
