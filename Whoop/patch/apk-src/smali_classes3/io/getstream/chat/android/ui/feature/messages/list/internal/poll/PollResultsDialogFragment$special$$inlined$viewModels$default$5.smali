.class public final Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$special$$inlined$viewModels$default$5;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lc93/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u0002\"\n\u0008\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/lifecycle/w1;",
        "VM",
        "Landroidx/lifecycle/a2;",
        "invoke",
        "()Landroidx/lifecycle/a2;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $owner$delegate:Ll83/h;

.field final synthetic $this_viewModels:Landroidx/fragment/app/m0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/m0;Ll83/h;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$special$$inlined$viewModels$default$5;->$this_viewModels:Landroidx/fragment/app/m0;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$special$$inlined$viewModels$default$5;->$owner$delegate:Ll83/h;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/lifecycle/a2;
    .locals 2

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$special$$inlined$viewModels$default$5;->$owner$delegate:Ll83/h;

    .line 3
    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/f2;

    .line 4
    instance-of v1, v0, Landroidx/lifecycle/r;

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/lifecycle/r;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroidx/lifecycle/r;->getDefaultViewModelProviderFactory()Landroidx/lifecycle/a2;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    return-object v0

    .line 5
    :cond_2
    :goto_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$special$$inlined$viewModels$default$5;->$this_viewModels:Landroidx/fragment/app/m0;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getDefaultViewModelProviderFactory()Landroidx/lifecycle/a2;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$special$$inlined$viewModels$default$5;->invoke()Landroidx/lifecycle/a2;

    move-result-object v0

    return-object v0
.end method
