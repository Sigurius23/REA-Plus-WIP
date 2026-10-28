.class public final Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\r\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\n\u0010\u0003R*\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048\u0006@@X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R*\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048\u0006@@X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\r\u001a\u0004\u0008\u0013\u0010\u000f\"\u0004\u0008\u0014\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u000f\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;",
        "",
        "<init>",
        "()V",
        "Lbc3/z;",
        "mainDispatcher",
        "ioDispatcher",
        "Ll83/a0;",
        "set",
        "(Lbc3/z;Lbc3/z;)V",
        "reset",
        "value",
        "Main",
        "Lbc3/z;",
        "getMain",
        "()Lbc3/z;",
        "setMain$stream_chat_android_core",
        "(Lbc3/z;)V",
        "IO",
        "getIO",
        "setIO$stream_chat_android_core",
        "getImmediate",
        "Immediate",
        "stream-chat-android-core"
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
.field public static final INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

.field private static IO:Lbc3/z;

.field private static Main:Lbc3/z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    sput-object v0, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->Main:Lbc3/z;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    sput-object v0, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->IO:Lbc3/z;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getIO()Lbc3/z;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->IO:Lbc3/z;

    return-object v0
.end method

.method public final getImmediate()Lbc3/z;
    .locals 2

    sget-object v0, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->Main:Lbc3/z;

    instance-of v1, v0, Lbc3/w1;

    if-eqz v1, :cond_0

    check-cast v0, Lbc3/w1;

    invoke-virtual {v0}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final getMain()Lbc3/z;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->Main:Lbc3/z;

    return-object v0
.end method

.method public final reset()V
    .locals 1

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    sput-object v0, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->Main:Lbc3/z;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    sput-object v0, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->IO:Lbc3/z;

    return-void
.end method

.method public final set(Lbc3/z;Lbc3/z;)V
    .locals 1

    const-string v0, "mainDispatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ioDispatcher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->Main:Lbc3/z;

    sput-object p2, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->IO:Lbc3/z;

    return-void
.end method

.method public final setIO$stream_chat_android_core(Lbc3/z;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->IO:Lbc3/z;

    return-void
.end method

.method public final setMain$stream_chat_android_core(Lbc3/z;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->Main:Lbc3/z;

    return-void
.end method
