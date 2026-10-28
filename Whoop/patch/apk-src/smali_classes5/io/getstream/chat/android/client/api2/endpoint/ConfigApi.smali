.class public interface abstract Lio/getstream/chat/android/client/api2/endpoint/ConfigApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/client/api/AuthenticatedApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008a\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0005\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/endpoint/ConfigApi;",
        "",
        "getAppSettings",
        "Lio/getstream/chat/android/client/call/RetrofitCall;",
        "Lio/getstream/chat/android/client/api2/model/response/AppSettingsResponse;",
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
.method public abstract getAppSettings()Lio/getstream/chat/android/client/call/RetrofitCall;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/AppSettingsResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/app"
    .end annotation
.end method
