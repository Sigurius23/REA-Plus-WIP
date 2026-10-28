.class public final Lio/getstream/chat/android/client/notifications/ChatPushDelegateKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/notifications/ChatPushDelegateKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008*\u000c\u0008\u0002\u0010\t\"\u00020\u00052\u00020\u0005\u00a8\u0006\n"
    }
    d2 = {
        "Ly03/a;",
        "Lio/getstream/chat/android/models/Device;",
        "toDevice",
        "(Ly03/a;)Lio/getstream/chat/android/models/Device;",
        "Ly03/b;",
        "Lio/getstream/chat/android/models/PushProvider;",
        "Lio/getstream/chat/android/client/notifications/DevicePushProvider;",
        "toDevicePushProvider",
        "(Ly03/b;)Lio/getstream/chat/android/models/PushProvider;",
        "DevicePushProvider",
        "stream-chat-android-client_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final toDevice(Ly03/a;)Lio/getstream/chat/android/models/Device;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method private static final toDevicePushProvider(Ly03/b;)Lio/getstream/chat/android/models/PushProvider;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/notifications/ChatPushDelegateKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    sget-object p0, Lio/getstream/chat/android/models/PushProvider;->UNKNOWN:Lio/getstream/chat/android/models/PushProvider;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lio/getstream/chat/android/models/PushProvider;->XIAOMI:Lio/getstream/chat/android/models/PushProvider;

    return-object p0

    :cond_2
    sget-object p0, Lio/getstream/chat/android/models/PushProvider;->HUAWEI:Lio/getstream/chat/android/models/PushProvider;

    return-object p0

    :cond_3
    sget-object p0, Lio/getstream/chat/android/models/PushProvider;->FIREBASE:Lio/getstream/chat/android/models/PushProvider;

    return-object p0
.end method
