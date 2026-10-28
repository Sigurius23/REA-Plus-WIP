.class public final Lcom/whoop/data/interactor/JournalNewQuestionsInteractor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR#\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c8\u0006\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u000f\u0012\u0004\u0008\u0012\u0010\u0003\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/whoop/data/interactor/JournalNewQuestionsInteractor;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/data/interactor/JournalNewQuestionAction;",
        "action",
        "Ll83/a0;",
        "sendAction",
        "(Lcom/whoop/data/interactor/JournalNewQuestionAction;Lq83/d;)Ljava/lang/Object;",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/o1;",
        "Lec3/l;",
        "Lcom/whoop/data/interactor/JournalNewQuestionState;",
        "journalNewQuestionFlow",
        "Lec3/l;",
        "getJournalNewQuestionFlow",
        "()Lec3/l;",
        "getJournalNewQuestionFlow$annotations",
        "feature_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final eventFlow:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final journalNewQuestionFlow:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v1, v1, v2, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/data/interactor/JournalNewQuestionsInteractor;->eventFlow:Lec3/o1;

    new-instance v1, Lcom/whoop/data/interactor/JournalNewQuestionsInteractor$special$$inlined$flatMapLatest$1;

    invoke-direct {v1, v2}, Lcom/whoop/data/interactor/JournalNewQuestionsInteractor$special$$inlined$flatMapLatest$1;-><init>(Lq83/d;)V

    invoke-static {v0, v1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/data/interactor/JournalNewQuestionsInteractor;->journalNewQuestionFlow:Lec3/l;

    return-void
.end method

.method public static synthetic getJournalNewQuestionFlow$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final getJournalNewQuestionFlow()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/interactor/JournalNewQuestionsInteractor;->journalNewQuestionFlow:Lec3/l;

    return-object v0
.end method

.method public final sendAction(Lcom/whoop/data/interactor/JournalNewQuestionAction;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/interactor/JournalNewQuestionAction;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/interactor/JournalNewQuestionsInteractor;->eventFlow:Lec3/o1;

    invoke-interface {v0, p1, p2}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
