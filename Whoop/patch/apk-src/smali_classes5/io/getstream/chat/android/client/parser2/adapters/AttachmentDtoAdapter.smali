.class public final Lio/getstream/chat/android/client/parser2/adapters/AttachmentDtoAdapter;
.super Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter<",
        "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004JA\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00080\u00072\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eJK\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u001a\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00080\u00072\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/getstream/chat/android/client/parser2/adapters/AttachmentDtoAdapter;",
        "Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter;",
        "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;",
        "<init>",
        "()V",
        "Lcom/squareup/moshi/JsonReader;",
        "jsonReader",
        "Lcom/squareup/moshi/JsonAdapter;",
        "",
        "",
        "",
        "mapAdapter",
        "messageAdapter",
        "fromJson",
        "(Lcom/squareup/moshi/JsonReader;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;",
        "Lqx/c0;",
        "jsonWriter",
        "message",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)V",
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


# static fields
.field public static final INSTANCE:Lio/getstream/chat/android/client/parser2/adapters/AttachmentDtoAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/parser2/adapters/AttachmentDtoAdapter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/parser2/adapters/AttachmentDtoAdapter;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/parser2/adapters/AttachmentDtoAdapter;->INSTANCE:Lio/getstream/chat/android/client/parser2/adapters/AttachmentDtoAdapter;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter;-><init>(Lj93/d;)V

    return-void
.end method


# virtual methods
.method public final fromJson(Lcom/squareup/moshi/JsonReader;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/moshi/JsonReader;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;",
            ">;)",
            "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;"
        }
    .end annotation

    .annotation runtime Lqx/p;
    .end annotation

    const-string v0, "jsonReader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapAdapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageAdapter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter;->parseWithExtraData(Lcom/squareup/moshi/JsonReader;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;

    return-object p1
.end method

.method public final toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqx/c0;",
            "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Lqx/t0;
    .end annotation

    const-string v0, "jsonWriter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapAdapter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageAdapter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter;->serializeWithExtraData(Lqx/c0;Ljava/lang/Object;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)V

    return-void
.end method
