.class final Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;-><init>(Ljava/lang/String;ILec3/f2;)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.utils.buffer.StartStopBuffer$1"
    f = "StartStopBuffer.kt"
    l = {
        0x30
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $customTrigger:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

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
.method public constructor <init>(Lec3/f2;Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/f2;",
            "Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer<",
            "TT;>;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1;->$customTrigger:Lec3/f2;

    iput-object p2, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1;->this$0:Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;

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

    new-instance p1, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1;

    iget-object v0, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1;->$customTrigger:Lec3/f2;

    iget-object v1, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1;->this$0:Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;

    invoke-direct {p1, v0, v1, p2}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1;-><init>(Lec3/f2;Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;Lq83/d;)V

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1;->$customTrigger:Lec3/f2;

    if-eqz p1, :cond_2

    new-instance v1, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1$1;

    iget-object v3, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1;->this$0:Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1$1;-><init>(Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;Lq83/d;)V

    iput v2, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1;->label:I

    invoke-static {p1, v1, p0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
