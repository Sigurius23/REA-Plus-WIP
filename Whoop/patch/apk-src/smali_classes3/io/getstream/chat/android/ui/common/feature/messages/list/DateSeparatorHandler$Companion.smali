.class public final Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\u0014\u0010\u0008\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler$Companion;",
        "",
        "<init>",
        "()V",
        "defaultDateSeparatorHandler",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;",
        "getDefaultDateSeparatorHandler",
        "getDefaultThreadDateSeparatorHandler",
        "isInTheSameDay",
        "",
        "Ljava/util/Date;",
        "that",
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
.field static final synthetic $$INSTANCE:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler$Companion;

.field private static final defaultDateSeparatorHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler$Companion;->$$INSTANCE:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler$Companion;

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/a;-><init>(I)V

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler$Companion;->defaultDateSeparatorHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler$Companion;->defaultDateSeparatorHandler$lambda$0(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler$Companion;->getDefaultThreadDateSeparatorHandler$lambda$2(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method private static final defaultDateSeparatorHandler$lambda$0(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z
    .locals 2

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler$Companion;->$$INSTANCE:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler$Companion;

    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object v1

    invoke-static {p1, v1}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object p1

    if-eqz p0, :cond_0

    invoke-static {p0}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrNull(Lio/getstream/chat/android/models/Message;)Ljava/util/Date;

    move-result-object p0

    if-nez p0, :cond_1

    :cond_0
    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object p0

    :cond_1
    invoke-direct {v0, p1, p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler$Companion;->isInTheSameDay(Ljava/util/Date;Ljava/util/Date;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private static final getDefaultThreadDateSeparatorHandler$lambda$2(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler$Companion;->defaultDateSeparatorHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;

    invoke-interface {v0, p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;->shouldAddDateSeparator(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private final isInTheSameDay(Ljava/util/Date;Ljava/util/Date;)Z
    .locals 2

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const/4 p2, 0x6

    invoke-virtual {v0, p2}, Ljava/util/Calendar;->get(I)I

    move-result v1

    invoke-virtual {p1, p2}, Ljava/util/Calendar;->get(I)I

    move-result p2

    if-ne v1, p2, :cond_0

    const/4 p2, 0x1

    invoke-virtual {v0, p2}, Ljava/util/Calendar;->get(I)I

    move-result v0

    invoke-virtual {p1, p2}, Ljava/util/Calendar;->get(I)I

    move-result p1

    if-ne v0, p1, :cond_0

    return p2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final getDefaultDateSeparatorHandler()Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler$Companion;->defaultDateSeparatorHandler:Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;

    return-object v0
.end method

.method public final getDefaultThreadDateSeparatorHandler()Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;
    .locals 2

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/a;-><init>(I)V

    return-object v0
.end method
