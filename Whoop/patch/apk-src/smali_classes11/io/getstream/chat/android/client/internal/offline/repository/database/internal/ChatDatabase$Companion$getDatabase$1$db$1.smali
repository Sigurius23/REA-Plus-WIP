.class public final Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase$Companion$getDatabase$1$db$1;
.super Landroidx/room/q0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase$Companion;->getDatabase(Landroid/content/Context;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "io/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase$Companion$getDatabase$1$db$1",
        "Landroidx/room/q0;",
        "Lub/a;",
        "db",
        "Ll83/a0;",
        "onOpen",
        "(Lub/a;)V",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onOpen(Lub/a;)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "PRAGMA synchronous = 1"

    invoke-interface {p1, v0}, Lub/a;->E(Ljava/lang/String;)V

    return-void
.end method
