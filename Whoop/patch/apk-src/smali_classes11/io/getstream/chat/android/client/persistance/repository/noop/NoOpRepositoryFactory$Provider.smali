.class public final Lio/getstream/chat/android/client/persistance/repository/noop/NoOpRepositoryFactory$Provider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory$Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/persistance/repository/noop/NoOpRepositoryFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Provider"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lio/getstream/chat/android/client/persistance/repository/noop/NoOpRepositoryFactory$Provider;",
        "Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory$Provider;",
        "<init>",
        "()V",
        "createRepositoryFactory",
        "Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;",
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
.field public static final INSTANCE:Lio/getstream/chat/android/client/persistance/repository/noop/NoOpRepositoryFactory$Provider;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/persistance/repository/noop/NoOpRepositoryFactory$Provider;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/persistance/repository/noop/NoOpRepositoryFactory$Provider;->INSTANCE:Lio/getstream/chat/android/client/persistance/repository/noop/NoOpRepositoryFactory$Provider;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createRepositoryFactory(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lio/getstream/chat/android/client/persistance/repository/noop/NoOpRepositoryFactory;->INSTANCE:Lio/getstream/chat/android/client/persistance/repository/noop/NoOpRepositoryFactory;

    return-object p1
.end method
