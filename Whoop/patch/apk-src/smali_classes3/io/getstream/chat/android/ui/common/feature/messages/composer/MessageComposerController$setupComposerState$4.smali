.class final Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$4;
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
        "\u0000\u0012\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "",
        "ownCapabilities",
        "Ll83/a0;",
        "<anonymous>",
        "(Ljava/util/Set;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$setupComposerState$4"
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
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$4;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$4;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

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

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$4;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$4;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-direct {v0, v1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$4;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$4;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/Set;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$4;->invoke(Ljava/util/Set;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Ljava/util/Set;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$4;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$4;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$4;->L$0:Ljava/lang/Object;

    move-object v13, v1

    check-cast v13, Ljava/util/Set;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$4;->label:I

    if-nez v1, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$4;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-static {v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->access$get_state$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)Lec3/p1;

    move-result-object v1

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$setupComposerState$4;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;

    invoke-static {v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->access$get_state$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)Lec3/p1;

    move-result-object v2

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    const v21, 0x3fbff

    const/16 v22, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v2 .. v22}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;

    move-result-object v2

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v3, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
