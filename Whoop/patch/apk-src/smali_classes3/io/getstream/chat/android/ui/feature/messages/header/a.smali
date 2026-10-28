.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/header/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/header/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/header/a;->x:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget p1, p0, Lio/getstream/chat/android/ui/feature/messages/header/a;->w:I

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/header/a;->x:Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;

    packed-switch p1, :pswitch_data_0

    sget p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->w:I

    invoke-interface {v0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;->onClick()V

    return-void

    :pswitch_0
    sget p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->w:I

    invoke-interface {v0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;->onClick()V

    return-void

    :pswitch_1
    sget p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->w:I

    invoke-interface {v0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;->onClick()V

    return-void

    :pswitch_2
    sget p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->w:I

    invoke-interface {v0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;->onClick()V

    return-void

    :pswitch_3
    sget p1, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;->w:I

    invoke-interface {v0}, Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView$OnClickListener;->onClick()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
