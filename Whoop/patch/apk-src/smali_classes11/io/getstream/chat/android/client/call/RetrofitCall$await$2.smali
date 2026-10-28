.class final Lio/getstream/chat/android/client/call/RetrofitCall$await$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/call/RetrofitCall;->await(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "T",
        "Ln23/h;",
        "<anonymous>",
        "()Ln23/h;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.call.RetrofitCall$await$2"
    f = "RetrofitCall.kt"
    l = {
        0x39
    }
    m = "invokeSuspend"
.end annotation


# instance fields
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
.method public constructor <init>(Lio/getstream/chat/android/client/call/RetrofitCall;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/call/RetrofitCall<",
            "TT;>;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/call/RetrofitCall$await$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/call/RetrofitCall$await$2;->this$0:Lio/getstream/chat/android/client/call/RetrofitCall;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/call/RetrofitCall$await$2;

    iget-object v1, p0, Lio/getstream/chat/android/client/call/RetrofitCall$await$2;->this$0:Lio/getstream/chat/android/client/call/RetrofitCall;

    invoke-direct {v0, v1, p1}, Lio/getstream/chat/android/client/call/RetrofitCall$await$2;-><init>(Lio/getstream/chat/android/client/call/RetrofitCall;Lq83/d;)V

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/call/RetrofitCall$await$2;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/call/RetrofitCall$await$2;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/call/RetrofitCall$await$2;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/call/RetrofitCall$await$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/call/RetrofitCall$await$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/call/RetrofitCall$await$2;->this$0:Lio/getstream/chat/android/client/call/RetrofitCall;

    invoke-static {p1}, Lio/getstream/chat/android/client/call/RetrofitCall;->access$getCallScope$p(Lio/getstream/chat/android/client/call/RetrofitCall;)Lbc3/c0;

    move-result-object p1

    invoke-interface {p1}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p1

    new-instance v1, Lio/getstream/chat/android/client/call/RetrofitCall$await$2$1;

    iget-object v3, p0, Lio/getstream/chat/android/client/call/RetrofitCall$await$2;->this$0:Lio/getstream/chat/android/client/call/RetrofitCall;

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4}, Lio/getstream/chat/android/client/call/RetrofitCall$await$2$1;-><init>(Lio/getstream/chat/android/client/call/RetrofitCall;Lq83/d;)V

    iput v2, p0, Lio/getstream/chat/android/client/call/RetrofitCall$await$2;->label:I

    invoke-static {p1, v1, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
