.class public final Lio/getstream/chat/android/client/plugin/ThrottlingPlugin;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/Plugin;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006JG\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\n\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u00032\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0002H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001e\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00030\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Lio/getstream/chat/android/client/plugin/ThrottlingPlugin;",
        "Lio/getstream/chat/android/client/plugin/Plugin;",
        "Lkotlin/Function0;",
        "",
        "now",
        "<init>",
        "(Lc93/a;)V",
        "",
        "",
        "lastUpdateProvider",
        "key",
        "throttleMs",
        "Ln23/a;",
        "failureGenerator",
        "Ln23/h;",
        "Ll83/a0;",
        "checkThrottling",
        "(Ljava/util/Map;Ljava/lang/String;JLc93/a;)Ln23/h;",
        "Lio/getstream/chat/android/models/Location;",
        "location",
        "onUpdateLiveLocationPrecondition",
        "(Lio/getstream/chat/android/models/Location;Lq83/d;)Ljava/lang/Object;",
        "onUserDisconnected",
        "()V",
        "Lc93/a;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "liveLocationMap",
        "Ljava/util/Map;",
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
.field private final liveLocationMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final logger$delegate:Ll83/h;

.field private final now:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lio/getstream/chat/android/client/plugin/ThrottlingPlugin;-><init>(Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "now"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/client/plugin/ThrottlingPlugin;->now:Lc93/a;

    .line 4
    const-string p1, "Chat:ThrottlingPlugin"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/plugin/ThrottlingPlugin;->logger$delegate:Ll83/h;

    .line 5
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/plugin/ThrottlingPlugin;->liveLocationMap:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 6
    new-instance p1, Lio/getstream/chat/android/client/k;

    const/16 p2, 0x11

    invoke-direct {p1, p2}, Lio/getstream/chat/android/client/k;-><init>(I)V

    .line 7
    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/plugin/ThrottlingPlugin;-><init>(Lc93/a;)V

    return-void
.end method

.method private static final _init_$lambda$0()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method private final checkThrottling(Ljava/util/Map;Ljava/lang/String;JLc93/a;)Ln23/h;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;",
            "Ljava/lang/String;",
            "J",
            "Lc93/a;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/plugin/ThrottlingPlugin;->now:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x0

    :goto_0
    sub-long v2, v0, v2

    cmp-long v4, v2, v0

    if-eqz v4, :cond_2

    cmp-long p3, v2, p3

    if-ltz p3, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ln23/f;

    invoke-interface {p5}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ln23/e;

    invoke-direct {p1, p2}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :cond_2
    :goto_1
    new-instance p3, Ln23/g;

    sget-object p4, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p3, p4}, Ln23/g;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p4

    invoke-interface {p1, p2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p3
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/plugin/ThrottlingPlugin;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private static final onUpdateLiveLocationPrecondition$lambda$2(Lio/getstream/chat/android/client/plugin/ThrottlingPlugin;Lio/getstream/chat/android/models/Location;)Ln23/a;
    .locals 4

    invoke-direct {p0}, Lio/getstream/chat/android/client/plugin/ThrottlingPlugin;->getLogger()Lb23/k;

    move-result-object p0

    iget-object v0, p0, Lb23/k;->c:Lb23/e;

    sget-object v1, Lb23/g;->E:Lb23/g;

    iget-object v2, p0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Location;->getMessageId()Ljava/lang/String;

    move-result-object p1

    const-string v0, "[onUpdateLiveLocationPrecondition] live location update is ignored ("

    const-string v3, ")"

    invoke-static {v0, p1, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p0, v1, v2, p1, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance p0, Ln23/a;

    const-string p1, "Live location update throttled"

    invoke-direct {p0, p1}, Ln23/a;-><init>(Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public final onUpdateLiveLocationPrecondition(Lio/getstream/chat/android/models/Location;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Location;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lio/getstream/chat/android/client/plugin/ThrottlingPlugin;->liveLocationMap:Ljava/util/Map;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Location;->getMessageId()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/client/plugin/ThrottlingPlugin;->now:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    goto :goto_0

    :cond_0
    const-wide/16 v3, 0x0

    :goto_0
    sub-long v3, v1, v3

    cmp-long v5, v3, v1

    if-eqz v5, :cond_2

    const-wide/16 v5, 0xbb8

    cmp-long v3, v3, v5

    if-ltz v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance p2, Ln23/f;

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/plugin/ThrottlingPlugin;->onUpdateLiveLocationPrecondition$lambda$2(Lio/getstream/chat/android/client/plugin/ThrottlingPlugin;Lio/getstream/chat/android/models/Location;)Ln23/a;

    move-result-object p1

    invoke-direct {p2, p1}, Ln23/f;-><init>(Ln23/e;)V

    goto :goto_2

    :cond_2
    :goto_1
    new-instance p1, Ln23/g;

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, v3}, Ln23/g;-><init>(Ljava/lang/Object;)V

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object p2, p1

    :goto_2
    return-object p2
.end method

.method public final onUserDisconnected()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/plugin/ThrottlingPlugin;->liveLocationMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method
