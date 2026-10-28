.class public final Lio/getstream/chat/android/client/errorhandler/DeleteReactionErrorHandlerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u001a?\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lo23/d;",
        "Lio/getstream/chat/android/models/Message;",
        "",
        "Lio/getstream/chat/android/client/errorhandler/DeleteReactionErrorHandler;",
        "errorHandlers",
        "",
        "cid",
        "messageId",
        "onMessageError",
        "(Lo23/d;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lo23/d;",
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
.method public static final onMessageError(Lo23/d;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo23/d;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/client/errorhandler/DeleteReactionErrorHandler;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorHandlers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/errorhandler/DeleteReactionErrorHandler;

    invoke-interface {v0, p0, p2, p3}, Lio/getstream/chat/android/client/errorhandler/DeleteReactionErrorHandler;->onDeleteReactionError(Lo23/d;Ljava/lang/String;Ljava/lang/String;)Lo23/q;

    move-result-object p0

    goto :goto_0

    :cond_0
    return-object p0
.end method
