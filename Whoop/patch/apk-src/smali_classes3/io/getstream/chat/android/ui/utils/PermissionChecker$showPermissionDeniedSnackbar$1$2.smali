.class public final Lio/getstream/chat/android/ui/utils/PermissionChecker$showPermissionDeniedSnackbar$1$2;
.super Lmr/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/utils/PermissionChecker;->showPermissionDeniedSnackbar(Landroid/view/View;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lmr/i;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "io/getstream/chat/android/ui/utils/PermissionChecker$showPermissionDeniedSnackbar$1$2",
        "Lmr/i;",
        "Lmr/n;",
        "sb",
        "Ll83/a0;",
        "onShown",
        "(Lmr/n;)V",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic onShown(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lmr/n;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/utils/PermissionChecker$showPermissionDeniedSnackbar$1$2;->onShown(Lmr/n;)V

    return-void
.end method

.method public final onShown(Lmr/n;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p1, Lmr/l;->i:Lmr/k;

    if-eqz p1, :cond_0

    const/16 v0, 0x14

    .line 3
    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPxPrecise(I)F

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setElevation(F)V

    :cond_0
    return-void
.end method
