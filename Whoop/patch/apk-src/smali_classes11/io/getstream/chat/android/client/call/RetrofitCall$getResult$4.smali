.class final Lio/getstream/chat/android/client/call/RetrofitCall$getResult$4;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/call/RetrofitCall;->getResult(Lpg3/v0;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "T",
        "Lbc3/c0;",
        "Ln23/h;",
        "<anonymous>",
        "(Lbc3/c0;)Ln23/h;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.call.RetrofitCall$getResult$4"
    f = "RetrofitCall.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $this_getResult:Lpg3/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpg3/v0<",
            "TT;>;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/call/RetrofitCall;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lpg3/v0;Lio/getstream/chat/android/client/call/RetrofitCall;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpg3/v0<",
            "TT;>;",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "TT;>;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/call/RetrofitCall$getResult$4;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$4;->$this_getResult:Lpg3/v0;

    iput-object p2, p0, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$4;->this$0:Lio/getstream/chat/android/client/call/RetrofitCall;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$4;

    iget-object v0, p0, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$4;->$this_getResult:Lpg3/v0;

    iget-object v1, p0, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$4;->this$0:Lio/getstream/chat/android/client/call/RetrofitCall;

    invoke-direct {p1, v0, v1, p2}, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$4;-><init>(Lpg3/v0;Lio/getstream/chat/android/client/call/RetrofitCall;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$4;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$4;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$4;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$4;->label:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$4;->$this_getResult:Lpg3/v0;

    iget-object v0, p1, Lpg3/v0;->a:Lud3/x0;

    iget-boolean v0, v0, Lud3/x0;->Q:Z

    if-eqz v0, :cond_0

    :try_start_0
    new-instance v0, Ln23/g;

    iget-object p1, p1, Lpg3/v0;->b:Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v0, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$4;->this$0:Lio/getstream/chat/android/client/call/RetrofitCall;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/call/RetrofitCall;->access$toFailedResult(Lio/getstream/chat/android/client/call/RetrofitCall;Ljava/lang/Throwable;)Ln23/h;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p1, Lpg3/v0;->c:Lud3/a1;

    if-eqz p1, :cond_1

    new-instance v0, Ln23/f;

    iget-object v1, p0, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$4;->this$0:Lio/getstream/chat/android/client/call/RetrofitCall;

    invoke-static {v1}, Lio/getstream/chat/android/client/call/RetrofitCall;->access$getParser$p(Lio/getstream/chat/android/client/call/RetrofitCall;)Lio/getstream/chat/android/client/parser/ChatParser;

    move-result-object v1

    invoke-interface {v1, p1}, Lio/getstream/chat/android/client/parser/ChatParser;->toError(Lud3/a1;)Ln23/c;

    move-result-object p1

    invoke-direct {v0, p1}, Ln23/f;-><init>(Ln23/e;)V

    return-object v0

    :cond_1
    new-instance p1, Ln23/f;

    iget-object v0, p0, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$4;->this$0:Lio/getstream/chat/android/client/call/RetrofitCall;

    invoke-static {v0}, Lio/getstream/chat/android/client/call/RetrofitCall;->access$getParser$p(Lio/getstream/chat/android/client/call/RetrofitCall;)Lio/getstream/chat/android/client/parser/ChatParser;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$4;->$this_getResult:Lpg3/v0;

    iget-object v1, v1, Lpg3/v0;->a:Lud3/x0;

    invoke-interface {v0, v1}, Lio/getstream/chat/android/client/parser/ChatParser;->toError(Lud3/x0;)Ln23/c;

    move-result-object v0

    invoke-direct {p1, v0}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
