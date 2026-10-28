.class final Lio/getstream/chat/android/client/helpers/CallPostponeHelper$postponeCall$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/helpers/CallPostponeHelper;->postponeCall$stream_chat_android_client_release(Lc93/a;)Lo23/d;
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
    c = "io.getstream.chat.android.client.helpers.CallPostponeHelper$postponeCall$1"
    f = "CallPostponeHelper.kt"
    l = {
        0x36,
        0x3a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $call:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/helpers/CallPostponeHelper;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/helpers/CallPostponeHelper;Lc93/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/helpers/CallPostponeHelper;",
            "Lc93/a;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/helpers/CallPostponeHelper$postponeCall$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/helpers/CallPostponeHelper$postponeCall$1;->this$0:Lio/getstream/chat/android/client/helpers/CallPostponeHelper;

    iput-object p2, p0, Lio/getstream/chat/android/client/helpers/CallPostponeHelper$postponeCall$1;->$call:Lc93/a;

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

    new-instance p1, Lio/getstream/chat/android/client/helpers/CallPostponeHelper$postponeCall$1;

    iget-object v0, p0, Lio/getstream/chat/android/client/helpers/CallPostponeHelper$postponeCall$1;->this$0:Lio/getstream/chat/android/client/helpers/CallPostponeHelper;

    iget-object v1, p0, Lio/getstream/chat/android/client/helpers/CallPostponeHelper$postponeCall$1;->$call:Lc93/a;

    invoke-direct {p1, v0, v1, p2}, Lio/getstream/chat/android/client/helpers/CallPostponeHelper$postponeCall$1;-><init>(Lio/getstream/chat/android/client/helpers/CallPostponeHelper;Lc93/a;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/helpers/CallPostponeHelper$postponeCall$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/helpers/CallPostponeHelper$postponeCall$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/helpers/CallPostponeHelper$postponeCall$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/helpers/CallPostponeHelper$postponeCall$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/helpers/CallPostponeHelper$postponeCall$1;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

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
    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object p1, p0, Lio/getstream/chat/android/client/helpers/CallPostponeHelper$postponeCall$1;->this$0:Lio/getstream/chat/android/client/helpers/CallPostponeHelper;

    invoke-static {p1}, Lio/getstream/chat/android/client/helpers/CallPostponeHelper;->access$getLogger(Lio/getstream/chat/android/client/helpers/CallPostponeHelper;)Lb23/k;

    move-result-object p1

    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    iget-object v5, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v1, "[postponeCall] no args"

    invoke-interface {p1, v6, v5, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/client/helpers/CallPostponeHelper$postponeCall$1;->this$0:Lio/getstream/chat/android/client/helpers/CallPostponeHelper;

    invoke-static {p1}, Lio/getstream/chat/android/client/helpers/CallPostponeHelper;->access$getTimeoutInMillis$p(Lio/getstream/chat/android/client/helpers/CallPostponeHelper;)J

    move-result-wide v5

    new-instance p1, Lio/getstream/chat/android/client/helpers/CallPostponeHelper$postponeCall$1$2;

    iget-object v1, p0, Lio/getstream/chat/android/client/helpers/CallPostponeHelper$postponeCall$1;->this$0:Lio/getstream/chat/android/client/helpers/CallPostponeHelper;

    invoke-direct {p1, v1, v2}, Lio/getstream/chat/android/client/helpers/CallPostponeHelper$postponeCall$1$2;-><init>(Lio/getstream/chat/android/client/helpers/CallPostponeHelper;Lq83/d;)V

    iput v4, p0, Lio/getstream/chat/android/client/helpers/CallPostponeHelper$postponeCall$1;->label:I

    invoke-static {v5, v6, p1, p0}, Lbc3/k2;->b(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    iget-object p1, p0, Lio/getstream/chat/android/client/helpers/CallPostponeHelper$postponeCall$1;->this$0:Lio/getstream/chat/android/client/helpers/CallPostponeHelper;

    invoke-static {p1}, Lio/getstream/chat/android/client/helpers/CallPostponeHelper;->access$getLogger(Lio/getstream/chat/android/client/helpers/CallPostponeHelper;)Lb23/k;

    move-result-object p1

    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    iget-object v4, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v1, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v1, "[postponeCall] wait completed"

    invoke-interface {p1, v5, v4, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    iget-object p1, p0, Lio/getstream/chat/android/client/helpers/CallPostponeHelper$postponeCall$1;->$call:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo23/d;

    iput v3, p0, Lio/getstream/chat/android/client/helpers/CallPostponeHelper$postponeCall$1;->label:I

    invoke-interface {p1, p0}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_1
    return-object v0

    :cond_6
    :goto_2
    check-cast p1, Ln23/h;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object p1

    :goto_3
    iget-object v0, p0, Lio/getstream/chat/android/client/helpers/CallPostponeHelper$postponeCall$1;->this$0:Lio/getstream/chat/android/client/helpers/CallPostponeHelper;

    invoke-static {v0}, Lio/getstream/chat/android/client/helpers/CallPostponeHelper;->access$getLogger(Lio/getstream/chat/android/client/helpers/CallPostponeHelper;)Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->F:Lb23/g;

    invoke-interface {v1, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[postponeCall] failed: "

    invoke-static {v1, p1}, Lb9/y;->n(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v4, v3, p1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    new-instance p1, Ln23/f;

    new-instance v0, Ln23/a;

    const-string v1, "Failed to perform call. Waiting for WS connection was too long."

    invoke-direct {v0, v1}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1
.end method
