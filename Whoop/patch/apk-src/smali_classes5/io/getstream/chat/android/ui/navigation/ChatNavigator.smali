.class public final Lio/getstream/chat/android/ui/navigation/ChatNavigator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/navigation/ChatNavigator$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/navigation/ChatNavigator;",
        "",
        "Lio/getstream/chat/android/ui/navigation/ChatNavigationHandler;",
        "handler",
        "<init>",
        "(Lio/getstream/chat/android/ui/navigation/ChatNavigationHandler;)V",
        "Lio/getstream/chat/android/ui/navigation/destinations/ChatDestination;",
        "destination",
        "Ll83/a0;",
        "performDefaultNavigation",
        "(Lio/getstream/chat/android/ui/navigation/destinations/ChatDestination;)V",
        "navigate",
        "Lio/getstream/chat/android/ui/navigation/ChatNavigationHandler;",
        "Companion",
        "stream-chat-android-ui-components_release"
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
.field public static final Companion:Lio/getstream/chat/android/ui/navigation/ChatNavigator$Companion;

.field public static final EMPTY_HANDLER:Lio/getstream/chat/android/ui/navigation/ChatNavigationHandler;


# instance fields
.field private final handler:Lio/getstream/chat/android/ui/navigation/ChatNavigationHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/getstream/chat/android/ui/navigation/ChatNavigator$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/navigation/ChatNavigator;->Companion:Lio/getstream/chat/android/ui/navigation/ChatNavigator$Companion;

    new-instance v0, Lxs/a;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lxs/a;-><init>(I)V

    sput-object v0, Lio/getstream/chat/android/ui/navigation/ChatNavigator;->EMPTY_HANDLER:Lio/getstream/chat/android/ui/navigation/ChatNavigationHandler;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lio/getstream/chat/android/ui/navigation/ChatNavigator;-><init>(Lio/getstream/chat/android/ui/navigation/ChatNavigationHandler;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/ui/navigation/ChatNavigationHandler;)V
    .locals 1

    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/navigation/ChatNavigator;->handler:Lio/getstream/chat/android/ui/navigation/ChatNavigationHandler;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/navigation/ChatNavigationHandler;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    sget-object p1, Lio/getstream/chat/android/ui/navigation/ChatNavigator;->EMPTY_HANDLER:Lio/getstream/chat/android/ui/navigation/ChatNavigationHandler;

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/navigation/ChatNavigator;-><init>(Lio/getstream/chat/android/ui/navigation/ChatNavigationHandler;)V

    return-void
.end method

.method private static final EMPTY_HANDLER$lambda$0(Lio/getstream/chat/android/ui/navigation/destinations/ChatDestination;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/navigation/destinations/ChatDestination;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/navigation/ChatNavigator;->EMPTY_HANDLER$lambda$0(Lio/getstream/chat/android/ui/navigation/destinations/ChatDestination;)Z

    return-void
.end method

.method private final performDefaultNavigation(Lio/getstream/chat/android/ui/navigation/destinations/ChatDestination;)V
    .locals 0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/navigation/destinations/ChatDestination;->navigate()V

    return-void
.end method


# virtual methods
.method public final navigate(Lio/getstream/chat/android/ui/navigation/destinations/ChatDestination;)V
    .locals 1

    const-string v0, "destination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/navigation/ChatNavigator;->handler:Lio/getstream/chat/android/ui/navigation/ChatNavigationHandler;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/ui/navigation/ChatNavigationHandler;->navigate(Lio/getstream/chat/android/ui/navigation/destinations/ChatDestination;)Z

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/navigation/destinations/ChatDestination;->navigate()V

    return-void
.end method
