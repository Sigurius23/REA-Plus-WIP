.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/composer/content/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/a;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/a;->w:I

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/a;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerTrailingContent;

    sget-object p1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerTrailingContent;->Companion:Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerTrailingContent$Companion;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerTrailingContent;->getSendMessageButtonClickListener()Lc93/a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void

    :pswitch_0
    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;

    sget p1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->w:I

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->getDismissActionClickListener()Lc93/a;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_1
    return-void

    :pswitch_1
    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder;

    invoke-static {v1, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder;->a(Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder;Landroid/view/View;)V

    return-void

    :pswitch_2
    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;

    invoke-static {v1, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;->a(Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
