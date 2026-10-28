.class public final Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $this_unsafeFlow:Lec3/m;

.field final synthetic this$0:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;


# direct methods
.method public constructor <init>(Lec3/m;Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1$2;->$this_unsafeFlow:Lec3/m;

    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1$2;->this$0:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1$2$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1$2$1;

    iget v1, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1$2$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1$2$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1$2$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1$2$1;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1$2;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1$2$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1$2$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1$2$1;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1$2;->$this_unsafeFlow:Lec3/m;

    check-cast p1, Ll83/k;

    iget-object v2, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoading()Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_3

    sget-object p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State$Loading;->INSTANCE:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State$Loading;

    goto :goto_2

    :cond_3
    new-instance v2, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State$Result;

    iget-object v5, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    instance-of p1, p1, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    iget-object v6, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1$2;->this$0:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v6}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->access$getStateMerger$p(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;)Landroidx/lifecycle/t0;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State;

    if-eqz v6, :cond_4

    iget-object v7, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1$2;->this$0:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v7, v6}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->access$asResultOrNull(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State$Result;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State$Result;->getMessageListItem()Lio/getstream/chat/android/ui/model/MessageListItemWrapper;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/model/MessageListItemWrapper;->getNewMessageState$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;

    move-result-object v6

    goto :goto_1

    :cond_4
    move-object v6, v4

    :goto_1
    invoke-static {v5, p1, v6}, Lio/getstream/chat/android/ui/utils/extensions/MessageListStateKt;->toMessageListItemWrapper(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;ZLio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;)Lio/getstream/chat/android/ui/model/MessageListItemWrapper;

    move-result-object p1

    invoke-direct {v2, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State$Result;-><init>(Lio/getstream/chat/android/ui/model/MessageListItemWrapper;)V

    move-object p1, v2

    :goto_2
    iput-object v4, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1$2$1;->L$0:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1$2$1;->L$2:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1$2$1;->I$0:I

    iput v3, v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1$2$1;->label:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
