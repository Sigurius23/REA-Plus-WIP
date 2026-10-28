.class public final synthetic Lio/getstream/chat/android/ui/common/feature/messages/list/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

.field public final synthetic y:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;I)V
    .locals 0

    iput p3, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/e;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/e;->x:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/e;->y:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/e;->y:Ljava/lang/String;

    check-cast p1, Ln23/e;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/e;->x:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->x(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Ln23/e;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/e;->y:Ljava/lang/String;

    check-cast p1, Ln23/e;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/e;->x:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->J(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Ln23/e;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
