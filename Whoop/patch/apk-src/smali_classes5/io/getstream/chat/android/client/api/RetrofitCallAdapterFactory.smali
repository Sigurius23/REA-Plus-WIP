.class public final Lio/getstream/chat/android/client/api/RetrofitCallAdapterFactory;
.super Lpg3/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/api/RetrofitCallAdapterFactory$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J:\u0010\u0010\u001a\u000c\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\u00082\u000e\u0010\u000c\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/RetrofitCallAdapterFactory;",
        "Lpg3/f;",
        "Lio/getstream/chat/android/client/parser/ChatParser;",
        "chatParser",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lio/getstream/chat/android/client/parser/ChatParser;Lbc3/c0;)V",
        "Ljava/lang/reflect/Type;",
        "returnType",
        "",
        "",
        "annotations",
        "Lpg3/y0;",
        "retrofit",
        "Lpg3/g;",
        "get",
        "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lpg3/y0;)Lpg3/g;",
        "Lio/getstream/chat/android/client/parser/ChatParser;",
        "Lbc3/c0;",
        "Companion",
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
.field public static final Companion:Lio/getstream/chat/android/client/api/RetrofitCallAdapterFactory$Companion;


# instance fields
.field private final chatParser:Lio/getstream/chat/android/client/parser/ChatParser;

.field private final coroutineScope:Lbc3/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/api/RetrofitCallAdapterFactory$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/api/RetrofitCallAdapterFactory;->Companion:Lio/getstream/chat/android/client/api/RetrofitCallAdapterFactory$Companion;

    return-void
.end method

.method private constructor <init>(Lio/getstream/chat/android/client/parser/ChatParser;Lbc3/c0;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/client/api/RetrofitCallAdapterFactory;->chatParser:Lio/getstream/chat/android/client/parser/ChatParser;

    .line 4
    iput-object p2, p0, Lio/getstream/chat/android/client/api/RetrofitCallAdapterFactory;->coroutineScope:Lbc3/c0;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/parser/ChatParser;Lbc3/c0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/api/RetrofitCallAdapterFactory;-><init>(Lio/getstream/chat/android/client/parser/ChatParser;Lbc3/c0;)V

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lpg3/y0;)Lpg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Lpg3/y0;",
            ")",
            "Lpg3/g;"
        }
    .end annotation

    const-string v0, "returnType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "retrofit"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lpg3/e1;->i(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    const-class p3, Lio/getstream/chat/android/client/call/RetrofitCall;

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    instance-of p2, p1, Ljava/lang/reflect/ParameterizedType;

    if-eqz p2, :cond_1

    const/4 p2, 0x0

    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    invoke-static {p2, p1}, Lpg3/e1;->h(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p1

    const-string p2, "getParameterUpperBound(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lio/getstream/chat/android/client/api/RetrofitCallAdapter;

    iget-object p3, p0, Lio/getstream/chat/android/client/api/RetrofitCallAdapterFactory;->chatParser:Lio/getstream/chat/android/client/parser/ChatParser;

    iget-object v0, p0, Lio/getstream/chat/android/client/api/RetrofitCallAdapterFactory;->coroutineScope:Lbc3/c0;

    invoke-direct {p2, p1, p3, v0}, Lio/getstream/chat/android/client/api/RetrofitCallAdapter;-><init>(Ljava/lang/reflect/Type;Lio/getstream/chat/android/client/parser/ChatParser;Lbc3/c0;)V

    return-object p2

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Call return type must be parameterized as Call<Foo>"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
