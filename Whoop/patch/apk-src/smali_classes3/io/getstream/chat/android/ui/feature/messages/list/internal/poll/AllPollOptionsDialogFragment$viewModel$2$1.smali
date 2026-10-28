.class public final Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$viewModel$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/a2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\'\u0010\u0006\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0003*\u00020\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "io/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$viewModel$2$1",
        "Landroidx/lifecycle/a2;",
        "Landroidx/lifecycle/w1;",
        "T",
        "Ljava/lang/Class;",
        "modelClass",
        "create",
        "(Ljava/lang/Class;)Landroidx/lifecycle/w1;",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$viewModel$2$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Lj93/d;Ll8/c;)Landroidx/lifecycle/w1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/w1;",
            ">(",
            "Lj93/d;",
            "Ll8/c;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/lifecycle/a2;->create(Lj93/d;Ll8/c;)Landroidx/lifecycle/w1;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Class;)Landroidx/lifecycle/w1;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/w1;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;

    .line 4
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$viewModel$2$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "message_id"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    .line 5
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$viewModel$2$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "channel_id"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    .line 6
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$viewModel$2$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "channel_type"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    .line 7
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$viewModel$2$1;->this$0:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object p1

    const-string v0, "getViewLifecycleOwner(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v6

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v2, 0x0

    .line 8
    invoke-direct/range {v1 .. v8}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final create(Ljava/lang/Class;Ll8/c;)Landroidx/lifecycle/w1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/w1;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ll8/c;",
            ")TT;"
        }
    .end annotation

    .line 2
    invoke-super {p0, p1, p2}, Landroidx/lifecycle/a2;->create(Ljava/lang/Class;Ll8/c;)Landroidx/lifecycle/w1;

    move-result-object p1

    return-object p1
.end method
