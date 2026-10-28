.class public final Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel$special$$inlined$flatMapLatest$4;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ljava/lang/String;)V
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
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
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
    c = "io.getstream.chat.android.ui.viewmodel.messages.ChannelHeaderViewModel$special$$inlined$flatMapLatest$4"
    f = "ChannelHeaderViewModel.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lio/getstream/chat/android/client/channel/state/ChannelState;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel$special$$inlined$flatMapLatest$4;

    const/4 v1, 0x3

    .line 1
    invoke-direct {v0, v1, p3}, Ls83/i;-><init>(ILq83/d;)V

    .line 2
    iput-object p1, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel$special$$inlined$flatMapLatest$4;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel$special$$inlined$flatMapLatest$4;->L$1:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel$special$$inlined$flatMapLatest$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 3
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel$special$$inlined$flatMapLatest$4;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel$special$$inlined$flatMapLatest$4;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel$special$$inlined$flatMapLatest$4;->L$0:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel$special$$inlined$flatMapLatest$4;->L$0:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel$special$$inlined$flatMapLatest$4;->L$1:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/channel/state/ChannelState;

    invoke-interface {v1}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getMembersCount()Lec3/f2;

    move-result-object v1

    const/4 v3, 0x0

    iput-object v3, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel$special$$inlined$flatMapLatest$4;->L$0:Ljava/lang/Object;

    iput-object v3, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel$special$$inlined$flatMapLatest$4;->L$1:Ljava/lang/Object;

    iput v2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel$special$$inlined$flatMapLatest$4;->label:I

    invoke-static {p1, v1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
