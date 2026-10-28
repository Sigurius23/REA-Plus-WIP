.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/FallbackQuotedAttachmentMessageFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactory;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/FallbackQuotedAttachmentMessageFactory;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactory;",
        "<init>",
        "()V",
        "canHandle",
        "",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "generateQuotedAttachmentView",
        "Landroid/view/View;",
        "parent",
        "Landroid/view/ViewGroup;",
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
.method public final canHandle(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final generateQuotedAttachmentView(Lio/getstream/chat/android/models/Message;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "parent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/DefaultQuotedAttachmentView;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    const-string v0, "getContext(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/DefaultQuotedAttachmentView;-><init>(Landroid/content/Context;)V

    sget p2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_file:I

    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    return-object p1
.end method
