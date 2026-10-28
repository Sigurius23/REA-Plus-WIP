.class public interface abstract Lio/getstream/chat/android/client/api2/endpoint/MessageApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/client/api/AuthenticatedApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008a\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0008\u001a\u00020\tH\'J,\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0008\u001a\u00020\tH\'J.\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00032\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00062\n\u0008\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\'J\u0018\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00032\u0008\u0008\u0001\u0010\u0011\u001a\u00020\u0012H\'J\u0018\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00032\u0008\u0008\u0001\u0010\u0014\u001a\u00020\u0015H\'J\u0018\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u0006H\'J\"\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0019H\'J\"\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0014\u001a\u00020\u001bH\'J5\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u00062\n\u0008\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\u0008\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\'\u00a2\u0006\u0002\u0010 J\"\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0011\u001a\u00020\"H\'J\"\u0010#\u001a\u0008\u0012\u0004\u0012\u00020$0\u00032\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0011\u001a\u00020%H\'J\"\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u00062\u0008\u0008\u0001\u0010\'\u001a\u00020\u0006H\'J,\u0010(\u001a\u0008\u0012\u0004\u0012\u00020)0\u00032\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u00062\u0008\u0008\u0001\u0010*\u001a\u00020+2\u0008\u0008\u0001\u0010,\u001a\u00020+H\'J\"\u0010-\u001a\u0008\u0012\u0004\u0012\u00020.0\u00032\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0014\u001a\u00020/H\'J\"\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0011\u001a\u000201H\'J\"\u00102\u001a\u0008\u0012\u0004\u0012\u0002030\u00032\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u00062\u0008\u0008\u0001\u0010,\u001a\u00020+H\'J.\u00104\u001a\u0008\u0012\u0004\u0012\u0002030\u00032\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u00062\u0008\u0008\u0001\u0010,\u001a\u00020+2\n\u0008\u0001\u00105\u001a\u0004\u0018\u00010\u0006H\'J,\u00106\u001a\u0008\u0012\u0004\u0012\u0002030\u00032\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u00062\u0008\u0008\u0001\u0010,\u001a\u00020+2\u0008\u0008\u0001\u00107\u001a\u00020\u0006H\'\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u00068\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/endpoint/MessageApi;",
        "",
        "sendMessage",
        "Lio/getstream/chat/android/client/call/RetrofitCall;",
        "Lio/getstream/chat/android/client/api2/model/response/MessageResponse;",
        "channelType",
        "",
        "channelId",
        "message",
        "Lio/getstream/chat/android/client/api2/model/requests/SendMessageRequest;",
        "createDraftMessage",
        "Lio/getstream/chat/android/client/api2/model/response/DraftMessageResponse;",
        "deleteDraftMessage",
        "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;",
        "parentId",
        "queryDraftMessages",
        "Lio/getstream/chat/android/client/api2/model/response/QueryDraftMessagesResponse;",
        "request",
        "Lio/getstream/chat/android/client/api2/model/requests/QueryDraftMessagesRequest;",
        "queryDrafts",
        "body",
        "Lio/getstream/chat/android/client/api2/model/requests/QueryDraftsRequest;",
        "getMessage",
        "messageId",
        "updateMessage",
        "Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;",
        "partialUpdateMessage",
        "Lio/getstream/chat/android/client/api2/model/requests/PartialUpdateMessageRequest;",
        "deleteMessage",
        "hard",
        "",
        "deleteForMe",
        "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lio/getstream/chat/android/client/call/RetrofitCall;",
        "sendAction",
        "Lio/getstream/chat/android/client/api2/model/requests/SendActionRequest;",
        "sendReaction",
        "Lio/getstream/chat/android/client/api2/model/response/ReactionResponse;",
        "Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;",
        "deleteReaction",
        "reactionType",
        "getReactions",
        "Lio/getstream/chat/android/client/api2/model/response/ReactionsResponse;",
        "offset",
        "",
        "limit",
        "queryReactions",
        "Lio/getstream/chat/android/client/api2/model/response/QueryReactionsResponse;",
        "Lio/getstream/chat/android/client/api2/model/requests/QueryReactionsRequest;",
        "translate",
        "Lio/getstream/chat/android/client/api2/model/response/TranslateMessageRequest;",
        "getReplies",
        "Lio/getstream/chat/android/client/api2/model/response/MessagesResponse;",
        "getNewerReplies",
        "lastId",
        "getRepliesMore",
        "firstId",
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
.method public abstract createDraftMessage(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/SendMessageRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p3    # Lio/getstream/chat/android/client/api2/model/requests/SendMessageRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/SendMessageRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/DraftMessageResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/channels/{type}/{id}/draft"
    .end annotation
.end method

.method public abstract deleteDraftMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "parent_id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "/channels/{type}/{id}/draft"
    .end annotation
.end method

.method public abstract deleteMessage(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Boolean;
        .annotation runtime Lwg3/t;
            value = "hard"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Boolean;
        .annotation runtime Lwg3/t;
            value = "delete_for_me"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/MessageResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "/messages/{id}"
    .end annotation
.end method

.method public abstract deleteReaction(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "type"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/MessageResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "/messages/{id}/reaction/{type}"
    .end annotation
.end method

.method public abstract getMessage(Ljava/lang/String;)Lio/getstream/chat/android/client/call/RetrofitCall;
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
            "Lio/getstream/chat/android/client/api2/model/response/MessageResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/messages/{id}"
    .end annotation
.end method

.method public abstract getNewerReplies(Ljava/lang/String;ILjava/lang/String;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "parent_id"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "id_gt"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/MessagesResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/messages/{parent_id}/replies?sort=[{\"field\":\"created_at\",\"direction\":1}]"
    .end annotation
.end method

.method public abstract getReactions(Ljava/lang/String;II)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lwg3/t;
            value = "offset"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II)",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/ReactionsResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/messages/{id}/reactions"
    .end annotation
.end method

.method public abstract getReplies(Ljava/lang/String;I)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "parent_id"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/MessagesResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/messages/{parent_id}/replies"
    .end annotation
.end method

.method public abstract getRepliesMore(Ljava/lang/String;ILjava/lang/String;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "parent_id"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "id_lt"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/MessagesResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/messages/{parent_id}/replies"
    .end annotation
.end method

.method public abstract partialUpdateMessage(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/PartialUpdateMessageRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p2    # Lio/getstream/chat/android/client/api2/model/requests/PartialUpdateMessageRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/PartialUpdateMessageRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/MessageResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "/messages/{id}"
    .end annotation
.end method

.method public abstract queryDraftMessages(Lio/getstream/chat/android/client/api2/model/requests/QueryDraftMessagesRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Lio/getstream/chat/android/client/api2/model/requests/QueryDraftMessagesRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api2/model/requests/QueryDraftMessagesRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/QueryDraftMessagesResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/drafts/query"
    .end annotation
.end method

.method public abstract queryDrafts(Lio/getstream/chat/android/client/api2/model/requests/QueryDraftsRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Lio/getstream/chat/android/client/api2/model/requests/QueryDraftsRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api2/model/requests/QueryDraftsRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/QueryDraftMessagesResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/drafts/query"
    .end annotation
.end method

.method public abstract queryReactions(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/QueryReactionsRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p2    # Lio/getstream/chat/android/client/api2/model/requests/QueryReactionsRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/QueryReactionsRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/QueryReactionsResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/messages/{id}/reactions"
    .end annotation
.end method

.method public abstract sendAction(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/SendActionRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p2    # Lio/getstream/chat/android/client/api2/model/requests/SendActionRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/SendActionRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/MessageResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/messages/{id}/action"
    .end annotation
.end method

.method public abstract sendMessage(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/SendMessageRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p3    # Lio/getstream/chat/android/client/api2/model/requests/SendMessageRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/SendMessageRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/MessageResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/channels/{type}/{id}/message"
    .end annotation
.end method

.method public abstract sendReaction(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p2    # Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/ReactionResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/messages/{id}/reaction"
    .end annotation
.end method

.method public abstract translate(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/response/TranslateMessageRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "messageId"
        .end annotation
    .end param
    .param p2    # Lio/getstream/chat/android/client/api2/model/response/TranslateMessageRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/response/TranslateMessageRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/MessageResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/messages/{messageId}/translate"
    .end annotation
.end method

.method public abstract updateMessage(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;)Lio/getstream/chat/android/client/call/RetrofitCall;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p2    # Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;",
            ")",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "Lio/getstream/chat/android/client/api2/model/response/MessageResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/messages/{id}"
    .end annotation
.end method
