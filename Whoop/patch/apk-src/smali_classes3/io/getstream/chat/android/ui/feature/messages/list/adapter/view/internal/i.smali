.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/i;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->w:I

    return-object v1

    :pswitch_0
    check-cast p1, Lio/getstream/chat/android/models/Poll;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->v(Lio/getstream/chat/android/models/Poll;)V

    return-object v1

    :pswitch_1
    check-cast p1, Lio/getstream/chat/android/models/Poll;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->A(Lio/getstream/chat/android/models/Poll;)V

    return-object v1

    :pswitch_2
    check-cast p1, Lio/getstream/chat/android/models/Option;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->z(Lio/getstream/chat/android/models/Option;)V

    return-object v1

    :pswitch_3
    check-cast p1, Lio/getstream/chat/android/models/Poll;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->q(Lio/getstream/chat/android/models/Poll;)V

    return-object v1

    :pswitch_4
    check-cast p1, Lio/getstream/chat/android/models/Poll;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->u(Lio/getstream/chat/android/models/Poll;)V

    return-object v1

    :pswitch_5
    check-cast p1, Lio/getstream/chat/android/models/Poll;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->y(Lio/getstream/chat/android/models/Poll;)V

    return-object v1

    :pswitch_6
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;->w:I

    return-object v1

    :pswitch_7
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;->a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
