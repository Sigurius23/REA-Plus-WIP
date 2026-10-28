.class public final Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel$$serializer;,
        Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 32\u00020\u0001:\u000245B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBM\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!JF\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010+\u001a\u0004\u0008,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010+\u001a\u0004\u0008-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010+\u001a\u0004\u0008.\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010/\u001a\u0004\u00080\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00101\u001a\u0004\u00082\u0010!\u00a8\u00066"
    }
    d2 = {
        "Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;",
        "",
        "",
        "path",
        "method",
        "contentType",
        "Lkotlinx/serialization/json/JsonElement;",
        "body",
        "",
        "timeoutMillis",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Long;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$bot_release",
        "(Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lkotlinx/serialization/json/JsonElement;",
        "component5",
        "()Ljava/lang/Long;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Long;)Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getPath",
        "getMethod",
        "getContentType",
        "Lkotlinx/serialization/json/JsonElement;",
        "getBody",
        "Ljava/lang/Long;",
        "getTimeoutMillis",
        "Companion",
        "$serializer",
        "a",
        "bot_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel$a;


# instance fields
.field private final body:Lkotlinx/serialization/json/JsonElement;

.field private final contentType:Ljava/lang/String;

.field private final method:Ljava/lang/String;

.field private final path:Ljava/lang/String;

.field private final timeoutMillis:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->Companion:Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel$$serializer;->INSTANCE:Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel$$serializer;

    invoke-virtual {p7}, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->path:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->method:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->contentType:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->body:Lkotlinx/serialization/json/JsonElement;

    goto :goto_0

    :cond_1
    iput-object p5, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->body:Lkotlinx/serialization/json/JsonElement;

    :goto_0
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_2

    iput-object p3, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->timeoutMillis:Ljava/lang/Long;

    return-void

    :cond_2
    iput-object p6, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->timeoutMillis:Ljava/lang/Long;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Long;)V
    .locals 1

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "method"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->path:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->method:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->contentType:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->body:Lkotlinx/serialization/json/JsonElement;

    .line 7
    iput-object p5, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->timeoutMillis:Ljava/lang/Long;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x8

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p4, v0

    :cond_0
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_1

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_1
    move-object p6, p5

    goto :goto_0

    .line 8
    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Long;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Long;ILjava/lang/Object;)Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->path:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->method:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->contentType:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->body:Lkotlinx/serialization/json/JsonElement;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->timeoutMillis:Ljava/lang/Long;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Long;)Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$bot_release(Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->path:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->method:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->contentType:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->body:Lkotlinx/serialization/json/JsonElement;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lad3/n;->a:Lad3/n;

    iget-object v2, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->body:Lkotlinx/serialization/json/JsonElement;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->timeoutMillis:Ljava/lang/Long;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object p0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->timeoutMillis:Ljava/lang/Long;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->path:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->method:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->contentType:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->body:Lkotlinx/serialization/json/JsonElement;

    return-object v0
.end method

.method public final component5()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->timeoutMillis:Ljava/lang/Long;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Long;)Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;
    .locals 7

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "method"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Long;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;

    iget-object v1, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->path:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->path:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->method:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->method:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->contentType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->contentType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->body:Lkotlinx/serialization/json/JsonElement;

    iget-object v3, p1, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->body:Lkotlinx/serialization/json/JsonElement;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->timeoutMillis:Ljava/lang/Long;

    iget-object p1, p1, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->timeoutMillis:Ljava/lang/Long;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getBody()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->body:Lkotlinx/serialization/json/JsonElement;

    return-object v0
.end method

.method public final getContentType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->contentType:Ljava/lang/String;

    return-object v0
.end method

.method public final getMethod()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->method:Ljava/lang/String;

    return-object v0
.end method

.method public final getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->path:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimeoutMillis()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->timeoutMillis:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->path:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->method:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->contentType:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->body:Lkotlinx/serialization/json/JsonElement;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->timeoutMillis:Ljava/lang/Long;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->path:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->method:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->contentType:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->body:Lkotlinx/serialization/json/JsonElement;

    iget-object v4, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleRequestModel;->timeoutMillis:Ljava/lang/Long;

    const-string v5, ", method="

    const-string v6, ", contentType="

    const-string v7, "ContextStatusToggleRequestModel(path="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", body="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timeoutMillis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
