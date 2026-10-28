.class public final Lio/getstream/chat/android/client/api2/model/requests/GuestUserRequest$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/api2/model/requests/GuestUserRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/requests/GuestUserRequest$Companion;",
        "",
        "<init>",
        "()V",
        "create",
        "Lio/getstream/chat/android/client/api2/model/requests/GuestUserRequest;",
        "id",
        "",
        "name",
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
    invoke-direct {p0}, Lio/getstream/chat/android/client/api2/model/requests/GuestUserRequest$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/api2/model/requests/GuestUserRequest;
    .locals 2

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/api2/model/requests/GuestUserRequest;

    new-instance v1, Lio/getstream/chat/android/client/api2/model/requests/GuestUserRequest$GuestUser;

    invoke-direct {v1, p1, p2}, Lio/getstream/chat/android/client/api2/model/requests/GuestUserRequest$GuestUser;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/api2/model/requests/GuestUserRequest;-><init>(Lio/getstream/chat/android/client/api2/model/requests/GuestUserRequest$GuestUser;)V

    return-object v0
.end method
