.class public final Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$PinnedMessageLoadingMoreView;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "PinnedMessageLoadingMoreView"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$PinnedMessageLoadingMoreView;",
        "Landroidx/recyclerview/widget/o2;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemListLoadingBinding;",
        "binding",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;Lio/getstream/chat/android/ui/databinding/StreamUiItemListLoadingBinding;)V",
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
.field final synthetic this$0:Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;Lio/getstream/chat/android/ui/databinding/StreamUiItemListLoadingBinding;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/databinding/StreamUiItemListLoadingBinding;",
            ")V"
        }
    .end annotation

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter$PinnedMessageLoadingMoreView;->this$0:Lio/getstream/chat/android/ui/feature/pinned/list/internal/PinnedMessageListAdapter;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/databinding/StreamUiItemListLoadingBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    return-void
.end method
