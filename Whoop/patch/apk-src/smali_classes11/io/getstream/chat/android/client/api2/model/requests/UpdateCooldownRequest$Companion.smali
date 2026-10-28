.class public final Lio/getstream/chat/android/client/api2/model/requests/UpdateCooldownRequest$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/api2/model/requests/UpdateCooldownRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/requests/UpdateCooldownRequest$Companion;",
        "",
        "<init>",
        "()V",
        "create",
        "Lio/getstream/chat/android/client/api2/model/requests/UpdateCooldownRequest;",
        "cooldownTimeInSeconds",
        "",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/getstream/chat/android/client/api2/model/requests/UpdateCooldownRequest$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(I)Lio/getstream/chat/android/client/api2/model/requests/UpdateCooldownRequest;
    .locals 3

    new-instance v0, Lio/getstream/chat/android/client/api2/model/requests/UpdateCooldownRequest;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance v1, Ll83/k;

    const-string v2, "cooldown"

    invoke-direct {v1, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, p1}, Lio/getstream/chat/android/client/api2/model/requests/UpdateCooldownRequest;-><init>(Ljava/util/Map;)V

    return-object v0
.end method
