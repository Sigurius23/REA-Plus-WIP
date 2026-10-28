.class public interface abstract Lio/getstream/chat/android/client/api2/endpoint/RemindersApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/client/api/AuthenticatedApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008a\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006H\'J\"\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00032\u0008\u0008\u0001\u0010\t\u001a\u00020\n2\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u000bH\'J\"\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00032\u0008\u0008\u0001\u0010\t\u001a\u00020\n2\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u000bH\'J\u0018\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00032\u0008\u0008\u0001\u0010\t\u001a\u00020\nH\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u000f\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/endpoint/RemindersApi;",
        "",
        "queryReminders",
        "Lio/getstream/chat/android/client/call/RetrofitCall;",
        "Lio/getstream/chat/android/client/api2/model/response/QueryRemindersResponse;",
        "body",
        "Lio/getstream/chat/android/client/api2/model/requests/QueryRemindersRequest;",
        "createReminder",
        "Lio/getstream/chat/android/client/api2/model/response/ReminderResponse;",
        "messageId",
        "",
        "Lio/getstream/chat/android/client/api2/model/requests/ReminderRequest;",
        "updateReminder",
        "deleteReminder",
        "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;",
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
.method public abstract createReminder(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/ReminderRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p2    # Lio/getstream/chat/android/client/api2/model/requests/ReminderRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/ReminderRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/ReminderResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/messages/{id}/reminders"
    .end annotation
.end method

.method public abstract deleteReminder(Ljava/lang/String;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
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
        value = "/messages/{id}/reminders"
    .end annotation
.end method

.method public abstract queryReminders(Lio/getstream/chat/android/client/api2/model/requests/QueryRemindersRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Lio/getstream/chat/android/client/api2/model/requests/QueryRemindersRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api2/model/requests/QueryRemindersRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/QueryRemindersResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/reminders/query"
    .end annotation
.end method

.method public abstract updateReminder(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/ReminderRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p2    # Lio/getstream/chat/android/client/api2/model/requests/ReminderRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/ReminderRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/ReminderResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/n;
        value = "/messages/{id}/reminders"
    .end annotation
.end method
