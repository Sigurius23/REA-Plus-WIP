.class final synthetic Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$12;
.super Lkotlin/jvm/internal/a;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->observeMessagesListState()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/a;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v6, "updateUnreadLabel(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;)V"

    const/4 v2, 0x4

    const/4 v1, 0x2

    const-class v3, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    const-string v5, "updateUnreadLabel"

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/a;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lkotlin/jvm/internal/a;->receiver:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$observeMessagesListState$updateUnreadLabel(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$12;->invoke(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
