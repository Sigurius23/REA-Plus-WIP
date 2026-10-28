.class public final Lio/getstream/chat/android/client/scope/UserScopeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "UserScope",
        "Lio/getstream/chat/android/client/scope/UserScope;",
        "clientScope",
        "Lio/getstream/chat/android/client/scope/ClientScope;",
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
.method public static final UserScope(Lio/getstream/chat/android/client/scope/ClientScope;)Lio/getstream/chat/android/client/scope/UserScope;
    .locals 3

    const-string v0, "clientScope"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/scope/UserScopeImpl;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, v2, v1}, Lio/getstream/chat/android/client/scope/UserScopeImpl;-><init>(Lio/getstream/chat/android/client/scope/ClientScope;Lio/getstream/chat/android/client/scope/user/UserIdentifier;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
