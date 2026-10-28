.class final Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController$4;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;-><init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ln23/h;",
        "Lio/getstream/chat/android/models/SearchMessagesResult;",
        "result",
        "Ll83/a0;",
        "<anonymous>",
        "(Ln23/h;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.common.feature.channel.attachments.ChannelAttachmentsViewController$4"
    f = "ChannelAttachmentsViewController.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController$4;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController$4;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController$4;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController$4;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;

    invoke-direct {v0, v1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController$4;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController$4;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ln23/h;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController$4;->invoke(Ln23/h;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController$4;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController$4;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController$4;->L$0:Ljava/lang/Object;

    check-cast v0, Ln23/h;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController$4;->label:I

    if-nez v1, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController$4;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;

    instance-of v1, v0, Ln23/g;

    if-eqz v1, :cond_0

    move-object v2, v0

    check-cast v2, Ln23/g;

    iget-object v2, v2, Ln23/g;->a:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/SearchMessagesResult;

    invoke-static {p1, v2}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->access$onSuccessResult(Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;Lio/getstream/chat/android/models/SearchMessagesResult;)V

    goto :goto_0

    :cond_0
    instance-of p1, v0, Ln23/f;

    if-eqz p1, :cond_3

    :goto_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController$4;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;

    if-nez v1, :cond_2

    instance-of v1, v0, Ln23/f;

    if-eqz v1, :cond_1

    check-cast v0, Ln23/f;

    iget-object v0, v0, Ln23/f;->a:Ln23/e;

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;->access$onFailureResult(Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;Ln23/e;)V

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
