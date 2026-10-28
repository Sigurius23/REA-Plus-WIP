.class final Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setMessageMode$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->setMessageMode(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)V
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
    c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$setMessageMode$1"
    f = "MessageComposerController.kt"
    l = {
        0x25e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $messageMode:Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

.field final synthetic $previousMode:Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lio/getstream/chat/android/ui/common/state/messages/MessageMode;Lio/getstream/chat/android/ui/common/state/messages/MessageMode;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setMessageMode$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setMessageMode$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setMessageMode$1;->$previousMode:Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    iput-object p3, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setMessageMode$1;->$messageMode:Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setMessageMode$1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setMessageMode$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setMessageMode$1;->$previousMode:Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setMessageMode$1;->$messageMode:Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    invoke-direct {p1, v0, v1, v2, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setMessageMode$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lio/getstream/chat/android/ui/common/state/messages/MessageMode;Lio/getstream/chat/android/ui/common/state/messages/MessageMode;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setMessageMode$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setMessageMode$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setMessageMode$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setMessageMode$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setMessageMode$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setMessageMode$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-static {v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->access$get_state$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)Lec3/p1;

    move-result-object v2

    iget-object v13, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setMessageMode$1;->$messageMode:Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    :goto_0
    move-object v4, v2

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v4

    move-object v4, v5

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    const v23, 0x3feff

    const/16 v24, 0x0

    move-object v7, v5

    const/4 v5, 0x0

    move-object v8, v6

    const/4 v6, 0x0

    move-object v9, v7

    const/4 v7, 0x0

    move-object v10, v8

    const/4 v8, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    move-object v12, v10

    const/4 v10, 0x0

    move-object v14, v11

    const/4 v11, 0x0

    move-object v15, v12

    const/4 v12, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move-object/from16 v17, v15

    const/4 v15, 0x0

    move-object/from16 v18, v16

    const/16 v16, 0x0

    move-object/from16 v19, v17

    const/16 v17, 0x0

    move-object/from16 v20, v18

    const/16 v18, 0x0

    move-object/from16 v21, v19

    const/16 v19, 0x0

    move-object/from16 v22, v20

    const/16 v20, 0x0

    move-object/from16 v25, v21

    const/16 v21, 0x0

    move-object/from16 v26, v22

    const/16 v22, 0x0

    move-object/from16 p1, v2

    move-object/from16 v3, v25

    move-object/from16 v2, v26

    invoke-static/range {v4 .. v24}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    move-result-object v4

    invoke-virtual {v3, v2, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setMessageMode$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    iget-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setMessageMode$1;->$previousMode:Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    const/4 v4, 0x1

    iput v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setMessageMode$1;->label:I

    invoke-static {v2, v3, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->access$saveDraftMessage(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lio/getstream/chat/android/ui/common/state/messages/MessageMode;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    return-object v1

    :cond_2
    :goto_1
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setMessageMode$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setMessageMode$1;->$messageMode:Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->access$fetchDraftMessage(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_3
    move-object/from16 v2, p1

    const/4 v3, 0x1

    goto :goto_0
.end method
