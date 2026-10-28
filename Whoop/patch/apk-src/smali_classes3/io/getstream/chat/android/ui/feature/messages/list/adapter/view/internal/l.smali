.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/l;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/l;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/l;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;

    check-cast p1, Lio/getstream/chat/android/models/Option;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->r(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;Lio/getstream/chat/android/models/Option;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/l;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;

    check-cast p1, Landroidx/constraintlayout/widget/p;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->n(Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;Landroidx/constraintlayout/widget/p;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/l;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;

    check-cast p1, Landroidx/constraintlayout/widget/p;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;->f(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;Landroidx/constraintlayout/widget/p;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
