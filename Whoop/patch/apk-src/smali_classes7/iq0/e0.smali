.class public final Liq0/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J1\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Liq0/e0;",
        "",
        "<init>",
        "()V",
        "",
        "",
        "currentlyTyping",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "chatEvent",
        "userId",
        "a",
        "(Ljava/util/Set;Lio/getstream/chat/android/client/events/ChatEvent;Ljava/lang/String;)Ljava/util/Set;",
        "community_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Liq0/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Liq0/e0;

    invoke-direct {v0}, Liq0/e0;-><init>()V

    sput-object v0, Liq0/e0;->a:Liq0/e0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;Lio/getstream/chat/android/client/events/ChatEvent;Ljava/lang/String;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "currentlyTyping"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatEvent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lio/getstream/chat/android/client/events/TypingStartEvent;

    if-eqz v0, :cond_0

    check-cast p2, Lio/getstream/chat/android/client/events/TypingStartEvent;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/events/TypingStartEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_1

    invoke-virtual {p2}, Lio/getstream/chat/android/client/events/TypingStartEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p2

    invoke-virtual {p2}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p1

    :cond_0
    instance-of p3, p2, Lio/getstream/chat/android/client/events/TypingStopEvent;

    if-eqz p3, :cond_1

    check-cast p2, Lio/getstream/chat/android/client/events/TypingStopEvent;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/events/TypingStopEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p2

    invoke-virtual {p2}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :cond_1
    return-object p1
.end method
