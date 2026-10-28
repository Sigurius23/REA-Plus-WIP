.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/composer/content/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/widget/FrameLayout;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/FrameLayout;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/b;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/b;->x:Landroid/widget/FrameLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/b;->x:Landroid/widget/FrameLayout;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerMentionSuggestionsContent;

    check-cast p1, Lio/getstream/chat/android/models/User;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerMentionSuggestionsContent;->a(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerMentionSuggestionsContent;Lio/getstream/chat/android/models/User;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/b;->x:Landroid/widget/FrameLayout;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCommandSuggestionsContent;

    check-cast p1, Lio/getstream/chat/android/models/Command;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCommandSuggestionsContent;->a(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCommandSuggestionsContent;Lio/getstream/chat/android/models/Command;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/b;->x:Landroid/widget/FrameLayout;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;

    check-cast p1, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->a(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;Lio/getstream/chat/android/models/Attachment;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
