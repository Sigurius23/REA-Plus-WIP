.class final Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$3;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


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
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\u0008\u0000\u0010\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n"
    }
    d2 = {
        "T",
        "Ll83/k;",
        "",
        "",
        "it",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.api.state.ChatClientExtensions$getStateOrNull$3"
    f = "ChatClientStateExtensions.kt"
    l = {
        0x111
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $producer:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field Z$0:Z

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$3;->$producer:Lkotlin/jvm/functions/Function1;

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

    new-instance v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$3;

    iget-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$3;->$producer:Lkotlin/jvm/functions/Function1;

    invoke-direct {v0, v1, p2}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$3;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$3;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ll83/k;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$3;->invoke(Ll83/k;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ll83/k;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/k;",
            "Lq83/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$3;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$3;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$3;->L$0:Ljava/lang/Object;

    check-cast v0, Ll83/k;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$3;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$3;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz p1, :cond_4

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$3;->$producer:Lkotlin/jvm/functions/Function1;

    iput-object v2, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$3;->L$0:Ljava/lang/Object;

    iput-object v2, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$3;->L$1:Ljava/lang/Object;

    iput-boolean v0, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$3;->Z$0:Z

    iput v3, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$getStateOrNull$3;->label:I

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1

    :cond_4
    :goto_0
    return-object v2
.end method
