.class final Lio/getstream/chat/android/client/call/RetrofitCall$getResult$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/call/RetrofitCall;->getResult(Lpg3/e;Lq83/d;)Ljava/lang/Object;
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
    c = "io.getstream.chat.android.client.call.RetrofitCall$getResult$2"
    f = "RetrofitCall.kt"
    l = {
        0x55,
        0x55
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $this_getResult:Lpg3/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpg3/e;"
        }
    .end annotation
.end field

.field L$0:Ljava/lang/Object;

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
.method public constructor <init>(Lio/getstream/chat/android/client/call/RetrofitCall;Lpg3/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "TT;>;",
            "Lpg3/e;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/call/RetrofitCall$getResult$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$2;->this$0:Lio/getstream/chat/android/client/call/RetrofitCall;

    iput-object p2, p0, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$2;->$this_getResult:Lpg3/e;

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

    new-instance p1, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$2;

    iget-object v0, p0, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$2;->this$0:Lio/getstream/chat/android/client/call/RetrofitCall;

    iget-object v1, p0, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$2;->$this_getResult:Lpg3/e;

    invoke-direct {p1, v0, v1, p2}, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$2;-><init>(Lio/getstream/chat/android/client/call/RetrofitCall;Lpg3/e;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$2;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$2;->L$0:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/call/RetrofitCall;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object v1, p0, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$2;->this$0:Lio/getstream/chat/android/client/call/RetrofitCall;

    iget-object p1, p0, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$2;->$this_getResult:Lpg3/e;

    iput-object v1, p0, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$2;->L$0:Ljava/lang/Object;

    iput v3, p0, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$2;->label:I

    invoke-static {p1, p0}, Lpg3/e1;->d(Lpg3/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lpg3/v0;

    const/4 v3, 0x0

    iput-object v3, p0, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$2;->L$0:Ljava/lang/Object;

    iput v2, p0, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$2;->label:I

    invoke-static {v1, p1, p0}, Lio/getstream/chat/android/client/call/RetrofitCall;->access$getResult(Lio/getstream/chat/android/client/call/RetrofitCall;Lpg3/v0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    check-cast p1, Ln23/h;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object p1

    :goto_3
    iget-object v0, p0, Lio/getstream/chat/android/client/call/RetrofitCall$getResult$2;->this$0:Lio/getstream/chat/android/client/call/RetrofitCall;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/call/RetrofitCall;->access$toFailedResult(Lio/getstream/chat/android/client/call/RetrofitCall;Ljava/lang/Throwable;)Ln23/h;

    move-result-object p1

    return-object p1
.end method
