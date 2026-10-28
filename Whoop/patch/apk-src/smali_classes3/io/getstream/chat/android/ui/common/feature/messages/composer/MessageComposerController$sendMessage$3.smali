.class final Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendMessage$3;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->sendMessage(Lio/getstream/chat/android/models/Message;Lo23/a;Lc93/m;)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$sendMessage$3"
    f = "MessageComposerController.kt"
    l = {
        0x345
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $callback:Lo23/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo23/a;"
        }
    .end annotation
.end field

.field final synthetic $preparedMessage:Lio/getstream/chat/android/models/Message;

.field final synthetic $resolveAttachments:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;


# direct methods
.method public constructor <init>(Lc93/m;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lo23/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            "Lio/getstream/chat/android/models/Message;",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;",
            "Lo23/a;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendMessage$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendMessage$3;->$resolveAttachments:Lc93/m;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendMessage$3;->$preparedMessage:Lio/getstream/chat/android/models/Message;

    iput-object p3, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendMessage$3;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    iput-object p4, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendMessage$3;->$callback:Lo23/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendMessage$3;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendMessage$3;->$resolveAttachments:Lc93/m;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendMessage$3;->$preparedMessage:Lio/getstream/chat/android/models/Message;

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendMessage$3;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendMessage$3;->$callback:Lo23/a;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendMessage$3;-><init>(Lc93/m;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lo23/a;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendMessage$3;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendMessage$3;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendMessage$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendMessage$3;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 55

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendMessage$3;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendMessage$3;->$resolveAttachments:Lc93/m;

    iget-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendMessage$3;->$preparedMessage:Lio/getstream/chat/android/models/Message;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v4

    iput v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendMessage$3;->label:I

    invoke-interface {v2, v4, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    move-object v10, v2

    check-cast v10, Ljava/util/List;

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendMessage$3;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    iget-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendMessage$3;->$preparedMessage:Lio/getstream/chat/android/models/Message;

    const v53, 0xffff

    const/16 v54, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, -0x41

    invoke-static/range {v3 .. v54}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    iget-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$sendMessage$3;->$callback:Lo23/a;

    invoke-static {v1, v2, v3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->access$enqueueSendMessage(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lio/getstream/chat/android/models/Message;Lo23/a;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
