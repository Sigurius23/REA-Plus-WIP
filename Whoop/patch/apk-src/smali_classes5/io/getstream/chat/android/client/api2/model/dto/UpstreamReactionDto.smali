.class public final Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/StreamHandsOff;
    reason = "Field names can\'t be changed because [CustomObjectDtoAdapter] class uses reflections to add/remove content of [extraData] map"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u001b\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0081\u0008\u0018\u00002\u00020\u0001Bc\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000c\u001a\u00020\u0005\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0007H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0015\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000fH\u00c6\u0003Jw\u0010*\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00052\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\u0014\u0008\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000fH\u00c6\u0001J\u0013\u0010+\u001a\u00020,2\u0008\u0010-\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010.\u001a\u00020\u0007H\u00d6\u0001J\t\u0010/\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\u000c\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0016R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 \u00a8\u00060"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;",
        "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;",
        "created_at",
        "Ljava/util/Date;",
        "message_id",
        "",
        "score",
        "",
        "type",
        "updated_at",
        "user",
        "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;",
        "user_id",
        "emoji_code",
        "extraData",
        "",
        "",
        "<init>",
        "(Ljava/util/Date;Ljava/lang/String;ILjava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V",
        "getCreated_at",
        "()Ljava/util/Date;",
        "getMessage_id",
        "()Ljava/lang/String;",
        "getScore",
        "()I",
        "getType",
        "getUpdated_at",
        "getUser",
        "()Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;",
        "getUser_id",
        "getEmoji_code",
        "getExtraData",
        "()Ljava/util/Map;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
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

.annotation runtime Lqx/t;
    generateAdapter = true
.end annotation


# instance fields
.field private final created_at:Ljava/util/Date;

.field private final emoji_code:Ljava/lang/String;

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

.field private final message_id:Ljava/lang/String;

.field private final score:I

.field private final type:Ljava/lang/String;

.field private final updated_at:Ljava/util/Date;

.field private final user:Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;

.field private final user_id:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/Date;Ljava/lang/String;ILjava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "message_id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user_id"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->created_at:Ljava/util/Date;

    iput-object p2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->message_id:Ljava/lang/String;

    iput p3, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->score:I

    iput-object p4, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->type:Ljava/lang/String;

    iput-object p5, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->updated_at:Ljava/util/Date;

    iput-object p6, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->user:Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;

    iput-object p7, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->user_id:Ljava/lang/String;

    iput-object p8, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->emoji_code:Ljava/lang/String;

    iput-object p9, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->extraData:Ljava/util/Map;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;Ljava/util/Date;Ljava/lang/String;ILjava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->created_at:Ljava/util/Date;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->message_id:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget p3, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->score:I

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->type:Ljava/lang/String;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->updated_at:Ljava/util/Date;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->user:Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->user_id:Ljava/lang/String;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->emoji_code:Ljava/lang/String;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->extraData:Ljava/util/Map;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->copy(Ljava/util/Date;Ljava/lang/String;ILjava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->created_at:Ljava/util/Date;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->message_id:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->score:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->updated_at:Ljava/util/Date;

    return-object v0
.end method

.method public final component6()Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->user:Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->user_id:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->emoji_code:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/util/Date;Ljava/lang/String;ILjava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;"
        }
    .end annotation

    const-string v0, "message_id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user_id"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;-><init>(Ljava/util/Date;Ljava/lang/String;ILjava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->created_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->created_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->message_id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->message_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->score:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->score:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->updated_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->updated_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->user:Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->user:Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->user_id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->user_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->emoji_code:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->emoji_code:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->extraData:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->extraData:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getCreated_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->created_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getEmoji_code()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->emoji_code:Ljava/lang/String;

    return-object v0
.end method

.method public final getExtraData()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final getMessage_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->message_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getScore()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->score:I

    return v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdated_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->updated_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getUser()Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->user:Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;

    return-object v0
.end method

.method public final getUser_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->user_id:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->created_at:Ljava/util/Date;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/Date;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->message_id:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v3, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->score:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->type:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->updated_at:Ljava/util/Date;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/util/Date;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->user:Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->user_id:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->emoji_code:Ljava/lang/String;

    if-nez v3, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->extraData:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->created_at:Ljava/util/Date;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->message_id:Ljava/lang/String;

    iget v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->score:I

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->type:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->updated_at:Ljava/util/Date;

    iget-object v5, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->user:Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;

    iget-object v6, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->user_id:Ljava/lang/String;

    iget-object v7, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->emoji_code:Ljava/lang/String;

    iget-object v8, p0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->extraData:Ljava/util/Map;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "UpstreamReactionDto(created_at="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", message_id="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", score="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    const-string v1, ", updated_at="

    invoke-static {v2, v0, v3, v1, v9}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", user="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", user_id="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", emoji_code="

    const-string v1, ", extraData="

    invoke-static {v9, v6, v0, v7, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ")"

    invoke-static {v9, v8, v0}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
