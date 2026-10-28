.class public final Lio/getstream/chat/android/client/parser2/adapters/UpstreamMessageDtoAdapter;
.super Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter<",
        "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008JK\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u001a\u0010\u0010\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r0\u000c2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/getstream/chat/android/client/parser2/adapters/UpstreamMessageDtoAdapter;",
        "Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter;",
        "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;",
        "<init>",
        "()V",
        "Lcom/squareup/moshi/JsonReader;",
        "jsonReader",
        "fromJson",
        "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;",
        "Lqx/c0;",
        "jsonWriter",
        "message",
        "Lcom/squareup/moshi/JsonAdapter;",
        "",
        "",
        "",
        "mapAdapter",
        "messageAdapter",
        "Ll83/a0;",
        "toJson",
        "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)V",
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
.field public static final INSTANCE:Lio/getstream/chat/android/client/parser2/adapters/UpstreamMessageDtoAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/parser2/adapters/UpstreamMessageDtoAdapter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/parser2/adapters/UpstreamMessageDtoAdapter;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/parser2/adapters/UpstreamMessageDtoAdapter;->INSTANCE:Lio/getstream/chat/android/client/parser2/adapters/UpstreamMessageDtoAdapter;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const-class v0, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/parser2/adapters/CustomObjectDtoAdapter;-><init>(Lj93/d;)V

    return-void
.end method


# virtual methods
.method public final fromJson(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;
    .locals 1
    .annotation runtime Lqx/p;
    .end annotation

    const-string v0, "jsonReader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Can\'t parse this from Json"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toJson(Lqx/c0;Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqx/c0;",
            "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;",
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
