.class public final Lio/getstream/chat/android/client/scope/ClientScopeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0008\u0010\u0000\u001a\u00020\u0001H\u0000\u00a8\u0006\u0002"
    }
    d2 = {
        "ClientScope",
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
.method public static final ClientScope()Lio/getstream/chat/android/client/scope/ClientScope;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/scope/ClientScopeImpl;

    invoke-direct {v0}, Lio/getstream/chat/android/client/scope/ClientScopeImpl;-><init>()V

    return-object v0
.end method
