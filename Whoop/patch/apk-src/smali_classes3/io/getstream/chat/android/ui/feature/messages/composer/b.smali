.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/composer/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/b;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/b;->x:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/b;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/b;->x:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->Q(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;F)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/b;->x:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->o(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;F)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/b;->x:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    check-cast p1, Lio/getstream/chat/android/models/Command;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->R(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/Command;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/b;->x:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->i0(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/b;->x:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    check-cast p1, Landroid/view/MotionEvent;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->T(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/MotionEvent;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/b;->x:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    check-cast p1, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->G(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/Attachment;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/b;->x:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->l0(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/b;->x:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->X(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;F)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_7
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/b;->x:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->K(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;F)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/b;->x:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    check-cast p1, Lio/getstream/chat/android/models/User;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->D(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/User;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/b;->x:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    check-cast p1, Lio/getstream/chat/android/models/Command;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->f0(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/Command;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/b;->x:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    check-cast p1, Lio/getstream/chat/android/models/User;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->C(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/User;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/b;->x:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    check-cast p1, Landroid/view/MotionEvent;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->S(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/MotionEvent;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/b;->x:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->k(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/b;->x:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    check-cast p1, Landroid/view/MotionEvent;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->d0(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/MotionEvent;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/b;->x:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->U(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/b;->x:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    check-cast p1, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->h0(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/Attachment;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/b;->x:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->Z(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
