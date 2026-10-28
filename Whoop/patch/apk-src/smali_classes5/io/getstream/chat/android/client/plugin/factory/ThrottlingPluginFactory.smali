.class public final Lio/getstream/chat/android/client/plugin/factory/ThrottlingPluginFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/factory/PluginFactory;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lio/getstream/chat/android/client/plugin/factory/ThrottlingPluginFactory;",
        "Lio/getstream/chat/android/client/plugin/factory/PluginFactory;",
        "<init>",
        "()V",
        "get",
        "Lio/getstream/chat/android/client/plugin/Plugin;",
        "user",
        "Lio/getstream/chat/android/models/User;",
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


# static fields
.field public static final INSTANCE:Lio/getstream/chat/android/client/plugin/factory/ThrottlingPluginFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/plugin/factory/ThrottlingPluginFactory;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/plugin/factory/ThrottlingPluginFactory;->INSTANCE:Lio/getstream/chat/android/client/plugin/factory/ThrottlingPluginFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/plugin/Plugin;
    .locals 2

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lio/getstream/chat/android/client/plugin/ThrottlingPlugin;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1, v0}, Lio/getstream/chat/android/client/plugin/ThrottlingPlugin;-><init>(Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method
