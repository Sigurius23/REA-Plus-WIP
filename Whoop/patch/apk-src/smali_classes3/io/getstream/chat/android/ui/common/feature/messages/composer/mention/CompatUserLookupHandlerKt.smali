.class public final Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandlerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001\u00a8\u0006\u0004"
    }
    d2 = {
        "toUserLookupHandler",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandler;",
        "toJavaCompatUserLookupHandler",
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
.method public static synthetic a(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lou1/a;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandlerKt;->toJavaCompatUserLookupHandler$lambda$1(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lc93/a;

    move-result-object p0

    check-cast p0, Lou1/a;

    return-object p0
.end method

.method public static final toJavaCompatUserLookupHandler(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;)Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandler;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhn/p;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method private static final toJavaCompatUserLookupHandler$lambda$1(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lc93/a;
    .locals 2

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandlerKt$toJavaCompatUserLookupHandler$1$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandlerKt$toJavaCompatUserLookupHandler$1$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-static {v0}, Lbc3/f0;->F(Lc93/m;)Ljava/lang/Object;

    new-instance p0, Lou1/a;

    const/4 p1, 0x7

    invoke-direct {p0, p1}, Lou1/a;-><init>(I)V

    return-object p0
.end method

.method private static final toJavaCompatUserLookupHandler$lambda$1$lambda$0()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static final toUserLookupHandler(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandler;)Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandlerKt$toUserLookupHandler$1;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandlerKt$toUserLookupHandler$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandler;)V

    return-object v0
.end method
