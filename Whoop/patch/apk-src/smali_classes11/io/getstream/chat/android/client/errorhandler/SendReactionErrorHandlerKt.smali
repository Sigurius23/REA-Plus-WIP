.class public final Lio/getstream/chat/android/client/errorhandler/SendReactionErrorHandlerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aM\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lo23/d;",
        "Lio/getstream/chat/android/models/Reaction;",
        "",
        "Lio/getstream/chat/android/client/errorhandler/SendReactionErrorHandler;",
        "errorHandlers",
        "reaction",
        "",
        "enforceUnique",
        "skipPush",
        "Lio/getstream/chat/android/models/User;",
        "currentUser",
        "onReactionError",
        "(Lo23/d;Ljava/util/List;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;)Lo23/d;",
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
.method public static final onReactionError(Lo23/d;Ljava/util/List;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;)Lo23/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo23/d;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/client/errorhandler/SendReactionErrorHandler;",
            ">;",
            "Lio/getstream/chat/android/models/Reaction;",
            "ZZ",
            "Lio/getstream/chat/android/models/User;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorHandlers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reaction"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentUser"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v1, p0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Lio/getstream/chat/android/client/errorhandler/SendReactionErrorHandler;

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lio/getstream/chat/android/client/errorhandler/SendReactionErrorHandler;->onSendReactionError(Lo23/d;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;)Lo23/q;

    move-result-object v1

    goto :goto_0

    :cond_0
    return-object v1
.end method
