.class final Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$6;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->setupComposerState()V
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;",
        "recording",
        "Ll83/a0;",
        "<anonymous>",
        "(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$setupComposerState$6"
    f = "MessageComposerController.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$6;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$6;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

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

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$6;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$6;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-direct {v0, v1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$6;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$6;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$6;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$6;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$6;->invoke(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$6;->L$0:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$6;->label:I

    if-nez v2, :cond_3

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$6;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-static {v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->access$getLogger$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v3, "[onRecordingState] recording: "

    invoke-static {v3, v1}, Lhc3/i;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    invoke-interface {v2, v5, v4, v3, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    instance-of v2, v1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;

    if-eqz v2, :cond_1

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$6;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-static {v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->access$get_recordingAttachment$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)Lec3/p1;

    move-result-object v2

    move-object v3, v1

    check-cast v3, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;->getAttachment()Lio/getstream/chat/android/models/Attachment;

    move-result-object v3

    check-cast v2, Lec3/h2;

    invoke-virtual {v2, v3}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_1
    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$6;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-static {v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->access$get_state$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)Lec3/p1;

    move-result-object v23

    :goto_0
    move-object/from16 v2, v23

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v2

    move-object v2, v3

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    const v21, 0x3dfff

    const/16 v22, 0x0

    move-object v5, v3

    const/4 v3, 0x0

    move-object v6, v4

    const/4 v4, 0x0

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

    move-object v13, v11

    const/4 v11, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    move-object v15, v13

    const/4 v13, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move-object/from16 v17, v15

    const/4 v15, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object/from16 v24, v20

    const/16 v20, 0x0

    move-object/from16 v0, v16

    move-object/from16 v16, v1

    move-object v1, v0

    move-object/from16 v0, v24

    invoke-static/range {v2 .. v22}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$6;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-static {v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->access$syncAttachments(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_2
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    goto :goto_0

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
