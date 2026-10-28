.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/composer/content/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;->x:Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;->x:Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->f(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;->x:Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->m(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;Landroid/view/View;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;->x:Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->k(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;Landroid/view/View;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;->x:Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->n(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
