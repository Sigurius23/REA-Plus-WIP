.class final Lur1/m$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lur1/m;->w(Lsr1/e$d;)V
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
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.journal.interactors.v2.JournalFetchInteractor$handlePartialAutoSave$1"
    f = "JournalFetchInteractor.kt"
    l = {
        0xb1
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lsr1/e$d;

.field final synthetic z:Lur1/m;


# direct methods
.method public constructor <init>(Lsr1/e$d;Lur1/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsr1/e$d;",
            "Lur1/m;",
            "Lq83/d<",
            "-",
            "Lur1/m$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lur1/m$f;->y:Lsr1/e$d;

    iput-object p2, p0, Lur1/m$f;->z:Lur1/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lur1/m$f;

    iget-object v0, p0, Lur1/m$f;->y:Lsr1/e$d;

    iget-object v1, p0, Lur1/m$f;->z:Lur1/m;

    invoke-direct {p1, v0, v1, p2}, Lur1/m$f;-><init>(Lsr1/e$d;Lur1/m;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lur1/m$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lur1/m$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lur1/m$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lur1/m$f;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lur1/m$f;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lur1/m$f;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/remote/domain/request/PartialJournalEntryRequest;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lur1/m$f;->y:Lsr1/e$d;

    invoke-virtual {p1}, Lsr1/e$d;->c()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lur1/m$f;->y:Lsr1/e$d;

    invoke-virtual {v1}, Lsr1/e$d;->b()Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;->getTrackerInputs()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;

    new-instance v6, Lcom/whoop/data/remote/domain/request/TrackerInputEgg;

    invoke-virtual {v4}, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->getAnswered()Ljava/lang/Boolean;

    move-result-object v7

    invoke-virtual {v4}, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->getTrackerId()I

    move-result v8

    invoke-virtual {v4}, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->getTimeInputValue()Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v4}, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->getTimeInputLabel()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4}, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->getMagnitudeInputLabel()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v4}, Lcom/whoop/data/remote/domain/request/JournalTrackerInput;->getMagnitudeInputValue()Ljava/lang/Float;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    float-to-double v4, v4

    new-instance v12, Ljava/lang/Double;

    invoke-direct {v12, v4, v5}, Ljava/lang/Double;-><init>(D)V

    goto :goto_1

    :cond_2
    move-object v12, v5

    :goto_1
    invoke-direct/range {v6 .. v12}, Lcom/whoop/data/remote/domain/request/TrackerInputEgg;-><init>(Ljava/lang/Boolean;ILjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V

    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance v1, Lcom/whoop/data/remote/domain/request/PartialEntryTrackerInput;

    invoke-direct {v1, v3}, Lcom/whoop/data/remote/domain/request/PartialEntryTrackerInput;-><init>(Ljava/util/List;)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, p1, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p1

    new-instance v1, Lcom/whoop/data/remote/domain/request/PartialJournalEntryRequest;

    invoke-direct {v1, p1}, Lcom/whoop/data/remote/domain/request/PartialJournalEntryRequest;-><init>(Ljava/util/Map;)V

    iget-object p1, p0, Lur1/m$f;->z:Lur1/m;

    invoke-static {p1}, Lur1/m;->g(Lur1/m;)Lcom/whoop/data/repositories/JournalRepository;

    move-result-object p1

    iput-object v5, p0, Lur1/m$f;->w:Ljava/lang/Object;

    iput v2, p0, Lur1/m$f;->x:I

    invoke-virtual {p1, v1, p0}, Lcom/whoop/data/repositories/JournalRepository;->savePartialJournalEntry(Lcom/whoop/data/remote/domain/request/PartialJournalEntryRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, Lur1/m$f;->z:Lur1/m;

    invoke-static {p1}, Lur1/m;->h(Lur1/m;)Ltr2/n;

    move-result-object p1

    iget-object v0, p0, Lur1/m$f;->y:Lsr1/e$d;

    invoke-virtual {v0}, Lsr1/e$d;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Partial auto save failed for date "

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
