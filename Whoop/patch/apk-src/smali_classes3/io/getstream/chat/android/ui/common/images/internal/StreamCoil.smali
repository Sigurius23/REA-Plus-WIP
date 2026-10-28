.class public final Lio/getstream/chat/android/ui/common/images/internal/StreamCoil;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0008R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0019\u0010\u0016\u001a\u00020\u0006*\u00020\u00048\u00c0\u0002X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0008\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/images/internal/StreamCoil;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Lrh/n;",
        "newImageLoader",
        "(Landroid/content/Context;)Lrh/n;",
        "Lrh/u;",
        "newImageLoaderFactory",
        "()Lrh/u;",
        "factory",
        "Ll83/a0;",
        "setImageLoader",
        "(Lrh/u;)V",
        "imageLoader$stream_chat_android_ui_common_release",
        "imageLoader",
        "Lrh/n;",
        "imageLoaderFactory",
        "Lrh/u;",
        "getStreamImageLoader$stream_chat_android_ui_common_release",
        "streamImageLoader",
        "stream-chat-android-ui-common_release"
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
.field public static final $stable:I = 0x8

.field public static final INSTANCE:Lio/getstream/chat/android/ui/common/images/internal/StreamCoil;

.field private static imageLoader:Lrh/n;

.field private static imageLoaderFactory:Lrh/u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/images/internal/StreamCoil;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/images/internal/StreamCoil;->INSTANCE:Lio/getstream/chat/android/ui/common/images/internal/StreamCoil;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final declared-synchronized newImageLoader(Landroid/content/Context;)Lrh/n;
    .locals 1

    monitor-enter p0

    :try_start_0
    sget-object v0, Lio/getstream/chat/android/ui/common/images/internal/StreamCoil;->imageLoader:Lrh/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    sget-object v0, Lio/getstream/chat/android/ui/common/images/internal/StreamCoil;->imageLoaderFactory:Lrh/u;

    if-nez v0, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/images/internal/StreamCoil;->newImageLoaderFactory()Lrh/u;

    move-result-object v0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {v0, p1}, Lrh/u;->newImageLoader(Landroid/content/Context;)Lrh/n;

    move-result-object p1

    sput-object p1, Lio/getstream/chat/android/ui/common/images/internal/StreamCoil;->imageLoader:Lrh/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method private final newImageLoaderFactory()Lrh/u;
    .locals 4

    new-instance v0, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor;-><init>(Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;

    const/4 v3, 0x2

    invoke-direct {v1, v0, v2, v3, v2}, Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lio/getstream/chat/android/ui/common/images/internal/StreamCoil;->imageLoaderFactory:Lrh/u;

    return-object v1
.end method


# virtual methods
.method public final getStreamImageLoader$stream_chat_android_ui_common_release(Landroid/content/Context;)Lrh/n;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/common/images/internal/StreamCoil;->imageLoader$stream_chat_android_ui_common_release(Landroid/content/Context;)Lrh/n;

    move-result-object p1

    return-object p1
.end method

.method public final imageLoader$stream_chat_android_ui_common_release(Landroid/content/Context;)Lrh/n;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/common/images/internal/StreamCoil;->imageLoader:Lrh/n;

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/images/internal/StreamCoil;->newImageLoader(Landroid/content/Context;)Lrh/n;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final declared-synchronized setImageLoader(Lrh/u;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "factory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lio/getstream/chat/android/ui/common/images/internal/StreamCoil;->imageLoaderFactory:Lrh/u;

    const/4 p1, 0x0

    sput-object p1, Lio/getstream/chat/android/ui/common/images/internal/StreamCoil;->imageLoader:Lrh/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
