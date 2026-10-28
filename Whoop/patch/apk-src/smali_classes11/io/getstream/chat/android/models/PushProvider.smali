.class public final enum Lio/getstream/chat/android/models/PushProvider;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/models/PushProvider$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/getstream/chat/android/models/PushProvider;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u0000 \u000c2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000cB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lio/getstream/chat/android/models/PushProvider;",
        "",
        "key",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getKey",
        "()Ljava/lang/String;",
        "FIREBASE",
        "HUAWEI",
        "XIAOMI",
        "UNKNOWN",
        "Companion",
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
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lio/getstream/chat/android/models/PushProvider;

.field public static final Companion:Lio/getstream/chat/android/models/PushProvider$Companion;

.field public static final enum FIREBASE:Lio/getstream/chat/android/models/PushProvider;

.field public static final enum HUAWEI:Lio/getstream/chat/android/models/PushProvider;

.field public static final enum UNKNOWN:Lio/getstream/chat/android/models/PushProvider;

.field public static final enum XIAOMI:Lio/getstream/chat/android/models/PushProvider;


# instance fields
.field private final key:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lio/getstream/chat/android/models/PushProvider;
    .locals 4

    sget-object v0, Lio/getstream/chat/android/models/PushProvider;->FIREBASE:Lio/getstream/chat/android/models/PushProvider;

    sget-object v1, Lio/getstream/chat/android/models/PushProvider;->HUAWEI:Lio/getstream/chat/android/models/PushProvider;

    sget-object v2, Lio/getstream/chat/android/models/PushProvider;->XIAOMI:Lio/getstream/chat/android/models/PushProvider;

    sget-object v3, Lio/getstream/chat/android/models/PushProvider;->UNKNOWN:Lio/getstream/chat/android/models/PushProvider;

    filled-new-array {v0, v1, v2, v3}, [Lio/getstream/chat/android/models/PushProvider;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/getstream/chat/android/models/PushProvider;

    const/4 v1, 0x0

    const-string v2, "firebase"

    const-string v3, "FIREBASE"

    invoke-direct {v0, v3, v1, v2}, Lio/getstream/chat/android/models/PushProvider;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/models/PushProvider;->FIREBASE:Lio/getstream/chat/android/models/PushProvider;

    new-instance v0, Lio/getstream/chat/android/models/PushProvider;

    const/4 v1, 0x1

    const-string v2, "huawei"

    const-string v3, "HUAWEI"

    invoke-direct {v0, v3, v1, v2}, Lio/getstream/chat/android/models/PushProvider;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/models/PushProvider;->HUAWEI:Lio/getstream/chat/android/models/PushProvider;

    new-instance v0, Lio/getstream/chat/android/models/PushProvider;

    const/4 v1, 0x2

    const-string v2, "xiaomi"

    const-string v3, "XIAOMI"

    invoke-direct {v0, v3, v1, v2}, Lio/getstream/chat/android/models/PushProvider;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/models/PushProvider;->XIAOMI:Lio/getstream/chat/android/models/PushProvider;

    new-instance v0, Lio/getstream/chat/android/models/PushProvider;

    const/4 v1, 0x3

    const-string v2, "unknown"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lio/getstream/chat/android/models/PushProvider;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/getstream/chat/android/models/PushProvider;->UNKNOWN:Lio/getstream/chat/android/models/PushProvider;

    invoke-static {}, Lio/getstream/chat/android/models/PushProvider;->$values()[Lio/getstream/chat/android/models/PushProvider;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/models/PushProvider;->$VALUES:[Lio/getstream/chat/android/models/PushProvider;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/models/PushProvider;->$ENTRIES:Lt83/a;

    new-instance v0, Lio/getstream/chat/android/models/PushProvider$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/getstream/chat/android/models/PushProvider$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/getstream/chat/android/models/PushProvider;->Companion:Lio/getstream/chat/android/models/PushProvider$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lio/getstream/chat/android/models/PushProvider;->key:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/models/PushProvider;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/getstream/chat/android/models/PushProvider;
    .locals 1

    const-class v0, Lio/getstream/chat/android/models/PushProvider;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/models/PushProvider;

    return-object p0
.end method

.method public static values()[Lio/getstream/chat/android/models/PushProvider;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/models/PushProvider;->$VALUES:[Lio/getstream/chat/android/models/PushProvider;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/getstream/chat/android/models/PushProvider;

    return-object v0
.end method


# virtual methods
.method public final getKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/PushProvider;->key:Ljava/lang/String;

    return-object v0
.end method
