.class final Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$searchMessages$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->searchMessages()V
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
    c = "io.getstream.chat.android.ui.viewmodel.search.SearchViewModel$searchMessages$1"
    f = "SearchViewModel.kt"
    l = {
        0x7d,
        0x82
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$searchMessages$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$searchMessages$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
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

    new-instance p1, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$searchMessages$1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$searchMessages$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;

    invoke-direct {p1, v0, p2}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$searchMessages$1;-><init>(Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$searchMessages$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$searchMessages$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$searchMessages$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$searchMessages$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$searchMessages$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$searchMessages$1;->L$1:Ljava/lang/Object;

    check-cast v0, Ln23/h;

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$searchMessages$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$searchMessages$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$searchMessages$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;

    invoke-static {p1}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->access$get_state$p(Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;)Landroidx/lifecycle/u0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$searchMessages$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->getQuery()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->getNext$stream_chat_android_ui_components_release()Ljava/lang/String;

    move-result-object p1

    iput-object v4, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$searchMessages$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$searchMessages$1;->label:I

    invoke-static {v1, v5, p1, p0}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->access$searchMessages(Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Ln23/h;

    instance-of v1, p1, Ln23/g;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$searchMessages$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;

    check-cast p1, Ln23/g;

    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/SearchMessagesResult;

    iput-object v4, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$searchMessages$1;->L$0:Ljava/lang/Object;

    iput-object v4, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$searchMessages$1;->L$1:Ljava/lang/Object;

    iput v2, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$searchMessages$1;->label:I

    invoke-static {v1, p1, p0}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->access$handleSearchMessageSuccess(Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;Lio/getstream/chat/android/models/SearchMessagesResult;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_4
    instance-of v0, p1, Ln23/f;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$searchMessages$1;->this$0:Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;

    check-cast p1, Ln23/f;

    iget-object p1, p1, Ln23/f;->a:Ln23/e;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->access$handleSearchMessagesError(Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;Ln23/e;)V

    :cond_5
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
