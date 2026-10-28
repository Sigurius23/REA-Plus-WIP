.class public final Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase$Companion;",
        "",
        "<init>",
        "()V",
        "build",
        "Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase;",
        "context",
        "Landroid/content/Context;",
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
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final build(Landroid/content/Context;)Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "getApplicationContext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase;

    const-string v1, "stream_chat_client.db"

    invoke-static {p1, v0, v1}, Ljc/x;->C(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Landroidx/room/p0;

    move-result-object p1

    const/4 v0, 0x0

    iput-boolean v0, p1, Landroidx/room/p0;->p:Z

    const/4 v0, 0x1

    iput-boolean v0, p1, Landroidx/room/p0;->q:Z

    new-instance v0, Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase$Companion$build$1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p1, Landroidx/room/p0;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Landroidx/room/p0;->b()Landroidx/room/z0;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase;

    return-object p1
.end method
