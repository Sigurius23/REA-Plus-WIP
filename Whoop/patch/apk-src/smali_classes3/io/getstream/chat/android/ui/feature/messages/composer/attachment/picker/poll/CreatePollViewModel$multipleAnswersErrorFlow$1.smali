.class final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$multipleAnswersErrorFlow$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->multipleAnswersErrorFlow()Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "allowMultipleVotes",
        "",
        "maxAnswer"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollViewModel$multipleAnswersErrorFlow$1"
    f = "CreatePollViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field synthetic Z$0:Z

.field label:I


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$multipleAnswersErrorFlow$1;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$multipleAnswersErrorFlow$1;->invoke(ZLjava/lang/Integer;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(ZLjava/lang/Integer;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/Integer;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$multipleAnswersErrorFlow$1;

    const/4 v1, 0x3

    .line 2
    invoke-direct {v0, v1, p3}, Ls83/i;-><init>(ILq83/d;)V

    .line 3
    iput-boolean p1, v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$multipleAnswersErrorFlow$1;->Z$0:Z

    iput-object p2, v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$multipleAnswersErrorFlow$1;->L$0:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$multipleAnswersErrorFlow$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$multipleAnswersErrorFlow$1;->Z$0:Z

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$multipleAnswersErrorFlow$1;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$multipleAnswersErrorFlow$1;->label:I

    if-nez v2, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 p1, 0x0

    if-eqz v0, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lio/getstream/chat/android/ui/common/utils/PollsConstants;->INSTANCE:Lio/getstream/chat/android/ui/common/utils/PollsConstants;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/utils/PollsConstants;->getMULTIPLE_ANSWERS_RANGE()Li93/j;

    move-result-object v0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Li93/j;->e(I)Z

    move-result v0

    if-nez v0, :cond_1

    sget p1, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_poll_multiple_answers_error:I

    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(I)V

    return-object v0

    :cond_1
    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
