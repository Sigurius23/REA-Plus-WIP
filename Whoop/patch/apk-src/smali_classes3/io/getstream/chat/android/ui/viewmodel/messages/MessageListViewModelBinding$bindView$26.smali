.class final synthetic Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding$bindView$26;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding;->bind(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Landroidx/lifecycle/g0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/i;",
        "Lkotlin/jvm/functions/Function1;"
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


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v6, "scrollToMessage(Lio/getstream/chat/android/models/Message;)V"

    const/4 v2, 0x0

    const/4 v1, 0x1

    const-class v3, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    const-string v5, "scrollToMessage"

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModelBinding$bindView$26;->invoke(Lio/getstream/chat/android/models/Message;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->scrollToMessage(Lio/getstream/chat/android/models/Message;)V

    return-void
.end method
