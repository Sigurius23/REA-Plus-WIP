.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$ReactionClickListener;
.implements Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$MessageOptionClickListener;


# instance fields
.field public final synthetic a:Ll83/e;


# direct methods
.method public synthetic constructor <init>(Ll83/e;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/i;->a:Ll83/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMessageOptionClick(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/i;->a:Ll83/e;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->y(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V

    return-void
.end method

.method public onReactionClick(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/i;->a:Ll83/e;

    check-cast v0, Lc93/m;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->k0(Lc93/m;Lio/getstream/chat/android/models/Message;Ljava/lang/String;)V

    return-void
.end method
