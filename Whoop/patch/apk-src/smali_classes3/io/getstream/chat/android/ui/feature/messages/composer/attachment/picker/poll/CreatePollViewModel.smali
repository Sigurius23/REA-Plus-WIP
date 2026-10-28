.class public final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\r\u0010\r\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u0003J\u001d\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0012\u0010\u0003J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\n2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u001b\u0010\u0016J\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u001d\u0010\u0016J\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u001f\u0010\u0016R\u001a\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00080 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R6\u0010&\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020$0#j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020$`%0 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\"R\u001a\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\n0\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0016\u0010\u001a\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010*R\u0016\u0010\u001c\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010*R\u0016\u0010\u001e\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010*R\u001c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\"R\u001e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008+\u0010\"R#\u0010.\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020$0-0,8\u0006\u00a2\u0006\u000c\n\u0004\u0008.\u0010/\u001a\u0004\u00080\u00101R\u001f\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0005028\u0006\u00a2\u0006\u000c\n\u0004\u00083\u00104\u001a\u0004\u00085\u00106R\u001f\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070,8\u0006\u00a2\u0006\u000c\n\u0004\u00088\u0010/\u001a\u0004\u00089\u00101R\u001d\u0010:\u001a\u0008\u0012\u0004\u0012\u00020\u00130,8\u0006\u00a2\u0006\u000c\n\u0004\u0008:\u0010/\u001a\u0004\u0008;\u00101\u00a8\u0006<"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;",
        "Landroidx/lifecycle/w1;",
        "<init>",
        "()V",
        "Lec3/l;",
        "",
        "multipleAnswersErrorFlow",
        "()Lec3/l;",
        "",
        "title",
        "Ll83/a0;",
        "onTitleChanged",
        "(Ljava/lang/String;)V",
        "createOption",
        "id",
        "text",
        "onOptionTextChanged",
        "(ILjava/lang/String;)V",
        "createPollConfig",
        "",
        "allowMultipleVotes",
        "setAllowMultipleVotes",
        "(Z)V",
        "maxAnswer",
        "setMaxAnswer",
        "(Ljava/lang/Integer;)V",
        "suggestAnOption",
        "setSuggestAnOption",
        "annonymousPoll",
        "setAnnonymousPoll",
        "allowAnswers",
        "setAllowAnswers",
        "Lec3/p1;",
        "_titleStateFlow",
        "Lec3/p1;",
        "Ljava/util/LinkedHashMap;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;",
        "Lkotlin/collections/LinkedHashMap;",
        "_options",
        "Lec3/o1;",
        "createPoll",
        "Lec3/o1;",
        "Z",
        "maxAnswers",
        "Lec3/f2;",
        "",
        "options",
        "Lec3/f2;",
        "getOptions",
        "()Lec3/f2;",
        "Lec3/t1;",
        "multipleAnswersError",
        "Lec3/t1;",
        "getMultipleAnswersError",
        "()Lec3/t1;",
        "Lio/getstream/chat/android/models/CreatePollParams;",
        "createPollParams",
        "getCreatePollParams",
        "pollIsReady",
        "getPollIsReady",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final _options:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _titleStateFlow:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private allowAnswers:Z

.field private allowMultipleVotes:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private annonymousPoll:Z

.field private final createPoll:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final createPollParams:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private maxAnswers:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final multipleAnswersError:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field

.field private final options:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final pollIsReady:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private suggestAnOption:Z


# direct methods
.method public constructor <init>()V
    .locals 12

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    const-string v0, ""

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->_titleStateFlow:Lec3/p1;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->_options:Lec3/p1;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x5

    invoke-static {v2, v3, v4, v5}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v6

    iput-object v6, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->createPoll:Lec3/o1;

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v7}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v8

    iput-object v8, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->allowMultipleVotes:Lec3/p1;

    invoke-static {v4}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v8

    iput-object v8, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->maxAnswers:Lec3/p1;

    new-instance v8, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$special$$inlined$map$1;

    invoke-direct {v8, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$special$$inlined$map$1;-><init>(Lec3/l;)V

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v1

    sget-object v9, Lm83/y;->w:Lm83/y;

    sget-object v10, Lec3/z1;->b:Lec3/b2;

    invoke-static {v8, v1, v10, v9}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->options:Lec3/f2;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->multipleAnswersErrorFlow()Lec3/l;

    move-result-object v8

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v9

    invoke-static {v8, v9, v10, v2}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object v8

    iput-object v8, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->multipleAnswersError:Lec3/t1;

    new-instance v9, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$special$$inlined$flatMapLatest$1;

    invoke-direct {v9, v4, p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$special$$inlined$flatMapLatest$1;-><init>(Lq83/d;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;)V

    invoke-static {v6, v9}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v6

    new-instance v9, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$special$$inlined$flatMapLatest$2;

    invoke-direct {v9, v4, p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$special$$inlined$flatMapLatest$2;-><init>(Lq83/d;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;)V

    invoke-static {v6, v9}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v6

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v9

    invoke-static {v6, v9, v10, v4}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object v6

    iput-object v6, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->createPollParams:Lec3/f2;

    iget-object v6, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->allowMultipleVotes:Lec3/p1;

    iget-object v9, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->maxAnswers:Lec3/p1;

    new-instance v11, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$pollIsReady$1;

    invoke-direct {v11, v4}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$pollIsReady$1;-><init>(Lq83/d;)V

    new-array v4, v5, [Lec3/l;

    aput-object v1, v4, v2

    aput-object v0, v4, v3

    const/4 v0, 0x2

    aput-object v6, v4, v0

    const/4 v1, 0x3

    aput-object v9, v4, v1

    const/4 v1, 0x4

    aput-object v8, v4, v1

    new-instance v1, Lec3/j1;

    invoke-direct {v1, v4, v11, v0}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    invoke-static {v1, v0, v10, v7}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->pollIsReady:Lec3/f2;

    return-void
.end method

.method public static final synthetic access$getAllowAnswers$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;)Z
    .locals 0

    iget-boolean p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->allowAnswers:Z

    return p0
.end method

.method public static final synthetic access$getAllowMultipleVotes$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->allowMultipleVotes:Lec3/p1;

    return-object p0
.end method

.method public static final synthetic access$getAnnonymousPoll$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;)Z
    .locals 0

    iget-boolean p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->annonymousPoll:Z

    return p0
.end method

.method public static final synthetic access$getMaxAnswers$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->maxAnswers:Lec3/p1;

    return-object p0
.end method

.method public static final synthetic access$getSuggestAnOption$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;)Z
    .locals 0

    iget-boolean p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->suggestAnOption:Z

    return p0
.end method

.method public static final synthetic access$get_titleStateFlow$p(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->_titleStateFlow:Lec3/p1;

    return-object p0
.end method

.method private final multipleAnswersErrorFlow()Lec3/l;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->allowMultipleVotes:Lec3/p1;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->maxAnswers:Lec3/p1;

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$multipleAnswersErrorFlow$1;

    const/4 v3, 0x0

    const/4 v4, 0x3

    invoke-direct {v2, v4, v3}, Ls83/i;-><init>(ILq83/d;)V

    new-instance v3, Lec3/l1;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v1, v2, v4}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    return-object v3
.end method


# virtual methods
.method public final createOption()V
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->_options:Lec3/p1;

    new-instance v1, Ljava/util/LinkedHashMap;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->_options:Lec3/p1;

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->_options:Lec3/p1;

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/AbstractMap;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;

    const-string v5, ""

    const/4 v6, 0x0

    invoke-direct {v4, v2, v5, v6}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;-><init>(ILjava/lang/String;Z)V

    invoke-virtual {v1, v3, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final createPollConfig()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->createPoll:Lec3/o1;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v0, v1}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void
.end method

.method public final getCreatePollParams()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->createPollParams:Lec3/f2;

    return-object v0
.end method

.method public final getMultipleAnswersError()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->multipleAnswersError:Lec3/t1;

    return-object v0
.end method

.method public final getOptions()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->options:Lec3/f2;

    return-object v0
.end method

.method public final getPollIsReady()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->pollIsReady:Lec3/f2;

    return-object v0
.end method

.method public final onOptionTextChanged(ILjava/lang/String;)V
    .locals 10

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->_options:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    const-string v2, "<get-values>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;->getId()I

    move-result v4

    if-ne v4, p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lez v4, :cond_3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;

    if-eqz v3, :cond_8

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->_options:Lec3/p1;

    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-direct {v9, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v4, 0x0

    if-eqz v0, :cond_6

    :cond_5
    :goto_3
    move v6, v4

    goto :goto_4

    :cond_6
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {p2}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    const/4 v4, 0x1

    goto :goto_3

    :goto_4
    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v4, 0x0

    move-object v5, p2

    invoke-static/range {v3 .. v8}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;->copy$default(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;ILjava/lang/String;ZILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;

    move-result-object p2

    invoke-virtual {v9, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    invoke-virtual {v1, p1, v9}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_8
    return-void
.end method

.method public final onTitleChanged(Ljava/lang/String;)V
    .locals 2

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->_titleStateFlow:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final setAllowAnswers(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->allowAnswers:Z

    return-void
.end method

.method public final setAllowMultipleVotes(Z)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->allowMultipleVotes:Lec3/p1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final setAnnonymousPoll(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->annonymousPoll:Z

    return-void
.end method

.method public final setMaxAnswer(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->maxAnswers:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void
.end method

.method public final setSuggestAnOption(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;->suggestAnOption:Z

    return-void
.end method
