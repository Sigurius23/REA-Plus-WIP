.class public final Lio/getstream/chat/android/client/notifications/parser/StreamPayloadParser;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR/\u0010\u0011\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000c0\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/getstream/chat/android/client/notifications/parser/StreamPayloadParser;",
        "",
        "<init>",
        "()V",
        "",
        "json",
        "",
        "parse",
        "(Ljava/lang/String;)Ljava/util/Map;",
        "TAG",
        "Ljava/lang/String;",
        "Lcom/squareup/moshi/JsonAdapter;",
        "",
        "mapAdapter$delegate",
        "Ll83/h;",
        "getMapAdapter",
        "()Lcom/squareup/moshi/JsonAdapter;",
        "mapAdapter",
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
.field public static final INSTANCE:Lio/getstream/chat/android/client/notifications/parser/StreamPayloadParser;

.field private static final TAG:Ljava/lang/String; = "StreamPayloadParser"

.field private static final mapAdapter$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/getstream/chat/android/client/notifications/parser/StreamPayloadParser;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/notifications/parser/StreamPayloadParser;->INSTANCE:Lio/getstream/chat/android/client/notifications/parser/StreamPayloadParser;

    new-instance v0, Ll1/f0;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Ll1/f0;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/client/notifications/parser/StreamPayloadParser;->mapAdapter$delegate:Ll83/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Lcom/squareup/moshi/JsonAdapter;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/client/notifications/parser/StreamPayloadParser;->mapAdapter_delegate$lambda$0()Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    return-object v0
.end method

.method private final getMapAdapter()Lcom/squareup/moshi/JsonAdapter;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/squareup/moshi/JsonAdapter<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/client/notifications/parser/StreamPayloadParser;->mapAdapter$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/squareup/moshi/JsonAdapter;

    return-object v0
.end method

.method private static final mapAdapter_delegate$lambda$0()Lcom/squareup/moshi/JsonAdapter;
    .locals 4

    new-instance v0, Lqx/i0;

    invoke-direct {v0}, Lqx/i0;-><init>()V

    new-instance v1, Lqx/l0;

    invoke-direct {v1, v0}, Lqx/l0;-><init>(Lqx/i0;)V

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/reflect/Type;

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v0, v3

    const-class v2, Ljava/lang/Object;

    const/4 v3, 0x1

    aput-object v2, v0, v3

    const-class v2, Ljava/util/Map;

    invoke-static {v2, v0}, Landroidx/room/c1;->F(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lrx/d;

    move-result-object v0

    sget-object v2, Lrx/f;->a:Ljava/util/Set;

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final parse(Ljava/lang/String;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    sget-object v0, Lm83/z;->w:Lm83/z;

    if-eqz p1, :cond_2

    :try_start_0
    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    move-object v1, p1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    sget-object v2, Lio/getstream/chat/android/client/notifications/parser/StreamPayloadParser;->INSTANCE:Lio/getstream/chat/android/client/notifications/parser/StreamPayloadParser;

    invoke-direct {v2}, Lio/getstream/chat/android/client/notifications/parser/StreamPayloadParser;->getMapAdapter()Lcom/squareup/moshi/JsonAdapter;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    return-object v1

    :catchall_0
    move-exception v1

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->F:Lb23/g;

    const-string v4, "StreamPayloadParser"

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v2, Lb23/i;->c:Lb23/j;

    const-string v5, "[parse] failed: "

    invoke-virtual {v5, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, v3, v4, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    return-object v0
.end method
