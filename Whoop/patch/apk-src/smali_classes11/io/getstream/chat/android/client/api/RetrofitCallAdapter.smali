.class public final Lio/getstream/chat/android/client/api/RetrofitCallAdapter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpg3/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lpg3/g;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00040\u0003B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\rJ#\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00042\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0012R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0013R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/RetrofitCallAdapter;",
        "",
        "T",
        "Lpg3/g;",
        "Lo23/d;",
        "Ljava/lang/reflect/Type;",
        "responseType",
        "Lio/getstream/chat/android/client/parser/ChatParser;",
        "parser",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Ljava/lang/reflect/Type;Lio/getstream/chat/android/client/parser/ChatParser;Lbc3/c0;)V",
        "()Ljava/lang/reflect/Type;",
        "Lpg3/e;",
        "call",
        "adapt",
        "(Lpg3/e;)Lo23/d;",
        "Ljava/lang/reflect/Type;",
        "Lio/getstream/chat/android/client/parser/ChatParser;",
        "Lbc3/c0;",
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


# instance fields
.field private final coroutineScope:Lbc3/c0;

.field private final parser:Lio/getstream/chat/android/client/parser/ChatParser;

.field private final responseType:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Type;Lio/getstream/chat/android/client/parser/ChatParser;Lbc3/c0;)V
    .locals 1

    const-string v0, "responseType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api/RetrofitCallAdapter;->responseType:Ljava/lang/reflect/Type;

    iput-object p2, p0, Lio/getstream/chat/android/client/api/RetrofitCallAdapter;->parser:Lio/getstream/chat/android/client/parser/ChatParser;

    iput-object p3, p0, Lio/getstream/chat/android/client/api/RetrofitCallAdapter;->coroutineScope:Lbc3/c0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic adapt(Lpg3/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/api/RetrofitCallAdapter;->adapt(Lpg3/e;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final adapt(Lpg3/e;)Lo23/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpg3/e;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lio/getstream/chat/android/client/call/RetrofitCall;

    iget-object v1, p0, Lio/getstream/chat/android/client/api/RetrofitCallAdapter;->parser:Lio/getstream/chat/android/client/parser/ChatParser;

    iget-object v2, p0, Lio/getstream/chat/android/client/api/RetrofitCallAdapter;->coroutineScope:Lbc3/c0;

    invoke-direct {v0, p1, v1, v2}, Lio/getstream/chat/android/client/call/RetrofitCall;-><init>(Lpg3/e;Lio/getstream/chat/android/client/parser/ChatParser;Lbc3/c0;)V

    return-object v0
.end method

.method public final responseType()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/RetrofitCallAdapter;->responseType:Ljava/lang/reflect/Type;

    return-object v0
.end method
