.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView$setStyle$$inlined$doOnAttach$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;->setStyle(Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "io/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView$setStyle$$inlined$doOnAttach$1",
        "Landroid/view/View$OnAttachStateChangeListener;",
        "Landroid/view/View;",
        "view",
        "Ll83/a0;",
        "onViewAttachedToWindow",
        "(Landroid/view/View;)V",
        "onViewDetachedFromWindow",
        "core-ktx_release"
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
.field final synthetic $style$inlined:Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;

.field final synthetic $this_doOnAttach:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView$setStyle$$inlined$doOnAttach$1;->$this_doOnAttach:Landroid/view/View;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView$setStyle$$inlined$doOnAttach$1;->$style$inlined:Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView$setStyle$$inlined$doOnAttach$1;->$this_doOnAttach:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView$setStyle$$inlined$doOnAttach$1;->$style$inlined:Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;->getHeight()I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method
