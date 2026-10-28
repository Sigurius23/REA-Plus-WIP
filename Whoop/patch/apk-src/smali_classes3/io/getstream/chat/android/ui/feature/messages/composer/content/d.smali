.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/composer/content/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerLeadingContent;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerLeadingContent;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/d;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/d;->x:Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerLeadingContent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/d;->w:I

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/d;->x:Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerLeadingContent;

    packed-switch p1, :pswitch_data_0

    sget p1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerLeadingContent;->w:I

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerLeadingContent;->getCommandsButtonClickListener()Lc93/a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void

    :pswitch_0
    sget p1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerLeadingContent;->w:I

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerLeadingContent;->getAttachmentsButtonClickListener()Lc93/a;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
