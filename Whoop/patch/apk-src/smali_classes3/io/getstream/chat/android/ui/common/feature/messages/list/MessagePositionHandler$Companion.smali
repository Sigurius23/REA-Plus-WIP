.class public final Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0005H\u0007J\u0016\u0010\t\u001a\u00020\n*\u0004\u0018\u00010\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0002J \u0010\u000e\u001a\u00020\n*\u0004\u0018\u00010\u000b2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;",
        "",
        "<init>",
        "()V",
        "DEFAULT_MAX_GROUP_TIME_MILLIS",
        "",
        "defaultHandler",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;",
        "maxGroupTimeMillis",
        "isValidMessageFromUser",
        "",
        "Lio/getstream/chat/android/models/Message;",
        "user",
        "Lio/getstream/chat/android/models/User;",
        "exceedsMaxTimeDifference",
        "other",
        "maxMillis",
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
.field static final synthetic $$INSTANCE:Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;

.field private static final DEFAULT_MAX_GROUP_TIME_MILLIS:J = 0xea60L


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;->$$INSTANCE:Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(JLio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZ)Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;
    .locals 0

    invoke-static/range {p0 .. p7}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;->defaultHandler$lambda$0(JLio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZ)Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    move-result-object p0

    return-object p0
.end method

.method public static defaultHandler$default(Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;JILjava/lang/Object;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const-wide/32 p1, 0xea60

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Lio/getstream/chat/android/ui/common/feature/messages/list/h;

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/h;-><init>(J)V

    return-object p0
.end method

.method private static final defaultHandler$lambda$0(JLio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;ZZZ)Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;
    .locals 2

    const-string p7, "message"

    invoke-static {p3, p7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p7, 0x0

    const/4 v0, 0x1

    if-nez p5, :cond_0

    sget-object p5, Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;->$$INSTANCE:Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-direct {p5, p2, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;->isValidMessageFromUser(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p5, p3, p2, p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;->exceedsMaxTimeDifference(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;J)Z

    move-result p2

    if-nez p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    move p2, p7

    :goto_0
    if-nez p6, :cond_1

    sget-object p5, Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;->$$INSTANCE:Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p6

    invoke-direct {p5, p4, p6}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;->isValidMessageFromUser(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;)Z

    move-result p6

    if-eqz p6, :cond_1

    invoke-direct {p5, p4, p3, p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler$Companion;->exceedsMaxTimeDifference(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;J)Z

    move-result p0

    if-nez p0, :cond_1

    move p7, v0

    :cond_1
    if-eqz p7, :cond_2

    if-nez p2, :cond_2

    sget-object p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;->TOP:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    return-object p0

    :cond_2
    if-eqz p7, :cond_3

    if-eqz p2, :cond_3

    sget-object p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;->MIDDLE:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    return-object p0

    :cond_3
    if-eqz p2, :cond_4

    sget-object p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;->BOTTOM:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    return-object p0

    :cond_4
    sget-object p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;->NONE:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    return-object p0
.end method

.method private final exceedsMaxTimeDifference(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;J)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object v1

    invoke-static {p1, v1}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object p1

    invoke-static {p2, p1}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide p1

    sub-long/2addr v1, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide p1

    cmp-long p1, p1, p3

    if-lez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    return v0
.end method

.method private final isValidMessageFromUser(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;)Z
    .locals 1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isSystem(Lio/getstream/chat/android/models/Message;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isError(Lio/getstream/chat/android/models/Message;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final defaultHandler(J)Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;
    .locals 1
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/h;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/h;-><init>(J)V

    return-object v0
.end method
