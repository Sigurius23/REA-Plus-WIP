.class public final Lio/getstream/chat/android/client/cdn/internal/StreamMediaDataSource;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/getstream/chat/android/client/cdn/internal/StreamMediaDataSource;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Lio/getstream/chat/android/client/cdn/CDN;",
        "cdn",
        "Lz8/e;",
        "factory",
        "(Landroid/content/Context;Lio/getstream/chat/android/client/cdn/CDN;)Lz8/e;",
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
.field public static final INSTANCE:Lio/getstream/chat/android/client/cdn/internal/StreamMediaDataSource;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/cdn/internal/StreamMediaDataSource;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/cdn/internal/StreamMediaDataSource;->INSTANCE:Lio/getstream/chat/android/client/cdn/internal/StreamMediaDataSource;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final factory(Landroid/content/Context;Lio/getstream/chat/android/client/cdn/CDN;)Lz8/e;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpg3/o;

    const/16 v1, 0xa

    invoke-direct {v0, p1, v1}, Lpg3/o;-><init>(Landroid/content/Context;I)V

    if-eqz p2, :cond_0

    new-instance p1, Lio/getstream/chat/android/client/cdn/internal/CDNDataSourceFactory;

    invoke-direct {p1, p2, v0}, Lio/getstream/chat/android/client/cdn/internal/CDNDataSourceFactory;-><init>(Lio/getstream/chat/android/client/cdn/CDN;Lz8/e;)V

    return-object p1

    :cond_0
    return-object v0
.end method
