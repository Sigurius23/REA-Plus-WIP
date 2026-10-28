.class public final Lio/getstream/chat/android/client/api/RetrofitCallAdapterFactory$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/api/RetrofitCallAdapterFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/RetrofitCallAdapterFactory$Companion;",
        "",
        "<init>",
        "()V",
        "Lio/getstream/chat/android/client/parser/ChatParser;",
        "chatParser",
        "Lbc3/c0;",
        "coroutineScope",
        "Lio/getstream/chat/android/client/api/RetrofitCallAdapterFactory;",
        "create",
        "(Lio/getstream/chat/android/client/parser/ChatParser;Lbc3/c0;)Lio/getstream/chat/android/client/api/RetrofitCallAdapterFactory;",
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
.method public final create(Lio/getstream/chat/android/client/parser/ChatParser;Lbc3/c0;)Lio/getstream/chat/android/client/api/RetrofitCallAdapterFactory;
    .locals 2

    const-string v0, "chatParser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/api/RetrofitCallAdapterFactory;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lio/getstream/chat/android/client/api/RetrofitCallAdapterFactory;-><init>(Lio/getstream/chat/android/client/parser/ChatParser;Lbc3/c0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
