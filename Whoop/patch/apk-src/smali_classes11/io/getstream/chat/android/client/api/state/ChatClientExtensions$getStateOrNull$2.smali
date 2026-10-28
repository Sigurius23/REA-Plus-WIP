.class final Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->getStateOrNull(Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;Lkotlin/jvm/functions/Function1;)Lec3/f2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lio/getstream/chat/android/models/InitializationState;",
        "initializationState",
        "",
        "userId",
        "Ll83/k;",
        "",
        "<anonymous>",
        "(Lio/getstream/chat/android/models/InitializationState;Ljava/lang/String;)Ll83/k;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.api.state.ChatClientExtensions$getStateOrNull$2"
    f = "ChatClientStateExtensions.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$2;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lio/getstream/chat/android/models/InitializationState;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/InitializationState;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/k;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$2;

    const/4 v1, 0x3

    .line 1
    invoke-direct {v0, v1, p3}, Ls83/i;-><init>(ILq83/d;)V

    .line 2
    iput-object p1, v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$2;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$2;->L$1:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 3
    check-cast p1, Lio/getstream/chat/android/models/InitializationState;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$2;->invoke(Lio/getstream/chat/android/models/InitializationState;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/InitializationState;

    iget-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$2;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$2;->label:I

    if-nez v2, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lio/getstream/chat/android/models/InitializationState;->COMPLETE:Lio/getstream/chat/android/models/InitializationState;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    new-instance v0, Ll83/k;

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
