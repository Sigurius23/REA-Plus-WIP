.class public interface abstract Lio/getstream/chat/android/client/api2/endpoint/DeviceApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/client/api/AuthenticatedApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008a\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0018\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0008H\'J\u0018\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032\u0008\u0008\u0001\u0010\n\u001a\u00020\u000bH\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u000c\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/endpoint/DeviceApi;",
        "",
        "getDevices",
        "Lio/getstream/chat/android/client/call/RetrofitCall;",
        "Lio/getstream/chat/android/client/api2/model/response/DevicesResponse;",
        "addDevices",
        "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;",
        "request",
        "Lio/getstream/chat/android/client/api2/model/requests/AddDeviceRequest;",
        "deleteDevice",
        "id",
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


# virtual methods
.method public abstract addDevices(Lio/getstream/chat/android/client/api2/model/requests/AddDeviceRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Lio/getstream/chat/android/client/api2/model/requests/AddDeviceRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api2/model/requests/AddDeviceRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/devices"
    .end annotation
.end method

.method public abstract deleteDevice(Ljava/lang/String;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "/devices"
    .end annotation
.end method

.method public abstract getDevices()Lio/getstream/chat/android/client/call/RetrofitCall;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/DevicesResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/devices"
    .end annotation
.end method
