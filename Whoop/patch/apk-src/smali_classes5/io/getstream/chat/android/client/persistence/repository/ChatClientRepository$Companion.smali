.class public final Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository;
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
        "Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository$Companion;",
        "",
        "<init>",
        "()V",
        "from",
        "Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository;",
        "database",
        "Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase;",
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
.method public final from(Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase;)Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository;
    .locals 2

    const-string v0, "database"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository;

    sget-object v1, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;->Companion:Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository$Companion;

    invoke-virtual {v1, p1}, Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository$Companion;->invoke(Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase;)Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;

    move-result-object p1

    invoke-direct {v0, p1}, Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository;-><init>(Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;)V

    return-object v0
.end method
