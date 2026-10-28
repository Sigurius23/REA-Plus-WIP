.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/composer/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/d;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/d;->x:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/d;->x:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->x(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/d;->x:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->q(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
