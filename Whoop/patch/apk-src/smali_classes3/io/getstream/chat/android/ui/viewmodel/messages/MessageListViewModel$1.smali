.class final Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/client/ChatClient;)V
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
    c = "io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$1"
    f = "MessageListViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1;->invokeSuspend$lambda$1(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State;)Ll83/a0;

    return-void
.end method

.method private static final invokeSuspend$lambda$1(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$State;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->access$getStateMerger$p(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;)Landroidx/lifecycle/t0;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-direct {p1, v0, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->getMessageListController$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getListState()Lec3/f2;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->getMessageListController$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getMode()Lec3/f2;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$listState$1;

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Ls83/i;-><init>(ILq83/d;)V

    new-instance v4, Lec3/l1;

    const/4 v5, 0x1

    invoke-direct {v4, p1, v0, v1, v5}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    const-wide/16 v0, 0x5

    invoke-static {v4, v0, v1}, Lec3/v;->r(Lec3/l;J)Lec3/l;

    move-result-object p1

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$listState$2;

    const/4 v1, 0x2

    invoke-direct {v0, v1, v3}, Ls83/i;-><init>(ILq83/d;)V

    new-instance v1, Lec3/a0;

    invoke-direct {v1, v0, p1}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1;

    invoke-direct {v0, v1, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1$invokeSuspend$$inlined$map$1;-><init>(Lec3/l;Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;)V

    invoke-static {v0, v3, v2}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    invoke-static {v0}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;->access$getStateMerger$p(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;)Landroidx/lifecycle/t0;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    new-instance v2, Lio/getstream/chat/android/ui/viewmodel/messages/g;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lio/getstream/chat/android/ui/viewmodel/messages/g;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;I)V

    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$sam$androidx_lifecycle_Observer$0;

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/t0;->b(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
