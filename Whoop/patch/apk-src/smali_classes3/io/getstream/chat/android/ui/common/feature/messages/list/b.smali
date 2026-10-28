.class public final synthetic Lio/getstream/chat/android/ui/common/feature/messages/list/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/b;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/b;->x:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/b;->x:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->f(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/b;->x:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->v(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
