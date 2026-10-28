.class public final Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandlerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "withQueryFormatter",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;",
        "queryFormatter",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;",
        "stream-chat-android-ui-common_release"
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
.method public static final withQueryFormatter(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;)Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queryFormatter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandlerKt$withQueryFormatter$1;

    invoke-direct {v0, p1, p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandlerKt$withQueryFormatter$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;)V

    return-object v0
.end method
