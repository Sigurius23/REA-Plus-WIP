.class public final Lio/getstream/chat/android/client/parser2/MoshiChatParser;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/parser/ChatParser;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ*\u0010\u000e\u001a\u00020\u000b\"\u0006\u0008\u0000\u0010\n\u0018\u0001*\u00020\u000b2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000cH\u0082\u0008\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\u0017\u0010%\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0016\u00a2\u0006\u0004\u0008%\u0010&J\u0017\u0010\'\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\'\u0010\u0014J/\u0010*\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\n*\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00122\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00028\u00000(H\u0016\u00a2\u0006\u0004\u0008*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010-R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010.R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00080\u00101\u001a\u0004\u00082\u00103RX\u00107\u001aF\u0012\u001c\u0012\u001a\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003 6*\u000c\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0018\u00010505 6*\"\u0012\u001c\u0012\u001a\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003 6*\u000c\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0018\u00010505\u0018\u00010\u000c0\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00108R8\u0010:\u001a&\u0012\u000c\u0012\n 6*\u0004\u0018\u00010909 6*\u0012\u0012\u000c\u0012\n 6*\u0004\u0018\u00010909\u0018\u00010\u000c0\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u00108R8\u0010<\u001a&\u0012\u000c\u0012\n 6*\u0004\u0018\u00010;0; 6*\u0012\u0012\u000c\u0012\n 6*\u0004\u0018\u00010;0;\u0018\u00010\u000c0\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u00108R8\u0010>\u001a&\u0012\u000c\u0012\n 6*\u0004\u0018\u00010=0= 6*\u0012\u0012\u000c\u0012\n 6*\u0004\u0018\u00010=0=\u0018\u00010\u000c0\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u00108R8\u0010@\u001a&\u0012\u000c\u0012\n 6*\u0004\u0018\u00010?0? 6*\u0012\u0012\u000c\u0012\n 6*\u0004\u0018\u00010?0?\u0018\u00010\u000c0\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u00108\u00a8\u0006A"
    }
    d2 = {
        "Lio/getstream/chat/android/client/parser2/MoshiChatParser;",
        "Lio/getstream/chat/android/client/parser/ChatParser;",
        "Lio/getstream/chat/android/client/api2/mapping/EventMapping;",
        "eventMapping",
        "Lio/getstream/chat/android/client/api2/mapping/DtoMapping;",
        "dtoMapping",
        "Lio/getstream/chat/android/client/parser2/DirectEventParser;",
        "directEventParser",
        "<init>",
        "(Lio/getstream/chat/android/client/api2/mapping/EventMapping;Lio/getstream/chat/android/client/api2/mapping/DtoMapping;Lio/getstream/chat/android/client/parser2/DirectEventParser;)V",
        "T",
        "Lqx/i0;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "adapter",
        "addAdapter",
        "(Lqx/i0;Lcom/squareup/moshi/JsonAdapter;)Lqx/i0;",
        "",
        "any",
        "",
        "serializeMap",
        "(Ljava/lang/Object;)Ljava/lang/String;",
        "Lio/getstream/chat/android/client/events/ConnectedEvent;",
        "connectedEvent",
        "serializeConnectedEvent",
        "(Lio/getstream/chat/android/client/events/ConnectedEvent;)Ljava/lang/String;",
        "raw",
        "Lio/getstream/chat/android/client/socket/SocketErrorMessage;",
        "parseSocketError",
        "(Ljava/lang/String;)Lio/getstream/chat/android/client/socket/SocketErrorMessage;",
        "Lio/getstream/chat/android/client/socket/ErrorResponse;",
        "parseErrorResponse",
        "(Ljava/lang/String;)Lio/getstream/chat/android/client/socket/ErrorResponse;",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "parseAndProcessEvent",
        "(Ljava/lang/String;)Lio/getstream/chat/android/client/events/ChatEvent;",
        "Lpg3/x0;",
        "builder",
        "configRetrofit",
        "(Lpg3/x0;)Lpg3/x0;",
        "toJson",
        "Ljava/lang/Class;",
        "clazz",
        "fromJson",
        "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/api2/mapping/EventMapping;",
        "Lio/getstream/chat/android/client/api2/mapping/DtoMapping;",
        "Lio/getstream/chat/android/client/parser2/DirectEventParser;",
        "Lqx/l0;",
        "moshi$delegate",
        "Ll83/h;",
        "getMoshi",
        "()Lqx/l0;",
        "moshi",
        "",
        "kotlin.jvm.PlatformType",
        "mapAdapter",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lio/getstream/chat/android/client/api2/model/dto/UpstreamConnectedEventDto;",
        "upstreamConnectedEventAdapter",
        "Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;",
        "socketErrorResponseAdapter",
        "Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;",
        "errorResponseAdapter",
        "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;",
        "chatEventDtoAdapter",
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
.field private final chatEventDtoAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;",
            ">;"
        }
    .end annotation
.end field

.field private final directEventParser:Lio/getstream/chat/android/client/parser2/DirectEventParser;

.field private final dtoMapping:Lio/getstream/chat/android/client/api2/mapping/DtoMapping;

.field private final errorResponseAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;",
            ">;"
        }
    .end annotation
.end field

.field private final eventMapping:Lio/getstream/chat/android/client/api2/mapping/EventMapping;

.field private final mapAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Map<",
            "**>;>;"
        }
    .end annotation
.end field

.field private final moshi$delegate:Ll83/h;

.field private final socketErrorResponseAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;",
            ">;"
        }
    .end annotation
.end field

.field private final upstreamConnectedEventAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lio/getstream/chat/android/client/api2/model/dto/UpstreamConnectedEventDto;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/api2/mapping/EventMapping;Lio/getstream/chat/android/client/api2/mapping/DtoMapping;Lio/getstream/chat/android/client/parser2/DirectEventParser;)V
    .locals 1

    const-string v0, "eventMapping"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dtoMapping"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->eventMapping:Lio/getstream/chat/android/client/api2/mapping/EventMapping;

    iput-object p2, p0, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->dtoMapping:Lio/getstream/chat/android/client/api2/mapping/DtoMapping;

    iput-object p3, p0, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->directEventParser:Lio/getstream/chat/android/client/parser2/DirectEventParser;

    new-instance p1, La6/l0;

    const/16 p2, 0x15

    invoke-direct {p1, p0, p2}, La6/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->moshi$delegate:Ll83/h;

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->getMoshi()Lqx/l0;

    move-result-object p1

    const-class p2, Ljava/util/Map;

    invoke-virtual {p1, p2}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->mapAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->getMoshi()Lqx/l0;

    move-result-object p1

    const-class p2, Lio/getstream/chat/android/client/api2/model/dto/UpstreamConnectedEventDto;

    invoke-virtual {p1, p2}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->upstreamConnectedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->getMoshi()Lqx/l0;

    move-result-object p1

    const-class p2, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;

    invoke-virtual {p1, p2}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->socketErrorResponseAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->getMoshi()Lqx/l0;

    move-result-object p1

    const-class p2, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;

    invoke-virtual {p1, p2}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->errorResponseAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->getMoshi()Lqx/l0;

    move-result-object p1

    const-class p2, Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;

    invoke-virtual {p1, p2}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->chatEventDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/client/parser2/MoshiChatParser;)Lqx/l0;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->moshi_delegate$lambda$0(Lio/getstream/chat/android/client/parser2/MoshiChatParser;)Lqx/l0;

    move-result-object p0

    return-object p0
.end method

.method private final addAdapter(Lqx/i0;Lcom/squareup/moshi/JsonAdapter;)Lqx/i0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lqx/i0;",
            "Lcom/squareup/moshi/JsonAdapter<",
            "TT;>;)",
            "Lqx/i0;"
        }
    .end annotation

    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    const/4 p1, 0x0

    throw p1
.end method

.method private final getMoshi()Lqx/l0;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->moshi$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lqx/l0;

    return-object v0
.end method

.method private static final moshi_delegate$lambda$0(Lio/getstream/chat/android/client/parser2/MoshiChatParser;)Lqx/l0;
    .locals 2

    new-instance p0, Lqx/i0;

    invoke-direct {p0}, Lqx/i0;-><init>()V

    new-instance v0, Lio/getstream/chat/android/client/parser2/adapters/DateAdapter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/parser2/adapters/DateAdapter;-><init>()V

    const-class v1, Ljava/util/Date;

    invoke-virtual {p0, v1, v0}, Lqx/i0;->b(Ljava/lang/reflect/Type;Lcom/squareup/moshi/JsonAdapter;)V

    new-instance v0, Lio/getstream/chat/android/client/parser2/adapters/ExactDateAdapter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/parser2/adapters/ExactDateAdapter;-><init>()V

    const-class v1, Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    invoke-virtual {p0, v1, v0}, Lqx/i0;->b(Ljava/lang/reflect/Type;Lcom/squareup/moshi/JsonAdapter;)V

    new-instance v0, Lio/getstream/chat/android/client/parser2/adapters/EventAdapterFactory;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, v0}, Lqx/i0;->c(Lqx/s;)V

    sget-object v0, Lio/getstream/chat/android/client/parser2/adapters/DownstreamMessageDtoAdapter;->INSTANCE:Lio/getstream/chat/android/client/parser2/adapters/DownstreamMessageDtoAdapter;

    invoke-virtual {p0, v0}, Lqx/i0;->a(Ljava/lang/Object;)V

    sget-object v0, Lio/getstream/chat/android/client/parser2/adapters/DownstreamModerationDetailsDtoAdapter;->INSTANCE:Lio/getstream/chat/android/client/parser2/adapters/DownstreamModerationDetailsDtoAdapter;

    invoke-virtual {p0, v0}, Lqx/i0;->a(Ljava/lang/Object;)V

    sget-object v0, Lio/getstream/chat/android/client/parser2/adapters/UpstreamMessageDtoAdapter;->INSTANCE:Lio/getstream/chat/android/client/parser2/adapters/UpstreamMessageDtoAdapter;

    invoke-virtual {p0, v0}, Lqx/i0;->a(Ljava/lang/Object;)V

    sget-object v0, Lio/getstream/chat/android/client/parser2/adapters/DownstreamChannelDtoAdapter;->INSTANCE:Lio/getstream/chat/android/client/parser2/adapters/DownstreamChannelDtoAdapter;

    invoke-virtual {p0, v0}, Lqx/i0;->a(Ljava/lang/Object;)V

    sget-object v0, Lio/getstream/chat/android/client/parser2/adapters/AttachmentDtoAdapter;->INSTANCE:Lio/getstream/chat/android/client/parser2/adapters/AttachmentDtoAdapter;

    invoke-virtual {p0, v0}, Lqx/i0;->a(Ljava/lang/Object;)V

    sget-object v0, Lio/getstream/chat/android/client/parser2/adapters/DownstreamReactionDtoAdapter;->INSTANCE:Lio/getstream/chat/android/client/parser2/adapters/DownstreamReactionDtoAdapter;

    invoke-virtual {p0, v0}, Lqx/i0;->a(Ljava/lang/Object;)V

    sget-object v0, Lio/getstream/chat/android/client/parser2/adapters/UpstreamReactionDtoAdapter;->INSTANCE:Lio/getstream/chat/android/client/parser2/adapters/UpstreamReactionDtoAdapter;

    invoke-virtual {p0, v0}, Lqx/i0;->a(Ljava/lang/Object;)V

    sget-object v0, Lio/getstream/chat/android/client/parser2/adapters/DownstreamUserDtoAdapter;->INSTANCE:Lio/getstream/chat/android/client/parser2/adapters/DownstreamUserDtoAdapter;

    invoke-virtual {p0, v0}, Lqx/i0;->a(Ljava/lang/Object;)V

    sget-object v0, Lio/getstream/chat/android/client/parser2/adapters/UpstreamUserDtoAdapter;->INSTANCE:Lio/getstream/chat/android/client/parser2/adapters/UpstreamUserDtoAdapter;

    invoke-virtual {p0, v0}, Lqx/i0;->a(Ljava/lang/Object;)V

    sget-object v0, Lio/getstream/chat/android/client/parser2/adapters/DownstreamMemberDtoAdapter;->INSTANCE:Lio/getstream/chat/android/client/parser2/adapters/DownstreamMemberDtoAdapter;

    invoke-virtual {p0, v0}, Lqx/i0;->a(Ljava/lang/Object;)V

    sget-object v0, Lio/getstream/chat/android/client/parser2/adapters/UpstreamMemberDtoAdapter;->INSTANCE:Lio/getstream/chat/android/client/parser2/adapters/UpstreamMemberDtoAdapter;

    invoke-virtual {p0, v0}, Lqx/i0;->a(Ljava/lang/Object;)V

    sget-object v0, Lio/getstream/chat/android/client/parser2/adapters/UpstreamMemberDataDtoAdapter;->INSTANCE:Lio/getstream/chat/android/client/parser2/adapters/UpstreamMemberDataDtoAdapter;

    invoke-virtual {p0, v0}, Lqx/i0;->a(Ljava/lang/Object;)V

    sget-object v0, Lio/getstream/chat/android/client/api2/FlagRequestAdapterFactory;->INSTANCE:Lio/getstream/chat/android/client/api2/FlagRequestAdapterFactory;

    invoke-virtual {p0, v0}, Lqx/i0;->c(Lqx/s;)V

    sget-object v0, Lio/getstream/chat/android/client/parser2/adapters/DownstreamThreadDtoAdapter;->INSTANCE:Lio/getstream/chat/android/client/parser2/adapters/DownstreamThreadDtoAdapter;

    invoke-virtual {p0, v0}, Lqx/i0;->a(Ljava/lang/Object;)V

    sget-object v0, Lio/getstream/chat/android/client/parser2/adapters/DownstreamThreadInfoDtoAdapter;->INSTANCE:Lio/getstream/chat/android/client/parser2/adapters/DownstreamThreadInfoDtoAdapter;

    invoke-virtual {p0, v0}, Lqx/i0;->a(Ljava/lang/Object;)V

    sget-object v0, Lio/getstream/chat/android/client/parser2/adapters/DownstreamPollDtoAdapter;->INSTANCE:Lio/getstream/chat/android/client/parser2/adapters/DownstreamPollDtoAdapter;

    invoke-virtual {p0, v0}, Lqx/i0;->a(Ljava/lang/Object;)V

    sget-object v0, Lio/getstream/chat/android/client/parser2/adapters/DownstreamPollOptionDtoAdapter;->INSTANCE:Lio/getstream/chat/android/client/parser2/adapters/DownstreamPollOptionDtoAdapter;

    invoke-virtual {p0, v0}, Lqx/i0;->a(Ljava/lang/Object;)V

    sget-object v0, Lio/getstream/chat/android/client/parser2/adapters/CreatePollRequestAdapter;->INSTANCE:Lio/getstream/chat/android/client/parser2/adapters/CreatePollRequestAdapter;

    invoke-virtual {p0, v0}, Lqx/i0;->a(Ljava/lang/Object;)V

    sget-object v0, Lio/getstream/chat/android/client/parser2/adapters/UpstreamOptionDtoAdapter;->INSTANCE:Lio/getstream/chat/android/client/parser2/adapters/UpstreamOptionDtoAdapter;

    invoke-virtual {p0, v0}, Lqx/i0;->a(Ljava/lang/Object;)V

    new-instance v0, Lqx/l0;

    invoke-direct {v0, p0}, Lqx/l0;-><init>(Lqx/i0;)V

    return-object v0
.end method

.method private final parseAndProcessEvent(Ljava/lang/String;)Lio/getstream/chat/android/client/events/ChatEvent;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->directEventParser:Lio/getstream/chat/android/client/parser2/DirectEventParser;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/parser2/DirectEventParser;->parse(Ljava/lang/String;)Lio/getstream/chat/android/client/events/ChatEvent;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->eventMapping:Lio/getstream/chat/android/client/api2/mapping/EventMapping;

    iget-object v1, p0, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->chatEventDtoAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v1, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/api2/mapping/EventMapping;->toDomain$stream_chat_android_client_release(Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;)Lio/getstream/chat/android/client/events/ChatEvent;

    move-result-object p1

    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/internal/ChatEventKt;->enrichIfNeeded(Lio/getstream/chat/android/client/events/ChatEvent;)Lio/getstream/chat/android/client/events/ChatEvent;

    move-result-object p1

    return-object p1
.end method

.method private final parseErrorResponse(Ljava/lang/String;)Lio/getstream/chat/android/client/socket/ErrorResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->errorResponseAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;

    invoke-static {p1}, Lio/getstream/chat/android/client/api2/mapping/SocketErrorMappingKt;->toDomain(Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;)Lio/getstream/chat/android/client/socket/ErrorResponse;

    move-result-object p1

    return-object p1
.end method

.method private final parseSocketError(Ljava/lang/String;)Lio/getstream/chat/android/client/socket/SocketErrorMessage;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->socketErrorResponseAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;

    invoke-static {p1}, Lio/getstream/chat/android/client/api2/mapping/SocketErrorMappingKt;->toDomain(Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;)Lio/getstream/chat/android/client/socket/SocketErrorMessage;

    move-result-object p1

    return-object p1
.end method

.method private final serializeConnectedEvent(Lio/getstream/chat/android/client/events/ConnectedEvent;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->dtoMapping:Lio/getstream/chat/android/client/api2/mapping/DtoMapping;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/api2/mapping/DtoMapping;->toDto$stream_chat_android_client_release(Lio/getstream/chat/android/client/events/ConnectedEvent;)Lio/getstream/chat/android/client/api2/model/dto/UpstreamConnectedEventDto;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->upstreamConnectedEventAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, p1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toJson(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final serializeMap(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->mapAdapter:Lcom/squareup/moshi/JsonAdapter;

    const-string v1, "null cannot be cast to non-null type kotlin.collections.Map<*, *>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/Map;

    invoke-virtual {v0, p1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toJson(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final configRetrofit(Lpg3/x0;)Lpg3/x0;
    .locals 2

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/api2/MoshiUrlQueryPayloadFactory;

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->getMoshi()Lqx/l0;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/api2/MoshiUrlQueryPayloadFactory;-><init>(Lqx/l0;)V

    invoke-virtual {p1, v0}, Lpg3/x0;->b(Lpg3/m;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->getMoshi()Lqx/l0;

    move-result-object v0

    new-instance v1, Ltg3/a;

    invoke-direct {v1, v0}, Ltg3/a;-><init>(Lqx/l0;)V

    invoke-static {v1}, Lio/getstream/chat/android/client/parser2/MoshiErrorLoggingKt;->withErrorLogging(Ltg3/a;)Lpg3/m;

    move-result-object v0

    invoke-virtual {p1, v0}, Lpg3/x0;->b(Lpg3/m;)V

    return-object p1
.end method

.method public final fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    const-string v0, "raw"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clazz"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lio/getstream/chat/android/client/events/ChatEvent;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->parseAndProcessEvent(Ljava/lang/String;)Lio/getstream/chat/android/client/events/ChatEvent;

    move-result-object p1

    return-object p1

    :cond_0
    const-class v0, Lio/getstream/chat/android/client/socket/SocketErrorMessage;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->parseSocketError(Ljava/lang/String;)Lio/getstream/chat/android/client/socket/SocketErrorMessage;

    move-result-object p1

    return-object p1

    :cond_1
    const-class v0, Lio/getstream/chat/android/client/socket/ErrorResponse;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->parseErrorResponse(Ljava/lang/String;)Lio/getstream/chat/android/client/socket/ErrorResponse;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->getMoshi()Lqx/l0;

    move-result-object v0

    invoke-virtual {v0, p2}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final toJson(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    const-string v0, "any"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->serializeMap(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/client/events/ConnectedEvent;

    if-eqz v0, :cond_1

    check-cast p1, Lio/getstream/chat/android/client/events/ConnectedEvent;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->serializeConnectedEvent(Lio/getstream/chat/android/client/events/ConnectedEvent;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-direct {p0}, Lio/getstream/chat/android/client/parser2/MoshiChatParser;->getMoshi()Lqx/l0;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toJson(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
