.class public abstract Lio/getstream/chat/android/models/ConnectionState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/models/ConnectionState$Companion;,
        Lio/getstream/chat/android/models/ConnectionState$Connected;,
        Lio/getstream/chat/android/models/ConnectionState$Connecting;,
        Lio/getstream/chat/android/models/ConnectionState$Offline;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0003\u0008\t\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/getstream/chat/android/models/ConnectionState;",
        "",
        "<init>",
        "()V",
        "Connected",
        "Connecting",
        "Offline",
        "Companion",
        "Lio/getstream/chat/android/models/ConnectionState$Connected;",
        "Lio/getstream/chat/android/models/ConnectionState$Connecting;",
        "Lio/getstream/chat/android/models/ConnectionState$Offline;",
        "stream-chat-android-core"
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
.field public static final Companion:Lio/getstream/chat/android/models/ConnectionState$Companion;

.field private static final values:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ConnectionState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/getstream/chat/android/models/ConnectionState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/getstream/chat/android/models/ConnectionState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/getstream/chat/android/models/ConnectionState;->Companion:Lio/getstream/chat/android/models/ConnectionState$Companion;

    const/4 v0, 0x3

    new-array v0, v0, [Lio/getstream/chat/android/models/ConnectionState;

    sget-object v1, Lio/getstream/chat/android/models/ConnectionState$Connected;->INSTANCE:Lio/getstream/chat/android/models/ConnectionState$Connected;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lio/getstream/chat/android/models/ConnectionState$Connecting;->INSTANCE:Lio/getstream/chat/android/models/ConnectionState$Connecting;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lio/getstream/chat/android/models/ConnectionState$Offline;->INSTANCE:Lio/getstream/chat/android/models/ConnectionState$Offline;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/models/ConnectionState;->values:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/getstream/chat/android/models/ConnectionState;-><init>()V

    return-void
.end method

.method public static final synthetic access$getValues$cp()Ljava/util/List;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/models/ConnectionState;->values:Ljava/util/List;

    return-object v0
.end method
