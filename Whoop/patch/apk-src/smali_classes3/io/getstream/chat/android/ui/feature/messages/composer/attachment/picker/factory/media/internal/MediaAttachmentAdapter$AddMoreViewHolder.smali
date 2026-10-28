.class public final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$AddMoreViewHolder;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AddMoreViewHolder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$AddMoreViewHolder;",
        "Landroidx/recyclerview/widget/o2;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaAddMoreBinding;",
        "binding",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "<init>",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaAddMoreBinding;Lc93/a;)V",
        "Lc93/a;",
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
.field private final onClick:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaAddMoreBinding;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaAddMoreBinding;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaAddMoreBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$AddMoreViewHolder;->onClick:Lc93/a;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaAddMoreBinding;->getRoot()Landroid/widget/LinearLayout;

    move-result-object p1

    new-instance p2, Lb30/k3;

    const/16 v0, 0x11

    invoke-direct {p2, p0, v0}, Lb30/k3;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$AddMoreViewHolder;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$AddMoreViewHolder;->onClick:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static a(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$AddMoreViewHolder;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$AddMoreViewHolder;->onClick:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method
