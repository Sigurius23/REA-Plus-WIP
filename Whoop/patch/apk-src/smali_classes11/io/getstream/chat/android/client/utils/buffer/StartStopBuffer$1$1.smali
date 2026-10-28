.class final Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "active",
        "Ll83/a0;",
        "<anonymous>",
        "(Z)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.utils.buffer.StartStopBuffer$1$1"
    f = "StartStopBuffer.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic Z$0:Z

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer<",
            "TT;>;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1$1;->this$0:Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1$1;->this$0:Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;

    invoke-direct {v0, v1, p2}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1$1;-><init>(Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;Lq83/d;)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1$1;->Z$0:Z

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1$1;->invoke(ZLq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(ZLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-boolean v0, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1$1;->Z$0:Z

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1$1;->label:I

    if-nez v1, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1$1;->this$0:Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->access$getLogger(Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;)Lb23/k;

    move-result-object p1

    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->x:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v1, "<init> active: "

    invoke-static {v1, v0}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {p1, v3, v2, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    if-eqz v0, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1$1;->this$0:Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;

    const-string v0, "init"

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->active(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1$1;->this$0:Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->hold()V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
