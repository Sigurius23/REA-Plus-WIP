.class public final Lcom/whoop/data/interactor/JournalNewQuestionsInteractor$special$$inlined$flatMapLatest$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/interactor/JournalNewQuestionsInteractor;-><init>()V
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
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.data.interactor.JournalNewQuestionsInteractor$special$$inlined$flatMapLatest$1"
    f = "JournalNewQuestionsInteractor.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lcom/whoop/data/interactor/JournalNewQuestionAction;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/whoop/data/interactor/JournalNewQuestionsInteractor$special$$inlined$flatMapLatest$1;

    invoke-direct {v0, p3}, Lcom/whoop/data/interactor/JournalNewQuestionsInteractor$special$$inlined$flatMapLatest$1;-><init>(Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/data/interactor/JournalNewQuestionsInteractor$special$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/data/interactor/JournalNewQuestionsInteractor$special$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/data/interactor/JournalNewQuestionsInteractor$special$$inlined$flatMapLatest$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/data/interactor/JournalNewQuestionsInteractor$special$$inlined$flatMapLatest$1;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/data/interactor/JournalNewQuestionsInteractor$special$$inlined$flatMapLatest$1;->label:I

    const/4 v2, 0x1

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/data/interactor/JournalNewQuestionsInteractor$special$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/data/interactor/JournalNewQuestionsInteractor$special$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lcom/whoop/data/interactor/JournalNewQuestionsInteractor$special$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/data/interactor/JournalNewQuestionAction;

    instance-of v1, v1, Lcom/whoop/data/interactor/JournalNewQuestionAction$NewQuestionsAdded;

    if-eqz v1, :cond_5

    sget-object v1, Lcom/whoop/data/interactor/JournalNewQuestionState$NewQuestionsPresent;->INSTANCE:Lcom/whoop/data/interactor/JournalNewQuestionState$NewQuestionsPresent;

    const/4 v4, 0x0

    iput-object v4, p0, Lcom/whoop/data/interactor/JournalNewQuestionsInteractor$special$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    iput-object v4, p0, Lcom/whoop/data/interactor/JournalNewQuestionsInteractor$special$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/data/interactor/JournalNewQuestionsInteractor$special$$inlined$flatMapLatest$1;->label:I

    invoke-static {p1}, Lec3/v;->y(Lec3/m;)V

    invoke-interface {p1, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lr83/a;->w:Lr83/a;

    if-ne p1, v1, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v3

    :goto_0
    sget-object v1, Lr83/a;->w:Lr83/a;

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    move-object p1, v3

    :goto_1
    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_2
    return-object v3

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
