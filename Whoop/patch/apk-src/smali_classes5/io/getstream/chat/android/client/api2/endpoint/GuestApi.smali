.class public interface abstract Lio/getstream/chat/android/client/api2/endpoint/GuestApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/client/api/AnonymousApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008a\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0007\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/endpoint/GuestApi;",
        "",
        "getGuestUser",
        "Lio/getstream/chat/android/client/call/RetrofitCall;",
        "Lio/getstream/chat/android/client/api2/model/response/TokenResponse;",
        "body",
        "Lio/getstream/chat/android/client/api2/model/requests/GuestUserRequest;",
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
.method public abstract getGuestUser(Lio/getstream/chat/android/client/api2/model/requests/GuestUserRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Lio/getstream/chat/android/client/api2/model/requests/GuestUserRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api2/model/requests/GuestUserRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/TokenResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/guest"
    .end annotation
.end method
